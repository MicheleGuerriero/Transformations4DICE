/**
 *
 * $Id$
 */
package tosca.validation;

import org.eclipse.emf.common.util.EList;

import tosca.Attribute;
import tosca.Capability;
import tosca.Interface;
import tosca.Property;
import tosca.Relationship;
import tosca.Requirement;

/**
 * A sample validator interface for {@link tosca.NodeTemplate}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface NodeTemplateValidator {
    boolean validate();

    boolean validateNode_template_name(String value);
    boolean validateType(String value);
    boolean validateInterfaces(EList<Interface> value);
    boolean validateDescription(String value);
    boolean validateProperties(EList<Property> value);
    boolean validateAttributes(EList<Attribute> value);
    boolean validateRequirements(EList<Requirement> value);
    boolean validateRelationships(EList<Relationship> value);
    boolean validateCapabilities(EList<Capability> value);
}
