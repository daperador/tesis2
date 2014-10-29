package co.edu.uniandes.csw.dsl.ui.contentassist.antlr.internal; 

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
import co.edu.uniandes.csw.dsl.services.EntitiesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntitiesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'@'", "'('", "')'", "','", "'Entity'", "'{'", "'}'", "'extends'", "'associations'", "'='", "':'", "'many'", "'lowerBound'", "'upperBound'", "'-'", "'containment'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEntitiesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEntitiesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEntitiesParser.tokenNames; }
    public String getGrammarFileName() { return "../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g"; }


     
     	private EntitiesGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EntitiesGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleEntities"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:60:1: entryRuleEntities : ruleEntities EOF ;
    public final void entryRuleEntities() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:61:1: ( ruleEntities EOF )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:62:1: ruleEntities EOF
            {
             before(grammarAccess.getEntitiesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntities_in_entryRuleEntities61);
            ruleEntities();

            state._fsp--;

             after(grammarAccess.getEntitiesRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntities68); 

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
    // $ANTLR end "entryRuleEntities"


    // $ANTLR start "ruleEntities"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:69:1: ruleEntities : ( ( rule__Entities__Group__0 ) ) ;
    public final void ruleEntities() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:73:2: ( ( ( rule__Entities__Group__0 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:74:1: ( ( rule__Entities__Group__0 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:74:1: ( ( rule__Entities__Group__0 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:75:1: ( rule__Entities__Group__0 )
            {
             before(grammarAccess.getEntitiesAccess().getGroup()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:76:1: ( rule__Entities__Group__0 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:76:2: rule__Entities__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entities__Group__0_in_ruleEntities94);
            rule__Entities__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntitiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntities"


    // $ANTLR start "entryRuleimports"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:88:1: entryRuleimports : ruleimports EOF ;
    public final void entryRuleimports() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:89:1: ( ruleimports EOF )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:90:1: ruleimports EOF
            {
             before(grammarAccess.getImportsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleimports_in_entryRuleimports121);
            ruleimports();

            state._fsp--;

             after(grammarAccess.getImportsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleimports128); 

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
    // $ANTLR end "entryRuleimports"


    // $ANTLR start "ruleimports"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:97:1: ruleimports : ( ( rule__Imports__Group__0 ) ) ;
    public final void ruleimports() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:101:2: ( ( ( rule__Imports__Group__0 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:102:1: ( ( rule__Imports__Group__0 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:102:1: ( ( rule__Imports__Group__0 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:103:1: ( rule__Imports__Group__0 )
            {
             before(grammarAccess.getImportsAccess().getGroup()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:104:1: ( rule__Imports__Group__0 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:104:2: rule__Imports__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Imports__Group__0_in_ruleimports154);
            rule__Imports__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleimports"


    // $ANTLR start "entryRuleAnnotationAttributeValue"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:116:1: entryRuleAnnotationAttributeValue : ruleAnnotationAttributeValue EOF ;
    public final void entryRuleAnnotationAttributeValue() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:117:1: ( ruleAnnotationAttributeValue EOF )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:118:1: ruleAnnotationAttributeValue EOF
            {
             before(grammarAccess.getAnnotationAttributeValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttributeValue_in_entryRuleAnnotationAttributeValue181);
            ruleAnnotationAttributeValue();

            state._fsp--;

             after(grammarAccess.getAnnotationAttributeValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationAttributeValue188); 

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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:125:1: ruleAnnotationAttributeValue : ( ruleSimpleValue ) ;
    public final void ruleAnnotationAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:129:2: ( ( ruleSimpleValue ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:130:1: ( ruleSimpleValue )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:130:1: ( ruleSimpleValue )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:131:1: ruleSimpleValue
            {
             before(grammarAccess.getAnnotationAttributeValueAccess().getSimpleValueParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleValue_in_ruleAnnotationAttributeValue214);
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:144:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:145:1: ( ruleAnnotation EOF )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:146:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation240);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation247); 

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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:153:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:157:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:158:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:158:1: ( ( rule__Annotation__Group__0 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:159:1: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:160:1: ( rule__Annotation__Group__0 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:160:2: rule__Annotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation273);
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


    // $ANTLR start "entryRuleEntity"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:172:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:173:1: ( ruleEntity EOF )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:174:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_entryRuleEntity300);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntity307); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:181:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:185:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:186:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:186:1: ( ( rule__Entity__Group__0 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:187:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:188:1: ( rule__Entity__Group__0 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:188:2: rule__Entity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__0_in_ruleEntity333);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAnnotationAttribute"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:200:1: entryRuleAnnotationAttribute : ruleAnnotationAttribute EOF ;
    public final void entryRuleAnnotationAttribute() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:201:1: ( ruleAnnotationAttribute EOF )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:202:1: ruleAnnotationAttribute EOF
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:209:1: ruleAnnotationAttribute : ( ( rule__AnnotationAttribute__Group__0 ) ) ;
    public final void ruleAnnotationAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:213:2: ( ( ( rule__AnnotationAttribute__Group__0 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:214:1: ( ( rule__AnnotationAttribute__Group__0 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:214:1: ( ( rule__AnnotationAttribute__Group__0 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:215:1: ( rule__AnnotationAttribute__Group__0 )
            {
             before(grammarAccess.getAnnotationAttributeAccess().getGroup()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:216:1: ( rule__AnnotationAttribute__Group__0 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:216:2: rule__AnnotationAttribute__Group__0
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


    // $ANTLR start "entryRuleSimpleValue"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:228:1: entryRuleSimpleValue : ruleSimpleValue EOF ;
    public final void entryRuleSimpleValue() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:229:1: ( ruleSimpleValue EOF )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:230:1: ruleSimpleValue EOF
            {
             before(grammarAccess.getSimpleValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue420);
            ruleSimpleValue();

            state._fsp--;

             after(grammarAccess.getSimpleValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleValue427); 

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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:237:1: ruleSimpleValue : ( ( rule__SimpleValue__Group__0 ) ) ;
    public final void ruleSimpleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:241:2: ( ( ( rule__SimpleValue__Group__0 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:242:1: ( ( rule__SimpleValue__Group__0 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:242:1: ( ( rule__SimpleValue__Group__0 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:243:1: ( rule__SimpleValue__Group__0 )
            {
             before(grammarAccess.getSimpleValueAccess().getGroup()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:244:1: ( rule__SimpleValue__Group__0 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:244:2: rule__SimpleValue__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__0_in_ruleSimpleValue453);
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


    // $ANTLR start "entryRuleAttribute"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:256:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:257:1: ( ruleAttribute EOF )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:258:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute480);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute487); 

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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:265:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:269:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:270:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:270:1: ( ( rule__Attribute__Group__0 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:271:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:272:1: ( rule__Attribute__Group__0 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:272:2: rule__Attribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__0_in_ruleAttribute513);
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


    // $ANTLR start "entryRuleAssociation"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:284:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:285:1: ( ruleAssociation EOF )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:286:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssociation_in_entryRuleAssociation540);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssociation547); 

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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:293:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:297:2: ( ( ( rule__Association__Group__0 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:298:1: ( ( rule__Association__Group__0 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:298:1: ( ( rule__Association__Group__0 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:299:1: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:300:1: ( rule__Association__Group__0 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:300:2: rule__Association__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__0_in_ruleAssociation573);
            rule__Association__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleEInt"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:312:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:313:1: ( ruleEInt EOF )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:314:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt600);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt607); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:321:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:325:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:326:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:326:1: ( ( rule__EInt__Group__0 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:327:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:328:1: ( rule__EInt__Group__0 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:328:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt633);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__Entities__Group__0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:342:1: rule__Entities__Group__0 : rule__Entities__Group__0__Impl rule__Entities__Group__1 ;
    public final void rule__Entities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:346:1: ( rule__Entities__Group__0__Impl rule__Entities__Group__1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:347:2: rule__Entities__Group__0__Impl rule__Entities__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entities__Group__0__Impl_in_rule__Entities__Group__0667);
            rule__Entities__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entities__Group__1_in_rule__Entities__Group__0670);
            rule__Entities__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__0"


    // $ANTLR start "rule__Entities__Group__0__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:354:1: rule__Entities__Group__0__Impl : ( () ) ;
    public final void rule__Entities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:358:1: ( ( () ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:359:1: ( () )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:359:1: ( () )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:360:1: ()
            {
             before(grammarAccess.getEntitiesAccess().getEntitiesAction_0()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:361:1: ()
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:363:1: 
            {
            }

             after(grammarAccess.getEntitiesAccess().getEntitiesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__0__Impl"


    // $ANTLR start "rule__Entities__Group__1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:373:1: rule__Entities__Group__1 : rule__Entities__Group__1__Impl rule__Entities__Group__2 ;
    public final void rule__Entities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:377:1: ( rule__Entities__Group__1__Impl rule__Entities__Group__2 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:378:2: rule__Entities__Group__1__Impl rule__Entities__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entities__Group__1__Impl_in_rule__Entities__Group__1728);
            rule__Entities__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entities__Group__2_in_rule__Entities__Group__1731);
            rule__Entities__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__1"


    // $ANTLR start "rule__Entities__Group__1__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:385:1: rule__Entities__Group__1__Impl : ( ( rule__Entities__ImportsAssignment_1 )* ) ;
    public final void rule__Entities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:389:1: ( ( ( rule__Entities__ImportsAssignment_1 )* ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:390:1: ( ( rule__Entities__ImportsAssignment_1 )* )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:390:1: ( ( rule__Entities__ImportsAssignment_1 )* )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:391:1: ( rule__Entities__ImportsAssignment_1 )*
            {
             before(grammarAccess.getEntitiesAccess().getImportsAssignment_1()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:392:1: ( rule__Entities__ImportsAssignment_1 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:392:2: rule__Entities__ImportsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entities__ImportsAssignment_1_in_rule__Entities__Group__1__Impl758);
            	    rule__Entities__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getEntitiesAccess().getImportsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__1__Impl"


    // $ANTLR start "rule__Entities__Group__2"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:402:1: rule__Entities__Group__2 : rule__Entities__Group__2__Impl ;
    public final void rule__Entities__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:406:1: ( rule__Entities__Group__2__Impl )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:407:2: rule__Entities__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entities__Group__2__Impl_in_rule__Entities__Group__2789);
            rule__Entities__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__2"


    // $ANTLR start "rule__Entities__Group__2__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:413:1: rule__Entities__Group__2__Impl : ( ( rule__Entities__EntitiesAssignment_2 )* ) ;
    public final void rule__Entities__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:417:1: ( ( ( rule__Entities__EntitiesAssignment_2 )* ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:418:1: ( ( rule__Entities__EntitiesAssignment_2 )* )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:418:1: ( ( rule__Entities__EntitiesAssignment_2 )* )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:419:1: ( rule__Entities__EntitiesAssignment_2 )*
            {
             before(grammarAccess.getEntitiesAccess().getEntitiesAssignment_2()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:420:1: ( rule__Entities__EntitiesAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13||LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:420:2: rule__Entities__EntitiesAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entities__EntitiesAssignment_2_in_rule__Entities__Group__2__Impl816);
            	    rule__Entities__EntitiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getEntitiesAccess().getEntitiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__2__Impl"


    // $ANTLR start "rule__Imports__Group__0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:436:1: rule__Imports__Group__0 : rule__Imports__Group__0__Impl rule__Imports__Group__1 ;
    public final void rule__Imports__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:440:1: ( rule__Imports__Group__0__Impl rule__Imports__Group__1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:441:2: rule__Imports__Group__0__Impl rule__Imports__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Imports__Group__0__Impl_in_rule__Imports__Group__0853);
            rule__Imports__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Imports__Group__1_in_rule__Imports__Group__0856);
            rule__Imports__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group__0"


    // $ANTLR start "rule__Imports__Group__0__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:448:1: rule__Imports__Group__0__Impl : ( 'import' ) ;
    public final void rule__Imports__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:452:1: ( ( 'import' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:453:1: ( 'import' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:453:1: ( 'import' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:454:1: 'import'
            {
             before(grammarAccess.getImportsAccess().getImportKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Imports__Group__0__Impl884); 
             after(grammarAccess.getImportsAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group__0__Impl"


    // $ANTLR start "rule__Imports__Group__1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:467:1: rule__Imports__Group__1 : rule__Imports__Group__1__Impl rule__Imports__Group__2 ;
    public final void rule__Imports__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:471:1: ( rule__Imports__Group__1__Impl rule__Imports__Group__2 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:472:2: rule__Imports__Group__1__Impl rule__Imports__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Imports__Group__1__Impl_in_rule__Imports__Group__1915);
            rule__Imports__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Imports__Group__2_in_rule__Imports__Group__1918);
            rule__Imports__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group__1"


    // $ANTLR start "rule__Imports__Group__1__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:479:1: rule__Imports__Group__1__Impl : ( ( rule__Imports__ImportURIAssignment_1 ) ) ;
    public final void rule__Imports__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:483:1: ( ( ( rule__Imports__ImportURIAssignment_1 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:484:1: ( ( rule__Imports__ImportURIAssignment_1 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:484:1: ( ( rule__Imports__ImportURIAssignment_1 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:485:1: ( rule__Imports__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportsAccess().getImportURIAssignment_1()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:486:1: ( rule__Imports__ImportURIAssignment_1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:486:2: rule__Imports__ImportURIAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Imports__ImportURIAssignment_1_in_rule__Imports__Group__1__Impl945);
            rule__Imports__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportsAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group__1__Impl"


    // $ANTLR start "rule__Imports__Group__2"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:496:1: rule__Imports__Group__2 : rule__Imports__Group__2__Impl ;
    public final void rule__Imports__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:500:1: ( rule__Imports__Group__2__Impl )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:501:2: rule__Imports__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Imports__Group__2__Impl_in_rule__Imports__Group__2975);
            rule__Imports__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group__2"


    // $ANTLR start "rule__Imports__Group__2__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:507:1: rule__Imports__Group__2__Impl : ( ';' ) ;
    public final void rule__Imports__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:511:1: ( ( ';' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:512:1: ( ';' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:512:1: ( ';' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:513:1: ';'
            {
             before(grammarAccess.getImportsAccess().getSemicolonKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Imports__Group__2__Impl1003); 
             after(grammarAccess.getImportsAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group__2__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:532:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:536:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:537:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__01040);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__01043);
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:544:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:548:1: ( ( '@' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:549:1: ( '@' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:549:1: ( '@' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:550:1: '@'
            {
             before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Annotation__Group__0__Impl1071); 
             after(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:563:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:567:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:568:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__11102);
            rule__Annotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__11105);
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:575:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__AnnotationTypeAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:579:1: ( ( ( rule__Annotation__AnnotationTypeAssignment_1 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:580:1: ( ( rule__Annotation__AnnotationTypeAssignment_1 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:580:1: ( ( rule__Annotation__AnnotationTypeAssignment_1 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:581:1: ( rule__Annotation__AnnotationTypeAssignment_1 )
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationTypeAssignment_1()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:582:1: ( rule__Annotation__AnnotationTypeAssignment_1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:582:2: rule__Annotation__AnnotationTypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__AnnotationTypeAssignment_1_in_rule__Annotation__Group__1__Impl1132);
            rule__Annotation__AnnotationTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getAnnotationTypeAssignment_1()); 

            }


            }

        }
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:592:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl rule__Annotation__Group__3 ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:596:1: ( rule__Annotation__Group__2__Impl rule__Annotation__Group__3 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:597:2: rule__Annotation__Group__2__Impl rule__Annotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__21162);
            rule__Annotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__3_in_rule__Annotation__Group__21165);
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:604:1: rule__Annotation__Group__2__Impl : ( '(' ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:608:1: ( ( '(' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:609:1: ( '(' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:609:1: ( '(' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:610:1: '('
            {
             before(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Annotation__Group__2__Impl1193); 
             after(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:623:1: rule__Annotation__Group__3 : rule__Annotation__Group__3__Impl rule__Annotation__Group__4 ;
    public final void rule__Annotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:627:1: ( rule__Annotation__Group__3__Impl rule__Annotation__Group__4 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:628:2: rule__Annotation__Group__3__Impl rule__Annotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__3__Impl_in_rule__Annotation__Group__31224);
            rule__Annotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__4_in_rule__Annotation__Group__31227);
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:635:1: rule__Annotation__Group__3__Impl : ( ( rule__Annotation__Group_3__0 )? ) ;
    public final void rule__Annotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:639:1: ( ( ( rule__Annotation__Group_3__0 )? ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:640:1: ( ( rule__Annotation__Group_3__0 )? )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:640:1: ( ( rule__Annotation__Group_3__0 )? )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:641:1: ( rule__Annotation__Group_3__0 )?
            {
             before(grammarAccess.getAnnotationAccess().getGroup_3()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:642:1: ( rule__Annotation__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:642:2: rule__Annotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group_3__0_in_rule__Annotation__Group__3__Impl1254);
                    rule__Annotation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnotationAccess().getGroup_3()); 

            }


            }

        }
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:652:1: rule__Annotation__Group__4 : rule__Annotation__Group__4__Impl ;
    public final void rule__Annotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:656:1: ( rule__Annotation__Group__4__Impl )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:657:2: rule__Annotation__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__4__Impl_in_rule__Annotation__Group__41285);
            rule__Annotation__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:663:1: rule__Annotation__Group__4__Impl : ( ')' ) ;
    public final void rule__Annotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:667:1: ( ( ')' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:668:1: ( ')' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:668:1: ( ')' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:669:1: ')'
            {
             before(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Annotation__Group__4__Impl1313); 
             after(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Annotation__Group_3__0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:692:1: rule__Annotation__Group_3__0 : rule__Annotation__Group_3__0__Impl rule__Annotation__Group_3__1 ;
    public final void rule__Annotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:696:1: ( rule__Annotation__Group_3__0__Impl rule__Annotation__Group_3__1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:697:2: rule__Annotation__Group_3__0__Impl rule__Annotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group_3__0__Impl_in_rule__Annotation__Group_3__01354);
            rule__Annotation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group_3__1_in_rule__Annotation__Group_3__01357);
            rule__Annotation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_3__0"


    // $ANTLR start "rule__Annotation__Group_3__0__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:704:1: rule__Annotation__Group_3__0__Impl : ( ( rule__Annotation__AttributesAssignment_3_0 ) ) ;
    public final void rule__Annotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:708:1: ( ( ( rule__Annotation__AttributesAssignment_3_0 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:709:1: ( ( rule__Annotation__AttributesAssignment_3_0 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:709:1: ( ( rule__Annotation__AttributesAssignment_3_0 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:710:1: ( rule__Annotation__AttributesAssignment_3_0 )
            {
             before(grammarAccess.getAnnotationAccess().getAttributesAssignment_3_0()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:711:1: ( rule__Annotation__AttributesAssignment_3_0 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:711:2: rule__Annotation__AttributesAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__AttributesAssignment_3_0_in_rule__Annotation__Group_3__0__Impl1384);
            rule__Annotation__AttributesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getAttributesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_3__0__Impl"


    // $ANTLR start "rule__Annotation__Group_3__1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:721:1: rule__Annotation__Group_3__1 : rule__Annotation__Group_3__1__Impl ;
    public final void rule__Annotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:725:1: ( rule__Annotation__Group_3__1__Impl )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:726:2: rule__Annotation__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group_3__1__Impl_in_rule__Annotation__Group_3__11414);
            rule__Annotation__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_3__1"


    // $ANTLR start "rule__Annotation__Group_3__1__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:732:1: rule__Annotation__Group_3__1__Impl : ( ( rule__Annotation__Group_3_1__0 )* ) ;
    public final void rule__Annotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:736:1: ( ( ( rule__Annotation__Group_3_1__0 )* ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:737:1: ( ( rule__Annotation__Group_3_1__0 )* )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:737:1: ( ( rule__Annotation__Group_3_1__0 )* )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:738:1: ( rule__Annotation__Group_3_1__0 )*
            {
             before(grammarAccess.getAnnotationAccess().getGroup_3_1()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:739:1: ( rule__Annotation__Group_3_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:739:2: rule__Annotation__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group_3_1__0_in_rule__Annotation__Group_3__1__Impl1441);
            	    rule__Annotation__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getAnnotationAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_3__1__Impl"


    // $ANTLR start "rule__Annotation__Group_3_1__0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:753:1: rule__Annotation__Group_3_1__0 : rule__Annotation__Group_3_1__0__Impl rule__Annotation__Group_3_1__1 ;
    public final void rule__Annotation__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:757:1: ( rule__Annotation__Group_3_1__0__Impl rule__Annotation__Group_3_1__1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:758:2: rule__Annotation__Group_3_1__0__Impl rule__Annotation__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group_3_1__0__Impl_in_rule__Annotation__Group_3_1__01476);
            rule__Annotation__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group_3_1__1_in_rule__Annotation__Group_3_1__01479);
            rule__Annotation__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_3_1__0"


    // $ANTLR start "rule__Annotation__Group_3_1__0__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:765:1: rule__Annotation__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Annotation__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:769:1: ( ( ',' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:770:1: ( ',' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:770:1: ( ',' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:771:1: ','
            {
             before(grammarAccess.getAnnotationAccess().getCommaKeyword_3_1_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Annotation__Group_3_1__0__Impl1507); 
             after(grammarAccess.getAnnotationAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_3_1__0__Impl"


    // $ANTLR start "rule__Annotation__Group_3_1__1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:784:1: rule__Annotation__Group_3_1__1 : rule__Annotation__Group_3_1__1__Impl ;
    public final void rule__Annotation__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:788:1: ( rule__Annotation__Group_3_1__1__Impl )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:789:2: rule__Annotation__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group_3_1__1__Impl_in_rule__Annotation__Group_3_1__11538);
            rule__Annotation__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_3_1__1"


    // $ANTLR start "rule__Annotation__Group_3_1__1__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:795:1: rule__Annotation__Group_3_1__1__Impl : ( ( rule__Annotation__AttributesAssignment_3_1_1 ) ) ;
    public final void rule__Annotation__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:799:1: ( ( ( rule__Annotation__AttributesAssignment_3_1_1 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:800:1: ( ( rule__Annotation__AttributesAssignment_3_1_1 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:800:1: ( ( rule__Annotation__AttributesAssignment_3_1_1 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:801:1: ( rule__Annotation__AttributesAssignment_3_1_1 )
            {
             before(grammarAccess.getAnnotationAccess().getAttributesAssignment_3_1_1()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:802:1: ( rule__Annotation__AttributesAssignment_3_1_1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:802:2: rule__Annotation__AttributesAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__AttributesAssignment_3_1_1_in_rule__Annotation__Group_3_1__1__Impl1565);
            rule__Annotation__AttributesAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getAttributesAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_3_1__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:816:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:820:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:821:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01599);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01602);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:828:1: rule__Entity__Group__0__Impl : ( () ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:832:1: ( ( () ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:833:1: ( () )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:833:1: ( () )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:834:1: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_0()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:835:1: ()
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:837:1: 
            {
            }

             after(grammarAccess.getEntityAccess().getEntityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:847:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:851:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:852:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11660);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11663);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:859:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__AnnotationsAssignment_1 )? ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:863:1: ( ( ( rule__Entity__AnnotationsAssignment_1 )? ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:864:1: ( ( rule__Entity__AnnotationsAssignment_1 )? )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:864:1: ( ( rule__Entity__AnnotationsAssignment_1 )? )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:865:1: ( rule__Entity__AnnotationsAssignment_1 )?
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAssignment_1()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:866:1: ( rule__Entity__AnnotationsAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:866:2: rule__Entity__AnnotationsAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__AnnotationsAssignment_1_in_rule__Entity__Group__1__Impl1690);
                    rule__Entity__AnnotationsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getAnnotationsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:876:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:880:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:881:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21721);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21724);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:888:1: rule__Entity__Group__2__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:892:1: ( ( 'Entity' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:893:1: ( 'Entity' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:893:1: ( 'Entity' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:894:1: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Entity__Group__2__Impl1752); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:907:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:911:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:912:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31783);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31786);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:919:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__NameAssignment_3 ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:923:1: ( ( ( rule__Entity__NameAssignment_3 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:924:1: ( ( rule__Entity__NameAssignment_3 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:924:1: ( ( rule__Entity__NameAssignment_3 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:925:1: ( rule__Entity__NameAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_3()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:926:1: ( rule__Entity__NameAssignment_3 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:926:2: rule__Entity__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__NameAssignment_3_in_rule__Entity__Group__3__Impl1813);
            rule__Entity__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:936:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:940:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:941:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41843);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41846);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:948:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__Group_4__0 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:952:1: ( ( ( rule__Entity__Group_4__0 )? ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:953:1: ( ( rule__Entity__Group_4__0 )? )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:953:1: ( ( rule__Entity__Group_4__0 )? )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:954:1: ( rule__Entity__Group_4__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_4()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:955:1: ( rule__Entity__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:955:2: rule__Entity__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__0_in_rule__Entity__Group__4__Impl1873);
                    rule__Entity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:965:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:969:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:970:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51904);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51907);
            rule__Entity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:977:1: rule__Entity__Group__5__Impl : ( '{' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:981:1: ( ( '{' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:982:1: ( '{' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:982:1: ( '{' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:983:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Entity__Group__5__Impl1935); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:996:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1000:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1001:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61966);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__61969);
            rule__Entity__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1008:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__Group_6__0 )? ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1012:1: ( ( ( rule__Entity__Group_6__0 )? ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1013:1: ( ( rule__Entity__Group_6__0 )? )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1013:1: ( ( rule__Entity__Group_6__0 )? )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1014:1: ( rule__Entity__Group_6__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_6()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1015:1: ( rule__Entity__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1015:2: rule__Entity__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__0_in_rule__Entity__Group__6__Impl1996);
                    rule__Entity__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group__7"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1025:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl rule__Entity__Group__8 ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1029:1: ( rule__Entity__Group__7__Impl rule__Entity__Group__8 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1030:2: rule__Entity__Group__7__Impl rule__Entity__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__72027);
            rule__Entity__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__72030);
            rule__Entity__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7"


    // $ANTLR start "rule__Entity__Group__7__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1037:1: rule__Entity__Group__7__Impl : ( ( rule__Entity__Group_7__0 )? ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1041:1: ( ( ( rule__Entity__Group_7__0 )? ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1042:1: ( ( rule__Entity__Group_7__0 )? )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1042:1: ( ( rule__Entity__Group_7__0 )? )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1043:1: ( rule__Entity__Group_7__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_7()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1044:1: ( rule__Entity__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1044:2: rule__Entity__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7__0_in_rule__Entity__Group__7__Impl2057);
                    rule__Entity__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7__Impl"


    // $ANTLR start "rule__Entity__Group__8"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1054:1: rule__Entity__Group__8 : rule__Entity__Group__8__Impl ;
    public final void rule__Entity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1058:1: ( rule__Entity__Group__8__Impl )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1059:2: rule__Entity__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__82088);
            rule__Entity__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__8"


    // $ANTLR start "rule__Entity__Group__8__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1065:1: rule__Entity__Group__8__Impl : ( '}' ) ;
    public final void rule__Entity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1069:1: ( ( '}' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1070:1: ( '}' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1070:1: ( '}' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1071:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Entity__Group__8__Impl2116); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__8__Impl"


    // $ANTLR start "rule__Entity__Group_4__0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1102:1: rule__Entity__Group_4__0 : rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 ;
    public final void rule__Entity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1106:1: ( rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1107:2: rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__0__Impl_in_rule__Entity__Group_4__02165);
            rule__Entity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__1_in_rule__Entity__Group_4__02168);
            rule__Entity__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__0"


    // $ANTLR start "rule__Entity__Group_4__0__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1114:1: rule__Entity__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1118:1: ( ( 'extends' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1119:1: ( 'extends' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1119:1: ( 'extends' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1120:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_4_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Entity__Group_4__0__Impl2196); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__0__Impl"


    // $ANTLR start "rule__Entity__Group_4__1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1133:1: rule__Entity__Group_4__1 : rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2 ;
    public final void rule__Entity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1137:1: ( rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1138:2: rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__1__Impl_in_rule__Entity__Group_4__12227);
            rule__Entity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__2_in_rule__Entity__Group_4__12230);
            rule__Entity__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__1"


    // $ANTLR start "rule__Entity__Group_4__1__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1145:1: rule__Entity__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Entity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1149:1: ( ( '(' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1150:1: ( '(' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1150:1: ( '(' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1151:1: '('
            {
             before(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Entity__Group_4__1__Impl2258); 
             after(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__1__Impl"


    // $ANTLR start "rule__Entity__Group_4__2"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1164:1: rule__Entity__Group_4__2 : rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3 ;
    public final void rule__Entity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1168:1: ( rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1169:2: rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__2__Impl_in_rule__Entity__Group_4__22289);
            rule__Entity__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__3_in_rule__Entity__Group_4__22292);
            rule__Entity__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__2"


    // $ANTLR start "rule__Entity__Group_4__2__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1176:1: rule__Entity__Group_4__2__Impl : ( ( rule__Entity__ExtendsAssignment_4_2 ) ) ;
    public final void rule__Entity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1180:1: ( ( ( rule__Entity__ExtendsAssignment_4_2 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1181:1: ( ( rule__Entity__ExtendsAssignment_4_2 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1181:1: ( ( rule__Entity__ExtendsAssignment_4_2 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1182:1: ( rule__Entity__ExtendsAssignment_4_2 )
            {
             before(grammarAccess.getEntityAccess().getExtendsAssignment_4_2()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1183:1: ( rule__Entity__ExtendsAssignment_4_2 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1183:2: rule__Entity__ExtendsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__ExtendsAssignment_4_2_in_rule__Entity__Group_4__2__Impl2319);
            rule__Entity__ExtendsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getExtendsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__2__Impl"


    // $ANTLR start "rule__Entity__Group_4__3"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1193:1: rule__Entity__Group_4__3 : rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4 ;
    public final void rule__Entity__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1197:1: ( rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1198:2: rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__3__Impl_in_rule__Entity__Group_4__32349);
            rule__Entity__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__4_in_rule__Entity__Group_4__32352);
            rule__Entity__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__3"


    // $ANTLR start "rule__Entity__Group_4__3__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1205:1: rule__Entity__Group_4__3__Impl : ( ( rule__Entity__Group_4_3__0 )* ) ;
    public final void rule__Entity__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1209:1: ( ( ( rule__Entity__Group_4_3__0 )* ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1210:1: ( ( rule__Entity__Group_4_3__0 )* )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1210:1: ( ( rule__Entity__Group_4_3__0 )* )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1211:1: ( rule__Entity__Group_4_3__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_4_3()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1212:1: ( rule__Entity__Group_4_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1212:2: rule__Entity__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4_3__0_in_rule__Entity__Group_4__3__Impl2379);
            	    rule__Entity__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__3__Impl"


    // $ANTLR start "rule__Entity__Group_4__4"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1222:1: rule__Entity__Group_4__4 : rule__Entity__Group_4__4__Impl ;
    public final void rule__Entity__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1226:1: ( rule__Entity__Group_4__4__Impl )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1227:2: rule__Entity__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__4__Impl_in_rule__Entity__Group_4__42410);
            rule__Entity__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__4"


    // $ANTLR start "rule__Entity__Group_4__4__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1233:1: rule__Entity__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Entity__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1237:1: ( ( ')' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1238:1: ( ')' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1238:1: ( ')' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1239:1: ')'
            {
             before(grammarAccess.getEntityAccess().getRightParenthesisKeyword_4_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Entity__Group_4__4__Impl2438); 
             after(grammarAccess.getEntityAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__4__Impl"


    // $ANTLR start "rule__Entity__Group_4_3__0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1262:1: rule__Entity__Group_4_3__0 : rule__Entity__Group_4_3__0__Impl rule__Entity__Group_4_3__1 ;
    public final void rule__Entity__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1266:1: ( rule__Entity__Group_4_3__0__Impl rule__Entity__Group_4_3__1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1267:2: rule__Entity__Group_4_3__0__Impl rule__Entity__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4_3__0__Impl_in_rule__Entity__Group_4_3__02479);
            rule__Entity__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4_3__1_in_rule__Entity__Group_4_3__02482);
            rule__Entity__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4_3__0"


    // $ANTLR start "rule__Entity__Group_4_3__0__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1274:1: rule__Entity__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1278:1: ( ( ',' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1279:1: ( ',' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1279:1: ( ',' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1280:1: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_4_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Entity__Group_4_3__0__Impl2510); 
             after(grammarAccess.getEntityAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_4_3__1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1293:1: rule__Entity__Group_4_3__1 : rule__Entity__Group_4_3__1__Impl ;
    public final void rule__Entity__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1297:1: ( rule__Entity__Group_4_3__1__Impl )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1298:2: rule__Entity__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4_3__1__Impl_in_rule__Entity__Group_4_3__12541);
            rule__Entity__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4_3__1"


    // $ANTLR start "rule__Entity__Group_4_3__1__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1304:1: rule__Entity__Group_4_3__1__Impl : ( ( rule__Entity__ExtendsAssignment_4_3_1 ) ) ;
    public final void rule__Entity__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1308:1: ( ( ( rule__Entity__ExtendsAssignment_4_3_1 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1309:1: ( ( rule__Entity__ExtendsAssignment_4_3_1 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1309:1: ( ( rule__Entity__ExtendsAssignment_4_3_1 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1310:1: ( rule__Entity__ExtendsAssignment_4_3_1 )
            {
             before(grammarAccess.getEntityAccess().getExtendsAssignment_4_3_1()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1311:1: ( rule__Entity__ExtendsAssignment_4_3_1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1311:2: rule__Entity__ExtendsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__ExtendsAssignment_4_3_1_in_rule__Entity__Group_4_3__1__Impl2568);
            rule__Entity__ExtendsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getExtendsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4_3__1__Impl"


    // $ANTLR start "rule__Entity__Group_6__0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1325:1: rule__Entity__Group_6__0 : rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 ;
    public final void rule__Entity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1329:1: ( rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1330:2: rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__0__Impl_in_rule__Entity__Group_6__02602);
            rule__Entity__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__1_in_rule__Entity__Group_6__02605);
            rule__Entity__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__0"


    // $ANTLR start "rule__Entity__Group_6__0__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1337:1: rule__Entity__Group_6__0__Impl : ( ( rule__Entity__AttributesAssignment_6_0 ) ) ;
    public final void rule__Entity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1341:1: ( ( ( rule__Entity__AttributesAssignment_6_0 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1342:1: ( ( rule__Entity__AttributesAssignment_6_0 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1342:1: ( ( rule__Entity__AttributesAssignment_6_0 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1343:1: ( rule__Entity__AttributesAssignment_6_0 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_6_0()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1344:1: ( rule__Entity__AttributesAssignment_6_0 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1344:2: rule__Entity__AttributesAssignment_6_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__AttributesAssignment_6_0_in_rule__Entity__Group_6__0__Impl2632);
            rule__Entity__AttributesAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAttributesAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__0__Impl"


    // $ANTLR start "rule__Entity__Group_6__1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1354:1: rule__Entity__Group_6__1 : rule__Entity__Group_6__1__Impl ;
    public final void rule__Entity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1358:1: ( rule__Entity__Group_6__1__Impl )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1359:2: rule__Entity__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__1__Impl_in_rule__Entity__Group_6__12662);
            rule__Entity__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__1"


    // $ANTLR start "rule__Entity__Group_6__1__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1365:1: rule__Entity__Group_6__1__Impl : ( ( rule__Entity__Group_6_1__0 )* ) ;
    public final void rule__Entity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1369:1: ( ( ( rule__Entity__Group_6_1__0 )* ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1370:1: ( ( rule__Entity__Group_6_1__0 )* )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1370:1: ( ( rule__Entity__Group_6_1__0 )* )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1371:1: ( rule__Entity__Group_6_1__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_6_1()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1372:1: ( rule__Entity__Group_6_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1372:2: rule__Entity__Group_6_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6_1__0_in_rule__Entity__Group_6__1__Impl2689);
            	    rule__Entity__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__1__Impl"


    // $ANTLR start "rule__Entity__Group_6_1__0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1386:1: rule__Entity__Group_6_1__0 : rule__Entity__Group_6_1__0__Impl rule__Entity__Group_6_1__1 ;
    public final void rule__Entity__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1390:1: ( rule__Entity__Group_6_1__0__Impl rule__Entity__Group_6_1__1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1391:2: rule__Entity__Group_6_1__0__Impl rule__Entity__Group_6_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6_1__0__Impl_in_rule__Entity__Group_6_1__02724);
            rule__Entity__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6_1__1_in_rule__Entity__Group_6_1__02727);
            rule__Entity__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6_1__0"


    // $ANTLR start "rule__Entity__Group_6_1__0__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1398:1: rule__Entity__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1402:1: ( ( ',' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1403:1: ( ',' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1403:1: ( ',' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1404:1: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_6_1_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Entity__Group_6_1__0__Impl2755); 
             after(grammarAccess.getEntityAccess().getCommaKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6_1__0__Impl"


    // $ANTLR start "rule__Entity__Group_6_1__1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1417:1: rule__Entity__Group_6_1__1 : rule__Entity__Group_6_1__1__Impl ;
    public final void rule__Entity__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1421:1: ( rule__Entity__Group_6_1__1__Impl )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1422:2: rule__Entity__Group_6_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6_1__1__Impl_in_rule__Entity__Group_6_1__12786);
            rule__Entity__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6_1__1"


    // $ANTLR start "rule__Entity__Group_6_1__1__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1428:1: rule__Entity__Group_6_1__1__Impl : ( ( rule__Entity__AttributesAssignment_6_1_1 ) ) ;
    public final void rule__Entity__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1432:1: ( ( ( rule__Entity__AttributesAssignment_6_1_1 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1433:1: ( ( rule__Entity__AttributesAssignment_6_1_1 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1433:1: ( ( rule__Entity__AttributesAssignment_6_1_1 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1434:1: ( rule__Entity__AttributesAssignment_6_1_1 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_6_1_1()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1435:1: ( rule__Entity__AttributesAssignment_6_1_1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1435:2: rule__Entity__AttributesAssignment_6_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__AttributesAssignment_6_1_1_in_rule__Entity__Group_6_1__1__Impl2813);
            rule__Entity__AttributesAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAttributesAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6_1__1__Impl"


    // $ANTLR start "rule__Entity__Group_7__0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1449:1: rule__Entity__Group_7__0 : rule__Entity__Group_7__0__Impl rule__Entity__Group_7__1 ;
    public final void rule__Entity__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1453:1: ( rule__Entity__Group_7__0__Impl rule__Entity__Group_7__1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1454:2: rule__Entity__Group_7__0__Impl rule__Entity__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7__0__Impl_in_rule__Entity__Group_7__02847);
            rule__Entity__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7__1_in_rule__Entity__Group_7__02850);
            rule__Entity__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_7__0"


    // $ANTLR start "rule__Entity__Group_7__0__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1461:1: rule__Entity__Group_7__0__Impl : ( 'associations' ) ;
    public final void rule__Entity__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1465:1: ( ( 'associations' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1466:1: ( 'associations' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1466:1: ( 'associations' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1467:1: 'associations'
            {
             before(grammarAccess.getEntityAccess().getAssociationsKeyword_7_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Entity__Group_7__0__Impl2878); 
             after(grammarAccess.getEntityAccess().getAssociationsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_7__0__Impl"


    // $ANTLR start "rule__Entity__Group_7__1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1480:1: rule__Entity__Group_7__1 : rule__Entity__Group_7__1__Impl rule__Entity__Group_7__2 ;
    public final void rule__Entity__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1484:1: ( rule__Entity__Group_7__1__Impl rule__Entity__Group_7__2 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1485:2: rule__Entity__Group_7__1__Impl rule__Entity__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7__1__Impl_in_rule__Entity__Group_7__12909);
            rule__Entity__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7__2_in_rule__Entity__Group_7__12912);
            rule__Entity__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_7__1"


    // $ANTLR start "rule__Entity__Group_7__1__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1492:1: rule__Entity__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Entity__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1496:1: ( ( '{' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1497:1: ( '{' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1497:1: ( '{' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1498:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Entity__Group_7__1__Impl2940); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_7__1__Impl"


    // $ANTLR start "rule__Entity__Group_7__2"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1511:1: rule__Entity__Group_7__2 : rule__Entity__Group_7__2__Impl rule__Entity__Group_7__3 ;
    public final void rule__Entity__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1515:1: ( rule__Entity__Group_7__2__Impl rule__Entity__Group_7__3 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1516:2: rule__Entity__Group_7__2__Impl rule__Entity__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7__2__Impl_in_rule__Entity__Group_7__22971);
            rule__Entity__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7__3_in_rule__Entity__Group_7__22974);
            rule__Entity__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_7__2"


    // $ANTLR start "rule__Entity__Group_7__2__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1523:1: rule__Entity__Group_7__2__Impl : ( ( rule__Entity__AssociationsAssignment_7_2 ) ) ;
    public final void rule__Entity__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1527:1: ( ( ( rule__Entity__AssociationsAssignment_7_2 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1528:1: ( ( rule__Entity__AssociationsAssignment_7_2 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1528:1: ( ( rule__Entity__AssociationsAssignment_7_2 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1529:1: ( rule__Entity__AssociationsAssignment_7_2 )
            {
             before(grammarAccess.getEntityAccess().getAssociationsAssignment_7_2()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1530:1: ( rule__Entity__AssociationsAssignment_7_2 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1530:2: rule__Entity__AssociationsAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__AssociationsAssignment_7_2_in_rule__Entity__Group_7__2__Impl3001);
            rule__Entity__AssociationsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAssociationsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_7__2__Impl"


    // $ANTLR start "rule__Entity__Group_7__3"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1540:1: rule__Entity__Group_7__3 : rule__Entity__Group_7__3__Impl rule__Entity__Group_7__4 ;
    public final void rule__Entity__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1544:1: ( rule__Entity__Group_7__3__Impl rule__Entity__Group_7__4 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1545:2: rule__Entity__Group_7__3__Impl rule__Entity__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7__3__Impl_in_rule__Entity__Group_7__33031);
            rule__Entity__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7__4_in_rule__Entity__Group_7__33034);
            rule__Entity__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_7__3"


    // $ANTLR start "rule__Entity__Group_7__3__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1552:1: rule__Entity__Group_7__3__Impl : ( ( rule__Entity__Group_7_3__0 )* ) ;
    public final void rule__Entity__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1556:1: ( ( ( rule__Entity__Group_7_3__0 )* ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1557:1: ( ( rule__Entity__Group_7_3__0 )* )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1557:1: ( ( rule__Entity__Group_7_3__0 )* )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1558:1: ( rule__Entity__Group_7_3__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_7_3()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1559:1: ( rule__Entity__Group_7_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1559:2: rule__Entity__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7_3__0_in_rule__Entity__Group_7__3__Impl3061);
            	    rule__Entity__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_7__3__Impl"


    // $ANTLR start "rule__Entity__Group_7__4"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1569:1: rule__Entity__Group_7__4 : rule__Entity__Group_7__4__Impl ;
    public final void rule__Entity__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1573:1: ( rule__Entity__Group_7__4__Impl )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1574:2: rule__Entity__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7__4__Impl_in_rule__Entity__Group_7__43092);
            rule__Entity__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_7__4"


    // $ANTLR start "rule__Entity__Group_7__4__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1580:1: rule__Entity__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1584:1: ( ( '}' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1585:1: ( '}' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1585:1: ( '}' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1586:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Entity__Group_7__4__Impl3120); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_7__4__Impl"


    // $ANTLR start "rule__Entity__Group_7_3__0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1609:1: rule__Entity__Group_7_3__0 : rule__Entity__Group_7_3__0__Impl rule__Entity__Group_7_3__1 ;
    public final void rule__Entity__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1613:1: ( rule__Entity__Group_7_3__0__Impl rule__Entity__Group_7_3__1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1614:2: rule__Entity__Group_7_3__0__Impl rule__Entity__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7_3__0__Impl_in_rule__Entity__Group_7_3__03161);
            rule__Entity__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7_3__1_in_rule__Entity__Group_7_3__03164);
            rule__Entity__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_7_3__0"


    // $ANTLR start "rule__Entity__Group_7_3__0__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1621:1: rule__Entity__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1625:1: ( ( ',' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1626:1: ( ',' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1626:1: ( ',' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1627:1: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_7_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Entity__Group_7_3__0__Impl3192); 
             after(grammarAccess.getEntityAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_7_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_7_3__1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1640:1: rule__Entity__Group_7_3__1 : rule__Entity__Group_7_3__1__Impl ;
    public final void rule__Entity__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1644:1: ( rule__Entity__Group_7_3__1__Impl )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1645:2: rule__Entity__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7_3__1__Impl_in_rule__Entity__Group_7_3__13223);
            rule__Entity__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_7_3__1"


    // $ANTLR start "rule__Entity__Group_7_3__1__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1651:1: rule__Entity__Group_7_3__1__Impl : ( ( rule__Entity__AssociationsAssignment_7_3_1 ) ) ;
    public final void rule__Entity__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1655:1: ( ( ( rule__Entity__AssociationsAssignment_7_3_1 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1656:1: ( ( rule__Entity__AssociationsAssignment_7_3_1 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1656:1: ( ( rule__Entity__AssociationsAssignment_7_3_1 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1657:1: ( rule__Entity__AssociationsAssignment_7_3_1 )
            {
             before(grammarAccess.getEntityAccess().getAssociationsAssignment_7_3_1()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1658:1: ( rule__Entity__AssociationsAssignment_7_3_1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1658:2: rule__Entity__AssociationsAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__AssociationsAssignment_7_3_1_in_rule__Entity__Group_7_3__1__Impl3250);
            rule__Entity__AssociationsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAssociationsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_7_3__1__Impl"


    // $ANTLR start "rule__AnnotationAttribute__Group__0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1672:1: rule__AnnotationAttribute__Group__0 : rule__AnnotationAttribute__Group__0__Impl rule__AnnotationAttribute__Group__1 ;
    public final void rule__AnnotationAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1676:1: ( rule__AnnotationAttribute__Group__0__Impl rule__AnnotationAttribute__Group__1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1677:2: rule__AnnotationAttribute__Group__0__Impl rule__AnnotationAttribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__0__Impl_in_rule__AnnotationAttribute__Group__03284);
            rule__AnnotationAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__1_in_rule__AnnotationAttribute__Group__03287);
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1684:1: rule__AnnotationAttribute__Group__0__Impl : ( ( rule__AnnotationAttribute__AttributeAssignment_0 ) ) ;
    public final void rule__AnnotationAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1688:1: ( ( ( rule__AnnotationAttribute__AttributeAssignment_0 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1689:1: ( ( rule__AnnotationAttribute__AttributeAssignment_0 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1689:1: ( ( rule__AnnotationAttribute__AttributeAssignment_0 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1690:1: ( rule__AnnotationAttribute__AttributeAssignment_0 )
            {
             before(grammarAccess.getAnnotationAttributeAccess().getAttributeAssignment_0()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1691:1: ( rule__AnnotationAttribute__AttributeAssignment_0 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1691:2: rule__AnnotationAttribute__AttributeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__AttributeAssignment_0_in_rule__AnnotationAttribute__Group__0__Impl3314);
            rule__AnnotationAttribute__AttributeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAttributeAccess().getAttributeAssignment_0()); 

            }


            }

        }
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1701:1: rule__AnnotationAttribute__Group__1 : rule__AnnotationAttribute__Group__1__Impl rule__AnnotationAttribute__Group__2 ;
    public final void rule__AnnotationAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1705:1: ( rule__AnnotationAttribute__Group__1__Impl rule__AnnotationAttribute__Group__2 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1706:2: rule__AnnotationAttribute__Group__1__Impl rule__AnnotationAttribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__1__Impl_in_rule__AnnotationAttribute__Group__13344);
            rule__AnnotationAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__2_in_rule__AnnotationAttribute__Group__13347);
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1713:1: rule__AnnotationAttribute__Group__1__Impl : ( '=' ) ;
    public final void rule__AnnotationAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1717:1: ( ( '=' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1718:1: ( '=' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1718:1: ( '=' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1719:1: '='
            {
             before(grammarAccess.getAnnotationAttributeAccess().getEqualsSignKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__AnnotationAttribute__Group__1__Impl3375); 
             after(grammarAccess.getAnnotationAttributeAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1732:1: rule__AnnotationAttribute__Group__2 : rule__AnnotationAttribute__Group__2__Impl ;
    public final void rule__AnnotationAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1736:1: ( rule__AnnotationAttribute__Group__2__Impl )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1737:2: rule__AnnotationAttribute__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__Group__2__Impl_in_rule__AnnotationAttribute__Group__23406);
            rule__AnnotationAttribute__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1743:1: rule__AnnotationAttribute__Group__2__Impl : ( ( rule__AnnotationAttribute__ValueAssignment_2 )? ) ;
    public final void rule__AnnotationAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1747:1: ( ( ( rule__AnnotationAttribute__ValueAssignment_2 )? ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1748:1: ( ( rule__AnnotationAttribute__ValueAssignment_2 )? )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1748:1: ( ( rule__AnnotationAttribute__ValueAssignment_2 )? )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1749:1: ( rule__AnnotationAttribute__ValueAssignment_2 )?
            {
             before(grammarAccess.getAnnotationAttributeAccess().getValueAssignment_2()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1750:1: ( rule__AnnotationAttribute__ValueAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1750:2: rule__AnnotationAttribute__ValueAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AnnotationAttribute__ValueAssignment_2_in_rule__AnnotationAttribute__Group__2__Impl3433);
                    rule__AnnotationAttribute__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnotationAttributeAccess().getValueAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__SimpleValue__Group__0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1766:1: rule__SimpleValue__Group__0 : rule__SimpleValue__Group__0__Impl rule__SimpleValue__Group__1 ;
    public final void rule__SimpleValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1770:1: ( rule__SimpleValue__Group__0__Impl rule__SimpleValue__Group__1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1771:2: rule__SimpleValue__Group__0__Impl rule__SimpleValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__0__Impl_in_rule__SimpleValue__Group__03470);
            rule__SimpleValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__1_in_rule__SimpleValue__Group__03473);
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1778:1: rule__SimpleValue__Group__0__Impl : ( () ) ;
    public final void rule__SimpleValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1782:1: ( ( () ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1783:1: ( () )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1783:1: ( () )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1784:1: ()
            {
             before(grammarAccess.getSimpleValueAccess().getSimpleValueAction_0()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1785:1: ()
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1787:1: 
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1797:1: rule__SimpleValue__Group__1 : rule__SimpleValue__Group__1__Impl ;
    public final void rule__SimpleValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1801:1: ( rule__SimpleValue__Group__1__Impl )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1802:2: rule__SimpleValue__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__Group__1__Impl_in_rule__SimpleValue__Group__13531);
            rule__SimpleValue__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1808:1: rule__SimpleValue__Group__1__Impl : ( ( rule__SimpleValue__ValueAssignment_1 ) ) ;
    public final void rule__SimpleValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1812:1: ( ( ( rule__SimpleValue__ValueAssignment_1 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1813:1: ( ( rule__SimpleValue__ValueAssignment_1 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1813:1: ( ( rule__SimpleValue__ValueAssignment_1 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1814:1: ( rule__SimpleValue__ValueAssignment_1 )
            {
             before(grammarAccess.getSimpleValueAccess().getValueAssignment_1()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1815:1: ( rule__SimpleValue__ValueAssignment_1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1815:2: rule__SimpleValue__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleValue__ValueAssignment_1_in_rule__SimpleValue__Group__1__Impl3558);
            rule__SimpleValue__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleValueAccess().getValueAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Attribute__Group__0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1829:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1833:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1834:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__03592);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__03595);
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1841:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1845:1: ( ( () ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1846:1: ( () )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1846:1: ( () )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1847:1: ()
            {
             before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1848:1: ()
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1850:1: 
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1860:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1864:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1865:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__13653);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__13656);
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1872:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__AnnotationsAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1876:1: ( ( ( rule__Attribute__AnnotationsAssignment_1 )? ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1877:1: ( ( rule__Attribute__AnnotationsAssignment_1 )? )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1877:1: ( ( rule__Attribute__AnnotationsAssignment_1 )? )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1878:1: ( rule__Attribute__AnnotationsAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getAnnotationsAssignment_1()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1879:1: ( rule__Attribute__AnnotationsAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1879:2: rule__Attribute__AnnotationsAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Attribute__AnnotationsAssignment_1_in_rule__Attribute__Group__1__Impl3683);
                    rule__Attribute__AnnotationsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getAnnotationsAssignment_1()); 

            }


            }

        }
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1889:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1893:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1894:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__23714);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__23717);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
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
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1901:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1905:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1906:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1906:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1907:1: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1908:1: ( rule__Attribute__NameAssignment_2 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1908:2: rule__Attribute__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl3744);
            rule__Attribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Attribute__Group__3"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1918:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1922:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1923:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__33774);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__33777);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1930:1: rule__Attribute__Group__3__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1934:1: ( ( ':' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1935:1: ( ':' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1935:1: ( ':' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1936:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Attribute__Group__3__Impl3805); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1949:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1953:1: ( rule__Attribute__Group__4__Impl )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1954:2: rule__Attribute__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__43836);
            rule__Attribute__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1960:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1964:1: ( ( ( rule__Attribute__TypeAssignment_4 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1965:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1965:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1966:1: ( rule__Attribute__TypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1967:1: ( rule__Attribute__TypeAssignment_4 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1967:2: rule__Attribute__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__TypeAssignment_4_in_rule__Attribute__Group__4__Impl3863);
            rule__Attribute__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Association__Group__0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1987:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1991:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1992:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__03903);
            rule__Association__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__1_in_rule__Association__Group__03906);
            rule__Association__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0"


    // $ANTLR start "rule__Association__Group__0__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:1999:1: rule__Association__Group__0__Impl : ( ( rule__Association__ContainmentAssignment_0 )? ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2003:1: ( ( ( rule__Association__ContainmentAssignment_0 )? ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2004:1: ( ( rule__Association__ContainmentAssignment_0 )? )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2004:1: ( ( rule__Association__ContainmentAssignment_0 )? )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2005:1: ( rule__Association__ContainmentAssignment_0 )?
            {
             before(grammarAccess.getAssociationAccess().getContainmentAssignment_0()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2006:1: ( rule__Association__ContainmentAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2006:2: rule__Association__ContainmentAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Association__ContainmentAssignment_0_in_rule__Association__Group__0__Impl3933);
                    rule__Association__ContainmentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getContainmentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0__Impl"


    // $ANTLR start "rule__Association__Group__1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2016:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2020:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2021:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__13964);
            rule__Association__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__2_in_rule__Association__Group__13967);
            rule__Association__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1"


    // $ANTLR start "rule__Association__Group__1__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2028:1: rule__Association__Group__1__Impl : ( ( rule__Association__AnnotationsAssignment_1 )? ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2032:1: ( ( ( rule__Association__AnnotationsAssignment_1 )? ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2033:1: ( ( rule__Association__AnnotationsAssignment_1 )? )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2033:1: ( ( rule__Association__AnnotationsAssignment_1 )? )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2034:1: ( rule__Association__AnnotationsAssignment_1 )?
            {
             before(grammarAccess.getAssociationAccess().getAnnotationsAssignment_1()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2035:1: ( rule__Association__AnnotationsAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2035:2: rule__Association__AnnotationsAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Association__AnnotationsAssignment_1_in_rule__Association__Group__1__Impl3994);
                    rule__Association__AnnotationsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getAnnotationsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1__Impl"


    // $ANTLR start "rule__Association__Group__2"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2045:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2049:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2050:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__24025);
            rule__Association__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__3_in_rule__Association__Group__24028);
            rule__Association__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2"


    // $ANTLR start "rule__Association__Group__2__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2057:1: rule__Association__Group__2__Impl : ( 'many' ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2061:1: ( ( 'many' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2062:1: ( 'many' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2062:1: ( 'many' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2063:1: 'many'
            {
             before(grammarAccess.getAssociationAccess().getManyKeyword_2()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Association__Group__2__Impl4056); 
             after(grammarAccess.getAssociationAccess().getManyKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2__Impl"


    // $ANTLR start "rule__Association__Group__3"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2076:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2080:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2081:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__3__Impl_in_rule__Association__Group__34087);
            rule__Association__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__4_in_rule__Association__Group__34090);
            rule__Association__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__3"


    // $ANTLR start "rule__Association__Group__3__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2088:1: rule__Association__Group__3__Impl : ( ( rule__Association__NameAssignment_3 ) ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2092:1: ( ( ( rule__Association__NameAssignment_3 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2093:1: ( ( rule__Association__NameAssignment_3 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2093:1: ( ( rule__Association__NameAssignment_3 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2094:1: ( rule__Association__NameAssignment_3 )
            {
             before(grammarAccess.getAssociationAccess().getNameAssignment_3()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2095:1: ( rule__Association__NameAssignment_3 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2095:2: rule__Association__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__NameAssignment_3_in_rule__Association__Group__3__Impl4117);
            rule__Association__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__3__Impl"


    // $ANTLR start "rule__Association__Group__4"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2105:1: rule__Association__Group__4 : rule__Association__Group__4__Impl rule__Association__Group__5 ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2109:1: ( rule__Association__Group__4__Impl rule__Association__Group__5 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2110:2: rule__Association__Group__4__Impl rule__Association__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__4__Impl_in_rule__Association__Group__44147);
            rule__Association__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__5_in_rule__Association__Group__44150);
            rule__Association__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__4"


    // $ANTLR start "rule__Association__Group__4__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2117:1: rule__Association__Group__4__Impl : ( ':' ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2121:1: ( ( ':' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2122:1: ( ':' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2122:1: ( ':' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2123:1: ':'
            {
             before(grammarAccess.getAssociationAccess().getColonKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Association__Group__4__Impl4178); 
             after(grammarAccess.getAssociationAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__4__Impl"


    // $ANTLR start "rule__Association__Group__5"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2136:1: rule__Association__Group__5 : rule__Association__Group__5__Impl rule__Association__Group__6 ;
    public final void rule__Association__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2140:1: ( rule__Association__Group__5__Impl rule__Association__Group__6 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2141:2: rule__Association__Group__5__Impl rule__Association__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__5__Impl_in_rule__Association__Group__54209);
            rule__Association__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__6_in_rule__Association__Group__54212);
            rule__Association__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__5"


    // $ANTLR start "rule__Association__Group__5__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2148:1: rule__Association__Group__5__Impl : ( ( rule__Association__TargetAssignment_5 ) ) ;
    public final void rule__Association__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2152:1: ( ( ( rule__Association__TargetAssignment_5 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2153:1: ( ( rule__Association__TargetAssignment_5 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2153:1: ( ( rule__Association__TargetAssignment_5 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2154:1: ( rule__Association__TargetAssignment_5 )
            {
             before(grammarAccess.getAssociationAccess().getTargetAssignment_5()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2155:1: ( rule__Association__TargetAssignment_5 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2155:2: rule__Association__TargetAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__TargetAssignment_5_in_rule__Association__Group__5__Impl4239);
            rule__Association__TargetAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTargetAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__5__Impl"


    // $ANTLR start "rule__Association__Group__6"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2165:1: rule__Association__Group__6 : rule__Association__Group__6__Impl rule__Association__Group__7 ;
    public final void rule__Association__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2169:1: ( rule__Association__Group__6__Impl rule__Association__Group__7 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2170:2: rule__Association__Group__6__Impl rule__Association__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__6__Impl_in_rule__Association__Group__64269);
            rule__Association__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__7_in_rule__Association__Group__64272);
            rule__Association__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__6"


    // $ANTLR start "rule__Association__Group__6__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2177:1: rule__Association__Group__6__Impl : ( ( rule__Association__Group_6__0 )? ) ;
    public final void rule__Association__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2181:1: ( ( ( rule__Association__Group_6__0 )? ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2182:1: ( ( rule__Association__Group_6__0 )? )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2182:1: ( ( rule__Association__Group_6__0 )? )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2183:1: ( rule__Association__Group_6__0 )?
            {
             before(grammarAccess.getAssociationAccess().getGroup_6()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2184:1: ( rule__Association__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2184:2: rule__Association__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Association__Group_6__0_in_rule__Association__Group__6__Impl4299);
                    rule__Association__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__6__Impl"


    // $ANTLR start "rule__Association__Group__7"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2194:1: rule__Association__Group__7 : rule__Association__Group__7__Impl ;
    public final void rule__Association__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2198:1: ( rule__Association__Group__7__Impl )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2199:2: rule__Association__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__7__Impl_in_rule__Association__Group__74330);
            rule__Association__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__7"


    // $ANTLR start "rule__Association__Group__7__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2205:1: rule__Association__Group__7__Impl : ( ';' ) ;
    public final void rule__Association__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2209:1: ( ( ';' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2210:1: ( ';' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2210:1: ( ';' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2211:1: ';'
            {
             before(grammarAccess.getAssociationAccess().getSemicolonKeyword_7()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Association__Group__7__Impl4358); 
             after(grammarAccess.getAssociationAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__7__Impl"


    // $ANTLR start "rule__Association__Group_6__0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2240:1: rule__Association__Group_6__0 : rule__Association__Group_6__0__Impl rule__Association__Group_6__1 ;
    public final void rule__Association__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2244:1: ( rule__Association__Group_6__0__Impl rule__Association__Group_6__1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2245:2: rule__Association__Group_6__0__Impl rule__Association__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group_6__0__Impl_in_rule__Association__Group_6__04405);
            rule__Association__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Association__Group_6__1_in_rule__Association__Group_6__04408);
            rule__Association__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6__0"


    // $ANTLR start "rule__Association__Group_6__0__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2252:1: rule__Association__Group_6__0__Impl : ( ( rule__Association__Group_6_0__0 ) ) ;
    public final void rule__Association__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2256:1: ( ( ( rule__Association__Group_6_0__0 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2257:1: ( ( rule__Association__Group_6_0__0 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2257:1: ( ( rule__Association__Group_6_0__0 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2258:1: ( rule__Association__Group_6_0__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup_6_0()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2259:1: ( rule__Association__Group_6_0__0 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2259:2: rule__Association__Group_6_0__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group_6_0__0_in_rule__Association__Group_6__0__Impl4435);
            rule__Association__Group_6_0__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6__0__Impl"


    // $ANTLR start "rule__Association__Group_6__1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2269:1: rule__Association__Group_6__1 : rule__Association__Group_6__1__Impl rule__Association__Group_6__2 ;
    public final void rule__Association__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2273:1: ( rule__Association__Group_6__1__Impl rule__Association__Group_6__2 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2274:2: rule__Association__Group_6__1__Impl rule__Association__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group_6__1__Impl_in_rule__Association__Group_6__14465);
            rule__Association__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Association__Group_6__2_in_rule__Association__Group_6__14468);
            rule__Association__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6__1"


    // $ANTLR start "rule__Association__Group_6__1__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2281:1: rule__Association__Group_6__1__Impl : ( ':' ) ;
    public final void rule__Association__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2285:1: ( ( ':' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2286:1: ( ':' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2286:1: ( ':' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2287:1: ':'
            {
             before(grammarAccess.getAssociationAccess().getColonKeyword_6_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Association__Group_6__1__Impl4496); 
             after(grammarAccess.getAssociationAccess().getColonKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6__1__Impl"


    // $ANTLR start "rule__Association__Group_6__2"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2300:1: rule__Association__Group_6__2 : rule__Association__Group_6__2__Impl ;
    public final void rule__Association__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2304:1: ( rule__Association__Group_6__2__Impl )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2305:2: rule__Association__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group_6__2__Impl_in_rule__Association__Group_6__24527);
            rule__Association__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6__2"


    // $ANTLR start "rule__Association__Group_6__2__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2311:1: rule__Association__Group_6__2__Impl : ( ( rule__Association__Group_6_2__0 ) ) ;
    public final void rule__Association__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2315:1: ( ( ( rule__Association__Group_6_2__0 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2316:1: ( ( rule__Association__Group_6_2__0 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2316:1: ( ( rule__Association__Group_6_2__0 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2317:1: ( rule__Association__Group_6_2__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup_6_2()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2318:1: ( rule__Association__Group_6_2__0 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2318:2: rule__Association__Group_6_2__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group_6_2__0_in_rule__Association__Group_6__2__Impl4554);
            rule__Association__Group_6_2__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6__2__Impl"


    // $ANTLR start "rule__Association__Group_6_0__0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2334:1: rule__Association__Group_6_0__0 : rule__Association__Group_6_0__0__Impl rule__Association__Group_6_0__1 ;
    public final void rule__Association__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2338:1: ( rule__Association__Group_6_0__0__Impl rule__Association__Group_6_0__1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2339:2: rule__Association__Group_6_0__0__Impl rule__Association__Group_6_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group_6_0__0__Impl_in_rule__Association__Group_6_0__04590);
            rule__Association__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Association__Group_6_0__1_in_rule__Association__Group_6_0__04593);
            rule__Association__Group_6_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6_0__0"


    // $ANTLR start "rule__Association__Group_6_0__0__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2346:1: rule__Association__Group_6_0__0__Impl : ( 'lowerBound' ) ;
    public final void rule__Association__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2350:1: ( ( 'lowerBound' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2351:1: ( 'lowerBound' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2351:1: ( 'lowerBound' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2352:1: 'lowerBound'
            {
             before(grammarAccess.getAssociationAccess().getLowerBoundKeyword_6_0_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Association__Group_6_0__0__Impl4621); 
             after(grammarAccess.getAssociationAccess().getLowerBoundKeyword_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6_0__0__Impl"


    // $ANTLR start "rule__Association__Group_6_0__1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2365:1: rule__Association__Group_6_0__1 : rule__Association__Group_6_0__1__Impl ;
    public final void rule__Association__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2369:1: ( rule__Association__Group_6_0__1__Impl )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2370:2: rule__Association__Group_6_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group_6_0__1__Impl_in_rule__Association__Group_6_0__14652);
            rule__Association__Group_6_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6_0__1"


    // $ANTLR start "rule__Association__Group_6_0__1__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2376:1: rule__Association__Group_6_0__1__Impl : ( ( rule__Association__LowerBoundAssignment_6_0_1 ) ) ;
    public final void rule__Association__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2380:1: ( ( ( rule__Association__LowerBoundAssignment_6_0_1 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2381:1: ( ( rule__Association__LowerBoundAssignment_6_0_1 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2381:1: ( ( rule__Association__LowerBoundAssignment_6_0_1 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2382:1: ( rule__Association__LowerBoundAssignment_6_0_1 )
            {
             before(grammarAccess.getAssociationAccess().getLowerBoundAssignment_6_0_1()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2383:1: ( rule__Association__LowerBoundAssignment_6_0_1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2383:2: rule__Association__LowerBoundAssignment_6_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__LowerBoundAssignment_6_0_1_in_rule__Association__Group_6_0__1__Impl4679);
            rule__Association__LowerBoundAssignment_6_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getLowerBoundAssignment_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6_0__1__Impl"


    // $ANTLR start "rule__Association__Group_6_2__0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2397:1: rule__Association__Group_6_2__0 : rule__Association__Group_6_2__0__Impl rule__Association__Group_6_2__1 ;
    public final void rule__Association__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2401:1: ( rule__Association__Group_6_2__0__Impl rule__Association__Group_6_2__1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2402:2: rule__Association__Group_6_2__0__Impl rule__Association__Group_6_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group_6_2__0__Impl_in_rule__Association__Group_6_2__04713);
            rule__Association__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Association__Group_6_2__1_in_rule__Association__Group_6_2__04716);
            rule__Association__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6_2__0"


    // $ANTLR start "rule__Association__Group_6_2__0__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2409:1: rule__Association__Group_6_2__0__Impl : ( 'upperBound' ) ;
    public final void rule__Association__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2413:1: ( ( 'upperBound' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2414:1: ( 'upperBound' )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2414:1: ( 'upperBound' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2415:1: 'upperBound'
            {
             before(grammarAccess.getAssociationAccess().getUpperBoundKeyword_6_2_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Association__Group_6_2__0__Impl4744); 
             after(grammarAccess.getAssociationAccess().getUpperBoundKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6_2__0__Impl"


    // $ANTLR start "rule__Association__Group_6_2__1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2428:1: rule__Association__Group_6_2__1 : rule__Association__Group_6_2__1__Impl ;
    public final void rule__Association__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2432:1: ( rule__Association__Group_6_2__1__Impl )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2433:2: rule__Association__Group_6_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group_6_2__1__Impl_in_rule__Association__Group_6_2__14775);
            rule__Association__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6_2__1"


    // $ANTLR start "rule__Association__Group_6_2__1__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2439:1: rule__Association__Group_6_2__1__Impl : ( ( rule__Association__UpperBoundAssignment_6_2_1 ) ) ;
    public final void rule__Association__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2443:1: ( ( ( rule__Association__UpperBoundAssignment_6_2_1 ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2444:1: ( ( rule__Association__UpperBoundAssignment_6_2_1 ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2444:1: ( ( rule__Association__UpperBoundAssignment_6_2_1 ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2445:1: ( rule__Association__UpperBoundAssignment_6_2_1 )
            {
             before(grammarAccess.getAssociationAccess().getUpperBoundAssignment_6_2_1()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2446:1: ( rule__Association__UpperBoundAssignment_6_2_1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2446:2: rule__Association__UpperBoundAssignment_6_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__UpperBoundAssignment_6_2_1_in_rule__Association__Group_6_2__1__Impl4802);
            rule__Association__UpperBoundAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getUpperBoundAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6_2__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2460:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2464:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2465:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__04836);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__04839);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2472:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2476:1: ( ( ( '-' )? ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2477:1: ( ( '-' )? )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2477:1: ( ( '-' )? )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2478:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2479:1: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2480:2: '-'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__EInt__Group__0__Impl4868); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2491:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2495:1: ( rule__EInt__Group__1__Impl )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2496:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__14901);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2502:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2506:1: ( ( RULE_INT ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2507:1: ( RULE_INT )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2507:1: ( RULE_INT )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2508:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl4928); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Entities__ImportsAssignment_1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2524:1: rule__Entities__ImportsAssignment_1 : ( ruleimports ) ;
    public final void rule__Entities__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2528:1: ( ( ruleimports ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2529:1: ( ruleimports )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2529:1: ( ruleimports )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2530:1: ruleimports
            {
             before(grammarAccess.getEntitiesAccess().getImportsImportsParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleimports_in_rule__Entities__ImportsAssignment_14966);
            ruleimports();

            state._fsp--;

             after(grammarAccess.getEntitiesAccess().getImportsImportsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__ImportsAssignment_1"


    // $ANTLR start "rule__Entities__EntitiesAssignment_2"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2539:1: rule__Entities__EntitiesAssignment_2 : ( ruleEntity ) ;
    public final void rule__Entities__EntitiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2543:1: ( ( ruleEntity ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2544:1: ( ruleEntity )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2544:1: ( ruleEntity )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2545:1: ruleEntity
            {
             before(grammarAccess.getEntitiesAccess().getEntitiesEntityParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rule__Entities__EntitiesAssignment_24997);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntitiesAccess().getEntitiesEntityParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__EntitiesAssignment_2"


    // $ANTLR start "rule__Imports__ImportURIAssignment_1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2554:1: rule__Imports__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Imports__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2558:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2559:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2559:1: ( RULE_STRING )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2560:1: RULE_STRING
            {
             before(grammarAccess.getImportsAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Imports__ImportURIAssignment_15028); 
             after(grammarAccess.getImportsAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__ImportURIAssignment_1"


    // $ANTLR start "rule__Annotation__AnnotationTypeAssignment_1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2569:1: rule__Annotation__AnnotationTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Annotation__AnnotationTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2573:1: ( ( ( RULE_ID ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2574:1: ( ( RULE_ID ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2574:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2575:1: ( RULE_ID )
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationTypeAnnotationTypeCrossReference_1_0()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2576:1: ( RULE_ID )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2577:1: RULE_ID
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationTypeAnnotationTypeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Annotation__AnnotationTypeAssignment_15063); 
             after(grammarAccess.getAnnotationAccess().getAnnotationTypeAnnotationTypeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAnnotationAccess().getAnnotationTypeAnnotationTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__AnnotationTypeAssignment_1"


    // $ANTLR start "rule__Annotation__AttributesAssignment_3_0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2588:1: rule__Annotation__AttributesAssignment_3_0 : ( ruleAnnotationAttribute ) ;
    public final void rule__Annotation__AttributesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2592:1: ( ( ruleAnnotationAttribute ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2593:1: ( ruleAnnotationAttribute )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2593:1: ( ruleAnnotationAttribute )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2594:1: ruleAnnotationAttribute
            {
             before(grammarAccess.getAnnotationAccess().getAttributesAnnotationAttributeParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttribute_in_rule__Annotation__AttributesAssignment_3_05098);
            ruleAnnotationAttribute();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getAttributesAnnotationAttributeParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__AttributesAssignment_3_0"


    // $ANTLR start "rule__Annotation__AttributesAssignment_3_1_1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2603:1: rule__Annotation__AttributesAssignment_3_1_1 : ( ruleAnnotationAttribute ) ;
    public final void rule__Annotation__AttributesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2607:1: ( ( ruleAnnotationAttribute ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2608:1: ( ruleAnnotationAttribute )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2608:1: ( ruleAnnotationAttribute )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2609:1: ruleAnnotationAttribute
            {
             before(grammarAccess.getAnnotationAccess().getAttributesAnnotationAttributeParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttribute_in_rule__Annotation__AttributesAssignment_3_1_15129);
            ruleAnnotationAttribute();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getAttributesAnnotationAttributeParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__AttributesAssignment_3_1_1"


    // $ANTLR start "rule__Entity__AnnotationsAssignment_1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2618:1: rule__Entity__AnnotationsAssignment_1 : ( ruleAnnotation ) ;
    public final void rule__Entity__AnnotationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2622:1: ( ( ruleAnnotation ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2623:1: ( ruleAnnotation )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2623:1: ( ruleAnnotation )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2624:1: ruleAnnotation
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__Entity__AnnotationsAssignment_15160);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AnnotationsAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_3"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2633:1: rule__Entity__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2637:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2638:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2638:1: ( RULE_ID )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2639:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_35191); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_3"


    // $ANTLR start "rule__Entity__ExtendsAssignment_4_2"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2648:1: rule__Entity__ExtendsAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__ExtendsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2652:1: ( ( ( RULE_ID ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2653:1: ( ( RULE_ID ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2653:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2654:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_4_2_0()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2655:1: ( RULE_ID )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2656:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getExtendsEntityIDTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Entity__ExtendsAssignment_4_25226); 
             after(grammarAccess.getEntityAccess().getExtendsEntityIDTerminalRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__ExtendsAssignment_4_2"


    // $ANTLR start "rule__Entity__ExtendsAssignment_4_3_1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2667:1: rule__Entity__ExtendsAssignment_4_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__ExtendsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2671:1: ( ( ( RULE_ID ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2672:1: ( ( RULE_ID ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2672:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2673:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_4_3_1_0()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2674:1: ( RULE_ID )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2675:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getExtendsEntityIDTerminalRuleCall_4_3_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Entity__ExtendsAssignment_4_3_15265); 
             after(grammarAccess.getEntityAccess().getExtendsEntityIDTerminalRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__ExtendsAssignment_4_3_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_6_0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2686:1: rule__Entity__AttributesAssignment_6_0 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2690:1: ( ( ruleAttribute ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2691:1: ( ruleAttribute )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2691:1: ( ruleAttribute )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2692:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_6_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_6_05300);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_6_0"


    // $ANTLR start "rule__Entity__AttributesAssignment_6_1_1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2701:1: rule__Entity__AttributesAssignment_6_1_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2705:1: ( ( ruleAttribute ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2706:1: ( ruleAttribute )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2706:1: ( ruleAttribute )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2707:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_6_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_6_1_15331);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_6_1_1"


    // $ANTLR start "rule__Entity__AssociationsAssignment_7_2"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2716:1: rule__Entity__AssociationsAssignment_7_2 : ( ruleAssociation ) ;
    public final void rule__Entity__AssociationsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2720:1: ( ( ruleAssociation ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2721:1: ( ruleAssociation )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2721:1: ( ruleAssociation )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2722:1: ruleAssociation
            {
             before(grammarAccess.getEntityAccess().getAssociationsAssociationParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssociation_in_rule__Entity__AssociationsAssignment_7_25362);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAssociationsAssociationParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AssociationsAssignment_7_2"


    // $ANTLR start "rule__Entity__AssociationsAssignment_7_3_1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2731:1: rule__Entity__AssociationsAssignment_7_3_1 : ( ruleAssociation ) ;
    public final void rule__Entity__AssociationsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2735:1: ( ( ruleAssociation ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2736:1: ( ruleAssociation )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2736:1: ( ruleAssociation )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2737:1: ruleAssociation
            {
             before(grammarAccess.getEntityAccess().getAssociationsAssociationParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssociation_in_rule__Entity__AssociationsAssignment_7_3_15393);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAssociationsAssociationParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AssociationsAssignment_7_3_1"


    // $ANTLR start "rule__AnnotationAttribute__AttributeAssignment_0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2746:1: rule__AnnotationAttribute__AttributeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AnnotationAttribute__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2750:1: ( ( ( RULE_ID ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2751:1: ( ( RULE_ID ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2751:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2752:1: ( RULE_ID )
            {
             before(grammarAccess.getAnnotationAttributeAccess().getAttributeAnnotationTypeAttributeCrossReference_0_0()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2753:1: ( RULE_ID )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2754:1: RULE_ID
            {
             before(grammarAccess.getAnnotationAttributeAccess().getAttributeAnnotationTypeAttributeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AnnotationAttribute__AttributeAssignment_05428); 
             after(grammarAccess.getAnnotationAttributeAccess().getAttributeAnnotationTypeAttributeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAnnotationAttributeAccess().getAttributeAnnotationTypeAttributeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationAttribute__AttributeAssignment_0"


    // $ANTLR start "rule__AnnotationAttribute__ValueAssignment_2"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2765:1: rule__AnnotationAttribute__ValueAssignment_2 : ( ruleAnnotationAttributeValue ) ;
    public final void rule__AnnotationAttribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2769:1: ( ( ruleAnnotationAttributeValue ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2770:1: ( ruleAnnotationAttributeValue )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2770:1: ( ruleAnnotationAttributeValue )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2771:1: ruleAnnotationAttributeValue
            {
             before(grammarAccess.getAnnotationAttributeAccess().getValueAnnotationAttributeValueParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttributeValue_in_rule__AnnotationAttribute__ValueAssignment_25463);
            ruleAnnotationAttributeValue();

            state._fsp--;

             after(grammarAccess.getAnnotationAttributeAccess().getValueAnnotationAttributeValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationAttribute__ValueAssignment_2"


    // $ANTLR start "rule__SimpleValue__ValueAssignment_1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2780:1: rule__SimpleValue__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SimpleValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2784:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2785:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2785:1: ( RULE_STRING )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2786:1: RULE_STRING
            {
             before(grammarAccess.getSimpleValueAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__SimpleValue__ValueAssignment_15494); 
             after(grammarAccess.getSimpleValueAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValue__ValueAssignment_1"


    // $ANTLR start "rule__Attribute__AnnotationsAssignment_1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2795:1: rule__Attribute__AnnotationsAssignment_1 : ( ruleAnnotation ) ;
    public final void rule__Attribute__AnnotationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2799:1: ( ( ruleAnnotation ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2800:1: ( ruleAnnotation )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2800:1: ( ruleAnnotation )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2801:1: ruleAnnotation
            {
             before(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__Attribute__AnnotationsAssignment_15525);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AnnotationsAssignment_1"


    // $ANTLR start "rule__Attribute__NameAssignment_2"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2810:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2814:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2815:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2815:1: ( RULE_ID )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2816:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_25556); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_2"


    // $ANTLR start "rule__Attribute__TypeAssignment_4"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2825:1: rule__Attribute__TypeAssignment_4 : ( RULE_ID ) ;
    public final void rule__Attribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2829:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2830:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2830:1: ( RULE_ID )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2831:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_45587); 
             after(grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_4"


    // $ANTLR start "rule__Association__ContainmentAssignment_0"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2840:1: rule__Association__ContainmentAssignment_0 : ( ( 'containment' ) ) ;
    public final void rule__Association__ContainmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2844:1: ( ( ( 'containment' ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2845:1: ( ( 'containment' ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2845:1: ( ( 'containment' ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2846:1: ( 'containment' )
            {
             before(grammarAccess.getAssociationAccess().getContainmentContainmentKeyword_0_0()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2847:1: ( 'containment' )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2848:1: 'containment'
            {
             before(grammarAccess.getAssociationAccess().getContainmentContainmentKeyword_0_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Association__ContainmentAssignment_05623); 
             after(grammarAccess.getAssociationAccess().getContainmentContainmentKeyword_0_0()); 

            }

             after(grammarAccess.getAssociationAccess().getContainmentContainmentKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__ContainmentAssignment_0"


    // $ANTLR start "rule__Association__AnnotationsAssignment_1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2863:1: rule__Association__AnnotationsAssignment_1 : ( ruleAnnotation ) ;
    public final void rule__Association__AnnotationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2867:1: ( ( ruleAnnotation ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2868:1: ( ruleAnnotation )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2868:1: ( ruleAnnotation )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2869:1: ruleAnnotation
            {
             before(grammarAccess.getAssociationAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__Association__AnnotationsAssignment_15662);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__AnnotationsAssignment_1"


    // $ANTLR start "rule__Association__NameAssignment_3"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2878:1: rule__Association__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Association__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2882:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2883:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2883:1: ( RULE_ID )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2884:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Association__NameAssignment_35693); 
             after(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__NameAssignment_3"


    // $ANTLR start "rule__Association__TargetAssignment_5"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2893:1: rule__Association__TargetAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Association__TargetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2897:1: ( ( ( RULE_ID ) ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2898:1: ( ( RULE_ID ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2898:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2899:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getTargetEntityCrossReference_5_0()); 
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2900:1: ( RULE_ID )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2901:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTargetEntityIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_55728); 
             after(grammarAccess.getAssociationAccess().getTargetEntityIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getTargetEntityCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__TargetAssignment_5"


    // $ANTLR start "rule__Association__LowerBoundAssignment_6_0_1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2912:1: rule__Association__LowerBoundAssignment_6_0_1 : ( ruleEInt ) ;
    public final void rule__Association__LowerBoundAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2916:1: ( ( ruleEInt ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2917:1: ( ruleEInt )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2917:1: ( ruleEInt )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2918:1: ruleEInt
            {
             before(grammarAccess.getAssociationAccess().getLowerBoundEIntParserRuleCall_6_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Association__LowerBoundAssignment_6_0_15763);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getLowerBoundEIntParserRuleCall_6_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__LowerBoundAssignment_6_0_1"


    // $ANTLR start "rule__Association__UpperBoundAssignment_6_2_1"
    // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2927:1: rule__Association__UpperBoundAssignment_6_2_1 : ( ruleEInt ) ;
    public final void rule__Association__UpperBoundAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2931:1: ( ( ruleEInt ) )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2932:1: ( ruleEInt )
            {
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2932:1: ( ruleEInt )
            // ../co.edu.uniandes.csw.dsl.entities.ui/src-gen/co/edu/uniandes/csw/dsl/ui/contentassist/antlr/internal/InternalEntities.g:2933:1: ruleEInt
            {
             before(grammarAccess.getAssociationAccess().getUpperBoundEIntParserRuleCall_6_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Association__UpperBoundAssignment_6_2_15794);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getUpperBoundEIntParserRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__UpperBoundAssignment_6_2_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleEntities_in_entryRuleEntities61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntities68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entities__Group__0_in_ruleEntities94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleimports_in_entryRuleimports121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleimports128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Imports__Group__0_in_ruleimports154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttributeValue_in_entryRuleAnnotationAttributeValue181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationAttributeValue188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleValue_in_ruleAnnotationAttributeValue214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation240 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity300 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntity307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_entryRuleAnnotationAttribute360 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationAttribute367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__0_in_ruleAnnotationAttribute393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue420 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValue427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__0_in_ruleSimpleValue453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute480 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation540 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssociation547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group__0_in_ruleAssociation573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt600 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entities__Group__0__Impl_in_rule__Entities__Group__0667 = new BitSet(new long[]{0x0000000000022800L});
        public static final BitSet FOLLOW_rule__Entities__Group__1_in_rule__Entities__Group__0670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entities__Group__1__Impl_in_rule__Entities__Group__1728 = new BitSet(new long[]{0x0000000000022800L});
        public static final BitSet FOLLOW_rule__Entities__Group__2_in_rule__Entities__Group__1731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entities__ImportsAssignment_1_in_rule__Entities__Group__1__Impl758 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_rule__Entities__Group__2__Impl_in_rule__Entities__Group__2789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entities__EntitiesAssignment_2_in_rule__Entities__Group__2__Impl816 = new BitSet(new long[]{0x0000000000022002L});
        public static final BitSet FOLLOW_rule__Imports__Group__0__Impl_in_rule__Imports__Group__0853 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Imports__Group__1_in_rule__Imports__Group__0856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Imports__Group__0__Impl884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Imports__Group__1__Impl_in_rule__Imports__Group__1915 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Imports__Group__2_in_rule__Imports__Group__1918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Imports__ImportURIAssignment_1_in_rule__Imports__Group__1__Impl945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Imports__Group__2__Impl_in_rule__Imports__Group__2975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Imports__Group__2__Impl1003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__01040 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__01043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Annotation__Group__0__Impl1071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__11102 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__11105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__AnnotationTypeAssignment_1_in_rule__Annotation__Group__1__Impl1132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__21162 = new BitSet(new long[]{0x0000000000008040L});
        public static final BitSet FOLLOW_rule__Annotation__Group__3_in_rule__Annotation__Group__21165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Annotation__Group__2__Impl1193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group__3__Impl_in_rule__Annotation__Group__31224 = new BitSet(new long[]{0x0000000000008040L});
        public static final BitSet FOLLOW_rule__Annotation__Group__4_in_rule__Annotation__Group__31227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group_3__0_in_rule__Annotation__Group__3__Impl1254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group__4__Impl_in_rule__Annotation__Group__41285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Annotation__Group__4__Impl1313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group_3__0__Impl_in_rule__Annotation__Group_3__01354 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Annotation__Group_3__1_in_rule__Annotation__Group_3__01357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__AttributesAssignment_3_0_in_rule__Annotation__Group_3__0__Impl1384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group_3__1__Impl_in_rule__Annotation__Group_3__11414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group_3_1__0_in_rule__Annotation__Group_3__1__Impl1441 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Annotation__Group_3_1__0__Impl_in_rule__Annotation__Group_3_1__01476 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Annotation__Group_3_1__1_in_rule__Annotation__Group_3_1__01479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Annotation__Group_3_1__0__Impl1507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group_3_1__1__Impl_in_rule__Annotation__Group_3_1__11538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__AttributesAssignment_3_1_1_in_rule__Annotation__Group_3_1__1__Impl1565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01599 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11660 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__AnnotationsAssignment_1_in_rule__Entity__Group__1__Impl1690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21721 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Entity__Group__2__Impl1752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31783 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__NameAssignment_3_in_rule__Entity__Group__3__Impl1813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41843 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__0_in_rule__Entity__Group__4__Impl1873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51904 = new BitSet(new long[]{0x0000000000282040L});
        public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Entity__Group__5__Impl1935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61966 = new BitSet(new long[]{0x0000000000282040L});
        public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__61969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__0_in_rule__Entity__Group__6__Impl1996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__72027 = new BitSet(new long[]{0x0000000000282040L});
        public static final BitSet FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__72030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_7__0_in_rule__Entity__Group__7__Impl2057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__82088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Entity__Group__8__Impl2116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__0__Impl_in_rule__Entity__Group_4__02165 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__1_in_rule__Entity__Group_4__02168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Entity__Group_4__0__Impl2196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__1__Impl_in_rule__Entity__Group_4__12227 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__2_in_rule__Entity__Group_4__12230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Entity__Group_4__1__Impl2258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__2__Impl_in_rule__Entity__Group_4__22289 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__3_in_rule__Entity__Group_4__22292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__ExtendsAssignment_4_2_in_rule__Entity__Group_4__2__Impl2319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__3__Impl_in_rule__Entity__Group_4__32349 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__4_in_rule__Entity__Group_4__32352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_4_3__0_in_rule__Entity__Group_4__3__Impl2379 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__4__Impl_in_rule__Entity__Group_4__42410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Entity__Group_4__4__Impl2438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_4_3__0__Impl_in_rule__Entity__Group_4_3__02479 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Entity__Group_4_3__1_in_rule__Entity__Group_4_3__02482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Entity__Group_4_3__0__Impl2510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_4_3__1__Impl_in_rule__Entity__Group_4_3__12541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__ExtendsAssignment_4_3_1_in_rule__Entity__Group_4_3__1__Impl2568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__0__Impl_in_rule__Entity__Group_6__02602 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__1_in_rule__Entity__Group_6__02605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_6_0_in_rule__Entity__Group_6__0__Impl2632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__1__Impl_in_rule__Entity__Group_6__12662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_6_1__0_in_rule__Entity__Group_6__1__Impl2689 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Entity__Group_6_1__0__Impl_in_rule__Entity__Group_6_1__02724 = new BitSet(new long[]{0x0000000000002040L});
        public static final BitSet FOLLOW_rule__Entity__Group_6_1__1_in_rule__Entity__Group_6_1__02727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Entity__Group_6_1__0__Impl2755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_6_1__1__Impl_in_rule__Entity__Group_6_1__12786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_6_1_1_in_rule__Entity__Group_6_1__1__Impl2813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_7__0__Impl_in_rule__Entity__Group_7__02847 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Entity__Group_7__1_in_rule__Entity__Group_7__02850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Entity__Group_7__0__Impl2878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_7__1__Impl_in_rule__Entity__Group_7__12909 = new BitSet(new long[]{0x0000000011002000L});
        public static final BitSet FOLLOW_rule__Entity__Group_7__2_in_rule__Entity__Group_7__12912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Entity__Group_7__1__Impl2940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_7__2__Impl_in_rule__Entity__Group_7__22971 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_rule__Entity__Group_7__3_in_rule__Entity__Group_7__22974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__AssociationsAssignment_7_2_in_rule__Entity__Group_7__2__Impl3001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_7__3__Impl_in_rule__Entity__Group_7__33031 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_rule__Entity__Group_7__4_in_rule__Entity__Group_7__33034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_7_3__0_in_rule__Entity__Group_7__3__Impl3061 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Entity__Group_7__4__Impl_in_rule__Entity__Group_7__43092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Entity__Group_7__4__Impl3120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_7_3__0__Impl_in_rule__Entity__Group_7_3__03161 = new BitSet(new long[]{0x0000000011002000L});
        public static final BitSet FOLLOW_rule__Entity__Group_7_3__1_in_rule__Entity__Group_7_3__03164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Entity__Group_7_3__0__Impl3192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_7_3__1__Impl_in_rule__Entity__Group_7_3__13223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__AssociationsAssignment_7_3_1_in_rule__Entity__Group_7_3__1__Impl3250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__0__Impl_in_rule__AnnotationAttribute__Group__03284 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__1_in_rule__AnnotationAttribute__Group__03287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__AttributeAssignment_0_in_rule__AnnotationAttribute__Group__0__Impl3314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__1__Impl_in_rule__AnnotationAttribute__Group__13344 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__2_in_rule__AnnotationAttribute__Group__13347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__AnnotationAttribute__Group__1__Impl3375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__Group__2__Impl_in_rule__AnnotationAttribute__Group__23406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnnotationAttribute__ValueAssignment_2_in_rule__AnnotationAttribute__Group__2__Impl3433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__0__Impl_in_rule__SimpleValue__Group__03470 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__1_in_rule__SimpleValue__Group__03473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__Group__1__Impl_in_rule__SimpleValue__Group__13531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleValue__ValueAssignment_1_in_rule__SimpleValue__Group__1__Impl3558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__03592 = new BitSet(new long[]{0x0000000000002040L});
        public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__03595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__13653 = new BitSet(new long[]{0x0000000000002040L});
        public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__13656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__AnnotationsAssignment_1_in_rule__Attribute__Group__1__Impl3683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__23714 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__23717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl3744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__33774 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__33777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Attribute__Group__3__Impl3805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__43836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_4_in_rule__Attribute__Group__4__Impl3863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__03903 = new BitSet(new long[]{0x0000000011002000L});
        public static final BitSet FOLLOW_rule__Association__Group__1_in_rule__Association__Group__03906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__ContainmentAssignment_0_in_rule__Association__Group__0__Impl3933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__13964 = new BitSet(new long[]{0x0000000011002000L});
        public static final BitSet FOLLOW_rule__Association__Group__2_in_rule__Association__Group__13967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__AnnotationsAssignment_1_in_rule__Association__Group__1__Impl3994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__24025 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Association__Group__3_in_rule__Association__Group__24028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Association__Group__2__Impl4056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group__3__Impl_in_rule__Association__Group__34087 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Association__Group__4_in_rule__Association__Group__34090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__NameAssignment_3_in_rule__Association__Group__3__Impl4117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group__4__Impl_in_rule__Association__Group__44147 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Association__Group__5_in_rule__Association__Group__44150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Association__Group__4__Impl4178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group__5__Impl_in_rule__Association__Group__54209 = new BitSet(new long[]{0x0000000002001000L});
        public static final BitSet FOLLOW_rule__Association__Group__6_in_rule__Association__Group__54212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__TargetAssignment_5_in_rule__Association__Group__5__Impl4239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group__6__Impl_in_rule__Association__Group__64269 = new BitSet(new long[]{0x0000000002001000L});
        public static final BitSet FOLLOW_rule__Association__Group__7_in_rule__Association__Group__64272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group_6__0_in_rule__Association__Group__6__Impl4299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group__7__Impl_in_rule__Association__Group__74330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Association__Group__7__Impl4358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group_6__0__Impl_in_rule__Association__Group_6__04405 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Association__Group_6__1_in_rule__Association__Group_6__04408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group_6_0__0_in_rule__Association__Group_6__0__Impl4435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group_6__1__Impl_in_rule__Association__Group_6__14465 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Association__Group_6__2_in_rule__Association__Group_6__14468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Association__Group_6__1__Impl4496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group_6__2__Impl_in_rule__Association__Group_6__24527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group_6_2__0_in_rule__Association__Group_6__2__Impl4554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group_6_0__0__Impl_in_rule__Association__Group_6_0__04590 = new BitSet(new long[]{0x0000000008000010L});
        public static final BitSet FOLLOW_rule__Association__Group_6_0__1_in_rule__Association__Group_6_0__04593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Association__Group_6_0__0__Impl4621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group_6_0__1__Impl_in_rule__Association__Group_6_0__14652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__LowerBoundAssignment_6_0_1_in_rule__Association__Group_6_0__1__Impl4679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group_6_2__0__Impl_in_rule__Association__Group_6_2__04713 = new BitSet(new long[]{0x0000000008000010L});
        public static final BitSet FOLLOW_rule__Association__Group_6_2__1_in_rule__Association__Group_6_2__04716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Association__Group_6_2__0__Impl4744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group_6_2__1__Impl_in_rule__Association__Group_6_2__14775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__UpperBoundAssignment_6_2_1_in_rule__Association__Group_6_2__1__Impl4802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__04836 = new BitSet(new long[]{0x0000000008000010L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__04839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__EInt__Group__0__Impl4868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__14901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl4928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleimports_in_rule__Entities__ImportsAssignment_14966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_rule__Entities__EntitiesAssignment_24997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Imports__ImportURIAssignment_15028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Annotation__AnnotationTypeAssignment_15063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_rule__Annotation__AttributesAssignment_3_05098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_rule__Annotation__AttributesAssignment_3_1_15129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__Entity__AnnotationsAssignment_15160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_35191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__ExtendsAssignment_4_25226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__ExtendsAssignment_4_3_15265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_6_05300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_6_1_15331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssociation_in_rule__Entity__AssociationsAssignment_7_25362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssociation_in_rule__Entity__AssociationsAssignment_7_3_15393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AnnotationAttribute__AttributeAssignment_05428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttributeValue_in_rule__AnnotationAttribute__ValueAssignment_25463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleValue__ValueAssignment_15494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__Attribute__AnnotationsAssignment_15525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_25556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_45587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Association__ContainmentAssignment_05623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__Association__AnnotationsAssignment_15662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Association__NameAssignment_35693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_55728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Association__LowerBoundAssignment_6_0_15763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Association__UpperBoundAssignment_6_2_15794 = new BitSet(new long[]{0x0000000000000002L});
    }


}