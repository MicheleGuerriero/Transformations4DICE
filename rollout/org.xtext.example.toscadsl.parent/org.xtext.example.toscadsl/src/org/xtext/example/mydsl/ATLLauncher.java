package org.xtext.example.mydsl;

import java.io.IOException;
import java.util.Collections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.impl.resource.EMFTVMResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;

public class ATLLauncher {

    private String inputMetamodelNsURI;
    private String outputMetamodelNsURI;

    public void launch(String inModelPath, String inModelName, String outModelPath, String outModelName, String transformationDir, String transformationModule) {

        ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
        ResourceSet rs = new ResourceSetImpl();

        Metamodel inMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
        inMetamodel.setResource(rs.getResource(URI.createURI(inputMetamodelNsURI), true));
        env.registerMetaModel(inModelName, inMetamodel);

        Metamodel outMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
        outMetamodel.setResource(rs.getResource(URI.createURI(outputMetamodelNsURI), true));
        env.registerMetaModel(outModelName, outMetamodel);

        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("emftvm", new EMFTVMResourceFactoryImpl());

        Model inModel = EmftvmFactory.eINSTANCE.createModel();
        inModel.setResource(rs.getResource(URI.createURI(inModelPath, true), true));
        env.registerInputModel("IN", inModel);

        Model outModel = EmftvmFactory.eINSTANCE.createModel();
        outModel.setResource(rs.createResource(URI.createURI(outModelPath)));
        env.registerOutputModel("OUT", outModel);

        ModuleResolver mr = new DefaultModuleResolver(transformationDir, rs);
        TimingData td = new TimingData();
        System.out.println(transformationDir + "/" + transformationModule);
        env.loadModule(mr, transformationModule);
        td.finishLoading();
        env.run(td);
        td.finish();

        try {
            outModel.getResource().save(Collections.emptyMap());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String lazyMetamodelRegistration(String metamodelPath) {

        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

        ResourceSet rs = new ResourceSetImpl();

        final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(EPackage.Registry.INSTANCE);
        rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);

        Resource r = rs.getResource(URI.createFileURI(metamodelPath), true);
        EObject eObject = r.getContents().get(0);

        if (eObject instanceof EPackage) {
            EPackage p = (EPackage) eObject;
            System.out.println(p.getNsURI());
            EPackage.Registry.INSTANCE.put(p.getNsURI(), p);
            return p.getNsURI();
        }
        return null;
    }

    public void registerInputMetamodel(String inputMetamodelPath) {
        inputMetamodelNsURI = lazyMetamodelRegistration(inputMetamodelPath);
    }

    public void registerOutputMetamodel(String outputMetamodelPath) {
        outputMetamodelNsURI = lazyMetamodelRegistration(outputMetamodelPath);
    }

}