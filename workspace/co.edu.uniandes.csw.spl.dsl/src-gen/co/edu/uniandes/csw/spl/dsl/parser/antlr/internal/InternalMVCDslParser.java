package co.edu.uniandes.csw.spl.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.edu.uniandes.csw.spl.dsl.services.MVCDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMVCDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'MVCModel'", "'{'", "'version'", "'annotations'", "','", "'}'", "'models'", "'views'", "'events'", "'controllers'", "'components'", "'Annotation'", "'annotationType'", "'attributes'", "'Model'", "'rootEntity'", "'associations'", "'View'", "'rootComponent'", "'Event'", "'Controller'", "'actions'", "'eventActions'", "'Component'", "'('", "')'", "'AnnotationAttribute'", "'attribute'", "'value'", "'AnnotationTypeAttribute'", "'type'", "'SimpleValue'", "'Entity'", "'extends'", "'containment'", "'Association'", "'lowerBound'", "'upperBound'", "'source'", "'target'", "'Attribute'", "'-'", "'UILayout'", "'orientation'", "'columns'", "'importView'", "'UIInput'", "'UIActions'", "'triggerEvent'", "'UILabel'", "'text'", "'Action'", "'preExecutionEvent'", "'postExecutionEvent'", "'triggerEvents'", "'ControllerView'", "'view'", "'EventAction'", "'action'"
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
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
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


        public InternalMVCDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMVCDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMVCDslParser.tokenNames; }
    public String getGrammarFileName() { return "../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g"; }



     	private MVCDslGrammarAccess grammarAccess;
     	
        public InternalMVCDslParser(TokenStream input, MVCDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MVCModel";	
       	}
       	
       	@Override
       	protected MVCDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMVCModel"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:67:1: entryRuleMVCModel returns [EObject current=null] : iv_ruleMVCModel= ruleMVCModel EOF ;
    public final EObject entryRuleMVCModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMVCModel = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:68:2: (iv_ruleMVCModel= ruleMVCModel EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:69:2: iv_ruleMVCModel= ruleMVCModel EOF
            {
             newCompositeNode(grammarAccess.getMVCModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMVCModel_in_entryRuleMVCModel75);
            iv_ruleMVCModel=ruleMVCModel();

            state._fsp--;

             current =iv_ruleMVCModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMVCModel85); 

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
    // $ANTLR end "entryRuleMVCModel"


    // $ANTLR start "ruleMVCModel"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:76:1: ruleMVCModel returns [EObject current=null] : ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) otherlv_3= 'MVCModel' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'version' ( (lv_version_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'models' otherlv_15= '{' ( (lv_models_16_0= ruleModel ) ) (otherlv_17= ',' ( (lv_models_18_0= ruleModel ) ) )* otherlv_19= '}' )? (otherlv_20= 'views' otherlv_21= '{' ( (lv_views_22_0= ruleView ) ) (otherlv_23= ',' ( (lv_views_24_0= ruleView ) ) )* otherlv_25= '}' )? (otherlv_26= 'events' otherlv_27= '{' ( (lv_events_28_0= ruleEvent ) ) (otherlv_29= ',' ( (lv_events_30_0= ruleEvent ) ) )* otherlv_31= '}' )? (otherlv_32= 'controllers' otherlv_33= '{' ( (lv_controllers_34_0= ruleController ) ) (otherlv_35= ',' ( (lv_controllers_36_0= ruleController ) ) )* otherlv_37= '}' )? otherlv_38= 'components' otherlv_39= '{' ( (lv_components_40_0= ruleComponent ) ) (otherlv_41= ',' ( (lv_components_42_0= ruleComponent ) ) )* otherlv_43= '}' otherlv_44= '}' ) ;
    public final EObject ruleMVCModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
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
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_version_7_0 = null;

        EObject lv_annotations_10_0 = null;

        EObject lv_annotations_12_0 = null;

        EObject lv_models_16_0 = null;

        EObject lv_models_18_0 = null;

        EObject lv_views_22_0 = null;

        EObject lv_views_24_0 = null;

        EObject lv_events_28_0 = null;

        EObject lv_events_30_0 = null;

        EObject lv_controllers_34_0 = null;

        EObject lv_controllers_36_0 = null;

        EObject lv_components_40_0 = null;

        EObject lv_components_42_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:79:28: ( ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) otherlv_3= 'MVCModel' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'version' ( (lv_version_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'models' otherlv_15= '{' ( (lv_models_16_0= ruleModel ) ) (otherlv_17= ',' ( (lv_models_18_0= ruleModel ) ) )* otherlv_19= '}' )? (otherlv_20= 'views' otherlv_21= '{' ( (lv_views_22_0= ruleView ) ) (otherlv_23= ',' ( (lv_views_24_0= ruleView ) ) )* otherlv_25= '}' )? (otherlv_26= 'events' otherlv_27= '{' ( (lv_events_28_0= ruleEvent ) ) (otherlv_29= ',' ( (lv_events_30_0= ruleEvent ) ) )* otherlv_31= '}' )? (otherlv_32= 'controllers' otherlv_33= '{' ( (lv_controllers_34_0= ruleController ) ) (otherlv_35= ',' ( (lv_controllers_36_0= ruleController ) ) )* otherlv_37= '}' )? otherlv_38= 'components' otherlv_39= '{' ( (lv_components_40_0= ruleComponent ) ) (otherlv_41= ',' ( (lv_components_42_0= ruleComponent ) ) )* otherlv_43= '}' otherlv_44= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:80:1: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) otherlv_3= 'MVCModel' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'version' ( (lv_version_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'models' otherlv_15= '{' ( (lv_models_16_0= ruleModel ) ) (otherlv_17= ',' ( (lv_models_18_0= ruleModel ) ) )* otherlv_19= '}' )? (otherlv_20= 'views' otherlv_21= '{' ( (lv_views_22_0= ruleView ) ) (otherlv_23= ',' ( (lv_views_24_0= ruleView ) ) )* otherlv_25= '}' )? (otherlv_26= 'events' otherlv_27= '{' ( (lv_events_28_0= ruleEvent ) ) (otherlv_29= ',' ( (lv_events_30_0= ruleEvent ) ) )* otherlv_31= '}' )? (otherlv_32= 'controllers' otherlv_33= '{' ( (lv_controllers_34_0= ruleController ) ) (otherlv_35= ',' ( (lv_controllers_36_0= ruleController ) ) )* otherlv_37= '}' )? otherlv_38= 'components' otherlv_39= '{' ( (lv_components_40_0= ruleComponent ) ) (otherlv_41= ',' ( (lv_components_42_0= ruleComponent ) ) )* otherlv_43= '}' otherlv_44= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:80:1: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) otherlv_3= 'MVCModel' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'version' ( (lv_version_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'models' otherlv_15= '{' ( (lv_models_16_0= ruleModel ) ) (otherlv_17= ',' ( (lv_models_18_0= ruleModel ) ) )* otherlv_19= '}' )? (otherlv_20= 'views' otherlv_21= '{' ( (lv_views_22_0= ruleView ) ) (otherlv_23= ',' ( (lv_views_24_0= ruleView ) ) )* otherlv_25= '}' )? (otherlv_26= 'events' otherlv_27= '{' ( (lv_events_28_0= ruleEvent ) ) (otherlv_29= ',' ( (lv_events_30_0= ruleEvent ) ) )* otherlv_31= '}' )? (otherlv_32= 'controllers' otherlv_33= '{' ( (lv_controllers_34_0= ruleController ) ) (otherlv_35= ',' ( (lv_controllers_36_0= ruleController ) ) )* otherlv_37= '}' )? otherlv_38= 'components' otherlv_39= '{' ( (lv_components_40_0= ruleComponent ) ) (otherlv_41= ',' ( (lv_components_42_0= ruleComponent ) ) )* otherlv_43= '}' otherlv_44= '}' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:80:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) otherlv_3= 'MVCModel' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'version' ( (lv_version_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'models' otherlv_15= '{' ( (lv_models_16_0= ruleModel ) ) (otherlv_17= ',' ( (lv_models_18_0= ruleModel ) ) )* otherlv_19= '}' )? (otherlv_20= 'views' otherlv_21= '{' ( (lv_views_22_0= ruleView ) ) (otherlv_23= ',' ( (lv_views_24_0= ruleView ) ) )* otherlv_25= '}' )? (otherlv_26= 'events' otherlv_27= '{' ( (lv_events_28_0= ruleEvent ) ) (otherlv_29= ',' ( (lv_events_30_0= ruleEvent ) ) )* otherlv_31= '}' )? (otherlv_32= 'controllers' otherlv_33= '{' ( (lv_controllers_34_0= ruleController ) ) (otherlv_35= ',' ( (lv_controllers_36_0= ruleController ) ) )* otherlv_37= '}' )? otherlv_38= 'components' otherlv_39= '{' ( (lv_components_40_0= ruleComponent ) ) (otherlv_41= ',' ( (lv_components_42_0= ruleComponent ) ) )* otherlv_43= '}' otherlv_44= '}'
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:80:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:80:4: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMVCModel123); 

                	newLeafNode(otherlv_0, grammarAccess.getMVCModelAccess().getImportKeyword_0_0());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:84:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:85:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:85:1: (lv_importURI_1_0= RULE_STRING )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:86:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleMVCModel140); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getMVCModelAccess().getImportURISTRINGTerminalRuleCall_0_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMVCModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMVCModel157); 

                	newLeafNode(otherlv_2, grammarAccess.getMVCModelAccess().getSemicolonKeyword_0_2());
                

            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMVCModel170); 

                	newLeafNode(otherlv_3, grammarAccess.getMVCModelAccess().getMVCModelKeyword_1());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:110:1: ( (lv_name_4_0= ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:111:1: (lv_name_4_0= ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:111:1: (lv_name_4_0= ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:112:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMVCModelAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMVCModel191);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMVCModelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMVCModel203); 

                	newLeafNode(otherlv_5, grammarAccess.getMVCModelAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:132:1: (otherlv_6= 'version' ( (lv_version_7_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:132:3: otherlv_6= 'version' ( (lv_version_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMVCModel216); 

                        	newLeafNode(otherlv_6, grammarAccess.getMVCModelAccess().getVersionKeyword_4_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:136:1: ( (lv_version_7_0= ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:137:1: (lv_version_7_0= ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:137:1: (lv_version_7_0= ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:138:3: lv_version_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMVCModelAccess().getVersionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMVCModel237);
                    lv_version_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMVCModelRule());
                    	        }
                           		set(
                           			current, 
                           			"version",
                            		lv_version_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:154:4: (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:154:6: otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMVCModel252); 

                        	newLeafNode(otherlv_8, grammarAccess.getMVCModelAccess().getAnnotationsKeyword_5_0());
                        
                    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMVCModel264); 

                        	newLeafNode(otherlv_9, grammarAccess.getMVCModelAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:162:1: ( (lv_annotations_10_0= ruleAnnotation ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:163:1: (lv_annotations_10_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:163:1: (lv_annotations_10_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:164:3: lv_annotations_10_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getMVCModelAccess().getAnnotationsAnnotationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleMVCModel285);
                    lv_annotations_10_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMVCModelRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_10_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:180:2: (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==17) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:180:4: otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMVCModel298); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getMVCModelAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:184:1: ( (lv_annotations_12_0= ruleAnnotation ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:185:1: (lv_annotations_12_0= ruleAnnotation )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:185:1: (lv_annotations_12_0= ruleAnnotation )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:186:3: lv_annotations_12_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMVCModelAccess().getAnnotationsAnnotationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleMVCModel319);
                    	    lv_annotations_12_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMVCModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_12_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMVCModel333); 

                        	newLeafNode(otherlv_13, grammarAccess.getMVCModelAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:206:3: (otherlv_14= 'models' otherlv_15= '{' ( (lv_models_16_0= ruleModel ) ) (otherlv_17= ',' ( (lv_models_18_0= ruleModel ) ) )* otherlv_19= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:206:5: otherlv_14= 'models' otherlv_15= '{' ( (lv_models_16_0= ruleModel ) ) (otherlv_17= ',' ( (lv_models_18_0= ruleModel ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMVCModel348); 

                        	newLeafNode(otherlv_14, grammarAccess.getMVCModelAccess().getModelsKeyword_6_0());
                        
                    otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMVCModel360); 

                        	newLeafNode(otherlv_15, grammarAccess.getMVCModelAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:214:1: ( (lv_models_16_0= ruleModel ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:215:1: (lv_models_16_0= ruleModel )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:215:1: (lv_models_16_0= ruleModel )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:216:3: lv_models_16_0= ruleModel
                    {
                     
                    	        newCompositeNode(grammarAccess.getMVCModelAccess().getModelsModelParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleModel_in_ruleMVCModel381);
                    lv_models_16_0=ruleModel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMVCModelRule());
                    	        }
                           		add(
                           			current, 
                           			"models",
                            		lv_models_16_0, 
                            		"Model");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:232:2: (otherlv_17= ',' ( (lv_models_18_0= ruleModel ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:232:4: otherlv_17= ',' ( (lv_models_18_0= ruleModel ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMVCModel394); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getMVCModelAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:236:1: ( (lv_models_18_0= ruleModel ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:237:1: (lv_models_18_0= ruleModel )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:237:1: (lv_models_18_0= ruleModel )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:238:3: lv_models_18_0= ruleModel
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMVCModelAccess().getModelsModelParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleModel_in_ruleMVCModel415);
                    	    lv_models_18_0=ruleModel();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMVCModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"models",
                    	            		lv_models_18_0, 
                    	            		"Model");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMVCModel429); 

                        	newLeafNode(otherlv_19, grammarAccess.getMVCModelAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:258:3: (otherlv_20= 'views' otherlv_21= '{' ( (lv_views_22_0= ruleView ) ) (otherlv_23= ',' ( (lv_views_24_0= ruleView ) ) )* otherlv_25= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:258:5: otherlv_20= 'views' otherlv_21= '{' ( (lv_views_22_0= ruleView ) ) (otherlv_23= ',' ( (lv_views_24_0= ruleView ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMVCModel444); 

                        	newLeafNode(otherlv_20, grammarAccess.getMVCModelAccess().getViewsKeyword_7_0());
                        
                    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMVCModel456); 

                        	newLeafNode(otherlv_21, grammarAccess.getMVCModelAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:266:1: ( (lv_views_22_0= ruleView ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:267:1: (lv_views_22_0= ruleView )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:267:1: (lv_views_22_0= ruleView )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:268:3: lv_views_22_0= ruleView
                    {
                     
                    	        newCompositeNode(grammarAccess.getMVCModelAccess().getViewsViewParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleView_in_ruleMVCModel477);
                    lv_views_22_0=ruleView();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMVCModelRule());
                    	        }
                           		add(
                           			current, 
                           			"views",
                            		lv_views_22_0, 
                            		"View");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:284:2: (otherlv_23= ',' ( (lv_views_24_0= ruleView ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:284:4: otherlv_23= ',' ( (lv_views_24_0= ruleView ) )
                    	    {
                    	    otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMVCModel490); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getMVCModelAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:288:1: ( (lv_views_24_0= ruleView ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:289:1: (lv_views_24_0= ruleView )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:289:1: (lv_views_24_0= ruleView )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:290:3: lv_views_24_0= ruleView
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMVCModelAccess().getViewsViewParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleView_in_ruleMVCModel511);
                    	    lv_views_24_0=ruleView();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMVCModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"views",
                    	            		lv_views_24_0, 
                    	            		"View");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMVCModel525); 

                        	newLeafNode(otherlv_25, grammarAccess.getMVCModelAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:310:3: (otherlv_26= 'events' otherlv_27= '{' ( (lv_events_28_0= ruleEvent ) ) (otherlv_29= ',' ( (lv_events_30_0= ruleEvent ) ) )* otherlv_31= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:310:5: otherlv_26= 'events' otherlv_27= '{' ( (lv_events_28_0= ruleEvent ) ) (otherlv_29= ',' ( (lv_events_30_0= ruleEvent ) ) )* otherlv_31= '}'
                    {
                    otherlv_26=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMVCModel540); 

                        	newLeafNode(otherlv_26, grammarAccess.getMVCModelAccess().getEventsKeyword_8_0());
                        
                    otherlv_27=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMVCModel552); 

                        	newLeafNode(otherlv_27, grammarAccess.getMVCModelAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:318:1: ( (lv_events_28_0= ruleEvent ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:319:1: (lv_events_28_0= ruleEvent )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:319:1: (lv_events_28_0= ruleEvent )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:320:3: lv_events_28_0= ruleEvent
                    {
                     
                    	        newCompositeNode(grammarAccess.getMVCModelAccess().getEventsEventParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEvent_in_ruleMVCModel573);
                    lv_events_28_0=ruleEvent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMVCModelRule());
                    	        }
                           		add(
                           			current, 
                           			"events",
                            		lv_events_28_0, 
                            		"Event");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:336:2: (otherlv_29= ',' ( (lv_events_30_0= ruleEvent ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==17) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:336:4: otherlv_29= ',' ( (lv_events_30_0= ruleEvent ) )
                    	    {
                    	    otherlv_29=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMVCModel586); 

                    	        	newLeafNode(otherlv_29, grammarAccess.getMVCModelAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:340:1: ( (lv_events_30_0= ruleEvent ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:341:1: (lv_events_30_0= ruleEvent )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:341:1: (lv_events_30_0= ruleEvent )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:342:3: lv_events_30_0= ruleEvent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMVCModelAccess().getEventsEventParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEvent_in_ruleMVCModel607);
                    	    lv_events_30_0=ruleEvent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMVCModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"events",
                    	            		lv_events_30_0, 
                    	            		"Event");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMVCModel621); 

                        	newLeafNode(otherlv_31, grammarAccess.getMVCModelAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:362:3: (otherlv_32= 'controllers' otherlv_33= '{' ( (lv_controllers_34_0= ruleController ) ) (otherlv_35= ',' ( (lv_controllers_36_0= ruleController ) ) )* otherlv_37= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:362:5: otherlv_32= 'controllers' otherlv_33= '{' ( (lv_controllers_34_0= ruleController ) ) (otherlv_35= ',' ( (lv_controllers_36_0= ruleController ) ) )* otherlv_37= '}'
                    {
                    otherlv_32=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMVCModel636); 

                        	newLeafNode(otherlv_32, grammarAccess.getMVCModelAccess().getControllersKeyword_9_0());
                        
                    otherlv_33=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMVCModel648); 

                        	newLeafNode(otherlv_33, grammarAccess.getMVCModelAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:370:1: ( (lv_controllers_34_0= ruleController ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:371:1: (lv_controllers_34_0= ruleController )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:371:1: (lv_controllers_34_0= ruleController )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:372:3: lv_controllers_34_0= ruleController
                    {
                     
                    	        newCompositeNode(grammarAccess.getMVCModelAccess().getControllersControllerParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleController_in_ruleMVCModel669);
                    lv_controllers_34_0=ruleController();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMVCModelRule());
                    	        }
                           		add(
                           			current, 
                           			"controllers",
                            		lv_controllers_34_0, 
                            		"Controller");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:388:2: (otherlv_35= ',' ( (lv_controllers_36_0= ruleController ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==17) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:388:4: otherlv_35= ',' ( (lv_controllers_36_0= ruleController ) )
                    	    {
                    	    otherlv_35=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMVCModel682); 

                    	        	newLeafNode(otherlv_35, grammarAccess.getMVCModelAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:392:1: ( (lv_controllers_36_0= ruleController ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:393:1: (lv_controllers_36_0= ruleController )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:393:1: (lv_controllers_36_0= ruleController )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:394:3: lv_controllers_36_0= ruleController
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMVCModelAccess().getControllersControllerParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleController_in_ruleMVCModel703);
                    	    lv_controllers_36_0=ruleController();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMVCModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"controllers",
                    	            		lv_controllers_36_0, 
                    	            		"Controller");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_37=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMVCModel717); 

                        	newLeafNode(otherlv_37, grammarAccess.getMVCModelAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_38=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMVCModel731); 

                	newLeafNode(otherlv_38, grammarAccess.getMVCModelAccess().getComponentsKeyword_10());
                
            otherlv_39=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMVCModel743); 

                	newLeafNode(otherlv_39, grammarAccess.getMVCModelAccess().getLeftCurlyBracketKeyword_11());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:422:1: ( (lv_components_40_0= ruleComponent ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:423:1: (lv_components_40_0= ruleComponent )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:423:1: (lv_components_40_0= ruleComponent )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:424:3: lv_components_40_0= ruleComponent
            {
             
            	        newCompositeNode(grammarAccess.getMVCModelAccess().getComponentsComponentParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleComponent_in_ruleMVCModel764);
            lv_components_40_0=ruleComponent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMVCModelRule());
            	        }
                   		add(
                   			current, 
                   			"components",
                    		lv_components_40_0, 
                    		"Component");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:440:2: (otherlv_41= ',' ( (lv_components_42_0= ruleComponent ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:440:4: otherlv_41= ',' ( (lv_components_42_0= ruleComponent ) )
            	    {
            	    otherlv_41=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMVCModel777); 

            	        	newLeafNode(otherlv_41, grammarAccess.getMVCModelAccess().getCommaKeyword_13_0());
            	        
            	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:444:1: ( (lv_components_42_0= ruleComponent ) )
            	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:445:1: (lv_components_42_0= ruleComponent )
            	    {
            	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:445:1: (lv_components_42_0= ruleComponent )
            	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:446:3: lv_components_42_0= ruleComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMVCModelAccess().getComponentsComponentParserRuleCall_13_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComponent_in_ruleMVCModel798);
            	    lv_components_42_0=ruleComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMVCModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_42_0, 
            	            		"Component");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_43=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMVCModel812); 

                	newLeafNode(otherlv_43, grammarAccess.getMVCModelAccess().getRightCurlyBracketKeyword_14());
                
            otherlv_44=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMVCModel824); 

                	newLeafNode(otherlv_44, grammarAccess.getMVCModelAccess().getRightCurlyBracketKeyword_15());
                

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
    // $ANTLR end "ruleMVCModel"


    // $ANTLR start "entryRuleAnnotationAttributeValue"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:478:1: entryRuleAnnotationAttributeValue returns [EObject current=null] : iv_ruleAnnotationAttributeValue= ruleAnnotationAttributeValue EOF ;
    public final EObject entryRuleAnnotationAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationAttributeValue = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:479:2: (iv_ruleAnnotationAttributeValue= ruleAnnotationAttributeValue EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:480:2: iv_ruleAnnotationAttributeValue= ruleAnnotationAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAnnotationAttributeValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttributeValue_in_entryRuleAnnotationAttributeValue860);
            iv_ruleAnnotationAttributeValue=ruleAnnotationAttributeValue();

            state._fsp--;

             current =iv_ruleAnnotationAttributeValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationAttributeValue870); 

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
    // $ANTLR end "entryRuleAnnotationAttributeValue"


    // $ANTLR start "ruleAnnotationAttributeValue"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:487:1: ruleAnnotationAttributeValue returns [EObject current=null] : this_SimpleValue_0= ruleSimpleValue ;
    public final EObject ruleAnnotationAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleValue_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:490:28: (this_SimpleValue_0= ruleSimpleValue )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:492:5: this_SimpleValue_0= ruleSimpleValue
            {
             
                    newCompositeNode(grammarAccess.getAnnotationAttributeValueAccess().getSimpleValueParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSimpleValue_in_ruleAnnotationAttributeValue916);
            this_SimpleValue_0=ruleSimpleValue();

            state._fsp--;

             
                    current = this_SimpleValue_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleAnnotationAttributeValue"


    // $ANTLR start "entryRuleUIComponent"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:508:1: entryRuleUIComponent returns [EObject current=null] : iv_ruleUIComponent= ruleUIComponent EOF ;
    public final EObject entryRuleUIComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIComponent = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:509:2: (iv_ruleUIComponent= ruleUIComponent EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:510:2: iv_ruleUIComponent= ruleUIComponent EOF
            {
             newCompositeNode(grammarAccess.getUIComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUIComponent_in_entryRuleUIComponent950);
            iv_ruleUIComponent=ruleUIComponent();

            state._fsp--;

             current =iv_ruleUIComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUIComponent960); 

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
    // $ANTLR end "entryRuleUIComponent"


    // $ANTLR start "ruleUIComponent"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:517:1: ruleUIComponent returns [EObject current=null] : (this_UILayout_0= ruleUILayout | this_UIInput_1= ruleUIInput | this_UIActions_2= ruleUIActions | this_UILabel_3= ruleUILabel ) ;
    public final EObject ruleUIComponent() throws RecognitionException {
        EObject current = null;

        EObject this_UILayout_0 = null;

        EObject this_UIInput_1 = null;

        EObject this_UIActions_2 = null;

        EObject this_UILabel_3 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:520:28: ( (this_UILayout_0= ruleUILayout | this_UIInput_1= ruleUIInput | this_UIActions_2= ruleUIActions | this_UILabel_3= ruleUILabel ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:521:1: (this_UILayout_0= ruleUILayout | this_UIInput_1= ruleUIInput | this_UIActions_2= ruleUIActions | this_UILabel_3= ruleUILabel )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:521:1: (this_UILayout_0= ruleUILayout | this_UIInput_1= ruleUIInput | this_UIActions_2= ruleUIActions | this_UILabel_3= ruleUILabel )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt13=1;
                }
                break;
            case 59:
                {
                alt13=2;
                }
                break;
            case 60:
                {
                alt13=3;
                }
                break;
            case 62:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:522:5: this_UILayout_0= ruleUILayout
                    {
                     
                            newCompositeNode(grammarAccess.getUIComponentAccess().getUILayoutParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUILayout_in_ruleUIComponent1007);
                    this_UILayout_0=ruleUILayout();

                    state._fsp--;

                     
                            current = this_UILayout_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:532:5: this_UIInput_1= ruleUIInput
                    {
                     
                            newCompositeNode(grammarAccess.getUIComponentAccess().getUIInputParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUIInput_in_ruleUIComponent1034);
                    this_UIInput_1=ruleUIInput();

                    state._fsp--;

                     
                            current = this_UIInput_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:542:5: this_UIActions_2= ruleUIActions
                    {
                     
                            newCompositeNode(grammarAccess.getUIComponentAccess().getUIActionsParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUIActions_in_ruleUIComponent1061);
                    this_UIActions_2=ruleUIActions();

                    state._fsp--;

                     
                            current = this_UIActions_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:552:5: this_UILabel_3= ruleUILabel
                    {
                     
                            newCompositeNode(grammarAccess.getUIComponentAccess().getUILabelParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUILabel_in_ruleUIComponent1088);
                    this_UILabel_3=ruleUILabel();

                    state._fsp--;

                     
                            current = this_UILabel_3; 
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
    // $ANTLR end "ruleUIComponent"


    // $ANTLR start "entryRuleAnnotation"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:568:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:569:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:570:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation1123);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation1133); 

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:577:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= 'Annotation' otherlv_1= '{' otherlv_2= 'annotationType' ( ( ruleEString ) ) (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAnnotationAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationAttribute ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_attributes_6_0 = null;

        EObject lv_attributes_8_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:580:28: ( (otherlv_0= 'Annotation' otherlv_1= '{' otherlv_2= 'annotationType' ( ( ruleEString ) ) (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAnnotationAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationAttribute ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:581:1: (otherlv_0= 'Annotation' otherlv_1= '{' otherlv_2= 'annotationType' ( ( ruleEString ) ) (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAnnotationAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationAttribute ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:581:1: (otherlv_0= 'Annotation' otherlv_1= '{' otherlv_2= 'annotationType' ( ( ruleEString ) ) (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAnnotationAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationAttribute ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:581:3: otherlv_0= 'Annotation' otherlv_1= '{' otherlv_2= 'annotationType' ( ( ruleEString ) ) (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAnnotationAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationAttribute ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAnnotation1170); 

                	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getAnnotationKeyword_0());
                
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnnotation1182); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAnnotation1194); 

                	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getAnnotationTypeKeyword_2());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:593:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:594:1: ( ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:594:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:595:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationTypeAnnotationTypeCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation1217);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:608:2: (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAnnotationAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationAttribute ) ) )* otherlv_9= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:608:4: otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAnnotationAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationAttribute ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAnnotation1230); 

                        	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getAttributesKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnnotation1242); 

                        	newLeafNode(otherlv_5, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:616:1: ( (lv_attributes_6_0= ruleAnnotationAttribute ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:617:1: (lv_attributes_6_0= ruleAnnotationAttribute )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:617:1: (lv_attributes_6_0= ruleAnnotationAttribute )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:618:3: lv_attributes_6_0= ruleAnnotationAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getAttributesAnnotationAttributeParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttribute_in_ruleAnnotation1263);
                    lv_attributes_6_0=ruleAnnotationAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_6_0, 
                            		"AnnotationAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:634:2: (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationAttribute ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==17) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:634:4: otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationAttribute ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnnotation1276); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getAnnotationAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:638:1: ( (lv_attributes_8_0= ruleAnnotationAttribute ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:639:1: (lv_attributes_8_0= ruleAnnotationAttribute )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:639:1: (lv_attributes_8_0= ruleAnnotationAttribute )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:640:3: lv_attributes_8_0= ruleAnnotationAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getAttributesAnnotationAttributeParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttribute_in_ruleAnnotation1297);
                    	    lv_attributes_8_0=ruleAnnotationAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_8_0, 
                    	            		"AnnotationAttribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnnotation1311); 

                        	newLeafNode(otherlv_9, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnnotation1325); 

                	newLeafNode(otherlv_10, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleEString"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:672:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:673:2: (iv_ruleEString= ruleEString EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:674:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1362);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1373); 

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
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:681:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:684:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:685:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:685:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:685:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1413); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:693:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1439); 

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


    // $ANTLR start "entryRuleModel"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:708:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:709:2: (iv_ruleModel= ruleModel EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:710:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel1484);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel1494); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:717:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'rootEntity' ( (lv_rootEntity_11_0= ruleEntity ) ) )? (otherlv_12= 'associations' otherlv_13= '{' ( (lv_associations_14_0= ruleAssociation ) ) (otherlv_15= ',' ( (lv_associations_16_0= ruleAssociation ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_annotations_6_0 = null;

        EObject lv_annotations_8_0 = null;

        EObject lv_rootEntity_11_0 = null;

        EObject lv_associations_14_0 = null;

        EObject lv_associations_16_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:720:28: ( ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'rootEntity' ( (lv_rootEntity_11_0= ruleEntity ) ) )? (otherlv_12= 'associations' otherlv_13= '{' ( (lv_associations_14_0= ruleAssociation ) ) (otherlv_15= ',' ( (lv_associations_16_0= ruleAssociation ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:721:1: ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'rootEntity' ( (lv_rootEntity_11_0= ruleEntity ) ) )? (otherlv_12= 'associations' otherlv_13= '{' ( (lv_associations_14_0= ruleAssociation ) ) (otherlv_15= ',' ( (lv_associations_16_0= ruleAssociation ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:721:1: ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'rootEntity' ( (lv_rootEntity_11_0= ruleEntity ) ) )? (otherlv_12= 'associations' otherlv_13= '{' ( (lv_associations_14_0= ruleAssociation ) ) (otherlv_15= ',' ( (lv_associations_16_0= ruleAssociation ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:721:2: () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'rootEntity' ( (lv_rootEntity_11_0= ruleEntity ) ) )? (otherlv_12= 'associations' otherlv_13= '{' ( (lv_associations_14_0= ruleAssociation ) ) (otherlv_15= ',' ( (lv_associations_16_0= ruleAssociation ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:721:2: ()
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:722:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleModel1540); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:731:1: ( (lv_name_2_0= ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:732:1: (lv_name_2_0= ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:732:1: (lv_name_2_0= ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:733:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModel1561);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleModel1573); 

                	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:753:1: (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:753:3: otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleModel1586); 

                        	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getAnnotationsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleModel1598); 

                        	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:761:1: ( (lv_annotations_6_0= ruleAnnotation ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:762:1: (lv_annotations_6_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:762:1: (lv_annotations_6_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:763:3: lv_annotations_6_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getAnnotationsAnnotationParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleModel1619);
                    lv_annotations_6_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_6_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:779:2: (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==17) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:779:4: otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleModel1632); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getModelAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:783:1: ( (lv_annotations_8_0= ruleAnnotation ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:784:1: (lv_annotations_8_0= ruleAnnotation )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:784:1: (lv_annotations_8_0= ruleAnnotation )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:785:3: lv_annotations_8_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getAnnotationsAnnotationParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleModel1653);
                    	    lv_annotations_8_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_8_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleModel1667); 

                        	newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:805:3: (otherlv_10= 'rootEntity' ( (lv_rootEntity_11_0= ruleEntity ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:805:5: otherlv_10= 'rootEntity' ( (lv_rootEntity_11_0= ruleEntity ) )
                    {
                    otherlv_10=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleModel1682); 

                        	newLeafNode(otherlv_10, grammarAccess.getModelAccess().getRootEntityKeyword_5_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:809:1: ( (lv_rootEntity_11_0= ruleEntity ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:810:1: (lv_rootEntity_11_0= ruleEntity )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:810:1: (lv_rootEntity_11_0= ruleEntity )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:811:3: lv_rootEntity_11_0= ruleEntity
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getRootEntityEntityParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEntity_in_ruleModel1703);
                    lv_rootEntity_11_0=ruleEntity();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"rootEntity",
                            		lv_rootEntity_11_0, 
                            		"Entity");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:827:4: (otherlv_12= 'associations' otherlv_13= '{' ( (lv_associations_14_0= ruleAssociation ) ) (otherlv_15= ',' ( (lv_associations_16_0= ruleAssociation ) ) )* otherlv_17= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:827:6: otherlv_12= 'associations' otherlv_13= '{' ( (lv_associations_14_0= ruleAssociation ) ) (otherlv_15= ',' ( (lv_associations_16_0= ruleAssociation ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleModel1718); 

                        	newLeafNode(otherlv_12, grammarAccess.getModelAccess().getAssociationsKeyword_6_0());
                        
                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleModel1730); 

                        	newLeafNode(otherlv_13, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:835:1: ( (lv_associations_14_0= ruleAssociation ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:836:1: (lv_associations_14_0= ruleAssociation )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:836:1: (lv_associations_14_0= ruleAssociation )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:837:3: lv_associations_14_0= ruleAssociation
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getAssociationsAssociationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAssociation_in_ruleModel1751);
                    lv_associations_14_0=ruleAssociation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"associations",
                            		lv_associations_14_0, 
                            		"Association");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:853:2: (otherlv_15= ',' ( (lv_associations_16_0= ruleAssociation ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==17) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:853:4: otherlv_15= ',' ( (lv_associations_16_0= ruleAssociation ) )
                    	    {
                    	    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleModel1764); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getModelAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:857:1: ( (lv_associations_16_0= ruleAssociation ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:858:1: (lv_associations_16_0= ruleAssociation )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:858:1: (lv_associations_16_0= ruleAssociation )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:859:3: lv_associations_16_0= ruleAssociation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getAssociationsAssociationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAssociation_in_ruleModel1785);
                    	    lv_associations_16_0=ruleAssociation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"associations",
                    	            		lv_associations_16_0, 
                    	            		"Association");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleModel1799); 

                        	newLeafNode(otherlv_17, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleModel1813); 

                	newLeafNode(otherlv_18, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleView"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:891:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:892:2: (iv_ruleView= ruleView EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:893:2: iv_ruleView= ruleView EOF
            {
             newCompositeNode(grammarAccess.getViewRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleView_in_entryRuleView1849);
            iv_ruleView=ruleView();

            state._fsp--;

             current =iv_ruleView; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleView1859); 

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
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:900:1: ruleView returns [EObject current=null] : ( () otherlv_1= 'View' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'rootComponent' ( (lv_rootComponent_11_0= ruleUILayout ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_annotations_6_0 = null;

        EObject lv_annotations_8_0 = null;

        EObject lv_rootComponent_11_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:903:28: ( ( () otherlv_1= 'View' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'rootComponent' ( (lv_rootComponent_11_0= ruleUILayout ) ) )? otherlv_12= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:904:1: ( () otherlv_1= 'View' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'rootComponent' ( (lv_rootComponent_11_0= ruleUILayout ) ) )? otherlv_12= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:904:1: ( () otherlv_1= 'View' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'rootComponent' ( (lv_rootComponent_11_0= ruleUILayout ) ) )? otherlv_12= '}' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:904:2: () otherlv_1= 'View' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'rootComponent' ( (lv_rootComponent_11_0= ruleUILayout ) ) )? otherlv_12= '}'
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:904:2: ()
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:905:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getViewAccess().getViewAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleView1905); 

                	newLeafNode(otherlv_1, grammarAccess.getViewAccess().getViewKeyword_1());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:914:1: ( (lv_name_2_0= ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:915:1: (lv_name_2_0= ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:915:1: (lv_name_2_0= ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:916:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getViewAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleView1926);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getViewRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleView1938); 

                	newLeafNode(otherlv_3, grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:936:1: (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==16) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:936:3: otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleView1951); 

                        	newLeafNode(otherlv_4, grammarAccess.getViewAccess().getAnnotationsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleView1963); 

                        	newLeafNode(otherlv_5, grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:944:1: ( (lv_annotations_6_0= ruleAnnotation ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:945:1: (lv_annotations_6_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:945:1: (lv_annotations_6_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:946:3: lv_annotations_6_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getViewAccess().getAnnotationsAnnotationParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleView1984);
                    lv_annotations_6_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getViewRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_6_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:962:2: (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==17) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:962:4: otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleView1997); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getViewAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:966:1: ( (lv_annotations_8_0= ruleAnnotation ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:967:1: (lv_annotations_8_0= ruleAnnotation )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:967:1: (lv_annotations_8_0= ruleAnnotation )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:968:3: lv_annotations_8_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getViewAccess().getAnnotationsAnnotationParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleView2018);
                    	    lv_annotations_8_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getViewRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_8_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleView2032); 

                        	newLeafNode(otherlv_9, grammarAccess.getViewAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:988:3: (otherlv_10= 'rootComponent' ( (lv_rootComponent_11_0= ruleUILayout ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:988:5: otherlv_10= 'rootComponent' ( (lv_rootComponent_11_0= ruleUILayout ) )
                    {
                    otherlv_10=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleView2047); 

                        	newLeafNode(otherlv_10, grammarAccess.getViewAccess().getRootComponentKeyword_5_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:992:1: ( (lv_rootComponent_11_0= ruleUILayout ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:993:1: (lv_rootComponent_11_0= ruleUILayout )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:993:1: (lv_rootComponent_11_0= ruleUILayout )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:994:3: lv_rootComponent_11_0= ruleUILayout
                    {
                     
                    	        newCompositeNode(grammarAccess.getViewAccess().getRootComponentUILayoutParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUILayout_in_ruleView2068);
                    lv_rootComponent_11_0=ruleUILayout();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getViewRule());
                    	        }
                           		set(
                           			current, 
                           			"rootComponent",
                            		lv_rootComponent_11_0, 
                            		"UILayout");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleView2082); 

                	newLeafNode(otherlv_12, grammarAccess.getViewAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRuleEvent"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1022:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1023:2: (iv_ruleEvent= ruleEvent EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1024:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvent_in_entryRuleEvent2118);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEvent2128); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1031:1: ruleEvent returns [EObject current=null] : ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_annotations_6_0 = null;

        EObject lv_annotations_8_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1034:28: ( ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1035:1: ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1035:1: ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1035:2: () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1035:2: ()
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1036:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEventAccess().getEventAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEvent2174); 

                	newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEventKeyword_1());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1045:1: ( (lv_name_2_0= ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1046:1: (lv_name_2_0= ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1046:1: (lv_name_2_0= ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1047:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvent2195);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEventRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEvent2207); 

                	newLeafNode(otherlv_3, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1067:1: (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==16) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1067:3: otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEvent2220); 

                        	newLeafNode(otherlv_4, grammarAccess.getEventAccess().getAnnotationsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEvent2232); 

                        	newLeafNode(otherlv_5, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1075:1: ( (lv_annotations_6_0= ruleAnnotation ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1076:1: (lv_annotations_6_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1076:1: (lv_annotations_6_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1077:3: lv_annotations_6_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getAnnotationsAnnotationParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleEvent2253);
                    lv_annotations_6_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_6_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1093:2: (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==17) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1093:4: otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEvent2266); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getEventAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1097:1: ( (lv_annotations_8_0= ruleAnnotation ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1098:1: (lv_annotations_8_0= ruleAnnotation )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1098:1: (lv_annotations_8_0= ruleAnnotation )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1099:3: lv_annotations_8_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getAnnotationsAnnotationParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleEvent2287);
                    	    lv_annotations_8_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_8_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEvent2301); 

                        	newLeafNode(otherlv_9, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEvent2315); 

                	newLeafNode(otherlv_10, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleController"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1131:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1132:2: (iv_ruleController= ruleController EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1133:2: iv_ruleController= ruleController EOF
            {
             newCompositeNode(grammarAccess.getControllerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleController_in_entryRuleController2351);
            iv_ruleController=ruleController();

            state._fsp--;

             current =iv_ruleController; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleController2361); 

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
    // $ANTLR end "entryRuleController"


    // $ANTLR start "ruleController"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1140:1: ruleController returns [EObject current=null] : ( () otherlv_1= 'Controller' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'views' otherlv_11= '{' ( (lv_views_12_0= ruleControllerView ) ) (otherlv_13= ',' ( (lv_views_14_0= ruleControllerView ) ) )* otherlv_15= '}' )? (otherlv_16= 'actions' otherlv_17= '{' ( (lv_actions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_actions_20_0= ruleAction ) ) )* otherlv_21= '}' )? (otherlv_22= 'eventActions' otherlv_23= '{' ( (lv_eventActions_24_0= ruleEventAction ) ) (otherlv_25= ',' ( (lv_eventActions_26_0= ruleEventAction ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
    public final EObject ruleController() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_annotations_6_0 = null;

        EObject lv_annotations_8_0 = null;

        EObject lv_views_12_0 = null;

        EObject lv_views_14_0 = null;

        EObject lv_actions_18_0 = null;

        EObject lv_actions_20_0 = null;

        EObject lv_eventActions_24_0 = null;

        EObject lv_eventActions_26_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1143:28: ( ( () otherlv_1= 'Controller' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'views' otherlv_11= '{' ( (lv_views_12_0= ruleControllerView ) ) (otherlv_13= ',' ( (lv_views_14_0= ruleControllerView ) ) )* otherlv_15= '}' )? (otherlv_16= 'actions' otherlv_17= '{' ( (lv_actions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_actions_20_0= ruleAction ) ) )* otherlv_21= '}' )? (otherlv_22= 'eventActions' otherlv_23= '{' ( (lv_eventActions_24_0= ruleEventAction ) ) (otherlv_25= ',' ( (lv_eventActions_26_0= ruleEventAction ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1144:1: ( () otherlv_1= 'Controller' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'views' otherlv_11= '{' ( (lv_views_12_0= ruleControllerView ) ) (otherlv_13= ',' ( (lv_views_14_0= ruleControllerView ) ) )* otherlv_15= '}' )? (otherlv_16= 'actions' otherlv_17= '{' ( (lv_actions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_actions_20_0= ruleAction ) ) )* otherlv_21= '}' )? (otherlv_22= 'eventActions' otherlv_23= '{' ( (lv_eventActions_24_0= ruleEventAction ) ) (otherlv_25= ',' ( (lv_eventActions_26_0= ruleEventAction ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1144:1: ( () otherlv_1= 'Controller' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'views' otherlv_11= '{' ( (lv_views_12_0= ruleControllerView ) ) (otherlv_13= ',' ( (lv_views_14_0= ruleControllerView ) ) )* otherlv_15= '}' )? (otherlv_16= 'actions' otherlv_17= '{' ( (lv_actions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_actions_20_0= ruleAction ) ) )* otherlv_21= '}' )? (otherlv_22= 'eventActions' otherlv_23= '{' ( (lv_eventActions_24_0= ruleEventAction ) ) (otherlv_25= ',' ( (lv_eventActions_26_0= ruleEventAction ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1144:2: () otherlv_1= 'Controller' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'views' otherlv_11= '{' ( (lv_views_12_0= ruleControllerView ) ) (otherlv_13= ',' ( (lv_views_14_0= ruleControllerView ) ) )* otherlv_15= '}' )? (otherlv_16= 'actions' otherlv_17= '{' ( (lv_actions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_actions_20_0= ruleAction ) ) )* otherlv_21= '}' )? (otherlv_22= 'eventActions' otherlv_23= '{' ( (lv_eventActions_24_0= ruleEventAction ) ) (otherlv_25= ',' ( (lv_eventActions_26_0= ruleEventAction ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1144:2: ()
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1145:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getControllerAccess().getControllerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleController2407); 

                	newLeafNode(otherlv_1, grammarAccess.getControllerAccess().getControllerKeyword_1());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1154:1: ( (lv_name_2_0= ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1155:1: (lv_name_2_0= ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1155:1: (lv_name_2_0= ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1156:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getControllerAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleController2428);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getControllerRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleController2440); 

                	newLeafNode(otherlv_3, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1176:1: (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==16) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1176:3: otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleController2453); 

                        	newLeafNode(otherlv_4, grammarAccess.getControllerAccess().getAnnotationsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleController2465); 

                        	newLeafNode(otherlv_5, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1184:1: ( (lv_annotations_6_0= ruleAnnotation ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1185:1: (lv_annotations_6_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1185:1: (lv_annotations_6_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1186:3: lv_annotations_6_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getControllerAccess().getAnnotationsAnnotationParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleController2486);
                    lv_annotations_6_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getControllerRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_6_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1202:2: (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==17) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1202:4: otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleController2499); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getControllerAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1206:1: ( (lv_annotations_8_0= ruleAnnotation ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1207:1: (lv_annotations_8_0= ruleAnnotation )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1207:1: (lv_annotations_8_0= ruleAnnotation )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1208:3: lv_annotations_8_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getControllerAccess().getAnnotationsAnnotationParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleController2520);
                    	    lv_annotations_8_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getControllerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_8_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleController2534); 

                        	newLeafNode(otherlv_9, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1228:3: (otherlv_10= 'views' otherlv_11= '{' ( (lv_views_12_0= ruleControllerView ) ) (otherlv_13= ',' ( (lv_views_14_0= ruleControllerView ) ) )* otherlv_15= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1228:5: otherlv_10= 'views' otherlv_11= '{' ( (lv_views_12_0= ruleControllerView ) ) (otherlv_13= ',' ( (lv_views_14_0= ruleControllerView ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleController2549); 

                        	newLeafNode(otherlv_10, grammarAccess.getControllerAccess().getViewsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleController2561); 

                        	newLeafNode(otherlv_11, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1236:1: ( (lv_views_12_0= ruleControllerView ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1237:1: (lv_views_12_0= ruleControllerView )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1237:1: (lv_views_12_0= ruleControllerView )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1238:3: lv_views_12_0= ruleControllerView
                    {
                     
                    	        newCompositeNode(grammarAccess.getControllerAccess().getViewsControllerViewParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleControllerView_in_ruleController2582);
                    lv_views_12_0=ruleControllerView();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getControllerRule());
                    	        }
                           		add(
                           			current, 
                           			"views",
                            		lv_views_12_0, 
                            		"ControllerView");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1254:2: (otherlv_13= ',' ( (lv_views_14_0= ruleControllerView ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==17) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1254:4: otherlv_13= ',' ( (lv_views_14_0= ruleControllerView ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleController2595); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getControllerAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1258:1: ( (lv_views_14_0= ruleControllerView ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1259:1: (lv_views_14_0= ruleControllerView )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1259:1: (lv_views_14_0= ruleControllerView )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1260:3: lv_views_14_0= ruleControllerView
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getControllerAccess().getViewsControllerViewParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleControllerView_in_ruleController2616);
                    	    lv_views_14_0=ruleControllerView();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getControllerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"views",
                    	            		lv_views_14_0, 
                    	            		"ControllerView");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleController2630); 

                        	newLeafNode(otherlv_15, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1280:3: (otherlv_16= 'actions' otherlv_17= '{' ( (lv_actions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_actions_20_0= ruleAction ) ) )* otherlv_21= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1280:5: otherlv_16= 'actions' otherlv_17= '{' ( (lv_actions_18_0= ruleAction ) ) (otherlv_19= ',' ( (lv_actions_20_0= ruleAction ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleController2645); 

                        	newLeafNode(otherlv_16, grammarAccess.getControllerAccess().getActionsKeyword_6_0());
                        
                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleController2657); 

                        	newLeafNode(otherlv_17, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1288:1: ( (lv_actions_18_0= ruleAction ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1289:1: (lv_actions_18_0= ruleAction )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1289:1: (lv_actions_18_0= ruleAction )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1290:3: lv_actions_18_0= ruleAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getControllerAccess().getActionsActionParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleController2678);
                    lv_actions_18_0=ruleAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getControllerRule());
                    	        }
                           		add(
                           			current, 
                           			"actions",
                            		lv_actions_18_0, 
                            		"Action");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1306:2: (otherlv_19= ',' ( (lv_actions_20_0= ruleAction ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==17) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1306:4: otherlv_19= ',' ( (lv_actions_20_0= ruleAction ) )
                    	    {
                    	    otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleController2691); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getControllerAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1310:1: ( (lv_actions_20_0= ruleAction ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1311:1: (lv_actions_20_0= ruleAction )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1311:1: (lv_actions_20_0= ruleAction )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1312:3: lv_actions_20_0= ruleAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getControllerAccess().getActionsActionParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleController2712);
                    	    lv_actions_20_0=ruleAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getControllerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"actions",
                    	            		lv_actions_20_0, 
                    	            		"Action");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleController2726); 

                        	newLeafNode(otherlv_21, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1332:3: (otherlv_22= 'eventActions' otherlv_23= '{' ( (lv_eventActions_24_0= ruleEventAction ) ) (otherlv_25= ',' ( (lv_eventActions_26_0= ruleEventAction ) ) )* otherlv_27= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1332:5: otherlv_22= 'eventActions' otherlv_23= '{' ( (lv_eventActions_24_0= ruleEventAction ) ) (otherlv_25= ',' ( (lv_eventActions_26_0= ruleEventAction ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleController2741); 

                        	newLeafNode(otherlv_22, grammarAccess.getControllerAccess().getEventActionsKeyword_7_0());
                        
                    otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleController2753); 

                        	newLeafNode(otherlv_23, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1340:1: ( (lv_eventActions_24_0= ruleEventAction ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1341:1: (lv_eventActions_24_0= ruleEventAction )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1341:1: (lv_eventActions_24_0= ruleEventAction )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1342:3: lv_eventActions_24_0= ruleEventAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getControllerAccess().getEventActionsEventActionParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEventAction_in_ruleController2774);
                    lv_eventActions_24_0=ruleEventAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getControllerRule());
                    	        }
                           		add(
                           			current, 
                           			"eventActions",
                            		lv_eventActions_24_0, 
                            		"EventAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1358:2: (otherlv_25= ',' ( (lv_eventActions_26_0= ruleEventAction ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==17) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1358:4: otherlv_25= ',' ( (lv_eventActions_26_0= ruleEventAction ) )
                    	    {
                    	    otherlv_25=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleController2787); 

                    	        	newLeafNode(otherlv_25, grammarAccess.getControllerAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1362:1: ( (lv_eventActions_26_0= ruleEventAction ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1363:1: (lv_eventActions_26_0= ruleEventAction )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1363:1: (lv_eventActions_26_0= ruleEventAction )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1364:3: lv_eventActions_26_0= ruleEventAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getControllerAccess().getEventActionsEventActionParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEventAction_in_ruleController2808);
                    	    lv_eventActions_26_0=ruleEventAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getControllerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eventActions",
                    	            		lv_eventActions_26_0, 
                    	            		"EventAction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleController2822); 

                        	newLeafNode(otherlv_27, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_28=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleController2836); 

                	newLeafNode(otherlv_28, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleController"


    // $ANTLR start "entryRuleComponent"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1396:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1397:2: (iv_ruleComponent= ruleComponent EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1398:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComponent_in_entryRuleComponent2872);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComponent2882); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1405:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'controllers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_11_0 = null;

        EObject lv_annotations_13_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1408:28: ( (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'controllers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1409:1: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'controllers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1409:1: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'controllers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1409:3: otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'controllers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleComponent2919); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1413:1: ( (lv_name_1_0= ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1414:1: (lv_name_1_0= ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1414:1: (lv_name_1_0= ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1415:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComponent2940);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleComponent2952); 

                	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleComponent2964); 

                	newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getControllersKeyword_3());
                
            otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleComponent2976); 

                	newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_4());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1443:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1444:1: ( ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1444:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1445:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getComponentAccess().getControllersControllerCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComponent2999);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1458:2: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==17) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1458:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleComponent3012); 

            	        	newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getCommaKeyword_6_0());
            	        
            	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1462:1: ( ( ruleEString ) )
            	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1463:1: ( ruleEString )
            	    {
            	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1463:1: ( ruleEString )
            	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1464:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getComponentRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getControllersControllerCrossReference_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComponent3035);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_8=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleComponent3049); 

                	newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getRightParenthesisKeyword_7());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1481:1: (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==16) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1481:3: otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleComponent3062); 

                        	newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getAnnotationsKeyword_8_0());
                        
                    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleComponent3074); 

                        	newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1489:1: ( (lv_annotations_11_0= ruleAnnotation ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1490:1: (lv_annotations_11_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1490:1: (lv_annotations_11_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1491:3: lv_annotations_11_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentAccess().getAnnotationsAnnotationParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleComponent3095);
                    lv_annotations_11_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_11_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1507:2: (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==17) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1507:4: otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleComponent3108); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getComponentAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1511:1: ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1512:1: (lv_annotations_13_0= ruleAnnotation )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1512:1: (lv_annotations_13_0= ruleAnnotation )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1513:3: lv_annotations_13_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentAccess().getAnnotationsAnnotationParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleComponent3129);
                    	    lv_annotations_13_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_13_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleComponent3143); 

                        	newLeafNode(otherlv_14, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleComponent3157); 

                	newLeafNode(otherlv_15, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleAnnotationAttribute"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1547:1: entryRuleAnnotationAttribute returns [EObject current=null] : iv_ruleAnnotationAttribute= ruleAnnotationAttribute EOF ;
    public final EObject entryRuleAnnotationAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationAttribute = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1548:2: (iv_ruleAnnotationAttribute= ruleAnnotationAttribute EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1549:2: iv_ruleAnnotationAttribute= ruleAnnotationAttribute EOF
            {
             newCompositeNode(grammarAccess.getAnnotationAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttribute_in_entryRuleAnnotationAttribute3195);
            iv_ruleAnnotationAttribute=ruleAnnotationAttribute();

            state._fsp--;

             current =iv_ruleAnnotationAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationAttribute3205); 

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
    // $ANTLR end "entryRuleAnnotationAttribute"


    // $ANTLR start "ruleAnnotationAttribute"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1556:1: ruleAnnotationAttribute returns [EObject current=null] : (otherlv_0= 'AnnotationAttribute' otherlv_1= '{' otherlv_2= 'attribute' ( ( ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAnnotationAttributeValue ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleAnnotationAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1559:28: ( (otherlv_0= 'AnnotationAttribute' otherlv_1= '{' otherlv_2= 'attribute' ( ( ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAnnotationAttributeValue ) ) )? otherlv_6= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1560:1: (otherlv_0= 'AnnotationAttribute' otherlv_1= '{' otherlv_2= 'attribute' ( ( ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAnnotationAttributeValue ) ) )? otherlv_6= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1560:1: (otherlv_0= 'AnnotationAttribute' otherlv_1= '{' otherlv_2= 'attribute' ( ( ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAnnotationAttributeValue ) ) )? otherlv_6= '}' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1560:3: otherlv_0= 'AnnotationAttribute' otherlv_1= '{' otherlv_2= 'attribute' ( ( ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAnnotationAttributeValue ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAnnotationAttribute3242); 

                	newLeafNode(otherlv_0, grammarAccess.getAnnotationAttributeAccess().getAnnotationAttributeKeyword_0());
                
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnnotationAttribute3254); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationAttributeAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAnnotationAttribute3266); 

                	newLeafNode(otherlv_2, grammarAccess.getAnnotationAttributeAccess().getAttributeKeyword_2());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1572:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1573:1: ( ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1573:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1574:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationAttributeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAnnotationAttributeAccess().getAttributeAnnotationTypeAttributeCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotationAttribute3289);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1587:2: (otherlv_4= 'value' ( (lv_value_5_0= ruleAnnotationAttributeValue ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==41) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1587:4: otherlv_4= 'value' ( (lv_value_5_0= ruleAnnotationAttributeValue ) )
                    {
                    otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAnnotationAttribute3302); 

                        	newLeafNode(otherlv_4, grammarAccess.getAnnotationAttributeAccess().getValueKeyword_4_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1591:1: ( (lv_value_5_0= ruleAnnotationAttributeValue ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1592:1: (lv_value_5_0= ruleAnnotationAttributeValue )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1592:1: (lv_value_5_0= ruleAnnotationAttributeValue )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1593:3: lv_value_5_0= ruleAnnotationAttributeValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAttributeAccess().getValueAnnotationAttributeValueParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttributeValue_in_ruleAnnotationAttribute3323);
                    lv_value_5_0=ruleAnnotationAttributeValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnnotationAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"AnnotationAttributeValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnnotationAttribute3337); 

                	newLeafNode(otherlv_6, grammarAccess.getAnnotationAttributeAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleAnnotationAttribute"


    // $ANTLR start "entryRuleAnnotationTypeAttribute"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1621:1: entryRuleAnnotationTypeAttribute returns [EObject current=null] : iv_ruleAnnotationTypeAttribute= ruleAnnotationTypeAttribute EOF ;
    public final EObject entryRuleAnnotationTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationTypeAttribute = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1622:2: (iv_ruleAnnotationTypeAttribute= ruleAnnotationTypeAttribute EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1623:2: iv_ruleAnnotationTypeAttribute= ruleAnnotationTypeAttribute EOF
            {
             newCompositeNode(grammarAccess.getAnnotationTypeAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationTypeAttribute_in_entryRuleAnnotationTypeAttribute3373);
            iv_ruleAnnotationTypeAttribute=ruleAnnotationTypeAttribute();

            state._fsp--;

             current =iv_ruleAnnotationTypeAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationTypeAttribute3383); 

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
    // $ANTLR end "entryRuleAnnotationTypeAttribute"


    // $ANTLR start "ruleAnnotationTypeAttribute"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1630:1: ruleAnnotationTypeAttribute returns [EObject current=null] : ( () otherlv_1= 'AnnotationTypeAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleAnnotationTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1633:28: ( ( () otherlv_1= 'AnnotationTypeAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1634:1: ( () otherlv_1= 'AnnotationTypeAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1634:1: ( () otherlv_1= 'AnnotationTypeAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1634:2: () otherlv_1= 'AnnotationTypeAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1634:2: ()
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1635:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnnotationTypeAttributeAccess().getAnnotationTypeAttributeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleAnnotationTypeAttribute3429); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationTypeAttributeAccess().getAnnotationTypeAttributeKeyword_1());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1644:1: ( (lv_name_2_0= ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1645:1: (lv_name_2_0= ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1645:1: (lv_name_2_0= ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1646:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnnotationTypeAttributeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotationTypeAttribute3450);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnnotationTypeAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnnotationTypeAttribute3462); 

                	newLeafNode(otherlv_3, grammarAccess.getAnnotationTypeAttributeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1666:1: (otherlv_4= 'type' ( ( ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==43) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1666:3: otherlv_4= 'type' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleAnnotationTypeAttribute3475); 

                        	newLeafNode(otherlv_4, grammarAccess.getAnnotationTypeAttributeAccess().getTypeKeyword_4_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1670:1: ( ( ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1671:1: ( ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1671:1: ( ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1672:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnnotationTypeAttributeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAnnotationTypeAttributeAccess().getTypeTypeCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotationTypeAttribute3498);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnnotationTypeAttribute3512); 

                	newLeafNode(otherlv_6, grammarAccess.getAnnotationTypeAttributeAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleAnnotationTypeAttribute"


    // $ANTLR start "entryRuleSimpleValue"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1699:1: entryRuleSimpleValue returns [EObject current=null] : iv_ruleSimpleValue= ruleSimpleValue EOF ;
    public final EObject entryRuleSimpleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleValue = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1700:2: (iv_ruleSimpleValue= ruleSimpleValue EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1701:2: iv_ruleSimpleValue= ruleSimpleValue EOF
            {
             newCompositeNode(grammarAccess.getSimpleValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue3550);
            iv_ruleSimpleValue=ruleSimpleValue();

            state._fsp--;

             current =iv_ruleSimpleValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleValue3560); 

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
    // $ANTLR end "entryRuleSimpleValue"


    // $ANTLR start "ruleSimpleValue"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1708:1: ruleSimpleValue returns [EObject current=null] : ( () otherlv_1= 'SimpleValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleSimpleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1711:28: ( ( () otherlv_1= 'SimpleValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1712:1: ( () otherlv_1= 'SimpleValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1712:1: ( () otherlv_1= 'SimpleValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1712:2: () otherlv_1= 'SimpleValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1712:2: ()
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1713:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleValueAccess().getSimpleValueAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleSimpleValue3606); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleValueAccess().getSimpleValueKeyword_1());
                
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSimpleValue3618); 

                	newLeafNode(otherlv_2, grammarAccess.getSimpleValueAccess().getLeftCurlyBracketKeyword_2());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1726:1: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==41) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1726:3: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleSimpleValue3631); 

                        	newLeafNode(otherlv_3, grammarAccess.getSimpleValueAccess().getValueKeyword_3_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1730:1: ( (lv_value_4_0= ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1731:1: (lv_value_4_0= ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1731:1: (lv_value_4_0= ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1732:3: lv_value_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleValueAccess().getValueEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSimpleValue3652);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleValueRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSimpleValue3666); 

                	newLeafNode(otherlv_5, grammarAccess.getSimpleValueAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleSimpleValue"


    // $ANTLR start "entryRuleEntity"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1760:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1761:2: (iv_ruleEntity= ruleEntity EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1762:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_entryRuleEntity3702);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntity3712); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1769:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'extends' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleAttribute ) ) (otherlv_19= ',' ( (lv_attributes_20_0= ruleAttribute ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_annotations_12_0 = null;

        EObject lv_annotations_14_0 = null;

        EObject lv_attributes_18_0 = null;

        EObject lv_attributes_20_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1772:28: ( ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'extends' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleAttribute ) ) (otherlv_19= ',' ( (lv_attributes_20_0= ruleAttribute ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1773:1: ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'extends' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleAttribute ) ) (otherlv_19= ',' ( (lv_attributes_20_0= ruleAttribute ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1773:1: ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'extends' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleAttribute ) ) (otherlv_19= ',' ( (lv_attributes_20_0= ruleAttribute ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1773:2: () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'extends' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleAttribute ) ) (otherlv_19= ',' ( (lv_attributes_20_0= ruleAttribute ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1773:2: ()
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1774:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntityAccess().getEntityAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEntity3758); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1783:1: ( (lv_name_2_0= ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1784:1: (lv_name_2_0= ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1784:1: (lv_name_2_0= ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1785:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEntity3779);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEntity3791); 

                	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1805:1: (otherlv_4= 'extends' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==46) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1805:3: otherlv_4= 'extends' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEntity3804); 

                        	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getExtendsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEntity3816); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1813:1: ( ( ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1814:1: ( ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1814:1: ( ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1815:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEntity3839);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1828:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==17) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1828:4: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEntity3852); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1832:1: ( ( ruleEString ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1833:1: ( ruleEString )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1833:1: ( ruleEString )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1834:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEntityRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEntity3875);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEntity3889); 

                        	newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1851:3: (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==16) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1851:5: otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEntity3904); 

                        	newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getAnnotationsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEntity3916); 

                        	newLeafNode(otherlv_11, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1859:1: ( (lv_annotations_12_0= ruleAnnotation ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1860:1: (lv_annotations_12_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1860:1: (lv_annotations_12_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1861:3: lv_annotations_12_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleEntity3937);
                    lv_annotations_12_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_12_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1877:2: (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==17) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1877:4: otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEntity3950); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getEntityAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1881:1: ( (lv_annotations_14_0= ruleAnnotation ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1882:1: (lv_annotations_14_0= ruleAnnotation )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1882:1: (lv_annotations_14_0= ruleAnnotation )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1883:3: lv_annotations_14_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleEntity3971);
                    	    lv_annotations_14_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_14_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEntity3985); 

                        	newLeafNode(otherlv_15, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1903:3: (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleAttribute ) ) (otherlv_19= ',' ( (lv_attributes_20_0= ruleAttribute ) ) )* otherlv_21= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==26) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1903:5: otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleAttribute ) ) (otherlv_19= ',' ( (lv_attributes_20_0= ruleAttribute ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEntity4000); 

                        	newLeafNode(otherlv_16, grammarAccess.getEntityAccess().getAttributesKeyword_6_0());
                        
                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEntity4012); 

                        	newLeafNode(otherlv_17, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1911:1: ( (lv_attributes_18_0= ruleAttribute ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1912:1: (lv_attributes_18_0= ruleAttribute )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1912:1: (lv_attributes_18_0= ruleAttribute )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1913:3: lv_attributes_18_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleEntity4033);
                    lv_attributes_18_0=ruleAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_18_0, 
                            		"Attribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1929:2: (otherlv_19= ',' ( (lv_attributes_20_0= ruleAttribute ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==17) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1929:4: otherlv_19= ',' ( (lv_attributes_20_0= ruleAttribute ) )
                    	    {
                    	    otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEntity4046); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getEntityAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1933:1: ( (lv_attributes_20_0= ruleAttribute ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1934:1: (lv_attributes_20_0= ruleAttribute )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1934:1: (lv_attributes_20_0= ruleAttribute )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1935:3: lv_attributes_20_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleEntity4067);
                    	    lv_attributes_20_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_20_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEntity4081); 

                        	newLeafNode(otherlv_21, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_22=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEntity4095); 

                	newLeafNode(otherlv_22, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAssociation"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1967:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1968:2: (iv_ruleAssociation= ruleAssociation EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1969:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssociation_in_entryRuleAssociation4131);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssociation4141); 

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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1976:1: ruleAssociation returns [EObject current=null] : ( ( (lv_containment_0_0= 'containment' ) )? otherlv_1= 'Association' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'lowerBound' ( (lv_lowerBound_5_0= ruleEInt ) ) )? (otherlv_6= 'upperBound' ( (lv_upperBound_7_0= ruleEInt ) ) )? otherlv_8= 'source' ( ( ruleEString ) ) otherlv_10= 'target' ( ( ruleEString ) ) (otherlv_12= 'annotations' otherlv_13= '{' ( (lv_annotations_14_0= ruleAnnotation ) ) (otherlv_15= ',' ( (lv_annotations_16_0= ruleAnnotation ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_containment_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_5_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_7_0 = null;

        EObject lv_annotations_14_0 = null;

        EObject lv_annotations_16_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1979:28: ( ( ( (lv_containment_0_0= 'containment' ) )? otherlv_1= 'Association' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'lowerBound' ( (lv_lowerBound_5_0= ruleEInt ) ) )? (otherlv_6= 'upperBound' ( (lv_upperBound_7_0= ruleEInt ) ) )? otherlv_8= 'source' ( ( ruleEString ) ) otherlv_10= 'target' ( ( ruleEString ) ) (otherlv_12= 'annotations' otherlv_13= '{' ( (lv_annotations_14_0= ruleAnnotation ) ) (otherlv_15= ',' ( (lv_annotations_16_0= ruleAnnotation ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1980:1: ( ( (lv_containment_0_0= 'containment' ) )? otherlv_1= 'Association' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'lowerBound' ( (lv_lowerBound_5_0= ruleEInt ) ) )? (otherlv_6= 'upperBound' ( (lv_upperBound_7_0= ruleEInt ) ) )? otherlv_8= 'source' ( ( ruleEString ) ) otherlv_10= 'target' ( ( ruleEString ) ) (otherlv_12= 'annotations' otherlv_13= '{' ( (lv_annotations_14_0= ruleAnnotation ) ) (otherlv_15= ',' ( (lv_annotations_16_0= ruleAnnotation ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1980:1: ( ( (lv_containment_0_0= 'containment' ) )? otherlv_1= 'Association' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'lowerBound' ( (lv_lowerBound_5_0= ruleEInt ) ) )? (otherlv_6= 'upperBound' ( (lv_upperBound_7_0= ruleEInt ) ) )? otherlv_8= 'source' ( ( ruleEString ) ) otherlv_10= 'target' ( ( ruleEString ) ) (otherlv_12= 'annotations' otherlv_13= '{' ( (lv_annotations_14_0= ruleAnnotation ) ) (otherlv_15= ',' ( (lv_annotations_16_0= ruleAnnotation ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1980:2: ( (lv_containment_0_0= 'containment' ) )? otherlv_1= 'Association' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'lowerBound' ( (lv_lowerBound_5_0= ruleEInt ) ) )? (otherlv_6= 'upperBound' ( (lv_upperBound_7_0= ruleEInt ) ) )? otherlv_8= 'source' ( ( ruleEString ) ) otherlv_10= 'target' ( ( ruleEString ) ) (otherlv_12= 'annotations' otherlv_13= '{' ( (lv_annotations_14_0= ruleAnnotation ) ) (otherlv_15= ',' ( (lv_annotations_16_0= ruleAnnotation ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1980:2: ( (lv_containment_0_0= 'containment' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==47) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1981:1: (lv_containment_0_0= 'containment' )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1981:1: (lv_containment_0_0= 'containment' )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1982:3: lv_containment_0_0= 'containment'
                    {
                    lv_containment_0_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleAssociation4184); 

                            newLeafNode(lv_containment_0_0, grammarAccess.getAssociationAccess().getContainmentContainmentKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssociationRule());
                    	        }
                           		setWithLastConsumed(current, "containment", true, "containment");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleAssociation4210); 

                	newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getAssociationKeyword_1());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:1999:1: ( (lv_name_2_0= ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2000:1: (lv_name_2_0= ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2000:1: (lv_name_2_0= ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2001:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssociation4231);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssociationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAssociation4243); 

                	newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2021:1: (otherlv_4= 'lowerBound' ( (lv_lowerBound_5_0= ruleEInt ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==49) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2021:3: otherlv_4= 'lowerBound' ( (lv_lowerBound_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleAssociation4256); 

                        	newLeafNode(otherlv_4, grammarAccess.getAssociationAccess().getLowerBoundKeyword_4_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2025:1: ( (lv_lowerBound_5_0= ruleEInt ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2026:1: (lv_lowerBound_5_0= ruleEInt )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2026:1: (lv_lowerBound_5_0= ruleEInt )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2027:3: lv_lowerBound_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationAccess().getLowerBoundEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAssociation4277);
                    lv_lowerBound_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssociationRule());
                    	        }
                           		set(
                           			current, 
                           			"lowerBound",
                            		lv_lowerBound_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2043:4: (otherlv_6= 'upperBound' ( (lv_upperBound_7_0= ruleEInt ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==50) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2043:6: otherlv_6= 'upperBound' ( (lv_upperBound_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleAssociation4292); 

                        	newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getUpperBoundKeyword_5_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2047:1: ( (lv_upperBound_7_0= ruleEInt ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2048:1: (lv_upperBound_7_0= ruleEInt )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2048:1: (lv_upperBound_7_0= ruleEInt )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2049:3: lv_upperBound_7_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationAccess().getUpperBoundEIntParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAssociation4313);
                    lv_upperBound_7_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssociationRule());
                    	        }
                           		set(
                           			current, 
                           			"upperBound",
                            		lv_upperBound_7_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleAssociation4327); 

                	newLeafNode(otherlv_8, grammarAccess.getAssociationAccess().getSourceKeyword_6());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2069:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2070:1: ( ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2070:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2071:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getSourceEntityCrossReference_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssociation4350);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleAssociation4362); 

                	newLeafNode(otherlv_10, grammarAccess.getAssociationAccess().getTargetKeyword_8());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2088:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2089:1: ( ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2089:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2090:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getTargetEntityCrossReference_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssociation4385);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2103:2: (otherlv_12= 'annotations' otherlv_13= '{' ( (lv_annotations_14_0= ruleAnnotation ) ) (otherlv_15= ',' ( (lv_annotations_16_0= ruleAnnotation ) ) )* otherlv_17= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==16) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2103:4: otherlv_12= 'annotations' otherlv_13= '{' ( (lv_annotations_14_0= ruleAnnotation ) ) (otherlv_15= ',' ( (lv_annotations_16_0= ruleAnnotation ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAssociation4398); 

                        	newLeafNode(otherlv_12, grammarAccess.getAssociationAccess().getAnnotationsKeyword_10_0());
                        
                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAssociation4410); 

                        	newLeafNode(otherlv_13, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2111:1: ( (lv_annotations_14_0= ruleAnnotation ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2112:1: (lv_annotations_14_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2112:1: (lv_annotations_14_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2113:3: lv_annotations_14_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationAccess().getAnnotationsAnnotationParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAssociation4431);
                    lv_annotations_14_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssociationRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_14_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2129:2: (otherlv_15= ',' ( (lv_annotations_16_0= ruleAnnotation ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==17) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2129:4: otherlv_15= ',' ( (lv_annotations_16_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAssociation4444); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getAssociationAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2133:1: ( (lv_annotations_16_0= ruleAnnotation ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2134:1: (lv_annotations_16_0= ruleAnnotation )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2134:1: (lv_annotations_16_0= ruleAnnotation )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2135:3: lv_annotations_16_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssociationAccess().getAnnotationsAnnotationParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAssociation4465);
                    	    lv_annotations_16_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssociationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_16_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAssociation4479); 

                        	newLeafNode(otherlv_17, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAssociation4493); 

                	newLeafNode(otherlv_18, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_11());
                

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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleAttribute"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2167:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2168:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2169:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute4529);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute4539); 

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
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2176:1: ruleAttribute returns [EObject current=null] : ( () otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;

        EObject lv_annotations_8_0 = null;

        EObject lv_annotations_10_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2179:28: ( ( () otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2180:1: ( () otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2180:1: ( () otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2180:2: () otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2180:2: ()
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2181:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttributeAccess().getAttributeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleAttribute4585); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttributeKeyword_1());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2190:1: ( (lv_name_2_0= ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2191:1: (lv_name_2_0= ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2191:1: (lv_name_2_0= ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2192:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAttribute4606);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAttribute4618); 

                	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2212:1: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==43) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2212:3: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleAttribute4631); 

                        	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getTypeKeyword_4_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2216:1: ( (lv_type_5_0= ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2217:1: (lv_type_5_0= ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2217:1: (lv_type_5_0= ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2218:3: lv_type_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAttribute4652);
                    lv_type_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2234:4: (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==16) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2234:6: otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAttribute4667); 

                        	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getAnnotationsKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAttribute4679); 

                        	newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2242:1: ( (lv_annotations_8_0= ruleAnnotation ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2243:1: (lv_annotations_8_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2243:1: (lv_annotations_8_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2244:3: lv_annotations_8_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAttribute4700);
                    lv_annotations_8_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_8_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2260:2: (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==17) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2260:4: otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAttribute4713); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2264:1: ( (lv_annotations_10_0= ruleAnnotation ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2265:1: (lv_annotations_10_0= ruleAnnotation )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2265:1: (lv_annotations_10_0= ruleAnnotation )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2266:3: lv_annotations_10_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAttribute4734);
                    	    lv_annotations_10_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_10_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAttribute4748); 

                        	newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAttribute4762); 

                	newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleEInt"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2300:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2301:2: (iv_ruleEInt= ruleEInt EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2302:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt4801);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt4812); 

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
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2309:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2312:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2313:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2313:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2313:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2313:2: (kw= '-' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==54) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2314:2: kw= '-'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleEInt4851); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt4868); 

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


    // $ANTLR start "entryRuleUILayout"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2334:1: entryRuleUILayout returns [EObject current=null] : iv_ruleUILayout= ruleUILayout EOF ;
    public final EObject entryRuleUILayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUILayout = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2335:2: (iv_ruleUILayout= ruleUILayout EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2336:2: iv_ruleUILayout= ruleUILayout EOF
            {
             newCompositeNode(grammarAccess.getUILayoutRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUILayout_in_entryRuleUILayout4913);
            iv_ruleUILayout=ruleUILayout();

            state._fsp--;

             current =iv_ruleUILayout; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUILayout4923); 

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
    // $ANTLR end "entryRuleUILayout"


    // $ANTLR start "ruleUILayout"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2343:1: ruleUILayout returns [EObject current=null] : ( () otherlv_1= 'UILayout' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'orientation' ( (lv_orientation_7_0= ruleEString ) ) )? (otherlv_8= 'columns' ( (lv_columns_9_0= ruleEInt ) ) )? (otherlv_10= 'importView' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'annotations' otherlv_17= '{' ( (lv_annotations_18_0= ruleAnnotation ) ) (otherlv_19= ',' ( (lv_annotations_20_0= ruleAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'components' otherlv_23= '{' ( (lv_components_24_0= ruleUIComponent ) ) (otherlv_25= ',' ( (lv_components_26_0= ruleUIComponent ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
    public final EObject ruleUILayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_orientation_7_0 = null;

        AntlrDatatypeRuleToken lv_columns_9_0 = null;

        EObject lv_annotations_18_0 = null;

        EObject lv_annotations_20_0 = null;

        EObject lv_components_24_0 = null;

        EObject lv_components_26_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2346:28: ( ( () otherlv_1= 'UILayout' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'orientation' ( (lv_orientation_7_0= ruleEString ) ) )? (otherlv_8= 'columns' ( (lv_columns_9_0= ruleEInt ) ) )? (otherlv_10= 'importView' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'annotations' otherlv_17= '{' ( (lv_annotations_18_0= ruleAnnotation ) ) (otherlv_19= ',' ( (lv_annotations_20_0= ruleAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'components' otherlv_23= '{' ( (lv_components_24_0= ruleUIComponent ) ) (otherlv_25= ',' ( (lv_components_26_0= ruleUIComponent ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2347:1: ( () otherlv_1= 'UILayout' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'orientation' ( (lv_orientation_7_0= ruleEString ) ) )? (otherlv_8= 'columns' ( (lv_columns_9_0= ruleEInt ) ) )? (otherlv_10= 'importView' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'annotations' otherlv_17= '{' ( (lv_annotations_18_0= ruleAnnotation ) ) (otherlv_19= ',' ( (lv_annotations_20_0= ruleAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'components' otherlv_23= '{' ( (lv_components_24_0= ruleUIComponent ) ) (otherlv_25= ',' ( (lv_components_26_0= ruleUIComponent ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2347:1: ( () otherlv_1= 'UILayout' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'orientation' ( (lv_orientation_7_0= ruleEString ) ) )? (otherlv_8= 'columns' ( (lv_columns_9_0= ruleEInt ) ) )? (otherlv_10= 'importView' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'annotations' otherlv_17= '{' ( (lv_annotations_18_0= ruleAnnotation ) ) (otherlv_19= ',' ( (lv_annotations_20_0= ruleAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'components' otherlv_23= '{' ( (lv_components_24_0= ruleUIComponent ) ) (otherlv_25= ',' ( (lv_components_26_0= ruleUIComponent ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2347:2: () otherlv_1= 'UILayout' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'orientation' ( (lv_orientation_7_0= ruleEString ) ) )? (otherlv_8= 'columns' ( (lv_columns_9_0= ruleEInt ) ) )? (otherlv_10= 'importView' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'annotations' otherlv_17= '{' ( (lv_annotations_18_0= ruleAnnotation ) ) (otherlv_19= ',' ( (lv_annotations_20_0= ruleAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'components' otherlv_23= '{' ( (lv_components_24_0= ruleUIComponent ) ) (otherlv_25= ',' ( (lv_components_26_0= ruleUIComponent ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2347:2: ()
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2348:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUILayoutAccess().getUILayoutAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleUILayout4969); 

                	newLeafNode(otherlv_1, grammarAccess.getUILayoutAccess().getUILayoutKeyword_1());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2357:1: ( (lv_name_2_0= ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2358:1: (lv_name_2_0= ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2358:1: (lv_name_2_0= ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2359:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getUILayoutAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUILayout4990);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUILayoutRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUILayout5002); 

                	newLeafNode(otherlv_3, grammarAccess.getUILayoutAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2379:1: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==43) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2379:3: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleUILayout5015); 

                        	newLeafNode(otherlv_4, grammarAccess.getUILayoutAccess().getTypeKeyword_4_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2383:1: ( (lv_type_5_0= ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2384:1: (lv_type_5_0= ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2384:1: (lv_type_5_0= ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2385:3: lv_type_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUILayoutAccess().getTypeEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUILayout5036);
                    lv_type_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUILayoutRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2401:4: (otherlv_6= 'orientation' ( (lv_orientation_7_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==56) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2401:6: otherlv_6= 'orientation' ( (lv_orientation_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleUILayout5051); 

                        	newLeafNode(otherlv_6, grammarAccess.getUILayoutAccess().getOrientationKeyword_5_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2405:1: ( (lv_orientation_7_0= ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2406:1: (lv_orientation_7_0= ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2406:1: (lv_orientation_7_0= ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2407:3: lv_orientation_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUILayoutAccess().getOrientationEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUILayout5072);
                    lv_orientation_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUILayoutRule());
                    	        }
                           		set(
                           			current, 
                           			"orientation",
                            		lv_orientation_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2423:4: (otherlv_8= 'columns' ( (lv_columns_9_0= ruleEInt ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==57) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2423:6: otherlv_8= 'columns' ( (lv_columns_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleUILayout5087); 

                        	newLeafNode(otherlv_8, grammarAccess.getUILayoutAccess().getColumnsKeyword_6_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2427:1: ( (lv_columns_9_0= ruleEInt ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2428:1: (lv_columns_9_0= ruleEInt )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2428:1: (lv_columns_9_0= ruleEInt )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2429:3: lv_columns_9_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getUILayoutAccess().getColumnsEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleUILayout5108);
                    lv_columns_9_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUILayoutRule());
                    	        }
                           		set(
                           			current, 
                           			"columns",
                            		lv_columns_9_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2445:4: (otherlv_10= 'importView' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==58) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2445:6: otherlv_10= 'importView' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleUILayout5123); 

                        	newLeafNode(otherlv_10, grammarAccess.getUILayoutAccess().getImportViewKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleUILayout5135); 

                        	newLeafNode(otherlv_11, grammarAccess.getUILayoutAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2453:1: ( ( ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2454:1: ( ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2454:1: ( ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2455:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUILayoutRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getUILayoutAccess().getImportViewViewCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUILayout5158);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2468:2: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==17) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2468:4: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleUILayout5171); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getUILayoutAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2472:1: ( ( ruleEString ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2473:1: ( ruleEString )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2473:1: ( ruleEString )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2474:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getUILayoutRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getUILayoutAccess().getImportViewViewCrossReference_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUILayout5194);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleUILayout5208); 

                        	newLeafNode(otherlv_15, grammarAccess.getUILayoutAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2491:3: (otherlv_16= 'annotations' otherlv_17= '{' ( (lv_annotations_18_0= ruleAnnotation ) ) (otherlv_19= ',' ( (lv_annotations_20_0= ruleAnnotation ) ) )* otherlv_21= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==16) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2491:5: otherlv_16= 'annotations' otherlv_17= '{' ( (lv_annotations_18_0= ruleAnnotation ) ) (otherlv_19= ',' ( (lv_annotations_20_0= ruleAnnotation ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleUILayout5223); 

                        	newLeafNode(otherlv_16, grammarAccess.getUILayoutAccess().getAnnotationsKeyword_8_0());
                        
                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUILayout5235); 

                        	newLeafNode(otherlv_17, grammarAccess.getUILayoutAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2499:1: ( (lv_annotations_18_0= ruleAnnotation ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2500:1: (lv_annotations_18_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2500:1: (lv_annotations_18_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2501:3: lv_annotations_18_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getUILayoutAccess().getAnnotationsAnnotationParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleUILayout5256);
                    lv_annotations_18_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUILayoutRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_18_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2517:2: (otherlv_19= ',' ( (lv_annotations_20_0= ruleAnnotation ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==17) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2517:4: otherlv_19= ',' ( (lv_annotations_20_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleUILayout5269); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getUILayoutAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2521:1: ( (lv_annotations_20_0= ruleAnnotation ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2522:1: (lv_annotations_20_0= ruleAnnotation )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2522:1: (lv_annotations_20_0= ruleAnnotation )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2523:3: lv_annotations_20_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUILayoutAccess().getAnnotationsAnnotationParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleUILayout5290);
                    	    lv_annotations_20_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUILayoutRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_20_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleUILayout5304); 

                        	newLeafNode(otherlv_21, grammarAccess.getUILayoutAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2543:3: (otherlv_22= 'components' otherlv_23= '{' ( (lv_components_24_0= ruleUIComponent ) ) (otherlv_25= ',' ( (lv_components_26_0= ruleUIComponent ) ) )* otherlv_27= '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==23) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2543:5: otherlv_22= 'components' otherlv_23= '{' ( (lv_components_24_0= ruleUIComponent ) ) (otherlv_25= ',' ( (lv_components_26_0= ruleUIComponent ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleUILayout5319); 

                        	newLeafNode(otherlv_22, grammarAccess.getUILayoutAccess().getComponentsKeyword_9_0());
                        
                    otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUILayout5331); 

                        	newLeafNode(otherlv_23, grammarAccess.getUILayoutAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2551:1: ( (lv_components_24_0= ruleUIComponent ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2552:1: (lv_components_24_0= ruleUIComponent )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2552:1: (lv_components_24_0= ruleUIComponent )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2553:3: lv_components_24_0= ruleUIComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getUILayoutAccess().getComponentsUIComponentParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUIComponent_in_ruleUILayout5352);
                    lv_components_24_0=ruleUIComponent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUILayoutRule());
                    	        }
                           		add(
                           			current, 
                           			"components",
                            		lv_components_24_0, 
                            		"UIComponent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2569:2: (otherlv_25= ',' ( (lv_components_26_0= ruleUIComponent ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==17) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2569:4: otherlv_25= ',' ( (lv_components_26_0= ruleUIComponent ) )
                    	    {
                    	    otherlv_25=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleUILayout5365); 

                    	        	newLeafNode(otherlv_25, grammarAccess.getUILayoutAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2573:1: ( (lv_components_26_0= ruleUIComponent ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2574:1: (lv_components_26_0= ruleUIComponent )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2574:1: (lv_components_26_0= ruleUIComponent )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2575:3: lv_components_26_0= ruleUIComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUILayoutAccess().getComponentsUIComponentParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleUIComponent_in_ruleUILayout5386);
                    	    lv_components_26_0=ruleUIComponent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUILayoutRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"components",
                    	            		lv_components_26_0, 
                    	            		"UIComponent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleUILayout5400); 

                        	newLeafNode(otherlv_27, grammarAccess.getUILayoutAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_28=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleUILayout5414); 

                	newLeafNode(otherlv_28, grammarAccess.getUILayoutAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleUILayout"


    // $ANTLR start "entryRuleUIInput"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2607:1: entryRuleUIInput returns [EObject current=null] : iv_ruleUIInput= ruleUIInput EOF ;
    public final EObject entryRuleUIInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIInput = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2608:2: (iv_ruleUIInput= ruleUIInput EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2609:2: iv_ruleUIInput= ruleUIInput EOF
            {
             newCompositeNode(grammarAccess.getUIInputRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUIInput_in_entryRuleUIInput5450);
            iv_ruleUIInput=ruleUIInput();

            state._fsp--;

             current =iv_ruleUIInput; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUIInput5460); 

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
    // $ANTLR end "entryRuleUIInput"


    // $ANTLR start "ruleUIInput"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2616:1: ruleUIInput returns [EObject current=null] : ( () otherlv_1= 'UIInput' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( ( ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleUIInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;

        EObject lv_annotations_10_0 = null;

        EObject lv_annotations_12_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2619:28: ( ( () otherlv_1= 'UIInput' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( ( ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2620:1: ( () otherlv_1= 'UIInput' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( ( ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2620:1: ( () otherlv_1= 'UIInput' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( ( ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2620:2: () otherlv_1= 'UIInput' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( ( ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2620:2: ()
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2621:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUIInputAccess().getUIInputAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleUIInput5506); 

                	newLeafNode(otherlv_1, grammarAccess.getUIInputAccess().getUIInputKeyword_1());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2630:1: ( (lv_name_2_0= ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2631:1: (lv_name_2_0= ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2631:1: (lv_name_2_0= ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2632:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getUIInputAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUIInput5527);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUIInputRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUIInput5539); 

                	newLeafNode(otherlv_3, grammarAccess.getUIInputAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2652:1: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==43) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2652:3: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleUIInput5552); 

                        	newLeafNode(otherlv_4, grammarAccess.getUIInputAccess().getTypeKeyword_4_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2656:1: ( (lv_type_5_0= ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2657:1: (lv_type_5_0= ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2657:1: (lv_type_5_0= ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2658:3: lv_type_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUIInputAccess().getTypeEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUIInput5573);
                    lv_type_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUIInputRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2674:4: (otherlv_6= 'value' ( ( ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==41) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2674:6: otherlv_6= 'value' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleUIInput5588); 

                        	newLeafNode(otherlv_6, grammarAccess.getUIInputAccess().getValueKeyword_5_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2678:1: ( ( ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2679:1: ( ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2679:1: ( ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2680:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUIInputRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getUIInputAccess().getValueAttributeCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUIInput5611);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2693:4: (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==16) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2693:6: otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleUIInput5626); 

                        	newLeafNode(otherlv_8, grammarAccess.getUIInputAccess().getAnnotationsKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUIInput5638); 

                        	newLeafNode(otherlv_9, grammarAccess.getUIInputAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2701:1: ( (lv_annotations_10_0= ruleAnnotation ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2702:1: (lv_annotations_10_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2702:1: (lv_annotations_10_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2703:3: lv_annotations_10_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getUIInputAccess().getAnnotationsAnnotationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleUIInput5659);
                    lv_annotations_10_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUIInputRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_10_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2719:2: (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==17) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2719:4: otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleUIInput5672); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getUIInputAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2723:1: ( (lv_annotations_12_0= ruleAnnotation ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2724:1: (lv_annotations_12_0= ruleAnnotation )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2724:1: (lv_annotations_12_0= ruleAnnotation )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2725:3: lv_annotations_12_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUIInputAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleUIInput5693);
                    	    lv_annotations_12_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUIInputRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_12_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleUIInput5707); 

                        	newLeafNode(otherlv_13, grammarAccess.getUIInputAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleUIInput5721); 

                	newLeafNode(otherlv_14, grammarAccess.getUIInputAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleUIInput"


    // $ANTLR start "entryRuleUIActions"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2757:1: entryRuleUIActions returns [EObject current=null] : iv_ruleUIActions= ruleUIActions EOF ;
    public final EObject entryRuleUIActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIActions = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2758:2: (iv_ruleUIActions= ruleUIActions EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2759:2: iv_ruleUIActions= ruleUIActions EOF
            {
             newCompositeNode(grammarAccess.getUIActionsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUIActions_in_entryRuleUIActions5757);
            iv_ruleUIActions=ruleUIActions();

            state._fsp--;

             current =iv_ruleUIActions; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUIActions5767); 

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
    // $ANTLR end "entryRuleUIActions"


    // $ANTLR start "ruleUIActions"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2766:1: ruleUIActions returns [EObject current=null] : ( () otherlv_1= 'UIActions' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'triggerEvent' ( ( ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleUIActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;

        EObject lv_annotations_10_0 = null;

        EObject lv_annotations_12_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2769:28: ( ( () otherlv_1= 'UIActions' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'triggerEvent' ( ( ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2770:1: ( () otherlv_1= 'UIActions' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'triggerEvent' ( ( ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2770:1: ( () otherlv_1= 'UIActions' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'triggerEvent' ( ( ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2770:2: () otherlv_1= 'UIActions' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'triggerEvent' ( ( ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2770:2: ()
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2771:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUIActionsAccess().getUIActionsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleUIActions5813); 

                	newLeafNode(otherlv_1, grammarAccess.getUIActionsAccess().getUIActionsKeyword_1());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2780:1: ( (lv_name_2_0= ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2781:1: (lv_name_2_0= ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2781:1: (lv_name_2_0= ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2782:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getUIActionsAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUIActions5834);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUIActionsRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUIActions5846); 

                	newLeafNode(otherlv_3, grammarAccess.getUIActionsAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2802:1: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==43) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2802:3: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleUIActions5859); 

                        	newLeafNode(otherlv_4, grammarAccess.getUIActionsAccess().getTypeKeyword_4_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2806:1: ( (lv_type_5_0= ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2807:1: (lv_type_5_0= ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2807:1: (lv_type_5_0= ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2808:3: lv_type_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUIActionsAccess().getTypeEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUIActions5880);
                    lv_type_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUIActionsRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2824:4: (otherlv_6= 'triggerEvent' ( ( ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==61) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2824:6: otherlv_6= 'triggerEvent' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleUIActions5895); 

                        	newLeafNode(otherlv_6, grammarAccess.getUIActionsAccess().getTriggerEventKeyword_5_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2828:1: ( ( ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2829:1: ( ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2829:1: ( ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2830:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUIActionsRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getUIActionsAccess().getTriggerEventEventCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUIActions5918);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2843:4: (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==16) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2843:6: otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleUIActions5933); 

                        	newLeafNode(otherlv_8, grammarAccess.getUIActionsAccess().getAnnotationsKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUIActions5945); 

                        	newLeafNode(otherlv_9, grammarAccess.getUIActionsAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2851:1: ( (lv_annotations_10_0= ruleAnnotation ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2852:1: (lv_annotations_10_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2852:1: (lv_annotations_10_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2853:3: lv_annotations_10_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getUIActionsAccess().getAnnotationsAnnotationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleUIActions5966);
                    lv_annotations_10_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUIActionsRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_10_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2869:2: (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==17) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2869:4: otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleUIActions5979); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getUIActionsAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2873:1: ( (lv_annotations_12_0= ruleAnnotation ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2874:1: (lv_annotations_12_0= ruleAnnotation )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2874:1: (lv_annotations_12_0= ruleAnnotation )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2875:3: lv_annotations_12_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUIActionsAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleUIActions6000);
                    	    lv_annotations_12_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUIActionsRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_12_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleUIActions6014); 

                        	newLeafNode(otherlv_13, grammarAccess.getUIActionsAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleUIActions6028); 

                	newLeafNode(otherlv_14, grammarAccess.getUIActionsAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleUIActions"


    // $ANTLR start "entryRuleUILabel"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2907:1: entryRuleUILabel returns [EObject current=null] : iv_ruleUILabel= ruleUILabel EOF ;
    public final EObject entryRuleUILabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUILabel = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2908:2: (iv_ruleUILabel= ruleUILabel EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2909:2: iv_ruleUILabel= ruleUILabel EOF
            {
             newCompositeNode(grammarAccess.getUILabelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUILabel_in_entryRuleUILabel6064);
            iv_ruleUILabel=ruleUILabel();

            state._fsp--;

             current =iv_ruleUILabel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUILabel6074); 

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
    // $ANTLR end "entryRuleUILabel"


    // $ANTLR start "ruleUILabel"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2916:1: ruleUILabel returns [EObject current=null] : ( () otherlv_1= 'UILabel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'text' ( (lv_text_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( ( ruleEString ) ) )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleUILabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_text_7_0 = null;

        EObject lv_annotations_12_0 = null;

        EObject lv_annotations_14_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2919:28: ( ( () otherlv_1= 'UILabel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'text' ( (lv_text_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( ( ruleEString ) ) )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2920:1: ( () otherlv_1= 'UILabel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'text' ( (lv_text_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( ( ruleEString ) ) )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2920:1: ( () otherlv_1= 'UILabel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'text' ( (lv_text_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( ( ruleEString ) ) )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2920:2: () otherlv_1= 'UILabel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'text' ( (lv_text_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( ( ruleEString ) ) )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2920:2: ()
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2921:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUILabelAccess().getUILabelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleUILabel6120); 

                	newLeafNode(otherlv_1, grammarAccess.getUILabelAccess().getUILabelKeyword_1());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2930:1: ( (lv_name_2_0= ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2931:1: (lv_name_2_0= ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2931:1: (lv_name_2_0= ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2932:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getUILabelAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUILabel6141);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUILabelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUILabel6153); 

                	newLeafNode(otherlv_3, grammarAccess.getUILabelAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2952:1: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==43) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2952:3: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleUILabel6166); 

                        	newLeafNode(otherlv_4, grammarAccess.getUILabelAccess().getTypeKeyword_4_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2956:1: ( (lv_type_5_0= ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2957:1: (lv_type_5_0= ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2957:1: (lv_type_5_0= ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2958:3: lv_type_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUILabelAccess().getTypeEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUILabel6187);
                    lv_type_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUILabelRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2974:4: (otherlv_6= 'text' ( (lv_text_7_0= ruleEString ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==63) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2974:6: otherlv_6= 'text' ( (lv_text_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleUILabel6202); 

                        	newLeafNode(otherlv_6, grammarAccess.getUILabelAccess().getTextKeyword_5_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2978:1: ( (lv_text_7_0= ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2979:1: (lv_text_7_0= ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2979:1: (lv_text_7_0= ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2980:3: lv_text_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUILabelAccess().getTextEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUILabel6223);
                    lv_text_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUILabelRule());
                    	        }
                           		set(
                           			current, 
                           			"text",
                            		lv_text_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2996:4: (otherlv_8= 'value' ( ( ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==41) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:2996:6: otherlv_8= 'value' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleUILabel6238); 

                        	newLeafNode(otherlv_8, grammarAccess.getUILabelAccess().getValueKeyword_6_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3000:1: ( ( ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3001:1: ( ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3001:1: ( ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3002:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUILabelRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getUILabelAccess().getValueAttributeCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUILabel6261);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3015:4: (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==16) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3015:6: otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleUILabel6276); 

                        	newLeafNode(otherlv_10, grammarAccess.getUILabelAccess().getAnnotationsKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUILabel6288); 

                        	newLeafNode(otherlv_11, grammarAccess.getUILabelAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3023:1: ( (lv_annotations_12_0= ruleAnnotation ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3024:1: (lv_annotations_12_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3024:1: (lv_annotations_12_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3025:3: lv_annotations_12_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getUILabelAccess().getAnnotationsAnnotationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleUILabel6309);
                    lv_annotations_12_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUILabelRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_12_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3041:2: (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==17) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3041:4: otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleUILabel6322); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getUILabelAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3045:1: ( (lv_annotations_14_0= ruleAnnotation ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3046:1: (lv_annotations_14_0= ruleAnnotation )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3046:1: (lv_annotations_14_0= ruleAnnotation )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3047:3: lv_annotations_14_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUILabelAccess().getAnnotationsAnnotationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleUILabel6343);
                    	    lv_annotations_14_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUILabelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_14_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleUILabel6357); 

                        	newLeafNode(otherlv_15, grammarAccess.getUILabelAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleUILabel6371); 

                	newLeafNode(otherlv_16, grammarAccess.getUILabelAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleUILabel"


    // $ANTLR start "entryRuleAction"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3079:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3080:2: (iv_ruleAction= ruleAction EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3081:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction6407);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction6417); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3088:1: ruleAction returns [EObject current=null] : ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preExecutionEvent' ( ( ruleEString ) ) )? (otherlv_6= 'postExecutionEvent' ( ( ruleEString ) ) )? (otherlv_8= 'triggerEvents' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'annotations' otherlv_15= '{' ( (lv_annotations_16_0= ruleAnnotation ) ) (otherlv_17= ',' ( (lv_annotations_18_0= ruleAnnotation ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_annotations_16_0 = null;

        EObject lv_annotations_18_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3091:28: ( ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preExecutionEvent' ( ( ruleEString ) ) )? (otherlv_6= 'postExecutionEvent' ( ( ruleEString ) ) )? (otherlv_8= 'triggerEvents' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'annotations' otherlv_15= '{' ( (lv_annotations_16_0= ruleAnnotation ) ) (otherlv_17= ',' ( (lv_annotations_18_0= ruleAnnotation ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3092:1: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preExecutionEvent' ( ( ruleEString ) ) )? (otherlv_6= 'postExecutionEvent' ( ( ruleEString ) ) )? (otherlv_8= 'triggerEvents' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'annotations' otherlv_15= '{' ( (lv_annotations_16_0= ruleAnnotation ) ) (otherlv_17= ',' ( (lv_annotations_18_0= ruleAnnotation ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3092:1: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preExecutionEvent' ( ( ruleEString ) ) )? (otherlv_6= 'postExecutionEvent' ( ( ruleEString ) ) )? (otherlv_8= 'triggerEvents' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'annotations' otherlv_15= '{' ( (lv_annotations_16_0= ruleAnnotation ) ) (otherlv_17= ',' ( (lv_annotations_18_0= ruleAnnotation ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3092:2: () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preExecutionEvent' ( ( ruleEString ) ) )? (otherlv_6= 'postExecutionEvent' ( ( ruleEString ) ) )? (otherlv_8= 'triggerEvents' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'annotations' otherlv_15= '{' ( (lv_annotations_16_0= ruleAnnotation ) ) (otherlv_17= ',' ( (lv_annotations_18_0= ruleAnnotation ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3092:2: ()
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3093:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActionAccess().getActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleAction6463); 

                	newLeafNode(otherlv_1, grammarAccess.getActionAccess().getActionKeyword_1());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3102:1: ( (lv_name_2_0= ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3103:1: (lv_name_2_0= ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3103:1: (lv_name_2_0= ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3104:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction6484);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAction6496); 

                	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3124:1: (otherlv_4= 'preExecutionEvent' ( ( ruleEString ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==65) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3124:3: otherlv_4= 'preExecutionEvent' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleAction6509); 

                        	newLeafNode(otherlv_4, grammarAccess.getActionAccess().getPreExecutionEventKeyword_4_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3128:1: ( ( ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3129:1: ( ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3129:1: ( ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3130:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getPreExecutionEventEventCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction6532);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3143:4: (otherlv_6= 'postExecutionEvent' ( ( ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==66) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3143:6: otherlv_6= 'postExecutionEvent' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleAction6547); 

                        	newLeafNode(otherlv_6, grammarAccess.getActionAccess().getPostExecutionEventKeyword_5_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3147:1: ( ( ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3148:1: ( ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3148:1: ( ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3149:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getPostExecutionEventEventCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction6570);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3162:4: (otherlv_8= 'triggerEvents' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==67) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3162:6: otherlv_8= 'triggerEvents' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleAction6585); 

                        	newLeafNode(otherlv_8, grammarAccess.getActionAccess().getTriggerEventsKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAction6597); 

                        	newLeafNode(otherlv_9, grammarAccess.getActionAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3170:1: ( ( ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3171:1: ( ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3171:1: ( ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3172:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getTriggerEventsEventCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction6620);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3185:2: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==17) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3185:4: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAction6633); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getActionAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3189:1: ( ( ruleEString ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3190:1: ( ruleEString )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3190:1: ( ruleEString )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3191:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getActionAccess().getTriggerEventsEventCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction6656);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleAction6670); 

                        	newLeafNode(otherlv_13, grammarAccess.getActionAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3208:3: (otherlv_14= 'annotations' otherlv_15= '{' ( (lv_annotations_16_0= ruleAnnotation ) ) (otherlv_17= ',' ( (lv_annotations_18_0= ruleAnnotation ) ) )* otherlv_19= '}' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==16) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3208:5: otherlv_14= 'annotations' otherlv_15= '{' ( (lv_annotations_16_0= ruleAnnotation ) ) (otherlv_17= ',' ( (lv_annotations_18_0= ruleAnnotation ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAction6685); 

                        	newLeafNode(otherlv_14, grammarAccess.getActionAccess().getAnnotationsKeyword_7_0());
                        
                    otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAction6697); 

                        	newLeafNode(otherlv_15, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3216:1: ( (lv_annotations_16_0= ruleAnnotation ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3217:1: (lv_annotations_16_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3217:1: (lv_annotations_16_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3218:3: lv_annotations_16_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAction6718);
                    lv_annotations_16_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_16_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3234:2: (otherlv_17= ',' ( (lv_annotations_18_0= ruleAnnotation ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==17) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3234:4: otherlv_17= ',' ( (lv_annotations_18_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAction6731); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getActionAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3238:1: ( (lv_annotations_18_0= ruleAnnotation ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3239:1: (lv_annotations_18_0= ruleAnnotation )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3239:1: (lv_annotations_18_0= ruleAnnotation )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3240:3: lv_annotations_18_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAction6752);
                    	    lv_annotations_18_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_18_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAction6766); 

                        	newLeafNode(otherlv_19, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_20=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAction6780); 

                	newLeafNode(otherlv_20, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleControllerView"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3272:1: entryRuleControllerView returns [EObject current=null] : iv_ruleControllerView= ruleControllerView EOF ;
    public final EObject entryRuleControllerView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControllerView = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3273:2: (iv_ruleControllerView= ruleControllerView EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3274:2: iv_ruleControllerView= ruleControllerView EOF
            {
             newCompositeNode(grammarAccess.getControllerViewRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleControllerView_in_entryRuleControllerView6816);
            iv_ruleControllerView=ruleControllerView();

            state._fsp--;

             current =iv_ruleControllerView; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleControllerView6826); 

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
    // $ANTLR end "entryRuleControllerView"


    // $ANTLR start "ruleControllerView"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3281:1: ruleControllerView returns [EObject current=null] : (otherlv_0= 'ControllerView' otherlv_1= '{' otherlv_2= 'view' ( ( ruleEString ) ) (otherlv_4= 'models' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleControllerView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_annotations_12_0 = null;

        EObject lv_annotations_14_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3284:28: ( (otherlv_0= 'ControllerView' otherlv_1= '{' otherlv_2= 'view' ( ( ruleEString ) ) (otherlv_4= 'models' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3285:1: (otherlv_0= 'ControllerView' otherlv_1= '{' otherlv_2= 'view' ( ( ruleEString ) ) (otherlv_4= 'models' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3285:1: (otherlv_0= 'ControllerView' otherlv_1= '{' otherlv_2= 'view' ( ( ruleEString ) ) (otherlv_4= 'models' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3285:3: otherlv_0= 'ControllerView' otherlv_1= '{' otherlv_2= 'view' ( ( ruleEString ) ) (otherlv_4= 'models' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleControllerView6863); 

                	newLeafNode(otherlv_0, grammarAccess.getControllerViewAccess().getControllerViewKeyword_0());
                
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleControllerView6875); 

                	newLeafNode(otherlv_1, grammarAccess.getControllerViewAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleControllerView6887); 

                	newLeafNode(otherlv_2, grammarAccess.getControllerViewAccess().getViewKeyword_2());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3297:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3298:1: ( ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3298:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3299:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getControllerViewRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getControllerViewAccess().getViewViewCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleControllerView6910);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3312:2: (otherlv_4= 'models' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==19) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3312:4: otherlv_4= 'models' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleControllerView6923); 

                        	newLeafNode(otherlv_4, grammarAccess.getControllerViewAccess().getModelsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleControllerView6935); 

                        	newLeafNode(otherlv_5, grammarAccess.getControllerViewAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3320:1: ( ( ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3321:1: ( ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3321:1: ( ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3322:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getControllerViewRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getControllerViewAccess().getModelsModelCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleControllerView6958);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3335:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==17) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3335:4: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleControllerView6971); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getControllerViewAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3339:1: ( ( ruleEString ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3340:1: ( ruleEString )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3340:1: ( ruleEString )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3341:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getControllerViewRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getControllerViewAccess().getModelsModelCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleControllerView6994);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleControllerView7008); 

                        	newLeafNode(otherlv_9, grammarAccess.getControllerViewAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3358:3: (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==16) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3358:5: otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleControllerView7023); 

                        	newLeafNode(otherlv_10, grammarAccess.getControllerViewAccess().getAnnotationsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleControllerView7035); 

                        	newLeafNode(otherlv_11, grammarAccess.getControllerViewAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3366:1: ( (lv_annotations_12_0= ruleAnnotation ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3367:1: (lv_annotations_12_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3367:1: (lv_annotations_12_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3368:3: lv_annotations_12_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getControllerViewAccess().getAnnotationsAnnotationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleControllerView7056);
                    lv_annotations_12_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getControllerViewRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_12_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3384:2: (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==17) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3384:4: otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleControllerView7069); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getControllerViewAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3388:1: ( (lv_annotations_14_0= ruleAnnotation ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3389:1: (lv_annotations_14_0= ruleAnnotation )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3389:1: (lv_annotations_14_0= ruleAnnotation )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3390:3: lv_annotations_14_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getControllerViewAccess().getAnnotationsAnnotationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleControllerView7090);
                    	    lv_annotations_14_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getControllerViewRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_14_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleControllerView7104); 

                        	newLeafNode(otherlv_15, grammarAccess.getControllerViewAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleControllerView7118); 

                	newLeafNode(otherlv_16, grammarAccess.getControllerViewAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleControllerView"


    // $ANTLR start "entryRuleEventAction"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3422:1: entryRuleEventAction returns [EObject current=null] : iv_ruleEventAction= ruleEventAction EOF ;
    public final EObject entryRuleEventAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventAction = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3423:2: (iv_ruleEventAction= ruleEventAction EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3424:2: iv_ruleEventAction= ruleEventAction EOF
            {
             newCompositeNode(grammarAccess.getEventActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEventAction_in_entryRuleEventAction7154);
            iv_ruleEventAction=ruleEventAction();

            state._fsp--;

             current =iv_ruleEventAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEventAction7164); 

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
    // $ANTLR end "entryRuleEventAction"


    // $ANTLR start "ruleEventAction"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3431:1: ruleEventAction returns [EObject current=null] : (otherlv_0= 'EventAction' otherlv_1= '{' otherlv_2= 'action' ( ( ruleEString ) ) (otherlv_4= 'events' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleEventAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_annotations_12_0 = null;

        EObject lv_annotations_14_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3434:28: ( (otherlv_0= 'EventAction' otherlv_1= '{' otherlv_2= 'action' ( ( ruleEString ) ) (otherlv_4= 'events' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3435:1: (otherlv_0= 'EventAction' otherlv_1= '{' otherlv_2= 'action' ( ( ruleEString ) ) (otherlv_4= 'events' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3435:1: (otherlv_0= 'EventAction' otherlv_1= '{' otherlv_2= 'action' ( ( ruleEString ) ) (otherlv_4= 'events' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3435:3: otherlv_0= 'EventAction' otherlv_1= '{' otherlv_2= 'action' ( ( ruleEString ) ) (otherlv_4= 'events' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleEventAction7201); 

                	newLeafNode(otherlv_0, grammarAccess.getEventActionAccess().getEventActionKeyword_0());
                
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEventAction7213); 

                	newLeafNode(otherlv_1, grammarAccess.getEventActionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleEventAction7225); 

                	newLeafNode(otherlv_2, grammarAccess.getEventActionAccess().getActionKeyword_2());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3447:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3448:1: ( ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3448:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3449:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEventActionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEventActionAccess().getActionActionCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEventAction7248);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3462:2: (otherlv_4= 'events' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==21) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3462:4: otherlv_4= 'events' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEventAction7261); 

                        	newLeafNode(otherlv_4, grammarAccess.getEventActionAccess().getEventsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEventAction7273); 

                        	newLeafNode(otherlv_5, grammarAccess.getEventActionAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3470:1: ( ( ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3471:1: ( ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3471:1: ( ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3472:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEventActionAccess().getEventsEventCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEventAction7296);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3485:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==17) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3485:4: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEventAction7309); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getEventActionAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3489:1: ( ( ruleEString ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3490:1: ( ruleEString )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3490:1: ( ruleEString )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3491:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEventActionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventActionAccess().getEventsEventCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEventAction7332);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEventAction7346); 

                        	newLeafNode(otherlv_9, grammarAccess.getEventActionAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3508:3: (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==16) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3508:5: otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEventAction7361); 

                        	newLeafNode(otherlv_10, grammarAccess.getEventActionAccess().getAnnotationsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEventAction7373); 

                        	newLeafNode(otherlv_11, grammarAccess.getEventActionAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3516:1: ( (lv_annotations_12_0= ruleAnnotation ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3517:1: (lv_annotations_12_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3517:1: (lv_annotations_12_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3518:3: lv_annotations_12_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventActionAccess().getAnnotationsAnnotationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleEventAction7394);
                    lv_annotations_12_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventActionRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_12_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3534:2: (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==17) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3534:4: otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEventAction7407); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getEventActionAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3538:1: ( (lv_annotations_14_0= ruleAnnotation ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3539:1: (lv_annotations_14_0= ruleAnnotation )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3539:1: (lv_annotations_14_0= ruleAnnotation )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:3540:3: lv_annotations_14_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventActionAccess().getAnnotationsAnnotationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleEventAction7428);
                    	    lv_annotations_14_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventActionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_14_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEventAction7442); 

                        	newLeafNode(otherlv_15, grammarAccess.getEventActionAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEventAction7456); 

                	newLeafNode(otherlv_16, grammarAccess.getEventActionAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleEventAction"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMVCModel_in_entryRuleMVCModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMVCModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleMVCModel123 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleMVCModel140 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMVCModel157 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMVCModel170 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMVCModel191 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMVCModel203 = new BitSet(new long[]{0x0000000000F98000L});
        public static final BitSet FOLLOW_15_in_ruleMVCModel216 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMVCModel237 = new BitSet(new long[]{0x0000000000F90000L});
        public static final BitSet FOLLOW_16_in_ruleMVCModel252 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMVCModel264 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleMVCModel285 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleMVCModel298 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleMVCModel319 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleMVCModel333 = new BitSet(new long[]{0x0000000000F80000L});
        public static final BitSet FOLLOW_19_in_ruleMVCModel348 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMVCModel360 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleModel_in_ruleMVCModel381 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleMVCModel394 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleModel_in_ruleMVCModel415 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleMVCModel429 = new BitSet(new long[]{0x0000000000F00000L});
        public static final BitSet FOLLOW_20_in_ruleMVCModel444 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMVCModel456 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleView_in_ruleMVCModel477 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleMVCModel490 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleView_in_ruleMVCModel511 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleMVCModel525 = new BitSet(new long[]{0x0000000000E00000L});
        public static final BitSet FOLLOW_21_in_ruleMVCModel540 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMVCModel552 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleEvent_in_ruleMVCModel573 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleMVCModel586 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleEvent_in_ruleMVCModel607 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleMVCModel621 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleMVCModel636 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMVCModel648 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_ruleController_in_ruleMVCModel669 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleMVCModel682 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_ruleController_in_ruleMVCModel703 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleMVCModel717 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleMVCModel731 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMVCModel743 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleComponent_in_ruleMVCModel764 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleMVCModel777 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleComponent_in_ruleMVCModel798 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleMVCModel812 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleMVCModel824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttributeValue_in_entryRuleAnnotationAttributeValue860 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationAttributeValue870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleValue_in_ruleAnnotationAttributeValue916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUIComponent_in_entryRuleUIComponent950 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUIComponent960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUILayout_in_ruleUIComponent1007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUIInput_in_ruleUIComponent1034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUIActions_in_ruleUIComponent1061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUILabel_in_ruleUIComponent1088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1123 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleAnnotation1170 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAnnotation1182 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleAnnotation1194 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation1217 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_26_in_ruleAnnotation1230 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAnnotation1242 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_ruleAnnotation1263 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleAnnotation1276 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_ruleAnnotation1297 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleAnnotation1311 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleAnnotation1325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1362 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel1484 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel1494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleModel1540 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModel1561 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleModel1573 = new BitSet(new long[]{0x0000000030050000L});
        public static final BitSet FOLLOW_16_in_ruleModel1586 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleModel1598 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleModel1619 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleModel1632 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleModel1653 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleModel1667 = new BitSet(new long[]{0x0000000030040000L});
        public static final BitSet FOLLOW_28_in_ruleModel1682 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_ruleEntity_in_ruleModel1703 = new BitSet(new long[]{0x0000000020040000L});
        public static final BitSet FOLLOW_29_in_ruleModel1718 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleModel1730 = new BitSet(new long[]{0x0001800000000000L});
        public static final BitSet FOLLOW_ruleAssociation_in_ruleModel1751 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleModel1764 = new BitSet(new long[]{0x0001800000000000L});
        public static final BitSet FOLLOW_ruleAssociation_in_ruleModel1785 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleModel1799 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleModel1813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleView_in_entryRuleView1849 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleView1859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleView1905 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleView1926 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleView1938 = new BitSet(new long[]{0x0000000080050000L});
        public static final BitSet FOLLOW_16_in_ruleView1951 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleView1963 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleView1984 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleView1997 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleView2018 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleView2032 = new BitSet(new long[]{0x0000000080040000L});
        public static final BitSet FOLLOW_31_in_ruleView2047 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_ruleUILayout_in_ruleView2068 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleView2082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent2118 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEvent2128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleEvent2174 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvent2195 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleEvent2207 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_16_in_ruleEvent2220 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleEvent2232 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleEvent2253 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEvent2266 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleEvent2287 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEvent2301 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEvent2315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleController_in_entryRuleController2351 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleController2361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleController2407 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleController2428 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleController2440 = new BitSet(new long[]{0x0000000C00150000L});
        public static final BitSet FOLLOW_16_in_ruleController2453 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleController2465 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleController2486 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleController2499 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleController2520 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleController2534 = new BitSet(new long[]{0x0000000C00140000L});
        public static final BitSet FOLLOW_20_in_ruleController2549 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleController2561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_ruleControllerView_in_ruleController2582 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleController2595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_ruleControllerView_in_ruleController2616 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleController2630 = new BitSet(new long[]{0x0000000C00040000L});
        public static final BitSet FOLLOW_34_in_ruleController2645 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleController2657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleAction_in_ruleController2678 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleController2691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleAction_in_ruleController2712 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleController2726 = new BitSet(new long[]{0x0000000800040000L});
        public static final BitSet FOLLOW_35_in_ruleController2741 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleController2753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_ruleEventAction_in_ruleController2774 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleController2787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_ruleEventAction_in_ruleController2808 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleController2822 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleController2836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent2872 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComponent2882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleComponent2919 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComponent2940 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleComponent2952 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleComponent2964 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleComponent2976 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComponent2999 = new BitSet(new long[]{0x0000004000020000L});
        public static final BitSet FOLLOW_17_in_ruleComponent3012 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComponent3035 = new BitSet(new long[]{0x0000004000020000L});
        public static final BitSet FOLLOW_38_in_ruleComponent3049 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_16_in_ruleComponent3062 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleComponent3074 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleComponent3095 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleComponent3108 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleComponent3129 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleComponent3143 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleComponent3157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_entryRuleAnnotationAttribute3195 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationAttribute3205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleAnnotationAttribute3242 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAnnotationAttribute3254 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAnnotationAttribute3266 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotationAttribute3289 = new BitSet(new long[]{0x0000020000040000L});
        public static final BitSet FOLLOW_41_in_ruleAnnotationAttribute3302 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleAnnotationAttributeValue_in_ruleAnnotationAttribute3323 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleAnnotationAttribute3337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationTypeAttribute_in_entryRuleAnnotationTypeAttribute3373 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationTypeAttribute3383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleAnnotationTypeAttribute3429 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotationTypeAttribute3450 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAnnotationTypeAttribute3462 = new BitSet(new long[]{0x0000080000040000L});
        public static final BitSet FOLLOW_43_in_ruleAnnotationTypeAttribute3475 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotationTypeAttribute3498 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleAnnotationTypeAttribute3512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue3550 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValue3560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleSimpleValue3606 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSimpleValue3618 = new BitSet(new long[]{0x0000020000040000L});
        public static final BitSet FOLLOW_41_in_ruleSimpleValue3631 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSimpleValue3652 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleSimpleValue3666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity3702 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntity3712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleEntity3758 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEntity3779 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleEntity3791 = new BitSet(new long[]{0x0000400004050000L});
        public static final BitSet FOLLOW_46_in_ruleEntity3804 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleEntity3816 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEntity3839 = new BitSet(new long[]{0x0000004000020000L});
        public static final BitSet FOLLOW_17_in_ruleEntity3852 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEntity3875 = new BitSet(new long[]{0x0000004000020000L});
        public static final BitSet FOLLOW_38_in_ruleEntity3889 = new BitSet(new long[]{0x0000000004050000L});
        public static final BitSet FOLLOW_16_in_ruleEntity3904 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleEntity3916 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleEntity3937 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEntity3950 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleEntity3971 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEntity3985 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_26_in_ruleEntity4000 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleEntity4012 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity4033 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEntity4046 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity4067 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEntity4081 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEntity4095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation4131 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssociation4141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleAssociation4184 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_ruleAssociation4210 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssociation4231 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAssociation4243 = new BitSet(new long[]{0x000E000000000000L});
        public static final BitSet FOLLOW_49_in_ruleAssociation4256 = new BitSet(new long[]{0x0040000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAssociation4277 = new BitSet(new long[]{0x000C000000000000L});
        public static final BitSet FOLLOW_50_in_ruleAssociation4292 = new BitSet(new long[]{0x0040000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAssociation4313 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleAssociation4327 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssociation4350 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleAssociation4362 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssociation4385 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_16_in_ruleAssociation4398 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAssociation4410 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAssociation4431 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleAssociation4444 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAssociation4465 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleAssociation4479 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleAssociation4493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute4529 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute4539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleAttribute4585 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAttribute4606 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAttribute4618 = new BitSet(new long[]{0x0000080000050000L});
        public static final BitSet FOLLOW_43_in_ruleAttribute4631 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAttribute4652 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_16_in_ruleAttribute4667 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAttribute4679 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAttribute4700 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleAttribute4713 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAttribute4734 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleAttribute4748 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleAttribute4762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt4801 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt4812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleEInt4851 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt4868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUILayout_in_entryRuleUILayout4913 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUILayout4923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleUILayout4969 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUILayout4990 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUILayout5002 = new BitSet(new long[]{0x0700080000850000L});
        public static final BitSet FOLLOW_43_in_ruleUILayout5015 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUILayout5036 = new BitSet(new long[]{0x0700000000850000L});
        public static final BitSet FOLLOW_56_in_ruleUILayout5051 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUILayout5072 = new BitSet(new long[]{0x0600000000850000L});
        public static final BitSet FOLLOW_57_in_ruleUILayout5087 = new BitSet(new long[]{0x0040000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleUILayout5108 = new BitSet(new long[]{0x0400000000850000L});
        public static final BitSet FOLLOW_58_in_ruleUILayout5123 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleUILayout5135 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUILayout5158 = new BitSet(new long[]{0x0000004000020000L});
        public static final BitSet FOLLOW_17_in_ruleUILayout5171 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUILayout5194 = new BitSet(new long[]{0x0000004000020000L});
        public static final BitSet FOLLOW_38_in_ruleUILayout5208 = new BitSet(new long[]{0x0000000000850000L});
        public static final BitSet FOLLOW_16_in_ruleUILayout5223 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUILayout5235 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleUILayout5256 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleUILayout5269 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleUILayout5290 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleUILayout5304 = new BitSet(new long[]{0x0000000000840000L});
        public static final BitSet FOLLOW_23_in_ruleUILayout5319 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUILayout5331 = new BitSet(new long[]{0x5880000000000000L});
        public static final BitSet FOLLOW_ruleUIComponent_in_ruleUILayout5352 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleUILayout5365 = new BitSet(new long[]{0x5880000000000000L});
        public static final BitSet FOLLOW_ruleUIComponent_in_ruleUILayout5386 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleUILayout5400 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleUILayout5414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUIInput_in_entryRuleUIInput5450 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUIInput5460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleUIInput5506 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUIInput5527 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUIInput5539 = new BitSet(new long[]{0x00000A0000050000L});
        public static final BitSet FOLLOW_43_in_ruleUIInput5552 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUIInput5573 = new BitSet(new long[]{0x0000020000050000L});
        public static final BitSet FOLLOW_41_in_ruleUIInput5588 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUIInput5611 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_16_in_ruleUIInput5626 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUIInput5638 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleUIInput5659 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleUIInput5672 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleUIInput5693 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleUIInput5707 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleUIInput5721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUIActions_in_entryRuleUIActions5757 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUIActions5767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleUIActions5813 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUIActions5834 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUIActions5846 = new BitSet(new long[]{0x2000080000050000L});
        public static final BitSet FOLLOW_43_in_ruleUIActions5859 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUIActions5880 = new BitSet(new long[]{0x2000000000050000L});
        public static final BitSet FOLLOW_61_in_ruleUIActions5895 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUIActions5918 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_16_in_ruleUIActions5933 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUIActions5945 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleUIActions5966 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleUIActions5979 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleUIActions6000 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleUIActions6014 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleUIActions6028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUILabel_in_entryRuleUILabel6064 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUILabel6074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleUILabel6120 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUILabel6141 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUILabel6153 = new BitSet(new long[]{0x80000A0000050000L});
        public static final BitSet FOLLOW_43_in_ruleUILabel6166 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUILabel6187 = new BitSet(new long[]{0x8000020000050000L});
        public static final BitSet FOLLOW_63_in_ruleUILabel6202 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUILabel6223 = new BitSet(new long[]{0x0000020000050000L});
        public static final BitSet FOLLOW_41_in_ruleUILabel6238 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUILabel6261 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_16_in_ruleUILabel6276 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUILabel6288 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleUILabel6309 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleUILabel6322 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleUILabel6343 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleUILabel6357 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleUILabel6371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction6407 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction6417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleAction6463 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction6484 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAction6496 = new BitSet(new long[]{0x0000000000050000L,0x000000000000000EL});
        public static final BitSet FOLLOW_65_in_ruleAction6509 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction6532 = new BitSet(new long[]{0x0000000000050000L,0x000000000000000CL});
        public static final BitSet FOLLOW_66_in_ruleAction6547 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction6570 = new BitSet(new long[]{0x0000000000050000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleAction6585 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleAction6597 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction6620 = new BitSet(new long[]{0x0000004000020000L});
        public static final BitSet FOLLOW_17_in_ruleAction6633 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction6656 = new BitSet(new long[]{0x0000004000020000L});
        public static final BitSet FOLLOW_38_in_ruleAction6670 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_16_in_ruleAction6685 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAction6697 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAction6718 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleAction6731 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAction6752 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleAction6766 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleAction6780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleControllerView_in_entryRuleControllerView6816 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleControllerView6826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleControllerView6863 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleControllerView6875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleControllerView6887 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleControllerView6910 = new BitSet(new long[]{0x00000000000D0000L});
        public static final BitSet FOLLOW_19_in_ruleControllerView6923 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleControllerView6935 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleControllerView6958 = new BitSet(new long[]{0x0000004000020000L});
        public static final BitSet FOLLOW_17_in_ruleControllerView6971 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleControllerView6994 = new BitSet(new long[]{0x0000004000020000L});
        public static final BitSet FOLLOW_38_in_ruleControllerView7008 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_16_in_ruleControllerView7023 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleControllerView7035 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleControllerView7056 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleControllerView7069 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleControllerView7090 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleControllerView7104 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleControllerView7118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEventAction_in_entryRuleEventAction7154 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEventAction7164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleEventAction7201 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleEventAction7213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_71_in_ruleEventAction7225 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEventAction7248 = new BitSet(new long[]{0x0000000000250000L});
        public static final BitSet FOLLOW_21_in_ruleEventAction7261 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleEventAction7273 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEventAction7296 = new BitSet(new long[]{0x0000004000020000L});
        public static final BitSet FOLLOW_17_in_ruleEventAction7309 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEventAction7332 = new BitSet(new long[]{0x0000004000020000L});
        public static final BitSet FOLLOW_38_in_ruleEventAction7346 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_16_in_ruleEventAction7361 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleEventAction7373 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleEventAction7394 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEventAction7407 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleEventAction7428 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEventAction7442 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEventAction7456 = new BitSet(new long[]{0x0000000000000002L});
    }


}