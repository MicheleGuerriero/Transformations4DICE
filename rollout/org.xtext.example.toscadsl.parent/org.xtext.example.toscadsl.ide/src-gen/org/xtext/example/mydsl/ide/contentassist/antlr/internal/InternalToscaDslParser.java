package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.ToscaDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalToscaDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'\"tosca_definitions_version\" :'", "'}'", "',\\n\"description\" :'", "',\\n\"imports\" :'", "'['", "']'", "','", "',\\n\"outputs\" :'", "',\\n\"inputs\" :'", "',\\n\"nodeTemplates\" :'", "',\\n\"realtionships\" :'", "',\\n\"groups\" :'", "',\\n\"policies\" :'", "':'", "'\"type\" :'", "',\\n\"relationships\" :'", "',\\n\"interfaces\" :'", "',\\n\"properties\" :'", "',\\n\"attributes\" :'", "',\\n\"requirements\" :'", "',\\n\"capabilities\" :'", "',\\n\"target\" :'", "',\\n\"source_interfaces\" :'", "',\\n\"target_iterfaces\" :'", "',\\n\"targets\" :'", "'\\n\"operations\" :'", "'\"capabiity\" :'", "',\\n\"node\" :'"
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

    	public void setGrammarAccess(ToscaDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTopologyTemplate"
    // InternalToscaDsl.g:53:1: entryRuleTopologyTemplate : ruleTopologyTemplate EOF ;
    public final void entryRuleTopologyTemplate() throws RecognitionException {
        try {
            // InternalToscaDsl.g:54:1: ( ruleTopologyTemplate EOF )
            // InternalToscaDsl.g:55:1: ruleTopologyTemplate EOF
            {
             before(grammarAccess.getTopologyTemplateRule()); 
            pushFollow(FOLLOW_1);
            ruleTopologyTemplate();

            state._fsp--;

             after(grammarAccess.getTopologyTemplateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTopologyTemplate"


    // $ANTLR start "ruleTopologyTemplate"
    // InternalToscaDsl.g:62:1: ruleTopologyTemplate : ( ( rule__TopologyTemplate__Group__0 ) ) ;
    public final void ruleTopologyTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:66:2: ( ( ( rule__TopologyTemplate__Group__0 ) ) )
            // InternalToscaDsl.g:67:2: ( ( rule__TopologyTemplate__Group__0 ) )
            {
            // InternalToscaDsl.g:67:2: ( ( rule__TopologyTemplate__Group__0 ) )
            // InternalToscaDsl.g:68:3: ( rule__TopologyTemplate__Group__0 )
            {
             before(grammarAccess.getTopologyTemplateAccess().getGroup()); 
            // InternalToscaDsl.g:69:3: ( rule__TopologyTemplate__Group__0 )
            // InternalToscaDsl.g:69:4: rule__TopologyTemplate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTopologyTemplateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopologyTemplate"


    // $ANTLR start "entryRuleEString"
    // InternalToscaDsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalToscaDsl.g:79:1: ( ruleEString EOF )
            // InternalToscaDsl.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalToscaDsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalToscaDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalToscaDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalToscaDsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalToscaDsl.g:94:3: ( rule__EString__Alternatives )
            // InternalToscaDsl.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleImport"
    // InternalToscaDsl.g:103:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalToscaDsl.g:104:1: ( ruleImport EOF )
            // InternalToscaDsl.g:105:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalToscaDsl.g:112:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:116:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalToscaDsl.g:117:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalToscaDsl.g:117:2: ( ( rule__Import__Group__0 ) )
            // InternalToscaDsl.g:118:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalToscaDsl.g:119:3: ( rule__Import__Group__0 )
            // InternalToscaDsl.g:119:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleParameter"
    // InternalToscaDsl.g:128:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalToscaDsl.g:129:1: ( ruleParameter EOF )
            // InternalToscaDsl.g:130:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalToscaDsl.g:137:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:141:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalToscaDsl.g:142:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalToscaDsl.g:142:2: ( ( rule__Parameter__Group__0 ) )
            // InternalToscaDsl.g:143:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalToscaDsl.g:144:3: ( rule__Parameter__Group__0 )
            // InternalToscaDsl.g:144:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleNodeTemplate"
    // InternalToscaDsl.g:153:1: entryRuleNodeTemplate : ruleNodeTemplate EOF ;
    public final void entryRuleNodeTemplate() throws RecognitionException {
        try {
            // InternalToscaDsl.g:154:1: ( ruleNodeTemplate EOF )
            // InternalToscaDsl.g:155:1: ruleNodeTemplate EOF
            {
             before(grammarAccess.getNodeTemplateRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeTemplate();

            state._fsp--;

             after(grammarAccess.getNodeTemplateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeTemplate"


    // $ANTLR start "ruleNodeTemplate"
    // InternalToscaDsl.g:162:1: ruleNodeTemplate : ( ( rule__NodeTemplate__Group__0 ) ) ;
    public final void ruleNodeTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:166:2: ( ( ( rule__NodeTemplate__Group__0 ) ) )
            // InternalToscaDsl.g:167:2: ( ( rule__NodeTemplate__Group__0 ) )
            {
            // InternalToscaDsl.g:167:2: ( ( rule__NodeTemplate__Group__0 ) )
            // InternalToscaDsl.g:168:3: ( rule__NodeTemplate__Group__0 )
            {
             before(grammarAccess.getNodeTemplateAccess().getGroup()); 
            // InternalToscaDsl.g:169:3: ( rule__NodeTemplate__Group__0 )
            // InternalToscaDsl.g:169:4: rule__NodeTemplate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeTemplateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeTemplate"


    // $ANTLR start "entryRuleRelationship"
    // InternalToscaDsl.g:178:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // InternalToscaDsl.g:179:1: ( ruleRelationship EOF )
            // InternalToscaDsl.g:180:1: ruleRelationship EOF
            {
             before(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getRelationshipRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalToscaDsl.g:187:1: ruleRelationship : ( ( rule__Relationship__Group__0 ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:191:2: ( ( ( rule__Relationship__Group__0 ) ) )
            // InternalToscaDsl.g:192:2: ( ( rule__Relationship__Group__0 ) )
            {
            // InternalToscaDsl.g:192:2: ( ( rule__Relationship__Group__0 ) )
            // InternalToscaDsl.g:193:3: ( rule__Relationship__Group__0 )
            {
             before(grammarAccess.getRelationshipAccess().getGroup()); 
            // InternalToscaDsl.g:194:3: ( rule__Relationship__Group__0 )
            // InternalToscaDsl.g:194:4: rule__Relationship__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleGroup"
    // InternalToscaDsl.g:203:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // InternalToscaDsl.g:204:1: ( ruleGroup EOF )
            // InternalToscaDsl.g:205:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalToscaDsl.g:212:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:216:2: ( ( ( rule__Group__Group__0 ) ) )
            // InternalToscaDsl.g:217:2: ( ( rule__Group__Group__0 ) )
            {
            // InternalToscaDsl.g:217:2: ( ( rule__Group__Group__0 ) )
            // InternalToscaDsl.g:218:3: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // InternalToscaDsl.g:219:3: ( rule__Group__Group__0 )
            // InternalToscaDsl.g:219:4: rule__Group__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRulePolicy"
    // InternalToscaDsl.g:228:1: entryRulePolicy : rulePolicy EOF ;
    public final void entryRulePolicy() throws RecognitionException {
        try {
            // InternalToscaDsl.g:229:1: ( rulePolicy EOF )
            // InternalToscaDsl.g:230:1: rulePolicy EOF
            {
             before(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_1);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getPolicyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // InternalToscaDsl.g:237:1: rulePolicy : ( ( rule__Policy__Group__0 ) ) ;
    public final void rulePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:241:2: ( ( ( rule__Policy__Group__0 ) ) )
            // InternalToscaDsl.g:242:2: ( ( rule__Policy__Group__0 ) )
            {
            // InternalToscaDsl.g:242:2: ( ( rule__Policy__Group__0 ) )
            // InternalToscaDsl.g:243:3: ( rule__Policy__Group__0 )
            {
             before(grammarAccess.getPolicyAccess().getGroup()); 
            // InternalToscaDsl.g:244:3: ( rule__Policy__Group__0 )
            // InternalToscaDsl.g:244:4: rule__Policy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleInterface"
    // InternalToscaDsl.g:253:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // InternalToscaDsl.g:254:1: ( ruleInterface EOF )
            // InternalToscaDsl.g:255:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalToscaDsl.g:262:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:266:2: ( ( ( rule__Interface__Group__0 ) ) )
            // InternalToscaDsl.g:267:2: ( ( rule__Interface__Group__0 ) )
            {
            // InternalToscaDsl.g:267:2: ( ( rule__Interface__Group__0 ) )
            // InternalToscaDsl.g:268:3: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // InternalToscaDsl.g:269:3: ( rule__Interface__Group__0 )
            // InternalToscaDsl.g:269:4: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleProperty"
    // InternalToscaDsl.g:278:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalToscaDsl.g:279:1: ( ruleProperty EOF )
            // InternalToscaDsl.g:280:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalToscaDsl.g:287:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:291:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalToscaDsl.g:292:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalToscaDsl.g:292:2: ( ( rule__Property__Group__0 ) )
            // InternalToscaDsl.g:293:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalToscaDsl.g:294:3: ( rule__Property__Group__0 )
            // InternalToscaDsl.g:294:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleAttribute"
    // InternalToscaDsl.g:303:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalToscaDsl.g:304:1: ( ruleAttribute EOF )
            // InternalToscaDsl.g:305:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalToscaDsl.g:312:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:316:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalToscaDsl.g:317:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalToscaDsl.g:317:2: ( ( rule__Attribute__Group__0 ) )
            // InternalToscaDsl.g:318:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalToscaDsl.g:319:3: ( rule__Attribute__Group__0 )
            // InternalToscaDsl.g:319:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRequirement"
    // InternalToscaDsl.g:328:1: entryRuleRequirement : ruleRequirement EOF ;
    public final void entryRuleRequirement() throws RecognitionException {
        try {
            // InternalToscaDsl.g:329:1: ( ruleRequirement EOF )
            // InternalToscaDsl.g:330:1: ruleRequirement EOF
            {
             before(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            ruleRequirement();

            state._fsp--;

             after(grammarAccess.getRequirementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalToscaDsl.g:337:1: ruleRequirement : ( ( rule__Requirement__Group__0 ) ) ;
    public final void ruleRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:341:2: ( ( ( rule__Requirement__Group__0 ) ) )
            // InternalToscaDsl.g:342:2: ( ( rule__Requirement__Group__0 ) )
            {
            // InternalToscaDsl.g:342:2: ( ( rule__Requirement__Group__0 ) )
            // InternalToscaDsl.g:343:3: ( rule__Requirement__Group__0 )
            {
             before(grammarAccess.getRequirementAccess().getGroup()); 
            // InternalToscaDsl.g:344:3: ( rule__Requirement__Group__0 )
            // InternalToscaDsl.g:344:4: rule__Requirement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequirementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleCapability"
    // InternalToscaDsl.g:353:1: entryRuleCapability : ruleCapability EOF ;
    public final void entryRuleCapability() throws RecognitionException {
        try {
            // InternalToscaDsl.g:354:1: ( ruleCapability EOF )
            // InternalToscaDsl.g:355:1: ruleCapability EOF
            {
             before(grammarAccess.getCapabilityRule()); 
            pushFollow(FOLLOW_1);
            ruleCapability();

            state._fsp--;

             after(grammarAccess.getCapabilityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCapability"


    // $ANTLR start "ruleCapability"
    // InternalToscaDsl.g:362:1: ruleCapability : ( ( rule__Capability__Group__0 ) ) ;
    public final void ruleCapability() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:366:2: ( ( ( rule__Capability__Group__0 ) ) )
            // InternalToscaDsl.g:367:2: ( ( rule__Capability__Group__0 ) )
            {
            // InternalToscaDsl.g:367:2: ( ( rule__Capability__Group__0 ) )
            // InternalToscaDsl.g:368:3: ( rule__Capability__Group__0 )
            {
             before(grammarAccess.getCapabilityAccess().getGroup()); 
            // InternalToscaDsl.g:369:3: ( rule__Capability__Group__0 )
            // InternalToscaDsl.g:369:4: rule__Capability__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Capability__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCapability"


    // $ANTLR start "entryRuleOperation"
    // InternalToscaDsl.g:378:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalToscaDsl.g:379:1: ( ruleOperation EOF )
            // InternalToscaDsl.g:380:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalToscaDsl.g:387:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:391:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalToscaDsl.g:392:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalToscaDsl.g:392:2: ( ( rule__Operation__Group__0 ) )
            // InternalToscaDsl.g:393:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalToscaDsl.g:394:3: ( rule__Operation__Group__0 )
            // InternalToscaDsl.g:394:4: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalToscaDsl.g:402:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:406:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalToscaDsl.g:407:2: ( RULE_STRING )
                    {
                    // InternalToscaDsl.g:407:2: ( RULE_STRING )
                    // InternalToscaDsl.g:408:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalToscaDsl.g:413:2: ( RULE_ID )
                    {
                    // InternalToscaDsl.g:413:2: ( RULE_ID )
                    // InternalToscaDsl.g:414:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TopologyTemplate__Group__0"
    // InternalToscaDsl.g:423:1: rule__TopologyTemplate__Group__0 : rule__TopologyTemplate__Group__0__Impl rule__TopologyTemplate__Group__1 ;
    public final void rule__TopologyTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:427:1: ( rule__TopologyTemplate__Group__0__Impl rule__TopologyTemplate__Group__1 )
            // InternalToscaDsl.g:428:2: rule__TopologyTemplate__Group__0__Impl rule__TopologyTemplate__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TopologyTemplate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__0"


    // $ANTLR start "rule__TopologyTemplate__Group__0__Impl"
    // InternalToscaDsl.g:435:1: rule__TopologyTemplate__Group__0__Impl : ( '{' ) ;
    public final void rule__TopologyTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:439:1: ( ( '{' ) )
            // InternalToscaDsl.g:440:1: ( '{' )
            {
            // InternalToscaDsl.g:440:1: ( '{' )
            // InternalToscaDsl.g:441:2: '{'
            {
             before(grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__0__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group__1"
    // InternalToscaDsl.g:450:1: rule__TopologyTemplate__Group__1 : rule__TopologyTemplate__Group__1__Impl rule__TopologyTemplate__Group__2 ;
    public final void rule__TopologyTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:454:1: ( rule__TopologyTemplate__Group__1__Impl rule__TopologyTemplate__Group__2 )
            // InternalToscaDsl.g:455:2: rule__TopologyTemplate__Group__1__Impl rule__TopologyTemplate__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TopologyTemplate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__1"


    // $ANTLR start "rule__TopologyTemplate__Group__1__Impl"
    // InternalToscaDsl.g:462:1: rule__TopologyTemplate__Group__1__Impl : ( '\"tosca_definitions_version\" :' ) ;
    public final void rule__TopologyTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:466:1: ( ( '\"tosca_definitions_version\" :' ) )
            // InternalToscaDsl.g:467:1: ( '\"tosca_definitions_version\" :' )
            {
            // InternalToscaDsl.g:467:1: ( '\"tosca_definitions_version\" :' )
            // InternalToscaDsl.g:468:2: '\"tosca_definitions_version\" :'
            {
             before(grammarAccess.getTopologyTemplateAccess().getTosca_definitions_versionKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getTosca_definitions_versionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__1__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group__2"
    // InternalToscaDsl.g:477:1: rule__TopologyTemplate__Group__2 : rule__TopologyTemplate__Group__2__Impl rule__TopologyTemplate__Group__3 ;
    public final void rule__TopologyTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:481:1: ( rule__TopologyTemplate__Group__2__Impl rule__TopologyTemplate__Group__3 )
            // InternalToscaDsl.g:482:2: rule__TopologyTemplate__Group__2__Impl rule__TopologyTemplate__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__TopologyTemplate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__2"


    // $ANTLR start "rule__TopologyTemplate__Group__2__Impl"
    // InternalToscaDsl.g:489:1: rule__TopologyTemplate__Group__2__Impl : ( ( rule__TopologyTemplate__Tosca_definitions_versionAssignment_2 ) ) ;
    public final void rule__TopologyTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:493:1: ( ( ( rule__TopologyTemplate__Tosca_definitions_versionAssignment_2 ) ) )
            // InternalToscaDsl.g:494:1: ( ( rule__TopologyTemplate__Tosca_definitions_versionAssignment_2 ) )
            {
            // InternalToscaDsl.g:494:1: ( ( rule__TopologyTemplate__Tosca_definitions_versionAssignment_2 ) )
            // InternalToscaDsl.g:495:2: ( rule__TopologyTemplate__Tosca_definitions_versionAssignment_2 )
            {
             before(grammarAccess.getTopologyTemplateAccess().getTosca_definitions_versionAssignment_2()); 
            // InternalToscaDsl.g:496:2: ( rule__TopologyTemplate__Tosca_definitions_versionAssignment_2 )
            // InternalToscaDsl.g:496:3: rule__TopologyTemplate__Tosca_definitions_versionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Tosca_definitions_versionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTopologyTemplateAccess().getTosca_definitions_versionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__2__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group__3"
    // InternalToscaDsl.g:504:1: rule__TopologyTemplate__Group__3 : rule__TopologyTemplate__Group__3__Impl rule__TopologyTemplate__Group__4 ;
    public final void rule__TopologyTemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:508:1: ( rule__TopologyTemplate__Group__3__Impl rule__TopologyTemplate__Group__4 )
            // InternalToscaDsl.g:509:2: rule__TopologyTemplate__Group__3__Impl rule__TopologyTemplate__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__TopologyTemplate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__3"


    // $ANTLR start "rule__TopologyTemplate__Group__3__Impl"
    // InternalToscaDsl.g:516:1: rule__TopologyTemplate__Group__3__Impl : ( ( rule__TopologyTemplate__Group_3__0 )? ) ;
    public final void rule__TopologyTemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:520:1: ( ( ( rule__TopologyTemplate__Group_3__0 )? ) )
            // InternalToscaDsl.g:521:1: ( ( rule__TopologyTemplate__Group_3__0 )? )
            {
            // InternalToscaDsl.g:521:1: ( ( rule__TopologyTemplate__Group_3__0 )? )
            // InternalToscaDsl.g:522:2: ( rule__TopologyTemplate__Group_3__0 )?
            {
             before(grammarAccess.getTopologyTemplateAccess().getGroup_3()); 
            // InternalToscaDsl.g:523:2: ( rule__TopologyTemplate__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalToscaDsl.g:523:3: rule__TopologyTemplate__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TopologyTemplate__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTopologyTemplateAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__3__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group__4"
    // InternalToscaDsl.g:531:1: rule__TopologyTemplate__Group__4 : rule__TopologyTemplate__Group__4__Impl rule__TopologyTemplate__Group__5 ;
    public final void rule__TopologyTemplate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:535:1: ( rule__TopologyTemplate__Group__4__Impl rule__TopologyTemplate__Group__5 )
            // InternalToscaDsl.g:536:2: rule__TopologyTemplate__Group__4__Impl rule__TopologyTemplate__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__TopologyTemplate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__4"


    // $ANTLR start "rule__TopologyTemplate__Group__4__Impl"
    // InternalToscaDsl.g:543:1: rule__TopologyTemplate__Group__4__Impl : ( ( rule__TopologyTemplate__Group_4__0 )? ) ;
    public final void rule__TopologyTemplate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:547:1: ( ( ( rule__TopologyTemplate__Group_4__0 )? ) )
            // InternalToscaDsl.g:548:1: ( ( rule__TopologyTemplate__Group_4__0 )? )
            {
            // InternalToscaDsl.g:548:1: ( ( rule__TopologyTemplate__Group_4__0 )? )
            // InternalToscaDsl.g:549:2: ( rule__TopologyTemplate__Group_4__0 )?
            {
             before(grammarAccess.getTopologyTemplateAccess().getGroup_4()); 
            // InternalToscaDsl.g:550:2: ( rule__TopologyTemplate__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalToscaDsl.g:550:3: rule__TopologyTemplate__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TopologyTemplate__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTopologyTemplateAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__4__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group__5"
    // InternalToscaDsl.g:558:1: rule__TopologyTemplate__Group__5 : rule__TopologyTemplate__Group__5__Impl rule__TopologyTemplate__Group__6 ;
    public final void rule__TopologyTemplate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:562:1: ( rule__TopologyTemplate__Group__5__Impl rule__TopologyTemplate__Group__6 )
            // InternalToscaDsl.g:563:2: rule__TopologyTemplate__Group__5__Impl rule__TopologyTemplate__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__TopologyTemplate__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__5"


    // $ANTLR start "rule__TopologyTemplate__Group__5__Impl"
    // InternalToscaDsl.g:570:1: rule__TopologyTemplate__Group__5__Impl : ( ( rule__TopologyTemplate__Group_5__0 )? ) ;
    public final void rule__TopologyTemplate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:574:1: ( ( ( rule__TopologyTemplate__Group_5__0 )? ) )
            // InternalToscaDsl.g:575:1: ( ( rule__TopologyTemplate__Group_5__0 )? )
            {
            // InternalToscaDsl.g:575:1: ( ( rule__TopologyTemplate__Group_5__0 )? )
            // InternalToscaDsl.g:576:2: ( rule__TopologyTemplate__Group_5__0 )?
            {
             before(grammarAccess.getTopologyTemplateAccess().getGroup_5()); 
            // InternalToscaDsl.g:577:2: ( rule__TopologyTemplate__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalToscaDsl.g:577:3: rule__TopologyTemplate__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TopologyTemplate__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTopologyTemplateAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__5__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group__6"
    // InternalToscaDsl.g:585:1: rule__TopologyTemplate__Group__6 : rule__TopologyTemplate__Group__6__Impl rule__TopologyTemplate__Group__7 ;
    public final void rule__TopologyTemplate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:589:1: ( rule__TopologyTemplate__Group__6__Impl rule__TopologyTemplate__Group__7 )
            // InternalToscaDsl.g:590:2: rule__TopologyTemplate__Group__6__Impl rule__TopologyTemplate__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__TopologyTemplate__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__6"


    // $ANTLR start "rule__TopologyTemplate__Group__6__Impl"
    // InternalToscaDsl.g:597:1: rule__TopologyTemplate__Group__6__Impl : ( ( rule__TopologyTemplate__Group_6__0 )? ) ;
    public final void rule__TopologyTemplate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:601:1: ( ( ( rule__TopologyTemplate__Group_6__0 )? ) )
            // InternalToscaDsl.g:602:1: ( ( rule__TopologyTemplate__Group_6__0 )? )
            {
            // InternalToscaDsl.g:602:1: ( ( rule__TopologyTemplate__Group_6__0 )? )
            // InternalToscaDsl.g:603:2: ( rule__TopologyTemplate__Group_6__0 )?
            {
             before(grammarAccess.getTopologyTemplateAccess().getGroup_6()); 
            // InternalToscaDsl.g:604:2: ( rule__TopologyTemplate__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalToscaDsl.g:604:3: rule__TopologyTemplate__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TopologyTemplate__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTopologyTemplateAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__6__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group__7"
    // InternalToscaDsl.g:612:1: rule__TopologyTemplate__Group__7 : rule__TopologyTemplate__Group__7__Impl rule__TopologyTemplate__Group__8 ;
    public final void rule__TopologyTemplate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:616:1: ( rule__TopologyTemplate__Group__7__Impl rule__TopologyTemplate__Group__8 )
            // InternalToscaDsl.g:617:2: rule__TopologyTemplate__Group__7__Impl rule__TopologyTemplate__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__TopologyTemplate__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__7"


    // $ANTLR start "rule__TopologyTemplate__Group__7__Impl"
    // InternalToscaDsl.g:624:1: rule__TopologyTemplate__Group__7__Impl : ( ( rule__TopologyTemplate__Group_7__0 )? ) ;
    public final void rule__TopologyTemplate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:628:1: ( ( ( rule__TopologyTemplate__Group_7__0 )? ) )
            // InternalToscaDsl.g:629:1: ( ( rule__TopologyTemplate__Group_7__0 )? )
            {
            // InternalToscaDsl.g:629:1: ( ( rule__TopologyTemplate__Group_7__0 )? )
            // InternalToscaDsl.g:630:2: ( rule__TopologyTemplate__Group_7__0 )?
            {
             before(grammarAccess.getTopologyTemplateAccess().getGroup_7()); 
            // InternalToscaDsl.g:631:2: ( rule__TopologyTemplate__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalToscaDsl.g:631:3: rule__TopologyTemplate__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TopologyTemplate__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTopologyTemplateAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__7__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group__8"
    // InternalToscaDsl.g:639:1: rule__TopologyTemplate__Group__8 : rule__TopologyTemplate__Group__8__Impl rule__TopologyTemplate__Group__9 ;
    public final void rule__TopologyTemplate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:643:1: ( rule__TopologyTemplate__Group__8__Impl rule__TopologyTemplate__Group__9 )
            // InternalToscaDsl.g:644:2: rule__TopologyTemplate__Group__8__Impl rule__TopologyTemplate__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__TopologyTemplate__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__8"


    // $ANTLR start "rule__TopologyTemplate__Group__8__Impl"
    // InternalToscaDsl.g:651:1: rule__TopologyTemplate__Group__8__Impl : ( ( rule__TopologyTemplate__Group_8__0 )? ) ;
    public final void rule__TopologyTemplate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:655:1: ( ( ( rule__TopologyTemplate__Group_8__0 )? ) )
            // InternalToscaDsl.g:656:1: ( ( rule__TopologyTemplate__Group_8__0 )? )
            {
            // InternalToscaDsl.g:656:1: ( ( rule__TopologyTemplate__Group_8__0 )? )
            // InternalToscaDsl.g:657:2: ( rule__TopologyTemplate__Group_8__0 )?
            {
             before(grammarAccess.getTopologyTemplateAccess().getGroup_8()); 
            // InternalToscaDsl.g:658:2: ( rule__TopologyTemplate__Group_8__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalToscaDsl.g:658:3: rule__TopologyTemplate__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TopologyTemplate__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTopologyTemplateAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__8__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group__9"
    // InternalToscaDsl.g:666:1: rule__TopologyTemplate__Group__9 : rule__TopologyTemplate__Group__9__Impl rule__TopologyTemplate__Group__10 ;
    public final void rule__TopologyTemplate__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:670:1: ( rule__TopologyTemplate__Group__9__Impl rule__TopologyTemplate__Group__10 )
            // InternalToscaDsl.g:671:2: rule__TopologyTemplate__Group__9__Impl rule__TopologyTemplate__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__TopologyTemplate__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__9"


    // $ANTLR start "rule__TopologyTemplate__Group__9__Impl"
    // InternalToscaDsl.g:678:1: rule__TopologyTemplate__Group__9__Impl : ( ( rule__TopologyTemplate__Group_9__0 )? ) ;
    public final void rule__TopologyTemplate__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:682:1: ( ( ( rule__TopologyTemplate__Group_9__0 )? ) )
            // InternalToscaDsl.g:683:1: ( ( rule__TopologyTemplate__Group_9__0 )? )
            {
            // InternalToscaDsl.g:683:1: ( ( rule__TopologyTemplate__Group_9__0 )? )
            // InternalToscaDsl.g:684:2: ( rule__TopologyTemplate__Group_9__0 )?
            {
             before(grammarAccess.getTopologyTemplateAccess().getGroup_9()); 
            // InternalToscaDsl.g:685:2: ( rule__TopologyTemplate__Group_9__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalToscaDsl.g:685:3: rule__TopologyTemplate__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TopologyTemplate__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTopologyTemplateAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__9__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group__10"
    // InternalToscaDsl.g:693:1: rule__TopologyTemplate__Group__10 : rule__TopologyTemplate__Group__10__Impl rule__TopologyTemplate__Group__11 ;
    public final void rule__TopologyTemplate__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:697:1: ( rule__TopologyTemplate__Group__10__Impl rule__TopologyTemplate__Group__11 )
            // InternalToscaDsl.g:698:2: rule__TopologyTemplate__Group__10__Impl rule__TopologyTemplate__Group__11
            {
            pushFollow(FOLLOW_5);
            rule__TopologyTemplate__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__10"


    // $ANTLR start "rule__TopologyTemplate__Group__10__Impl"
    // InternalToscaDsl.g:705:1: rule__TopologyTemplate__Group__10__Impl : ( ( rule__TopologyTemplate__Group_10__0 )? ) ;
    public final void rule__TopologyTemplate__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:709:1: ( ( ( rule__TopologyTemplate__Group_10__0 )? ) )
            // InternalToscaDsl.g:710:1: ( ( rule__TopologyTemplate__Group_10__0 )? )
            {
            // InternalToscaDsl.g:710:1: ( ( rule__TopologyTemplate__Group_10__0 )? )
            // InternalToscaDsl.g:711:2: ( rule__TopologyTemplate__Group_10__0 )?
            {
             before(grammarAccess.getTopologyTemplateAccess().getGroup_10()); 
            // InternalToscaDsl.g:712:2: ( rule__TopologyTemplate__Group_10__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalToscaDsl.g:712:3: rule__TopologyTemplate__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TopologyTemplate__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTopologyTemplateAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__10__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group__11"
    // InternalToscaDsl.g:720:1: rule__TopologyTemplate__Group__11 : rule__TopologyTemplate__Group__11__Impl ;
    public final void rule__TopologyTemplate__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:724:1: ( rule__TopologyTemplate__Group__11__Impl )
            // InternalToscaDsl.g:725:2: rule__TopologyTemplate__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__11"


    // $ANTLR start "rule__TopologyTemplate__Group__11__Impl"
    // InternalToscaDsl.g:731:1: rule__TopologyTemplate__Group__11__Impl : ( '}' ) ;
    public final void rule__TopologyTemplate__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:735:1: ( ( '}' ) )
            // InternalToscaDsl.g:736:1: ( '}' )
            {
            // InternalToscaDsl.g:736:1: ( '}' )
            // InternalToscaDsl.g:737:2: '}'
            {
             before(grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_11()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group__11__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_3__0"
    // InternalToscaDsl.g:747:1: rule__TopologyTemplate__Group_3__0 : rule__TopologyTemplate__Group_3__0__Impl rule__TopologyTemplate__Group_3__1 ;
    public final void rule__TopologyTemplate__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:751:1: ( rule__TopologyTemplate__Group_3__0__Impl rule__TopologyTemplate__Group_3__1 )
            // InternalToscaDsl.g:752:2: rule__TopologyTemplate__Group_3__0__Impl rule__TopologyTemplate__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__TopologyTemplate__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_3__0"


    // $ANTLR start "rule__TopologyTemplate__Group_3__0__Impl"
    // InternalToscaDsl.g:759:1: rule__TopologyTemplate__Group_3__0__Impl : ( ',\\n\"description\" :' ) ;
    public final void rule__TopologyTemplate__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:763:1: ( ( ',\\n\"description\" :' ) )
            // InternalToscaDsl.g:764:1: ( ',\\n\"description\" :' )
            {
            // InternalToscaDsl.g:764:1: ( ',\\n\"description\" :' )
            // InternalToscaDsl.g:765:2: ',\\n\"description\" :'
            {
             before(grammarAccess.getTopologyTemplateAccess().getDescriptionKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getDescriptionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_3__0__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_3__1"
    // InternalToscaDsl.g:774:1: rule__TopologyTemplate__Group_3__1 : rule__TopologyTemplate__Group_3__1__Impl ;
    public final void rule__TopologyTemplate__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:778:1: ( rule__TopologyTemplate__Group_3__1__Impl )
            // InternalToscaDsl.g:779:2: rule__TopologyTemplate__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_3__1"


    // $ANTLR start "rule__TopologyTemplate__Group_3__1__Impl"
    // InternalToscaDsl.g:785:1: rule__TopologyTemplate__Group_3__1__Impl : ( ( rule__TopologyTemplate__DescriptionAssignment_3_1 ) ) ;
    public final void rule__TopologyTemplate__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:789:1: ( ( ( rule__TopologyTemplate__DescriptionAssignment_3_1 ) ) )
            // InternalToscaDsl.g:790:1: ( ( rule__TopologyTemplate__DescriptionAssignment_3_1 ) )
            {
            // InternalToscaDsl.g:790:1: ( ( rule__TopologyTemplate__DescriptionAssignment_3_1 ) )
            // InternalToscaDsl.g:791:2: ( rule__TopologyTemplate__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getTopologyTemplateAccess().getDescriptionAssignment_3_1()); 
            // InternalToscaDsl.g:792:2: ( rule__TopologyTemplate__DescriptionAssignment_3_1 )
            // InternalToscaDsl.g:792:3: rule__TopologyTemplate__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTopologyTemplateAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_3__1__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_4__0"
    // InternalToscaDsl.g:801:1: rule__TopologyTemplate__Group_4__0 : rule__TopologyTemplate__Group_4__0__Impl rule__TopologyTemplate__Group_4__1 ;
    public final void rule__TopologyTemplate__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:805:1: ( rule__TopologyTemplate__Group_4__0__Impl rule__TopologyTemplate__Group_4__1 )
            // InternalToscaDsl.g:806:2: rule__TopologyTemplate__Group_4__0__Impl rule__TopologyTemplate__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__TopologyTemplate__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_4__0"


    // $ANTLR start "rule__TopologyTemplate__Group_4__0__Impl"
    // InternalToscaDsl.g:813:1: rule__TopologyTemplate__Group_4__0__Impl : ( ',\\n\"imports\" :' ) ;
    public final void rule__TopologyTemplate__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:817:1: ( ( ',\\n\"imports\" :' ) )
            // InternalToscaDsl.g:818:1: ( ',\\n\"imports\" :' )
            {
            // InternalToscaDsl.g:818:1: ( ',\\n\"imports\" :' )
            // InternalToscaDsl.g:819:2: ',\\n\"imports\" :'
            {
             before(grammarAccess.getTopologyTemplateAccess().getImportsKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getImportsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_4__0__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_4__1"
    // InternalToscaDsl.g:828:1: rule__TopologyTemplate__Group_4__1 : rule__TopologyTemplate__Group_4__1__Impl rule__TopologyTemplate__Group_4__2 ;
    public final void rule__TopologyTemplate__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:832:1: ( rule__TopologyTemplate__Group_4__1__Impl rule__TopologyTemplate__Group_4__2 )
            // InternalToscaDsl.g:833:2: rule__TopologyTemplate__Group_4__1__Impl rule__TopologyTemplate__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__TopologyTemplate__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_4__1"


    // $ANTLR start "rule__TopologyTemplate__Group_4__1__Impl"
    // InternalToscaDsl.g:840:1: rule__TopologyTemplate__Group_4__1__Impl : ( '[' ) ;
    public final void rule__TopologyTemplate__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:844:1: ( ( '[' ) )
            // InternalToscaDsl.g:845:1: ( '[' )
            {
            // InternalToscaDsl.g:845:1: ( '[' )
            // InternalToscaDsl.g:846:2: '['
            {
             before(grammarAccess.getTopologyTemplateAccess().getLeftSquareBracketKeyword_4_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getLeftSquareBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_4__1__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_4__2"
    // InternalToscaDsl.g:855:1: rule__TopologyTemplate__Group_4__2 : rule__TopologyTemplate__Group_4__2__Impl rule__TopologyTemplate__Group_4__3 ;
    public final void rule__TopologyTemplate__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:859:1: ( rule__TopologyTemplate__Group_4__2__Impl rule__TopologyTemplate__Group_4__3 )
            // InternalToscaDsl.g:860:2: rule__TopologyTemplate__Group_4__2__Impl rule__TopologyTemplate__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__TopologyTemplate__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_4__2"


    // $ANTLR start "rule__TopologyTemplate__Group_4__2__Impl"
    // InternalToscaDsl.g:867:1: rule__TopologyTemplate__Group_4__2__Impl : ( ( rule__TopologyTemplate__ImportsAssignment_4_2 ) ) ;
    public final void rule__TopologyTemplate__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:871:1: ( ( ( rule__TopologyTemplate__ImportsAssignment_4_2 ) ) )
            // InternalToscaDsl.g:872:1: ( ( rule__TopologyTemplate__ImportsAssignment_4_2 ) )
            {
            // InternalToscaDsl.g:872:1: ( ( rule__TopologyTemplate__ImportsAssignment_4_2 ) )
            // InternalToscaDsl.g:873:2: ( rule__TopologyTemplate__ImportsAssignment_4_2 )
            {
             before(grammarAccess.getTopologyTemplateAccess().getImportsAssignment_4_2()); 
            // InternalToscaDsl.g:874:2: ( rule__TopologyTemplate__ImportsAssignment_4_2 )
            // InternalToscaDsl.g:874:3: rule__TopologyTemplate__ImportsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__ImportsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTopologyTemplateAccess().getImportsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_4__2__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_4__3"
    // InternalToscaDsl.g:882:1: rule__TopologyTemplate__Group_4__3 : rule__TopologyTemplate__Group_4__3__Impl rule__TopologyTemplate__Group_4__4 ;
    public final void rule__TopologyTemplate__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:886:1: ( rule__TopologyTemplate__Group_4__3__Impl rule__TopologyTemplate__Group_4__4 )
            // InternalToscaDsl.g:887:2: rule__TopologyTemplate__Group_4__3__Impl rule__TopologyTemplate__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__TopologyTemplate__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_4__3"


    // $ANTLR start "rule__TopologyTemplate__Group_4__3__Impl"
    // InternalToscaDsl.g:894:1: rule__TopologyTemplate__Group_4__3__Impl : ( ( rule__TopologyTemplate__Group_4_3__0 )* ) ;
    public final void rule__TopologyTemplate__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:898:1: ( ( ( rule__TopologyTemplate__Group_4_3__0 )* ) )
            // InternalToscaDsl.g:899:1: ( ( rule__TopologyTemplate__Group_4_3__0 )* )
            {
            // InternalToscaDsl.g:899:1: ( ( rule__TopologyTemplate__Group_4_3__0 )* )
            // InternalToscaDsl.g:900:2: ( rule__TopologyTemplate__Group_4_3__0 )*
            {
             before(grammarAccess.getTopologyTemplateAccess().getGroup_4_3()); 
            // InternalToscaDsl.g:901:2: ( rule__TopologyTemplate__Group_4_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalToscaDsl.g:901:3: rule__TopologyTemplate__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TopologyTemplate__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTopologyTemplateAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_4__3__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_4__4"
    // InternalToscaDsl.g:909:1: rule__TopologyTemplate__Group_4__4 : rule__TopologyTemplate__Group_4__4__Impl ;
    public final void rule__TopologyTemplate__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:913:1: ( rule__TopologyTemplate__Group_4__4__Impl )
            // InternalToscaDsl.g:914:2: rule__TopologyTemplate__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_4__4"


    // $ANTLR start "rule__TopologyTemplate__Group_4__4__Impl"
    // InternalToscaDsl.g:920:1: rule__TopologyTemplate__Group_4__4__Impl : ( ']' ) ;
    public final void rule__TopologyTemplate__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:924:1: ( ( ']' ) )
            // InternalToscaDsl.g:925:1: ( ']' )
            {
            // InternalToscaDsl.g:925:1: ( ']' )
            // InternalToscaDsl.g:926:2: ']'
            {
             before(grammarAccess.getTopologyTemplateAccess().getRightSquareBracketKeyword_4_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getRightSquareBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_4__4__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_4_3__0"
    // InternalToscaDsl.g:936:1: rule__TopologyTemplate__Group_4_3__0 : rule__TopologyTemplate__Group_4_3__0__Impl rule__TopologyTemplate__Group_4_3__1 ;
    public final void rule__TopologyTemplate__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:940:1: ( rule__TopologyTemplate__Group_4_3__0__Impl rule__TopologyTemplate__Group_4_3__1 )
            // InternalToscaDsl.g:941:2: rule__TopologyTemplate__Group_4_3__0__Impl rule__TopologyTemplate__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__TopologyTemplate__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_4_3__0"


    // $ANTLR start "rule__TopologyTemplate__Group_4_3__0__Impl"
    // InternalToscaDsl.g:948:1: rule__TopologyTemplate__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__TopologyTemplate__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:952:1: ( ( ',' ) )
            // InternalToscaDsl.g:953:1: ( ',' )
            {
            // InternalToscaDsl.g:953:1: ( ',' )
            // InternalToscaDsl.g:954:2: ','
            {
             before(grammarAccess.getTopologyTemplateAccess().getCommaKeyword_4_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_4_3__0__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_4_3__1"
    // InternalToscaDsl.g:963:1: rule__TopologyTemplate__Group_4_3__1 : rule__TopologyTemplate__Group_4_3__1__Impl ;
    public final void rule__TopologyTemplate__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:967:1: ( rule__TopologyTemplate__Group_4_3__1__Impl )
            // InternalToscaDsl.g:968:2: rule__TopologyTemplate__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_4_3__1"


    // $ANTLR start "rule__TopologyTemplate__Group_4_3__1__Impl"
    // InternalToscaDsl.g:974:1: rule__TopologyTemplate__Group_4_3__1__Impl : ( ( rule__TopologyTemplate__ImportsAssignment_4_3_1 ) ) ;
    public final void rule__TopologyTemplate__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:978:1: ( ( ( rule__TopologyTemplate__ImportsAssignment_4_3_1 ) ) )
            // InternalToscaDsl.g:979:1: ( ( rule__TopologyTemplate__ImportsAssignment_4_3_1 ) )
            {
            // InternalToscaDsl.g:979:1: ( ( rule__TopologyTemplate__ImportsAssignment_4_3_1 ) )
            // InternalToscaDsl.g:980:2: ( rule__TopologyTemplate__ImportsAssignment_4_3_1 )
            {
             before(grammarAccess.getTopologyTemplateAccess().getImportsAssignment_4_3_1()); 
            // InternalToscaDsl.g:981:2: ( rule__TopologyTemplate__ImportsAssignment_4_3_1 )
            // InternalToscaDsl.g:981:3: rule__TopologyTemplate__ImportsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__ImportsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTopologyTemplateAccess().getImportsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_4_3__1__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_5__0"
    // InternalToscaDsl.g:990:1: rule__TopologyTemplate__Group_5__0 : rule__TopologyTemplate__Group_5__0__Impl rule__TopologyTemplate__Group_5__1 ;
    public final void rule__TopologyTemplate__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:994:1: ( rule__TopologyTemplate__Group_5__0__Impl rule__TopologyTemplate__Group_5__1 )
            // InternalToscaDsl.g:995:2: rule__TopologyTemplate__Group_5__0__Impl rule__TopologyTemplate__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__TopologyTemplate__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_5__0"


    // $ANTLR start "rule__TopologyTemplate__Group_5__0__Impl"
    // InternalToscaDsl.g:1002:1: rule__TopologyTemplate__Group_5__0__Impl : ( ',\\n\"outputs\" :' ) ;
    public final void rule__TopologyTemplate__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1006:1: ( ( ',\\n\"outputs\" :' ) )
            // InternalToscaDsl.g:1007:1: ( ',\\n\"outputs\" :' )
            {
            // InternalToscaDsl.g:1007:1: ( ',\\n\"outputs\" :' )
            // InternalToscaDsl.g:1008:2: ',\\n\"outputs\" :'
            {
             before(grammarAccess.getTopologyTemplateAccess().getOutputsKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getOutputsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_5__0__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_5__1"
    // InternalToscaDsl.g:1017:1: rule__TopologyTemplate__Group_5__1 : rule__TopologyTemplate__Group_5__1__Impl rule__TopologyTemplate__Group_5__2 ;
    public final void rule__TopologyTemplate__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1021:1: ( rule__TopologyTemplate__Group_5__1__Impl rule__TopologyTemplate__Group_5__2 )
            // InternalToscaDsl.g:1022:2: rule__TopologyTemplate__Group_5__1__Impl rule__TopologyTemplate__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__TopologyTemplate__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_5__1"


    // $ANTLR start "rule__TopologyTemplate__Group_5__1__Impl"
    // InternalToscaDsl.g:1029:1: rule__TopologyTemplate__Group_5__1__Impl : ( '{' ) ;
    public final void rule__TopologyTemplate__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1033:1: ( ( '{' ) )
            // InternalToscaDsl.g:1034:1: ( '{' )
            {
            // InternalToscaDsl.g:1034:1: ( '{' )
            // InternalToscaDsl.g:1035:2: '{'
            {
             before(grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_5__1__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_5__2"
    // InternalToscaDsl.g:1044:1: rule__TopologyTemplate__Group_5__2 : rule__TopologyTemplate__Group_5__2__Impl rule__TopologyTemplate__Group_5__3 ;
    public final void rule__TopologyTemplate__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1048:1: ( rule__TopologyTemplate__Group_5__2__Impl rule__TopologyTemplate__Group_5__3 )
            // InternalToscaDsl.g:1049:2: rule__TopologyTemplate__Group_5__2__Impl rule__TopologyTemplate__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__TopologyTemplate__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_5__2"


    // $ANTLR start "rule__TopologyTemplate__Group_5__2__Impl"
    // InternalToscaDsl.g:1056:1: rule__TopologyTemplate__Group_5__2__Impl : ( ( rule__TopologyTemplate__OutputsAssignment_5_2 ) ) ;
    public final void rule__TopologyTemplate__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1060:1: ( ( ( rule__TopologyTemplate__OutputsAssignment_5_2 ) ) )
            // InternalToscaDsl.g:1061:1: ( ( rule__TopologyTemplate__OutputsAssignment_5_2 ) )
            {
            // InternalToscaDsl.g:1061:1: ( ( rule__TopologyTemplate__OutputsAssignment_5_2 ) )
            // InternalToscaDsl.g:1062:2: ( rule__TopologyTemplate__OutputsAssignment_5_2 )
            {
             before(grammarAccess.getTopologyTemplateAccess().getOutputsAssignment_5_2()); 
            // InternalToscaDsl.g:1063:2: ( rule__TopologyTemplate__OutputsAssignment_5_2 )
            // InternalToscaDsl.g:1063:3: rule__TopologyTemplate__OutputsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__OutputsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTopologyTemplateAccess().getOutputsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_5__2__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_5__3"
    // InternalToscaDsl.g:1071:1: rule__TopologyTemplate__Group_5__3 : rule__TopologyTemplate__Group_5__3__Impl rule__TopologyTemplate__Group_5__4 ;
    public final void rule__TopologyTemplate__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1075:1: ( rule__TopologyTemplate__Group_5__3__Impl rule__TopologyTemplate__Group_5__4 )
            // InternalToscaDsl.g:1076:2: rule__TopologyTemplate__Group_5__3__Impl rule__TopologyTemplate__Group_5__4
            {
            pushFollow(FOLLOW_10);
            rule__TopologyTemplate__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_5__3"


    // $ANTLR start "rule__TopologyTemplate__Group_5__3__Impl"
    // InternalToscaDsl.g:1083:1: rule__TopologyTemplate__Group_5__3__Impl : ( ( rule__TopologyTemplate__Group_5_3__0 )* ) ;
    public final void rule__TopologyTemplate__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1087:1: ( ( ( rule__TopologyTemplate__Group_5_3__0 )* ) )
            // InternalToscaDsl.g:1088:1: ( ( rule__TopologyTemplate__Group_5_3__0 )* )
            {
            // InternalToscaDsl.g:1088:1: ( ( rule__TopologyTemplate__Group_5_3__0 )* )
            // InternalToscaDsl.g:1089:2: ( rule__TopologyTemplate__Group_5_3__0 )*
            {
             before(grammarAccess.getTopologyTemplateAccess().getGroup_5_3()); 
            // InternalToscaDsl.g:1090:2: ( rule__TopologyTemplate__Group_5_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalToscaDsl.g:1090:3: rule__TopologyTemplate__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TopologyTemplate__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTopologyTemplateAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_5__3__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_5__4"
    // InternalToscaDsl.g:1098:1: rule__TopologyTemplate__Group_5__4 : rule__TopologyTemplate__Group_5__4__Impl ;
    public final void rule__TopologyTemplate__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1102:1: ( rule__TopologyTemplate__Group_5__4__Impl )
            // InternalToscaDsl.g:1103:2: rule__TopologyTemplate__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_5__4"


    // $ANTLR start "rule__TopologyTemplate__Group_5__4__Impl"
    // InternalToscaDsl.g:1109:1: rule__TopologyTemplate__Group_5__4__Impl : ( '}' ) ;
    public final void rule__TopologyTemplate__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1113:1: ( ( '}' ) )
            // InternalToscaDsl.g:1114:1: ( '}' )
            {
            // InternalToscaDsl.g:1114:1: ( '}' )
            // InternalToscaDsl.g:1115:2: '}'
            {
             before(grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_5__4__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_5_3__0"
    // InternalToscaDsl.g:1125:1: rule__TopologyTemplate__Group_5_3__0 : rule__TopologyTemplate__Group_5_3__0__Impl rule__TopologyTemplate__Group_5_3__1 ;
    public final void rule__TopologyTemplate__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1129:1: ( rule__TopologyTemplate__Group_5_3__0__Impl rule__TopologyTemplate__Group_5_3__1 )
            // InternalToscaDsl.g:1130:2: rule__TopologyTemplate__Group_5_3__0__Impl rule__TopologyTemplate__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__TopologyTemplate__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_5_3__0"


    // $ANTLR start "rule__TopologyTemplate__Group_5_3__0__Impl"
    // InternalToscaDsl.g:1137:1: rule__TopologyTemplate__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__TopologyTemplate__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1141:1: ( ( ',' ) )
            // InternalToscaDsl.g:1142:1: ( ',' )
            {
            // InternalToscaDsl.g:1142:1: ( ',' )
            // InternalToscaDsl.g:1143:2: ','
            {
             before(grammarAccess.getTopologyTemplateAccess().getCommaKeyword_5_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_5_3__0__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_5_3__1"
    // InternalToscaDsl.g:1152:1: rule__TopologyTemplate__Group_5_3__1 : rule__TopologyTemplate__Group_5_3__1__Impl ;
    public final void rule__TopologyTemplate__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1156:1: ( rule__TopologyTemplate__Group_5_3__1__Impl )
            // InternalToscaDsl.g:1157:2: rule__TopologyTemplate__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_5_3__1"


    // $ANTLR start "rule__TopologyTemplate__Group_5_3__1__Impl"
    // InternalToscaDsl.g:1163:1: rule__TopologyTemplate__Group_5_3__1__Impl : ( ( rule__TopologyTemplate__OutputsAssignment_5_3_1 ) ) ;
    public final void rule__TopologyTemplate__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1167:1: ( ( ( rule__TopologyTemplate__OutputsAssignment_5_3_1 ) ) )
            // InternalToscaDsl.g:1168:1: ( ( rule__TopologyTemplate__OutputsAssignment_5_3_1 ) )
            {
            // InternalToscaDsl.g:1168:1: ( ( rule__TopologyTemplate__OutputsAssignment_5_3_1 ) )
            // InternalToscaDsl.g:1169:2: ( rule__TopologyTemplate__OutputsAssignment_5_3_1 )
            {
             before(grammarAccess.getTopologyTemplateAccess().getOutputsAssignment_5_3_1()); 
            // InternalToscaDsl.g:1170:2: ( rule__TopologyTemplate__OutputsAssignment_5_3_1 )
            // InternalToscaDsl.g:1170:3: rule__TopologyTemplate__OutputsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__OutputsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTopologyTemplateAccess().getOutputsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_5_3__1__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_6__0"
    // InternalToscaDsl.g:1179:1: rule__TopologyTemplate__Group_6__0 : rule__TopologyTemplate__Group_6__0__Impl rule__TopologyTemplate__Group_6__1 ;
    public final void rule__TopologyTemplate__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1183:1: ( rule__TopologyTemplate__Group_6__0__Impl rule__TopologyTemplate__Group_6__1 )
            // InternalToscaDsl.g:1184:2: rule__TopologyTemplate__Group_6__0__Impl rule__TopologyTemplate__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__TopologyTemplate__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_6__0"


    // $ANTLR start "rule__TopologyTemplate__Group_6__0__Impl"
    // InternalToscaDsl.g:1191:1: rule__TopologyTemplate__Group_6__0__Impl : ( ',\\n\"inputs\" :' ) ;
    public final void rule__TopologyTemplate__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1195:1: ( ( ',\\n\"inputs\" :' ) )
            // InternalToscaDsl.g:1196:1: ( ',\\n\"inputs\" :' )
            {
            // InternalToscaDsl.g:1196:1: ( ',\\n\"inputs\" :' )
            // InternalToscaDsl.g:1197:2: ',\\n\"inputs\" :'
            {
             before(grammarAccess.getTopologyTemplateAccess().getInputsKeyword_6_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getInputsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_6__0__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_6__1"
    // InternalToscaDsl.g:1206:1: rule__TopologyTemplate__Group_6__1 : rule__TopologyTemplate__Group_6__1__Impl rule__TopologyTemplate__Group_6__2 ;
    public final void rule__TopologyTemplate__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1210:1: ( rule__TopologyTemplate__Group_6__1__Impl rule__TopologyTemplate__Group_6__2 )
            // InternalToscaDsl.g:1211:2: rule__TopologyTemplate__Group_6__1__Impl rule__TopologyTemplate__Group_6__2
            {
            pushFollow(FOLLOW_4);
            rule__TopologyTemplate__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_6__1"


    // $ANTLR start "rule__TopologyTemplate__Group_6__1__Impl"
    // InternalToscaDsl.g:1218:1: rule__TopologyTemplate__Group_6__1__Impl : ( '{' ) ;
    public final void rule__TopologyTemplate__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1222:1: ( ( '{' ) )
            // InternalToscaDsl.g:1223:1: ( '{' )
            {
            // InternalToscaDsl.g:1223:1: ( '{' )
            // InternalToscaDsl.g:1224:2: '{'
            {
             before(grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_6__1__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_6__2"
    // InternalToscaDsl.g:1233:1: rule__TopologyTemplate__Group_6__2 : rule__TopologyTemplate__Group_6__2__Impl rule__TopologyTemplate__Group_6__3 ;
    public final void rule__TopologyTemplate__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1237:1: ( rule__TopologyTemplate__Group_6__2__Impl rule__TopologyTemplate__Group_6__3 )
            // InternalToscaDsl.g:1238:2: rule__TopologyTemplate__Group_6__2__Impl rule__TopologyTemplate__Group_6__3
            {
            pushFollow(FOLLOW_10);
            rule__TopologyTemplate__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_6__2"


    // $ANTLR start "rule__TopologyTemplate__Group_6__2__Impl"
    // InternalToscaDsl.g:1245:1: rule__TopologyTemplate__Group_6__2__Impl : ( ( rule__TopologyTemplate__InputsAssignment_6_2 ) ) ;
    public final void rule__TopologyTemplate__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1249:1: ( ( ( rule__TopologyTemplate__InputsAssignment_6_2 ) ) )
            // InternalToscaDsl.g:1250:1: ( ( rule__TopologyTemplate__InputsAssignment_6_2 ) )
            {
            // InternalToscaDsl.g:1250:1: ( ( rule__TopologyTemplate__InputsAssignment_6_2 ) )
            // InternalToscaDsl.g:1251:2: ( rule__TopologyTemplate__InputsAssignment_6_2 )
            {
             before(grammarAccess.getTopologyTemplateAccess().getInputsAssignment_6_2()); 
            // InternalToscaDsl.g:1252:2: ( rule__TopologyTemplate__InputsAssignment_6_2 )
            // InternalToscaDsl.g:1252:3: rule__TopologyTemplate__InputsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__InputsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getTopologyTemplateAccess().getInputsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_6__2__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_6__3"
    // InternalToscaDsl.g:1260:1: rule__TopologyTemplate__Group_6__3 : rule__TopologyTemplate__Group_6__3__Impl rule__TopologyTemplate__Group_6__4 ;
    public final void rule__TopologyTemplate__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1264:1: ( rule__TopologyTemplate__Group_6__3__Impl rule__TopologyTemplate__Group_6__4 )
            // InternalToscaDsl.g:1265:2: rule__TopologyTemplate__Group_6__3__Impl rule__TopologyTemplate__Group_6__4
            {
            pushFollow(FOLLOW_10);
            rule__TopologyTemplate__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_6__3"


    // $ANTLR start "rule__TopologyTemplate__Group_6__3__Impl"
    // InternalToscaDsl.g:1272:1: rule__TopologyTemplate__Group_6__3__Impl : ( ( rule__TopologyTemplate__Group_6_3__0 )* ) ;
    public final void rule__TopologyTemplate__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1276:1: ( ( ( rule__TopologyTemplate__Group_6_3__0 )* ) )
            // InternalToscaDsl.g:1277:1: ( ( rule__TopologyTemplate__Group_6_3__0 )* )
            {
            // InternalToscaDsl.g:1277:1: ( ( rule__TopologyTemplate__Group_6_3__0 )* )
            // InternalToscaDsl.g:1278:2: ( rule__TopologyTemplate__Group_6_3__0 )*
            {
             before(grammarAccess.getTopologyTemplateAccess().getGroup_6_3()); 
            // InternalToscaDsl.g:1279:2: ( rule__TopologyTemplate__Group_6_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalToscaDsl.g:1279:3: rule__TopologyTemplate__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TopologyTemplate__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTopologyTemplateAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_6__3__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_6__4"
    // InternalToscaDsl.g:1287:1: rule__TopologyTemplate__Group_6__4 : rule__TopologyTemplate__Group_6__4__Impl ;
    public final void rule__TopologyTemplate__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1291:1: ( rule__TopologyTemplate__Group_6__4__Impl )
            // InternalToscaDsl.g:1292:2: rule__TopologyTemplate__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_6__4"


    // $ANTLR start "rule__TopologyTemplate__Group_6__4__Impl"
    // InternalToscaDsl.g:1298:1: rule__TopologyTemplate__Group_6__4__Impl : ( '}' ) ;
    public final void rule__TopologyTemplate__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1302:1: ( ( '}' ) )
            // InternalToscaDsl.g:1303:1: ( '}' )
            {
            // InternalToscaDsl.g:1303:1: ( '}' )
            // InternalToscaDsl.g:1304:2: '}'
            {
             before(grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_6__4__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_6_3__0"
    // InternalToscaDsl.g:1314:1: rule__TopologyTemplate__Group_6_3__0 : rule__TopologyTemplate__Group_6_3__0__Impl rule__TopologyTemplate__Group_6_3__1 ;
    public final void rule__TopologyTemplate__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1318:1: ( rule__TopologyTemplate__Group_6_3__0__Impl rule__TopologyTemplate__Group_6_3__1 )
            // InternalToscaDsl.g:1319:2: rule__TopologyTemplate__Group_6_3__0__Impl rule__TopologyTemplate__Group_6_3__1
            {
            pushFollow(FOLLOW_4);
            rule__TopologyTemplate__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_6_3__0"


    // $ANTLR start "rule__TopologyTemplate__Group_6_3__0__Impl"
    // InternalToscaDsl.g:1326:1: rule__TopologyTemplate__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__TopologyTemplate__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1330:1: ( ( ',' ) )
            // InternalToscaDsl.g:1331:1: ( ',' )
            {
            // InternalToscaDsl.g:1331:1: ( ',' )
            // InternalToscaDsl.g:1332:2: ','
            {
             before(grammarAccess.getTopologyTemplateAccess().getCommaKeyword_6_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_6_3__0__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_6_3__1"
    // InternalToscaDsl.g:1341:1: rule__TopologyTemplate__Group_6_3__1 : rule__TopologyTemplate__Group_6_3__1__Impl ;
    public final void rule__TopologyTemplate__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1345:1: ( rule__TopologyTemplate__Group_6_3__1__Impl )
            // InternalToscaDsl.g:1346:2: rule__TopologyTemplate__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_6_3__1"


    // $ANTLR start "rule__TopologyTemplate__Group_6_3__1__Impl"
    // InternalToscaDsl.g:1352:1: rule__TopologyTemplate__Group_6_3__1__Impl : ( ( rule__TopologyTemplate__InputsAssignment_6_3_1 ) ) ;
    public final void rule__TopologyTemplate__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1356:1: ( ( ( rule__TopologyTemplate__InputsAssignment_6_3_1 ) ) )
            // InternalToscaDsl.g:1357:1: ( ( rule__TopologyTemplate__InputsAssignment_6_3_1 ) )
            {
            // InternalToscaDsl.g:1357:1: ( ( rule__TopologyTemplate__InputsAssignment_6_3_1 ) )
            // InternalToscaDsl.g:1358:2: ( rule__TopologyTemplate__InputsAssignment_6_3_1 )
            {
             before(grammarAccess.getTopologyTemplateAccess().getInputsAssignment_6_3_1()); 
            // InternalToscaDsl.g:1359:2: ( rule__TopologyTemplate__InputsAssignment_6_3_1 )
            // InternalToscaDsl.g:1359:3: rule__TopologyTemplate__InputsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__InputsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTopologyTemplateAccess().getInputsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_6_3__1__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_7__0"
    // InternalToscaDsl.g:1368:1: rule__TopologyTemplate__Group_7__0 : rule__TopologyTemplate__Group_7__0__Impl rule__TopologyTemplate__Group_7__1 ;
    public final void rule__TopologyTemplate__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1372:1: ( rule__TopologyTemplate__Group_7__0__Impl rule__TopologyTemplate__Group_7__1 )
            // InternalToscaDsl.g:1373:2: rule__TopologyTemplate__Group_7__0__Impl rule__TopologyTemplate__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__TopologyTemplate__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_7__0"


    // $ANTLR start "rule__TopologyTemplate__Group_7__0__Impl"
    // InternalToscaDsl.g:1380:1: rule__TopologyTemplate__Group_7__0__Impl : ( ',\\n\"nodeTemplates\" :' ) ;
    public final void rule__TopologyTemplate__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1384:1: ( ( ',\\n\"nodeTemplates\" :' ) )
            // InternalToscaDsl.g:1385:1: ( ',\\n\"nodeTemplates\" :' )
            {
            // InternalToscaDsl.g:1385:1: ( ',\\n\"nodeTemplates\" :' )
            // InternalToscaDsl.g:1386:2: ',\\n\"nodeTemplates\" :'
            {
             before(grammarAccess.getTopologyTemplateAccess().getNodeTemplatesKeyword_7_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getNodeTemplatesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_7__0__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_7__1"
    // InternalToscaDsl.g:1395:1: rule__TopologyTemplate__Group_7__1 : rule__TopologyTemplate__Group_7__1__Impl rule__TopologyTemplate__Group_7__2 ;
    public final void rule__TopologyTemplate__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1399:1: ( rule__TopologyTemplate__Group_7__1__Impl rule__TopologyTemplate__Group_7__2 )
            // InternalToscaDsl.g:1400:2: rule__TopologyTemplate__Group_7__1__Impl rule__TopologyTemplate__Group_7__2
            {
            pushFollow(FOLLOW_4);
            rule__TopologyTemplate__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_7__1"


    // $ANTLR start "rule__TopologyTemplate__Group_7__1__Impl"
    // InternalToscaDsl.g:1407:1: rule__TopologyTemplate__Group_7__1__Impl : ( '{' ) ;
    public final void rule__TopologyTemplate__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1411:1: ( ( '{' ) )
            // InternalToscaDsl.g:1412:1: ( '{' )
            {
            // InternalToscaDsl.g:1412:1: ( '{' )
            // InternalToscaDsl.g:1413:2: '{'
            {
             before(grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_7__1__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_7__2"
    // InternalToscaDsl.g:1422:1: rule__TopologyTemplate__Group_7__2 : rule__TopologyTemplate__Group_7__2__Impl rule__TopologyTemplate__Group_7__3 ;
    public final void rule__TopologyTemplate__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1426:1: ( rule__TopologyTemplate__Group_7__2__Impl rule__TopologyTemplate__Group_7__3 )
            // InternalToscaDsl.g:1427:2: rule__TopologyTemplate__Group_7__2__Impl rule__TopologyTemplate__Group_7__3
            {
            pushFollow(FOLLOW_10);
            rule__TopologyTemplate__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_7__2"


    // $ANTLR start "rule__TopologyTemplate__Group_7__2__Impl"
    // InternalToscaDsl.g:1434:1: rule__TopologyTemplate__Group_7__2__Impl : ( ( rule__TopologyTemplate__NodeTemplatesAssignment_7_2 ) ) ;
    public final void rule__TopologyTemplate__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1438:1: ( ( ( rule__TopologyTemplate__NodeTemplatesAssignment_7_2 ) ) )
            // InternalToscaDsl.g:1439:1: ( ( rule__TopologyTemplate__NodeTemplatesAssignment_7_2 ) )
            {
            // InternalToscaDsl.g:1439:1: ( ( rule__TopologyTemplate__NodeTemplatesAssignment_7_2 ) )
            // InternalToscaDsl.g:1440:2: ( rule__TopologyTemplate__NodeTemplatesAssignment_7_2 )
            {
             before(grammarAccess.getTopologyTemplateAccess().getNodeTemplatesAssignment_7_2()); 
            // InternalToscaDsl.g:1441:2: ( rule__TopologyTemplate__NodeTemplatesAssignment_7_2 )
            // InternalToscaDsl.g:1441:3: rule__TopologyTemplate__NodeTemplatesAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__NodeTemplatesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getTopologyTemplateAccess().getNodeTemplatesAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_7__2__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_7__3"
    // InternalToscaDsl.g:1449:1: rule__TopologyTemplate__Group_7__3 : rule__TopologyTemplate__Group_7__3__Impl rule__TopologyTemplate__Group_7__4 ;
    public final void rule__TopologyTemplate__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1453:1: ( rule__TopologyTemplate__Group_7__3__Impl rule__TopologyTemplate__Group_7__4 )
            // InternalToscaDsl.g:1454:2: rule__TopologyTemplate__Group_7__3__Impl rule__TopologyTemplate__Group_7__4
            {
            pushFollow(FOLLOW_10);
            rule__TopologyTemplate__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_7__3"


    // $ANTLR start "rule__TopologyTemplate__Group_7__3__Impl"
    // InternalToscaDsl.g:1461:1: rule__TopologyTemplate__Group_7__3__Impl : ( ( rule__TopologyTemplate__Group_7_3__0 )* ) ;
    public final void rule__TopologyTemplate__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1465:1: ( ( ( rule__TopologyTemplate__Group_7_3__0 )* ) )
            // InternalToscaDsl.g:1466:1: ( ( rule__TopologyTemplate__Group_7_3__0 )* )
            {
            // InternalToscaDsl.g:1466:1: ( ( rule__TopologyTemplate__Group_7_3__0 )* )
            // InternalToscaDsl.g:1467:2: ( rule__TopologyTemplate__Group_7_3__0 )*
            {
             before(grammarAccess.getTopologyTemplateAccess().getGroup_7_3()); 
            // InternalToscaDsl.g:1468:2: ( rule__TopologyTemplate__Group_7_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalToscaDsl.g:1468:3: rule__TopologyTemplate__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TopologyTemplate__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTopologyTemplateAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_7__3__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_7__4"
    // InternalToscaDsl.g:1476:1: rule__TopologyTemplate__Group_7__4 : rule__TopologyTemplate__Group_7__4__Impl ;
    public final void rule__TopologyTemplate__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1480:1: ( rule__TopologyTemplate__Group_7__4__Impl )
            // InternalToscaDsl.g:1481:2: rule__TopologyTemplate__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_7__4"


    // $ANTLR start "rule__TopologyTemplate__Group_7__4__Impl"
    // InternalToscaDsl.g:1487:1: rule__TopologyTemplate__Group_7__4__Impl : ( '}' ) ;
    public final void rule__TopologyTemplate__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1491:1: ( ( '}' ) )
            // InternalToscaDsl.g:1492:1: ( '}' )
            {
            // InternalToscaDsl.g:1492:1: ( '}' )
            // InternalToscaDsl.g:1493:2: '}'
            {
             before(grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_7__4__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_7_3__0"
    // InternalToscaDsl.g:1503:1: rule__TopologyTemplate__Group_7_3__0 : rule__TopologyTemplate__Group_7_3__0__Impl rule__TopologyTemplate__Group_7_3__1 ;
    public final void rule__TopologyTemplate__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1507:1: ( rule__TopologyTemplate__Group_7_3__0__Impl rule__TopologyTemplate__Group_7_3__1 )
            // InternalToscaDsl.g:1508:2: rule__TopologyTemplate__Group_7_3__0__Impl rule__TopologyTemplate__Group_7_3__1
            {
            pushFollow(FOLLOW_4);
            rule__TopologyTemplate__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_7_3__0"


    // $ANTLR start "rule__TopologyTemplate__Group_7_3__0__Impl"
    // InternalToscaDsl.g:1515:1: rule__TopologyTemplate__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__TopologyTemplate__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1519:1: ( ( ',' ) )
            // InternalToscaDsl.g:1520:1: ( ',' )
            {
            // InternalToscaDsl.g:1520:1: ( ',' )
            // InternalToscaDsl.g:1521:2: ','
            {
             before(grammarAccess.getTopologyTemplateAccess().getCommaKeyword_7_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_7_3__0__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_7_3__1"
    // InternalToscaDsl.g:1530:1: rule__TopologyTemplate__Group_7_3__1 : rule__TopologyTemplate__Group_7_3__1__Impl ;
    public final void rule__TopologyTemplate__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1534:1: ( rule__TopologyTemplate__Group_7_3__1__Impl )
            // InternalToscaDsl.g:1535:2: rule__TopologyTemplate__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_7_3__1"


    // $ANTLR start "rule__TopologyTemplate__Group_7_3__1__Impl"
    // InternalToscaDsl.g:1541:1: rule__TopologyTemplate__Group_7_3__1__Impl : ( ( rule__TopologyTemplate__NodeTemplatesAssignment_7_3_1 ) ) ;
    public final void rule__TopologyTemplate__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1545:1: ( ( ( rule__TopologyTemplate__NodeTemplatesAssignment_7_3_1 ) ) )
            // InternalToscaDsl.g:1546:1: ( ( rule__TopologyTemplate__NodeTemplatesAssignment_7_3_1 ) )
            {
            // InternalToscaDsl.g:1546:1: ( ( rule__TopologyTemplate__NodeTemplatesAssignment_7_3_1 ) )
            // InternalToscaDsl.g:1547:2: ( rule__TopologyTemplate__NodeTemplatesAssignment_7_3_1 )
            {
             before(grammarAccess.getTopologyTemplateAccess().getNodeTemplatesAssignment_7_3_1()); 
            // InternalToscaDsl.g:1548:2: ( rule__TopologyTemplate__NodeTemplatesAssignment_7_3_1 )
            // InternalToscaDsl.g:1548:3: rule__TopologyTemplate__NodeTemplatesAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__NodeTemplatesAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTopologyTemplateAccess().getNodeTemplatesAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_7_3__1__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_8__0"
    // InternalToscaDsl.g:1557:1: rule__TopologyTemplate__Group_8__0 : rule__TopologyTemplate__Group_8__0__Impl rule__TopologyTemplate__Group_8__1 ;
    public final void rule__TopologyTemplate__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1561:1: ( rule__TopologyTemplate__Group_8__0__Impl rule__TopologyTemplate__Group_8__1 )
            // InternalToscaDsl.g:1562:2: rule__TopologyTemplate__Group_8__0__Impl rule__TopologyTemplate__Group_8__1
            {
            pushFollow(FOLLOW_9);
            rule__TopologyTemplate__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_8__0"


    // $ANTLR start "rule__TopologyTemplate__Group_8__0__Impl"
    // InternalToscaDsl.g:1569:1: rule__TopologyTemplate__Group_8__0__Impl : ( ',\\n\"realtionships\" :' ) ;
    public final void rule__TopologyTemplate__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1573:1: ( ( ',\\n\"realtionships\" :' ) )
            // InternalToscaDsl.g:1574:1: ( ',\\n\"realtionships\" :' )
            {
            // InternalToscaDsl.g:1574:1: ( ',\\n\"realtionships\" :' )
            // InternalToscaDsl.g:1575:2: ',\\n\"realtionships\" :'
            {
             before(grammarAccess.getTopologyTemplateAccess().getRealtionshipsKeyword_8_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getRealtionshipsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_8__0__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_8__1"
    // InternalToscaDsl.g:1584:1: rule__TopologyTemplate__Group_8__1 : rule__TopologyTemplate__Group_8__1__Impl rule__TopologyTemplate__Group_8__2 ;
    public final void rule__TopologyTemplate__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1588:1: ( rule__TopologyTemplate__Group_8__1__Impl rule__TopologyTemplate__Group_8__2 )
            // InternalToscaDsl.g:1589:2: rule__TopologyTemplate__Group_8__1__Impl rule__TopologyTemplate__Group_8__2
            {
            pushFollow(FOLLOW_9);
            rule__TopologyTemplate__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_8__1"


    // $ANTLR start "rule__TopologyTemplate__Group_8__1__Impl"
    // InternalToscaDsl.g:1596:1: rule__TopologyTemplate__Group_8__1__Impl : ( '{' ) ;
    public final void rule__TopologyTemplate__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1600:1: ( ( '{' ) )
            // InternalToscaDsl.g:1601:1: ( '{' )
            {
            // InternalToscaDsl.g:1601:1: ( '{' )
            // InternalToscaDsl.g:1602:2: '{'
            {
             before(grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_8__1__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_8__2"
    // InternalToscaDsl.g:1611:1: rule__TopologyTemplate__Group_8__2 : rule__TopologyTemplate__Group_8__2__Impl rule__TopologyTemplate__Group_8__3 ;
    public final void rule__TopologyTemplate__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1615:1: ( rule__TopologyTemplate__Group_8__2__Impl rule__TopologyTemplate__Group_8__3 )
            // InternalToscaDsl.g:1616:2: rule__TopologyTemplate__Group_8__2__Impl rule__TopologyTemplate__Group_8__3
            {
            pushFollow(FOLLOW_10);
            rule__TopologyTemplate__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_8__2"


    // $ANTLR start "rule__TopologyTemplate__Group_8__2__Impl"
    // InternalToscaDsl.g:1623:1: rule__TopologyTemplate__Group_8__2__Impl : ( ( rule__TopologyTemplate__RealtionshipsAssignment_8_2 ) ) ;
    public final void rule__TopologyTemplate__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1627:1: ( ( ( rule__TopologyTemplate__RealtionshipsAssignment_8_2 ) ) )
            // InternalToscaDsl.g:1628:1: ( ( rule__TopologyTemplate__RealtionshipsAssignment_8_2 ) )
            {
            // InternalToscaDsl.g:1628:1: ( ( rule__TopologyTemplate__RealtionshipsAssignment_8_2 ) )
            // InternalToscaDsl.g:1629:2: ( rule__TopologyTemplate__RealtionshipsAssignment_8_2 )
            {
             before(grammarAccess.getTopologyTemplateAccess().getRealtionshipsAssignment_8_2()); 
            // InternalToscaDsl.g:1630:2: ( rule__TopologyTemplate__RealtionshipsAssignment_8_2 )
            // InternalToscaDsl.g:1630:3: rule__TopologyTemplate__RealtionshipsAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__RealtionshipsAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getTopologyTemplateAccess().getRealtionshipsAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_8__2__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_8__3"
    // InternalToscaDsl.g:1638:1: rule__TopologyTemplate__Group_8__3 : rule__TopologyTemplate__Group_8__3__Impl rule__TopologyTemplate__Group_8__4 ;
    public final void rule__TopologyTemplate__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1642:1: ( rule__TopologyTemplate__Group_8__3__Impl rule__TopologyTemplate__Group_8__4 )
            // InternalToscaDsl.g:1643:2: rule__TopologyTemplate__Group_8__3__Impl rule__TopologyTemplate__Group_8__4
            {
            pushFollow(FOLLOW_10);
            rule__TopologyTemplate__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_8__3"


    // $ANTLR start "rule__TopologyTemplate__Group_8__3__Impl"
    // InternalToscaDsl.g:1650:1: rule__TopologyTemplate__Group_8__3__Impl : ( ( rule__TopologyTemplate__Group_8_3__0 )* ) ;
    public final void rule__TopologyTemplate__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1654:1: ( ( ( rule__TopologyTemplate__Group_8_3__0 )* ) )
            // InternalToscaDsl.g:1655:1: ( ( rule__TopologyTemplate__Group_8_3__0 )* )
            {
            // InternalToscaDsl.g:1655:1: ( ( rule__TopologyTemplate__Group_8_3__0 )* )
            // InternalToscaDsl.g:1656:2: ( rule__TopologyTemplate__Group_8_3__0 )*
            {
             before(grammarAccess.getTopologyTemplateAccess().getGroup_8_3()); 
            // InternalToscaDsl.g:1657:2: ( rule__TopologyTemplate__Group_8_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalToscaDsl.g:1657:3: rule__TopologyTemplate__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TopologyTemplate__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTopologyTemplateAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_8__3__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_8__4"
    // InternalToscaDsl.g:1665:1: rule__TopologyTemplate__Group_8__4 : rule__TopologyTemplate__Group_8__4__Impl ;
    public final void rule__TopologyTemplate__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1669:1: ( rule__TopologyTemplate__Group_8__4__Impl )
            // InternalToscaDsl.g:1670:2: rule__TopologyTemplate__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_8__4"


    // $ANTLR start "rule__TopologyTemplate__Group_8__4__Impl"
    // InternalToscaDsl.g:1676:1: rule__TopologyTemplate__Group_8__4__Impl : ( '}' ) ;
    public final void rule__TopologyTemplate__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1680:1: ( ( '}' ) )
            // InternalToscaDsl.g:1681:1: ( '}' )
            {
            // InternalToscaDsl.g:1681:1: ( '}' )
            // InternalToscaDsl.g:1682:2: '}'
            {
             before(grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_8__4__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_8_3__0"
    // InternalToscaDsl.g:1692:1: rule__TopologyTemplate__Group_8_3__0 : rule__TopologyTemplate__Group_8_3__0__Impl rule__TopologyTemplate__Group_8_3__1 ;
    public final void rule__TopologyTemplate__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1696:1: ( rule__TopologyTemplate__Group_8_3__0__Impl rule__TopologyTemplate__Group_8_3__1 )
            // InternalToscaDsl.g:1697:2: rule__TopologyTemplate__Group_8_3__0__Impl rule__TopologyTemplate__Group_8_3__1
            {
            pushFollow(FOLLOW_9);
            rule__TopologyTemplate__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_8_3__0"


    // $ANTLR start "rule__TopologyTemplate__Group_8_3__0__Impl"
    // InternalToscaDsl.g:1704:1: rule__TopologyTemplate__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__TopologyTemplate__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1708:1: ( ( ',' ) )
            // InternalToscaDsl.g:1709:1: ( ',' )
            {
            // InternalToscaDsl.g:1709:1: ( ',' )
            // InternalToscaDsl.g:1710:2: ','
            {
             before(grammarAccess.getTopologyTemplateAccess().getCommaKeyword_8_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_8_3__0__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_8_3__1"
    // InternalToscaDsl.g:1719:1: rule__TopologyTemplate__Group_8_3__1 : rule__TopologyTemplate__Group_8_3__1__Impl ;
    public final void rule__TopologyTemplate__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1723:1: ( rule__TopologyTemplate__Group_8_3__1__Impl )
            // InternalToscaDsl.g:1724:2: rule__TopologyTemplate__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_8_3__1"


    // $ANTLR start "rule__TopologyTemplate__Group_8_3__1__Impl"
    // InternalToscaDsl.g:1730:1: rule__TopologyTemplate__Group_8_3__1__Impl : ( ( rule__TopologyTemplate__RealtionshipsAssignment_8_3_1 ) ) ;
    public final void rule__TopologyTemplate__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1734:1: ( ( ( rule__TopologyTemplate__RealtionshipsAssignment_8_3_1 ) ) )
            // InternalToscaDsl.g:1735:1: ( ( rule__TopologyTemplate__RealtionshipsAssignment_8_3_1 ) )
            {
            // InternalToscaDsl.g:1735:1: ( ( rule__TopologyTemplate__RealtionshipsAssignment_8_3_1 ) )
            // InternalToscaDsl.g:1736:2: ( rule__TopologyTemplate__RealtionshipsAssignment_8_3_1 )
            {
             before(grammarAccess.getTopologyTemplateAccess().getRealtionshipsAssignment_8_3_1()); 
            // InternalToscaDsl.g:1737:2: ( rule__TopologyTemplate__RealtionshipsAssignment_8_3_1 )
            // InternalToscaDsl.g:1737:3: rule__TopologyTemplate__RealtionshipsAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__RealtionshipsAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTopologyTemplateAccess().getRealtionshipsAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_8_3__1__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_9__0"
    // InternalToscaDsl.g:1746:1: rule__TopologyTemplate__Group_9__0 : rule__TopologyTemplate__Group_9__0__Impl rule__TopologyTemplate__Group_9__1 ;
    public final void rule__TopologyTemplate__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1750:1: ( rule__TopologyTemplate__Group_9__0__Impl rule__TopologyTemplate__Group_9__1 )
            // InternalToscaDsl.g:1751:2: rule__TopologyTemplate__Group_9__0__Impl rule__TopologyTemplate__Group_9__1
            {
            pushFollow(FOLLOW_9);
            rule__TopologyTemplate__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_9__0"


    // $ANTLR start "rule__TopologyTemplate__Group_9__0__Impl"
    // InternalToscaDsl.g:1758:1: rule__TopologyTemplate__Group_9__0__Impl : ( ',\\n\"groups\" :' ) ;
    public final void rule__TopologyTemplate__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1762:1: ( ( ',\\n\"groups\" :' ) )
            // InternalToscaDsl.g:1763:1: ( ',\\n\"groups\" :' )
            {
            // InternalToscaDsl.g:1763:1: ( ',\\n\"groups\" :' )
            // InternalToscaDsl.g:1764:2: ',\\n\"groups\" :'
            {
             before(grammarAccess.getTopologyTemplateAccess().getGroupsKeyword_9_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getGroupsKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_9__0__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_9__1"
    // InternalToscaDsl.g:1773:1: rule__TopologyTemplate__Group_9__1 : rule__TopologyTemplate__Group_9__1__Impl rule__TopologyTemplate__Group_9__2 ;
    public final void rule__TopologyTemplate__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1777:1: ( rule__TopologyTemplate__Group_9__1__Impl rule__TopologyTemplate__Group_9__2 )
            // InternalToscaDsl.g:1778:2: rule__TopologyTemplate__Group_9__1__Impl rule__TopologyTemplate__Group_9__2
            {
            pushFollow(FOLLOW_4);
            rule__TopologyTemplate__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_9__1"


    // $ANTLR start "rule__TopologyTemplate__Group_9__1__Impl"
    // InternalToscaDsl.g:1785:1: rule__TopologyTemplate__Group_9__1__Impl : ( '{' ) ;
    public final void rule__TopologyTemplate__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1789:1: ( ( '{' ) )
            // InternalToscaDsl.g:1790:1: ( '{' )
            {
            // InternalToscaDsl.g:1790:1: ( '{' )
            // InternalToscaDsl.g:1791:2: '{'
            {
             before(grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_9__1__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_9__2"
    // InternalToscaDsl.g:1800:1: rule__TopologyTemplate__Group_9__2 : rule__TopologyTemplate__Group_9__2__Impl rule__TopologyTemplate__Group_9__3 ;
    public final void rule__TopologyTemplate__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1804:1: ( rule__TopologyTemplate__Group_9__2__Impl rule__TopologyTemplate__Group_9__3 )
            // InternalToscaDsl.g:1805:2: rule__TopologyTemplate__Group_9__2__Impl rule__TopologyTemplate__Group_9__3
            {
            pushFollow(FOLLOW_10);
            rule__TopologyTemplate__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_9__2"


    // $ANTLR start "rule__TopologyTemplate__Group_9__2__Impl"
    // InternalToscaDsl.g:1812:1: rule__TopologyTemplate__Group_9__2__Impl : ( ( rule__TopologyTemplate__GroupsAssignment_9_2 ) ) ;
    public final void rule__TopologyTemplate__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1816:1: ( ( ( rule__TopologyTemplate__GroupsAssignment_9_2 ) ) )
            // InternalToscaDsl.g:1817:1: ( ( rule__TopologyTemplate__GroupsAssignment_9_2 ) )
            {
            // InternalToscaDsl.g:1817:1: ( ( rule__TopologyTemplate__GroupsAssignment_9_2 ) )
            // InternalToscaDsl.g:1818:2: ( rule__TopologyTemplate__GroupsAssignment_9_2 )
            {
             before(grammarAccess.getTopologyTemplateAccess().getGroupsAssignment_9_2()); 
            // InternalToscaDsl.g:1819:2: ( rule__TopologyTemplate__GroupsAssignment_9_2 )
            // InternalToscaDsl.g:1819:3: rule__TopologyTemplate__GroupsAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__GroupsAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getTopologyTemplateAccess().getGroupsAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_9__2__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_9__3"
    // InternalToscaDsl.g:1827:1: rule__TopologyTemplate__Group_9__3 : rule__TopologyTemplate__Group_9__3__Impl rule__TopologyTemplate__Group_9__4 ;
    public final void rule__TopologyTemplate__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1831:1: ( rule__TopologyTemplate__Group_9__3__Impl rule__TopologyTemplate__Group_9__4 )
            // InternalToscaDsl.g:1832:2: rule__TopologyTemplate__Group_9__3__Impl rule__TopologyTemplate__Group_9__4
            {
            pushFollow(FOLLOW_10);
            rule__TopologyTemplate__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_9__3"


    // $ANTLR start "rule__TopologyTemplate__Group_9__3__Impl"
    // InternalToscaDsl.g:1839:1: rule__TopologyTemplate__Group_9__3__Impl : ( ( rule__TopologyTemplate__Group_9_3__0 )* ) ;
    public final void rule__TopologyTemplate__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1843:1: ( ( ( rule__TopologyTemplate__Group_9_3__0 )* ) )
            // InternalToscaDsl.g:1844:1: ( ( rule__TopologyTemplate__Group_9_3__0 )* )
            {
            // InternalToscaDsl.g:1844:1: ( ( rule__TopologyTemplate__Group_9_3__0 )* )
            // InternalToscaDsl.g:1845:2: ( rule__TopologyTemplate__Group_9_3__0 )*
            {
             before(grammarAccess.getTopologyTemplateAccess().getGroup_9_3()); 
            // InternalToscaDsl.g:1846:2: ( rule__TopologyTemplate__Group_9_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalToscaDsl.g:1846:3: rule__TopologyTemplate__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TopologyTemplate__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTopologyTemplateAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_9__3__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_9__4"
    // InternalToscaDsl.g:1854:1: rule__TopologyTemplate__Group_9__4 : rule__TopologyTemplate__Group_9__4__Impl ;
    public final void rule__TopologyTemplate__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1858:1: ( rule__TopologyTemplate__Group_9__4__Impl )
            // InternalToscaDsl.g:1859:2: rule__TopologyTemplate__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_9__4"


    // $ANTLR start "rule__TopologyTemplate__Group_9__4__Impl"
    // InternalToscaDsl.g:1865:1: rule__TopologyTemplate__Group_9__4__Impl : ( '}' ) ;
    public final void rule__TopologyTemplate__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1869:1: ( ( '}' ) )
            // InternalToscaDsl.g:1870:1: ( '}' )
            {
            // InternalToscaDsl.g:1870:1: ( '}' )
            // InternalToscaDsl.g:1871:2: '}'
            {
             before(grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_9__4__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_9_3__0"
    // InternalToscaDsl.g:1881:1: rule__TopologyTemplate__Group_9_3__0 : rule__TopologyTemplate__Group_9_3__0__Impl rule__TopologyTemplate__Group_9_3__1 ;
    public final void rule__TopologyTemplate__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1885:1: ( rule__TopologyTemplate__Group_9_3__0__Impl rule__TopologyTemplate__Group_9_3__1 )
            // InternalToscaDsl.g:1886:2: rule__TopologyTemplate__Group_9_3__0__Impl rule__TopologyTemplate__Group_9_3__1
            {
            pushFollow(FOLLOW_4);
            rule__TopologyTemplate__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_9_3__0"


    // $ANTLR start "rule__TopologyTemplate__Group_9_3__0__Impl"
    // InternalToscaDsl.g:1893:1: rule__TopologyTemplate__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__TopologyTemplate__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1897:1: ( ( ',' ) )
            // InternalToscaDsl.g:1898:1: ( ',' )
            {
            // InternalToscaDsl.g:1898:1: ( ',' )
            // InternalToscaDsl.g:1899:2: ','
            {
             before(grammarAccess.getTopologyTemplateAccess().getCommaKeyword_9_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_9_3__0__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_9_3__1"
    // InternalToscaDsl.g:1908:1: rule__TopologyTemplate__Group_9_3__1 : rule__TopologyTemplate__Group_9_3__1__Impl ;
    public final void rule__TopologyTemplate__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1912:1: ( rule__TopologyTemplate__Group_9_3__1__Impl )
            // InternalToscaDsl.g:1913:2: rule__TopologyTemplate__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_9_3__1"


    // $ANTLR start "rule__TopologyTemplate__Group_9_3__1__Impl"
    // InternalToscaDsl.g:1919:1: rule__TopologyTemplate__Group_9_3__1__Impl : ( ( rule__TopologyTemplate__GroupsAssignment_9_3_1 ) ) ;
    public final void rule__TopologyTemplate__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1923:1: ( ( ( rule__TopologyTemplate__GroupsAssignment_9_3_1 ) ) )
            // InternalToscaDsl.g:1924:1: ( ( rule__TopologyTemplate__GroupsAssignment_9_3_1 ) )
            {
            // InternalToscaDsl.g:1924:1: ( ( rule__TopologyTemplate__GroupsAssignment_9_3_1 ) )
            // InternalToscaDsl.g:1925:2: ( rule__TopologyTemplate__GroupsAssignment_9_3_1 )
            {
             before(grammarAccess.getTopologyTemplateAccess().getGroupsAssignment_9_3_1()); 
            // InternalToscaDsl.g:1926:2: ( rule__TopologyTemplate__GroupsAssignment_9_3_1 )
            // InternalToscaDsl.g:1926:3: rule__TopologyTemplate__GroupsAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__GroupsAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTopologyTemplateAccess().getGroupsAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_9_3__1__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_10__0"
    // InternalToscaDsl.g:1935:1: rule__TopologyTemplate__Group_10__0 : rule__TopologyTemplate__Group_10__0__Impl rule__TopologyTemplate__Group_10__1 ;
    public final void rule__TopologyTemplate__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1939:1: ( rule__TopologyTemplate__Group_10__0__Impl rule__TopologyTemplate__Group_10__1 )
            // InternalToscaDsl.g:1940:2: rule__TopologyTemplate__Group_10__0__Impl rule__TopologyTemplate__Group_10__1
            {
            pushFollow(FOLLOW_9);
            rule__TopologyTemplate__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_10__0"


    // $ANTLR start "rule__TopologyTemplate__Group_10__0__Impl"
    // InternalToscaDsl.g:1947:1: rule__TopologyTemplate__Group_10__0__Impl : ( ',\\n\"policies\" :' ) ;
    public final void rule__TopologyTemplate__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1951:1: ( ( ',\\n\"policies\" :' ) )
            // InternalToscaDsl.g:1952:1: ( ',\\n\"policies\" :' )
            {
            // InternalToscaDsl.g:1952:1: ( ',\\n\"policies\" :' )
            // InternalToscaDsl.g:1953:2: ',\\n\"policies\" :'
            {
             before(grammarAccess.getTopologyTemplateAccess().getPoliciesKeyword_10_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getPoliciesKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_10__0__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_10__1"
    // InternalToscaDsl.g:1962:1: rule__TopologyTemplate__Group_10__1 : rule__TopologyTemplate__Group_10__1__Impl rule__TopologyTemplate__Group_10__2 ;
    public final void rule__TopologyTemplate__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1966:1: ( rule__TopologyTemplate__Group_10__1__Impl rule__TopologyTemplate__Group_10__2 )
            // InternalToscaDsl.g:1967:2: rule__TopologyTemplate__Group_10__1__Impl rule__TopologyTemplate__Group_10__2
            {
            pushFollow(FOLLOW_4);
            rule__TopologyTemplate__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_10__1"


    // $ANTLR start "rule__TopologyTemplate__Group_10__1__Impl"
    // InternalToscaDsl.g:1974:1: rule__TopologyTemplate__Group_10__1__Impl : ( '{' ) ;
    public final void rule__TopologyTemplate__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1978:1: ( ( '{' ) )
            // InternalToscaDsl.g:1979:1: ( '{' )
            {
            // InternalToscaDsl.g:1979:1: ( '{' )
            // InternalToscaDsl.g:1980:2: '{'
            {
             before(grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_10__1__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_10__2"
    // InternalToscaDsl.g:1989:1: rule__TopologyTemplate__Group_10__2 : rule__TopologyTemplate__Group_10__2__Impl rule__TopologyTemplate__Group_10__3 ;
    public final void rule__TopologyTemplate__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:1993:1: ( rule__TopologyTemplate__Group_10__2__Impl rule__TopologyTemplate__Group_10__3 )
            // InternalToscaDsl.g:1994:2: rule__TopologyTemplate__Group_10__2__Impl rule__TopologyTemplate__Group_10__3
            {
            pushFollow(FOLLOW_10);
            rule__TopologyTemplate__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_10__2"


    // $ANTLR start "rule__TopologyTemplate__Group_10__2__Impl"
    // InternalToscaDsl.g:2001:1: rule__TopologyTemplate__Group_10__2__Impl : ( ( rule__TopologyTemplate__PoliciesAssignment_10_2 ) ) ;
    public final void rule__TopologyTemplate__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2005:1: ( ( ( rule__TopologyTemplate__PoliciesAssignment_10_2 ) ) )
            // InternalToscaDsl.g:2006:1: ( ( rule__TopologyTemplate__PoliciesAssignment_10_2 ) )
            {
            // InternalToscaDsl.g:2006:1: ( ( rule__TopologyTemplate__PoliciesAssignment_10_2 ) )
            // InternalToscaDsl.g:2007:2: ( rule__TopologyTemplate__PoliciesAssignment_10_2 )
            {
             before(grammarAccess.getTopologyTemplateAccess().getPoliciesAssignment_10_2()); 
            // InternalToscaDsl.g:2008:2: ( rule__TopologyTemplate__PoliciesAssignment_10_2 )
            // InternalToscaDsl.g:2008:3: rule__TopologyTemplate__PoliciesAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__PoliciesAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getTopologyTemplateAccess().getPoliciesAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_10__2__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_10__3"
    // InternalToscaDsl.g:2016:1: rule__TopologyTemplate__Group_10__3 : rule__TopologyTemplate__Group_10__3__Impl rule__TopologyTemplate__Group_10__4 ;
    public final void rule__TopologyTemplate__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2020:1: ( rule__TopologyTemplate__Group_10__3__Impl rule__TopologyTemplate__Group_10__4 )
            // InternalToscaDsl.g:2021:2: rule__TopologyTemplate__Group_10__3__Impl rule__TopologyTemplate__Group_10__4
            {
            pushFollow(FOLLOW_10);
            rule__TopologyTemplate__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_10__3"


    // $ANTLR start "rule__TopologyTemplate__Group_10__3__Impl"
    // InternalToscaDsl.g:2028:1: rule__TopologyTemplate__Group_10__3__Impl : ( ( rule__TopologyTemplate__Group_10_3__0 )* ) ;
    public final void rule__TopologyTemplate__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2032:1: ( ( ( rule__TopologyTemplate__Group_10_3__0 )* ) )
            // InternalToscaDsl.g:2033:1: ( ( rule__TopologyTemplate__Group_10_3__0 )* )
            {
            // InternalToscaDsl.g:2033:1: ( ( rule__TopologyTemplate__Group_10_3__0 )* )
            // InternalToscaDsl.g:2034:2: ( rule__TopologyTemplate__Group_10_3__0 )*
            {
             before(grammarAccess.getTopologyTemplateAccess().getGroup_10_3()); 
            // InternalToscaDsl.g:2035:2: ( rule__TopologyTemplate__Group_10_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalToscaDsl.g:2035:3: rule__TopologyTemplate__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TopologyTemplate__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getTopologyTemplateAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_10__3__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_10__4"
    // InternalToscaDsl.g:2043:1: rule__TopologyTemplate__Group_10__4 : rule__TopologyTemplate__Group_10__4__Impl ;
    public final void rule__TopologyTemplate__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2047:1: ( rule__TopologyTemplate__Group_10__4__Impl )
            // InternalToscaDsl.g:2048:2: rule__TopologyTemplate__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_10__4"


    // $ANTLR start "rule__TopologyTemplate__Group_10__4__Impl"
    // InternalToscaDsl.g:2054:1: rule__TopologyTemplate__Group_10__4__Impl : ( '}' ) ;
    public final void rule__TopologyTemplate__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2058:1: ( ( '}' ) )
            // InternalToscaDsl.g:2059:1: ( '}' )
            {
            // InternalToscaDsl.g:2059:1: ( '}' )
            // InternalToscaDsl.g:2060:2: '}'
            {
             before(grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_10__4__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_10_3__0"
    // InternalToscaDsl.g:2070:1: rule__TopologyTemplate__Group_10_3__0 : rule__TopologyTemplate__Group_10_3__0__Impl rule__TopologyTemplate__Group_10_3__1 ;
    public final void rule__TopologyTemplate__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2074:1: ( rule__TopologyTemplate__Group_10_3__0__Impl rule__TopologyTemplate__Group_10_3__1 )
            // InternalToscaDsl.g:2075:2: rule__TopologyTemplate__Group_10_3__0__Impl rule__TopologyTemplate__Group_10_3__1
            {
            pushFollow(FOLLOW_4);
            rule__TopologyTemplate__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_10_3__0"


    // $ANTLR start "rule__TopologyTemplate__Group_10_3__0__Impl"
    // InternalToscaDsl.g:2082:1: rule__TopologyTemplate__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__TopologyTemplate__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2086:1: ( ( ',' ) )
            // InternalToscaDsl.g:2087:1: ( ',' )
            {
            // InternalToscaDsl.g:2087:1: ( ',' )
            // InternalToscaDsl.g:2088:2: ','
            {
             before(grammarAccess.getTopologyTemplateAccess().getCommaKeyword_10_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_10_3__0__Impl"


    // $ANTLR start "rule__TopologyTemplate__Group_10_3__1"
    // InternalToscaDsl.g:2097:1: rule__TopologyTemplate__Group_10_3__1 : rule__TopologyTemplate__Group_10_3__1__Impl ;
    public final void rule__TopologyTemplate__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2101:1: ( rule__TopologyTemplate__Group_10_3__1__Impl )
            // InternalToscaDsl.g:2102:2: rule__TopologyTemplate__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_10_3__1"


    // $ANTLR start "rule__TopologyTemplate__Group_10_3__1__Impl"
    // InternalToscaDsl.g:2108:1: rule__TopologyTemplate__Group_10_3__1__Impl : ( ( rule__TopologyTemplate__PoliciesAssignment_10_3_1 ) ) ;
    public final void rule__TopologyTemplate__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2112:1: ( ( ( rule__TopologyTemplate__PoliciesAssignment_10_3_1 ) ) )
            // InternalToscaDsl.g:2113:1: ( ( rule__TopologyTemplate__PoliciesAssignment_10_3_1 ) )
            {
            // InternalToscaDsl.g:2113:1: ( ( rule__TopologyTemplate__PoliciesAssignment_10_3_1 ) )
            // InternalToscaDsl.g:2114:2: ( rule__TopologyTemplate__PoliciesAssignment_10_3_1 )
            {
             before(grammarAccess.getTopologyTemplateAccess().getPoliciesAssignment_10_3_1()); 
            // InternalToscaDsl.g:2115:2: ( rule__TopologyTemplate__PoliciesAssignment_10_3_1 )
            // InternalToscaDsl.g:2115:3: rule__TopologyTemplate__PoliciesAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TopologyTemplate__PoliciesAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTopologyTemplateAccess().getPoliciesAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Group_10_3__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalToscaDsl.g:2124:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2128:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalToscaDsl.g:2129:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalToscaDsl.g:2136:1: rule__Import__Group__0__Impl : ( () ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2140:1: ( ( () ) )
            // InternalToscaDsl.g:2141:1: ( () )
            {
            // InternalToscaDsl.g:2141:1: ( () )
            // InternalToscaDsl.g:2142:2: ()
            {
             before(grammarAccess.getImportAccess().getImportAction_0()); 
            // InternalToscaDsl.g:2143:2: ()
            // InternalToscaDsl.g:2143:3: 
            {
            }

             after(grammarAccess.getImportAccess().getImportAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalToscaDsl.g:2151:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2155:1: ( rule__Import__Group__1__Impl )
            // InternalToscaDsl.g:2156:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalToscaDsl.g:2162:1: rule__Import__Group__1__Impl : ( ( rule__Import__FileAssignment_1 )? ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2166:1: ( ( ( rule__Import__FileAssignment_1 )? ) )
            // InternalToscaDsl.g:2167:1: ( ( rule__Import__FileAssignment_1 )? )
            {
            // InternalToscaDsl.g:2167:1: ( ( rule__Import__FileAssignment_1 )? )
            // InternalToscaDsl.g:2168:2: ( rule__Import__FileAssignment_1 )?
            {
             before(grammarAccess.getImportAccess().getFileAssignment_1()); 
            // InternalToscaDsl.g:2169:2: ( rule__Import__FileAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalToscaDsl.g:2169:3: rule__Import__FileAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Import__FileAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImportAccess().getFileAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalToscaDsl.g:2178:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2182:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalToscaDsl.g:2183:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalToscaDsl.g:2190:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2194:1: ( ( () ) )
            // InternalToscaDsl.g:2195:1: ( () )
            {
            // InternalToscaDsl.g:2195:1: ( () )
            // InternalToscaDsl.g:2196:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalToscaDsl.g:2197:2: ()
            // InternalToscaDsl.g:2197:3: 
            {
            }

             after(grammarAccess.getParameterAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalToscaDsl.g:2205:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2209:1: ( rule__Parameter__Group__1__Impl )
            // InternalToscaDsl.g:2210:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalToscaDsl.g:2216:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__Parameter_nameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2220:1: ( ( ( rule__Parameter__Parameter_nameAssignment_1 ) ) )
            // InternalToscaDsl.g:2221:1: ( ( rule__Parameter__Parameter_nameAssignment_1 ) )
            {
            // InternalToscaDsl.g:2221:1: ( ( rule__Parameter__Parameter_nameAssignment_1 ) )
            // InternalToscaDsl.g:2222:2: ( rule__Parameter__Parameter_nameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getParameter_nameAssignment_1()); 
            // InternalToscaDsl.g:2223:2: ( rule__Parameter__Parameter_nameAssignment_1 )
            // InternalToscaDsl.g:2223:3: rule__Parameter__Parameter_nameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Parameter_nameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getParameter_nameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__NodeTemplate__Group__0"
    // InternalToscaDsl.g:2232:1: rule__NodeTemplate__Group__0 : rule__NodeTemplate__Group__0__Impl rule__NodeTemplate__Group__1 ;
    public final void rule__NodeTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2236:1: ( rule__NodeTemplate__Group__0__Impl rule__NodeTemplate__Group__1 )
            // InternalToscaDsl.g:2237:2: rule__NodeTemplate__Group__0__Impl rule__NodeTemplate__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__NodeTemplate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__0"


    // $ANTLR start "rule__NodeTemplate__Group__0__Impl"
    // InternalToscaDsl.g:2244:1: rule__NodeTemplate__Group__0__Impl : ( () ) ;
    public final void rule__NodeTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2248:1: ( ( () ) )
            // InternalToscaDsl.g:2249:1: ( () )
            {
            // InternalToscaDsl.g:2249:1: ( () )
            // InternalToscaDsl.g:2250:2: ()
            {
             before(grammarAccess.getNodeTemplateAccess().getNodeTemplateAction_0()); 
            // InternalToscaDsl.g:2251:2: ()
            // InternalToscaDsl.g:2251:3: 
            {
            }

             after(grammarAccess.getNodeTemplateAccess().getNodeTemplateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__0__Impl"


    // $ANTLR start "rule__NodeTemplate__Group__1"
    // InternalToscaDsl.g:2259:1: rule__NodeTemplate__Group__1 : rule__NodeTemplate__Group__1__Impl rule__NodeTemplate__Group__2 ;
    public final void rule__NodeTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2263:1: ( rule__NodeTemplate__Group__1__Impl rule__NodeTemplate__Group__2 )
            // InternalToscaDsl.g:2264:2: rule__NodeTemplate__Group__1__Impl rule__NodeTemplate__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__NodeTemplate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__1"


    // $ANTLR start "rule__NodeTemplate__Group__1__Impl"
    // InternalToscaDsl.g:2271:1: rule__NodeTemplate__Group__1__Impl : ( ( rule__NodeTemplate__Node_template_nameAssignment_1 ) ) ;
    public final void rule__NodeTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2275:1: ( ( ( rule__NodeTemplate__Node_template_nameAssignment_1 ) ) )
            // InternalToscaDsl.g:2276:1: ( ( rule__NodeTemplate__Node_template_nameAssignment_1 ) )
            {
            // InternalToscaDsl.g:2276:1: ( ( rule__NodeTemplate__Node_template_nameAssignment_1 ) )
            // InternalToscaDsl.g:2277:2: ( rule__NodeTemplate__Node_template_nameAssignment_1 )
            {
             before(grammarAccess.getNodeTemplateAccess().getNode_template_nameAssignment_1()); 
            // InternalToscaDsl.g:2278:2: ( rule__NodeTemplate__Node_template_nameAssignment_1 )
            // InternalToscaDsl.g:2278:3: rule__NodeTemplate__Node_template_nameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Node_template_nameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTemplateAccess().getNode_template_nameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__1__Impl"


    // $ANTLR start "rule__NodeTemplate__Group__2"
    // InternalToscaDsl.g:2286:1: rule__NodeTemplate__Group__2 : rule__NodeTemplate__Group__2__Impl rule__NodeTemplate__Group__3 ;
    public final void rule__NodeTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2290:1: ( rule__NodeTemplate__Group__2__Impl rule__NodeTemplate__Group__3 )
            // InternalToscaDsl.g:2291:2: rule__NodeTemplate__Group__2__Impl rule__NodeTemplate__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__NodeTemplate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__2"


    // $ANTLR start "rule__NodeTemplate__Group__2__Impl"
    // InternalToscaDsl.g:2298:1: rule__NodeTemplate__Group__2__Impl : ( ':' ) ;
    public final void rule__NodeTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2302:1: ( ( ':' ) )
            // InternalToscaDsl.g:2303:1: ( ':' )
            {
            // InternalToscaDsl.g:2303:1: ( ':' )
            // InternalToscaDsl.g:2304:2: ':'
            {
             before(grammarAccess.getNodeTemplateAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__2__Impl"


    // $ANTLR start "rule__NodeTemplate__Group__3"
    // InternalToscaDsl.g:2313:1: rule__NodeTemplate__Group__3 : rule__NodeTemplate__Group__3__Impl rule__NodeTemplate__Group__4 ;
    public final void rule__NodeTemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2317:1: ( rule__NodeTemplate__Group__3__Impl rule__NodeTemplate__Group__4 )
            // InternalToscaDsl.g:2318:2: rule__NodeTemplate__Group__3__Impl rule__NodeTemplate__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__NodeTemplate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__3"


    // $ANTLR start "rule__NodeTemplate__Group__3__Impl"
    // InternalToscaDsl.g:2325:1: rule__NodeTemplate__Group__3__Impl : ( '{' ) ;
    public final void rule__NodeTemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2329:1: ( ( '{' ) )
            // InternalToscaDsl.g:2330:1: ( '{' )
            {
            // InternalToscaDsl.g:2330:1: ( '{' )
            // InternalToscaDsl.g:2331:2: '{'
            {
             before(grammarAccess.getNodeTemplateAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__3__Impl"


    // $ANTLR start "rule__NodeTemplate__Group__4"
    // InternalToscaDsl.g:2340:1: rule__NodeTemplate__Group__4 : rule__NodeTemplate__Group__4__Impl rule__NodeTemplate__Group__5 ;
    public final void rule__NodeTemplate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2344:1: ( rule__NodeTemplate__Group__4__Impl rule__NodeTemplate__Group__5 )
            // InternalToscaDsl.g:2345:2: rule__NodeTemplate__Group__4__Impl rule__NodeTemplate__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__NodeTemplate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__4"


    // $ANTLR start "rule__NodeTemplate__Group__4__Impl"
    // InternalToscaDsl.g:2352:1: rule__NodeTemplate__Group__4__Impl : ( '\"type\" :' ) ;
    public final void rule__NodeTemplate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2356:1: ( ( '\"type\" :' ) )
            // InternalToscaDsl.g:2357:1: ( '\"type\" :' )
            {
            // InternalToscaDsl.g:2357:1: ( '\"type\" :' )
            // InternalToscaDsl.g:2358:2: '\"type\" :'
            {
             before(grammarAccess.getNodeTemplateAccess().getTypeKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getTypeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__4__Impl"


    // $ANTLR start "rule__NodeTemplate__Group__5"
    // InternalToscaDsl.g:2367:1: rule__NodeTemplate__Group__5 : rule__NodeTemplate__Group__5__Impl rule__NodeTemplate__Group__6 ;
    public final void rule__NodeTemplate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2371:1: ( rule__NodeTemplate__Group__5__Impl rule__NodeTemplate__Group__6 )
            // InternalToscaDsl.g:2372:2: rule__NodeTemplate__Group__5__Impl rule__NodeTemplate__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__NodeTemplate__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__5"


    // $ANTLR start "rule__NodeTemplate__Group__5__Impl"
    // InternalToscaDsl.g:2379:1: rule__NodeTemplate__Group__5__Impl : ( ( rule__NodeTemplate__TypeAssignment_5 ) ) ;
    public final void rule__NodeTemplate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2383:1: ( ( ( rule__NodeTemplate__TypeAssignment_5 ) ) )
            // InternalToscaDsl.g:2384:1: ( ( rule__NodeTemplate__TypeAssignment_5 ) )
            {
            // InternalToscaDsl.g:2384:1: ( ( rule__NodeTemplate__TypeAssignment_5 ) )
            // InternalToscaDsl.g:2385:2: ( rule__NodeTemplate__TypeAssignment_5 )
            {
             before(grammarAccess.getNodeTemplateAccess().getTypeAssignment_5()); 
            // InternalToscaDsl.g:2386:2: ( rule__NodeTemplate__TypeAssignment_5 )
            // InternalToscaDsl.g:2386:3: rule__NodeTemplate__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNodeTemplateAccess().getTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__5__Impl"


    // $ANTLR start "rule__NodeTemplate__Group__6"
    // InternalToscaDsl.g:2394:1: rule__NodeTemplate__Group__6 : rule__NodeTemplate__Group__6__Impl rule__NodeTemplate__Group__7 ;
    public final void rule__NodeTemplate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2398:1: ( rule__NodeTemplate__Group__6__Impl rule__NodeTemplate__Group__7 )
            // InternalToscaDsl.g:2399:2: rule__NodeTemplate__Group__6__Impl rule__NodeTemplate__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__NodeTemplate__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__6"


    // $ANTLR start "rule__NodeTemplate__Group__6__Impl"
    // InternalToscaDsl.g:2406:1: rule__NodeTemplate__Group__6__Impl : ( ( rule__NodeTemplate__Group_6__0 )? ) ;
    public final void rule__NodeTemplate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2410:1: ( ( ( rule__NodeTemplate__Group_6__0 )? ) )
            // InternalToscaDsl.g:2411:1: ( ( rule__NodeTemplate__Group_6__0 )? )
            {
            // InternalToscaDsl.g:2411:1: ( ( rule__NodeTemplate__Group_6__0 )? )
            // InternalToscaDsl.g:2412:2: ( rule__NodeTemplate__Group_6__0 )?
            {
             before(grammarAccess.getNodeTemplateAccess().getGroup_6()); 
            // InternalToscaDsl.g:2413:2: ( rule__NodeTemplate__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalToscaDsl.g:2413:3: rule__NodeTemplate__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeTemplate__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeTemplateAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__6__Impl"


    // $ANTLR start "rule__NodeTemplate__Group__7"
    // InternalToscaDsl.g:2421:1: rule__NodeTemplate__Group__7 : rule__NodeTemplate__Group__7__Impl rule__NodeTemplate__Group__8 ;
    public final void rule__NodeTemplate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2425:1: ( rule__NodeTemplate__Group__7__Impl rule__NodeTemplate__Group__8 )
            // InternalToscaDsl.g:2426:2: rule__NodeTemplate__Group__7__Impl rule__NodeTemplate__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__NodeTemplate__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__7"


    // $ANTLR start "rule__NodeTemplate__Group__7__Impl"
    // InternalToscaDsl.g:2433:1: rule__NodeTemplate__Group__7__Impl : ( ( rule__NodeTemplate__Group_7__0 )? ) ;
    public final void rule__NodeTemplate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2437:1: ( ( ( rule__NodeTemplate__Group_7__0 )? ) )
            // InternalToscaDsl.g:2438:1: ( ( rule__NodeTemplate__Group_7__0 )? )
            {
            // InternalToscaDsl.g:2438:1: ( ( rule__NodeTemplate__Group_7__0 )? )
            // InternalToscaDsl.g:2439:2: ( rule__NodeTemplate__Group_7__0 )?
            {
             before(grammarAccess.getNodeTemplateAccess().getGroup_7()); 
            // InternalToscaDsl.g:2440:2: ( rule__NodeTemplate__Group_7__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalToscaDsl.g:2440:3: rule__NodeTemplate__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeTemplate__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeTemplateAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__7__Impl"


    // $ANTLR start "rule__NodeTemplate__Group__8"
    // InternalToscaDsl.g:2448:1: rule__NodeTemplate__Group__8 : rule__NodeTemplate__Group__8__Impl rule__NodeTemplate__Group__9 ;
    public final void rule__NodeTemplate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2452:1: ( rule__NodeTemplate__Group__8__Impl rule__NodeTemplate__Group__9 )
            // InternalToscaDsl.g:2453:2: rule__NodeTemplate__Group__8__Impl rule__NodeTemplate__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__NodeTemplate__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__8"


    // $ANTLR start "rule__NodeTemplate__Group__8__Impl"
    // InternalToscaDsl.g:2460:1: rule__NodeTemplate__Group__8__Impl : ( ( rule__NodeTemplate__Group_8__0 )? ) ;
    public final void rule__NodeTemplate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2464:1: ( ( ( rule__NodeTemplate__Group_8__0 )? ) )
            // InternalToscaDsl.g:2465:1: ( ( rule__NodeTemplate__Group_8__0 )? )
            {
            // InternalToscaDsl.g:2465:1: ( ( rule__NodeTemplate__Group_8__0 )? )
            // InternalToscaDsl.g:2466:2: ( rule__NodeTemplate__Group_8__0 )?
            {
             before(grammarAccess.getNodeTemplateAccess().getGroup_8()); 
            // InternalToscaDsl.g:2467:2: ( rule__NodeTemplate__Group_8__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalToscaDsl.g:2467:3: rule__NodeTemplate__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeTemplate__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeTemplateAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__8__Impl"


    // $ANTLR start "rule__NodeTemplate__Group__9"
    // InternalToscaDsl.g:2475:1: rule__NodeTemplate__Group__9 : rule__NodeTemplate__Group__9__Impl rule__NodeTemplate__Group__10 ;
    public final void rule__NodeTemplate__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2479:1: ( rule__NodeTemplate__Group__9__Impl rule__NodeTemplate__Group__10 )
            // InternalToscaDsl.g:2480:2: rule__NodeTemplate__Group__9__Impl rule__NodeTemplate__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__NodeTemplate__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__9"


    // $ANTLR start "rule__NodeTemplate__Group__9__Impl"
    // InternalToscaDsl.g:2487:1: rule__NodeTemplate__Group__9__Impl : ( ( rule__NodeTemplate__Group_9__0 )? ) ;
    public final void rule__NodeTemplate__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2491:1: ( ( ( rule__NodeTemplate__Group_9__0 )? ) )
            // InternalToscaDsl.g:2492:1: ( ( rule__NodeTemplate__Group_9__0 )? )
            {
            // InternalToscaDsl.g:2492:1: ( ( rule__NodeTemplate__Group_9__0 )? )
            // InternalToscaDsl.g:2493:2: ( rule__NodeTemplate__Group_9__0 )?
            {
             before(grammarAccess.getNodeTemplateAccess().getGroup_9()); 
            // InternalToscaDsl.g:2494:2: ( rule__NodeTemplate__Group_9__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalToscaDsl.g:2494:3: rule__NodeTemplate__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeTemplate__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeTemplateAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__9__Impl"


    // $ANTLR start "rule__NodeTemplate__Group__10"
    // InternalToscaDsl.g:2502:1: rule__NodeTemplate__Group__10 : rule__NodeTemplate__Group__10__Impl rule__NodeTemplate__Group__11 ;
    public final void rule__NodeTemplate__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2506:1: ( rule__NodeTemplate__Group__10__Impl rule__NodeTemplate__Group__11 )
            // InternalToscaDsl.g:2507:2: rule__NodeTemplate__Group__10__Impl rule__NodeTemplate__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__NodeTemplate__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__10"


    // $ANTLR start "rule__NodeTemplate__Group__10__Impl"
    // InternalToscaDsl.g:2514:1: rule__NodeTemplate__Group__10__Impl : ( ( rule__NodeTemplate__Group_10__0 )? ) ;
    public final void rule__NodeTemplate__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2518:1: ( ( ( rule__NodeTemplate__Group_10__0 )? ) )
            // InternalToscaDsl.g:2519:1: ( ( rule__NodeTemplate__Group_10__0 )? )
            {
            // InternalToscaDsl.g:2519:1: ( ( rule__NodeTemplate__Group_10__0 )? )
            // InternalToscaDsl.g:2520:2: ( rule__NodeTemplate__Group_10__0 )?
            {
             before(grammarAccess.getNodeTemplateAccess().getGroup_10()); 
            // InternalToscaDsl.g:2521:2: ( rule__NodeTemplate__Group_10__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalToscaDsl.g:2521:3: rule__NodeTemplate__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeTemplate__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeTemplateAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__10__Impl"


    // $ANTLR start "rule__NodeTemplate__Group__11"
    // InternalToscaDsl.g:2529:1: rule__NodeTemplate__Group__11 : rule__NodeTemplate__Group__11__Impl rule__NodeTemplate__Group__12 ;
    public final void rule__NodeTemplate__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2533:1: ( rule__NodeTemplate__Group__11__Impl rule__NodeTemplate__Group__12 )
            // InternalToscaDsl.g:2534:2: rule__NodeTemplate__Group__11__Impl rule__NodeTemplate__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__NodeTemplate__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__11"


    // $ANTLR start "rule__NodeTemplate__Group__11__Impl"
    // InternalToscaDsl.g:2541:1: rule__NodeTemplate__Group__11__Impl : ( ( rule__NodeTemplate__Group_11__0 )? ) ;
    public final void rule__NodeTemplate__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2545:1: ( ( ( rule__NodeTemplate__Group_11__0 )? ) )
            // InternalToscaDsl.g:2546:1: ( ( rule__NodeTemplate__Group_11__0 )? )
            {
            // InternalToscaDsl.g:2546:1: ( ( rule__NodeTemplate__Group_11__0 )? )
            // InternalToscaDsl.g:2547:2: ( rule__NodeTemplate__Group_11__0 )?
            {
             before(grammarAccess.getNodeTemplateAccess().getGroup_11()); 
            // InternalToscaDsl.g:2548:2: ( rule__NodeTemplate__Group_11__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalToscaDsl.g:2548:3: rule__NodeTemplate__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeTemplate__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeTemplateAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__11__Impl"


    // $ANTLR start "rule__NodeTemplate__Group__12"
    // InternalToscaDsl.g:2556:1: rule__NodeTemplate__Group__12 : rule__NodeTemplate__Group__12__Impl rule__NodeTemplate__Group__13 ;
    public final void rule__NodeTemplate__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2560:1: ( rule__NodeTemplate__Group__12__Impl rule__NodeTemplate__Group__13 )
            // InternalToscaDsl.g:2561:2: rule__NodeTemplate__Group__12__Impl rule__NodeTemplate__Group__13
            {
            pushFollow(FOLLOW_13);
            rule__NodeTemplate__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__12"


    // $ANTLR start "rule__NodeTemplate__Group__12__Impl"
    // InternalToscaDsl.g:2568:1: rule__NodeTemplate__Group__12__Impl : ( ( rule__NodeTemplate__Group_12__0 )? ) ;
    public final void rule__NodeTemplate__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2572:1: ( ( ( rule__NodeTemplate__Group_12__0 )? ) )
            // InternalToscaDsl.g:2573:1: ( ( rule__NodeTemplate__Group_12__0 )? )
            {
            // InternalToscaDsl.g:2573:1: ( ( rule__NodeTemplate__Group_12__0 )? )
            // InternalToscaDsl.g:2574:2: ( rule__NodeTemplate__Group_12__0 )?
            {
             before(grammarAccess.getNodeTemplateAccess().getGroup_12()); 
            // InternalToscaDsl.g:2575:2: ( rule__NodeTemplate__Group_12__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalToscaDsl.g:2575:3: rule__NodeTemplate__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeTemplate__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeTemplateAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__12__Impl"


    // $ANTLR start "rule__NodeTemplate__Group__13"
    // InternalToscaDsl.g:2583:1: rule__NodeTemplate__Group__13 : rule__NodeTemplate__Group__13__Impl ;
    public final void rule__NodeTemplate__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2587:1: ( rule__NodeTemplate__Group__13__Impl )
            // InternalToscaDsl.g:2588:2: rule__NodeTemplate__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__13"


    // $ANTLR start "rule__NodeTemplate__Group__13__Impl"
    // InternalToscaDsl.g:2594:1: rule__NodeTemplate__Group__13__Impl : ( '}' ) ;
    public final void rule__NodeTemplate__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2598:1: ( ( '}' ) )
            // InternalToscaDsl.g:2599:1: ( '}' )
            {
            // InternalToscaDsl.g:2599:1: ( '}' )
            // InternalToscaDsl.g:2600:2: '}'
            {
             before(grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_13()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group__13__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_6__0"
    // InternalToscaDsl.g:2610:1: rule__NodeTemplate__Group_6__0 : rule__NodeTemplate__Group_6__0__Impl rule__NodeTemplate__Group_6__1 ;
    public final void rule__NodeTemplate__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2614:1: ( rule__NodeTemplate__Group_6__0__Impl rule__NodeTemplate__Group_6__1 )
            // InternalToscaDsl.g:2615:2: rule__NodeTemplate__Group_6__0__Impl rule__NodeTemplate__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__NodeTemplate__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_6__0"


    // $ANTLR start "rule__NodeTemplate__Group_6__0__Impl"
    // InternalToscaDsl.g:2622:1: rule__NodeTemplate__Group_6__0__Impl : ( ',\\n\"description\" :' ) ;
    public final void rule__NodeTemplate__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2626:1: ( ( ',\\n\"description\" :' ) )
            // InternalToscaDsl.g:2627:1: ( ',\\n\"description\" :' )
            {
            // InternalToscaDsl.g:2627:1: ( ',\\n\"description\" :' )
            // InternalToscaDsl.g:2628:2: ',\\n\"description\" :'
            {
             before(grammarAccess.getNodeTemplateAccess().getDescriptionKeyword_6_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getDescriptionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_6__0__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_6__1"
    // InternalToscaDsl.g:2637:1: rule__NodeTemplate__Group_6__1 : rule__NodeTemplate__Group_6__1__Impl ;
    public final void rule__NodeTemplate__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2641:1: ( rule__NodeTemplate__Group_6__1__Impl )
            // InternalToscaDsl.g:2642:2: rule__NodeTemplate__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_6__1"


    // $ANTLR start "rule__NodeTemplate__Group_6__1__Impl"
    // InternalToscaDsl.g:2648:1: rule__NodeTemplate__Group_6__1__Impl : ( ( rule__NodeTemplate__DescriptionAssignment_6_1 ) ) ;
    public final void rule__NodeTemplate__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2652:1: ( ( ( rule__NodeTemplate__DescriptionAssignment_6_1 ) ) )
            // InternalToscaDsl.g:2653:1: ( ( rule__NodeTemplate__DescriptionAssignment_6_1 ) )
            {
            // InternalToscaDsl.g:2653:1: ( ( rule__NodeTemplate__DescriptionAssignment_6_1 ) )
            // InternalToscaDsl.g:2654:2: ( rule__NodeTemplate__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getNodeTemplateAccess().getDescriptionAssignment_6_1()); 
            // InternalToscaDsl.g:2655:2: ( rule__NodeTemplate__DescriptionAssignment_6_1 )
            // InternalToscaDsl.g:2655:3: rule__NodeTemplate__DescriptionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__DescriptionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTemplateAccess().getDescriptionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_6__1__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_7__0"
    // InternalToscaDsl.g:2664:1: rule__NodeTemplate__Group_7__0 : rule__NodeTemplate__Group_7__0__Impl rule__NodeTemplate__Group_7__1 ;
    public final void rule__NodeTemplate__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2668:1: ( rule__NodeTemplate__Group_7__0__Impl rule__NodeTemplate__Group_7__1 )
            // InternalToscaDsl.g:2669:2: rule__NodeTemplate__Group_7__0__Impl rule__NodeTemplate__Group_7__1
            {
            pushFollow(FOLLOW_6);
            rule__NodeTemplate__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_7__0"


    // $ANTLR start "rule__NodeTemplate__Group_7__0__Impl"
    // InternalToscaDsl.g:2676:1: rule__NodeTemplate__Group_7__0__Impl : ( ',\\n\"relationships\" :' ) ;
    public final void rule__NodeTemplate__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2680:1: ( ( ',\\n\"relationships\" :' ) )
            // InternalToscaDsl.g:2681:1: ( ',\\n\"relationships\" :' )
            {
            // InternalToscaDsl.g:2681:1: ( ',\\n\"relationships\" :' )
            // InternalToscaDsl.g:2682:2: ',\\n\"relationships\" :'
            {
             before(grammarAccess.getNodeTemplateAccess().getRelationshipsKeyword_7_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getRelationshipsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_7__0__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_7__1"
    // InternalToscaDsl.g:2691:1: rule__NodeTemplate__Group_7__1 : rule__NodeTemplate__Group_7__1__Impl rule__NodeTemplate__Group_7__2 ;
    public final void rule__NodeTemplate__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2695:1: ( rule__NodeTemplate__Group_7__1__Impl rule__NodeTemplate__Group_7__2 )
            // InternalToscaDsl.g:2696:2: rule__NodeTemplate__Group_7__1__Impl rule__NodeTemplate__Group_7__2
            {
            pushFollow(FOLLOW_9);
            rule__NodeTemplate__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_7__1"


    // $ANTLR start "rule__NodeTemplate__Group_7__1__Impl"
    // InternalToscaDsl.g:2703:1: rule__NodeTemplate__Group_7__1__Impl : ( '[' ) ;
    public final void rule__NodeTemplate__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2707:1: ( ( '[' ) )
            // InternalToscaDsl.g:2708:1: ( '[' )
            {
            // InternalToscaDsl.g:2708:1: ( '[' )
            // InternalToscaDsl.g:2709:2: '['
            {
             before(grammarAccess.getNodeTemplateAccess().getLeftSquareBracketKeyword_7_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getLeftSquareBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_7__1__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_7__2"
    // InternalToscaDsl.g:2718:1: rule__NodeTemplate__Group_7__2 : rule__NodeTemplate__Group_7__2__Impl rule__NodeTemplate__Group_7__3 ;
    public final void rule__NodeTemplate__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2722:1: ( rule__NodeTemplate__Group_7__2__Impl rule__NodeTemplate__Group_7__3 )
            // InternalToscaDsl.g:2723:2: rule__NodeTemplate__Group_7__2__Impl rule__NodeTemplate__Group_7__3
            {
            pushFollow(FOLLOW_7);
            rule__NodeTemplate__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_7__2"


    // $ANTLR start "rule__NodeTemplate__Group_7__2__Impl"
    // InternalToscaDsl.g:2730:1: rule__NodeTemplate__Group_7__2__Impl : ( ( rule__NodeTemplate__RelationshipsAssignment_7_2 ) ) ;
    public final void rule__NodeTemplate__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2734:1: ( ( ( rule__NodeTemplate__RelationshipsAssignment_7_2 ) ) )
            // InternalToscaDsl.g:2735:1: ( ( rule__NodeTemplate__RelationshipsAssignment_7_2 ) )
            {
            // InternalToscaDsl.g:2735:1: ( ( rule__NodeTemplate__RelationshipsAssignment_7_2 ) )
            // InternalToscaDsl.g:2736:2: ( rule__NodeTemplate__RelationshipsAssignment_7_2 )
            {
             before(grammarAccess.getNodeTemplateAccess().getRelationshipsAssignment_7_2()); 
            // InternalToscaDsl.g:2737:2: ( rule__NodeTemplate__RelationshipsAssignment_7_2 )
            // InternalToscaDsl.g:2737:3: rule__NodeTemplate__RelationshipsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__RelationshipsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeTemplateAccess().getRelationshipsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_7__2__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_7__3"
    // InternalToscaDsl.g:2745:1: rule__NodeTemplate__Group_7__3 : rule__NodeTemplate__Group_7__3__Impl rule__NodeTemplate__Group_7__4 ;
    public final void rule__NodeTemplate__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2749:1: ( rule__NodeTemplate__Group_7__3__Impl rule__NodeTemplate__Group_7__4 )
            // InternalToscaDsl.g:2750:2: rule__NodeTemplate__Group_7__3__Impl rule__NodeTemplate__Group_7__4
            {
            pushFollow(FOLLOW_7);
            rule__NodeTemplate__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_7__3"


    // $ANTLR start "rule__NodeTemplate__Group_7__3__Impl"
    // InternalToscaDsl.g:2757:1: rule__NodeTemplate__Group_7__3__Impl : ( ( rule__NodeTemplate__Group_7_3__0 )* ) ;
    public final void rule__NodeTemplate__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2761:1: ( ( ( rule__NodeTemplate__Group_7_3__0 )* ) )
            // InternalToscaDsl.g:2762:1: ( ( rule__NodeTemplate__Group_7_3__0 )* )
            {
            // InternalToscaDsl.g:2762:1: ( ( rule__NodeTemplate__Group_7_3__0 )* )
            // InternalToscaDsl.g:2763:2: ( rule__NodeTemplate__Group_7_3__0 )*
            {
             before(grammarAccess.getNodeTemplateAccess().getGroup_7_3()); 
            // InternalToscaDsl.g:2764:2: ( rule__NodeTemplate__Group_7_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==18) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalToscaDsl.g:2764:3: rule__NodeTemplate__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__NodeTemplate__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getNodeTemplateAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_7__3__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_7__4"
    // InternalToscaDsl.g:2772:1: rule__NodeTemplate__Group_7__4 : rule__NodeTemplate__Group_7__4__Impl ;
    public final void rule__NodeTemplate__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2776:1: ( rule__NodeTemplate__Group_7__4__Impl )
            // InternalToscaDsl.g:2777:2: rule__NodeTemplate__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_7__4"


    // $ANTLR start "rule__NodeTemplate__Group_7__4__Impl"
    // InternalToscaDsl.g:2783:1: rule__NodeTemplate__Group_7__4__Impl : ( ']' ) ;
    public final void rule__NodeTemplate__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2787:1: ( ( ']' ) )
            // InternalToscaDsl.g:2788:1: ( ']' )
            {
            // InternalToscaDsl.g:2788:1: ( ']' )
            // InternalToscaDsl.g:2789:2: ']'
            {
             before(grammarAccess.getNodeTemplateAccess().getRightSquareBracketKeyword_7_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getRightSquareBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_7__4__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_7_3__0"
    // InternalToscaDsl.g:2799:1: rule__NodeTemplate__Group_7_3__0 : rule__NodeTemplate__Group_7_3__0__Impl rule__NodeTemplate__Group_7_3__1 ;
    public final void rule__NodeTemplate__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2803:1: ( rule__NodeTemplate__Group_7_3__0__Impl rule__NodeTemplate__Group_7_3__1 )
            // InternalToscaDsl.g:2804:2: rule__NodeTemplate__Group_7_3__0__Impl rule__NodeTemplate__Group_7_3__1
            {
            pushFollow(FOLLOW_9);
            rule__NodeTemplate__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_7_3__0"


    // $ANTLR start "rule__NodeTemplate__Group_7_3__0__Impl"
    // InternalToscaDsl.g:2811:1: rule__NodeTemplate__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__NodeTemplate__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2815:1: ( ( ',' ) )
            // InternalToscaDsl.g:2816:1: ( ',' )
            {
            // InternalToscaDsl.g:2816:1: ( ',' )
            // InternalToscaDsl.g:2817:2: ','
            {
             before(grammarAccess.getNodeTemplateAccess().getCommaKeyword_7_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_7_3__0__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_7_3__1"
    // InternalToscaDsl.g:2826:1: rule__NodeTemplate__Group_7_3__1 : rule__NodeTemplate__Group_7_3__1__Impl ;
    public final void rule__NodeTemplate__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2830:1: ( rule__NodeTemplate__Group_7_3__1__Impl )
            // InternalToscaDsl.g:2831:2: rule__NodeTemplate__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_7_3__1"


    // $ANTLR start "rule__NodeTemplate__Group_7_3__1__Impl"
    // InternalToscaDsl.g:2837:1: rule__NodeTemplate__Group_7_3__1__Impl : ( ( rule__NodeTemplate__RelationshipsAssignment_7_3_1 ) ) ;
    public final void rule__NodeTemplate__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2841:1: ( ( ( rule__NodeTemplate__RelationshipsAssignment_7_3_1 ) ) )
            // InternalToscaDsl.g:2842:1: ( ( rule__NodeTemplate__RelationshipsAssignment_7_3_1 ) )
            {
            // InternalToscaDsl.g:2842:1: ( ( rule__NodeTemplate__RelationshipsAssignment_7_3_1 ) )
            // InternalToscaDsl.g:2843:2: ( rule__NodeTemplate__RelationshipsAssignment_7_3_1 )
            {
             before(grammarAccess.getNodeTemplateAccess().getRelationshipsAssignment_7_3_1()); 
            // InternalToscaDsl.g:2844:2: ( rule__NodeTemplate__RelationshipsAssignment_7_3_1 )
            // InternalToscaDsl.g:2844:3: rule__NodeTemplate__RelationshipsAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__RelationshipsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTemplateAccess().getRelationshipsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_7_3__1__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_8__0"
    // InternalToscaDsl.g:2853:1: rule__NodeTemplate__Group_8__0 : rule__NodeTemplate__Group_8__0__Impl rule__NodeTemplate__Group_8__1 ;
    public final void rule__NodeTemplate__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2857:1: ( rule__NodeTemplate__Group_8__0__Impl rule__NodeTemplate__Group_8__1 )
            // InternalToscaDsl.g:2858:2: rule__NodeTemplate__Group_8__0__Impl rule__NodeTemplate__Group_8__1
            {
            pushFollow(FOLLOW_9);
            rule__NodeTemplate__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_8__0"


    // $ANTLR start "rule__NodeTemplate__Group_8__0__Impl"
    // InternalToscaDsl.g:2865:1: rule__NodeTemplate__Group_8__0__Impl : ( ',\\n\"interfaces\" :' ) ;
    public final void rule__NodeTemplate__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2869:1: ( ( ',\\n\"interfaces\" :' ) )
            // InternalToscaDsl.g:2870:1: ( ',\\n\"interfaces\" :' )
            {
            // InternalToscaDsl.g:2870:1: ( ',\\n\"interfaces\" :' )
            // InternalToscaDsl.g:2871:2: ',\\n\"interfaces\" :'
            {
             before(grammarAccess.getNodeTemplateAccess().getInterfacesKeyword_8_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getInterfacesKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_8__0__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_8__1"
    // InternalToscaDsl.g:2880:1: rule__NodeTemplate__Group_8__1 : rule__NodeTemplate__Group_8__1__Impl rule__NodeTemplate__Group_8__2 ;
    public final void rule__NodeTemplate__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2884:1: ( rule__NodeTemplate__Group_8__1__Impl rule__NodeTemplate__Group_8__2 )
            // InternalToscaDsl.g:2885:2: rule__NodeTemplate__Group_8__1__Impl rule__NodeTemplate__Group_8__2
            {
            pushFollow(FOLLOW_4);
            rule__NodeTemplate__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_8__1"


    // $ANTLR start "rule__NodeTemplate__Group_8__1__Impl"
    // InternalToscaDsl.g:2892:1: rule__NodeTemplate__Group_8__1__Impl : ( '{' ) ;
    public final void rule__NodeTemplate__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2896:1: ( ( '{' ) )
            // InternalToscaDsl.g:2897:1: ( '{' )
            {
            // InternalToscaDsl.g:2897:1: ( '{' )
            // InternalToscaDsl.g:2898:2: '{'
            {
             before(grammarAccess.getNodeTemplateAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_8__1__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_8__2"
    // InternalToscaDsl.g:2907:1: rule__NodeTemplate__Group_8__2 : rule__NodeTemplate__Group_8__2__Impl rule__NodeTemplate__Group_8__3 ;
    public final void rule__NodeTemplate__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2911:1: ( rule__NodeTemplate__Group_8__2__Impl rule__NodeTemplate__Group_8__3 )
            // InternalToscaDsl.g:2912:2: rule__NodeTemplate__Group_8__2__Impl rule__NodeTemplate__Group_8__3
            {
            pushFollow(FOLLOW_10);
            rule__NodeTemplate__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_8__2"


    // $ANTLR start "rule__NodeTemplate__Group_8__2__Impl"
    // InternalToscaDsl.g:2919:1: rule__NodeTemplate__Group_8__2__Impl : ( ( rule__NodeTemplate__InterfacesAssignment_8_2 ) ) ;
    public final void rule__NodeTemplate__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2923:1: ( ( ( rule__NodeTemplate__InterfacesAssignment_8_2 ) ) )
            // InternalToscaDsl.g:2924:1: ( ( rule__NodeTemplate__InterfacesAssignment_8_2 ) )
            {
            // InternalToscaDsl.g:2924:1: ( ( rule__NodeTemplate__InterfacesAssignment_8_2 ) )
            // InternalToscaDsl.g:2925:2: ( rule__NodeTemplate__InterfacesAssignment_8_2 )
            {
             before(grammarAccess.getNodeTemplateAccess().getInterfacesAssignment_8_2()); 
            // InternalToscaDsl.g:2926:2: ( rule__NodeTemplate__InterfacesAssignment_8_2 )
            // InternalToscaDsl.g:2926:3: rule__NodeTemplate__InterfacesAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__InterfacesAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeTemplateAccess().getInterfacesAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_8__2__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_8__3"
    // InternalToscaDsl.g:2934:1: rule__NodeTemplate__Group_8__3 : rule__NodeTemplate__Group_8__3__Impl rule__NodeTemplate__Group_8__4 ;
    public final void rule__NodeTemplate__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2938:1: ( rule__NodeTemplate__Group_8__3__Impl rule__NodeTemplate__Group_8__4 )
            // InternalToscaDsl.g:2939:2: rule__NodeTemplate__Group_8__3__Impl rule__NodeTemplate__Group_8__4
            {
            pushFollow(FOLLOW_10);
            rule__NodeTemplate__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_8__3"


    // $ANTLR start "rule__NodeTemplate__Group_8__3__Impl"
    // InternalToscaDsl.g:2946:1: rule__NodeTemplate__Group_8__3__Impl : ( ( rule__NodeTemplate__Group_8_3__0 )* ) ;
    public final void rule__NodeTemplate__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2950:1: ( ( ( rule__NodeTemplate__Group_8_3__0 )* ) )
            // InternalToscaDsl.g:2951:1: ( ( rule__NodeTemplate__Group_8_3__0 )* )
            {
            // InternalToscaDsl.g:2951:1: ( ( rule__NodeTemplate__Group_8_3__0 )* )
            // InternalToscaDsl.g:2952:2: ( rule__NodeTemplate__Group_8_3__0 )*
            {
             before(grammarAccess.getNodeTemplateAccess().getGroup_8_3()); 
            // InternalToscaDsl.g:2953:2: ( rule__NodeTemplate__Group_8_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==18) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalToscaDsl.g:2953:3: rule__NodeTemplate__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__NodeTemplate__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getNodeTemplateAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_8__3__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_8__4"
    // InternalToscaDsl.g:2961:1: rule__NodeTemplate__Group_8__4 : rule__NodeTemplate__Group_8__4__Impl ;
    public final void rule__NodeTemplate__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2965:1: ( rule__NodeTemplate__Group_8__4__Impl )
            // InternalToscaDsl.g:2966:2: rule__NodeTemplate__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_8__4"


    // $ANTLR start "rule__NodeTemplate__Group_8__4__Impl"
    // InternalToscaDsl.g:2972:1: rule__NodeTemplate__Group_8__4__Impl : ( '}' ) ;
    public final void rule__NodeTemplate__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2976:1: ( ( '}' ) )
            // InternalToscaDsl.g:2977:1: ( '}' )
            {
            // InternalToscaDsl.g:2977:1: ( '}' )
            // InternalToscaDsl.g:2978:2: '}'
            {
             before(grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_8__4__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_8_3__0"
    // InternalToscaDsl.g:2988:1: rule__NodeTemplate__Group_8_3__0 : rule__NodeTemplate__Group_8_3__0__Impl rule__NodeTemplate__Group_8_3__1 ;
    public final void rule__NodeTemplate__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:2992:1: ( rule__NodeTemplate__Group_8_3__0__Impl rule__NodeTemplate__Group_8_3__1 )
            // InternalToscaDsl.g:2993:2: rule__NodeTemplate__Group_8_3__0__Impl rule__NodeTemplate__Group_8_3__1
            {
            pushFollow(FOLLOW_4);
            rule__NodeTemplate__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_8_3__0"


    // $ANTLR start "rule__NodeTemplate__Group_8_3__0__Impl"
    // InternalToscaDsl.g:3000:1: rule__NodeTemplate__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__NodeTemplate__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3004:1: ( ( ',' ) )
            // InternalToscaDsl.g:3005:1: ( ',' )
            {
            // InternalToscaDsl.g:3005:1: ( ',' )
            // InternalToscaDsl.g:3006:2: ','
            {
             before(grammarAccess.getNodeTemplateAccess().getCommaKeyword_8_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_8_3__0__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_8_3__1"
    // InternalToscaDsl.g:3015:1: rule__NodeTemplate__Group_8_3__1 : rule__NodeTemplate__Group_8_3__1__Impl ;
    public final void rule__NodeTemplate__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3019:1: ( rule__NodeTemplate__Group_8_3__1__Impl )
            // InternalToscaDsl.g:3020:2: rule__NodeTemplate__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_8_3__1"


    // $ANTLR start "rule__NodeTemplate__Group_8_3__1__Impl"
    // InternalToscaDsl.g:3026:1: rule__NodeTemplate__Group_8_3__1__Impl : ( ( rule__NodeTemplate__InterfacesAssignment_8_3_1 ) ) ;
    public final void rule__NodeTemplate__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3030:1: ( ( ( rule__NodeTemplate__InterfacesAssignment_8_3_1 ) ) )
            // InternalToscaDsl.g:3031:1: ( ( rule__NodeTemplate__InterfacesAssignment_8_3_1 ) )
            {
            // InternalToscaDsl.g:3031:1: ( ( rule__NodeTemplate__InterfacesAssignment_8_3_1 ) )
            // InternalToscaDsl.g:3032:2: ( rule__NodeTemplate__InterfacesAssignment_8_3_1 )
            {
             before(grammarAccess.getNodeTemplateAccess().getInterfacesAssignment_8_3_1()); 
            // InternalToscaDsl.g:3033:2: ( rule__NodeTemplate__InterfacesAssignment_8_3_1 )
            // InternalToscaDsl.g:3033:3: rule__NodeTemplate__InterfacesAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__InterfacesAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTemplateAccess().getInterfacesAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_8_3__1__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_9__0"
    // InternalToscaDsl.g:3042:1: rule__NodeTemplate__Group_9__0 : rule__NodeTemplate__Group_9__0__Impl rule__NodeTemplate__Group_9__1 ;
    public final void rule__NodeTemplate__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3046:1: ( rule__NodeTemplate__Group_9__0__Impl rule__NodeTemplate__Group_9__1 )
            // InternalToscaDsl.g:3047:2: rule__NodeTemplate__Group_9__0__Impl rule__NodeTemplate__Group_9__1
            {
            pushFollow(FOLLOW_6);
            rule__NodeTemplate__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_9__0"


    // $ANTLR start "rule__NodeTemplate__Group_9__0__Impl"
    // InternalToscaDsl.g:3054:1: rule__NodeTemplate__Group_9__0__Impl : ( ',\\n\"properties\" :' ) ;
    public final void rule__NodeTemplate__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3058:1: ( ( ',\\n\"properties\" :' ) )
            // InternalToscaDsl.g:3059:1: ( ',\\n\"properties\" :' )
            {
            // InternalToscaDsl.g:3059:1: ( ',\\n\"properties\" :' )
            // InternalToscaDsl.g:3060:2: ',\\n\"properties\" :'
            {
             before(grammarAccess.getNodeTemplateAccess().getPropertiesKeyword_9_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getPropertiesKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_9__0__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_9__1"
    // InternalToscaDsl.g:3069:1: rule__NodeTemplate__Group_9__1 : rule__NodeTemplate__Group_9__1__Impl rule__NodeTemplate__Group_9__2 ;
    public final void rule__NodeTemplate__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3073:1: ( rule__NodeTemplate__Group_9__1__Impl rule__NodeTemplate__Group_9__2 )
            // InternalToscaDsl.g:3074:2: rule__NodeTemplate__Group_9__1__Impl rule__NodeTemplate__Group_9__2
            {
            pushFollow(FOLLOW_9);
            rule__NodeTemplate__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_9__1"


    // $ANTLR start "rule__NodeTemplate__Group_9__1__Impl"
    // InternalToscaDsl.g:3081:1: rule__NodeTemplate__Group_9__1__Impl : ( '[' ) ;
    public final void rule__NodeTemplate__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3085:1: ( ( '[' ) )
            // InternalToscaDsl.g:3086:1: ( '[' )
            {
            // InternalToscaDsl.g:3086:1: ( '[' )
            // InternalToscaDsl.g:3087:2: '['
            {
             before(grammarAccess.getNodeTemplateAccess().getLeftSquareBracketKeyword_9_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getLeftSquareBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_9__1__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_9__2"
    // InternalToscaDsl.g:3096:1: rule__NodeTemplate__Group_9__2 : rule__NodeTemplate__Group_9__2__Impl rule__NodeTemplate__Group_9__3 ;
    public final void rule__NodeTemplate__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3100:1: ( rule__NodeTemplate__Group_9__2__Impl rule__NodeTemplate__Group_9__3 )
            // InternalToscaDsl.g:3101:2: rule__NodeTemplate__Group_9__2__Impl rule__NodeTemplate__Group_9__3
            {
            pushFollow(FOLLOW_7);
            rule__NodeTemplate__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_9__2"


    // $ANTLR start "rule__NodeTemplate__Group_9__2__Impl"
    // InternalToscaDsl.g:3108:1: rule__NodeTemplate__Group_9__2__Impl : ( ( rule__NodeTemplate__PropertiesAssignment_9_2 ) ) ;
    public final void rule__NodeTemplate__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3112:1: ( ( ( rule__NodeTemplate__PropertiesAssignment_9_2 ) ) )
            // InternalToscaDsl.g:3113:1: ( ( rule__NodeTemplate__PropertiesAssignment_9_2 ) )
            {
            // InternalToscaDsl.g:3113:1: ( ( rule__NodeTemplate__PropertiesAssignment_9_2 ) )
            // InternalToscaDsl.g:3114:2: ( rule__NodeTemplate__PropertiesAssignment_9_2 )
            {
             before(grammarAccess.getNodeTemplateAccess().getPropertiesAssignment_9_2()); 
            // InternalToscaDsl.g:3115:2: ( rule__NodeTemplate__PropertiesAssignment_9_2 )
            // InternalToscaDsl.g:3115:3: rule__NodeTemplate__PropertiesAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__PropertiesAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeTemplateAccess().getPropertiesAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_9__2__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_9__3"
    // InternalToscaDsl.g:3123:1: rule__NodeTemplate__Group_9__3 : rule__NodeTemplate__Group_9__3__Impl rule__NodeTemplate__Group_9__4 ;
    public final void rule__NodeTemplate__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3127:1: ( rule__NodeTemplate__Group_9__3__Impl rule__NodeTemplate__Group_9__4 )
            // InternalToscaDsl.g:3128:2: rule__NodeTemplate__Group_9__3__Impl rule__NodeTemplate__Group_9__4
            {
            pushFollow(FOLLOW_7);
            rule__NodeTemplate__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_9__3"


    // $ANTLR start "rule__NodeTemplate__Group_9__3__Impl"
    // InternalToscaDsl.g:3135:1: rule__NodeTemplate__Group_9__3__Impl : ( ( rule__NodeTemplate__Group_9_3__0 )* ) ;
    public final void rule__NodeTemplate__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3139:1: ( ( ( rule__NodeTemplate__Group_9_3__0 )* ) )
            // InternalToscaDsl.g:3140:1: ( ( rule__NodeTemplate__Group_9_3__0 )* )
            {
            // InternalToscaDsl.g:3140:1: ( ( rule__NodeTemplate__Group_9_3__0 )* )
            // InternalToscaDsl.g:3141:2: ( rule__NodeTemplate__Group_9_3__0 )*
            {
             before(grammarAccess.getNodeTemplateAccess().getGroup_9_3()); 
            // InternalToscaDsl.g:3142:2: ( rule__NodeTemplate__Group_9_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==18) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalToscaDsl.g:3142:3: rule__NodeTemplate__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__NodeTemplate__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getNodeTemplateAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_9__3__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_9__4"
    // InternalToscaDsl.g:3150:1: rule__NodeTemplate__Group_9__4 : rule__NodeTemplate__Group_9__4__Impl ;
    public final void rule__NodeTemplate__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3154:1: ( rule__NodeTemplate__Group_9__4__Impl )
            // InternalToscaDsl.g:3155:2: rule__NodeTemplate__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_9__4"


    // $ANTLR start "rule__NodeTemplate__Group_9__4__Impl"
    // InternalToscaDsl.g:3161:1: rule__NodeTemplate__Group_9__4__Impl : ( ']' ) ;
    public final void rule__NodeTemplate__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3165:1: ( ( ']' ) )
            // InternalToscaDsl.g:3166:1: ( ']' )
            {
            // InternalToscaDsl.g:3166:1: ( ']' )
            // InternalToscaDsl.g:3167:2: ']'
            {
             before(grammarAccess.getNodeTemplateAccess().getRightSquareBracketKeyword_9_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getRightSquareBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_9__4__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_9_3__0"
    // InternalToscaDsl.g:3177:1: rule__NodeTemplate__Group_9_3__0 : rule__NodeTemplate__Group_9_3__0__Impl rule__NodeTemplate__Group_9_3__1 ;
    public final void rule__NodeTemplate__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3181:1: ( rule__NodeTemplate__Group_9_3__0__Impl rule__NodeTemplate__Group_9_3__1 )
            // InternalToscaDsl.g:3182:2: rule__NodeTemplate__Group_9_3__0__Impl rule__NodeTemplate__Group_9_3__1
            {
            pushFollow(FOLLOW_9);
            rule__NodeTemplate__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_9_3__0"


    // $ANTLR start "rule__NodeTemplate__Group_9_3__0__Impl"
    // InternalToscaDsl.g:3189:1: rule__NodeTemplate__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__NodeTemplate__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3193:1: ( ( ',' ) )
            // InternalToscaDsl.g:3194:1: ( ',' )
            {
            // InternalToscaDsl.g:3194:1: ( ',' )
            // InternalToscaDsl.g:3195:2: ','
            {
             before(grammarAccess.getNodeTemplateAccess().getCommaKeyword_9_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_9_3__0__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_9_3__1"
    // InternalToscaDsl.g:3204:1: rule__NodeTemplate__Group_9_3__1 : rule__NodeTemplate__Group_9_3__1__Impl ;
    public final void rule__NodeTemplate__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3208:1: ( rule__NodeTemplate__Group_9_3__1__Impl )
            // InternalToscaDsl.g:3209:2: rule__NodeTemplate__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_9_3__1"


    // $ANTLR start "rule__NodeTemplate__Group_9_3__1__Impl"
    // InternalToscaDsl.g:3215:1: rule__NodeTemplate__Group_9_3__1__Impl : ( ( rule__NodeTemplate__PropertiesAssignment_9_3_1 ) ) ;
    public final void rule__NodeTemplate__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3219:1: ( ( ( rule__NodeTemplate__PropertiesAssignment_9_3_1 ) ) )
            // InternalToscaDsl.g:3220:1: ( ( rule__NodeTemplate__PropertiesAssignment_9_3_1 ) )
            {
            // InternalToscaDsl.g:3220:1: ( ( rule__NodeTemplate__PropertiesAssignment_9_3_1 ) )
            // InternalToscaDsl.g:3221:2: ( rule__NodeTemplate__PropertiesAssignment_9_3_1 )
            {
             before(grammarAccess.getNodeTemplateAccess().getPropertiesAssignment_9_3_1()); 
            // InternalToscaDsl.g:3222:2: ( rule__NodeTemplate__PropertiesAssignment_9_3_1 )
            // InternalToscaDsl.g:3222:3: rule__NodeTemplate__PropertiesAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__PropertiesAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTemplateAccess().getPropertiesAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_9_3__1__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_10__0"
    // InternalToscaDsl.g:3231:1: rule__NodeTemplate__Group_10__0 : rule__NodeTemplate__Group_10__0__Impl rule__NodeTemplate__Group_10__1 ;
    public final void rule__NodeTemplate__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3235:1: ( rule__NodeTemplate__Group_10__0__Impl rule__NodeTemplate__Group_10__1 )
            // InternalToscaDsl.g:3236:2: rule__NodeTemplate__Group_10__0__Impl rule__NodeTemplate__Group_10__1
            {
            pushFollow(FOLLOW_9);
            rule__NodeTemplate__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_10__0"


    // $ANTLR start "rule__NodeTemplate__Group_10__0__Impl"
    // InternalToscaDsl.g:3243:1: rule__NodeTemplate__Group_10__0__Impl : ( ',\\n\"attributes\" :' ) ;
    public final void rule__NodeTemplate__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3247:1: ( ( ',\\n\"attributes\" :' ) )
            // InternalToscaDsl.g:3248:1: ( ',\\n\"attributes\" :' )
            {
            // InternalToscaDsl.g:3248:1: ( ',\\n\"attributes\" :' )
            // InternalToscaDsl.g:3249:2: ',\\n\"attributes\" :'
            {
             before(grammarAccess.getNodeTemplateAccess().getAttributesKeyword_10_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getAttributesKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_10__0__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_10__1"
    // InternalToscaDsl.g:3258:1: rule__NodeTemplate__Group_10__1 : rule__NodeTemplate__Group_10__1__Impl rule__NodeTemplate__Group_10__2 ;
    public final void rule__NodeTemplate__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3262:1: ( rule__NodeTemplate__Group_10__1__Impl rule__NodeTemplate__Group_10__2 )
            // InternalToscaDsl.g:3263:2: rule__NodeTemplate__Group_10__1__Impl rule__NodeTemplate__Group_10__2
            {
            pushFollow(FOLLOW_4);
            rule__NodeTemplate__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_10__1"


    // $ANTLR start "rule__NodeTemplate__Group_10__1__Impl"
    // InternalToscaDsl.g:3270:1: rule__NodeTemplate__Group_10__1__Impl : ( '{' ) ;
    public final void rule__NodeTemplate__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3274:1: ( ( '{' ) )
            // InternalToscaDsl.g:3275:1: ( '{' )
            {
            // InternalToscaDsl.g:3275:1: ( '{' )
            // InternalToscaDsl.g:3276:2: '{'
            {
             before(grammarAccess.getNodeTemplateAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getLeftCurlyBracketKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_10__1__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_10__2"
    // InternalToscaDsl.g:3285:1: rule__NodeTemplate__Group_10__2 : rule__NodeTemplate__Group_10__2__Impl rule__NodeTemplate__Group_10__3 ;
    public final void rule__NodeTemplate__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3289:1: ( rule__NodeTemplate__Group_10__2__Impl rule__NodeTemplate__Group_10__3 )
            // InternalToscaDsl.g:3290:2: rule__NodeTemplate__Group_10__2__Impl rule__NodeTemplate__Group_10__3
            {
            pushFollow(FOLLOW_10);
            rule__NodeTemplate__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_10__2"


    // $ANTLR start "rule__NodeTemplate__Group_10__2__Impl"
    // InternalToscaDsl.g:3297:1: rule__NodeTemplate__Group_10__2__Impl : ( ( rule__NodeTemplate__AttributesAssignment_10_2 ) ) ;
    public final void rule__NodeTemplate__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3301:1: ( ( ( rule__NodeTemplate__AttributesAssignment_10_2 ) ) )
            // InternalToscaDsl.g:3302:1: ( ( rule__NodeTemplate__AttributesAssignment_10_2 ) )
            {
            // InternalToscaDsl.g:3302:1: ( ( rule__NodeTemplate__AttributesAssignment_10_2 ) )
            // InternalToscaDsl.g:3303:2: ( rule__NodeTemplate__AttributesAssignment_10_2 )
            {
             before(grammarAccess.getNodeTemplateAccess().getAttributesAssignment_10_2()); 
            // InternalToscaDsl.g:3304:2: ( rule__NodeTemplate__AttributesAssignment_10_2 )
            // InternalToscaDsl.g:3304:3: rule__NodeTemplate__AttributesAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__AttributesAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeTemplateAccess().getAttributesAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_10__2__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_10__3"
    // InternalToscaDsl.g:3312:1: rule__NodeTemplate__Group_10__3 : rule__NodeTemplate__Group_10__3__Impl rule__NodeTemplate__Group_10__4 ;
    public final void rule__NodeTemplate__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3316:1: ( rule__NodeTemplate__Group_10__3__Impl rule__NodeTemplate__Group_10__4 )
            // InternalToscaDsl.g:3317:2: rule__NodeTemplate__Group_10__3__Impl rule__NodeTemplate__Group_10__4
            {
            pushFollow(FOLLOW_10);
            rule__NodeTemplate__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_10__3"


    // $ANTLR start "rule__NodeTemplate__Group_10__3__Impl"
    // InternalToscaDsl.g:3324:1: rule__NodeTemplate__Group_10__3__Impl : ( ( rule__NodeTemplate__Group_10_3__0 )* ) ;
    public final void rule__NodeTemplate__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3328:1: ( ( ( rule__NodeTemplate__Group_10_3__0 )* ) )
            // InternalToscaDsl.g:3329:1: ( ( rule__NodeTemplate__Group_10_3__0 )* )
            {
            // InternalToscaDsl.g:3329:1: ( ( rule__NodeTemplate__Group_10_3__0 )* )
            // InternalToscaDsl.g:3330:2: ( rule__NodeTemplate__Group_10_3__0 )*
            {
             before(grammarAccess.getNodeTemplateAccess().getGroup_10_3()); 
            // InternalToscaDsl.g:3331:2: ( rule__NodeTemplate__Group_10_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==18) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalToscaDsl.g:3331:3: rule__NodeTemplate__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__NodeTemplate__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getNodeTemplateAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_10__3__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_10__4"
    // InternalToscaDsl.g:3339:1: rule__NodeTemplate__Group_10__4 : rule__NodeTemplate__Group_10__4__Impl ;
    public final void rule__NodeTemplate__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3343:1: ( rule__NodeTemplate__Group_10__4__Impl )
            // InternalToscaDsl.g:3344:2: rule__NodeTemplate__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_10__4"


    // $ANTLR start "rule__NodeTemplate__Group_10__4__Impl"
    // InternalToscaDsl.g:3350:1: rule__NodeTemplate__Group_10__4__Impl : ( '}' ) ;
    public final void rule__NodeTemplate__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3354:1: ( ( '}' ) )
            // InternalToscaDsl.g:3355:1: ( '}' )
            {
            // InternalToscaDsl.g:3355:1: ( '}' )
            // InternalToscaDsl.g:3356:2: '}'
            {
             before(grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_10__4__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_10_3__0"
    // InternalToscaDsl.g:3366:1: rule__NodeTemplate__Group_10_3__0 : rule__NodeTemplate__Group_10_3__0__Impl rule__NodeTemplate__Group_10_3__1 ;
    public final void rule__NodeTemplate__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3370:1: ( rule__NodeTemplate__Group_10_3__0__Impl rule__NodeTemplate__Group_10_3__1 )
            // InternalToscaDsl.g:3371:2: rule__NodeTemplate__Group_10_3__0__Impl rule__NodeTemplate__Group_10_3__1
            {
            pushFollow(FOLLOW_4);
            rule__NodeTemplate__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_10_3__0"


    // $ANTLR start "rule__NodeTemplate__Group_10_3__0__Impl"
    // InternalToscaDsl.g:3378:1: rule__NodeTemplate__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__NodeTemplate__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3382:1: ( ( ',' ) )
            // InternalToscaDsl.g:3383:1: ( ',' )
            {
            // InternalToscaDsl.g:3383:1: ( ',' )
            // InternalToscaDsl.g:3384:2: ','
            {
             before(grammarAccess.getNodeTemplateAccess().getCommaKeyword_10_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_10_3__0__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_10_3__1"
    // InternalToscaDsl.g:3393:1: rule__NodeTemplate__Group_10_3__1 : rule__NodeTemplate__Group_10_3__1__Impl ;
    public final void rule__NodeTemplate__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3397:1: ( rule__NodeTemplate__Group_10_3__1__Impl )
            // InternalToscaDsl.g:3398:2: rule__NodeTemplate__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_10_3__1"


    // $ANTLR start "rule__NodeTemplate__Group_10_3__1__Impl"
    // InternalToscaDsl.g:3404:1: rule__NodeTemplate__Group_10_3__1__Impl : ( ( rule__NodeTemplate__AttributesAssignment_10_3_1 ) ) ;
    public final void rule__NodeTemplate__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3408:1: ( ( ( rule__NodeTemplate__AttributesAssignment_10_3_1 ) ) )
            // InternalToscaDsl.g:3409:1: ( ( rule__NodeTemplate__AttributesAssignment_10_3_1 ) )
            {
            // InternalToscaDsl.g:3409:1: ( ( rule__NodeTemplate__AttributesAssignment_10_3_1 ) )
            // InternalToscaDsl.g:3410:2: ( rule__NodeTemplate__AttributesAssignment_10_3_1 )
            {
             before(grammarAccess.getNodeTemplateAccess().getAttributesAssignment_10_3_1()); 
            // InternalToscaDsl.g:3411:2: ( rule__NodeTemplate__AttributesAssignment_10_3_1 )
            // InternalToscaDsl.g:3411:3: rule__NodeTemplate__AttributesAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__AttributesAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTemplateAccess().getAttributesAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_10_3__1__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_11__0"
    // InternalToscaDsl.g:3420:1: rule__NodeTemplate__Group_11__0 : rule__NodeTemplate__Group_11__0__Impl rule__NodeTemplate__Group_11__1 ;
    public final void rule__NodeTemplate__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3424:1: ( rule__NodeTemplate__Group_11__0__Impl rule__NodeTemplate__Group_11__1 )
            // InternalToscaDsl.g:3425:2: rule__NodeTemplate__Group_11__0__Impl rule__NodeTemplate__Group_11__1
            {
            pushFollow(FOLLOW_9);
            rule__NodeTemplate__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_11__0"


    // $ANTLR start "rule__NodeTemplate__Group_11__0__Impl"
    // InternalToscaDsl.g:3432:1: rule__NodeTemplate__Group_11__0__Impl : ( ',\\n\"requirements\" :' ) ;
    public final void rule__NodeTemplate__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3436:1: ( ( ',\\n\"requirements\" :' ) )
            // InternalToscaDsl.g:3437:1: ( ',\\n\"requirements\" :' )
            {
            // InternalToscaDsl.g:3437:1: ( ',\\n\"requirements\" :' )
            // InternalToscaDsl.g:3438:2: ',\\n\"requirements\" :'
            {
             before(grammarAccess.getNodeTemplateAccess().getRequirementsKeyword_11_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getRequirementsKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_11__0__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_11__1"
    // InternalToscaDsl.g:3447:1: rule__NodeTemplate__Group_11__1 : rule__NodeTemplate__Group_11__1__Impl rule__NodeTemplate__Group_11__2 ;
    public final void rule__NodeTemplate__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3451:1: ( rule__NodeTemplate__Group_11__1__Impl rule__NodeTemplate__Group_11__2 )
            // InternalToscaDsl.g:3452:2: rule__NodeTemplate__Group_11__1__Impl rule__NodeTemplate__Group_11__2
            {
            pushFollow(FOLLOW_4);
            rule__NodeTemplate__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_11__1"


    // $ANTLR start "rule__NodeTemplate__Group_11__1__Impl"
    // InternalToscaDsl.g:3459:1: rule__NodeTemplate__Group_11__1__Impl : ( '{' ) ;
    public final void rule__NodeTemplate__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3463:1: ( ( '{' ) )
            // InternalToscaDsl.g:3464:1: ( '{' )
            {
            // InternalToscaDsl.g:3464:1: ( '{' )
            // InternalToscaDsl.g:3465:2: '{'
            {
             before(grammarAccess.getNodeTemplateAccess().getLeftCurlyBracketKeyword_11_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getLeftCurlyBracketKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_11__1__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_11__2"
    // InternalToscaDsl.g:3474:1: rule__NodeTemplate__Group_11__2 : rule__NodeTemplate__Group_11__2__Impl rule__NodeTemplate__Group_11__3 ;
    public final void rule__NodeTemplate__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3478:1: ( rule__NodeTemplate__Group_11__2__Impl rule__NodeTemplate__Group_11__3 )
            // InternalToscaDsl.g:3479:2: rule__NodeTemplate__Group_11__2__Impl rule__NodeTemplate__Group_11__3
            {
            pushFollow(FOLLOW_10);
            rule__NodeTemplate__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_11__2"


    // $ANTLR start "rule__NodeTemplate__Group_11__2__Impl"
    // InternalToscaDsl.g:3486:1: rule__NodeTemplate__Group_11__2__Impl : ( ( rule__NodeTemplate__RequirementsAssignment_11_2 ) ) ;
    public final void rule__NodeTemplate__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3490:1: ( ( ( rule__NodeTemplate__RequirementsAssignment_11_2 ) ) )
            // InternalToscaDsl.g:3491:1: ( ( rule__NodeTemplate__RequirementsAssignment_11_2 ) )
            {
            // InternalToscaDsl.g:3491:1: ( ( rule__NodeTemplate__RequirementsAssignment_11_2 ) )
            // InternalToscaDsl.g:3492:2: ( rule__NodeTemplate__RequirementsAssignment_11_2 )
            {
             before(grammarAccess.getNodeTemplateAccess().getRequirementsAssignment_11_2()); 
            // InternalToscaDsl.g:3493:2: ( rule__NodeTemplate__RequirementsAssignment_11_2 )
            // InternalToscaDsl.g:3493:3: rule__NodeTemplate__RequirementsAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__RequirementsAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeTemplateAccess().getRequirementsAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_11__2__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_11__3"
    // InternalToscaDsl.g:3501:1: rule__NodeTemplate__Group_11__3 : rule__NodeTemplate__Group_11__3__Impl rule__NodeTemplate__Group_11__4 ;
    public final void rule__NodeTemplate__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3505:1: ( rule__NodeTemplate__Group_11__3__Impl rule__NodeTemplate__Group_11__4 )
            // InternalToscaDsl.g:3506:2: rule__NodeTemplate__Group_11__3__Impl rule__NodeTemplate__Group_11__4
            {
            pushFollow(FOLLOW_10);
            rule__NodeTemplate__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_11__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_11__3"


    // $ANTLR start "rule__NodeTemplate__Group_11__3__Impl"
    // InternalToscaDsl.g:3513:1: rule__NodeTemplate__Group_11__3__Impl : ( ( rule__NodeTemplate__Group_11_3__0 )* ) ;
    public final void rule__NodeTemplate__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3517:1: ( ( ( rule__NodeTemplate__Group_11_3__0 )* ) )
            // InternalToscaDsl.g:3518:1: ( ( rule__NodeTemplate__Group_11_3__0 )* )
            {
            // InternalToscaDsl.g:3518:1: ( ( rule__NodeTemplate__Group_11_3__0 )* )
            // InternalToscaDsl.g:3519:2: ( rule__NodeTemplate__Group_11_3__0 )*
            {
             before(grammarAccess.getNodeTemplateAccess().getGroup_11_3()); 
            // InternalToscaDsl.g:3520:2: ( rule__NodeTemplate__Group_11_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==18) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalToscaDsl.g:3520:3: rule__NodeTemplate__Group_11_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__NodeTemplate__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getNodeTemplateAccess().getGroup_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_11__3__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_11__4"
    // InternalToscaDsl.g:3528:1: rule__NodeTemplate__Group_11__4 : rule__NodeTemplate__Group_11__4__Impl ;
    public final void rule__NodeTemplate__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3532:1: ( rule__NodeTemplate__Group_11__4__Impl )
            // InternalToscaDsl.g:3533:2: rule__NodeTemplate__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_11__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_11__4"


    // $ANTLR start "rule__NodeTemplate__Group_11__4__Impl"
    // InternalToscaDsl.g:3539:1: rule__NodeTemplate__Group_11__4__Impl : ( '}' ) ;
    public final void rule__NodeTemplate__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3543:1: ( ( '}' ) )
            // InternalToscaDsl.g:3544:1: ( '}' )
            {
            // InternalToscaDsl.g:3544:1: ( '}' )
            // InternalToscaDsl.g:3545:2: '}'
            {
             before(grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_11_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_11__4__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_11_3__0"
    // InternalToscaDsl.g:3555:1: rule__NodeTemplate__Group_11_3__0 : rule__NodeTemplate__Group_11_3__0__Impl rule__NodeTemplate__Group_11_3__1 ;
    public final void rule__NodeTemplate__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3559:1: ( rule__NodeTemplate__Group_11_3__0__Impl rule__NodeTemplate__Group_11_3__1 )
            // InternalToscaDsl.g:3560:2: rule__NodeTemplate__Group_11_3__0__Impl rule__NodeTemplate__Group_11_3__1
            {
            pushFollow(FOLLOW_4);
            rule__NodeTemplate__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_11_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_11_3__0"


    // $ANTLR start "rule__NodeTemplate__Group_11_3__0__Impl"
    // InternalToscaDsl.g:3567:1: rule__NodeTemplate__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__NodeTemplate__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3571:1: ( ( ',' ) )
            // InternalToscaDsl.g:3572:1: ( ',' )
            {
            // InternalToscaDsl.g:3572:1: ( ',' )
            // InternalToscaDsl.g:3573:2: ','
            {
             before(grammarAccess.getNodeTemplateAccess().getCommaKeyword_11_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getCommaKeyword_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_11_3__0__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_11_3__1"
    // InternalToscaDsl.g:3582:1: rule__NodeTemplate__Group_11_3__1 : rule__NodeTemplate__Group_11_3__1__Impl ;
    public final void rule__NodeTemplate__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3586:1: ( rule__NodeTemplate__Group_11_3__1__Impl )
            // InternalToscaDsl.g:3587:2: rule__NodeTemplate__Group_11_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_11_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_11_3__1"


    // $ANTLR start "rule__NodeTemplate__Group_11_3__1__Impl"
    // InternalToscaDsl.g:3593:1: rule__NodeTemplate__Group_11_3__1__Impl : ( ( rule__NodeTemplate__RequirementsAssignment_11_3_1 ) ) ;
    public final void rule__NodeTemplate__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3597:1: ( ( ( rule__NodeTemplate__RequirementsAssignment_11_3_1 ) ) )
            // InternalToscaDsl.g:3598:1: ( ( rule__NodeTemplate__RequirementsAssignment_11_3_1 ) )
            {
            // InternalToscaDsl.g:3598:1: ( ( rule__NodeTemplate__RequirementsAssignment_11_3_1 ) )
            // InternalToscaDsl.g:3599:2: ( rule__NodeTemplate__RequirementsAssignment_11_3_1 )
            {
             before(grammarAccess.getNodeTemplateAccess().getRequirementsAssignment_11_3_1()); 
            // InternalToscaDsl.g:3600:2: ( rule__NodeTemplate__RequirementsAssignment_11_3_1 )
            // InternalToscaDsl.g:3600:3: rule__NodeTemplate__RequirementsAssignment_11_3_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__RequirementsAssignment_11_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTemplateAccess().getRequirementsAssignment_11_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_11_3__1__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_12__0"
    // InternalToscaDsl.g:3609:1: rule__NodeTemplate__Group_12__0 : rule__NodeTemplate__Group_12__0__Impl rule__NodeTemplate__Group_12__1 ;
    public final void rule__NodeTemplate__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3613:1: ( rule__NodeTemplate__Group_12__0__Impl rule__NodeTemplate__Group_12__1 )
            // InternalToscaDsl.g:3614:2: rule__NodeTemplate__Group_12__0__Impl rule__NodeTemplate__Group_12__1
            {
            pushFollow(FOLLOW_9);
            rule__NodeTemplate__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_12__0"


    // $ANTLR start "rule__NodeTemplate__Group_12__0__Impl"
    // InternalToscaDsl.g:3621:1: rule__NodeTemplate__Group_12__0__Impl : ( ',\\n\"capabilities\" :' ) ;
    public final void rule__NodeTemplate__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3625:1: ( ( ',\\n\"capabilities\" :' ) )
            // InternalToscaDsl.g:3626:1: ( ',\\n\"capabilities\" :' )
            {
            // InternalToscaDsl.g:3626:1: ( ',\\n\"capabilities\" :' )
            // InternalToscaDsl.g:3627:2: ',\\n\"capabilities\" :'
            {
             before(grammarAccess.getNodeTemplateAccess().getCapabilitiesKeyword_12_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getCapabilitiesKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_12__0__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_12__1"
    // InternalToscaDsl.g:3636:1: rule__NodeTemplate__Group_12__1 : rule__NodeTemplate__Group_12__1__Impl rule__NodeTemplate__Group_12__2 ;
    public final void rule__NodeTemplate__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3640:1: ( rule__NodeTemplate__Group_12__1__Impl rule__NodeTemplate__Group_12__2 )
            // InternalToscaDsl.g:3641:2: rule__NodeTemplate__Group_12__1__Impl rule__NodeTemplate__Group_12__2
            {
            pushFollow(FOLLOW_4);
            rule__NodeTemplate__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_12__1"


    // $ANTLR start "rule__NodeTemplate__Group_12__1__Impl"
    // InternalToscaDsl.g:3648:1: rule__NodeTemplate__Group_12__1__Impl : ( '{' ) ;
    public final void rule__NodeTemplate__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3652:1: ( ( '{' ) )
            // InternalToscaDsl.g:3653:1: ( '{' )
            {
            // InternalToscaDsl.g:3653:1: ( '{' )
            // InternalToscaDsl.g:3654:2: '{'
            {
             before(grammarAccess.getNodeTemplateAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getLeftCurlyBracketKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_12__1__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_12__2"
    // InternalToscaDsl.g:3663:1: rule__NodeTemplate__Group_12__2 : rule__NodeTemplate__Group_12__2__Impl rule__NodeTemplate__Group_12__3 ;
    public final void rule__NodeTemplate__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3667:1: ( rule__NodeTemplate__Group_12__2__Impl rule__NodeTemplate__Group_12__3 )
            // InternalToscaDsl.g:3668:2: rule__NodeTemplate__Group_12__2__Impl rule__NodeTemplate__Group_12__3
            {
            pushFollow(FOLLOW_10);
            rule__NodeTemplate__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_12__2"


    // $ANTLR start "rule__NodeTemplate__Group_12__2__Impl"
    // InternalToscaDsl.g:3675:1: rule__NodeTemplate__Group_12__2__Impl : ( ( rule__NodeTemplate__CapabilitiesAssignment_12_2 ) ) ;
    public final void rule__NodeTemplate__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3679:1: ( ( ( rule__NodeTemplate__CapabilitiesAssignment_12_2 ) ) )
            // InternalToscaDsl.g:3680:1: ( ( rule__NodeTemplate__CapabilitiesAssignment_12_2 ) )
            {
            // InternalToscaDsl.g:3680:1: ( ( rule__NodeTemplate__CapabilitiesAssignment_12_2 ) )
            // InternalToscaDsl.g:3681:2: ( rule__NodeTemplate__CapabilitiesAssignment_12_2 )
            {
             before(grammarAccess.getNodeTemplateAccess().getCapabilitiesAssignment_12_2()); 
            // InternalToscaDsl.g:3682:2: ( rule__NodeTemplate__CapabilitiesAssignment_12_2 )
            // InternalToscaDsl.g:3682:3: rule__NodeTemplate__CapabilitiesAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__CapabilitiesAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeTemplateAccess().getCapabilitiesAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_12__2__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_12__3"
    // InternalToscaDsl.g:3690:1: rule__NodeTemplate__Group_12__3 : rule__NodeTemplate__Group_12__3__Impl rule__NodeTemplate__Group_12__4 ;
    public final void rule__NodeTemplate__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3694:1: ( rule__NodeTemplate__Group_12__3__Impl rule__NodeTemplate__Group_12__4 )
            // InternalToscaDsl.g:3695:2: rule__NodeTemplate__Group_12__3__Impl rule__NodeTemplate__Group_12__4
            {
            pushFollow(FOLLOW_10);
            rule__NodeTemplate__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_12__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_12__3"


    // $ANTLR start "rule__NodeTemplate__Group_12__3__Impl"
    // InternalToscaDsl.g:3702:1: rule__NodeTemplate__Group_12__3__Impl : ( ( rule__NodeTemplate__Group_12_3__0 )* ) ;
    public final void rule__NodeTemplate__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3706:1: ( ( ( rule__NodeTemplate__Group_12_3__0 )* ) )
            // InternalToscaDsl.g:3707:1: ( ( rule__NodeTemplate__Group_12_3__0 )* )
            {
            // InternalToscaDsl.g:3707:1: ( ( rule__NodeTemplate__Group_12_3__0 )* )
            // InternalToscaDsl.g:3708:2: ( rule__NodeTemplate__Group_12_3__0 )*
            {
             before(grammarAccess.getNodeTemplateAccess().getGroup_12_3()); 
            // InternalToscaDsl.g:3709:2: ( rule__NodeTemplate__Group_12_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==18) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalToscaDsl.g:3709:3: rule__NodeTemplate__Group_12_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__NodeTemplate__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getNodeTemplateAccess().getGroup_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_12__3__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_12__4"
    // InternalToscaDsl.g:3717:1: rule__NodeTemplate__Group_12__4 : rule__NodeTemplate__Group_12__4__Impl ;
    public final void rule__NodeTemplate__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3721:1: ( rule__NodeTemplate__Group_12__4__Impl )
            // InternalToscaDsl.g:3722:2: rule__NodeTemplate__Group_12__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_12__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_12__4"


    // $ANTLR start "rule__NodeTemplate__Group_12__4__Impl"
    // InternalToscaDsl.g:3728:1: rule__NodeTemplate__Group_12__4__Impl : ( '}' ) ;
    public final void rule__NodeTemplate__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3732:1: ( ( '}' ) )
            // InternalToscaDsl.g:3733:1: ( '}' )
            {
            // InternalToscaDsl.g:3733:1: ( '}' )
            // InternalToscaDsl.g:3734:2: '}'
            {
             before(grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_12_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_12_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_12__4__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_12_3__0"
    // InternalToscaDsl.g:3744:1: rule__NodeTemplate__Group_12_3__0 : rule__NodeTemplate__Group_12_3__0__Impl rule__NodeTemplate__Group_12_3__1 ;
    public final void rule__NodeTemplate__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3748:1: ( rule__NodeTemplate__Group_12_3__0__Impl rule__NodeTemplate__Group_12_3__1 )
            // InternalToscaDsl.g:3749:2: rule__NodeTemplate__Group_12_3__0__Impl rule__NodeTemplate__Group_12_3__1
            {
            pushFollow(FOLLOW_4);
            rule__NodeTemplate__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_12_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_12_3__0"


    // $ANTLR start "rule__NodeTemplate__Group_12_3__0__Impl"
    // InternalToscaDsl.g:3756:1: rule__NodeTemplate__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__NodeTemplate__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3760:1: ( ( ',' ) )
            // InternalToscaDsl.g:3761:1: ( ',' )
            {
            // InternalToscaDsl.g:3761:1: ( ',' )
            // InternalToscaDsl.g:3762:2: ','
            {
             before(grammarAccess.getNodeTemplateAccess().getCommaKeyword_12_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getCommaKeyword_12_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_12_3__0__Impl"


    // $ANTLR start "rule__NodeTemplate__Group_12_3__1"
    // InternalToscaDsl.g:3771:1: rule__NodeTemplate__Group_12_3__1 : rule__NodeTemplate__Group_12_3__1__Impl ;
    public final void rule__NodeTemplate__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3775:1: ( rule__NodeTemplate__Group_12_3__1__Impl )
            // InternalToscaDsl.g:3776:2: rule__NodeTemplate__Group_12_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__Group_12_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_12_3__1"


    // $ANTLR start "rule__NodeTemplate__Group_12_3__1__Impl"
    // InternalToscaDsl.g:3782:1: rule__NodeTemplate__Group_12_3__1__Impl : ( ( rule__NodeTemplate__CapabilitiesAssignment_12_3_1 ) ) ;
    public final void rule__NodeTemplate__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3786:1: ( ( ( rule__NodeTemplate__CapabilitiesAssignment_12_3_1 ) ) )
            // InternalToscaDsl.g:3787:1: ( ( rule__NodeTemplate__CapabilitiesAssignment_12_3_1 ) )
            {
            // InternalToscaDsl.g:3787:1: ( ( rule__NodeTemplate__CapabilitiesAssignment_12_3_1 ) )
            // InternalToscaDsl.g:3788:2: ( rule__NodeTemplate__CapabilitiesAssignment_12_3_1 )
            {
             before(grammarAccess.getNodeTemplateAccess().getCapabilitiesAssignment_12_3_1()); 
            // InternalToscaDsl.g:3789:2: ( rule__NodeTemplate__CapabilitiesAssignment_12_3_1 )
            // InternalToscaDsl.g:3789:3: rule__NodeTemplate__CapabilitiesAssignment_12_3_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeTemplate__CapabilitiesAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTemplateAccess().getCapabilitiesAssignment_12_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Group_12_3__1__Impl"


    // $ANTLR start "rule__Relationship__Group__0"
    // InternalToscaDsl.g:3798:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3802:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // InternalToscaDsl.g:3803:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Relationship__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0"


    // $ANTLR start "rule__Relationship__Group__0__Impl"
    // InternalToscaDsl.g:3810:1: rule__Relationship__Group__0__Impl : ( () ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3814:1: ( ( () ) )
            // InternalToscaDsl.g:3815:1: ( () )
            {
            // InternalToscaDsl.g:3815:1: ( () )
            // InternalToscaDsl.g:3816:2: ()
            {
             before(grammarAccess.getRelationshipAccess().getRelationshipAction_0()); 
            // InternalToscaDsl.g:3817:2: ()
            // InternalToscaDsl.g:3817:3: 
            {
            }

             after(grammarAccess.getRelationshipAccess().getRelationshipAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0__Impl"


    // $ANTLR start "rule__Relationship__Group__1"
    // InternalToscaDsl.g:3825:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3829:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // InternalToscaDsl.g:3830:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Relationship__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1"


    // $ANTLR start "rule__Relationship__Group__1__Impl"
    // InternalToscaDsl.g:3837:1: rule__Relationship__Group__1__Impl : ( '{' ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3841:1: ( ( '{' ) )
            // InternalToscaDsl.g:3842:1: ( '{' )
            {
            // InternalToscaDsl.g:3842:1: ( '{' )
            // InternalToscaDsl.g:3843:2: '{'
            {
             before(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1__Impl"


    // $ANTLR start "rule__Relationship__Group__2"
    // InternalToscaDsl.g:3852:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl rule__Relationship__Group__3 ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3856:1: ( rule__Relationship__Group__2__Impl rule__Relationship__Group__3 )
            // InternalToscaDsl.g:3857:2: rule__Relationship__Group__2__Impl rule__Relationship__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Relationship__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__2"


    // $ANTLR start "rule__Relationship__Group__2__Impl"
    // InternalToscaDsl.g:3864:1: rule__Relationship__Group__2__Impl : ( '\"type\" :' ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3868:1: ( ( '\"type\" :' ) )
            // InternalToscaDsl.g:3869:1: ( '\"type\" :' )
            {
            // InternalToscaDsl.g:3869:1: ( '\"type\" :' )
            // InternalToscaDsl.g:3870:2: '\"type\" :'
            {
             before(grammarAccess.getRelationshipAccess().getTypeKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__2__Impl"


    // $ANTLR start "rule__Relationship__Group__3"
    // InternalToscaDsl.g:3879:1: rule__Relationship__Group__3 : rule__Relationship__Group__3__Impl rule__Relationship__Group__4 ;
    public final void rule__Relationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3883:1: ( rule__Relationship__Group__3__Impl rule__Relationship__Group__4 )
            // InternalToscaDsl.g:3884:2: rule__Relationship__Group__3__Impl rule__Relationship__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Relationship__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__3"


    // $ANTLR start "rule__Relationship__Group__3__Impl"
    // InternalToscaDsl.g:3891:1: rule__Relationship__Group__3__Impl : ( ( rule__Relationship__TypeAssignment_3 ) ) ;
    public final void rule__Relationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3895:1: ( ( ( rule__Relationship__TypeAssignment_3 ) ) )
            // InternalToscaDsl.g:3896:1: ( ( rule__Relationship__TypeAssignment_3 ) )
            {
            // InternalToscaDsl.g:3896:1: ( ( rule__Relationship__TypeAssignment_3 ) )
            // InternalToscaDsl.g:3897:2: ( rule__Relationship__TypeAssignment_3 )
            {
             before(grammarAccess.getRelationshipAccess().getTypeAssignment_3()); 
            // InternalToscaDsl.g:3898:2: ( rule__Relationship__TypeAssignment_3 )
            // InternalToscaDsl.g:3898:3: rule__Relationship__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__3__Impl"


    // $ANTLR start "rule__Relationship__Group__4"
    // InternalToscaDsl.g:3906:1: rule__Relationship__Group__4 : rule__Relationship__Group__4__Impl rule__Relationship__Group__5 ;
    public final void rule__Relationship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3910:1: ( rule__Relationship__Group__4__Impl rule__Relationship__Group__5 )
            // InternalToscaDsl.g:3911:2: rule__Relationship__Group__4__Impl rule__Relationship__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Relationship__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__4"


    // $ANTLR start "rule__Relationship__Group__4__Impl"
    // InternalToscaDsl.g:3918:1: rule__Relationship__Group__4__Impl : ( ( rule__Relationship__Group_4__0 )? ) ;
    public final void rule__Relationship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3922:1: ( ( ( rule__Relationship__Group_4__0 )? ) )
            // InternalToscaDsl.g:3923:1: ( ( rule__Relationship__Group_4__0 )? )
            {
            // InternalToscaDsl.g:3923:1: ( ( rule__Relationship__Group_4__0 )? )
            // InternalToscaDsl.g:3924:2: ( rule__Relationship__Group_4__0 )?
            {
             before(grammarAccess.getRelationshipAccess().getGroup_4()); 
            // InternalToscaDsl.g:3925:2: ( rule__Relationship__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalToscaDsl.g:3925:3: rule__Relationship__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relationship__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationshipAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__4__Impl"


    // $ANTLR start "rule__Relationship__Group__5"
    // InternalToscaDsl.g:3933:1: rule__Relationship__Group__5 : rule__Relationship__Group__5__Impl rule__Relationship__Group__6 ;
    public final void rule__Relationship__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3937:1: ( rule__Relationship__Group__5__Impl rule__Relationship__Group__6 )
            // InternalToscaDsl.g:3938:2: rule__Relationship__Group__5__Impl rule__Relationship__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Relationship__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__5"


    // $ANTLR start "rule__Relationship__Group__5__Impl"
    // InternalToscaDsl.g:3945:1: rule__Relationship__Group__5__Impl : ( ( rule__Relationship__Group_5__0 )? ) ;
    public final void rule__Relationship__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3949:1: ( ( ( rule__Relationship__Group_5__0 )? ) )
            // InternalToscaDsl.g:3950:1: ( ( rule__Relationship__Group_5__0 )? )
            {
            // InternalToscaDsl.g:3950:1: ( ( rule__Relationship__Group_5__0 )? )
            // InternalToscaDsl.g:3951:2: ( rule__Relationship__Group_5__0 )?
            {
             before(grammarAccess.getRelationshipAccess().getGroup_5()); 
            // InternalToscaDsl.g:3952:2: ( rule__Relationship__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==28) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalToscaDsl.g:3952:3: rule__Relationship__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relationship__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationshipAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__5__Impl"


    // $ANTLR start "rule__Relationship__Group__6"
    // InternalToscaDsl.g:3960:1: rule__Relationship__Group__6 : rule__Relationship__Group__6__Impl rule__Relationship__Group__7 ;
    public final void rule__Relationship__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3964:1: ( rule__Relationship__Group__6__Impl rule__Relationship__Group__7 )
            // InternalToscaDsl.g:3965:2: rule__Relationship__Group__6__Impl rule__Relationship__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Relationship__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__6"


    // $ANTLR start "rule__Relationship__Group__6__Impl"
    // InternalToscaDsl.g:3972:1: rule__Relationship__Group__6__Impl : ( ( rule__Relationship__Group_6__0 )? ) ;
    public final void rule__Relationship__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3976:1: ( ( ( rule__Relationship__Group_6__0 )? ) )
            // InternalToscaDsl.g:3977:1: ( ( rule__Relationship__Group_6__0 )? )
            {
            // InternalToscaDsl.g:3977:1: ( ( rule__Relationship__Group_6__0 )? )
            // InternalToscaDsl.g:3978:2: ( rule__Relationship__Group_6__0 )?
            {
             before(grammarAccess.getRelationshipAccess().getGroup_6()); 
            // InternalToscaDsl.g:3979:2: ( rule__Relationship__Group_6__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==29) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalToscaDsl.g:3979:3: rule__Relationship__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relationship__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationshipAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__6__Impl"


    // $ANTLR start "rule__Relationship__Group__7"
    // InternalToscaDsl.g:3987:1: rule__Relationship__Group__7 : rule__Relationship__Group__7__Impl rule__Relationship__Group__8 ;
    public final void rule__Relationship__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:3991:1: ( rule__Relationship__Group__7__Impl rule__Relationship__Group__8 )
            // InternalToscaDsl.g:3992:2: rule__Relationship__Group__7__Impl rule__Relationship__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__Relationship__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__7"


    // $ANTLR start "rule__Relationship__Group__7__Impl"
    // InternalToscaDsl.g:3999:1: rule__Relationship__Group__7__Impl : ( ( rule__Relationship__Group_7__0 )? ) ;
    public final void rule__Relationship__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4003:1: ( ( ( rule__Relationship__Group_7__0 )? ) )
            // InternalToscaDsl.g:4004:1: ( ( rule__Relationship__Group_7__0 )? )
            {
            // InternalToscaDsl.g:4004:1: ( ( rule__Relationship__Group_7__0 )? )
            // InternalToscaDsl.g:4005:2: ( rule__Relationship__Group_7__0 )?
            {
             before(grammarAccess.getRelationshipAccess().getGroup_7()); 
            // InternalToscaDsl.g:4006:2: ( rule__Relationship__Group_7__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==30) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalToscaDsl.g:4006:3: rule__Relationship__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relationship__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationshipAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__7__Impl"


    // $ANTLR start "rule__Relationship__Group__8"
    // InternalToscaDsl.g:4014:1: rule__Relationship__Group__8 : rule__Relationship__Group__8__Impl rule__Relationship__Group__9 ;
    public final void rule__Relationship__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4018:1: ( rule__Relationship__Group__8__Impl rule__Relationship__Group__9 )
            // InternalToscaDsl.g:4019:2: rule__Relationship__Group__8__Impl rule__Relationship__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__Relationship__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__8"


    // $ANTLR start "rule__Relationship__Group__8__Impl"
    // InternalToscaDsl.g:4026:1: rule__Relationship__Group__8__Impl : ( ( rule__Relationship__Group_8__0 )? ) ;
    public final void rule__Relationship__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4030:1: ( ( ( rule__Relationship__Group_8__0 )? ) )
            // InternalToscaDsl.g:4031:1: ( ( rule__Relationship__Group_8__0 )? )
            {
            // InternalToscaDsl.g:4031:1: ( ( rule__Relationship__Group_8__0 )? )
            // InternalToscaDsl.g:4032:2: ( rule__Relationship__Group_8__0 )?
            {
             before(grammarAccess.getRelationshipAccess().getGroup_8()); 
            // InternalToscaDsl.g:4033:2: ( rule__Relationship__Group_8__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalToscaDsl.g:4033:3: rule__Relationship__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relationship__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationshipAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__8__Impl"


    // $ANTLR start "rule__Relationship__Group__9"
    // InternalToscaDsl.g:4041:1: rule__Relationship__Group__9 : rule__Relationship__Group__9__Impl rule__Relationship__Group__10 ;
    public final void rule__Relationship__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4045:1: ( rule__Relationship__Group__9__Impl rule__Relationship__Group__10 )
            // InternalToscaDsl.g:4046:2: rule__Relationship__Group__9__Impl rule__Relationship__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__Relationship__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__9"


    // $ANTLR start "rule__Relationship__Group__9__Impl"
    // InternalToscaDsl.g:4053:1: rule__Relationship__Group__9__Impl : ( ( rule__Relationship__Group_9__0 )? ) ;
    public final void rule__Relationship__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4057:1: ( ( ( rule__Relationship__Group_9__0 )? ) )
            // InternalToscaDsl.g:4058:1: ( ( rule__Relationship__Group_9__0 )? )
            {
            // InternalToscaDsl.g:4058:1: ( ( rule__Relationship__Group_9__0 )? )
            // InternalToscaDsl.g:4059:2: ( rule__Relationship__Group_9__0 )?
            {
             before(grammarAccess.getRelationshipAccess().getGroup_9()); 
            // InternalToscaDsl.g:4060:2: ( rule__Relationship__Group_9__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==35) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalToscaDsl.g:4060:3: rule__Relationship__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relationship__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationshipAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__9__Impl"


    // $ANTLR start "rule__Relationship__Group__10"
    // InternalToscaDsl.g:4068:1: rule__Relationship__Group__10 : rule__Relationship__Group__10__Impl ;
    public final void rule__Relationship__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4072:1: ( rule__Relationship__Group__10__Impl )
            // InternalToscaDsl.g:4073:2: rule__Relationship__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__10"


    // $ANTLR start "rule__Relationship__Group__10__Impl"
    // InternalToscaDsl.g:4079:1: rule__Relationship__Group__10__Impl : ( '}' ) ;
    public final void rule__Relationship__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4083:1: ( ( '}' ) )
            // InternalToscaDsl.g:4084:1: ( '}' )
            {
            // InternalToscaDsl.g:4084:1: ( '}' )
            // InternalToscaDsl.g:4085:2: '}'
            {
             before(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_10()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__10__Impl"


    // $ANTLR start "rule__Relationship__Group_4__0"
    // InternalToscaDsl.g:4095:1: rule__Relationship__Group_4__0 : rule__Relationship__Group_4__0__Impl rule__Relationship__Group_4__1 ;
    public final void rule__Relationship__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4099:1: ( rule__Relationship__Group_4__0__Impl rule__Relationship__Group_4__1 )
            // InternalToscaDsl.g:4100:2: rule__Relationship__Group_4__0__Impl rule__Relationship__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Relationship__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_4__0"


    // $ANTLR start "rule__Relationship__Group_4__0__Impl"
    // InternalToscaDsl.g:4107:1: rule__Relationship__Group_4__0__Impl : ( ',\\n\"target\" :' ) ;
    public final void rule__Relationship__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4111:1: ( ( ',\\n\"target\" :' ) )
            // InternalToscaDsl.g:4112:1: ( ',\\n\"target\" :' )
            {
            // InternalToscaDsl.g:4112:1: ( ',\\n\"target\" :' )
            // InternalToscaDsl.g:4113:2: ',\\n\"target\" :'
            {
             before(grammarAccess.getRelationshipAccess().getTargetKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getTargetKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_4__0__Impl"


    // $ANTLR start "rule__Relationship__Group_4__1"
    // InternalToscaDsl.g:4122:1: rule__Relationship__Group_4__1 : rule__Relationship__Group_4__1__Impl ;
    public final void rule__Relationship__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4126:1: ( rule__Relationship__Group_4__1__Impl )
            // InternalToscaDsl.g:4127:2: rule__Relationship__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_4__1"


    // $ANTLR start "rule__Relationship__Group_4__1__Impl"
    // InternalToscaDsl.g:4133:1: rule__Relationship__Group_4__1__Impl : ( ( rule__Relationship__TargetAssignment_4_1 ) ) ;
    public final void rule__Relationship__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4137:1: ( ( ( rule__Relationship__TargetAssignment_4_1 ) ) )
            // InternalToscaDsl.g:4138:1: ( ( rule__Relationship__TargetAssignment_4_1 ) )
            {
            // InternalToscaDsl.g:4138:1: ( ( rule__Relationship__TargetAssignment_4_1 ) )
            // InternalToscaDsl.g:4139:2: ( rule__Relationship__TargetAssignment_4_1 )
            {
             before(grammarAccess.getRelationshipAccess().getTargetAssignment_4_1()); 
            // InternalToscaDsl.g:4140:2: ( rule__Relationship__TargetAssignment_4_1 )
            // InternalToscaDsl.g:4140:3: rule__Relationship__TargetAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__TargetAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getTargetAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_4__1__Impl"


    // $ANTLR start "rule__Relationship__Group_5__0"
    // InternalToscaDsl.g:4149:1: rule__Relationship__Group_5__0 : rule__Relationship__Group_5__0__Impl rule__Relationship__Group_5__1 ;
    public final void rule__Relationship__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4153:1: ( rule__Relationship__Group_5__0__Impl rule__Relationship__Group_5__1 )
            // InternalToscaDsl.g:4154:2: rule__Relationship__Group_5__0__Impl rule__Relationship__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__Relationship__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_5__0"


    // $ANTLR start "rule__Relationship__Group_5__0__Impl"
    // InternalToscaDsl.g:4161:1: rule__Relationship__Group_5__0__Impl : ( ',\\n\"interfaces\" :' ) ;
    public final void rule__Relationship__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4165:1: ( ( ',\\n\"interfaces\" :' ) )
            // InternalToscaDsl.g:4166:1: ( ',\\n\"interfaces\" :' )
            {
            // InternalToscaDsl.g:4166:1: ( ',\\n\"interfaces\" :' )
            // InternalToscaDsl.g:4167:2: ',\\n\"interfaces\" :'
            {
             before(grammarAccess.getRelationshipAccess().getInterfacesKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getInterfacesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_5__0__Impl"


    // $ANTLR start "rule__Relationship__Group_5__1"
    // InternalToscaDsl.g:4176:1: rule__Relationship__Group_5__1 : rule__Relationship__Group_5__1__Impl rule__Relationship__Group_5__2 ;
    public final void rule__Relationship__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4180:1: ( rule__Relationship__Group_5__1__Impl rule__Relationship__Group_5__2 )
            // InternalToscaDsl.g:4181:2: rule__Relationship__Group_5__1__Impl rule__Relationship__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__Relationship__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_5__1"


    // $ANTLR start "rule__Relationship__Group_5__1__Impl"
    // InternalToscaDsl.g:4188:1: rule__Relationship__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Relationship__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4192:1: ( ( '{' ) )
            // InternalToscaDsl.g:4193:1: ( '{' )
            {
            // InternalToscaDsl.g:4193:1: ( '{' )
            // InternalToscaDsl.g:4194:2: '{'
            {
             before(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_5__1__Impl"


    // $ANTLR start "rule__Relationship__Group_5__2"
    // InternalToscaDsl.g:4203:1: rule__Relationship__Group_5__2 : rule__Relationship__Group_5__2__Impl rule__Relationship__Group_5__3 ;
    public final void rule__Relationship__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4207:1: ( rule__Relationship__Group_5__2__Impl rule__Relationship__Group_5__3 )
            // InternalToscaDsl.g:4208:2: rule__Relationship__Group_5__2__Impl rule__Relationship__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__Relationship__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_5__2"


    // $ANTLR start "rule__Relationship__Group_5__2__Impl"
    // InternalToscaDsl.g:4215:1: rule__Relationship__Group_5__2__Impl : ( ( rule__Relationship__InterfacesAssignment_5_2 ) ) ;
    public final void rule__Relationship__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4219:1: ( ( ( rule__Relationship__InterfacesAssignment_5_2 ) ) )
            // InternalToscaDsl.g:4220:1: ( ( rule__Relationship__InterfacesAssignment_5_2 ) )
            {
            // InternalToscaDsl.g:4220:1: ( ( rule__Relationship__InterfacesAssignment_5_2 ) )
            // InternalToscaDsl.g:4221:2: ( rule__Relationship__InterfacesAssignment_5_2 )
            {
             before(grammarAccess.getRelationshipAccess().getInterfacesAssignment_5_2()); 
            // InternalToscaDsl.g:4222:2: ( rule__Relationship__InterfacesAssignment_5_2 )
            // InternalToscaDsl.g:4222:3: rule__Relationship__InterfacesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__InterfacesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getInterfacesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_5__2__Impl"


    // $ANTLR start "rule__Relationship__Group_5__3"
    // InternalToscaDsl.g:4230:1: rule__Relationship__Group_5__3 : rule__Relationship__Group_5__3__Impl rule__Relationship__Group_5__4 ;
    public final void rule__Relationship__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4234:1: ( rule__Relationship__Group_5__3__Impl rule__Relationship__Group_5__4 )
            // InternalToscaDsl.g:4235:2: rule__Relationship__Group_5__3__Impl rule__Relationship__Group_5__4
            {
            pushFollow(FOLLOW_10);
            rule__Relationship__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_5__3"


    // $ANTLR start "rule__Relationship__Group_5__3__Impl"
    // InternalToscaDsl.g:4242:1: rule__Relationship__Group_5__3__Impl : ( ( rule__Relationship__Group_5_3__0 )* ) ;
    public final void rule__Relationship__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4246:1: ( ( ( rule__Relationship__Group_5_3__0 )* ) )
            // InternalToscaDsl.g:4247:1: ( ( rule__Relationship__Group_5_3__0 )* )
            {
            // InternalToscaDsl.g:4247:1: ( ( rule__Relationship__Group_5_3__0 )* )
            // InternalToscaDsl.g:4248:2: ( rule__Relationship__Group_5_3__0 )*
            {
             before(grammarAccess.getRelationshipAccess().getGroup_5_3()); 
            // InternalToscaDsl.g:4249:2: ( rule__Relationship__Group_5_3__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==18) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalToscaDsl.g:4249:3: rule__Relationship__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Relationship__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getRelationshipAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_5__3__Impl"


    // $ANTLR start "rule__Relationship__Group_5__4"
    // InternalToscaDsl.g:4257:1: rule__Relationship__Group_5__4 : rule__Relationship__Group_5__4__Impl ;
    public final void rule__Relationship__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4261:1: ( rule__Relationship__Group_5__4__Impl )
            // InternalToscaDsl.g:4262:2: rule__Relationship__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_5__4"


    // $ANTLR start "rule__Relationship__Group_5__4__Impl"
    // InternalToscaDsl.g:4268:1: rule__Relationship__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Relationship__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4272:1: ( ( '}' ) )
            // InternalToscaDsl.g:4273:1: ( '}' )
            {
            // InternalToscaDsl.g:4273:1: ( '}' )
            // InternalToscaDsl.g:4274:2: '}'
            {
             before(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_5__4__Impl"


    // $ANTLR start "rule__Relationship__Group_5_3__0"
    // InternalToscaDsl.g:4284:1: rule__Relationship__Group_5_3__0 : rule__Relationship__Group_5_3__0__Impl rule__Relationship__Group_5_3__1 ;
    public final void rule__Relationship__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4288:1: ( rule__Relationship__Group_5_3__0__Impl rule__Relationship__Group_5_3__1 )
            // InternalToscaDsl.g:4289:2: rule__Relationship__Group_5_3__0__Impl rule__Relationship__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Relationship__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_5_3__0"


    // $ANTLR start "rule__Relationship__Group_5_3__0__Impl"
    // InternalToscaDsl.g:4296:1: rule__Relationship__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Relationship__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4300:1: ( ( ',' ) )
            // InternalToscaDsl.g:4301:1: ( ',' )
            {
            // InternalToscaDsl.g:4301:1: ( ',' )
            // InternalToscaDsl.g:4302:2: ','
            {
             before(grammarAccess.getRelationshipAccess().getCommaKeyword_5_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_5_3__0__Impl"


    // $ANTLR start "rule__Relationship__Group_5_3__1"
    // InternalToscaDsl.g:4311:1: rule__Relationship__Group_5_3__1 : rule__Relationship__Group_5_3__1__Impl ;
    public final void rule__Relationship__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4315:1: ( rule__Relationship__Group_5_3__1__Impl )
            // InternalToscaDsl.g:4316:2: rule__Relationship__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_5_3__1"


    // $ANTLR start "rule__Relationship__Group_5_3__1__Impl"
    // InternalToscaDsl.g:4322:1: rule__Relationship__Group_5_3__1__Impl : ( ( rule__Relationship__InterfacesAssignment_5_3_1 ) ) ;
    public final void rule__Relationship__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4326:1: ( ( ( rule__Relationship__InterfacesAssignment_5_3_1 ) ) )
            // InternalToscaDsl.g:4327:1: ( ( rule__Relationship__InterfacesAssignment_5_3_1 ) )
            {
            // InternalToscaDsl.g:4327:1: ( ( rule__Relationship__InterfacesAssignment_5_3_1 ) )
            // InternalToscaDsl.g:4328:2: ( rule__Relationship__InterfacesAssignment_5_3_1 )
            {
             before(grammarAccess.getRelationshipAccess().getInterfacesAssignment_5_3_1()); 
            // InternalToscaDsl.g:4329:2: ( rule__Relationship__InterfacesAssignment_5_3_1 )
            // InternalToscaDsl.g:4329:3: rule__Relationship__InterfacesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__InterfacesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getInterfacesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_5_3__1__Impl"


    // $ANTLR start "rule__Relationship__Group_6__0"
    // InternalToscaDsl.g:4338:1: rule__Relationship__Group_6__0 : rule__Relationship__Group_6__0__Impl rule__Relationship__Group_6__1 ;
    public final void rule__Relationship__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4342:1: ( rule__Relationship__Group_6__0__Impl rule__Relationship__Group_6__1 )
            // InternalToscaDsl.g:4343:2: rule__Relationship__Group_6__0__Impl rule__Relationship__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__Relationship__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_6__0"


    // $ANTLR start "rule__Relationship__Group_6__0__Impl"
    // InternalToscaDsl.g:4350:1: rule__Relationship__Group_6__0__Impl : ( ',\\n\"properties\" :' ) ;
    public final void rule__Relationship__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4354:1: ( ( ',\\n\"properties\" :' ) )
            // InternalToscaDsl.g:4355:1: ( ',\\n\"properties\" :' )
            {
            // InternalToscaDsl.g:4355:1: ( ',\\n\"properties\" :' )
            // InternalToscaDsl.g:4356:2: ',\\n\"properties\" :'
            {
             before(grammarAccess.getRelationshipAccess().getPropertiesKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getPropertiesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_6__0__Impl"


    // $ANTLR start "rule__Relationship__Group_6__1"
    // InternalToscaDsl.g:4365:1: rule__Relationship__Group_6__1 : rule__Relationship__Group_6__1__Impl rule__Relationship__Group_6__2 ;
    public final void rule__Relationship__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4369:1: ( rule__Relationship__Group_6__1__Impl rule__Relationship__Group_6__2 )
            // InternalToscaDsl.g:4370:2: rule__Relationship__Group_6__1__Impl rule__Relationship__Group_6__2
            {
            pushFollow(FOLLOW_9);
            rule__Relationship__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_6__1"


    // $ANTLR start "rule__Relationship__Group_6__1__Impl"
    // InternalToscaDsl.g:4377:1: rule__Relationship__Group_6__1__Impl : ( '[' ) ;
    public final void rule__Relationship__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4381:1: ( ( '[' ) )
            // InternalToscaDsl.g:4382:1: ( '[' )
            {
            // InternalToscaDsl.g:4382:1: ( '[' )
            // InternalToscaDsl.g:4383:2: '['
            {
             before(grammarAccess.getRelationshipAccess().getLeftSquareBracketKeyword_6_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getLeftSquareBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_6__1__Impl"


    // $ANTLR start "rule__Relationship__Group_6__2"
    // InternalToscaDsl.g:4392:1: rule__Relationship__Group_6__2 : rule__Relationship__Group_6__2__Impl rule__Relationship__Group_6__3 ;
    public final void rule__Relationship__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4396:1: ( rule__Relationship__Group_6__2__Impl rule__Relationship__Group_6__3 )
            // InternalToscaDsl.g:4397:2: rule__Relationship__Group_6__2__Impl rule__Relationship__Group_6__3
            {
            pushFollow(FOLLOW_7);
            rule__Relationship__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_6__2"


    // $ANTLR start "rule__Relationship__Group_6__2__Impl"
    // InternalToscaDsl.g:4404:1: rule__Relationship__Group_6__2__Impl : ( ( rule__Relationship__PropertiesAssignment_6_2 ) ) ;
    public final void rule__Relationship__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4408:1: ( ( ( rule__Relationship__PropertiesAssignment_6_2 ) ) )
            // InternalToscaDsl.g:4409:1: ( ( rule__Relationship__PropertiesAssignment_6_2 ) )
            {
            // InternalToscaDsl.g:4409:1: ( ( rule__Relationship__PropertiesAssignment_6_2 ) )
            // InternalToscaDsl.g:4410:2: ( rule__Relationship__PropertiesAssignment_6_2 )
            {
             before(grammarAccess.getRelationshipAccess().getPropertiesAssignment_6_2()); 
            // InternalToscaDsl.g:4411:2: ( rule__Relationship__PropertiesAssignment_6_2 )
            // InternalToscaDsl.g:4411:3: rule__Relationship__PropertiesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__PropertiesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getPropertiesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_6__2__Impl"


    // $ANTLR start "rule__Relationship__Group_6__3"
    // InternalToscaDsl.g:4419:1: rule__Relationship__Group_6__3 : rule__Relationship__Group_6__3__Impl rule__Relationship__Group_6__4 ;
    public final void rule__Relationship__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4423:1: ( rule__Relationship__Group_6__3__Impl rule__Relationship__Group_6__4 )
            // InternalToscaDsl.g:4424:2: rule__Relationship__Group_6__3__Impl rule__Relationship__Group_6__4
            {
            pushFollow(FOLLOW_7);
            rule__Relationship__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_6__3"


    // $ANTLR start "rule__Relationship__Group_6__3__Impl"
    // InternalToscaDsl.g:4431:1: rule__Relationship__Group_6__3__Impl : ( ( rule__Relationship__Group_6_3__0 )* ) ;
    public final void rule__Relationship__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4435:1: ( ( ( rule__Relationship__Group_6_3__0 )* ) )
            // InternalToscaDsl.g:4436:1: ( ( rule__Relationship__Group_6_3__0 )* )
            {
            // InternalToscaDsl.g:4436:1: ( ( rule__Relationship__Group_6_3__0 )* )
            // InternalToscaDsl.g:4437:2: ( rule__Relationship__Group_6_3__0 )*
            {
             before(grammarAccess.getRelationshipAccess().getGroup_6_3()); 
            // InternalToscaDsl.g:4438:2: ( rule__Relationship__Group_6_3__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==18) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalToscaDsl.g:4438:3: rule__Relationship__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Relationship__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getRelationshipAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_6__3__Impl"


    // $ANTLR start "rule__Relationship__Group_6__4"
    // InternalToscaDsl.g:4446:1: rule__Relationship__Group_6__4 : rule__Relationship__Group_6__4__Impl ;
    public final void rule__Relationship__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4450:1: ( rule__Relationship__Group_6__4__Impl )
            // InternalToscaDsl.g:4451:2: rule__Relationship__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_6__4"


    // $ANTLR start "rule__Relationship__Group_6__4__Impl"
    // InternalToscaDsl.g:4457:1: rule__Relationship__Group_6__4__Impl : ( ']' ) ;
    public final void rule__Relationship__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4461:1: ( ( ']' ) )
            // InternalToscaDsl.g:4462:1: ( ']' )
            {
            // InternalToscaDsl.g:4462:1: ( ']' )
            // InternalToscaDsl.g:4463:2: ']'
            {
             before(grammarAccess.getRelationshipAccess().getRightSquareBracketKeyword_6_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getRightSquareBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_6__4__Impl"


    // $ANTLR start "rule__Relationship__Group_6_3__0"
    // InternalToscaDsl.g:4473:1: rule__Relationship__Group_6_3__0 : rule__Relationship__Group_6_3__0__Impl rule__Relationship__Group_6_3__1 ;
    public final void rule__Relationship__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4477:1: ( rule__Relationship__Group_6_3__0__Impl rule__Relationship__Group_6_3__1 )
            // InternalToscaDsl.g:4478:2: rule__Relationship__Group_6_3__0__Impl rule__Relationship__Group_6_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Relationship__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_6_3__0"


    // $ANTLR start "rule__Relationship__Group_6_3__0__Impl"
    // InternalToscaDsl.g:4485:1: rule__Relationship__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Relationship__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4489:1: ( ( ',' ) )
            // InternalToscaDsl.g:4490:1: ( ',' )
            {
            // InternalToscaDsl.g:4490:1: ( ',' )
            // InternalToscaDsl.g:4491:2: ','
            {
             before(grammarAccess.getRelationshipAccess().getCommaKeyword_6_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_6_3__0__Impl"


    // $ANTLR start "rule__Relationship__Group_6_3__1"
    // InternalToscaDsl.g:4500:1: rule__Relationship__Group_6_3__1 : rule__Relationship__Group_6_3__1__Impl ;
    public final void rule__Relationship__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4504:1: ( rule__Relationship__Group_6_3__1__Impl )
            // InternalToscaDsl.g:4505:2: rule__Relationship__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_6_3__1"


    // $ANTLR start "rule__Relationship__Group_6_3__1__Impl"
    // InternalToscaDsl.g:4511:1: rule__Relationship__Group_6_3__1__Impl : ( ( rule__Relationship__PropertiesAssignment_6_3_1 ) ) ;
    public final void rule__Relationship__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4515:1: ( ( ( rule__Relationship__PropertiesAssignment_6_3_1 ) ) )
            // InternalToscaDsl.g:4516:1: ( ( rule__Relationship__PropertiesAssignment_6_3_1 ) )
            {
            // InternalToscaDsl.g:4516:1: ( ( rule__Relationship__PropertiesAssignment_6_3_1 ) )
            // InternalToscaDsl.g:4517:2: ( rule__Relationship__PropertiesAssignment_6_3_1 )
            {
             before(grammarAccess.getRelationshipAccess().getPropertiesAssignment_6_3_1()); 
            // InternalToscaDsl.g:4518:2: ( rule__Relationship__PropertiesAssignment_6_3_1 )
            // InternalToscaDsl.g:4518:3: rule__Relationship__PropertiesAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__PropertiesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getPropertiesAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_6_3__1__Impl"


    // $ANTLR start "rule__Relationship__Group_7__0"
    // InternalToscaDsl.g:4527:1: rule__Relationship__Group_7__0 : rule__Relationship__Group_7__0__Impl rule__Relationship__Group_7__1 ;
    public final void rule__Relationship__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4531:1: ( rule__Relationship__Group_7__0__Impl rule__Relationship__Group_7__1 )
            // InternalToscaDsl.g:4532:2: rule__Relationship__Group_7__0__Impl rule__Relationship__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__Relationship__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7__0"


    // $ANTLR start "rule__Relationship__Group_7__0__Impl"
    // InternalToscaDsl.g:4539:1: rule__Relationship__Group_7__0__Impl : ( ',\\n\"attributes\" :' ) ;
    public final void rule__Relationship__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4543:1: ( ( ',\\n\"attributes\" :' ) )
            // InternalToscaDsl.g:4544:1: ( ',\\n\"attributes\" :' )
            {
            // InternalToscaDsl.g:4544:1: ( ',\\n\"attributes\" :' )
            // InternalToscaDsl.g:4545:2: ',\\n\"attributes\" :'
            {
             before(grammarAccess.getRelationshipAccess().getAttributesKeyword_7_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getAttributesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7__0__Impl"


    // $ANTLR start "rule__Relationship__Group_7__1"
    // InternalToscaDsl.g:4554:1: rule__Relationship__Group_7__1 : rule__Relationship__Group_7__1__Impl rule__Relationship__Group_7__2 ;
    public final void rule__Relationship__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4558:1: ( rule__Relationship__Group_7__1__Impl rule__Relationship__Group_7__2 )
            // InternalToscaDsl.g:4559:2: rule__Relationship__Group_7__1__Impl rule__Relationship__Group_7__2
            {
            pushFollow(FOLLOW_4);
            rule__Relationship__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7__1"


    // $ANTLR start "rule__Relationship__Group_7__1__Impl"
    // InternalToscaDsl.g:4566:1: rule__Relationship__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Relationship__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4570:1: ( ( '{' ) )
            // InternalToscaDsl.g:4571:1: ( '{' )
            {
            // InternalToscaDsl.g:4571:1: ( '{' )
            // InternalToscaDsl.g:4572:2: '{'
            {
             before(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7__1__Impl"


    // $ANTLR start "rule__Relationship__Group_7__2"
    // InternalToscaDsl.g:4581:1: rule__Relationship__Group_7__2 : rule__Relationship__Group_7__2__Impl rule__Relationship__Group_7__3 ;
    public final void rule__Relationship__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4585:1: ( rule__Relationship__Group_7__2__Impl rule__Relationship__Group_7__3 )
            // InternalToscaDsl.g:4586:2: rule__Relationship__Group_7__2__Impl rule__Relationship__Group_7__3
            {
            pushFollow(FOLLOW_10);
            rule__Relationship__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7__2"


    // $ANTLR start "rule__Relationship__Group_7__2__Impl"
    // InternalToscaDsl.g:4593:1: rule__Relationship__Group_7__2__Impl : ( ( rule__Relationship__AttributesAssignment_7_2 ) ) ;
    public final void rule__Relationship__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4597:1: ( ( ( rule__Relationship__AttributesAssignment_7_2 ) ) )
            // InternalToscaDsl.g:4598:1: ( ( rule__Relationship__AttributesAssignment_7_2 ) )
            {
            // InternalToscaDsl.g:4598:1: ( ( rule__Relationship__AttributesAssignment_7_2 ) )
            // InternalToscaDsl.g:4599:2: ( rule__Relationship__AttributesAssignment_7_2 )
            {
             before(grammarAccess.getRelationshipAccess().getAttributesAssignment_7_2()); 
            // InternalToscaDsl.g:4600:2: ( rule__Relationship__AttributesAssignment_7_2 )
            // InternalToscaDsl.g:4600:3: rule__Relationship__AttributesAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__AttributesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getAttributesAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7__2__Impl"


    // $ANTLR start "rule__Relationship__Group_7__3"
    // InternalToscaDsl.g:4608:1: rule__Relationship__Group_7__3 : rule__Relationship__Group_7__3__Impl rule__Relationship__Group_7__4 ;
    public final void rule__Relationship__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4612:1: ( rule__Relationship__Group_7__3__Impl rule__Relationship__Group_7__4 )
            // InternalToscaDsl.g:4613:2: rule__Relationship__Group_7__3__Impl rule__Relationship__Group_7__4
            {
            pushFollow(FOLLOW_10);
            rule__Relationship__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7__3"


    // $ANTLR start "rule__Relationship__Group_7__3__Impl"
    // InternalToscaDsl.g:4620:1: rule__Relationship__Group_7__3__Impl : ( ( rule__Relationship__Group_7_3__0 )* ) ;
    public final void rule__Relationship__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4624:1: ( ( ( rule__Relationship__Group_7_3__0 )* ) )
            // InternalToscaDsl.g:4625:1: ( ( rule__Relationship__Group_7_3__0 )* )
            {
            // InternalToscaDsl.g:4625:1: ( ( rule__Relationship__Group_7_3__0 )* )
            // InternalToscaDsl.g:4626:2: ( rule__Relationship__Group_7_3__0 )*
            {
             before(grammarAccess.getRelationshipAccess().getGroup_7_3()); 
            // InternalToscaDsl.g:4627:2: ( rule__Relationship__Group_7_3__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==18) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalToscaDsl.g:4627:3: rule__Relationship__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Relationship__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getRelationshipAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7__3__Impl"


    // $ANTLR start "rule__Relationship__Group_7__4"
    // InternalToscaDsl.g:4635:1: rule__Relationship__Group_7__4 : rule__Relationship__Group_7__4__Impl ;
    public final void rule__Relationship__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4639:1: ( rule__Relationship__Group_7__4__Impl )
            // InternalToscaDsl.g:4640:2: rule__Relationship__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7__4"


    // $ANTLR start "rule__Relationship__Group_7__4__Impl"
    // InternalToscaDsl.g:4646:1: rule__Relationship__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Relationship__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4650:1: ( ( '}' ) )
            // InternalToscaDsl.g:4651:1: ( '}' )
            {
            // InternalToscaDsl.g:4651:1: ( '}' )
            // InternalToscaDsl.g:4652:2: '}'
            {
             before(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7__4__Impl"


    // $ANTLR start "rule__Relationship__Group_7_3__0"
    // InternalToscaDsl.g:4662:1: rule__Relationship__Group_7_3__0 : rule__Relationship__Group_7_3__0__Impl rule__Relationship__Group_7_3__1 ;
    public final void rule__Relationship__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4666:1: ( rule__Relationship__Group_7_3__0__Impl rule__Relationship__Group_7_3__1 )
            // InternalToscaDsl.g:4667:2: rule__Relationship__Group_7_3__0__Impl rule__Relationship__Group_7_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Relationship__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7_3__0"


    // $ANTLR start "rule__Relationship__Group_7_3__0__Impl"
    // InternalToscaDsl.g:4674:1: rule__Relationship__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Relationship__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4678:1: ( ( ',' ) )
            // InternalToscaDsl.g:4679:1: ( ',' )
            {
            // InternalToscaDsl.g:4679:1: ( ',' )
            // InternalToscaDsl.g:4680:2: ','
            {
             before(grammarAccess.getRelationshipAccess().getCommaKeyword_7_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7_3__0__Impl"


    // $ANTLR start "rule__Relationship__Group_7_3__1"
    // InternalToscaDsl.g:4689:1: rule__Relationship__Group_7_3__1 : rule__Relationship__Group_7_3__1__Impl ;
    public final void rule__Relationship__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4693:1: ( rule__Relationship__Group_7_3__1__Impl )
            // InternalToscaDsl.g:4694:2: rule__Relationship__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7_3__1"


    // $ANTLR start "rule__Relationship__Group_7_3__1__Impl"
    // InternalToscaDsl.g:4700:1: rule__Relationship__Group_7_3__1__Impl : ( ( rule__Relationship__AttributesAssignment_7_3_1 ) ) ;
    public final void rule__Relationship__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4704:1: ( ( ( rule__Relationship__AttributesAssignment_7_3_1 ) ) )
            // InternalToscaDsl.g:4705:1: ( ( rule__Relationship__AttributesAssignment_7_3_1 ) )
            {
            // InternalToscaDsl.g:4705:1: ( ( rule__Relationship__AttributesAssignment_7_3_1 ) )
            // InternalToscaDsl.g:4706:2: ( rule__Relationship__AttributesAssignment_7_3_1 )
            {
             before(grammarAccess.getRelationshipAccess().getAttributesAssignment_7_3_1()); 
            // InternalToscaDsl.g:4707:2: ( rule__Relationship__AttributesAssignment_7_3_1 )
            // InternalToscaDsl.g:4707:3: rule__Relationship__AttributesAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__AttributesAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getAttributesAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7_3__1__Impl"


    // $ANTLR start "rule__Relationship__Group_8__0"
    // InternalToscaDsl.g:4716:1: rule__Relationship__Group_8__0 : rule__Relationship__Group_8__0__Impl rule__Relationship__Group_8__1 ;
    public final void rule__Relationship__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4720:1: ( rule__Relationship__Group_8__0__Impl rule__Relationship__Group_8__1 )
            // InternalToscaDsl.g:4721:2: rule__Relationship__Group_8__0__Impl rule__Relationship__Group_8__1
            {
            pushFollow(FOLLOW_9);
            rule__Relationship__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_8__0"


    // $ANTLR start "rule__Relationship__Group_8__0__Impl"
    // InternalToscaDsl.g:4728:1: rule__Relationship__Group_8__0__Impl : ( ',\\n\"source_interfaces\" :' ) ;
    public final void rule__Relationship__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4732:1: ( ( ',\\n\"source_interfaces\" :' ) )
            // InternalToscaDsl.g:4733:1: ( ',\\n\"source_interfaces\" :' )
            {
            // InternalToscaDsl.g:4733:1: ( ',\\n\"source_interfaces\" :' )
            // InternalToscaDsl.g:4734:2: ',\\n\"source_interfaces\" :'
            {
             before(grammarAccess.getRelationshipAccess().getSource_interfacesKeyword_8_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getSource_interfacesKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_8__0__Impl"


    // $ANTLR start "rule__Relationship__Group_8__1"
    // InternalToscaDsl.g:4743:1: rule__Relationship__Group_8__1 : rule__Relationship__Group_8__1__Impl rule__Relationship__Group_8__2 ;
    public final void rule__Relationship__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4747:1: ( rule__Relationship__Group_8__1__Impl rule__Relationship__Group_8__2 )
            // InternalToscaDsl.g:4748:2: rule__Relationship__Group_8__1__Impl rule__Relationship__Group_8__2
            {
            pushFollow(FOLLOW_4);
            rule__Relationship__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_8__1"


    // $ANTLR start "rule__Relationship__Group_8__1__Impl"
    // InternalToscaDsl.g:4755:1: rule__Relationship__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Relationship__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4759:1: ( ( '{' ) )
            // InternalToscaDsl.g:4760:1: ( '{' )
            {
            // InternalToscaDsl.g:4760:1: ( '{' )
            // InternalToscaDsl.g:4761:2: '{'
            {
             before(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_8__1__Impl"


    // $ANTLR start "rule__Relationship__Group_8__2"
    // InternalToscaDsl.g:4770:1: rule__Relationship__Group_8__2 : rule__Relationship__Group_8__2__Impl rule__Relationship__Group_8__3 ;
    public final void rule__Relationship__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4774:1: ( rule__Relationship__Group_8__2__Impl rule__Relationship__Group_8__3 )
            // InternalToscaDsl.g:4775:2: rule__Relationship__Group_8__2__Impl rule__Relationship__Group_8__3
            {
            pushFollow(FOLLOW_10);
            rule__Relationship__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_8__2"


    // $ANTLR start "rule__Relationship__Group_8__2__Impl"
    // InternalToscaDsl.g:4782:1: rule__Relationship__Group_8__2__Impl : ( ( rule__Relationship__Source_interfacesAssignment_8_2 ) ) ;
    public final void rule__Relationship__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4786:1: ( ( ( rule__Relationship__Source_interfacesAssignment_8_2 ) ) )
            // InternalToscaDsl.g:4787:1: ( ( rule__Relationship__Source_interfacesAssignment_8_2 ) )
            {
            // InternalToscaDsl.g:4787:1: ( ( rule__Relationship__Source_interfacesAssignment_8_2 ) )
            // InternalToscaDsl.g:4788:2: ( rule__Relationship__Source_interfacesAssignment_8_2 )
            {
             before(grammarAccess.getRelationshipAccess().getSource_interfacesAssignment_8_2()); 
            // InternalToscaDsl.g:4789:2: ( rule__Relationship__Source_interfacesAssignment_8_2 )
            // InternalToscaDsl.g:4789:3: rule__Relationship__Source_interfacesAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Source_interfacesAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getSource_interfacesAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_8__2__Impl"


    // $ANTLR start "rule__Relationship__Group_8__3"
    // InternalToscaDsl.g:4797:1: rule__Relationship__Group_8__3 : rule__Relationship__Group_8__3__Impl rule__Relationship__Group_8__4 ;
    public final void rule__Relationship__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4801:1: ( rule__Relationship__Group_8__3__Impl rule__Relationship__Group_8__4 )
            // InternalToscaDsl.g:4802:2: rule__Relationship__Group_8__3__Impl rule__Relationship__Group_8__4
            {
            pushFollow(FOLLOW_10);
            rule__Relationship__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_8__3"


    // $ANTLR start "rule__Relationship__Group_8__3__Impl"
    // InternalToscaDsl.g:4809:1: rule__Relationship__Group_8__3__Impl : ( ( rule__Relationship__Group_8_3__0 )* ) ;
    public final void rule__Relationship__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4813:1: ( ( ( rule__Relationship__Group_8_3__0 )* ) )
            // InternalToscaDsl.g:4814:1: ( ( rule__Relationship__Group_8_3__0 )* )
            {
            // InternalToscaDsl.g:4814:1: ( ( rule__Relationship__Group_8_3__0 )* )
            // InternalToscaDsl.g:4815:2: ( rule__Relationship__Group_8_3__0 )*
            {
             before(grammarAccess.getRelationshipAccess().getGroup_8_3()); 
            // InternalToscaDsl.g:4816:2: ( rule__Relationship__Group_8_3__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==18) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalToscaDsl.g:4816:3: rule__Relationship__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Relationship__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getRelationshipAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_8__3__Impl"


    // $ANTLR start "rule__Relationship__Group_8__4"
    // InternalToscaDsl.g:4824:1: rule__Relationship__Group_8__4 : rule__Relationship__Group_8__4__Impl ;
    public final void rule__Relationship__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4828:1: ( rule__Relationship__Group_8__4__Impl )
            // InternalToscaDsl.g:4829:2: rule__Relationship__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_8__4"


    // $ANTLR start "rule__Relationship__Group_8__4__Impl"
    // InternalToscaDsl.g:4835:1: rule__Relationship__Group_8__4__Impl : ( '}' ) ;
    public final void rule__Relationship__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4839:1: ( ( '}' ) )
            // InternalToscaDsl.g:4840:1: ( '}' )
            {
            // InternalToscaDsl.g:4840:1: ( '}' )
            // InternalToscaDsl.g:4841:2: '}'
            {
             before(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_8__4__Impl"


    // $ANTLR start "rule__Relationship__Group_8_3__0"
    // InternalToscaDsl.g:4851:1: rule__Relationship__Group_8_3__0 : rule__Relationship__Group_8_3__0__Impl rule__Relationship__Group_8_3__1 ;
    public final void rule__Relationship__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4855:1: ( rule__Relationship__Group_8_3__0__Impl rule__Relationship__Group_8_3__1 )
            // InternalToscaDsl.g:4856:2: rule__Relationship__Group_8_3__0__Impl rule__Relationship__Group_8_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Relationship__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_8_3__0"


    // $ANTLR start "rule__Relationship__Group_8_3__0__Impl"
    // InternalToscaDsl.g:4863:1: rule__Relationship__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Relationship__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4867:1: ( ( ',' ) )
            // InternalToscaDsl.g:4868:1: ( ',' )
            {
            // InternalToscaDsl.g:4868:1: ( ',' )
            // InternalToscaDsl.g:4869:2: ','
            {
             before(grammarAccess.getRelationshipAccess().getCommaKeyword_8_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_8_3__0__Impl"


    // $ANTLR start "rule__Relationship__Group_8_3__1"
    // InternalToscaDsl.g:4878:1: rule__Relationship__Group_8_3__1 : rule__Relationship__Group_8_3__1__Impl ;
    public final void rule__Relationship__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4882:1: ( rule__Relationship__Group_8_3__1__Impl )
            // InternalToscaDsl.g:4883:2: rule__Relationship__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_8_3__1"


    // $ANTLR start "rule__Relationship__Group_8_3__1__Impl"
    // InternalToscaDsl.g:4889:1: rule__Relationship__Group_8_3__1__Impl : ( ( rule__Relationship__Source_interfacesAssignment_8_3_1 ) ) ;
    public final void rule__Relationship__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4893:1: ( ( ( rule__Relationship__Source_interfacesAssignment_8_3_1 ) ) )
            // InternalToscaDsl.g:4894:1: ( ( rule__Relationship__Source_interfacesAssignment_8_3_1 ) )
            {
            // InternalToscaDsl.g:4894:1: ( ( rule__Relationship__Source_interfacesAssignment_8_3_1 ) )
            // InternalToscaDsl.g:4895:2: ( rule__Relationship__Source_interfacesAssignment_8_3_1 )
            {
             before(grammarAccess.getRelationshipAccess().getSource_interfacesAssignment_8_3_1()); 
            // InternalToscaDsl.g:4896:2: ( rule__Relationship__Source_interfacesAssignment_8_3_1 )
            // InternalToscaDsl.g:4896:3: rule__Relationship__Source_interfacesAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Source_interfacesAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getSource_interfacesAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_8_3__1__Impl"


    // $ANTLR start "rule__Relationship__Group_9__0"
    // InternalToscaDsl.g:4905:1: rule__Relationship__Group_9__0 : rule__Relationship__Group_9__0__Impl rule__Relationship__Group_9__1 ;
    public final void rule__Relationship__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4909:1: ( rule__Relationship__Group_9__0__Impl rule__Relationship__Group_9__1 )
            // InternalToscaDsl.g:4910:2: rule__Relationship__Group_9__0__Impl rule__Relationship__Group_9__1
            {
            pushFollow(FOLLOW_9);
            rule__Relationship__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_9__0"


    // $ANTLR start "rule__Relationship__Group_9__0__Impl"
    // InternalToscaDsl.g:4917:1: rule__Relationship__Group_9__0__Impl : ( ',\\n\"target_iterfaces\" :' ) ;
    public final void rule__Relationship__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4921:1: ( ( ',\\n\"target_iterfaces\" :' ) )
            // InternalToscaDsl.g:4922:1: ( ',\\n\"target_iterfaces\" :' )
            {
            // InternalToscaDsl.g:4922:1: ( ',\\n\"target_iterfaces\" :' )
            // InternalToscaDsl.g:4923:2: ',\\n\"target_iterfaces\" :'
            {
             before(grammarAccess.getRelationshipAccess().getTarget_iterfacesKeyword_9_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getTarget_iterfacesKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_9__0__Impl"


    // $ANTLR start "rule__Relationship__Group_9__1"
    // InternalToscaDsl.g:4932:1: rule__Relationship__Group_9__1 : rule__Relationship__Group_9__1__Impl rule__Relationship__Group_9__2 ;
    public final void rule__Relationship__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4936:1: ( rule__Relationship__Group_9__1__Impl rule__Relationship__Group_9__2 )
            // InternalToscaDsl.g:4937:2: rule__Relationship__Group_9__1__Impl rule__Relationship__Group_9__2
            {
            pushFollow(FOLLOW_4);
            rule__Relationship__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_9__1"


    // $ANTLR start "rule__Relationship__Group_9__1__Impl"
    // InternalToscaDsl.g:4944:1: rule__Relationship__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Relationship__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4948:1: ( ( '{' ) )
            // InternalToscaDsl.g:4949:1: ( '{' )
            {
            // InternalToscaDsl.g:4949:1: ( '{' )
            // InternalToscaDsl.g:4950:2: '{'
            {
             before(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_9__1__Impl"


    // $ANTLR start "rule__Relationship__Group_9__2"
    // InternalToscaDsl.g:4959:1: rule__Relationship__Group_9__2 : rule__Relationship__Group_9__2__Impl rule__Relationship__Group_9__3 ;
    public final void rule__Relationship__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4963:1: ( rule__Relationship__Group_9__2__Impl rule__Relationship__Group_9__3 )
            // InternalToscaDsl.g:4964:2: rule__Relationship__Group_9__2__Impl rule__Relationship__Group_9__3
            {
            pushFollow(FOLLOW_10);
            rule__Relationship__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_9__2"


    // $ANTLR start "rule__Relationship__Group_9__2__Impl"
    // InternalToscaDsl.g:4971:1: rule__Relationship__Group_9__2__Impl : ( ( rule__Relationship__Target_interfacesAssignment_9_2 ) ) ;
    public final void rule__Relationship__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4975:1: ( ( ( rule__Relationship__Target_interfacesAssignment_9_2 ) ) )
            // InternalToscaDsl.g:4976:1: ( ( rule__Relationship__Target_interfacesAssignment_9_2 ) )
            {
            // InternalToscaDsl.g:4976:1: ( ( rule__Relationship__Target_interfacesAssignment_9_2 ) )
            // InternalToscaDsl.g:4977:2: ( rule__Relationship__Target_interfacesAssignment_9_2 )
            {
             before(grammarAccess.getRelationshipAccess().getTarget_interfacesAssignment_9_2()); 
            // InternalToscaDsl.g:4978:2: ( rule__Relationship__Target_interfacesAssignment_9_2 )
            // InternalToscaDsl.g:4978:3: rule__Relationship__Target_interfacesAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Target_interfacesAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getTarget_interfacesAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_9__2__Impl"


    // $ANTLR start "rule__Relationship__Group_9__3"
    // InternalToscaDsl.g:4986:1: rule__Relationship__Group_9__3 : rule__Relationship__Group_9__3__Impl rule__Relationship__Group_9__4 ;
    public final void rule__Relationship__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:4990:1: ( rule__Relationship__Group_9__3__Impl rule__Relationship__Group_9__4 )
            // InternalToscaDsl.g:4991:2: rule__Relationship__Group_9__3__Impl rule__Relationship__Group_9__4
            {
            pushFollow(FOLLOW_10);
            rule__Relationship__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_9__3"


    // $ANTLR start "rule__Relationship__Group_9__3__Impl"
    // InternalToscaDsl.g:4998:1: rule__Relationship__Group_9__3__Impl : ( ( rule__Relationship__Group_9_3__0 )* ) ;
    public final void rule__Relationship__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5002:1: ( ( ( rule__Relationship__Group_9_3__0 )* ) )
            // InternalToscaDsl.g:5003:1: ( ( rule__Relationship__Group_9_3__0 )* )
            {
            // InternalToscaDsl.g:5003:1: ( ( rule__Relationship__Group_9_3__0 )* )
            // InternalToscaDsl.g:5004:2: ( rule__Relationship__Group_9_3__0 )*
            {
             before(grammarAccess.getRelationshipAccess().getGroup_9_3()); 
            // InternalToscaDsl.g:5005:2: ( rule__Relationship__Group_9_3__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==18) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalToscaDsl.g:5005:3: rule__Relationship__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Relationship__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getRelationshipAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_9__3__Impl"


    // $ANTLR start "rule__Relationship__Group_9__4"
    // InternalToscaDsl.g:5013:1: rule__Relationship__Group_9__4 : rule__Relationship__Group_9__4__Impl ;
    public final void rule__Relationship__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5017:1: ( rule__Relationship__Group_9__4__Impl )
            // InternalToscaDsl.g:5018:2: rule__Relationship__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_9__4"


    // $ANTLR start "rule__Relationship__Group_9__4__Impl"
    // InternalToscaDsl.g:5024:1: rule__Relationship__Group_9__4__Impl : ( '}' ) ;
    public final void rule__Relationship__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5028:1: ( ( '}' ) )
            // InternalToscaDsl.g:5029:1: ( '}' )
            {
            // InternalToscaDsl.g:5029:1: ( '}' )
            // InternalToscaDsl.g:5030:2: '}'
            {
             before(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_9__4__Impl"


    // $ANTLR start "rule__Relationship__Group_9_3__0"
    // InternalToscaDsl.g:5040:1: rule__Relationship__Group_9_3__0 : rule__Relationship__Group_9_3__0__Impl rule__Relationship__Group_9_3__1 ;
    public final void rule__Relationship__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5044:1: ( rule__Relationship__Group_9_3__0__Impl rule__Relationship__Group_9_3__1 )
            // InternalToscaDsl.g:5045:2: rule__Relationship__Group_9_3__0__Impl rule__Relationship__Group_9_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Relationship__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_9_3__0"


    // $ANTLR start "rule__Relationship__Group_9_3__0__Impl"
    // InternalToscaDsl.g:5052:1: rule__Relationship__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Relationship__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5056:1: ( ( ',' ) )
            // InternalToscaDsl.g:5057:1: ( ',' )
            {
            // InternalToscaDsl.g:5057:1: ( ',' )
            // InternalToscaDsl.g:5058:2: ','
            {
             before(grammarAccess.getRelationshipAccess().getCommaKeyword_9_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_9_3__0__Impl"


    // $ANTLR start "rule__Relationship__Group_9_3__1"
    // InternalToscaDsl.g:5067:1: rule__Relationship__Group_9_3__1 : rule__Relationship__Group_9_3__1__Impl ;
    public final void rule__Relationship__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5071:1: ( rule__Relationship__Group_9_3__1__Impl )
            // InternalToscaDsl.g:5072:2: rule__Relationship__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_9_3__1"


    // $ANTLR start "rule__Relationship__Group_9_3__1__Impl"
    // InternalToscaDsl.g:5078:1: rule__Relationship__Group_9_3__1__Impl : ( ( rule__Relationship__Target_interfacesAssignment_9_3_1 ) ) ;
    public final void rule__Relationship__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5082:1: ( ( ( rule__Relationship__Target_interfacesAssignment_9_3_1 ) ) )
            // InternalToscaDsl.g:5083:1: ( ( rule__Relationship__Target_interfacesAssignment_9_3_1 ) )
            {
            // InternalToscaDsl.g:5083:1: ( ( rule__Relationship__Target_interfacesAssignment_9_3_1 ) )
            // InternalToscaDsl.g:5084:2: ( rule__Relationship__Target_interfacesAssignment_9_3_1 )
            {
             before(grammarAccess.getRelationshipAccess().getTarget_interfacesAssignment_9_3_1()); 
            // InternalToscaDsl.g:5085:2: ( rule__Relationship__Target_interfacesAssignment_9_3_1 )
            // InternalToscaDsl.g:5085:3: rule__Relationship__Target_interfacesAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Target_interfacesAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getTarget_interfacesAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_9_3__1__Impl"


    // $ANTLR start "rule__Group__Group__0"
    // InternalToscaDsl.g:5094:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5098:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // InternalToscaDsl.g:5099:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0"


    // $ANTLR start "rule__Group__Group__0__Impl"
    // InternalToscaDsl.g:5106:1: rule__Group__Group__0__Impl : ( () ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5110:1: ( ( () ) )
            // InternalToscaDsl.g:5111:1: ( () )
            {
            // InternalToscaDsl.g:5111:1: ( () )
            // InternalToscaDsl.g:5112:2: ()
            {
             before(grammarAccess.getGroupAccess().getGroupAction_0()); 
            // InternalToscaDsl.g:5113:2: ()
            // InternalToscaDsl.g:5113:3: 
            {
            }

             after(grammarAccess.getGroupAccess().getGroupAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0__Impl"


    // $ANTLR start "rule__Group__Group__1"
    // InternalToscaDsl.g:5121:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5125:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // InternalToscaDsl.g:5126:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1"


    // $ANTLR start "rule__Group__Group__1__Impl"
    // InternalToscaDsl.g:5133:1: rule__Group__Group__1__Impl : ( ( rule__Group__Group_nameAssignment_1 ) ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5137:1: ( ( ( rule__Group__Group_nameAssignment_1 ) ) )
            // InternalToscaDsl.g:5138:1: ( ( rule__Group__Group_nameAssignment_1 ) )
            {
            // InternalToscaDsl.g:5138:1: ( ( rule__Group__Group_nameAssignment_1 ) )
            // InternalToscaDsl.g:5139:2: ( rule__Group__Group_nameAssignment_1 )
            {
             before(grammarAccess.getGroupAccess().getGroup_nameAssignment_1()); 
            // InternalToscaDsl.g:5140:2: ( rule__Group__Group_nameAssignment_1 )
            // InternalToscaDsl.g:5140:3: rule__Group__Group_nameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group_nameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup_nameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1__Impl"


    // $ANTLR start "rule__Group__Group__2"
    // InternalToscaDsl.g:5148:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5152:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // InternalToscaDsl.g:5153:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2"


    // $ANTLR start "rule__Group__Group__2__Impl"
    // InternalToscaDsl.g:5160:1: rule__Group__Group__2__Impl : ( ':' ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5164:1: ( ( ':' ) )
            // InternalToscaDsl.g:5165:1: ( ':' )
            {
            // InternalToscaDsl.g:5165:1: ( ':' )
            // InternalToscaDsl.g:5166:2: ':'
            {
             before(grammarAccess.getGroupAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2__Impl"


    // $ANTLR start "rule__Group__Group__3"
    // InternalToscaDsl.g:5175:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5179:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // InternalToscaDsl.g:5180:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3"


    // $ANTLR start "rule__Group__Group__3__Impl"
    // InternalToscaDsl.g:5187:1: rule__Group__Group__3__Impl : ( '{' ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5191:1: ( ( '{' ) )
            // InternalToscaDsl.g:5192:1: ( '{' )
            {
            // InternalToscaDsl.g:5192:1: ( '{' )
            // InternalToscaDsl.g:5193:2: '{'
            {
             before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3__Impl"


    // $ANTLR start "rule__Group__Group__4"
    // InternalToscaDsl.g:5202:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5206:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // InternalToscaDsl.g:5207:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Group__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4"


    // $ANTLR start "rule__Group__Group__4__Impl"
    // InternalToscaDsl.g:5214:1: rule__Group__Group__4__Impl : ( '\"type\" :' ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5218:1: ( ( '\"type\" :' ) )
            // InternalToscaDsl.g:5219:1: ( '\"type\" :' )
            {
            // InternalToscaDsl.g:5219:1: ( '\"type\" :' )
            // InternalToscaDsl.g:5220:2: '\"type\" :'
            {
             before(grammarAccess.getGroupAccess().getTypeKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getTypeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4__Impl"


    // $ANTLR start "rule__Group__Group__5"
    // InternalToscaDsl.g:5229:1: rule__Group__Group__5 : rule__Group__Group__5__Impl rule__Group__Group__6 ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5233:1: ( rule__Group__Group__5__Impl rule__Group__Group__6 )
            // InternalToscaDsl.g:5234:2: rule__Group__Group__5__Impl rule__Group__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Group__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__5"


    // $ANTLR start "rule__Group__Group__5__Impl"
    // InternalToscaDsl.g:5241:1: rule__Group__Group__5__Impl : ( ( rule__Group__TypeAssignment_5 ) ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5245:1: ( ( ( rule__Group__TypeAssignment_5 ) ) )
            // InternalToscaDsl.g:5246:1: ( ( rule__Group__TypeAssignment_5 ) )
            {
            // InternalToscaDsl.g:5246:1: ( ( rule__Group__TypeAssignment_5 ) )
            // InternalToscaDsl.g:5247:2: ( rule__Group__TypeAssignment_5 )
            {
             before(grammarAccess.getGroupAccess().getTypeAssignment_5()); 
            // InternalToscaDsl.g:5248:2: ( rule__Group__TypeAssignment_5 )
            // InternalToscaDsl.g:5248:3: rule__Group__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Group__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__5__Impl"


    // $ANTLR start "rule__Group__Group__6"
    // InternalToscaDsl.g:5256:1: rule__Group__Group__6 : rule__Group__Group__6__Impl rule__Group__Group__7 ;
    public final void rule__Group__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5260:1: ( rule__Group__Group__6__Impl rule__Group__Group__7 )
            // InternalToscaDsl.g:5261:2: rule__Group__Group__6__Impl rule__Group__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Group__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__6"


    // $ANTLR start "rule__Group__Group__6__Impl"
    // InternalToscaDsl.g:5268:1: rule__Group__Group__6__Impl : ( ( rule__Group__Group_6__0 )? ) ;
    public final void rule__Group__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5272:1: ( ( ( rule__Group__Group_6__0 )? ) )
            // InternalToscaDsl.g:5273:1: ( ( rule__Group__Group_6__0 )? )
            {
            // InternalToscaDsl.g:5273:1: ( ( rule__Group__Group_6__0 )? )
            // InternalToscaDsl.g:5274:2: ( rule__Group__Group_6__0 )?
            {
             before(grammarAccess.getGroupAccess().getGroup_6()); 
            // InternalToscaDsl.g:5275:2: ( rule__Group__Group_6__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==14) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalToscaDsl.g:5275:3: rule__Group__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Group__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__6__Impl"


    // $ANTLR start "rule__Group__Group__7"
    // InternalToscaDsl.g:5283:1: rule__Group__Group__7 : rule__Group__Group__7__Impl rule__Group__Group__8 ;
    public final void rule__Group__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5287:1: ( rule__Group__Group__7__Impl rule__Group__Group__8 )
            // InternalToscaDsl.g:5288:2: rule__Group__Group__7__Impl rule__Group__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Group__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__7"


    // $ANTLR start "rule__Group__Group__7__Impl"
    // InternalToscaDsl.g:5295:1: rule__Group__Group__7__Impl : ( ( rule__Group__Group_7__0 )? ) ;
    public final void rule__Group__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5299:1: ( ( ( rule__Group__Group_7__0 )? ) )
            // InternalToscaDsl.g:5300:1: ( ( rule__Group__Group_7__0 )? )
            {
            // InternalToscaDsl.g:5300:1: ( ( rule__Group__Group_7__0 )? )
            // InternalToscaDsl.g:5301:2: ( rule__Group__Group_7__0 )?
            {
             before(grammarAccess.getGroupAccess().getGroup_7()); 
            // InternalToscaDsl.g:5302:2: ( rule__Group__Group_7__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==36) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalToscaDsl.g:5302:3: rule__Group__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Group__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__7__Impl"


    // $ANTLR start "rule__Group__Group__8"
    // InternalToscaDsl.g:5310:1: rule__Group__Group__8 : rule__Group__Group__8__Impl rule__Group__Group__9 ;
    public final void rule__Group__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5314:1: ( rule__Group__Group__8__Impl rule__Group__Group__9 )
            // InternalToscaDsl.g:5315:2: rule__Group__Group__8__Impl rule__Group__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Group__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__8"


    // $ANTLR start "rule__Group__Group__8__Impl"
    // InternalToscaDsl.g:5322:1: rule__Group__Group__8__Impl : ( ( rule__Group__Group_8__0 )? ) ;
    public final void rule__Group__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5326:1: ( ( ( rule__Group__Group_8__0 )? ) )
            // InternalToscaDsl.g:5327:1: ( ( rule__Group__Group_8__0 )? )
            {
            // InternalToscaDsl.g:5327:1: ( ( rule__Group__Group_8__0 )? )
            // InternalToscaDsl.g:5328:2: ( rule__Group__Group_8__0 )?
            {
             before(grammarAccess.getGroupAccess().getGroup_8()); 
            // InternalToscaDsl.g:5329:2: ( rule__Group__Group_8__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==29) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalToscaDsl.g:5329:3: rule__Group__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Group__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__8__Impl"


    // $ANTLR start "rule__Group__Group__9"
    // InternalToscaDsl.g:5337:1: rule__Group__Group__9 : rule__Group__Group__9__Impl rule__Group__Group__10 ;
    public final void rule__Group__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5341:1: ( rule__Group__Group__9__Impl rule__Group__Group__10 )
            // InternalToscaDsl.g:5342:2: rule__Group__Group__9__Impl rule__Group__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__Group__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__9"


    // $ANTLR start "rule__Group__Group__9__Impl"
    // InternalToscaDsl.g:5349:1: rule__Group__Group__9__Impl : ( ( rule__Group__Group_9__0 )? ) ;
    public final void rule__Group__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5353:1: ( ( ( rule__Group__Group_9__0 )? ) )
            // InternalToscaDsl.g:5354:1: ( ( rule__Group__Group_9__0 )? )
            {
            // InternalToscaDsl.g:5354:1: ( ( rule__Group__Group_9__0 )? )
            // InternalToscaDsl.g:5355:2: ( rule__Group__Group_9__0 )?
            {
             before(grammarAccess.getGroupAccess().getGroup_9()); 
            // InternalToscaDsl.g:5356:2: ( rule__Group__Group_9__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==28) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalToscaDsl.g:5356:3: rule__Group__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Group__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__9__Impl"


    // $ANTLR start "rule__Group__Group__10"
    // InternalToscaDsl.g:5364:1: rule__Group__Group__10 : rule__Group__Group__10__Impl ;
    public final void rule__Group__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5368:1: ( rule__Group__Group__10__Impl )
            // InternalToscaDsl.g:5369:2: rule__Group__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__10"


    // $ANTLR start "rule__Group__Group__10__Impl"
    // InternalToscaDsl.g:5375:1: rule__Group__Group__10__Impl : ( '}' ) ;
    public final void rule__Group__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5379:1: ( ( '}' ) )
            // InternalToscaDsl.g:5380:1: ( '}' )
            {
            // InternalToscaDsl.g:5380:1: ( '}' )
            // InternalToscaDsl.g:5381:2: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_10()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__10__Impl"


    // $ANTLR start "rule__Group__Group_6__0"
    // InternalToscaDsl.g:5391:1: rule__Group__Group_6__0 : rule__Group__Group_6__0__Impl rule__Group__Group_6__1 ;
    public final void rule__Group__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5395:1: ( rule__Group__Group_6__0__Impl rule__Group__Group_6__1 )
            // InternalToscaDsl.g:5396:2: rule__Group__Group_6__0__Impl rule__Group__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Group__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_6__0"


    // $ANTLR start "rule__Group__Group_6__0__Impl"
    // InternalToscaDsl.g:5403:1: rule__Group__Group_6__0__Impl : ( ',\\n\"description\" :' ) ;
    public final void rule__Group__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5407:1: ( ( ',\\n\"description\" :' ) )
            // InternalToscaDsl.g:5408:1: ( ',\\n\"description\" :' )
            {
            // InternalToscaDsl.g:5408:1: ( ',\\n\"description\" :' )
            // InternalToscaDsl.g:5409:2: ',\\n\"description\" :'
            {
             before(grammarAccess.getGroupAccess().getDescriptionKeyword_6_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getDescriptionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_6__0__Impl"


    // $ANTLR start "rule__Group__Group_6__1"
    // InternalToscaDsl.g:5418:1: rule__Group__Group_6__1 : rule__Group__Group_6__1__Impl ;
    public final void rule__Group__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5422:1: ( rule__Group__Group_6__1__Impl )
            // InternalToscaDsl.g:5423:2: rule__Group__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_6__1"


    // $ANTLR start "rule__Group__Group_6__1__Impl"
    // InternalToscaDsl.g:5429:1: rule__Group__Group_6__1__Impl : ( ( rule__Group__DescriptionAssignment_6_1 ) ) ;
    public final void rule__Group__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5433:1: ( ( ( rule__Group__DescriptionAssignment_6_1 ) ) )
            // InternalToscaDsl.g:5434:1: ( ( rule__Group__DescriptionAssignment_6_1 ) )
            {
            // InternalToscaDsl.g:5434:1: ( ( rule__Group__DescriptionAssignment_6_1 ) )
            // InternalToscaDsl.g:5435:2: ( rule__Group__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getGroupAccess().getDescriptionAssignment_6_1()); 
            // InternalToscaDsl.g:5436:2: ( rule__Group__DescriptionAssignment_6_1 )
            // InternalToscaDsl.g:5436:3: rule__Group__DescriptionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__DescriptionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getDescriptionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_6__1__Impl"


    // $ANTLR start "rule__Group__Group_7__0"
    // InternalToscaDsl.g:5445:1: rule__Group__Group_7__0 : rule__Group__Group_7__0__Impl rule__Group__Group_7__1 ;
    public final void rule__Group__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5449:1: ( rule__Group__Group_7__0__Impl rule__Group__Group_7__1 )
            // InternalToscaDsl.g:5450:2: rule__Group__Group_7__0__Impl rule__Group__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__Group__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_7__0"


    // $ANTLR start "rule__Group__Group_7__0__Impl"
    // InternalToscaDsl.g:5457:1: rule__Group__Group_7__0__Impl : ( ',\\n\"targets\" :' ) ;
    public final void rule__Group__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5461:1: ( ( ',\\n\"targets\" :' ) )
            // InternalToscaDsl.g:5462:1: ( ',\\n\"targets\" :' )
            {
            // InternalToscaDsl.g:5462:1: ( ',\\n\"targets\" :' )
            // InternalToscaDsl.g:5463:2: ',\\n\"targets\" :'
            {
             before(grammarAccess.getGroupAccess().getTargetsKeyword_7_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getTargetsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_7__0__Impl"


    // $ANTLR start "rule__Group__Group_7__1"
    // InternalToscaDsl.g:5472:1: rule__Group__Group_7__1 : rule__Group__Group_7__1__Impl rule__Group__Group_7__2 ;
    public final void rule__Group__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5476:1: ( rule__Group__Group_7__1__Impl rule__Group__Group_7__2 )
            // InternalToscaDsl.g:5477:2: rule__Group__Group_7__1__Impl rule__Group__Group_7__2
            {
            pushFollow(FOLLOW_16);
            rule__Group__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_7__1"


    // $ANTLR start "rule__Group__Group_7__1__Impl"
    // InternalToscaDsl.g:5484:1: rule__Group__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Group__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5488:1: ( ( '{' ) )
            // InternalToscaDsl.g:5489:1: ( '{' )
            {
            // InternalToscaDsl.g:5489:1: ( '{' )
            // InternalToscaDsl.g:5490:2: '{'
            {
             before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_7__1__Impl"


    // $ANTLR start "rule__Group__Group_7__2"
    // InternalToscaDsl.g:5499:1: rule__Group__Group_7__2 : rule__Group__Group_7__2__Impl rule__Group__Group_7__3 ;
    public final void rule__Group__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5503:1: ( rule__Group__Group_7__2__Impl rule__Group__Group_7__3 )
            // InternalToscaDsl.g:5504:2: rule__Group__Group_7__2__Impl rule__Group__Group_7__3
            {
            pushFollow(FOLLOW_10);
            rule__Group__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_7__2"


    // $ANTLR start "rule__Group__Group_7__2__Impl"
    // InternalToscaDsl.g:5511:1: rule__Group__Group_7__2__Impl : ( ( rule__Group__TargetsAssignment_7_2 ) ) ;
    public final void rule__Group__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5515:1: ( ( ( rule__Group__TargetsAssignment_7_2 ) ) )
            // InternalToscaDsl.g:5516:1: ( ( rule__Group__TargetsAssignment_7_2 ) )
            {
            // InternalToscaDsl.g:5516:1: ( ( rule__Group__TargetsAssignment_7_2 ) )
            // InternalToscaDsl.g:5517:2: ( rule__Group__TargetsAssignment_7_2 )
            {
             before(grammarAccess.getGroupAccess().getTargetsAssignment_7_2()); 
            // InternalToscaDsl.g:5518:2: ( rule__Group__TargetsAssignment_7_2 )
            // InternalToscaDsl.g:5518:3: rule__Group__TargetsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Group__TargetsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getTargetsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_7__2__Impl"


    // $ANTLR start "rule__Group__Group_7__3"
    // InternalToscaDsl.g:5526:1: rule__Group__Group_7__3 : rule__Group__Group_7__3__Impl rule__Group__Group_7__4 ;
    public final void rule__Group__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5530:1: ( rule__Group__Group_7__3__Impl rule__Group__Group_7__4 )
            // InternalToscaDsl.g:5531:2: rule__Group__Group_7__3__Impl rule__Group__Group_7__4
            {
            pushFollow(FOLLOW_10);
            rule__Group__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_7__3"


    // $ANTLR start "rule__Group__Group_7__3__Impl"
    // InternalToscaDsl.g:5538:1: rule__Group__Group_7__3__Impl : ( ( rule__Group__Group_7_3__0 )* ) ;
    public final void rule__Group__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5542:1: ( ( ( rule__Group__Group_7_3__0 )* ) )
            // InternalToscaDsl.g:5543:1: ( ( rule__Group__Group_7_3__0 )* )
            {
            // InternalToscaDsl.g:5543:1: ( ( rule__Group__Group_7_3__0 )* )
            // InternalToscaDsl.g:5544:2: ( rule__Group__Group_7_3__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_7_3()); 
            // InternalToscaDsl.g:5545:2: ( rule__Group__Group_7_3__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==18) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalToscaDsl.g:5545:3: rule__Group__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Group__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_7__3__Impl"


    // $ANTLR start "rule__Group__Group_7__4"
    // InternalToscaDsl.g:5553:1: rule__Group__Group_7__4 : rule__Group__Group_7__4__Impl ;
    public final void rule__Group__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5557:1: ( rule__Group__Group_7__4__Impl )
            // InternalToscaDsl.g:5558:2: rule__Group__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_7__4"


    // $ANTLR start "rule__Group__Group_7__4__Impl"
    // InternalToscaDsl.g:5564:1: rule__Group__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Group__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5568:1: ( ( '}' ) )
            // InternalToscaDsl.g:5569:1: ( '}' )
            {
            // InternalToscaDsl.g:5569:1: ( '}' )
            // InternalToscaDsl.g:5570:2: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_7__4__Impl"


    // $ANTLR start "rule__Group__Group_7_3__0"
    // InternalToscaDsl.g:5580:1: rule__Group__Group_7_3__0 : rule__Group__Group_7_3__0__Impl rule__Group__Group_7_3__1 ;
    public final void rule__Group__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5584:1: ( rule__Group__Group_7_3__0__Impl rule__Group__Group_7_3__1 )
            // InternalToscaDsl.g:5585:2: rule__Group__Group_7_3__0__Impl rule__Group__Group_7_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Group__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_7_3__0"


    // $ANTLR start "rule__Group__Group_7_3__0__Impl"
    // InternalToscaDsl.g:5592:1: rule__Group__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5596:1: ( ( ',' ) )
            // InternalToscaDsl.g:5597:1: ( ',' )
            {
            // InternalToscaDsl.g:5597:1: ( ',' )
            // InternalToscaDsl.g:5598:2: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_7_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_7_3__0__Impl"


    // $ANTLR start "rule__Group__Group_7_3__1"
    // InternalToscaDsl.g:5607:1: rule__Group__Group_7_3__1 : rule__Group__Group_7_3__1__Impl ;
    public final void rule__Group__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5611:1: ( rule__Group__Group_7_3__1__Impl )
            // InternalToscaDsl.g:5612:2: rule__Group__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_7_3__1"


    // $ANTLR start "rule__Group__Group_7_3__1__Impl"
    // InternalToscaDsl.g:5618:1: rule__Group__Group_7_3__1__Impl : ( ( rule__Group__TargetsAssignment_7_3_1 ) ) ;
    public final void rule__Group__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5622:1: ( ( ( rule__Group__TargetsAssignment_7_3_1 ) ) )
            // InternalToscaDsl.g:5623:1: ( ( rule__Group__TargetsAssignment_7_3_1 ) )
            {
            // InternalToscaDsl.g:5623:1: ( ( rule__Group__TargetsAssignment_7_3_1 ) )
            // InternalToscaDsl.g:5624:2: ( rule__Group__TargetsAssignment_7_3_1 )
            {
             before(grammarAccess.getGroupAccess().getTargetsAssignment_7_3_1()); 
            // InternalToscaDsl.g:5625:2: ( rule__Group__TargetsAssignment_7_3_1 )
            // InternalToscaDsl.g:5625:3: rule__Group__TargetsAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__TargetsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getTargetsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_7_3__1__Impl"


    // $ANTLR start "rule__Group__Group_8__0"
    // InternalToscaDsl.g:5634:1: rule__Group__Group_8__0 : rule__Group__Group_8__0__Impl rule__Group__Group_8__1 ;
    public final void rule__Group__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5638:1: ( rule__Group__Group_8__0__Impl rule__Group__Group_8__1 )
            // InternalToscaDsl.g:5639:2: rule__Group__Group_8__0__Impl rule__Group__Group_8__1
            {
            pushFollow(FOLLOW_9);
            rule__Group__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_8__0"


    // $ANTLR start "rule__Group__Group_8__0__Impl"
    // InternalToscaDsl.g:5646:1: rule__Group__Group_8__0__Impl : ( ',\\n\"properties\" :' ) ;
    public final void rule__Group__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5650:1: ( ( ',\\n\"properties\" :' ) )
            // InternalToscaDsl.g:5651:1: ( ',\\n\"properties\" :' )
            {
            // InternalToscaDsl.g:5651:1: ( ',\\n\"properties\" :' )
            // InternalToscaDsl.g:5652:2: ',\\n\"properties\" :'
            {
             before(grammarAccess.getGroupAccess().getPropertiesKeyword_8_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getPropertiesKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_8__0__Impl"


    // $ANTLR start "rule__Group__Group_8__1"
    // InternalToscaDsl.g:5661:1: rule__Group__Group_8__1 : rule__Group__Group_8__1__Impl ;
    public final void rule__Group__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5665:1: ( rule__Group__Group_8__1__Impl )
            // InternalToscaDsl.g:5666:2: rule__Group__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_8__1"


    // $ANTLR start "rule__Group__Group_8__1__Impl"
    // InternalToscaDsl.g:5672:1: rule__Group__Group_8__1__Impl : ( ( rule__Group__PropertiesAssignment_8_1 ) ) ;
    public final void rule__Group__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5676:1: ( ( ( rule__Group__PropertiesAssignment_8_1 ) ) )
            // InternalToscaDsl.g:5677:1: ( ( rule__Group__PropertiesAssignment_8_1 ) )
            {
            // InternalToscaDsl.g:5677:1: ( ( rule__Group__PropertiesAssignment_8_1 ) )
            // InternalToscaDsl.g:5678:2: ( rule__Group__PropertiesAssignment_8_1 )
            {
             before(grammarAccess.getGroupAccess().getPropertiesAssignment_8_1()); 
            // InternalToscaDsl.g:5679:2: ( rule__Group__PropertiesAssignment_8_1 )
            // InternalToscaDsl.g:5679:3: rule__Group__PropertiesAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__PropertiesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getPropertiesAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_8__1__Impl"


    // $ANTLR start "rule__Group__Group_9__0"
    // InternalToscaDsl.g:5688:1: rule__Group__Group_9__0 : rule__Group__Group_9__0__Impl rule__Group__Group_9__1 ;
    public final void rule__Group__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5692:1: ( rule__Group__Group_9__0__Impl rule__Group__Group_9__1 )
            // InternalToscaDsl.g:5693:2: rule__Group__Group_9__0__Impl rule__Group__Group_9__1
            {
            pushFollow(FOLLOW_9);
            rule__Group__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_9__0"


    // $ANTLR start "rule__Group__Group_9__0__Impl"
    // InternalToscaDsl.g:5700:1: rule__Group__Group_9__0__Impl : ( ',\\n\"interfaces\" :' ) ;
    public final void rule__Group__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5704:1: ( ( ',\\n\"interfaces\" :' ) )
            // InternalToscaDsl.g:5705:1: ( ',\\n\"interfaces\" :' )
            {
            // InternalToscaDsl.g:5705:1: ( ',\\n\"interfaces\" :' )
            // InternalToscaDsl.g:5706:2: ',\\n\"interfaces\" :'
            {
             before(grammarAccess.getGroupAccess().getInterfacesKeyword_9_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getInterfacesKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_9__0__Impl"


    // $ANTLR start "rule__Group__Group_9__1"
    // InternalToscaDsl.g:5715:1: rule__Group__Group_9__1 : rule__Group__Group_9__1__Impl rule__Group__Group_9__2 ;
    public final void rule__Group__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5719:1: ( rule__Group__Group_9__1__Impl rule__Group__Group_9__2 )
            // InternalToscaDsl.g:5720:2: rule__Group__Group_9__1__Impl rule__Group__Group_9__2
            {
            pushFollow(FOLLOW_4);
            rule__Group__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_9__1"


    // $ANTLR start "rule__Group__Group_9__1__Impl"
    // InternalToscaDsl.g:5727:1: rule__Group__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Group__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5731:1: ( ( '{' ) )
            // InternalToscaDsl.g:5732:1: ( '{' )
            {
            // InternalToscaDsl.g:5732:1: ( '{' )
            // InternalToscaDsl.g:5733:2: '{'
            {
             before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_9__1__Impl"


    // $ANTLR start "rule__Group__Group_9__2"
    // InternalToscaDsl.g:5742:1: rule__Group__Group_9__2 : rule__Group__Group_9__2__Impl rule__Group__Group_9__3 ;
    public final void rule__Group__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5746:1: ( rule__Group__Group_9__2__Impl rule__Group__Group_9__3 )
            // InternalToscaDsl.g:5747:2: rule__Group__Group_9__2__Impl rule__Group__Group_9__3
            {
            pushFollow(FOLLOW_10);
            rule__Group__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_9__2"


    // $ANTLR start "rule__Group__Group_9__2__Impl"
    // InternalToscaDsl.g:5754:1: rule__Group__Group_9__2__Impl : ( ( rule__Group__InterfacesAssignment_9_2 ) ) ;
    public final void rule__Group__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5758:1: ( ( ( rule__Group__InterfacesAssignment_9_2 ) ) )
            // InternalToscaDsl.g:5759:1: ( ( rule__Group__InterfacesAssignment_9_2 ) )
            {
            // InternalToscaDsl.g:5759:1: ( ( rule__Group__InterfacesAssignment_9_2 ) )
            // InternalToscaDsl.g:5760:2: ( rule__Group__InterfacesAssignment_9_2 )
            {
             before(grammarAccess.getGroupAccess().getInterfacesAssignment_9_2()); 
            // InternalToscaDsl.g:5761:2: ( rule__Group__InterfacesAssignment_9_2 )
            // InternalToscaDsl.g:5761:3: rule__Group__InterfacesAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Group__InterfacesAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getInterfacesAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_9__2__Impl"


    // $ANTLR start "rule__Group__Group_9__3"
    // InternalToscaDsl.g:5769:1: rule__Group__Group_9__3 : rule__Group__Group_9__3__Impl rule__Group__Group_9__4 ;
    public final void rule__Group__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5773:1: ( rule__Group__Group_9__3__Impl rule__Group__Group_9__4 )
            // InternalToscaDsl.g:5774:2: rule__Group__Group_9__3__Impl rule__Group__Group_9__4
            {
            pushFollow(FOLLOW_10);
            rule__Group__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_9__3"


    // $ANTLR start "rule__Group__Group_9__3__Impl"
    // InternalToscaDsl.g:5781:1: rule__Group__Group_9__3__Impl : ( ( rule__Group__Group_9_3__0 )* ) ;
    public final void rule__Group__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5785:1: ( ( ( rule__Group__Group_9_3__0 )* ) )
            // InternalToscaDsl.g:5786:1: ( ( rule__Group__Group_9_3__0 )* )
            {
            // InternalToscaDsl.g:5786:1: ( ( rule__Group__Group_9_3__0 )* )
            // InternalToscaDsl.g:5787:2: ( rule__Group__Group_9_3__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_9_3()); 
            // InternalToscaDsl.g:5788:2: ( rule__Group__Group_9_3__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==18) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalToscaDsl.g:5788:3: rule__Group__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Group__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_9__3__Impl"


    // $ANTLR start "rule__Group__Group_9__4"
    // InternalToscaDsl.g:5796:1: rule__Group__Group_9__4 : rule__Group__Group_9__4__Impl ;
    public final void rule__Group__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5800:1: ( rule__Group__Group_9__4__Impl )
            // InternalToscaDsl.g:5801:2: rule__Group__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_9__4"


    // $ANTLR start "rule__Group__Group_9__4__Impl"
    // InternalToscaDsl.g:5807:1: rule__Group__Group_9__4__Impl : ( '}' ) ;
    public final void rule__Group__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5811:1: ( ( '}' ) )
            // InternalToscaDsl.g:5812:1: ( '}' )
            {
            // InternalToscaDsl.g:5812:1: ( '}' )
            // InternalToscaDsl.g:5813:2: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_9__4__Impl"


    // $ANTLR start "rule__Group__Group_9_3__0"
    // InternalToscaDsl.g:5823:1: rule__Group__Group_9_3__0 : rule__Group__Group_9_3__0__Impl rule__Group__Group_9_3__1 ;
    public final void rule__Group__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5827:1: ( rule__Group__Group_9_3__0__Impl rule__Group__Group_9_3__1 )
            // InternalToscaDsl.g:5828:2: rule__Group__Group_9_3__0__Impl rule__Group__Group_9_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Group__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_9_3__0"


    // $ANTLR start "rule__Group__Group_9_3__0__Impl"
    // InternalToscaDsl.g:5835:1: rule__Group__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5839:1: ( ( ',' ) )
            // InternalToscaDsl.g:5840:1: ( ',' )
            {
            // InternalToscaDsl.g:5840:1: ( ',' )
            // InternalToscaDsl.g:5841:2: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_9_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_9_3__0__Impl"


    // $ANTLR start "rule__Group__Group_9_3__1"
    // InternalToscaDsl.g:5850:1: rule__Group__Group_9_3__1 : rule__Group__Group_9_3__1__Impl ;
    public final void rule__Group__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5854:1: ( rule__Group__Group_9_3__1__Impl )
            // InternalToscaDsl.g:5855:2: rule__Group__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_9_3__1"


    // $ANTLR start "rule__Group__Group_9_3__1__Impl"
    // InternalToscaDsl.g:5861:1: rule__Group__Group_9_3__1__Impl : ( ( rule__Group__InterfacesAssignment_9_3_1 ) ) ;
    public final void rule__Group__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5865:1: ( ( ( rule__Group__InterfacesAssignment_9_3_1 ) ) )
            // InternalToscaDsl.g:5866:1: ( ( rule__Group__InterfacesAssignment_9_3_1 ) )
            {
            // InternalToscaDsl.g:5866:1: ( ( rule__Group__InterfacesAssignment_9_3_1 ) )
            // InternalToscaDsl.g:5867:2: ( rule__Group__InterfacesAssignment_9_3_1 )
            {
             before(grammarAccess.getGroupAccess().getInterfacesAssignment_9_3_1()); 
            // InternalToscaDsl.g:5868:2: ( rule__Group__InterfacesAssignment_9_3_1 )
            // InternalToscaDsl.g:5868:3: rule__Group__InterfacesAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__InterfacesAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getInterfacesAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_9_3__1__Impl"


    // $ANTLR start "rule__Policy__Group__0"
    // InternalToscaDsl.g:5877:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5881:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // InternalToscaDsl.g:5882:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Policy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__0"


    // $ANTLR start "rule__Policy__Group__0__Impl"
    // InternalToscaDsl.g:5889:1: rule__Policy__Group__0__Impl : ( () ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5893:1: ( ( () ) )
            // InternalToscaDsl.g:5894:1: ( () )
            {
            // InternalToscaDsl.g:5894:1: ( () )
            // InternalToscaDsl.g:5895:2: ()
            {
             before(grammarAccess.getPolicyAccess().getPolicyAction_0()); 
            // InternalToscaDsl.g:5896:2: ()
            // InternalToscaDsl.g:5896:3: 
            {
            }

             after(grammarAccess.getPolicyAccess().getPolicyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__0__Impl"


    // $ANTLR start "rule__Policy__Group__1"
    // InternalToscaDsl.g:5904:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5908:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // InternalToscaDsl.g:5909:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Policy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__1"


    // $ANTLR start "rule__Policy__Group__1__Impl"
    // InternalToscaDsl.g:5916:1: rule__Policy__Group__1__Impl : ( ( rule__Policy__Policy_nameAssignment_1 ) ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5920:1: ( ( ( rule__Policy__Policy_nameAssignment_1 ) ) )
            // InternalToscaDsl.g:5921:1: ( ( rule__Policy__Policy_nameAssignment_1 ) )
            {
            // InternalToscaDsl.g:5921:1: ( ( rule__Policy__Policy_nameAssignment_1 ) )
            // InternalToscaDsl.g:5922:2: ( rule__Policy__Policy_nameAssignment_1 )
            {
             before(grammarAccess.getPolicyAccess().getPolicy_nameAssignment_1()); 
            // InternalToscaDsl.g:5923:2: ( rule__Policy__Policy_nameAssignment_1 )
            // InternalToscaDsl.g:5923:3: rule__Policy__Policy_nameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Policy_nameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getPolicy_nameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__1__Impl"


    // $ANTLR start "rule__Policy__Group__2"
    // InternalToscaDsl.g:5931:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5935:1: ( rule__Policy__Group__2__Impl )
            // InternalToscaDsl.g:5936:2: rule__Policy__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__2"


    // $ANTLR start "rule__Policy__Group__2__Impl"
    // InternalToscaDsl.g:5942:1: rule__Policy__Group__2__Impl : ( ':' ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5946:1: ( ( ':' ) )
            // InternalToscaDsl.g:5947:1: ( ':' )
            {
            // InternalToscaDsl.g:5947:1: ( ':' )
            // InternalToscaDsl.g:5948:2: ':'
            {
             before(grammarAccess.getPolicyAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // InternalToscaDsl.g:5958:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5962:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalToscaDsl.g:5963:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // InternalToscaDsl.g:5970:1: rule__Interface__Group__0__Impl : ( () ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5974:1: ( ( () ) )
            // InternalToscaDsl.g:5975:1: ( () )
            {
            // InternalToscaDsl.g:5975:1: ( () )
            // InternalToscaDsl.g:5976:2: ()
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceAction_0()); 
            // InternalToscaDsl.g:5977:2: ()
            // InternalToscaDsl.g:5977:3: 
            {
            }

             after(grammarAccess.getInterfaceAccess().getInterfaceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // InternalToscaDsl.g:5985:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:5989:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalToscaDsl.g:5990:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // InternalToscaDsl.g:5997:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__TypeAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6001:1: ( ( ( rule__Interface__TypeAssignment_1 ) ) )
            // InternalToscaDsl.g:6002:1: ( ( rule__Interface__TypeAssignment_1 ) )
            {
            // InternalToscaDsl.g:6002:1: ( ( rule__Interface__TypeAssignment_1 ) )
            // InternalToscaDsl.g:6003:2: ( rule__Interface__TypeAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getTypeAssignment_1()); 
            // InternalToscaDsl.g:6004:2: ( rule__Interface__TypeAssignment_1 )
            // InternalToscaDsl.g:6004:3: rule__Interface__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Interface__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // InternalToscaDsl.g:6012:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6016:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // InternalToscaDsl.g:6017:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // InternalToscaDsl.g:6024:1: rule__Interface__Group__2__Impl : ( ':' ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6028:1: ( ( ':' ) )
            // InternalToscaDsl.g:6029:1: ( ':' )
            {
            // InternalToscaDsl.g:6029:1: ( ':' )
            // InternalToscaDsl.g:6030:2: ':'
            {
             before(grammarAccess.getInterfaceAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__3"
    // InternalToscaDsl.g:6039:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6043:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // InternalToscaDsl.g:6044:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3"


    // $ANTLR start "rule__Interface__Group__3__Impl"
    // InternalToscaDsl.g:6051:1: rule__Interface__Group__3__Impl : ( '{' ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6055:1: ( ( '{' ) )
            // InternalToscaDsl.g:6056:1: ( '{' )
            {
            // InternalToscaDsl.g:6056:1: ( '{' )
            // InternalToscaDsl.g:6057:2: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__4"
    // InternalToscaDsl.g:6066:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6070:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // InternalToscaDsl.g:6071:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Interface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4"


    // $ANTLR start "rule__Interface__Group__4__Impl"
    // InternalToscaDsl.g:6078:1: rule__Interface__Group__4__Impl : ( ( rule__Interface__Group_4__0 )? ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6082:1: ( ( ( rule__Interface__Group_4__0 )? ) )
            // InternalToscaDsl.g:6083:1: ( ( rule__Interface__Group_4__0 )? )
            {
            // InternalToscaDsl.g:6083:1: ( ( rule__Interface__Group_4__0 )? )
            // InternalToscaDsl.g:6084:2: ( rule__Interface__Group_4__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_4()); 
            // InternalToscaDsl.g:6085:2: ( rule__Interface__Group_4__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==37) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalToscaDsl.g:6085:3: rule__Interface__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4__Impl"


    // $ANTLR start "rule__Interface__Group__5"
    // InternalToscaDsl.g:6093:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6097:1: ( rule__Interface__Group__5__Impl )
            // InternalToscaDsl.g:6098:2: rule__Interface__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__5"


    // $ANTLR start "rule__Interface__Group__5__Impl"
    // InternalToscaDsl.g:6104:1: rule__Interface__Group__5__Impl : ( '}' ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6108:1: ( ( '}' ) )
            // InternalToscaDsl.g:6109:1: ( '}' )
            {
            // InternalToscaDsl.g:6109:1: ( '}' )
            // InternalToscaDsl.g:6110:2: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__5__Impl"


    // $ANTLR start "rule__Interface__Group_4__0"
    // InternalToscaDsl.g:6120:1: rule__Interface__Group_4__0 : rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1 ;
    public final void rule__Interface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6124:1: ( rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1 )
            // InternalToscaDsl.g:6125:2: rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__Interface__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__0"


    // $ANTLR start "rule__Interface__Group_4__0__Impl"
    // InternalToscaDsl.g:6132:1: rule__Interface__Group_4__0__Impl : ( '\\n\"operations\" :' ) ;
    public final void rule__Interface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6136:1: ( ( '\\n\"operations\" :' ) )
            // InternalToscaDsl.g:6137:1: ( '\\n\"operations\" :' )
            {
            // InternalToscaDsl.g:6137:1: ( '\\n\"operations\" :' )
            // InternalToscaDsl.g:6138:2: '\\n\"operations\" :'
            {
             before(grammarAccess.getInterfaceAccess().getOperationsKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getOperationsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__0__Impl"


    // $ANTLR start "rule__Interface__Group_4__1"
    // InternalToscaDsl.g:6147:1: rule__Interface__Group_4__1 : rule__Interface__Group_4__1__Impl rule__Interface__Group_4__2 ;
    public final void rule__Interface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6151:1: ( rule__Interface__Group_4__1__Impl rule__Interface__Group_4__2 )
            // InternalToscaDsl.g:6152:2: rule__Interface__Group_4__1__Impl rule__Interface__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__Interface__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__1"


    // $ANTLR start "rule__Interface__Group_4__1__Impl"
    // InternalToscaDsl.g:6159:1: rule__Interface__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Interface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6163:1: ( ( '{' ) )
            // InternalToscaDsl.g:6164:1: ( '{' )
            {
            // InternalToscaDsl.g:6164:1: ( '{' )
            // InternalToscaDsl.g:6165:2: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__1__Impl"


    // $ANTLR start "rule__Interface__Group_4__2"
    // InternalToscaDsl.g:6174:1: rule__Interface__Group_4__2 : rule__Interface__Group_4__2__Impl rule__Interface__Group_4__3 ;
    public final void rule__Interface__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6178:1: ( rule__Interface__Group_4__2__Impl rule__Interface__Group_4__3 )
            // InternalToscaDsl.g:6179:2: rule__Interface__Group_4__2__Impl rule__Interface__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__Interface__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__2"


    // $ANTLR start "rule__Interface__Group_4__2__Impl"
    // InternalToscaDsl.g:6186:1: rule__Interface__Group_4__2__Impl : ( ( rule__Interface__OperationsAssignment_4_2 ) ) ;
    public final void rule__Interface__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6190:1: ( ( ( rule__Interface__OperationsAssignment_4_2 ) ) )
            // InternalToscaDsl.g:6191:1: ( ( rule__Interface__OperationsAssignment_4_2 ) )
            {
            // InternalToscaDsl.g:6191:1: ( ( rule__Interface__OperationsAssignment_4_2 ) )
            // InternalToscaDsl.g:6192:2: ( rule__Interface__OperationsAssignment_4_2 )
            {
             before(grammarAccess.getInterfaceAccess().getOperationsAssignment_4_2()); 
            // InternalToscaDsl.g:6193:2: ( rule__Interface__OperationsAssignment_4_2 )
            // InternalToscaDsl.g:6193:3: rule__Interface__OperationsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Interface__OperationsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getOperationsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__2__Impl"


    // $ANTLR start "rule__Interface__Group_4__3"
    // InternalToscaDsl.g:6201:1: rule__Interface__Group_4__3 : rule__Interface__Group_4__3__Impl rule__Interface__Group_4__4 ;
    public final void rule__Interface__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6205:1: ( rule__Interface__Group_4__3__Impl rule__Interface__Group_4__4 )
            // InternalToscaDsl.g:6206:2: rule__Interface__Group_4__3__Impl rule__Interface__Group_4__4
            {
            pushFollow(FOLLOW_10);
            rule__Interface__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__3"


    // $ANTLR start "rule__Interface__Group_4__3__Impl"
    // InternalToscaDsl.g:6213:1: rule__Interface__Group_4__3__Impl : ( ( rule__Interface__Group_4_3__0 )* ) ;
    public final void rule__Interface__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6217:1: ( ( ( rule__Interface__Group_4_3__0 )* ) )
            // InternalToscaDsl.g:6218:1: ( ( rule__Interface__Group_4_3__0 )* )
            {
            // InternalToscaDsl.g:6218:1: ( ( rule__Interface__Group_4_3__0 )* )
            // InternalToscaDsl.g:6219:2: ( rule__Interface__Group_4_3__0 )*
            {
             before(grammarAccess.getInterfaceAccess().getGroup_4_3()); 
            // InternalToscaDsl.g:6220:2: ( rule__Interface__Group_4_3__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==18) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalToscaDsl.g:6220:3: rule__Interface__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Interface__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__3__Impl"


    // $ANTLR start "rule__Interface__Group_4__4"
    // InternalToscaDsl.g:6228:1: rule__Interface__Group_4__4 : rule__Interface__Group_4__4__Impl ;
    public final void rule__Interface__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6232:1: ( rule__Interface__Group_4__4__Impl )
            // InternalToscaDsl.g:6233:2: rule__Interface__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__4"


    // $ANTLR start "rule__Interface__Group_4__4__Impl"
    // InternalToscaDsl.g:6239:1: rule__Interface__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Interface__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6243:1: ( ( '}' ) )
            // InternalToscaDsl.g:6244:1: ( '}' )
            {
            // InternalToscaDsl.g:6244:1: ( '}' )
            // InternalToscaDsl.g:6245:2: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__4__Impl"


    // $ANTLR start "rule__Interface__Group_4_3__0"
    // InternalToscaDsl.g:6255:1: rule__Interface__Group_4_3__0 : rule__Interface__Group_4_3__0__Impl rule__Interface__Group_4_3__1 ;
    public final void rule__Interface__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6259:1: ( rule__Interface__Group_4_3__0__Impl rule__Interface__Group_4_3__1 )
            // InternalToscaDsl.g:6260:2: rule__Interface__Group_4_3__0__Impl rule__Interface__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Interface__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4_3__0"


    // $ANTLR start "rule__Interface__Group_4_3__0__Impl"
    // InternalToscaDsl.g:6267:1: rule__Interface__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Interface__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6271:1: ( ( ',' ) )
            // InternalToscaDsl.g:6272:1: ( ',' )
            {
            // InternalToscaDsl.g:6272:1: ( ',' )
            // InternalToscaDsl.g:6273:2: ','
            {
             before(grammarAccess.getInterfaceAccess().getCommaKeyword_4_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4_3__0__Impl"


    // $ANTLR start "rule__Interface__Group_4_3__1"
    // InternalToscaDsl.g:6282:1: rule__Interface__Group_4_3__1 : rule__Interface__Group_4_3__1__Impl ;
    public final void rule__Interface__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6286:1: ( rule__Interface__Group_4_3__1__Impl )
            // InternalToscaDsl.g:6287:2: rule__Interface__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4_3__1"


    // $ANTLR start "rule__Interface__Group_4_3__1__Impl"
    // InternalToscaDsl.g:6293:1: rule__Interface__Group_4_3__1__Impl : ( ( rule__Interface__OperationsAssignment_4_3_1 ) ) ;
    public final void rule__Interface__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6297:1: ( ( ( rule__Interface__OperationsAssignment_4_3_1 ) ) )
            // InternalToscaDsl.g:6298:1: ( ( rule__Interface__OperationsAssignment_4_3_1 ) )
            {
            // InternalToscaDsl.g:6298:1: ( ( rule__Interface__OperationsAssignment_4_3_1 ) )
            // InternalToscaDsl.g:6299:2: ( rule__Interface__OperationsAssignment_4_3_1 )
            {
             before(grammarAccess.getInterfaceAccess().getOperationsAssignment_4_3_1()); 
            // InternalToscaDsl.g:6300:2: ( rule__Interface__OperationsAssignment_4_3_1 )
            // InternalToscaDsl.g:6300:3: rule__Interface__OperationsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Interface__OperationsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getOperationsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4_3__1__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalToscaDsl.g:6309:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6313:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalToscaDsl.g:6314:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalToscaDsl.g:6321:1: rule__Property__Group__0__Impl : ( () ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6325:1: ( ( () ) )
            // InternalToscaDsl.g:6326:1: ( () )
            {
            // InternalToscaDsl.g:6326:1: ( () )
            // InternalToscaDsl.g:6327:2: ()
            {
             before(grammarAccess.getPropertyAccess().getPropertyAction_0()); 
            // InternalToscaDsl.g:6328:2: ()
            // InternalToscaDsl.g:6328:3: 
            {
            }

             after(grammarAccess.getPropertyAccess().getPropertyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalToscaDsl.g:6336:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6340:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalToscaDsl.g:6341:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalToscaDsl.g:6348:1: rule__Property__Group__1__Impl : ( '{' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6352:1: ( ( '{' ) )
            // InternalToscaDsl.g:6353:1: ( '{' )
            {
            // InternalToscaDsl.g:6353:1: ( '{' )
            // InternalToscaDsl.g:6354:2: '{'
            {
             before(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // InternalToscaDsl.g:6363:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6367:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalToscaDsl.g:6368:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // InternalToscaDsl.g:6375:1: rule__Property__Group__2__Impl : ( ( rule__Property__Property_nameAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6379:1: ( ( ( rule__Property__Property_nameAssignment_2 ) ) )
            // InternalToscaDsl.g:6380:1: ( ( rule__Property__Property_nameAssignment_2 ) )
            {
            // InternalToscaDsl.g:6380:1: ( ( rule__Property__Property_nameAssignment_2 ) )
            // InternalToscaDsl.g:6381:2: ( rule__Property__Property_nameAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getProperty_nameAssignment_2()); 
            // InternalToscaDsl.g:6382:2: ( rule__Property__Property_nameAssignment_2 )
            // InternalToscaDsl.g:6382:3: rule__Property__Property_nameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Property__Property_nameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getProperty_nameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // InternalToscaDsl.g:6390:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6394:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // InternalToscaDsl.g:6395:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Property__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // InternalToscaDsl.g:6402:1: rule__Property__Group__3__Impl : ( ':' ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6406:1: ( ( ':' ) )
            // InternalToscaDsl.g:6407:1: ( ':' )
            {
            // InternalToscaDsl.g:6407:1: ( ':' )
            // InternalToscaDsl.g:6408:2: ':'
            {
             before(grammarAccess.getPropertyAccess().getColonKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__4"
    // InternalToscaDsl.g:6417:1: rule__Property__Group__4 : rule__Property__Group__4__Impl rule__Property__Group__5 ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6421:1: ( rule__Property__Group__4__Impl rule__Property__Group__5 )
            // InternalToscaDsl.g:6422:2: rule__Property__Group__4__Impl rule__Property__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Property__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4"


    // $ANTLR start "rule__Property__Group__4__Impl"
    // InternalToscaDsl.g:6429:1: rule__Property__Group__4__Impl : ( ( rule__Property__ValueAssignment_4 ) ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6433:1: ( ( ( rule__Property__ValueAssignment_4 ) ) )
            // InternalToscaDsl.g:6434:1: ( ( rule__Property__ValueAssignment_4 ) )
            {
            // InternalToscaDsl.g:6434:1: ( ( rule__Property__ValueAssignment_4 ) )
            // InternalToscaDsl.g:6435:2: ( rule__Property__ValueAssignment_4 )
            {
             before(grammarAccess.getPropertyAccess().getValueAssignment_4()); 
            // InternalToscaDsl.g:6436:2: ( rule__Property__ValueAssignment_4 )
            // InternalToscaDsl.g:6436:3: rule__Property__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Property__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4__Impl"


    // $ANTLR start "rule__Property__Group__5"
    // InternalToscaDsl.g:6444:1: rule__Property__Group__5 : rule__Property__Group__5__Impl ;
    public final void rule__Property__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6448:1: ( rule__Property__Group__5__Impl )
            // InternalToscaDsl.g:6449:2: rule__Property__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__5"


    // $ANTLR start "rule__Property__Group__5__Impl"
    // InternalToscaDsl.g:6455:1: rule__Property__Group__5__Impl : ( '}' ) ;
    public final void rule__Property__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6459:1: ( ( '}' ) )
            // InternalToscaDsl.g:6460:1: ( '}' )
            {
            // InternalToscaDsl.g:6460:1: ( '}' )
            // InternalToscaDsl.g:6461:2: '}'
            {
             before(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalToscaDsl.g:6471:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6475:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalToscaDsl.g:6476:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalToscaDsl.g:6483:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6487:1: ( ( () ) )
            // InternalToscaDsl.g:6488:1: ( () )
            {
            // InternalToscaDsl.g:6488:1: ( () )
            // InternalToscaDsl.g:6489:2: ()
            {
             before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            // InternalToscaDsl.g:6490:2: ()
            // InternalToscaDsl.g:6490:3: 
            {
            }

             after(grammarAccess.getAttributeAccess().getAttributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalToscaDsl.g:6498:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6502:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalToscaDsl.g:6503:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalToscaDsl.g:6510:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__Attribute_nameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6514:1: ( ( ( rule__Attribute__Attribute_nameAssignment_1 ) ) )
            // InternalToscaDsl.g:6515:1: ( ( rule__Attribute__Attribute_nameAssignment_1 ) )
            {
            // InternalToscaDsl.g:6515:1: ( ( rule__Attribute__Attribute_nameAssignment_1 ) )
            // InternalToscaDsl.g:6516:2: ( rule__Attribute__Attribute_nameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getAttribute_nameAssignment_1()); 
            // InternalToscaDsl.g:6517:2: ( rule__Attribute__Attribute_nameAssignment_1 )
            // InternalToscaDsl.g:6517:3: rule__Attribute__Attribute_nameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Attribute_nameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttribute_nameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalToscaDsl.g:6525:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6529:1: ( rule__Attribute__Group__2__Impl )
            // InternalToscaDsl.g:6530:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalToscaDsl.g:6536:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6540:1: ( ( ':' ) )
            // InternalToscaDsl.g:6541:1: ( ':' )
            {
            // InternalToscaDsl.g:6541:1: ( ':' )
            // InternalToscaDsl.g:6542:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Requirement__Group__0"
    // InternalToscaDsl.g:6552:1: rule__Requirement__Group__0 : rule__Requirement__Group__0__Impl rule__Requirement__Group__1 ;
    public final void rule__Requirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6556:1: ( rule__Requirement__Group__0__Impl rule__Requirement__Group__1 )
            // InternalToscaDsl.g:6557:2: rule__Requirement__Group__0__Impl rule__Requirement__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Requirement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requirement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__0"


    // $ANTLR start "rule__Requirement__Group__0__Impl"
    // InternalToscaDsl.g:6564:1: rule__Requirement__Group__0__Impl : ( ( rule__Requirement__Requirement_nameAssignment_0 ) ) ;
    public final void rule__Requirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6568:1: ( ( ( rule__Requirement__Requirement_nameAssignment_0 ) ) )
            // InternalToscaDsl.g:6569:1: ( ( rule__Requirement__Requirement_nameAssignment_0 ) )
            {
            // InternalToscaDsl.g:6569:1: ( ( rule__Requirement__Requirement_nameAssignment_0 ) )
            // InternalToscaDsl.g:6570:2: ( rule__Requirement__Requirement_nameAssignment_0 )
            {
             before(grammarAccess.getRequirementAccess().getRequirement_nameAssignment_0()); 
            // InternalToscaDsl.g:6571:2: ( rule__Requirement__Requirement_nameAssignment_0 )
            // InternalToscaDsl.g:6571:3: rule__Requirement__Requirement_nameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__Requirement_nameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRequirementAccess().getRequirement_nameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__0__Impl"


    // $ANTLR start "rule__Requirement__Group__1"
    // InternalToscaDsl.g:6579:1: rule__Requirement__Group__1 : rule__Requirement__Group__1__Impl rule__Requirement__Group__2 ;
    public final void rule__Requirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6583:1: ( rule__Requirement__Group__1__Impl rule__Requirement__Group__2 )
            // InternalToscaDsl.g:6584:2: rule__Requirement__Group__1__Impl rule__Requirement__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Requirement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requirement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__1"


    // $ANTLR start "rule__Requirement__Group__1__Impl"
    // InternalToscaDsl.g:6591:1: rule__Requirement__Group__1__Impl : ( ':' ) ;
    public final void rule__Requirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6595:1: ( ( ':' ) )
            // InternalToscaDsl.g:6596:1: ( ':' )
            {
            // InternalToscaDsl.g:6596:1: ( ':' )
            // InternalToscaDsl.g:6597:2: ':'
            {
             before(grammarAccess.getRequirementAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRequirementAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__1__Impl"


    // $ANTLR start "rule__Requirement__Group__2"
    // InternalToscaDsl.g:6606:1: rule__Requirement__Group__2 : rule__Requirement__Group__2__Impl rule__Requirement__Group__3 ;
    public final void rule__Requirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6610:1: ( rule__Requirement__Group__2__Impl rule__Requirement__Group__3 )
            // InternalToscaDsl.g:6611:2: rule__Requirement__Group__2__Impl rule__Requirement__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Requirement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requirement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__2"


    // $ANTLR start "rule__Requirement__Group__2__Impl"
    // InternalToscaDsl.g:6618:1: rule__Requirement__Group__2__Impl : ( '{' ) ;
    public final void rule__Requirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6622:1: ( ( '{' ) )
            // InternalToscaDsl.g:6623:1: ( '{' )
            {
            // InternalToscaDsl.g:6623:1: ( '{' )
            // InternalToscaDsl.g:6624:2: '{'
            {
             before(grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__2__Impl"


    // $ANTLR start "rule__Requirement__Group__3"
    // InternalToscaDsl.g:6633:1: rule__Requirement__Group__3 : rule__Requirement__Group__3__Impl rule__Requirement__Group__4 ;
    public final void rule__Requirement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6637:1: ( rule__Requirement__Group__3__Impl rule__Requirement__Group__4 )
            // InternalToscaDsl.g:6638:2: rule__Requirement__Group__3__Impl rule__Requirement__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Requirement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requirement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__3"


    // $ANTLR start "rule__Requirement__Group__3__Impl"
    // InternalToscaDsl.g:6645:1: rule__Requirement__Group__3__Impl : ( '\"capabiity\" :' ) ;
    public final void rule__Requirement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6649:1: ( ( '\"capabiity\" :' ) )
            // InternalToscaDsl.g:6650:1: ( '\"capabiity\" :' )
            {
            // InternalToscaDsl.g:6650:1: ( '\"capabiity\" :' )
            // InternalToscaDsl.g:6651:2: '\"capabiity\" :'
            {
             before(grammarAccess.getRequirementAccess().getCapabiityKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRequirementAccess().getCapabiityKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__3__Impl"


    // $ANTLR start "rule__Requirement__Group__4"
    // InternalToscaDsl.g:6660:1: rule__Requirement__Group__4 : rule__Requirement__Group__4__Impl rule__Requirement__Group__5 ;
    public final void rule__Requirement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6664:1: ( rule__Requirement__Group__4__Impl rule__Requirement__Group__5 )
            // InternalToscaDsl.g:6665:2: rule__Requirement__Group__4__Impl rule__Requirement__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Requirement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requirement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__4"


    // $ANTLR start "rule__Requirement__Group__4__Impl"
    // InternalToscaDsl.g:6672:1: rule__Requirement__Group__4__Impl : ( ( rule__Requirement__CapabiityAssignment_4 ) ) ;
    public final void rule__Requirement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6676:1: ( ( ( rule__Requirement__CapabiityAssignment_4 ) ) )
            // InternalToscaDsl.g:6677:1: ( ( rule__Requirement__CapabiityAssignment_4 ) )
            {
            // InternalToscaDsl.g:6677:1: ( ( rule__Requirement__CapabiityAssignment_4 ) )
            // InternalToscaDsl.g:6678:2: ( rule__Requirement__CapabiityAssignment_4 )
            {
             before(grammarAccess.getRequirementAccess().getCapabiityAssignment_4()); 
            // InternalToscaDsl.g:6679:2: ( rule__Requirement__CapabiityAssignment_4 )
            // InternalToscaDsl.g:6679:3: rule__Requirement__CapabiityAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__CapabiityAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRequirementAccess().getCapabiityAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__4__Impl"


    // $ANTLR start "rule__Requirement__Group__5"
    // InternalToscaDsl.g:6687:1: rule__Requirement__Group__5 : rule__Requirement__Group__5__Impl rule__Requirement__Group__6 ;
    public final void rule__Requirement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6691:1: ( rule__Requirement__Group__5__Impl rule__Requirement__Group__6 )
            // InternalToscaDsl.g:6692:2: rule__Requirement__Group__5__Impl rule__Requirement__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Requirement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requirement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__5"


    // $ANTLR start "rule__Requirement__Group__5__Impl"
    // InternalToscaDsl.g:6699:1: rule__Requirement__Group__5__Impl : ( ( rule__Requirement__Group_5__0 )? ) ;
    public final void rule__Requirement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6703:1: ( ( ( rule__Requirement__Group_5__0 )? ) )
            // InternalToscaDsl.g:6704:1: ( ( rule__Requirement__Group_5__0 )? )
            {
            // InternalToscaDsl.g:6704:1: ( ( rule__Requirement__Group_5__0 )? )
            // InternalToscaDsl.g:6705:2: ( rule__Requirement__Group_5__0 )?
            {
             before(grammarAccess.getRequirementAccess().getGroup_5()); 
            // InternalToscaDsl.g:6706:2: ( rule__Requirement__Group_5__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==39) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalToscaDsl.g:6706:3: rule__Requirement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Requirement__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequirementAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__5__Impl"


    // $ANTLR start "rule__Requirement__Group__6"
    // InternalToscaDsl.g:6714:1: rule__Requirement__Group__6 : rule__Requirement__Group__6__Impl ;
    public final void rule__Requirement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6718:1: ( rule__Requirement__Group__6__Impl )
            // InternalToscaDsl.g:6719:2: rule__Requirement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__6"


    // $ANTLR start "rule__Requirement__Group__6__Impl"
    // InternalToscaDsl.g:6725:1: rule__Requirement__Group__6__Impl : ( '}' ) ;
    public final void rule__Requirement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6729:1: ( ( '}' ) )
            // InternalToscaDsl.g:6730:1: ( '}' )
            {
            // InternalToscaDsl.g:6730:1: ( '}' )
            // InternalToscaDsl.g:6731:2: '}'
            {
             before(grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__6__Impl"


    // $ANTLR start "rule__Requirement__Group_5__0"
    // InternalToscaDsl.g:6741:1: rule__Requirement__Group_5__0 : rule__Requirement__Group_5__0__Impl rule__Requirement__Group_5__1 ;
    public final void rule__Requirement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6745:1: ( rule__Requirement__Group_5__0__Impl rule__Requirement__Group_5__1 )
            // InternalToscaDsl.g:6746:2: rule__Requirement__Group_5__0__Impl rule__Requirement__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Requirement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requirement__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group_5__0"


    // $ANTLR start "rule__Requirement__Group_5__0__Impl"
    // InternalToscaDsl.g:6753:1: rule__Requirement__Group_5__0__Impl : ( ',\\n\"node\" :' ) ;
    public final void rule__Requirement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6757:1: ( ( ',\\n\"node\" :' ) )
            // InternalToscaDsl.g:6758:1: ( ',\\n\"node\" :' )
            {
            // InternalToscaDsl.g:6758:1: ( ',\\n\"node\" :' )
            // InternalToscaDsl.g:6759:2: ',\\n\"node\" :'
            {
             before(grammarAccess.getRequirementAccess().getNodeKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRequirementAccess().getNodeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group_5__0__Impl"


    // $ANTLR start "rule__Requirement__Group_5__1"
    // InternalToscaDsl.g:6768:1: rule__Requirement__Group_5__1 : rule__Requirement__Group_5__1__Impl ;
    public final void rule__Requirement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6772:1: ( rule__Requirement__Group_5__1__Impl )
            // InternalToscaDsl.g:6773:2: rule__Requirement__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group_5__1"


    // $ANTLR start "rule__Requirement__Group_5__1__Impl"
    // InternalToscaDsl.g:6779:1: rule__Requirement__Group_5__1__Impl : ( ( rule__Requirement__NodeAssignment_5_1 ) ) ;
    public final void rule__Requirement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6783:1: ( ( ( rule__Requirement__NodeAssignment_5_1 ) ) )
            // InternalToscaDsl.g:6784:1: ( ( rule__Requirement__NodeAssignment_5_1 ) )
            {
            // InternalToscaDsl.g:6784:1: ( ( rule__Requirement__NodeAssignment_5_1 ) )
            // InternalToscaDsl.g:6785:2: ( rule__Requirement__NodeAssignment_5_1 )
            {
             before(grammarAccess.getRequirementAccess().getNodeAssignment_5_1()); 
            // InternalToscaDsl.g:6786:2: ( rule__Requirement__NodeAssignment_5_1 )
            // InternalToscaDsl.g:6786:3: rule__Requirement__NodeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__NodeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRequirementAccess().getNodeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group_5__1__Impl"


    // $ANTLR start "rule__Capability__Group__0"
    // InternalToscaDsl.g:6795:1: rule__Capability__Group__0 : rule__Capability__Group__0__Impl rule__Capability__Group__1 ;
    public final void rule__Capability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6799:1: ( rule__Capability__Group__0__Impl rule__Capability__Group__1 )
            // InternalToscaDsl.g:6800:2: rule__Capability__Group__0__Impl rule__Capability__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Capability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__0"


    // $ANTLR start "rule__Capability__Group__0__Impl"
    // InternalToscaDsl.g:6807:1: rule__Capability__Group__0__Impl : ( ( rule__Capability__Capability_nameAssignment_0 ) ) ;
    public final void rule__Capability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6811:1: ( ( ( rule__Capability__Capability_nameAssignment_0 ) ) )
            // InternalToscaDsl.g:6812:1: ( ( rule__Capability__Capability_nameAssignment_0 ) )
            {
            // InternalToscaDsl.g:6812:1: ( ( rule__Capability__Capability_nameAssignment_0 ) )
            // InternalToscaDsl.g:6813:2: ( rule__Capability__Capability_nameAssignment_0 )
            {
             before(grammarAccess.getCapabilityAccess().getCapability_nameAssignment_0()); 
            // InternalToscaDsl.g:6814:2: ( rule__Capability__Capability_nameAssignment_0 )
            // InternalToscaDsl.g:6814:3: rule__Capability__Capability_nameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Capability__Capability_nameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityAccess().getCapability_nameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__0__Impl"


    // $ANTLR start "rule__Capability__Group__1"
    // InternalToscaDsl.g:6822:1: rule__Capability__Group__1 : rule__Capability__Group__1__Impl rule__Capability__Group__2 ;
    public final void rule__Capability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6826:1: ( rule__Capability__Group__1__Impl rule__Capability__Group__2 )
            // InternalToscaDsl.g:6827:2: rule__Capability__Group__1__Impl rule__Capability__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Capability__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__1"


    // $ANTLR start "rule__Capability__Group__1__Impl"
    // InternalToscaDsl.g:6834:1: rule__Capability__Group__1__Impl : ( ':' ) ;
    public final void rule__Capability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6838:1: ( ( ':' ) )
            // InternalToscaDsl.g:6839:1: ( ':' )
            {
            // InternalToscaDsl.g:6839:1: ( ':' )
            // InternalToscaDsl.g:6840:2: ':'
            {
             before(grammarAccess.getCapabilityAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__1__Impl"


    // $ANTLR start "rule__Capability__Group__2"
    // InternalToscaDsl.g:6849:1: rule__Capability__Group__2 : rule__Capability__Group__2__Impl rule__Capability__Group__3 ;
    public final void rule__Capability__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6853:1: ( rule__Capability__Group__2__Impl rule__Capability__Group__3 )
            // InternalToscaDsl.g:6854:2: rule__Capability__Group__2__Impl rule__Capability__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Capability__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__2"


    // $ANTLR start "rule__Capability__Group__2__Impl"
    // InternalToscaDsl.g:6861:1: rule__Capability__Group__2__Impl : ( '{' ) ;
    public final void rule__Capability__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6865:1: ( ( '{' ) )
            // InternalToscaDsl.g:6866:1: ( '{' )
            {
            // InternalToscaDsl.g:6866:1: ( '{' )
            // InternalToscaDsl.g:6867:2: '{'
            {
             before(grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__2__Impl"


    // $ANTLR start "rule__Capability__Group__3"
    // InternalToscaDsl.g:6876:1: rule__Capability__Group__3 : rule__Capability__Group__3__Impl rule__Capability__Group__4 ;
    public final void rule__Capability__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6880:1: ( rule__Capability__Group__3__Impl rule__Capability__Group__4 )
            // InternalToscaDsl.g:6881:2: rule__Capability__Group__3__Impl rule__Capability__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Capability__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__3"


    // $ANTLR start "rule__Capability__Group__3__Impl"
    // InternalToscaDsl.g:6888:1: rule__Capability__Group__3__Impl : ( '\"type\" :' ) ;
    public final void rule__Capability__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6892:1: ( ( '\"type\" :' ) )
            // InternalToscaDsl.g:6893:1: ( '\"type\" :' )
            {
            // InternalToscaDsl.g:6893:1: ( '\"type\" :' )
            // InternalToscaDsl.g:6894:2: '\"type\" :'
            {
             before(grammarAccess.getCapabilityAccess().getTypeKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__3__Impl"


    // $ANTLR start "rule__Capability__Group__4"
    // InternalToscaDsl.g:6903:1: rule__Capability__Group__4 : rule__Capability__Group__4__Impl rule__Capability__Group__5 ;
    public final void rule__Capability__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6907:1: ( rule__Capability__Group__4__Impl rule__Capability__Group__5 )
            // InternalToscaDsl.g:6908:2: rule__Capability__Group__4__Impl rule__Capability__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Capability__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__4"


    // $ANTLR start "rule__Capability__Group__4__Impl"
    // InternalToscaDsl.g:6915:1: rule__Capability__Group__4__Impl : ( ( rule__Capability__TypeAssignment_4 ) ) ;
    public final void rule__Capability__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6919:1: ( ( ( rule__Capability__TypeAssignment_4 ) ) )
            // InternalToscaDsl.g:6920:1: ( ( rule__Capability__TypeAssignment_4 ) )
            {
            // InternalToscaDsl.g:6920:1: ( ( rule__Capability__TypeAssignment_4 ) )
            // InternalToscaDsl.g:6921:2: ( rule__Capability__TypeAssignment_4 )
            {
             before(grammarAccess.getCapabilityAccess().getTypeAssignment_4()); 
            // InternalToscaDsl.g:6922:2: ( rule__Capability__TypeAssignment_4 )
            // InternalToscaDsl.g:6922:3: rule__Capability__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Capability__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__4__Impl"


    // $ANTLR start "rule__Capability__Group__5"
    // InternalToscaDsl.g:6930:1: rule__Capability__Group__5 : rule__Capability__Group__5__Impl rule__Capability__Group__6 ;
    public final void rule__Capability__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6934:1: ( rule__Capability__Group__5__Impl rule__Capability__Group__6 )
            // InternalToscaDsl.g:6935:2: rule__Capability__Group__5__Impl rule__Capability__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Capability__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__5"


    // $ANTLR start "rule__Capability__Group__5__Impl"
    // InternalToscaDsl.g:6942:1: rule__Capability__Group__5__Impl : ( ( rule__Capability__Group_5__0 )? ) ;
    public final void rule__Capability__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6946:1: ( ( ( rule__Capability__Group_5__0 )? ) )
            // InternalToscaDsl.g:6947:1: ( ( rule__Capability__Group_5__0 )? )
            {
            // InternalToscaDsl.g:6947:1: ( ( rule__Capability__Group_5__0 )? )
            // InternalToscaDsl.g:6948:2: ( rule__Capability__Group_5__0 )?
            {
             before(grammarAccess.getCapabilityAccess().getGroup_5()); 
            // InternalToscaDsl.g:6949:2: ( rule__Capability__Group_5__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==14) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalToscaDsl.g:6949:3: rule__Capability__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Capability__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCapabilityAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__5__Impl"


    // $ANTLR start "rule__Capability__Group__6"
    // InternalToscaDsl.g:6957:1: rule__Capability__Group__6 : rule__Capability__Group__6__Impl rule__Capability__Group__7 ;
    public final void rule__Capability__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6961:1: ( rule__Capability__Group__6__Impl rule__Capability__Group__7 )
            // InternalToscaDsl.g:6962:2: rule__Capability__Group__6__Impl rule__Capability__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Capability__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__6"


    // $ANTLR start "rule__Capability__Group__6__Impl"
    // InternalToscaDsl.g:6969:1: rule__Capability__Group__6__Impl : ( ( rule__Capability__Group_6__0 )? ) ;
    public final void rule__Capability__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6973:1: ( ( ( rule__Capability__Group_6__0 )? ) )
            // InternalToscaDsl.g:6974:1: ( ( rule__Capability__Group_6__0 )? )
            {
            // InternalToscaDsl.g:6974:1: ( ( rule__Capability__Group_6__0 )? )
            // InternalToscaDsl.g:6975:2: ( rule__Capability__Group_6__0 )?
            {
             before(grammarAccess.getCapabilityAccess().getGroup_6()); 
            // InternalToscaDsl.g:6976:2: ( rule__Capability__Group_6__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==29) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalToscaDsl.g:6976:3: rule__Capability__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Capability__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCapabilityAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__6__Impl"


    // $ANTLR start "rule__Capability__Group__7"
    // InternalToscaDsl.g:6984:1: rule__Capability__Group__7 : rule__Capability__Group__7__Impl rule__Capability__Group__8 ;
    public final void rule__Capability__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:6988:1: ( rule__Capability__Group__7__Impl rule__Capability__Group__8 )
            // InternalToscaDsl.g:6989:2: rule__Capability__Group__7__Impl rule__Capability__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Capability__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__7"


    // $ANTLR start "rule__Capability__Group__7__Impl"
    // InternalToscaDsl.g:6996:1: rule__Capability__Group__7__Impl : ( ( rule__Capability__Group_7__0 )? ) ;
    public final void rule__Capability__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7000:1: ( ( ( rule__Capability__Group_7__0 )? ) )
            // InternalToscaDsl.g:7001:1: ( ( rule__Capability__Group_7__0 )? )
            {
            // InternalToscaDsl.g:7001:1: ( ( rule__Capability__Group_7__0 )? )
            // InternalToscaDsl.g:7002:2: ( rule__Capability__Group_7__0 )?
            {
             before(grammarAccess.getCapabilityAccess().getGroup_7()); 
            // InternalToscaDsl.g:7003:2: ( rule__Capability__Group_7__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==30) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalToscaDsl.g:7003:3: rule__Capability__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Capability__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCapabilityAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__7__Impl"


    // $ANTLR start "rule__Capability__Group__8"
    // InternalToscaDsl.g:7011:1: rule__Capability__Group__8 : rule__Capability__Group__8__Impl ;
    public final void rule__Capability__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7015:1: ( rule__Capability__Group__8__Impl )
            // InternalToscaDsl.g:7016:2: rule__Capability__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Capability__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__8"


    // $ANTLR start "rule__Capability__Group__8__Impl"
    // InternalToscaDsl.g:7022:1: rule__Capability__Group__8__Impl : ( '}' ) ;
    public final void rule__Capability__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7026:1: ( ( '}' ) )
            // InternalToscaDsl.g:7027:1: ( '}' )
            {
            // InternalToscaDsl.g:7027:1: ( '}' )
            // InternalToscaDsl.g:7028:2: '}'
            {
             before(grammarAccess.getCapabilityAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__8__Impl"


    // $ANTLR start "rule__Capability__Group_5__0"
    // InternalToscaDsl.g:7038:1: rule__Capability__Group_5__0 : rule__Capability__Group_5__0__Impl rule__Capability__Group_5__1 ;
    public final void rule__Capability__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7042:1: ( rule__Capability__Group_5__0__Impl rule__Capability__Group_5__1 )
            // InternalToscaDsl.g:7043:2: rule__Capability__Group_5__0__Impl rule__Capability__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Capability__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_5__0"


    // $ANTLR start "rule__Capability__Group_5__0__Impl"
    // InternalToscaDsl.g:7050:1: rule__Capability__Group_5__0__Impl : ( ',\\n\"description\" :' ) ;
    public final void rule__Capability__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7054:1: ( ( ',\\n\"description\" :' ) )
            // InternalToscaDsl.g:7055:1: ( ',\\n\"description\" :' )
            {
            // InternalToscaDsl.g:7055:1: ( ',\\n\"description\" :' )
            // InternalToscaDsl.g:7056:2: ',\\n\"description\" :'
            {
             before(grammarAccess.getCapabilityAccess().getDescriptionKeyword_5_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getDescriptionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_5__0__Impl"


    // $ANTLR start "rule__Capability__Group_5__1"
    // InternalToscaDsl.g:7065:1: rule__Capability__Group_5__1 : rule__Capability__Group_5__1__Impl ;
    public final void rule__Capability__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7069:1: ( rule__Capability__Group_5__1__Impl )
            // InternalToscaDsl.g:7070:2: rule__Capability__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Capability__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_5__1"


    // $ANTLR start "rule__Capability__Group_5__1__Impl"
    // InternalToscaDsl.g:7076:1: rule__Capability__Group_5__1__Impl : ( ( rule__Capability__DescriptionAssignment_5_1 ) ) ;
    public final void rule__Capability__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7080:1: ( ( ( rule__Capability__DescriptionAssignment_5_1 ) ) )
            // InternalToscaDsl.g:7081:1: ( ( rule__Capability__DescriptionAssignment_5_1 ) )
            {
            // InternalToscaDsl.g:7081:1: ( ( rule__Capability__DescriptionAssignment_5_1 ) )
            // InternalToscaDsl.g:7082:2: ( rule__Capability__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getCapabilityAccess().getDescriptionAssignment_5_1()); 
            // InternalToscaDsl.g:7083:2: ( rule__Capability__DescriptionAssignment_5_1 )
            // InternalToscaDsl.g:7083:3: rule__Capability__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Capability__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityAccess().getDescriptionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_5__1__Impl"


    // $ANTLR start "rule__Capability__Group_6__0"
    // InternalToscaDsl.g:7092:1: rule__Capability__Group_6__0 : rule__Capability__Group_6__0__Impl rule__Capability__Group_6__1 ;
    public final void rule__Capability__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7096:1: ( rule__Capability__Group_6__0__Impl rule__Capability__Group_6__1 )
            // InternalToscaDsl.g:7097:2: rule__Capability__Group_6__0__Impl rule__Capability__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__Capability__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_6__0"


    // $ANTLR start "rule__Capability__Group_6__0__Impl"
    // InternalToscaDsl.g:7104:1: rule__Capability__Group_6__0__Impl : ( ',\\n\"properties\" :' ) ;
    public final void rule__Capability__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7108:1: ( ( ',\\n\"properties\" :' ) )
            // InternalToscaDsl.g:7109:1: ( ',\\n\"properties\" :' )
            {
            // InternalToscaDsl.g:7109:1: ( ',\\n\"properties\" :' )
            // InternalToscaDsl.g:7110:2: ',\\n\"properties\" :'
            {
             before(grammarAccess.getCapabilityAccess().getPropertiesKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getPropertiesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_6__0__Impl"


    // $ANTLR start "rule__Capability__Group_6__1"
    // InternalToscaDsl.g:7119:1: rule__Capability__Group_6__1 : rule__Capability__Group_6__1__Impl rule__Capability__Group_6__2 ;
    public final void rule__Capability__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7123:1: ( rule__Capability__Group_6__1__Impl rule__Capability__Group_6__2 )
            // InternalToscaDsl.g:7124:2: rule__Capability__Group_6__1__Impl rule__Capability__Group_6__2
            {
            pushFollow(FOLLOW_9);
            rule__Capability__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_6__1"


    // $ANTLR start "rule__Capability__Group_6__1__Impl"
    // InternalToscaDsl.g:7131:1: rule__Capability__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Capability__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7135:1: ( ( '{' ) )
            // InternalToscaDsl.g:7136:1: ( '{' )
            {
            // InternalToscaDsl.g:7136:1: ( '{' )
            // InternalToscaDsl.g:7137:2: '{'
            {
             before(grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_6__1__Impl"


    // $ANTLR start "rule__Capability__Group_6__2"
    // InternalToscaDsl.g:7146:1: rule__Capability__Group_6__2 : rule__Capability__Group_6__2__Impl rule__Capability__Group_6__3 ;
    public final void rule__Capability__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7150:1: ( rule__Capability__Group_6__2__Impl rule__Capability__Group_6__3 )
            // InternalToscaDsl.g:7151:2: rule__Capability__Group_6__2__Impl rule__Capability__Group_6__3
            {
            pushFollow(FOLLOW_10);
            rule__Capability__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_6__2"


    // $ANTLR start "rule__Capability__Group_6__2__Impl"
    // InternalToscaDsl.g:7158:1: rule__Capability__Group_6__2__Impl : ( ( rule__Capability__PropertiesAssignment_6_2 ) ) ;
    public final void rule__Capability__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7162:1: ( ( ( rule__Capability__PropertiesAssignment_6_2 ) ) )
            // InternalToscaDsl.g:7163:1: ( ( rule__Capability__PropertiesAssignment_6_2 ) )
            {
            // InternalToscaDsl.g:7163:1: ( ( rule__Capability__PropertiesAssignment_6_2 ) )
            // InternalToscaDsl.g:7164:2: ( rule__Capability__PropertiesAssignment_6_2 )
            {
             before(grammarAccess.getCapabilityAccess().getPropertiesAssignment_6_2()); 
            // InternalToscaDsl.g:7165:2: ( rule__Capability__PropertiesAssignment_6_2 )
            // InternalToscaDsl.g:7165:3: rule__Capability__PropertiesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Capability__PropertiesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityAccess().getPropertiesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_6__2__Impl"


    // $ANTLR start "rule__Capability__Group_6__3"
    // InternalToscaDsl.g:7173:1: rule__Capability__Group_6__3 : rule__Capability__Group_6__3__Impl rule__Capability__Group_6__4 ;
    public final void rule__Capability__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7177:1: ( rule__Capability__Group_6__3__Impl rule__Capability__Group_6__4 )
            // InternalToscaDsl.g:7178:2: rule__Capability__Group_6__3__Impl rule__Capability__Group_6__4
            {
            pushFollow(FOLLOW_10);
            rule__Capability__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_6__3"


    // $ANTLR start "rule__Capability__Group_6__3__Impl"
    // InternalToscaDsl.g:7185:1: rule__Capability__Group_6__3__Impl : ( ( rule__Capability__Group_6_3__0 )* ) ;
    public final void rule__Capability__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7189:1: ( ( ( rule__Capability__Group_6_3__0 )* ) )
            // InternalToscaDsl.g:7190:1: ( ( rule__Capability__Group_6_3__0 )* )
            {
            // InternalToscaDsl.g:7190:1: ( ( rule__Capability__Group_6_3__0 )* )
            // InternalToscaDsl.g:7191:2: ( rule__Capability__Group_6_3__0 )*
            {
             before(grammarAccess.getCapabilityAccess().getGroup_6_3()); 
            // InternalToscaDsl.g:7192:2: ( rule__Capability__Group_6_3__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==18) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalToscaDsl.g:7192:3: rule__Capability__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Capability__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getCapabilityAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_6__3__Impl"


    // $ANTLR start "rule__Capability__Group_6__4"
    // InternalToscaDsl.g:7200:1: rule__Capability__Group_6__4 : rule__Capability__Group_6__4__Impl ;
    public final void rule__Capability__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7204:1: ( rule__Capability__Group_6__4__Impl )
            // InternalToscaDsl.g:7205:2: rule__Capability__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Capability__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_6__4"


    // $ANTLR start "rule__Capability__Group_6__4__Impl"
    // InternalToscaDsl.g:7211:1: rule__Capability__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Capability__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7215:1: ( ( '}' ) )
            // InternalToscaDsl.g:7216:1: ( '}' )
            {
            // InternalToscaDsl.g:7216:1: ( '}' )
            // InternalToscaDsl.g:7217:2: '}'
            {
             before(grammarAccess.getCapabilityAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_6__4__Impl"


    // $ANTLR start "rule__Capability__Group_6_3__0"
    // InternalToscaDsl.g:7227:1: rule__Capability__Group_6_3__0 : rule__Capability__Group_6_3__0__Impl rule__Capability__Group_6_3__1 ;
    public final void rule__Capability__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7231:1: ( rule__Capability__Group_6_3__0__Impl rule__Capability__Group_6_3__1 )
            // InternalToscaDsl.g:7232:2: rule__Capability__Group_6_3__0__Impl rule__Capability__Group_6_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Capability__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_6_3__0"


    // $ANTLR start "rule__Capability__Group_6_3__0__Impl"
    // InternalToscaDsl.g:7239:1: rule__Capability__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Capability__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7243:1: ( ( ',' ) )
            // InternalToscaDsl.g:7244:1: ( ',' )
            {
            // InternalToscaDsl.g:7244:1: ( ',' )
            // InternalToscaDsl.g:7245:2: ','
            {
             before(grammarAccess.getCapabilityAccess().getCommaKeyword_6_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_6_3__0__Impl"


    // $ANTLR start "rule__Capability__Group_6_3__1"
    // InternalToscaDsl.g:7254:1: rule__Capability__Group_6_3__1 : rule__Capability__Group_6_3__1__Impl ;
    public final void rule__Capability__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7258:1: ( rule__Capability__Group_6_3__1__Impl )
            // InternalToscaDsl.g:7259:2: rule__Capability__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Capability__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_6_3__1"


    // $ANTLR start "rule__Capability__Group_6_3__1__Impl"
    // InternalToscaDsl.g:7265:1: rule__Capability__Group_6_3__1__Impl : ( ( rule__Capability__PropertiesAssignment_6_3_1 ) ) ;
    public final void rule__Capability__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7269:1: ( ( ( rule__Capability__PropertiesAssignment_6_3_1 ) ) )
            // InternalToscaDsl.g:7270:1: ( ( rule__Capability__PropertiesAssignment_6_3_1 ) )
            {
            // InternalToscaDsl.g:7270:1: ( ( rule__Capability__PropertiesAssignment_6_3_1 ) )
            // InternalToscaDsl.g:7271:2: ( rule__Capability__PropertiesAssignment_6_3_1 )
            {
             before(grammarAccess.getCapabilityAccess().getPropertiesAssignment_6_3_1()); 
            // InternalToscaDsl.g:7272:2: ( rule__Capability__PropertiesAssignment_6_3_1 )
            // InternalToscaDsl.g:7272:3: rule__Capability__PropertiesAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Capability__PropertiesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityAccess().getPropertiesAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_6_3__1__Impl"


    // $ANTLR start "rule__Capability__Group_7__0"
    // InternalToscaDsl.g:7281:1: rule__Capability__Group_7__0 : rule__Capability__Group_7__0__Impl rule__Capability__Group_7__1 ;
    public final void rule__Capability__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7285:1: ( rule__Capability__Group_7__0__Impl rule__Capability__Group_7__1 )
            // InternalToscaDsl.g:7286:2: rule__Capability__Group_7__0__Impl rule__Capability__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__Capability__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_7__0"


    // $ANTLR start "rule__Capability__Group_7__0__Impl"
    // InternalToscaDsl.g:7293:1: rule__Capability__Group_7__0__Impl : ( ',\\n\"attributes\" :' ) ;
    public final void rule__Capability__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7297:1: ( ( ',\\n\"attributes\" :' ) )
            // InternalToscaDsl.g:7298:1: ( ',\\n\"attributes\" :' )
            {
            // InternalToscaDsl.g:7298:1: ( ',\\n\"attributes\" :' )
            // InternalToscaDsl.g:7299:2: ',\\n\"attributes\" :'
            {
             before(grammarAccess.getCapabilityAccess().getAttributesKeyword_7_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getAttributesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_7__0__Impl"


    // $ANTLR start "rule__Capability__Group_7__1"
    // InternalToscaDsl.g:7308:1: rule__Capability__Group_7__1 : rule__Capability__Group_7__1__Impl rule__Capability__Group_7__2 ;
    public final void rule__Capability__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7312:1: ( rule__Capability__Group_7__1__Impl rule__Capability__Group_7__2 )
            // InternalToscaDsl.g:7313:2: rule__Capability__Group_7__1__Impl rule__Capability__Group_7__2
            {
            pushFollow(FOLLOW_4);
            rule__Capability__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_7__1"


    // $ANTLR start "rule__Capability__Group_7__1__Impl"
    // InternalToscaDsl.g:7320:1: rule__Capability__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Capability__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7324:1: ( ( '{' ) )
            // InternalToscaDsl.g:7325:1: ( '{' )
            {
            // InternalToscaDsl.g:7325:1: ( '{' )
            // InternalToscaDsl.g:7326:2: '{'
            {
             before(grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_7__1__Impl"


    // $ANTLR start "rule__Capability__Group_7__2"
    // InternalToscaDsl.g:7335:1: rule__Capability__Group_7__2 : rule__Capability__Group_7__2__Impl rule__Capability__Group_7__3 ;
    public final void rule__Capability__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7339:1: ( rule__Capability__Group_7__2__Impl rule__Capability__Group_7__3 )
            // InternalToscaDsl.g:7340:2: rule__Capability__Group_7__2__Impl rule__Capability__Group_7__3
            {
            pushFollow(FOLLOW_10);
            rule__Capability__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_7__2"


    // $ANTLR start "rule__Capability__Group_7__2__Impl"
    // InternalToscaDsl.g:7347:1: rule__Capability__Group_7__2__Impl : ( ( rule__Capability__AttributesAssignment_7_2 ) ) ;
    public final void rule__Capability__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7351:1: ( ( ( rule__Capability__AttributesAssignment_7_2 ) ) )
            // InternalToscaDsl.g:7352:1: ( ( rule__Capability__AttributesAssignment_7_2 ) )
            {
            // InternalToscaDsl.g:7352:1: ( ( rule__Capability__AttributesAssignment_7_2 ) )
            // InternalToscaDsl.g:7353:2: ( rule__Capability__AttributesAssignment_7_2 )
            {
             before(grammarAccess.getCapabilityAccess().getAttributesAssignment_7_2()); 
            // InternalToscaDsl.g:7354:2: ( rule__Capability__AttributesAssignment_7_2 )
            // InternalToscaDsl.g:7354:3: rule__Capability__AttributesAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Capability__AttributesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityAccess().getAttributesAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_7__2__Impl"


    // $ANTLR start "rule__Capability__Group_7__3"
    // InternalToscaDsl.g:7362:1: rule__Capability__Group_7__3 : rule__Capability__Group_7__3__Impl rule__Capability__Group_7__4 ;
    public final void rule__Capability__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7366:1: ( rule__Capability__Group_7__3__Impl rule__Capability__Group_7__4 )
            // InternalToscaDsl.g:7367:2: rule__Capability__Group_7__3__Impl rule__Capability__Group_7__4
            {
            pushFollow(FOLLOW_10);
            rule__Capability__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_7__3"


    // $ANTLR start "rule__Capability__Group_7__3__Impl"
    // InternalToscaDsl.g:7374:1: rule__Capability__Group_7__3__Impl : ( ( rule__Capability__Group_7_3__0 )* ) ;
    public final void rule__Capability__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7378:1: ( ( ( rule__Capability__Group_7_3__0 )* ) )
            // InternalToscaDsl.g:7379:1: ( ( rule__Capability__Group_7_3__0 )* )
            {
            // InternalToscaDsl.g:7379:1: ( ( rule__Capability__Group_7_3__0 )* )
            // InternalToscaDsl.g:7380:2: ( rule__Capability__Group_7_3__0 )*
            {
             before(grammarAccess.getCapabilityAccess().getGroup_7_3()); 
            // InternalToscaDsl.g:7381:2: ( rule__Capability__Group_7_3__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==18) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalToscaDsl.g:7381:3: rule__Capability__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Capability__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getCapabilityAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_7__3__Impl"


    // $ANTLR start "rule__Capability__Group_7__4"
    // InternalToscaDsl.g:7389:1: rule__Capability__Group_7__4 : rule__Capability__Group_7__4__Impl ;
    public final void rule__Capability__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7393:1: ( rule__Capability__Group_7__4__Impl )
            // InternalToscaDsl.g:7394:2: rule__Capability__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Capability__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_7__4"


    // $ANTLR start "rule__Capability__Group_7__4__Impl"
    // InternalToscaDsl.g:7400:1: rule__Capability__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Capability__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7404:1: ( ( '}' ) )
            // InternalToscaDsl.g:7405:1: ( '}' )
            {
            // InternalToscaDsl.g:7405:1: ( '}' )
            // InternalToscaDsl.g:7406:2: '}'
            {
             before(grammarAccess.getCapabilityAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_7__4__Impl"


    // $ANTLR start "rule__Capability__Group_7_3__0"
    // InternalToscaDsl.g:7416:1: rule__Capability__Group_7_3__0 : rule__Capability__Group_7_3__0__Impl rule__Capability__Group_7_3__1 ;
    public final void rule__Capability__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7420:1: ( rule__Capability__Group_7_3__0__Impl rule__Capability__Group_7_3__1 )
            // InternalToscaDsl.g:7421:2: rule__Capability__Group_7_3__0__Impl rule__Capability__Group_7_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Capability__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_7_3__0"


    // $ANTLR start "rule__Capability__Group_7_3__0__Impl"
    // InternalToscaDsl.g:7428:1: rule__Capability__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Capability__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7432:1: ( ( ',' ) )
            // InternalToscaDsl.g:7433:1: ( ',' )
            {
            // InternalToscaDsl.g:7433:1: ( ',' )
            // InternalToscaDsl.g:7434:2: ','
            {
             before(grammarAccess.getCapabilityAccess().getCommaKeyword_7_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_7_3__0__Impl"


    // $ANTLR start "rule__Capability__Group_7_3__1"
    // InternalToscaDsl.g:7443:1: rule__Capability__Group_7_3__1 : rule__Capability__Group_7_3__1__Impl ;
    public final void rule__Capability__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7447:1: ( rule__Capability__Group_7_3__1__Impl )
            // InternalToscaDsl.g:7448:2: rule__Capability__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Capability__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_7_3__1"


    // $ANTLR start "rule__Capability__Group_7_3__1__Impl"
    // InternalToscaDsl.g:7454:1: rule__Capability__Group_7_3__1__Impl : ( ( rule__Capability__AttributesAssignment_7_3_1 ) ) ;
    public final void rule__Capability__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7458:1: ( ( ( rule__Capability__AttributesAssignment_7_3_1 ) ) )
            // InternalToscaDsl.g:7459:1: ( ( rule__Capability__AttributesAssignment_7_3_1 ) )
            {
            // InternalToscaDsl.g:7459:1: ( ( rule__Capability__AttributesAssignment_7_3_1 ) )
            // InternalToscaDsl.g:7460:2: ( rule__Capability__AttributesAssignment_7_3_1 )
            {
             before(grammarAccess.getCapabilityAccess().getAttributesAssignment_7_3_1()); 
            // InternalToscaDsl.g:7461:2: ( rule__Capability__AttributesAssignment_7_3_1 )
            // InternalToscaDsl.g:7461:3: rule__Capability__AttributesAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Capability__AttributesAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityAccess().getAttributesAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group_7_3__1__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // InternalToscaDsl.g:7470:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7474:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalToscaDsl.g:7475:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // InternalToscaDsl.g:7482:1: rule__Operation__Group__0__Impl : ( () ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7486:1: ( ( () ) )
            // InternalToscaDsl.g:7487:1: ( () )
            {
            // InternalToscaDsl.g:7487:1: ( () )
            // InternalToscaDsl.g:7488:2: ()
            {
             before(grammarAccess.getOperationAccess().getOperationAction_0()); 
            // InternalToscaDsl.g:7489:2: ()
            // InternalToscaDsl.g:7489:3: 
            {
            }

             after(grammarAccess.getOperationAccess().getOperationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // InternalToscaDsl.g:7497:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7501:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalToscaDsl.g:7502:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // InternalToscaDsl.g:7509:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__Operation_nameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7513:1: ( ( ( rule__Operation__Operation_nameAssignment_1 ) ) )
            // InternalToscaDsl.g:7514:1: ( ( rule__Operation__Operation_nameAssignment_1 ) )
            {
            // InternalToscaDsl.g:7514:1: ( ( rule__Operation__Operation_nameAssignment_1 ) )
            // InternalToscaDsl.g:7515:2: ( rule__Operation__Operation_nameAssignment_1 )
            {
             before(grammarAccess.getOperationAccess().getOperation_nameAssignment_1()); 
            // InternalToscaDsl.g:7516:2: ( rule__Operation__Operation_nameAssignment_1 )
            // InternalToscaDsl.g:7516:3: rule__Operation__Operation_nameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Operation_nameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getOperation_nameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // InternalToscaDsl.g:7524:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7528:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalToscaDsl.g:7529:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // InternalToscaDsl.g:7536:1: rule__Operation__Group__2__Impl : ( ':' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7540:1: ( ( ':' ) )
            // InternalToscaDsl.g:7541:1: ( ':' )
            {
            // InternalToscaDsl.g:7541:1: ( ':' )
            // InternalToscaDsl.g:7542:2: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // InternalToscaDsl.g:7551:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7555:1: ( rule__Operation__Group__3__Impl )
            // InternalToscaDsl.g:7556:2: rule__Operation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // InternalToscaDsl.g:7562:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__PrimaryAssignment_3 ) ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7566:1: ( ( ( rule__Operation__PrimaryAssignment_3 ) ) )
            // InternalToscaDsl.g:7567:1: ( ( rule__Operation__PrimaryAssignment_3 ) )
            {
            // InternalToscaDsl.g:7567:1: ( ( rule__Operation__PrimaryAssignment_3 ) )
            // InternalToscaDsl.g:7568:2: ( rule__Operation__PrimaryAssignment_3 )
            {
             before(grammarAccess.getOperationAccess().getPrimaryAssignment_3()); 
            // InternalToscaDsl.g:7569:2: ( rule__Operation__PrimaryAssignment_3 )
            // InternalToscaDsl.g:7569:3: rule__Operation__PrimaryAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Operation__PrimaryAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getPrimaryAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__TopologyTemplate__Tosca_definitions_versionAssignment_2"
    // InternalToscaDsl.g:7578:1: rule__TopologyTemplate__Tosca_definitions_versionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TopologyTemplate__Tosca_definitions_versionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7582:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:7583:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:7583:2: ( RULE_STRING )
            // InternalToscaDsl.g:7584:3: RULE_STRING
            {
             before(grammarAccess.getTopologyTemplateAccess().getTosca_definitions_versionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getTosca_definitions_versionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__Tosca_definitions_versionAssignment_2"


    // $ANTLR start "rule__TopologyTemplate__DescriptionAssignment_3_1"
    // InternalToscaDsl.g:7593:1: rule__TopologyTemplate__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__TopologyTemplate__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7597:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:7598:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:7598:2: ( RULE_STRING )
            // InternalToscaDsl.g:7599:3: RULE_STRING
            {
             before(grammarAccess.getTopologyTemplateAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTopologyTemplateAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__DescriptionAssignment_3_1"


    // $ANTLR start "rule__TopologyTemplate__ImportsAssignment_4_2"
    // InternalToscaDsl.g:7608:1: rule__TopologyTemplate__ImportsAssignment_4_2 : ( ruleImport ) ;
    public final void rule__TopologyTemplate__ImportsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7612:1: ( ( ruleImport ) )
            // InternalToscaDsl.g:7613:2: ( ruleImport )
            {
            // InternalToscaDsl.g:7613:2: ( ruleImport )
            // InternalToscaDsl.g:7614:3: ruleImport
            {
             before(grammarAccess.getTopologyTemplateAccess().getImportsImportParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getTopologyTemplateAccess().getImportsImportParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__ImportsAssignment_4_2"


    // $ANTLR start "rule__TopologyTemplate__ImportsAssignment_4_3_1"
    // InternalToscaDsl.g:7623:1: rule__TopologyTemplate__ImportsAssignment_4_3_1 : ( ruleImport ) ;
    public final void rule__TopologyTemplate__ImportsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7627:1: ( ( ruleImport ) )
            // InternalToscaDsl.g:7628:2: ( ruleImport )
            {
            // InternalToscaDsl.g:7628:2: ( ruleImport )
            // InternalToscaDsl.g:7629:3: ruleImport
            {
             before(grammarAccess.getTopologyTemplateAccess().getImportsImportParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getTopologyTemplateAccess().getImportsImportParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__ImportsAssignment_4_3_1"


    // $ANTLR start "rule__TopologyTemplate__OutputsAssignment_5_2"
    // InternalToscaDsl.g:7638:1: rule__TopologyTemplate__OutputsAssignment_5_2 : ( ruleParameter ) ;
    public final void rule__TopologyTemplate__OutputsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7642:1: ( ( ruleParameter ) )
            // InternalToscaDsl.g:7643:2: ( ruleParameter )
            {
            // InternalToscaDsl.g:7643:2: ( ruleParameter )
            // InternalToscaDsl.g:7644:3: ruleParameter
            {
             before(grammarAccess.getTopologyTemplateAccess().getOutputsParameterParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getTopologyTemplateAccess().getOutputsParameterParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__OutputsAssignment_5_2"


    // $ANTLR start "rule__TopologyTemplate__OutputsAssignment_5_3_1"
    // InternalToscaDsl.g:7653:1: rule__TopologyTemplate__OutputsAssignment_5_3_1 : ( ruleParameter ) ;
    public final void rule__TopologyTemplate__OutputsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7657:1: ( ( ruleParameter ) )
            // InternalToscaDsl.g:7658:2: ( ruleParameter )
            {
            // InternalToscaDsl.g:7658:2: ( ruleParameter )
            // InternalToscaDsl.g:7659:3: ruleParameter
            {
             before(grammarAccess.getTopologyTemplateAccess().getOutputsParameterParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getTopologyTemplateAccess().getOutputsParameterParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__OutputsAssignment_5_3_1"


    // $ANTLR start "rule__TopologyTemplate__InputsAssignment_6_2"
    // InternalToscaDsl.g:7668:1: rule__TopologyTemplate__InputsAssignment_6_2 : ( ruleParameter ) ;
    public final void rule__TopologyTemplate__InputsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7672:1: ( ( ruleParameter ) )
            // InternalToscaDsl.g:7673:2: ( ruleParameter )
            {
            // InternalToscaDsl.g:7673:2: ( ruleParameter )
            // InternalToscaDsl.g:7674:3: ruleParameter
            {
             before(grammarAccess.getTopologyTemplateAccess().getInputsParameterParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getTopologyTemplateAccess().getInputsParameterParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__InputsAssignment_6_2"


    // $ANTLR start "rule__TopologyTemplate__InputsAssignment_6_3_1"
    // InternalToscaDsl.g:7683:1: rule__TopologyTemplate__InputsAssignment_6_3_1 : ( ruleParameter ) ;
    public final void rule__TopologyTemplate__InputsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7687:1: ( ( ruleParameter ) )
            // InternalToscaDsl.g:7688:2: ( ruleParameter )
            {
            // InternalToscaDsl.g:7688:2: ( ruleParameter )
            // InternalToscaDsl.g:7689:3: ruleParameter
            {
             before(grammarAccess.getTopologyTemplateAccess().getInputsParameterParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getTopologyTemplateAccess().getInputsParameterParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__InputsAssignment_6_3_1"


    // $ANTLR start "rule__TopologyTemplate__NodeTemplatesAssignment_7_2"
    // InternalToscaDsl.g:7698:1: rule__TopologyTemplate__NodeTemplatesAssignment_7_2 : ( ruleNodeTemplate ) ;
    public final void rule__TopologyTemplate__NodeTemplatesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7702:1: ( ( ruleNodeTemplate ) )
            // InternalToscaDsl.g:7703:2: ( ruleNodeTemplate )
            {
            // InternalToscaDsl.g:7703:2: ( ruleNodeTemplate )
            // InternalToscaDsl.g:7704:3: ruleNodeTemplate
            {
             before(grammarAccess.getTopologyTemplateAccess().getNodeTemplatesNodeTemplateParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeTemplate();

            state._fsp--;

             after(grammarAccess.getTopologyTemplateAccess().getNodeTemplatesNodeTemplateParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__NodeTemplatesAssignment_7_2"


    // $ANTLR start "rule__TopologyTemplate__NodeTemplatesAssignment_7_3_1"
    // InternalToscaDsl.g:7713:1: rule__TopologyTemplate__NodeTemplatesAssignment_7_3_1 : ( ruleNodeTemplate ) ;
    public final void rule__TopologyTemplate__NodeTemplatesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7717:1: ( ( ruleNodeTemplate ) )
            // InternalToscaDsl.g:7718:2: ( ruleNodeTemplate )
            {
            // InternalToscaDsl.g:7718:2: ( ruleNodeTemplate )
            // InternalToscaDsl.g:7719:3: ruleNodeTemplate
            {
             before(grammarAccess.getTopologyTemplateAccess().getNodeTemplatesNodeTemplateParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeTemplate();

            state._fsp--;

             after(grammarAccess.getTopologyTemplateAccess().getNodeTemplatesNodeTemplateParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__NodeTemplatesAssignment_7_3_1"


    // $ANTLR start "rule__TopologyTemplate__RealtionshipsAssignment_8_2"
    // InternalToscaDsl.g:7728:1: rule__TopologyTemplate__RealtionshipsAssignment_8_2 : ( ruleRelationship ) ;
    public final void rule__TopologyTemplate__RealtionshipsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7732:1: ( ( ruleRelationship ) )
            // InternalToscaDsl.g:7733:2: ( ruleRelationship )
            {
            // InternalToscaDsl.g:7733:2: ( ruleRelationship )
            // InternalToscaDsl.g:7734:3: ruleRelationship
            {
             before(grammarAccess.getTopologyTemplateAccess().getRealtionshipsRelationshipParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getTopologyTemplateAccess().getRealtionshipsRelationshipParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__RealtionshipsAssignment_8_2"


    // $ANTLR start "rule__TopologyTemplate__RealtionshipsAssignment_8_3_1"
    // InternalToscaDsl.g:7743:1: rule__TopologyTemplate__RealtionshipsAssignment_8_3_1 : ( ruleRelationship ) ;
    public final void rule__TopologyTemplate__RealtionshipsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7747:1: ( ( ruleRelationship ) )
            // InternalToscaDsl.g:7748:2: ( ruleRelationship )
            {
            // InternalToscaDsl.g:7748:2: ( ruleRelationship )
            // InternalToscaDsl.g:7749:3: ruleRelationship
            {
             before(grammarAccess.getTopologyTemplateAccess().getRealtionshipsRelationshipParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getTopologyTemplateAccess().getRealtionshipsRelationshipParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__RealtionshipsAssignment_8_3_1"


    // $ANTLR start "rule__TopologyTemplate__GroupsAssignment_9_2"
    // InternalToscaDsl.g:7758:1: rule__TopologyTemplate__GroupsAssignment_9_2 : ( ruleGroup ) ;
    public final void rule__TopologyTemplate__GroupsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7762:1: ( ( ruleGroup ) )
            // InternalToscaDsl.g:7763:2: ( ruleGroup )
            {
            // InternalToscaDsl.g:7763:2: ( ruleGroup )
            // InternalToscaDsl.g:7764:3: ruleGroup
            {
             before(grammarAccess.getTopologyTemplateAccess().getGroupsGroupParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getTopologyTemplateAccess().getGroupsGroupParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__GroupsAssignment_9_2"


    // $ANTLR start "rule__TopologyTemplate__GroupsAssignment_9_3_1"
    // InternalToscaDsl.g:7773:1: rule__TopologyTemplate__GroupsAssignment_9_3_1 : ( ruleGroup ) ;
    public final void rule__TopologyTemplate__GroupsAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7777:1: ( ( ruleGroup ) )
            // InternalToscaDsl.g:7778:2: ( ruleGroup )
            {
            // InternalToscaDsl.g:7778:2: ( ruleGroup )
            // InternalToscaDsl.g:7779:3: ruleGroup
            {
             before(grammarAccess.getTopologyTemplateAccess().getGroupsGroupParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getTopologyTemplateAccess().getGroupsGroupParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__GroupsAssignment_9_3_1"


    // $ANTLR start "rule__TopologyTemplate__PoliciesAssignment_10_2"
    // InternalToscaDsl.g:7788:1: rule__TopologyTemplate__PoliciesAssignment_10_2 : ( rulePolicy ) ;
    public final void rule__TopologyTemplate__PoliciesAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7792:1: ( ( rulePolicy ) )
            // InternalToscaDsl.g:7793:2: ( rulePolicy )
            {
            // InternalToscaDsl.g:7793:2: ( rulePolicy )
            // InternalToscaDsl.g:7794:3: rulePolicy
            {
             before(grammarAccess.getTopologyTemplateAccess().getPoliciesPolicyParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getTopologyTemplateAccess().getPoliciesPolicyParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__PoliciesAssignment_10_2"


    // $ANTLR start "rule__TopologyTemplate__PoliciesAssignment_10_3_1"
    // InternalToscaDsl.g:7803:1: rule__TopologyTemplate__PoliciesAssignment_10_3_1 : ( rulePolicy ) ;
    public final void rule__TopologyTemplate__PoliciesAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7807:1: ( ( rulePolicy ) )
            // InternalToscaDsl.g:7808:2: ( rulePolicy )
            {
            // InternalToscaDsl.g:7808:2: ( rulePolicy )
            // InternalToscaDsl.g:7809:3: rulePolicy
            {
             before(grammarAccess.getTopologyTemplateAccess().getPoliciesPolicyParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getTopologyTemplateAccess().getPoliciesPolicyParserRuleCall_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopologyTemplate__PoliciesAssignment_10_3_1"


    // $ANTLR start "rule__Import__FileAssignment_1"
    // InternalToscaDsl.g:7818:1: rule__Import__FileAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__FileAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7822:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:7823:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:7823:2: ( RULE_STRING )
            // InternalToscaDsl.g:7824:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getFileSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getFileSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__FileAssignment_1"


    // $ANTLR start "rule__Parameter__Parameter_nameAssignment_1"
    // InternalToscaDsl.g:7833:1: rule__Parameter__Parameter_nameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Parameter__Parameter_nameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7837:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:7838:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:7838:2: ( RULE_STRING )
            // InternalToscaDsl.g:7839:3: RULE_STRING
            {
             before(grammarAccess.getParameterAccess().getParameter_nameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameter_nameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Parameter_nameAssignment_1"


    // $ANTLR start "rule__NodeTemplate__Node_template_nameAssignment_1"
    // InternalToscaDsl.g:7848:1: rule__NodeTemplate__Node_template_nameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NodeTemplate__Node_template_nameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7852:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:7853:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:7853:2: ( RULE_STRING )
            // InternalToscaDsl.g:7854:3: RULE_STRING
            {
             before(grammarAccess.getNodeTemplateAccess().getNode_template_nameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getNode_template_nameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__Node_template_nameAssignment_1"


    // $ANTLR start "rule__NodeTemplate__TypeAssignment_5"
    // InternalToscaDsl.g:7863:1: rule__NodeTemplate__TypeAssignment_5 : ( RULE_STRING ) ;
    public final void rule__NodeTemplate__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7867:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:7868:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:7868:2: ( RULE_STRING )
            // InternalToscaDsl.g:7869:3: RULE_STRING
            {
             before(grammarAccess.getNodeTemplateAccess().getTypeSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getTypeSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__TypeAssignment_5"


    // $ANTLR start "rule__NodeTemplate__DescriptionAssignment_6_1"
    // InternalToscaDsl.g:7878:1: rule__NodeTemplate__DescriptionAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__NodeTemplate__DescriptionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7882:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:7883:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:7883:2: ( RULE_STRING )
            // InternalToscaDsl.g:7884:3: RULE_STRING
            {
             before(grammarAccess.getNodeTemplateAccess().getDescriptionSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNodeTemplateAccess().getDescriptionSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__DescriptionAssignment_6_1"


    // $ANTLR start "rule__NodeTemplate__RelationshipsAssignment_7_2"
    // InternalToscaDsl.g:7893:1: rule__NodeTemplate__RelationshipsAssignment_7_2 : ( ruleRelationship ) ;
    public final void rule__NodeTemplate__RelationshipsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7897:1: ( ( ruleRelationship ) )
            // InternalToscaDsl.g:7898:2: ( ruleRelationship )
            {
            // InternalToscaDsl.g:7898:2: ( ruleRelationship )
            // InternalToscaDsl.g:7899:3: ruleRelationship
            {
             before(grammarAccess.getNodeTemplateAccess().getRelationshipsRelationshipParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getNodeTemplateAccess().getRelationshipsRelationshipParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__RelationshipsAssignment_7_2"


    // $ANTLR start "rule__NodeTemplate__RelationshipsAssignment_7_3_1"
    // InternalToscaDsl.g:7908:1: rule__NodeTemplate__RelationshipsAssignment_7_3_1 : ( ruleRelationship ) ;
    public final void rule__NodeTemplate__RelationshipsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7912:1: ( ( ruleRelationship ) )
            // InternalToscaDsl.g:7913:2: ( ruleRelationship )
            {
            // InternalToscaDsl.g:7913:2: ( ruleRelationship )
            // InternalToscaDsl.g:7914:3: ruleRelationship
            {
             before(grammarAccess.getNodeTemplateAccess().getRelationshipsRelationshipParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getNodeTemplateAccess().getRelationshipsRelationshipParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__RelationshipsAssignment_7_3_1"


    // $ANTLR start "rule__NodeTemplate__InterfacesAssignment_8_2"
    // InternalToscaDsl.g:7923:1: rule__NodeTemplate__InterfacesAssignment_8_2 : ( ruleInterface ) ;
    public final void rule__NodeTemplate__InterfacesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7927:1: ( ( ruleInterface ) )
            // InternalToscaDsl.g:7928:2: ( ruleInterface )
            {
            // InternalToscaDsl.g:7928:2: ( ruleInterface )
            // InternalToscaDsl.g:7929:3: ruleInterface
            {
             before(grammarAccess.getNodeTemplateAccess().getInterfacesInterfaceParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getNodeTemplateAccess().getInterfacesInterfaceParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__InterfacesAssignment_8_2"


    // $ANTLR start "rule__NodeTemplate__InterfacesAssignment_8_3_1"
    // InternalToscaDsl.g:7938:1: rule__NodeTemplate__InterfacesAssignment_8_3_1 : ( ruleInterface ) ;
    public final void rule__NodeTemplate__InterfacesAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7942:1: ( ( ruleInterface ) )
            // InternalToscaDsl.g:7943:2: ( ruleInterface )
            {
            // InternalToscaDsl.g:7943:2: ( ruleInterface )
            // InternalToscaDsl.g:7944:3: ruleInterface
            {
             before(grammarAccess.getNodeTemplateAccess().getInterfacesInterfaceParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getNodeTemplateAccess().getInterfacesInterfaceParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__InterfacesAssignment_8_3_1"


    // $ANTLR start "rule__NodeTemplate__PropertiesAssignment_9_2"
    // InternalToscaDsl.g:7953:1: rule__NodeTemplate__PropertiesAssignment_9_2 : ( ruleProperty ) ;
    public final void rule__NodeTemplate__PropertiesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7957:1: ( ( ruleProperty ) )
            // InternalToscaDsl.g:7958:2: ( ruleProperty )
            {
            // InternalToscaDsl.g:7958:2: ( ruleProperty )
            // InternalToscaDsl.g:7959:3: ruleProperty
            {
             before(grammarAccess.getNodeTemplateAccess().getPropertiesPropertyParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getNodeTemplateAccess().getPropertiesPropertyParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__PropertiesAssignment_9_2"


    // $ANTLR start "rule__NodeTemplate__PropertiesAssignment_9_3_1"
    // InternalToscaDsl.g:7968:1: rule__NodeTemplate__PropertiesAssignment_9_3_1 : ( ruleProperty ) ;
    public final void rule__NodeTemplate__PropertiesAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7972:1: ( ( ruleProperty ) )
            // InternalToscaDsl.g:7973:2: ( ruleProperty )
            {
            // InternalToscaDsl.g:7973:2: ( ruleProperty )
            // InternalToscaDsl.g:7974:3: ruleProperty
            {
             before(grammarAccess.getNodeTemplateAccess().getPropertiesPropertyParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getNodeTemplateAccess().getPropertiesPropertyParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__PropertiesAssignment_9_3_1"


    // $ANTLR start "rule__NodeTemplate__AttributesAssignment_10_2"
    // InternalToscaDsl.g:7983:1: rule__NodeTemplate__AttributesAssignment_10_2 : ( ruleAttribute ) ;
    public final void rule__NodeTemplate__AttributesAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:7987:1: ( ( ruleAttribute ) )
            // InternalToscaDsl.g:7988:2: ( ruleAttribute )
            {
            // InternalToscaDsl.g:7988:2: ( ruleAttribute )
            // InternalToscaDsl.g:7989:3: ruleAttribute
            {
             before(grammarAccess.getNodeTemplateAccess().getAttributesAttributeParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getNodeTemplateAccess().getAttributesAttributeParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__AttributesAssignment_10_2"


    // $ANTLR start "rule__NodeTemplate__AttributesAssignment_10_3_1"
    // InternalToscaDsl.g:7998:1: rule__NodeTemplate__AttributesAssignment_10_3_1 : ( ruleAttribute ) ;
    public final void rule__NodeTemplate__AttributesAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8002:1: ( ( ruleAttribute ) )
            // InternalToscaDsl.g:8003:2: ( ruleAttribute )
            {
            // InternalToscaDsl.g:8003:2: ( ruleAttribute )
            // InternalToscaDsl.g:8004:3: ruleAttribute
            {
             before(grammarAccess.getNodeTemplateAccess().getAttributesAttributeParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getNodeTemplateAccess().getAttributesAttributeParserRuleCall_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__AttributesAssignment_10_3_1"


    // $ANTLR start "rule__NodeTemplate__RequirementsAssignment_11_2"
    // InternalToscaDsl.g:8013:1: rule__NodeTemplate__RequirementsAssignment_11_2 : ( ruleRequirement ) ;
    public final void rule__NodeTemplate__RequirementsAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8017:1: ( ( ruleRequirement ) )
            // InternalToscaDsl.g:8018:2: ( ruleRequirement )
            {
            // InternalToscaDsl.g:8018:2: ( ruleRequirement )
            // InternalToscaDsl.g:8019:3: ruleRequirement
            {
             before(grammarAccess.getNodeTemplateAccess().getRequirementsRequirementParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequirement();

            state._fsp--;

             after(grammarAccess.getNodeTemplateAccess().getRequirementsRequirementParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__RequirementsAssignment_11_2"


    // $ANTLR start "rule__NodeTemplate__RequirementsAssignment_11_3_1"
    // InternalToscaDsl.g:8028:1: rule__NodeTemplate__RequirementsAssignment_11_3_1 : ( ruleRequirement ) ;
    public final void rule__NodeTemplate__RequirementsAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8032:1: ( ( ruleRequirement ) )
            // InternalToscaDsl.g:8033:2: ( ruleRequirement )
            {
            // InternalToscaDsl.g:8033:2: ( ruleRequirement )
            // InternalToscaDsl.g:8034:3: ruleRequirement
            {
             before(grammarAccess.getNodeTemplateAccess().getRequirementsRequirementParserRuleCall_11_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequirement();

            state._fsp--;

             after(grammarAccess.getNodeTemplateAccess().getRequirementsRequirementParserRuleCall_11_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__RequirementsAssignment_11_3_1"


    // $ANTLR start "rule__NodeTemplate__CapabilitiesAssignment_12_2"
    // InternalToscaDsl.g:8043:1: rule__NodeTemplate__CapabilitiesAssignment_12_2 : ( ruleCapability ) ;
    public final void rule__NodeTemplate__CapabilitiesAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8047:1: ( ( ruleCapability ) )
            // InternalToscaDsl.g:8048:2: ( ruleCapability )
            {
            // InternalToscaDsl.g:8048:2: ( ruleCapability )
            // InternalToscaDsl.g:8049:3: ruleCapability
            {
             before(grammarAccess.getNodeTemplateAccess().getCapabilitiesCapabilityParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCapability();

            state._fsp--;

             after(grammarAccess.getNodeTemplateAccess().getCapabilitiesCapabilityParserRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__CapabilitiesAssignment_12_2"


    // $ANTLR start "rule__NodeTemplate__CapabilitiesAssignment_12_3_1"
    // InternalToscaDsl.g:8058:1: rule__NodeTemplate__CapabilitiesAssignment_12_3_1 : ( ruleCapability ) ;
    public final void rule__NodeTemplate__CapabilitiesAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8062:1: ( ( ruleCapability ) )
            // InternalToscaDsl.g:8063:2: ( ruleCapability )
            {
            // InternalToscaDsl.g:8063:2: ( ruleCapability )
            // InternalToscaDsl.g:8064:3: ruleCapability
            {
             before(grammarAccess.getNodeTemplateAccess().getCapabilitiesCapabilityParserRuleCall_12_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCapability();

            state._fsp--;

             after(grammarAccess.getNodeTemplateAccess().getCapabilitiesCapabilityParserRuleCall_12_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTemplate__CapabilitiesAssignment_12_3_1"


    // $ANTLR start "rule__Relationship__TypeAssignment_3"
    // InternalToscaDsl.g:8073:1: rule__Relationship__TypeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Relationship__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8077:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:8078:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:8078:2: ( RULE_STRING )
            // InternalToscaDsl.g:8079:3: RULE_STRING
            {
             before(grammarAccess.getRelationshipAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getTypeSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__TypeAssignment_3"


    // $ANTLR start "rule__Relationship__TargetAssignment_4_1"
    // InternalToscaDsl.g:8088:1: rule__Relationship__TargetAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Relationship__TargetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8092:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:8093:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:8093:2: ( RULE_STRING )
            // InternalToscaDsl.g:8094:3: RULE_STRING
            {
             before(grammarAccess.getRelationshipAccess().getTargetSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getTargetSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__TargetAssignment_4_1"


    // $ANTLR start "rule__Relationship__InterfacesAssignment_5_2"
    // InternalToscaDsl.g:8103:1: rule__Relationship__InterfacesAssignment_5_2 : ( ruleInterface ) ;
    public final void rule__Relationship__InterfacesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8107:1: ( ( ruleInterface ) )
            // InternalToscaDsl.g:8108:2: ( ruleInterface )
            {
            // InternalToscaDsl.g:8108:2: ( ruleInterface )
            // InternalToscaDsl.g:8109:3: ruleInterface
            {
             before(grammarAccess.getRelationshipAccess().getInterfacesInterfaceParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getInterfacesInterfaceParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__InterfacesAssignment_5_2"


    // $ANTLR start "rule__Relationship__InterfacesAssignment_5_3_1"
    // InternalToscaDsl.g:8118:1: rule__Relationship__InterfacesAssignment_5_3_1 : ( ruleInterface ) ;
    public final void rule__Relationship__InterfacesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8122:1: ( ( ruleInterface ) )
            // InternalToscaDsl.g:8123:2: ( ruleInterface )
            {
            // InternalToscaDsl.g:8123:2: ( ruleInterface )
            // InternalToscaDsl.g:8124:3: ruleInterface
            {
             before(grammarAccess.getRelationshipAccess().getInterfacesInterfaceParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getInterfacesInterfaceParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__InterfacesAssignment_5_3_1"


    // $ANTLR start "rule__Relationship__PropertiesAssignment_6_2"
    // InternalToscaDsl.g:8133:1: rule__Relationship__PropertiesAssignment_6_2 : ( ruleProperty ) ;
    public final void rule__Relationship__PropertiesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8137:1: ( ( ruleProperty ) )
            // InternalToscaDsl.g:8138:2: ( ruleProperty )
            {
            // InternalToscaDsl.g:8138:2: ( ruleProperty )
            // InternalToscaDsl.g:8139:3: ruleProperty
            {
             before(grammarAccess.getRelationshipAccess().getPropertiesPropertyParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getPropertiesPropertyParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__PropertiesAssignment_6_2"


    // $ANTLR start "rule__Relationship__PropertiesAssignment_6_3_1"
    // InternalToscaDsl.g:8148:1: rule__Relationship__PropertiesAssignment_6_3_1 : ( ruleProperty ) ;
    public final void rule__Relationship__PropertiesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8152:1: ( ( ruleProperty ) )
            // InternalToscaDsl.g:8153:2: ( ruleProperty )
            {
            // InternalToscaDsl.g:8153:2: ( ruleProperty )
            // InternalToscaDsl.g:8154:3: ruleProperty
            {
             before(grammarAccess.getRelationshipAccess().getPropertiesPropertyParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getPropertiesPropertyParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__PropertiesAssignment_6_3_1"


    // $ANTLR start "rule__Relationship__AttributesAssignment_7_2"
    // InternalToscaDsl.g:8163:1: rule__Relationship__AttributesAssignment_7_2 : ( ruleAttribute ) ;
    public final void rule__Relationship__AttributesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8167:1: ( ( ruleAttribute ) )
            // InternalToscaDsl.g:8168:2: ( ruleAttribute )
            {
            // InternalToscaDsl.g:8168:2: ( ruleAttribute )
            // InternalToscaDsl.g:8169:3: ruleAttribute
            {
             before(grammarAccess.getRelationshipAccess().getAttributesAttributeParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getAttributesAttributeParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__AttributesAssignment_7_2"


    // $ANTLR start "rule__Relationship__AttributesAssignment_7_3_1"
    // InternalToscaDsl.g:8178:1: rule__Relationship__AttributesAssignment_7_3_1 : ( ruleAttribute ) ;
    public final void rule__Relationship__AttributesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8182:1: ( ( ruleAttribute ) )
            // InternalToscaDsl.g:8183:2: ( ruleAttribute )
            {
            // InternalToscaDsl.g:8183:2: ( ruleAttribute )
            // InternalToscaDsl.g:8184:3: ruleAttribute
            {
             before(grammarAccess.getRelationshipAccess().getAttributesAttributeParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getAttributesAttributeParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__AttributesAssignment_7_3_1"


    // $ANTLR start "rule__Relationship__Source_interfacesAssignment_8_2"
    // InternalToscaDsl.g:8193:1: rule__Relationship__Source_interfacesAssignment_8_2 : ( ruleInterface ) ;
    public final void rule__Relationship__Source_interfacesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8197:1: ( ( ruleInterface ) )
            // InternalToscaDsl.g:8198:2: ( ruleInterface )
            {
            // InternalToscaDsl.g:8198:2: ( ruleInterface )
            // InternalToscaDsl.g:8199:3: ruleInterface
            {
             before(grammarAccess.getRelationshipAccess().getSource_interfacesInterfaceParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getSource_interfacesInterfaceParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Source_interfacesAssignment_8_2"


    // $ANTLR start "rule__Relationship__Source_interfacesAssignment_8_3_1"
    // InternalToscaDsl.g:8208:1: rule__Relationship__Source_interfacesAssignment_8_3_1 : ( ruleInterface ) ;
    public final void rule__Relationship__Source_interfacesAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8212:1: ( ( ruleInterface ) )
            // InternalToscaDsl.g:8213:2: ( ruleInterface )
            {
            // InternalToscaDsl.g:8213:2: ( ruleInterface )
            // InternalToscaDsl.g:8214:3: ruleInterface
            {
             before(grammarAccess.getRelationshipAccess().getSource_interfacesInterfaceParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getSource_interfacesInterfaceParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Source_interfacesAssignment_8_3_1"


    // $ANTLR start "rule__Relationship__Target_interfacesAssignment_9_2"
    // InternalToscaDsl.g:8223:1: rule__Relationship__Target_interfacesAssignment_9_2 : ( ruleInterface ) ;
    public final void rule__Relationship__Target_interfacesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8227:1: ( ( ruleInterface ) )
            // InternalToscaDsl.g:8228:2: ( ruleInterface )
            {
            // InternalToscaDsl.g:8228:2: ( ruleInterface )
            // InternalToscaDsl.g:8229:3: ruleInterface
            {
             before(grammarAccess.getRelationshipAccess().getTarget_interfacesInterfaceParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getTarget_interfacesInterfaceParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Target_interfacesAssignment_9_2"


    // $ANTLR start "rule__Relationship__Target_interfacesAssignment_9_3_1"
    // InternalToscaDsl.g:8238:1: rule__Relationship__Target_interfacesAssignment_9_3_1 : ( ruleInterface ) ;
    public final void rule__Relationship__Target_interfacesAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8242:1: ( ( ruleInterface ) )
            // InternalToscaDsl.g:8243:2: ( ruleInterface )
            {
            // InternalToscaDsl.g:8243:2: ( ruleInterface )
            // InternalToscaDsl.g:8244:3: ruleInterface
            {
             before(grammarAccess.getRelationshipAccess().getTarget_interfacesInterfaceParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getTarget_interfacesInterfaceParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Target_interfacesAssignment_9_3_1"


    // $ANTLR start "rule__Group__Group_nameAssignment_1"
    // InternalToscaDsl.g:8253:1: rule__Group__Group_nameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Group__Group_nameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8257:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:8258:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:8258:2: ( RULE_STRING )
            // InternalToscaDsl.g:8259:3: RULE_STRING
            {
             before(grammarAccess.getGroupAccess().getGroup_nameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getGroup_nameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_nameAssignment_1"


    // $ANTLR start "rule__Group__TypeAssignment_5"
    // InternalToscaDsl.g:8268:1: rule__Group__TypeAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Group__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8272:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:8273:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:8273:2: ( RULE_STRING )
            // InternalToscaDsl.g:8274:3: RULE_STRING
            {
             before(grammarAccess.getGroupAccess().getTypeSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getTypeSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__TypeAssignment_5"


    // $ANTLR start "rule__Group__DescriptionAssignment_6_1"
    // InternalToscaDsl.g:8283:1: rule__Group__DescriptionAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Group__DescriptionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8287:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:8288:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:8288:2: ( RULE_STRING )
            // InternalToscaDsl.g:8289:3: RULE_STRING
            {
             before(grammarAccess.getGroupAccess().getDescriptionSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getDescriptionSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__DescriptionAssignment_6_1"


    // $ANTLR start "rule__Group__TargetsAssignment_7_2"
    // InternalToscaDsl.g:8298:1: rule__Group__TargetsAssignment_7_2 : ( ruleEString ) ;
    public final void rule__Group__TargetsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8302:1: ( ( ruleEString ) )
            // InternalToscaDsl.g:8303:2: ( ruleEString )
            {
            // InternalToscaDsl.g:8303:2: ( ruleEString )
            // InternalToscaDsl.g:8304:3: ruleEString
            {
             before(grammarAccess.getGroupAccess().getTargetsEStringParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getTargetsEStringParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__TargetsAssignment_7_2"


    // $ANTLR start "rule__Group__TargetsAssignment_7_3_1"
    // InternalToscaDsl.g:8313:1: rule__Group__TargetsAssignment_7_3_1 : ( RULE_STRING ) ;
    public final void rule__Group__TargetsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8317:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:8318:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:8318:2: ( RULE_STRING )
            // InternalToscaDsl.g:8319:3: RULE_STRING
            {
             before(grammarAccess.getGroupAccess().getTargetsSTRINGTerminalRuleCall_7_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getTargetsSTRINGTerminalRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__TargetsAssignment_7_3_1"


    // $ANTLR start "rule__Group__PropertiesAssignment_8_1"
    // InternalToscaDsl.g:8328:1: rule__Group__PropertiesAssignment_8_1 : ( ruleProperty ) ;
    public final void rule__Group__PropertiesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8332:1: ( ( ruleProperty ) )
            // InternalToscaDsl.g:8333:2: ( ruleProperty )
            {
            // InternalToscaDsl.g:8333:2: ( ruleProperty )
            // InternalToscaDsl.g:8334:3: ruleProperty
            {
             before(grammarAccess.getGroupAccess().getPropertiesPropertyParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getPropertiesPropertyParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__PropertiesAssignment_8_1"


    // $ANTLR start "rule__Group__InterfacesAssignment_9_2"
    // InternalToscaDsl.g:8343:1: rule__Group__InterfacesAssignment_9_2 : ( ruleInterface ) ;
    public final void rule__Group__InterfacesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8347:1: ( ( ruleInterface ) )
            // InternalToscaDsl.g:8348:2: ( ruleInterface )
            {
            // InternalToscaDsl.g:8348:2: ( ruleInterface )
            // InternalToscaDsl.g:8349:3: ruleInterface
            {
             before(grammarAccess.getGroupAccess().getInterfacesInterfaceParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getInterfacesInterfaceParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__InterfacesAssignment_9_2"


    // $ANTLR start "rule__Group__InterfacesAssignment_9_3_1"
    // InternalToscaDsl.g:8358:1: rule__Group__InterfacesAssignment_9_3_1 : ( ruleInterface ) ;
    public final void rule__Group__InterfacesAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8362:1: ( ( ruleInterface ) )
            // InternalToscaDsl.g:8363:2: ( ruleInterface )
            {
            // InternalToscaDsl.g:8363:2: ( ruleInterface )
            // InternalToscaDsl.g:8364:3: ruleInterface
            {
             before(grammarAccess.getGroupAccess().getInterfacesInterfaceParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getInterfacesInterfaceParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__InterfacesAssignment_9_3_1"


    // $ANTLR start "rule__Policy__Policy_nameAssignment_1"
    // InternalToscaDsl.g:8373:1: rule__Policy__Policy_nameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Policy__Policy_nameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8377:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:8378:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:8378:2: ( RULE_STRING )
            // InternalToscaDsl.g:8379:3: RULE_STRING
            {
             before(grammarAccess.getPolicyAccess().getPolicy_nameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getPolicy_nameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Policy_nameAssignment_1"


    // $ANTLR start "rule__Interface__TypeAssignment_1"
    // InternalToscaDsl.g:8388:1: rule__Interface__TypeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Interface__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8392:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:8393:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:8393:2: ( RULE_STRING )
            // InternalToscaDsl.g:8394:3: RULE_STRING
            {
             before(grammarAccess.getInterfaceAccess().getTypeSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getTypeSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__TypeAssignment_1"


    // $ANTLR start "rule__Interface__OperationsAssignment_4_2"
    // InternalToscaDsl.g:8403:1: rule__Interface__OperationsAssignment_4_2 : ( ruleOperation ) ;
    public final void rule__Interface__OperationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8407:1: ( ( ruleOperation ) )
            // InternalToscaDsl.g:8408:2: ( ruleOperation )
            {
            // InternalToscaDsl.g:8408:2: ( ruleOperation )
            // InternalToscaDsl.g:8409:3: ruleOperation
            {
             before(grammarAccess.getInterfaceAccess().getOperationsOperationParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getOperationsOperationParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__OperationsAssignment_4_2"


    // $ANTLR start "rule__Interface__OperationsAssignment_4_3_1"
    // InternalToscaDsl.g:8418:1: rule__Interface__OperationsAssignment_4_3_1 : ( ruleOperation ) ;
    public final void rule__Interface__OperationsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8422:1: ( ( ruleOperation ) )
            // InternalToscaDsl.g:8423:2: ( ruleOperation )
            {
            // InternalToscaDsl.g:8423:2: ( ruleOperation )
            // InternalToscaDsl.g:8424:3: ruleOperation
            {
             before(grammarAccess.getInterfaceAccess().getOperationsOperationParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getOperationsOperationParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__OperationsAssignment_4_3_1"


    // $ANTLR start "rule__Property__Property_nameAssignment_2"
    // InternalToscaDsl.g:8433:1: rule__Property__Property_nameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Property__Property_nameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8437:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:8438:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:8438:2: ( RULE_STRING )
            // InternalToscaDsl.g:8439:3: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getProperty_nameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getProperty_nameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Property_nameAssignment_2"


    // $ANTLR start "rule__Property__ValueAssignment_4"
    // InternalToscaDsl.g:8448:1: rule__Property__ValueAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Property__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8452:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:8453:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:8453:2: ( RULE_STRING )
            // InternalToscaDsl.g:8454:3: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getValueSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getValueSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ValueAssignment_4"


    // $ANTLR start "rule__Attribute__Attribute_nameAssignment_1"
    // InternalToscaDsl.g:8463:1: rule__Attribute__Attribute_nameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Attribute__Attribute_nameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8467:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:8468:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:8468:2: ( RULE_STRING )
            // InternalToscaDsl.g:8469:3: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getAttribute_nameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttribute_nameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Attribute_nameAssignment_1"


    // $ANTLR start "rule__Requirement__Requirement_nameAssignment_0"
    // InternalToscaDsl.g:8478:1: rule__Requirement__Requirement_nameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Requirement__Requirement_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8482:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:8483:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:8483:2: ( RULE_STRING )
            // InternalToscaDsl.g:8484:3: RULE_STRING
            {
             before(grammarAccess.getRequirementAccess().getRequirement_nameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRequirementAccess().getRequirement_nameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Requirement_nameAssignment_0"


    // $ANTLR start "rule__Requirement__CapabiityAssignment_4"
    // InternalToscaDsl.g:8493:1: rule__Requirement__CapabiityAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Requirement__CapabiityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8497:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:8498:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:8498:2: ( RULE_STRING )
            // InternalToscaDsl.g:8499:3: RULE_STRING
            {
             before(grammarAccess.getRequirementAccess().getCapabiitySTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRequirementAccess().getCapabiitySTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__CapabiityAssignment_4"


    // $ANTLR start "rule__Requirement__NodeAssignment_5_1"
    // InternalToscaDsl.g:8508:1: rule__Requirement__NodeAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Requirement__NodeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8512:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:8513:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:8513:2: ( RULE_STRING )
            // InternalToscaDsl.g:8514:3: RULE_STRING
            {
             before(grammarAccess.getRequirementAccess().getNodeSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRequirementAccess().getNodeSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__NodeAssignment_5_1"


    // $ANTLR start "rule__Capability__Capability_nameAssignment_0"
    // InternalToscaDsl.g:8523:1: rule__Capability__Capability_nameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Capability__Capability_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8527:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:8528:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:8528:2: ( RULE_STRING )
            // InternalToscaDsl.g:8529:3: RULE_STRING
            {
             before(grammarAccess.getCapabilityAccess().getCapability_nameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getCapability_nameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Capability_nameAssignment_0"


    // $ANTLR start "rule__Capability__TypeAssignment_4"
    // InternalToscaDsl.g:8538:1: rule__Capability__TypeAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Capability__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8542:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:8543:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:8543:2: ( RULE_STRING )
            // InternalToscaDsl.g:8544:3: RULE_STRING
            {
             before(grammarAccess.getCapabilityAccess().getTypeSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getTypeSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__TypeAssignment_4"


    // $ANTLR start "rule__Capability__DescriptionAssignment_5_1"
    // InternalToscaDsl.g:8553:1: rule__Capability__DescriptionAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Capability__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8557:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:8558:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:8558:2: ( RULE_STRING )
            // InternalToscaDsl.g:8559:3: RULE_STRING
            {
             before(grammarAccess.getCapabilityAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__DescriptionAssignment_5_1"


    // $ANTLR start "rule__Capability__PropertiesAssignment_6_2"
    // InternalToscaDsl.g:8568:1: rule__Capability__PropertiesAssignment_6_2 : ( ruleProperty ) ;
    public final void rule__Capability__PropertiesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8572:1: ( ( ruleProperty ) )
            // InternalToscaDsl.g:8573:2: ( ruleProperty )
            {
            // InternalToscaDsl.g:8573:2: ( ruleProperty )
            // InternalToscaDsl.g:8574:3: ruleProperty
            {
             before(grammarAccess.getCapabilityAccess().getPropertiesPropertyParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getCapabilityAccess().getPropertiesPropertyParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__PropertiesAssignment_6_2"


    // $ANTLR start "rule__Capability__PropertiesAssignment_6_3_1"
    // InternalToscaDsl.g:8583:1: rule__Capability__PropertiesAssignment_6_3_1 : ( ruleProperty ) ;
    public final void rule__Capability__PropertiesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8587:1: ( ( ruleProperty ) )
            // InternalToscaDsl.g:8588:2: ( ruleProperty )
            {
            // InternalToscaDsl.g:8588:2: ( ruleProperty )
            // InternalToscaDsl.g:8589:3: ruleProperty
            {
             before(grammarAccess.getCapabilityAccess().getPropertiesPropertyParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getCapabilityAccess().getPropertiesPropertyParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__PropertiesAssignment_6_3_1"


    // $ANTLR start "rule__Capability__AttributesAssignment_7_2"
    // InternalToscaDsl.g:8598:1: rule__Capability__AttributesAssignment_7_2 : ( ruleAttribute ) ;
    public final void rule__Capability__AttributesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8602:1: ( ( ruleAttribute ) )
            // InternalToscaDsl.g:8603:2: ( ruleAttribute )
            {
            // InternalToscaDsl.g:8603:2: ( ruleAttribute )
            // InternalToscaDsl.g:8604:3: ruleAttribute
            {
             before(grammarAccess.getCapabilityAccess().getAttributesAttributeParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getCapabilityAccess().getAttributesAttributeParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__AttributesAssignment_7_2"


    // $ANTLR start "rule__Capability__AttributesAssignment_7_3_1"
    // InternalToscaDsl.g:8613:1: rule__Capability__AttributesAssignment_7_3_1 : ( ruleAttribute ) ;
    public final void rule__Capability__AttributesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8617:1: ( ( ruleAttribute ) )
            // InternalToscaDsl.g:8618:2: ( ruleAttribute )
            {
            // InternalToscaDsl.g:8618:2: ( ruleAttribute )
            // InternalToscaDsl.g:8619:3: ruleAttribute
            {
             before(grammarAccess.getCapabilityAccess().getAttributesAttributeParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getCapabilityAccess().getAttributesAttributeParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__AttributesAssignment_7_3_1"


    // $ANTLR start "rule__Operation__Operation_nameAssignment_1"
    // InternalToscaDsl.g:8628:1: rule__Operation__Operation_nameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Operation__Operation_nameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8632:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:8633:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:8633:2: ( RULE_STRING )
            // InternalToscaDsl.g:8634:3: RULE_STRING
            {
             before(grammarAccess.getOperationAccess().getOperation_nameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getOperation_nameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Operation_nameAssignment_1"


    // $ANTLR start "rule__Operation__PrimaryAssignment_3"
    // InternalToscaDsl.g:8643:1: rule__Operation__PrimaryAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Operation__PrimaryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToscaDsl.g:8647:1: ( ( RULE_STRING ) )
            // InternalToscaDsl.g:8648:2: ( RULE_STRING )
            {
            // InternalToscaDsl.g:8648:2: ( RULE_STRING )
            // InternalToscaDsl.g:8649:3: RULE_STRING
            {
             before(grammarAccess.getOperationAccess().getPrimarySTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getPrimarySTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__PrimaryAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001F8E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000001F8006000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000E70002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001030006000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000060006000L});

}