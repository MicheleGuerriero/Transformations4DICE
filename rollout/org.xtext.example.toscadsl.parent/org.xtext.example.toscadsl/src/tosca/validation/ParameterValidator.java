/**
 *
 * $Id$
 */
package tosca.validation;


/**
 * A sample validator interface for {@link tosca.Parameter}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ParameterValidator {
    boolean validate();

    boolean validateParameter_name(String value);
    boolean validateType(String value);
    boolean validateDescription(String value);
    boolean validateValue(String value);
    boolean validateRequired(String value);
    boolean validateDefault(String value);
    boolean validateStatus(String value);
}
