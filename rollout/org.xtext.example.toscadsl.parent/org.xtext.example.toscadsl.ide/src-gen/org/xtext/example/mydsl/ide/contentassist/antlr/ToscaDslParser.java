/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalToscaDslParser;
import org.xtext.example.mydsl.services.ToscaDslGrammarAccess;

public class ToscaDslParser extends AbstractContentAssistParser {

	@Inject
	private ToscaDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalToscaDslParser createParser() {
		InternalToscaDslParser result = new InternalToscaDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getTopologyTemplateAccess().getGroup(), "rule__TopologyTemplate__Group__0");
					put(grammarAccess.getTopologyTemplateAccess().getGroup_3(), "rule__TopologyTemplate__Group_3__0");
					put(grammarAccess.getTopologyTemplateAccess().getGroup_4(), "rule__TopologyTemplate__Group_4__0");
					put(grammarAccess.getTopologyTemplateAccess().getGroup_4_3(), "rule__TopologyTemplate__Group_4_3__0");
					put(grammarAccess.getTopologyTemplateAccess().getGroup_5(), "rule__TopologyTemplate__Group_5__0");
					put(grammarAccess.getTopologyTemplateAccess().getGroup_5_3(), "rule__TopologyTemplate__Group_5_3__0");
					put(grammarAccess.getTopologyTemplateAccess().getGroup_6(), "rule__TopologyTemplate__Group_6__0");
					put(grammarAccess.getTopologyTemplateAccess().getGroup_6_3(), "rule__TopologyTemplate__Group_6_3__0");
					put(grammarAccess.getTopologyTemplateAccess().getGroup_7(), "rule__TopologyTemplate__Group_7__0");
					put(grammarAccess.getTopologyTemplateAccess().getGroup_7_3(), "rule__TopologyTemplate__Group_7_3__0");
					put(grammarAccess.getTopologyTemplateAccess().getGroup_8(), "rule__TopologyTemplate__Group_8__0");
					put(grammarAccess.getTopologyTemplateAccess().getGroup_8_3(), "rule__TopologyTemplate__Group_8_3__0");
					put(grammarAccess.getTopologyTemplateAccess().getGroup_9(), "rule__TopologyTemplate__Group_9__0");
					put(grammarAccess.getTopologyTemplateAccess().getGroup_9_3(), "rule__TopologyTemplate__Group_9_3__0");
					put(grammarAccess.getTopologyTemplateAccess().getGroup_10(), "rule__TopologyTemplate__Group_10__0");
					put(grammarAccess.getTopologyTemplateAccess().getGroup_10_3(), "rule__TopologyTemplate__Group_10_3__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getNodeTemplateAccess().getGroup(), "rule__NodeTemplate__Group__0");
					put(grammarAccess.getNodeTemplateAccess().getGroup_6(), "rule__NodeTemplate__Group_6__0");
					put(grammarAccess.getNodeTemplateAccess().getGroup_7(), "rule__NodeTemplate__Group_7__0");
					put(grammarAccess.getNodeTemplateAccess().getGroup_7_3(), "rule__NodeTemplate__Group_7_3__0");
					put(grammarAccess.getNodeTemplateAccess().getGroup_8(), "rule__NodeTemplate__Group_8__0");
					put(grammarAccess.getNodeTemplateAccess().getGroup_8_3(), "rule__NodeTemplate__Group_8_3__0");
					put(grammarAccess.getNodeTemplateAccess().getGroup_9(), "rule__NodeTemplate__Group_9__0");
					put(grammarAccess.getNodeTemplateAccess().getGroup_9_3(), "rule__NodeTemplate__Group_9_3__0");
					put(grammarAccess.getNodeTemplateAccess().getGroup_10(), "rule__NodeTemplate__Group_10__0");
					put(grammarAccess.getNodeTemplateAccess().getGroup_10_3(), "rule__NodeTemplate__Group_10_3__0");
					put(grammarAccess.getNodeTemplateAccess().getGroup_11(), "rule__NodeTemplate__Group_11__0");
					put(grammarAccess.getNodeTemplateAccess().getGroup_11_3(), "rule__NodeTemplate__Group_11_3__0");
					put(grammarAccess.getNodeTemplateAccess().getGroup_12(), "rule__NodeTemplate__Group_12__0");
					put(grammarAccess.getNodeTemplateAccess().getGroup_12_3(), "rule__NodeTemplate__Group_12_3__0");
					put(grammarAccess.getRelationshipAccess().getGroup(), "rule__Relationship__Group__0");
					put(grammarAccess.getRelationshipAccess().getGroup_4(), "rule__Relationship__Group_4__0");
					put(grammarAccess.getRelationshipAccess().getGroup_5(), "rule__Relationship__Group_5__0");
					put(grammarAccess.getRelationshipAccess().getGroup_5_3(), "rule__Relationship__Group_5_3__0");
					put(grammarAccess.getRelationshipAccess().getGroup_6(), "rule__Relationship__Group_6__0");
					put(grammarAccess.getRelationshipAccess().getGroup_6_3(), "rule__Relationship__Group_6_3__0");
					put(grammarAccess.getRelationshipAccess().getGroup_7(), "rule__Relationship__Group_7__0");
					put(grammarAccess.getRelationshipAccess().getGroup_7_3(), "rule__Relationship__Group_7_3__0");
					put(grammarAccess.getRelationshipAccess().getGroup_8(), "rule__Relationship__Group_8__0");
					put(grammarAccess.getRelationshipAccess().getGroup_8_3(), "rule__Relationship__Group_8_3__0");
					put(grammarAccess.getRelationshipAccess().getGroup_9(), "rule__Relationship__Group_9__0");
					put(grammarAccess.getRelationshipAccess().getGroup_9_3(), "rule__Relationship__Group_9_3__0");
					put(grammarAccess.getGroupAccess().getGroup(), "rule__Group__Group__0");
					put(grammarAccess.getGroupAccess().getGroup_6(), "rule__Group__Group_6__0");
					put(grammarAccess.getGroupAccess().getGroup_7(), "rule__Group__Group_7__0");
					put(grammarAccess.getGroupAccess().getGroup_7_3(), "rule__Group__Group_7_3__0");
					put(grammarAccess.getGroupAccess().getGroup_8(), "rule__Group__Group_8__0");
					put(grammarAccess.getGroupAccess().getGroup_9(), "rule__Group__Group_9__0");
					put(grammarAccess.getGroupAccess().getGroup_9_3(), "rule__Group__Group_9_3__0");
					put(grammarAccess.getPolicyAccess().getGroup(), "rule__Policy__Group__0");
					put(grammarAccess.getInterfaceAccess().getGroup(), "rule__Interface__Group__0");
					put(grammarAccess.getInterfaceAccess().getGroup_4(), "rule__Interface__Group_4__0");
					put(grammarAccess.getInterfaceAccess().getGroup_4_3(), "rule__Interface__Group_4_3__0");
					put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getRequirementAccess().getGroup(), "rule__Requirement__Group__0");
					put(grammarAccess.getRequirementAccess().getGroup_5(), "rule__Requirement__Group_5__0");
					put(grammarAccess.getCapabilityAccess().getGroup(), "rule__Capability__Group__0");
					put(grammarAccess.getCapabilityAccess().getGroup_5(), "rule__Capability__Group_5__0");
					put(grammarAccess.getCapabilityAccess().getGroup_6(), "rule__Capability__Group_6__0");
					put(grammarAccess.getCapabilityAccess().getGroup_6_3(), "rule__Capability__Group_6_3__0");
					put(grammarAccess.getCapabilityAccess().getGroup_7(), "rule__Capability__Group_7__0");
					put(grammarAccess.getCapabilityAccess().getGroup_7_3(), "rule__Capability__Group_7_3__0");
					put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
					put(grammarAccess.getTopologyTemplateAccess().getTosca_definitions_versionAssignment_2(), "rule__TopologyTemplate__Tosca_definitions_versionAssignment_2");
					put(grammarAccess.getTopologyTemplateAccess().getDescriptionAssignment_3_1(), "rule__TopologyTemplate__DescriptionAssignment_3_1");
					put(grammarAccess.getTopologyTemplateAccess().getImportsAssignment_4_2(), "rule__TopologyTemplate__ImportsAssignment_4_2");
					put(grammarAccess.getTopologyTemplateAccess().getImportsAssignment_4_3_1(), "rule__TopologyTemplate__ImportsAssignment_4_3_1");
					put(grammarAccess.getTopologyTemplateAccess().getOutputsAssignment_5_2(), "rule__TopologyTemplate__OutputsAssignment_5_2");
					put(grammarAccess.getTopologyTemplateAccess().getOutputsAssignment_5_3_1(), "rule__TopologyTemplate__OutputsAssignment_5_3_1");
					put(grammarAccess.getTopologyTemplateAccess().getInputsAssignment_6_2(), "rule__TopologyTemplate__InputsAssignment_6_2");
					put(grammarAccess.getTopologyTemplateAccess().getInputsAssignment_6_3_1(), "rule__TopologyTemplate__InputsAssignment_6_3_1");
					put(grammarAccess.getTopologyTemplateAccess().getNodeTemplatesAssignment_7_2(), "rule__TopologyTemplate__NodeTemplatesAssignment_7_2");
					put(grammarAccess.getTopologyTemplateAccess().getNodeTemplatesAssignment_7_3_1(), "rule__TopologyTemplate__NodeTemplatesAssignment_7_3_1");
					put(grammarAccess.getTopologyTemplateAccess().getRealtionshipsAssignment_8_2(), "rule__TopologyTemplate__RealtionshipsAssignment_8_2");
					put(grammarAccess.getTopologyTemplateAccess().getRealtionshipsAssignment_8_3_1(), "rule__TopologyTemplate__RealtionshipsAssignment_8_3_1");
					put(grammarAccess.getTopologyTemplateAccess().getGroupsAssignment_9_2(), "rule__TopologyTemplate__GroupsAssignment_9_2");
					put(grammarAccess.getTopologyTemplateAccess().getGroupsAssignment_9_3_1(), "rule__TopologyTemplate__GroupsAssignment_9_3_1");
					put(grammarAccess.getTopologyTemplateAccess().getPoliciesAssignment_10_2(), "rule__TopologyTemplate__PoliciesAssignment_10_2");
					put(grammarAccess.getTopologyTemplateAccess().getPoliciesAssignment_10_3_1(), "rule__TopologyTemplate__PoliciesAssignment_10_3_1");
					put(grammarAccess.getImportAccess().getFileAssignment_1(), "rule__Import__FileAssignment_1");
					put(grammarAccess.getParameterAccess().getParameter_nameAssignment_1(), "rule__Parameter__Parameter_nameAssignment_1");
					put(grammarAccess.getNodeTemplateAccess().getNode_template_nameAssignment_1(), "rule__NodeTemplate__Node_template_nameAssignment_1");
					put(grammarAccess.getNodeTemplateAccess().getTypeAssignment_5(), "rule__NodeTemplate__TypeAssignment_5");
					put(grammarAccess.getNodeTemplateAccess().getDescriptionAssignment_6_1(), "rule__NodeTemplate__DescriptionAssignment_6_1");
					put(grammarAccess.getNodeTemplateAccess().getRelationshipsAssignment_7_2(), "rule__NodeTemplate__RelationshipsAssignment_7_2");
					put(grammarAccess.getNodeTemplateAccess().getRelationshipsAssignment_7_3_1(), "rule__NodeTemplate__RelationshipsAssignment_7_3_1");
					put(grammarAccess.getNodeTemplateAccess().getInterfacesAssignment_8_2(), "rule__NodeTemplate__InterfacesAssignment_8_2");
					put(grammarAccess.getNodeTemplateAccess().getInterfacesAssignment_8_3_1(), "rule__NodeTemplate__InterfacesAssignment_8_3_1");
					put(grammarAccess.getNodeTemplateAccess().getPropertiesAssignment_9_2(), "rule__NodeTemplate__PropertiesAssignment_9_2");
					put(grammarAccess.getNodeTemplateAccess().getPropertiesAssignment_9_3_1(), "rule__NodeTemplate__PropertiesAssignment_9_3_1");
					put(grammarAccess.getNodeTemplateAccess().getAttributesAssignment_10_2(), "rule__NodeTemplate__AttributesAssignment_10_2");
					put(grammarAccess.getNodeTemplateAccess().getAttributesAssignment_10_3_1(), "rule__NodeTemplate__AttributesAssignment_10_3_1");
					put(grammarAccess.getNodeTemplateAccess().getRequirementsAssignment_11_2(), "rule__NodeTemplate__RequirementsAssignment_11_2");
					put(grammarAccess.getNodeTemplateAccess().getRequirementsAssignment_11_3_1(), "rule__NodeTemplate__RequirementsAssignment_11_3_1");
					put(grammarAccess.getNodeTemplateAccess().getCapabilitiesAssignment_12_2(), "rule__NodeTemplate__CapabilitiesAssignment_12_2");
					put(grammarAccess.getNodeTemplateAccess().getCapabilitiesAssignment_12_3_1(), "rule__NodeTemplate__CapabilitiesAssignment_12_3_1");
					put(grammarAccess.getRelationshipAccess().getTypeAssignment_3(), "rule__Relationship__TypeAssignment_3");
					put(grammarAccess.getRelationshipAccess().getTargetAssignment_4_1(), "rule__Relationship__TargetAssignment_4_1");
					put(grammarAccess.getRelationshipAccess().getInterfacesAssignment_5_2(), "rule__Relationship__InterfacesAssignment_5_2");
					put(grammarAccess.getRelationshipAccess().getInterfacesAssignment_5_3_1(), "rule__Relationship__InterfacesAssignment_5_3_1");
					put(grammarAccess.getRelationshipAccess().getPropertiesAssignment_6_2(), "rule__Relationship__PropertiesAssignment_6_2");
					put(grammarAccess.getRelationshipAccess().getPropertiesAssignment_6_3_1(), "rule__Relationship__PropertiesAssignment_6_3_1");
					put(grammarAccess.getRelationshipAccess().getAttributesAssignment_7_2(), "rule__Relationship__AttributesAssignment_7_2");
					put(grammarAccess.getRelationshipAccess().getAttributesAssignment_7_3_1(), "rule__Relationship__AttributesAssignment_7_3_1");
					put(grammarAccess.getRelationshipAccess().getSource_interfacesAssignment_8_2(), "rule__Relationship__Source_interfacesAssignment_8_2");
					put(grammarAccess.getRelationshipAccess().getSource_interfacesAssignment_8_3_1(), "rule__Relationship__Source_interfacesAssignment_8_3_1");
					put(grammarAccess.getRelationshipAccess().getTarget_interfacesAssignment_9_2(), "rule__Relationship__Target_interfacesAssignment_9_2");
					put(grammarAccess.getRelationshipAccess().getTarget_interfacesAssignment_9_3_1(), "rule__Relationship__Target_interfacesAssignment_9_3_1");
					put(grammarAccess.getGroupAccess().getGroup_nameAssignment_1(), "rule__Group__Group_nameAssignment_1");
					put(grammarAccess.getGroupAccess().getTypeAssignment_5(), "rule__Group__TypeAssignment_5");
					put(grammarAccess.getGroupAccess().getDescriptionAssignment_6_1(), "rule__Group__DescriptionAssignment_6_1");
					put(grammarAccess.getGroupAccess().getTargetsAssignment_7_2(), "rule__Group__TargetsAssignment_7_2");
					put(grammarAccess.getGroupAccess().getTargetsAssignment_7_3_1(), "rule__Group__TargetsAssignment_7_3_1");
					put(grammarAccess.getGroupAccess().getPropertiesAssignment_8_1(), "rule__Group__PropertiesAssignment_8_1");
					put(grammarAccess.getGroupAccess().getInterfacesAssignment_9_2(), "rule__Group__InterfacesAssignment_9_2");
					put(grammarAccess.getGroupAccess().getInterfacesAssignment_9_3_1(), "rule__Group__InterfacesAssignment_9_3_1");
					put(grammarAccess.getPolicyAccess().getPolicy_nameAssignment_1(), "rule__Policy__Policy_nameAssignment_1");
					put(grammarAccess.getInterfaceAccess().getTypeAssignment_1(), "rule__Interface__TypeAssignment_1");
					put(grammarAccess.getInterfaceAccess().getOperationsAssignment_4_2(), "rule__Interface__OperationsAssignment_4_2");
					put(grammarAccess.getInterfaceAccess().getOperationsAssignment_4_3_1(), "rule__Interface__OperationsAssignment_4_3_1");
					put(grammarAccess.getPropertyAccess().getProperty_nameAssignment_2(), "rule__Property__Property_nameAssignment_2");
					put(grammarAccess.getPropertyAccess().getValueAssignment_4(), "rule__Property__ValueAssignment_4");
					put(grammarAccess.getAttributeAccess().getAttribute_nameAssignment_1(), "rule__Attribute__Attribute_nameAssignment_1");
					put(grammarAccess.getRequirementAccess().getRequirement_nameAssignment_0(), "rule__Requirement__Requirement_nameAssignment_0");
					put(grammarAccess.getRequirementAccess().getCapabiityAssignment_4(), "rule__Requirement__CapabiityAssignment_4");
					put(grammarAccess.getRequirementAccess().getNodeAssignment_5_1(), "rule__Requirement__NodeAssignment_5_1");
					put(grammarAccess.getCapabilityAccess().getCapability_nameAssignment_0(), "rule__Capability__Capability_nameAssignment_0");
					put(grammarAccess.getCapabilityAccess().getTypeAssignment_4(), "rule__Capability__TypeAssignment_4");
					put(grammarAccess.getCapabilityAccess().getDescriptionAssignment_5_1(), "rule__Capability__DescriptionAssignment_5_1");
					put(grammarAccess.getCapabilityAccess().getPropertiesAssignment_6_2(), "rule__Capability__PropertiesAssignment_6_2");
					put(grammarAccess.getCapabilityAccess().getPropertiesAssignment_6_3_1(), "rule__Capability__PropertiesAssignment_6_3_1");
					put(grammarAccess.getCapabilityAccess().getAttributesAssignment_7_2(), "rule__Capability__AttributesAssignment_7_2");
					put(grammarAccess.getCapabilityAccess().getAttributesAssignment_7_3_1(), "rule__Capability__AttributesAssignment_7_3_1");
					put(grammarAccess.getOperationAccess().getOperation_nameAssignment_1(), "rule__Operation__Operation_nameAssignment_1");
					put(grammarAccess.getOperationAccess().getPrimaryAssignment_3(), "rule__Operation__PrimaryAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalToscaDslParser typedParser = (InternalToscaDslParser) parser;
			typedParser.entryRuleTopologyTemplate();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ToscaDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ToscaDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
