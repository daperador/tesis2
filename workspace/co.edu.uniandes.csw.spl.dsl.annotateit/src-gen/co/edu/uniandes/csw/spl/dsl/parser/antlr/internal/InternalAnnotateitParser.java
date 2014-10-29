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
import co.edu.uniandes.csw.spl.dsl.services.AnnotateitGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnnotateitParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "';'", "'types'", "'{'", "','", "'}'", "'Type'", "'@annotation'", "'context'", "'AnnotationAttribute'", "'attribute'", "'value'", "':'", "'SimpleValue'"
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
    public String getGrammarFileName() { return "../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g"; }



     	private AnnotateitGrammarAccess grammarAccess;
     	
        public InternalAnnotateitParser(TokenStream input, AnnotateitGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Package";	
       	}
       	
       	@Override
       	protected AnnotateitGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePackage"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:67:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:68:2: (iv_rulePackage= rulePackage EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:69:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_in_entryRulePackage75);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackage85); 

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:76:1: rulePackage returns [EObject current=null] : ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' (otherlv_4= 'types' otherlv_5= '{' ( (lv_types_6_0= ruleType ) ) (otherlv_7= ',' ( (lv_types_8_0= ruleType ) ) )* otherlv_9= '}' )? ( ( (lv_annotationTypes_10_0= ruleAnnotationType ) ) (otherlv_11= ',' ( (lv_annotationTypes_12_0= ruleAnnotationType ) ) )* )? ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_types_6_0 = null;

        EObject lv_types_8_0 = null;

        EObject lv_annotationTypes_10_0 = null;

        EObject lv_annotationTypes_12_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:79:28: ( ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' (otherlv_4= 'types' otherlv_5= '{' ( (lv_types_6_0= ruleType ) ) (otherlv_7= ',' ( (lv_types_8_0= ruleType ) ) )* otherlv_9= '}' )? ( ( (lv_annotationTypes_10_0= ruleAnnotationType ) ) (otherlv_11= ',' ( (lv_annotationTypes_12_0= ruleAnnotationType ) ) )* )? ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:80:1: ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' (otherlv_4= 'types' otherlv_5= '{' ( (lv_types_6_0= ruleType ) ) (otherlv_7= ',' ( (lv_types_8_0= ruleType ) ) )* otherlv_9= '}' )? ( ( (lv_annotationTypes_10_0= ruleAnnotationType ) ) (otherlv_11= ',' ( (lv_annotationTypes_12_0= ruleAnnotationType ) ) )* )? )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:80:1: ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' (otherlv_4= 'types' otherlv_5= '{' ( (lv_types_6_0= ruleType ) ) (otherlv_7= ',' ( (lv_types_8_0= ruleType ) ) )* otherlv_9= '}' )? ( ( (lv_annotationTypes_10_0= ruleAnnotationType ) ) (otherlv_11= ',' ( (lv_annotationTypes_12_0= ruleAnnotationType ) ) )* )? )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:80:2: () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' (otherlv_4= 'types' otherlv_5= '{' ( (lv_types_6_0= ruleType ) ) (otherlv_7= ',' ( (lv_types_8_0= ruleType ) ) )* otherlv_9= '}' )? ( ( (lv_annotationTypes_10_0= ruleAnnotationType ) ) (otherlv_11= ',' ( (lv_annotationTypes_12_0= ruleAnnotationType ) ) )* )?
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:80:2: ()
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPackageAccess().getPackageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePackage131); 

                	newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
                
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:90:1: ( (lv_name_2_0= ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:91:1: (lv_name_2_0= ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:91:1: (lv_name_2_0= ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:92:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPackageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePackage152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePackage164); 

                	newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getSemicolonKeyword_3());
                
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:112:1: (otherlv_4= 'types' otherlv_5= '{' ( (lv_types_6_0= ruleType ) ) (otherlv_7= ',' ( (lv_types_8_0= ruleType ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:112:3: otherlv_4= 'types' otherlv_5= '{' ( (lv_types_6_0= ruleType ) ) (otherlv_7= ',' ( (lv_types_8_0= ruleType ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePackage177); 

                        	newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getTypesKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePackage189); 

                        	newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:120:1: ( (lv_types_6_0= ruleType ) )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:121:1: (lv_types_6_0= ruleType )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:121:1: (lv_types_6_0= ruleType )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:122:3: lv_types_6_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageAccess().getTypesTypeParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleType_in_rulePackage210);
                    lv_types_6_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"types",
                            		lv_types_6_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:138:2: (otherlv_7= ',' ( (lv_types_8_0= ruleType ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:138:4: otherlv_7= ',' ( (lv_types_8_0= ruleType ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePackage223); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getPackageAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:142:1: ( (lv_types_8_0= ruleType ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:143:1: (lv_types_8_0= ruleType )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:143:1: (lv_types_8_0= ruleType )
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:144:3: lv_types_8_0= ruleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPackageAccess().getTypesTypeParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleType_in_rulePackage244);
                    	    lv_types_8_0=ruleType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"types",
                    	            		lv_types_8_0, 
                    	            		"Type");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePackage258); 

                        	newLeafNode(otherlv_9, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:164:3: ( ( (lv_annotationTypes_10_0= ruleAnnotationType ) ) (otherlv_11= ',' ( (lv_annotationTypes_12_0= ruleAnnotationType ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:164:4: ( (lv_annotationTypes_10_0= ruleAnnotationType ) ) (otherlv_11= ',' ( (lv_annotationTypes_12_0= ruleAnnotationType ) ) )*
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:164:4: ( (lv_annotationTypes_10_0= ruleAnnotationType ) )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:165:1: (lv_annotationTypes_10_0= ruleAnnotationType )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:165:1: (lv_annotationTypes_10_0= ruleAnnotationType )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:166:3: lv_annotationTypes_10_0= ruleAnnotationType
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageAccess().getAnnotationTypesAnnotationTypeParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationType_in_rulePackage282);
                    lv_annotationTypes_10_0=ruleAnnotationType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"annotationTypes",
                            		lv_annotationTypes_10_0, 
                            		"AnnotationType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:182:2: (otherlv_11= ',' ( (lv_annotationTypes_12_0= ruleAnnotationType ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:182:4: otherlv_11= ',' ( (lv_annotationTypes_12_0= ruleAnnotationType ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePackage295); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getPackageAccess().getCommaKeyword_5_1_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:186:1: ( (lv_annotationTypes_12_0= ruleAnnotationType ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:187:1: (lv_annotationTypes_12_0= ruleAnnotationType )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:187:1: (lv_annotationTypes_12_0= ruleAnnotationType )
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:188:3: lv_annotationTypes_12_0= ruleAnnotationType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPackageAccess().getAnnotationTypesAnnotationTypeParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationType_in_rulePackage316);
                    	    lv_annotationTypes_12_0=ruleAnnotationType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotationTypes",
                    	            		lv_annotationTypes_12_0, 
                    	            		"AnnotationType");
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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleAnnotationAttributeValue"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:212:1: entryRuleAnnotationAttributeValue returns [EObject current=null] : iv_ruleAnnotationAttributeValue= ruleAnnotationAttributeValue EOF ;
    public final EObject entryRuleAnnotationAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationAttributeValue = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:213:2: (iv_ruleAnnotationAttributeValue= ruleAnnotationAttributeValue EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:214:2: iv_ruleAnnotationAttributeValue= ruleAnnotationAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAnnotationAttributeValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttributeValue_in_entryRuleAnnotationAttributeValue356);
            iv_ruleAnnotationAttributeValue=ruleAnnotationAttributeValue();

            state._fsp--;

             current =iv_ruleAnnotationAttributeValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationAttributeValue366); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:221:1: ruleAnnotationAttributeValue returns [EObject current=null] : this_SimpleValue_0= ruleSimpleValue ;
    public final EObject ruleAnnotationAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleValue_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:224:28: (this_SimpleValue_0= ruleSimpleValue )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:226:5: this_SimpleValue_0= ruleSimpleValue
            {
             
                    newCompositeNode(grammarAccess.getAnnotationAttributeValueAccess().getSimpleValueParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSimpleValue_in_ruleAnnotationAttributeValue412);
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


    // $ANTLR start "entryRuleType"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:244:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:245:2: (iv_ruleType= ruleType EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:246:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_entryRuleType448);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleType458); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:253:1: ruleType returns [EObject current=null] : ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:256:28: ( ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:257:1: ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:257:1: ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:257:2: () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';'
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:257:2: ()
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:258:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTypeAccess().getTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleType504); 

                	newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getTypeKeyword_1());
                
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:267:1: ( (lv_name_2_0= ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:268:1: (lv_name_2_0= ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:268:1: (lv_name_2_0= ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:269:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTypeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleType525);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleType537); 

                	newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleAnnotationType"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:297:1: entryRuleAnnotationType returns [EObject current=null] : iv_ruleAnnotationType= ruleAnnotationType EOF ;
    public final EObject entryRuleAnnotationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationType = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:298:2: (iv_ruleAnnotationType= ruleAnnotationType EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:299:2: iv_ruleAnnotationType= ruleAnnotationType EOF
            {
             newCompositeNode(grammarAccess.getAnnotationTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType573);
            iv_ruleAnnotationType=ruleAnnotationType();

            state._fsp--;

             current =iv_ruleAnnotationType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationType583); 

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
    // $ANTLR end "entryRuleAnnotationType"


    // $ANTLR start "ruleAnnotationType"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:306:1: ruleAnnotationType returns [EObject current=null] : ( () otherlv_1= '@annotation' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'context' ( (lv_context_4_0= ruleEString ) ) )? otherlv_5= '{' ( ( (lv_attributes_6_0= ruleAnnotationTypeAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationTypeAttribute ) ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleAnnotationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_context_4_0 = null;

        EObject lv_attributes_6_0 = null;

        EObject lv_attributes_8_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:309:28: ( ( () otherlv_1= '@annotation' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'context' ( (lv_context_4_0= ruleEString ) ) )? otherlv_5= '{' ( ( (lv_attributes_6_0= ruleAnnotationTypeAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationTypeAttribute ) ) )* )? otherlv_9= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:310:1: ( () otherlv_1= '@annotation' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'context' ( (lv_context_4_0= ruleEString ) ) )? otherlv_5= '{' ( ( (lv_attributes_6_0= ruleAnnotationTypeAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationTypeAttribute ) ) )* )? otherlv_9= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:310:1: ( () otherlv_1= '@annotation' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'context' ( (lv_context_4_0= ruleEString ) ) )? otherlv_5= '{' ( ( (lv_attributes_6_0= ruleAnnotationTypeAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationTypeAttribute ) ) )* )? otherlv_9= '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:310:2: () otherlv_1= '@annotation' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'context' ( (lv_context_4_0= ruleEString ) ) )? otherlv_5= '{' ( ( (lv_attributes_6_0= ruleAnnotationTypeAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationTypeAttribute ) ) )* )? otherlv_9= '}'
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:310:2: ()
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:311:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnnotationTypeAccess().getAnnotationTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnnotationType629); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationTypeAccess().getAnnotationKeyword_1());
                
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:320:1: ( (lv_name_2_0= ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:321:1: (lv_name_2_0= ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:321:1: (lv_name_2_0= ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:322:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnnotationTypeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotationType650);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnnotationTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:338:2: (otherlv_3= 'context' ( (lv_context_4_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:338:4: otherlv_3= 'context' ( (lv_context_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnnotationType663); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnnotationTypeAccess().getContextKeyword_3_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:342:1: ( (lv_context_4_0= ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:343:1: (lv_context_4_0= ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:343:1: (lv_context_4_0= ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:344:3: lv_context_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationTypeAccess().getContextEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotationType684);
                    lv_context_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnnotationTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"context",
                            		lv_context_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnnotationType698); 

                	newLeafNode(otherlv_5, grammarAccess.getAnnotationTypeAccess().getLeftCurlyBracketKeyword_4());
                
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:364:1: ( ( (lv_attributes_6_0= ruleAnnotationTypeAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationTypeAttribute ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:364:2: ( (lv_attributes_6_0= ruleAnnotationTypeAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationTypeAttribute ) ) )*
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:364:2: ( (lv_attributes_6_0= ruleAnnotationTypeAttribute ) )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:365:1: (lv_attributes_6_0= ruleAnnotationTypeAttribute )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:365:1: (lv_attributes_6_0= ruleAnnotationTypeAttribute )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:366:3: lv_attributes_6_0= ruleAnnotationTypeAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationTypeAccess().getAttributesAnnotationTypeAttributeParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationTypeAttribute_in_ruleAnnotationType720);
                    lv_attributes_6_0=ruleAnnotationTypeAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnnotationTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_6_0, 
                            		"AnnotationTypeAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:382:2: (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationTypeAttribute ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:382:4: otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationTypeAttribute ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnnotationType733); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getAnnotationTypeAccess().getCommaKeyword_5_1_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:386:1: ( (lv_attributes_8_0= ruleAnnotationTypeAttribute ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:387:1: (lv_attributes_8_0= ruleAnnotationTypeAttribute )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:387:1: (lv_attributes_8_0= ruleAnnotationTypeAttribute )
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:388:3: lv_attributes_8_0= ruleAnnotationTypeAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationTypeAccess().getAttributesAnnotationTypeAttributeParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationTypeAttribute_in_ruleAnnotationType754);
                    	    lv_attributes_8_0=ruleAnnotationTypeAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnnotationTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_8_0, 
                    	            		"AnnotationTypeAttribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAnnotationType770); 

                	newLeafNode(otherlv_9, grammarAccess.getAnnotationTypeAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleAnnotationType"


    // $ANTLR start "entryRuleAnnotationAttribute"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:416:1: entryRuleAnnotationAttribute returns [EObject current=null] : iv_ruleAnnotationAttribute= ruleAnnotationAttribute EOF ;
    public final EObject entryRuleAnnotationAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationAttribute = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:417:2: (iv_ruleAnnotationAttribute= ruleAnnotationAttribute EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:418:2: iv_ruleAnnotationAttribute= ruleAnnotationAttribute EOF
            {
             newCompositeNode(grammarAccess.getAnnotationAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttribute_in_entryRuleAnnotationAttribute806);
            iv_ruleAnnotationAttribute=ruleAnnotationAttribute();

            state._fsp--;

             current =iv_ruleAnnotationAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationAttribute816); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:425:1: ruleAnnotationAttribute returns [EObject current=null] : (otherlv_0= 'AnnotationAttribute' otherlv_1= '{' otherlv_2= 'attribute' ( ( ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAnnotationAttributeValue ) ) )? otherlv_6= '}' ) ;
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
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:428:28: ( (otherlv_0= 'AnnotationAttribute' otherlv_1= '{' otherlv_2= 'attribute' ( ( ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAnnotationAttributeValue ) ) )? otherlv_6= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:429:1: (otherlv_0= 'AnnotationAttribute' otherlv_1= '{' otherlv_2= 'attribute' ( ( ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAnnotationAttributeValue ) ) )? otherlv_6= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:429:1: (otherlv_0= 'AnnotationAttribute' otherlv_1= '{' otherlv_2= 'attribute' ( ( ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAnnotationAttributeValue ) ) )? otherlv_6= '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:429:3: otherlv_0= 'AnnotationAttribute' otherlv_1= '{' otherlv_2= 'attribute' ( ( ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAnnotationAttributeValue ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnnotationAttribute853); 

                	newLeafNode(otherlv_0, grammarAccess.getAnnotationAttributeAccess().getAnnotationAttributeKeyword_0());
                
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnnotationAttribute865); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationAttributeAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnnotationAttribute877); 

                	newLeafNode(otherlv_2, grammarAccess.getAnnotationAttributeAccess().getAttributeKeyword_2());
                
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:441:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:442:1: ( ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:442:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:443:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationAttributeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAnnotationAttributeAccess().getAttributeAnnotationTypeAttributeCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotationAttribute900);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:456:2: (otherlv_4= 'value' ( (lv_value_5_0= ruleAnnotationAttributeValue ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:456:4: otherlv_4= 'value' ( (lv_value_5_0= ruleAnnotationAttributeValue ) )
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnnotationAttribute913); 

                        	newLeafNode(otherlv_4, grammarAccess.getAnnotationAttributeAccess().getValueKeyword_4_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:460:1: ( (lv_value_5_0= ruleAnnotationAttributeValue ) )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:461:1: (lv_value_5_0= ruleAnnotationAttributeValue )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:461:1: (lv_value_5_0= ruleAnnotationAttributeValue )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:462:3: lv_value_5_0= ruleAnnotationAttributeValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAttributeAccess().getValueAnnotationAttributeValueParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttributeValue_in_ruleAnnotationAttribute934);
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

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAnnotationAttribute948); 

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


    // $ANTLR start "entryRuleEString"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:490:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:491:2: (iv_ruleEString= ruleEString EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:492:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString985);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString996); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:499:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:502:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:503:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:503:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:503:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1036); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:511:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1062); 

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


    // $ANTLR start "entryRuleAnnotationTypeAttribute"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:526:1: entryRuleAnnotationTypeAttribute returns [EObject current=null] : iv_ruleAnnotationTypeAttribute= ruleAnnotationTypeAttribute EOF ;
    public final EObject entryRuleAnnotationTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationTypeAttribute = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:527:2: (iv_ruleAnnotationTypeAttribute= ruleAnnotationTypeAttribute EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:528:2: iv_ruleAnnotationTypeAttribute= ruleAnnotationTypeAttribute EOF
            {
             newCompositeNode(grammarAccess.getAnnotationTypeAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationTypeAttribute_in_entryRuleAnnotationTypeAttribute1107);
            iv_ruleAnnotationTypeAttribute=ruleAnnotationTypeAttribute();

            state._fsp--;

             current =iv_ruleAnnotationTypeAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationTypeAttribute1117); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:535:1: ruleAnnotationTypeAttribute returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleAnnotationTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:538:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:539:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:539:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:539:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:539:2: ()
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:540:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnnotationTypeAttributeAccess().getAnnotationTypeAttributeAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:545:2: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:546:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:546:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:547:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnnotationTypeAttribute1168); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAnnotationTypeAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationTypeAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAnnotationTypeAttribute1185); 

                	newLeafNode(otherlv_2, grammarAccess.getAnnotationTypeAttributeAccess().getColonKeyword_2());
                
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:567:1: ( (otherlv_3= RULE_ID ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:568:1: (otherlv_3= RULE_ID )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:568:1: (otherlv_3= RULE_ID )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:569:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationTypeAttributeRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnnotationTypeAttribute1205); 

            		newLeafNode(otherlv_3, grammarAccess.getAnnotationTypeAttributeAccess().getTypeTypeCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleAnnotationTypeAttribute"


    // $ANTLR start "entryRuleSimpleValue"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:588:1: entryRuleSimpleValue returns [EObject current=null] : iv_ruleSimpleValue= ruleSimpleValue EOF ;
    public final EObject entryRuleSimpleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleValue = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:589:2: (iv_ruleSimpleValue= ruleSimpleValue EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:590:2: iv_ruleSimpleValue= ruleSimpleValue EOF
            {
             newCompositeNode(grammarAccess.getSimpleValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue1241);
            iv_ruleSimpleValue=ruleSimpleValue();

            state._fsp--;

             current =iv_ruleSimpleValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleValue1251); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:597:1: ruleSimpleValue returns [EObject current=null] : ( () otherlv_1= 'SimpleValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleSimpleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:600:28: ( ( () otherlv_1= 'SimpleValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:601:1: ( () otherlv_1= 'SimpleValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:601:1: ( () otherlv_1= 'SimpleValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:601:2: () otherlv_1= 'SimpleValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:601:2: ()
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:602:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleValueAccess().getSimpleValueAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSimpleValue1297); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleValueAccess().getSimpleValueKeyword_1());
                
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSimpleValue1309); 

                	newLeafNode(otherlv_2, grammarAccess.getSimpleValueAccess().getLeftCurlyBracketKeyword_2());
                
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:615:1: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:615:3: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSimpleValue1322); 

                        	newLeafNode(otherlv_3, grammarAccess.getSimpleValueAccess().getValueKeyword_3_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:619:1: ( (lv_value_4_0= ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:620:1: (lv_value_4_0= ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:620:1: (lv_value_4_0= ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:621:3: lv_value_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleValueAccess().getValueEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSimpleValue1343);
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

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSimpleValue1357); 

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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulePackage_in_entryRulePackage75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackage85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rulePackage131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePackage152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePackage164 = new BitSet(new long[]{0x0000000000042002L});
        public static final BitSet FOLLOW_13_in_rulePackage177 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePackage189 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleType_in_rulePackage210 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_rulePackage223 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleType_in_rulePackage244 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_rulePackage258 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleAnnotationType_in_rulePackage282 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_rulePackage295 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleAnnotationType_in_rulePackage316 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_ruleAnnotationAttributeValue_in_entryRuleAnnotationAttributeValue356 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationAttributeValue366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleValue_in_ruleAnnotationAttributeValue412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_entryRuleType448 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleType458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleType504 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleType525 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleType537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType573 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationType583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleAnnotationType629 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotationType650 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_19_in_ruleAnnotationType663 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotationType684 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAnnotationType698 = new BitSet(new long[]{0x0000000000010020L});
        public static final BitSet FOLLOW_ruleAnnotationTypeAttribute_in_ruleAnnotationType720 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleAnnotationType733 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleAnnotationTypeAttribute_in_ruleAnnotationType754 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleAnnotationType770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_entryRuleAnnotationAttribute806 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationAttribute816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleAnnotationAttribute853 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAnnotationAttribute865 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAnnotationAttribute877 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotationAttribute900 = new BitSet(new long[]{0x0000000000410000L});
        public static final BitSet FOLLOW_22_in_ruleAnnotationAttribute913 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotationAttributeValue_in_ruleAnnotationAttribute934 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleAnnotationAttribute948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString985 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationTypeAttribute_in_entryRuleAnnotationTypeAttribute1107 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationTypeAttribute1117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationTypeAttribute1168 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleAnnotationTypeAttribute1185 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationTypeAttribute1205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue1241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValue1251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleSimpleValue1297 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSimpleValue1309 = new BitSet(new long[]{0x0000000000410000L});
        public static final BitSet FOLLOW_22_in_ruleSimpleValue1322 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSimpleValue1343 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSimpleValue1357 = new BitSet(new long[]{0x0000000000000002L});
    }


}