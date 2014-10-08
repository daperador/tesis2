/*
* generated by Xtext
*/
package co.edu.uniandes.csw.spl.dsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class AnnotateitGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class PackageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Package");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPackageAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPackageKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cAnnotationsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cAnnotationsAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_4_2_0 = (RuleCall)cAnnotationsAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cAnnotationsAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_4_3_1_0 = (RuleCall)cAnnotationsAssignment_4_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cTypesKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cTypesAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cTypesTypeParserRuleCall_5_2_0 = (RuleCall)cTypesAssignment_5_2.eContents().get(0);
		private final Group cGroup_5_3 = (Group)cGroup_5.eContents().get(3);
		private final Keyword cCommaKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Assignment cTypesAssignment_5_3_1 = (Assignment)cGroup_5_3.eContents().get(1);
		private final RuleCall cTypesTypeParserRuleCall_5_3_1_0 = (RuleCall)cTypesAssignment_5_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_4 = (Keyword)cGroup_5.eContents().get(4);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cAnnotationTypesKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cAnnotationTypesAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cAnnotationTypesAnnotationTypeParserRuleCall_6_2_0 = (RuleCall)cAnnotationTypesAssignment_6_2.eContents().get(0);
		private final Group cGroup_6_3 = (Group)cGroup_6.eContents().get(3);
		private final Keyword cCommaKeyword_6_3_0 = (Keyword)cGroup_6_3.eContents().get(0);
		private final Assignment cAnnotationTypesAssignment_6_3_1 = (Assignment)cGroup_6_3.eContents().get(1);
		private final RuleCall cAnnotationTypesAnnotationTypeParserRuleCall_6_3_1_0 = (RuleCall)cAnnotationTypesAssignment_6_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_4 = (Keyword)cGroup_6.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Package:
		//	{Package} "Package" name=EString "{" ("annotations" "{" annotations+=Annotation ("," annotations+=Annotation)* "}")?
		//	("types" "{" types+=Type ("," types+=Type)* "}")? ("annotationTypes" "{" annotationTypes+=AnnotationType (","
		//	annotationTypes+=AnnotationType)* "}")? "}";
		public ParserRule getRule() { return rule; }

		//{Package} "Package" name=EString "{" ("annotations" "{" annotations+=Annotation ("," annotations+=Annotation)* "}")?
		//("types" "{" types+=Type ("," types+=Type)* "}")? ("annotationTypes" "{" annotationTypes+=AnnotationType (","
		//annotationTypes+=AnnotationType)* "}")? "}"
		public Group getGroup() { return cGroup; }

		//{Package}
		public Action getPackageAction_0() { return cPackageAction_0; }

		//"Package"
		public Keyword getPackageKeyword_1() { return cPackageKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("annotations" "{" annotations+=Annotation ("," annotations+=Annotation)* "}")?
		public Group getGroup_4() { return cGroup_4; }

		//"annotations"
		public Keyword getAnnotationsKeyword_4_0() { return cAnnotationsKeyword_4_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }

		//annotations+=Annotation
		public Assignment getAnnotationsAssignment_4_2() { return cAnnotationsAssignment_4_2; }

		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_4_2_0() { return cAnnotationsAnnotationParserRuleCall_4_2_0; }

		//("," annotations+=Annotation)*
		public Group getGroup_4_3() { return cGroup_4_3; }

		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }

		//annotations+=Annotation
		public Assignment getAnnotationsAssignment_4_3_1() { return cAnnotationsAssignment_4_3_1; }

		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_4_3_1_0() { return cAnnotationsAnnotationParserRuleCall_4_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }

		//("types" "{" types+=Type ("," types+=Type)* "}")?
		public Group getGroup_5() { return cGroup_5; }

		//"types"
		public Keyword getTypesKeyword_5_0() { return cTypesKeyword_5_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_1() { return cLeftCurlyBracketKeyword_5_1; }

		//types+=Type
		public Assignment getTypesAssignment_5_2() { return cTypesAssignment_5_2; }

		//Type
		public RuleCall getTypesTypeParserRuleCall_5_2_0() { return cTypesTypeParserRuleCall_5_2_0; }

		//("," types+=Type)*
		public Group getGroup_5_3() { return cGroup_5_3; }

		//","
		public Keyword getCommaKeyword_5_3_0() { return cCommaKeyword_5_3_0; }

		//types+=Type
		public Assignment getTypesAssignment_5_3_1() { return cTypesAssignment_5_3_1; }

		//Type
		public RuleCall getTypesTypeParserRuleCall_5_3_1_0() { return cTypesTypeParserRuleCall_5_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_4() { return cRightCurlyBracketKeyword_5_4; }

		//("annotationTypes" "{" annotationTypes+=AnnotationType ("," annotationTypes+=AnnotationType)* "}")?
		public Group getGroup_6() { return cGroup_6; }

		//"annotationTypes"
		public Keyword getAnnotationTypesKeyword_6_0() { return cAnnotationTypesKeyword_6_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_6_1() { return cLeftCurlyBracketKeyword_6_1; }

		//annotationTypes+=AnnotationType
		public Assignment getAnnotationTypesAssignment_6_2() { return cAnnotationTypesAssignment_6_2; }

		//AnnotationType
		public RuleCall getAnnotationTypesAnnotationTypeParserRuleCall_6_2_0() { return cAnnotationTypesAnnotationTypeParserRuleCall_6_2_0; }

		//("," annotationTypes+=AnnotationType)*
		public Group getGroup_6_3() { return cGroup_6_3; }

		//","
		public Keyword getCommaKeyword_6_3_0() { return cCommaKeyword_6_3_0; }

		//annotationTypes+=AnnotationType
		public Assignment getAnnotationTypesAssignment_6_3_1() { return cAnnotationTypesAssignment_6_3_1; }

		//AnnotationType
		public RuleCall getAnnotationTypesAnnotationTypeParserRuleCall_6_3_1_0() { return cAnnotationTypesAnnotationTypeParserRuleCall_6_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6_4() { return cRightCurlyBracketKeyword_6_4; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}

	public class AnnotationAttributeValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AnnotationAttributeValue");
		private final RuleCall cSimpleValueParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//AnnotationAttributeValue:
		//	SimpleValue;
		public ParserRule getRule() { return rule; }

		//SimpleValue
		public RuleCall getSimpleValueParserRuleCall() { return cSimpleValueParserRuleCall; }
	}

	public class AnnotationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Annotation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAnnotationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cAnnotationTypeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAnnotationTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cAnnotationTypeAnnotationTypeCrossReference_3_0 = (CrossReference)cAnnotationTypeAssignment_3.eContents().get(0);
		private final RuleCall cAnnotationTypeAnnotationTypeEStringParserRuleCall_3_0_1 = (RuleCall)cAnnotationTypeAnnotationTypeCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cAttributesKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cAttributesAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cAttributesAnnotationAttributeParserRuleCall_4_2_0 = (RuleCall)cAttributesAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cAttributesAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cAttributesAnnotationAttributeParserRuleCall_4_3_1_0 = (RuleCall)cAttributesAssignment_4_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Annotation:
		//	"Annotation" "{" "annotationType" annotationType=[AnnotationType|EString] ("attributes" "{"
		//	attributes+=AnnotationAttribute ("," attributes+=AnnotationAttribute)* "}")? "}";
		public ParserRule getRule() { return rule; }

		//"Annotation" "{" "annotationType" annotationType=[AnnotationType|EString] ("attributes" "{"
		//attributes+=AnnotationAttribute ("," attributes+=AnnotationAttribute)* "}")? "}"
		public Group getGroup() { return cGroup; }

		//"Annotation"
		public Keyword getAnnotationKeyword_0() { return cAnnotationKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//"annotationType"
		public Keyword getAnnotationTypeKeyword_2() { return cAnnotationTypeKeyword_2; }

		//annotationType=[AnnotationType|EString]
		public Assignment getAnnotationTypeAssignment_3() { return cAnnotationTypeAssignment_3; }

		//[AnnotationType|EString]
		public CrossReference getAnnotationTypeAnnotationTypeCrossReference_3_0() { return cAnnotationTypeAnnotationTypeCrossReference_3_0; }

		//EString
		public RuleCall getAnnotationTypeAnnotationTypeEStringParserRuleCall_3_0_1() { return cAnnotationTypeAnnotationTypeEStringParserRuleCall_3_0_1; }

		//("attributes" "{" attributes+=AnnotationAttribute ("," attributes+=AnnotationAttribute)* "}")?
		public Group getGroup_4() { return cGroup_4; }

		//"attributes"
		public Keyword getAttributesKeyword_4_0() { return cAttributesKeyword_4_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }

		//attributes+=AnnotationAttribute
		public Assignment getAttributesAssignment_4_2() { return cAttributesAssignment_4_2; }

		//AnnotationAttribute
		public RuleCall getAttributesAnnotationAttributeParserRuleCall_4_2_0() { return cAttributesAnnotationAttributeParserRuleCall_4_2_0; }

		//("," attributes+=AnnotationAttribute)*
		public Group getGroup_4_3() { return cGroup_4_3; }

		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }

		//attributes+=AnnotationAttribute
		public Assignment getAttributesAssignment_4_3_1() { return cAttributesAssignment_4_3_1; }

		//AnnotationAttribute
		public RuleCall getAttributesAnnotationAttributeParserRuleCall_4_3_1_0() { return cAttributesAnnotationAttributeParserRuleCall_4_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Type");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTypeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cAnnotationsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cAnnotationsAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_4_2_0 = (RuleCall)cAnnotationsAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cAnnotationsAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_4_3_1_0 = (RuleCall)cAnnotationsAssignment_4_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cAttributesKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cAttributesAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cAttributesAnnotationTypeAttributeParserRuleCall_5_2_0 = (RuleCall)cAttributesAssignment_5_2.eContents().get(0);
		private final Group cGroup_5_3 = (Group)cGroup_5.eContents().get(3);
		private final Keyword cCommaKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Assignment cAttributesAssignment_5_3_1 = (Assignment)cGroup_5_3.eContents().get(1);
		private final RuleCall cAttributesAnnotationTypeAttributeParserRuleCall_5_3_1_0 = (RuleCall)cAttributesAssignment_5_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_4 = (Keyword)cGroup_5.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Type:
		//	{Type} "Type" name=EString "{" ("annotations" "{" annotations+=Annotation ("," annotations+=Annotation)* "}")?
		//	("attributes" "{" attributes+=AnnotationTypeAttribute ("," attributes+=AnnotationTypeAttribute)* "}")? "}";
		public ParserRule getRule() { return rule; }

		//{Type} "Type" name=EString "{" ("annotations" "{" annotations+=Annotation ("," annotations+=Annotation)* "}")?
		//("attributes" "{" attributes+=AnnotationTypeAttribute ("," attributes+=AnnotationTypeAttribute)* "}")? "}"
		public Group getGroup() { return cGroup; }

		//{Type}
		public Action getTypeAction_0() { return cTypeAction_0; }

		//"Type"
		public Keyword getTypeKeyword_1() { return cTypeKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("annotations" "{" annotations+=Annotation ("," annotations+=Annotation)* "}")?
		public Group getGroup_4() { return cGroup_4; }

		//"annotations"
		public Keyword getAnnotationsKeyword_4_0() { return cAnnotationsKeyword_4_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }

		//annotations+=Annotation
		public Assignment getAnnotationsAssignment_4_2() { return cAnnotationsAssignment_4_2; }

		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_4_2_0() { return cAnnotationsAnnotationParserRuleCall_4_2_0; }

		//("," annotations+=Annotation)*
		public Group getGroup_4_3() { return cGroup_4_3; }

		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }

		//annotations+=Annotation
		public Assignment getAnnotationsAssignment_4_3_1() { return cAnnotationsAssignment_4_3_1; }

		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_4_3_1_0() { return cAnnotationsAnnotationParserRuleCall_4_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }

		//("attributes" "{" attributes+=AnnotationTypeAttribute ("," attributes+=AnnotationTypeAttribute)* "}")?
		public Group getGroup_5() { return cGroup_5; }

		//"attributes"
		public Keyword getAttributesKeyword_5_0() { return cAttributesKeyword_5_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_1() { return cLeftCurlyBracketKeyword_5_1; }

		//attributes+=AnnotationTypeAttribute
		public Assignment getAttributesAssignment_5_2() { return cAttributesAssignment_5_2; }

		//AnnotationTypeAttribute
		public RuleCall getAttributesAnnotationTypeAttributeParserRuleCall_5_2_0() { return cAttributesAnnotationTypeAttributeParserRuleCall_5_2_0; }

		//("," attributes+=AnnotationTypeAttribute)*
		public Group getGroup_5_3() { return cGroup_5_3; }

		//","
		public Keyword getCommaKeyword_5_3_0() { return cCommaKeyword_5_3_0; }

		//attributes+=AnnotationTypeAttribute
		public Assignment getAttributesAssignment_5_3_1() { return cAttributesAssignment_5_3_1; }

		//AnnotationTypeAttribute
		public RuleCall getAttributesAnnotationTypeAttributeParserRuleCall_5_3_1_0() { return cAttributesAnnotationTypeAttributeParserRuleCall_5_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_4() { return cRightCurlyBracketKeyword_5_4; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class AnnotationTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AnnotationType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAnnotationTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cAnnotationTypeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cContextKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cContextAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cContextEStringParserRuleCall_4_1_0 = (RuleCall)cContextAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cAttributesKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cAttributesAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cAttributesAnnotationTypeAttributeParserRuleCall_5_2_0 = (RuleCall)cAttributesAssignment_5_2.eContents().get(0);
		private final Group cGroup_5_3 = (Group)cGroup_5.eContents().get(3);
		private final Keyword cCommaKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Assignment cAttributesAssignment_5_3_1 = (Assignment)cGroup_5_3.eContents().get(1);
		private final RuleCall cAttributesAnnotationTypeAttributeParserRuleCall_5_3_1_0 = (RuleCall)cAttributesAssignment_5_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_4 = (Keyword)cGroup_5.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//AnnotationType:
		//	{AnnotationType} "AnnotationType" name=EString "{" ("context" context=EString)? ("attributes" "{"
		//	attributes+=AnnotationTypeAttribute ("," attributes+=AnnotationTypeAttribute)* "}")? "}";
		public ParserRule getRule() { return rule; }

		//{AnnotationType} "AnnotationType" name=EString "{" ("context" context=EString)? ("attributes" "{"
		//attributes+=AnnotationTypeAttribute ("," attributes+=AnnotationTypeAttribute)* "}")? "}"
		public Group getGroup() { return cGroup; }

		//{AnnotationType}
		public Action getAnnotationTypeAction_0() { return cAnnotationTypeAction_0; }

		//"AnnotationType"
		public Keyword getAnnotationTypeKeyword_1() { return cAnnotationTypeKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("context" context=EString)?
		public Group getGroup_4() { return cGroup_4; }

		//"context"
		public Keyword getContextKeyword_4_0() { return cContextKeyword_4_0; }

		//context=EString
		public Assignment getContextAssignment_4_1() { return cContextAssignment_4_1; }

		//EString
		public RuleCall getContextEStringParserRuleCall_4_1_0() { return cContextEStringParserRuleCall_4_1_0; }

		//("attributes" "{" attributes+=AnnotationTypeAttribute ("," attributes+=AnnotationTypeAttribute)* "}")?
		public Group getGroup_5() { return cGroup_5; }

		//"attributes"
		public Keyword getAttributesKeyword_5_0() { return cAttributesKeyword_5_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_1() { return cLeftCurlyBracketKeyword_5_1; }

		//attributes+=AnnotationTypeAttribute
		public Assignment getAttributesAssignment_5_2() { return cAttributesAssignment_5_2; }

		//AnnotationTypeAttribute
		public RuleCall getAttributesAnnotationTypeAttributeParserRuleCall_5_2_0() { return cAttributesAnnotationTypeAttributeParserRuleCall_5_2_0; }

		//("," attributes+=AnnotationTypeAttribute)*
		public Group getGroup_5_3() { return cGroup_5_3; }

		//","
		public Keyword getCommaKeyword_5_3_0() { return cCommaKeyword_5_3_0; }

		//attributes+=AnnotationTypeAttribute
		public Assignment getAttributesAssignment_5_3_1() { return cAttributesAssignment_5_3_1; }

		//AnnotationTypeAttribute
		public RuleCall getAttributesAnnotationTypeAttributeParserRuleCall_5_3_1_0() { return cAttributesAnnotationTypeAttributeParserRuleCall_5_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_4() { return cRightCurlyBracketKeyword_5_4; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class AnnotationAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AnnotationAttribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAnnotationAttributeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cAttributeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAttributeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cAttributeAnnotationTypeAttributeCrossReference_3_0 = (CrossReference)cAttributeAssignment_3.eContents().get(0);
		private final RuleCall cAttributeAnnotationTypeAttributeEStringParserRuleCall_3_0_1 = (RuleCall)cAttributeAnnotationTypeAttributeCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cValueKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cValueAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cValueAnnotationAttributeValueParserRuleCall_4_1_0 = (RuleCall)cValueAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//AnnotationAttribute:
		//	"AnnotationAttribute" "{" "attribute" attribute=[AnnotationTypeAttribute|EString] ("value"
		//	value=AnnotationAttributeValue)? "}";
		public ParserRule getRule() { return rule; }

		//"AnnotationAttribute" "{" "attribute" attribute=[AnnotationTypeAttribute|EString] ("value"
		//value=AnnotationAttributeValue)? "}"
		public Group getGroup() { return cGroup; }

		//"AnnotationAttribute"
		public Keyword getAnnotationAttributeKeyword_0() { return cAnnotationAttributeKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//"attribute"
		public Keyword getAttributeKeyword_2() { return cAttributeKeyword_2; }

		//attribute=[AnnotationTypeAttribute|EString]
		public Assignment getAttributeAssignment_3() { return cAttributeAssignment_3; }

		//[AnnotationTypeAttribute|EString]
		public CrossReference getAttributeAnnotationTypeAttributeCrossReference_3_0() { return cAttributeAnnotationTypeAttributeCrossReference_3_0; }

		//EString
		public RuleCall getAttributeAnnotationTypeAttributeEStringParserRuleCall_3_0_1() { return cAttributeAnnotationTypeAttributeEStringParserRuleCall_3_0_1; }

		//("value" value=AnnotationAttributeValue)?
		public Group getGroup_4() { return cGroup_4; }

		//"value"
		public Keyword getValueKeyword_4_0() { return cValueKeyword_4_0; }

		//value=AnnotationAttributeValue
		public Assignment getValueAssignment_4_1() { return cValueAssignment_4_1; }

		//AnnotationAttributeValue
		public RuleCall getValueAnnotationAttributeValueParserRuleCall_4_1_0() { return cValueAnnotationAttributeValueParserRuleCall_4_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//	STRING | ID;
		public ParserRule getRule() { return rule; }

		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}

	public class AnnotationTypeAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AnnotationTypeAttribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAnnotationTypeAttributeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cAnnotationTypeAttributeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cTypeKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cTypeAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cTypeTypeCrossReference_4_1_0 = (CrossReference)cTypeAssignment_4_1.eContents().get(0);
		private final RuleCall cTypeTypeEStringParserRuleCall_4_1_0_1 = (RuleCall)cTypeTypeCrossReference_4_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//AnnotationTypeAttribute:
		//	{AnnotationTypeAttribute} "AnnotationTypeAttribute" name=EString "{" ("type" type=[Type|EString])? "}";
		public ParserRule getRule() { return rule; }

		//{AnnotationTypeAttribute} "AnnotationTypeAttribute" name=EString "{" ("type" type=[Type|EString])? "}"
		public Group getGroup() { return cGroup; }

		//{AnnotationTypeAttribute}
		public Action getAnnotationTypeAttributeAction_0() { return cAnnotationTypeAttributeAction_0; }

		//"AnnotationTypeAttribute"
		public Keyword getAnnotationTypeAttributeKeyword_1() { return cAnnotationTypeAttributeKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("type" type=[Type|EString])?
		public Group getGroup_4() { return cGroup_4; }

		//"type"
		public Keyword getTypeKeyword_4_0() { return cTypeKeyword_4_0; }

		//type=[Type|EString]
		public Assignment getTypeAssignment_4_1() { return cTypeAssignment_4_1; }

		//[Type|EString]
		public CrossReference getTypeTypeCrossReference_4_1_0() { return cTypeTypeCrossReference_4_1_0; }

		//EString
		public RuleCall getTypeTypeEStringParserRuleCall_4_1_0_1() { return cTypeTypeEStringParserRuleCall_4_1_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class SimpleValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SimpleValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSimpleValueAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSimpleValueKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cValueKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cValueAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cValueEStringParserRuleCall_3_1_0 = (RuleCall)cValueAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//SimpleValue:
		//	{SimpleValue} "SimpleValue" "{" ("value" value=EString)? "}";
		public ParserRule getRule() { return rule; }

		//{SimpleValue} "SimpleValue" "{" ("value" value=EString)? "}"
		public Group getGroup() { return cGroup; }

		//{SimpleValue}
		public Action getSimpleValueAction_0() { return cSimpleValueAction_0; }

		//"SimpleValue"
		public Keyword getSimpleValueKeyword_1() { return cSimpleValueKeyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//("value" value=EString)?
		public Group getGroup_3() { return cGroup_3; }

		//"value"
		public Keyword getValueKeyword_3_0() { return cValueKeyword_3_0; }

		//value=EString
		public Assignment getValueAssignment_3_1() { return cValueAssignment_3_1; }

		//EString
		public RuleCall getValueEStringParserRuleCall_3_1_0() { return cValueEStringParserRuleCall_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	
	
	private final PackageElements pPackage;
	private final AnnotationAttributeValueElements pAnnotationAttributeValue;
	private final AnnotationElements pAnnotation;
	private final TypeElements pType;
	private final AnnotationTypeElements pAnnotationType;
	private final AnnotationAttributeElements pAnnotationAttribute;
	private final EStringElements pEString;
	private final AnnotationTypeAttributeElements pAnnotationTypeAttribute;
	private final SimpleValueElements pSimpleValue;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public AnnotateitGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pPackage = new PackageElements();
		this.pAnnotationAttributeValue = new AnnotationAttributeValueElements();
		this.pAnnotation = new AnnotationElements();
		this.pType = new TypeElements();
		this.pAnnotationType = new AnnotationTypeElements();
		this.pAnnotationAttribute = new AnnotationAttributeElements();
		this.pEString = new EStringElements();
		this.pAnnotationTypeAttribute = new AnnotationTypeAttributeElements();
		this.pSimpleValue = new SimpleValueElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("co.edu.uniandes.csw.spl.dsl.Annotateit".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Package:
	//	{Package} "Package" name=EString "{" ("annotations" "{" annotations+=Annotation ("," annotations+=Annotation)* "}")?
	//	("types" "{" types+=Type ("," types+=Type)* "}")? ("annotationTypes" "{" annotationTypes+=AnnotationType (","
	//	annotationTypes+=AnnotationType)* "}")? "}";
	public PackageElements getPackageAccess() {
		return pPackage;
	}
	
	public ParserRule getPackageRule() {
		return getPackageAccess().getRule();
	}

	//AnnotationAttributeValue:
	//	SimpleValue;
	public AnnotationAttributeValueElements getAnnotationAttributeValueAccess() {
		return pAnnotationAttributeValue;
	}
	
	public ParserRule getAnnotationAttributeValueRule() {
		return getAnnotationAttributeValueAccess().getRule();
	}

	//Annotation:
	//	"Annotation" "{" "annotationType" annotationType=[AnnotationType|EString] ("attributes" "{"
	//	attributes+=AnnotationAttribute ("," attributes+=AnnotationAttribute)* "}")? "}";
	public AnnotationElements getAnnotationAccess() {
		return pAnnotation;
	}
	
	public ParserRule getAnnotationRule() {
		return getAnnotationAccess().getRule();
	}

	//Type:
	//	{Type} "Type" name=EString "{" ("annotations" "{" annotations+=Annotation ("," annotations+=Annotation)* "}")?
	//	("attributes" "{" attributes+=AnnotationTypeAttribute ("," attributes+=AnnotationTypeAttribute)* "}")? "}";
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}

	//AnnotationType:
	//	{AnnotationType} "AnnotationType" name=EString "{" ("context" context=EString)? ("attributes" "{"
	//	attributes+=AnnotationTypeAttribute ("," attributes+=AnnotationTypeAttribute)* "}")? "}";
	public AnnotationTypeElements getAnnotationTypeAccess() {
		return pAnnotationType;
	}
	
	public ParserRule getAnnotationTypeRule() {
		return getAnnotationTypeAccess().getRule();
	}

	//AnnotationAttribute:
	//	"AnnotationAttribute" "{" "attribute" attribute=[AnnotationTypeAttribute|EString] ("value"
	//	value=AnnotationAttributeValue)? "}";
	public AnnotationAttributeElements getAnnotationAttributeAccess() {
		return pAnnotationAttribute;
	}
	
	public ParserRule getAnnotationAttributeRule() {
		return getAnnotationAttributeAccess().getRule();
	}

	//EString returns ecore::EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}

	//AnnotationTypeAttribute:
	//	{AnnotationTypeAttribute} "AnnotationTypeAttribute" name=EString "{" ("type" type=[Type|EString])? "}";
	public AnnotationTypeAttributeElements getAnnotationTypeAttributeAccess() {
		return pAnnotationTypeAttribute;
	}
	
	public ParserRule getAnnotationTypeAttributeRule() {
		return getAnnotationTypeAttributeAccess().getRule();
	}

	//SimpleValue:
	//	{SimpleValue} "SimpleValue" "{" ("value" value=EString)? "}";
	public SimpleValueElements getSimpleValueAccess() {
		return pSimpleValue;
	}
	
	public ParserRule getSimpleValueRule() {
		return getSimpleValueAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}