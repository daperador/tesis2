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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "'{'", "'annotations'", "','", "'}'", "'types'", "'annotationTypes'", "'Annotation'", "'annotationType'", "'attributes'", "'Type'", "'AnnotationType'", "'context'", "'AnnotationAttribute'", "'attribute'", "'value'", "'AnnotationTypeAttribute'", "'type'", "'SimpleValue'"
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:76:1: rulePackage returns [EObject current=null] : ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'types' otherlv_11= '{' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )* otherlv_15= '}' )? (otherlv_16= 'annotationTypes' otherlv_17= '{' ( (lv_annotationTypes_18_0= ruleAnnotationType ) ) (otherlv_19= ',' ( (lv_annotationTypes_20_0= ruleAnnotationType ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
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

        EObject lv_annotations_6_0 = null;

        EObject lv_annotations_8_0 = null;

        EObject lv_types_12_0 = null;

        EObject lv_types_14_0 = null;

        EObject lv_annotationTypes_18_0 = null;

        EObject lv_annotationTypes_20_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:79:28: ( ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'types' otherlv_11= '{' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )* otherlv_15= '}' )? (otherlv_16= 'annotationTypes' otherlv_17= '{' ( (lv_annotationTypes_18_0= ruleAnnotationType ) ) (otherlv_19= ',' ( (lv_annotationTypes_20_0= ruleAnnotationType ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:80:1: ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'types' otherlv_11= '{' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )* otherlv_15= '}' )? (otherlv_16= 'annotationTypes' otherlv_17= '{' ( (lv_annotationTypes_18_0= ruleAnnotationType ) ) (otherlv_19= ',' ( (lv_annotationTypes_20_0= ruleAnnotationType ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:80:1: ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'types' otherlv_11= '{' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )* otherlv_15= '}' )? (otherlv_16= 'annotationTypes' otherlv_17= '{' ( (lv_annotationTypes_18_0= ruleAnnotationType ) ) (otherlv_19= ',' ( (lv_annotationTypes_20_0= ruleAnnotationType ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:80:2: () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'types' otherlv_11= '{' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )* otherlv_15= '}' )? (otherlv_16= 'annotationTypes' otherlv_17= '{' ( (lv_annotationTypes_18_0= ruleAnnotationType ) ) (otherlv_19= ',' ( (lv_annotationTypes_20_0= ruleAnnotationType ) ) )* otherlv_21= '}' )? otherlv_22= '}'
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

                	newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:112:1: (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:112:3: otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePackage177); 

                        	newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getAnnotationsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePackage189); 

                        	newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:120:1: ( (lv_annotations_6_0= ruleAnnotation ) )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:121:1: (lv_annotations_6_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:121:1: (lv_annotations_6_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:122:3: lv_annotations_6_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageAccess().getAnnotationsAnnotationParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rulePackage210);
                    lv_annotations_6_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_6_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:138:2: (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:138:4: otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePackage223); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getPackageAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:142:1: ( (lv_annotations_8_0= ruleAnnotation ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:143:1: (lv_annotations_8_0= ruleAnnotation )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:143:1: (lv_annotations_8_0= ruleAnnotation )
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:144:3: lv_annotations_8_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPackageAccess().getAnnotationsAnnotationParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rulePackage244);
                    	    lv_annotations_8_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
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
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePackage258); 

                        	newLeafNode(otherlv_9, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:164:3: (otherlv_10= 'types' otherlv_11= '{' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:164:5: otherlv_10= 'types' otherlv_11= '{' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePackage273); 

                        	newLeafNode(otherlv_10, grammarAccess.getPackageAccess().getTypesKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePackage285); 

                        	newLeafNode(otherlv_11, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:172:1: ( (lv_types_12_0= ruleType ) )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:173:1: (lv_types_12_0= ruleType )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:173:1: (lv_types_12_0= ruleType )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:174:3: lv_types_12_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageAccess().getTypesTypeParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleType_in_rulePackage306);
                    lv_types_12_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"types",
                            		lv_types_12_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:190:2: (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:190:4: otherlv_13= ',' ( (lv_types_14_0= ruleType ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePackage319); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getPackageAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:194:1: ( (lv_types_14_0= ruleType ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:195:1: (lv_types_14_0= ruleType )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:195:1: (lv_types_14_0= ruleType )
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:196:3: lv_types_14_0= ruleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPackageAccess().getTypesTypeParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleType_in_rulePackage340);
                    	    lv_types_14_0=ruleType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"types",
                    	            		lv_types_14_0, 
                    	            		"Type");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePackage354); 

                        	newLeafNode(otherlv_15, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:216:3: (otherlv_16= 'annotationTypes' otherlv_17= '{' ( (lv_annotationTypes_18_0= ruleAnnotationType ) ) (otherlv_19= ',' ( (lv_annotationTypes_20_0= ruleAnnotationType ) ) )* otherlv_21= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:216:5: otherlv_16= 'annotationTypes' otherlv_17= '{' ( (lv_annotationTypes_18_0= ruleAnnotationType ) ) (otherlv_19= ',' ( (lv_annotationTypes_20_0= ruleAnnotationType ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePackage369); 

                        	newLeafNode(otherlv_16, grammarAccess.getPackageAccess().getAnnotationTypesKeyword_6_0());
                        
                    otherlv_17=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePackage381); 

                        	newLeafNode(otherlv_17, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:224:1: ( (lv_annotationTypes_18_0= ruleAnnotationType ) )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:225:1: (lv_annotationTypes_18_0= ruleAnnotationType )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:225:1: (lv_annotationTypes_18_0= ruleAnnotationType )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:226:3: lv_annotationTypes_18_0= ruleAnnotationType
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageAccess().getAnnotationTypesAnnotationTypeParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationType_in_rulePackage402);
                    lv_annotationTypes_18_0=ruleAnnotationType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"annotationTypes",
                            		lv_annotationTypes_18_0, 
                            		"AnnotationType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:242:2: (otherlv_19= ',' ( (lv_annotationTypes_20_0= ruleAnnotationType ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:242:4: otherlv_19= ',' ( (lv_annotationTypes_20_0= ruleAnnotationType ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePackage415); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getPackageAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:246:1: ( (lv_annotationTypes_20_0= ruleAnnotationType ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:247:1: (lv_annotationTypes_20_0= ruleAnnotationType )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:247:1: (lv_annotationTypes_20_0= ruleAnnotationType )
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:248:3: lv_annotationTypes_20_0= ruleAnnotationType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPackageAccess().getAnnotationTypesAnnotationTypeParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationType_in_rulePackage436);
                    	    lv_annotationTypes_20_0=ruleAnnotationType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotationTypes",
                    	            		lv_annotationTypes_20_0, 
                    	            		"AnnotationType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePackage450); 

                        	newLeafNode(otherlv_21, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePackage464); 

                	newLeafNode(otherlv_22, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:280:1: entryRuleAnnotationAttributeValue returns [EObject current=null] : iv_ruleAnnotationAttributeValue= ruleAnnotationAttributeValue EOF ;
    public final EObject entryRuleAnnotationAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationAttributeValue = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:281:2: (iv_ruleAnnotationAttributeValue= ruleAnnotationAttributeValue EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:282:2: iv_ruleAnnotationAttributeValue= ruleAnnotationAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAnnotationAttributeValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttributeValue_in_entryRuleAnnotationAttributeValue500);
            iv_ruleAnnotationAttributeValue=ruleAnnotationAttributeValue();

            state._fsp--;

             current =iv_ruleAnnotationAttributeValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationAttributeValue510); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:289:1: ruleAnnotationAttributeValue returns [EObject current=null] : this_SimpleValue_0= ruleSimpleValue ;
    public final EObject ruleAnnotationAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleValue_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:292:28: (this_SimpleValue_0= ruleSimpleValue )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:294:5: this_SimpleValue_0= ruleSimpleValue
            {
             
                    newCompositeNode(grammarAccess.getAnnotationAttributeValueAccess().getSimpleValueParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSimpleValue_in_ruleAnnotationAttributeValue556);
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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:310:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:311:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:312:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation590);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation600); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:319:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= 'Annotation' otherlv_1= '{' otherlv_2= 'annotationType' ( ( ruleEString ) ) (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAnnotationAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationAttribute ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:322:28: ( (otherlv_0= 'Annotation' otherlv_1= '{' otherlv_2= 'annotationType' ( ( ruleEString ) ) (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAnnotationAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationAttribute ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:323:1: (otherlv_0= 'Annotation' otherlv_1= '{' otherlv_2= 'annotationType' ( ( ruleEString ) ) (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAnnotationAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationAttribute ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:323:1: (otherlv_0= 'Annotation' otherlv_1= '{' otherlv_2= 'annotationType' ( ( ruleEString ) ) (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAnnotationAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationAttribute ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:323:3: otherlv_0= 'Annotation' otherlv_1= '{' otherlv_2= 'annotationType' ( ( ruleEString ) ) (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAnnotationAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationAttribute ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnnotation637); 

                	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getAnnotationKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAnnotation649); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnnotation661); 

                	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getAnnotationTypeKeyword_2());
                
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:335:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:336:1: ( ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:336:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:337:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationTypeAnnotationTypeCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation684);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:350:2: (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAnnotationAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationAttribute ) ) )* otherlv_9= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:350:4: otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAnnotationAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationAttribute ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnnotation697); 

                        	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getAttributesKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAnnotation709); 

                        	newLeafNode(otherlv_5, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:358:1: ( (lv_attributes_6_0= ruleAnnotationAttribute ) )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:359:1: (lv_attributes_6_0= ruleAnnotationAttribute )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:359:1: (lv_attributes_6_0= ruleAnnotationAttribute )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:360:3: lv_attributes_6_0= ruleAnnotationAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getAttributesAnnotationAttributeParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttribute_in_ruleAnnotation730);
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

                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:376:2: (otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationAttribute ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:376:4: otherlv_7= ',' ( (lv_attributes_8_0= ruleAnnotationAttribute ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnnotation743); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getAnnotationAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:380:1: ( (lv_attributes_8_0= ruleAnnotationAttribute ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:381:1: (lv_attributes_8_0= ruleAnnotationAttribute )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:381:1: (lv_attributes_8_0= ruleAnnotationAttribute )
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:382:3: lv_attributes_8_0= ruleAnnotationAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getAttributesAnnotationAttributeParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttribute_in_ruleAnnotation764);
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
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnnotation778); 

                        	newLeafNode(otherlv_9, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnnotation792); 

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


    // $ANTLR start "entryRuleType"
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:414:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:415:2: (iv_ruleType= ruleType EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:416:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_entryRuleType828);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleType838); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:423:1: ruleType returns [EObject current=null] : ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'attributes' otherlv_11= '{' ( (lv_attributes_12_0= ruleAnnotationTypeAttribute ) ) (otherlv_13= ',' ( (lv_attributes_14_0= ruleAnnotationTypeAttribute ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleType() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_annotations_6_0 = null;

        EObject lv_annotations_8_0 = null;

        EObject lv_attributes_12_0 = null;

        EObject lv_attributes_14_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:426:28: ( ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'attributes' otherlv_11= '{' ( (lv_attributes_12_0= ruleAnnotationTypeAttribute ) ) (otherlv_13= ',' ( (lv_attributes_14_0= ruleAnnotationTypeAttribute ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:427:1: ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'attributes' otherlv_11= '{' ( (lv_attributes_12_0= ruleAnnotationTypeAttribute ) ) (otherlv_13= ',' ( (lv_attributes_14_0= ruleAnnotationTypeAttribute ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:427:1: ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'attributes' otherlv_11= '{' ( (lv_attributes_12_0= ruleAnnotationTypeAttribute ) ) (otherlv_13= ',' ( (lv_attributes_14_0= ruleAnnotationTypeAttribute ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:427:2: () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'attributes' otherlv_11= '{' ( (lv_attributes_12_0= ruleAnnotationTypeAttribute ) ) (otherlv_13= ',' ( (lv_attributes_14_0= ruleAnnotationTypeAttribute ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:427:2: ()
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:428:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTypeAccess().getTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleType884); 

                	newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getTypeKeyword_1());
                
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:437:1: ( (lv_name_2_0= ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:438:1: (lv_name_2_0= ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:438:1: (lv_name_2_0= ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:439:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTypeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleType905);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleType917); 

                	newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:459:1: (otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:459:3: otherlv_4= 'annotations' otherlv_5= '{' ( (lv_annotations_6_0= ruleAnnotation ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleType930); 

                        	newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getAnnotationsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleType942); 

                        	newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:467:1: ( (lv_annotations_6_0= ruleAnnotation ) )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:468:1: (lv_annotations_6_0= ruleAnnotation )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:468:1: (lv_annotations_6_0= ruleAnnotation )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:469:3: lv_annotations_6_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getAnnotationsAnnotationParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleType963);
                    lv_annotations_6_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_6_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:485:2: (otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:485:4: otherlv_7= ',' ( (lv_annotations_8_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleType976); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:489:1: ( (lv_annotations_8_0= ruleAnnotation ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:490:1: (lv_annotations_8_0= ruleAnnotation )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:490:1: (lv_annotations_8_0= ruleAnnotation )
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:491:3: lv_annotations_8_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTypeAccess().getAnnotationsAnnotationParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleType997);
                    	    lv_annotations_8_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTypeRule());
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
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleType1011); 

                        	newLeafNode(otherlv_9, grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:511:3: (otherlv_10= 'attributes' otherlv_11= '{' ( (lv_attributes_12_0= ruleAnnotationTypeAttribute ) ) (otherlv_13= ',' ( (lv_attributes_14_0= ruleAnnotationTypeAttribute ) ) )* otherlv_15= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:511:5: otherlv_10= 'attributes' otherlv_11= '{' ( (lv_attributes_12_0= ruleAnnotationTypeAttribute ) ) (otherlv_13= ',' ( (lv_attributes_14_0= ruleAnnotationTypeAttribute ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleType1026); 

                        	newLeafNode(otherlv_10, grammarAccess.getTypeAccess().getAttributesKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleType1038); 

                        	newLeafNode(otherlv_11, grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:519:1: ( (lv_attributes_12_0= ruleAnnotationTypeAttribute ) )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:520:1: (lv_attributes_12_0= ruleAnnotationTypeAttribute )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:520:1: (lv_attributes_12_0= ruleAnnotationTypeAttribute )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:521:3: lv_attributes_12_0= ruleAnnotationTypeAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getAttributesAnnotationTypeAttributeParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationTypeAttribute_in_ruleType1059);
                    lv_attributes_12_0=ruleAnnotationTypeAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_12_0, 
                            		"AnnotationTypeAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:537:2: (otherlv_13= ',' ( (lv_attributes_14_0= ruleAnnotationTypeAttribute ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:537:4: otherlv_13= ',' ( (lv_attributes_14_0= ruleAnnotationTypeAttribute ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleType1072); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getTypeAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:541:1: ( (lv_attributes_14_0= ruleAnnotationTypeAttribute ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:542:1: (lv_attributes_14_0= ruleAnnotationTypeAttribute )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:542:1: (lv_attributes_14_0= ruleAnnotationTypeAttribute )
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:543:3: lv_attributes_14_0= ruleAnnotationTypeAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTypeAccess().getAttributesAnnotationTypeAttributeParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationTypeAttribute_in_ruleType1093);
                    	    lv_attributes_14_0=ruleAnnotationTypeAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_14_0, 
                    	            		"AnnotationTypeAttribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleType1107); 

                        	newLeafNode(otherlv_15, grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleType1121); 

                	newLeafNode(otherlv_16, grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:575:1: entryRuleAnnotationType returns [EObject current=null] : iv_ruleAnnotationType= ruleAnnotationType EOF ;
    public final EObject entryRuleAnnotationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationType = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:576:2: (iv_ruleAnnotationType= ruleAnnotationType EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:577:2: iv_ruleAnnotationType= ruleAnnotationType EOF
            {
             newCompositeNode(grammarAccess.getAnnotationTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType1157);
            iv_ruleAnnotationType=ruleAnnotationType();

            state._fsp--;

             current =iv_ruleAnnotationType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationType1167); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:584:1: ruleAnnotationType returns [EObject current=null] : ( () otherlv_1= 'AnnotationType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'context' ( (lv_context_5_0= ruleEString ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAnnotationTypeAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAnnotationTypeAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleAnnotationType() throws RecognitionException {
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

        AntlrDatatypeRuleToken lv_context_5_0 = null;

        EObject lv_attributes_8_0 = null;

        EObject lv_attributes_10_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:587:28: ( ( () otherlv_1= 'AnnotationType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'context' ( (lv_context_5_0= ruleEString ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAnnotationTypeAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAnnotationTypeAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:588:1: ( () otherlv_1= 'AnnotationType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'context' ( (lv_context_5_0= ruleEString ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAnnotationTypeAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAnnotationTypeAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:588:1: ( () otherlv_1= 'AnnotationType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'context' ( (lv_context_5_0= ruleEString ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAnnotationTypeAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAnnotationTypeAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:588:2: () otherlv_1= 'AnnotationType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'context' ( (lv_context_5_0= ruleEString ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAnnotationTypeAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAnnotationTypeAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:588:2: ()
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:589:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnnotationTypeAccess().getAnnotationTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnnotationType1213); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationTypeAccess().getAnnotationTypeKeyword_1());
                
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:598:1: ( (lv_name_2_0= ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:599:1: (lv_name_2_0= ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:599:1: (lv_name_2_0= ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:600:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnnotationTypeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotationType1234);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAnnotationType1246); 

                	newLeafNode(otherlv_3, grammarAccess.getAnnotationTypeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:620:1: (otherlv_4= 'context' ( (lv_context_5_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:620:3: otherlv_4= 'context' ( (lv_context_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAnnotationType1259); 

                        	newLeafNode(otherlv_4, grammarAccess.getAnnotationTypeAccess().getContextKeyword_4_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:624:1: ( (lv_context_5_0= ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:625:1: (lv_context_5_0= ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:625:1: (lv_context_5_0= ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:626:3: lv_context_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationTypeAccess().getContextEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotationType1280);
                    lv_context_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnnotationTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"context",
                            		lv_context_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:642:4: (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAnnotationTypeAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAnnotationTypeAttribute ) ) )* otherlv_11= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:642:6: otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAnnotationTypeAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAnnotationTypeAttribute ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnnotationType1295); 

                        	newLeafNode(otherlv_6, grammarAccess.getAnnotationTypeAccess().getAttributesKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAnnotationType1307); 

                        	newLeafNode(otherlv_7, grammarAccess.getAnnotationTypeAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:650:1: ( (lv_attributes_8_0= ruleAnnotationTypeAttribute ) )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:651:1: (lv_attributes_8_0= ruleAnnotationTypeAttribute )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:651:1: (lv_attributes_8_0= ruleAnnotationTypeAttribute )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:652:3: lv_attributes_8_0= ruleAnnotationTypeAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationTypeAccess().getAttributesAnnotationTypeAttributeParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationTypeAttribute_in_ruleAnnotationType1328);
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

                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:668:2: (otherlv_9= ',' ( (lv_attributes_10_0= ruleAnnotationTypeAttribute ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:668:4: otherlv_9= ',' ( (lv_attributes_10_0= ruleAnnotationTypeAttribute ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnnotationType1341); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getAnnotationTypeAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:672:1: ( (lv_attributes_10_0= ruleAnnotationTypeAttribute ) )
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:673:1: (lv_attributes_10_0= ruleAnnotationTypeAttribute )
                    	    {
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:673:1: (lv_attributes_10_0= ruleAnnotationTypeAttribute )
                    	    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:674:3: lv_attributes_10_0= ruleAnnotationTypeAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationTypeAccess().getAttributesAnnotationTypeAttributeParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationTypeAttribute_in_ruleAnnotationType1362);
                    	    lv_attributes_10_0=ruleAnnotationTypeAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnnotationTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_10_0, 
                    	            		"AnnotationTypeAttribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnnotationType1376); 

                        	newLeafNode(otherlv_11, grammarAccess.getAnnotationTypeAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnnotationType1390); 

                	newLeafNode(otherlv_12, grammarAccess.getAnnotationTypeAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:706:1: entryRuleAnnotationAttribute returns [EObject current=null] : iv_ruleAnnotationAttribute= ruleAnnotationAttribute EOF ;
    public final EObject entryRuleAnnotationAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationAttribute = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:707:2: (iv_ruleAnnotationAttribute= ruleAnnotationAttribute EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:708:2: iv_ruleAnnotationAttribute= ruleAnnotationAttribute EOF
            {
             newCompositeNode(grammarAccess.getAnnotationAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttribute_in_entryRuleAnnotationAttribute1426);
            iv_ruleAnnotationAttribute=ruleAnnotationAttribute();

            state._fsp--;

             current =iv_ruleAnnotationAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationAttribute1436); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:715:1: ruleAnnotationAttribute returns [EObject current=null] : (otherlv_0= 'AnnotationAttribute' otherlv_1= '{' otherlv_2= 'attribute' ( ( ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAnnotationAttributeValue ) ) )? otherlv_6= '}' ) ;
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
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:718:28: ( (otherlv_0= 'AnnotationAttribute' otherlv_1= '{' otherlv_2= 'attribute' ( ( ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAnnotationAttributeValue ) ) )? otherlv_6= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:719:1: (otherlv_0= 'AnnotationAttribute' otherlv_1= '{' otherlv_2= 'attribute' ( ( ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAnnotationAttributeValue ) ) )? otherlv_6= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:719:1: (otherlv_0= 'AnnotationAttribute' otherlv_1= '{' otherlv_2= 'attribute' ( ( ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAnnotationAttributeValue ) ) )? otherlv_6= '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:719:3: otherlv_0= 'AnnotationAttribute' otherlv_1= '{' otherlv_2= 'attribute' ( ( ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAnnotationAttributeValue ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAnnotationAttribute1473); 

                	newLeafNode(otherlv_0, grammarAccess.getAnnotationAttributeAccess().getAnnotationAttributeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAnnotationAttribute1485); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationAttributeAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAnnotationAttribute1497); 

                	newLeafNode(otherlv_2, grammarAccess.getAnnotationAttributeAccess().getAttributeKeyword_2());
                
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:731:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:732:1: ( ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:732:1: ( ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:733:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationAttributeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAnnotationAttributeAccess().getAttributeAnnotationTypeAttributeCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotationAttribute1520);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:746:2: (otherlv_4= 'value' ( (lv_value_5_0= ruleAnnotationAttributeValue ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:746:4: otherlv_4= 'value' ( (lv_value_5_0= ruleAnnotationAttributeValue ) )
                    {
                    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAnnotationAttribute1533); 

                        	newLeafNode(otherlv_4, grammarAccess.getAnnotationAttributeAccess().getValueKeyword_4_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:750:1: ( (lv_value_5_0= ruleAnnotationAttributeValue ) )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:751:1: (lv_value_5_0= ruleAnnotationAttributeValue )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:751:1: (lv_value_5_0= ruleAnnotationAttributeValue )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:752:3: lv_value_5_0= ruleAnnotationAttributeValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAttributeAccess().getValueAnnotationAttributeValueParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationAttributeValue_in_ruleAnnotationAttribute1554);
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

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnnotationAttribute1568); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:780:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:781:2: (iv_ruleEString= ruleEString EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:782:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1605);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1616); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:789:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:792:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:793:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:793:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:793:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1656); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:801:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1682); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:816:1: entryRuleAnnotationTypeAttribute returns [EObject current=null] : iv_ruleAnnotationTypeAttribute= ruleAnnotationTypeAttribute EOF ;
    public final EObject entryRuleAnnotationTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationTypeAttribute = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:817:2: (iv_ruleAnnotationTypeAttribute= ruleAnnotationTypeAttribute EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:818:2: iv_ruleAnnotationTypeAttribute= ruleAnnotationTypeAttribute EOF
            {
             newCompositeNode(grammarAccess.getAnnotationTypeAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationTypeAttribute_in_entryRuleAnnotationTypeAttribute1727);
            iv_ruleAnnotationTypeAttribute=ruleAnnotationTypeAttribute();

            state._fsp--;

             current =iv_ruleAnnotationTypeAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationTypeAttribute1737); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:825:1: ruleAnnotationTypeAttribute returns [EObject current=null] : ( () otherlv_1= 'AnnotationTypeAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleAnnotationTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:828:28: ( ( () otherlv_1= 'AnnotationTypeAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:829:1: ( () otherlv_1= 'AnnotationTypeAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:829:1: ( () otherlv_1= 'AnnotationTypeAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:829:2: () otherlv_1= 'AnnotationTypeAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:829:2: ()
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:830:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnnotationTypeAttributeAccess().getAnnotationTypeAttributeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAnnotationTypeAttribute1783); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationTypeAttributeAccess().getAnnotationTypeAttributeKeyword_1());
                
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:839:1: ( (lv_name_2_0= ruleEString ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:840:1: (lv_name_2_0= ruleEString )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:840:1: (lv_name_2_0= ruleEString )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:841:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnnotationTypeAttributeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotationTypeAttribute1804);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAnnotationTypeAttribute1816); 

                	newLeafNode(otherlv_3, grammarAccess.getAnnotationTypeAttributeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:861:1: (otherlv_4= 'type' ( ( ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:861:3: otherlv_4= 'type' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAnnotationTypeAttribute1829); 

                        	newLeafNode(otherlv_4, grammarAccess.getAnnotationTypeAttributeAccess().getTypeKeyword_4_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:865:1: ( ( ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:866:1: ( ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:866:1: ( ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:867:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnnotationTypeAttributeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAnnotationTypeAttributeAccess().getTypeTypeCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotationTypeAttribute1852);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnnotationTypeAttribute1866); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:892:1: entryRuleSimpleValue returns [EObject current=null] : iv_ruleSimpleValue= ruleSimpleValue EOF ;
    public final EObject entryRuleSimpleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleValue = null;


        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:893:2: (iv_ruleSimpleValue= ruleSimpleValue EOF )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:894:2: iv_ruleSimpleValue= ruleSimpleValue EOF
            {
             newCompositeNode(grammarAccess.getSimpleValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue1902);
            iv_ruleSimpleValue=ruleSimpleValue();

            state._fsp--;

             current =iv_ruleSimpleValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleValue1912); 

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
    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:901:1: ruleSimpleValue returns [EObject current=null] : ( () otherlv_1= 'SimpleValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleSimpleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:904:28: ( ( () otherlv_1= 'SimpleValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:905:1: ( () otherlv_1= 'SimpleValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:905:1: ( () otherlv_1= 'SimpleValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:905:2: () otherlv_1= 'SimpleValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:905:2: ()
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:906:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleValueAccess().getSimpleValueAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSimpleValue1958); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleValueAccess().getSimpleValueKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSimpleValue1970); 

                	newLeafNode(otherlv_2, grammarAccess.getSimpleValueAccess().getLeftCurlyBracketKeyword_2());
                
            // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:919:1: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:919:3: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSimpleValue1983); 

                        	newLeafNode(otherlv_3, grammarAccess.getSimpleValueAccess().getValueKeyword_3_0());
                        
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:923:1: ( (lv_value_4_0= ruleEString ) )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:924:1: (lv_value_4_0= ruleEString )
                    {
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:924:1: (lv_value_4_0= ruleEString )
                    // ../co.edu.uniandes.csw.spl.dsl.annotateit/src-gen/co/edu/uniandes/csw/spl/dsl/parser/antlr/internal/InternalAnnotateit.g:925:3: lv_value_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleValueAccess().getValueEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSimpleValue2004);
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

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSimpleValue2018); 

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
        public static final BitSet FOLLOW_12_in_rulePackage164 = new BitSet(new long[]{0x000000000003A000L});
        public static final BitSet FOLLOW_13_in_rulePackage177 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePackage189 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rulePackage210 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_rulePackage223 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rulePackage244 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_rulePackage258 = new BitSet(new long[]{0x0000000000038000L});
        public static final BitSet FOLLOW_16_in_rulePackage273 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePackage285 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleType_in_rulePackage306 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_rulePackage319 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleType_in_rulePackage340 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_rulePackage354 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_17_in_rulePackage369 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePackage381 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleAnnotationType_in_rulePackage402 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_rulePackage415 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleAnnotationType_in_rulePackage436 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_rulePackage450 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePackage464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttributeValue_in_entryRuleAnnotationAttributeValue500 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationAttributeValue510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleValue_in_ruleAnnotationAttributeValue556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation590 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleAnnotation637 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAnnotation649 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAnnotation661 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation684 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleAnnotation697 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAnnotation709 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_ruleAnnotation730 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleAnnotation743 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_ruleAnnotation764 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleAnnotation778 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAnnotation792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_entryRuleType828 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleType838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleType884 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleType905 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleType917 = new BitSet(new long[]{0x000000000010A000L});
        public static final BitSet FOLLOW_13_in_ruleType930 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleType942 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleType963 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleType976 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleType997 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleType1011 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleType1026 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleType1038 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAnnotationTypeAttribute_in_ruleType1059 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleType1072 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAnnotationTypeAttribute_in_ruleType1093 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleType1107 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleType1121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType1157 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationType1167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleAnnotationType1213 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotationType1234 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAnnotationType1246 = new BitSet(new long[]{0x0000000000908000L});
        public static final BitSet FOLLOW_23_in_ruleAnnotationType1259 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotationType1280 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleAnnotationType1295 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAnnotationType1307 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAnnotationTypeAttribute_in_ruleAnnotationType1328 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleAnnotationType1341 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAnnotationTypeAttribute_in_ruleAnnotationType1362 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleAnnotationType1376 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAnnotationType1390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationAttribute_in_entryRuleAnnotationAttribute1426 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationAttribute1436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleAnnotationAttribute1473 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAnnotationAttribute1485 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleAnnotationAttribute1497 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotationAttribute1520 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_26_in_ruleAnnotationAttribute1533 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotationAttributeValue_in_ruleAnnotationAttribute1554 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAnnotationAttribute1568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1605 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationTypeAttribute_in_entryRuleAnnotationTypeAttribute1727 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationTypeAttribute1737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleAnnotationTypeAttribute1783 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotationTypeAttribute1804 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAnnotationTypeAttribute1816 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_28_in_ruleAnnotationTypeAttribute1829 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotationTypeAttribute1852 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAnnotationTypeAttribute1866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue1902 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValue1912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleSimpleValue1958 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSimpleValue1970 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_26_in_ruleSimpleValue1983 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSimpleValue2004 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSimpleValue2018 = new BitSet(new long[]{0x0000000000000002L});
    }


}