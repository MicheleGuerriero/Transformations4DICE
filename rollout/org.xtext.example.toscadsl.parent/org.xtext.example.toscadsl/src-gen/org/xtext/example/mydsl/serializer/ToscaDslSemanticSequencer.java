/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.services.ToscaDslGrammarAccess;
import tosca.Attribute;
import tosca.Connected_to;
import tosca.Contained_in;
import tosca.Import;
import tosca.Input;
import tosca.Interface;
import tosca.Node_template;
import tosca.Operation;
import tosca.Output;
import tosca.Parameters;
import tosca.Property;
import tosca.Relationship;
import tosca.Requirement;
import tosca.Service_Template;
import tosca.Source_interface;
import tosca.Target_interface;
import tosca.ToscaPackage;
import tosca.instance;

@SuppressWarnings("all")
public class ToscaDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ToscaDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ToscaPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ToscaPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case ToscaPackage.CONNECTED_TO:
				sequence_Connected_to(context, (Connected_to) semanticObject); 
				return; 
			case ToscaPackage.CONTAINED_IN:
				sequence_Contained_in(context, (Contained_in) semanticObject); 
				return; 
			case ToscaPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case ToscaPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case ToscaPackage.INTERFACE:
				sequence_Interface_Impl(context, (Interface) semanticObject); 
				return; 
			case ToscaPackage.NODE_TEMPLATE:
				sequence_Node_template(context, (Node_template) semanticObject); 
				return; 
			case ToscaPackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			case ToscaPackage.OUTPUT:
				sequence_Output(context, (Output) semanticObject); 
				return; 
			case ToscaPackage.PARAMETER:
				sequence_Parameter_Impl(context, (tosca.Parameter) semanticObject); 
				return; 
			case ToscaPackage.PARAMETERS:
				sequence_Parameters(context, (Parameters) semanticObject); 
				return; 
			case ToscaPackage.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			case ToscaPackage.RELATIONSHIP:
				sequence_Relationship_Impl(context, (Relationship) semanticObject); 
				return; 
			case ToscaPackage.REQUIREMENT:
				sequence_Requirement(context, (Requirement) semanticObject); 
				return; 
			case ToscaPackage.SERVICE_TEMPLATE:
				sequence_Service_Template(context, (Service_Template) semanticObject); 
				return; 
			case ToscaPackage.SOURCE_INTERFACE:
				sequence_Source_interface(context, (Source_interface) semanticObject); 
				return; 
			case ToscaPackage.TARGET_INTERFACE:
				sequence_Target_interface(context, (Target_interface) semanticObject); 
				return; 
			case ToscaPackage.INSTANCE:
				sequence_instance(context, (instance) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Parameter returns Attribute
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (
	 *         parameter_name=STRING 
	 *         type=STRING? 
	 *         description=STRING? 
	 *         value=STRING? 
	 *         required=STRING? 
	 *         default=STRING? 
	 *         status=STRING?
	 *     )
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Relationship returns Connected_to
	 *     Connected_to returns Connected_to
	 *
	 * Constraint:
	 *     (
	 *         type=STRING? 
	 *         validSource=STRING? 
	 *         validTarget=STRING? 
	 *         (relation_haSourceInterface+=Source_interface relation_haSourceInterface+=Source_interface*)? 
	 *         (relation_hasTargetInterface+=Target_interface relation_hasTargetInterface+=Target_interface*)?
	 *     )
	 */
	protected void sequence_Connected_to(ISerializationContext context, Connected_to semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Relationship returns Contained_in
	 *     Contained_in returns Contained_in
	 *
	 * Constraint:
	 *     (
	 *         type=STRING? 
	 *         validSource=STRING? 
	 *         validTarget=STRING? 
	 *         (relation_haSourceInterface+=Source_interface relation_haSourceInterface+=Source_interface*)? 
	 *         (relation_hasTargetInterface+=Target_interface relation_hasTargetInterface+=Target_interface*)?
	 *     )
	 */
	protected void sequence_Contained_in(ISerializationContext context, Contained_in semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     file=STRING?
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Input returns Input
	 *     Parameter returns Input
	 *
	 * Constraint:
	 *     (parameter_name=STRING description=STRING? type=STRING? default=STRING?)
	 */
	protected void sequence_Input(ISerializationContext context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Interface returns Interface
	 *     Interface_Impl returns Interface
	 *
	 * Constraint:
	 *     (interface_name=STRING (hasOperation+=Operation hasOperation+=Operation*)?)
	 */
	protected void sequence_Interface_Impl(ISerializationContext context, Interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Node_template returns Node_template
	 *
	 * Constraint:
	 *     (
	 *         node_template_name=STRING 
	 *         type=STRING? 
	 *         description=STRING? 
	 *         (nodeTemplate_hasInterface+=Interface nodeTemplate_hasInterface+=Interface*)? 
	 *         (nodeTemplate_hasProperty+=Property nodeTemplate_hasProperty+=Property*)? 
	 *         (nodeTemplate_hasAttribute+=Attribute nodeTemplate_hasAttribute+=Attribute*)? 
	 *         (nodeTemplate_hasRequirement+=Requirement nodeTemplate_hasRequirement+=Requirement*)? 
	 *         (NodeTemplate_hasRelationship+=Relationship NodeTemplate_hasRelationship+=Relationship*)? 
	 *         nodeTemplate_hasInstances=instance?
	 *     )
	 */
	protected void sequence_Node_template(ISerializationContext context, Node_template semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Operation
	 *
	 * Constraint:
	 *     (operation_name=STRING? script=STRING?)
	 */
	protected void sequence_Operation(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Output returns Output
	 *     Parameter returns Output
	 *
	 * Constraint:
	 *     (parameter_name=STRING description=STRING? value=STRING?)
	 */
	protected void sequence_Output(ISerializationContext context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter_Impl returns Parameter
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (parameter_name=STRING value=STRING?)
	 */
	protected void sequence_Parameter_Impl(ISerializationContext context, tosca.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameters returns Parameters
	 *
	 * Constraint:
	 *     (Paremeters_hasParameter+=Parameter Paremeters_hasParameter+=Parameter*)?
	 */
	protected void sequence_Parameters(ISerializationContext context, Parameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Property
	 *
	 * Constraint:
	 *     (property_name=STRING (property_hasParameters+=Parameters property_hasParameters+=Parameters*)?)
	 */
	protected void sequence_Property(ISerializationContext context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Relationship returns Relationship
	 *     Relationship_Impl returns Relationship
	 *
	 * Constraint:
	 *     (
	 *         type=STRING? 
	 *         validSource=STRING? 
	 *         validTarget=STRING? 
	 *         (relation_haSourceInterface+=Source_interface relation_haSourceInterface+=Source_interface*)? 
	 *         (relation_hasTargetInterface+=Target_interface relation_hasTargetInterface+=Target_interface*)?
	 *     )
	 */
	protected void sequence_Relationship_Impl(ISerializationContext context, Relationship semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Requirement returns Requirement
	 *
	 * Constraint:
	 *     (requirement_name=STRING? node=STRING? capability_Type_name=STRING? (occurances+=STRING occurances+=STRING*)?)
	 */
	protected void sequence_Requirement(ISerializationContext context, Requirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Service_Template returns Service_Template
	 *
	 * Constraint:
	 *     (
	 *         tosca_definitions_version=STRING? 
	 *         (serviceTemplate_hasImport+=Import serviceTemplate_hasImport+=Import*)? 
	 *         (serviceTemplate_hasInput+=Input serviceTemplate_hasInput+=Input*)? 
	 *         service_hasNodeTemplate+=Node_template 
	 *         service_hasNodeTemplate+=Node_template* 
	 *         (serviceTemplate_hasOutput+=Output serviceTemplate_hasOutput+=Output*)?
	 *     )
	 */
	protected void sequence_Service_Template(ISerializationContext context, Service_Template semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Interface returns Source_interface
	 *     Source_interface returns Source_interface
	 *
	 * Constraint:
	 *     (interface_name=STRING (hasOperation+=Operation hasOperation+=Operation*)?)
	 */
	protected void sequence_Source_interface(ISerializationContext context, Source_interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Interface returns Target_interface
	 *     Target_interface returns Target_interface
	 *
	 * Constraint:
	 *     (interface_name=STRING (hasOperation+=Operation hasOperation+=Operation*)?)
	 */
	protected void sequence_Target_interface(ISerializationContext context, Target_interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     instance returns instance
	 *
	 * Constraint:
	 *     deploy=EInt
	 */
	protected void sequence_instance(ISerializationContext context, instance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.INSTANCE__DEPLOY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.INSTANCE__DEPLOY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInstanceAccess().getDeployEIntParserRuleCall_1_0(), semanticObject.getDeploy());
		feeder.finish();
	}
	
	
}