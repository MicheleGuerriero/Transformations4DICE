package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.ToscaDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalToscaDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'\"tosca_definitions_version\" :'", "',\\n\"description\" :'", "',\\n\"imports\" :'", "'['", "','", "']'", "',\\n\"outputs\" :'", "'}'", "',\\n\"inputs\" :'", "',\\n\"nodeTemplates\" :'", "',\\n\"realtionships\" :'", "',\\n\"groups\" :'", "',\\n\"policies\" :'", "':'", "'\"type\" :'", "',\\n\"relationships\" :'", "',\\n\"interfaces\" :'", "',\\n\"properties\" :'", "',\\n\"attributes\" :'", "',\\n\"requirements\" :'", "',\\n\"capabilities\" :'", "',\\n\"target\" :'", "',\\n\"source_interfaces\" :'", "',\\n\"target_iterfaces\" :'", "',\\n\"targets\" :'", "'\\n\"operations\" :'", "'\"capabiity\" :'", "',\\n\"node\" :'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalToscaDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalToscaDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalToscaDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalToscaDsl.g"; }



     	private ToscaDslGrammarAccess grammarAccess;

        public InternalToscaDslParser(TokenStream input, ToscaDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TopologyTemplate";
       	}

       	@Override
       	protected ToscaDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTopologyTemplate"
    // InternalToscaDsl.g:64:1: entryRuleTopologyTemplate returns [EObject current=null] : iv_ruleTopologyTemplate= ruleTopologyTemplate EOF ;
    public final EObject entryRuleTopologyTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopologyTemplate = null;


        try {
            // InternalToscaDsl.g:64:57: (iv_ruleTopologyTemplate= ruleTopologyTemplate EOF )
            // InternalToscaDsl.g:65:2: iv_ruleTopologyTemplate= ruleTopologyTemplate EOF
            {
             newCompositeNode(grammarAccess.getTopologyTemplateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopologyTemplate=ruleTopologyTemplate();

            state._fsp--;

             current =iv_ruleTopologyTemplate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTopologyTemplate"


    // $ANTLR start "ruleTopologyTemplate"
    // InternalToscaDsl.g:71:1: ruleTopologyTemplate returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"tosca_definitions_version\" :' ( (lv_tosca_definitions_version_2_0= RULE_STRING ) ) (otherlv_3= ',\\n\"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= ',\\n\"imports\" :' otherlv_6= '[' ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* otherlv_10= ']' )? (otherlv_11= ',\\n\"outputs\" :' otherlv_12= '{' ( (lv_outputs_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_outputs_15_0= ruleParameter ) ) )* otherlv_16= '}' )? (otherlv_17= ',\\n\"inputs\" :' otherlv_18= '{' ( (lv_inputs_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_inputs_21_0= ruleParameter ) ) )* otherlv_22= '}' )? (otherlv_23= ',\\n\"nodeTemplates\" :' otherlv_24= '{' ( (lv_nodeTemplates_25_0= ruleNodeTemplate ) ) (otherlv_26= ',' ( (lv_nodeTemplates_27_0= ruleNodeTemplate ) ) )* otherlv_28= '}' )? (otherlv_29= ',\\n\"realtionships\" :' otherlv_30= '{' ( (lv_realtionships_31_0= ruleRelationship ) ) (otherlv_32= ',' ( (lv_realtionships_33_0= ruleRelationship ) ) )* otherlv_34= '}' )? (otherlv_35= ',\\n\"groups\" :' otherlv_36= '{' ( (lv_groups_37_0= ruleGroup ) ) (otherlv_38= ',' ( (lv_groups_39_0= ruleGroup ) ) )* otherlv_40= '}' )? (otherlv_41= ',\\n\"policies\" :' otherlv_42= '{' ( (lv_policies_43_0= rulePolicy ) ) (otherlv_44= ',' ( (lv_policies_45_0= rulePolicy ) ) )* otherlv_46= '}' )? otherlv_47= '}' ) ;
    public final EObject ruleTopologyTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tosca_definitions_version_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        EObject lv_imports_7_0 = null;

        EObject lv_imports_9_0 = null;

        EObject lv_outputs_13_0 = null;

        EObject lv_outputs_15_0 = null;

        EObject lv_inputs_19_0 = null;

        EObject lv_inputs_21_0 = null;

        EObject lv_nodeTemplates_25_0 = null;

        EObject lv_nodeTemplates_27_0 = null;

        EObject lv_realtionships_31_0 = null;

        EObject lv_realtionships_33_0 = null;

        EObject lv_groups_37_0 = null;

        EObject lv_groups_39_0 = null;

        EObject lv_policies_43_0 = null;

        EObject lv_policies_45_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:77:2: ( (otherlv_0= '{' otherlv_1= '\"tosca_definitions_version\" :' ( (lv_tosca_definitions_version_2_0= RULE_STRING ) ) (otherlv_3= ',\\n\"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= ',\\n\"imports\" :' otherlv_6= '[' ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* otherlv_10= ']' )? (otherlv_11= ',\\n\"outputs\" :' otherlv_12= '{' ( (lv_outputs_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_outputs_15_0= ruleParameter ) ) )* otherlv_16= '}' )? (otherlv_17= ',\\n\"inputs\" :' otherlv_18= '{' ( (lv_inputs_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_inputs_21_0= ruleParameter ) ) )* otherlv_22= '}' )? (otherlv_23= ',\\n\"nodeTemplates\" :' otherlv_24= '{' ( (lv_nodeTemplates_25_0= ruleNodeTemplate ) ) (otherlv_26= ',' ( (lv_nodeTemplates_27_0= ruleNodeTemplate ) ) )* otherlv_28= '}' )? (otherlv_29= ',\\n\"realtionships\" :' otherlv_30= '{' ( (lv_realtionships_31_0= ruleRelationship ) ) (otherlv_32= ',' ( (lv_realtionships_33_0= ruleRelationship ) ) )* otherlv_34= '}' )? (otherlv_35= ',\\n\"groups\" :' otherlv_36= '{' ( (lv_groups_37_0= ruleGroup ) ) (otherlv_38= ',' ( (lv_groups_39_0= ruleGroup ) ) )* otherlv_40= '}' )? (otherlv_41= ',\\n\"policies\" :' otherlv_42= '{' ( (lv_policies_43_0= rulePolicy ) ) (otherlv_44= ',' ( (lv_policies_45_0= rulePolicy ) ) )* otherlv_46= '}' )? otherlv_47= '}' ) )
            // InternalToscaDsl.g:78:2: (otherlv_0= '{' otherlv_1= '\"tosca_definitions_version\" :' ( (lv_tosca_definitions_version_2_0= RULE_STRING ) ) (otherlv_3= ',\\n\"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= ',\\n\"imports\" :' otherlv_6= '[' ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* otherlv_10= ']' )? (otherlv_11= ',\\n\"outputs\" :' otherlv_12= '{' ( (lv_outputs_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_outputs_15_0= ruleParameter ) ) )* otherlv_16= '}' )? (otherlv_17= ',\\n\"inputs\" :' otherlv_18= '{' ( (lv_inputs_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_inputs_21_0= ruleParameter ) ) )* otherlv_22= '}' )? (otherlv_23= ',\\n\"nodeTemplates\" :' otherlv_24= '{' ( (lv_nodeTemplates_25_0= ruleNodeTemplate ) ) (otherlv_26= ',' ( (lv_nodeTemplates_27_0= ruleNodeTemplate ) ) )* otherlv_28= '}' )? (otherlv_29= ',\\n\"realtionships\" :' otherlv_30= '{' ( (lv_realtionships_31_0= ruleRelationship ) ) (otherlv_32= ',' ( (lv_realtionships_33_0= ruleRelationship ) ) )* otherlv_34= '}' )? (otherlv_35= ',\\n\"groups\" :' otherlv_36= '{' ( (lv_groups_37_0= ruleGroup ) ) (otherlv_38= ',' ( (lv_groups_39_0= ruleGroup ) ) )* otherlv_40= '}' )? (otherlv_41= ',\\n\"policies\" :' otherlv_42= '{' ( (lv_policies_43_0= rulePolicy ) ) (otherlv_44= ',' ( (lv_policies_45_0= rulePolicy ) ) )* otherlv_46= '}' )? otherlv_47= '}' )
            {
            // InternalToscaDsl.g:78:2: (otherlv_0= '{' otherlv_1= '\"tosca_definitions_version\" :' ( (lv_tosca_definitions_version_2_0= RULE_STRING ) ) (otherlv_3= ',\\n\"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= ',\\n\"imports\" :' otherlv_6= '[' ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* otherlv_10= ']' )? (otherlv_11= ',\\n\"outputs\" :' otherlv_12= '{' ( (lv_outputs_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_outputs_15_0= ruleParameter ) ) )* otherlv_16= '}' )? (otherlv_17= ',\\n\"inputs\" :' otherlv_18= '{' ( (lv_inputs_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_inputs_21_0= ruleParameter ) ) )* otherlv_22= '}' )? (otherlv_23= ',\\n\"nodeTemplates\" :' otherlv_24= '{' ( (lv_nodeTemplates_25_0= ruleNodeTemplate ) ) (otherlv_26= ',' ( (lv_nodeTemplates_27_0= ruleNodeTemplate ) ) )* otherlv_28= '}' )? (otherlv_29= ',\\n\"realtionships\" :' otherlv_30= '{' ( (lv_realtionships_31_0= ruleRelationship ) ) (otherlv_32= ',' ( (lv_realtionships_33_0= ruleRelationship ) ) )* otherlv_34= '}' )? (otherlv_35= ',\\n\"groups\" :' otherlv_36= '{' ( (lv_groups_37_0= ruleGroup ) ) (otherlv_38= ',' ( (lv_groups_39_0= ruleGroup ) ) )* otherlv_40= '}' )? (otherlv_41= ',\\n\"policies\" :' otherlv_42= '{' ( (lv_policies_43_0= rulePolicy ) ) (otherlv_44= ',' ( (lv_policies_45_0= rulePolicy ) ) )* otherlv_46= '}' )? otherlv_47= '}' )
            // InternalToscaDsl.g:79:3: otherlv_0= '{' otherlv_1= '\"tosca_definitions_version\" :' ( (lv_tosca_definitions_version_2_0= RULE_STRING ) ) (otherlv_3= ',\\n\"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= ',\\n\"imports\" :' otherlv_6= '[' ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* otherlv_10= ']' )? (otherlv_11= ',\\n\"outputs\" :' otherlv_12= '{' ( (lv_outputs_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_outputs_15_0= ruleParameter ) ) )* otherlv_16= '}' )? (otherlv_17= ',\\n\"inputs\" :' otherlv_18= '{' ( (lv_inputs_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_inputs_21_0= ruleParameter ) ) )* otherlv_22= '}' )? (otherlv_23= ',\\n\"nodeTemplates\" :' otherlv_24= '{' ( (lv_nodeTemplates_25_0= ruleNodeTemplate ) ) (otherlv_26= ',' ( (lv_nodeTemplates_27_0= ruleNodeTemplate ) ) )* otherlv_28= '}' )? (otherlv_29= ',\\n\"realtionships\" :' otherlv_30= '{' ( (lv_realtionships_31_0= ruleRelationship ) ) (otherlv_32= ',' ( (lv_realtionships_33_0= ruleRelationship ) ) )* otherlv_34= '}' )? (otherlv_35= ',\\n\"groups\" :' otherlv_36= '{' ( (lv_groups_37_0= ruleGroup ) ) (otherlv_38= ',' ( (lv_groups_39_0= ruleGroup ) ) )* otherlv_40= '}' )? (otherlv_41= ',\\n\"policies\" :' otherlv_42= '{' ( (lv_policies_43_0= rulePolicy ) ) (otherlv_44= ',' ( (lv_policies_45_0= rulePolicy ) ) )* otherlv_46= '}' )? otherlv_47= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTopologyTemplateAccess().getTosca_definitions_versionKeyword_1());
            		
            // InternalToscaDsl.g:87:3: ( (lv_tosca_definitions_version_2_0= RULE_STRING ) )
            // InternalToscaDsl.g:88:4: (lv_tosca_definitions_version_2_0= RULE_STRING )
            {
            // InternalToscaDsl.g:88:4: (lv_tosca_definitions_version_2_0= RULE_STRING )
            // InternalToscaDsl.g:89:5: lv_tosca_definitions_version_2_0= RULE_STRING
            {
            lv_tosca_definitions_version_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_tosca_definitions_version_2_0, grammarAccess.getTopologyTemplateAccess().getTosca_definitions_versionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTopologyTemplateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tosca_definitions_version",
            						lv_tosca_definitions_version_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalToscaDsl.g:105:3: (otherlv_3= ',\\n\"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalToscaDsl.g:106:4: otherlv_3= ',\\n\"description\" :' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getTopologyTemplateAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalToscaDsl.g:110:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalToscaDsl.g:111:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:111:5: (lv_description_4_0= RULE_STRING )
                    // InternalToscaDsl.g:112:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getTopologyTemplateAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTopologyTemplateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:129:3: (otherlv_5= ',\\n\"imports\" :' otherlv_6= '[' ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* otherlv_10= ']' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalToscaDsl.g:130:4: otherlv_5= ',\\n\"imports\" :' otherlv_6= '[' ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* otherlv_10= ']'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getTopologyTemplateAccess().getImportsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getTopologyTemplateAccess().getLeftSquareBracketKeyword_4_1());
                    			
                    // InternalToscaDsl.g:138:4: ( (lv_imports_7_0= ruleImport ) )
                    // InternalToscaDsl.g:139:5: (lv_imports_7_0= ruleImport )
                    {
                    // InternalToscaDsl.g:139:5: (lv_imports_7_0= ruleImport )
                    // InternalToscaDsl.g:140:6: lv_imports_7_0= ruleImport
                    {

                    						newCompositeNode(grammarAccess.getTopologyTemplateAccess().getImportsImportParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_imports_7_0=ruleImport();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    						}
                    						add(
                    							current,
                    							"imports",
                    							lv_imports_7_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Import");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:157:4: (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalToscaDsl.g:158:5: otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getTopologyTemplateAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalToscaDsl.g:162:5: ( (lv_imports_9_0= ruleImport ) )
                    	    // InternalToscaDsl.g:163:6: (lv_imports_9_0= ruleImport )
                    	    {
                    	    // InternalToscaDsl.g:163:6: (lv_imports_9_0= ruleImport )
                    	    // InternalToscaDsl.g:164:7: lv_imports_9_0= ruleImport
                    	    {

                    	    							newCompositeNode(grammarAccess.getTopologyTemplateAccess().getImportsImportParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_imports_9_0=ruleImport();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"imports",
                    	    								lv_imports_9_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Import");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getTopologyTemplateAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:187:3: (otherlv_11= ',\\n\"outputs\" :' otherlv_12= '{' ( (lv_outputs_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_outputs_15_0= ruleParameter ) ) )* otherlv_16= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalToscaDsl.g:188:4: otherlv_11= ',\\n\"outputs\" :' otherlv_12= '{' ( (lv_outputs_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_outputs_15_0= ruleParameter ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getTopologyTemplateAccess().getOutputsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalToscaDsl.g:196:4: ( (lv_outputs_13_0= ruleParameter ) )
                    // InternalToscaDsl.g:197:5: (lv_outputs_13_0= ruleParameter )
                    {
                    // InternalToscaDsl.g:197:5: (lv_outputs_13_0= ruleParameter )
                    // InternalToscaDsl.g:198:6: lv_outputs_13_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getTopologyTemplateAccess().getOutputsParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_outputs_13_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    						}
                    						add(
                    							current,
                    							"outputs",
                    							lv_outputs_13_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:215:4: (otherlv_14= ',' ( (lv_outputs_15_0= ruleParameter ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalToscaDsl.g:216:5: otherlv_14= ',' ( (lv_outputs_15_0= ruleParameter ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getTopologyTemplateAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalToscaDsl.g:220:5: ( (lv_outputs_15_0= ruleParameter ) )
                    	    // InternalToscaDsl.g:221:6: (lv_outputs_15_0= ruleParameter )
                    	    {
                    	    // InternalToscaDsl.g:221:6: (lv_outputs_15_0= ruleParameter )
                    	    // InternalToscaDsl.g:222:7: lv_outputs_15_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getTopologyTemplateAccess().getOutputsParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_outputs_15_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outputs",
                    	    								lv_outputs_15_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:245:3: (otherlv_17= ',\\n\"inputs\" :' otherlv_18= '{' ( (lv_inputs_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_inputs_21_0= ruleParameter ) ) )* otherlv_22= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalToscaDsl.g:246:4: otherlv_17= ',\\n\"inputs\" :' otherlv_18= '{' ( (lv_inputs_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_inputs_21_0= ruleParameter ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getTopologyTemplateAccess().getInputsKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalToscaDsl.g:254:4: ( (lv_inputs_19_0= ruleParameter ) )
                    // InternalToscaDsl.g:255:5: (lv_inputs_19_0= ruleParameter )
                    {
                    // InternalToscaDsl.g:255:5: (lv_inputs_19_0= ruleParameter )
                    // InternalToscaDsl.g:256:6: lv_inputs_19_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getTopologyTemplateAccess().getInputsParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_inputs_19_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    						}
                    						add(
                    							current,
                    							"inputs",
                    							lv_inputs_19_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:273:4: (otherlv_20= ',' ( (lv_inputs_21_0= ruleParameter ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalToscaDsl.g:274:5: otherlv_20= ',' ( (lv_inputs_21_0= ruleParameter ) )
                    	    {
                    	    otherlv_20=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getTopologyTemplateAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalToscaDsl.g:278:5: ( (lv_inputs_21_0= ruleParameter ) )
                    	    // InternalToscaDsl.g:279:6: (lv_inputs_21_0= ruleParameter )
                    	    {
                    	    // InternalToscaDsl.g:279:6: (lv_inputs_21_0= ruleParameter )
                    	    // InternalToscaDsl.g:280:7: lv_inputs_21_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getTopologyTemplateAccess().getInputsParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_inputs_21_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputs",
                    	    								lv_inputs_21_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_22, grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:303:3: (otherlv_23= ',\\n\"nodeTemplates\" :' otherlv_24= '{' ( (lv_nodeTemplates_25_0= ruleNodeTemplate ) ) (otherlv_26= ',' ( (lv_nodeTemplates_27_0= ruleNodeTemplate ) ) )* otherlv_28= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalToscaDsl.g:304:4: otherlv_23= ',\\n\"nodeTemplates\" :' otherlv_24= '{' ( (lv_nodeTemplates_25_0= ruleNodeTemplate ) ) (otherlv_26= ',' ( (lv_nodeTemplates_27_0= ruleNodeTemplate ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_23, grammarAccess.getTopologyTemplateAccess().getNodeTemplatesKeyword_7_0());
                    			
                    otherlv_24=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_24, grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalToscaDsl.g:312:4: ( (lv_nodeTemplates_25_0= ruleNodeTemplate ) )
                    // InternalToscaDsl.g:313:5: (lv_nodeTemplates_25_0= ruleNodeTemplate )
                    {
                    // InternalToscaDsl.g:313:5: (lv_nodeTemplates_25_0= ruleNodeTemplate )
                    // InternalToscaDsl.g:314:6: lv_nodeTemplates_25_0= ruleNodeTemplate
                    {

                    						newCompositeNode(grammarAccess.getTopologyTemplateAccess().getNodeTemplatesNodeTemplateParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_nodeTemplates_25_0=ruleNodeTemplate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    						}
                    						add(
                    							current,
                    							"nodeTemplates",
                    							lv_nodeTemplates_25_0,
                    							"org.xtext.example.mydsl.ToscaDsl.NodeTemplate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:331:4: (otherlv_26= ',' ( (lv_nodeTemplates_27_0= ruleNodeTemplate ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==16) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalToscaDsl.g:332:5: otherlv_26= ',' ( (lv_nodeTemplates_27_0= ruleNodeTemplate ) )
                    	    {
                    	    otherlv_26=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getTopologyTemplateAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalToscaDsl.g:336:5: ( (lv_nodeTemplates_27_0= ruleNodeTemplate ) )
                    	    // InternalToscaDsl.g:337:6: (lv_nodeTemplates_27_0= ruleNodeTemplate )
                    	    {
                    	    // InternalToscaDsl.g:337:6: (lv_nodeTemplates_27_0= ruleNodeTemplate )
                    	    // InternalToscaDsl.g:338:7: lv_nodeTemplates_27_0= ruleNodeTemplate
                    	    {

                    	    							newCompositeNode(grammarAccess.getTopologyTemplateAccess().getNodeTemplatesNodeTemplateParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_nodeTemplates_27_0=ruleNodeTemplate();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodeTemplates",
                    	    								lv_nodeTemplates_27_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.NodeTemplate");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_28, grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:361:3: (otherlv_29= ',\\n\"realtionships\" :' otherlv_30= '{' ( (lv_realtionships_31_0= ruleRelationship ) ) (otherlv_32= ',' ( (lv_realtionships_33_0= ruleRelationship ) ) )* otherlv_34= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalToscaDsl.g:362:4: otherlv_29= ',\\n\"realtionships\" :' otherlv_30= '{' ( (lv_realtionships_31_0= ruleRelationship ) ) (otherlv_32= ',' ( (lv_realtionships_33_0= ruleRelationship ) ) )* otherlv_34= '}'
                    {
                    otherlv_29=(Token)match(input,22,FOLLOW_11); 

                    				newLeafNode(otherlv_29, grammarAccess.getTopologyTemplateAccess().getRealtionshipsKeyword_8_0());
                    			
                    otherlv_30=(Token)match(input,11,FOLLOW_11); 

                    				newLeafNode(otherlv_30, grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalToscaDsl.g:370:4: ( (lv_realtionships_31_0= ruleRelationship ) )
                    // InternalToscaDsl.g:371:5: (lv_realtionships_31_0= ruleRelationship )
                    {
                    // InternalToscaDsl.g:371:5: (lv_realtionships_31_0= ruleRelationship )
                    // InternalToscaDsl.g:372:6: lv_realtionships_31_0= ruleRelationship
                    {

                    						newCompositeNode(grammarAccess.getTopologyTemplateAccess().getRealtionshipsRelationshipParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_realtionships_31_0=ruleRelationship();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    						}
                    						add(
                    							current,
                    							"realtionships",
                    							lv_realtionships_31_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Relationship");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:389:4: (otherlv_32= ',' ( (lv_realtionships_33_0= ruleRelationship ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==16) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalToscaDsl.g:390:5: otherlv_32= ',' ( (lv_realtionships_33_0= ruleRelationship ) )
                    	    {
                    	    otherlv_32=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_32, grammarAccess.getTopologyTemplateAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalToscaDsl.g:394:5: ( (lv_realtionships_33_0= ruleRelationship ) )
                    	    // InternalToscaDsl.g:395:6: (lv_realtionships_33_0= ruleRelationship )
                    	    {
                    	    // InternalToscaDsl.g:395:6: (lv_realtionships_33_0= ruleRelationship )
                    	    // InternalToscaDsl.g:396:7: lv_realtionships_33_0= ruleRelationship
                    	    {

                    	    							newCompositeNode(grammarAccess.getTopologyTemplateAccess().getRealtionshipsRelationshipParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_realtionships_33_0=ruleRelationship();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"realtionships",
                    	    								lv_realtionships_33_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Relationship");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,19,FOLLOW_16); 

                    				newLeafNode(otherlv_34, grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:419:3: (otherlv_35= ',\\n\"groups\" :' otherlv_36= '{' ( (lv_groups_37_0= ruleGroup ) ) (otherlv_38= ',' ( (lv_groups_39_0= ruleGroup ) ) )* otherlv_40= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalToscaDsl.g:420:4: otherlv_35= ',\\n\"groups\" :' otherlv_36= '{' ( (lv_groups_37_0= ruleGroup ) ) (otherlv_38= ',' ( (lv_groups_39_0= ruleGroup ) ) )* otherlv_40= '}'
                    {
                    otherlv_35=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_35, grammarAccess.getTopologyTemplateAccess().getGroupsKeyword_9_0());
                    			
                    otherlv_36=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_36, grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalToscaDsl.g:428:4: ( (lv_groups_37_0= ruleGroup ) )
                    // InternalToscaDsl.g:429:5: (lv_groups_37_0= ruleGroup )
                    {
                    // InternalToscaDsl.g:429:5: (lv_groups_37_0= ruleGroup )
                    // InternalToscaDsl.g:430:6: lv_groups_37_0= ruleGroup
                    {

                    						newCompositeNode(grammarAccess.getTopologyTemplateAccess().getGroupsGroupParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_groups_37_0=ruleGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    						}
                    						add(
                    							current,
                    							"groups",
                    							lv_groups_37_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Group");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:447:4: (otherlv_38= ',' ( (lv_groups_39_0= ruleGroup ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==16) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalToscaDsl.g:448:5: otherlv_38= ',' ( (lv_groups_39_0= ruleGroup ) )
                    	    {
                    	    otherlv_38=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_38, grammarAccess.getTopologyTemplateAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalToscaDsl.g:452:5: ( (lv_groups_39_0= ruleGroup ) )
                    	    // InternalToscaDsl.g:453:6: (lv_groups_39_0= ruleGroup )
                    	    {
                    	    // InternalToscaDsl.g:453:6: (lv_groups_39_0= ruleGroup )
                    	    // InternalToscaDsl.g:454:7: lv_groups_39_0= ruleGroup
                    	    {

                    	    							newCompositeNode(grammarAccess.getTopologyTemplateAccess().getGroupsGroupParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_groups_39_0=ruleGroup();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"groups",
                    	    								lv_groups_39_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Group");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_40=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_40, grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:477:3: (otherlv_41= ',\\n\"policies\" :' otherlv_42= '{' ( (lv_policies_43_0= rulePolicy ) ) (otherlv_44= ',' ( (lv_policies_45_0= rulePolicy ) ) )* otherlv_46= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalToscaDsl.g:478:4: otherlv_41= ',\\n\"policies\" :' otherlv_42= '{' ( (lv_policies_43_0= rulePolicy ) ) (otherlv_44= ',' ( (lv_policies_45_0= rulePolicy ) ) )* otherlv_46= '}'
                    {
                    otherlv_41=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_41, grammarAccess.getTopologyTemplateAccess().getPoliciesKeyword_10_0());
                    			
                    otherlv_42=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_42, grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalToscaDsl.g:486:4: ( (lv_policies_43_0= rulePolicy ) )
                    // InternalToscaDsl.g:487:5: (lv_policies_43_0= rulePolicy )
                    {
                    // InternalToscaDsl.g:487:5: (lv_policies_43_0= rulePolicy )
                    // InternalToscaDsl.g:488:6: lv_policies_43_0= rulePolicy
                    {

                    						newCompositeNode(grammarAccess.getTopologyTemplateAccess().getPoliciesPolicyParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_policies_43_0=rulePolicy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    						}
                    						add(
                    							current,
                    							"policies",
                    							lv_policies_43_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Policy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:505:4: (otherlv_44= ',' ( (lv_policies_45_0= rulePolicy ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==16) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalToscaDsl.g:506:5: otherlv_44= ',' ( (lv_policies_45_0= rulePolicy ) )
                    	    {
                    	    otherlv_44=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_44, grammarAccess.getTopologyTemplateAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalToscaDsl.g:510:5: ( (lv_policies_45_0= rulePolicy ) )
                    	    // InternalToscaDsl.g:511:6: (lv_policies_45_0= rulePolicy )
                    	    {
                    	    // InternalToscaDsl.g:511:6: (lv_policies_45_0= rulePolicy )
                    	    // InternalToscaDsl.g:512:7: lv_policies_45_0= rulePolicy
                    	    {

                    	    							newCompositeNode(grammarAccess.getTopologyTemplateAccess().getPoliciesPolicyParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_policies_45_0=rulePolicy();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"policies",
                    	    								lv_policies_45_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Policy");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_46=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_46, grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_47=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_47, grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTopologyTemplate"


    // $ANTLR start "entryRuleEString"
    // InternalToscaDsl.g:543:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalToscaDsl.g:543:47: (iv_ruleEString= ruleEString EOF )
            // InternalToscaDsl.g:544:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalToscaDsl.g:550:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:556:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalToscaDsl.g:557:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalToscaDsl.g:557:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalToscaDsl.g:558:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalToscaDsl.g:566:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleImport"
    // InternalToscaDsl.g:577:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalToscaDsl.g:577:47: (iv_ruleImport= ruleImport EOF )
            // InternalToscaDsl.g:578:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalToscaDsl.g:584:1: ruleImport returns [EObject current=null] : ( () ( (lv_file_1_0= RULE_STRING ) )? ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_file_1_0=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:590:2: ( ( () ( (lv_file_1_0= RULE_STRING ) )? ) )
            // InternalToscaDsl.g:591:2: ( () ( (lv_file_1_0= RULE_STRING ) )? )
            {
            // InternalToscaDsl.g:591:2: ( () ( (lv_file_1_0= RULE_STRING ) )? )
            // InternalToscaDsl.g:592:3: () ( (lv_file_1_0= RULE_STRING ) )?
            {
            // InternalToscaDsl.g:592:3: ()
            // InternalToscaDsl.g:593:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImportAccess().getImportAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:599:3: ( (lv_file_1_0= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalToscaDsl.g:600:4: (lv_file_1_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:600:4: (lv_file_1_0= RULE_STRING )
                    // InternalToscaDsl.g:601:5: lv_file_1_0= RULE_STRING
                    {
                    lv_file_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_file_1_0, grammarAccess.getImportAccess().getFileSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImportRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"file",
                    						lv_file_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleParameter"
    // InternalToscaDsl.g:621:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalToscaDsl.g:621:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalToscaDsl.g:622:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalToscaDsl.g:628:1: ruleParameter returns [EObject current=null] : ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_parameter_name_1_0=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:634:2: ( ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) ) )
            // InternalToscaDsl.g:635:2: ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) )
            {
            // InternalToscaDsl.g:635:2: ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) )
            // InternalToscaDsl.g:636:3: () ( (lv_parameter_name_1_0= RULE_STRING ) )
            {
            // InternalToscaDsl.g:636:3: ()
            // InternalToscaDsl.g:637:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:643:3: ( (lv_parameter_name_1_0= RULE_STRING ) )
            // InternalToscaDsl.g:644:4: (lv_parameter_name_1_0= RULE_STRING )
            {
            // InternalToscaDsl.g:644:4: (lv_parameter_name_1_0= RULE_STRING )
            // InternalToscaDsl.g:645:5: lv_parameter_name_1_0= RULE_STRING
            {
            lv_parameter_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_parameter_name_1_0, grammarAccess.getParameterAccess().getParameter_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"parameter_name",
            						lv_parameter_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleNodeTemplate"
    // InternalToscaDsl.g:665:1: entryRuleNodeTemplate returns [EObject current=null] : iv_ruleNodeTemplate= ruleNodeTemplate EOF ;
    public final EObject entryRuleNodeTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeTemplate = null;


        try {
            // InternalToscaDsl.g:665:53: (iv_ruleNodeTemplate= ruleNodeTemplate EOF )
            // InternalToscaDsl.g:666:2: iv_ruleNodeTemplate= ruleNodeTemplate EOF
            {
             newCompositeNode(grammarAccess.getNodeTemplateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeTemplate=ruleNodeTemplate();

            state._fsp--;

             current =iv_ruleNodeTemplate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeTemplate"


    // $ANTLR start "ruleNodeTemplate"
    // InternalToscaDsl.g:672:1: ruleNodeTemplate returns [EObject current=null] : ( () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) (otherlv_6= ',\\n\"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ',\\n\"relationships\" :' otherlv_9= '[' ( (lv_relationships_10_0= ruleRelationship ) ) (otherlv_11= ',' ( (lv_relationships_12_0= ruleRelationship ) ) )* otherlv_13= ']' )? (otherlv_14= ',\\n\"interfaces\" :' otherlv_15= '{' ( (lv_interfaces_16_0= ruleInterface ) ) (otherlv_17= ',' ( (lv_interfaces_18_0= ruleInterface ) ) )* otherlv_19= '}' )? (otherlv_20= ',\\n\"properties\" :' otherlv_21= '[' ( (lv_properties_22_0= ruleProperty ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )* otherlv_25= ']' )? (otherlv_26= ',\\n\"attributes\" :' otherlv_27= '{' ( (lv_attributes_28_0= ruleAttribute ) ) (otherlv_29= ',' ( (lv_attributes_30_0= ruleAttribute ) ) )* otherlv_31= '}' )? (otherlv_32= ',\\n\"requirements\" :' otherlv_33= '{' ( (lv_requirements_34_0= ruleRequirement ) ) (otherlv_35= ',' ( (lv_requirements_36_0= ruleRequirement ) ) )* otherlv_37= '}' )? (otherlv_38= ',\\n\"capabilities\" :' otherlv_39= '{' ( (lv_capabilities_40_0= ruleCapability ) ) (otherlv_41= ',' ( (lv_capabilities_42_0= ruleCapability ) ) )* otherlv_43= '}' )? otherlv_44= '}' ) ;
    public final EObject ruleNodeTemplate() throws RecognitionException {
        EObject current = null;

        Token lv_node_template_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        EObject lv_relationships_10_0 = null;

        EObject lv_relationships_12_0 = null;

        EObject lv_interfaces_16_0 = null;

        EObject lv_interfaces_18_0 = null;

        EObject lv_properties_22_0 = null;

        EObject lv_properties_24_0 = null;

        EObject lv_attributes_28_0 = null;

        EObject lv_attributes_30_0 = null;

        EObject lv_requirements_34_0 = null;

        EObject lv_requirements_36_0 = null;

        EObject lv_capabilities_40_0 = null;

        EObject lv_capabilities_42_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:678:2: ( ( () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) (otherlv_6= ',\\n\"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ',\\n\"relationships\" :' otherlv_9= '[' ( (lv_relationships_10_0= ruleRelationship ) ) (otherlv_11= ',' ( (lv_relationships_12_0= ruleRelationship ) ) )* otherlv_13= ']' )? (otherlv_14= ',\\n\"interfaces\" :' otherlv_15= '{' ( (lv_interfaces_16_0= ruleInterface ) ) (otherlv_17= ',' ( (lv_interfaces_18_0= ruleInterface ) ) )* otherlv_19= '}' )? (otherlv_20= ',\\n\"properties\" :' otherlv_21= '[' ( (lv_properties_22_0= ruleProperty ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )* otherlv_25= ']' )? (otherlv_26= ',\\n\"attributes\" :' otherlv_27= '{' ( (lv_attributes_28_0= ruleAttribute ) ) (otherlv_29= ',' ( (lv_attributes_30_0= ruleAttribute ) ) )* otherlv_31= '}' )? (otherlv_32= ',\\n\"requirements\" :' otherlv_33= '{' ( (lv_requirements_34_0= ruleRequirement ) ) (otherlv_35= ',' ( (lv_requirements_36_0= ruleRequirement ) ) )* otherlv_37= '}' )? (otherlv_38= ',\\n\"capabilities\" :' otherlv_39= '{' ( (lv_capabilities_40_0= ruleCapability ) ) (otherlv_41= ',' ( (lv_capabilities_42_0= ruleCapability ) ) )* otherlv_43= '}' )? otherlv_44= '}' ) )
            // InternalToscaDsl.g:679:2: ( () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) (otherlv_6= ',\\n\"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ',\\n\"relationships\" :' otherlv_9= '[' ( (lv_relationships_10_0= ruleRelationship ) ) (otherlv_11= ',' ( (lv_relationships_12_0= ruleRelationship ) ) )* otherlv_13= ']' )? (otherlv_14= ',\\n\"interfaces\" :' otherlv_15= '{' ( (lv_interfaces_16_0= ruleInterface ) ) (otherlv_17= ',' ( (lv_interfaces_18_0= ruleInterface ) ) )* otherlv_19= '}' )? (otherlv_20= ',\\n\"properties\" :' otherlv_21= '[' ( (lv_properties_22_0= ruleProperty ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )* otherlv_25= ']' )? (otherlv_26= ',\\n\"attributes\" :' otherlv_27= '{' ( (lv_attributes_28_0= ruleAttribute ) ) (otherlv_29= ',' ( (lv_attributes_30_0= ruleAttribute ) ) )* otherlv_31= '}' )? (otherlv_32= ',\\n\"requirements\" :' otherlv_33= '{' ( (lv_requirements_34_0= ruleRequirement ) ) (otherlv_35= ',' ( (lv_requirements_36_0= ruleRequirement ) ) )* otherlv_37= '}' )? (otherlv_38= ',\\n\"capabilities\" :' otherlv_39= '{' ( (lv_capabilities_40_0= ruleCapability ) ) (otherlv_41= ',' ( (lv_capabilities_42_0= ruleCapability ) ) )* otherlv_43= '}' )? otherlv_44= '}' )
            {
            // InternalToscaDsl.g:679:2: ( () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) (otherlv_6= ',\\n\"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ',\\n\"relationships\" :' otherlv_9= '[' ( (lv_relationships_10_0= ruleRelationship ) ) (otherlv_11= ',' ( (lv_relationships_12_0= ruleRelationship ) ) )* otherlv_13= ']' )? (otherlv_14= ',\\n\"interfaces\" :' otherlv_15= '{' ( (lv_interfaces_16_0= ruleInterface ) ) (otherlv_17= ',' ( (lv_interfaces_18_0= ruleInterface ) ) )* otherlv_19= '}' )? (otherlv_20= ',\\n\"properties\" :' otherlv_21= '[' ( (lv_properties_22_0= ruleProperty ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )* otherlv_25= ']' )? (otherlv_26= ',\\n\"attributes\" :' otherlv_27= '{' ( (lv_attributes_28_0= ruleAttribute ) ) (otherlv_29= ',' ( (lv_attributes_30_0= ruleAttribute ) ) )* otherlv_31= '}' )? (otherlv_32= ',\\n\"requirements\" :' otherlv_33= '{' ( (lv_requirements_34_0= ruleRequirement ) ) (otherlv_35= ',' ( (lv_requirements_36_0= ruleRequirement ) ) )* otherlv_37= '}' )? (otherlv_38= ',\\n\"capabilities\" :' otherlv_39= '{' ( (lv_capabilities_40_0= ruleCapability ) ) (otherlv_41= ',' ( (lv_capabilities_42_0= ruleCapability ) ) )* otherlv_43= '}' )? otherlv_44= '}' )
            // InternalToscaDsl.g:680:3: () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) (otherlv_6= ',\\n\"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ',\\n\"relationships\" :' otherlv_9= '[' ( (lv_relationships_10_0= ruleRelationship ) ) (otherlv_11= ',' ( (lv_relationships_12_0= ruleRelationship ) ) )* otherlv_13= ']' )? (otherlv_14= ',\\n\"interfaces\" :' otherlv_15= '{' ( (lv_interfaces_16_0= ruleInterface ) ) (otherlv_17= ',' ( (lv_interfaces_18_0= ruleInterface ) ) )* otherlv_19= '}' )? (otherlv_20= ',\\n\"properties\" :' otherlv_21= '[' ( (lv_properties_22_0= ruleProperty ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )* otherlv_25= ']' )? (otherlv_26= ',\\n\"attributes\" :' otherlv_27= '{' ( (lv_attributes_28_0= ruleAttribute ) ) (otherlv_29= ',' ( (lv_attributes_30_0= ruleAttribute ) ) )* otherlv_31= '}' )? (otherlv_32= ',\\n\"requirements\" :' otherlv_33= '{' ( (lv_requirements_34_0= ruleRequirement ) ) (otherlv_35= ',' ( (lv_requirements_36_0= ruleRequirement ) ) )* otherlv_37= '}' )? (otherlv_38= ',\\n\"capabilities\" :' otherlv_39= '{' ( (lv_capabilities_40_0= ruleCapability ) ) (otherlv_41= ',' ( (lv_capabilities_42_0= ruleCapability ) ) )* otherlv_43= '}' )? otherlv_44= '}'
            {
            // InternalToscaDsl.g:680:3: ()
            // InternalToscaDsl.g:681:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNodeTemplateAccess().getNodeTemplateAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:687:3: ( (lv_node_template_name_1_0= RULE_STRING ) )
            // InternalToscaDsl.g:688:4: (lv_node_template_name_1_0= RULE_STRING )
            {
            // InternalToscaDsl.g:688:4: (lv_node_template_name_1_0= RULE_STRING )
            // InternalToscaDsl.g:689:5: lv_node_template_name_1_0= RULE_STRING
            {
            lv_node_template_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_node_template_name_1_0, grammarAccess.getNodeTemplateAccess().getNode_template_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeTemplateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"node_template_name",
            						lv_node_template_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeTemplateAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getNodeTemplateAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getNodeTemplateAccess().getTypeKeyword_4());
            		
            // InternalToscaDsl.g:717:3: ( (lv_type_5_0= RULE_STRING ) )
            // InternalToscaDsl.g:718:4: (lv_type_5_0= RULE_STRING )
            {
            // InternalToscaDsl.g:718:4: (lv_type_5_0= RULE_STRING )
            // InternalToscaDsl.g:719:5: lv_type_5_0= RULE_STRING
            {
            lv_type_5_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_type_5_0, grammarAccess.getNodeTemplateAccess().getTypeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeTemplateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalToscaDsl.g:735:3: (otherlv_6= ',\\n\"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==13) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalToscaDsl.g:736:4: otherlv_6= ',\\n\"description\" :' ( (lv_description_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getNodeTemplateAccess().getDescriptionKeyword_6_0());
                    			
                    // InternalToscaDsl.g:740:4: ( (lv_description_7_0= RULE_STRING ) )
                    // InternalToscaDsl.g:741:5: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:741:5: (lv_description_7_0= RULE_STRING )
                    // InternalToscaDsl.g:742:6: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						newLeafNode(lv_description_7_0, grammarAccess.getNodeTemplateAccess().getDescriptionSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeTemplateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:759:3: (otherlv_8= ',\\n\"relationships\" :' otherlv_9= '[' ( (lv_relationships_10_0= ruleRelationship ) ) (otherlv_11= ',' ( (lv_relationships_12_0= ruleRelationship ) ) )* otherlv_13= ']' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalToscaDsl.g:760:4: otherlv_8= ',\\n\"relationships\" :' otherlv_9= '[' ( (lv_relationships_10_0= ruleRelationship ) ) (otherlv_11= ',' ( (lv_relationships_12_0= ruleRelationship ) ) )* otherlv_13= ']'
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getNodeTemplateAccess().getRelationshipsKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getNodeTemplateAccess().getLeftSquareBracketKeyword_7_1());
                    			
                    // InternalToscaDsl.g:768:4: ( (lv_relationships_10_0= ruleRelationship ) )
                    // InternalToscaDsl.g:769:5: (lv_relationships_10_0= ruleRelationship )
                    {
                    // InternalToscaDsl.g:769:5: (lv_relationships_10_0= ruleRelationship )
                    // InternalToscaDsl.g:770:6: lv_relationships_10_0= ruleRelationship
                    {

                    						newCompositeNode(grammarAccess.getNodeTemplateAccess().getRelationshipsRelationshipParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_relationships_10_0=ruleRelationship();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    						}
                    						add(
                    							current,
                    							"relationships",
                    							lv_relationships_10_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Relationship");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:787:4: (otherlv_11= ',' ( (lv_relationships_12_0= ruleRelationship ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==16) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalToscaDsl.g:788:5: otherlv_11= ',' ( (lv_relationships_12_0= ruleRelationship ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getNodeTemplateAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalToscaDsl.g:792:5: ( (lv_relationships_12_0= ruleRelationship ) )
                    	    // InternalToscaDsl.g:793:6: (lv_relationships_12_0= ruleRelationship )
                    	    {
                    	    // InternalToscaDsl.g:793:6: (lv_relationships_12_0= ruleRelationship )
                    	    // InternalToscaDsl.g:794:7: lv_relationships_12_0= ruleRelationship
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeTemplateAccess().getRelationshipsRelationshipParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_relationships_12_0=ruleRelationship();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relationships",
                    	    								lv_relationships_12_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Relationship");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_13, grammarAccess.getNodeTemplateAccess().getRightSquareBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:817:3: (otherlv_14= ',\\n\"interfaces\" :' otherlv_15= '{' ( (lv_interfaces_16_0= ruleInterface ) ) (otherlv_17= ',' ( (lv_interfaces_18_0= ruleInterface ) ) )* otherlv_19= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalToscaDsl.g:818:4: otherlv_14= ',\\n\"interfaces\" :' otherlv_15= '{' ( (lv_interfaces_16_0= ruleInterface ) ) (otherlv_17= ',' ( (lv_interfaces_18_0= ruleInterface ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getNodeTemplateAccess().getInterfacesKeyword_8_0());
                    			
                    otherlv_15=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getNodeTemplateAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalToscaDsl.g:826:4: ( (lv_interfaces_16_0= ruleInterface ) )
                    // InternalToscaDsl.g:827:5: (lv_interfaces_16_0= ruleInterface )
                    {
                    // InternalToscaDsl.g:827:5: (lv_interfaces_16_0= ruleInterface )
                    // InternalToscaDsl.g:828:6: lv_interfaces_16_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getNodeTemplateAccess().getInterfacesInterfaceParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_interfaces_16_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    						}
                    						add(
                    							current,
                    							"interfaces",
                    							lv_interfaces_16_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:845:4: (otherlv_17= ',' ( (lv_interfaces_18_0= ruleInterface ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==16) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalToscaDsl.g:846:5: otherlv_17= ',' ( (lv_interfaces_18_0= ruleInterface ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getNodeTemplateAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalToscaDsl.g:850:5: ( (lv_interfaces_18_0= ruleInterface ) )
                    	    // InternalToscaDsl.g:851:6: (lv_interfaces_18_0= ruleInterface )
                    	    {
                    	    // InternalToscaDsl.g:851:6: (lv_interfaces_18_0= ruleInterface )
                    	    // InternalToscaDsl.g:852:7: lv_interfaces_18_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeTemplateAccess().getInterfacesInterfaceParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_interfaces_18_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaces",
                    	    								lv_interfaces_18_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,19,FOLLOW_24); 

                    				newLeafNode(otherlv_19, grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:875:3: (otherlv_20= ',\\n\"properties\" :' otherlv_21= '[' ( (lv_properties_22_0= ruleProperty ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )* otherlv_25= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalToscaDsl.g:876:4: otherlv_20= ',\\n\"properties\" :' otherlv_21= '[' ( (lv_properties_22_0= ruleProperty ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )* otherlv_25= ']'
                    {
                    otherlv_20=(Token)match(input,29,FOLLOW_7); 

                    				newLeafNode(otherlv_20, grammarAccess.getNodeTemplateAccess().getPropertiesKeyword_9_0());
                    			
                    otherlv_21=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_21, grammarAccess.getNodeTemplateAccess().getLeftSquareBracketKeyword_9_1());
                    			
                    // InternalToscaDsl.g:884:4: ( (lv_properties_22_0= ruleProperty ) )
                    // InternalToscaDsl.g:885:5: (lv_properties_22_0= ruleProperty )
                    {
                    // InternalToscaDsl.g:885:5: (lv_properties_22_0= ruleProperty )
                    // InternalToscaDsl.g:886:6: lv_properties_22_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getNodeTemplateAccess().getPropertiesPropertyParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_properties_22_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_22_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:903:4: (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==16) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalToscaDsl.g:904:5: otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) )
                    	    {
                    	    otherlv_23=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getNodeTemplateAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalToscaDsl.g:908:5: ( (lv_properties_24_0= ruleProperty ) )
                    	    // InternalToscaDsl.g:909:6: (lv_properties_24_0= ruleProperty )
                    	    {
                    	    // InternalToscaDsl.g:909:6: (lv_properties_24_0= ruleProperty )
                    	    // InternalToscaDsl.g:910:7: lv_properties_24_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeTemplateAccess().getPropertiesPropertyParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_properties_24_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_24_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,17,FOLLOW_25); 

                    				newLeafNode(otherlv_25, grammarAccess.getNodeTemplateAccess().getRightSquareBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:933:3: (otherlv_26= ',\\n\"attributes\" :' otherlv_27= '{' ( (lv_attributes_28_0= ruleAttribute ) ) (otherlv_29= ',' ( (lv_attributes_30_0= ruleAttribute ) ) )* otherlv_31= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalToscaDsl.g:934:4: otherlv_26= ',\\n\"attributes\" :' otherlv_27= '{' ( (lv_attributes_28_0= ruleAttribute ) ) (otherlv_29= ',' ( (lv_attributes_30_0= ruleAttribute ) ) )* otherlv_31= '}'
                    {
                    otherlv_26=(Token)match(input,30,FOLLOW_11); 

                    				newLeafNode(otherlv_26, grammarAccess.getNodeTemplateAccess().getAttributesKeyword_10_0());
                    			
                    otherlv_27=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_27, grammarAccess.getNodeTemplateAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalToscaDsl.g:942:4: ( (lv_attributes_28_0= ruleAttribute ) )
                    // InternalToscaDsl.g:943:5: (lv_attributes_28_0= ruleAttribute )
                    {
                    // InternalToscaDsl.g:943:5: (lv_attributes_28_0= ruleAttribute )
                    // InternalToscaDsl.g:944:6: lv_attributes_28_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getNodeTemplateAccess().getAttributesAttributeParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_attributes_28_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_28_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:961:4: (otherlv_29= ',' ( (lv_attributes_30_0= ruleAttribute ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==16) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalToscaDsl.g:962:5: otherlv_29= ',' ( (lv_attributes_30_0= ruleAttribute ) )
                    	    {
                    	    otherlv_29=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_29, grammarAccess.getNodeTemplateAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalToscaDsl.g:966:5: ( (lv_attributes_30_0= ruleAttribute ) )
                    	    // InternalToscaDsl.g:967:6: (lv_attributes_30_0= ruleAttribute )
                    	    {
                    	    // InternalToscaDsl.g:967:6: (lv_attributes_30_0= ruleAttribute )
                    	    // InternalToscaDsl.g:968:7: lv_attributes_30_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeTemplateAccess().getAttributesAttributeParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_attributes_30_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_30_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,19,FOLLOW_26); 

                    				newLeafNode(otherlv_31, grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:991:3: (otherlv_32= ',\\n\"requirements\" :' otherlv_33= '{' ( (lv_requirements_34_0= ruleRequirement ) ) (otherlv_35= ',' ( (lv_requirements_36_0= ruleRequirement ) ) )* otherlv_37= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalToscaDsl.g:992:4: otherlv_32= ',\\n\"requirements\" :' otherlv_33= '{' ( (lv_requirements_34_0= ruleRequirement ) ) (otherlv_35= ',' ( (lv_requirements_36_0= ruleRequirement ) ) )* otherlv_37= '}'
                    {
                    otherlv_32=(Token)match(input,31,FOLLOW_11); 

                    				newLeafNode(otherlv_32, grammarAccess.getNodeTemplateAccess().getRequirementsKeyword_11_0());
                    			
                    otherlv_33=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_33, grammarAccess.getNodeTemplateAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalToscaDsl.g:1000:4: ( (lv_requirements_34_0= ruleRequirement ) )
                    // InternalToscaDsl.g:1001:5: (lv_requirements_34_0= ruleRequirement )
                    {
                    // InternalToscaDsl.g:1001:5: (lv_requirements_34_0= ruleRequirement )
                    // InternalToscaDsl.g:1002:6: lv_requirements_34_0= ruleRequirement
                    {

                    						newCompositeNode(grammarAccess.getNodeTemplateAccess().getRequirementsRequirementParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_requirements_34_0=ruleRequirement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    						}
                    						add(
                    							current,
                    							"requirements",
                    							lv_requirements_34_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Requirement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:1019:4: (otherlv_35= ',' ( (lv_requirements_36_0= ruleRequirement ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==16) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1020:5: otherlv_35= ',' ( (lv_requirements_36_0= ruleRequirement ) )
                    	    {
                    	    otherlv_35=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_35, grammarAccess.getNodeTemplateAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalToscaDsl.g:1024:5: ( (lv_requirements_36_0= ruleRequirement ) )
                    	    // InternalToscaDsl.g:1025:6: (lv_requirements_36_0= ruleRequirement )
                    	    {
                    	    // InternalToscaDsl.g:1025:6: (lv_requirements_36_0= ruleRequirement )
                    	    // InternalToscaDsl.g:1026:7: lv_requirements_36_0= ruleRequirement
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeTemplateAccess().getRequirementsRequirementParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_requirements_36_0=ruleRequirement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requirements",
                    	    								lv_requirements_36_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Requirement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_37=(Token)match(input,19,FOLLOW_27); 

                    				newLeafNode(otherlv_37, grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:1049:3: (otherlv_38= ',\\n\"capabilities\" :' otherlv_39= '{' ( (lv_capabilities_40_0= ruleCapability ) ) (otherlv_41= ',' ( (lv_capabilities_42_0= ruleCapability ) ) )* otherlv_43= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalToscaDsl.g:1050:4: otherlv_38= ',\\n\"capabilities\" :' otherlv_39= '{' ( (lv_capabilities_40_0= ruleCapability ) ) (otherlv_41= ',' ( (lv_capabilities_42_0= ruleCapability ) ) )* otherlv_43= '}'
                    {
                    otherlv_38=(Token)match(input,32,FOLLOW_11); 

                    				newLeafNode(otherlv_38, grammarAccess.getNodeTemplateAccess().getCapabilitiesKeyword_12_0());
                    			
                    otherlv_39=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_39, grammarAccess.getNodeTemplateAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalToscaDsl.g:1058:4: ( (lv_capabilities_40_0= ruleCapability ) )
                    // InternalToscaDsl.g:1059:5: (lv_capabilities_40_0= ruleCapability )
                    {
                    // InternalToscaDsl.g:1059:5: (lv_capabilities_40_0= ruleCapability )
                    // InternalToscaDsl.g:1060:6: lv_capabilities_40_0= ruleCapability
                    {

                    						newCompositeNode(grammarAccess.getNodeTemplateAccess().getCapabilitiesCapabilityParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_capabilities_40_0=ruleCapability();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    						}
                    						add(
                    							current,
                    							"capabilities",
                    							lv_capabilities_40_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Capability");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:1077:4: (otherlv_41= ',' ( (lv_capabilities_42_0= ruleCapability ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==16) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1078:5: otherlv_41= ',' ( (lv_capabilities_42_0= ruleCapability ) )
                    	    {
                    	    otherlv_41=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_41, grammarAccess.getNodeTemplateAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalToscaDsl.g:1082:5: ( (lv_capabilities_42_0= ruleCapability ) )
                    	    // InternalToscaDsl.g:1083:6: (lv_capabilities_42_0= ruleCapability )
                    	    {
                    	    // InternalToscaDsl.g:1083:6: (lv_capabilities_42_0= ruleCapability )
                    	    // InternalToscaDsl.g:1084:7: lv_capabilities_42_0= ruleCapability
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeTemplateAccess().getCapabilitiesCapabilityParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_capabilities_42_0=ruleCapability();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"capabilities",
                    	    								lv_capabilities_42_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Capability");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_43=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_43, grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            otherlv_44=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_44, grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeTemplate"


    // $ANTLR start "entryRuleRelationship"
    // InternalToscaDsl.g:1115:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalToscaDsl.g:1115:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalToscaDsl.g:1116:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalToscaDsl.g:1122:1: ruleRelationship returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) (otherlv_4= ',\\n\"target\" :' ( (lv_target_5_0= RULE_STRING ) ) )? (otherlv_6= ',\\n\"interfaces\" :' otherlv_7= '{' ( (lv_interfaces_8_0= ruleInterface ) ) (otherlv_9= ',' ( (lv_interfaces_10_0= ruleInterface ) ) )* otherlv_11= '}' )? (otherlv_12= ',\\n\"properties\" :' otherlv_13= '[' ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= ']' )? (otherlv_18= ',\\n\"attributes\" :' otherlv_19= '{' ( (lv_attributes_20_0= ruleAttribute ) ) (otherlv_21= ',' ( (lv_attributes_22_0= ruleAttribute ) ) )* otherlv_23= '}' )? (otherlv_24= ',\\n\"source_interfaces\" :' otherlv_25= '{' ( (lv_source_interfaces_26_0= ruleInterface ) ) (otherlv_27= ',' ( (lv_source_interfaces_28_0= ruleInterface ) ) )* otherlv_29= '}' )? (otherlv_30= ',\\n\"target_iterfaces\" :' otherlv_31= '{' ( (lv_target_interfaces_32_0= ruleInterface ) ) (otherlv_33= ',' ( (lv_target_interfaces_34_0= ruleInterface ) ) )* otherlv_35= '}' )? otherlv_36= '}' ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token otherlv_4=null;
        Token lv_target_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        EObject lv_interfaces_8_0 = null;

        EObject lv_interfaces_10_0 = null;

        EObject lv_properties_14_0 = null;

        EObject lv_properties_16_0 = null;

        EObject lv_attributes_20_0 = null;

        EObject lv_attributes_22_0 = null;

        EObject lv_source_interfaces_26_0 = null;

        EObject lv_source_interfaces_28_0 = null;

        EObject lv_target_interfaces_32_0 = null;

        EObject lv_target_interfaces_34_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:1128:2: ( ( () otherlv_1= '{' otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) (otherlv_4= ',\\n\"target\" :' ( (lv_target_5_0= RULE_STRING ) ) )? (otherlv_6= ',\\n\"interfaces\" :' otherlv_7= '{' ( (lv_interfaces_8_0= ruleInterface ) ) (otherlv_9= ',' ( (lv_interfaces_10_0= ruleInterface ) ) )* otherlv_11= '}' )? (otherlv_12= ',\\n\"properties\" :' otherlv_13= '[' ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= ']' )? (otherlv_18= ',\\n\"attributes\" :' otherlv_19= '{' ( (lv_attributes_20_0= ruleAttribute ) ) (otherlv_21= ',' ( (lv_attributes_22_0= ruleAttribute ) ) )* otherlv_23= '}' )? (otherlv_24= ',\\n\"source_interfaces\" :' otherlv_25= '{' ( (lv_source_interfaces_26_0= ruleInterface ) ) (otherlv_27= ',' ( (lv_source_interfaces_28_0= ruleInterface ) ) )* otherlv_29= '}' )? (otherlv_30= ',\\n\"target_iterfaces\" :' otherlv_31= '{' ( (lv_target_interfaces_32_0= ruleInterface ) ) (otherlv_33= ',' ( (lv_target_interfaces_34_0= ruleInterface ) ) )* otherlv_35= '}' )? otherlv_36= '}' ) )
            // InternalToscaDsl.g:1129:2: ( () otherlv_1= '{' otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) (otherlv_4= ',\\n\"target\" :' ( (lv_target_5_0= RULE_STRING ) ) )? (otherlv_6= ',\\n\"interfaces\" :' otherlv_7= '{' ( (lv_interfaces_8_0= ruleInterface ) ) (otherlv_9= ',' ( (lv_interfaces_10_0= ruleInterface ) ) )* otherlv_11= '}' )? (otherlv_12= ',\\n\"properties\" :' otherlv_13= '[' ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= ']' )? (otherlv_18= ',\\n\"attributes\" :' otherlv_19= '{' ( (lv_attributes_20_0= ruleAttribute ) ) (otherlv_21= ',' ( (lv_attributes_22_0= ruleAttribute ) ) )* otherlv_23= '}' )? (otherlv_24= ',\\n\"source_interfaces\" :' otherlv_25= '{' ( (lv_source_interfaces_26_0= ruleInterface ) ) (otherlv_27= ',' ( (lv_source_interfaces_28_0= ruleInterface ) ) )* otherlv_29= '}' )? (otherlv_30= ',\\n\"target_iterfaces\" :' otherlv_31= '{' ( (lv_target_interfaces_32_0= ruleInterface ) ) (otherlv_33= ',' ( (lv_target_interfaces_34_0= ruleInterface ) ) )* otherlv_35= '}' )? otherlv_36= '}' )
            {
            // InternalToscaDsl.g:1129:2: ( () otherlv_1= '{' otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) (otherlv_4= ',\\n\"target\" :' ( (lv_target_5_0= RULE_STRING ) ) )? (otherlv_6= ',\\n\"interfaces\" :' otherlv_7= '{' ( (lv_interfaces_8_0= ruleInterface ) ) (otherlv_9= ',' ( (lv_interfaces_10_0= ruleInterface ) ) )* otherlv_11= '}' )? (otherlv_12= ',\\n\"properties\" :' otherlv_13= '[' ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= ']' )? (otherlv_18= ',\\n\"attributes\" :' otherlv_19= '{' ( (lv_attributes_20_0= ruleAttribute ) ) (otherlv_21= ',' ( (lv_attributes_22_0= ruleAttribute ) ) )* otherlv_23= '}' )? (otherlv_24= ',\\n\"source_interfaces\" :' otherlv_25= '{' ( (lv_source_interfaces_26_0= ruleInterface ) ) (otherlv_27= ',' ( (lv_source_interfaces_28_0= ruleInterface ) ) )* otherlv_29= '}' )? (otherlv_30= ',\\n\"target_iterfaces\" :' otherlv_31= '{' ( (lv_target_interfaces_32_0= ruleInterface ) ) (otherlv_33= ',' ( (lv_target_interfaces_34_0= ruleInterface ) ) )* otherlv_35= '}' )? otherlv_36= '}' )
            // InternalToscaDsl.g:1130:3: () otherlv_1= '{' otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) (otherlv_4= ',\\n\"target\" :' ( (lv_target_5_0= RULE_STRING ) ) )? (otherlv_6= ',\\n\"interfaces\" :' otherlv_7= '{' ( (lv_interfaces_8_0= ruleInterface ) ) (otherlv_9= ',' ( (lv_interfaces_10_0= ruleInterface ) ) )* otherlv_11= '}' )? (otherlv_12= ',\\n\"properties\" :' otherlv_13= '[' ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= ']' )? (otherlv_18= ',\\n\"attributes\" :' otherlv_19= '{' ( (lv_attributes_20_0= ruleAttribute ) ) (otherlv_21= ',' ( (lv_attributes_22_0= ruleAttribute ) ) )* otherlv_23= '}' )? (otherlv_24= ',\\n\"source_interfaces\" :' otherlv_25= '{' ( (lv_source_interfaces_26_0= ruleInterface ) ) (otherlv_27= ',' ( (lv_source_interfaces_28_0= ruleInterface ) ) )* otherlv_29= '}' )? (otherlv_30= ',\\n\"target_iterfaces\" :' otherlv_31= '{' ( (lv_target_interfaces_32_0= ruleInterface ) ) (otherlv_33= ',' ( (lv_target_interfaces_34_0= ruleInterface ) ) )* otherlv_35= '}' )? otherlv_36= '}'
            {
            // InternalToscaDsl.g:1130:3: ()
            // InternalToscaDsl.g:1131:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationshipAccess().getRelationshipAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationshipAccess().getTypeKeyword_2());
            		
            // InternalToscaDsl.g:1145:3: ( (lv_type_3_0= RULE_STRING ) )
            // InternalToscaDsl.g:1146:4: (lv_type_3_0= RULE_STRING )
            {
            // InternalToscaDsl.g:1146:4: (lv_type_3_0= RULE_STRING )
            // InternalToscaDsl.g:1147:5: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_type_3_0, grammarAccess.getRelationshipAccess().getTypeSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationshipRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalToscaDsl.g:1163:3: (otherlv_4= ',\\n\"target\" :' ( (lv_target_5_0= RULE_STRING ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalToscaDsl.g:1164:4: otherlv_4= ',\\n\"target\" :' ( (lv_target_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelationshipAccess().getTargetKeyword_4_0());
                    			
                    // InternalToscaDsl.g:1168:4: ( (lv_target_5_0= RULE_STRING ) )
                    // InternalToscaDsl.g:1169:5: (lv_target_5_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:1169:5: (lv_target_5_0= RULE_STRING )
                    // InternalToscaDsl.g:1170:6: lv_target_5_0= RULE_STRING
                    {
                    lv_target_5_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

                    						newLeafNode(lv_target_5_0, grammarAccess.getRelationshipAccess().getTargetSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationshipRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"target",
                    							lv_target_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:1187:3: (otherlv_6= ',\\n\"interfaces\" :' otherlv_7= '{' ( (lv_interfaces_8_0= ruleInterface ) ) (otherlv_9= ',' ( (lv_interfaces_10_0= ruleInterface ) ) )* otherlv_11= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==28) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalToscaDsl.g:1188:4: otherlv_6= ',\\n\"interfaces\" :' otherlv_7= '{' ( (lv_interfaces_8_0= ruleInterface ) ) (otherlv_9= ',' ( (lv_interfaces_10_0= ruleInterface ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationshipAccess().getInterfacesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalToscaDsl.g:1196:4: ( (lv_interfaces_8_0= ruleInterface ) )
                    // InternalToscaDsl.g:1197:5: (lv_interfaces_8_0= ruleInterface )
                    {
                    // InternalToscaDsl.g:1197:5: (lv_interfaces_8_0= ruleInterface )
                    // InternalToscaDsl.g:1198:6: lv_interfaces_8_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getRelationshipAccess().getInterfacesInterfaceParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_interfaces_8_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    						}
                    						add(
                    							current,
                    							"interfaces",
                    							lv_interfaces_8_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:1215:4: (otherlv_9= ',' ( (lv_interfaces_10_0= ruleInterface ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==16) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1216:5: otherlv_9= ',' ( (lv_interfaces_10_0= ruleInterface ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getRelationshipAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalToscaDsl.g:1220:5: ( (lv_interfaces_10_0= ruleInterface ) )
                    	    // InternalToscaDsl.g:1221:6: (lv_interfaces_10_0= ruleInterface )
                    	    {
                    	    // InternalToscaDsl.g:1221:6: (lv_interfaces_10_0= ruleInterface )
                    	    // InternalToscaDsl.g:1222:7: lv_interfaces_10_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelationshipAccess().getInterfacesInterfaceParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_interfaces_10_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaces",
                    	    								lv_interfaces_10_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_30); 

                    				newLeafNode(otherlv_11, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:1245:3: (otherlv_12= ',\\n\"properties\" :' otherlv_13= '[' ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= ']' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalToscaDsl.g:1246:4: otherlv_12= ',\\n\"properties\" :' otherlv_13= '[' ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= ']'
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getRelationshipAccess().getPropertiesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getRelationshipAccess().getLeftSquareBracketKeyword_6_1());
                    			
                    // InternalToscaDsl.g:1254:4: ( (lv_properties_14_0= ruleProperty ) )
                    // InternalToscaDsl.g:1255:5: (lv_properties_14_0= ruleProperty )
                    {
                    // InternalToscaDsl.g:1255:5: (lv_properties_14_0= ruleProperty )
                    // InternalToscaDsl.g:1256:6: lv_properties_14_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getRelationshipAccess().getPropertiesPropertyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_properties_14_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_14_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:1273:4: (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==16) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1274:5: otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getRelationshipAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalToscaDsl.g:1278:5: ( (lv_properties_16_0= ruleProperty ) )
                    	    // InternalToscaDsl.g:1279:6: (lv_properties_16_0= ruleProperty )
                    	    {
                    	    // InternalToscaDsl.g:1279:6: (lv_properties_16_0= ruleProperty )
                    	    // InternalToscaDsl.g:1280:7: lv_properties_16_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelationshipAccess().getPropertiesPropertyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_properties_16_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_16_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FOLLOW_31); 

                    				newLeafNode(otherlv_17, grammarAccess.getRelationshipAccess().getRightSquareBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:1303:3: (otherlv_18= ',\\n\"attributes\" :' otherlv_19= '{' ( (lv_attributes_20_0= ruleAttribute ) ) (otherlv_21= ',' ( (lv_attributes_22_0= ruleAttribute ) ) )* otherlv_23= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==30) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalToscaDsl.g:1304:4: otherlv_18= ',\\n\"attributes\" :' otherlv_19= '{' ( (lv_attributes_20_0= ruleAttribute ) ) (otherlv_21= ',' ( (lv_attributes_22_0= ruleAttribute ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_11); 

                    				newLeafNode(otherlv_18, grammarAccess.getRelationshipAccess().getAttributesKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_19, grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalToscaDsl.g:1312:4: ( (lv_attributes_20_0= ruleAttribute ) )
                    // InternalToscaDsl.g:1313:5: (lv_attributes_20_0= ruleAttribute )
                    {
                    // InternalToscaDsl.g:1313:5: (lv_attributes_20_0= ruleAttribute )
                    // InternalToscaDsl.g:1314:6: lv_attributes_20_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getRelationshipAccess().getAttributesAttributeParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_attributes_20_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_20_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:1331:4: (otherlv_21= ',' ( (lv_attributes_22_0= ruleAttribute ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==16) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1332:5: otherlv_21= ',' ( (lv_attributes_22_0= ruleAttribute ) )
                    	    {
                    	    otherlv_21=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getRelationshipAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalToscaDsl.g:1336:5: ( (lv_attributes_22_0= ruleAttribute ) )
                    	    // InternalToscaDsl.g:1337:6: (lv_attributes_22_0= ruleAttribute )
                    	    {
                    	    // InternalToscaDsl.g:1337:6: (lv_attributes_22_0= ruleAttribute )
                    	    // InternalToscaDsl.g:1338:7: lv_attributes_22_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelationshipAccess().getAttributesAttributeParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_attributes_22_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_22_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,19,FOLLOW_32); 

                    				newLeafNode(otherlv_23, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:1361:3: (otherlv_24= ',\\n\"source_interfaces\" :' otherlv_25= '{' ( (lv_source_interfaces_26_0= ruleInterface ) ) (otherlv_27= ',' ( (lv_source_interfaces_28_0= ruleInterface ) ) )* otherlv_29= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==34) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalToscaDsl.g:1362:4: otherlv_24= ',\\n\"source_interfaces\" :' otherlv_25= '{' ( (lv_source_interfaces_26_0= ruleInterface ) ) (otherlv_27= ',' ( (lv_source_interfaces_28_0= ruleInterface ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,34,FOLLOW_11); 

                    				newLeafNode(otherlv_24, grammarAccess.getRelationshipAccess().getSource_interfacesKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_25, grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalToscaDsl.g:1370:4: ( (lv_source_interfaces_26_0= ruleInterface ) )
                    // InternalToscaDsl.g:1371:5: (lv_source_interfaces_26_0= ruleInterface )
                    {
                    // InternalToscaDsl.g:1371:5: (lv_source_interfaces_26_0= ruleInterface )
                    // InternalToscaDsl.g:1372:6: lv_source_interfaces_26_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getRelationshipAccess().getSource_interfacesInterfaceParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_source_interfaces_26_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    						}
                    						add(
                    							current,
                    							"source_interfaces",
                    							lv_source_interfaces_26_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:1389:4: (otherlv_27= ',' ( (lv_source_interfaces_28_0= ruleInterface ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==16) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1390:5: otherlv_27= ',' ( (lv_source_interfaces_28_0= ruleInterface ) )
                    	    {
                    	    otherlv_27=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getRelationshipAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalToscaDsl.g:1394:5: ( (lv_source_interfaces_28_0= ruleInterface ) )
                    	    // InternalToscaDsl.g:1395:6: (lv_source_interfaces_28_0= ruleInterface )
                    	    {
                    	    // InternalToscaDsl.g:1395:6: (lv_source_interfaces_28_0= ruleInterface )
                    	    // InternalToscaDsl.g:1396:7: lv_source_interfaces_28_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelationshipAccess().getSource_interfacesInterfaceParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_source_interfaces_28_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"source_interfaces",
                    	    								lv_source_interfaces_28_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,19,FOLLOW_33); 

                    				newLeafNode(otherlv_29, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:1419:3: (otherlv_30= ',\\n\"target_iterfaces\" :' otherlv_31= '{' ( (lv_target_interfaces_32_0= ruleInterface ) ) (otherlv_33= ',' ( (lv_target_interfaces_34_0= ruleInterface ) ) )* otherlv_35= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==35) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalToscaDsl.g:1420:4: otherlv_30= ',\\n\"target_iterfaces\" :' otherlv_31= '{' ( (lv_target_interfaces_32_0= ruleInterface ) ) (otherlv_33= ',' ( (lv_target_interfaces_34_0= ruleInterface ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,35,FOLLOW_11); 

                    				newLeafNode(otherlv_30, grammarAccess.getRelationshipAccess().getTarget_iterfacesKeyword_9_0());
                    			
                    otherlv_31=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_31, grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalToscaDsl.g:1428:4: ( (lv_target_interfaces_32_0= ruleInterface ) )
                    // InternalToscaDsl.g:1429:5: (lv_target_interfaces_32_0= ruleInterface )
                    {
                    // InternalToscaDsl.g:1429:5: (lv_target_interfaces_32_0= ruleInterface )
                    // InternalToscaDsl.g:1430:6: lv_target_interfaces_32_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getRelationshipAccess().getTarget_interfacesInterfaceParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_target_interfaces_32_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    						}
                    						add(
                    							current,
                    							"target_interfaces",
                    							lv_target_interfaces_32_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:1447:4: (otherlv_33= ',' ( (lv_target_interfaces_34_0= ruleInterface ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==16) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1448:5: otherlv_33= ',' ( (lv_target_interfaces_34_0= ruleInterface ) )
                    	    {
                    	    otherlv_33=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getRelationshipAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalToscaDsl.g:1452:5: ( (lv_target_interfaces_34_0= ruleInterface ) )
                    	    // InternalToscaDsl.g:1453:6: (lv_target_interfaces_34_0= ruleInterface )
                    	    {
                    	    // InternalToscaDsl.g:1453:6: (lv_target_interfaces_34_0= ruleInterface )
                    	    // InternalToscaDsl.g:1454:7: lv_target_interfaces_34_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelationshipAccess().getTarget_interfacesInterfaceParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_target_interfaces_34_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"target_interfaces",
                    	    								lv_target_interfaces_34_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_35, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_36=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_36, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleGroup"
    // InternalToscaDsl.g:1485:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalToscaDsl.g:1485:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalToscaDsl.g:1486:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalToscaDsl.g:1492:1: ruleGroup returns [EObject current=null] : ( () ( (lv_group_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) (otherlv_6= ',\\n\"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ',\\n\"targets\" :' otherlv_9= '{' ( (lv_targets_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_targets_12_0= RULE_STRING ) ) )* otherlv_13= '}' )? (otherlv_14= ',\\n\"properties\" :' ( (lv_properties_15_0= ruleProperty ) ) )? (otherlv_16= ',\\n\"interfaces\" :' otherlv_17= '{' ( (lv_interfaces_18_0= ruleInterface ) ) (otherlv_19= ',' ( (lv_interfaces_20_0= ruleInterface ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token lv_group_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_targets_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_targets_10_0 = null;

        EObject lv_properties_15_0 = null;

        EObject lv_interfaces_18_0 = null;

        EObject lv_interfaces_20_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:1498:2: ( ( () ( (lv_group_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) (otherlv_6= ',\\n\"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ',\\n\"targets\" :' otherlv_9= '{' ( (lv_targets_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_targets_12_0= RULE_STRING ) ) )* otherlv_13= '}' )? (otherlv_14= ',\\n\"properties\" :' ( (lv_properties_15_0= ruleProperty ) ) )? (otherlv_16= ',\\n\"interfaces\" :' otherlv_17= '{' ( (lv_interfaces_18_0= ruleInterface ) ) (otherlv_19= ',' ( (lv_interfaces_20_0= ruleInterface ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalToscaDsl.g:1499:2: ( () ( (lv_group_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) (otherlv_6= ',\\n\"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ',\\n\"targets\" :' otherlv_9= '{' ( (lv_targets_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_targets_12_0= RULE_STRING ) ) )* otherlv_13= '}' )? (otherlv_14= ',\\n\"properties\" :' ( (lv_properties_15_0= ruleProperty ) ) )? (otherlv_16= ',\\n\"interfaces\" :' otherlv_17= '{' ( (lv_interfaces_18_0= ruleInterface ) ) (otherlv_19= ',' ( (lv_interfaces_20_0= ruleInterface ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalToscaDsl.g:1499:2: ( () ( (lv_group_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) (otherlv_6= ',\\n\"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ',\\n\"targets\" :' otherlv_9= '{' ( (lv_targets_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_targets_12_0= RULE_STRING ) ) )* otherlv_13= '}' )? (otherlv_14= ',\\n\"properties\" :' ( (lv_properties_15_0= ruleProperty ) ) )? (otherlv_16= ',\\n\"interfaces\" :' otherlv_17= '{' ( (lv_interfaces_18_0= ruleInterface ) ) (otherlv_19= ',' ( (lv_interfaces_20_0= ruleInterface ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalToscaDsl.g:1500:3: () ( (lv_group_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) (otherlv_6= ',\\n\"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ',\\n\"targets\" :' otherlv_9= '{' ( (lv_targets_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_targets_12_0= RULE_STRING ) ) )* otherlv_13= '}' )? (otherlv_14= ',\\n\"properties\" :' ( (lv_properties_15_0= ruleProperty ) ) )? (otherlv_16= ',\\n\"interfaces\" :' otherlv_17= '{' ( (lv_interfaces_18_0= ruleInterface ) ) (otherlv_19= ',' ( (lv_interfaces_20_0= ruleInterface ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalToscaDsl.g:1500:3: ()
            // InternalToscaDsl.g:1501:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupAccess().getGroupAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:1507:3: ( (lv_group_name_1_0= RULE_STRING ) )
            // InternalToscaDsl.g:1508:4: (lv_group_name_1_0= RULE_STRING )
            {
            // InternalToscaDsl.g:1508:4: (lv_group_name_1_0= RULE_STRING )
            // InternalToscaDsl.g:1509:5: lv_group_name_1_0= RULE_STRING
            {
            lv_group_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_group_name_1_0, grammarAccess.getGroupAccess().getGroup_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"group_name",
            						lv_group_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getTypeKeyword_4());
            		
            // InternalToscaDsl.g:1537:3: ( (lv_type_5_0= RULE_STRING ) )
            // InternalToscaDsl.g:1538:4: (lv_type_5_0= RULE_STRING )
            {
            // InternalToscaDsl.g:1538:4: (lv_type_5_0= RULE_STRING )
            // InternalToscaDsl.g:1539:5: lv_type_5_0= RULE_STRING
            {
            lv_type_5_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            					newLeafNode(lv_type_5_0, grammarAccess.getGroupAccess().getTypeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalToscaDsl.g:1555:3: (otherlv_6= ',\\n\"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==13) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalToscaDsl.g:1556:4: otherlv_6= ',\\n\"description\" :' ( (lv_description_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getDescriptionKeyword_6_0());
                    			
                    // InternalToscaDsl.g:1560:4: ( (lv_description_7_0= RULE_STRING ) )
                    // InternalToscaDsl.g:1561:5: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:1561:5: (lv_description_7_0= RULE_STRING )
                    // InternalToscaDsl.g:1562:6: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    						newLeafNode(lv_description_7_0, grammarAccess.getGroupAccess().getDescriptionSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGroupRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:1579:3: (otherlv_8= ',\\n\"targets\" :' otherlv_9= '{' ( (lv_targets_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_targets_12_0= RULE_STRING ) ) )* otherlv_13= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==36) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalToscaDsl.g:1580:4: otherlv_8= ',\\n\"targets\" :' otherlv_9= '{' ( (lv_targets_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_targets_12_0= RULE_STRING ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,36,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getTargetsKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,11,FOLLOW_36); 

                    				newLeafNode(otherlv_9, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalToscaDsl.g:1588:4: ( (lv_targets_10_0= ruleEString ) )
                    // InternalToscaDsl.g:1589:5: (lv_targets_10_0= ruleEString )
                    {
                    // InternalToscaDsl.g:1589:5: (lv_targets_10_0= ruleEString )
                    // InternalToscaDsl.g:1590:6: lv_targets_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGroupAccess().getTargetsEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_targets_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGroupRule());
                    						}
                    						add(
                    							current,
                    							"targets",
                    							lv_targets_10_0,
                    							"org.xtext.example.mydsl.ToscaDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:1607:4: (otherlv_11= ',' ( (lv_targets_12_0= RULE_STRING ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==16) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1608:5: otherlv_11= ',' ( (lv_targets_12_0= RULE_STRING ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getGroupAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalToscaDsl.g:1612:5: ( (lv_targets_12_0= RULE_STRING ) )
                    	    // InternalToscaDsl.g:1613:6: (lv_targets_12_0= RULE_STRING )
                    	    {
                    	    // InternalToscaDsl.g:1613:6: (lv_targets_12_0= RULE_STRING )
                    	    // InternalToscaDsl.g:1614:7: lv_targets_12_0= RULE_STRING
                    	    {
                    	    lv_targets_12_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    	    							newLeafNode(lv_targets_12_0, grammarAccess.getGroupAccess().getTargetsSTRINGTerminalRuleCall_7_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getGroupRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"targets",
                    	    								lv_targets_12_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,19,FOLLOW_37); 

                    				newLeafNode(otherlv_13, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:1636:3: (otherlv_14= ',\\n\"properties\" :' ( (lv_properties_15_0= ruleProperty ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==29) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalToscaDsl.g:1637:4: otherlv_14= ',\\n\"properties\" :' ( (lv_properties_15_0= ruleProperty ) )
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getGroupAccess().getPropertiesKeyword_8_0());
                    			
                    // InternalToscaDsl.g:1641:4: ( (lv_properties_15_0= ruleProperty ) )
                    // InternalToscaDsl.g:1642:5: (lv_properties_15_0= ruleProperty )
                    {
                    // InternalToscaDsl.g:1642:5: (lv_properties_15_0= ruleProperty )
                    // InternalToscaDsl.g:1643:6: lv_properties_15_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getGroupAccess().getPropertiesPropertyParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_properties_15_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGroupRule());
                    						}
                    						set(
                    							current,
                    							"properties",
                    							lv_properties_15_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:1661:3: (otherlv_16= ',\\n\"interfaces\" :' otherlv_17= '{' ( (lv_interfaces_18_0= ruleInterface ) ) (otherlv_19= ',' ( (lv_interfaces_20_0= ruleInterface ) ) )* otherlv_21= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==28) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalToscaDsl.g:1662:4: otherlv_16= ',\\n\"interfaces\" :' otherlv_17= '{' ( (lv_interfaces_18_0= ruleInterface ) ) (otherlv_19= ',' ( (lv_interfaces_20_0= ruleInterface ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,28,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getGroupAccess().getInterfacesKeyword_9_0());
                    			
                    otherlv_17=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalToscaDsl.g:1670:4: ( (lv_interfaces_18_0= ruleInterface ) )
                    // InternalToscaDsl.g:1671:5: (lv_interfaces_18_0= ruleInterface )
                    {
                    // InternalToscaDsl.g:1671:5: (lv_interfaces_18_0= ruleInterface )
                    // InternalToscaDsl.g:1672:6: lv_interfaces_18_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getGroupAccess().getInterfacesInterfaceParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_interfaces_18_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGroupRule());
                    						}
                    						add(
                    							current,
                    							"interfaces",
                    							lv_interfaces_18_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:1689:4: (otherlv_19= ',' ( (lv_interfaces_20_0= ruleInterface ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==16) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1690:5: otherlv_19= ',' ( (lv_interfaces_20_0= ruleInterface ) )
                    	    {
                    	    otherlv_19=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getGroupAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalToscaDsl.g:1694:5: ( (lv_interfaces_20_0= ruleInterface ) )
                    	    // InternalToscaDsl.g:1695:6: (lv_interfaces_20_0= ruleInterface )
                    	    {
                    	    // InternalToscaDsl.g:1695:6: (lv_interfaces_20_0= ruleInterface )
                    	    // InternalToscaDsl.g:1696:7: lv_interfaces_20_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getGroupAccess().getInterfacesInterfaceParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_interfaces_20_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaces",
                    	    								lv_interfaces_20_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_21, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRulePolicy"
    // InternalToscaDsl.g:1727:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // InternalToscaDsl.g:1727:47: (iv_rulePolicy= rulePolicy EOF )
            // InternalToscaDsl.g:1728:2: iv_rulePolicy= rulePolicy EOF
            {
             newCompositeNode(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolicy=rulePolicy();

            state._fsp--;

             current =iv_rulePolicy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // InternalToscaDsl.g:1734:1: rulePolicy returns [EObject current=null] : ( () ( (lv_policy_name_1_0= RULE_STRING ) ) otherlv_2= ':' ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token lv_policy_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:1740:2: ( ( () ( (lv_policy_name_1_0= RULE_STRING ) ) otherlv_2= ':' ) )
            // InternalToscaDsl.g:1741:2: ( () ( (lv_policy_name_1_0= RULE_STRING ) ) otherlv_2= ':' )
            {
            // InternalToscaDsl.g:1741:2: ( () ( (lv_policy_name_1_0= RULE_STRING ) ) otherlv_2= ':' )
            // InternalToscaDsl.g:1742:3: () ( (lv_policy_name_1_0= RULE_STRING ) ) otherlv_2= ':'
            {
            // InternalToscaDsl.g:1742:3: ()
            // InternalToscaDsl.g:1743:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPolicyAccess().getPolicyAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:1749:3: ( (lv_policy_name_1_0= RULE_STRING ) )
            // InternalToscaDsl.g:1750:4: (lv_policy_name_1_0= RULE_STRING )
            {
            // InternalToscaDsl.g:1750:4: (lv_policy_name_1_0= RULE_STRING )
            // InternalToscaDsl.g:1751:5: lv_policy_name_1_0= RULE_STRING
            {
            lv_policy_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_policy_name_1_0, grammarAccess.getPolicyAccess().getPolicy_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPolicyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"policy_name",
            						lv_policy_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPolicyAccess().getColonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleInterface"
    // InternalToscaDsl.g:1775:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalToscaDsl.g:1775:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalToscaDsl.g:1776:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalToscaDsl.g:1782:1: ruleInterface returns [EObject current=null] : ( () ( (lv_type_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\\n\"operations\" :' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_operations_6_0 = null;

        EObject lv_operations_8_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:1788:2: ( ( () ( (lv_type_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\\n\"operations\" :' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalToscaDsl.g:1789:2: ( () ( (lv_type_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\\n\"operations\" :' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalToscaDsl.g:1789:2: ( () ( (lv_type_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\\n\"operations\" :' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalToscaDsl.g:1790:3: () ( (lv_type_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\\n\"operations\" :' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalToscaDsl.g:1790:3: ()
            // InternalToscaDsl.g:1791:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterfaceAccess().getInterfaceAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:1797:3: ( (lv_type_1_0= RULE_STRING ) )
            // InternalToscaDsl.g:1798:4: (lv_type_1_0= RULE_STRING )
            {
            // InternalToscaDsl.g:1798:4: (lv_type_1_0= RULE_STRING )
            // InternalToscaDsl.g:1799:5: lv_type_1_0= RULE_STRING
            {
            lv_type_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_type_1_0, grammarAccess.getInterfaceAccess().getTypeSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterfaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getInterfaceAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalToscaDsl.g:1823:3: (otherlv_4= '\\n\"operations\" :' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )* otherlv_9= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==37) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalToscaDsl.g:1824:4: otherlv_4= '\\n\"operations\" :' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getOperationsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalToscaDsl.g:1832:4: ( (lv_operations_6_0= ruleOperation ) )
                    // InternalToscaDsl.g:1833:5: (lv_operations_6_0= ruleOperation )
                    {
                    // InternalToscaDsl.g:1833:5: (lv_operations_6_0= ruleOperation )
                    // InternalToscaDsl.g:1834:6: lv_operations_6_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getInterfaceAccess().getOperationsOperationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_operations_6_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"operations",
                    							lv_operations_6_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:1851:4: (otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==16) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1852:5: otherlv_7= ',' ( (lv_operations_8_0= ruleOperation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalToscaDsl.g:1856:5: ( (lv_operations_8_0= ruleOperation ) )
                    	    // InternalToscaDsl.g:1857:6: (lv_operations_8_0= ruleOperation )
                    	    {
                    	    // InternalToscaDsl.g:1857:6: (lv_operations_8_0= ruleOperation )
                    	    // InternalToscaDsl.g:1858:7: lv_operations_8_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceAccess().getOperationsOperationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_operations_8_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operations",
                    	    								lv_operations_8_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_9, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleProperty"
    // InternalToscaDsl.g:1889:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalToscaDsl.g:1889:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalToscaDsl.g:1890:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalToscaDsl.g:1896:1: ruleProperty returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_property_name_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_property_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:1902:2: ( ( () otherlv_1= '{' ( (lv_property_name_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // InternalToscaDsl.g:1903:2: ( () otherlv_1= '{' ( (lv_property_name_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // InternalToscaDsl.g:1903:2: ( () otherlv_1= '{' ( (lv_property_name_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // InternalToscaDsl.g:1904:3: () otherlv_1= '{' ( (lv_property_name_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            // InternalToscaDsl.g:1904:3: ()
            // InternalToscaDsl.g:1905:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyAccess().getPropertyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalToscaDsl.g:1915:3: ( (lv_property_name_2_0= RULE_STRING ) )
            // InternalToscaDsl.g:1916:4: (lv_property_name_2_0= RULE_STRING )
            {
            // InternalToscaDsl.g:1916:4: (lv_property_name_2_0= RULE_STRING )
            // InternalToscaDsl.g:1917:5: lv_property_name_2_0= RULE_STRING
            {
            lv_property_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_property_name_2_0, grammarAccess.getPropertyAccess().getProperty_nameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"property_name",
            						lv_property_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getColonKeyword_3());
            		
            // InternalToscaDsl.g:1937:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalToscaDsl.g:1938:4: (lv_value_4_0= RULE_STRING )
            {
            // InternalToscaDsl.g:1938:4: (lv_value_4_0= RULE_STRING )
            // InternalToscaDsl.g:1939:5: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_value_4_0, grammarAccess.getPropertyAccess().getValueSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleAttribute"
    // InternalToscaDsl.g:1963:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalToscaDsl.g:1963:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalToscaDsl.g:1964:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalToscaDsl.g:1970:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_attribute_name_1_0= RULE_STRING ) ) otherlv_2= ':' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_attribute_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:1976:2: ( ( () ( (lv_attribute_name_1_0= RULE_STRING ) ) otherlv_2= ':' ) )
            // InternalToscaDsl.g:1977:2: ( () ( (lv_attribute_name_1_0= RULE_STRING ) ) otherlv_2= ':' )
            {
            // InternalToscaDsl.g:1977:2: ( () ( (lv_attribute_name_1_0= RULE_STRING ) ) otherlv_2= ':' )
            // InternalToscaDsl.g:1978:3: () ( (lv_attribute_name_1_0= RULE_STRING ) ) otherlv_2= ':'
            {
            // InternalToscaDsl.g:1978:3: ()
            // InternalToscaDsl.g:1979:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:1985:3: ( (lv_attribute_name_1_0= RULE_STRING ) )
            // InternalToscaDsl.g:1986:4: (lv_attribute_name_1_0= RULE_STRING )
            {
            // InternalToscaDsl.g:1986:4: (lv_attribute_name_1_0= RULE_STRING )
            // InternalToscaDsl.g:1987:5: lv_attribute_name_1_0= RULE_STRING
            {
            lv_attribute_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_attribute_name_1_0, grammarAccess.getAttributeAccess().getAttribute_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attribute_name",
            						lv_attribute_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRequirement"
    // InternalToscaDsl.g:2011:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalToscaDsl.g:2011:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalToscaDsl.g:2012:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalToscaDsl.g:2018:1: ruleRequirement returns [EObject current=null] : ( ( (lv_requirement_name_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= '\"capabiity\" :' ( (lv_capabiity_4_0= RULE_STRING ) ) (otherlv_5= ',\\n\"node\" :' ( (lv_node_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token lv_requirement_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_capabiity_4_0=null;
        Token otherlv_5=null;
        Token lv_node_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:2024:2: ( ( ( (lv_requirement_name_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= '\"capabiity\" :' ( (lv_capabiity_4_0= RULE_STRING ) ) (otherlv_5= ',\\n\"node\" :' ( (lv_node_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) )
            // InternalToscaDsl.g:2025:2: ( ( (lv_requirement_name_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= '\"capabiity\" :' ( (lv_capabiity_4_0= RULE_STRING ) ) (otherlv_5= ',\\n\"node\" :' ( (lv_node_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            {
            // InternalToscaDsl.g:2025:2: ( ( (lv_requirement_name_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= '\"capabiity\" :' ( (lv_capabiity_4_0= RULE_STRING ) ) (otherlv_5= ',\\n\"node\" :' ( (lv_node_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            // InternalToscaDsl.g:2026:3: ( (lv_requirement_name_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= '\"capabiity\" :' ( (lv_capabiity_4_0= RULE_STRING ) ) (otherlv_5= ',\\n\"node\" :' ( (lv_node_6_0= RULE_STRING ) ) )? otherlv_7= '}'
            {
            // InternalToscaDsl.g:2026:3: ( (lv_requirement_name_0_0= RULE_STRING ) )
            // InternalToscaDsl.g:2027:4: (lv_requirement_name_0_0= RULE_STRING )
            {
            // InternalToscaDsl.g:2027:4: (lv_requirement_name_0_0= RULE_STRING )
            // InternalToscaDsl.g:2028:5: lv_requirement_name_0_0= RULE_STRING
            {
            lv_requirement_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_requirement_name_0_0, grammarAccess.getRequirementAccess().getRequirement_nameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"requirement_name",
            						lv_requirement_name_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getCapabiityKeyword_3());
            		
            // InternalToscaDsl.g:2056:3: ( (lv_capabiity_4_0= RULE_STRING ) )
            // InternalToscaDsl.g:2057:4: (lv_capabiity_4_0= RULE_STRING )
            {
            // InternalToscaDsl.g:2057:4: (lv_capabiity_4_0= RULE_STRING )
            // InternalToscaDsl.g:2058:5: lv_capabiity_4_0= RULE_STRING
            {
            lv_capabiity_4_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

            					newLeafNode(lv_capabiity_4_0, grammarAccess.getRequirementAccess().getCapabiitySTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"capabiity",
            						lv_capabiity_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalToscaDsl.g:2074:3: (otherlv_5= ',\\n\"node\" :' ( (lv_node_6_0= RULE_STRING ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==39) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalToscaDsl.g:2075:4: otherlv_5= ',\\n\"node\" :' ( (lv_node_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getNodeKeyword_5_0());
                    			
                    // InternalToscaDsl.g:2079:4: ( (lv_node_6_0= RULE_STRING ) )
                    // InternalToscaDsl.g:2080:5: (lv_node_6_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:2080:5: (lv_node_6_0= RULE_STRING )
                    // InternalToscaDsl.g:2081:6: lv_node_6_0= RULE_STRING
                    {
                    lv_node_6_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    						newLeafNode(lv_node_6_0, grammarAccess.getRequirementAccess().getNodeSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRequirementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"node",
                    							lv_node_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleCapability"
    // InternalToscaDsl.g:2106:1: entryRuleCapability returns [EObject current=null] : iv_ruleCapability= ruleCapability EOF ;
    public final EObject entryRuleCapability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapability = null;


        try {
            // InternalToscaDsl.g:2106:51: (iv_ruleCapability= ruleCapability EOF )
            // InternalToscaDsl.g:2107:2: iv_ruleCapability= ruleCapability EOF
            {
             newCompositeNode(grammarAccess.getCapabilityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCapability=ruleCapability();

            state._fsp--;

             current =iv_ruleCapability; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCapability"


    // $ANTLR start "ruleCapability"
    // InternalToscaDsl.g:2113:1: ruleCapability returns [EObject current=null] : ( ( (lv_capability_name_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= '\"type\" :' ( (lv_type_4_0= RULE_STRING ) ) (otherlv_5= ',\\n\"description\" :' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= ',\\n\"properties\" :' otherlv_8= '{' ( (lv_properties_9_0= ruleProperty ) ) (otherlv_10= ',' ( (lv_properties_11_0= ruleProperty ) ) )* otherlv_12= '}' )? (otherlv_13= ',\\n\"attributes\" :' otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) ) (otherlv_16= ',' ( (lv_attributes_17_0= ruleAttribute ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
    public final EObject ruleCapability() throws RecognitionException {
        EObject current = null;

        Token lv_capability_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_properties_9_0 = null;

        EObject lv_properties_11_0 = null;

        EObject lv_attributes_15_0 = null;

        EObject lv_attributes_17_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:2119:2: ( ( ( (lv_capability_name_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= '\"type\" :' ( (lv_type_4_0= RULE_STRING ) ) (otherlv_5= ',\\n\"description\" :' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= ',\\n\"properties\" :' otherlv_8= '{' ( (lv_properties_9_0= ruleProperty ) ) (otherlv_10= ',' ( (lv_properties_11_0= ruleProperty ) ) )* otherlv_12= '}' )? (otherlv_13= ',\\n\"attributes\" :' otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) ) (otherlv_16= ',' ( (lv_attributes_17_0= ruleAttribute ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // InternalToscaDsl.g:2120:2: ( ( (lv_capability_name_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= '\"type\" :' ( (lv_type_4_0= RULE_STRING ) ) (otherlv_5= ',\\n\"description\" :' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= ',\\n\"properties\" :' otherlv_8= '{' ( (lv_properties_9_0= ruleProperty ) ) (otherlv_10= ',' ( (lv_properties_11_0= ruleProperty ) ) )* otherlv_12= '}' )? (otherlv_13= ',\\n\"attributes\" :' otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) ) (otherlv_16= ',' ( (lv_attributes_17_0= ruleAttribute ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // InternalToscaDsl.g:2120:2: ( ( (lv_capability_name_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= '\"type\" :' ( (lv_type_4_0= RULE_STRING ) ) (otherlv_5= ',\\n\"description\" :' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= ',\\n\"properties\" :' otherlv_8= '{' ( (lv_properties_9_0= ruleProperty ) ) (otherlv_10= ',' ( (lv_properties_11_0= ruleProperty ) ) )* otherlv_12= '}' )? (otherlv_13= ',\\n\"attributes\" :' otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) ) (otherlv_16= ',' ( (lv_attributes_17_0= ruleAttribute ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // InternalToscaDsl.g:2121:3: ( (lv_capability_name_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= '\"type\" :' ( (lv_type_4_0= RULE_STRING ) ) (otherlv_5= ',\\n\"description\" :' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= ',\\n\"properties\" :' otherlv_8= '{' ( (lv_properties_9_0= ruleProperty ) ) (otherlv_10= ',' ( (lv_properties_11_0= ruleProperty ) ) )* otherlv_12= '}' )? (otherlv_13= ',\\n\"attributes\" :' otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) ) (otherlv_16= ',' ( (lv_attributes_17_0= ruleAttribute ) ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            // InternalToscaDsl.g:2121:3: ( (lv_capability_name_0_0= RULE_STRING ) )
            // InternalToscaDsl.g:2122:4: (lv_capability_name_0_0= RULE_STRING )
            {
            // InternalToscaDsl.g:2122:4: (lv_capability_name_0_0= RULE_STRING )
            // InternalToscaDsl.g:2123:5: lv_capability_name_0_0= RULE_STRING
            {
            lv_capability_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_capability_name_0_0, grammarAccess.getCapabilityAccess().getCapability_nameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCapabilityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"capability_name",
            						lv_capability_name_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getCapabilityAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCapabilityAccess().getTypeKeyword_3());
            		
            // InternalToscaDsl.g:2151:3: ( (lv_type_4_0= RULE_STRING ) )
            // InternalToscaDsl.g:2152:4: (lv_type_4_0= RULE_STRING )
            {
            // InternalToscaDsl.g:2152:4: (lv_type_4_0= RULE_STRING )
            // InternalToscaDsl.g:2153:5: lv_type_4_0= RULE_STRING
            {
            lv_type_4_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            					newLeafNode(lv_type_4_0, grammarAccess.getCapabilityAccess().getTypeSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCapabilityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalToscaDsl.g:2169:3: (otherlv_5= ',\\n\"description\" :' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==13) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalToscaDsl.g:2170:4: otherlv_5= ',\\n\"description\" :' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getCapabilityAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalToscaDsl.g:2174:4: ( (lv_description_6_0= RULE_STRING ) )
                    // InternalToscaDsl.g:2175:5: (lv_description_6_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:2175:5: (lv_description_6_0= RULE_STRING )
                    // InternalToscaDsl.g:2176:6: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

                    						newLeafNode(lv_description_6_0, grammarAccess.getCapabilityAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCapabilityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:2193:3: (otherlv_7= ',\\n\"properties\" :' otherlv_8= '{' ( (lv_properties_9_0= ruleProperty ) ) (otherlv_10= ',' ( (lv_properties_11_0= ruleProperty ) ) )* otherlv_12= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==29) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalToscaDsl.g:2194:4: otherlv_7= ',\\n\"properties\" :' otherlv_8= '{' ( (lv_properties_9_0= ruleProperty ) ) (otherlv_10= ',' ( (lv_properties_11_0= ruleProperty ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getCapabilityAccess().getPropertiesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,11,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalToscaDsl.g:2202:4: ( (lv_properties_9_0= ruleProperty ) )
                    // InternalToscaDsl.g:2203:5: (lv_properties_9_0= ruleProperty )
                    {
                    // InternalToscaDsl.g:2203:5: (lv_properties_9_0= ruleProperty )
                    // InternalToscaDsl.g:2204:6: lv_properties_9_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getCapabilityAccess().getPropertiesPropertyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_properties_9_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCapabilityRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_9_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:2221:4: (otherlv_10= ',' ( (lv_properties_11_0= ruleProperty ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==16) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalToscaDsl.g:2222:5: otherlv_10= ',' ( (lv_properties_11_0= ruleProperty ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getCapabilityAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalToscaDsl.g:2226:5: ( (lv_properties_11_0= ruleProperty ) )
                    	    // InternalToscaDsl.g:2227:6: (lv_properties_11_0= ruleProperty )
                    	    {
                    	    // InternalToscaDsl.g:2227:6: (lv_properties_11_0= ruleProperty )
                    	    // InternalToscaDsl.g:2228:7: lv_properties_11_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getCapabilityAccess().getPropertiesPropertyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_properties_11_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCapabilityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_11_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,19,FOLLOW_44); 

                    				newLeafNode(otherlv_12, grammarAccess.getCapabilityAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:2251:3: (otherlv_13= ',\\n\"attributes\" :' otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) ) (otherlv_16= ',' ( (lv_attributes_17_0= ruleAttribute ) ) )* otherlv_18= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==30) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalToscaDsl.g:2252:4: otherlv_13= ',\\n\"attributes\" :' otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) ) (otherlv_16= ',' ( (lv_attributes_17_0= ruleAttribute ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,30,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getCapabilityAccess().getAttributesKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalToscaDsl.g:2260:4: ( (lv_attributes_15_0= ruleAttribute ) )
                    // InternalToscaDsl.g:2261:5: (lv_attributes_15_0= ruleAttribute )
                    {
                    // InternalToscaDsl.g:2261:5: (lv_attributes_15_0= ruleAttribute )
                    // InternalToscaDsl.g:2262:6: lv_attributes_15_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getCapabilityAccess().getAttributesAttributeParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_attributes_15_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCapabilityRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_15_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:2279:4: (otherlv_16= ',' ( (lv_attributes_17_0= ruleAttribute ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==16) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalToscaDsl.g:2280:5: otherlv_16= ',' ( (lv_attributes_17_0= ruleAttribute ) )
                    	    {
                    	    otherlv_16=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getCapabilityAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalToscaDsl.g:2284:5: ( (lv_attributes_17_0= ruleAttribute ) )
                    	    // InternalToscaDsl.g:2285:6: (lv_attributes_17_0= ruleAttribute )
                    	    {
                    	    // InternalToscaDsl.g:2285:6: (lv_attributes_17_0= ruleAttribute )
                    	    // InternalToscaDsl.g:2286:7: lv_attributes_17_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getCapabilityAccess().getAttributesAttributeParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_attributes_17_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCapabilityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_17_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_18, grammarAccess.getCapabilityAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getCapabilityAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCapability"


    // $ANTLR start "entryRuleOperation"
    // InternalToscaDsl.g:2317:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalToscaDsl.g:2317:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalToscaDsl.g:2318:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalToscaDsl.g:2324:1: ruleOperation returns [EObject current=null] : ( () ( (lv_operation_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_primary_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_operation_name_1_0=null;
        Token otherlv_2=null;
        Token lv_primary_3_0=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:2330:2: ( ( () ( (lv_operation_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_primary_3_0= RULE_STRING ) ) ) )
            // InternalToscaDsl.g:2331:2: ( () ( (lv_operation_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_primary_3_0= RULE_STRING ) ) )
            {
            // InternalToscaDsl.g:2331:2: ( () ( (lv_operation_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_primary_3_0= RULE_STRING ) ) )
            // InternalToscaDsl.g:2332:3: () ( (lv_operation_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_primary_3_0= RULE_STRING ) )
            {
            // InternalToscaDsl.g:2332:3: ()
            // InternalToscaDsl.g:2333:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperationAccess().getOperationAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:2339:3: ( (lv_operation_name_1_0= RULE_STRING ) )
            // InternalToscaDsl.g:2340:4: (lv_operation_name_1_0= RULE_STRING )
            {
            // InternalToscaDsl.g:2340:4: (lv_operation_name_1_0= RULE_STRING )
            // InternalToscaDsl.g:2341:5: lv_operation_name_1_0= RULE_STRING
            {
            lv_operation_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_operation_name_1_0, grammarAccess.getOperationAccess().getOperation_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operation_name",
            						lv_operation_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getColonKeyword_2());
            		
            // InternalToscaDsl.g:2361:3: ( (lv_primary_3_0= RULE_STRING ) )
            // InternalToscaDsl.g:2362:4: (lv_primary_3_0= RULE_STRING )
            {
            // InternalToscaDsl.g:2362:4: (lv_primary_3_0= RULE_STRING )
            // InternalToscaDsl.g:2363:5: lv_primary_3_0= RULE_STRING
            {
            lv_primary_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_primary_3_0, grammarAccess.getOperationAccess().getPrimarySTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"primary",
            						lv_primary_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001FC6000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001FC4000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001E80000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001C80000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001880000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000001F8082000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000001F8080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000001F0080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000001E0080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000001C0080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000180080000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000E70080000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000C70080000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000C60080000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000C40080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000C00080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800080000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001030082000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001030080000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000030080000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000010080000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008000080000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000060082000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000060080000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000040080000L});

}