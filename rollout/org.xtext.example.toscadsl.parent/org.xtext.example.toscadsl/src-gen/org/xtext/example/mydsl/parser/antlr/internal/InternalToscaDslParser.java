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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'\"tosca_definitions_version\" :'", "'\\n, \"imports\" :'", "'['", "','", "']'", "'\\n, \"inputs\" :'", "'}'", "'\\n, \"node_templates\" :'", "'\\n, \"outputs\" :'", "':'", "'\"description\" :'", "'\\n, \"value\" :'", "'  :'", "'\\n, \"type\" :'", "'\\n, \"default\"  :'", "'\"type\" :'", "', \\n \"description\" :'", "', \\n \"interfaces\" :'", "', \\n \"properties\" :'", "', \\n \"attributes\" :'", "', \\n \"requirements\" :'", "', \\n \"relationships\" :'", "', \\n \"instances\" :'", "'Attribute'", "'type'", "'description'", "'value'", "'required'", "'default'", "'status'", "'Requirement'", "'requirement_name'", "'node'", "'capability_Type_name'", "'occurances'", "', \\n \"source\" :'", "', \\n \"target\" :'", "', \\n \"source_interfaces\" :'", "', \\n \"target_interfaces\" :'", "'\"deploy\" :'", "' :'", "'hasOperation'", "'Contained_in'", "'validSource'", "'validTarget'", "'relation_haSourceInterface'", "'relation_hasTargetInterface'", "'Connected_to'", "'-'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
        	return "Service_Template";
       	}

       	@Override
       	protected ToscaDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleService_Template"
    // InternalToscaDsl.g:64:1: entryRuleService_Template returns [EObject current=null] : iv_ruleService_Template= ruleService_Template EOF ;
    public final EObject entryRuleService_Template() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService_Template = null;


        try {
            // InternalToscaDsl.g:64:57: (iv_ruleService_Template= ruleService_Template EOF )
            // InternalToscaDsl.g:65:2: iv_ruleService_Template= ruleService_Template EOF
            {
             newCompositeNode(grammarAccess.getService_TemplateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService_Template=ruleService_Template();

            state._fsp--;

             current =iv_ruleService_Template; 
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
    // $ANTLR end "entryRuleService_Template"


    // $ANTLR start "ruleService_Template"
    // InternalToscaDsl.g:71:1: ruleService_Template returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= '\"tosca_definitions_version\" :' ( (lv_tosca_definitions_version_2_0= RULE_STRING ) ) )? (otherlv_3= '\\n, \"imports\" :' otherlv_4= '[' ( (lv_serviceTemplate_hasImport_5_0= ruleImport ) ) (otherlv_6= ',' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) ) )* otherlv_8= ']' )? (otherlv_9= '\\n, \"inputs\" :' otherlv_10= '{' ( (lv_serviceTemplate_hasInput_11_0= ruleInput ) ) (otherlv_12= ',' ( (lv_serviceTemplate_hasInput_13_0= ruleInput ) ) )* otherlv_14= '}' )? otherlv_15= '\\n, \"node_templates\" :' otherlv_16= '{' ( (lv_service_hasNodeTemplate_17_0= ruleNode_template ) ) (otherlv_18= ',' ( (lv_service_hasNodeTemplate_19_0= ruleNode_template ) ) )* otherlv_20= '}' (otherlv_21= '\\n, \"outputs\" :' otherlv_22= '{' ( (lv_serviceTemplate_hasOutput_23_0= ruleOutput ) ) (otherlv_24= ',' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleService_Template() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tosca_definitions_version_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        EObject lv_serviceTemplate_hasImport_5_0 = null;

        EObject lv_serviceTemplate_hasImport_7_0 = null;

        EObject lv_serviceTemplate_hasInput_11_0 = null;

        EObject lv_serviceTemplate_hasInput_13_0 = null;

        EObject lv_service_hasNodeTemplate_17_0 = null;

        EObject lv_service_hasNodeTemplate_19_0 = null;

        EObject lv_serviceTemplate_hasOutput_23_0 = null;

        EObject lv_serviceTemplate_hasOutput_25_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:77:2: ( (otherlv_0= '{' (otherlv_1= '\"tosca_definitions_version\" :' ( (lv_tosca_definitions_version_2_0= RULE_STRING ) ) )? (otherlv_3= '\\n, \"imports\" :' otherlv_4= '[' ( (lv_serviceTemplate_hasImport_5_0= ruleImport ) ) (otherlv_6= ',' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) ) )* otherlv_8= ']' )? (otherlv_9= '\\n, \"inputs\" :' otherlv_10= '{' ( (lv_serviceTemplate_hasInput_11_0= ruleInput ) ) (otherlv_12= ',' ( (lv_serviceTemplate_hasInput_13_0= ruleInput ) ) )* otherlv_14= '}' )? otherlv_15= '\\n, \"node_templates\" :' otherlv_16= '{' ( (lv_service_hasNodeTemplate_17_0= ruleNode_template ) ) (otherlv_18= ',' ( (lv_service_hasNodeTemplate_19_0= ruleNode_template ) ) )* otherlv_20= '}' (otherlv_21= '\\n, \"outputs\" :' otherlv_22= '{' ( (lv_serviceTemplate_hasOutput_23_0= ruleOutput ) ) (otherlv_24= ',' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // InternalToscaDsl.g:78:2: (otherlv_0= '{' (otherlv_1= '\"tosca_definitions_version\" :' ( (lv_tosca_definitions_version_2_0= RULE_STRING ) ) )? (otherlv_3= '\\n, \"imports\" :' otherlv_4= '[' ( (lv_serviceTemplate_hasImport_5_0= ruleImport ) ) (otherlv_6= ',' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) ) )* otherlv_8= ']' )? (otherlv_9= '\\n, \"inputs\" :' otherlv_10= '{' ( (lv_serviceTemplate_hasInput_11_0= ruleInput ) ) (otherlv_12= ',' ( (lv_serviceTemplate_hasInput_13_0= ruleInput ) ) )* otherlv_14= '}' )? otherlv_15= '\\n, \"node_templates\" :' otherlv_16= '{' ( (lv_service_hasNodeTemplate_17_0= ruleNode_template ) ) (otherlv_18= ',' ( (lv_service_hasNodeTemplate_19_0= ruleNode_template ) ) )* otherlv_20= '}' (otherlv_21= '\\n, \"outputs\" :' otherlv_22= '{' ( (lv_serviceTemplate_hasOutput_23_0= ruleOutput ) ) (otherlv_24= ',' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // InternalToscaDsl.g:78:2: (otherlv_0= '{' (otherlv_1= '\"tosca_definitions_version\" :' ( (lv_tosca_definitions_version_2_0= RULE_STRING ) ) )? (otherlv_3= '\\n, \"imports\" :' otherlv_4= '[' ( (lv_serviceTemplate_hasImport_5_0= ruleImport ) ) (otherlv_6= ',' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) ) )* otherlv_8= ']' )? (otherlv_9= '\\n, \"inputs\" :' otherlv_10= '{' ( (lv_serviceTemplate_hasInput_11_0= ruleInput ) ) (otherlv_12= ',' ( (lv_serviceTemplate_hasInput_13_0= ruleInput ) ) )* otherlv_14= '}' )? otherlv_15= '\\n, \"node_templates\" :' otherlv_16= '{' ( (lv_service_hasNodeTemplate_17_0= ruleNode_template ) ) (otherlv_18= ',' ( (lv_service_hasNodeTemplate_19_0= ruleNode_template ) ) )* otherlv_20= '}' (otherlv_21= '\\n, \"outputs\" :' otherlv_22= '{' ( (lv_serviceTemplate_hasOutput_23_0= ruleOutput ) ) (otherlv_24= ',' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // InternalToscaDsl.g:79:3: otherlv_0= '{' (otherlv_1= '\"tosca_definitions_version\" :' ( (lv_tosca_definitions_version_2_0= RULE_STRING ) ) )? (otherlv_3= '\\n, \"imports\" :' otherlv_4= '[' ( (lv_serviceTemplate_hasImport_5_0= ruleImport ) ) (otherlv_6= ',' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) ) )* otherlv_8= ']' )? (otherlv_9= '\\n, \"inputs\" :' otherlv_10= '{' ( (lv_serviceTemplate_hasInput_11_0= ruleInput ) ) (otherlv_12= ',' ( (lv_serviceTemplate_hasInput_13_0= ruleInput ) ) )* otherlv_14= '}' )? otherlv_15= '\\n, \"node_templates\" :' otherlv_16= '{' ( (lv_service_hasNodeTemplate_17_0= ruleNode_template ) ) (otherlv_18= ',' ( (lv_service_hasNodeTemplate_19_0= ruleNode_template ) ) )* otherlv_20= '}' (otherlv_21= '\\n, \"outputs\" :' otherlv_22= '{' ( (lv_serviceTemplate_hasOutput_23_0= ruleOutput ) ) (otherlv_24= ',' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getService_TemplateAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalToscaDsl.g:83:3: (otherlv_1= '\"tosca_definitions_version\" :' ( (lv_tosca_definitions_version_2_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalToscaDsl.g:84:4: otherlv_1= '\"tosca_definitions_version\" :' ( (lv_tosca_definitions_version_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getService_TemplateAccess().getTosca_definitions_versionKeyword_1_0());
                    			
                    // InternalToscaDsl.g:88:4: ( (lv_tosca_definitions_version_2_0= RULE_STRING ) )
                    // InternalToscaDsl.g:89:5: (lv_tosca_definitions_version_2_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:89:5: (lv_tosca_definitions_version_2_0= RULE_STRING )
                    // InternalToscaDsl.g:90:6: lv_tosca_definitions_version_2_0= RULE_STRING
                    {
                    lv_tosca_definitions_version_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_tosca_definitions_version_2_0, grammarAccess.getService_TemplateAccess().getTosca_definitions_versionSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getService_TemplateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"tosca_definitions_version",
                    							lv_tosca_definitions_version_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:107:3: (otherlv_3= '\\n, \"imports\" :' otherlv_4= '[' ( (lv_serviceTemplate_hasImport_5_0= ruleImport ) ) (otherlv_6= ',' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) ) )* otherlv_8= ']' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalToscaDsl.g:108:4: otherlv_3= '\\n, \"imports\" :' otherlv_4= '[' ( (lv_serviceTemplate_hasImport_5_0= ruleImport ) ) (otherlv_6= ',' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) ) )* otherlv_8= ']'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getService_TemplateAccess().getImportsKeyword_2_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getService_TemplateAccess().getLeftSquareBracketKeyword_2_1());
                    			
                    // InternalToscaDsl.g:116:4: ( (lv_serviceTemplate_hasImport_5_0= ruleImport ) )
                    // InternalToscaDsl.g:117:5: (lv_serviceTemplate_hasImport_5_0= ruleImport )
                    {
                    // InternalToscaDsl.g:117:5: (lv_serviceTemplate_hasImport_5_0= ruleImport )
                    // InternalToscaDsl.g:118:6: lv_serviceTemplate_hasImport_5_0= ruleImport
                    {

                    						newCompositeNode(grammarAccess.getService_TemplateAccess().getServiceTemplate_hasImportImportParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_serviceTemplate_hasImport_5_0=ruleImport();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getService_TemplateRule());
                    						}
                    						add(
                    							current,
                    							"serviceTemplate_hasImport",
                    							lv_serviceTemplate_hasImport_5_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Import");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:135:4: (otherlv_6= ',' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalToscaDsl.g:136:5: otherlv_6= ',' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getService_TemplateAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalToscaDsl.g:140:5: ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) )
                    	    // InternalToscaDsl.g:141:6: (lv_serviceTemplate_hasImport_7_0= ruleImport )
                    	    {
                    	    // InternalToscaDsl.g:141:6: (lv_serviceTemplate_hasImport_7_0= ruleImport )
                    	    // InternalToscaDsl.g:142:7: lv_serviceTemplate_hasImport_7_0= ruleImport
                    	    {

                    	    							newCompositeNode(grammarAccess.getService_TemplateAccess().getServiceTemplate_hasImportImportParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_serviceTemplate_hasImport_7_0=ruleImport();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getService_TemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"serviceTemplate_hasImport",
                    	    								lv_serviceTemplate_hasImport_7_0,
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

                    otherlv_8=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getService_TemplateAccess().getRightSquareBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:165:3: (otherlv_9= '\\n, \"inputs\" :' otherlv_10= '{' ( (lv_serviceTemplate_hasInput_11_0= ruleInput ) ) (otherlv_12= ',' ( (lv_serviceTemplate_hasInput_13_0= ruleInput ) ) )* otherlv_14= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalToscaDsl.g:166:4: otherlv_9= '\\n, \"inputs\" :' otherlv_10= '{' ( (lv_serviceTemplate_hasInput_11_0= ruleInput ) ) (otherlv_12= ',' ( (lv_serviceTemplate_hasInput_13_0= ruleInput ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getService_TemplateAccess().getInputsKeyword_3_0());
                    			
                    otherlv_10=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getService_TemplateAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalToscaDsl.g:174:4: ( (lv_serviceTemplate_hasInput_11_0= ruleInput ) )
                    // InternalToscaDsl.g:175:5: (lv_serviceTemplate_hasInput_11_0= ruleInput )
                    {
                    // InternalToscaDsl.g:175:5: (lv_serviceTemplate_hasInput_11_0= ruleInput )
                    // InternalToscaDsl.g:176:6: lv_serviceTemplate_hasInput_11_0= ruleInput
                    {

                    						newCompositeNode(grammarAccess.getService_TemplateAccess().getServiceTemplate_hasInputInputParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_serviceTemplate_hasInput_11_0=ruleInput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getService_TemplateRule());
                    						}
                    						add(
                    							current,
                    							"serviceTemplate_hasInput",
                    							lv_serviceTemplate_hasInput_11_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Input");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:193:4: (otherlv_12= ',' ( (lv_serviceTemplate_hasInput_13_0= ruleInput ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalToscaDsl.g:194:5: otherlv_12= ',' ( (lv_serviceTemplate_hasInput_13_0= ruleInput ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getService_TemplateAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalToscaDsl.g:198:5: ( (lv_serviceTemplate_hasInput_13_0= ruleInput ) )
                    	    // InternalToscaDsl.g:199:6: (lv_serviceTemplate_hasInput_13_0= ruleInput )
                    	    {
                    	    // InternalToscaDsl.g:199:6: (lv_serviceTemplate_hasInput_13_0= ruleInput )
                    	    // InternalToscaDsl.g:200:7: lv_serviceTemplate_hasInput_13_0= ruleInput
                    	    {

                    	    							newCompositeNode(grammarAccess.getService_TemplateAccess().getServiceTemplate_hasInputInputParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_serviceTemplate_hasInput_13_0=ruleInput();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getService_TemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"serviceTemplate_hasInput",
                    	    								lv_serviceTemplate_hasInput_13_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Input");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getService_TemplateAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_15, grammarAccess.getService_TemplateAccess().getNode_templatesKeyword_4());
            		
            otherlv_16=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_16, grammarAccess.getService_TemplateAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalToscaDsl.g:231:3: ( (lv_service_hasNodeTemplate_17_0= ruleNode_template ) )
            // InternalToscaDsl.g:232:4: (lv_service_hasNodeTemplate_17_0= ruleNode_template )
            {
            // InternalToscaDsl.g:232:4: (lv_service_hasNodeTemplate_17_0= ruleNode_template )
            // InternalToscaDsl.g:233:5: lv_service_hasNodeTemplate_17_0= ruleNode_template
            {

            					newCompositeNode(grammarAccess.getService_TemplateAccess().getService_hasNodeTemplateNode_templateParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_service_hasNodeTemplate_17_0=ruleNode_template();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getService_TemplateRule());
            					}
            					add(
            						current,
            						"service_hasNodeTemplate",
            						lv_service_hasNodeTemplate_17_0,
            						"org.xtext.example.mydsl.ToscaDsl.Node_template");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalToscaDsl.g:250:3: (otherlv_18= ',' ( (lv_service_hasNodeTemplate_19_0= ruleNode_template ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalToscaDsl.g:251:4: otherlv_18= ',' ( (lv_service_hasNodeTemplate_19_0= ruleNode_template ) )
            	    {
            	    otherlv_18=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_18, grammarAccess.getService_TemplateAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalToscaDsl.g:255:4: ( (lv_service_hasNodeTemplate_19_0= ruleNode_template ) )
            	    // InternalToscaDsl.g:256:5: (lv_service_hasNodeTemplate_19_0= ruleNode_template )
            	    {
            	    // InternalToscaDsl.g:256:5: (lv_service_hasNodeTemplate_19_0= ruleNode_template )
            	    // InternalToscaDsl.g:257:6: lv_service_hasNodeTemplate_19_0= ruleNode_template
            	    {

            	    						newCompositeNode(grammarAccess.getService_TemplateAccess().getService_hasNodeTemplateNode_templateParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_service_hasNodeTemplate_19_0=ruleNode_template();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getService_TemplateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"service_hasNodeTemplate",
            	    							lv_service_hasNodeTemplate_19_0,
            	    							"org.xtext.example.mydsl.ToscaDsl.Node_template");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_20=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_20, grammarAccess.getService_TemplateAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalToscaDsl.g:279:3: (otherlv_21= '\\n, \"outputs\" :' otherlv_22= '{' ( (lv_serviceTemplate_hasOutput_23_0= ruleOutput ) ) (otherlv_24= ',' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) ) )* otherlv_26= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalToscaDsl.g:280:4: otherlv_21= '\\n, \"outputs\" :' otherlv_22= '{' ( (lv_serviceTemplate_hasOutput_23_0= ruleOutput ) ) (otherlv_24= ',' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_21, grammarAccess.getService_TemplateAccess().getOutputsKeyword_9_0());
                    			
                    otherlv_22=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getService_TemplateAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalToscaDsl.g:288:4: ( (lv_serviceTemplate_hasOutput_23_0= ruleOutput ) )
                    // InternalToscaDsl.g:289:5: (lv_serviceTemplate_hasOutput_23_0= ruleOutput )
                    {
                    // InternalToscaDsl.g:289:5: (lv_serviceTemplate_hasOutput_23_0= ruleOutput )
                    // InternalToscaDsl.g:290:6: lv_serviceTemplate_hasOutput_23_0= ruleOutput
                    {

                    						newCompositeNode(grammarAccess.getService_TemplateAccess().getServiceTemplate_hasOutputOutputParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_serviceTemplate_hasOutput_23_0=ruleOutput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getService_TemplateRule());
                    						}
                    						add(
                    							current,
                    							"serviceTemplate_hasOutput",
                    							lv_serviceTemplate_hasOutput_23_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Output");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:307:4: (otherlv_24= ',' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalToscaDsl.g:308:5: otherlv_24= ',' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) )
                    	    {
                    	    otherlv_24=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getService_TemplateAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalToscaDsl.g:312:5: ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) )
                    	    // InternalToscaDsl.g:313:6: (lv_serviceTemplate_hasOutput_25_0= ruleOutput )
                    	    {
                    	    // InternalToscaDsl.g:313:6: (lv_serviceTemplate_hasOutput_25_0= ruleOutput )
                    	    // InternalToscaDsl.g:314:7: lv_serviceTemplate_hasOutput_25_0= ruleOutput
                    	    {

                    	    							newCompositeNode(grammarAccess.getService_TemplateAccess().getServiceTemplate_hasOutputOutputParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_serviceTemplate_hasOutput_25_0=ruleOutput();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getService_TemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"serviceTemplate_hasOutput",
                    	    								lv_serviceTemplate_hasOutput_25_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Output");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_26, grammarAccess.getService_TemplateAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getService_TemplateAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleService_Template"


    // $ANTLR start "entryRuleInterface"
    // InternalToscaDsl.g:345:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalToscaDsl.g:345:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalToscaDsl.g:346:2: iv_ruleInterface= ruleInterface EOF
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
    // InternalToscaDsl.g:352:1: ruleInterface returns [EObject current=null] : (this_Interface_Impl_0= ruleInterface_Impl | this_Source_interface_1= ruleSource_interface | this_Target_interface_2= ruleTarget_interface ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        EObject this_Interface_Impl_0 = null;

        EObject this_Source_interface_1 = null;

        EObject this_Target_interface_2 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:358:2: ( (this_Interface_Impl_0= ruleInterface_Impl | this_Source_interface_1= ruleSource_interface | this_Target_interface_2= ruleTarget_interface ) )
            // InternalToscaDsl.g:359:2: (this_Interface_Impl_0= ruleInterface_Impl | this_Source_interface_1= ruleSource_interface | this_Target_interface_2= ruleTarget_interface )
            {
            // InternalToscaDsl.g:359:2: (this_Interface_Impl_0= ruleInterface_Impl | this_Source_interface_1= ruleSource_interface | this_Target_interface_2= ruleTarget_interface )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                switch ( input.LA(2) ) {
                case 21:
                    {
                    alt9=1;
                    }
                    break;
                case 24:
                    {
                    alt9=3;
                    }
                    break;
                case 52:
                    {
                    alt9=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalToscaDsl.g:360:3: this_Interface_Impl_0= ruleInterface_Impl
                    {

                    			newCompositeNode(grammarAccess.getInterfaceAccess().getInterface_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interface_Impl_0=ruleInterface_Impl();

                    state._fsp--;


                    			current = this_Interface_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalToscaDsl.g:369:3: this_Source_interface_1= ruleSource_interface
                    {

                    			newCompositeNode(grammarAccess.getInterfaceAccess().getSource_interfaceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Source_interface_1=ruleSource_interface();

                    state._fsp--;


                    			current = this_Source_interface_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalToscaDsl.g:378:3: this_Target_interface_2= ruleTarget_interface
                    {

                    			newCompositeNode(grammarAccess.getInterfaceAccess().getTarget_interfaceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Target_interface_2=ruleTarget_interface();

                    state._fsp--;


                    			current = this_Target_interface_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleRelationship"
    // InternalToscaDsl.g:390:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalToscaDsl.g:390:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalToscaDsl.g:391:2: iv_ruleRelationship= ruleRelationship EOF
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
    // InternalToscaDsl.g:397:1: ruleRelationship returns [EObject current=null] : (this_Relationship_Impl_0= ruleRelationship_Impl | this_Contained_in_1= ruleContained_in | this_Connected_to_2= ruleConnected_to ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_Relationship_Impl_0 = null;

        EObject this_Contained_in_1 = null;

        EObject this_Connected_to_2 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:403:2: ( (this_Relationship_Impl_0= ruleRelationship_Impl | this_Contained_in_1= ruleContained_in | this_Connected_to_2= ruleConnected_to ) )
            // InternalToscaDsl.g:404:2: (this_Relationship_Impl_0= ruleRelationship_Impl | this_Contained_in_1= ruleContained_in | this_Connected_to_2= ruleConnected_to )
            {
            // InternalToscaDsl.g:404:2: (this_Relationship_Impl_0= ruleRelationship_Impl | this_Contained_in_1= ruleContained_in | this_Connected_to_2= ruleConnected_to )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt10=1;
                }
                break;
            case 54:
                {
                alt10=2;
                }
                break;
            case 59:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalToscaDsl.g:405:3: this_Relationship_Impl_0= ruleRelationship_Impl
                    {

                    			newCompositeNode(grammarAccess.getRelationshipAccess().getRelationship_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Relationship_Impl_0=ruleRelationship_Impl();

                    state._fsp--;


                    			current = this_Relationship_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalToscaDsl.g:414:3: this_Contained_in_1= ruleContained_in
                    {

                    			newCompositeNode(grammarAccess.getRelationshipAccess().getContained_inParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Contained_in_1=ruleContained_in();

                    state._fsp--;


                    			current = this_Contained_in_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalToscaDsl.g:423:3: this_Connected_to_2= ruleConnected_to
                    {

                    			newCompositeNode(grammarAccess.getRelationshipAccess().getConnected_toParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Connected_to_2=ruleConnected_to();

                    state._fsp--;


                    			current = this_Connected_to_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleImport"
    // InternalToscaDsl.g:435:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalToscaDsl.g:435:47: (iv_ruleImport= ruleImport EOF )
            // InternalToscaDsl.g:436:2: iv_ruleImport= ruleImport EOF
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
    // InternalToscaDsl.g:442:1: ruleImport returns [EObject current=null] : ( () ( (lv_file_1_0= RULE_STRING ) )? ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_file_1_0=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:448:2: ( ( () ( (lv_file_1_0= RULE_STRING ) )? ) )
            // InternalToscaDsl.g:449:2: ( () ( (lv_file_1_0= RULE_STRING ) )? )
            {
            // InternalToscaDsl.g:449:2: ( () ( (lv_file_1_0= RULE_STRING ) )? )
            // InternalToscaDsl.g:450:3: () ( (lv_file_1_0= RULE_STRING ) )?
            {
            // InternalToscaDsl.g:450:3: ()
            // InternalToscaDsl.g:451:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImportAccess().getImportAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:457:3: ( (lv_file_1_0= RULE_STRING ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalToscaDsl.g:458:4: (lv_file_1_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:458:4: (lv_file_1_0= RULE_STRING )
                    // InternalToscaDsl.g:459:5: lv_file_1_0= RULE_STRING
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


    // $ANTLR start "entryRuleOutput"
    // InternalToscaDsl.g:479:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalToscaDsl.g:479:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalToscaDsl.g:480:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalToscaDsl.g:486:1: ruleOutput returns [EObject current=null] : ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"description\" :' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= '\\n, \"value\" :' ( (lv_value_7_0= RULE_STRING ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_parameter_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:492:2: ( ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"description\" :' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= '\\n, \"value\" :' ( (lv_value_7_0= RULE_STRING ) ) )? otherlv_8= '}' ) )
            // InternalToscaDsl.g:493:2: ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"description\" :' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= '\\n, \"value\" :' ( (lv_value_7_0= RULE_STRING ) ) )? otherlv_8= '}' )
            {
            // InternalToscaDsl.g:493:2: ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"description\" :' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= '\\n, \"value\" :' ( (lv_value_7_0= RULE_STRING ) ) )? otherlv_8= '}' )
            // InternalToscaDsl.g:494:3: () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"description\" :' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= '\\n, \"value\" :' ( (lv_value_7_0= RULE_STRING ) ) )? otherlv_8= '}'
            {
            // InternalToscaDsl.g:494:3: ()
            // InternalToscaDsl.g:495:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutputAccess().getOutputAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:501:3: ( (lv_parameter_name_1_0= RULE_STRING ) )
            // InternalToscaDsl.g:502:4: (lv_parameter_name_1_0= RULE_STRING )
            {
            // InternalToscaDsl.g:502:4: (lv_parameter_name_1_0= RULE_STRING )
            // InternalToscaDsl.g:503:5: lv_parameter_name_1_0= RULE_STRING
            {
            lv_parameter_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_parameter_name_1_0, grammarAccess.getOutputAccess().getParameter_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"parameter_name",
            						lv_parameter_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getOutputAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalToscaDsl.g:527:3: (otherlv_4= '\"description\" :' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalToscaDsl.g:528:4: otherlv_4= '\"description\" :' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getOutputAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalToscaDsl.g:532:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalToscaDsl.g:533:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:533:5: (lv_description_5_0= RULE_STRING )
                    // InternalToscaDsl.g:534:6: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_description_5_0, grammarAccess.getOutputAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:551:3: (otherlv_6= '\\n, \"value\" :' ( (lv_value_7_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalToscaDsl.g:552:4: otherlv_6= '\\n, \"value\" :' ( (lv_value_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getOutputAccess().getValueKeyword_5_0());
                    			
                    // InternalToscaDsl.g:556:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalToscaDsl.g:557:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:557:5: (lv_value_7_0= RULE_STRING )
                    // InternalToscaDsl.g:558:6: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    						newLeafNode(lv_value_7_0, grammarAccess.getOutputAccess().getValueSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleInput"
    // InternalToscaDsl.g:583:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalToscaDsl.g:583:46: (iv_ruleInput= ruleInput EOF )
            // InternalToscaDsl.g:584:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalToscaDsl.g:590:1: ruleInput returns [EObject current=null] : ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' (otherlv_4= '\"description\" :' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= '\\n, \"type\" :' ( (lv_type_7_0= RULE_STRING ) ) )? (otherlv_8= '\\n, \"default\" :' ( (lv_default_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_parameter_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token lv_type_7_0=null;
        Token otherlv_8=null;
        Token lv_default_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:596:2: ( ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' (otherlv_4= '\"description\" :' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= '\\n, \"type\" :' ( (lv_type_7_0= RULE_STRING ) ) )? (otherlv_8= '\\n, \"default\" :' ( (lv_default_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) )
            // InternalToscaDsl.g:597:2: ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' (otherlv_4= '\"description\" :' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= '\\n, \"type\" :' ( (lv_type_7_0= RULE_STRING ) ) )? (otherlv_8= '\\n, \"default\" :' ( (lv_default_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            {
            // InternalToscaDsl.g:597:2: ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' (otherlv_4= '\"description\" :' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= '\\n, \"type\" :' ( (lv_type_7_0= RULE_STRING ) ) )? (otherlv_8= '\\n, \"default\" :' ( (lv_default_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            // InternalToscaDsl.g:598:3: () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' (otherlv_4= '\"description\" :' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= '\\n, \"type\" :' ( (lv_type_7_0= RULE_STRING ) ) )? (otherlv_8= '\\n, \"default\" :' ( (lv_default_9_0= RULE_STRING ) ) )? otherlv_10= '}'
            {
            // InternalToscaDsl.g:598:3: ()
            // InternalToscaDsl.g:599:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputAccess().getInputAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:605:3: ( (lv_parameter_name_1_0= RULE_STRING ) )
            // InternalToscaDsl.g:606:4: (lv_parameter_name_1_0= RULE_STRING )
            {
            // InternalToscaDsl.g:606:4: (lv_parameter_name_1_0= RULE_STRING )
            // InternalToscaDsl.g:607:5: lv_parameter_name_1_0= RULE_STRING
            {
            lv_parameter_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_parameter_name_1_0, grammarAccess.getInputAccess().getParameter_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"parameter_name",
            						lv_parameter_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getInputAccess().getSpaceSpaceColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalToscaDsl.g:631:3: (otherlv_4= '\"description\" :' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalToscaDsl.g:632:4: otherlv_4= '\"description\" :' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getInputAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalToscaDsl.g:636:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalToscaDsl.g:637:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:637:5: (lv_description_5_0= RULE_STRING )
                    // InternalToscaDsl.g:638:6: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

                    						newLeafNode(lv_description_5_0, grammarAccess.getInputAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:655:3: (otherlv_6= '\\n, \"type\" :' ( (lv_type_7_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalToscaDsl.g:656:4: otherlv_6= '\\n, \"type\" :' ( (lv_type_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getInputAccess().getTypeKeyword_5_0());
                    			
                    // InternalToscaDsl.g:660:4: ( (lv_type_7_0= RULE_STRING ) )
                    // InternalToscaDsl.g:661:5: (lv_type_7_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:661:5: (lv_type_7_0= RULE_STRING )
                    // InternalToscaDsl.g:662:6: lv_type_7_0= RULE_STRING
                    {
                    lv_type_7_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_type_7_0, grammarAccess.getInputAccess().getTypeSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"type",
                    							lv_type_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:679:3: (otherlv_8= '\\n, \"default\" :' ( (lv_default_9_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalToscaDsl.g:680:4: otherlv_8= '\\n, \"default\" :' ( (lv_default_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getInputAccess().getDefaultKeyword_6_0());
                    			
                    // InternalToscaDsl.g:684:4: ( (lv_default_9_0= RULE_STRING ) )
                    // InternalToscaDsl.g:685:5: (lv_default_9_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:685:5: (lv_default_9_0= RULE_STRING )
                    // InternalToscaDsl.g:686:6: lv_default_9_0= RULE_STRING
                    {
                    lv_default_9_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    						newLeafNode(lv_default_9_0, grammarAccess.getInputAccess().getDefaultSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"default",
                    							lv_default_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getInputAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleNode_template"
    // InternalToscaDsl.g:711:1: entryRuleNode_template returns [EObject current=null] : iv_ruleNode_template= ruleNode_template EOF ;
    public final EObject entryRuleNode_template() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode_template = null;


        try {
            // InternalToscaDsl.g:711:54: (iv_ruleNode_template= ruleNode_template EOF )
            // InternalToscaDsl.g:712:2: iv_ruleNode_template= ruleNode_template EOF
            {
             newCompositeNode(grammarAccess.getNode_templateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode_template=ruleNode_template();

            state._fsp--;

             current =iv_ruleNode_template; 
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
    // $ANTLR end "entryRuleNode_template"


    // $ANTLR start "ruleNode_template"
    // InternalToscaDsl.g:718:1: ruleNode_template returns [EObject current=null] : ( () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"interfaces\" :' otherlv_9= '{' ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) ) (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"properties\" :' otherlv_15= '{' ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= ', \\n \"attributes\" :' otherlv_21= '{' ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) ) (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )* otherlv_25= '}' )? (otherlv_26= ', \\n \"requirements\" :' otherlv_27= '{' ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) ) (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )* otherlv_31= '}' )? (otherlv_32= ', \\n \"relationships\" :' otherlv_33= '[' ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) ) (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )* otherlv_37= ']' )? (otherlv_38= ', \\n \"instances\" :' otherlv_39= '{' ( (lv_nodeTemplate_hasInstances_40_0= ruleinstance ) ) otherlv_41= '}' )? otherlv_42= '}' ) ;
    public final EObject ruleNode_template() throws RecognitionException {
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
        Token otherlv_42=null;
        EObject lv_nodeTemplate_hasInterface_10_0 = null;

        EObject lv_nodeTemplate_hasInterface_12_0 = null;

        EObject lv_nodeTemplate_hasProperty_16_0 = null;

        EObject lv_nodeTemplate_hasProperty_18_0 = null;

        EObject lv_nodeTemplate_hasAttribute_22_0 = null;

        EObject lv_nodeTemplate_hasAttribute_24_0 = null;

        EObject lv_nodeTemplate_hasRequirement_28_0 = null;

        EObject lv_nodeTemplate_hasRequirement_30_0 = null;

        EObject lv_NodeTemplate_hasRelationship_34_0 = null;

        EObject lv_NodeTemplate_hasRelationship_36_0 = null;

        EObject lv_nodeTemplate_hasInstances_40_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:724:2: ( ( () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"interfaces\" :' otherlv_9= '{' ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) ) (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"properties\" :' otherlv_15= '{' ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= ', \\n \"attributes\" :' otherlv_21= '{' ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) ) (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )* otherlv_25= '}' )? (otherlv_26= ', \\n \"requirements\" :' otherlv_27= '{' ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) ) (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )* otherlv_31= '}' )? (otherlv_32= ', \\n \"relationships\" :' otherlv_33= '[' ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) ) (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )* otherlv_37= ']' )? (otherlv_38= ', \\n \"instances\" :' otherlv_39= '{' ( (lv_nodeTemplate_hasInstances_40_0= ruleinstance ) ) otherlv_41= '}' )? otherlv_42= '}' ) )
            // InternalToscaDsl.g:725:2: ( () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"interfaces\" :' otherlv_9= '{' ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) ) (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"properties\" :' otherlv_15= '{' ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= ', \\n \"attributes\" :' otherlv_21= '{' ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) ) (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )* otherlv_25= '}' )? (otherlv_26= ', \\n \"requirements\" :' otherlv_27= '{' ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) ) (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )* otherlv_31= '}' )? (otherlv_32= ', \\n \"relationships\" :' otherlv_33= '[' ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) ) (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )* otherlv_37= ']' )? (otherlv_38= ', \\n \"instances\" :' otherlv_39= '{' ( (lv_nodeTemplate_hasInstances_40_0= ruleinstance ) ) otherlv_41= '}' )? otherlv_42= '}' )
            {
            // InternalToscaDsl.g:725:2: ( () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"interfaces\" :' otherlv_9= '{' ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) ) (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"properties\" :' otherlv_15= '{' ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= ', \\n \"attributes\" :' otherlv_21= '{' ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) ) (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )* otherlv_25= '}' )? (otherlv_26= ', \\n \"requirements\" :' otherlv_27= '{' ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) ) (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )* otherlv_31= '}' )? (otherlv_32= ', \\n \"relationships\" :' otherlv_33= '[' ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) ) (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )* otherlv_37= ']' )? (otherlv_38= ', \\n \"instances\" :' otherlv_39= '{' ( (lv_nodeTemplate_hasInstances_40_0= ruleinstance ) ) otherlv_41= '}' )? otherlv_42= '}' )
            // InternalToscaDsl.g:726:3: () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"interfaces\" :' otherlv_9= '{' ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) ) (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"properties\" :' otherlv_15= '{' ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= ', \\n \"attributes\" :' otherlv_21= '{' ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) ) (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )* otherlv_25= '}' )? (otherlv_26= ', \\n \"requirements\" :' otherlv_27= '{' ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) ) (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )* otherlv_31= '}' )? (otherlv_32= ', \\n \"relationships\" :' otherlv_33= '[' ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) ) (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )* otherlv_37= ']' )? (otherlv_38= ', \\n \"instances\" :' otherlv_39= '{' ( (lv_nodeTemplate_hasInstances_40_0= ruleinstance ) ) otherlv_41= '}' )? otherlv_42= '}'
            {
            // InternalToscaDsl.g:726:3: ()
            // InternalToscaDsl.g:727:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNode_templateAccess().getNode_templateAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:733:3: ( (lv_node_template_name_1_0= RULE_STRING ) )
            // InternalToscaDsl.g:734:4: (lv_node_template_name_1_0= RULE_STRING )
            {
            // InternalToscaDsl.g:734:4: (lv_node_template_name_1_0= RULE_STRING )
            // InternalToscaDsl.g:735:5: lv_node_template_name_1_0= RULE_STRING
            {
            lv_node_template_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_node_template_name_1_0, grammarAccess.getNode_templateAccess().getNode_template_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNode_templateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"node_template_name",
            						lv_node_template_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getNode_templateAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getNode_templateAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalToscaDsl.g:759:3: (otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalToscaDsl.g:760:4: otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getNode_templateAccess().getTypeKeyword_4_0());
                    			
                    // InternalToscaDsl.g:764:4: ( (lv_type_5_0= RULE_STRING ) )
                    // InternalToscaDsl.g:765:5: (lv_type_5_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:765:5: (lv_type_5_0= RULE_STRING )
                    // InternalToscaDsl.g:766:6: lv_type_5_0= RULE_STRING
                    {
                    lv_type_5_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    						newLeafNode(lv_type_5_0, grammarAccess.getNode_templateAccess().getTypeSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNode_templateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:783:3: (otherlv_6= ', \\n \"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalToscaDsl.g:784:4: otherlv_6= ', \\n \"description\" :' ( (lv_description_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getNode_templateAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalToscaDsl.g:788:4: ( (lv_description_7_0= RULE_STRING ) )
                    // InternalToscaDsl.g:789:5: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:789:5: (lv_description_7_0= RULE_STRING )
                    // InternalToscaDsl.g:790:6: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

                    						newLeafNode(lv_description_7_0, grammarAccess.getNode_templateAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNode_templateRule());
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

            // InternalToscaDsl.g:807:3: (otherlv_8= ', \\n \"interfaces\" :' otherlv_9= '{' ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) ) (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )* otherlv_13= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalToscaDsl.g:808:4: otherlv_8= ', \\n \"interfaces\" :' otherlv_9= '{' ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) ) (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getNode_templateAccess().getInterfacesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getNode_templateAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalToscaDsl.g:816:4: ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) )
                    // InternalToscaDsl.g:817:5: (lv_nodeTemplate_hasInterface_10_0= ruleInterface )
                    {
                    // InternalToscaDsl.g:817:5: (lv_nodeTemplate_hasInterface_10_0= ruleInterface )
                    // InternalToscaDsl.g:818:6: lv_nodeTemplate_hasInterface_10_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasInterfaceInterfaceParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_nodeTemplate_hasInterface_10_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    						}
                    						add(
                    							current,
                    							"nodeTemplate_hasInterface",
                    							lv_nodeTemplate_hasInterface_10_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:835:4: (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==15) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalToscaDsl.g:836:5: otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getNode_templateAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalToscaDsl.g:840:5: ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) )
                    	    // InternalToscaDsl.g:841:6: (lv_nodeTemplate_hasInterface_12_0= ruleInterface )
                    	    {
                    	    // InternalToscaDsl.g:841:6: (lv_nodeTemplate_hasInterface_12_0= ruleInterface )
                    	    // InternalToscaDsl.g:842:7: lv_nodeTemplate_hasInterface_12_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasInterfaceInterfaceParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_nodeTemplate_hasInterface_12_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodeTemplate_hasInterface",
                    	    								lv_nodeTemplate_hasInterface_12_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FOLLOW_25); 

                    				newLeafNode(otherlv_13, grammarAccess.getNode_templateAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:865:3: (otherlv_14= ', \\n \"properties\" :' otherlv_15= '{' ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )* otherlv_19= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalToscaDsl.g:866:4: otherlv_14= ', \\n \"properties\" :' otherlv_15= '{' ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,30,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getNode_templateAccess().getPropertiesKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getNode_templateAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalToscaDsl.g:874:4: ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) )
                    // InternalToscaDsl.g:875:5: (lv_nodeTemplate_hasProperty_16_0= ruleProperty )
                    {
                    // InternalToscaDsl.g:875:5: (lv_nodeTemplate_hasProperty_16_0= ruleProperty )
                    // InternalToscaDsl.g:876:6: lv_nodeTemplate_hasProperty_16_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasPropertyPropertyParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_nodeTemplate_hasProperty_16_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    						}
                    						add(
                    							current,
                    							"nodeTemplate_hasProperty",
                    							lv_nodeTemplate_hasProperty_16_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:893:4: (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==15) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalToscaDsl.g:894:5: otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) )
                    	    {
                    	    otherlv_17=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getNode_templateAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalToscaDsl.g:898:5: ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) )
                    	    // InternalToscaDsl.g:899:6: (lv_nodeTemplate_hasProperty_18_0= ruleProperty )
                    	    {
                    	    // InternalToscaDsl.g:899:6: (lv_nodeTemplate_hasProperty_18_0= ruleProperty )
                    	    // InternalToscaDsl.g:900:7: lv_nodeTemplate_hasProperty_18_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasPropertyPropertyParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_nodeTemplate_hasProperty_18_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodeTemplate_hasProperty",
                    	    								lv_nodeTemplate_hasProperty_18_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,18,FOLLOW_26); 

                    				newLeafNode(otherlv_19, grammarAccess.getNode_templateAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:923:3: (otherlv_20= ', \\n \"attributes\" :' otherlv_21= '{' ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) ) (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )* otherlv_25= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalToscaDsl.g:924:4: otherlv_20= ', \\n \"attributes\" :' otherlv_21= '{' ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) ) (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,31,FOLLOW_10); 

                    				newLeafNode(otherlv_20, grammarAccess.getNode_templateAccess().getAttributesKeyword_8_0());
                    			
                    otherlv_21=(Token)match(input,11,FOLLOW_27); 

                    				newLeafNode(otherlv_21, grammarAccess.getNode_templateAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalToscaDsl.g:932:4: ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) )
                    // InternalToscaDsl.g:933:5: (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute )
                    {
                    // InternalToscaDsl.g:933:5: (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute )
                    // InternalToscaDsl.g:934:6: lv_nodeTemplate_hasAttribute_22_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasAttributeAttributeParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_nodeTemplate_hasAttribute_22_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    						}
                    						add(
                    							current,
                    							"nodeTemplate_hasAttribute",
                    							lv_nodeTemplate_hasAttribute_22_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:951:4: (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==15) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalToscaDsl.g:952:5: otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) )
                    	    {
                    	    otherlv_23=(Token)match(input,15,FOLLOW_27); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getNode_templateAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalToscaDsl.g:956:5: ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) )
                    	    // InternalToscaDsl.g:957:6: (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute )
                    	    {
                    	    // InternalToscaDsl.g:957:6: (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute )
                    	    // InternalToscaDsl.g:958:7: lv_nodeTemplate_hasAttribute_24_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasAttributeAttributeParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_nodeTemplate_hasAttribute_24_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodeTemplate_hasAttribute",
                    	    								lv_nodeTemplate_hasAttribute_24_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,18,FOLLOW_28); 

                    				newLeafNode(otherlv_25, grammarAccess.getNode_templateAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:981:3: (otherlv_26= ', \\n \"requirements\" :' otherlv_27= '{' ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) ) (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )* otherlv_31= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalToscaDsl.g:982:4: otherlv_26= ', \\n \"requirements\" :' otherlv_27= '{' ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) ) (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )* otherlv_31= '}'
                    {
                    otherlv_26=(Token)match(input,32,FOLLOW_10); 

                    				newLeafNode(otherlv_26, grammarAccess.getNode_templateAccess().getRequirementsKeyword_9_0());
                    			
                    otherlv_27=(Token)match(input,11,FOLLOW_29); 

                    				newLeafNode(otherlv_27, grammarAccess.getNode_templateAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalToscaDsl.g:990:4: ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) )
                    // InternalToscaDsl.g:991:5: (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement )
                    {
                    // InternalToscaDsl.g:991:5: (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement )
                    // InternalToscaDsl.g:992:6: lv_nodeTemplate_hasRequirement_28_0= ruleRequirement
                    {

                    						newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasRequirementRequirementParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_nodeTemplate_hasRequirement_28_0=ruleRequirement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    						}
                    						add(
                    							current,
                    							"nodeTemplate_hasRequirement",
                    							lv_nodeTemplate_hasRequirement_28_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Requirement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:1009:4: (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==15) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1010:5: otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) )
                    	    {
                    	    otherlv_29=(Token)match(input,15,FOLLOW_29); 

                    	    					newLeafNode(otherlv_29, grammarAccess.getNode_templateAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalToscaDsl.g:1014:5: ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) )
                    	    // InternalToscaDsl.g:1015:6: (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement )
                    	    {
                    	    // InternalToscaDsl.g:1015:6: (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement )
                    	    // InternalToscaDsl.g:1016:7: lv_nodeTemplate_hasRequirement_30_0= ruleRequirement
                    	    {

                    	    							newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasRequirementRequirementParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_nodeTemplate_hasRequirement_30_0=ruleRequirement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodeTemplate_hasRequirement",
                    	    								lv_nodeTemplate_hasRequirement_30_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Requirement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,18,FOLLOW_30); 

                    				newLeafNode(otherlv_31, grammarAccess.getNode_templateAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:1039:3: (otherlv_32= ', \\n \"relationships\" :' otherlv_33= '[' ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) ) (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )* otherlv_37= ']' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalToscaDsl.g:1040:4: otherlv_32= ', \\n \"relationships\" :' otherlv_33= '[' ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) ) (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )* otherlv_37= ']'
                    {
                    otherlv_32=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_32, grammarAccess.getNode_templateAccess().getRelationshipsKeyword_10_0());
                    			
                    otherlv_33=(Token)match(input,14,FOLLOW_31); 

                    				newLeafNode(otherlv_33, grammarAccess.getNode_templateAccess().getLeftSquareBracketKeyword_10_1());
                    			
                    // InternalToscaDsl.g:1048:4: ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) )
                    // InternalToscaDsl.g:1049:5: (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship )
                    {
                    // InternalToscaDsl.g:1049:5: (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship )
                    // InternalToscaDsl.g:1050:6: lv_NodeTemplate_hasRelationship_34_0= ruleRelationship
                    {

                    						newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasRelationshipRelationshipParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_NodeTemplate_hasRelationship_34_0=ruleRelationship();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    						}
                    						add(
                    							current,
                    							"NodeTemplate_hasRelationship",
                    							lv_NodeTemplate_hasRelationship_34_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Relationship");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:1067:4: (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==15) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1068:5: otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) )
                    	    {
                    	    otherlv_35=(Token)match(input,15,FOLLOW_31); 

                    	    					newLeafNode(otherlv_35, grammarAccess.getNode_templateAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalToscaDsl.g:1072:5: ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) )
                    	    // InternalToscaDsl.g:1073:6: (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship )
                    	    {
                    	    // InternalToscaDsl.g:1073:6: (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship )
                    	    // InternalToscaDsl.g:1074:7: lv_NodeTemplate_hasRelationship_36_0= ruleRelationship
                    	    {

                    	    							newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasRelationshipRelationshipParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_NodeTemplate_hasRelationship_36_0=ruleRelationship();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"NodeTemplate_hasRelationship",
                    	    								lv_NodeTemplate_hasRelationship_36_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Relationship");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_37=(Token)match(input,16,FOLLOW_32); 

                    				newLeafNode(otherlv_37, grammarAccess.getNode_templateAccess().getRightSquareBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:1097:3: (otherlv_38= ', \\n \"instances\" :' otherlv_39= '{' ( (lv_nodeTemplate_hasInstances_40_0= ruleinstance ) ) otherlv_41= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalToscaDsl.g:1098:4: otherlv_38= ', \\n \"instances\" :' otherlv_39= '{' ( (lv_nodeTemplate_hasInstances_40_0= ruleinstance ) ) otherlv_41= '}'
                    {
                    otherlv_38=(Token)match(input,34,FOLLOW_10); 

                    				newLeafNode(otherlv_38, grammarAccess.getNode_templateAccess().getInstancesKeyword_11_0());
                    			
                    otherlv_39=(Token)match(input,11,FOLLOW_33); 

                    				newLeafNode(otherlv_39, grammarAccess.getNode_templateAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalToscaDsl.g:1106:4: ( (lv_nodeTemplate_hasInstances_40_0= ruleinstance ) )
                    // InternalToscaDsl.g:1107:5: (lv_nodeTemplate_hasInstances_40_0= ruleinstance )
                    {
                    // InternalToscaDsl.g:1107:5: (lv_nodeTemplate_hasInstances_40_0= ruleinstance )
                    // InternalToscaDsl.g:1108:6: lv_nodeTemplate_hasInstances_40_0= ruleinstance
                    {

                    						newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasInstancesInstanceParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_nodeTemplate_hasInstances_40_0=ruleinstance();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    						}
                    						set(
                    							current,
                    							"nodeTemplate_hasInstances",
                    							lv_nodeTemplate_hasInstances_40_0,
                    							"org.xtext.example.mydsl.ToscaDsl.instance");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_41=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_41, grammarAccess.getNode_templateAccess().getRightCurlyBracketKeyword_11_3());
                    			

                    }
                    break;

            }

            otherlv_42=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_42, grammarAccess.getNode_templateAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleNode_template"


    // $ANTLR start "entryRuleInterface_Impl"
    // InternalToscaDsl.g:1138:1: entryRuleInterface_Impl returns [EObject current=null] : iv_ruleInterface_Impl= ruleInterface_Impl EOF ;
    public final EObject entryRuleInterface_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface_Impl = null;


        try {
            // InternalToscaDsl.g:1138:55: (iv_ruleInterface_Impl= ruleInterface_Impl EOF )
            // InternalToscaDsl.g:1139:2: iv_ruleInterface_Impl= ruleInterface_Impl EOF
            {
             newCompositeNode(grammarAccess.getInterface_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterface_Impl=ruleInterface_Impl();

            state._fsp--;

             current =iv_ruleInterface_Impl; 
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
    // $ANTLR end "entryRuleInterface_Impl"


    // $ANTLR start "ruleInterface_Impl"
    // InternalToscaDsl.g:1145:1: ruleInterface_Impl returns [EObject current=null] : ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleInterface_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_interface_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_hasOperation_4_0 = null;

        EObject lv_hasOperation_6_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:1151:2: ( ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' ) )
            // InternalToscaDsl.g:1152:2: ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' )
            {
            // InternalToscaDsl.g:1152:2: ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' )
            // InternalToscaDsl.g:1153:3: () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}'
            {
            // InternalToscaDsl.g:1153:3: ()
            // InternalToscaDsl.g:1154:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterface_ImplAccess().getInterfaceAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:1160:3: ( (lv_interface_name_1_0= RULE_STRING ) )
            // InternalToscaDsl.g:1161:4: (lv_interface_name_1_0= RULE_STRING )
            {
            // InternalToscaDsl.g:1161:4: (lv_interface_name_1_0= RULE_STRING )
            // InternalToscaDsl.g:1162:5: lv_interface_name_1_0= RULE_STRING
            {
            lv_interface_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_interface_name_1_0, grammarAccess.getInterface_ImplAccess().getInterface_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterface_ImplRule());
            					}
            					setWithLastConsumed(
            						current,
            						"interface_name",
            						lv_interface_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getInterface_ImplAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getInterface_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalToscaDsl.g:1186:3: ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING||LA31_0==21) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalToscaDsl.g:1187:4: ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )*
                    {
                    // InternalToscaDsl.g:1187:4: ( (lv_hasOperation_4_0= ruleOperation ) )
                    // InternalToscaDsl.g:1188:5: (lv_hasOperation_4_0= ruleOperation )
                    {
                    // InternalToscaDsl.g:1188:5: (lv_hasOperation_4_0= ruleOperation )
                    // InternalToscaDsl.g:1189:6: lv_hasOperation_4_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getInterface_ImplAccess().getHasOperationOperationParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_hasOperation_4_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterface_ImplRule());
                    						}
                    						add(
                    							current,
                    							"hasOperation",
                    							lv_hasOperation_4_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:1206:4: (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==15) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1207:5: otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_35); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getInterface_ImplAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalToscaDsl.g:1211:5: ( (lv_hasOperation_6_0= ruleOperation ) )
                    	    // InternalToscaDsl.g:1212:6: (lv_hasOperation_6_0= ruleOperation )
                    	    {
                    	    // InternalToscaDsl.g:1212:6: (lv_hasOperation_6_0= ruleOperation )
                    	    // InternalToscaDsl.g:1213:7: lv_hasOperation_6_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterface_ImplAccess().getHasOperationOperationParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_hasOperation_6_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterface_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"hasOperation",
                    	    								lv_hasOperation_6_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getInterface_ImplAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleInterface_Impl"


    // $ANTLR start "entryRuleProperty"
    // InternalToscaDsl.g:1240:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalToscaDsl.g:1240:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalToscaDsl.g:1241:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalToscaDsl.g:1247:1: ruleProperty returns [EObject current=null] : ( () ( (lv_property_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '[' ( ( (lv_property_hasParameters_4_0= ruleParameters ) ) (otherlv_5= ',' ( (lv_property_hasParameters_6_0= ruleParameters ) ) )* )? otherlv_7= ']' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_property_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_property_hasParameters_4_0 = null;

        EObject lv_property_hasParameters_6_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:1253:2: ( ( () ( (lv_property_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '[' ( ( (lv_property_hasParameters_4_0= ruleParameters ) ) (otherlv_5= ',' ( (lv_property_hasParameters_6_0= ruleParameters ) ) )* )? otherlv_7= ']' ) )
            // InternalToscaDsl.g:1254:2: ( () ( (lv_property_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '[' ( ( (lv_property_hasParameters_4_0= ruleParameters ) ) (otherlv_5= ',' ( (lv_property_hasParameters_6_0= ruleParameters ) ) )* )? otherlv_7= ']' )
            {
            // InternalToscaDsl.g:1254:2: ( () ( (lv_property_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '[' ( ( (lv_property_hasParameters_4_0= ruleParameters ) ) (otherlv_5= ',' ( (lv_property_hasParameters_6_0= ruleParameters ) ) )* )? otherlv_7= ']' )
            // InternalToscaDsl.g:1255:3: () ( (lv_property_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '[' ( ( (lv_property_hasParameters_4_0= ruleParameters ) ) (otherlv_5= ',' ( (lv_property_hasParameters_6_0= ruleParameters ) ) )* )? otherlv_7= ']'
            {
            // InternalToscaDsl.g:1255:3: ()
            // InternalToscaDsl.g:1256:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyAccess().getPropertyAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:1262:3: ( (lv_property_name_1_0= RULE_STRING ) )
            // InternalToscaDsl.g:1263:4: (lv_property_name_1_0= RULE_STRING )
            {
            // InternalToscaDsl.g:1263:4: (lv_property_name_1_0= RULE_STRING )
            // InternalToscaDsl.g:1264:5: lv_property_name_1_0= RULE_STRING
            {
            lv_property_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_property_name_1_0, grammarAccess.getPropertyAccess().getProperty_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"property_name",
            						lv_property_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalToscaDsl.g:1288:3: ( ( (lv_property_hasParameters_4_0= ruleParameters ) ) (otherlv_5= ',' ( (lv_property_hasParameters_6_0= ruleParameters ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==11) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalToscaDsl.g:1289:4: ( (lv_property_hasParameters_4_0= ruleParameters ) ) (otherlv_5= ',' ( (lv_property_hasParameters_6_0= ruleParameters ) ) )*
                    {
                    // InternalToscaDsl.g:1289:4: ( (lv_property_hasParameters_4_0= ruleParameters ) )
                    // InternalToscaDsl.g:1290:5: (lv_property_hasParameters_4_0= ruleParameters )
                    {
                    // InternalToscaDsl.g:1290:5: (lv_property_hasParameters_4_0= ruleParameters )
                    // InternalToscaDsl.g:1291:6: lv_property_hasParameters_4_0= ruleParameters
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getProperty_hasParametersParametersParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_property_hasParameters_4_0=ruleParameters();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						add(
                    							current,
                    							"property_hasParameters",
                    							lv_property_hasParameters_4_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Parameters");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:1308:4: (otherlv_5= ',' ( (lv_property_hasParameters_6_0= ruleParameters ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==15) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1309:5: otherlv_5= ',' ( (lv_property_hasParameters_6_0= ruleParameters ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalToscaDsl.g:1313:5: ( (lv_property_hasParameters_6_0= ruleParameters ) )
                    	    // InternalToscaDsl.g:1314:6: (lv_property_hasParameters_6_0= ruleParameters )
                    	    {
                    	    // InternalToscaDsl.g:1314:6: (lv_property_hasParameters_6_0= ruleParameters )
                    	    // InternalToscaDsl.g:1315:7: lv_property_hasParameters_6_0= ruleParameters
                    	    {

                    	    							newCompositeNode(grammarAccess.getPropertyAccess().getProperty_hasParametersParametersParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_property_hasParameters_6_0=ruleParameters();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"property_hasParameters",
                    	    								lv_property_hasParameters_6_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Parameters");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPropertyAccess().getRightSquareBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleParameters"
    // InternalToscaDsl.g:1342:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // InternalToscaDsl.g:1342:51: (iv_ruleParameters= ruleParameters EOF )
            // InternalToscaDsl.g:1343:2: iv_ruleParameters= ruleParameters EOF
            {
             newCompositeNode(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameters=ruleParameters();

            state._fsp--;

             current =iv_ruleParameters; 
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
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalToscaDsl.g:1349:1: ruleParameters returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_Paremeters_hasParameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_Paremeters_hasParameter_4_0= ruleParameter ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_Paremeters_hasParameter_2_0 = null;

        EObject lv_Paremeters_hasParameter_4_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:1355:2: ( ( () otherlv_1= '{' ( ( (lv_Paremeters_hasParameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_Paremeters_hasParameter_4_0= ruleParameter ) ) )* )? otherlv_5= '}' ) )
            // InternalToscaDsl.g:1356:2: ( () otherlv_1= '{' ( ( (lv_Paremeters_hasParameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_Paremeters_hasParameter_4_0= ruleParameter ) ) )* )? otherlv_5= '}' )
            {
            // InternalToscaDsl.g:1356:2: ( () otherlv_1= '{' ( ( (lv_Paremeters_hasParameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_Paremeters_hasParameter_4_0= ruleParameter ) ) )* )? otherlv_5= '}' )
            // InternalToscaDsl.g:1357:3: () otherlv_1= '{' ( ( (lv_Paremeters_hasParameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_Paremeters_hasParameter_4_0= ruleParameter ) ) )* )? otherlv_5= '}'
            {
            // InternalToscaDsl.g:1357:3: ()
            // InternalToscaDsl.g:1358:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParametersAccess().getParametersAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getParametersAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalToscaDsl.g:1368:3: ( ( (lv_Paremeters_hasParameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_Paremeters_hasParameter_4_0= ruleParameter ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING||LA35_0==35) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalToscaDsl.g:1369:4: ( (lv_Paremeters_hasParameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_Paremeters_hasParameter_4_0= ruleParameter ) ) )*
                    {
                    // InternalToscaDsl.g:1369:4: ( (lv_Paremeters_hasParameter_2_0= ruleParameter ) )
                    // InternalToscaDsl.g:1370:5: (lv_Paremeters_hasParameter_2_0= ruleParameter )
                    {
                    // InternalToscaDsl.g:1370:5: (lv_Paremeters_hasParameter_2_0= ruleParameter )
                    // InternalToscaDsl.g:1371:6: lv_Paremeters_hasParameter_2_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getParametersAccess().getParemeters_hasParameterParameterParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_Paremeters_hasParameter_2_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParametersRule());
                    						}
                    						add(
                    							current,
                    							"Paremeters_hasParameter",
                    							lv_Paremeters_hasParameter_2_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:1388:4: (otherlv_3= ',' ( (lv_Paremeters_hasParameter_4_0= ruleParameter ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==15) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1389:5: otherlv_3= ',' ( (lv_Paremeters_hasParameter_4_0= ruleParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_38); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getParametersAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalToscaDsl.g:1393:5: ( (lv_Paremeters_hasParameter_4_0= ruleParameter ) )
                    	    // InternalToscaDsl.g:1394:6: (lv_Paremeters_hasParameter_4_0= ruleParameter )
                    	    {
                    	    // InternalToscaDsl.g:1394:6: (lv_Paremeters_hasParameter_4_0= ruleParameter )
                    	    // InternalToscaDsl.g:1395:7: lv_Paremeters_hasParameter_4_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getParametersAccess().getParemeters_hasParameterParameterParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_Paremeters_hasParameter_4_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParametersRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"Paremeters_hasParameter",
                    	    								lv_Paremeters_hasParameter_4_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParametersAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleParameter_Impl"
    // InternalToscaDsl.g:1422:1: entryRuleParameter_Impl returns [EObject current=null] : iv_ruleParameter_Impl= ruleParameter_Impl EOF ;
    public final EObject entryRuleParameter_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter_Impl = null;


        try {
            // InternalToscaDsl.g:1422:55: (iv_ruleParameter_Impl= ruleParameter_Impl EOF )
            // InternalToscaDsl.g:1423:2: iv_ruleParameter_Impl= ruleParameter_Impl EOF
            {
             newCompositeNode(grammarAccess.getParameter_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter_Impl=ruleParameter_Impl();

            state._fsp--;

             current =iv_ruleParameter_Impl; 
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
    // $ANTLR end "entryRuleParameter_Impl"


    // $ANTLR start "ruleParameter_Impl"
    // InternalToscaDsl.g:1429:1: ruleParameter_Impl returns [EObject current=null] : ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) )? ) ;
    public final EObject ruleParameter_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_parameter_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:1435:2: ( ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) )? ) )
            // InternalToscaDsl.g:1436:2: ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) )? )
            {
            // InternalToscaDsl.g:1436:2: ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) )? )
            // InternalToscaDsl.g:1437:3: () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) )?
            {
            // InternalToscaDsl.g:1437:3: ()
            // InternalToscaDsl.g:1438:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameter_ImplAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:1444:3: ( (lv_parameter_name_1_0= RULE_STRING ) )
            // InternalToscaDsl.g:1445:4: (lv_parameter_name_1_0= RULE_STRING )
            {
            // InternalToscaDsl.g:1445:4: (lv_parameter_name_1_0= RULE_STRING )
            // InternalToscaDsl.g:1446:5: lv_parameter_name_1_0= RULE_STRING
            {
            lv_parameter_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_parameter_name_1_0, grammarAccess.getParameter_ImplAccess().getParameter_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameter_ImplRule());
            					}
            					setWithLastConsumed(
            						current,
            						"parameter_name",
            						lv_parameter_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getParameter_ImplAccess().getColonKeyword_2());
            		
            // InternalToscaDsl.g:1466:3: ( (lv_value_3_0= RULE_STRING ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalToscaDsl.g:1467:4: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:1467:4: (lv_value_3_0= RULE_STRING )
                    // InternalToscaDsl.g:1468:5: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_value_3_0, grammarAccess.getParameter_ImplAccess().getValueSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameter_ImplRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_3_0,
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
    // $ANTLR end "ruleParameter_Impl"


    // $ANTLR start "entryRuleParameter"
    // InternalToscaDsl.g:1488:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalToscaDsl.g:1488:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalToscaDsl.g:1489:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalToscaDsl.g:1495:1: ruleParameter returns [EObject current=null] : (this_Parameter_Impl_0= ruleParameter_Impl | this_Attribute_1= ruleAttribute | this_Input_2= ruleInput | this_Output_3= ruleOutput ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject this_Parameter_Impl_0 = null;

        EObject this_Attribute_1 = null;

        EObject this_Input_2 = null;

        EObject this_Output_3 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:1501:2: ( (this_Parameter_Impl_0= ruleParameter_Impl | this_Attribute_1= ruleAttribute | this_Input_2= ruleInput | this_Output_3= ruleOutput ) )
            // InternalToscaDsl.g:1502:2: (this_Parameter_Impl_0= ruleParameter_Impl | this_Attribute_1= ruleAttribute | this_Input_2= ruleInput | this_Output_3= ruleOutput )
            {
            // InternalToscaDsl.g:1502:2: (this_Parameter_Impl_0= ruleParameter_Impl | this_Attribute_1= ruleAttribute | this_Input_2= ruleInput | this_Output_3= ruleOutput )
            int alt37=4;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==24) ) {
                    alt37=3;
                }
                else if ( (LA37_1==21) ) {
                    int LA37_4 = input.LA(3);

                    if ( (LA37_4==11) ) {
                        alt37=4;
                    }
                    else if ( (LA37_4==EOF||LA37_4==RULE_STRING||LA37_4==15||LA37_4==18) ) {
                        alt37=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA37_0==35) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalToscaDsl.g:1503:3: this_Parameter_Impl_0= ruleParameter_Impl
                    {

                    			newCompositeNode(grammarAccess.getParameterAccess().getParameter_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parameter_Impl_0=ruleParameter_Impl();

                    state._fsp--;


                    			current = this_Parameter_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalToscaDsl.g:1512:3: this_Attribute_1= ruleAttribute
                    {

                    			newCompositeNode(grammarAccess.getParameterAccess().getAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attribute_1=ruleAttribute();

                    state._fsp--;


                    			current = this_Attribute_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalToscaDsl.g:1521:3: this_Input_2= ruleInput
                    {

                    			newCompositeNode(grammarAccess.getParameterAccess().getInputParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Input_2=ruleInput();

                    state._fsp--;


                    			current = this_Input_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalToscaDsl.g:1530:3: this_Output_3= ruleOutput
                    {

                    			newCompositeNode(grammarAccess.getParameterAccess().getOutputParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Output_3=ruleOutput();

                    state._fsp--;


                    			current = this_Output_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleAttribute"
    // InternalToscaDsl.g:1542:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalToscaDsl.g:1542:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalToscaDsl.g:1543:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalToscaDsl.g:1549:1: ruleAttribute returns [EObject current=null] : ( () otherlv_1= 'Attribute' ( (lv_parameter_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= RULE_STRING ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= RULE_STRING ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= RULE_STRING ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= RULE_STRING ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_parameter_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token lv_value_9_0=null;
        Token otherlv_10=null;
        Token lv_required_11_0=null;
        Token otherlv_12=null;
        Token lv_default_13_0=null;
        Token otherlv_14=null;
        Token lv_status_15_0=null;
        Token otherlv_16=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:1555:2: ( ( () otherlv_1= 'Attribute' ( (lv_parameter_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= RULE_STRING ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= RULE_STRING ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= RULE_STRING ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= RULE_STRING ) ) )? otherlv_16= '}' ) )
            // InternalToscaDsl.g:1556:2: ( () otherlv_1= 'Attribute' ( (lv_parameter_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= RULE_STRING ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= RULE_STRING ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= RULE_STRING ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= RULE_STRING ) ) )? otherlv_16= '}' )
            {
            // InternalToscaDsl.g:1556:2: ( () otherlv_1= 'Attribute' ( (lv_parameter_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= RULE_STRING ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= RULE_STRING ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= RULE_STRING ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= RULE_STRING ) ) )? otherlv_16= '}' )
            // InternalToscaDsl.g:1557:3: () otherlv_1= 'Attribute' ( (lv_parameter_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= RULE_STRING ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= RULE_STRING ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= RULE_STRING ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= RULE_STRING ) ) )? otherlv_16= '}'
            {
            // InternalToscaDsl.g:1557:3: ()
            // InternalToscaDsl.g:1558:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttributeKeyword_1());
            		
            // InternalToscaDsl.g:1568:3: ( (lv_parameter_name_2_0= RULE_STRING ) )
            // InternalToscaDsl.g:1569:4: (lv_parameter_name_2_0= RULE_STRING )
            {
            // InternalToscaDsl.g:1569:4: (lv_parameter_name_2_0= RULE_STRING )
            // InternalToscaDsl.g:1570:5: lv_parameter_name_2_0= RULE_STRING
            {
            lv_parameter_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_parameter_name_2_0, grammarAccess.getAttributeAccess().getParameter_nameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"parameter_name",
            						lv_parameter_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalToscaDsl.g:1590:3: (otherlv_4= 'type' ( (lv_type_5_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==36) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalToscaDsl.g:1591:4: otherlv_4= 'type' ( (lv_type_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getTypeKeyword_4_0());
                    			
                    // InternalToscaDsl.g:1595:4: ( (lv_type_5_0= RULE_STRING ) )
                    // InternalToscaDsl.g:1596:5: (lv_type_5_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:1596:5: (lv_type_5_0= RULE_STRING )
                    // InternalToscaDsl.g:1597:6: lv_type_5_0= RULE_STRING
                    {
                    lv_type_5_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

                    						newLeafNode(lv_type_5_0, grammarAccess.getAttributeAccess().getTypeSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:1614:3: (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==37) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalToscaDsl.g:1615:4: otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalToscaDsl.g:1619:4: ( (lv_description_7_0= RULE_STRING ) )
                    // InternalToscaDsl.g:1620:5: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:1620:5: (lv_description_7_0= RULE_STRING )
                    // InternalToscaDsl.g:1621:6: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

                    						newLeafNode(lv_description_7_0, grammarAccess.getAttributeAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
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

            // InternalToscaDsl.g:1638:3: (otherlv_8= 'value' ( (lv_value_9_0= RULE_STRING ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==38) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalToscaDsl.g:1639:4: otherlv_8= 'value' ( (lv_value_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,38,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getValueKeyword_6_0());
                    			
                    // InternalToscaDsl.g:1643:4: ( (lv_value_9_0= RULE_STRING ) )
                    // InternalToscaDsl.g:1644:5: (lv_value_9_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:1644:5: (lv_value_9_0= RULE_STRING )
                    // InternalToscaDsl.g:1645:6: lv_value_9_0= RULE_STRING
                    {
                    lv_value_9_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

                    						newLeafNode(lv_value_9_0, grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:1662:3: (otherlv_10= 'required' ( (lv_required_11_0= RULE_STRING ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==39) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalToscaDsl.g:1663:4: otherlv_10= 'required' ( (lv_required_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getRequiredKeyword_7_0());
                    			
                    // InternalToscaDsl.g:1667:4: ( (lv_required_11_0= RULE_STRING ) )
                    // InternalToscaDsl.g:1668:5: (lv_required_11_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:1668:5: (lv_required_11_0= RULE_STRING )
                    // InternalToscaDsl.g:1669:6: lv_required_11_0= RULE_STRING
                    {
                    lv_required_11_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

                    						newLeafNode(lv_required_11_0, grammarAccess.getAttributeAccess().getRequiredSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"required",
                    							lv_required_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:1686:3: (otherlv_12= 'default' ( (lv_default_13_0= RULE_STRING ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==40) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalToscaDsl.g:1687:4: otherlv_12= 'default' ( (lv_default_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,40,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getDefaultKeyword_8_0());
                    			
                    // InternalToscaDsl.g:1691:4: ( (lv_default_13_0= RULE_STRING ) )
                    // InternalToscaDsl.g:1692:5: (lv_default_13_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:1692:5: (lv_default_13_0= RULE_STRING )
                    // InternalToscaDsl.g:1693:6: lv_default_13_0= RULE_STRING
                    {
                    lv_default_13_0=(Token)match(input,RULE_STRING,FOLLOW_45); 

                    						newLeafNode(lv_default_13_0, grammarAccess.getAttributeAccess().getDefaultSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"default",
                    							lv_default_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:1710:3: (otherlv_14= 'status' ( (lv_status_15_0= RULE_STRING ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==41) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalToscaDsl.g:1711:4: otherlv_14= 'status' ( (lv_status_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,41,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getStatusKeyword_9_0());
                    			
                    // InternalToscaDsl.g:1715:4: ( (lv_status_15_0= RULE_STRING ) )
                    // InternalToscaDsl.g:1716:5: (lv_status_15_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:1716:5: (lv_status_15_0= RULE_STRING )
                    // InternalToscaDsl.g:1717:6: lv_status_15_0= RULE_STRING
                    {
                    lv_status_15_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    						newLeafNode(lv_status_15_0, grammarAccess.getAttributeAccess().getStatusSTRINGTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"status",
                    							lv_status_15_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalToscaDsl.g:1742:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalToscaDsl.g:1742:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalToscaDsl.g:1743:2: iv_ruleRequirement= ruleRequirement EOF
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
    // InternalToscaDsl.g:1749:1: ruleRequirement returns [EObject current=null] : ( () otherlv_1= 'Requirement' otherlv_2= '{' (otherlv_3= 'requirement_name' ( (lv_requirement_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'node' ( (lv_node_6_0= RULE_STRING ) ) )? (otherlv_7= 'capability_Type_name' ( (lv_capability_Type_name_8_0= RULE_STRING ) ) )? (otherlv_9= 'occurances' otherlv_10= '{' ( (lv_occurances_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_occurances_13_0= RULE_STRING ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_requirement_name_4_0=null;
        Token otherlv_5=null;
        Token lv_node_6_0=null;
        Token otherlv_7=null;
        Token lv_capability_Type_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_occurances_11_0=null;
        Token otherlv_12=null;
        Token lv_occurances_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:1755:2: ( ( () otherlv_1= 'Requirement' otherlv_2= '{' (otherlv_3= 'requirement_name' ( (lv_requirement_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'node' ( (lv_node_6_0= RULE_STRING ) ) )? (otherlv_7= 'capability_Type_name' ( (lv_capability_Type_name_8_0= RULE_STRING ) ) )? (otherlv_9= 'occurances' otherlv_10= '{' ( (lv_occurances_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_occurances_13_0= RULE_STRING ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalToscaDsl.g:1756:2: ( () otherlv_1= 'Requirement' otherlv_2= '{' (otherlv_3= 'requirement_name' ( (lv_requirement_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'node' ( (lv_node_6_0= RULE_STRING ) ) )? (otherlv_7= 'capability_Type_name' ( (lv_capability_Type_name_8_0= RULE_STRING ) ) )? (otherlv_9= 'occurances' otherlv_10= '{' ( (lv_occurances_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_occurances_13_0= RULE_STRING ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalToscaDsl.g:1756:2: ( () otherlv_1= 'Requirement' otherlv_2= '{' (otherlv_3= 'requirement_name' ( (lv_requirement_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'node' ( (lv_node_6_0= RULE_STRING ) ) )? (otherlv_7= 'capability_Type_name' ( (lv_capability_Type_name_8_0= RULE_STRING ) ) )? (otherlv_9= 'occurances' otherlv_10= '{' ( (lv_occurances_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_occurances_13_0= RULE_STRING ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalToscaDsl.g:1757:3: () otherlv_1= 'Requirement' otherlv_2= '{' (otherlv_3= 'requirement_name' ( (lv_requirement_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'node' ( (lv_node_6_0= RULE_STRING ) ) )? (otherlv_7= 'capability_Type_name' ( (lv_capability_Type_name_8_0= RULE_STRING ) ) )? (otherlv_9= 'occurances' otherlv_10= '{' ( (lv_occurances_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_occurances_13_0= RULE_STRING ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalToscaDsl.g:1757:3: ()
            // InternalToscaDsl.g:1758:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequirementAccess().getRequirementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementAccess().getRequirementKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalToscaDsl.g:1772:3: (otherlv_3= 'requirement_name' ( (lv_requirement_name_4_0= RULE_STRING ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==43) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalToscaDsl.g:1773:4: otherlv_3= 'requirement_name' ( (lv_requirement_name_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getRequirement_nameKeyword_3_0());
                    			
                    // InternalToscaDsl.g:1777:4: ( (lv_requirement_name_4_0= RULE_STRING ) )
                    // InternalToscaDsl.g:1778:5: (lv_requirement_name_4_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:1778:5: (lv_requirement_name_4_0= RULE_STRING )
                    // InternalToscaDsl.g:1779:6: lv_requirement_name_4_0= RULE_STRING
                    {
                    lv_requirement_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_47); 

                    						newLeafNode(lv_requirement_name_4_0, grammarAccess.getRequirementAccess().getRequirement_nameSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRequirementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"requirement_name",
                    							lv_requirement_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:1796:3: (otherlv_5= 'node' ( (lv_node_6_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==44) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalToscaDsl.g:1797:4: otherlv_5= 'node' ( (lv_node_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getNodeKeyword_4_0());
                    			
                    // InternalToscaDsl.g:1801:4: ( (lv_node_6_0= RULE_STRING ) )
                    // InternalToscaDsl.g:1802:5: (lv_node_6_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:1802:5: (lv_node_6_0= RULE_STRING )
                    // InternalToscaDsl.g:1803:6: lv_node_6_0= RULE_STRING
                    {
                    lv_node_6_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

                    						newLeafNode(lv_node_6_0, grammarAccess.getRequirementAccess().getNodeSTRINGTerminalRuleCall_4_1_0());
                    					

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

            // InternalToscaDsl.g:1820:3: (otherlv_7= 'capability_Type_name' ( (lv_capability_Type_name_8_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==45) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalToscaDsl.g:1821:4: otherlv_7= 'capability_Type_name' ( (lv_capability_Type_name_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,45,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getCapability_Type_nameKeyword_5_0());
                    			
                    // InternalToscaDsl.g:1825:4: ( (lv_capability_Type_name_8_0= RULE_STRING ) )
                    // InternalToscaDsl.g:1826:5: (lv_capability_Type_name_8_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:1826:5: (lv_capability_Type_name_8_0= RULE_STRING )
                    // InternalToscaDsl.g:1827:6: lv_capability_Type_name_8_0= RULE_STRING
                    {
                    lv_capability_Type_name_8_0=(Token)match(input,RULE_STRING,FOLLOW_49); 

                    						newLeafNode(lv_capability_Type_name_8_0, grammarAccess.getRequirementAccess().getCapability_Type_nameSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRequirementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"capability_Type_name",
                    							lv_capability_Type_name_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:1844:3: (otherlv_9= 'occurances' otherlv_10= '{' ( (lv_occurances_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_occurances_13_0= RULE_STRING ) ) )* otherlv_14= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==46) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalToscaDsl.g:1845:4: otherlv_9= 'occurances' otherlv_10= '{' ( (lv_occurances_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_occurances_13_0= RULE_STRING ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,46,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getRequirementAccess().getOccurancesKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalToscaDsl.g:1853:4: ( (lv_occurances_11_0= RULE_STRING ) )
                    // InternalToscaDsl.g:1854:5: (lv_occurances_11_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:1854:5: (lv_occurances_11_0= RULE_STRING )
                    // InternalToscaDsl.g:1855:6: lv_occurances_11_0= RULE_STRING
                    {
                    lv_occurances_11_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(lv_occurances_11_0, grammarAccess.getRequirementAccess().getOccurancesSTRINGTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRequirementRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"occurances",
                    							lv_occurances_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalToscaDsl.g:1871:4: (otherlv_12= ',' ( (lv_occurances_13_0= RULE_STRING ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==15) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1872:5: otherlv_12= ',' ( (lv_occurances_13_0= RULE_STRING ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRequirementAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalToscaDsl.g:1876:5: ( (lv_occurances_13_0= RULE_STRING ) )
                    	    // InternalToscaDsl.g:1877:6: (lv_occurances_13_0= RULE_STRING )
                    	    {
                    	    // InternalToscaDsl.g:1877:6: (lv_occurances_13_0= RULE_STRING )
                    	    // InternalToscaDsl.g:1878:7: lv_occurances_13_0= RULE_STRING
                    	    {
                    	    lv_occurances_13_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    	    							newLeafNode(lv_occurances_13_0, grammarAccess.getRequirementAccess().getOccurancesSTRINGTerminalRuleCall_6_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRequirementRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"occurances",
                    	    								lv_occurances_13_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_14, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleRelationship_Impl"
    // InternalToscaDsl.g:1908:1: entryRuleRelationship_Impl returns [EObject current=null] : iv_ruleRelationship_Impl= ruleRelationship_Impl EOF ;
    public final EObject entryRuleRelationship_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship_Impl = null;


        try {
            // InternalToscaDsl.g:1908:58: (iv_ruleRelationship_Impl= ruleRelationship_Impl EOF )
            // InternalToscaDsl.g:1909:2: iv_ruleRelationship_Impl= ruleRelationship_Impl EOF
            {
             newCompositeNode(grammarAccess.getRelationship_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationship_Impl=ruleRelationship_Impl();

            state._fsp--;

             current =iv_ruleRelationship_Impl; 
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
    // $ANTLR end "entryRuleRelationship_Impl"


    // $ANTLR start "ruleRelationship_Impl"
    // InternalToscaDsl.g:1915:1: ruleRelationship_Impl returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) )? (otherlv_4= ', \\n \"source\" :' ( (lv_validSource_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"target\" :' ( (lv_validTarget_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"source_interfaces\" :' otherlv_9= '{' ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) ) (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"target_interfaces\" :' otherlv_15= '{' ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) ) (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject ruleRelationship_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token otherlv_4=null;
        Token lv_validSource_5_0=null;
        Token otherlv_6=null;
        Token lv_validTarget_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_relation_haSourceInterface_10_0 = null;

        EObject lv_relation_haSourceInterface_12_0 = null;

        EObject lv_relation_hasTargetInterface_16_0 = null;

        EObject lv_relation_hasTargetInterface_18_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:1921:2: ( ( () otherlv_1= '{' (otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) )? (otherlv_4= ', \\n \"source\" :' ( (lv_validSource_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"target\" :' ( (lv_validTarget_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"source_interfaces\" :' otherlv_9= '{' ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) ) (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"target_interfaces\" :' otherlv_15= '{' ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) ) (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalToscaDsl.g:1922:2: ( () otherlv_1= '{' (otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) )? (otherlv_4= ', \\n \"source\" :' ( (lv_validSource_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"target\" :' ( (lv_validTarget_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"source_interfaces\" :' otherlv_9= '{' ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) ) (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"target_interfaces\" :' otherlv_15= '{' ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) ) (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalToscaDsl.g:1922:2: ( () otherlv_1= '{' (otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) )? (otherlv_4= ', \\n \"source\" :' ( (lv_validSource_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"target\" :' ( (lv_validTarget_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"source_interfaces\" :' otherlv_9= '{' ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) ) (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"target_interfaces\" :' otherlv_15= '{' ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) ) (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // InternalToscaDsl.g:1923:3: () otherlv_1= '{' (otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) )? (otherlv_4= ', \\n \"source\" :' ( (lv_validSource_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"target\" :' ( (lv_validTarget_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"source_interfaces\" :' otherlv_9= '{' ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) ) (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"target_interfaces\" :' otherlv_15= '{' ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) ) (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // InternalToscaDsl.g:1923:3: ()
            // InternalToscaDsl.g:1924:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationship_ImplAccess().getRelationshipAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationship_ImplAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalToscaDsl.g:1934:3: (otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==27) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalToscaDsl.g:1935:4: otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelationship_ImplAccess().getTypeKeyword_2_0());
                    			
                    // InternalToscaDsl.g:1939:4: ( (lv_type_3_0= RULE_STRING ) )
                    // InternalToscaDsl.g:1940:5: (lv_type_3_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:1940:5: (lv_type_3_0= RULE_STRING )
                    // InternalToscaDsl.g:1941:6: lv_type_3_0= RULE_STRING
                    {
                    lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

                    						newLeafNode(lv_type_3_0, grammarAccess.getRelationship_ImplAccess().getTypeSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationship_ImplRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"type",
                    							lv_type_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:1958:3: (otherlv_4= ', \\n \"source\" :' ( (lv_validSource_5_0= RULE_STRING ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==47) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalToscaDsl.g:1959:4: otherlv_4= ', \\n \"source\" :' ( (lv_validSource_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelationship_ImplAccess().getSourceKeyword_3_0());
                    			
                    // InternalToscaDsl.g:1963:4: ( (lv_validSource_5_0= RULE_STRING ) )
                    // InternalToscaDsl.g:1964:5: (lv_validSource_5_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:1964:5: (lv_validSource_5_0= RULE_STRING )
                    // InternalToscaDsl.g:1965:6: lv_validSource_5_0= RULE_STRING
                    {
                    lv_validSource_5_0=(Token)match(input,RULE_STRING,FOLLOW_52); 

                    						newLeafNode(lv_validSource_5_0, grammarAccess.getRelationship_ImplAccess().getValidSourceSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationship_ImplRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"validSource",
                    							lv_validSource_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:1982:3: (otherlv_6= ', \\n \"target\" :' ( (lv_validTarget_7_0= RULE_STRING ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==48) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalToscaDsl.g:1983:4: otherlv_6= ', \\n \"target\" :' ( (lv_validTarget_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationship_ImplAccess().getTargetKeyword_4_0());
                    			
                    // InternalToscaDsl.g:1987:4: ( (lv_validTarget_7_0= RULE_STRING ) )
                    // InternalToscaDsl.g:1988:5: (lv_validTarget_7_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:1988:5: (lv_validTarget_7_0= RULE_STRING )
                    // InternalToscaDsl.g:1989:6: lv_validTarget_7_0= RULE_STRING
                    {
                    lv_validTarget_7_0=(Token)match(input,RULE_STRING,FOLLOW_53); 

                    						newLeafNode(lv_validTarget_7_0, grammarAccess.getRelationship_ImplAccess().getValidTargetSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationship_ImplRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"validTarget",
                    							lv_validTarget_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:2006:3: (otherlv_8= ', \\n \"source_interfaces\" :' otherlv_9= '{' ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) ) (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )* otherlv_13= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==49) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalToscaDsl.g:2007:4: otherlv_8= ', \\n \"source_interfaces\" :' otherlv_9= '{' ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) ) (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,49,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelationship_ImplAccess().getSource_interfacesKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getRelationship_ImplAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalToscaDsl.g:2015:4: ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) )
                    // InternalToscaDsl.g:2016:5: (lv_relation_haSourceInterface_10_0= ruleSource_interface )
                    {
                    // InternalToscaDsl.g:2016:5: (lv_relation_haSourceInterface_10_0= ruleSource_interface )
                    // InternalToscaDsl.g:2017:6: lv_relation_haSourceInterface_10_0= ruleSource_interface
                    {

                    						newCompositeNode(grammarAccess.getRelationship_ImplAccess().getRelation_haSourceInterfaceSource_interfaceParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_relation_haSourceInterface_10_0=ruleSource_interface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationship_ImplRule());
                    						}
                    						add(
                    							current,
                    							"relation_haSourceInterface",
                    							lv_relation_haSourceInterface_10_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Source_interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:2034:4: (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==15) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalToscaDsl.g:2035:5: otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getRelationship_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalToscaDsl.g:2039:5: ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) )
                    	    // InternalToscaDsl.g:2040:6: (lv_relation_haSourceInterface_12_0= ruleSource_interface )
                    	    {
                    	    // InternalToscaDsl.g:2040:6: (lv_relation_haSourceInterface_12_0= ruleSource_interface )
                    	    // InternalToscaDsl.g:2041:7: lv_relation_haSourceInterface_12_0= ruleSource_interface
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelationship_ImplAccess().getRelation_haSourceInterfaceSource_interfaceParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_relation_haSourceInterface_12_0=ruleSource_interface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelationship_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relation_haSourceInterface",
                    	    								lv_relation_haSourceInterface_12_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Source_interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FOLLOW_54); 

                    				newLeafNode(otherlv_13, grammarAccess.getRelationship_ImplAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:2064:3: (otherlv_14= ', \\n \"target_interfaces\" :' otherlv_15= '{' ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) ) (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )* otherlv_19= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==50) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalToscaDsl.g:2065:4: otherlv_14= ', \\n \"target_interfaces\" :' otherlv_15= '{' ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) ) (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,50,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getRelationship_ImplAccess().getTarget_interfacesKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getRelationship_ImplAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalToscaDsl.g:2073:4: ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) )
                    // InternalToscaDsl.g:2074:5: (lv_relation_hasTargetInterface_16_0= ruleTarget_interface )
                    {
                    // InternalToscaDsl.g:2074:5: (lv_relation_hasTargetInterface_16_0= ruleTarget_interface )
                    // InternalToscaDsl.g:2075:6: lv_relation_hasTargetInterface_16_0= ruleTarget_interface
                    {

                    						newCompositeNode(grammarAccess.getRelationship_ImplAccess().getRelation_hasTargetInterfaceTarget_interfaceParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_relation_hasTargetInterface_16_0=ruleTarget_interface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationship_ImplRule());
                    						}
                    						add(
                    							current,
                    							"relation_hasTargetInterface",
                    							lv_relation_hasTargetInterface_16_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Target_interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:2092:4: (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==15) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalToscaDsl.g:2093:5: otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) )
                    	    {
                    	    otherlv_17=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getRelationship_ImplAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalToscaDsl.g:2097:5: ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) )
                    	    // InternalToscaDsl.g:2098:6: (lv_relation_hasTargetInterface_18_0= ruleTarget_interface )
                    	    {
                    	    // InternalToscaDsl.g:2098:6: (lv_relation_hasTargetInterface_18_0= ruleTarget_interface )
                    	    // InternalToscaDsl.g:2099:7: lv_relation_hasTargetInterface_18_0= ruleTarget_interface
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelationship_ImplAccess().getRelation_hasTargetInterfaceTarget_interfaceParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_relation_hasTargetInterface_18_0=ruleTarget_interface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelationship_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relation_hasTargetInterface",
                    	    								lv_relation_hasTargetInterface_18_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Target_interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_19, grammarAccess.getRelationship_ImplAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getRelationship_ImplAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRelationship_Impl"


    // $ANTLR start "entryRuleinstance"
    // InternalToscaDsl.g:2130:1: entryRuleinstance returns [EObject current=null] : iv_ruleinstance= ruleinstance EOF ;
    public final EObject entryRuleinstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinstance = null;


        try {
            // InternalToscaDsl.g:2130:49: (iv_ruleinstance= ruleinstance EOF )
            // InternalToscaDsl.g:2131:2: iv_ruleinstance= ruleinstance EOF
            {
             newCompositeNode(grammarAccess.getInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleinstance=ruleinstance();

            state._fsp--;

             current =iv_ruleinstance; 
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
    // $ANTLR end "entryRuleinstance"


    // $ANTLR start "ruleinstance"
    // InternalToscaDsl.g:2137:1: ruleinstance returns [EObject current=null] : (otherlv_0= '\"deploy\" :' ( (lv_deploy_1_0= ruleEInt ) ) ) ;
    public final EObject ruleinstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_deploy_1_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:2143:2: ( (otherlv_0= '\"deploy\" :' ( (lv_deploy_1_0= ruleEInt ) ) ) )
            // InternalToscaDsl.g:2144:2: (otherlv_0= '\"deploy\" :' ( (lv_deploy_1_0= ruleEInt ) ) )
            {
            // InternalToscaDsl.g:2144:2: (otherlv_0= '\"deploy\" :' ( (lv_deploy_1_0= ruleEInt ) ) )
            // InternalToscaDsl.g:2145:3: otherlv_0= '\"deploy\" :' ( (lv_deploy_1_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_55); 

            			newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getDeployKeyword_0());
            		
            // InternalToscaDsl.g:2149:3: ( (lv_deploy_1_0= ruleEInt ) )
            // InternalToscaDsl.g:2150:4: (lv_deploy_1_0= ruleEInt )
            {
            // InternalToscaDsl.g:2150:4: (lv_deploy_1_0= ruleEInt )
            // InternalToscaDsl.g:2151:5: lv_deploy_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getInstanceAccess().getDeployEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_deploy_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstanceRule());
            					}
            					set(
            						current,
            						"deploy",
            						lv_deploy_1_0,
            						"org.xtext.example.mydsl.ToscaDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleinstance"


    // $ANTLR start "entryRuleOperation"
    // InternalToscaDsl.g:2172:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalToscaDsl.g:2172:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalToscaDsl.g:2173:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalToscaDsl.g:2179:1: ruleOperation returns [EObject current=null] : ( () ( (lv_operation_name_1_0= RULE_STRING ) )? otherlv_2= ':' ( (lv_script_3_0= RULE_STRING ) )? ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_operation_name_1_0=null;
        Token otherlv_2=null;
        Token lv_script_3_0=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:2185:2: ( ( () ( (lv_operation_name_1_0= RULE_STRING ) )? otherlv_2= ':' ( (lv_script_3_0= RULE_STRING ) )? ) )
            // InternalToscaDsl.g:2186:2: ( () ( (lv_operation_name_1_0= RULE_STRING ) )? otherlv_2= ':' ( (lv_script_3_0= RULE_STRING ) )? )
            {
            // InternalToscaDsl.g:2186:2: ( () ( (lv_operation_name_1_0= RULE_STRING ) )? otherlv_2= ':' ( (lv_script_3_0= RULE_STRING ) )? )
            // InternalToscaDsl.g:2187:3: () ( (lv_operation_name_1_0= RULE_STRING ) )? otherlv_2= ':' ( (lv_script_3_0= RULE_STRING ) )?
            {
            // InternalToscaDsl.g:2187:3: ()
            // InternalToscaDsl.g:2188:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperationAccess().getOperationAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:2194:3: ( (lv_operation_name_1_0= RULE_STRING ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_STRING) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalToscaDsl.g:2195:4: (lv_operation_name_1_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:2195:4: (lv_operation_name_1_0= RULE_STRING )
                    // InternalToscaDsl.g:2196:5: lv_operation_name_1_0= RULE_STRING
                    {
                    lv_operation_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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
                    break;

            }

            otherlv_2=(Token)match(input,21,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getColonKeyword_2());
            		
            // InternalToscaDsl.g:2216:3: ( (lv_script_3_0= RULE_STRING ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_STRING) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalToscaDsl.g:2217:4: (lv_script_3_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:2217:4: (lv_script_3_0= RULE_STRING )
                    // InternalToscaDsl.g:2218:5: lv_script_3_0= RULE_STRING
                    {
                    lv_script_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_script_3_0, grammarAccess.getOperationAccess().getScriptSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"script",
                    						lv_script_3_0,
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleSource_interface"
    // InternalToscaDsl.g:2238:1: entryRuleSource_interface returns [EObject current=null] : iv_ruleSource_interface= ruleSource_interface EOF ;
    public final EObject entryRuleSource_interface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource_interface = null;


        try {
            // InternalToscaDsl.g:2238:57: (iv_ruleSource_interface= ruleSource_interface EOF )
            // InternalToscaDsl.g:2239:2: iv_ruleSource_interface= ruleSource_interface EOF
            {
             newCompositeNode(grammarAccess.getSource_interfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSource_interface=ruleSource_interface();

            state._fsp--;

             current =iv_ruleSource_interface; 
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
    // $ANTLR end "entryRuleSource_interface"


    // $ANTLR start "ruleSource_interface"
    // InternalToscaDsl.g:2245:1: ruleSource_interface returns [EObject current=null] : ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleSource_interface() throws RecognitionException {
        EObject current = null;

        Token lv_interface_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_hasOperation_4_0 = null;

        EObject lv_hasOperation_6_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:2251:2: ( ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' ) )
            // InternalToscaDsl.g:2252:2: ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' )
            {
            // InternalToscaDsl.g:2252:2: ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' )
            // InternalToscaDsl.g:2253:3: () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}'
            {
            // InternalToscaDsl.g:2253:3: ()
            // InternalToscaDsl.g:2254:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSource_interfaceAccess().getSource_interfaceAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:2260:3: ( (lv_interface_name_1_0= RULE_STRING ) )
            // InternalToscaDsl.g:2261:4: (lv_interface_name_1_0= RULE_STRING )
            {
            // InternalToscaDsl.g:2261:4: (lv_interface_name_1_0= RULE_STRING )
            // InternalToscaDsl.g:2262:5: lv_interface_name_1_0= RULE_STRING
            {
            lv_interface_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_56); 

            					newLeafNode(lv_interface_name_1_0, grammarAccess.getSource_interfaceAccess().getInterface_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSource_interfaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"interface_name",
            						lv_interface_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,52,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getSource_interfaceAccess().getSpaceColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getSource_interfaceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalToscaDsl.g:2286:3: ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_STRING||LA59_0==21) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalToscaDsl.g:2287:4: ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )*
                    {
                    // InternalToscaDsl.g:2287:4: ( (lv_hasOperation_4_0= ruleOperation ) )
                    // InternalToscaDsl.g:2288:5: (lv_hasOperation_4_0= ruleOperation )
                    {
                    // InternalToscaDsl.g:2288:5: (lv_hasOperation_4_0= ruleOperation )
                    // InternalToscaDsl.g:2289:6: lv_hasOperation_4_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getSource_interfaceAccess().getHasOperationOperationParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_hasOperation_4_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSource_interfaceRule());
                    						}
                    						add(
                    							current,
                    							"hasOperation",
                    							lv_hasOperation_4_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:2306:4: (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==15) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalToscaDsl.g:2307:5: otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_35); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getSource_interfaceAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalToscaDsl.g:2311:5: ( (lv_hasOperation_6_0= ruleOperation ) )
                    	    // InternalToscaDsl.g:2312:6: (lv_hasOperation_6_0= ruleOperation )
                    	    {
                    	    // InternalToscaDsl.g:2312:6: (lv_hasOperation_6_0= ruleOperation )
                    	    // InternalToscaDsl.g:2313:7: lv_hasOperation_6_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getSource_interfaceAccess().getHasOperationOperationParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_hasOperation_6_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSource_interfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"hasOperation",
                    	    								lv_hasOperation_6_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSource_interfaceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSource_interface"


    // $ANTLR start "entryRuleTarget_interface"
    // InternalToscaDsl.g:2340:1: entryRuleTarget_interface returns [EObject current=null] : iv_ruleTarget_interface= ruleTarget_interface EOF ;
    public final EObject entryRuleTarget_interface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTarget_interface = null;


        try {
            // InternalToscaDsl.g:2340:57: (iv_ruleTarget_interface= ruleTarget_interface EOF )
            // InternalToscaDsl.g:2341:2: iv_ruleTarget_interface= ruleTarget_interface EOF
            {
             newCompositeNode(grammarAccess.getTarget_interfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTarget_interface=ruleTarget_interface();

            state._fsp--;

             current =iv_ruleTarget_interface; 
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
    // $ANTLR end "entryRuleTarget_interface"


    // $ANTLR start "ruleTarget_interface"
    // InternalToscaDsl.g:2347:1: ruleTarget_interface returns [EObject current=null] : ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' (otherlv_4= 'hasOperation' otherlv_5= '{' ( (lv_hasOperation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleTarget_interface() throws RecognitionException {
        EObject current = null;

        Token lv_interface_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_hasOperation_6_0 = null;

        EObject lv_hasOperation_8_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:2353:2: ( ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' (otherlv_4= 'hasOperation' otherlv_5= '{' ( (lv_hasOperation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalToscaDsl.g:2354:2: ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' (otherlv_4= 'hasOperation' otherlv_5= '{' ( (lv_hasOperation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalToscaDsl.g:2354:2: ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' (otherlv_4= 'hasOperation' otherlv_5= '{' ( (lv_hasOperation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalToscaDsl.g:2355:3: () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' (otherlv_4= 'hasOperation' otherlv_5= '{' ( (lv_hasOperation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalToscaDsl.g:2355:3: ()
            // InternalToscaDsl.g:2356:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTarget_interfaceAccess().getTarget_interfaceAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:2362:3: ( (lv_interface_name_1_0= RULE_STRING ) )
            // InternalToscaDsl.g:2363:4: (lv_interface_name_1_0= RULE_STRING )
            {
            // InternalToscaDsl.g:2363:4: (lv_interface_name_1_0= RULE_STRING )
            // InternalToscaDsl.g:2364:5: lv_interface_name_1_0= RULE_STRING
            {
            lv_interface_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_interface_name_1_0, grammarAccess.getTarget_interfaceAccess().getInterface_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTarget_interfaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"interface_name",
            						lv_interface_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getTarget_interfaceAccess().getSpaceSpaceColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_57); 

            			newLeafNode(otherlv_3, grammarAccess.getTarget_interfaceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalToscaDsl.g:2388:3: (otherlv_4= 'hasOperation' otherlv_5= '{' ( (lv_hasOperation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )* otherlv_9= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==53) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalToscaDsl.g:2389:4: otherlv_4= 'hasOperation' otherlv_5= '{' ( (lv_hasOperation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getTarget_interfaceAccess().getHasOperationKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,11,FOLLOW_35); 

                    				newLeafNode(otherlv_5, grammarAccess.getTarget_interfaceAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalToscaDsl.g:2397:4: ( (lv_hasOperation_6_0= ruleOperation ) )
                    // InternalToscaDsl.g:2398:5: (lv_hasOperation_6_0= ruleOperation )
                    {
                    // InternalToscaDsl.g:2398:5: (lv_hasOperation_6_0= ruleOperation )
                    // InternalToscaDsl.g:2399:6: lv_hasOperation_6_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getTarget_interfaceAccess().getHasOperationOperationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_hasOperation_6_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTarget_interfaceRule());
                    						}
                    						add(
                    							current,
                    							"hasOperation",
                    							lv_hasOperation_6_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:2416:4: (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==15) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalToscaDsl.g:2417:5: otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_35); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getTarget_interfaceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalToscaDsl.g:2421:5: ( (lv_hasOperation_8_0= ruleOperation ) )
                    	    // InternalToscaDsl.g:2422:6: (lv_hasOperation_8_0= ruleOperation )
                    	    {
                    	    // InternalToscaDsl.g:2422:6: (lv_hasOperation_8_0= ruleOperation )
                    	    // InternalToscaDsl.g:2423:7: lv_hasOperation_8_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getTarget_interfaceAccess().getHasOperationOperationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_hasOperation_8_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTarget_interfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"hasOperation",
                    	    								lv_hasOperation_8_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getTarget_interfaceAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getTarget_interfaceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleTarget_interface"


    // $ANTLR start "entryRuleContained_in"
    // InternalToscaDsl.g:2454:1: entryRuleContained_in returns [EObject current=null] : iv_ruleContained_in= ruleContained_in EOF ;
    public final EObject entryRuleContained_in() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContained_in = null;


        try {
            // InternalToscaDsl.g:2454:53: (iv_ruleContained_in= ruleContained_in EOF )
            // InternalToscaDsl.g:2455:2: iv_ruleContained_in= ruleContained_in EOF
            {
             newCompositeNode(grammarAccess.getContained_inRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContained_in=ruleContained_in();

            state._fsp--;

             current =iv_ruleContained_in; 
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
    // $ANTLR end "entryRuleContained_in"


    // $ANTLR start "ruleContained_in"
    // InternalToscaDsl.g:2461:1: ruleContained_in returns [EObject current=null] : ( () otherlv_1= 'Contained_in' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleContained_in() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;
        Token lv_validSource_6_0=null;
        Token otherlv_7=null;
        Token lv_validTarget_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_relation_haSourceInterface_11_0 = null;

        EObject lv_relation_haSourceInterface_13_0 = null;

        EObject lv_relation_hasTargetInterface_17_0 = null;

        EObject lv_relation_hasTargetInterface_19_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:2467:2: ( ( () otherlv_1= 'Contained_in' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalToscaDsl.g:2468:2: ( () otherlv_1= 'Contained_in' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalToscaDsl.g:2468:2: ( () otherlv_1= 'Contained_in' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalToscaDsl.g:2469:3: () otherlv_1= 'Contained_in' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalToscaDsl.g:2469:3: ()
            // InternalToscaDsl.g:2470:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContained_inAccess().getContained_inAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getContained_inAccess().getContained_inKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getContained_inAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalToscaDsl.g:2484:3: (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==36) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalToscaDsl.g:2485:4: otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getContained_inAccess().getTypeKeyword_3_0());
                    			
                    // InternalToscaDsl.g:2489:4: ( (lv_type_4_0= RULE_STRING ) )
                    // InternalToscaDsl.g:2490:5: (lv_type_4_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:2490:5: (lv_type_4_0= RULE_STRING )
                    // InternalToscaDsl.g:2491:6: lv_type_4_0= RULE_STRING
                    {
                    lv_type_4_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

                    						newLeafNode(lv_type_4_0, grammarAccess.getContained_inAccess().getTypeSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContained_inRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:2508:3: (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==55) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalToscaDsl.g:2509:4: otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,55,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getContained_inAccess().getValidSourceKeyword_4_0());
                    			
                    // InternalToscaDsl.g:2513:4: ( (lv_validSource_6_0= RULE_STRING ) )
                    // InternalToscaDsl.g:2514:5: (lv_validSource_6_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:2514:5: (lv_validSource_6_0= RULE_STRING )
                    // InternalToscaDsl.g:2515:6: lv_validSource_6_0= RULE_STRING
                    {
                    lv_validSource_6_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

                    						newLeafNode(lv_validSource_6_0, grammarAccess.getContained_inAccess().getValidSourceSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContained_inRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"validSource",
                    							lv_validSource_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:2532:3: (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==56) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalToscaDsl.g:2533:4: otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,56,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getContained_inAccess().getValidTargetKeyword_5_0());
                    			
                    // InternalToscaDsl.g:2537:4: ( (lv_validTarget_8_0= RULE_STRING ) )
                    // InternalToscaDsl.g:2538:5: (lv_validTarget_8_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:2538:5: (lv_validTarget_8_0= RULE_STRING )
                    // InternalToscaDsl.g:2539:6: lv_validTarget_8_0= RULE_STRING
                    {
                    lv_validTarget_8_0=(Token)match(input,RULE_STRING,FOLLOW_61); 

                    						newLeafNode(lv_validTarget_8_0, grammarAccess.getContained_inAccess().getValidTargetSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContained_inRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"validTarget",
                    							lv_validTarget_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:2556:3: (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==57) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalToscaDsl.g:2557:4: otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,57,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getContained_inAccess().getRelation_haSourceInterfaceKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getContained_inAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalToscaDsl.g:2565:4: ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) )
                    // InternalToscaDsl.g:2566:5: (lv_relation_haSourceInterface_11_0= ruleSource_interface )
                    {
                    // InternalToscaDsl.g:2566:5: (lv_relation_haSourceInterface_11_0= ruleSource_interface )
                    // InternalToscaDsl.g:2567:6: lv_relation_haSourceInterface_11_0= ruleSource_interface
                    {

                    						newCompositeNode(grammarAccess.getContained_inAccess().getRelation_haSourceInterfaceSource_interfaceParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_relation_haSourceInterface_11_0=ruleSource_interface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContained_inRule());
                    						}
                    						add(
                    							current,
                    							"relation_haSourceInterface",
                    							lv_relation_haSourceInterface_11_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Source_interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:2584:4: (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==15) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalToscaDsl.g:2585:5: otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getContained_inAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalToscaDsl.g:2589:5: ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) )
                    	    // InternalToscaDsl.g:2590:6: (lv_relation_haSourceInterface_13_0= ruleSource_interface )
                    	    {
                    	    // InternalToscaDsl.g:2590:6: (lv_relation_haSourceInterface_13_0= ruleSource_interface )
                    	    // InternalToscaDsl.g:2591:7: lv_relation_haSourceInterface_13_0= ruleSource_interface
                    	    {

                    	    							newCompositeNode(grammarAccess.getContained_inAccess().getRelation_haSourceInterfaceSource_interfaceParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_relation_haSourceInterface_13_0=ruleSource_interface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContained_inRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relation_haSourceInterface",
                    	    								lv_relation_haSourceInterface_13_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Source_interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_62); 

                    				newLeafNode(otherlv_14, grammarAccess.getContained_inAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:2614:3: (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==58) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalToscaDsl.g:2615:4: otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,58,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getContained_inAccess().getRelation_hasTargetInterfaceKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getContained_inAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalToscaDsl.g:2623:4: ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) )
                    // InternalToscaDsl.g:2624:5: (lv_relation_hasTargetInterface_17_0= ruleTarget_interface )
                    {
                    // InternalToscaDsl.g:2624:5: (lv_relation_hasTargetInterface_17_0= ruleTarget_interface )
                    // InternalToscaDsl.g:2625:6: lv_relation_hasTargetInterface_17_0= ruleTarget_interface
                    {

                    						newCompositeNode(grammarAccess.getContained_inAccess().getRelation_hasTargetInterfaceTarget_interfaceParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_relation_hasTargetInterface_17_0=ruleTarget_interface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContained_inRule());
                    						}
                    						add(
                    							current,
                    							"relation_hasTargetInterface",
                    							lv_relation_hasTargetInterface_17_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Target_interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:2642:4: (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==15) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalToscaDsl.g:2643:5: otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getContained_inAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalToscaDsl.g:2647:5: ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) )
                    	    // InternalToscaDsl.g:2648:6: (lv_relation_hasTargetInterface_19_0= ruleTarget_interface )
                    	    {
                    	    // InternalToscaDsl.g:2648:6: (lv_relation_hasTargetInterface_19_0= ruleTarget_interface )
                    	    // InternalToscaDsl.g:2649:7: lv_relation_hasTargetInterface_19_0= ruleTarget_interface
                    	    {

                    	    							newCompositeNode(grammarAccess.getContained_inAccess().getRelation_hasTargetInterfaceTarget_interfaceParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_relation_hasTargetInterface_19_0=ruleTarget_interface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContained_inRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relation_hasTargetInterface",
                    	    								lv_relation_hasTargetInterface_19_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Target_interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_20, grammarAccess.getContained_inAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getContained_inAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleContained_in"


    // $ANTLR start "entryRuleConnected_to"
    // InternalToscaDsl.g:2680:1: entryRuleConnected_to returns [EObject current=null] : iv_ruleConnected_to= ruleConnected_to EOF ;
    public final EObject entryRuleConnected_to() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnected_to = null;


        try {
            // InternalToscaDsl.g:2680:53: (iv_ruleConnected_to= ruleConnected_to EOF )
            // InternalToscaDsl.g:2681:2: iv_ruleConnected_to= ruleConnected_to EOF
            {
             newCompositeNode(grammarAccess.getConnected_toRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnected_to=ruleConnected_to();

            state._fsp--;

             current =iv_ruleConnected_to; 
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
    // $ANTLR end "entryRuleConnected_to"


    // $ANTLR start "ruleConnected_to"
    // InternalToscaDsl.g:2687:1: ruleConnected_to returns [EObject current=null] : ( () otherlv_1= 'Connected_to' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleConnected_to() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;
        Token lv_validSource_6_0=null;
        Token otherlv_7=null;
        Token lv_validTarget_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_relation_haSourceInterface_11_0 = null;

        EObject lv_relation_haSourceInterface_13_0 = null;

        EObject lv_relation_hasTargetInterface_17_0 = null;

        EObject lv_relation_hasTargetInterface_19_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:2693:2: ( ( () otherlv_1= 'Connected_to' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalToscaDsl.g:2694:2: ( () otherlv_1= 'Connected_to' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalToscaDsl.g:2694:2: ( () otherlv_1= 'Connected_to' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalToscaDsl.g:2695:3: () otherlv_1= 'Connected_to' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalToscaDsl.g:2695:3: ()
            // InternalToscaDsl.g:2696:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConnected_toAccess().getConnected_toAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getConnected_toAccess().getConnected_toKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getConnected_toAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalToscaDsl.g:2710:3: (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==36) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalToscaDsl.g:2711:4: otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getConnected_toAccess().getTypeKeyword_3_0());
                    			
                    // InternalToscaDsl.g:2715:4: ( (lv_type_4_0= RULE_STRING ) )
                    // InternalToscaDsl.g:2716:5: (lv_type_4_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:2716:5: (lv_type_4_0= RULE_STRING )
                    // InternalToscaDsl.g:2717:6: lv_type_4_0= RULE_STRING
                    {
                    lv_type_4_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

                    						newLeafNode(lv_type_4_0, grammarAccess.getConnected_toAccess().getTypeSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnected_toRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:2734:3: (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==55) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalToscaDsl.g:2735:4: otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,55,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getConnected_toAccess().getValidSourceKeyword_4_0());
                    			
                    // InternalToscaDsl.g:2739:4: ( (lv_validSource_6_0= RULE_STRING ) )
                    // InternalToscaDsl.g:2740:5: (lv_validSource_6_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:2740:5: (lv_validSource_6_0= RULE_STRING )
                    // InternalToscaDsl.g:2741:6: lv_validSource_6_0= RULE_STRING
                    {
                    lv_validSource_6_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

                    						newLeafNode(lv_validSource_6_0, grammarAccess.getConnected_toAccess().getValidSourceSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnected_toRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"validSource",
                    							lv_validSource_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:2758:3: (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==56) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalToscaDsl.g:2759:4: otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,56,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getConnected_toAccess().getValidTargetKeyword_5_0());
                    			
                    // InternalToscaDsl.g:2763:4: ( (lv_validTarget_8_0= RULE_STRING ) )
                    // InternalToscaDsl.g:2764:5: (lv_validTarget_8_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:2764:5: (lv_validTarget_8_0= RULE_STRING )
                    // InternalToscaDsl.g:2765:6: lv_validTarget_8_0= RULE_STRING
                    {
                    lv_validTarget_8_0=(Token)match(input,RULE_STRING,FOLLOW_61); 

                    						newLeafNode(lv_validTarget_8_0, grammarAccess.getConnected_toAccess().getValidTargetSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnected_toRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"validTarget",
                    							lv_validTarget_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:2782:3: (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==57) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalToscaDsl.g:2783:4: otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,57,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getConnected_toAccess().getRelation_haSourceInterfaceKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getConnected_toAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalToscaDsl.g:2791:4: ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) )
                    // InternalToscaDsl.g:2792:5: (lv_relation_haSourceInterface_11_0= ruleSource_interface )
                    {
                    // InternalToscaDsl.g:2792:5: (lv_relation_haSourceInterface_11_0= ruleSource_interface )
                    // InternalToscaDsl.g:2793:6: lv_relation_haSourceInterface_11_0= ruleSource_interface
                    {

                    						newCompositeNode(grammarAccess.getConnected_toAccess().getRelation_haSourceInterfaceSource_interfaceParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_relation_haSourceInterface_11_0=ruleSource_interface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnected_toRule());
                    						}
                    						add(
                    							current,
                    							"relation_haSourceInterface",
                    							lv_relation_haSourceInterface_11_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Source_interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:2810:4: (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==15) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalToscaDsl.g:2811:5: otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getConnected_toAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalToscaDsl.g:2815:5: ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) )
                    	    // InternalToscaDsl.g:2816:6: (lv_relation_haSourceInterface_13_0= ruleSource_interface )
                    	    {
                    	    // InternalToscaDsl.g:2816:6: (lv_relation_haSourceInterface_13_0= ruleSource_interface )
                    	    // InternalToscaDsl.g:2817:7: lv_relation_haSourceInterface_13_0= ruleSource_interface
                    	    {

                    	    							newCompositeNode(grammarAccess.getConnected_toAccess().getRelation_haSourceInterfaceSource_interfaceParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_relation_haSourceInterface_13_0=ruleSource_interface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConnected_toRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relation_haSourceInterface",
                    	    								lv_relation_haSourceInterface_13_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Source_interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_62); 

                    				newLeafNode(otherlv_14, grammarAccess.getConnected_toAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:2840:3: (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==58) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalToscaDsl.g:2841:4: otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,58,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getConnected_toAccess().getRelation_hasTargetInterfaceKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getConnected_toAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalToscaDsl.g:2849:4: ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) )
                    // InternalToscaDsl.g:2850:5: (lv_relation_hasTargetInterface_17_0= ruleTarget_interface )
                    {
                    // InternalToscaDsl.g:2850:5: (lv_relation_hasTargetInterface_17_0= ruleTarget_interface )
                    // InternalToscaDsl.g:2851:6: lv_relation_hasTargetInterface_17_0= ruleTarget_interface
                    {

                    						newCompositeNode(grammarAccess.getConnected_toAccess().getRelation_hasTargetInterfaceTarget_interfaceParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_relation_hasTargetInterface_17_0=ruleTarget_interface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnected_toRule());
                    						}
                    						add(
                    							current,
                    							"relation_hasTargetInterface",
                    							lv_relation_hasTargetInterface_17_0,
                    							"org.xtext.example.mydsl.ToscaDsl.Target_interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:2868:4: (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==15) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalToscaDsl.g:2869:5: otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getConnected_toAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalToscaDsl.g:2873:5: ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) )
                    	    // InternalToscaDsl.g:2874:6: (lv_relation_hasTargetInterface_19_0= ruleTarget_interface )
                    	    {
                    	    // InternalToscaDsl.g:2874:6: (lv_relation_hasTargetInterface_19_0= ruleTarget_interface )
                    	    // InternalToscaDsl.g:2875:7: lv_relation_hasTargetInterface_19_0= ruleTarget_interface
                    	    {

                    	    							newCompositeNode(grammarAccess.getConnected_toAccess().getRelation_hasTargetInterfaceTarget_interfaceParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_relation_hasTargetInterface_19_0=ruleTarget_interface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConnected_toRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relation_hasTargetInterface",
                    	    								lv_relation_hasTargetInterface_19_0,
                    	    								"org.xtext.example.mydsl.ToscaDsl.Target_interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_20, grammarAccess.getConnected_toAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getConnected_toAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleConnected_to"


    // $ANTLR start "entryRuleEInt"
    // InternalToscaDsl.g:2906:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalToscaDsl.g:2906:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalToscaDsl.g:2907:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalToscaDsl.g:2913:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:2919:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalToscaDsl.g:2920:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalToscaDsl.g:2920:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalToscaDsl.g:2921:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalToscaDsl.g:2921:3: (kw= '-' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==60) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalToscaDsl.g:2922:4: kw= '-'
                    {
                    kw=(Token)match(input,60,FOLLOW_63); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000A3000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000A2000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C40000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000006440000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000007F8040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000007F0040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000007E0040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000007C0040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000780040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000700040000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000600040000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0840000000000800L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000240010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800040010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000003F000040000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000003E000040000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000003C000040000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000038000040000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000030000040000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000780000040000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000700000040000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000600000040000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000400000040000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0007800008040000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0007800000040000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0007000000040000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0006000000040000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0004000000040000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x1000000000000020L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0020000000040000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0780001000040000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0780000000040000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0700000000040000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0600000000040000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0400000000040000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000020L});

}