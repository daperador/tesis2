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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'MVCModel'", "'version'", "'{'", "'components'", "','", "'}'", "'@'", "'('", "')'", "'='"
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
    public static final int T__20=20;
    public static final int T__21=21;

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
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:76:1: ruleMVCModel returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= 'MVCModel' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) )? otherlv_8= '{' otherlv_9= 'components' otherlv_10= '{' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' otherlv_15= '}' ) ;
    public final EObject ruleMVCModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token lv_version_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_annotations_3_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:79:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= 'MVCModel' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) )? otherlv_8= '{' otherlv_9= 'components' otherlv_10= '{' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' otherlv_15= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:80:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= 'MVCModel' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) )? otherlv_8= '{' otherlv_9= 'components' otherlv_10= '{' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' otherlv_15= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:80:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= 'MVCModel' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) )? otherlv_8= '{' otherlv_9= 'components' otherlv_10= '{' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' otherlv_15= '}' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:80:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= 'MVCModel' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) )? otherlv_8= '{' otherlv_9= 'components' otherlv_10= '{' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMVCModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getMVCModelAccess().getImportKeyword_0());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:84:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:85:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:85:1: (lv_importURI_1_0= RULE_STRING )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:86:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleMVCModel139); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getMVCModelAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMVCModel156); 

                	newLeafNode(otherlv_2, grammarAccess.getMVCModelAccess().getSemicolonKeyword_2());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:106:1: ( (lv_annotations_3_0= ruleAnnotation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:107:1: (lv_annotations_3_0= ruleAnnotation )
            	    {
            	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:107:1: (lv_annotations_3_0= ruleAnnotation )
            	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:108:3: lv_annotations_3_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMVCModelAccess().getAnnotationsAnnotationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleMVCModel177);
            	    lv_annotations_3_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMVCModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_3_0, 
            	            		"Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMVCModel190); 

                	newLeafNode(otherlv_4, grammarAccess.getMVCModelAccess().getMVCModelKeyword_4());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:128:1: ( (lv_name_5_0= RULE_ID ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:129:1: (lv_name_5_0= RULE_ID )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:129:1: (lv_name_5_0= RULE_ID )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:130:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMVCModel207); 

            			newLeafNode(lv_name_5_0, grammarAccess.getMVCModelAccess().getNameIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMVCModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"ID");
            	    

            }


            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:146:2: (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:146:4: otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMVCModel225); 

                        	newLeafNode(otherlv_6, grammarAccess.getMVCModelAccess().getVersionKeyword_6_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:150:1: ( (lv_version_7_0= RULE_STRING ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:151:1: (lv_version_7_0= RULE_STRING )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:151:1: (lv_version_7_0= RULE_STRING )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:152:3: lv_version_7_0= RULE_STRING
                    {
                    lv_version_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleMVCModel242); 

                    			newLeafNode(lv_version_7_0, grammarAccess.getMVCModelAccess().getVersionSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMVCModelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"version",
                            		lv_version_7_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMVCModel261); 

                	newLeafNode(otherlv_8, grammarAccess.getMVCModelAccess().getLeftCurlyBracketKeyword_7());
                
            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMVCModel273); 

                	newLeafNode(otherlv_9, grammarAccess.getMVCModelAccess().getComponentsKeyword_8());
                
            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMVCModel285); 

                	newLeafNode(otherlv_10, grammarAccess.getMVCModelAccess().getLeftCurlyBracketKeyword_9());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:180:1: ( (otherlv_11= RULE_ID ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:181:1: (otherlv_11= RULE_ID )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:181:1: (otherlv_11= RULE_ID )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:182:3: otherlv_11= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMVCModelRule());
            	        }
                    
            otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMVCModel305); 

            		newLeafNode(otherlv_11, grammarAccess.getMVCModelAccess().getComponentsComponentCrossReference_10_0()); 
            	

            }


            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:193:2: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:193:4: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
            	    {
            	    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMVCModel318); 

            	        	newLeafNode(otherlv_12, grammarAccess.getMVCModelAccess().getCommaKeyword_11_0());
            	        
            	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:197:1: ( (otherlv_13= RULE_ID ) )
            	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:198:1: (otherlv_13= RULE_ID )
            	    {
            	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:198:1: (otherlv_13= RULE_ID )
            	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:199:3: otherlv_13= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMVCModelRule());
            	    	        }
            	            
            	    otherlv_13=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMVCModel338); 

            	    		newLeafNode(otherlv_13, grammarAccess.getMVCModelAccess().getComponentsComponentCrossReference_11_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMVCModel352); 

                	newLeafNode(otherlv_14, grammarAccess.getMVCModelAccess().getRightCurlyBracketKeyword_12());
                
            otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMVCModel364); 

                	newLeafNode(otherlv_15, grammarAccess.getMVCModelAccess().getRightCurlyBracketKeyword_13());
                

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
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:226:1: entryRuleAnnotationAttributeValue returns [EObject current=null] : iv_ruleAnnotationAttributeValue= ruleAnnotationAttributeValue EOF ;
    public final EObject entryRuleAnnotationAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationAttributeValue = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:227:2: (iv_ruleAnnotationAttributeValue= ruleAnnotationAttributeValue EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:228:2: iv_ruleAnnotationAttributeValue= ruleAnnotationAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAnnotationAttributeValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttributeValue_in_entryRuleAnnotationAttributeValue400);
            iv_ruleAnnotationAttributeValue=ruleAnnotationAttributeValue();

            state._fsp--;

             current =iv_ruleAnnotationAttributeValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationAttributeValue410); 

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
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:235:1: ruleAnnotationAttributeValue returns [EObject current=null] : this_SimpleValue_0= ruleSimpleValue ;
    public final EObject ruleAnnotationAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleValue_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:238:28: (this_SimpleValue_0= ruleSimpleValue )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:240:5: this_SimpleValue_0= ruleSimpleValue
            {
             
                    newCompositeNode(grammarAccess.getAnnotationAttributeValueAccess().getSimpleValueParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSimpleValue_in_ruleAnnotationAttributeValue456);
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
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:256:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:257:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:258:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation490);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation500); 

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
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:265:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleAnnotationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )* )? otherlv_6= ')' ) ;
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
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:268:28: ( (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleAnnotationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )* )? otherlv_6= ')' ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:269:1: (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleAnnotationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )* )? otherlv_6= ')' )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:269:1: (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleAnnotationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )* )? otherlv_6= ')' )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:269:3: otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributes_3_0= ruleAnnotationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnnotation537); 

                	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:273:1: ( (otherlv_1= RULE_ID ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:274:1: (otherlv_1= RULE_ID )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:274:1: (otherlv_1= RULE_ID )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:275:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnnotation557); 

            		newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getAnnotationTypeAnnotationTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnnotation569); 

                	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:290:1: ( ( (lv_attributes_3_0= ruleAnnotationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:290:2: ( (lv_attributes_3_0= ruleAnnotationAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )*
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:290:2: ( (lv_attributes_3_0= ruleAnnotationAttribute ) )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:291:1: (lv_attributes_3_0= ruleAnnotationAttribute )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:291:1: (lv_attributes_3_0= ruleAnnotationAttribute )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:292:3: lv_attributes_3_0= ruleAnnotationAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getAttributesAnnotationAttributeParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttribute_in_ruleAnnotation591);
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

                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:308:2: (otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:308:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleAnnotationAttribute ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnnotation604); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:312:1: ( (lv_attributes_5_0= ruleAnnotationAttribute ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:313:1: (lv_attributes_5_0= ruleAnnotationAttribute )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:313:1: (lv_attributes_5_0= ruleAnnotationAttribute )
                    	    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:314:3: lv_attributes_5_0= ruleAnnotationAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getAttributesAnnotationAttributeParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttribute_in_ruleAnnotation625);
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
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnnotation641); 

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


    // $ANTLR start "entryRuleAnnotationAttribute"
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:342:1: entryRuleAnnotationAttribute returns [EObject current=null] : iv_ruleAnnotationAttribute= ruleAnnotationAttribute EOF ;
    public final EObject entryRuleAnnotationAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationAttribute = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:343:2: (iv_ruleAnnotationAttribute= ruleAnnotationAttribute EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:344:2: iv_ruleAnnotationAttribute= ruleAnnotationAttribute EOF
            {
             newCompositeNode(grammarAccess.getAnnotationAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttribute_in_entryRuleAnnotationAttribute677);
            iv_ruleAnnotationAttribute=ruleAnnotationAttribute();

            state._fsp--;

             current =iv_ruleAnnotationAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationAttribute687); 

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
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:351:1: ruleAnnotationAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAnnotationAttributeValue ) )? ) ;
    public final EObject ruleAnnotationAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:354:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAnnotationAttributeValue ) )? ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:355:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAnnotationAttributeValue ) )? )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:355:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAnnotationAttributeValue ) )? )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:355:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAnnotationAttributeValue ) )?
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:355:2: ( (otherlv_0= RULE_ID ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:356:1: (otherlv_0= RULE_ID )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:356:1: (otherlv_0= RULE_ID )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:357:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationAttributeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnnotationAttribute732); 

            		newLeafNode(otherlv_0, grammarAccess.getAnnotationAttributeAccess().getAttributeAnnotationTypeAttributeCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnnotationAttribute744); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationAttributeAccess().getEqualsSignKeyword_1());
                
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:372:1: ( (lv_value_2_0= ruleAnnotationAttributeValue ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:373:1: (lv_value_2_0= ruleAnnotationAttributeValue )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:373:1: (lv_value_2_0= ruleAnnotationAttributeValue )
                    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:374:3: lv_value_2_0= ruleAnnotationAttributeValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAttributeAccess().getValueAnnotationAttributeValueParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttributeValue_in_ruleAnnotationAttribute765);
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
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:398:1: entryRuleSimpleValue returns [EObject current=null] : iv_ruleSimpleValue= ruleSimpleValue EOF ;
    public final EObject entryRuleSimpleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleValue = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:399:2: (iv_ruleSimpleValue= ruleSimpleValue EOF )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:400:2: iv_ruleSimpleValue= ruleSimpleValue EOF
            {
             newCompositeNode(grammarAccess.getSimpleValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue802);
            iv_ruleSimpleValue=ruleSimpleValue();

            state._fsp--;

             current =iv_ruleSimpleValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleValue812); 

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
    // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:407:1: ruleSimpleValue returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSimpleValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:410:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:411:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:411:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:411:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:411:2: ()
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:412:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleValueAccess().getSimpleValueAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:417:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:418:1: (lv_value_1_0= RULE_STRING )
            {
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:418:1: (lv_value_1_0= RULE_STRING )
            // ../co.edu.uniandes.csw.spl.dsl/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalMVCDsl.g:419:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSimpleValue863); 

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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMVCModel_in_entryRuleMVCModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMVCModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleMVCModel122 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleMVCModel139 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMVCModel156 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleMVCModel177 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_13_in_ruleMVCModel190 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMVCModel207 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleMVCModel225 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleMVCModel242 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMVCModel261 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMVCModel273 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMVCModel285 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMVCModel305 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleMVCModel318 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMVCModel338 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleMVCModel352 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleMVCModel364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttributeValue_in_entryRuleAnnotationAttributeValue400 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationAttributeValue410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleValue_in_ruleAnnotationAttributeValue456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation490 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleAnnotation537 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotation557 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAnnotation569 = new BitSet(new long[]{0x0000000000200020L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_ruleAnnotation591 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_17_in_ruleAnnotation604 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_ruleAnnotation625 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_21_in_ruleAnnotation641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_entryRuleAnnotationAttribute677 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationAttribute687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationAttribute732 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleAnnotationAttribute744 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_ruleAnnotationAttributeValue_in_ruleAnnotationAttribute765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue802 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValue812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleValue863 = new BitSet(new long[]{0x0000000000000002L});
    }


}