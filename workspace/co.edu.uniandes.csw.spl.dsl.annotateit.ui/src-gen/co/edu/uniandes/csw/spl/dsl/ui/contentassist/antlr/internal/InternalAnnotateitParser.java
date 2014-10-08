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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "'{'", "'}'", "'annotations'", "','", "'types'", "'annotationTypes'", "'Annotation'", "'annotationType'", "'attributes'", "'Type'", "'AnnotationType'", "'context'", "'AnnotationAttribute'", "'attribute'", "'value'", "'AnnotationTypeAttribute'", "'type'", "'SimpleValue'"
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


    // $ANTLR start "entryRuleAnnotation"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:116:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:117:1: ( ruleAnnotation EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:118:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation180);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation187); 

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:125:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:129:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:130:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:130:1: ( ( rule__Annotation__Group__0 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:131:1: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:132:1: ( rule__Annotation__Group__0 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:132:2: rule__Annotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation213);
            rule__Annotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleType"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:144:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:145:1: ( ruleType EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:146:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_entryRuleType240);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleType247); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:153:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:157:2: ( ( ( rule__Type__Group__0 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:158:1: ( ( rule__Type__Group__0 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:158:1: ( ( rule__Type__Group__0 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:159:1: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:160:1: ( rule__Type__Group__0 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:160:2: rule__Type__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group__0_in_ruleType273);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:172:1: entryRuleAnnotationType : ruleAnnotationType EOF ;
    public final void entryRuleAnnotationType() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:173:1: ( ruleAnnotationType EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:174:1: ruleAnnotationType EOF
            {
             before(grammarAccess.getAnnotationTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType300);
            ruleAnnotationType();

            state._fsp--;

             after(grammarAccess.getAnnotationTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationType307); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:181:1: ruleAnnotationType : ( ( rule__AnnotationType__Group__0 ) ) ;
    public final void ruleAnnotationType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:185:2: ( ( ( rule__AnnotationType__Group__0 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:186:1: ( ( rule__AnnotationType__Group__0 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:186:1: ( ( rule__AnnotationType__Group__0 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:187:1: ( rule__AnnotationType__Group__0 )
            {
             before(grammarAccess.getAnnotationTypeAccess().getGroup()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:188:1: ( rule__AnnotationType__Group__0 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:188:2: rule__AnnotationType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__0_in_ruleAnnotationType333);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:200:1: entryRuleAnnotationAttribute : ruleAnnotationAttribute EOF ;
    public final void entryRuleAnnotationAttribute() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:201:1: ( ruleAnnotationAttribute EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:202:1: ruleAnnotationAttribute EOF
            {
             before(grammarAccess.getAnnotationAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttribute_in_entryRuleAnnotationAttribute360);
            ruleAnnotationAttribute();

            state._fsp--;

             after(grammarAccess.getAnnotationAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationAttribute367); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:209:1: ruleAnnotationAttribute : ( ( rule__AnnotationAttribute__Group__0 ) ) ;
    public final void ruleAnnotationAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:213:2: ( ( ( rule__AnnotationAttribute__Group__0 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:214:1: ( ( rule__AnnotationAttribute__Group__0 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:214:1: ( ( rule__AnnotationAttribute__Group__0 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:215:1: ( rule__AnnotationAttribute__Group__0 )
            {
             before(grammarAccess.getAnnotationAttributeAccess().getGroup()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:216:1: ( rule__AnnotationAttribute__Group__0 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:216:2: rule__AnnotationAttribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__0_in_ruleAnnotationAttribute393);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:229:1: ( ruleEString EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:230:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString420);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString427); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:242:1: ( ( rule__EString__Alternatives ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:242:1: ( ( rule__EString__Alternatives ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:243:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:244:1: ( rule__EString__Alternatives )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:244:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString453);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:256:1: entryRuleAnnotationTypeAttribute : ruleAnnotationTypeAttribute EOF ;
    public final void entryRuleAnnotationTypeAttribute() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:257:1: ( ruleAnnotationTypeAttribute EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:258:1: ruleAnnotationTypeAttribute EOF
            {
             before(grammarAccess.getAnnotationTypeAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationTypeAttribute_in_entryRuleAnnotationTypeAttribute480);
            ruleAnnotationTypeAttribute();

            state._fsp--;

             after(grammarAccess.getAnnotationTypeAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationTypeAttribute487); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:265:1: ruleAnnotationTypeAttribute : ( ( rule__AnnotationTypeAttribute__Group__0 ) ) ;
    public final void ruleAnnotationTypeAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:269:2: ( ( ( rule__AnnotationTypeAttribute__Group__0 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:270:1: ( ( rule__AnnotationTypeAttribute__Group__0 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:270:1: ( ( rule__AnnotationTypeAttribute__Group__0 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:271:1: ( rule__AnnotationTypeAttribute__Group__0 )
            {
             before(grammarAccess.getAnnotationTypeAttributeAccess().getGroup()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:272:1: ( rule__AnnotationTypeAttribute__Group__0 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:272:2: rule__AnnotationTypeAttribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group__0_in_ruleAnnotationTypeAttribute513);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:284:1: entryRuleSimpleValue : ruleSimpleValue EOF ;
    public final void entryRuleSimpleValue() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:285:1: ( ruleSimpleValue EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:286:1: ruleSimpleValue EOF
            {
             before(grammarAccess.getSimpleValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue540);
            ruleSimpleValue();

            state._fsp--;

             after(grammarAccess.getSimpleValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleValue547); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:293:1: ruleSimpleValue : ( ( rule__SimpleValue__Group__0 ) ) ;
    public final void ruleSimpleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:297:2: ( ( ( rule__SimpleValue__Group__0 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:298:1: ( ( rule__SimpleValue__Group__0 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:298:1: ( ( rule__SimpleValue__Group__0 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:299:1: ( rule__SimpleValue__Group__0 )
            {
             before(grammarAccess.getSimpleValueAccess().getGroup()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:300:1: ( rule__SimpleValue__Group__0 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:300:2: rule__SimpleValue__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__0_in_ruleSimpleValue573);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:312:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:316:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:317:1: ( RULE_STRING )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:317:1: ( RULE_STRING )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:318:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives609); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:323:6: ( RULE_ID )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:323:6: ( RULE_ID )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:324:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives626); 
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:336:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:340:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:341:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0656);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0659);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:348:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:352:1: ( ( () ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:353:1: ( () )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:353:1: ( () )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:354:1: ()
            {
             before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:355:1: ()
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:357:1: 
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:367:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:371:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:372:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1717);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1720);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:379:1: rule__Package__Group__1__Impl : ( 'Package' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:383:1: ( ( 'Package' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:384:1: ( 'Package' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:384:1: ( 'Package' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:385:1: 'Package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Package__Group__1__Impl748); 
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:398:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:402:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:403:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2779);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__3_in_rule__Package__Group__2782);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:410:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:414:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:415:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:415:1: ( ( rule__Package__NameAssignment_2 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:416:1: ( rule__Package__NameAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:417:1: ( rule__Package__NameAssignment_2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:417:2: rule__Package__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl809);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:427:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:431:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:432:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__3839);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__4_in_rule__Package__Group__3842);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:439:1: rule__Package__Group__3__Impl : ( '{' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:443:1: ( ( '{' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:444:1: ( '{' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:444:1: ( '{' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:445:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Package__Group__3__Impl870); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:458:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:462:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:463:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__4901);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__5_in_rule__Package__Group__4904);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:470:1: rule__Package__Group__4__Impl : ( ( rule__Package__Group_4__0 )? ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:474:1: ( ( ( rule__Package__Group_4__0 )? ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:475:1: ( ( rule__Package__Group_4__0 )? )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:475:1: ( ( rule__Package__Group_4__0 )? )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:476:1: ( rule__Package__Group_4__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_4()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:477:1: ( rule__Package__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:477:2: rule__Package__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl931);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:487:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:491:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:492:2: rule__Package__Group__5__Impl rule__Package__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__5962);
            rule__Package__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__6_in_rule__Package__Group__5965);
            rule__Package__Group__6();

            state._fsp--;


            }

        }
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:499:1: rule__Package__Group__5__Impl : ( ( rule__Package__Group_5__0 )? ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:503:1: ( ( ( rule__Package__Group_5__0 )? ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:504:1: ( ( rule__Package__Group_5__0 )? )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:504:1: ( ( rule__Package__Group_5__0 )? )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:505:1: ( rule__Package__Group_5__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_5()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:506:1: ( rule__Package__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:506:2: rule__Package__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__0_in_rule__Package__Group__5__Impl992);
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


    // $ANTLR start "rule__Package__Group__6"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:516:1: rule__Package__Group__6 : rule__Package__Group__6__Impl rule__Package__Group__7 ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:520:1: ( rule__Package__Group__6__Impl rule__Package__Group__7 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:521:2: rule__Package__Group__6__Impl rule__Package__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__6__Impl_in_rule__Package__Group__61023);
            rule__Package__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__7_in_rule__Package__Group__61026);
            rule__Package__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__6"


    // $ANTLR start "rule__Package__Group__6__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:528:1: rule__Package__Group__6__Impl : ( ( rule__Package__Group_6__0 )? ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:532:1: ( ( ( rule__Package__Group_6__0 )? ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:533:1: ( ( rule__Package__Group_6__0 )? )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:533:1: ( ( rule__Package__Group_6__0 )? )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:534:1: ( rule__Package__Group_6__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_6()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:535:1: ( rule__Package__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:535:2: rule__Package__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__0_in_rule__Package__Group__6__Impl1053);
                    rule__Package__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__6__Impl"


    // $ANTLR start "rule__Package__Group__7"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:545:1: rule__Package__Group__7 : rule__Package__Group__7__Impl ;
    public final void rule__Package__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:549:1: ( rule__Package__Group__7__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:550:2: rule__Package__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__7__Impl_in_rule__Package__Group__71084);
            rule__Package__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__7"


    // $ANTLR start "rule__Package__Group__7__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:556:1: rule__Package__Group__7__Impl : ( '}' ) ;
    public final void rule__Package__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:560:1: ( ( '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:561:1: ( '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:561:1: ( '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:562:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Package__Group__7__Impl1112); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__7__Impl"


    // $ANTLR start "rule__Package__Group_4__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:591:1: rule__Package__Group_4__0 : rule__Package__Group_4__0__Impl rule__Package__Group_4__1 ;
    public final void rule__Package__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:595:1: ( rule__Package__Group_4__0__Impl rule__Package__Group_4__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:596:2: rule__Package__Group_4__0__Impl rule__Package__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__01159);
            rule__Package__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__01162);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:603:1: rule__Package__Group_4__0__Impl : ( 'annotations' ) ;
    public final void rule__Package__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:607:1: ( ( 'annotations' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:608:1: ( 'annotations' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:608:1: ( 'annotations' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:609:1: 'annotations'
            {
             before(grammarAccess.getPackageAccess().getAnnotationsKeyword_4_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Package__Group_4__0__Impl1190); 
             after(grammarAccess.getPackageAccess().getAnnotationsKeyword_4_0()); 

            }


            }

        }
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:622:1: rule__Package__Group_4__1 : rule__Package__Group_4__1__Impl rule__Package__Group_4__2 ;
    public final void rule__Package__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:626:1: ( rule__Package__Group_4__1__Impl rule__Package__Group_4__2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:627:2: rule__Package__Group_4__1__Impl rule__Package__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__11221);
            rule__Package__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__2_in_rule__Package__Group_4__11224);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:634:1: rule__Package__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Package__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:638:1: ( ( '{' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:639:1: ( '{' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:639:1: ( '{' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:640:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Package__Group_4__1__Impl1252); 
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:653:1: rule__Package__Group_4__2 : rule__Package__Group_4__2__Impl rule__Package__Group_4__3 ;
    public final void rule__Package__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:657:1: ( rule__Package__Group_4__2__Impl rule__Package__Group_4__3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:658:2: rule__Package__Group_4__2__Impl rule__Package__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__2__Impl_in_rule__Package__Group_4__21283);
            rule__Package__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__3_in_rule__Package__Group_4__21286);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:665:1: rule__Package__Group_4__2__Impl : ( ( rule__Package__AnnotationsAssignment_4_2 ) ) ;
    public final void rule__Package__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:669:1: ( ( ( rule__Package__AnnotationsAssignment_4_2 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:670:1: ( ( rule__Package__AnnotationsAssignment_4_2 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:670:1: ( ( rule__Package__AnnotationsAssignment_4_2 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:671:1: ( rule__Package__AnnotationsAssignment_4_2 )
            {
             before(grammarAccess.getPackageAccess().getAnnotationsAssignment_4_2()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:672:1: ( rule__Package__AnnotationsAssignment_4_2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:672:2: rule__Package__AnnotationsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__AnnotationsAssignment_4_2_in_rule__Package__Group_4__2__Impl1313);
            rule__Package__AnnotationsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getAnnotationsAssignment_4_2()); 

            }


            }

        }
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:682:1: rule__Package__Group_4__3 : rule__Package__Group_4__3__Impl rule__Package__Group_4__4 ;
    public final void rule__Package__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:686:1: ( rule__Package__Group_4__3__Impl rule__Package__Group_4__4 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:687:2: rule__Package__Group_4__3__Impl rule__Package__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__3__Impl_in_rule__Package__Group_4__31343);
            rule__Package__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__4_in_rule__Package__Group_4__31346);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:694:1: rule__Package__Group_4__3__Impl : ( ( rule__Package__Group_4_3__0 )* ) ;
    public final void rule__Package__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:698:1: ( ( ( rule__Package__Group_4_3__0 )* ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:699:1: ( ( rule__Package__Group_4_3__0 )* )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:699:1: ( ( rule__Package__Group_4_3__0 )* )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:700:1: ( rule__Package__Group_4_3__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_4_3()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:701:1: ( rule__Package__Group_4_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:701:2: rule__Package__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__0_in_rule__Package__Group_4__3__Impl1373);
            	    rule__Package__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:711:1: rule__Package__Group_4__4 : rule__Package__Group_4__4__Impl ;
    public final void rule__Package__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:715:1: ( rule__Package__Group_4__4__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:716:2: rule__Package__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__4__Impl_in_rule__Package__Group_4__41404);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:722:1: rule__Package__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Package__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:726:1: ( ( '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:727:1: ( '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:727:1: ( '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:728:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Package__Group_4__4__Impl1432); 
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:751:1: rule__Package__Group_4_3__0 : rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1 ;
    public final void rule__Package__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:755:1: ( rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:756:2: rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__0__Impl_in_rule__Package__Group_4_3__01473);
            rule__Package__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__1_in_rule__Package__Group_4_3__01476);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:763:1: rule__Package__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Package__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:767:1: ( ( ',' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:768:1: ( ',' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:768:1: ( ',' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:769:1: ','
            {
             before(grammarAccess.getPackageAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Package__Group_4_3__0__Impl1504); 
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:782:1: rule__Package__Group_4_3__1 : rule__Package__Group_4_3__1__Impl ;
    public final void rule__Package__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:786:1: ( rule__Package__Group_4_3__1__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:787:2: rule__Package__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__1__Impl_in_rule__Package__Group_4_3__11535);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:793:1: rule__Package__Group_4_3__1__Impl : ( ( rule__Package__AnnotationsAssignment_4_3_1 ) ) ;
    public final void rule__Package__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:797:1: ( ( ( rule__Package__AnnotationsAssignment_4_3_1 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:798:1: ( ( rule__Package__AnnotationsAssignment_4_3_1 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:798:1: ( ( rule__Package__AnnotationsAssignment_4_3_1 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:799:1: ( rule__Package__AnnotationsAssignment_4_3_1 )
            {
             before(grammarAccess.getPackageAccess().getAnnotationsAssignment_4_3_1()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:800:1: ( rule__Package__AnnotationsAssignment_4_3_1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:800:2: rule__Package__AnnotationsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__AnnotationsAssignment_4_3_1_in_rule__Package__Group_4_3__1__Impl1562);
            rule__Package__AnnotationsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getAnnotationsAssignment_4_3_1()); 

            }


            }

        }
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:814:1: rule__Package__Group_5__0 : rule__Package__Group_5__0__Impl rule__Package__Group_5__1 ;
    public final void rule__Package__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:818:1: ( rule__Package__Group_5__0__Impl rule__Package__Group_5__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:819:2: rule__Package__Group_5__0__Impl rule__Package__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__0__Impl_in_rule__Package__Group_5__01596);
            rule__Package__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__1_in_rule__Package__Group_5__01599);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:826:1: rule__Package__Group_5__0__Impl : ( 'types' ) ;
    public final void rule__Package__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:830:1: ( ( 'types' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:831:1: ( 'types' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:831:1: ( 'types' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:832:1: 'types'
            {
             before(grammarAccess.getPackageAccess().getTypesKeyword_5_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Package__Group_5__0__Impl1627); 
             after(grammarAccess.getPackageAccess().getTypesKeyword_5_0()); 

            }


            }

        }
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:845:1: rule__Package__Group_5__1 : rule__Package__Group_5__1__Impl rule__Package__Group_5__2 ;
    public final void rule__Package__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:849:1: ( rule__Package__Group_5__1__Impl rule__Package__Group_5__2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:850:2: rule__Package__Group_5__1__Impl rule__Package__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__1__Impl_in_rule__Package__Group_5__11658);
            rule__Package__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__2_in_rule__Package__Group_5__11661);
            rule__Package__Group_5__2();

            state._fsp--;


            }

        }
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:857:1: rule__Package__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Package__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:861:1: ( ( '{' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:862:1: ( '{' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:862:1: ( '{' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:863:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Package__Group_5__1__Impl1689); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Package__Group_5__2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:876:1: rule__Package__Group_5__2 : rule__Package__Group_5__2__Impl rule__Package__Group_5__3 ;
    public final void rule__Package__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:880:1: ( rule__Package__Group_5__2__Impl rule__Package__Group_5__3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:881:2: rule__Package__Group_5__2__Impl rule__Package__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__2__Impl_in_rule__Package__Group_5__21720);
            rule__Package__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__3_in_rule__Package__Group_5__21723);
            rule__Package__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__2"


    // $ANTLR start "rule__Package__Group_5__2__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:888:1: rule__Package__Group_5__2__Impl : ( ( rule__Package__TypesAssignment_5_2 ) ) ;
    public final void rule__Package__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:892:1: ( ( ( rule__Package__TypesAssignment_5_2 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:893:1: ( ( rule__Package__TypesAssignment_5_2 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:893:1: ( ( rule__Package__TypesAssignment_5_2 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:894:1: ( rule__Package__TypesAssignment_5_2 )
            {
             before(grammarAccess.getPackageAccess().getTypesAssignment_5_2()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:895:1: ( rule__Package__TypesAssignment_5_2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:895:2: rule__Package__TypesAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__TypesAssignment_5_2_in_rule__Package__Group_5__2__Impl1750);
            rule__Package__TypesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getTypesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__2__Impl"


    // $ANTLR start "rule__Package__Group_5__3"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:905:1: rule__Package__Group_5__3 : rule__Package__Group_5__3__Impl rule__Package__Group_5__4 ;
    public final void rule__Package__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:909:1: ( rule__Package__Group_5__3__Impl rule__Package__Group_5__4 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:910:2: rule__Package__Group_5__3__Impl rule__Package__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__3__Impl_in_rule__Package__Group_5__31780);
            rule__Package__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__4_in_rule__Package__Group_5__31783);
            rule__Package__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__3"


    // $ANTLR start "rule__Package__Group_5__3__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:917:1: rule__Package__Group_5__3__Impl : ( ( rule__Package__Group_5_3__0 )* ) ;
    public final void rule__Package__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:921:1: ( ( ( rule__Package__Group_5_3__0 )* ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:922:1: ( ( rule__Package__Group_5_3__0 )* )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:922:1: ( ( rule__Package__Group_5_3__0 )* )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:923:1: ( rule__Package__Group_5_3__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_5_3()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:924:1: ( rule__Package__Group_5_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:924:2: rule__Package__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5_3__0_in_rule__Package__Group_5__3__Impl1810);
            	    rule__Package__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__3__Impl"


    // $ANTLR start "rule__Package__Group_5__4"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:934:1: rule__Package__Group_5__4 : rule__Package__Group_5__4__Impl ;
    public final void rule__Package__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:938:1: ( rule__Package__Group_5__4__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:939:2: rule__Package__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__4__Impl_in_rule__Package__Group_5__41841);
            rule__Package__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__4"


    // $ANTLR start "rule__Package__Group_5__4__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:945:1: rule__Package__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Package__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:949:1: ( ( '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:950:1: ( '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:950:1: ( '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:951:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Package__Group_5__4__Impl1869); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__4__Impl"


    // $ANTLR start "rule__Package__Group_5_3__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:974:1: rule__Package__Group_5_3__0 : rule__Package__Group_5_3__0__Impl rule__Package__Group_5_3__1 ;
    public final void rule__Package__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:978:1: ( rule__Package__Group_5_3__0__Impl rule__Package__Group_5_3__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:979:2: rule__Package__Group_5_3__0__Impl rule__Package__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5_3__0__Impl_in_rule__Package__Group_5_3__01910);
            rule__Package__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5_3__1_in_rule__Package__Group_5_3__01913);
            rule__Package__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5_3__0"


    // $ANTLR start "rule__Package__Group_5_3__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:986:1: rule__Package__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Package__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:990:1: ( ( ',' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:991:1: ( ',' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:991:1: ( ',' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:992:1: ','
            {
             before(grammarAccess.getPackageAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Package__Group_5_3__0__Impl1941); 
             after(grammarAccess.getPackageAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5_3__0__Impl"


    // $ANTLR start "rule__Package__Group_5_3__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1005:1: rule__Package__Group_5_3__1 : rule__Package__Group_5_3__1__Impl ;
    public final void rule__Package__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1009:1: ( rule__Package__Group_5_3__1__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1010:2: rule__Package__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5_3__1__Impl_in_rule__Package__Group_5_3__11972);
            rule__Package__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5_3__1"


    // $ANTLR start "rule__Package__Group_5_3__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1016:1: rule__Package__Group_5_3__1__Impl : ( ( rule__Package__TypesAssignment_5_3_1 ) ) ;
    public final void rule__Package__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1020:1: ( ( ( rule__Package__TypesAssignment_5_3_1 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1021:1: ( ( rule__Package__TypesAssignment_5_3_1 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1021:1: ( ( rule__Package__TypesAssignment_5_3_1 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1022:1: ( rule__Package__TypesAssignment_5_3_1 )
            {
             before(grammarAccess.getPackageAccess().getTypesAssignment_5_3_1()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1023:1: ( rule__Package__TypesAssignment_5_3_1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1023:2: rule__Package__TypesAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__TypesAssignment_5_3_1_in_rule__Package__Group_5_3__1__Impl1999);
            rule__Package__TypesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getTypesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5_3__1__Impl"


    // $ANTLR start "rule__Package__Group_6__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1037:1: rule__Package__Group_6__0 : rule__Package__Group_6__0__Impl rule__Package__Group_6__1 ;
    public final void rule__Package__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1041:1: ( rule__Package__Group_6__0__Impl rule__Package__Group_6__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1042:2: rule__Package__Group_6__0__Impl rule__Package__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__0__Impl_in_rule__Package__Group_6__02033);
            rule__Package__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__1_in_rule__Package__Group_6__02036);
            rule__Package__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__0"


    // $ANTLR start "rule__Package__Group_6__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1049:1: rule__Package__Group_6__0__Impl : ( 'annotationTypes' ) ;
    public final void rule__Package__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1053:1: ( ( 'annotationTypes' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1054:1: ( 'annotationTypes' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1054:1: ( 'annotationTypes' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1055:1: 'annotationTypes'
            {
             before(grammarAccess.getPackageAccess().getAnnotationTypesKeyword_6_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Package__Group_6__0__Impl2064); 
             after(grammarAccess.getPackageAccess().getAnnotationTypesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__0__Impl"


    // $ANTLR start "rule__Package__Group_6__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1068:1: rule__Package__Group_6__1 : rule__Package__Group_6__1__Impl rule__Package__Group_6__2 ;
    public final void rule__Package__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1072:1: ( rule__Package__Group_6__1__Impl rule__Package__Group_6__2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1073:2: rule__Package__Group_6__1__Impl rule__Package__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__1__Impl_in_rule__Package__Group_6__12095);
            rule__Package__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__2_in_rule__Package__Group_6__12098);
            rule__Package__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__1"


    // $ANTLR start "rule__Package__Group_6__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1080:1: rule__Package__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Package__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1084:1: ( ( '{' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1085:1: ( '{' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1085:1: ( '{' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1086:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Package__Group_6__1__Impl2126); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__1__Impl"


    // $ANTLR start "rule__Package__Group_6__2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1099:1: rule__Package__Group_6__2 : rule__Package__Group_6__2__Impl rule__Package__Group_6__3 ;
    public final void rule__Package__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1103:1: ( rule__Package__Group_6__2__Impl rule__Package__Group_6__3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1104:2: rule__Package__Group_6__2__Impl rule__Package__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__2__Impl_in_rule__Package__Group_6__22157);
            rule__Package__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__3_in_rule__Package__Group_6__22160);
            rule__Package__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__2"


    // $ANTLR start "rule__Package__Group_6__2__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1111:1: rule__Package__Group_6__2__Impl : ( ( rule__Package__AnnotationTypesAssignment_6_2 ) ) ;
    public final void rule__Package__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1115:1: ( ( ( rule__Package__AnnotationTypesAssignment_6_2 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1116:1: ( ( rule__Package__AnnotationTypesAssignment_6_2 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1116:1: ( ( rule__Package__AnnotationTypesAssignment_6_2 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1117:1: ( rule__Package__AnnotationTypesAssignment_6_2 )
            {
             before(grammarAccess.getPackageAccess().getAnnotationTypesAssignment_6_2()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1118:1: ( rule__Package__AnnotationTypesAssignment_6_2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1118:2: rule__Package__AnnotationTypesAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__AnnotationTypesAssignment_6_2_in_rule__Package__Group_6__2__Impl2187);
            rule__Package__AnnotationTypesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getAnnotationTypesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__2__Impl"


    // $ANTLR start "rule__Package__Group_6__3"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1128:1: rule__Package__Group_6__3 : rule__Package__Group_6__3__Impl rule__Package__Group_6__4 ;
    public final void rule__Package__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1132:1: ( rule__Package__Group_6__3__Impl rule__Package__Group_6__4 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1133:2: rule__Package__Group_6__3__Impl rule__Package__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__3__Impl_in_rule__Package__Group_6__32217);
            rule__Package__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__4_in_rule__Package__Group_6__32220);
            rule__Package__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__3"


    // $ANTLR start "rule__Package__Group_6__3__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1140:1: rule__Package__Group_6__3__Impl : ( ( rule__Package__Group_6_3__0 )* ) ;
    public final void rule__Package__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1144:1: ( ( ( rule__Package__Group_6_3__0 )* ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1145:1: ( ( rule__Package__Group_6_3__0 )* )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1145:1: ( ( rule__Package__Group_6_3__0 )* )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1146:1: ( rule__Package__Group_6_3__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_6_3()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1147:1: ( rule__Package__Group_6_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1147:2: rule__Package__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6_3__0_in_rule__Package__Group_6__3__Impl2247);
            	    rule__Package__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__3__Impl"


    // $ANTLR start "rule__Package__Group_6__4"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1157:1: rule__Package__Group_6__4 : rule__Package__Group_6__4__Impl ;
    public final void rule__Package__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1161:1: ( rule__Package__Group_6__4__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1162:2: rule__Package__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__4__Impl_in_rule__Package__Group_6__42278);
            rule__Package__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__4"


    // $ANTLR start "rule__Package__Group_6__4__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1168:1: rule__Package__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Package__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1172:1: ( ( '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1173:1: ( '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1173:1: ( '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1174:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Package__Group_6__4__Impl2306); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__4__Impl"


    // $ANTLR start "rule__Package__Group_6_3__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1197:1: rule__Package__Group_6_3__0 : rule__Package__Group_6_3__0__Impl rule__Package__Group_6_3__1 ;
    public final void rule__Package__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1201:1: ( rule__Package__Group_6_3__0__Impl rule__Package__Group_6_3__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1202:2: rule__Package__Group_6_3__0__Impl rule__Package__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6_3__0__Impl_in_rule__Package__Group_6_3__02347);
            rule__Package__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6_3__1_in_rule__Package__Group_6_3__02350);
            rule__Package__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6_3__0"


    // $ANTLR start "rule__Package__Group_6_3__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1209:1: rule__Package__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Package__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1213:1: ( ( ',' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1214:1: ( ',' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1214:1: ( ',' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1215:1: ','
            {
             before(grammarAccess.getPackageAccess().getCommaKeyword_6_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Package__Group_6_3__0__Impl2378); 
             after(grammarAccess.getPackageAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6_3__0__Impl"


    // $ANTLR start "rule__Package__Group_6_3__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1228:1: rule__Package__Group_6_3__1 : rule__Package__Group_6_3__1__Impl ;
    public final void rule__Package__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1232:1: ( rule__Package__Group_6_3__1__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1233:2: rule__Package__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6_3__1__Impl_in_rule__Package__Group_6_3__12409);
            rule__Package__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6_3__1"


    // $ANTLR start "rule__Package__Group_6_3__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1239:1: rule__Package__Group_6_3__1__Impl : ( ( rule__Package__AnnotationTypesAssignment_6_3_1 ) ) ;
    public final void rule__Package__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1243:1: ( ( ( rule__Package__AnnotationTypesAssignment_6_3_1 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1244:1: ( ( rule__Package__AnnotationTypesAssignment_6_3_1 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1244:1: ( ( rule__Package__AnnotationTypesAssignment_6_3_1 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1245:1: ( rule__Package__AnnotationTypesAssignment_6_3_1 )
            {
             before(grammarAccess.getPackageAccess().getAnnotationTypesAssignment_6_3_1()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1246:1: ( rule__Package__AnnotationTypesAssignment_6_3_1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1246:2: rule__Package__AnnotationTypesAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__AnnotationTypesAssignment_6_3_1_in_rule__Package__Group_6_3__1__Impl2436);
            rule__Package__AnnotationTypesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getAnnotationTypesAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6_3__1__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1260:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1264:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1265:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__02470);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__02473);
            rule__Annotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0"


    // $ANTLR start "rule__Annotation__Group__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1272:1: rule__Annotation__Group__0__Impl : ( 'Annotation' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1276:1: ( ( 'Annotation' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1277:1: ( 'Annotation' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1277:1: ( 'Annotation' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1278:1: 'Annotation'
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Annotation__Group__0__Impl2501); 
             after(grammarAccess.getAnnotationAccess().getAnnotationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0__Impl"


    // $ANTLR start "rule__Annotation__Group__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1291:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1295:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1296:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__12532);
            rule__Annotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__12535);
            rule__Annotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1"


    // $ANTLR start "rule__Annotation__Group__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1303:1: rule__Annotation__Group__1__Impl : ( '{' ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1307:1: ( ( '{' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1308:1: ( '{' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1308:1: ( '{' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1309:1: '{'
            {
             before(grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Annotation__Group__1__Impl2563); 
             after(grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1__Impl"


    // $ANTLR start "rule__Annotation__Group__2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1322:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl rule__Annotation__Group__3 ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1326:1: ( rule__Annotation__Group__2__Impl rule__Annotation__Group__3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1327:2: rule__Annotation__Group__2__Impl rule__Annotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__22594);
            rule__Annotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__3_in_rule__Annotation__Group__22597);
            rule__Annotation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__2"


    // $ANTLR start "rule__Annotation__Group__2__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1334:1: rule__Annotation__Group__2__Impl : ( 'annotationType' ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1338:1: ( ( 'annotationType' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1339:1: ( 'annotationType' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1339:1: ( 'annotationType' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1340:1: 'annotationType'
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationTypeKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Annotation__Group__2__Impl2625); 
             after(grammarAccess.getAnnotationAccess().getAnnotationTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__2__Impl"


    // $ANTLR start "rule__Annotation__Group__3"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1353:1: rule__Annotation__Group__3 : rule__Annotation__Group__3__Impl rule__Annotation__Group__4 ;
    public final void rule__Annotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1357:1: ( rule__Annotation__Group__3__Impl rule__Annotation__Group__4 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1358:2: rule__Annotation__Group__3__Impl rule__Annotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__3__Impl_in_rule__Annotation__Group__32656);
            rule__Annotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__4_in_rule__Annotation__Group__32659);
            rule__Annotation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__3"


    // $ANTLR start "rule__Annotation__Group__3__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1365:1: rule__Annotation__Group__3__Impl : ( ( rule__Annotation__AnnotationTypeAssignment_3 ) ) ;
    public final void rule__Annotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1369:1: ( ( ( rule__Annotation__AnnotationTypeAssignment_3 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1370:1: ( ( rule__Annotation__AnnotationTypeAssignment_3 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1370:1: ( ( rule__Annotation__AnnotationTypeAssignment_3 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1371:1: ( rule__Annotation__AnnotationTypeAssignment_3 )
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationTypeAssignment_3()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1372:1: ( rule__Annotation__AnnotationTypeAssignment_3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1372:2: rule__Annotation__AnnotationTypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__AnnotationTypeAssignment_3_in_rule__Annotation__Group__3__Impl2686);
            rule__Annotation__AnnotationTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getAnnotationTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__3__Impl"


    // $ANTLR start "rule__Annotation__Group__4"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1382:1: rule__Annotation__Group__4 : rule__Annotation__Group__4__Impl rule__Annotation__Group__5 ;
    public final void rule__Annotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1386:1: ( rule__Annotation__Group__4__Impl rule__Annotation__Group__5 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1387:2: rule__Annotation__Group__4__Impl rule__Annotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__4__Impl_in_rule__Annotation__Group__42716);
            rule__Annotation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__5_in_rule__Annotation__Group__42719);
            rule__Annotation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__4"


    // $ANTLR start "rule__Annotation__Group__4__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1394:1: rule__Annotation__Group__4__Impl : ( ( rule__Annotation__Group_4__0 )? ) ;
    public final void rule__Annotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1398:1: ( ( ( rule__Annotation__Group_4__0 )? ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1399:1: ( ( rule__Annotation__Group_4__0 )? )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1399:1: ( ( rule__Annotation__Group_4__0 )? )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1400:1: ( rule__Annotation__Group_4__0 )?
            {
             before(grammarAccess.getAnnotationAccess().getGroup_4()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1401:1: ( rule__Annotation__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1401:2: rule__Annotation__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group_4__0_in_rule__Annotation__Group__4__Impl2746);
                    rule__Annotation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnotationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__4__Impl"


    // $ANTLR start "rule__Annotation__Group__5"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1411:1: rule__Annotation__Group__5 : rule__Annotation__Group__5__Impl ;
    public final void rule__Annotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1415:1: ( rule__Annotation__Group__5__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1416:2: rule__Annotation__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__5__Impl_in_rule__Annotation__Group__52777);
            rule__Annotation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__5"


    // $ANTLR start "rule__Annotation__Group__5__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1422:1: rule__Annotation__Group__5__Impl : ( '}' ) ;
    public final void rule__Annotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1426:1: ( ( '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1427:1: ( '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1427:1: ( '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1428:1: '}'
            {
             before(grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Annotation__Group__5__Impl2805); 
             after(grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__5__Impl"


    // $ANTLR start "rule__Annotation__Group_4__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1453:1: rule__Annotation__Group_4__0 : rule__Annotation__Group_4__0__Impl rule__Annotation__Group_4__1 ;
    public final void rule__Annotation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1457:1: ( rule__Annotation__Group_4__0__Impl rule__Annotation__Group_4__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1458:2: rule__Annotation__Group_4__0__Impl rule__Annotation__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group_4__0__Impl_in_rule__Annotation__Group_4__02848);
            rule__Annotation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group_4__1_in_rule__Annotation__Group_4__02851);
            rule__Annotation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_4__0"


    // $ANTLR start "rule__Annotation__Group_4__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1465:1: rule__Annotation__Group_4__0__Impl : ( 'attributes' ) ;
    public final void rule__Annotation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1469:1: ( ( 'attributes' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1470:1: ( 'attributes' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1470:1: ( 'attributes' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1471:1: 'attributes'
            {
             before(grammarAccess.getAnnotationAccess().getAttributesKeyword_4_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Annotation__Group_4__0__Impl2879); 
             after(grammarAccess.getAnnotationAccess().getAttributesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_4__0__Impl"


    // $ANTLR start "rule__Annotation__Group_4__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1484:1: rule__Annotation__Group_4__1 : rule__Annotation__Group_4__1__Impl rule__Annotation__Group_4__2 ;
    public final void rule__Annotation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1488:1: ( rule__Annotation__Group_4__1__Impl rule__Annotation__Group_4__2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1489:2: rule__Annotation__Group_4__1__Impl rule__Annotation__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group_4__1__Impl_in_rule__Annotation__Group_4__12910);
            rule__Annotation__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group_4__2_in_rule__Annotation__Group_4__12913);
            rule__Annotation__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_4__1"


    // $ANTLR start "rule__Annotation__Group_4__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1496:1: rule__Annotation__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Annotation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1500:1: ( ( '{' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1501:1: ( '{' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1501:1: ( '{' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1502:1: '{'
            {
             before(grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Annotation__Group_4__1__Impl2941); 
             after(grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_4__1__Impl"


    // $ANTLR start "rule__Annotation__Group_4__2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1515:1: rule__Annotation__Group_4__2 : rule__Annotation__Group_4__2__Impl rule__Annotation__Group_4__3 ;
    public final void rule__Annotation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1519:1: ( rule__Annotation__Group_4__2__Impl rule__Annotation__Group_4__3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1520:2: rule__Annotation__Group_4__2__Impl rule__Annotation__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group_4__2__Impl_in_rule__Annotation__Group_4__22972);
            rule__Annotation__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group_4__3_in_rule__Annotation__Group_4__22975);
            rule__Annotation__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_4__2"


    // $ANTLR start "rule__Annotation__Group_4__2__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1527:1: rule__Annotation__Group_4__2__Impl : ( ( rule__Annotation__AttributesAssignment_4_2 ) ) ;
    public final void rule__Annotation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1531:1: ( ( ( rule__Annotation__AttributesAssignment_4_2 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1532:1: ( ( rule__Annotation__AttributesAssignment_4_2 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1532:1: ( ( rule__Annotation__AttributesAssignment_4_2 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1533:1: ( rule__Annotation__AttributesAssignment_4_2 )
            {
             before(grammarAccess.getAnnotationAccess().getAttributesAssignment_4_2()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1534:1: ( rule__Annotation__AttributesAssignment_4_2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1534:2: rule__Annotation__AttributesAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__AttributesAssignment_4_2_in_rule__Annotation__Group_4__2__Impl3002);
            rule__Annotation__AttributesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getAttributesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_4__2__Impl"


    // $ANTLR start "rule__Annotation__Group_4__3"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1544:1: rule__Annotation__Group_4__3 : rule__Annotation__Group_4__3__Impl rule__Annotation__Group_4__4 ;
    public final void rule__Annotation__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1548:1: ( rule__Annotation__Group_4__3__Impl rule__Annotation__Group_4__4 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1549:2: rule__Annotation__Group_4__3__Impl rule__Annotation__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group_4__3__Impl_in_rule__Annotation__Group_4__33032);
            rule__Annotation__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group_4__4_in_rule__Annotation__Group_4__33035);
            rule__Annotation__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_4__3"


    // $ANTLR start "rule__Annotation__Group_4__3__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1556:1: rule__Annotation__Group_4__3__Impl : ( ( rule__Annotation__Group_4_3__0 )* ) ;
    public final void rule__Annotation__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1560:1: ( ( ( rule__Annotation__Group_4_3__0 )* ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1561:1: ( ( rule__Annotation__Group_4_3__0 )* )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1561:1: ( ( rule__Annotation__Group_4_3__0 )* )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1562:1: ( rule__Annotation__Group_4_3__0 )*
            {
             before(grammarAccess.getAnnotationAccess().getGroup_4_3()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1563:1: ( rule__Annotation__Group_4_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1563:2: rule__Annotation__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group_4_3__0_in_rule__Annotation__Group_4__3__Impl3062);
            	    rule__Annotation__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getAnnotationAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_4__3__Impl"


    // $ANTLR start "rule__Annotation__Group_4__4"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1573:1: rule__Annotation__Group_4__4 : rule__Annotation__Group_4__4__Impl ;
    public final void rule__Annotation__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1577:1: ( rule__Annotation__Group_4__4__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1578:2: rule__Annotation__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group_4__4__Impl_in_rule__Annotation__Group_4__43093);
            rule__Annotation__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_4__4"


    // $ANTLR start "rule__Annotation__Group_4__4__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1584:1: rule__Annotation__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Annotation__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1588:1: ( ( '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1589:1: ( '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1589:1: ( '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1590:1: '}'
            {
             before(grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Annotation__Group_4__4__Impl3121); 
             after(grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_4__4__Impl"


    // $ANTLR start "rule__Annotation__Group_4_3__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1613:1: rule__Annotation__Group_4_3__0 : rule__Annotation__Group_4_3__0__Impl rule__Annotation__Group_4_3__1 ;
    public final void rule__Annotation__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1617:1: ( rule__Annotation__Group_4_3__0__Impl rule__Annotation__Group_4_3__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1618:2: rule__Annotation__Group_4_3__0__Impl rule__Annotation__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group_4_3__0__Impl_in_rule__Annotation__Group_4_3__03162);
            rule__Annotation__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group_4_3__1_in_rule__Annotation__Group_4_3__03165);
            rule__Annotation__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_4_3__0"


    // $ANTLR start "rule__Annotation__Group_4_3__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1625:1: rule__Annotation__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Annotation__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1629:1: ( ( ',' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1630:1: ( ',' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1630:1: ( ',' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1631:1: ','
            {
             before(grammarAccess.getAnnotationAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Annotation__Group_4_3__0__Impl3193); 
             after(grammarAccess.getAnnotationAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_4_3__0__Impl"


    // $ANTLR start "rule__Annotation__Group_4_3__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1644:1: rule__Annotation__Group_4_3__1 : rule__Annotation__Group_4_3__1__Impl ;
    public final void rule__Annotation__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1648:1: ( rule__Annotation__Group_4_3__1__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1649:2: rule__Annotation__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group_4_3__1__Impl_in_rule__Annotation__Group_4_3__13224);
            rule__Annotation__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_4_3__1"


    // $ANTLR start "rule__Annotation__Group_4_3__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1655:1: rule__Annotation__Group_4_3__1__Impl : ( ( rule__Annotation__AttributesAssignment_4_3_1 ) ) ;
    public final void rule__Annotation__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1659:1: ( ( ( rule__Annotation__AttributesAssignment_4_3_1 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1660:1: ( ( rule__Annotation__AttributesAssignment_4_3_1 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1660:1: ( ( rule__Annotation__AttributesAssignment_4_3_1 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1661:1: ( rule__Annotation__AttributesAssignment_4_3_1 )
            {
             before(grammarAccess.getAnnotationAccess().getAttributesAssignment_4_3_1()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1662:1: ( rule__Annotation__AttributesAssignment_4_3_1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1662:2: rule__Annotation__AttributesAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__AttributesAssignment_4_3_1_in_rule__Annotation__Group_4_3__1__Impl3251);
            rule__Annotation__AttributesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getAttributesAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_4_3__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1676:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1680:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1681:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__03285);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Type__Group__1_in_rule__Type__Group__03288);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1688:1: rule__Type__Group__0__Impl : ( () ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1692:1: ( ( () ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1693:1: ( () )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1693:1: ( () )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1694:1: ()
            {
             before(grammarAccess.getTypeAccess().getTypeAction_0()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1695:1: ()
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1697:1: 
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1707:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1711:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1712:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__13346);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Type__Group__2_in_rule__Type__Group__13349);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1719:1: rule__Type__Group__1__Impl : ( 'Type' ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1723:1: ( ( 'Type' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1724:1: ( 'Type' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1724:1: ( 'Type' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1725:1: 'Type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Type__Group__1__Impl3377); 
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1738:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1742:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1743:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group__2__Impl_in_rule__Type__Group__23408);
            rule__Type__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Type__Group__3_in_rule__Type__Group__23411);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1750:1: rule__Type__Group__2__Impl : ( ( rule__Type__NameAssignment_2 ) ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1754:1: ( ( ( rule__Type__NameAssignment_2 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1755:1: ( ( rule__Type__NameAssignment_2 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1755:1: ( ( rule__Type__NameAssignment_2 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1756:1: ( rule__Type__NameAssignment_2 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_2()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1757:1: ( rule__Type__NameAssignment_2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1757:2: rule__Type__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__NameAssignment_2_in_rule__Type__Group__2__Impl3438);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1767:1: rule__Type__Group__3 : rule__Type__Group__3__Impl rule__Type__Group__4 ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1771:1: ( rule__Type__Group__3__Impl rule__Type__Group__4 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1772:2: rule__Type__Group__3__Impl rule__Type__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group__3__Impl_in_rule__Type__Group__33468);
            rule__Type__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Type__Group__4_in_rule__Type__Group__33471);
            rule__Type__Group__4();

            state._fsp--;


            }

        }
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1779:1: rule__Type__Group__3__Impl : ( '{' ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1783:1: ( ( '{' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1784:1: ( '{' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1784:1: ( '{' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1785:1: '{'
            {
             before(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Type__Group__3__Impl3499); 
             after(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Type__Group__4"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1798:1: rule__Type__Group__4 : rule__Type__Group__4__Impl rule__Type__Group__5 ;
    public final void rule__Type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1802:1: ( rule__Type__Group__4__Impl rule__Type__Group__5 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1803:2: rule__Type__Group__4__Impl rule__Type__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group__4__Impl_in_rule__Type__Group__43530);
            rule__Type__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Type__Group__5_in_rule__Type__Group__43533);
            rule__Type__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__4"


    // $ANTLR start "rule__Type__Group__4__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1810:1: rule__Type__Group__4__Impl : ( ( rule__Type__Group_4__0 )? ) ;
    public final void rule__Type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1814:1: ( ( ( rule__Type__Group_4__0 )? ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1815:1: ( ( rule__Type__Group_4__0 )? )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1815:1: ( ( rule__Type__Group_4__0 )? )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1816:1: ( rule__Type__Group_4__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_4()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1817:1: ( rule__Type__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1817:2: rule__Type__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Type__Group_4__0_in_rule__Type__Group__4__Impl3560);
                    rule__Type__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__4__Impl"


    // $ANTLR start "rule__Type__Group__5"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1827:1: rule__Type__Group__5 : rule__Type__Group__5__Impl rule__Type__Group__6 ;
    public final void rule__Type__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1831:1: ( rule__Type__Group__5__Impl rule__Type__Group__6 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1832:2: rule__Type__Group__5__Impl rule__Type__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group__5__Impl_in_rule__Type__Group__53591);
            rule__Type__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Type__Group__6_in_rule__Type__Group__53594);
            rule__Type__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__5"


    // $ANTLR start "rule__Type__Group__5__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1839:1: rule__Type__Group__5__Impl : ( ( rule__Type__Group_5__0 )? ) ;
    public final void rule__Type__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1843:1: ( ( ( rule__Type__Group_5__0 )? ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1844:1: ( ( rule__Type__Group_5__0 )? )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1844:1: ( ( rule__Type__Group_5__0 )? )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1845:1: ( rule__Type__Group_5__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_5()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1846:1: ( rule__Type__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1846:2: rule__Type__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Type__Group_5__0_in_rule__Type__Group__5__Impl3621);
                    rule__Type__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__5__Impl"


    // $ANTLR start "rule__Type__Group__6"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1856:1: rule__Type__Group__6 : rule__Type__Group__6__Impl ;
    public final void rule__Type__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1860:1: ( rule__Type__Group__6__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1861:2: rule__Type__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group__6__Impl_in_rule__Type__Group__63652);
            rule__Type__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__6"


    // $ANTLR start "rule__Type__Group__6__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1867:1: rule__Type__Group__6__Impl : ( '}' ) ;
    public final void rule__Type__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1871:1: ( ( '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1872:1: ( '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1872:1: ( '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1873:1: '}'
            {
             before(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Type__Group__6__Impl3680); 
             after(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__6__Impl"


    // $ANTLR start "rule__Type__Group_4__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1900:1: rule__Type__Group_4__0 : rule__Type__Group_4__0__Impl rule__Type__Group_4__1 ;
    public final void rule__Type__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1904:1: ( rule__Type__Group_4__0__Impl rule__Type__Group_4__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1905:2: rule__Type__Group_4__0__Impl rule__Type__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_4__0__Impl_in_rule__Type__Group_4__03725);
            rule__Type__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_4__1_in_rule__Type__Group_4__03728);
            rule__Type__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__0"


    // $ANTLR start "rule__Type__Group_4__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1912:1: rule__Type__Group_4__0__Impl : ( 'annotations' ) ;
    public final void rule__Type__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1916:1: ( ( 'annotations' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1917:1: ( 'annotations' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1917:1: ( 'annotations' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1918:1: 'annotations'
            {
             before(grammarAccess.getTypeAccess().getAnnotationsKeyword_4_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Type__Group_4__0__Impl3756); 
             after(grammarAccess.getTypeAccess().getAnnotationsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__0__Impl"


    // $ANTLR start "rule__Type__Group_4__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1931:1: rule__Type__Group_4__1 : rule__Type__Group_4__1__Impl rule__Type__Group_4__2 ;
    public final void rule__Type__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1935:1: ( rule__Type__Group_4__1__Impl rule__Type__Group_4__2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1936:2: rule__Type__Group_4__1__Impl rule__Type__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_4__1__Impl_in_rule__Type__Group_4__13787);
            rule__Type__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_4__2_in_rule__Type__Group_4__13790);
            rule__Type__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__1"


    // $ANTLR start "rule__Type__Group_4__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1943:1: rule__Type__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Type__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1947:1: ( ( '{' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1948:1: ( '{' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1948:1: ( '{' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1949:1: '{'
            {
             before(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Type__Group_4__1__Impl3818); 
             after(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__1__Impl"


    // $ANTLR start "rule__Type__Group_4__2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1962:1: rule__Type__Group_4__2 : rule__Type__Group_4__2__Impl rule__Type__Group_4__3 ;
    public final void rule__Type__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1966:1: ( rule__Type__Group_4__2__Impl rule__Type__Group_4__3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1967:2: rule__Type__Group_4__2__Impl rule__Type__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_4__2__Impl_in_rule__Type__Group_4__23849);
            rule__Type__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_4__3_in_rule__Type__Group_4__23852);
            rule__Type__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__2"


    // $ANTLR start "rule__Type__Group_4__2__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1974:1: rule__Type__Group_4__2__Impl : ( ( rule__Type__AnnotationsAssignment_4_2 ) ) ;
    public final void rule__Type__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1978:1: ( ( ( rule__Type__AnnotationsAssignment_4_2 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1979:1: ( ( rule__Type__AnnotationsAssignment_4_2 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1979:1: ( ( rule__Type__AnnotationsAssignment_4_2 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1980:1: ( rule__Type__AnnotationsAssignment_4_2 )
            {
             before(grammarAccess.getTypeAccess().getAnnotationsAssignment_4_2()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1981:1: ( rule__Type__AnnotationsAssignment_4_2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1981:2: rule__Type__AnnotationsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__AnnotationsAssignment_4_2_in_rule__Type__Group_4__2__Impl3879);
            rule__Type__AnnotationsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAnnotationsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__2__Impl"


    // $ANTLR start "rule__Type__Group_4__3"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1991:1: rule__Type__Group_4__3 : rule__Type__Group_4__3__Impl rule__Type__Group_4__4 ;
    public final void rule__Type__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1995:1: ( rule__Type__Group_4__3__Impl rule__Type__Group_4__4 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:1996:2: rule__Type__Group_4__3__Impl rule__Type__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_4__3__Impl_in_rule__Type__Group_4__33909);
            rule__Type__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_4__4_in_rule__Type__Group_4__33912);
            rule__Type__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__3"


    // $ANTLR start "rule__Type__Group_4__3__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2003:1: rule__Type__Group_4__3__Impl : ( ( rule__Type__Group_4_3__0 )* ) ;
    public final void rule__Type__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2007:1: ( ( ( rule__Type__Group_4_3__0 )* ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2008:1: ( ( rule__Type__Group_4_3__0 )* )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2008:1: ( ( rule__Type__Group_4_3__0 )* )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2009:1: ( rule__Type__Group_4_3__0 )*
            {
             before(grammarAccess.getTypeAccess().getGroup_4_3()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2010:1: ( rule__Type__Group_4_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2010:2: rule__Type__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Type__Group_4_3__0_in_rule__Type__Group_4__3__Impl3939);
            	    rule__Type__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__3__Impl"


    // $ANTLR start "rule__Type__Group_4__4"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2020:1: rule__Type__Group_4__4 : rule__Type__Group_4__4__Impl ;
    public final void rule__Type__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2024:1: ( rule__Type__Group_4__4__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2025:2: rule__Type__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_4__4__Impl_in_rule__Type__Group_4__43970);
            rule__Type__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__4"


    // $ANTLR start "rule__Type__Group_4__4__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2031:1: rule__Type__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Type__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2035:1: ( ( '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2036:1: ( '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2036:1: ( '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2037:1: '}'
            {
             before(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Type__Group_4__4__Impl3998); 
             after(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__4__Impl"


    // $ANTLR start "rule__Type__Group_4_3__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2060:1: rule__Type__Group_4_3__0 : rule__Type__Group_4_3__0__Impl rule__Type__Group_4_3__1 ;
    public final void rule__Type__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2064:1: ( rule__Type__Group_4_3__0__Impl rule__Type__Group_4_3__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2065:2: rule__Type__Group_4_3__0__Impl rule__Type__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_4_3__0__Impl_in_rule__Type__Group_4_3__04039);
            rule__Type__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_4_3__1_in_rule__Type__Group_4_3__04042);
            rule__Type__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4_3__0"


    // $ANTLR start "rule__Type__Group_4_3__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2072:1: rule__Type__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Type__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2076:1: ( ( ',' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2077:1: ( ',' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2077:1: ( ',' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2078:1: ','
            {
             before(grammarAccess.getTypeAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Type__Group_4_3__0__Impl4070); 
             after(grammarAccess.getTypeAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4_3__0__Impl"


    // $ANTLR start "rule__Type__Group_4_3__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2091:1: rule__Type__Group_4_3__1 : rule__Type__Group_4_3__1__Impl ;
    public final void rule__Type__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2095:1: ( rule__Type__Group_4_3__1__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2096:2: rule__Type__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_4_3__1__Impl_in_rule__Type__Group_4_3__14101);
            rule__Type__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4_3__1"


    // $ANTLR start "rule__Type__Group_4_3__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2102:1: rule__Type__Group_4_3__1__Impl : ( ( rule__Type__AnnotationsAssignment_4_3_1 ) ) ;
    public final void rule__Type__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2106:1: ( ( ( rule__Type__AnnotationsAssignment_4_3_1 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2107:1: ( ( rule__Type__AnnotationsAssignment_4_3_1 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2107:1: ( ( rule__Type__AnnotationsAssignment_4_3_1 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2108:1: ( rule__Type__AnnotationsAssignment_4_3_1 )
            {
             before(grammarAccess.getTypeAccess().getAnnotationsAssignment_4_3_1()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2109:1: ( rule__Type__AnnotationsAssignment_4_3_1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2109:2: rule__Type__AnnotationsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__AnnotationsAssignment_4_3_1_in_rule__Type__Group_4_3__1__Impl4128);
            rule__Type__AnnotationsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAnnotationsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4_3__1__Impl"


    // $ANTLR start "rule__Type__Group_5__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2123:1: rule__Type__Group_5__0 : rule__Type__Group_5__0__Impl rule__Type__Group_5__1 ;
    public final void rule__Type__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2127:1: ( rule__Type__Group_5__0__Impl rule__Type__Group_5__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2128:2: rule__Type__Group_5__0__Impl rule__Type__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_5__0__Impl_in_rule__Type__Group_5__04162);
            rule__Type__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_5__1_in_rule__Type__Group_5__04165);
            rule__Type__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__0"


    // $ANTLR start "rule__Type__Group_5__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2135:1: rule__Type__Group_5__0__Impl : ( 'attributes' ) ;
    public final void rule__Type__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2139:1: ( ( 'attributes' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2140:1: ( 'attributes' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2140:1: ( 'attributes' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2141:1: 'attributes'
            {
             before(grammarAccess.getTypeAccess().getAttributesKeyword_5_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Type__Group_5__0__Impl4193); 
             after(grammarAccess.getTypeAccess().getAttributesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__0__Impl"


    // $ANTLR start "rule__Type__Group_5__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2154:1: rule__Type__Group_5__1 : rule__Type__Group_5__1__Impl rule__Type__Group_5__2 ;
    public final void rule__Type__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2158:1: ( rule__Type__Group_5__1__Impl rule__Type__Group_5__2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2159:2: rule__Type__Group_5__1__Impl rule__Type__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_5__1__Impl_in_rule__Type__Group_5__14224);
            rule__Type__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_5__2_in_rule__Type__Group_5__14227);
            rule__Type__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__1"


    // $ANTLR start "rule__Type__Group_5__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2166:1: rule__Type__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Type__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2170:1: ( ( '{' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2171:1: ( '{' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2171:1: ( '{' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2172:1: '{'
            {
             before(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Type__Group_5__1__Impl4255); 
             after(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__1__Impl"


    // $ANTLR start "rule__Type__Group_5__2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2185:1: rule__Type__Group_5__2 : rule__Type__Group_5__2__Impl rule__Type__Group_5__3 ;
    public final void rule__Type__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2189:1: ( rule__Type__Group_5__2__Impl rule__Type__Group_5__3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2190:2: rule__Type__Group_5__2__Impl rule__Type__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_5__2__Impl_in_rule__Type__Group_5__24286);
            rule__Type__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_5__3_in_rule__Type__Group_5__24289);
            rule__Type__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__2"


    // $ANTLR start "rule__Type__Group_5__2__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2197:1: rule__Type__Group_5__2__Impl : ( ( rule__Type__AttributesAssignment_5_2 ) ) ;
    public final void rule__Type__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2201:1: ( ( ( rule__Type__AttributesAssignment_5_2 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2202:1: ( ( rule__Type__AttributesAssignment_5_2 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2202:1: ( ( rule__Type__AttributesAssignment_5_2 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2203:1: ( rule__Type__AttributesAssignment_5_2 )
            {
             before(grammarAccess.getTypeAccess().getAttributesAssignment_5_2()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2204:1: ( rule__Type__AttributesAssignment_5_2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2204:2: rule__Type__AttributesAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__AttributesAssignment_5_2_in_rule__Type__Group_5__2__Impl4316);
            rule__Type__AttributesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAttributesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__2__Impl"


    // $ANTLR start "rule__Type__Group_5__3"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2214:1: rule__Type__Group_5__3 : rule__Type__Group_5__3__Impl rule__Type__Group_5__4 ;
    public final void rule__Type__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2218:1: ( rule__Type__Group_5__3__Impl rule__Type__Group_5__4 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2219:2: rule__Type__Group_5__3__Impl rule__Type__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_5__3__Impl_in_rule__Type__Group_5__34346);
            rule__Type__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_5__4_in_rule__Type__Group_5__34349);
            rule__Type__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__3"


    // $ANTLR start "rule__Type__Group_5__3__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2226:1: rule__Type__Group_5__3__Impl : ( ( rule__Type__Group_5_3__0 )* ) ;
    public final void rule__Type__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2230:1: ( ( ( rule__Type__Group_5_3__0 )* ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2231:1: ( ( rule__Type__Group_5_3__0 )* )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2231:1: ( ( rule__Type__Group_5_3__0 )* )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2232:1: ( rule__Type__Group_5_3__0 )*
            {
             before(grammarAccess.getTypeAccess().getGroup_5_3()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2233:1: ( rule__Type__Group_5_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2233:2: rule__Type__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Type__Group_5_3__0_in_rule__Type__Group_5__3__Impl4376);
            	    rule__Type__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__3__Impl"


    // $ANTLR start "rule__Type__Group_5__4"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2243:1: rule__Type__Group_5__4 : rule__Type__Group_5__4__Impl ;
    public final void rule__Type__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2247:1: ( rule__Type__Group_5__4__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2248:2: rule__Type__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_5__4__Impl_in_rule__Type__Group_5__44407);
            rule__Type__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__4"


    // $ANTLR start "rule__Type__Group_5__4__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2254:1: rule__Type__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Type__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2258:1: ( ( '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2259:1: ( '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2259:1: ( '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2260:1: '}'
            {
             before(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Type__Group_5__4__Impl4435); 
             after(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__4__Impl"


    // $ANTLR start "rule__Type__Group_5_3__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2283:1: rule__Type__Group_5_3__0 : rule__Type__Group_5_3__0__Impl rule__Type__Group_5_3__1 ;
    public final void rule__Type__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2287:1: ( rule__Type__Group_5_3__0__Impl rule__Type__Group_5_3__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2288:2: rule__Type__Group_5_3__0__Impl rule__Type__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_5_3__0__Impl_in_rule__Type__Group_5_3__04476);
            rule__Type__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_5_3__1_in_rule__Type__Group_5_3__04479);
            rule__Type__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5_3__0"


    // $ANTLR start "rule__Type__Group_5_3__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2295:1: rule__Type__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Type__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2299:1: ( ( ',' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2300:1: ( ',' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2300:1: ( ',' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2301:1: ','
            {
             before(grammarAccess.getTypeAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Type__Group_5_3__0__Impl4507); 
             after(grammarAccess.getTypeAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5_3__0__Impl"


    // $ANTLR start "rule__Type__Group_5_3__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2314:1: rule__Type__Group_5_3__1 : rule__Type__Group_5_3__1__Impl ;
    public final void rule__Type__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2318:1: ( rule__Type__Group_5_3__1__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2319:2: rule__Type__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Group_5_3__1__Impl_in_rule__Type__Group_5_3__14538);
            rule__Type__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5_3__1"


    // $ANTLR start "rule__Type__Group_5_3__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2325:1: rule__Type__Group_5_3__1__Impl : ( ( rule__Type__AttributesAssignment_5_3_1 ) ) ;
    public final void rule__Type__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2329:1: ( ( ( rule__Type__AttributesAssignment_5_3_1 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2330:1: ( ( rule__Type__AttributesAssignment_5_3_1 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2330:1: ( ( rule__Type__AttributesAssignment_5_3_1 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2331:1: ( rule__Type__AttributesAssignment_5_3_1 )
            {
             before(grammarAccess.getTypeAccess().getAttributesAssignment_5_3_1()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2332:1: ( rule__Type__AttributesAssignment_5_3_1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2332:2: rule__Type__AttributesAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__AttributesAssignment_5_3_1_in_rule__Type__Group_5_3__1__Impl4565);
            rule__Type__AttributesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAttributesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5_3__1__Impl"


    // $ANTLR start "rule__AnnotationType__Group__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2346:1: rule__AnnotationType__Group__0 : rule__AnnotationType__Group__0__Impl rule__AnnotationType__Group__1 ;
    public final void rule__AnnotationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2350:1: ( rule__AnnotationType__Group__0__Impl rule__AnnotationType__Group__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2351:2: rule__AnnotationType__Group__0__Impl rule__AnnotationType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__0__Impl_in_rule__AnnotationType__Group__04599);
            rule__AnnotationType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__1_in_rule__AnnotationType__Group__04602);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2358:1: rule__AnnotationType__Group__0__Impl : ( () ) ;
    public final void rule__AnnotationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2362:1: ( ( () ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2363:1: ( () )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2363:1: ( () )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2364:1: ()
            {
             before(grammarAccess.getAnnotationTypeAccess().getAnnotationTypeAction_0()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2365:1: ()
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2367:1: 
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2377:1: rule__AnnotationType__Group__1 : rule__AnnotationType__Group__1__Impl rule__AnnotationType__Group__2 ;
    public final void rule__AnnotationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2381:1: ( rule__AnnotationType__Group__1__Impl rule__AnnotationType__Group__2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2382:2: rule__AnnotationType__Group__1__Impl rule__AnnotationType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__1__Impl_in_rule__AnnotationType__Group__14660);
            rule__AnnotationType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__2_in_rule__AnnotationType__Group__14663);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2389:1: rule__AnnotationType__Group__1__Impl : ( 'AnnotationType' ) ;
    public final void rule__AnnotationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2393:1: ( ( 'AnnotationType' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2394:1: ( 'AnnotationType' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2394:1: ( 'AnnotationType' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2395:1: 'AnnotationType'
            {
             before(grammarAccess.getAnnotationTypeAccess().getAnnotationTypeKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__AnnotationType__Group__1__Impl4691); 
             after(grammarAccess.getAnnotationTypeAccess().getAnnotationTypeKeyword_1()); 

            }


            }

        }
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2408:1: rule__AnnotationType__Group__2 : rule__AnnotationType__Group__2__Impl rule__AnnotationType__Group__3 ;
    public final void rule__AnnotationType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2412:1: ( rule__AnnotationType__Group__2__Impl rule__AnnotationType__Group__3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2413:2: rule__AnnotationType__Group__2__Impl rule__AnnotationType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__2__Impl_in_rule__AnnotationType__Group__24722);
            rule__AnnotationType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__3_in_rule__AnnotationType__Group__24725);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2420:1: rule__AnnotationType__Group__2__Impl : ( ( rule__AnnotationType__NameAssignment_2 ) ) ;
    public final void rule__AnnotationType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2424:1: ( ( ( rule__AnnotationType__NameAssignment_2 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2425:1: ( ( rule__AnnotationType__NameAssignment_2 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2425:1: ( ( rule__AnnotationType__NameAssignment_2 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2426:1: ( rule__AnnotationType__NameAssignment_2 )
            {
             before(grammarAccess.getAnnotationTypeAccess().getNameAssignment_2()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2427:1: ( rule__AnnotationType__NameAssignment_2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2427:2: rule__AnnotationType__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__NameAssignment_2_in_rule__AnnotationType__Group__2__Impl4752);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2437:1: rule__AnnotationType__Group__3 : rule__AnnotationType__Group__3__Impl rule__AnnotationType__Group__4 ;
    public final void rule__AnnotationType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2441:1: ( rule__AnnotationType__Group__3__Impl rule__AnnotationType__Group__4 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2442:2: rule__AnnotationType__Group__3__Impl rule__AnnotationType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__3__Impl_in_rule__AnnotationType__Group__34782);
            rule__AnnotationType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__4_in_rule__AnnotationType__Group__34785);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2449:1: rule__AnnotationType__Group__3__Impl : ( '{' ) ;
    public final void rule__AnnotationType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2453:1: ( ( '{' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2454:1: ( '{' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2454:1: ( '{' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2455:1: '{'
            {
             before(grammarAccess.getAnnotationTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__AnnotationType__Group__3__Impl4813); 
             after(grammarAccess.getAnnotationTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2468:1: rule__AnnotationType__Group__4 : rule__AnnotationType__Group__4__Impl rule__AnnotationType__Group__5 ;
    public final void rule__AnnotationType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2472:1: ( rule__AnnotationType__Group__4__Impl rule__AnnotationType__Group__5 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2473:2: rule__AnnotationType__Group__4__Impl rule__AnnotationType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__4__Impl_in_rule__AnnotationType__Group__44844);
            rule__AnnotationType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__5_in_rule__AnnotationType__Group__44847);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2480:1: rule__AnnotationType__Group__4__Impl : ( ( rule__AnnotationType__Group_4__0 )? ) ;
    public final void rule__AnnotationType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2484:1: ( ( ( rule__AnnotationType__Group_4__0 )? ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2485:1: ( ( rule__AnnotationType__Group_4__0 )? )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2485:1: ( ( rule__AnnotationType__Group_4__0 )? )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2486:1: ( rule__AnnotationType__Group_4__0 )?
            {
             before(grammarAccess.getAnnotationTypeAccess().getGroup_4()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2487:1: ( rule__AnnotationType__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2487:2: rule__AnnotationType__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_4__0_in_rule__AnnotationType__Group__4__Impl4874);
                    rule__AnnotationType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnotationTypeAccess().getGroup_4()); 

            }


            }

        }
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2497:1: rule__AnnotationType__Group__5 : rule__AnnotationType__Group__5__Impl rule__AnnotationType__Group__6 ;
    public final void rule__AnnotationType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2501:1: ( rule__AnnotationType__Group__5__Impl rule__AnnotationType__Group__6 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2502:2: rule__AnnotationType__Group__5__Impl rule__AnnotationType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__5__Impl_in_rule__AnnotationType__Group__54905);
            rule__AnnotationType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__6_in_rule__AnnotationType__Group__54908);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2509:1: rule__AnnotationType__Group__5__Impl : ( ( rule__AnnotationType__Group_5__0 )? ) ;
    public final void rule__AnnotationType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2513:1: ( ( ( rule__AnnotationType__Group_5__0 )? ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2514:1: ( ( rule__AnnotationType__Group_5__0 )? )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2514:1: ( ( rule__AnnotationType__Group_5__0 )? )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2515:1: ( rule__AnnotationType__Group_5__0 )?
            {
             before(grammarAccess.getAnnotationTypeAccess().getGroup_5()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2516:1: ( rule__AnnotationType__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2516:2: rule__AnnotationType__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_5__0_in_rule__AnnotationType__Group__5__Impl4935);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2526:1: rule__AnnotationType__Group__6 : rule__AnnotationType__Group__6__Impl ;
    public final void rule__AnnotationType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2530:1: ( rule__AnnotationType__Group__6__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2531:2: rule__AnnotationType__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group__6__Impl_in_rule__AnnotationType__Group__64966);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2537:1: rule__AnnotationType__Group__6__Impl : ( '}' ) ;
    public final void rule__AnnotationType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2541:1: ( ( '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2542:1: ( '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2542:1: ( '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2543:1: '}'
            {
             before(grammarAccess.getAnnotationTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__AnnotationType__Group__6__Impl4994); 
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


    // $ANTLR start "rule__AnnotationType__Group_4__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2570:1: rule__AnnotationType__Group_4__0 : rule__AnnotationType__Group_4__0__Impl rule__AnnotationType__Group_4__1 ;
    public final void rule__AnnotationType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2574:1: ( rule__AnnotationType__Group_4__0__Impl rule__AnnotationType__Group_4__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2575:2: rule__AnnotationType__Group_4__0__Impl rule__AnnotationType__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_4__0__Impl_in_rule__AnnotationType__Group_4__05039);
            rule__AnnotationType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_4__1_in_rule__AnnotationType__Group_4__05042);
            rule__AnnotationType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_4__0"


    // $ANTLR start "rule__AnnotationType__Group_4__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2582:1: rule__AnnotationType__Group_4__0__Impl : ( 'context' ) ;
    public final void rule__AnnotationType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2586:1: ( ( 'context' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2587:1: ( 'context' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2587:1: ( 'context' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2588:1: 'context'
            {
             before(grammarAccess.getAnnotationTypeAccess().getContextKeyword_4_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__AnnotationType__Group_4__0__Impl5070); 
             after(grammarAccess.getAnnotationTypeAccess().getContextKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_4__0__Impl"


    // $ANTLR start "rule__AnnotationType__Group_4__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2601:1: rule__AnnotationType__Group_4__1 : rule__AnnotationType__Group_4__1__Impl ;
    public final void rule__AnnotationType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2605:1: ( rule__AnnotationType__Group_4__1__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2606:2: rule__AnnotationType__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_4__1__Impl_in_rule__AnnotationType__Group_4__15101);
            rule__AnnotationType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_4__1"


    // $ANTLR start "rule__AnnotationType__Group_4__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2612:1: rule__AnnotationType__Group_4__1__Impl : ( ( rule__AnnotationType__ContextAssignment_4_1 ) ) ;
    public final void rule__AnnotationType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2616:1: ( ( ( rule__AnnotationType__ContextAssignment_4_1 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2617:1: ( ( rule__AnnotationType__ContextAssignment_4_1 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2617:1: ( ( rule__AnnotationType__ContextAssignment_4_1 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2618:1: ( rule__AnnotationType__ContextAssignment_4_1 )
            {
             before(grammarAccess.getAnnotationTypeAccess().getContextAssignment_4_1()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2619:1: ( rule__AnnotationType__ContextAssignment_4_1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2619:2: rule__AnnotationType__ContextAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__ContextAssignment_4_1_in_rule__AnnotationType__Group_4__1__Impl5128);
            rule__AnnotationType__ContextAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationTypeAccess().getContextAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_4__1__Impl"


    // $ANTLR start "rule__AnnotationType__Group_5__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2633:1: rule__AnnotationType__Group_5__0 : rule__AnnotationType__Group_5__0__Impl rule__AnnotationType__Group_5__1 ;
    public final void rule__AnnotationType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2637:1: ( rule__AnnotationType__Group_5__0__Impl rule__AnnotationType__Group_5__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2638:2: rule__AnnotationType__Group_5__0__Impl rule__AnnotationType__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_5__0__Impl_in_rule__AnnotationType__Group_5__05162);
            rule__AnnotationType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_5__1_in_rule__AnnotationType__Group_5__05165);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2645:1: rule__AnnotationType__Group_5__0__Impl : ( 'attributes' ) ;
    public final void rule__AnnotationType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2649:1: ( ( 'attributes' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2650:1: ( 'attributes' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2650:1: ( 'attributes' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2651:1: 'attributes'
            {
             before(grammarAccess.getAnnotationTypeAccess().getAttributesKeyword_5_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__AnnotationType__Group_5__0__Impl5193); 
             after(grammarAccess.getAnnotationTypeAccess().getAttributesKeyword_5_0()); 

            }


            }

        }
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2664:1: rule__AnnotationType__Group_5__1 : rule__AnnotationType__Group_5__1__Impl rule__AnnotationType__Group_5__2 ;
    public final void rule__AnnotationType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2668:1: ( rule__AnnotationType__Group_5__1__Impl rule__AnnotationType__Group_5__2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2669:2: rule__AnnotationType__Group_5__1__Impl rule__AnnotationType__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_5__1__Impl_in_rule__AnnotationType__Group_5__15224);
            rule__AnnotationType__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_5__2_in_rule__AnnotationType__Group_5__15227);
            rule__AnnotationType__Group_5__2();

            state._fsp--;


            }

        }
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2676:1: rule__AnnotationType__Group_5__1__Impl : ( '{' ) ;
    public final void rule__AnnotationType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2680:1: ( ( '{' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2681:1: ( '{' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2681:1: ( '{' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2682:1: '{'
            {
             before(grammarAccess.getAnnotationTypeAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__AnnotationType__Group_5__1__Impl5255); 
             after(grammarAccess.getAnnotationTypeAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__AnnotationType__Group_5__2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2695:1: rule__AnnotationType__Group_5__2 : rule__AnnotationType__Group_5__2__Impl rule__AnnotationType__Group_5__3 ;
    public final void rule__AnnotationType__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2699:1: ( rule__AnnotationType__Group_5__2__Impl rule__AnnotationType__Group_5__3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2700:2: rule__AnnotationType__Group_5__2__Impl rule__AnnotationType__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_5__2__Impl_in_rule__AnnotationType__Group_5__25286);
            rule__AnnotationType__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_5__3_in_rule__AnnotationType__Group_5__25289);
            rule__AnnotationType__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_5__2"


    // $ANTLR start "rule__AnnotationType__Group_5__2__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2707:1: rule__AnnotationType__Group_5__2__Impl : ( ( rule__AnnotationType__AttributesAssignment_5_2 ) ) ;
    public final void rule__AnnotationType__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2711:1: ( ( ( rule__AnnotationType__AttributesAssignment_5_2 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2712:1: ( ( rule__AnnotationType__AttributesAssignment_5_2 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2712:1: ( ( rule__AnnotationType__AttributesAssignment_5_2 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2713:1: ( rule__AnnotationType__AttributesAssignment_5_2 )
            {
             before(grammarAccess.getAnnotationTypeAccess().getAttributesAssignment_5_2()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2714:1: ( rule__AnnotationType__AttributesAssignment_5_2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2714:2: rule__AnnotationType__AttributesAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__AttributesAssignment_5_2_in_rule__AnnotationType__Group_5__2__Impl5316);
            rule__AnnotationType__AttributesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationTypeAccess().getAttributesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_5__2__Impl"


    // $ANTLR start "rule__AnnotationType__Group_5__3"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2724:1: rule__AnnotationType__Group_5__3 : rule__AnnotationType__Group_5__3__Impl rule__AnnotationType__Group_5__4 ;
    public final void rule__AnnotationType__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2728:1: ( rule__AnnotationType__Group_5__3__Impl rule__AnnotationType__Group_5__4 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2729:2: rule__AnnotationType__Group_5__3__Impl rule__AnnotationType__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_5__3__Impl_in_rule__AnnotationType__Group_5__35346);
            rule__AnnotationType__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_5__4_in_rule__AnnotationType__Group_5__35349);
            rule__AnnotationType__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_5__3"


    // $ANTLR start "rule__AnnotationType__Group_5__3__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2736:1: rule__AnnotationType__Group_5__3__Impl : ( ( rule__AnnotationType__Group_5_3__0 )* ) ;
    public final void rule__AnnotationType__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2740:1: ( ( ( rule__AnnotationType__Group_5_3__0 )* ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2741:1: ( ( rule__AnnotationType__Group_5_3__0 )* )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2741:1: ( ( rule__AnnotationType__Group_5_3__0 )* )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2742:1: ( rule__AnnotationType__Group_5_3__0 )*
            {
             before(grammarAccess.getAnnotationTypeAccess().getGroup_5_3()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2743:1: ( rule__AnnotationType__Group_5_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==15) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2743:2: rule__AnnotationType__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_5_3__0_in_rule__AnnotationType__Group_5__3__Impl5376);
            	    rule__AnnotationType__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getAnnotationTypeAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_5__3__Impl"


    // $ANTLR start "rule__AnnotationType__Group_5__4"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2753:1: rule__AnnotationType__Group_5__4 : rule__AnnotationType__Group_5__4__Impl ;
    public final void rule__AnnotationType__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2757:1: ( rule__AnnotationType__Group_5__4__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2758:2: rule__AnnotationType__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_5__4__Impl_in_rule__AnnotationType__Group_5__45407);
            rule__AnnotationType__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_5__4"


    // $ANTLR start "rule__AnnotationType__Group_5__4__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2764:1: rule__AnnotationType__Group_5__4__Impl : ( '}' ) ;
    public final void rule__AnnotationType__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2768:1: ( ( '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2769:1: ( '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2769:1: ( '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2770:1: '}'
            {
             before(grammarAccess.getAnnotationTypeAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__AnnotationType__Group_5__4__Impl5435); 
             after(grammarAccess.getAnnotationTypeAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_5__4__Impl"


    // $ANTLR start "rule__AnnotationType__Group_5_3__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2793:1: rule__AnnotationType__Group_5_3__0 : rule__AnnotationType__Group_5_3__0__Impl rule__AnnotationType__Group_5_3__1 ;
    public final void rule__AnnotationType__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2797:1: ( rule__AnnotationType__Group_5_3__0__Impl rule__AnnotationType__Group_5_3__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2798:2: rule__AnnotationType__Group_5_3__0__Impl rule__AnnotationType__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_5_3__0__Impl_in_rule__AnnotationType__Group_5_3__05476);
            rule__AnnotationType__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_5_3__1_in_rule__AnnotationType__Group_5_3__05479);
            rule__AnnotationType__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_5_3__0"


    // $ANTLR start "rule__AnnotationType__Group_5_3__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2805:1: rule__AnnotationType__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__AnnotationType__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2809:1: ( ( ',' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2810:1: ( ',' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2810:1: ( ',' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2811:1: ','
            {
             before(grammarAccess.getAnnotationTypeAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__AnnotationType__Group_5_3__0__Impl5507); 
             after(grammarAccess.getAnnotationTypeAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_5_3__0__Impl"


    // $ANTLR start "rule__AnnotationType__Group_5_3__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2824:1: rule__AnnotationType__Group_5_3__1 : rule__AnnotationType__Group_5_3__1__Impl ;
    public final void rule__AnnotationType__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2828:1: ( rule__AnnotationType__Group_5_3__1__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2829:2: rule__AnnotationType__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__Group_5_3__1__Impl_in_rule__AnnotationType__Group_5_3__15538);
            rule__AnnotationType__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_5_3__1"


    // $ANTLR start "rule__AnnotationType__Group_5_3__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2835:1: rule__AnnotationType__Group_5_3__1__Impl : ( ( rule__AnnotationType__AttributesAssignment_5_3_1 ) ) ;
    public final void rule__AnnotationType__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2839:1: ( ( ( rule__AnnotationType__AttributesAssignment_5_3_1 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2840:1: ( ( rule__AnnotationType__AttributesAssignment_5_3_1 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2840:1: ( ( rule__AnnotationType__AttributesAssignment_5_3_1 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2841:1: ( rule__AnnotationType__AttributesAssignment_5_3_1 )
            {
             before(grammarAccess.getAnnotationTypeAccess().getAttributesAssignment_5_3_1()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2842:1: ( rule__AnnotationType__AttributesAssignment_5_3_1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2842:2: rule__AnnotationType__AttributesAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationType__AttributesAssignment_5_3_1_in_rule__AnnotationType__Group_5_3__1__Impl5565);
            rule__AnnotationType__AttributesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationTypeAccess().getAttributesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__Group_5_3__1__Impl"


    // $ANTLR start "rule__AnnotationAttribute__Group__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2856:1: rule__AnnotationAttribute__Group__0 : rule__AnnotationAttribute__Group__0__Impl rule__AnnotationAttribute__Group__1 ;
    public final void rule__AnnotationAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2860:1: ( rule__AnnotationAttribute__Group__0__Impl rule__AnnotationAttribute__Group__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2861:2: rule__AnnotationAttribute__Group__0__Impl rule__AnnotationAttribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__0__Impl_in_rule__AnnotationAttribute__Group__05599);
            rule__AnnotationAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__1_in_rule__AnnotationAttribute__Group__05602);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2868:1: rule__AnnotationAttribute__Group__0__Impl : ( 'AnnotationAttribute' ) ;
    public final void rule__AnnotationAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2872:1: ( ( 'AnnotationAttribute' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2873:1: ( 'AnnotationAttribute' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2873:1: ( 'AnnotationAttribute' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2874:1: 'AnnotationAttribute'
            {
             before(grammarAccess.getAnnotationAttributeAccess().getAnnotationAttributeKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__AnnotationAttribute__Group__0__Impl5630); 
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2887:1: rule__AnnotationAttribute__Group__1 : rule__AnnotationAttribute__Group__1__Impl rule__AnnotationAttribute__Group__2 ;
    public final void rule__AnnotationAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2891:1: ( rule__AnnotationAttribute__Group__1__Impl rule__AnnotationAttribute__Group__2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2892:2: rule__AnnotationAttribute__Group__1__Impl rule__AnnotationAttribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__1__Impl_in_rule__AnnotationAttribute__Group__15661);
            rule__AnnotationAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__2_in_rule__AnnotationAttribute__Group__15664);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2899:1: rule__AnnotationAttribute__Group__1__Impl : ( '{' ) ;
    public final void rule__AnnotationAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2903:1: ( ( '{' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2904:1: ( '{' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2904:1: ( '{' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2905:1: '{'
            {
             before(grammarAccess.getAnnotationAttributeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__AnnotationAttribute__Group__1__Impl5692); 
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2918:1: rule__AnnotationAttribute__Group__2 : rule__AnnotationAttribute__Group__2__Impl rule__AnnotationAttribute__Group__3 ;
    public final void rule__AnnotationAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2922:1: ( rule__AnnotationAttribute__Group__2__Impl rule__AnnotationAttribute__Group__3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2923:2: rule__AnnotationAttribute__Group__2__Impl rule__AnnotationAttribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__2__Impl_in_rule__AnnotationAttribute__Group__25723);
            rule__AnnotationAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__3_in_rule__AnnotationAttribute__Group__25726);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2930:1: rule__AnnotationAttribute__Group__2__Impl : ( 'attribute' ) ;
    public final void rule__AnnotationAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2934:1: ( ( 'attribute' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2935:1: ( 'attribute' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2935:1: ( 'attribute' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2936:1: 'attribute'
            {
             before(grammarAccess.getAnnotationAttributeAccess().getAttributeKeyword_2()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__AnnotationAttribute__Group__2__Impl5754); 
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2949:1: rule__AnnotationAttribute__Group__3 : rule__AnnotationAttribute__Group__3__Impl rule__AnnotationAttribute__Group__4 ;
    public final void rule__AnnotationAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2953:1: ( rule__AnnotationAttribute__Group__3__Impl rule__AnnotationAttribute__Group__4 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2954:2: rule__AnnotationAttribute__Group__3__Impl rule__AnnotationAttribute__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__3__Impl_in_rule__AnnotationAttribute__Group__35785);
            rule__AnnotationAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__4_in_rule__AnnotationAttribute__Group__35788);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2961:1: rule__AnnotationAttribute__Group__3__Impl : ( ( rule__AnnotationAttribute__AttributeAssignment_3 ) ) ;
    public final void rule__AnnotationAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2965:1: ( ( ( rule__AnnotationAttribute__AttributeAssignment_3 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2966:1: ( ( rule__AnnotationAttribute__AttributeAssignment_3 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2966:1: ( ( rule__AnnotationAttribute__AttributeAssignment_3 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2967:1: ( rule__AnnotationAttribute__AttributeAssignment_3 )
            {
             before(grammarAccess.getAnnotationAttributeAccess().getAttributeAssignment_3()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2968:1: ( rule__AnnotationAttribute__AttributeAssignment_3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2968:2: rule__AnnotationAttribute__AttributeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__AttributeAssignment_3_in_rule__AnnotationAttribute__Group__3__Impl5815);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2978:1: rule__AnnotationAttribute__Group__4 : rule__AnnotationAttribute__Group__4__Impl rule__AnnotationAttribute__Group__5 ;
    public final void rule__AnnotationAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2982:1: ( rule__AnnotationAttribute__Group__4__Impl rule__AnnotationAttribute__Group__5 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2983:2: rule__AnnotationAttribute__Group__4__Impl rule__AnnotationAttribute__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__4__Impl_in_rule__AnnotationAttribute__Group__45845);
            rule__AnnotationAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__5_in_rule__AnnotationAttribute__Group__45848);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2990:1: rule__AnnotationAttribute__Group__4__Impl : ( ( rule__AnnotationAttribute__Group_4__0 )? ) ;
    public final void rule__AnnotationAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2994:1: ( ( ( rule__AnnotationAttribute__Group_4__0 )? ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2995:1: ( ( rule__AnnotationAttribute__Group_4__0 )? )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2995:1: ( ( rule__AnnotationAttribute__Group_4__0 )? )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2996:1: ( rule__AnnotationAttribute__Group_4__0 )?
            {
             before(grammarAccess.getAnnotationAttributeAccess().getGroup_4()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2997:1: ( rule__AnnotationAttribute__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:2997:2: rule__AnnotationAttribute__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group_4__0_in_rule__AnnotationAttribute__Group__4__Impl5875);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3007:1: rule__AnnotationAttribute__Group__5 : rule__AnnotationAttribute__Group__5__Impl ;
    public final void rule__AnnotationAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3011:1: ( rule__AnnotationAttribute__Group__5__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3012:2: rule__AnnotationAttribute__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__5__Impl_in_rule__AnnotationAttribute__Group__55906);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3018:1: rule__AnnotationAttribute__Group__5__Impl : ( '}' ) ;
    public final void rule__AnnotationAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3022:1: ( ( '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3023:1: ( '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3023:1: ( '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3024:1: '}'
            {
             before(grammarAccess.getAnnotationAttributeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__AnnotationAttribute__Group__5__Impl5934); 
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3049:1: rule__AnnotationAttribute__Group_4__0 : rule__AnnotationAttribute__Group_4__0__Impl rule__AnnotationAttribute__Group_4__1 ;
    public final void rule__AnnotationAttribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3053:1: ( rule__AnnotationAttribute__Group_4__0__Impl rule__AnnotationAttribute__Group_4__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3054:2: rule__AnnotationAttribute__Group_4__0__Impl rule__AnnotationAttribute__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group_4__0__Impl_in_rule__AnnotationAttribute__Group_4__05977);
            rule__AnnotationAttribute__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group_4__1_in_rule__AnnotationAttribute__Group_4__05980);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3061:1: rule__AnnotationAttribute__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__AnnotationAttribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3065:1: ( ( 'value' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3066:1: ( 'value' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3066:1: ( 'value' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3067:1: 'value'
            {
             before(grammarAccess.getAnnotationAttributeAccess().getValueKeyword_4_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__AnnotationAttribute__Group_4__0__Impl6008); 
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3080:1: rule__AnnotationAttribute__Group_4__1 : rule__AnnotationAttribute__Group_4__1__Impl ;
    public final void rule__AnnotationAttribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3084:1: ( rule__AnnotationAttribute__Group_4__1__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3085:2: rule__AnnotationAttribute__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group_4__1__Impl_in_rule__AnnotationAttribute__Group_4__16039);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3091:1: rule__AnnotationAttribute__Group_4__1__Impl : ( ( rule__AnnotationAttribute__ValueAssignment_4_1 ) ) ;
    public final void rule__AnnotationAttribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3095:1: ( ( ( rule__AnnotationAttribute__ValueAssignment_4_1 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3096:1: ( ( rule__AnnotationAttribute__ValueAssignment_4_1 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3096:1: ( ( rule__AnnotationAttribute__ValueAssignment_4_1 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3097:1: ( rule__AnnotationAttribute__ValueAssignment_4_1 )
            {
             before(grammarAccess.getAnnotationAttributeAccess().getValueAssignment_4_1()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3098:1: ( rule__AnnotationAttribute__ValueAssignment_4_1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3098:2: rule__AnnotationAttribute__ValueAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__ValueAssignment_4_1_in_rule__AnnotationAttribute__Group_4__1__Impl6066);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3112:1: rule__AnnotationTypeAttribute__Group__0 : rule__AnnotationTypeAttribute__Group__0__Impl rule__AnnotationTypeAttribute__Group__1 ;
    public final void rule__AnnotationTypeAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3116:1: ( rule__AnnotationTypeAttribute__Group__0__Impl rule__AnnotationTypeAttribute__Group__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3117:2: rule__AnnotationTypeAttribute__Group__0__Impl rule__AnnotationTypeAttribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group__0__Impl_in_rule__AnnotationTypeAttribute__Group__06100);
            rule__AnnotationTypeAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group__1_in_rule__AnnotationTypeAttribute__Group__06103);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3124:1: rule__AnnotationTypeAttribute__Group__0__Impl : ( () ) ;
    public final void rule__AnnotationTypeAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3128:1: ( ( () ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3129:1: ( () )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3129:1: ( () )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3130:1: ()
            {
             before(grammarAccess.getAnnotationTypeAttributeAccess().getAnnotationTypeAttributeAction_0()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3131:1: ()
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3133:1: 
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3143:1: rule__AnnotationTypeAttribute__Group__1 : rule__AnnotationTypeAttribute__Group__1__Impl rule__AnnotationTypeAttribute__Group__2 ;
    public final void rule__AnnotationTypeAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3147:1: ( rule__AnnotationTypeAttribute__Group__1__Impl rule__AnnotationTypeAttribute__Group__2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3148:2: rule__AnnotationTypeAttribute__Group__1__Impl rule__AnnotationTypeAttribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group__1__Impl_in_rule__AnnotationTypeAttribute__Group__16161);
            rule__AnnotationTypeAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group__2_in_rule__AnnotationTypeAttribute__Group__16164);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3155:1: rule__AnnotationTypeAttribute__Group__1__Impl : ( 'AnnotationTypeAttribute' ) ;
    public final void rule__AnnotationTypeAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3159:1: ( ( 'AnnotationTypeAttribute' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3160:1: ( 'AnnotationTypeAttribute' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3160:1: ( 'AnnotationTypeAttribute' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3161:1: 'AnnotationTypeAttribute'
            {
             before(grammarAccess.getAnnotationTypeAttributeAccess().getAnnotationTypeAttributeKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__AnnotationTypeAttribute__Group__1__Impl6192); 
             after(grammarAccess.getAnnotationTypeAttributeAccess().getAnnotationTypeAttributeKeyword_1()); 

            }


            }

        }
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3174:1: rule__AnnotationTypeAttribute__Group__2 : rule__AnnotationTypeAttribute__Group__2__Impl rule__AnnotationTypeAttribute__Group__3 ;
    public final void rule__AnnotationTypeAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3178:1: ( rule__AnnotationTypeAttribute__Group__2__Impl rule__AnnotationTypeAttribute__Group__3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3179:2: rule__AnnotationTypeAttribute__Group__2__Impl rule__AnnotationTypeAttribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group__2__Impl_in_rule__AnnotationTypeAttribute__Group__26223);
            rule__AnnotationTypeAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group__3_in_rule__AnnotationTypeAttribute__Group__26226);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3186:1: rule__AnnotationTypeAttribute__Group__2__Impl : ( ( rule__AnnotationTypeAttribute__NameAssignment_2 ) ) ;
    public final void rule__AnnotationTypeAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3190:1: ( ( ( rule__AnnotationTypeAttribute__NameAssignment_2 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3191:1: ( ( rule__AnnotationTypeAttribute__NameAssignment_2 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3191:1: ( ( rule__AnnotationTypeAttribute__NameAssignment_2 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3192:1: ( rule__AnnotationTypeAttribute__NameAssignment_2 )
            {
             before(grammarAccess.getAnnotationTypeAttributeAccess().getNameAssignment_2()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3193:1: ( rule__AnnotationTypeAttribute__NameAssignment_2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3193:2: rule__AnnotationTypeAttribute__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__NameAssignment_2_in_rule__AnnotationTypeAttribute__Group__2__Impl6253);
            rule__AnnotationTypeAttribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationTypeAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3203:1: rule__AnnotationTypeAttribute__Group__3 : rule__AnnotationTypeAttribute__Group__3__Impl rule__AnnotationTypeAttribute__Group__4 ;
    public final void rule__AnnotationTypeAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3207:1: ( rule__AnnotationTypeAttribute__Group__3__Impl rule__AnnotationTypeAttribute__Group__4 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3208:2: rule__AnnotationTypeAttribute__Group__3__Impl rule__AnnotationTypeAttribute__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group__3__Impl_in_rule__AnnotationTypeAttribute__Group__36283);
            rule__AnnotationTypeAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group__4_in_rule__AnnotationTypeAttribute__Group__36286);
            rule__AnnotationTypeAttribute__Group__4();

            state._fsp--;


            }

        }
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3215:1: rule__AnnotationTypeAttribute__Group__3__Impl : ( '{' ) ;
    public final void rule__AnnotationTypeAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3219:1: ( ( '{' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3220:1: ( '{' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3220:1: ( '{' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3221:1: '{'
            {
             before(grammarAccess.getAnnotationTypeAttributeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__AnnotationTypeAttribute__Group__3__Impl6314); 
             after(grammarAccess.getAnnotationTypeAttributeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__AnnotationTypeAttribute__Group__4"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3234:1: rule__AnnotationTypeAttribute__Group__4 : rule__AnnotationTypeAttribute__Group__4__Impl rule__AnnotationTypeAttribute__Group__5 ;
    public final void rule__AnnotationTypeAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3238:1: ( rule__AnnotationTypeAttribute__Group__4__Impl rule__AnnotationTypeAttribute__Group__5 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3239:2: rule__AnnotationTypeAttribute__Group__4__Impl rule__AnnotationTypeAttribute__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group__4__Impl_in_rule__AnnotationTypeAttribute__Group__46345);
            rule__AnnotationTypeAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group__5_in_rule__AnnotationTypeAttribute__Group__46348);
            rule__AnnotationTypeAttribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationTypeAttribute__Group__4"


    // $ANTLR start "rule__AnnotationTypeAttribute__Group__4__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3246:1: rule__AnnotationTypeAttribute__Group__4__Impl : ( ( rule__AnnotationTypeAttribute__Group_4__0 )? ) ;
    public final void rule__AnnotationTypeAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3250:1: ( ( ( rule__AnnotationTypeAttribute__Group_4__0 )? ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3251:1: ( ( rule__AnnotationTypeAttribute__Group_4__0 )? )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3251:1: ( ( rule__AnnotationTypeAttribute__Group_4__0 )? )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3252:1: ( rule__AnnotationTypeAttribute__Group_4__0 )?
            {
             before(grammarAccess.getAnnotationTypeAttributeAccess().getGroup_4()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3253:1: ( rule__AnnotationTypeAttribute__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3253:2: rule__AnnotationTypeAttribute__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group_4__0_in_rule__AnnotationTypeAttribute__Group__4__Impl6375);
                    rule__AnnotationTypeAttribute__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnotationTypeAttributeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationTypeAttribute__Group__4__Impl"


    // $ANTLR start "rule__AnnotationTypeAttribute__Group__5"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3263:1: rule__AnnotationTypeAttribute__Group__5 : rule__AnnotationTypeAttribute__Group__5__Impl ;
    public final void rule__AnnotationTypeAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3267:1: ( rule__AnnotationTypeAttribute__Group__5__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3268:2: rule__AnnotationTypeAttribute__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group__5__Impl_in_rule__AnnotationTypeAttribute__Group__56406);
            rule__AnnotationTypeAttribute__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationTypeAttribute__Group__5"


    // $ANTLR start "rule__AnnotationTypeAttribute__Group__5__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3274:1: rule__AnnotationTypeAttribute__Group__5__Impl : ( '}' ) ;
    public final void rule__AnnotationTypeAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3278:1: ( ( '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3279:1: ( '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3279:1: ( '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3280:1: '}'
            {
             before(grammarAccess.getAnnotationTypeAttributeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__AnnotationTypeAttribute__Group__5__Impl6434); 
             after(grammarAccess.getAnnotationTypeAttributeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationTypeAttribute__Group__5__Impl"


    // $ANTLR start "rule__AnnotationTypeAttribute__Group_4__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3305:1: rule__AnnotationTypeAttribute__Group_4__0 : rule__AnnotationTypeAttribute__Group_4__0__Impl rule__AnnotationTypeAttribute__Group_4__1 ;
    public final void rule__AnnotationTypeAttribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3309:1: ( rule__AnnotationTypeAttribute__Group_4__0__Impl rule__AnnotationTypeAttribute__Group_4__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3310:2: rule__AnnotationTypeAttribute__Group_4__0__Impl rule__AnnotationTypeAttribute__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group_4__0__Impl_in_rule__AnnotationTypeAttribute__Group_4__06477);
            rule__AnnotationTypeAttribute__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group_4__1_in_rule__AnnotationTypeAttribute__Group_4__06480);
            rule__AnnotationTypeAttribute__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationTypeAttribute__Group_4__0"


    // $ANTLR start "rule__AnnotationTypeAttribute__Group_4__0__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3317:1: rule__AnnotationTypeAttribute__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__AnnotationTypeAttribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3321:1: ( ( 'type' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3322:1: ( 'type' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3322:1: ( 'type' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3323:1: 'type'
            {
             before(grammarAccess.getAnnotationTypeAttributeAccess().getTypeKeyword_4_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__AnnotationTypeAttribute__Group_4__0__Impl6508); 
             after(grammarAccess.getAnnotationTypeAttributeAccess().getTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationTypeAttribute__Group_4__0__Impl"


    // $ANTLR start "rule__AnnotationTypeAttribute__Group_4__1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3336:1: rule__AnnotationTypeAttribute__Group_4__1 : rule__AnnotationTypeAttribute__Group_4__1__Impl ;
    public final void rule__AnnotationTypeAttribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3340:1: ( rule__AnnotationTypeAttribute__Group_4__1__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3341:2: rule__AnnotationTypeAttribute__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__Group_4__1__Impl_in_rule__AnnotationTypeAttribute__Group_4__16539);
            rule__AnnotationTypeAttribute__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationTypeAttribute__Group_4__1"


    // $ANTLR start "rule__AnnotationTypeAttribute__Group_4__1__Impl"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3347:1: rule__AnnotationTypeAttribute__Group_4__1__Impl : ( ( rule__AnnotationTypeAttribute__TypeAssignment_4_1 ) ) ;
    public final void rule__AnnotationTypeAttribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3351:1: ( ( ( rule__AnnotationTypeAttribute__TypeAssignment_4_1 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3352:1: ( ( rule__AnnotationTypeAttribute__TypeAssignment_4_1 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3352:1: ( ( rule__AnnotationTypeAttribute__TypeAssignment_4_1 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3353:1: ( rule__AnnotationTypeAttribute__TypeAssignment_4_1 )
            {
             before(grammarAccess.getAnnotationTypeAttributeAccess().getTypeAssignment_4_1()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3354:1: ( rule__AnnotationTypeAttribute__TypeAssignment_4_1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3354:2: rule__AnnotationTypeAttribute__TypeAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationTypeAttribute__TypeAssignment_4_1_in_rule__AnnotationTypeAttribute__Group_4__1__Impl6566);
            rule__AnnotationTypeAttribute__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationTypeAttributeAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationTypeAttribute__Group_4__1__Impl"


    // $ANTLR start "rule__SimpleValue__Group__0"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3368:1: rule__SimpleValue__Group__0 : rule__SimpleValue__Group__0__Impl rule__SimpleValue__Group__1 ;
    public final void rule__SimpleValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3372:1: ( rule__SimpleValue__Group__0__Impl rule__SimpleValue__Group__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3373:2: rule__SimpleValue__Group__0__Impl rule__SimpleValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__0__Impl_in_rule__SimpleValue__Group__06600);
            rule__SimpleValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__1_in_rule__SimpleValue__Group__06603);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3380:1: rule__SimpleValue__Group__0__Impl : ( () ) ;
    public final void rule__SimpleValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3384:1: ( ( () ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3385:1: ( () )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3385:1: ( () )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3386:1: ()
            {
             before(grammarAccess.getSimpleValueAccess().getSimpleValueAction_0()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3387:1: ()
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3389:1: 
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3399:1: rule__SimpleValue__Group__1 : rule__SimpleValue__Group__1__Impl rule__SimpleValue__Group__2 ;
    public final void rule__SimpleValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3403:1: ( rule__SimpleValue__Group__1__Impl rule__SimpleValue__Group__2 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3404:2: rule__SimpleValue__Group__1__Impl rule__SimpleValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__1__Impl_in_rule__SimpleValue__Group__16661);
            rule__SimpleValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__2_in_rule__SimpleValue__Group__16664);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3411:1: rule__SimpleValue__Group__1__Impl : ( 'SimpleValue' ) ;
    public final void rule__SimpleValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3415:1: ( ( 'SimpleValue' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3416:1: ( 'SimpleValue' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3416:1: ( 'SimpleValue' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3417:1: 'SimpleValue'
            {
             before(grammarAccess.getSimpleValueAccess().getSimpleValueKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__SimpleValue__Group__1__Impl6692); 
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3430:1: rule__SimpleValue__Group__2 : rule__SimpleValue__Group__2__Impl rule__SimpleValue__Group__3 ;
    public final void rule__SimpleValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3434:1: ( rule__SimpleValue__Group__2__Impl rule__SimpleValue__Group__3 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3435:2: rule__SimpleValue__Group__2__Impl rule__SimpleValue__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__2__Impl_in_rule__SimpleValue__Group__26723);
            rule__SimpleValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__3_in_rule__SimpleValue__Group__26726);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3442:1: rule__SimpleValue__Group__2__Impl : ( '{' ) ;
    public final void rule__SimpleValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3446:1: ( ( '{' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3447:1: ( '{' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3447:1: ( '{' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3448:1: '{'
            {
             before(grammarAccess.getSimpleValueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__SimpleValue__Group__2__Impl6754); 
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3461:1: rule__SimpleValue__Group__3 : rule__SimpleValue__Group__3__Impl rule__SimpleValue__Group__4 ;
    public final void rule__SimpleValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3465:1: ( rule__SimpleValue__Group__3__Impl rule__SimpleValue__Group__4 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3466:2: rule__SimpleValue__Group__3__Impl rule__SimpleValue__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__3__Impl_in_rule__SimpleValue__Group__36785);
            rule__SimpleValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__4_in_rule__SimpleValue__Group__36788);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3473:1: rule__SimpleValue__Group__3__Impl : ( ( rule__SimpleValue__Group_3__0 )? ) ;
    public final void rule__SimpleValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3477:1: ( ( ( rule__SimpleValue__Group_3__0 )? ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3478:1: ( ( rule__SimpleValue__Group_3__0 )? )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3478:1: ( ( rule__SimpleValue__Group_3__0 )? )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3479:1: ( rule__SimpleValue__Group_3__0 )?
            {
             before(grammarAccess.getSimpleValueAccess().getGroup_3()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3480:1: ( rule__SimpleValue__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3480:2: rule__SimpleValue__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group_3__0_in_rule__SimpleValue__Group__3__Impl6815);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3490:1: rule__SimpleValue__Group__4 : rule__SimpleValue__Group__4__Impl ;
    public final void rule__SimpleValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3494:1: ( rule__SimpleValue__Group__4__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3495:2: rule__SimpleValue__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__4__Impl_in_rule__SimpleValue__Group__46846);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3501:1: rule__SimpleValue__Group__4__Impl : ( '}' ) ;
    public final void rule__SimpleValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3505:1: ( ( '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3506:1: ( '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3506:1: ( '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3507:1: '}'
            {
             before(grammarAccess.getSimpleValueAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__SimpleValue__Group__4__Impl6874); 
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3530:1: rule__SimpleValue__Group_3__0 : rule__SimpleValue__Group_3__0__Impl rule__SimpleValue__Group_3__1 ;
    public final void rule__SimpleValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3534:1: ( rule__SimpleValue__Group_3__0__Impl rule__SimpleValue__Group_3__1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3535:2: rule__SimpleValue__Group_3__0__Impl rule__SimpleValue__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group_3__0__Impl_in_rule__SimpleValue__Group_3__06915);
            rule__SimpleValue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group_3__1_in_rule__SimpleValue__Group_3__06918);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3542:1: rule__SimpleValue__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__SimpleValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3546:1: ( ( 'value' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3547:1: ( 'value' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3547:1: ( 'value' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3548:1: 'value'
            {
             before(grammarAccess.getSimpleValueAccess().getValueKeyword_3_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__SimpleValue__Group_3__0__Impl6946); 
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3561:1: rule__SimpleValue__Group_3__1 : rule__SimpleValue__Group_3__1__Impl ;
    public final void rule__SimpleValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3565:1: ( rule__SimpleValue__Group_3__1__Impl )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3566:2: rule__SimpleValue__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group_3__1__Impl_in_rule__SimpleValue__Group_3__16977);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3572:1: rule__SimpleValue__Group_3__1__Impl : ( ( rule__SimpleValue__ValueAssignment_3_1 ) ) ;
    public final void rule__SimpleValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3576:1: ( ( ( rule__SimpleValue__ValueAssignment_3_1 ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3577:1: ( ( rule__SimpleValue__ValueAssignment_3_1 ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3577:1: ( ( rule__SimpleValue__ValueAssignment_3_1 ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3578:1: ( rule__SimpleValue__ValueAssignment_3_1 )
            {
             before(grammarAccess.getSimpleValueAccess().getValueAssignment_3_1()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3579:1: ( rule__SimpleValue__ValueAssignment_3_1 )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3579:2: rule__SimpleValue__ValueAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__ValueAssignment_3_1_in_rule__SimpleValue__Group_3__1__Impl7004);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3594:1: rule__Package__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3598:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3599:1: ( ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3599:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3600:1: ruleEString
            {
             before(grammarAccess.getPackageAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Package__NameAssignment_27043);
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


    // $ANTLR start "rule__Package__AnnotationsAssignment_4_2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3609:1: rule__Package__AnnotationsAssignment_4_2 : ( ruleAnnotation ) ;
    public final void rule__Package__AnnotationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3613:1: ( ( ruleAnnotation ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3614:1: ( ruleAnnotation )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3614:1: ( ruleAnnotation )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3615:1: ruleAnnotation
            {
             before(grammarAccess.getPackageAccess().getAnnotationsAnnotationParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__Package__AnnotationsAssignment_4_27074);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getAnnotationsAnnotationParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__AnnotationsAssignment_4_2"


    // $ANTLR start "rule__Package__AnnotationsAssignment_4_3_1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3624:1: rule__Package__AnnotationsAssignment_4_3_1 : ( ruleAnnotation ) ;
    public final void rule__Package__AnnotationsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3628:1: ( ( ruleAnnotation ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3629:1: ( ruleAnnotation )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3629:1: ( ruleAnnotation )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3630:1: ruleAnnotation
            {
             before(grammarAccess.getPackageAccess().getAnnotationsAnnotationParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__Package__AnnotationsAssignment_4_3_17105);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getAnnotationsAnnotationParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__AnnotationsAssignment_4_3_1"


    // $ANTLR start "rule__Package__TypesAssignment_5_2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3639:1: rule__Package__TypesAssignment_5_2 : ( ruleType ) ;
    public final void rule__Package__TypesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3643:1: ( ( ruleType ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3644:1: ( ruleType )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3644:1: ( ruleType )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3645:1: ruleType
            {
             before(grammarAccess.getPackageAccess().getTypesTypeParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_rule__Package__TypesAssignment_5_27136);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getTypesTypeParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__TypesAssignment_5_2"


    // $ANTLR start "rule__Package__TypesAssignment_5_3_1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3654:1: rule__Package__TypesAssignment_5_3_1 : ( ruleType ) ;
    public final void rule__Package__TypesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3658:1: ( ( ruleType ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3659:1: ( ruleType )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3659:1: ( ruleType )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3660:1: ruleType
            {
             before(grammarAccess.getPackageAccess().getTypesTypeParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_rule__Package__TypesAssignment_5_3_17167);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getTypesTypeParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__TypesAssignment_5_3_1"


    // $ANTLR start "rule__Package__AnnotationTypesAssignment_6_2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3669:1: rule__Package__AnnotationTypesAssignment_6_2 : ( ruleAnnotationType ) ;
    public final void rule__Package__AnnotationTypesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3673:1: ( ( ruleAnnotationType ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3674:1: ( ruleAnnotationType )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3674:1: ( ruleAnnotationType )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3675:1: ruleAnnotationType
            {
             before(grammarAccess.getPackageAccess().getAnnotationTypesAnnotationTypeParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationType_in_rule__Package__AnnotationTypesAssignment_6_27198);
            ruleAnnotationType();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getAnnotationTypesAnnotationTypeParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__AnnotationTypesAssignment_6_2"


    // $ANTLR start "rule__Package__AnnotationTypesAssignment_6_3_1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3684:1: rule__Package__AnnotationTypesAssignment_6_3_1 : ( ruleAnnotationType ) ;
    public final void rule__Package__AnnotationTypesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3688:1: ( ( ruleAnnotationType ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3689:1: ( ruleAnnotationType )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3689:1: ( ruleAnnotationType )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3690:1: ruleAnnotationType
            {
             before(grammarAccess.getPackageAccess().getAnnotationTypesAnnotationTypeParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationType_in_rule__Package__AnnotationTypesAssignment_6_3_17229);
            ruleAnnotationType();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getAnnotationTypesAnnotationTypeParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__AnnotationTypesAssignment_6_3_1"


    // $ANTLR start "rule__Annotation__AnnotationTypeAssignment_3"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3699:1: rule__Annotation__AnnotationTypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Annotation__AnnotationTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3703:1: ( ( ( ruleEString ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3704:1: ( ( ruleEString ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3704:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3705:1: ( ruleEString )
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationTypeAnnotationTypeCrossReference_3_0()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3706:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3707:1: ruleEString
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationTypeAnnotationTypeEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Annotation__AnnotationTypeAssignment_37264);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getAnnotationTypeAnnotationTypeEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAnnotationAccess().getAnnotationTypeAnnotationTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__AnnotationTypeAssignment_3"


    // $ANTLR start "rule__Annotation__AttributesAssignment_4_2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3718:1: rule__Annotation__AttributesAssignment_4_2 : ( ruleAnnotationAttribute ) ;
    public final void rule__Annotation__AttributesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3722:1: ( ( ruleAnnotationAttribute ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3723:1: ( ruleAnnotationAttribute )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3723:1: ( ruleAnnotationAttribute )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3724:1: ruleAnnotationAttribute
            {
             before(grammarAccess.getAnnotationAccess().getAttributesAnnotationAttributeParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttribute_in_rule__Annotation__AttributesAssignment_4_27299);
            ruleAnnotationAttribute();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getAttributesAnnotationAttributeParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__AttributesAssignment_4_2"


    // $ANTLR start "rule__Annotation__AttributesAssignment_4_3_1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3733:1: rule__Annotation__AttributesAssignment_4_3_1 : ( ruleAnnotationAttribute ) ;
    public final void rule__Annotation__AttributesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3737:1: ( ( ruleAnnotationAttribute ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3738:1: ( ruleAnnotationAttribute )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3738:1: ( ruleAnnotationAttribute )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3739:1: ruleAnnotationAttribute
            {
             before(grammarAccess.getAnnotationAccess().getAttributesAnnotationAttributeParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttribute_in_rule__Annotation__AttributesAssignment_4_3_17330);
            ruleAnnotationAttribute();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getAttributesAnnotationAttributeParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__AttributesAssignment_4_3_1"


    // $ANTLR start "rule__Type__NameAssignment_2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3748:1: rule__Type__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Type__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3752:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3753:1: ( ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3753:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3754:1: ruleEString
            {
             before(grammarAccess.getTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Type__NameAssignment_27361);
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


    // $ANTLR start "rule__Type__AnnotationsAssignment_4_2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3763:1: rule__Type__AnnotationsAssignment_4_2 : ( ruleAnnotation ) ;
    public final void rule__Type__AnnotationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3767:1: ( ( ruleAnnotation ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3768:1: ( ruleAnnotation )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3768:1: ( ruleAnnotation )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3769:1: ruleAnnotation
            {
             before(grammarAccess.getTypeAccess().getAnnotationsAnnotationParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__Type__AnnotationsAssignment_4_27392);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getAnnotationsAnnotationParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__AnnotationsAssignment_4_2"


    // $ANTLR start "rule__Type__AnnotationsAssignment_4_3_1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3778:1: rule__Type__AnnotationsAssignment_4_3_1 : ( ruleAnnotation ) ;
    public final void rule__Type__AnnotationsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3782:1: ( ( ruleAnnotation ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3783:1: ( ruleAnnotation )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3783:1: ( ruleAnnotation )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3784:1: ruleAnnotation
            {
             before(grammarAccess.getTypeAccess().getAnnotationsAnnotationParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__Type__AnnotationsAssignment_4_3_17423);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getAnnotationsAnnotationParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__AnnotationsAssignment_4_3_1"


    // $ANTLR start "rule__Type__AttributesAssignment_5_2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3793:1: rule__Type__AttributesAssignment_5_2 : ( ruleAnnotationTypeAttribute ) ;
    public final void rule__Type__AttributesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3797:1: ( ( ruleAnnotationTypeAttribute ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3798:1: ( ruleAnnotationTypeAttribute )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3798:1: ( ruleAnnotationTypeAttribute )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3799:1: ruleAnnotationTypeAttribute
            {
             before(grammarAccess.getTypeAccess().getAttributesAnnotationTypeAttributeParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationTypeAttribute_in_rule__Type__AttributesAssignment_5_27454);
            ruleAnnotationTypeAttribute();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getAttributesAnnotationTypeAttributeParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__AttributesAssignment_5_2"


    // $ANTLR start "rule__Type__AttributesAssignment_5_3_1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3808:1: rule__Type__AttributesAssignment_5_3_1 : ( ruleAnnotationTypeAttribute ) ;
    public final void rule__Type__AttributesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3812:1: ( ( ruleAnnotationTypeAttribute ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3813:1: ( ruleAnnotationTypeAttribute )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3813:1: ( ruleAnnotationTypeAttribute )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3814:1: ruleAnnotationTypeAttribute
            {
             before(grammarAccess.getTypeAccess().getAttributesAnnotationTypeAttributeParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationTypeAttribute_in_rule__Type__AttributesAssignment_5_3_17485);
            ruleAnnotationTypeAttribute();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getAttributesAnnotationTypeAttributeParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__AttributesAssignment_5_3_1"


    // $ANTLR start "rule__AnnotationType__NameAssignment_2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3823:1: rule__AnnotationType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__AnnotationType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3827:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3828:1: ( ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3828:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3829:1: ruleEString
            {
             before(grammarAccess.getAnnotationTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AnnotationType__NameAssignment_27516);
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


    // $ANTLR start "rule__AnnotationType__ContextAssignment_4_1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3838:1: rule__AnnotationType__ContextAssignment_4_1 : ( ruleEString ) ;
    public final void rule__AnnotationType__ContextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3842:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3843:1: ( ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3843:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3844:1: ruleEString
            {
             before(grammarAccess.getAnnotationTypeAccess().getContextEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AnnotationType__ContextAssignment_4_17547);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnnotationTypeAccess().getContextEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__ContextAssignment_4_1"


    // $ANTLR start "rule__AnnotationType__AttributesAssignment_5_2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3853:1: rule__AnnotationType__AttributesAssignment_5_2 : ( ruleAnnotationTypeAttribute ) ;
    public final void rule__AnnotationType__AttributesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3857:1: ( ( ruleAnnotationTypeAttribute ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3858:1: ( ruleAnnotationTypeAttribute )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3858:1: ( ruleAnnotationTypeAttribute )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3859:1: ruleAnnotationTypeAttribute
            {
             before(grammarAccess.getAnnotationTypeAccess().getAttributesAnnotationTypeAttributeParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationTypeAttribute_in_rule__AnnotationType__AttributesAssignment_5_27578);
            ruleAnnotationTypeAttribute();

            state._fsp--;

             after(grammarAccess.getAnnotationTypeAccess().getAttributesAnnotationTypeAttributeParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__AttributesAssignment_5_2"


    // $ANTLR start "rule__AnnotationType__AttributesAssignment_5_3_1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3868:1: rule__AnnotationType__AttributesAssignment_5_3_1 : ( ruleAnnotationTypeAttribute ) ;
    public final void rule__AnnotationType__AttributesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3872:1: ( ( ruleAnnotationTypeAttribute ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3873:1: ( ruleAnnotationTypeAttribute )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3873:1: ( ruleAnnotationTypeAttribute )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3874:1: ruleAnnotationTypeAttribute
            {
             before(grammarAccess.getAnnotationTypeAccess().getAttributesAnnotationTypeAttributeParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationTypeAttribute_in_rule__AnnotationType__AttributesAssignment_5_3_17609);
            ruleAnnotationTypeAttribute();

            state._fsp--;

             after(grammarAccess.getAnnotationTypeAccess().getAttributesAnnotationTypeAttributeParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationType__AttributesAssignment_5_3_1"


    // $ANTLR start "rule__AnnotationAttribute__AttributeAssignment_3"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3883:1: rule__AnnotationAttribute__AttributeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__AnnotationAttribute__AttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3887:1: ( ( ( ruleEString ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3888:1: ( ( ruleEString ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3888:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3889:1: ( ruleEString )
            {
             before(grammarAccess.getAnnotationAttributeAccess().getAttributeAnnotationTypeAttributeCrossReference_3_0()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3890:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3891:1: ruleEString
            {
             before(grammarAccess.getAnnotationAttributeAccess().getAttributeAnnotationTypeAttributeEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AnnotationAttribute__AttributeAssignment_37644);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3902:1: rule__AnnotationAttribute__ValueAssignment_4_1 : ( ruleAnnotationAttributeValue ) ;
    public final void rule__AnnotationAttribute__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3906:1: ( ( ruleAnnotationAttributeValue ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3907:1: ( ruleAnnotationAttributeValue )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3907:1: ( ruleAnnotationAttributeValue )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3908:1: ruleAnnotationAttributeValue
            {
             before(grammarAccess.getAnnotationAttributeAccess().getValueAnnotationAttributeValueParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttributeValue_in_rule__AnnotationAttribute__ValueAssignment_4_17679);
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


    // $ANTLR start "rule__AnnotationTypeAttribute__NameAssignment_2"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3917:1: rule__AnnotationTypeAttribute__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__AnnotationTypeAttribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3921:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3922:1: ( ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3922:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3923:1: ruleEString
            {
             before(grammarAccess.getAnnotationTypeAttributeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AnnotationTypeAttribute__NameAssignment_27710);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnnotationTypeAttributeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationTypeAttribute__NameAssignment_2"


    // $ANTLR start "rule__AnnotationTypeAttribute__TypeAssignment_4_1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3932:1: rule__AnnotationTypeAttribute__TypeAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__AnnotationTypeAttribute__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3936:1: ( ( ( ruleEString ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3937:1: ( ( ruleEString ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3937:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3938:1: ( ruleEString )
            {
             before(grammarAccess.getAnnotationTypeAttributeAccess().getTypeTypeCrossReference_4_1_0()); 
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3939:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3940:1: ruleEString
            {
             before(grammarAccess.getAnnotationTypeAttributeAccess().getTypeTypeEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AnnotationTypeAttribute__TypeAssignment_4_17745);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnnotationTypeAttributeAccess().getTypeTypeEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getAnnotationTypeAttributeAccess().getTypeTypeCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationTypeAttribute__TypeAssignment_4_1"


    // $ANTLR start "rule__SimpleValue__ValueAssignment_3_1"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3951:1: rule__SimpleValue__ValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__SimpleValue__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3955:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3956:1: ( ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3956:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit.ui/src-gen/co/edu/uniandes/csw/spl/dsl/ui/contentassist/antlr/internal/InternalAnnotateit.g:3957:1: ruleEString
            {
             before(grammarAccess.getSimpleValueAccess().getValueEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SimpleValue__ValueAssignment_3_17780);
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
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation180 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_entryRuleType240 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleType247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group__0_in_ruleType273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType300 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationType307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__0_in_ruleAnnotationType333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_entryRuleAnnotationAttribute360 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationAttribute367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__0_in_ruleAnnotationAttribute393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString420 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationTypeAttribute_in_entryRuleAnnotationTypeAttribute480 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationTypeAttribute487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group__0_in_ruleAnnotationTypeAttribute513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue540 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValue547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__0_in_ruleSimpleValue573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0656 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1717 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Package__Group__1__Impl748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2779 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__2782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__3839 = new BitSet(new long[]{0x0000000000036000L});
        public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__3842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Package__Group__3__Impl870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__4901 = new BitSet(new long[]{0x0000000000036000L});
        public static final BitSet FOLLOW_rule__Package__Group__5_in_rule__Package__Group__4904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__5962 = new BitSet(new long[]{0x0000000000036000L});
        public static final BitSet FOLLOW_rule__Package__Group__6_in_rule__Package__Group__5965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__0_in_rule__Package__Group__5__Impl992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__6__Impl_in_rule__Package__Group__61023 = new BitSet(new long[]{0x0000000000036000L});
        public static final BitSet FOLLOW_rule__Package__Group__7_in_rule__Package__Group__61026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6__0_in_rule__Package__Group__6__Impl1053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__7__Impl_in_rule__Package__Group__71084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Package__Group__7__Impl1112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__01159 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__01162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Package__Group_4__0__Impl1190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__11221 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__2_in_rule__Package__Group_4__11224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Package__Group_4__1__Impl1252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__2__Impl_in_rule__Package__Group_4__21283 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__3_in_rule__Package__Group_4__21286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__AnnotationsAssignment_4_2_in_rule__Package__Group_4__2__Impl1313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__3__Impl_in_rule__Package__Group_4__31343 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__4_in_rule__Package__Group_4__31346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__0_in_rule__Package__Group_4__3__Impl1373 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__4__Impl_in_rule__Package__Group_4__41404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Package__Group_4__4__Impl1432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__0__Impl_in_rule__Package__Group_4_3__01473 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__1_in_rule__Package__Group_4_3__01476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Package__Group_4_3__0__Impl1504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__1__Impl_in_rule__Package__Group_4_3__11535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__AnnotationsAssignment_4_3_1_in_rule__Package__Group_4_3__1__Impl1562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__0__Impl_in_rule__Package__Group_5__01596 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Package__Group_5__1_in_rule__Package__Group_5__01599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Package__Group_5__0__Impl1627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__1__Impl_in_rule__Package__Group_5__11658 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Package__Group_5__2_in_rule__Package__Group_5__11661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Package__Group_5__1__Impl1689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__2__Impl_in_rule__Package__Group_5__21720 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Package__Group_5__3_in_rule__Package__Group_5__21723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__TypesAssignment_5_2_in_rule__Package__Group_5__2__Impl1750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__3__Impl_in_rule__Package__Group_5__31780 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Package__Group_5__4_in_rule__Package__Group_5__31783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5_3__0_in_rule__Package__Group_5__3__Impl1810 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__4__Impl_in_rule__Package__Group_5__41841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Package__Group_5__4__Impl1869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5_3__0__Impl_in_rule__Package__Group_5_3__01910 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Package__Group_5_3__1_in_rule__Package__Group_5_3__01913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Package__Group_5_3__0__Impl1941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5_3__1__Impl_in_rule__Package__Group_5_3__11972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__TypesAssignment_5_3_1_in_rule__Package__Group_5_3__1__Impl1999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6__0__Impl_in_rule__Package__Group_6__02033 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Package__Group_6__1_in_rule__Package__Group_6__02036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Package__Group_6__0__Impl2064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6__1__Impl_in_rule__Package__Group_6__12095 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Package__Group_6__2_in_rule__Package__Group_6__12098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Package__Group_6__1__Impl2126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6__2__Impl_in_rule__Package__Group_6__22157 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Package__Group_6__3_in_rule__Package__Group_6__22160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__AnnotationTypesAssignment_6_2_in_rule__Package__Group_6__2__Impl2187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6__3__Impl_in_rule__Package__Group_6__32217 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Package__Group_6__4_in_rule__Package__Group_6__32220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6_3__0_in_rule__Package__Group_6__3__Impl2247 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Package__Group_6__4__Impl_in_rule__Package__Group_6__42278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Package__Group_6__4__Impl2306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6_3__0__Impl_in_rule__Package__Group_6_3__02347 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Package__Group_6_3__1_in_rule__Package__Group_6_3__02350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Package__Group_6_3__0__Impl2378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6_3__1__Impl_in_rule__Package__Group_6_3__12409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__AnnotationTypesAssignment_6_3_1_in_rule__Package__Group_6_3__1__Impl2436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__02470 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__02473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Annotation__Group__0__Impl2501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__12532 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__12535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Annotation__Group__1__Impl2563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__22594 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Annotation__Group__3_in_rule__Annotation__Group__22597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Annotation__Group__2__Impl2625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group__3__Impl_in_rule__Annotation__Group__32656 = new BitSet(new long[]{0x0000000000102000L});
        public static final BitSet FOLLOW_rule__Annotation__Group__4_in_rule__Annotation__Group__32659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__AnnotationTypeAssignment_3_in_rule__Annotation__Group__3__Impl2686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group__4__Impl_in_rule__Annotation__Group__42716 = new BitSet(new long[]{0x0000000000102000L});
        public static final BitSet FOLLOW_rule__Annotation__Group__5_in_rule__Annotation__Group__42719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group_4__0_in_rule__Annotation__Group__4__Impl2746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group__5__Impl_in_rule__Annotation__Group__52777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Annotation__Group__5__Impl2805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group_4__0__Impl_in_rule__Annotation__Group_4__02848 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Annotation__Group_4__1_in_rule__Annotation__Group_4__02851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Annotation__Group_4__0__Impl2879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group_4__1__Impl_in_rule__Annotation__Group_4__12910 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Annotation__Group_4__2_in_rule__Annotation__Group_4__12913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Annotation__Group_4__1__Impl2941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group_4__2__Impl_in_rule__Annotation__Group_4__22972 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Annotation__Group_4__3_in_rule__Annotation__Group_4__22975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__AttributesAssignment_4_2_in_rule__Annotation__Group_4__2__Impl3002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group_4__3__Impl_in_rule__Annotation__Group_4__33032 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Annotation__Group_4__4_in_rule__Annotation__Group_4__33035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group_4_3__0_in_rule__Annotation__Group_4__3__Impl3062 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Annotation__Group_4__4__Impl_in_rule__Annotation__Group_4__43093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Annotation__Group_4__4__Impl3121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group_4_3__0__Impl_in_rule__Annotation__Group_4_3__03162 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Annotation__Group_4_3__1_in_rule__Annotation__Group_4_3__03165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Annotation__Group_4_3__0__Impl3193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group_4_3__1__Impl_in_rule__Annotation__Group_4_3__13224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__AttributesAssignment_4_3_1_in_rule__Annotation__Group_4_3__1__Impl3251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__03285 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__03288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__13346 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Type__Group__2_in_rule__Type__Group__13349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Type__Group__1__Impl3377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group__2__Impl_in_rule__Type__Group__23408 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Type__Group__3_in_rule__Type__Group__23411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__NameAssignment_2_in_rule__Type__Group__2__Impl3438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group__3__Impl_in_rule__Type__Group__33468 = new BitSet(new long[]{0x0000000000106000L});
        public static final BitSet FOLLOW_rule__Type__Group__4_in_rule__Type__Group__33471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Type__Group__3__Impl3499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group__4__Impl_in_rule__Type__Group__43530 = new BitSet(new long[]{0x0000000000106000L});
        public static final BitSet FOLLOW_rule__Type__Group__5_in_rule__Type__Group__43533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group_4__0_in_rule__Type__Group__4__Impl3560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group__5__Impl_in_rule__Type__Group__53591 = new BitSet(new long[]{0x0000000000106000L});
        public static final BitSet FOLLOW_rule__Type__Group__6_in_rule__Type__Group__53594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group_5__0_in_rule__Type__Group__5__Impl3621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group__6__Impl_in_rule__Type__Group__63652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Type__Group__6__Impl3680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group_4__0__Impl_in_rule__Type__Group_4__03725 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Type__Group_4__1_in_rule__Type__Group_4__03728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Type__Group_4__0__Impl3756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group_4__1__Impl_in_rule__Type__Group_4__13787 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Type__Group_4__2_in_rule__Type__Group_4__13790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Type__Group_4__1__Impl3818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group_4__2__Impl_in_rule__Type__Group_4__23849 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Type__Group_4__3_in_rule__Type__Group_4__23852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__AnnotationsAssignment_4_2_in_rule__Type__Group_4__2__Impl3879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group_4__3__Impl_in_rule__Type__Group_4__33909 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Type__Group_4__4_in_rule__Type__Group_4__33912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group_4_3__0_in_rule__Type__Group_4__3__Impl3939 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Type__Group_4__4__Impl_in_rule__Type__Group_4__43970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Type__Group_4__4__Impl3998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group_4_3__0__Impl_in_rule__Type__Group_4_3__04039 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Type__Group_4_3__1_in_rule__Type__Group_4_3__04042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Type__Group_4_3__0__Impl4070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group_4_3__1__Impl_in_rule__Type__Group_4_3__14101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__AnnotationsAssignment_4_3_1_in_rule__Type__Group_4_3__1__Impl4128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group_5__0__Impl_in_rule__Type__Group_5__04162 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Type__Group_5__1_in_rule__Type__Group_5__04165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Type__Group_5__0__Impl4193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group_5__1__Impl_in_rule__Type__Group_5__14224 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Type__Group_5__2_in_rule__Type__Group_5__14227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Type__Group_5__1__Impl4255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group_5__2__Impl_in_rule__Type__Group_5__24286 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Type__Group_5__3_in_rule__Type__Group_5__24289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__AttributesAssignment_5_2_in_rule__Type__Group_5__2__Impl4316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group_5__3__Impl_in_rule__Type__Group_5__34346 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Type__Group_5__4_in_rule__Type__Group_5__34349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group_5_3__0_in_rule__Type__Group_5__3__Impl4376 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Type__Group_5__4__Impl_in_rule__Type__Group_5__44407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Type__Group_5__4__Impl4435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group_5_3__0__Impl_in_rule__Type__Group_5_3__04476 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Type__Group_5_3__1_in_rule__Type__Group_5_3__04479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Type__Group_5_3__0__Impl4507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Group_5_3__1__Impl_in_rule__Type__Group_5_3__14538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__AttributesAssignment_5_3_1_in_rule__Type__Group_5_3__1__Impl4565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__0__Impl_in_rule__AnnotationType__Group__04599 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__1_in_rule__AnnotationType__Group__04602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__1__Impl_in_rule__AnnotationType__Group__14660 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__2_in_rule__AnnotationType__Group__14663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__AnnotationType__Group__1__Impl4691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__2__Impl_in_rule__AnnotationType__Group__24722 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__3_in_rule__AnnotationType__Group__24725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__NameAssignment_2_in_rule__AnnotationType__Group__2__Impl4752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__3__Impl_in_rule__AnnotationType__Group__34782 = new BitSet(new long[]{0x0000000000902000L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__4_in_rule__AnnotationType__Group__34785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__AnnotationType__Group__3__Impl4813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__4__Impl_in_rule__AnnotationType__Group__44844 = new BitSet(new long[]{0x0000000000902000L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__5_in_rule__AnnotationType__Group__44847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_4__0_in_rule__AnnotationType__Group__4__Impl4874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__5__Impl_in_rule__AnnotationType__Group__54905 = new BitSet(new long[]{0x0000000000902000L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__6_in_rule__AnnotationType__Group__54908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_5__0_in_rule__AnnotationType__Group__5__Impl4935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group__6__Impl_in_rule__AnnotationType__Group__64966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__AnnotationType__Group__6__Impl4994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_4__0__Impl_in_rule__AnnotationType__Group_4__05039 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_4__1_in_rule__AnnotationType__Group_4__05042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__AnnotationType__Group_4__0__Impl5070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_4__1__Impl_in_rule__AnnotationType__Group_4__15101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__ContextAssignment_4_1_in_rule__AnnotationType__Group_4__1__Impl5128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_5__0__Impl_in_rule__AnnotationType__Group_5__05162 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_5__1_in_rule__AnnotationType__Group_5__05165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__AnnotationType__Group_5__0__Impl5193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_5__1__Impl_in_rule__AnnotationType__Group_5__15224 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_5__2_in_rule__AnnotationType__Group_5__15227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__AnnotationType__Group_5__1__Impl5255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_5__2__Impl_in_rule__AnnotationType__Group_5__25286 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_5__3_in_rule__AnnotationType__Group_5__25289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__AttributesAssignment_5_2_in_rule__AnnotationType__Group_5__2__Impl5316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_5__3__Impl_in_rule__AnnotationType__Group_5__35346 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_5__4_in_rule__AnnotationType__Group_5__35349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_5_3__0_in_rule__AnnotationType__Group_5__3__Impl5376 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_5__4__Impl_in_rule__AnnotationType__Group_5__45407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__AnnotationType__Group_5__4__Impl5435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_5_3__0__Impl_in_rule__AnnotationType__Group_5_3__05476 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_5_3__1_in_rule__AnnotationType__Group_5_3__05479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__AnnotationType__Group_5_3__0__Impl5507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__Group_5_3__1__Impl_in_rule__AnnotationType__Group_5_3__15538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationType__AttributesAssignment_5_3_1_in_rule__AnnotationType__Group_5_3__1__Impl5565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__0__Impl_in_rule__AnnotationAttribute__Group__05599 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__1_in_rule__AnnotationAttribute__Group__05602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__AnnotationAttribute__Group__0__Impl5630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__1__Impl_in_rule__AnnotationAttribute__Group__15661 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__2_in_rule__AnnotationAttribute__Group__15664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__AnnotationAttribute__Group__1__Impl5692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__2__Impl_in_rule__AnnotationAttribute__Group__25723 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__3_in_rule__AnnotationAttribute__Group__25726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__AnnotationAttribute__Group__2__Impl5754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__3__Impl_in_rule__AnnotationAttribute__Group__35785 = new BitSet(new long[]{0x0000000004002000L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__4_in_rule__AnnotationAttribute__Group__35788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__AttributeAssignment_3_in_rule__AnnotationAttribute__Group__3__Impl5815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__4__Impl_in_rule__AnnotationAttribute__Group__45845 = new BitSet(new long[]{0x0000000004002000L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__5_in_rule__AnnotationAttribute__Group__45848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group_4__0_in_rule__AnnotationAttribute__Group__4__Impl5875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__5__Impl_in_rule__AnnotationAttribute__Group__55906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__AnnotationAttribute__Group__5__Impl5934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group_4__0__Impl_in_rule__AnnotationAttribute__Group_4__05977 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group_4__1_in_rule__AnnotationAttribute__Group_4__05980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__AnnotationAttribute__Group_4__0__Impl6008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group_4__1__Impl_in_rule__AnnotationAttribute__Group_4__16039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__ValueAssignment_4_1_in_rule__AnnotationAttribute__Group_4__1__Impl6066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group__0__Impl_in_rule__AnnotationTypeAttribute__Group__06100 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group__1_in_rule__AnnotationTypeAttribute__Group__06103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group__1__Impl_in_rule__AnnotationTypeAttribute__Group__16161 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group__2_in_rule__AnnotationTypeAttribute__Group__16164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__AnnotationTypeAttribute__Group__1__Impl6192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group__2__Impl_in_rule__AnnotationTypeAttribute__Group__26223 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group__3_in_rule__AnnotationTypeAttribute__Group__26226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__NameAssignment_2_in_rule__AnnotationTypeAttribute__Group__2__Impl6253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group__3__Impl_in_rule__AnnotationTypeAttribute__Group__36283 = new BitSet(new long[]{0x0000000010002000L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group__4_in_rule__AnnotationTypeAttribute__Group__36286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__AnnotationTypeAttribute__Group__3__Impl6314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group__4__Impl_in_rule__AnnotationTypeAttribute__Group__46345 = new BitSet(new long[]{0x0000000010002000L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group__5_in_rule__AnnotationTypeAttribute__Group__46348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group_4__0_in_rule__AnnotationTypeAttribute__Group__4__Impl6375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group__5__Impl_in_rule__AnnotationTypeAttribute__Group__56406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__AnnotationTypeAttribute__Group__5__Impl6434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group_4__0__Impl_in_rule__AnnotationTypeAttribute__Group_4__06477 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group_4__1_in_rule__AnnotationTypeAttribute__Group_4__06480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__AnnotationTypeAttribute__Group_4__0__Impl6508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__Group_4__1__Impl_in_rule__AnnotationTypeAttribute__Group_4__16539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationTypeAttribute__TypeAssignment_4_1_in_rule__AnnotationTypeAttribute__Group_4__1__Impl6566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__0__Impl_in_rule__SimpleValue__Group__06600 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__1_in_rule__SimpleValue__Group__06603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__1__Impl_in_rule__SimpleValue__Group__16661 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__2_in_rule__SimpleValue__Group__16664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__SimpleValue__Group__1__Impl6692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__2__Impl_in_rule__SimpleValue__Group__26723 = new BitSet(new long[]{0x0000000004002000L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__3_in_rule__SimpleValue__Group__26726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__SimpleValue__Group__2__Impl6754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__3__Impl_in_rule__SimpleValue__Group__36785 = new BitSet(new long[]{0x0000000004002000L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__4_in_rule__SimpleValue__Group__36788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group_3__0_in_rule__SimpleValue__Group__3__Impl6815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__4__Impl_in_rule__SimpleValue__Group__46846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__SimpleValue__Group__4__Impl6874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group_3__0__Impl_in_rule__SimpleValue__Group_3__06915 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group_3__1_in_rule__SimpleValue__Group_3__06918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__SimpleValue__Group_3__0__Impl6946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group_3__1__Impl_in_rule__SimpleValue__Group_3__16977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__ValueAssignment_3_1_in_rule__SimpleValue__Group_3__1__Impl7004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Package__NameAssignment_27043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__Package__AnnotationsAssignment_4_27074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__Package__AnnotationsAssignment_4_3_17105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_rule__Package__TypesAssignment_5_27136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_rule__Package__TypesAssignment_5_3_17167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationType_in_rule__Package__AnnotationTypesAssignment_6_27198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationType_in_rule__Package__AnnotationTypesAssignment_6_3_17229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Annotation__AnnotationTypeAssignment_37264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_rule__Annotation__AttributesAssignment_4_27299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_rule__Annotation__AttributesAssignment_4_3_17330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Type__NameAssignment_27361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__Type__AnnotationsAssignment_4_27392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__Type__AnnotationsAssignment_4_3_17423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationTypeAttribute_in_rule__Type__AttributesAssignment_5_27454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationTypeAttribute_in_rule__Type__AttributesAssignment_5_3_17485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AnnotationType__NameAssignment_27516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AnnotationType__ContextAssignment_4_17547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationTypeAttribute_in_rule__AnnotationType__AttributesAssignment_5_27578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationTypeAttribute_in_rule__AnnotationType__AttributesAssignment_5_3_17609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AnnotationAttribute__AttributeAssignment_37644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttributeValue_in_rule__AnnotationAttribute__ValueAssignment_4_17679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AnnotationTypeAttribute__NameAssignment_27710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AnnotationTypeAttribute__TypeAssignment_4_17745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SimpleValue__ValueAssignment_3_17780 = new BitSet(new long[]{0x0000000000000002L});
    }


}