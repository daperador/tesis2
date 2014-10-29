package co.edu.uniandes.csw.spl.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import co.edu.uniandes.csw.spl.dsl.services.AnnotateitGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnnotateitParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "';'", "'types'", "'{'", "'}'", "','", "'Type'", "'@annotation'", "'context'", "'AnnotationAttribute'", "'attribute'", "'value'", "':'", "'SimpleValue'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAnnotateitParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAnnotateitParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAnnotateitParser.tokenNames; }
    public String getGrammarFileName() { return "../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g"; }


     
     	private AnnotateitGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AnnotateitGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRulePackage"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:60:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:61:1: ( rulePackage EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:62:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_in_entryRulePackage61);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackage68); 

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:69:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:73:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:74:1: ( ( rule__Package__Group__0 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:74:1: ( ( rule__Package__Group__0 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:75:1: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:76:1: ( rule__Package__Group__0 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:76:2: rule__Package__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__0_in_rulePackage94);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleAnnotationAttributeValue"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:88:1: entryRuleAnnotationAttributeValue : ruleAnnotationAttributeValue EOF ;
    public final void entryRuleAnnotationAttributeValue() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:89:1: ( ruleAnnotationAttributeValue EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:90:1: ruleAnnotationAttributeValue EOF
            {
             before(grammarAccess.getAnnotationAttributeValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttributeValue_in_entryRuleAnnotationAttributeValue121);
            ruleAnnotationAttributeValue();

            state._fsp--;

             after(grammarAccess.getAnnotationAttributeValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationAttributeValue128); 

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
    // $ANTLR end "entryRuleAnnotationAttributeValue"


    // $ANTLR start "ruleAnnotationAttributeValue"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:97:1: ruleAnnotationAttributeValue : ( ruleSimpleValue ) ;
    public final void ruleAnnotationAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:101:2: ( ( ruleSimpleValue ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:102:1: ( ruleSimpleValue )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:102:1: ( ruleSimpleValue )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:103:1: ruleSimpleValue
            {
             before(grammarAccess.getAnnotationAttributeValueAccess().getSimpleValueParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleValue_in_ruleAnnotationAttributeValue154);
            ruleSimpleValue();

            state._fsp--;

             after(grammarAccess.getAnnotationAttributeValueAccess().getSimpleValueParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotationAttributeValue"


    // $ANTLR start "entryRuleType"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:118:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:119:1: ( ruleType EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:120:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_entryRuleType182);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleType189); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:127:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:131:2: ( ( ( rule__Type__Group__0 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:132:1: ( ( rule__Type__Group__0 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:132:1: ( ( rule__Type__Group__0 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:133:1: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:134:1: ( rule__Type__Group__0 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:134:2: rule__Type__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group__0_in_ruleType215);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleAnnotationType"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:146:1: entryRuleAnnotationType : ruleAnnotationType EOF ;
    public final void entryRuleAnnotationType() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:147:1: ( ruleAnnotationType EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:148:1: ruleAnnotationType EOF
            {
             before(grammarAccess.getAnnotationTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType242);
            ruleAnnotationType();

            state._fsp--;

             after(grammarAccess.getAnnotationTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationType249); 

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
    // $ANTLR end "entryRuleAnnotationType"


    // $ANTLR start "ruleAnnotationType"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:155:1: ruleAnnotationType : ( ( rule__AnnotationType__Group__0 ) ) ;
    public final void ruleAnnotationType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:159:2: ( ( ( rule__AnnotationType__Group__0 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:160:1: ( ( rule__AnnotationType__Group__0 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:160:1: ( ( rule__AnnotationType__Group__0 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:161:1: ( rule__AnnotationType__Group__0 )
            {
             before(grammarAccess.getAnnotationTypeAccess().getGroup()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:162:1: ( rule__AnnotationType__Group__0 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:162:2: rule__AnnotationType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__0_in_ruleAnnotationType275);
            rule__AnnotationType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotationType"


    // $ANTLR start "entryRuleAnnotationAttribute"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:174:1: entryRuleAnnotationAttribute : ruleAnnotationAttribute EOF ;
    public final void entryRuleAnnotationAttribute() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:175:1: ( ruleAnnotationAttribute EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:176:1: ruleAnnotationAttribute EOF
            {
             before(grammarAccess.getAnnotationAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttribute_in_entryRuleAnnotationAttribute302);
            ruleAnnotationAttribute();

            state._fsp--;

             after(grammarAccess.getAnnotationAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationAttribute309); 

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
    // $ANTLR end "entryRuleAnnotationAttribute"


    // $ANTLR start "ruleAnnotationAttribute"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:183:1: ruleAnnotationAttribute : ( ( rule__AnnotationAttribute__Group__0 ) ) ;
    public final void ruleAnnotationAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:187:2: ( ( ( rule__AnnotationAttribute__Group__0 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:188:1: ( ( rule__AnnotationAttribute__Group__0 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:188:1: ( ( rule__AnnotationAttribute__Group__0 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:189:1: ( rule__AnnotationAttribute__Group__0 )
            {
             before(grammarAccess.getAnnotationAttributeAccess().getGroup()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:190:1: ( rule__AnnotationAttribute__Group__0 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:190:2: rule__AnnotationAttribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__0_in_ruleAnnotationAttribute335);
            rule__AnnotationAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotationAttribute"


    // $ANTLR start "entryRuleEString"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:202:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:203:1: ( ruleEString EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:204:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString362);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString369); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:211:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:215:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:216:1: ( ( rule__EString__Alternatives ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:216:1: ( ( rule__EString__Alternatives ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:217:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:218:1: ( rule__EString__Alternatives )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:218:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString395);
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


    // $ANTLR start "entryRuleAnnotationTypeAttribute"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:230:1: entryRuleAnnotationTypeAttribute : ruleAnnotationTypeAttribute EOF ;
    public final void entryRuleAnnotationTypeAttribute() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:231:1: ( ruleAnnotationTypeAttribute EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:232:1: ruleAnnotationTypeAttribute EOF
            {
             before(grammarAccess.getAnnotationTypeAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationTypeAttribute_in_entryRuleAnnotationTypeAttribute422);
            ruleAnnotationTypeAttribute();

            state._fsp--;

             after(grammarAccess.getAnnotationTypeAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationTypeAttribute429); 

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
    // $ANTLR end "entryRuleAnnotationTypeAttribute"


    // $ANTLR start "ruleAnnotationTypeAttribute"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:239:1: ruleAnnotationTypeAttribute : ( ( rule__AnnotationTypeAttribute__Group__0 ) ) ;
    public final void ruleAnnotationTypeAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:243:2: ( ( ( rule__AnnotationTypeAttribute__Group__0 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:244:1: ( ( rule__AnnotationTypeAttribute__Group__0 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:244:1: ( ( rule__AnnotationTypeAttribute__Group__0 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:245:1: ( rule__AnnotationTypeAttribute__Group__0 )
            {
             before(grammarAccess.getAnnotationTypeAttributeAccess().getGroup()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:246:1: ( rule__AnnotationTypeAttribute__Group__0 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:246:2: rule__AnnotationTypeAttribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group__0_in_ruleAnnotationTypeAttribute455);
            rule__AnnotationTypeAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationTypeAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotationTypeAttribute"


    // $ANTLR start "entryRuleSimpleValue"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:258:1: entryRuleSimpleValue : ruleSimpleValue EOF ;
    public final void entryRuleSimpleValue() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:259:1: ( ruleSimpleValue EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:260:1: ruleSimpleValue EOF
            {
             before(grammarAccess.getSimpleValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue482);
            ruleSimpleValue();

            state._fsp--;

             after(grammarAccess.getSimpleValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleValue489); 

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
    // $ANTLR end "entryRuleSimpleValue"


    // $ANTLR start "ruleSimpleValue"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:267:1: ruleSimpleValue : ( ( rule__SimpleValue__Group__0 ) ) ;
    public final void ruleSimpleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:271:2: ( ( ( rule__SimpleValue__Group__0 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:272:1: ( ( rule__SimpleValue__Group__0 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:272:1: ( ( rule__SimpleValue__Group__0 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:273:1: ( rule__SimpleValue__Group__0 )
            {
             before(grammarAccess.getSimpleValueAccess().getGroup()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:274:1: ( rule__SimpleValue__Group__0 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:274:2: rule__SimpleValue__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__0_in_ruleSimpleValue515);
            rule__SimpleValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleValue"


    // $ANTLR start "rule__EString__Alternatives"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:286:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:290:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:291:1: ( RULE_STRING )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:291:1: ( RULE_STRING )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:292:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives551); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:297:6: ( RULE_ID )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:297:6: ( RULE_ID )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:298:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives568); 
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


    // $ANTLR start "rule__Package__Group__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:310:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:314:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:315:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0598);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0601);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:322:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:326:1: ( ( () ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:327:1: ( () )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:327:1: ( () )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:328:1: ()
            {
             before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:329:1: ()
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:331:1: 
            {
            }

             after(grammarAccess.getPackageAccess().getPackageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:341:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:345:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:346:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1659);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1662);
            rule__Package__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:353:1: rule__Package__Group__1__Impl : ( 'Package' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:357:1: ( ( 'Package' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:358:1: ( 'Package' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:358:1: ( 'Package' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:359:1: 'Package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Package__Group__1__Impl690); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:372:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:376:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:377:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2721);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__3_in_rule__Package__Group__2724);
            rule__Package__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:384:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:388:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:389:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:389:1: ( ( rule__Package__NameAssignment_2 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:390:1: ( rule__Package__NameAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:391:1: ( rule__Package__NameAssignment_2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:391:2: rule__Package__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl751);
            rule__Package__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:401:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:405:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:406:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__3781);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__4_in_rule__Package__Group__3784);
            rule__Package__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:413:1: rule__Package__Group__3__Impl : ( ';' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:417:1: ( ( ';' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:418:1: ( ';' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:418:1: ( ';' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:419:1: ';'
            {
             before(grammarAccess.getPackageAccess().getSemicolonKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Package__Group__3__Impl812); 
             after(grammarAccess.getPackageAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:432:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:436:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:437:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__4843);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__5_in_rule__Package__Group__4846);
            rule__Package__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:444:1: rule__Package__Group__4__Impl : ( ( rule__Package__Group_4__0 )? ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:448:1: ( ( ( rule__Package__Group_4__0 )? ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:449:1: ( ( rule__Package__Group_4__0 )? )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:449:1: ( ( rule__Package__Group_4__0 )? )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:450:1: ( rule__Package__Group_4__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_4()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:451:1: ( rule__Package__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:451:2: rule__Package__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl873);
                    rule__Package__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__Package__Group__5"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:461:1: rule__Package__Group__5 : rule__Package__Group__5__Impl ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:465:1: ( rule__Package__Group__5__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:466:2: rule__Package__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__5904);
            rule__Package__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5"


    // $ANTLR start "rule__Package__Group__5__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:472:1: rule__Package__Group__5__Impl : ( ( rule__Package__Group_5__0 )? ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:476:1: ( ( ( rule__Package__Group_5__0 )? ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:477:1: ( ( rule__Package__Group_5__0 )? )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:477:1: ( ( rule__Package__Group_5__0 )? )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:478:1: ( rule__Package__Group_5__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_5()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:479:1: ( rule__Package__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:479:2: rule__Package__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__0_in_rule__Package__Group__5__Impl931);
                    rule__Package__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5__Impl"


    // $ANTLR start "rule__Package__Group_4__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:501:1: rule__Package__Group_4__0 : rule__Package__Group_4__0__Impl rule__Package__Group_4__1 ;
    public final void rule__Package__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:505:1: ( rule__Package__Group_4__0__Impl rule__Package__Group_4__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:506:2: rule__Package__Group_4__0__Impl rule__Package__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__0974);
            rule__Package__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__0977);
            rule__Package__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__0"


    // $ANTLR start "rule__Package__Group_4__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:513:1: rule__Package__Group_4__0__Impl : ( 'types' ) ;
    public final void rule__Package__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:517:1: ( ( 'types' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:518:1: ( 'types' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:518:1: ( 'types' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:519:1: 'types'
            {
             before(grammarAccess.getPackageAccess().getTypesKeyword_4_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Package__Group_4__0__Impl1005); 
             after(grammarAccess.getPackageAccess().getTypesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__0__Impl"


    // $ANTLR start "rule__Package__Group_4__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:532:1: rule__Package__Group_4__1 : rule__Package__Group_4__1__Impl rule__Package__Group_4__2 ;
    public final void rule__Package__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:536:1: ( rule__Package__Group_4__1__Impl rule__Package__Group_4__2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:537:2: rule__Package__Group_4__1__Impl rule__Package__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__11036);
            rule__Package__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__2_in_rule__Package__Group_4__11039);
            rule__Package__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__1"


    // $ANTLR start "rule__Package__Group_4__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:544:1: rule__Package__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Package__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:548:1: ( ( '{' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:549:1: ( '{' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:549:1: ( '{' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:550:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Package__Group_4__1__Impl1067); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__1__Impl"


    // $ANTLR start "rule__Package__Group_4__2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:563:1: rule__Package__Group_4__2 : rule__Package__Group_4__2__Impl rule__Package__Group_4__3 ;
    public final void rule__Package__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:567:1: ( rule__Package__Group_4__2__Impl rule__Package__Group_4__3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:568:2: rule__Package__Group_4__2__Impl rule__Package__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__2__Impl_in_rule__Package__Group_4__21098);
            rule__Package__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__3_in_rule__Package__Group_4__21101);
            rule__Package__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__2"


    // $ANTLR start "rule__Package__Group_4__2__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:575:1: rule__Package__Group_4__2__Impl : ( ( rule__Package__TypesAssignment_4_2 ) ) ;
    public final void rule__Package__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:579:1: ( ( ( rule__Package__TypesAssignment_4_2 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:580:1: ( ( rule__Package__TypesAssignment_4_2 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:580:1: ( ( rule__Package__TypesAssignment_4_2 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:581:1: ( rule__Package__TypesAssignment_4_2 )
            {
             before(grammarAccess.getPackageAccess().getTypesAssignment_4_2()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:582:1: ( rule__Package__TypesAssignment_4_2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:582:2: rule__Package__TypesAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__TypesAssignment_4_2_in_rule__Package__Group_4__2__Impl1128);
            rule__Package__TypesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getTypesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__2__Impl"


    // $ANTLR start "rule__Package__Group_4__3"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:592:1: rule__Package__Group_4__3 : rule__Package__Group_4__3__Impl rule__Package__Group_4__4 ;
    public final void rule__Package__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:596:1: ( rule__Package__Group_4__3__Impl rule__Package__Group_4__4 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:597:2: rule__Package__Group_4__3__Impl rule__Package__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__3__Impl_in_rule__Package__Group_4__31158);
            rule__Package__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__4_in_rule__Package__Group_4__31161);
            rule__Package__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__3"


    // $ANTLR start "rule__Package__Group_4__3__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:604:1: rule__Package__Group_4__3__Impl : ( ( rule__Package__Group_4_3__0 )* ) ;
    public final void rule__Package__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:608:1: ( ( ( rule__Package__Group_4_3__0 )* ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:609:1: ( ( rule__Package__Group_4_3__0 )* )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:609:1: ( ( rule__Package__Group_4_3__0 )* )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:610:1: ( rule__Package__Group_4_3__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_4_3()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:611:1: ( rule__Package__Group_4_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:611:2: rule__Package__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__0_in_rule__Package__Group_4__3__Impl1188);
            	    rule__Package__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__3__Impl"


    // $ANTLR start "rule__Package__Group_4__4"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:621:1: rule__Package__Group_4__4 : rule__Package__Group_4__4__Impl ;
    public final void rule__Package__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:625:1: ( rule__Package__Group_4__4__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:626:2: rule__Package__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__4__Impl_in_rule__Package__Group_4__41219);
            rule__Package__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__4"


    // $ANTLR start "rule__Package__Group_4__4__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:632:1: rule__Package__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Package__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:636:1: ( ( '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:637:1: ( '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:637:1: ( '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:638:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Package__Group_4__4__Impl1247); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__4__Impl"


    // $ANTLR start "rule__Package__Group_4_3__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:661:1: rule__Package__Group_4_3__0 : rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1 ;
    public final void rule__Package__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:665:1: ( rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:666:2: rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__0__Impl_in_rule__Package__Group_4_3__01288);
            rule__Package__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__1_in_rule__Package__Group_4_3__01291);
            rule__Package__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4_3__0"


    // $ANTLR start "rule__Package__Group_4_3__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:673:1: rule__Package__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Package__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:677:1: ( ( ',' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:678:1: ( ',' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:678:1: ( ',' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:679:1: ','
            {
             before(grammarAccess.getPackageAccess().getCommaKeyword_4_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Package__Group_4_3__0__Impl1319); 
             after(grammarAccess.getPackageAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4_3__0__Impl"


    // $ANTLR start "rule__Package__Group_4_3__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:692:1: rule__Package__Group_4_3__1 : rule__Package__Group_4_3__1__Impl ;
    public final void rule__Package__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:696:1: ( rule__Package__Group_4_3__1__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:697:2: rule__Package__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__1__Impl_in_rule__Package__Group_4_3__11350);
            rule__Package__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4_3__1"


    // $ANTLR start "rule__Package__Group_4_3__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:703:1: rule__Package__Group_4_3__1__Impl : ( ( rule__Package__TypesAssignment_4_3_1 ) ) ;
    public final void rule__Package__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:707:1: ( ( ( rule__Package__TypesAssignment_4_3_1 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:708:1: ( ( rule__Package__TypesAssignment_4_3_1 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:708:1: ( ( rule__Package__TypesAssignment_4_3_1 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:709:1: ( rule__Package__TypesAssignment_4_3_1 )
            {
             before(grammarAccess.getPackageAccess().getTypesAssignment_4_3_1()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:710:1: ( rule__Package__TypesAssignment_4_3_1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:710:2: rule__Package__TypesAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__TypesAssignment_4_3_1_in_rule__Package__Group_4_3__1__Impl1377);
            rule__Package__TypesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getTypesAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4_3__1__Impl"


    // $ANTLR start "rule__Package__Group_5__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:724:1: rule__Package__Group_5__0 : rule__Package__Group_5__0__Impl rule__Package__Group_5__1 ;
    public final void rule__Package__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:728:1: ( rule__Package__Group_5__0__Impl rule__Package__Group_5__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:729:2: rule__Package__Group_5__0__Impl rule__Package__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__0__Impl_in_rule__Package__Group_5__01411);
            rule__Package__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__1_in_rule__Package__Group_5__01414);
            rule__Package__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__0"


    // $ANTLR start "rule__Package__Group_5__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:736:1: rule__Package__Group_5__0__Impl : ( ( rule__Package__AnnotationTypesAssignment_5_0 ) ) ;
    public final void rule__Package__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:740:1: ( ( ( rule__Package__AnnotationTypesAssignment_5_0 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:741:1: ( ( rule__Package__AnnotationTypesAssignment_5_0 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:741:1: ( ( rule__Package__AnnotationTypesAssignment_5_0 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:742:1: ( rule__Package__AnnotationTypesAssignment_5_0 )
            {
             before(grammarAccess.getPackageAccess().getAnnotationTypesAssignment_5_0()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:743:1: ( rule__Package__AnnotationTypesAssignment_5_0 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:743:2: rule__Package__AnnotationTypesAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__AnnotationTypesAssignment_5_0_in_rule__Package__Group_5__0__Impl1441);
            rule__Package__AnnotationTypesAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getAnnotationTypesAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__0__Impl"


    // $ANTLR start "rule__Package__Group_5__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:753:1: rule__Package__Group_5__1 : rule__Package__Group_5__1__Impl ;
    public final void rule__Package__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:757:1: ( rule__Package__Group_5__1__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:758:2: rule__Package__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__1__Impl_in_rule__Package__Group_5__11471);
            rule__Package__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__1"


    // $ANTLR start "rule__Package__Group_5__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:764:1: rule__Package__Group_5__1__Impl : ( ( rule__Package__Group_5_1__0 )* ) ;
    public final void rule__Package__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:768:1: ( ( ( rule__Package__Group_5_1__0 )* ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:769:1: ( ( rule__Package__Group_5_1__0 )* )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:769:1: ( ( rule__Package__Group_5_1__0 )* )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:770:1: ( rule__Package__Group_5_1__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_5_1()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:771:1: ( rule__Package__Group_5_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:771:2: rule__Package__Group_5_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5_1__0_in_rule__Package__Group_5__1__Impl1498);
            	    rule__Package__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__1__Impl"


    // $ANTLR start "rule__Package__Group_5_1__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:785:1: rule__Package__Group_5_1__0 : rule__Package__Group_5_1__0__Impl rule__Package__Group_5_1__1 ;
    public final void rule__Package__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:789:1: ( rule__Package__Group_5_1__0__Impl rule__Package__Group_5_1__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:790:2: rule__Package__Group_5_1__0__Impl rule__Package__Group_5_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5_1__0__Impl_in_rule__Package__Group_5_1__01533);
            rule__Package__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5_1__1_in_rule__Package__Group_5_1__01536);
            rule__Package__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5_1__0"


    // $ANTLR start "rule__Package__Group_5_1__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:797:1: rule__Package__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__Package__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:801:1: ( ( ',' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:802:1: ( ',' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:802:1: ( ',' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:803:1: ','
            {
             before(grammarAccess.getPackageAccess().getCommaKeyword_5_1_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Package__Group_5_1__0__Impl1564); 
             after(grammarAccess.getPackageAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5_1__0__Impl"


    // $ANTLR start "rule__Package__Group_5_1__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:816:1: rule__Package__Group_5_1__1 : rule__Package__Group_5_1__1__Impl ;
    public final void rule__Package__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:820:1: ( rule__Package__Group_5_1__1__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:821:2: rule__Package__Group_5_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5_1__1__Impl_in_rule__Package__Group_5_1__11595);
            rule__Package__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5_1__1"


    // $ANTLR start "rule__Package__Group_5_1__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:827:1: rule__Package__Group_5_1__1__Impl : ( ( rule__Package__AnnotationTypesAssignment_5_1_1 ) ) ;
    public final void rule__Package__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:831:1: ( ( ( rule__Package__AnnotationTypesAssignment_5_1_1 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:832:1: ( ( rule__Package__AnnotationTypesAssignment_5_1_1 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:832:1: ( ( rule__Package__AnnotationTypesAssignment_5_1_1 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:833:1: ( rule__Package__AnnotationTypesAssignment_5_1_1 )
            {
             before(grammarAccess.getPackageAccess().getAnnotationTypesAssignment_5_1_1()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:834:1: ( rule__Package__AnnotationTypesAssignment_5_1_1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:834:2: rule__Package__AnnotationTypesAssignment_5_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__AnnotationTypesAssignment_5_1_1_in_rule__Package__Group_5_1__1__Impl1622);
            rule__Package__AnnotationTypesAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getAnnotationTypesAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5_1__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:851:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:855:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:856:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__01659);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Type__Group__1_in_rule__Type__Group__01662);
            rule__Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:863:1: rule__Type__Group__0__Impl : ( () ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:867:1: ( ( () ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:868:1: ( () )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:868:1: ( () )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:869:1: ()
            {
             before(grammarAccess.getTypeAccess().getTypeAction_0()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:870:1: ()
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:872:1: 
            {
            }

             after(grammarAccess.getTypeAccess().getTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:882:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:886:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:887:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__11720);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Type__Group__2_in_rule__Type__Group__11723);
            rule__Type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:894:1: rule__Type__Group__1__Impl : ( 'Type' ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:898:1: ( ( 'Type' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:899:1: ( 'Type' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:899:1: ( 'Type' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:900:1: 'Type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Type__Group__1__Impl1751); 
             after(grammarAccess.getTypeAccess().getTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:913:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:917:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:918:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group__2__Impl_in_rule__Type__Group__21782);
            rule__Type__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Type__Group__3_in_rule__Type__Group__21785);
            rule__Type__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2"


    // $ANTLR start "rule__Type__Group__2__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:925:1: rule__Type__Group__2__Impl : ( ( rule__Type__NameAssignment_2 ) ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:929:1: ( ( ( rule__Type__NameAssignment_2 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:930:1: ( ( rule__Type__NameAssignment_2 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:930:1: ( ( rule__Type__NameAssignment_2 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:931:1: ( rule__Type__NameAssignment_2 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_2()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:932:1: ( rule__Type__NameAssignment_2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:932:2: rule__Type__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__NameAssignment_2_in_rule__Type__Group__2__Impl1812);
            rule__Type__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2__Impl"


    // $ANTLR start "rule__Type__Group__3"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:942:1: rule__Type__Group__3 : rule__Type__Group__3__Impl ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:946:1: ( rule__Type__Group__3__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:947:2: rule__Type__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group__3__Impl_in_rule__Type__Group__31842);
            rule__Type__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__3"


    // $ANTLR start "rule__Type__Group__3__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:953:1: rule__Type__Group__3__Impl : ( ';' ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:957:1: ( ( ';' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:958:1: ( ';' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:958:1: ( ';' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:959:1: ';'
            {
             before(grammarAccess.getTypeAccess().getSemicolonKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Type__Group__3__Impl1870); 
             after(grammarAccess.getTypeAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__3__Impl"


    // $ANTLR start "rule__AnnotationType__Group__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:980:1: rule__AnnotationType__Group__0 : rule__AnnotationType__Group__0__Impl rule__AnnotationType__Group__1 ;
    public final void rule__AnnotationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:984:1: ( rule__AnnotationType__Group__0__Impl rule__AnnotationType__Group__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:985:2: rule__AnnotationType__Group__0__Impl rule__AnnotationType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__0__Impl_in_rule__AnnotationType__Group__01909);
            rule__AnnotationType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__1_in_rule__AnnotationType__Group__01912);
            rule__AnnotationType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group__0"


    // $ANTLR start "rule__AnnotationType__Group__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:992:1: rule__AnnotationType__Group__0__Impl : ( () ) ;
    public final void rule__AnnotationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:996:1: ( ( () ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:997:1: ( () )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:997:1: ( () )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:998:1: ()
            {
             before(grammarAccess.getAnnotationTypeAccess().getAnnotationTypeAction_0()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:999:1: ()
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1001:1: 
            {
            }

             after(grammarAccess.getAnnotationTypeAccess().getAnnotationTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group__0__Impl"


    // $ANTLR start "rule__AnnotationType__Group__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1011:1: rule__AnnotationType__Group__1 : rule__AnnotationType__Group__1__Impl rule__AnnotationType__Group__2 ;
    public final void rule__AnnotationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1015:1: ( rule__AnnotationType__Group__1__Impl rule__AnnotationType__Group__2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1016:2: rule__AnnotationType__Group__1__Impl rule__AnnotationType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__1__Impl_in_rule__AnnotationType__Group__11970);
            rule__AnnotationType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__2_in_rule__AnnotationType__Group__11973);
            rule__AnnotationType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group__1"


    // $ANTLR start "rule__AnnotationType__Group__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1023:1: rule__AnnotationType__Group__1__Impl : ( '@annotation' ) ;
    public final void rule__AnnotationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1027:1: ( ( '@annotation' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1028:1: ( '@annotation' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1028:1: ( '@annotation' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1029:1: '@annotation'
            {
             before(grammarAccess.getAnnotationTypeAccess().getAnnotationKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__AnnotationType__Group__1__Impl2001); 
             after(grammarAccess.getAnnotationTypeAccess().getAnnotationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group__1__Impl"


    // $ANTLR start "rule__AnnotationType__Group__2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1042:1: rule__AnnotationType__Group__2 : rule__AnnotationType__Group__2__Impl rule__AnnotationType__Group__3 ;
    public final void rule__AnnotationType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1046:1: ( rule__AnnotationType__Group__2__Impl rule__AnnotationType__Group__3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1047:2: rule__AnnotationType__Group__2__Impl rule__AnnotationType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__2__Impl_in_rule__AnnotationType__Group__22032);
            rule__AnnotationType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__3_in_rule__AnnotationType__Group__22035);
            rule__AnnotationType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group__2"


    // $ANTLR start "rule__AnnotationType__Group__2__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1054:1: rule__AnnotationType__Group__2__Impl : ( ( rule__AnnotationType__NameAssignment_2 ) ) ;
    public final void rule__AnnotationType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1058:1: ( ( ( rule__AnnotationType__NameAssignment_2 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1059:1: ( ( rule__AnnotationType__NameAssignment_2 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1059:1: ( ( rule__AnnotationType__NameAssignment_2 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1060:1: ( rule__AnnotationType__NameAssignment_2 )
            {
             before(grammarAccess.getAnnotationTypeAccess().getNameAssignment_2()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1061:1: ( rule__AnnotationType__NameAssignment_2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1061:2: rule__AnnotationType__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__NameAssignment_2_in_rule__AnnotationType__Group__2__Impl2062);
            rule__AnnotationType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group__2__Impl"


    // $ANTLR start "rule__AnnotationType__Group__3"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1071:1: rule__AnnotationType__Group__3 : rule__AnnotationType__Group__3__Impl rule__AnnotationType__Group__4 ;
    public final void rule__AnnotationType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1075:1: ( rule__AnnotationType__Group__3__Impl rule__AnnotationType__Group__4 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1076:2: rule__AnnotationType__Group__3__Impl rule__AnnotationType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__3__Impl_in_rule__AnnotationType__Group__32092);
            rule__AnnotationType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__4_in_rule__AnnotationType__Group__32095);
            rule__AnnotationType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group__3"


    // $ANTLR start "rule__AnnotationType__Group__3__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1083:1: rule__AnnotationType__Group__3__Impl : ( ( rule__AnnotationType__Group_3__0 )? ) ;
    public final void rule__AnnotationType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1087:1: ( ( ( rule__AnnotationType__Group_3__0 )? ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1088:1: ( ( rule__AnnotationType__Group_3__0 )? )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1088:1: ( ( rule__AnnotationType__Group_3__0 )? )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1089:1: ( rule__AnnotationType__Group_3__0 )?
            {
             before(grammarAccess.getAnnotationTypeAccess().getGroup_3()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1090:1: ( rule__AnnotationType__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1090:2: rule__AnnotationType__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_3__0_in_rule__AnnotationType__Group__3__Impl2122);
                    rule__AnnotationType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnotationTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group__3__Impl"


    // $ANTLR start "rule__AnnotationType__Group__4"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1100:1: rule__AnnotationType__Group__4 : rule__AnnotationType__Group__4__Impl rule__AnnotationType__Group__5 ;
    public final void rule__AnnotationType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1104:1: ( rule__AnnotationType__Group__4__Impl rule__AnnotationType__Group__5 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1105:2: rule__AnnotationType__Group__4__Impl rule__AnnotationType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__4__Impl_in_rule__AnnotationType__Group__42153);
            rule__AnnotationType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__5_in_rule__AnnotationType__Group__42156);
            rule__AnnotationType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group__4"


    // $ANTLR start "rule__AnnotationType__Group__4__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1112:1: rule__AnnotationType__Group__4__Impl : ( '{' ) ;
    public final void rule__AnnotationType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1116:1: ( ( '{' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1117:1: ( '{' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1117:1: ( '{' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1118:1: '{'
            {
             before(grammarAccess.getAnnotationTypeAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__AnnotationType__Group__4__Impl2184); 
             after(grammarAccess.getAnnotationTypeAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group__4__Impl"


    // $ANTLR start "rule__AnnotationType__Group__5"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1131:1: rule__AnnotationType__Group__5 : rule__AnnotationType__Group__5__Impl rule__AnnotationType__Group__6 ;
    public final void rule__AnnotationType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1135:1: ( rule__AnnotationType__Group__5__Impl rule__AnnotationType__Group__6 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1136:2: rule__AnnotationType__Group__5__Impl rule__AnnotationType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__5__Impl_in_rule__AnnotationType__Group__52215);
            rule__AnnotationType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__6_in_rule__AnnotationType__Group__52218);
            rule__AnnotationType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group__5"


    // $ANTLR start "rule__AnnotationType__Group__5__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1143:1: rule__AnnotationType__Group__5__Impl : ( ( rule__AnnotationType__Group_5__0 )? ) ;
    public final void rule__AnnotationType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1147:1: ( ( ( rule__AnnotationType__Group_5__0 )? ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1148:1: ( ( rule__AnnotationType__Group_5__0 )? )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1148:1: ( ( rule__AnnotationType__Group_5__0 )? )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1149:1: ( rule__AnnotationType__Group_5__0 )?
            {
             before(grammarAccess.getAnnotationTypeAccess().getGroup_5()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1150:1: ( rule__AnnotationType__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1150:2: rule__AnnotationType__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_5__0_in_rule__AnnotationType__Group__5__Impl2245);
                    rule__AnnotationType__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnotationTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group__5__Impl"


    // $ANTLR start "rule__AnnotationType__Group__6"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1160:1: rule__AnnotationType__Group__6 : rule__AnnotationType__Group__6__Impl ;
    public final void rule__AnnotationType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1164:1: ( rule__AnnotationType__Group__6__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1165:2: rule__AnnotationType__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__6__Impl_in_rule__AnnotationType__Group__62276);
            rule__AnnotationType__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group__6"


    // $ANTLR start "rule__AnnotationType__Group__6__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1171:1: rule__AnnotationType__Group__6__Impl : ( '}' ) ;
    public final void rule__AnnotationType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1175:1: ( ( '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1176:1: ( '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1176:1: ( '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1177:1: '}'
            {
             before(grammarAccess.getAnnotationTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__AnnotationType__Group__6__Impl2304); 
             after(grammarAccess.getAnnotationTypeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group__6__Impl"


    // $ANTLR start "rule__AnnotationType__Group_3__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1204:1: rule__AnnotationType__Group_3__0 : rule__AnnotationType__Group_3__0__Impl rule__AnnotationType__Group_3__1 ;
    public final void rule__AnnotationType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1208:1: ( rule__AnnotationType__Group_3__0__Impl rule__AnnotationType__Group_3__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1209:2: rule__AnnotationType__Group_3__0__Impl rule__AnnotationType__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_3__0__Impl_in_rule__AnnotationType__Group_3__02349);
            rule__AnnotationType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_3__1_in_rule__AnnotationType__Group_3__02352);
            rule__AnnotationType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_3__0"


    // $ANTLR start "rule__AnnotationType__Group_3__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1216:1: rule__AnnotationType__Group_3__0__Impl : ( 'context' ) ;
    public final void rule__AnnotationType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1220:1: ( ( 'context' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1221:1: ( 'context' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1221:1: ( 'context' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1222:1: 'context'
            {
             before(grammarAccess.getAnnotationTypeAccess().getContextKeyword_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__AnnotationType__Group_3__0__Impl2380); 
             after(grammarAccess.getAnnotationTypeAccess().getContextKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_3__0__Impl"


    // $ANTLR start "rule__AnnotationType__Group_3__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1235:1: rule__AnnotationType__Group_3__1 : rule__AnnotationType__Group_3__1__Impl ;
    public final void rule__AnnotationType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1239:1: ( rule__AnnotationType__Group_3__1__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1240:2: rule__AnnotationType__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_3__1__Impl_in_rule__AnnotationType__Group_3__12411);
            rule__AnnotationType__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_3__1"


    // $ANTLR start "rule__AnnotationType__Group_3__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1246:1: rule__AnnotationType__Group_3__1__Impl : ( ( rule__AnnotationType__ContextAssignment_3_1 ) ) ;
    public final void rule__AnnotationType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1250:1: ( ( ( rule__AnnotationType__ContextAssignment_3_1 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1251:1: ( ( rule__AnnotationType__ContextAssignment_3_1 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1251:1: ( ( rule__AnnotationType__ContextAssignment_3_1 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1252:1: ( rule__AnnotationType__ContextAssignment_3_1 )
            {
             before(grammarAccess.getAnnotationTypeAccess().getContextAssignment_3_1()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1253:1: ( rule__AnnotationType__ContextAssignment_3_1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1253:2: rule__AnnotationType__ContextAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__ContextAssignment_3_1_in_rule__AnnotationType__Group_3__1__Impl2438);
            rule__AnnotationType__ContextAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationTypeAccess().getContextAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_3__1__Impl"


    // $ANTLR start "rule__AnnotationType__Group_5__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1267:1: rule__AnnotationType__Group_5__0 : rule__AnnotationType__Group_5__0__Impl rule__AnnotationType__Group_5__1 ;
    public final void rule__AnnotationType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1271:1: ( rule__AnnotationType__Group_5__0__Impl rule__AnnotationType__Group_5__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1272:2: rule__AnnotationType__Group_5__0__Impl rule__AnnotationType__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_5__0__Impl_in_rule__AnnotationType__Group_5__02472);
            rule__AnnotationType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_5__1_in_rule__AnnotationType__Group_5__02475);
            rule__AnnotationType__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_5__0"


    // $ANTLR start "rule__AnnotationType__Group_5__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1279:1: rule__AnnotationType__Group_5__0__Impl : ( ( rule__AnnotationType__AttributesAssignment_5_0 ) ) ;
    public final void rule__AnnotationType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1283:1: ( ( ( rule__AnnotationType__AttributesAssignment_5_0 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1284:1: ( ( rule__AnnotationType__AttributesAssignment_5_0 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1284:1: ( ( rule__AnnotationType__AttributesAssignment_5_0 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1285:1: ( rule__AnnotationType__AttributesAssignment_5_0 )
            {
             before(grammarAccess.getAnnotationTypeAccess().getAttributesAssignment_5_0()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1286:1: ( rule__AnnotationType__AttributesAssignment_5_0 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1286:2: rule__AnnotationType__AttributesAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__AttributesAssignment_5_0_in_rule__AnnotationType__Group_5__0__Impl2502);
            rule__AnnotationType__AttributesAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationTypeAccess().getAttributesAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_5__0__Impl"


    // $ANTLR start "rule__AnnotationType__Group_5__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1296:1: rule__AnnotationType__Group_5__1 : rule__AnnotationType__Group_5__1__Impl ;
    public final void rule__AnnotationType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1300:1: ( rule__AnnotationType__Group_5__1__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1301:2: rule__AnnotationType__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_5__1__Impl_in_rule__AnnotationType__Group_5__12532);
            rule__AnnotationType__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_5__1"


    // $ANTLR start "rule__AnnotationType__Group_5__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1307:1: rule__AnnotationType__Group_5__1__Impl : ( ( rule__AnnotationType__Group_5_1__0 )* ) ;
    public final void rule__AnnotationType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1311:1: ( ( ( rule__AnnotationType__Group_5_1__0 )* ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1312:1: ( ( rule__AnnotationType__Group_5_1__0 )* )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1312:1: ( ( rule__AnnotationType__Group_5_1__0 )* )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1313:1: ( rule__AnnotationType__Group_5_1__0 )*
            {
             before(grammarAccess.getAnnotationTypeAccess().getGroup_5_1()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1314:1: ( rule__AnnotationType__Group_5_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1314:2: rule__AnnotationType__Group_5_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_5_1__0_in_rule__AnnotationType__Group_5__1__Impl2559);
            	    rule__AnnotationType__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getAnnotationTypeAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_5__1__Impl"


    // $ANTLR start "rule__AnnotationType__Group_5_1__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1328:1: rule__AnnotationType__Group_5_1__0 : rule__AnnotationType__Group_5_1__0__Impl rule__AnnotationType__Group_5_1__1 ;
    public final void rule__AnnotationType__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1332:1: ( rule__AnnotationType__Group_5_1__0__Impl rule__AnnotationType__Group_5_1__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1333:2: rule__AnnotationType__Group_5_1__0__Impl rule__AnnotationType__Group_5_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_5_1__0__Impl_in_rule__AnnotationType__Group_5_1__02594);
            rule__AnnotationType__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_5_1__1_in_rule__AnnotationType__Group_5_1__02597);
            rule__AnnotationType__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_5_1__0"


    // $ANTLR start "rule__AnnotationType__Group_5_1__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1340:1: rule__AnnotationType__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__AnnotationType__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1344:1: ( ( ',' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1345:1: ( ',' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1345:1: ( ',' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1346:1: ','
            {
             before(grammarAccess.getAnnotationTypeAccess().getCommaKeyword_5_1_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__AnnotationType__Group_5_1__0__Impl2625); 
             after(grammarAccess.getAnnotationTypeAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_5_1__0__Impl"


    // $ANTLR start "rule__AnnotationType__Group_5_1__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1359:1: rule__AnnotationType__Group_5_1__1 : rule__AnnotationType__Group_5_1__1__Impl ;
    public final void rule__AnnotationType__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1363:1: ( rule__AnnotationType__Group_5_1__1__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1364:2: rule__AnnotationType__Group_5_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_5_1__1__Impl_in_rule__AnnotationType__Group_5_1__12656);
            rule__AnnotationType__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_5_1__1"


    // $ANTLR start "rule__AnnotationType__Group_5_1__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1370:1: rule__AnnotationType__Group_5_1__1__Impl : ( ( rule__AnnotationType__AttributesAssignment_5_1_1 ) ) ;
    public final void rule__AnnotationType__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1374:1: ( ( ( rule__AnnotationType__AttributesAssignment_5_1_1 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1375:1: ( ( rule__AnnotationType__AttributesAssignment_5_1_1 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1375:1: ( ( rule__AnnotationType__AttributesAssignment_5_1_1 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1376:1: ( rule__AnnotationType__AttributesAssignment_5_1_1 )
            {
             before(grammarAccess.getAnnotationTypeAccess().getAttributesAssignment_5_1_1()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1377:1: ( rule__AnnotationType__AttributesAssignment_5_1_1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1377:2: rule__AnnotationType__AttributesAssignment_5_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__AttributesAssignment_5_1_1_in_rule__AnnotationType__Group_5_1__1__Impl2683);
            rule__AnnotationType__AttributesAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationTypeAccess().getAttributesAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_5_1__1__Impl"


    // $ANTLR start "rule__AnnotationAttribute__Group__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1391:1: rule__AnnotationAttribute__Group__0 : rule__AnnotationAttribute__Group__0__Impl rule__AnnotationAttribute__Group__1 ;
    public final void rule__AnnotationAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1395:1: ( rule__AnnotationAttribute__Group__0__Impl rule__AnnotationAttribute__Group__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1396:2: rule__AnnotationAttribute__Group__0__Impl rule__AnnotationAttribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__0__Impl_in_rule__AnnotationAttribute__Group__02717);
            rule__AnnotationAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__1_in_rule__AnnotationAttribute__Group__02720);
            rule__AnnotationAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationAttribute__Group__0"


    // $ANTLR start "rule__AnnotationAttribute__Group__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1403:1: rule__AnnotationAttribute__Group__0__Impl : ( 'AnnotationAttribute' ) ;
    public final void rule__AnnotationAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1407:1: ( ( 'AnnotationAttribute' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1408:1: ( 'AnnotationAttribute' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1408:1: ( 'AnnotationAttribute' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1409:1: 'AnnotationAttribute'
            {
             before(grammarAccess.getAnnotationAttributeAccess().getAnnotationAttributeKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__AnnotationAttribute__Group__0__Impl2748); 
             after(grammarAccess.getAnnotationAttributeAccess().getAnnotationAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationAttribute__Group__0__Impl"


    // $ANTLR start "rule__AnnotationAttribute__Group__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1422:1: rule__AnnotationAttribute__Group__1 : rule__AnnotationAttribute__Group__1__Impl rule__AnnotationAttribute__Group__2 ;
    public final void rule__AnnotationAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1426:1: ( rule__AnnotationAttribute__Group__1__Impl rule__AnnotationAttribute__Group__2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1427:2: rule__AnnotationAttribute__Group__1__Impl rule__AnnotationAttribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__1__Impl_in_rule__AnnotationAttribute__Group__12779);
            rule__AnnotationAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__2_in_rule__AnnotationAttribute__Group__12782);
            rule__AnnotationAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationAttribute__Group__1"


    // $ANTLR start "rule__AnnotationAttribute__Group__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1434:1: rule__AnnotationAttribute__Group__1__Impl : ( '{' ) ;
    public final void rule__AnnotationAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1438:1: ( ( '{' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1439:1: ( '{' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1439:1: ( '{' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1440:1: '{'
            {
             before(grammarAccess.getAnnotationAttributeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__AnnotationAttribute__Group__1__Impl2810); 
             after(grammarAccess.getAnnotationAttributeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationAttribute__Group__1__Impl"


    // $ANTLR start "rule__AnnotationAttribute__Group__2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1453:1: rule__AnnotationAttribute__Group__2 : rule__AnnotationAttribute__Group__2__Impl rule__AnnotationAttribute__Group__3 ;
    public final void rule__AnnotationAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1457:1: ( rule__AnnotationAttribute__Group__2__Impl rule__AnnotationAttribute__Group__3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1458:2: rule__AnnotationAttribute__Group__2__Impl rule__AnnotationAttribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__2__Impl_in_rule__AnnotationAttribute__Group__22841);
            rule__AnnotationAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__3_in_rule__AnnotationAttribute__Group__22844);
            rule__AnnotationAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationAttribute__Group__2"


    // $ANTLR start "rule__AnnotationAttribute__Group__2__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1465:1: rule__AnnotationAttribute__Group__2__Impl : ( 'attribute' ) ;
    public final void rule__AnnotationAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1469:1: ( ( 'attribute' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1470:1: ( 'attribute' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1470:1: ( 'attribute' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1471:1: 'attribute'
            {
             before(grammarAccess.getAnnotationAttributeAccess().getAttributeKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__AnnotationAttribute__Group__2__Impl2872); 
             after(grammarAccess.getAnnotationAttributeAccess().getAttributeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationAttribute__Group__2__Impl"


    // $ANTLR start "rule__AnnotationAttribute__Group__3"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1484:1: rule__AnnotationAttribute__Group__3 : rule__AnnotationAttribute__Group__3__Impl rule__AnnotationAttribute__Group__4 ;
    public final void rule__AnnotationAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1488:1: ( rule__AnnotationAttribute__Group__3__Impl rule__AnnotationAttribute__Group__4 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1489:2: rule__AnnotationAttribute__Group__3__Impl rule__AnnotationAttribute__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__3__Impl_in_rule__AnnotationAttribute__Group__32903);
            rule__AnnotationAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__4_in_rule__AnnotationAttribute__Group__32906);
            rule__AnnotationAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationAttribute__Group__3"


    // $ANTLR start "rule__AnnotationAttribute__Group__3__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1496:1: rule__AnnotationAttribute__Group__3__Impl : ( ( rule__AnnotationAttribute__AttributeAssignment_3 ) ) ;
    public final void rule__AnnotationAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1500:1: ( ( ( rule__AnnotationAttribute__AttributeAssignment_3 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1501:1: ( ( rule__AnnotationAttribute__AttributeAssignment_3 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1501:1: ( ( rule__AnnotationAttribute__AttributeAssignment_3 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1502:1: ( rule__AnnotationAttribute__AttributeAssignment_3 )
            {
             before(grammarAccess.getAnnotationAttributeAccess().getAttributeAssignment_3()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1503:1: ( rule__AnnotationAttribute__AttributeAssignment_3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1503:2: rule__AnnotationAttribute__AttributeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__AttributeAssignment_3_in_rule__AnnotationAttribute__Group__3__Impl2933);
            rule__AnnotationAttribute__AttributeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAttributeAccess().getAttributeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationAttribute__Group__3__Impl"


    // $ANTLR start "rule__AnnotationAttribute__Group__4"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1513:1: rule__AnnotationAttribute__Group__4 : rule__AnnotationAttribute__Group__4__Impl rule__AnnotationAttribute__Group__5 ;
    public final void rule__AnnotationAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1517:1: ( rule__AnnotationAttribute__Group__4__Impl rule__AnnotationAttribute__Group__5 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1518:2: rule__AnnotationAttribute__Group__4__Impl rule__AnnotationAttribute__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__4__Impl_in_rule__AnnotationAttribute__Group__42963);
            rule__AnnotationAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__5_in_rule__AnnotationAttribute__Group__42966);
            rule__AnnotationAttribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationAttribute__Group__4"


    // $ANTLR start "rule__AnnotationAttribute__Group__4__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1525:1: rule__AnnotationAttribute__Group__4__Impl : ( ( rule__AnnotationAttribute__Group_4__0 )? ) ;
    public final void rule__AnnotationAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1529:1: ( ( ( rule__AnnotationAttribute__Group_4__0 )? ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1530:1: ( ( rule__AnnotationAttribute__Group_4__0 )? )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1530:1: ( ( rule__AnnotationAttribute__Group_4__0 )? )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1531:1: ( rule__AnnotationAttribute__Group_4__0 )?
            {
             before(grammarAccess.getAnnotationAttributeAccess().getGroup_4()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1532:1: ( rule__AnnotationAttribute__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1532:2: rule__AnnotationAttribute__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group_4__0_in_rule__AnnotationAttribute__Group__4__Impl2993);
                    rule__AnnotationAttribute__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnotationAttributeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationAttribute__Group__4__Impl"


    // $ANTLR start "rule__AnnotationAttribute__Group__5"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1542:1: rule__AnnotationAttribute__Group__5 : rule__AnnotationAttribute__Group__5__Impl ;
    public final void rule__AnnotationAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1546:1: ( rule__AnnotationAttribute__Group__5__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1547:2: rule__AnnotationAttribute__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__5__Impl_in_rule__AnnotationAttribute__Group__53024);
            rule__AnnotationAttribute__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationAttribute__Group__5"


    // $ANTLR start "rule__AnnotationAttribute__Group__5__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1553:1: rule__AnnotationAttribute__Group__5__Impl : ( '}' ) ;
    public final void rule__AnnotationAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1557:1: ( ( '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1558:1: ( '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1558:1: ( '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1559:1: '}'
            {
             before(grammarAccess.getAnnotationAttributeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__AnnotationAttribute__Group__5__Impl3052); 
             after(grammarAccess.getAnnotationAttributeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationAttribute__Group__5__Impl"


    // $ANTLR start "rule__AnnotationAttribute__Group_4__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1584:1: rule__AnnotationAttribute__Group_4__0 : rule__AnnotationAttribute__Group_4__0__Impl rule__AnnotationAttribute__Group_4__1 ;
    public final void rule__AnnotationAttribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1588:1: ( rule__AnnotationAttribute__Group_4__0__Impl rule__AnnotationAttribute__Group_4__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1589:2: rule__AnnotationAttribute__Group_4__0__Impl rule__AnnotationAttribute__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group_4__0__Impl_in_rule__AnnotationAttribute__Group_4__03095);
            rule__AnnotationAttribute__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group_4__1_in_rule__AnnotationAttribute__Group_4__03098);
            rule__AnnotationAttribute__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationAttribute__Group_4__0"


    // $ANTLR start "rule__AnnotationAttribute__Group_4__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1596:1: rule__AnnotationAttribute__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__AnnotationAttribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1600:1: ( ( 'value' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1601:1: ( 'value' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1601:1: ( 'value' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1602:1: 'value'
            {
             before(grammarAccess.getAnnotationAttributeAccess().getValueKeyword_4_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__AnnotationAttribute__Group_4__0__Impl3126); 
             after(grammarAccess.getAnnotationAttributeAccess().getValueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationAttribute__Group_4__0__Impl"


    // $ANTLR start "rule__AnnotationAttribute__Group_4__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1615:1: rule__AnnotationAttribute__Group_4__1 : rule__AnnotationAttribute__Group_4__1__Impl ;
    public final void rule__AnnotationAttribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1619:1: ( rule__AnnotationAttribute__Group_4__1__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1620:2: rule__AnnotationAttribute__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group_4__1__Impl_in_rule__AnnotationAttribute__Group_4__13157);
            rule__AnnotationAttribute__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationAttribute__Group_4__1"


    // $ANTLR start "rule__AnnotationAttribute__Group_4__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1626:1: rule__AnnotationAttribute__Group_4__1__Impl : ( ( rule__AnnotationAttribute__ValueAssignment_4_1 ) ) ;
    public final void rule__AnnotationAttribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1630:1: ( ( ( rule__AnnotationAttribute__ValueAssignment_4_1 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1631:1: ( ( rule__AnnotationAttribute__ValueAssignment_4_1 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1631:1: ( ( rule__AnnotationAttribute__ValueAssignment_4_1 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1632:1: ( rule__AnnotationAttribute__ValueAssignment_4_1 )
            {
             before(grammarAccess.getAnnotationAttributeAccess().getValueAssignment_4_1()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1633:1: ( rule__AnnotationAttribute__ValueAssignment_4_1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1633:2: rule__AnnotationAttribute__ValueAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__ValueAssignment_4_1_in_rule__AnnotationAttribute__Group_4__1__Impl3184);
            rule__AnnotationAttribute__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAttributeAccess().getValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationAttribute__Group_4__1__Impl"


    // $ANTLR start "rule__AnnotationTypeAttribute__Group__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1647:1: rule__AnnotationTypeAttribute__Group__0 : rule__AnnotationTypeAttribute__Group__0__Impl rule__AnnotationTypeAttribute__Group__1 ;
    public final void rule__AnnotationTypeAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1651:1: ( rule__AnnotationTypeAttribute__Group__0__Impl rule__AnnotationTypeAttribute__Group__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1652:2: rule__AnnotationTypeAttribute__Group__0__Impl rule__AnnotationTypeAttribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group__0__Impl_in_rule__AnnotationTypeAttribute__Group__03218);
            rule__AnnotationTypeAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group__1_in_rule__AnnotationTypeAttribute__Group__03221);
            rule__AnnotationTypeAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationTypeAttribute__Group__0"


    // $ANTLR start "rule__AnnotationTypeAttribute__Group__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1659:1: rule__AnnotationTypeAttribute__Group__0__Impl : ( () ) ;
    public final void rule__AnnotationTypeAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1663:1: ( ( () ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1664:1: ( () )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1664:1: ( () )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1665:1: ()
            {
             before(grammarAccess.getAnnotationTypeAttributeAccess().getAnnotationTypeAttributeAction_0()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1666:1: ()
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1668:1: 
            {
            }

             after(grammarAccess.getAnnotationTypeAttributeAccess().getAnnotationTypeAttributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationTypeAttribute__Group__0__Impl"


    // $ANTLR start "rule__AnnotationTypeAttribute__Group__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1678:1: rule__AnnotationTypeAttribute__Group__1 : rule__AnnotationTypeAttribute__Group__1__Impl rule__AnnotationTypeAttribute__Group__2 ;
    public final void rule__AnnotationTypeAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1682:1: ( rule__AnnotationTypeAttribute__Group__1__Impl rule__AnnotationTypeAttribute__Group__2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1683:2: rule__AnnotationTypeAttribute__Group__1__Impl rule__AnnotationTypeAttribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group__1__Impl_in_rule__AnnotationTypeAttribute__Group__13279);
            rule__AnnotationTypeAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group__2_in_rule__AnnotationTypeAttribute__Group__13282);
            rule__AnnotationTypeAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationTypeAttribute__Group__1"


    // $ANTLR start "rule__AnnotationTypeAttribute__Group__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1690:1: rule__AnnotationTypeAttribute__Group__1__Impl : ( ( rule__AnnotationTypeAttribute__NameAssignment_1 ) ) ;
    public final void rule__AnnotationTypeAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1694:1: ( ( ( rule__AnnotationTypeAttribute__NameAssignment_1 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1695:1: ( ( rule__AnnotationTypeAttribute__NameAssignment_1 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1695:1: ( ( rule__AnnotationTypeAttribute__NameAssignment_1 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1696:1: ( rule__AnnotationTypeAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getAnnotationTypeAttributeAccess().getNameAssignment_1()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1697:1: ( rule__AnnotationTypeAttribute__NameAssignment_1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1697:2: rule__AnnotationTypeAttribute__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__NameAssignment_1_in_rule__AnnotationTypeAttribute__Group__1__Impl3309);
            rule__AnnotationTypeAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationTypeAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationTypeAttribute__Group__1__Impl"


    // $ANTLR start "rule__AnnotationTypeAttribute__Group__2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1707:1: rule__AnnotationTypeAttribute__Group__2 : rule__AnnotationTypeAttribute__Group__2__Impl rule__AnnotationTypeAttribute__Group__3 ;
    public final void rule__AnnotationTypeAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1711:1: ( rule__AnnotationTypeAttribute__Group__2__Impl rule__AnnotationTypeAttribute__Group__3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1712:2: rule__AnnotationTypeAttribute__Group__2__Impl rule__AnnotationTypeAttribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group__2__Impl_in_rule__AnnotationTypeAttribute__Group__23339);
            rule__AnnotationTypeAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group__3_in_rule__AnnotationTypeAttribute__Group__23342);
            rule__AnnotationTypeAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationTypeAttribute__Group__2"


    // $ANTLR start "rule__AnnotationTypeAttribute__Group__2__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1719:1: rule__AnnotationTypeAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__AnnotationTypeAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1723:1: ( ( ':' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1724:1: ( ':' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1724:1: ( ':' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1725:1: ':'
            {
             before(grammarAccess.getAnnotationTypeAttributeAccess().getColonKeyword_2()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__AnnotationTypeAttribute__Group__2__Impl3370); 
             after(grammarAccess.getAnnotationTypeAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationTypeAttribute__Group__2__Impl"


    // $ANTLR start "rule__AnnotationTypeAttribute__Group__3"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1738:1: rule__AnnotationTypeAttribute__Group__3 : rule__AnnotationTypeAttribute__Group__3__Impl ;
    public final void rule__AnnotationTypeAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1742:1: ( rule__AnnotationTypeAttribute__Group__3__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1743:2: rule__AnnotationTypeAttribute__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group__3__Impl_in_rule__AnnotationTypeAttribute__Group__33401);
            rule__AnnotationTypeAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationTypeAttribute__Group__3"


    // $ANTLR start "rule__AnnotationTypeAttribute__Group__3__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1749:1: rule__AnnotationTypeAttribute__Group__3__Impl : ( ( rule__AnnotationTypeAttribute__TypeAssignment_3 ) ) ;
    public final void rule__AnnotationTypeAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1753:1: ( ( ( rule__AnnotationTypeAttribute__TypeAssignment_3 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1754:1: ( ( rule__AnnotationTypeAttribute__TypeAssignment_3 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1754:1: ( ( rule__AnnotationTypeAttribute__TypeAssignment_3 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1755:1: ( rule__AnnotationTypeAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getAnnotationTypeAttributeAccess().getTypeAssignment_3()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1756:1: ( rule__AnnotationTypeAttribute__TypeAssignment_3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1756:2: rule__AnnotationTypeAttribute__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__TypeAssignment_3_in_rule__AnnotationTypeAttribute__Group__3__Impl3428);
            rule__AnnotationTypeAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationTypeAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationTypeAttribute__Group__3__Impl"


    // $ANTLR start "rule__SimpleValue__Group__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1774:1: rule__SimpleValue__Group__0 : rule__SimpleValue__Group__0__Impl rule__SimpleValue__Group__1 ;
    public final void rule__SimpleValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1778:1: ( rule__SimpleValue__Group__0__Impl rule__SimpleValue__Group__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1779:2: rule__SimpleValue__Group__0__Impl rule__SimpleValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__0__Impl_in_rule__SimpleValue__Group__03466);
            rule__SimpleValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__1_in_rule__SimpleValue__Group__03469);
            rule__SimpleValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValue__Group__0"


    // $ANTLR start "rule__SimpleValue__Group__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1786:1: rule__SimpleValue__Group__0__Impl : ( () ) ;
    public final void rule__SimpleValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1790:1: ( ( () ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1791:1: ( () )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1791:1: ( () )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1792:1: ()
            {
             before(grammarAccess.getSimpleValueAccess().getSimpleValueAction_0()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1793:1: ()
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1795:1: 
            {
            }

             after(grammarAccess.getSimpleValueAccess().getSimpleValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValue__Group__0__Impl"


    // $ANTLR start "rule__SimpleValue__Group__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1805:1: rule__SimpleValue__Group__1 : rule__SimpleValue__Group__1__Impl rule__SimpleValue__Group__2 ;
    public final void rule__SimpleValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1809:1: ( rule__SimpleValue__Group__1__Impl rule__SimpleValue__Group__2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1810:2: rule__SimpleValue__Group__1__Impl rule__SimpleValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__1__Impl_in_rule__SimpleValue__Group__13527);
            rule__SimpleValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__2_in_rule__SimpleValue__Group__13530);
            rule__SimpleValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValue__Group__1"


    // $ANTLR start "rule__SimpleValue__Group__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1817:1: rule__SimpleValue__Group__1__Impl : ( 'SimpleValue' ) ;
    public final void rule__SimpleValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1821:1: ( ( 'SimpleValue' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1822:1: ( 'SimpleValue' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1822:1: ( 'SimpleValue' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1823:1: 'SimpleValue'
            {
             before(grammarAccess.getSimpleValueAccess().getSimpleValueKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__SimpleValue__Group__1__Impl3558); 
             after(grammarAccess.getSimpleValueAccess().getSimpleValueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValue__Group__1__Impl"


    // $ANTLR start "rule__SimpleValue__Group__2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1836:1: rule__SimpleValue__Group__2 : rule__SimpleValue__Group__2__Impl rule__SimpleValue__Group__3 ;
    public final void rule__SimpleValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1840:1: ( rule__SimpleValue__Group__2__Impl rule__SimpleValue__Group__3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1841:2: rule__SimpleValue__Group__2__Impl rule__SimpleValue__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__2__Impl_in_rule__SimpleValue__Group__23589);
            rule__SimpleValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__3_in_rule__SimpleValue__Group__23592);
            rule__SimpleValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValue__Group__2"


    // $ANTLR start "rule__SimpleValue__Group__2__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1848:1: rule__SimpleValue__Group__2__Impl : ( '{' ) ;
    public final void rule__SimpleValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1852:1: ( ( '{' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1853:1: ( '{' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1853:1: ( '{' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1854:1: '{'
            {
             before(grammarAccess.getSimpleValueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__SimpleValue__Group__2__Impl3620); 
             after(grammarAccess.getSimpleValueAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValue__Group__2__Impl"


    // $ANTLR start "rule__SimpleValue__Group__3"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1867:1: rule__SimpleValue__Group__3 : rule__SimpleValue__Group__3__Impl rule__SimpleValue__Group__4 ;
    public final void rule__SimpleValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1871:1: ( rule__SimpleValue__Group__3__Impl rule__SimpleValue__Group__4 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1872:2: rule__SimpleValue__Group__3__Impl rule__SimpleValue__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__3__Impl_in_rule__SimpleValue__Group__33651);
            rule__SimpleValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__4_in_rule__SimpleValue__Group__33654);
            rule__SimpleValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValue__Group__3"


    // $ANTLR start "rule__SimpleValue__Group__3__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1879:1: rule__SimpleValue__Group__3__Impl : ( ( rule__SimpleValue__Group_3__0 )? ) ;
    public final void rule__SimpleValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1883:1: ( ( ( rule__SimpleValue__Group_3__0 )? ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1884:1: ( ( rule__SimpleValue__Group_3__0 )? )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1884:1: ( ( rule__SimpleValue__Group_3__0 )? )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1885:1: ( rule__SimpleValue__Group_3__0 )?
            {
             before(grammarAccess.getSimpleValueAccess().getGroup_3()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1886:1: ( rule__SimpleValue__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1886:2: rule__SimpleValue__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group_3__0_in_rule__SimpleValue__Group__3__Impl3681);
                    rule__SimpleValue__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleValueAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValue__Group__3__Impl"


    // $ANTLR start "rule__SimpleValue__Group__4"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1896:1: rule__SimpleValue__Group__4 : rule__SimpleValue__Group__4__Impl ;
    public final void rule__SimpleValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1900:1: ( rule__SimpleValue__Group__4__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1901:2: rule__SimpleValue__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__4__Impl_in_rule__SimpleValue__Group__43712);
            rule__SimpleValue__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValue__Group__4"


    // $ANTLR start "rule__SimpleValue__Group__4__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1907:1: rule__SimpleValue__Group__4__Impl : ( '}' ) ;
    public final void rule__SimpleValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1911:1: ( ( '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1912:1: ( '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1912:1: ( '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1913:1: '}'
            {
             before(grammarAccess.getSimpleValueAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__SimpleValue__Group__4__Impl3740); 
             after(grammarAccess.getSimpleValueAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValue__Group__4__Impl"


    // $ANTLR start "rule__SimpleValue__Group_3__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1936:1: rule__SimpleValue__Group_3__0 : rule__SimpleValue__Group_3__0__Impl rule__SimpleValue__Group_3__1 ;
    public final void rule__SimpleValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1940:1: ( rule__SimpleValue__Group_3__0__Impl rule__SimpleValue__Group_3__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1941:2: rule__SimpleValue__Group_3__0__Impl rule__SimpleValue__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group_3__0__Impl_in_rule__SimpleValue__Group_3__03781);
            rule__SimpleValue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group_3__1_in_rule__SimpleValue__Group_3__03784);
            rule__SimpleValue__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValue__Group_3__0"


    // $ANTLR start "rule__SimpleValue__Group_3__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1948:1: rule__SimpleValue__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__SimpleValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1952:1: ( ( 'value' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1953:1: ( 'value' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1953:1: ( 'value' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1954:1: 'value'
            {
             before(grammarAccess.getSimpleValueAccess().getValueKeyword_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__SimpleValue__Group_3__0__Impl3812); 
             after(grammarAccess.getSimpleValueAccess().getValueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValue__Group_3__0__Impl"


    // $ANTLR start "rule__SimpleValue__Group_3__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1967:1: rule__SimpleValue__Group_3__1 : rule__SimpleValue__Group_3__1__Impl ;
    public final void rule__SimpleValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1971:1: ( rule__SimpleValue__Group_3__1__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1972:2: rule__SimpleValue__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group_3__1__Impl_in_rule__SimpleValue__Group_3__13843);
            rule__SimpleValue__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValue__Group_3__1"


    // $ANTLR start "rule__SimpleValue__Group_3__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1978:1: rule__SimpleValue__Group_3__1__Impl : ( ( rule__SimpleValue__ValueAssignment_3_1 ) ) ;
    public final void rule__SimpleValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1982:1: ( ( ( rule__SimpleValue__ValueAssignment_3_1 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1983:1: ( ( rule__SimpleValue__ValueAssignment_3_1 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1983:1: ( ( rule__SimpleValue__ValueAssignment_3_1 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1984:1: ( rule__SimpleValue__ValueAssignment_3_1 )
            {
             before(grammarAccess.getSimpleValueAccess().getValueAssignment_3_1()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1985:1: ( rule__SimpleValue__ValueAssignment_3_1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1985:2: rule__SimpleValue__ValueAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__ValueAssignment_3_1_in_rule__SimpleValue__Group_3__1__Impl3870);
            rule__SimpleValue__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleValueAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValue__Group_3__1__Impl"


    // $ANTLR start "rule__Package__NameAssignment_2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2000:1: rule__Package__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2004:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2005:1: ( ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2005:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2006:1: ruleEString
            {
             before(grammarAccess.getPackageAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Package__NameAssignment_23909);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_2"


    // $ANTLR start "rule__Package__TypesAssignment_4_2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2015:1: rule__Package__TypesAssignment_4_2 : ( ruleType ) ;
    public final void rule__Package__TypesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2019:1: ( ( ruleType ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2020:1: ( ruleType )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2020:1: ( ruleType )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2021:1: ruleType
            {
             before(grammarAccess.getPackageAccess().getTypesTypeParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_rule__Package__TypesAssignment_4_23940);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getTypesTypeParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__TypesAssignment_4_2"


    // $ANTLR start "rule__Package__TypesAssignment_4_3_1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2030:1: rule__Package__TypesAssignment_4_3_1 : ( ruleType ) ;
    public final void rule__Package__TypesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2034:1: ( ( ruleType ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2035:1: ( ruleType )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2035:1: ( ruleType )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2036:1: ruleType
            {
             before(grammarAccess.getPackageAccess().getTypesTypeParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_rule__Package__TypesAssignment_4_3_13971);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getTypesTypeParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__TypesAssignment_4_3_1"


    // $ANTLR start "rule__Package__AnnotationTypesAssignment_5_0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2045:1: rule__Package__AnnotationTypesAssignment_5_0 : ( ruleAnnotationType ) ;
    public final void rule__Package__AnnotationTypesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2049:1: ( ( ruleAnnotationType ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2050:1: ( ruleAnnotationType )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2050:1: ( ruleAnnotationType )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2051:1: ruleAnnotationType
            {
             before(grammarAccess.getPackageAccess().getAnnotationTypesAnnotationTypeParserRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationType_in_rule__Package__AnnotationTypesAssignment_5_04002);
            ruleAnnotationType();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getAnnotationTypesAnnotationTypeParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__AnnotationTypesAssignment_5_0"


    // $ANTLR start "rule__Package__AnnotationTypesAssignment_5_1_1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2060:1: rule__Package__AnnotationTypesAssignment_5_1_1 : ( ruleAnnotationType ) ;
    public final void rule__Package__AnnotationTypesAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2064:1: ( ( ruleAnnotationType ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2065:1: ( ruleAnnotationType )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2065:1: ( ruleAnnotationType )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2066:1: ruleAnnotationType
            {
             before(grammarAccess.getPackageAccess().getAnnotationTypesAnnotationTypeParserRuleCall_5_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationType_in_rule__Package__AnnotationTypesAssignment_5_1_14033);
            ruleAnnotationType();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getAnnotationTypesAnnotationTypeParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__AnnotationTypesAssignment_5_1_1"


    // $ANTLR start "rule__Type__NameAssignment_2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2078:1: rule__Type__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Type__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2082:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2083:1: ( ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2083:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2084:1: ruleEString
            {
             before(grammarAccess.getTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Type__NameAssignment_24067);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment_2"


    // $ANTLR start "rule__AnnotationType__NameAssignment_2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2093:1: rule__AnnotationType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__AnnotationType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2097:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2098:1: ( ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2098:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2099:1: ruleEString
            {
             before(grammarAccess.getAnnotationTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AnnotationType__NameAssignment_24098);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnnotationTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__NameAssignment_2"


    // $ANTLR start "rule__AnnotationType__ContextAssignment_3_1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2108:1: rule__AnnotationType__ContextAssignment_3_1 : ( ruleEString ) ;
    public final void rule__AnnotationType__ContextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2112:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2113:1: ( ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2113:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2114:1: ruleEString
            {
             before(grammarAccess.getAnnotationTypeAccess().getContextEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AnnotationType__ContextAssignment_3_14129);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnnotationTypeAccess().getContextEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__ContextAssignment_3_1"


    // $ANTLR start "rule__AnnotationType__AttributesAssignment_5_0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2123:1: rule__AnnotationType__AttributesAssignment_5_0 : ( ruleAnnotationTypeAttribute ) ;
    public final void rule__AnnotationType__AttributesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2127:1: ( ( ruleAnnotationTypeAttribute ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2128:1: ( ruleAnnotationTypeAttribute )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2128:1: ( ruleAnnotationTypeAttribute )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2129:1: ruleAnnotationTypeAttribute
            {
             before(grammarAccess.getAnnotationTypeAccess().getAttributesAnnotationTypeAttributeParserRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationTypeAttribute_in_rule__AnnotationType__AttributesAssignment_5_04160);
            ruleAnnotationTypeAttribute();

            state._fsp--;

             after(grammarAccess.getAnnotationTypeAccess().getAttributesAnnotationTypeAttributeParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__AttributesAssignment_5_0"


    // $ANTLR start "rule__AnnotationType__AttributesAssignment_5_1_1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2138:1: rule__AnnotationType__AttributesAssignment_5_1_1 : ( ruleAnnotationTypeAttribute ) ;
    public final void rule__AnnotationType__AttributesAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2142:1: ( ( ruleAnnotationTypeAttribute ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2143:1: ( ruleAnnotationTypeAttribute )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2143:1: ( ruleAnnotationTypeAttribute )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2144:1: ruleAnnotationTypeAttribute
            {
             before(grammarAccess.getAnnotationTypeAccess().getAttributesAnnotationTypeAttributeParserRuleCall_5_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationTypeAttribute_in_rule__AnnotationType__AttributesAssignment_5_1_14191);
            ruleAnnotationTypeAttribute();

            state._fsp--;

             after(grammarAccess.getAnnotationTypeAccess().getAttributesAnnotationTypeAttributeParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__AttributesAssignment_5_1_1"


    // $ANTLR start "rule__AnnotationAttribute__AttributeAssignment_3"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2153:1: rule__AnnotationAttribute__AttributeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__AnnotationAttribute__AttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2157:1: ( ( ( ruleEString ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2158:1: ( ( ruleEString ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2158:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2159:1: ( ruleEString )
            {
             before(grammarAccess.getAnnotationAttributeAccess().getAttributeAnnotationTypeAttributeCrossReference_3_0()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2160:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2161:1: ruleEString
            {
             before(grammarAccess.getAnnotationAttributeAccess().getAttributeAnnotationTypeAttributeEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AnnotationAttribute__AttributeAssignment_34226);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnnotationAttributeAccess().getAttributeAnnotationTypeAttributeEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAnnotationAttributeAccess().getAttributeAnnotationTypeAttributeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationAttribute__AttributeAssignment_3"


    // $ANTLR start "rule__AnnotationAttribute__ValueAssignment_4_1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2172:1: rule__AnnotationAttribute__ValueAssignment_4_1 : ( ruleAnnotationAttributeValue ) ;
    public final void rule__AnnotationAttribute__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2176:1: ( ( ruleAnnotationAttributeValue ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2177:1: ( ruleAnnotationAttributeValue )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2177:1: ( ruleAnnotationAttributeValue )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2178:1: ruleAnnotationAttributeValue
            {
             before(grammarAccess.getAnnotationAttributeAccess().getValueAnnotationAttributeValueParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttributeValue_in_rule__AnnotationAttribute__ValueAssignment_4_14261);
            ruleAnnotationAttributeValue();

            state._fsp--;

             after(grammarAccess.getAnnotationAttributeAccess().getValueAnnotationAttributeValueParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationAttribute__ValueAssignment_4_1"


    // $ANTLR start "rule__AnnotationTypeAttribute__NameAssignment_1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2187:1: rule__AnnotationTypeAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AnnotationTypeAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2191:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2192:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2192:1: ( RULE_ID )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2193:1: RULE_ID
            {
             before(grammarAccess.getAnnotationTypeAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AnnotationTypeAttribute__NameAssignment_14292); 
             after(grammarAccess.getAnnotationTypeAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationTypeAttribute__NameAssignment_1"


    // $ANTLR start "rule__AnnotationTypeAttribute__TypeAssignment_3"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2202:1: rule__AnnotationTypeAttribute__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AnnotationTypeAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2206:1: ( ( ( RULE_ID ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2207:1: ( ( RULE_ID ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2207:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2208:1: ( RULE_ID )
            {
             before(grammarAccess.getAnnotationTypeAttributeAccess().getTypeTypeCrossReference_3_0()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2209:1: ( RULE_ID )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2210:1: RULE_ID
            {
             before(grammarAccess.getAnnotationTypeAttributeAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AnnotationTypeAttribute__TypeAssignment_34327); 
             after(grammarAccess.getAnnotationTypeAttributeAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAnnotationTypeAttributeAccess().getTypeTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationTypeAttribute__TypeAssignment_3"


    // $ANTLR start "rule__SimpleValue__ValueAssignment_3_1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2221:1: rule__SimpleValue__ValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__SimpleValue__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2225:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2226:1: ( ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2226:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2227:1: ruleEString
            {
             before(grammarAccess.getSimpleValueAccess().getValueEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SimpleValue__ValueAssignment_3_14362);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSimpleValueAccess().getValueEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValue__ValueAssignment_3_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulePackage_in_entryRulePackage61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackage68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttributeValue_in_entryRuleAnnotationAttributeValue121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationAttributeValue128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleValue_in_ruleAnnotationAttributeValue154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_entryRuleType182 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleType189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group__0_in_ruleType215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType242 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationType249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__0_in_ruleAnnotationType275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_entryRuleAnnotationAttribute302 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationAttribute309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__0_in_ruleAnnotationAttribute335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString362 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationTypeAttribute_in_entryRuleAnnotationTypeAttribute422 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationTypeAttribute429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group__0_in_ruleAnnotationTypeAttribute455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue482 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValue489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__0_in_ruleSimpleValue515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0598 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1659 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Package__Group__1__Impl690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2721 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__2724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__3781 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__3784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Package__Group__3__Impl812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__4843 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_rule__Package__Group__5_in_rule__Package__Group__4846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__5904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__0_in_rule__Package__Group__5__Impl931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__0974 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__0977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Package__Group_4__0__Impl1005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__11036 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__2_in_rule__Package__Group_4__11039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Package__Group_4__1__Impl1067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__2__Impl_in_rule__Package__Group_4__21098 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__3_in_rule__Package__Group_4__21101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__TypesAssignment_4_2_in_rule__Package__Group_4__2__Impl1128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__3__Impl_in_rule__Package__Group_4__31158 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__4_in_rule__Package__Group_4__31161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__0_in_rule__Package__Group_4__3__Impl1188 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__4__Impl_in_rule__Package__Group_4__41219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Package__Group_4__4__Impl1247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__0__Impl_in_rule__Package__Group_4_3__01288 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__1_in_rule__Package__Group_4_3__01291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Package__Group_4_3__0__Impl1319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__1__Impl_in_rule__Package__Group_4_3__11350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__TypesAssignment_4_3_1_in_rule__Package__Group_4_3__1__Impl1377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__0__Impl_in_rule__Package__Group_5__01411 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Package__Group_5__1_in_rule__Package__Group_5__01414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__AnnotationTypesAssignment_5_0_in_rule__Package__Group_5__0__Impl1441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__1__Impl_in_rule__Package__Group_5__11471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5_1__0_in_rule__Package__Group_5__1__Impl1498 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Package__Group_5_1__0__Impl_in_rule__Package__Group_5_1__01533 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Package__Group_5_1__1_in_rule__Package__Group_5_1__01536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Package__Group_5_1__0__Impl1564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5_1__1__Impl_in_rule__Package__Group_5_1__11595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__AnnotationTypesAssignment_5_1_1_in_rule__Package__Group_5_1__1__Impl1622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__01659 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__01662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__11720 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Type__Group__2_in_rule__Type__Group__11723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Type__Group__1__Impl1751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group__2__Impl_in_rule__Type__Group__21782 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Type__Group__3_in_rule__Type__Group__21785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__NameAssignment_2_in_rule__Type__Group__2__Impl1812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group__3__Impl_in_rule__Type__Group__31842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Type__Group__3__Impl1870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__0__Impl_in_rule__AnnotationType__Group__01909 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__1_in_rule__AnnotationType__Group__01912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__1__Impl_in_rule__AnnotationType__Group__11970 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__2_in_rule__AnnotationType__Group__11973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__AnnotationType__Group__1__Impl2001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__2__Impl_in_rule__AnnotationType__Group__22032 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__3_in_rule__AnnotationType__Group__22035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__NameAssignment_2_in_rule__AnnotationType__Group__2__Impl2062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__3__Impl_in_rule__AnnotationType__Group__32092 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__4_in_rule__AnnotationType__Group__32095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_3__0_in_rule__AnnotationType__Group__3__Impl2122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__4__Impl_in_rule__AnnotationType__Group__42153 = new BitSet(new long[]{0x0000000000008020L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__5_in_rule__AnnotationType__Group__42156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__AnnotationType__Group__4__Impl2184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__5__Impl_in_rule__AnnotationType__Group__52215 = new BitSet(new long[]{0x0000000000008020L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__6_in_rule__AnnotationType__Group__52218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_5__0_in_rule__AnnotationType__Group__5__Impl2245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__6__Impl_in_rule__AnnotationType__Group__62276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__AnnotationType__Group__6__Impl2304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_3__0__Impl_in_rule__AnnotationType__Group_3__02349 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_3__1_in_rule__AnnotationType__Group_3__02352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__AnnotationType__Group_3__0__Impl2380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_3__1__Impl_in_rule__AnnotationType__Group_3__12411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__ContextAssignment_3_1_in_rule__AnnotationType__Group_3__1__Impl2438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_5__0__Impl_in_rule__AnnotationType__Group_5__02472 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_5__1_in_rule__AnnotationType__Group_5__02475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__AttributesAssignment_5_0_in_rule__AnnotationType__Group_5__0__Impl2502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_5__1__Impl_in_rule__AnnotationType__Group_5__12532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_5_1__0_in_rule__AnnotationType__Group_5__1__Impl2559 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_5_1__0__Impl_in_rule__AnnotationType__Group_5_1__02594 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_5_1__1_in_rule__AnnotationType__Group_5_1__02597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__AnnotationType__Group_5_1__0__Impl2625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_5_1__1__Impl_in_rule__AnnotationType__Group_5_1__12656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__AttributesAssignment_5_1_1_in_rule__AnnotationType__Group_5_1__1__Impl2683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__0__Impl_in_rule__AnnotationAttribute__Group__02717 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__1_in_rule__AnnotationAttribute__Group__02720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__AnnotationAttribute__Group__0__Impl2748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__1__Impl_in_rule__AnnotationAttribute__Group__12779 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__2_in_rule__AnnotationAttribute__Group__12782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__AnnotationAttribute__Group__1__Impl2810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__2__Impl_in_rule__AnnotationAttribute__Group__22841 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__3_in_rule__AnnotationAttribute__Group__22844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__AnnotationAttribute__Group__2__Impl2872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__3__Impl_in_rule__AnnotationAttribute__Group__32903 = new BitSet(new long[]{0x0000000000408000L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__4_in_rule__AnnotationAttribute__Group__32906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__AttributeAssignment_3_in_rule__AnnotationAttribute__Group__3__Impl2933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__4__Impl_in_rule__AnnotationAttribute__Group__42963 = new BitSet(new long[]{0x0000000000408000L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__5_in_rule__AnnotationAttribute__Group__42966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group_4__0_in_rule__AnnotationAttribute__Group__4__Impl2993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__5__Impl_in_rule__AnnotationAttribute__Group__53024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__AnnotationAttribute__Group__5__Impl3052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group_4__0__Impl_in_rule__AnnotationAttribute__Group_4__03095 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group_4__1_in_rule__AnnotationAttribute__Group_4__03098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__AnnotationAttribute__Group_4__0__Impl3126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group_4__1__Impl_in_rule__AnnotationAttribute__Group_4__13157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__ValueAssignment_4_1_in_rule__AnnotationAttribute__Group_4__1__Impl3184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group__0__Impl_in_rule__AnnotationTypeAttribute__Group__03218 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group__1_in_rule__AnnotationTypeAttribute__Group__03221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group__1__Impl_in_rule__AnnotationTypeAttribute__Group__13279 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group__2_in_rule__AnnotationTypeAttribute__Group__13282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__NameAssignment_1_in_rule__AnnotationTypeAttribute__Group__1__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group__2__Impl_in_rule__AnnotationTypeAttribute__Group__23339 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group__3_in_rule__AnnotationTypeAttribute__Group__23342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__AnnotationTypeAttribute__Group__2__Impl3370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group__3__Impl_in_rule__AnnotationTypeAttribute__Group__33401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__TypeAssignment_3_in_rule__AnnotationTypeAttribute__Group__3__Impl3428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__0__Impl_in_rule__SimpleValue__Group__03466 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__1_in_rule__SimpleValue__Group__03469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__1__Impl_in_rule__SimpleValue__Group__13527 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__2_in_rule__SimpleValue__Group__13530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__SimpleValue__Group__1__Impl3558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__2__Impl_in_rule__SimpleValue__Group__23589 = new BitSet(new long[]{0x0000000000408000L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__3_in_rule__SimpleValue__Group__23592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__SimpleValue__Group__2__Impl3620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__3__Impl_in_rule__SimpleValue__Group__33651 = new BitSet(new long[]{0x0000000000408000L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__4_in_rule__SimpleValue__Group__33654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group_3__0_in_rule__SimpleValue__Group__3__Impl3681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__4__Impl_in_rule__SimpleValue__Group__43712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__SimpleValue__Group__4__Impl3740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group_3__0__Impl_in_rule__SimpleValue__Group_3__03781 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group_3__1_in_rule__SimpleValue__Group_3__03784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__SimpleValue__Group_3__0__Impl3812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group_3__1__Impl_in_rule__SimpleValue__Group_3__13843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__ValueAssignment_3_1_in_rule__SimpleValue__Group_3__1__Impl3870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Package__NameAssignment_23909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_rule__Package__TypesAssignment_4_23940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_rule__Package__TypesAssignment_4_3_13971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationType_in_rule__Package__AnnotationTypesAssignment_5_04002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationType_in_rule__Package__AnnotationTypesAssignment_5_1_14033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Type__NameAssignment_24067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AnnotationType__NameAssignment_24098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AnnotationType__ContextAssignment_3_14129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationTypeAttribute_in_rule__AnnotationType__AttributesAssignment_5_04160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationTypeAttribute_in_rule__AnnotationType__AttributesAssignment_5_1_14191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AnnotationAttribute__AttributeAssignment_34226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttributeValue_in_rule__AnnotationAttribute__ValueAssignment_4_14261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AnnotationTypeAttribute__NameAssignment_14292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AnnotationTypeAttribute__TypeAssignment_34327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SimpleValue__ValueAssignment_3_14362 = new BitSet(new long[]{0x0000000000000002L});
    }


}