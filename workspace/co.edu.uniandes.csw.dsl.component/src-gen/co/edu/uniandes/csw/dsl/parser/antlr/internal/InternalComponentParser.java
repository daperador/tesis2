package co.edu.uniandes.csw.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.edu.uniandes.csw.dsl.services.ComponentGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Component'", "'{'", "'models'", "','", "'}'", "'views'", "'events'", "'controllers'", "'import'", "';'", "'layout'", "'@'", "'('", "')'", "':'", "'Event'", "'actions'", "'eventActions'", "'='", "'input'", "'type'", "'value'", "'action'", "'triggerEvent'", "'label'", "'text'", "'preExecutionEvent'", "'postExecutionEvent'", "'triggerEvents'", "'view'", "'EventAction'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalComponentParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentParser.tokenNames; }
    public String getGrammarFileName() { return "../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g"; }



     	private ComponentGrammarAccess grammarAccess;
     	
        public InternalComponentParser(TokenStream input, ComponentGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Component";	
       	}
       	
       	@Override
       	protected ComponentGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleComponent"
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:67:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:68:2: (iv_ruleComponent= ruleComponent EOF )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:69:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComponent_in_entryRuleComponent75);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComponent85); 

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:76:1: ruleComponent returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_annotations_2_0= ruleAnnotation ) )? otherlv_3= 'Component' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' (otherlv_6= 'models' otherlv_7= '{' ( (lv_models_8_0= ruleModel ) ) (otherlv_9= ',' ( (lv_models_10_0= ruleModel ) ) )* otherlv_11= '}' )? (otherlv_12= 'views' otherlv_13= '{' ( (lv_views_14_0= ruleView ) ) (otherlv_15= ',' ( (lv_views_16_0= ruleView ) ) )* otherlv_17= '}' )? (otherlv_18= 'events' otherlv_19= '{' ( (lv_events_20_0= ruleEvent ) ) (otherlv_21= ',' ( (lv_events_22_0= ruleEvent ) ) )* otherlv_23= '}' )? (otherlv_24= 'controllers' otherlv_25= '{' ( (lv_controllers_26_0= ruleController ) ) (otherlv_27= ',' ( (lv_controllers_28_0= ruleController ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
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
        EObject lv_imports_1_0 = null;

        EObject lv_annotations_2_0 = null;

        EObject lv_models_8_0 = null;

        EObject lv_models_10_0 = null;

        EObject lv_views_14_0 = null;

        EObject lv_views_16_0 = null;

        EObject lv_events_20_0 = null;

        EObject lv_events_22_0 = null;

        EObject lv_controllers_26_0 = null;

        EObject lv_controllers_28_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:79:28: ( ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_annotations_2_0= ruleAnnotation ) )? otherlv_3= 'Component' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' (otherlv_6= 'models' otherlv_7= '{' ( (lv_models_8_0= ruleModel ) ) (otherlv_9= ',' ( (lv_models_10_0= ruleModel ) ) )* otherlv_11= '}' )? (otherlv_12= 'views' otherlv_13= '{' ( (lv_views_14_0= ruleView ) ) (otherlv_15= ',' ( (lv_views_16_0= ruleView ) ) )* otherlv_17= '}' )? (otherlv_18= 'events' otherlv_19= '{' ( (lv_events_20_0= ruleEvent ) ) (otherlv_21= ',' ( (lv_events_22_0= ruleEvent ) ) )* otherlv_23= '}' )? (otherlv_24= 'controllers' otherlv_25= '{' ( (lv_controllers_26_0= ruleController ) ) (otherlv_27= ',' ( (lv_controllers_28_0= ruleController ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:80:1: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_annotations_2_0= ruleAnnotation ) )? otherlv_3= 'Component' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' (otherlv_6= 'models' otherlv_7= '{' ( (lv_models_8_0= ruleModel ) ) (otherlv_9= ',' ( (lv_models_10_0= ruleModel ) ) )* otherlv_11= '}' )? (otherlv_12= 'views' otherlv_13= '{' ( (lv_views_14_0= ruleView ) ) (otherlv_15= ',' ( (lv_views_16_0= ruleView ) ) )* otherlv_17= '}' )? (otherlv_18= 'events' otherlv_19= '{' ( (lv_events_20_0= ruleEvent ) ) (otherlv_21= ',' ( (lv_events_22_0= ruleEvent ) ) )* otherlv_23= '}' )? (otherlv_24= 'controllers' otherlv_25= '{' ( (lv_controllers_26_0= ruleController ) ) (otherlv_27= ',' ( (lv_controllers_28_0= ruleController ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:80:1: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_annotations_2_0= ruleAnnotation ) )? otherlv_3= 'Component' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' (otherlv_6= 'models' otherlv_7= '{' ( (lv_models_8_0= ruleModel ) ) (otherlv_9= ',' ( (lv_models_10_0= ruleModel ) ) )* otherlv_11= '}' )? (otherlv_12= 'views' otherlv_13= '{' ( (lv_views_14_0= ruleView ) ) (otherlv_15= ',' ( (lv_views_16_0= ruleView ) ) )* otherlv_17= '}' )? (otherlv_18= 'events' otherlv_19= '{' ( (lv_events_20_0= ruleEvent ) ) (otherlv_21= ',' ( (lv_events_22_0= ruleEvent ) ) )* otherlv_23= '}' )? (otherlv_24= 'controllers' otherlv_25= '{' ( (lv_controllers_26_0= ruleController ) ) (otherlv_27= ',' ( (lv_controllers_28_0= ruleController ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:80:2: () ( (lv_imports_1_0= ruleImport ) )* ( (lv_annotations_2_0= ruleAnnotation ) )? otherlv_3= 'Component' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' (otherlv_6= 'models' otherlv_7= '{' ( (lv_models_8_0= ruleModel ) ) (otherlv_9= ',' ( (lv_models_10_0= ruleModel ) ) )* otherlv_11= '}' )? (otherlv_12= 'views' otherlv_13= '{' ( (lv_views_14_0= ruleView ) ) (otherlv_15= ',' ( (lv_views_16_0= ruleView ) ) )* otherlv_17= '}' )? (otherlv_18= 'events' otherlv_19= '{' ( (lv_events_20_0= ruleEvent ) ) (otherlv_21= ',' ( (lv_events_22_0= ruleEvent ) ) )* otherlv_23= '}' )? (otherlv_24= 'controllers' otherlv_25= '{' ( (lv_controllers_26_0= ruleController ) ) (otherlv_27= ',' ( (lv_controllers_28_0= ruleController ) ) )* otherlv_29= '}' )? otherlv_30= '}'
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:80:2: ()
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComponentAccess().getComponentAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:86:2: ( (lv_imports_1_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:87:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:87:1: (lv_imports_1_0= ruleImport )
            	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:88:3: lv_imports_1_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getImportsImportParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleImport_in_ruleComponent140);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_1_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:104:3: ( (lv_annotations_2_0= ruleAnnotation ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:105:1: (lv_annotations_2_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:105:1: (lv_annotations_2_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:106:3: lv_annotations_2_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentAccess().getAnnotationsAnnotationParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleComponent162);
                    lv_annotations_2_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_2_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleComponent175); 

                	newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getComponentKeyword_3());
                
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:126:1: ( (lv_name_4_0= RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:127:1: (lv_name_4_0= RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:127:1: (lv_name_4_0= RULE_ID )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:128:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleComponent192); 

            			newLeafNode(lv_name_4_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleComponent209); 

                	newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_5());
                
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:148:1: (otherlv_6= 'models' otherlv_7= '{' ( (lv_models_8_0= ruleModel ) ) (otherlv_9= ',' ( (lv_models_10_0= ruleModel ) ) )* otherlv_11= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:148:3: otherlv_6= 'models' otherlv_7= '{' ( (lv_models_8_0= ruleModel ) ) (otherlv_9= ',' ( (lv_models_10_0= ruleModel ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleComponent222); 

                        	newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getModelsKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleComponent234); 

                        	newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:156:1: ( (lv_models_8_0= ruleModel ) )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:157:1: (lv_models_8_0= ruleModel )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:157:1: (lv_models_8_0= ruleModel )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:158:3: lv_models_8_0= ruleModel
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentAccess().getModelsModelParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleModel_in_ruleComponent255);
                    lv_models_8_0=ruleModel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	        }
                           		add(
                           			current, 
                           			"models",
                            		lv_models_8_0, 
                            		"Model");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:174:2: (otherlv_9= ',' ( (lv_models_10_0= ruleModel ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:174:4: otherlv_9= ',' ( (lv_models_10_0= ruleModel ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleComponent268); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:178:1: ( (lv_models_10_0= ruleModel ) )
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:179:1: (lv_models_10_0= ruleModel )
                    	    {
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:179:1: (lv_models_10_0= ruleModel )
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:180:3: lv_models_10_0= ruleModel
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentAccess().getModelsModelParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleModel_in_ruleComponent289);
                    	    lv_models_10_0=ruleModel();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"models",
                    	            		lv_models_10_0, 
                    	            		"Model");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleComponent303); 

                        	newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:200:3: (otherlv_12= 'views' otherlv_13= '{' ( (lv_views_14_0= ruleView ) ) (otherlv_15= ',' ( (lv_views_16_0= ruleView ) ) )* otherlv_17= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:200:5: otherlv_12= 'views' otherlv_13= '{' ( (lv_views_14_0= ruleView ) ) (otherlv_15= ',' ( (lv_views_16_0= ruleView ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleComponent318); 

                        	newLeafNode(otherlv_12, grammarAccess.getComponentAccess().getViewsKeyword_7_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleComponent330); 

                        	newLeafNode(otherlv_13, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:208:1: ( (lv_views_14_0= ruleView ) )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:209:1: (lv_views_14_0= ruleView )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:209:1: (lv_views_14_0= ruleView )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:210:3: lv_views_14_0= ruleView
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentAccess().getViewsViewParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleView_in_ruleComponent351);
                    lv_views_14_0=ruleView();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	        }
                           		add(
                           			current, 
                           			"views",
                            		lv_views_14_0, 
                            		"View");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:226:2: (otherlv_15= ',' ( (lv_views_16_0= ruleView ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:226:4: otherlv_15= ',' ( (lv_views_16_0= ruleView ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleComponent364); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getComponentAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:230:1: ( (lv_views_16_0= ruleView ) )
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:231:1: (lv_views_16_0= ruleView )
                    	    {
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:231:1: (lv_views_16_0= ruleView )
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:232:3: lv_views_16_0= ruleView
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentAccess().getViewsViewParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleView_in_ruleComponent385);
                    	    lv_views_16_0=ruleView();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"views",
                    	            		lv_views_16_0, 
                    	            		"View");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleComponent399); 

                        	newLeafNode(otherlv_17, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:252:3: (otherlv_18= 'events' otherlv_19= '{' ( (lv_events_20_0= ruleEvent ) ) (otherlv_21= ',' ( (lv_events_22_0= ruleEvent ) ) )* otherlv_23= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:252:5: otherlv_18= 'events' otherlv_19= '{' ( (lv_events_20_0= ruleEvent ) ) (otherlv_21= ',' ( (lv_events_22_0= ruleEvent ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleComponent414); 

                        	newLeafNode(otherlv_18, grammarAccess.getComponentAccess().getEventsKeyword_8_0());
                        
                    otherlv_19=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleComponent426); 

                        	newLeafNode(otherlv_19, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:260:1: ( (lv_events_20_0= ruleEvent ) )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:261:1: (lv_events_20_0= ruleEvent )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:261:1: (lv_events_20_0= ruleEvent )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:262:3: lv_events_20_0= ruleEvent
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentAccess().getEventsEventParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEvent_in_ruleComponent447);
                    lv_events_20_0=ruleEvent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	        }
                           		add(
                           			current, 
                           			"events",
                            		lv_events_20_0, 
                            		"Event");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:278:2: (otherlv_21= ',' ( (lv_events_22_0= ruleEvent ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:278:4: otherlv_21= ',' ( (lv_events_22_0= ruleEvent ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleComponent460); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getComponentAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:282:1: ( (lv_events_22_0= ruleEvent ) )
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:283:1: (lv_events_22_0= ruleEvent )
                    	    {
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:283:1: (lv_events_22_0= ruleEvent )
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:284:3: lv_events_22_0= ruleEvent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentAccess().getEventsEventParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEvent_in_ruleComponent481);
                    	    lv_events_22_0=ruleEvent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"events",
                    	            		lv_events_22_0, 
                    	            		"Event");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleComponent495); 

                        	newLeafNode(otherlv_23, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:304:3: (otherlv_24= 'controllers' otherlv_25= '{' ( (lv_controllers_26_0= ruleController ) ) (otherlv_27= ',' ( (lv_controllers_28_0= ruleController ) ) )* otherlv_29= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:304:5: otherlv_24= 'controllers' otherlv_25= '{' ( (lv_controllers_26_0= ruleController ) ) (otherlv_27= ',' ( (lv_controllers_28_0= ruleController ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleComponent510); 

                        	newLeafNode(otherlv_24, grammarAccess.getComponentAccess().getControllersKeyword_9_0());
                        
                    otherlv_25=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleComponent522); 

                        	newLeafNode(otherlv_25, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:312:1: ( (lv_controllers_26_0= ruleController ) )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:313:1: (lv_controllers_26_0= ruleController )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:313:1: (lv_controllers_26_0= ruleController )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:314:3: lv_controllers_26_0= ruleController
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentAccess().getControllersControllerParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleController_in_ruleComponent543);
                    lv_controllers_26_0=ruleController();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	        }
                           		add(
                           			current, 
                           			"controllers",
                            		lv_controllers_26_0, 
                            		"Controller");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:330:2: (otherlv_27= ',' ( (lv_controllers_28_0= ruleController ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:330:4: otherlv_27= ',' ( (lv_controllers_28_0= ruleController ) )
                    	    {
                    	    otherlv_27=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleComponent556); 

                    	        	newLeafNode(otherlv_27, grammarAccess.getComponentAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:334:1: ( (lv_controllers_28_0= ruleController ) )
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:335:1: (lv_controllers_28_0= ruleController )
                    	    {
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:335:1: (lv_controllers_28_0= ruleController )
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:336:3: lv_controllers_28_0= ruleController
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentAccess().getControllersControllerParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleController_in_ruleComponent577);
                    	    lv_controllers_28_0=ruleController();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"controllers",
                    	            		lv_controllers_28_0, 
                    	            		"Controller");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleComponent591); 

                        	newLeafNode(otherlv_29, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_30=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleComponent605); 

                	newLeafNode(otherlv_30, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_10());
                

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


    // $ANTLR start "entryRuleImport"
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:368:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:369:2: (iv_ruleImport= ruleImport EOF )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:370:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImport_in_entryRuleImport641);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImport651); 

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:377:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:380:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:381:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:381:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:381:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleImport688); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:385:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:386:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:386:1: (lv_importURI_1_0= RULE_STRING )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:387:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleImport705); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleImport722); 

                	newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
                

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


    // $ANTLR start "entryRuleAnnotationAttributeValue"
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:415:1: entryRuleAnnotationAttributeValue returns [EObject current=null] : iv_ruleAnnotationAttributeValue= ruleAnnotationAttributeValue EOF ;
    public final EObject entryRuleAnnotationAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationAttributeValue = null;


        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:416:2: (iv_ruleAnnotationAttributeValue= ruleAnnotationAttributeValue EOF )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:417:2: iv_ruleAnnotationAttributeValue= ruleAnnotationAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAnnotationAttributeValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttributeValue_in_entryRuleAnnotationAttributeValue758);
            iv_ruleAnnotationAttributeValue=ruleAnnotationAttributeValue();

            state._fsp--;

             current =iv_ruleAnnotationAttributeValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationAttributeValue768); 

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:424:1: ruleAnnotationAttributeValue returns [EObject current=null] : this_SimpleValue_0= ruleSimpleValue ;
    public final EObject ruleAnnotationAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleValue_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:427:28: (this_SimpleValue_0= ruleSimpleValue )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:429:5: this_SimpleValue_0= ruleSimpleValue
            {
             
                    newCompositeNode(grammarAccess.getAnnotationAttributeValueAccess().getSimpleValueParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSimpleValue_in_ruleAnnotationAttributeValue814);
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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:445:1: entryRuleUIComponent returns [EObject current=null] : iv_ruleUIComponent= ruleUIComponent EOF ;
    public final EObject entryRuleUIComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIComponent = null;


        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:446:2: (iv_ruleUIComponent= ruleUIComponent EOF )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:447:2: iv_ruleUIComponent= ruleUIComponent EOF
            {
             newCompositeNode(grammarAccess.getUIComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUIComponent_in_entryRuleUIComponent848);
            iv_ruleUIComponent=ruleUIComponent();

            state._fsp--;

             current =iv_ruleUIComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUIComponent858); 

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:454:1: ruleUIComponent returns [EObject current=null] : (this_UILayout_0= ruleUILayout | this_UIInput_1= ruleUIInput | this_UIActions_2= ruleUIActions | this_UILabel_3= ruleUILabel ) ;
    public final EObject ruleUIComponent() throws RecognitionException {
        EObject current = null;

        EObject this_UILayout_0 = null;

        EObject this_UIInput_1 = null;

        EObject this_UIActions_2 = null;

        EObject this_UILabel_3 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:457:28: ( (this_UILayout_0= ruleUILayout | this_UIInput_1= ruleUIInput | this_UIActions_2= ruleUIActions | this_UILabel_3= ruleUILabel ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:458:1: (this_UILayout_0= ruleUILayout | this_UIInput_1= ruleUIInput | this_UIActions_2= ruleUIActions | this_UILabel_3= ruleUILabel )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:458:1: (this_UILayout_0= ruleUILayout | this_UIInput_1= ruleUIInput | this_UIActions_2= ruleUIActions | this_UILabel_3= ruleUILabel )
            int alt11=4;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:459:5: this_UILayout_0= ruleUILayout
                    {
                     
                            newCompositeNode(grammarAccess.getUIComponentAccess().getUILayoutParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUILayout_in_ruleUIComponent905);
                    this_UILayout_0=ruleUILayout();

                    state._fsp--;

                     
                            current = this_UILayout_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:469:5: this_UIInput_1= ruleUIInput
                    {
                     
                            newCompositeNode(grammarAccess.getUIComponentAccess().getUIInputParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUIInput_in_ruleUIComponent932);
                    this_UIInput_1=ruleUIInput();

                    state._fsp--;

                     
                            current = this_UIInput_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:479:5: this_UIActions_2= ruleUIActions
                    {
                     
                            newCompositeNode(grammarAccess.getUIComponentAccess().getUIActionsParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUIActions_in_ruleUIComponent959);
                    this_UIActions_2=ruleUIActions();

                    state._fsp--;

                     
                            current = this_UIActions_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:489:5: this_UILabel_3= ruleUILabel
                    {
                     
                            newCompositeNode(grammarAccess.getUIComponentAccess().getUILabelParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUILabel_in_ruleUIComponent986);
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


    // $ANTLR start "entryRuleUILayout"
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:505:1: entryRuleUILayout returns [EObject current=null] : iv_ruleUILayout= ruleUILayout EOF ;
    public final EObject entryRuleUILayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUILayout = null;


        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:506:2: (iv_ruleUILayout= ruleUILayout EOF )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:507:2: iv_ruleUILayout= ruleUILayout EOF
            {
             newCompositeNode(grammarAccess.getUILayoutRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUILayout_in_entryRuleUILayout1021);
            iv_ruleUILayout=ruleUILayout();

            state._fsp--;

             current =iv_ruleUILayout; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUILayout1031); 

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:514:1: ruleUILayout returns [EObject current=null] : (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleUIComponent ) )+ otherlv_4= '}' ) ;
    public final EObject ruleUILayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_components_3_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:517:28: ( (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleUIComponent ) )+ otherlv_4= '}' ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:518:1: (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleUIComponent ) )+ otherlv_4= '}' )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:518:1: (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleUIComponent ) )+ otherlv_4= '}' )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:518:3: otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleUIComponent ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleUILayout1068); 

                	newLeafNode(otherlv_0, grammarAccess.getUILayoutAccess().getLayoutKeyword_0());
                
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:522:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:523:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:523:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:524:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleUILayout1085); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUILayoutAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUILayoutRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleUILayout1102); 

                	newLeafNode(otherlv_2, grammarAccess.getUILayoutAccess().getLeftCurlyBracketKeyword_2());
                
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:544:1: ( (lv_components_3_0= ruleUIComponent ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=21 && LA12_0<=22)||LA12_0==30||LA12_0==33||LA12_0==35) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:545:1: (lv_components_3_0= ruleUIComponent )
            	    {
            	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:545:1: (lv_components_3_0= ruleUIComponent )
            	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:546:3: lv_components_3_0= ruleUIComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUILayoutAccess().getComponentsUIComponentParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleUIComponent_in_ruleUILayout1123);
            	    lv_components_3_0=ruleUIComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUILayoutRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_3_0, 
            	            		"UIComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleUILayout1136); 

                	newLeafNode(otherlv_4, grammarAccess.getUILayoutAccess().getRightCurlyBracketKeyword_4());
                

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


    // $ANTLR start "entryRuleAnnotation"
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:574:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:575:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:576:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation1172);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation1182); 

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:583:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleAnnotationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:586:28: ( (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleAnnotationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )* )? otherlv_6= ')' ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:587:1: (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleAnnotationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )* )? otherlv_6= ')' )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:587:1: (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleAnnotationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )* )? otherlv_6= ')' )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:587:3: otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleAnnotationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnnotation1219); 

                	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:591:1: ( (otherlv_1= RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:592:1: (otherlv_1= RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:592:1: (otherlv_1= RULE_ID )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:593:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnnotation1239); 

            		newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getAnnotationTypeAnnotationTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAnnotation1251); 

                	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2());
                
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:608:1: ( ( (lv_attributes_3_0= ruleAnnotationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:608:2: ( (lv_attributes_3_0= ruleAnnotationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )*
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:608:2: ( (lv_attributes_3_0= ruleAnnotationAttribute ) )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:609:1: (lv_attributes_3_0= ruleAnnotationAttribute )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:609:1: (lv_attributes_3_0= ruleAnnotationAttribute )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:610:3: lv_attributes_3_0= ruleAnnotationAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getAttributesAnnotationAttributeParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttribute_in_ruleAnnotation1273);
                    lv_attributes_3_0=ruleAnnotationAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_3_0, 
                            		"AnnotationAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:626:2: (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:626:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnnotation1286); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:630:1: ( (lv_attributes_5_0= ruleAnnotationAttribute ) )
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:631:1: (lv_attributes_5_0= ruleAnnotationAttribute )
                    	    {
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:631:1: (lv_attributes_5_0= ruleAnnotationAttribute )
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:632:3: lv_attributes_5_0= ruleAnnotationAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getAttributesAnnotationAttributeParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttribute_in_ruleAnnotation1307);
                    	    lv_attributes_5_0=ruleAnnotationAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_5_0, 
                    	            		"AnnotationAttribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAnnotation1323); 

                	newLeafNode(otherlv_6, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_4());
                

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


    // $ANTLR start "entryRuleModel"
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:660:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:661:2: (iv_ruleModel= ruleModel EOF )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:662:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel1359);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel1369); 

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:669:1: ruleModel returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) )? otherlv_5= ';' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_annotations_1_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:672:28: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) )? otherlv_5= ';' ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:673:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) )? otherlv_5= ';' )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:673:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) )? otherlv_5= ';' )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:673:2: () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) )? otherlv_5= ';'
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:673:2: ()
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:674:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:679:2: ( (lv_annotations_1_0= ruleAnnotation ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:680:1: (lv_annotations_1_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:680:1: (lv_annotations_1_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:681:3: lv_annotations_1_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleModel1424);
                    lv_annotations_1_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_1_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:697:3: ( (lv_name_2_0= RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:698:1: (lv_name_2_0= RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:698:1: (lv_name_2_0= RULE_ID )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:699:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModel1442); 

            			newLeafNode(lv_name_2_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleModel1459); 

                	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getColonKeyword_3());
                
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:719:1: ( (otherlv_4= RULE_ID ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:720:1: (otherlv_4= RULE_ID )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:720:1: (otherlv_4= RULE_ID )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:721:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModel1479); 

                    		newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRootEntityEntityCrossReference_4_0()); 
                    	

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleModel1492); 

                	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getSemicolonKeyword_5());
                

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:744:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:745:2: (iv_ruleView= ruleView EOF )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:746:2: iv_ruleView= ruleView EOF
            {
             newCompositeNode(grammarAccess.getViewRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleView_in_entryRuleView1528);
            iv_ruleView=ruleView();

            state._fsp--;

             current =iv_ruleView; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleView1538); 

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:753:1: ruleView returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_rootComponent_4_0= ruleUILayout ) ) otherlv_5= '}' ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_rootComponent_4_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:756:28: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_rootComponent_4_0= ruleUILayout ) ) otherlv_5= '}' ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:757:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_rootComponent_4_0= ruleUILayout ) ) otherlv_5= '}' )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:757:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_rootComponent_4_0= ruleUILayout ) ) otherlv_5= '}' )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:757:2: () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_rootComponent_4_0= ruleUILayout ) ) otherlv_5= '}'
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:757:2: ()
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:758:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getViewAccess().getViewAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:763:2: ( (lv_annotations_1_0= ruleAnnotation ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:764:1: (lv_annotations_1_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:764:1: (lv_annotations_1_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:765:3: lv_annotations_1_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getViewAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleView1593);
                    lv_annotations_1_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getViewRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_1_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:781:3: ( (lv_name_2_0= RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:782:1: (lv_name_2_0= RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:782:1: (lv_name_2_0= RULE_ID )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:783:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleView1611); 

            			newLeafNode(lv_name_2_0, grammarAccess.getViewAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleView1628); 

                	newLeafNode(otherlv_3, grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:803:1: ( (lv_rootComponent_4_0= ruleUILayout ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:804:1: (lv_rootComponent_4_0= ruleUILayout )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:804:1: (lv_rootComponent_4_0= ruleUILayout )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:805:3: lv_rootComponent_4_0= ruleUILayout
            {
             
            	        newCompositeNode(grammarAccess.getViewAccess().getRootComponentUILayoutParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleUILayout_in_ruleView1649);
            lv_rootComponent_4_0=ruleUILayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getViewRule());
            	        }
                   		set(
                   			current, 
                   			"rootComponent",
                    		lv_rootComponent_4_0, 
                    		"UILayout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleView1661); 

                	newLeafNode(otherlv_5, grammarAccess.getViewAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:833:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:834:2: (iv_ruleEvent= ruleEvent EOF )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:835:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvent_in_entryRuleEvent1697);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEvent1707); 

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:842:1: ruleEvent returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'Event' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ';' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_annotations_1_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:845:28: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'Event' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ';' ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:846:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'Event' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ';' )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:846:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'Event' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ';' )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:846:2: () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'Event' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ';'
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:846:2: ()
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:847:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEventAccess().getEventAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:852:2: ( (lv_annotations_1_0= ruleAnnotation ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:853:1: (lv_annotations_1_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:853:1: (lv_annotations_1_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:854:3: lv_annotations_1_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleEvent1762);
                    lv_annotations_1_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_1_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEvent1775); 

                	newLeafNode(otherlv_2, grammarAccess.getEventAccess().getEventKeyword_2());
                
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:874:1: ( (lv_name_3_0= RULE_STRING ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:875:1: (lv_name_3_0= RULE_STRING )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:875:1: (lv_name_3_0= RULE_STRING )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:876:3: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEvent1792); 

            			newLeafNode(lv_name_3_0, grammarAccess.getEventAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEvent1809); 

                	newLeafNode(otherlv_4, grammarAccess.getEventAccess().getSemicolonKeyword_4());
                

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:904:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:905:2: (iv_ruleController= ruleController EOF )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:906:2: iv_ruleController= ruleController EOF
            {
             newCompositeNode(grammarAccess.getControllerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleController_in_entryRuleController1845);
            iv_ruleController=ruleController();

            state._fsp--;

             current =iv_ruleController; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleController1855); 

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:913:1: ruleController returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= '}' )? (otherlv_10= 'views' otherlv_11= '{' ( (lv_views_12_0= ruleControllerView ) ) (otherlv_13= ',' ( (lv_views_14_0= ruleControllerView ) ) )* otherlv_15= '}' )? (otherlv_16= 'eventActions' otherlv_17= '{' ( (lv_eventActions_18_0= ruleEventAction ) ) (otherlv_19= ',' ( (lv_eventActions_20_0= ruleEventAction ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleController() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
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
        EObject lv_annotations_1_0 = null;

        EObject lv_actions_6_0 = null;

        EObject lv_actions_8_0 = null;

        EObject lv_views_12_0 = null;

        EObject lv_views_14_0 = null;

        EObject lv_eventActions_18_0 = null;

        EObject lv_eventActions_20_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:916:28: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= '}' )? (otherlv_10= 'views' otherlv_11= '{' ( (lv_views_12_0= ruleControllerView ) ) (otherlv_13= ',' ( (lv_views_14_0= ruleControllerView ) ) )* otherlv_15= '}' )? (otherlv_16= 'eventActions' otherlv_17= '{' ( (lv_eventActions_18_0= ruleEventAction ) ) (otherlv_19= ',' ( (lv_eventActions_20_0= ruleEventAction ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:917:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= '}' )? (otherlv_10= 'views' otherlv_11= '{' ( (lv_views_12_0= ruleControllerView ) ) (otherlv_13= ',' ( (lv_views_14_0= ruleControllerView ) ) )* otherlv_15= '}' )? (otherlv_16= 'eventActions' otherlv_17= '{' ( (lv_eventActions_18_0= ruleEventAction ) ) (otherlv_19= ',' ( (lv_eventActions_20_0= ruleEventAction ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:917:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= '}' )? (otherlv_10= 'views' otherlv_11= '{' ( (lv_views_12_0= ruleControllerView ) ) (otherlv_13= ',' ( (lv_views_14_0= ruleControllerView ) ) )* otherlv_15= '}' )? (otherlv_16= 'eventActions' otherlv_17= '{' ( (lv_eventActions_18_0= ruleEventAction ) ) (otherlv_19= ',' ( (lv_eventActions_20_0= ruleEventAction ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:917:2: () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= '}' )? (otherlv_10= 'views' otherlv_11= '{' ( (lv_views_12_0= ruleControllerView ) ) (otherlv_13= ',' ( (lv_views_14_0= ruleControllerView ) ) )* otherlv_15= '}' )? (otherlv_16= 'eventActions' otherlv_17= '{' ( (lv_eventActions_18_0= ruleEventAction ) ) (otherlv_19= ',' ( (lv_eventActions_20_0= ruleEventAction ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:917:2: ()
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:918:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getControllerAccess().getControllerAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:923:2: ( (lv_annotations_1_0= ruleAnnotation ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:924:1: (lv_annotations_1_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:924:1: (lv_annotations_1_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:925:3: lv_annotations_1_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getControllerAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleController1910);
                    lv_annotations_1_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getControllerRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_1_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:941:3: ( (lv_name_2_0= RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:942:1: (lv_name_2_0= RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:942:1: (lv_name_2_0= RULE_ID )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:943:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleController1928); 

            			newLeafNode(lv_name_2_0, grammarAccess.getControllerAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getControllerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleController1945); 

                	newLeafNode(otherlv_3, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:963:1: (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:963:3: otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleController1958); 

                        	newLeafNode(otherlv_4, grammarAccess.getControllerAccess().getActionsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleController1970); 

                        	newLeafNode(otherlv_5, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:971:1: ( (lv_actions_6_0= ruleAction ) )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:972:1: (lv_actions_6_0= ruleAction )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:972:1: (lv_actions_6_0= ruleAction )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:973:3: lv_actions_6_0= ruleAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getControllerAccess().getActionsActionParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleController1991);
                    lv_actions_6_0=ruleAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getControllerRule());
                    	        }
                           		add(
                           			current, 
                           			"actions",
                            		lv_actions_6_0, 
                            		"Action");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:989:2: (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==14) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:989:4: otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleController2004); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getControllerAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:993:1: ( (lv_actions_8_0= ruleAction ) )
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:994:1: (lv_actions_8_0= ruleAction )
                    	    {
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:994:1: (lv_actions_8_0= ruleAction )
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:995:3: lv_actions_8_0= ruleAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getControllerAccess().getActionsActionParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleController2025);
                    	    lv_actions_8_0=ruleAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getControllerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"actions",
                    	            		lv_actions_8_0, 
                    	            		"Action");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleController2039); 

                        	newLeafNode(otherlv_9, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1015:3: (otherlv_10= 'views' otherlv_11= '{' ( (lv_views_12_0= ruleControllerView ) ) (otherlv_13= ',' ( (lv_views_14_0= ruleControllerView ) ) )* otherlv_15= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==16) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1015:5: otherlv_10= 'views' otherlv_11= '{' ( (lv_views_12_0= ruleControllerView ) ) (otherlv_13= ',' ( (lv_views_14_0= ruleControllerView ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleController2054); 

                        	newLeafNode(otherlv_10, grammarAccess.getControllerAccess().getViewsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleController2066); 

                        	newLeafNode(otherlv_11, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1023:1: ( (lv_views_12_0= ruleControllerView ) )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1024:1: (lv_views_12_0= ruleControllerView )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1024:1: (lv_views_12_0= ruleControllerView )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1025:3: lv_views_12_0= ruleControllerView
                    {
                     
                    	        newCompositeNode(grammarAccess.getControllerAccess().getViewsControllerViewParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleControllerView_in_ruleController2087);
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

                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1041:2: (otherlv_13= ',' ( (lv_views_14_0= ruleControllerView ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==14) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1041:4: otherlv_13= ',' ( (lv_views_14_0= ruleControllerView ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleController2100); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getControllerAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1045:1: ( (lv_views_14_0= ruleControllerView ) )
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1046:1: (lv_views_14_0= ruleControllerView )
                    	    {
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1046:1: (lv_views_14_0= ruleControllerView )
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1047:3: lv_views_14_0= ruleControllerView
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getControllerAccess().getViewsControllerViewParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleControllerView_in_ruleController2121);
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
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleController2135); 

                        	newLeafNode(otherlv_15, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1067:3: (otherlv_16= 'eventActions' otherlv_17= '{' ( (lv_eventActions_18_0= ruleEventAction ) ) (otherlv_19= ',' ( (lv_eventActions_20_0= ruleEventAction ) ) )* otherlv_21= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1067:5: otherlv_16= 'eventActions' otherlv_17= '{' ( (lv_eventActions_18_0= ruleEventAction ) ) (otherlv_19= ',' ( (lv_eventActions_20_0= ruleEventAction ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleController2150); 

                        	newLeafNode(otherlv_16, grammarAccess.getControllerAccess().getEventActionsKeyword_6_0());
                        
                    otherlv_17=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleController2162); 

                        	newLeafNode(otherlv_17, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1075:1: ( (lv_eventActions_18_0= ruleEventAction ) )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1076:1: (lv_eventActions_18_0= ruleEventAction )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1076:1: (lv_eventActions_18_0= ruleEventAction )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1077:3: lv_eventActions_18_0= ruleEventAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getControllerAccess().getEventActionsEventActionParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEventAction_in_ruleController2183);
                    lv_eventActions_18_0=ruleEventAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getControllerRule());
                    	        }
                           		add(
                           			current, 
                           			"eventActions",
                            		lv_eventActions_18_0, 
                            		"EventAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1093:2: (otherlv_19= ',' ( (lv_eventActions_20_0= ruleEventAction ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==14) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1093:4: otherlv_19= ',' ( (lv_eventActions_20_0= ruleEventAction ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleController2196); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getControllerAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1097:1: ( (lv_eventActions_20_0= ruleEventAction ) )
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1098:1: (lv_eventActions_20_0= ruleEventAction )
                    	    {
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1098:1: (lv_eventActions_20_0= ruleEventAction )
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1099:3: lv_eventActions_20_0= ruleEventAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getControllerAccess().getEventActionsEventActionParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEventAction_in_ruleController2217);
                    	    lv_eventActions_20_0=ruleEventAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getControllerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eventActions",
                    	            		lv_eventActions_20_0, 
                    	            		"EventAction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleController2231); 

                        	newLeafNode(otherlv_21, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleController2245); 

                	newLeafNode(otherlv_22, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleAnnotationAttribute"
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1131:1: entryRuleAnnotationAttribute returns [EObject current=null] : iv_ruleAnnotationAttribute= ruleAnnotationAttribute EOF ;
    public final EObject entryRuleAnnotationAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationAttribute = null;


        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1132:2: (iv_ruleAnnotationAttribute= ruleAnnotationAttribute EOF )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1133:2: iv_ruleAnnotationAttribute= ruleAnnotationAttribute EOF
            {
             newCompositeNode(grammarAccess.getAnnotationAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttribute_in_entryRuleAnnotationAttribute2281);
            iv_ruleAnnotationAttribute=ruleAnnotationAttribute();

            state._fsp--;

             current =iv_ruleAnnotationAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationAttribute2291); 

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1140:1: ruleAnnotationAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAnnotationAttributeValue ) ) ) ;
    public final EObject ruleAnnotationAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1143:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAnnotationAttributeValue ) ) ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1144:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAnnotationAttributeValue ) ) )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1144:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAnnotationAttributeValue ) ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1144:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAnnotationAttributeValue ) )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1144:2: ( (otherlv_0= RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1145:1: (otherlv_0= RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1145:1: (otherlv_0= RULE_ID )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1146:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationAttributeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnnotationAttribute2336); 

            		newLeafNode(otherlv_0, grammarAccess.getAnnotationAttributeAccess().getAttributeAnnotationTypeAttributeCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAnnotationAttribute2348); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationAttributeAccess().getEqualsSignKeyword_1());
                
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1161:1: ( (lv_value_2_0= ruleAnnotationAttributeValue ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1162:1: (lv_value_2_0= ruleAnnotationAttributeValue )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1162:1: (lv_value_2_0= ruleAnnotationAttributeValue )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1163:3: lv_value_2_0= ruleAnnotationAttributeValue
            {
             
            	        newCompositeNode(grammarAccess.getAnnotationAttributeAccess().getValueAnnotationAttributeValueParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttributeValue_in_ruleAnnotationAttribute2369);
            lv_value_2_0=ruleAnnotationAttributeValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnnotationAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"AnnotationAttributeValue");
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
    // $ANTLR end "ruleAnnotationAttribute"


    // $ANTLR start "entryRuleSimpleValue"
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1187:1: entryRuleSimpleValue returns [EObject current=null] : iv_ruleSimpleValue= ruleSimpleValue EOF ;
    public final EObject entryRuleSimpleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleValue = null;


        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1188:2: (iv_ruleSimpleValue= ruleSimpleValue EOF )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1189:2: iv_ruleSimpleValue= ruleSimpleValue EOF
            {
             newCompositeNode(grammarAccess.getSimpleValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue2405);
            iv_ruleSimpleValue=ruleSimpleValue();

            state._fsp--;

             current =iv_ruleSimpleValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleValue2415); 

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1196:1: ruleSimpleValue returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSimpleValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1199:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1200:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1200:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1200:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1200:2: ()
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1201:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleValueAccess().getSimpleValueAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1206:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1207:1: (lv_value_1_0= RULE_STRING )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1207:1: (lv_value_1_0= RULE_STRING )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1208:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSimpleValue2466); 

            			newLeafNode(lv_value_1_0, grammarAccess.getSimpleValueAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleSimpleValue"


    // $ANTLR start "entryRuleUIInput"
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1232:1: entryRuleUIInput returns [EObject current=null] : iv_ruleUIInput= ruleUIInput EOF ;
    public final EObject entryRuleUIInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIInput = null;


        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1233:2: (iv_ruleUIInput= ruleUIInput EOF )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1234:2: iv_ruleUIInput= ruleUIInput EOF
            {
             newCompositeNode(grammarAccess.getUIInputRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUIInput_in_entryRuleUIInput2507);
            iv_ruleUIInput=ruleUIInput();

            state._fsp--;

             current =iv_ruleUIInput; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUIInput2517); 

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1241:1: ruleUIInput returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'input' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'type' ( (lv_type_6_0= RULE_ID ) ) )? (otherlv_7= 'value' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleUIInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_type_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_annotations_1_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1244:28: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'input' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'type' ( (lv_type_6_0= RULE_ID ) ) )? (otherlv_7= 'value' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1245:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'input' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'type' ( (lv_type_6_0= RULE_ID ) ) )? (otherlv_7= 'value' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1245:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'input' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'type' ( (lv_type_6_0= RULE_ID ) ) )? (otherlv_7= 'value' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1245:2: () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'input' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'type' ( (lv_type_6_0= RULE_ID ) ) )? (otherlv_7= 'value' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}'
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1245:2: ()
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1246:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUIInputAccess().getUIInputAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1251:2: ( (lv_annotations_1_0= ruleAnnotation ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1252:1: (lv_annotations_1_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1252:1: (lv_annotations_1_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1253:3: lv_annotations_1_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getUIInputAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleUIInput2572);
                    lv_annotations_1_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUIInputRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_1_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleUIInput2585); 

                	newLeafNode(otherlv_2, grammarAccess.getUIInputAccess().getInputKeyword_2());
                
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1273:1: ( (lv_name_3_0= RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1274:1: (lv_name_3_0= RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1274:1: (lv_name_3_0= RULE_ID )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1275:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleUIInput2602); 

            			newLeafNode(lv_name_3_0, grammarAccess.getUIInputAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUIInputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleUIInput2619); 

                	newLeafNode(otherlv_4, grammarAccess.getUIInputAccess().getLeftCurlyBracketKeyword_4());
                
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1295:1: (otherlv_5= 'type' ( (lv_type_6_0= RULE_ID ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1295:3: otherlv_5= 'type' ( (lv_type_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleUIInput2632); 

                        	newLeafNode(otherlv_5, grammarAccess.getUIInputAccess().getTypeKeyword_5_0());
                        
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1299:1: ( (lv_type_6_0= RULE_ID ) )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1300:1: (lv_type_6_0= RULE_ID )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1300:1: (lv_type_6_0= RULE_ID )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1301:3: lv_type_6_0= RULE_ID
                    {
                    lv_type_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleUIInput2649); 

                    			newLeafNode(lv_type_6_0, grammarAccess.getUIInputAccess().getTypeIDTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUIInputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_6_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1317:4: (otherlv_7= 'value' ( (otherlv_8= RULE_ID ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1317:6: otherlv_7= 'value' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleUIInput2669); 

                        	newLeafNode(otherlv_7, grammarAccess.getUIInputAccess().getValueKeyword_6_0());
                        
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1321:1: ( (otherlv_8= RULE_ID ) )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1322:1: (otherlv_8= RULE_ID )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1322:1: (otherlv_8= RULE_ID )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1323:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUIInputRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleUIInput2689); 

                    		newLeafNode(otherlv_8, grammarAccess.getUIInputAccess().getValueAttributeCrossReference_6_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleUIInput2703); 

                	newLeafNode(otherlv_9, grammarAccess.getUIInputAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1346:1: entryRuleUIActions returns [EObject current=null] : iv_ruleUIActions= ruleUIActions EOF ;
    public final EObject entryRuleUIActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIActions = null;


        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1347:2: (iv_ruleUIActions= ruleUIActions EOF )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1348:2: iv_ruleUIActions= ruleUIActions EOF
            {
             newCompositeNode(grammarAccess.getUIActionsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUIActions_in_entryRuleUIActions2739);
            iv_ruleUIActions=ruleUIActions();

            state._fsp--;

             current =iv_ruleUIActions; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUIActions2749); 

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1355:1: ruleUIActions returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'action' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'type' ( (lv_type_6_0= RULE_STRING ) ) )? (otherlv_7= 'triggerEvent' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleUIActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_type_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_annotations_1_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1358:28: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'action' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'type' ( (lv_type_6_0= RULE_STRING ) ) )? (otherlv_7= 'triggerEvent' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1359:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'action' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'type' ( (lv_type_6_0= RULE_STRING ) ) )? (otherlv_7= 'triggerEvent' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1359:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'action' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'type' ( (lv_type_6_0= RULE_STRING ) ) )? (otherlv_7= 'triggerEvent' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1359:2: () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'action' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'type' ( (lv_type_6_0= RULE_STRING ) ) )? (otherlv_7= 'triggerEvent' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}'
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1359:2: ()
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1360:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUIActionsAccess().getUIActionsAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1365:2: ( (lv_annotations_1_0= ruleAnnotation ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==22) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1366:1: (lv_annotations_1_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1366:1: (lv_annotations_1_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1367:3: lv_annotations_1_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getUIActionsAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleUIActions2804);
                    lv_annotations_1_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUIActionsRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_1_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleUIActions2817); 

                	newLeafNode(otherlv_2, grammarAccess.getUIActionsAccess().getActionKeyword_2());
                
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1387:1: ( (lv_name_3_0= RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1388:1: (lv_name_3_0= RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1388:1: (lv_name_3_0= RULE_ID )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1389:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleUIActions2834); 

            			newLeafNode(lv_name_3_0, grammarAccess.getUIActionsAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUIActionsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleUIActions2851); 

                	newLeafNode(otherlv_4, grammarAccess.getUIActionsAccess().getLeftCurlyBracketKeyword_4());
                
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1409:1: (otherlv_5= 'type' ( (lv_type_6_0= RULE_STRING ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1409:3: otherlv_5= 'type' ( (lv_type_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleUIActions2864); 

                        	newLeafNode(otherlv_5, grammarAccess.getUIActionsAccess().getTypeKeyword_5_0());
                        
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1413:1: ( (lv_type_6_0= RULE_STRING ) )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1414:1: (lv_type_6_0= RULE_STRING )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1414:1: (lv_type_6_0= RULE_STRING )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1415:3: lv_type_6_0= RULE_STRING
                    {
                    lv_type_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleUIActions2881); 

                    			newLeafNode(lv_type_6_0, grammarAccess.getUIActionsAccess().getTypeSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUIActionsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1431:4: (otherlv_7= 'triggerEvent' ( (otherlv_8= RULE_ID ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1431:6: otherlv_7= 'triggerEvent' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleUIActions2901); 

                        	newLeafNode(otherlv_7, grammarAccess.getUIActionsAccess().getTriggerEventKeyword_6_0());
                        
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1435:1: ( (otherlv_8= RULE_ID ) )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1436:1: (otherlv_8= RULE_ID )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1436:1: (otherlv_8= RULE_ID )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1437:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUIActionsRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleUIActions2921); 

                    		newLeafNode(otherlv_8, grammarAccess.getUIActionsAccess().getTriggerEventEventCrossReference_6_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleUIActions2935); 

                	newLeafNode(otherlv_9, grammarAccess.getUIActionsAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1460:1: entryRuleUILabel returns [EObject current=null] : iv_ruleUILabel= ruleUILabel EOF ;
    public final EObject entryRuleUILabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUILabel = null;


        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1461:2: (iv_ruleUILabel= ruleUILabel EOF )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1462:2: iv_ruleUILabel= ruleUILabel EOF
            {
             newCompositeNode(grammarAccess.getUILabelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUILabel_in_entryRuleUILabel2971);
            iv_ruleUILabel=ruleUILabel();

            state._fsp--;

             current =iv_ruleUILabel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUILabel2981); 

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1469:1: ruleUILabel returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'label' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'type' ( (lv_type_6_0= RULE_STRING ) ) )? (otherlv_7= 'text' ( (lv_text_8_0= RULE_STRING ) ) )? (otherlv_9= 'value' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleUILabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_type_6_0=null;
        Token otherlv_7=null;
        Token lv_text_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_annotations_1_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1472:28: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'label' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'type' ( (lv_type_6_0= RULE_STRING ) ) )? (otherlv_7= 'text' ( (lv_text_8_0= RULE_STRING ) ) )? (otherlv_9= 'value' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1473:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'label' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'type' ( (lv_type_6_0= RULE_STRING ) ) )? (otherlv_7= 'text' ( (lv_text_8_0= RULE_STRING ) ) )? (otherlv_9= 'value' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1473:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'label' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'type' ( (lv_type_6_0= RULE_STRING ) ) )? (otherlv_7= 'text' ( (lv_text_8_0= RULE_STRING ) ) )? (otherlv_9= 'value' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1473:2: () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'label' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'type' ( (lv_type_6_0= RULE_STRING ) ) )? (otherlv_7= 'text' ( (lv_text_8_0= RULE_STRING ) ) )? (otherlv_9= 'value' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}'
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1473:2: ()
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1474:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUILabelAccess().getUILabelAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1479:2: ( (lv_annotations_1_0= ruleAnnotation ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==22) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1480:1: (lv_annotations_1_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1480:1: (lv_annotations_1_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1481:3: lv_annotations_1_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getUILabelAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleUILabel3036);
                    lv_annotations_1_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUILabelRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_1_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleUILabel3049); 

                	newLeafNode(otherlv_2, grammarAccess.getUILabelAccess().getLabelKeyword_2());
                
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1501:1: ( (lv_name_3_0= RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1502:1: (lv_name_3_0= RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1502:1: (lv_name_3_0= RULE_ID )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1503:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleUILabel3066); 

            			newLeafNode(lv_name_3_0, grammarAccess.getUILabelAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUILabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleUILabel3083); 

                	newLeafNode(otherlv_4, grammarAccess.getUILabelAccess().getLeftCurlyBracketKeyword_4());
                
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1523:1: (otherlv_5= 'type' ( (lv_type_6_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1523:3: otherlv_5= 'type' ( (lv_type_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleUILabel3096); 

                        	newLeafNode(otherlv_5, grammarAccess.getUILabelAccess().getTypeKeyword_5_0());
                        
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1527:1: ( (lv_type_6_0= RULE_STRING ) )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1528:1: (lv_type_6_0= RULE_STRING )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1528:1: (lv_type_6_0= RULE_STRING )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1529:3: lv_type_6_0= RULE_STRING
                    {
                    lv_type_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleUILabel3113); 

                    			newLeafNode(lv_type_6_0, grammarAccess.getUILabelAccess().getTypeSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUILabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1545:4: (otherlv_7= 'text' ( (lv_text_8_0= RULE_STRING ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1545:6: otherlv_7= 'text' ( (lv_text_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleUILabel3133); 

                        	newLeafNode(otherlv_7, grammarAccess.getUILabelAccess().getTextKeyword_6_0());
                        
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1549:1: ( (lv_text_8_0= RULE_STRING ) )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1550:1: (lv_text_8_0= RULE_STRING )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1550:1: (lv_text_8_0= RULE_STRING )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1551:3: lv_text_8_0= RULE_STRING
                    {
                    lv_text_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleUILabel3150); 

                    			newLeafNode(lv_text_8_0, grammarAccess.getUILabelAccess().getTextSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUILabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_8_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1567:4: (otherlv_9= 'value' ( (otherlv_10= RULE_ID ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==32) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1567:6: otherlv_9= 'value' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleUILabel3170); 

                        	newLeafNode(otherlv_9, grammarAccess.getUILabelAccess().getValueKeyword_7_0());
                        
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1571:1: ( (otherlv_10= RULE_ID ) )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1572:1: (otherlv_10= RULE_ID )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1572:1: (otherlv_10= RULE_ID )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1573:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUILabelRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleUILabel3190); 

                    		newLeafNode(otherlv_10, grammarAccess.getUILabelAccess().getValueAttributeCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleUILabel3204); 

                	newLeafNode(otherlv_11, grammarAccess.getUILabelAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1596:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1597:2: (iv_ruleAction= ruleAction EOF )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1598:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction3240);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction3250); 

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1605:1: ruleAction returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'preExecutionEvent' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'postExecutionEvent' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'triggerEvents' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? otherlv_14= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_annotations_1_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1608:28: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'preExecutionEvent' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'postExecutionEvent' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'triggerEvents' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? otherlv_14= '}' ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1609:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'preExecutionEvent' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'postExecutionEvent' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'triggerEvents' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? otherlv_14= '}' )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1609:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'preExecutionEvent' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'postExecutionEvent' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'triggerEvents' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? otherlv_14= '}' )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1609:2: () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'preExecutionEvent' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'postExecutionEvent' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'triggerEvents' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? otherlv_14= '}'
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1609:2: ()
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1610:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActionAccess().getActionAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1615:2: ( (lv_annotations_1_0= ruleAnnotation ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==22) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1616:1: (lv_annotations_1_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1616:1: (lv_annotations_1_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1617:3: lv_annotations_1_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAction3305);
                    lv_annotations_1_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_1_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1633:3: ( (lv_name_2_0= RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1634:1: (lv_name_2_0= RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1634:1: (lv_name_2_0= RULE_ID )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1635:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAction3323); 

            			newLeafNode(lv_name_2_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAction3340); 

                	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1655:1: (otherlv_4= 'preExecutionEvent' ( (otherlv_5= RULE_ID ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1655:3: otherlv_4= 'preExecutionEvent' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAction3353); 

                        	newLeafNode(otherlv_4, grammarAccess.getActionAccess().getPreExecutionEventKeyword_4_0());
                        
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1659:1: ( (otherlv_5= RULE_ID ) )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1660:1: (otherlv_5= RULE_ID )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1660:1: (otherlv_5= RULE_ID )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1661:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAction3373); 

                    		newLeafNode(otherlv_5, grammarAccess.getActionAccess().getPreExecutionEventEventCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1672:4: (otherlv_6= 'postExecutionEvent' ( (otherlv_7= RULE_ID ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1672:6: otherlv_6= 'postExecutionEvent' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleAction3388); 

                        	newLeafNode(otherlv_6, grammarAccess.getActionAccess().getPostExecutionEventKeyword_5_0());
                        
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1676:1: ( (otherlv_7= RULE_ID ) )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1677:1: (otherlv_7= RULE_ID )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1677:1: (otherlv_7= RULE_ID )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1678:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAction3408); 

                    		newLeafNode(otherlv_7, grammarAccess.getActionAccess().getPostExecutionEventEventCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1689:4: (otherlv_8= 'triggerEvents' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==39) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1689:6: otherlv_8= 'triggerEvents' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAction3423); 

                        	newLeafNode(otherlv_8, grammarAccess.getActionAccess().getTriggerEventsKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAction3435); 

                        	newLeafNode(otherlv_9, grammarAccess.getActionAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1697:1: ( (otherlv_10= RULE_ID ) )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1698:1: (otherlv_10= RULE_ID )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1698:1: (otherlv_10= RULE_ID )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1699:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAction3455); 

                    		newLeafNode(otherlv_10, grammarAccess.getActionAccess().getTriggerEventsEventCrossReference_6_2_0()); 
                    	

                    }


                    }

                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1710:2: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==14) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1710:4: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAction3468); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getActionAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1714:1: ( (otherlv_12= RULE_ID ) )
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1715:1: (otherlv_12= RULE_ID )
                    	    {
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1715:1: (otherlv_12= RULE_ID )
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1716:3: otherlv_12= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActionRule());
                    	    	        }
                    	            
                    	    otherlv_12=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAction3488); 

                    	    		newLeafNode(otherlv_12, grammarAccess.getActionAccess().getTriggerEventsEventCrossReference_6_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAction3502); 

                        	newLeafNode(otherlv_13, grammarAccess.getActionAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAction3516); 

                	newLeafNode(otherlv_14, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1743:1: entryRuleControllerView returns [EObject current=null] : iv_ruleControllerView= ruleControllerView EOF ;
    public final EObject entryRuleControllerView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControllerView = null;


        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1744:2: (iv_ruleControllerView= ruleControllerView EOF )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1745:2: iv_ruleControllerView= ruleControllerView EOF
            {
             newCompositeNode(grammarAccess.getControllerViewRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleControllerView_in_entryRuleControllerView3552);
            iv_ruleControllerView=ruleControllerView();

            state._fsp--;

             current =iv_ruleControllerView; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleControllerView3562); 

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1752:1: ruleControllerView returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )? otherlv_1= 'view' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'models' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? otherlv_9= ';' ) ;
    public final EObject ruleControllerView() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1755:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )? otherlv_1= 'view' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'models' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? otherlv_9= ';' ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1756:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )? otherlv_1= 'view' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'models' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? otherlv_9= ';' )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1756:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )? otherlv_1= 'view' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'models' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? otherlv_9= ';' )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1756:2: ( (lv_annotations_0_0= ruleAnnotation ) )? otherlv_1= 'view' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'models' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? otherlv_9= ';'
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1756:2: ( (lv_annotations_0_0= ruleAnnotation ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==22) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1757:1: (lv_annotations_0_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1757:1: (lv_annotations_0_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1758:3: lv_annotations_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getControllerViewAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleControllerView3608);
                    lv_annotations_0_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getControllerViewRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_0_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleControllerView3621); 

                	newLeafNode(otherlv_1, grammarAccess.getControllerViewAccess().getViewKeyword_1());
                
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1778:1: ( (otherlv_2= RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1779:1: (otherlv_2= RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1779:1: (otherlv_2= RULE_ID )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1780:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getControllerViewRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleControllerView3641); 

            		newLeafNode(otherlv_2, grammarAccess.getControllerViewAccess().getViewViewCrossReference_2_0()); 
            	

            }


            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1791:2: (otherlv_3= 'models' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==13) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1791:4: otherlv_3= 'models' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleControllerView3654); 

                        	newLeafNode(otherlv_3, grammarAccess.getControllerViewAccess().getModelsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleControllerView3666); 

                        	newLeafNode(otherlv_4, grammarAccess.getControllerViewAccess().getLeftParenthesisKeyword_3_1());
                        
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1799:1: ( (otherlv_5= RULE_ID ) )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1800:1: (otherlv_5= RULE_ID )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1800:1: (otherlv_5= RULE_ID )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1801:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getControllerViewRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleControllerView3686); 

                    		newLeafNode(otherlv_5, grammarAccess.getControllerViewAccess().getModelsModelCrossReference_3_2_0()); 
                    	

                    }


                    }

                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1812:2: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==14) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1812:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleControllerView3699); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getControllerViewAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1816:1: ( (otherlv_7= RULE_ID ) )
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1817:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1817:1: (otherlv_7= RULE_ID )
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1818:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getControllerViewRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleControllerView3719); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getControllerViewAccess().getModelsModelCrossReference_3_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleControllerView3733); 

                        	newLeafNode(otherlv_8, grammarAccess.getControllerViewAccess().getRightParenthesisKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleControllerView3747); 

                	newLeafNode(otherlv_9, grammarAccess.getControllerViewAccess().getSemicolonKeyword_4());
                

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1845:1: entryRuleEventAction returns [EObject current=null] : iv_ruleEventAction= ruleEventAction EOF ;
    public final EObject entryRuleEventAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventAction = null;


        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1846:2: (iv_ruleEventAction= ruleEventAction EOF )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1847:2: iv_ruleEventAction= ruleEventAction EOF
            {
             newCompositeNode(grammarAccess.getEventActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEventAction_in_entryRuleEventAction3783);
            iv_ruleEventAction=ruleEventAction();

            state._fsp--;

             current =iv_ruleEventAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEventAction3793); 

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
    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1854:1: ruleEventAction returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )? otherlv_1= 'EventAction' otherlv_2= '{' otherlv_3= 'action' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'events' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) ;
    public final EObject ruleEventAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1857:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )? otherlv_1= 'EventAction' otherlv_2= '{' otherlv_3= 'action' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'events' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1858:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )? otherlv_1= 'EventAction' otherlv_2= '{' otherlv_3= 'action' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'events' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1858:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )? otherlv_1= 'EventAction' otherlv_2= '{' otherlv_3= 'action' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'events' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1858:2: ( (lv_annotations_0_0= ruleAnnotation ) )? otherlv_1= 'EventAction' otherlv_2= '{' otherlv_3= 'action' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'events' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? otherlv_11= '}'
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1858:2: ( (lv_annotations_0_0= ruleAnnotation ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==22) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1859:1: (lv_annotations_0_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1859:1: (lv_annotations_0_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1860:3: lv_annotations_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventActionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleEventAction3839);
                    lv_annotations_0_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventActionRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_0_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleEventAction3852); 

                	newLeafNode(otherlv_1, grammarAccess.getEventActionAccess().getEventActionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEventAction3864); 

                	newLeafNode(otherlv_2, grammarAccess.getEventActionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEventAction3876); 

                	newLeafNode(otherlv_3, grammarAccess.getEventActionAccess().getActionKeyword_3());
                
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1888:1: ( (otherlv_4= RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1889:1: (otherlv_4= RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1889:1: (otherlv_4= RULE_ID )
            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1890:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEventActionRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEventAction3896); 

            		newLeafNode(otherlv_4, grammarAccess.getEventActionAccess().getActionActionCrossReference_4_0()); 
            	

            }


            }

            // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1901:2: (otherlv_5= 'events' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==17) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1901:4: otherlv_5= 'events' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEventAction3909); 

                        	newLeafNode(otherlv_5, grammarAccess.getEventActionAccess().getEventsKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEventAction3921); 

                        	newLeafNode(otherlv_6, grammarAccess.getEventActionAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1909:1: ( (otherlv_7= RULE_ID ) )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1910:1: (otherlv_7= RULE_ID )
                    {
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1910:1: (otherlv_7= RULE_ID )
                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1911:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventActionRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEventAction3941); 

                    		newLeafNode(otherlv_7, grammarAccess.getEventActionAccess().getEventsEventCrossReference_5_2_0()); 
                    	

                    }


                    }

                    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1922:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==14) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1922:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEventAction3954); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getEventActionAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1926:1: ( (otherlv_9= RULE_ID ) )
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1927:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1927:1: (otherlv_9= RULE_ID )
                    	    // ../co.edu.uniandes.csw.dsl.component/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalComponent.g:1928:3: otherlv_9= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEventActionRule());
                    	    	        }
                    	            
                    	    otherlv_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEventAction3974); 

                    	    		newLeafNode(otherlv_9, grammarAccess.getEventActionAccess().getEventsEventCrossReference_5_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEventAction3988); 

                        	newLeafNode(otherlv_10, grammarAccess.getEventActionAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEventAction4002); 

                	newLeafNode(otherlv_11, grammarAccess.getEventActionAccess().getRightCurlyBracketKeyword_6());
                

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


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\20\uffff";
    static final String DFA11_eofS =
        "\20\uffff";
    static final String DFA11_minS =
        "\1\25\1\uffff\1\4\3\uffff\1\27\1\4\1\35\1\36\1\5\1\16\1\4\1\35"+
        "\1\5\1\16";
    static final String DFA11_maxS =
        "\1\43\1\uffff\1\4\3\uffff\1\27\1\30\1\35\1\43\1\5\1\30\1\4\1\35"+
        "\1\5\1\30";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\12\uffff";
    static final String DFA11_specialS =
        "\20\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\1\2\7\uffff\1\3\2\uffff\1\4\1\uffff\1\5",
            "",
            "\1\6",
            "",
            "",
            "",
            "\1\7",
            "\1\10\23\uffff\1\11",
            "\1\12",
            "\1\3\2\uffff\1\4\1\uffff\1\5",
            "\1\13",
            "\1\14\11\uffff\1\11",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\14\11\uffff\1\11"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "458:1: (this_UILayout_0= ruleUILayout | this_UIInput_1= ruleUIInput | this_UIActions_2= ruleUIActions | this_UILabel_3= ruleUILabel )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComponent85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImport_in_ruleComponent140 = new BitSet(new long[]{0x0000000000480800L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleComponent162 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleComponent175 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleComponent192 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleComponent209 = new BitSet(new long[]{0x000000000007A000L});
        public static final BitSet FOLLOW_13_in_ruleComponent222 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleComponent234 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleModel_in_ruleComponent255 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleComponent268 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleModel_in_ruleComponent289 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleComponent303 = new BitSet(new long[]{0x0000000000078000L});
        public static final BitSet FOLLOW_16_in_ruleComponent318 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleComponent330 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleView_in_ruleComponent351 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleComponent364 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleView_in_ruleComponent385 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleComponent399 = new BitSet(new long[]{0x0000000000068000L});
        public static final BitSet FOLLOW_17_in_ruleComponent414 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleComponent426 = new BitSet(new long[]{0x0000000004400000L});
        public static final BitSet FOLLOW_ruleEvent_in_ruleComponent447 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleComponent460 = new BitSet(new long[]{0x0000000004400000L});
        public static final BitSet FOLLOW_ruleEvent_in_ruleComponent481 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleComponent495 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_18_in_ruleComponent510 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleComponent522 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleController_in_ruleComponent543 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleComponent556 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleController_in_ruleComponent577 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleComponent591 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleComponent605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImport_in_entryRuleImport641 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImport651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleImport688 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleImport705 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleImport722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttributeValue_in_entryRuleAnnotationAttributeValue758 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationAttributeValue768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleValue_in_ruleAnnotationAttributeValue814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUIComponent_in_entryRuleUIComponent848 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUIComponent858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUILayout_in_ruleUIComponent905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUIInput_in_ruleUIComponent932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUIActions_in_ruleUIComponent959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUILabel_in_ruleUIComponent986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUILayout_in_entryRuleUILayout1021 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUILayout1031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleUILayout1068 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleUILayout1085 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleUILayout1102 = new BitSet(new long[]{0x0000000A40600000L});
        public static final BitSet FOLLOW_ruleUIComponent_in_ruleUILayout1123 = new BitSet(new long[]{0x0000000A40608000L});
        public static final BitSet FOLLOW_15_in_ruleUILayout1136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1172 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleAnnotation1219 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotation1239 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleAnnotation1251 = new BitSet(new long[]{0x0000000001000010L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_ruleAnnotation1273 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_14_in_ruleAnnotation1286 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_ruleAnnotation1307 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_24_in_ruleAnnotation1323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel1359 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel1369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleModel1424 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModel1442 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleModel1459 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModel1479 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleModel1492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleView_in_entryRuleView1528 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleView1538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleView1593 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleView1611 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleView1628 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleUILayout_in_ruleView1649 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleView1661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent1697 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEvent1707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleEvent1762 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleEvent1775 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent1792 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleEvent1809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleController_in_entryRuleController1845 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleController1855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleController1910 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleController1928 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleController1945 = new BitSet(new long[]{0x0000000018018000L});
        public static final BitSet FOLLOW_27_in_ruleController1958 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleController1970 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleAction_in_ruleController1991 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleController2004 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleAction_in_ruleController2025 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleController2039 = new BitSet(new long[]{0x0000000010018000L});
        public static final BitSet FOLLOW_16_in_ruleController2054 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleController2066 = new BitSet(new long[]{0x0000010000400000L});
        public static final BitSet FOLLOW_ruleControllerView_in_ruleController2087 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleController2100 = new BitSet(new long[]{0x0000010000400000L});
        public static final BitSet FOLLOW_ruleControllerView_in_ruleController2121 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleController2135 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_28_in_ruleController2150 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleController2162 = new BitSet(new long[]{0x0000020000400000L});
        public static final BitSet FOLLOW_ruleEventAction_in_ruleController2183 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleController2196 = new BitSet(new long[]{0x0000020000400000L});
        public static final BitSet FOLLOW_ruleEventAction_in_ruleController2217 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleController2231 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleController2245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_entryRuleAnnotationAttribute2281 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationAttribute2291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationAttribute2336 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleAnnotationAttribute2348 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleAnnotationAttributeValue_in_ruleAnnotationAttribute2369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue2405 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValue2415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleValue2466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUIInput_in_entryRuleUIInput2507 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUIInput2517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleUIInput2572 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleUIInput2585 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleUIInput2602 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleUIInput2619 = new BitSet(new long[]{0x0000000180008000L});
        public static final BitSet FOLLOW_31_in_ruleUIInput2632 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleUIInput2649 = new BitSet(new long[]{0x0000000100008000L});
        public static final BitSet FOLLOW_32_in_ruleUIInput2669 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleUIInput2689 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleUIInput2703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUIActions_in_entryRuleUIActions2739 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUIActions2749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleUIActions2804 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleUIActions2817 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleUIActions2834 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleUIActions2851 = new BitSet(new long[]{0x0000000480008000L});
        public static final BitSet FOLLOW_31_in_ruleUIActions2864 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleUIActions2881 = new BitSet(new long[]{0x0000000400008000L});
        public static final BitSet FOLLOW_34_in_ruleUIActions2901 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleUIActions2921 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleUIActions2935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUILabel_in_entryRuleUILabel2971 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUILabel2981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleUILabel3036 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleUILabel3049 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleUILabel3066 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleUILabel3083 = new BitSet(new long[]{0x0000001180008000L});
        public static final BitSet FOLLOW_31_in_ruleUILabel3096 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleUILabel3113 = new BitSet(new long[]{0x0000001100008000L});
        public static final BitSet FOLLOW_36_in_ruleUILabel3133 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleUILabel3150 = new BitSet(new long[]{0x0000000100008000L});
        public static final BitSet FOLLOW_32_in_ruleUILabel3170 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleUILabel3190 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleUILabel3204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction3240 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction3250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAction3305 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAction3323 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAction3340 = new BitSet(new long[]{0x000000E000008000L});
        public static final BitSet FOLLOW_37_in_ruleAction3353 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAction3373 = new BitSet(new long[]{0x000000C000008000L});
        public static final BitSet FOLLOW_38_in_ruleAction3388 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAction3408 = new BitSet(new long[]{0x0000008000008000L});
        public static final BitSet FOLLOW_39_in_ruleAction3423 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleAction3435 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAction3455 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_14_in_ruleAction3468 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAction3488 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_24_in_ruleAction3502 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAction3516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleControllerView_in_entryRuleControllerView3552 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleControllerView3562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleControllerView3608 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleControllerView3621 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleControllerView3641 = new BitSet(new long[]{0x0000000000102000L});
        public static final BitSet FOLLOW_13_in_ruleControllerView3654 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleControllerView3666 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleControllerView3686 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_14_in_ruleControllerView3699 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleControllerView3719 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_24_in_ruleControllerView3733 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleControllerView3747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEventAction_in_entryRuleEventAction3783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEventAction3793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleEventAction3839 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleEventAction3852 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEventAction3864 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleEventAction3876 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEventAction3896 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_17_in_ruleEventAction3909 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleEventAction3921 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEventAction3941 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_14_in_ruleEventAction3954 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEventAction3974 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_24_in_ruleEventAction3988 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleEventAction4002 = new BitSet(new long[]{0x0000000000000002L});
    }


}