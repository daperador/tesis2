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
import co.edu.uniandes.csw.dsl.services.EntitiesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntitiesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'@'", "'('", "','", "')'", "'Entity'", "'extends'", "'{'", "'associations'", "'}'", "'='", "':'", "'containment'", "'many'", "'lowerBound'", "'upperBound'", "'-'"
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
    public String getGrammarFileName() { return "../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g"; }



     	private EntitiesGrammarAccess grammarAccess;
     	
        public InternalEntitiesParser(TokenStream input, EntitiesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Entities";	
       	}
       	
       	@Override
       	protected EntitiesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleEntities"
    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:67:1: entryRuleEntities returns [EObject current=null] : iv_ruleEntities= ruleEntities EOF ;
    public final EObject entryRuleEntities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntities = null;


        try {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:68:2: (iv_ruleEntities= ruleEntities EOF )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:69:2: iv_ruleEntities= ruleEntities EOF
            {
             newCompositeNode(grammarAccess.getEntitiesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntities_in_entryRuleEntities75);
            iv_ruleEntities=ruleEntities();

            state._fsp--;

             current =iv_ruleEntities; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntities85); 

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
    // $ANTLR end "entryRuleEntities"


    // $ANTLR start "ruleEntities"
    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:76:1: ruleEntities returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleimports ) )* ( (lv_entities_2_0= ruleEntity ) )* ) ;
    public final EObject ruleEntities() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_entities_2_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:79:28: ( ( () ( (lv_imports_1_0= ruleimports ) )* ( (lv_entities_2_0= ruleEntity ) )* ) )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:80:1: ( () ( (lv_imports_1_0= ruleimports ) )* ( (lv_entities_2_0= ruleEntity ) )* )
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:80:1: ( () ( (lv_imports_1_0= ruleimports ) )* ( (lv_entities_2_0= ruleEntity ) )* )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:80:2: () ( (lv_imports_1_0= ruleimports ) )* ( (lv_entities_2_0= ruleEntity ) )*
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:80:2: ()
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntitiesAccess().getEntitiesAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:86:2: ( (lv_imports_1_0= ruleimports ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:87:1: (lv_imports_1_0= ruleimports )
            	    {
            	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:87:1: (lv_imports_1_0= ruleimports )
            	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:88:3: lv_imports_1_0= ruleimports
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntitiesAccess().getImportsImportsParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleimports_in_ruleEntities140);
            	    lv_imports_1_0=ruleimports();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntitiesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_1_0, 
            	            		"imports");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:104:3: ( (lv_entities_2_0= ruleEntity ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13||LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:105:1: (lv_entities_2_0= ruleEntity )
            	    {
            	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:105:1: (lv_entities_2_0= ruleEntity )
            	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:106:3: lv_entities_2_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntitiesAccess().getEntitiesEntityParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEntity_in_ruleEntities162);
            	    lv_entities_2_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntitiesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_2_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleEntities"


    // $ANTLR start "entryRuleimports"
    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:130:1: entryRuleimports returns [EObject current=null] : iv_ruleimports= ruleimports EOF ;
    public final EObject entryRuleimports() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleimports = null;


        try {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:131:2: (iv_ruleimports= ruleimports EOF )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:132:2: iv_ruleimports= ruleimports EOF
            {
             newCompositeNode(grammarAccess.getImportsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleimports_in_entryRuleimports199);
            iv_ruleimports=ruleimports();

            state._fsp--;

             current =iv_ruleimports; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleimports209); 

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
    // $ANTLR end "entryRuleimports"


    // $ANTLR start "ruleimports"
    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:139:1: ruleimports returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleimports() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:142:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:143:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:143:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:143:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleimports246); 

                	newLeafNode(otherlv_0, grammarAccess.getImportsAccess().getImportKeyword_0());
                
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:147:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:148:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:148:1: (lv_importURI_1_0= RULE_STRING )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:149:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleimports263); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getImportsAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleimports280); 

                	newLeafNode(otherlv_2, grammarAccess.getImportsAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleimports"


    // $ANTLR start "entryRuleAnnotationAttributeValue"
    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:177:1: entryRuleAnnotationAttributeValue returns [EObject current=null] : iv_ruleAnnotationAttributeValue= ruleAnnotationAttributeValue EOF ;
    public final EObject entryRuleAnnotationAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationAttributeValue = null;


        try {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:178:2: (iv_ruleAnnotationAttributeValue= ruleAnnotationAttributeValue EOF )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:179:2: iv_ruleAnnotationAttributeValue= ruleAnnotationAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAnnotationAttributeValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttributeValue_in_entryRuleAnnotationAttributeValue316);
            iv_ruleAnnotationAttributeValue=ruleAnnotationAttributeValue();

            state._fsp--;

             current =iv_ruleAnnotationAttributeValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationAttributeValue326); 

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
    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:186:1: ruleAnnotationAttributeValue returns [EObject current=null] : this_SimpleValue_0= ruleSimpleValue ;
    public final EObject ruleAnnotationAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleValue_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:189:28: (this_SimpleValue_0= ruleSimpleValue )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:191:5: this_SimpleValue_0= ruleSimpleValue
            {
             
                    newCompositeNode(grammarAccess.getAnnotationAttributeValueAccess().getSimpleValueParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSimpleValue_in_ruleAnnotationAttributeValue372);
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


    // $ANTLR start "entryRuleAnnotation"
    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:207:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:208:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:209:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation406);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation416); 

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
    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:216:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleAnnotationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )* )? otherlv_6= ')' ) ;
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
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:219:28: ( (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleAnnotationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )* )? otherlv_6= ')' ) )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:220:1: (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleAnnotationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )* )? otherlv_6= ')' )
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:220:1: (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleAnnotationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )* )? otherlv_6= ')' )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:220:3: otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleAnnotationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnnotation453); 

                	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:224:1: ( (otherlv_1= RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:225:1: (otherlv_1= RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:225:1: (otherlv_1= RULE_ID )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:226:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnnotation473); 

            		newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getAnnotationTypeAnnotationTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnnotation485); 

                	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2());
                
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:241:1: ( ( (lv_attributes_3_0= ruleAnnotationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:241:2: ( (lv_attributes_3_0= ruleAnnotationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )*
                    {
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:241:2: ( (lv_attributes_3_0= ruleAnnotationAttribute ) )
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:242:1: (lv_attributes_3_0= ruleAnnotationAttribute )
                    {
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:242:1: (lv_attributes_3_0= ruleAnnotationAttribute )
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:243:3: lv_attributes_3_0= ruleAnnotationAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getAttributesAnnotationAttributeParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttribute_in_ruleAnnotation507);
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

                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:259:2: (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:259:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnnotation520); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:263:1: ( (lv_attributes_5_0= ruleAnnotationAttribute ) )
                    	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:264:1: (lv_attributes_5_0= ruleAnnotationAttribute )
                    	    {
                    	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:264:1: (lv_attributes_5_0= ruleAnnotationAttribute )
                    	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:265:3: lv_attributes_5_0= ruleAnnotationAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getAttributesAnnotationAttributeParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttribute_in_ruleAnnotation541);
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
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAnnotation557); 

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


    // $ANTLR start "entryRuleEntity"
    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:293:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:294:2: (iv_ruleEntity= ruleEntity EOF )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:295:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_entryRuleEntity593);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntity603); 

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
    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:302:1: ruleEntity returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'Entity' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' )? otherlv_10= '{' ( ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* )? (otherlv_14= 'associations' otherlv_15= '{' ( (lv_associations_16_0= ruleAssociation ) ) (otherlv_17= ',' ( (lv_associations_18_0= ruleAssociation ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_attributes_11_0 = null;

        EObject lv_attributes_13_0 = null;

        EObject lv_associations_16_0 = null;

        EObject lv_associations_18_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:305:28: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'Entity' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' )? otherlv_10= '{' ( ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* )? (otherlv_14= 'associations' otherlv_15= '{' ( (lv_associations_16_0= ruleAssociation ) ) (otherlv_17= ',' ( (lv_associations_18_0= ruleAssociation ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:306:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'Entity' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' )? otherlv_10= '{' ( ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* )? (otherlv_14= 'associations' otherlv_15= '{' ( (lv_associations_16_0= ruleAssociation ) ) (otherlv_17= ',' ( (lv_associations_18_0= ruleAssociation ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:306:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'Entity' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' )? otherlv_10= '{' ( ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* )? (otherlv_14= 'associations' otherlv_15= '{' ( (lv_associations_16_0= ruleAssociation ) ) (otherlv_17= ',' ( (lv_associations_18_0= ruleAssociation ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:306:2: () ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'Entity' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' )? otherlv_10= '{' ( ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* )? (otherlv_14= 'associations' otherlv_15= '{' ( (lv_associations_16_0= ruleAssociation ) ) (otherlv_17= ',' ( (lv_associations_18_0= ruleAssociation ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:306:2: ()
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:307:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntityAccess().getEntityAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:312:2: ( (lv_annotations_1_0= ruleAnnotation ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:313:1: (lv_annotations_1_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:313:1: (lv_annotations_1_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:314:3: lv_annotations_1_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleEntity658);
                    lv_annotations_1_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
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

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEntity671); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getEntityKeyword_2());
                
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:334:1: ( (lv_name_3_0= RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:335:1: (lv_name_3_0= RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:335:1: (lv_name_3_0= RULE_ID )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:336:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEntity688); 

            			newLeafNode(lv_name_3_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:352:2: (otherlv_4= 'extends' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:352:4: otherlv_4= 'extends' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEntity706); 

                        	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getExtendsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEntity718); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:360:1: ( (otherlv_6= RULE_ID ) )
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:361:1: (otherlv_6= RULE_ID )
                    {
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:361:1: (otherlv_6= RULE_ID )
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:362:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEntity738); 

                    		newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getExtendsEntityCrossReference_4_2_0()); 
                    	

                    }


                    }

                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:373:2: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:373:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEntity751); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:377:1: ( (otherlv_8= RULE_ID ) )
                    	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:378:1: (otherlv_8= RULE_ID )
                    	    {
                    	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:378:1: (otherlv_8= RULE_ID )
                    	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:379:3: otherlv_8= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEntityRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEntity771); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getExtendsEntityCrossReference_4_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEntity785); 

                        	newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEntity799); 

                	newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5());
                
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:398:1: ( ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:398:2: ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )*
                    {
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:398:2: ( (lv_attributes_11_0= ruleAttribute ) )
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:399:1: (lv_attributes_11_0= ruleAttribute )
                    {
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:399:1: (lv_attributes_11_0= ruleAttribute )
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:400:3: lv_attributes_11_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleEntity821);
                    lv_attributes_11_0=ruleAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_11_0, 
                            		"Attribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:416:2: (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:416:4: otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEntity834); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getEntityAccess().getCommaKeyword_6_1_0());
                    	        
                    	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:420:1: ( (lv_attributes_13_0= ruleAttribute ) )
                    	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:421:1: (lv_attributes_13_0= ruleAttribute )
                    	    {
                    	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:421:1: (lv_attributes_13_0= ruleAttribute )
                    	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:422:3: lv_attributes_13_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleEntity855);
                    	    lv_attributes_13_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_13_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:438:6: (otherlv_14= 'associations' otherlv_15= '{' ( (lv_associations_16_0= ruleAssociation ) ) (otherlv_17= ',' ( (lv_associations_18_0= ruleAssociation ) ) )* otherlv_19= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:438:8: otherlv_14= 'associations' otherlv_15= '{' ( (lv_associations_16_0= ruleAssociation ) ) (otherlv_17= ',' ( (lv_associations_18_0= ruleAssociation ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEntity872); 

                        	newLeafNode(otherlv_14, grammarAccess.getEntityAccess().getAssociationsKeyword_7_0());
                        
                    otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEntity884); 

                        	newLeafNode(otherlv_15, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:446:1: ( (lv_associations_16_0= ruleAssociation ) )
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:447:1: (lv_associations_16_0= ruleAssociation )
                    {
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:447:1: (lv_associations_16_0= ruleAssociation )
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:448:3: lv_associations_16_0= ruleAssociation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getAssociationsAssociationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAssociation_in_ruleEntity905);
                    lv_associations_16_0=ruleAssociation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		add(
                           			current, 
                           			"associations",
                            		lv_associations_16_0, 
                            		"Association");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:464:2: (otherlv_17= ',' ( (lv_associations_18_0= ruleAssociation ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:464:4: otherlv_17= ',' ( (lv_associations_18_0= ruleAssociation ) )
                    	    {
                    	    otherlv_17=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEntity918); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getEntityAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:468:1: ( (lv_associations_18_0= ruleAssociation ) )
                    	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:469:1: (lv_associations_18_0= ruleAssociation )
                    	    {
                    	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:469:1: (lv_associations_18_0= ruleAssociation )
                    	    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:470:3: lv_associations_18_0= ruleAssociation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntityAccess().getAssociationsAssociationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAssociation_in_ruleEntity939);
                    	    lv_associations_18_0=ruleAssociation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"associations",
                    	            		lv_associations_18_0, 
                    	            		"Association");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEntity953); 

                        	newLeafNode(otherlv_19, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_20=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEntity967); 

                	newLeafNode(otherlv_20, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8());
                

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


    // $ANTLR start "entryRuleAnnotationAttribute"
    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:502:1: entryRuleAnnotationAttribute returns [EObject current=null] : iv_ruleAnnotationAttribute= ruleAnnotationAttribute EOF ;
    public final EObject entryRuleAnnotationAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationAttribute = null;


        try {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:503:2: (iv_ruleAnnotationAttribute= ruleAnnotationAttribute EOF )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:504:2: iv_ruleAnnotationAttribute= ruleAnnotationAttribute EOF
            {
             newCompositeNode(grammarAccess.getAnnotationAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttribute_in_entryRuleAnnotationAttribute1003);
            iv_ruleAnnotationAttribute=ruleAnnotationAttribute();

            state._fsp--;

             current =iv_ruleAnnotationAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationAttribute1013); 

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
    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:511:1: ruleAnnotationAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAnnotationAttributeValue ) )? ) ;
    public final EObject ruleAnnotationAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:514:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAnnotationAttributeValue ) )? ) )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:515:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAnnotationAttributeValue ) )? )
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:515:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAnnotationAttributeValue ) )? )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:515:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAnnotationAttributeValue ) )?
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:515:2: ( (otherlv_0= RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:516:1: (otherlv_0= RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:516:1: (otherlv_0= RULE_ID )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:517:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationAttributeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnnotationAttribute1058); 

            		newLeafNode(otherlv_0, grammarAccess.getAnnotationAttributeAccess().getAttributeAnnotationTypeAttributeCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnnotationAttribute1070); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationAttributeAccess().getEqualsSignKeyword_1());
                
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:532:1: ( (lv_value_2_0= ruleAnnotationAttributeValue ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:533:1: (lv_value_2_0= ruleAnnotationAttributeValue )
                    {
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:533:1: (lv_value_2_0= ruleAnnotationAttributeValue )
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:534:3: lv_value_2_0= ruleAnnotationAttributeValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAttributeAccess().getValueAnnotationAttributeValueParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttributeValue_in_ruleAnnotationAttribute1091);
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
    // $ANTLR end "ruleAnnotationAttribute"


    // $ANTLR start "entryRuleSimpleValue"
    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:558:1: entryRuleSimpleValue returns [EObject current=null] : iv_ruleSimpleValue= ruleSimpleValue EOF ;
    public final EObject entryRuleSimpleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleValue = null;


        try {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:559:2: (iv_ruleSimpleValue= ruleSimpleValue EOF )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:560:2: iv_ruleSimpleValue= ruleSimpleValue EOF
            {
             newCompositeNode(grammarAccess.getSimpleValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue1128);
            iv_ruleSimpleValue=ruleSimpleValue();

            state._fsp--;

             current =iv_ruleSimpleValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleValue1138); 

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
    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:567:1: ruleSimpleValue returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSimpleValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:570:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:571:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:571:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:571:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:571:2: ()
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:572:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleValueAccess().getSimpleValueAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:577:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:578:1: (lv_value_1_0= RULE_STRING )
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:578:1: (lv_value_1_0= RULE_STRING )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:579:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSimpleValue1189); 

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


    // $ANTLR start "entryRuleAttribute"
    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:603:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:604:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:605:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute1230);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute1240); 

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
    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:612:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;
        EObject lv_annotations_1_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:615:28: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) ) )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:616:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:616:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:616:2: () ( (lv_annotations_1_0= ruleAnnotation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) )
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:616:2: ()
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:617:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttributeAccess().getAttributeAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:622:2: ( (lv_annotations_1_0= ruleAnnotation ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:623:1: (lv_annotations_1_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:623:1: (lv_annotations_1_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:624:3: lv_annotations_1_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAttribute1295);
                    lv_annotations_1_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
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

            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:640:3: ( (lv_name_2_0= RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:641:1: (lv_name_2_0= RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:641:1: (lv_name_2_0= RULE_ID )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:642:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttribute1313); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAttribute1330); 

                	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getColonKeyword_3());
                
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:662:1: ( (lv_type_4_0= RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:663:1: (lv_type_4_0= RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:663:1: (lv_type_4_0= RULE_ID )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:664:3: lv_type_4_0= RULE_ID
            {
            lv_type_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttribute1347); 

            			newLeafNode(lv_type_4_0, grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_4_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAssociation"
    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:688:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:689:2: (iv_ruleAssociation= ruleAssociation EOF )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:690:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssociation_in_entryRuleAssociation1388);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssociation1398); 

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
    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:697:1: ruleAssociation returns [EObject current=null] : ( ( (lv_containment_0_0= 'containment' ) )? ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'many' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) ) ) otherlv_8= ':' (otherlv_9= 'upperBound' ( (lv_upperBound_10_0= ruleEInt ) ) ) )? otherlv_11= ';' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_containment_0_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_annotations_1_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_7_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_10_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:700:28: ( ( ( (lv_containment_0_0= 'containment' ) )? ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'many' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) ) ) otherlv_8= ':' (otherlv_9= 'upperBound' ( (lv_upperBound_10_0= ruleEInt ) ) ) )? otherlv_11= ';' ) )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:701:1: ( ( (lv_containment_0_0= 'containment' ) )? ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'many' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) ) ) otherlv_8= ':' (otherlv_9= 'upperBound' ( (lv_upperBound_10_0= ruleEInt ) ) ) )? otherlv_11= ';' )
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:701:1: ( ( (lv_containment_0_0= 'containment' ) )? ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'many' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) ) ) otherlv_8= ':' (otherlv_9= 'upperBound' ( (lv_upperBound_10_0= ruleEInt ) ) ) )? otherlv_11= ';' )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:701:2: ( (lv_containment_0_0= 'containment' ) )? ( (lv_annotations_1_0= ruleAnnotation ) )? otherlv_2= 'many' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) ) ) otherlv_8= ':' (otherlv_9= 'upperBound' ( (lv_upperBound_10_0= ruleEInt ) ) ) )? otherlv_11= ';'
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:701:2: ( (lv_containment_0_0= 'containment' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:702:1: (lv_containment_0_0= 'containment' )
                    {
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:702:1: (lv_containment_0_0= 'containment' )
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:703:3: lv_containment_0_0= 'containment'
                    {
                    lv_containment_0_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAssociation1441); 

                            newLeafNode(lv_containment_0_0, grammarAccess.getAssociationAccess().getContainmentContainmentKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssociationRule());
                    	        }
                           		setWithLastConsumed(current, "containment", true, "containment");
                    	    

                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:716:3: ( (lv_annotations_1_0= ruleAnnotation ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:717:1: (lv_annotations_1_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:717:1: (lv_annotations_1_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:718:3: lv_annotations_1_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAssociation1476);
                    lv_annotations_1_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssociationRule());
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

            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAssociation1489); 

                	newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getManyKeyword_2());
                
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:738:1: ( (lv_name_3_0= RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:739:1: (lv_name_3_0= RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:739:1: (lv_name_3_0= RULE_ID )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:740:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssociation1506); 

            			newLeafNode(lv_name_3_0, grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAssociation1523); 

                	newLeafNode(otherlv_4, grammarAccess.getAssociationAccess().getColonKeyword_4());
                
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:760:1: ( (otherlv_5= RULE_ID ) )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:761:1: (otherlv_5= RULE_ID )
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:761:1: (otherlv_5= RULE_ID )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:762:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssociation1543); 

            		newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getTargetEntityCrossReference_5_0()); 
            	

            }


            }

            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:773:2: ( (otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) ) ) otherlv_8= ':' (otherlv_9= 'upperBound' ( (lv_upperBound_10_0= ruleEInt ) ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:773:3: (otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) ) ) otherlv_8= ':' (otherlv_9= 'upperBound' ( (lv_upperBound_10_0= ruleEInt ) ) )
                    {
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:773:3: (otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) ) )
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:773:5: otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAssociation1557); 

                        	newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getLowerBoundKeyword_6_0_0());
                        
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:777:1: ( (lv_lowerBound_7_0= ruleEInt ) )
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:778:1: (lv_lowerBound_7_0= ruleEInt )
                    {
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:778:1: (lv_lowerBound_7_0= ruleEInt )
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:779:3: lv_lowerBound_7_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationAccess().getLowerBoundEIntParserRuleCall_6_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAssociation1578);
                    lv_lowerBound_7_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssociationRule());
                    	        }
                           		set(
                           			current, 
                           			"lowerBound",
                            		lv_lowerBound_7_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }

                    otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAssociation1591); 

                        	newLeafNode(otherlv_8, grammarAccess.getAssociationAccess().getColonKeyword_6_1());
                        
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:799:1: (otherlv_9= 'upperBound' ( (lv_upperBound_10_0= ruleEInt ) ) )
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:799:3: otherlv_9= 'upperBound' ( (lv_upperBound_10_0= ruleEInt ) )
                    {
                    otherlv_9=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAssociation1604); 

                        	newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getUpperBoundKeyword_6_2_0());
                        
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:803:1: ( (lv_upperBound_10_0= ruleEInt ) )
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:804:1: (lv_upperBound_10_0= ruleEInt )
                    {
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:804:1: (lv_upperBound_10_0= ruleEInt )
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:805:3: lv_upperBound_10_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationAccess().getUpperBoundEIntParserRuleCall_6_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAssociation1625);
                    lv_upperBound_10_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssociationRule());
                    	        }
                           		set(
                           			current, 
                           			"upperBound",
                            		lv_upperBound_10_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAssociation1640); 

                	newLeafNode(otherlv_11, grammarAccess.getAssociationAccess().getSemicolonKeyword_7());
                

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


    // $ANTLR start "entryRuleEInt"
    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:833:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:834:2: (iv_ruleEInt= ruleEInt EOF )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:835:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1677);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1688); 

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
    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:842:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:845:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:846:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:846:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:846:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:846:2: (kw= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../co.edu.uniandes.csw.dsl.entities/src-gen/co/edu/uniandes/csw/dsl/parser/antlr/internal/InternalEntities.g:847:2: kw= '-'
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEInt1727); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1744); 

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


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleEntities_in_entryRuleEntities75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntities85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleimports_in_ruleEntities140 = new BitSet(new long[]{0x0000000000022802L});
        public static final BitSet FOLLOW_ruleEntity_in_ruleEntities162 = new BitSet(new long[]{0x0000000000022002L});
        public static final BitSet FOLLOW_ruleimports_in_entryRuleimports199 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleimports209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleimports246 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleimports263 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleimports280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttributeValue_in_entryRuleAnnotationAttributeValue316 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationAttributeValue326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleValue_in_ruleAnnotationAttributeValue372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation406 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleAnnotation453 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotation473 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAnnotation485 = new BitSet(new long[]{0x0000000000010020L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_ruleAnnotation507 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleAnnotation520 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_ruleAnnotation541 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleAnnotation557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity593 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntity603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleEntity658 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEntity671 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEntity688 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleEntity706 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleEntity718 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEntity738 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleEntity751 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEntity771 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleEntity785 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleEntity799 = new BitSet(new long[]{0x0000000000302020L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity821 = new BitSet(new long[]{0x0000000000308000L});
        public static final BitSet FOLLOW_15_in_ruleEntity834 = new BitSet(new long[]{0x0000000000002020L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity855 = new BitSet(new long[]{0x0000000000308000L});
        public static final BitSet FOLLOW_20_in_ruleEntity872 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleEntity884 = new BitSet(new long[]{0x0000000003002000L});
        public static final BitSet FOLLOW_ruleAssociation_in_ruleEntity905 = new BitSet(new long[]{0x0000000000208000L});
        public static final BitSet FOLLOW_15_in_ruleEntity918 = new BitSet(new long[]{0x0000000003002000L});
        public static final BitSet FOLLOW_ruleAssociation_in_ruleEntity939 = new BitSet(new long[]{0x0000000000208000L});
        public static final BitSet FOLLOW_21_in_ruleEntity953 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleEntity967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_entryRuleAnnotationAttribute1003 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationAttribute1013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationAttribute1058 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleAnnotationAttribute1070 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_ruleAnnotationAttributeValue_in_ruleAnnotationAttribute1091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue1128 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValue1138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleValue1189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1230 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAttribute1295 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1313 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleAttribute1330 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation1388 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssociation1398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleAssociation1441 = new BitSet(new long[]{0x0000000002002000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAssociation1476 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleAssociation1489 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation1506 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleAssociation1523 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation1543 = new BitSet(new long[]{0x0000000004001000L});
        public static final BitSet FOLLOW_26_in_ruleAssociation1557 = new BitSet(new long[]{0x0000000010000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAssociation1578 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleAssociation1591 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleAssociation1604 = new BitSet(new long[]{0x0000000010000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAssociation1625 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAssociation1640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1677 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleEInt1727 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1744 = new BitSet(new long[]{0x0000000000000002L});
    }


}