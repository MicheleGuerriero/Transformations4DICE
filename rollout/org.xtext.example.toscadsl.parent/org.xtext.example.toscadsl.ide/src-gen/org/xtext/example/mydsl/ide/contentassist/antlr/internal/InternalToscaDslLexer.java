package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalToscaDslLexer extends Lexer {
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalToscaDslLexer() {;} 
    public InternalToscaDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalToscaDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalToscaDsl.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:11:7: ( '{' )
            // InternalToscaDsl.g:11:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:12:7: ( '\"tosca_definitions_version\" :' )
            // InternalToscaDsl.g:12:9: '\"tosca_definitions_version\" :'
            {
            match("\"tosca_definitions_version\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:13:7: ( '}' )
            // InternalToscaDsl.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:14:7: ( ',\\n\"description\" :' )
            // InternalToscaDsl.g:14:9: ',\\n\"description\" :'
            {
            match(",\n\"description\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:15:7: ( ',\\n\"imports\" :' )
            // InternalToscaDsl.g:15:9: ',\\n\"imports\" :'
            {
            match(",\n\"imports\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:16:7: ( '[' )
            // InternalToscaDsl.g:16:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:17:7: ( ']' )
            // InternalToscaDsl.g:17:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:18:7: ( ',' )
            // InternalToscaDsl.g:18:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:19:7: ( ',\\n\"outputs\" :' )
            // InternalToscaDsl.g:19:9: ',\\n\"outputs\" :'
            {
            match(",\n\"outputs\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:20:7: ( ',\\n\"inputs\" :' )
            // InternalToscaDsl.g:20:9: ',\\n\"inputs\" :'
            {
            match(",\n\"inputs\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:21:7: ( ',\\n\"nodeTemplates\" :' )
            // InternalToscaDsl.g:21:9: ',\\n\"nodeTemplates\" :'
            {
            match(",\n\"nodeTemplates\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:22:7: ( ',\\n\"realtionships\" :' )
            // InternalToscaDsl.g:22:9: ',\\n\"realtionships\" :'
            {
            match(",\n\"realtionships\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:23:7: ( ',\\n\"groups\" :' )
            // InternalToscaDsl.g:23:9: ',\\n\"groups\" :'
            {
            match(",\n\"groups\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:24:7: ( ',\\n\"policies\" :' )
            // InternalToscaDsl.g:24:9: ',\\n\"policies\" :'
            {
            match(",\n\"policies\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:25:7: ( ':' )
            // InternalToscaDsl.g:25:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:26:7: ( '\"type\" :' )
            // InternalToscaDsl.g:26:9: '\"type\" :'
            {
            match("\"type\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:27:7: ( ',\\n\"relationships\" :' )
            // InternalToscaDsl.g:27:9: ',\\n\"relationships\" :'
            {
            match(",\n\"relationships\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:28:7: ( ',\\n\"interfaces\" :' )
            // InternalToscaDsl.g:28:9: ',\\n\"interfaces\" :'
            {
            match(",\n\"interfaces\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:29:7: ( ',\\n\"properties\" :' )
            // InternalToscaDsl.g:29:9: ',\\n\"properties\" :'
            {
            match(",\n\"properties\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:30:7: ( ',\\n\"attributes\" :' )
            // InternalToscaDsl.g:30:9: ',\\n\"attributes\" :'
            {
            match(",\n\"attributes\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:31:7: ( ',\\n\"requirements\" :' )
            // InternalToscaDsl.g:31:9: ',\\n\"requirements\" :'
            {
            match(",\n\"requirements\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:32:7: ( ',\\n\"capabilities\" :' )
            // InternalToscaDsl.g:32:9: ',\\n\"capabilities\" :'
            {
            match(",\n\"capabilities\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:33:7: ( ',\\n\"target\" :' )
            // InternalToscaDsl.g:33:9: ',\\n\"target\" :'
            {
            match(",\n\"target\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:34:7: ( ',\\n\"sourceInterfaces\" :' )
            // InternalToscaDsl.g:34:9: ',\\n\"sourceInterfaces\" :'
            {
            match(",\n\"sourceInterfaces\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:35:7: ( ',\\n\"targetInterfaces\" :' )
            // InternalToscaDsl.g:35:9: ',\\n\"targetInterfaces\" :'
            {
            match(",\n\"targetInterfaces\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:36:7: ( ',\\n\"targets\" :' )
            // InternalToscaDsl.g:36:9: ',\\n\"targets\" :'
            {
            match(",\n\"targets\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:37:7: ( ',\\n\"operations\" :' )
            // InternalToscaDsl.g:37:9: ',\\n\"operations\" :'
            {
            match(",\n\"operations\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:38:7: ( '\"value\" :' )
            // InternalToscaDsl.g:38:9: '\"value\" :'
            {
            match("\"value\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:39:7: ( '\"capabiity\" :' )
            // InternalToscaDsl.g:39:9: '\"capabiity\" :'
            {
            match("\"capabiity\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:40:7: ( ',\\n\"node\" :' )
            // InternalToscaDsl.g:40:9: ',\\n\"node\" :'
            {
            match(",\n\"node\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:41:7: ( '\"primary\" :' )
            // InternalToscaDsl.g:41:9: '\"primary\" :'
            {
            match("\"primary\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:42:7: ( ',\\n\"dependentArtifacts\" :' )
            // InternalToscaDsl.g:42:9: ',\\n\"dependentArtifacts\" :'
            {
            match(",\n\"dependentArtifacts\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:9738:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalToscaDsl.g:9738:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalToscaDsl.g:9738:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalToscaDsl.g:9738:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalToscaDsl.g:9738:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalToscaDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:9740:10: ( ( '0' .. '9' )+ )
            // InternalToscaDsl.g:9740:12: ( '0' .. '9' )+
            {
            // InternalToscaDsl.g:9740:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalToscaDsl.g:9740:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:9742:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalToscaDsl.g:9742:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalToscaDsl.g:9742:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalToscaDsl.g:9742:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalToscaDsl.g:9742:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalToscaDsl.g:9742:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalToscaDsl.g:9742:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalToscaDsl.g:9742:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalToscaDsl.g:9742:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalToscaDsl.g:9742:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalToscaDsl.g:9742:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:9744:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalToscaDsl.g:9744:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalToscaDsl.g:9744:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalToscaDsl.g:9744:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:9746:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalToscaDsl.g:9746:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalToscaDsl.g:9746:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalToscaDsl.g:9746:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalToscaDsl.g:9746:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalToscaDsl.g:9746:41: ( '\\r' )? '\\n'
                    {
                    // InternalToscaDsl.g:9746:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalToscaDsl.g:9746:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:9748:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalToscaDsl.g:9748:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalToscaDsl.g:9748:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalToscaDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:9750:16: ( . )
            // InternalToscaDsl.g:9750:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalToscaDsl.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=39;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalToscaDsl.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalToscaDsl.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalToscaDsl.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalToscaDsl.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalToscaDsl.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalToscaDsl.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalToscaDsl.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalToscaDsl.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalToscaDsl.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalToscaDsl.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalToscaDsl.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalToscaDsl.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalToscaDsl.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalToscaDsl.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalToscaDsl.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalToscaDsl.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalToscaDsl.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalToscaDsl.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalToscaDsl.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalToscaDsl.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalToscaDsl.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalToscaDsl.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalToscaDsl.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalToscaDsl.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalToscaDsl.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalToscaDsl.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalToscaDsl.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalToscaDsl.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalToscaDsl.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalToscaDsl.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalToscaDsl.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalToscaDsl.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalToscaDsl.g:1:202: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 34 :
                // InternalToscaDsl.g:1:210: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 35 :
                // InternalToscaDsl.g:1:219: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 36 :
                // InternalToscaDsl.g:1:231: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // InternalToscaDsl.g:1:247: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 38 :
                // InternalToscaDsl.g:1:263: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // InternalToscaDsl.g:1:271: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\2\uffff\1\16\1\uffff\1\27\3\uffff\1\16\2\uffff\2\16\71\uffff\1\24\16\uffff\1\24\15\uffff\1\24\10\uffff\1\24\20\uffff\1\24\1\uffff";
    static final String DFA12_eofS =
        "\177\uffff";
    static final String DFA12_minS =
        "\1\0\1\uffff\1\0\1\uffff\1\12\3\uffff\1\101\2\uffff\1\0\1\52\3\uffff\4\0\2\uffff\1\42\11\uffff\5\0\1\141\5\0\1\145\1\155\1\160\1\157\1\145\1\uffff\1\157\2\uffff\1\141\1\uffff\5\0\1\160\1\uffff\1\160\2\uffff\1\144\1\141\2\uffff\1\162\1\0\1\40\3\0\4\uffff\1\145\3\uffff\1\147\1\0\1\uffff\1\40\2\0\1\42\1\145\1\0\1\uffff\2\0\2\uffff\1\164\2\0\1\40\1\42\2\0\4\uffff\1\0\1\40\1\0\1\uffff\16\0\1\40\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\uffff\1\uffff\1\uffff\1\12\3\uffff\1\172\2\uffff\1\uffff\1\57\3\uffff\4\uffff\2\uffff\1\42\11\uffff\5\uffff\1\164\5\uffff\1\145\1\156\1\165\1\157\1\145\1\uffff\1\162\2\uffff\1\141\1\uffff\5\uffff\1\163\1\uffff\1\164\2\uffff\1\144\1\161\2\uffff\1\162\1\uffff\1\40\3\uffff\4\uffff\1\145\3\uffff\1\147\1\uffff\1\uffff\1\40\2\uffff\1\124\1\145\1\uffff\1\uffff\2\uffff\2\uffff\1\164\2\uffff\1\40\1\163\2\uffff\4\uffff\1\uffff\1\40\1\uffff\1\uffff\16\uffff\1\40\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\uffff\1\6\1\7\1\17\1\uffff\1\41\1\42\2\uffff\1\46\1\47\1\1\4\uffff\1\43\1\3\1\uffff\1\10\1\6\1\7\1\17\1\41\1\42\1\44\1\45\1\46\20\uffff\1\15\1\uffff\1\24\1\26\1\uffff\1\30\6\uffff\1\5\1\uffff\1\11\1\33\2\uffff\1\16\1\23\6\uffff\1\4\1\40\1\12\1\22\1\uffff\1\14\1\21\1\25\2\uffff\1\20\6\uffff\1\34\2\uffff\1\13\1\36\7\uffff\1\37\1\27\1\31\1\32\3\uffff\1\35\17\uffff\1\2";
    static final String DFA12_specialS =
        "\1\63\1\uffff\1\1\10\uffff\1\0\4\uffff\1\62\1\2\1\7\1\23\14\uffff\1\32\1\20\1\3\1\10\1\24\1\uffff\1\33\1\21\1\4\1\11\1\25\13\uffff\1\34\1\22\1\5\1\12\1\26\12\uffff\1\35\1\uffff\1\6\1\13\1\27\11\uffff\1\36\2\uffff\1\14\1\30\2\uffff\1\37\1\uffff\1\15\1\31\3\uffff\1\40\1\16\2\uffff\1\41\1\17\4\uffff\1\42\1\uffff\1\43\1\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\2\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\16\2\15\2\16\1\15\22\16\1\15\1\16\1\2\4\16\1\13\4\16\1\4\2\16\1\14\12\12\1\7\6\16\32\11\1\5\1\16\1\6\1\10\1\11\1\16\32\11\1\1\1\16\1\3\uff82\16",
            "",
            "\143\24\1\22\14\24\1\23\3\24\1\20\1\24\1\21\uff89\24",
            "",
            "\1\26",
            "",
            "",
            "",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\0\24",
            "\1\35\4\uffff\1\36",
            "",
            "",
            "",
            "\157\24\1\40\11\24\1\41\uff86\24",
            "\141\24\1\42\uff9e\24",
            "\141\24\1\43\uff9e\24",
            "\162\24\1\44\uff8d\24",
            "",
            "",
            "\1\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\163\24\1\46\uff8c\24",
            "\160\24\1\47\uff8f\24",
            "\154\24\1\50\uff93\24",
            "\160\24\1\51\uff8f\24",
            "\151\24\1\52\uff96\24",
            "\1\62\1\uffff\1\63\1\53\2\uffff\1\60\1\uffff\1\54\4\uffff\1\56\1\55\1\61\1\uffff\1\57\1\65\1\64",
            "\143\24\1\66\uff9c\24",
            "\145\24\1\67\uff9a\24",
            "\165\24\1\70\uff8a\24",
            "\141\24\1\71\uff9e\24",
            "\155\24\1\72\uff92\24",
            "\1\73",
            "\1\74\1\75",
            "\1\77\4\uffff\1\76",
            "\1\100",
            "\1\101",
            "",
            "\1\102\2\uffff\1\103",
            "",
            "",
            "\1\104",
            "",
            "\141\24\1\105\uff9e\24",
            "\42\24\1\106\uffdd\24",
            "\145\24\1\107\uff9a\24",
            "\142\24\1\110\uff9d\24",
            "\141\24\1\111\uff9e\24",
            "\1\113\2\uffff\1\112",
            "",
            "\1\114\3\uffff\1\115",
            "",
            "",
            "\1\116",
            "\1\117\12\uffff\1\120\4\uffff\1\121",
            "",
            "",
            "\1\122",
            "\137\24\1\123\uffa0\24",
            "\1\124",
            "\42\24\1\125\uffdd\24",
            "\151\24\1\126\uff96\24",
            "\162\24\1\127\uff8d\24",
            "",
            "",
            "",
            "",
            "\1\130",
            "",
            "",
            "",
            "\1\131",
            "\144\24\1\132\uff9b\24",
            "",
            "\1\133",
            "\151\24\1\134\uff96\24",
            "\171\24\1\135\uff86\24",
            "\1\137\61\uffff\1\136",
            "\1\140",
            "\145\24\1\141\uff9a\24",
            "",
            "\164\24\1\142\uff8b\24",
            "\42\24\1\143\uffdd\24",
            "",
            "",
            "\1\144",
            "\146\24\1\145\uff99\24",
            "\171\24\1\146\uff86\24",
            "\1\147",
            "\1\150\46\uffff\1\151\51\uffff\1\152",
            "\151\24\1\153\uff96\24",
            "\42\24\1\154\uffdd\24",
            "",
            "",
            "",
            "",
            "\156\24\1\155\uff91\24",
            "\1\156",
            "\151\24\1\157\uff96\24",
            "",
            "\164\24\1\160\uff8b\24",
            "\151\24\1\161\uff96\24",
            "\157\24\1\162\uff90\24",
            "\156\24\1\163\uff91\24",
            "\163\24\1\164\uff8c\24",
            "\137\24\1\165\uffa0\24",
            "\166\24\1\166\uff89\24",
            "\145\24\1\167\uff9a\24",
            "\162\24\1\170\uff8d\24",
            "\163\24\1\171\uff8c\24",
            "\151\24\1\172\uff96\24",
            "\157\24\1\173\uff90\24",
            "\156\24\1\174\uff91\24",
            "\42\24\1\175\uffdd\24",
            "\1\176",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_11 = input.LA(1);

                        s = -1;
                        if ( ((LA12_11>='\u0000' && LA12_11<='\uFFFF')) ) {s = 20;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_2 = input.LA(1);

                        s = -1;
                        if ( (LA12_2=='t') ) {s = 16;}

                        else if ( (LA12_2=='v') ) {s = 17;}

                        else if ( (LA12_2=='c') ) {s = 18;}

                        else if ( (LA12_2=='p') ) {s = 19;}

                        else if ( ((LA12_2>='\u0000' && LA12_2<='b')||(LA12_2>='d' && LA12_2<='o')||(LA12_2>='q' && LA12_2<='s')||LA12_2=='u'||(LA12_2>='w' && LA12_2<='\uFFFF')) ) {s = 20;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_17 = input.LA(1);

                        s = -1;
                        if ( (LA12_17=='a') ) {s = 34;}

                        else if ( ((LA12_17>='\u0000' && LA12_17<='`')||(LA12_17>='b' && LA12_17<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_34 = input.LA(1);

                        s = -1;
                        if ( (LA12_34=='l') ) {s = 40;}

                        else if ( ((LA12_34>='\u0000' && LA12_34<='k')||(LA12_34>='m' && LA12_34<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_40 = input.LA(1);

                        s = -1;
                        if ( (LA12_40=='u') ) {s = 56;}

                        else if ( ((LA12_40>='\u0000' && LA12_40<='t')||(LA12_40>='v' && LA12_40<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_56 = input.LA(1);

                        s = -1;
                        if ( (LA12_56=='e') ) {s = 71;}

                        else if ( ((LA12_56>='\u0000' && LA12_56<='d')||(LA12_56>='f' && LA12_56<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_71 = input.LA(1);

                        s = -1;
                        if ( (LA12_71=='\"') ) {s = 85;}

                        else if ( ((LA12_71>='\u0000' && LA12_71<='!')||(LA12_71>='#' && LA12_71<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_18 = input.LA(1);

                        s = -1;
                        if ( (LA12_18=='a') ) {s = 35;}

                        else if ( ((LA12_18>='\u0000' && LA12_18<='`')||(LA12_18>='b' && LA12_18<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_35 = input.LA(1);

                        s = -1;
                        if ( (LA12_35=='p') ) {s = 41;}

                        else if ( ((LA12_35>='\u0000' && LA12_35<='o')||(LA12_35>='q' && LA12_35<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_41 = input.LA(1);

                        s = -1;
                        if ( (LA12_41=='a') ) {s = 57;}

                        else if ( ((LA12_41>='\u0000' && LA12_41<='`')||(LA12_41>='b' && LA12_41<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_57 = input.LA(1);

                        s = -1;
                        if ( (LA12_57=='b') ) {s = 72;}

                        else if ( ((LA12_57>='\u0000' && LA12_57<='a')||(LA12_57>='c' && LA12_57<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_72 = input.LA(1);

                        s = -1;
                        if ( (LA12_72=='i') ) {s = 86;}

                        else if ( ((LA12_72>='\u0000' && LA12_72<='h')||(LA12_72>='j' && LA12_72<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_86 = input.LA(1);

                        s = -1;
                        if ( (LA12_86=='i') ) {s = 92;}

                        else if ( ((LA12_86>='\u0000' && LA12_86<='h')||(LA12_86>='j' && LA12_86<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_92 = input.LA(1);

                        s = -1;
                        if ( (LA12_92=='t') ) {s = 98;}

                        else if ( ((LA12_92>='\u0000' && LA12_92<='s')||(LA12_92>='u' && LA12_92<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_98 = input.LA(1);

                        s = -1;
                        if ( (LA12_98=='y') ) {s = 102;}

                        else if ( ((LA12_98>='\u0000' && LA12_98<='x')||(LA12_98>='z' && LA12_98<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_102 = input.LA(1);

                        s = -1;
                        if ( (LA12_102=='\"') ) {s = 108;}

                        else if ( ((LA12_102>='\u0000' && LA12_102<='!')||(LA12_102>='#' && LA12_102<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_33 = input.LA(1);

                        s = -1;
                        if ( (LA12_33=='p') ) {s = 39;}

                        else if ( ((LA12_33>='\u0000' && LA12_33<='o')||(LA12_33>='q' && LA12_33<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_39 = input.LA(1);

                        s = -1;
                        if ( (LA12_39=='e') ) {s = 55;}

                        else if ( ((LA12_39>='\u0000' && LA12_39<='d')||(LA12_39>='f' && LA12_39<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_55 = input.LA(1);

                        s = -1;
                        if ( (LA12_55=='\"') ) {s = 70;}

                        else if ( ((LA12_55>='\u0000' && LA12_55<='!')||(LA12_55>='#' && LA12_55<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_19 = input.LA(1);

                        s = -1;
                        if ( (LA12_19=='r') ) {s = 36;}

                        else if ( ((LA12_19>='\u0000' && LA12_19<='q')||(LA12_19>='s' && LA12_19<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_36 = input.LA(1);

                        s = -1;
                        if ( (LA12_36=='i') ) {s = 42;}

                        else if ( ((LA12_36>='\u0000' && LA12_36<='h')||(LA12_36>='j' && LA12_36<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA12_42 = input.LA(1);

                        s = -1;
                        if ( (LA12_42=='m') ) {s = 58;}

                        else if ( ((LA12_42>='\u0000' && LA12_42<='l')||(LA12_42>='n' && LA12_42<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA12_58 = input.LA(1);

                        s = -1;
                        if ( (LA12_58=='a') ) {s = 73;}

                        else if ( ((LA12_58>='\u0000' && LA12_58<='`')||(LA12_58>='b' && LA12_58<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA12_73 = input.LA(1);

                        s = -1;
                        if ( (LA12_73=='r') ) {s = 87;}

                        else if ( ((LA12_73>='\u0000' && LA12_73<='q')||(LA12_73>='s' && LA12_73<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA12_87 = input.LA(1);

                        s = -1;
                        if ( (LA12_87=='y') ) {s = 93;}

                        else if ( ((LA12_87>='\u0000' && LA12_87<='x')||(LA12_87>='z' && LA12_87<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA12_93 = input.LA(1);

                        s = -1;
                        if ( (LA12_93=='\"') ) {s = 99;}

                        else if ( ((LA12_93>='\u0000' && LA12_93<='!')||(LA12_93>='#' && LA12_93<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA12_32 = input.LA(1);

                        s = -1;
                        if ( (LA12_32=='s') ) {s = 38;}

                        else if ( ((LA12_32>='\u0000' && LA12_32<='r')||(LA12_32>='t' && LA12_32<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA12_38 = input.LA(1);

                        s = -1;
                        if ( (LA12_38=='c') ) {s = 54;}

                        else if ( ((LA12_38>='\u0000' && LA12_38<='b')||(LA12_38>='d' && LA12_38<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA12_54 = input.LA(1);

                        s = -1;
                        if ( (LA12_54=='a') ) {s = 69;}

                        else if ( ((LA12_54>='\u0000' && LA12_54<='`')||(LA12_54>='b' && LA12_54<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA12_69 = input.LA(1);

                        s = -1;
                        if ( (LA12_69=='_') ) {s = 83;}

                        else if ( ((LA12_69>='\u0000' && LA12_69<='^')||(LA12_69>='`' && LA12_69<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA12_83 = input.LA(1);

                        s = -1;
                        if ( (LA12_83=='d') ) {s = 90;}

                        else if ( ((LA12_83>='\u0000' && LA12_83<='c')||(LA12_83>='e' && LA12_83<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA12_90 = input.LA(1);

                        s = -1;
                        if ( (LA12_90=='e') ) {s = 97;}

                        else if ( ((LA12_90>='\u0000' && LA12_90<='d')||(LA12_90>='f' && LA12_90<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA12_97 = input.LA(1);

                        s = -1;
                        if ( (LA12_97=='f') ) {s = 101;}

                        else if ( ((LA12_97>='\u0000' && LA12_97<='e')||(LA12_97>='g' && LA12_97<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA12_101 = input.LA(1);

                        s = -1;
                        if ( (LA12_101=='i') ) {s = 107;}

                        else if ( ((LA12_101>='\u0000' && LA12_101<='h')||(LA12_101>='j' && LA12_101<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA12_107 = input.LA(1);

                        s = -1;
                        if ( (LA12_107=='n') ) {s = 109;}

                        else if ( ((LA12_107>='\u0000' && LA12_107<='m')||(LA12_107>='o' && LA12_107<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA12_109 = input.LA(1);

                        s = -1;
                        if ( (LA12_109=='i') ) {s = 111;}

                        else if ( ((LA12_109>='\u0000' && LA12_109<='h')||(LA12_109>='j' && LA12_109<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA12_111 = input.LA(1);

                        s = -1;
                        if ( (LA12_111=='t') ) {s = 112;}

                        else if ( ((LA12_111>='\u0000' && LA12_111<='s')||(LA12_111>='u' && LA12_111<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA12_112 = input.LA(1);

                        s = -1;
                        if ( (LA12_112=='i') ) {s = 113;}

                        else if ( ((LA12_112>='\u0000' && LA12_112<='h')||(LA12_112>='j' && LA12_112<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA12_113 = input.LA(1);

                        s = -1;
                        if ( (LA12_113=='o') ) {s = 114;}

                        else if ( ((LA12_113>='\u0000' && LA12_113<='n')||(LA12_113>='p' && LA12_113<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA12_114 = input.LA(1);

                        s = -1;
                        if ( (LA12_114=='n') ) {s = 115;}

                        else if ( ((LA12_114>='\u0000' && LA12_114<='m')||(LA12_114>='o' && LA12_114<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA12_115 = input.LA(1);

                        s = -1;
                        if ( (LA12_115=='s') ) {s = 116;}

                        else if ( ((LA12_115>='\u0000' && LA12_115<='r')||(LA12_115>='t' && LA12_115<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA12_116 = input.LA(1);

                        s = -1;
                        if ( (LA12_116=='_') ) {s = 117;}

                        else if ( ((LA12_116>='\u0000' && LA12_116<='^')||(LA12_116>='`' && LA12_116<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA12_117 = input.LA(1);

                        s = -1;
                        if ( (LA12_117=='v') ) {s = 118;}

                        else if ( ((LA12_117>='\u0000' && LA12_117<='u')||(LA12_117>='w' && LA12_117<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA12_118 = input.LA(1);

                        s = -1;
                        if ( (LA12_118=='e') ) {s = 119;}

                        else if ( ((LA12_118>='\u0000' && LA12_118<='d')||(LA12_118>='f' && LA12_118<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA12_119 = input.LA(1);

                        s = -1;
                        if ( (LA12_119=='r') ) {s = 120;}

                        else if ( ((LA12_119>='\u0000' && LA12_119<='q')||(LA12_119>='s' && LA12_119<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA12_120 = input.LA(1);

                        s = -1;
                        if ( (LA12_120=='s') ) {s = 121;}

                        else if ( ((LA12_120>='\u0000' && LA12_120<='r')||(LA12_120>='t' && LA12_120<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA12_121 = input.LA(1);

                        s = -1;
                        if ( (LA12_121=='i') ) {s = 122;}

                        else if ( ((LA12_121>='\u0000' && LA12_121<='h')||(LA12_121>='j' && LA12_121<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA12_122 = input.LA(1);

                        s = -1;
                        if ( (LA12_122=='o') ) {s = 123;}

                        else if ( ((LA12_122>='\u0000' && LA12_122<='n')||(LA12_122>='p' && LA12_122<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA12_123 = input.LA(1);

                        s = -1;
                        if ( (LA12_123=='n') ) {s = 124;}

                        else if ( ((LA12_123>='\u0000' && LA12_123<='m')||(LA12_123>='o' && LA12_123<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA12_124 = input.LA(1);

                        s = -1;
                        if ( (LA12_124=='\"') ) {s = 125;}

                        else if ( ((LA12_124>='\u0000' && LA12_124<='!')||(LA12_124>='#' && LA12_124<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA12_16 = input.LA(1);

                        s = -1;
                        if ( (LA12_16=='o') ) {s = 32;}

                        else if ( (LA12_16=='y') ) {s = 33;}

                        else if ( ((LA12_16>='\u0000' && LA12_16<='n')||(LA12_16>='p' && LA12_16<='x')||(LA12_16>='z' && LA12_16<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='{') ) {s = 1;}

                        else if ( (LA12_0=='\"') ) {s = 2;}

                        else if ( (LA12_0=='}') ) {s = 3;}

                        else if ( (LA12_0==',') ) {s = 4;}

                        else if ( (LA12_0=='[') ) {s = 5;}

                        else if ( (LA12_0==']') ) {s = 6;}

                        else if ( (LA12_0==':') ) {s = 7;}

                        else if ( (LA12_0=='^') ) {s = 8;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {s = 9;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 10;}

                        else if ( (LA12_0=='\'') ) {s = 11;}

                        else if ( (LA12_0=='/') ) {s = 12;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 13;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=';' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}