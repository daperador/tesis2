/*
* generated by Xtext
*/
package co.edu.uniandes.csw.spl.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import co.edu.uniandes.csw.spl.dsl.services.MVCDslGrammarAccess;

public class MVCDslParser extends AbstractContentAssistParser {
	
	@Inject
	private MVCDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected co.edu.uniandes.csw.spl.dsl.ui.contentassist.antlr.internal.InternalMVCDslParser createParser() {
		co.edu.uniandes.csw.spl.dsl.ui.contentassist.antlr.internal.InternalMVCDslParser result = new co.edu.uniandes.csw.spl.dsl.ui.contentassist.antlr.internal.InternalMVCDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getUIComponentAccess().getAlternatives(), "rule__UIComponent__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getMVCModelAccess().getGroup(), "rule__MVCModel__Group__0");
					put(grammarAccess.getMVCModelAccess().getGroup_0(), "rule__MVCModel__Group_0__0");
					put(grammarAccess.getMVCModelAccess().getGroup_4(), "rule__MVCModel__Group_4__0");
					put(grammarAccess.getMVCModelAccess().getGroup_5(), "rule__MVCModel__Group_5__0");
					put(grammarAccess.getMVCModelAccess().getGroup_5_3(), "rule__MVCModel__Group_5_3__0");
					put(grammarAccess.getMVCModelAccess().getGroup_6(), "rule__MVCModel__Group_6__0");
					put(grammarAccess.getMVCModelAccess().getGroup_6_3(), "rule__MVCModel__Group_6_3__0");
					put(grammarAccess.getMVCModelAccess().getGroup_7(), "rule__MVCModel__Group_7__0");
					put(grammarAccess.getMVCModelAccess().getGroup_7_3(), "rule__MVCModel__Group_7_3__0");
					put(grammarAccess.getMVCModelAccess().getGroup_8(), "rule__MVCModel__Group_8__0");
					put(grammarAccess.getMVCModelAccess().getGroup_8_3(), "rule__MVCModel__Group_8_3__0");
					put(grammarAccess.getMVCModelAccess().getGroup_9(), "rule__MVCModel__Group_9__0");
					put(grammarAccess.getMVCModelAccess().getGroup_9_3(), "rule__MVCModel__Group_9_3__0");
					put(grammarAccess.getMVCModelAccess().getGroup_13(), "rule__MVCModel__Group_13__0");
					put(grammarAccess.getAnnotationAccess().getGroup(), "rule__Annotation__Group__0");
					put(grammarAccess.getAnnotationAccess().getGroup_4(), "rule__Annotation__Group_4__0");
					put(grammarAccess.getAnnotationAccess().getGroup_4_3(), "rule__Annotation__Group_4_3__0");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getModelAccess().getGroup_4(), "rule__Model__Group_4__0");
					put(grammarAccess.getModelAccess().getGroup_4_3(), "rule__Model__Group_4_3__0");
					put(grammarAccess.getModelAccess().getGroup_5(), "rule__Model__Group_5__0");
					put(grammarAccess.getModelAccess().getGroup_6(), "rule__Model__Group_6__0");
					put(grammarAccess.getModelAccess().getGroup_6_3(), "rule__Model__Group_6_3__0");
					put(grammarAccess.getViewAccess().getGroup(), "rule__View__Group__0");
					put(grammarAccess.getViewAccess().getGroup_4(), "rule__View__Group_4__0");
					put(grammarAccess.getViewAccess().getGroup_4_3(), "rule__View__Group_4_3__0");
					put(grammarAccess.getViewAccess().getGroup_5(), "rule__View__Group_5__0");
					put(grammarAccess.getEventAccess().getGroup(), "rule__Event__Group__0");
					put(grammarAccess.getEventAccess().getGroup_4(), "rule__Event__Group_4__0");
					put(grammarAccess.getEventAccess().getGroup_4_3(), "rule__Event__Group_4_3__0");
					put(grammarAccess.getControllerAccess().getGroup(), "rule__Controller__Group__0");
					put(grammarAccess.getControllerAccess().getGroup_4(), "rule__Controller__Group_4__0");
					put(grammarAccess.getControllerAccess().getGroup_4_3(), "rule__Controller__Group_4_3__0");
					put(grammarAccess.getControllerAccess().getGroup_5(), "rule__Controller__Group_5__0");
					put(grammarAccess.getControllerAccess().getGroup_5_3(), "rule__Controller__Group_5_3__0");
					put(grammarAccess.getControllerAccess().getGroup_6(), "rule__Controller__Group_6__0");
					put(grammarAccess.getControllerAccess().getGroup_6_3(), "rule__Controller__Group_6_3__0");
					put(grammarAccess.getControllerAccess().getGroup_7(), "rule__Controller__Group_7__0");
					put(grammarAccess.getControllerAccess().getGroup_7_3(), "rule__Controller__Group_7_3__0");
					put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
					put(grammarAccess.getComponentAccess().getGroup_6(), "rule__Component__Group_6__0");
					put(grammarAccess.getComponentAccess().getGroup_8(), "rule__Component__Group_8__0");
					put(grammarAccess.getComponentAccess().getGroup_8_3(), "rule__Component__Group_8_3__0");
					put(grammarAccess.getAnnotationTypeAccess().getGroup(), "rule__AnnotationType__Group__0");
					put(grammarAccess.getAnnotationTypeAccess().getGroup_4(), "rule__AnnotationType__Group_4__0");
					put(grammarAccess.getAnnotationTypeAccess().getGroup_5(), "rule__AnnotationType__Group_5__0");
					put(grammarAccess.getAnnotationTypeAccess().getGroup_5_3(), "rule__AnnotationType__Group_5_3__0");
					put(grammarAccess.getAnnotationAttributeAccess().getGroup(), "rule__AnnotationAttribute__Group__0");
					put(grammarAccess.getAnnotationAttributeAccess().getGroup_4(), "rule__AnnotationAttribute__Group_4__0");
					put(grammarAccess.getAnnotationTypeAttributeAccess().getGroup(), "rule__AnnotationTypeAttribute__Group__0");
					put(grammarAccess.getAnnotationTypeAttributeAccess().getGroup_4(), "rule__AnnotationTypeAttribute__Group_4__0");
					put(grammarAccess.getTypeAccess().getGroup(), "rule__Type__Group__0");
					put(grammarAccess.getTypeAccess().getGroup_4(), "rule__Type__Group_4__0");
					put(grammarAccess.getTypeAccess().getGroup_4_3(), "rule__Type__Group_4_3__0");
					put(grammarAccess.getTypeAccess().getGroup_5(), "rule__Type__Group_5__0");
					put(grammarAccess.getTypeAccess().getGroup_5_3(), "rule__Type__Group_5_3__0");
					put(grammarAccess.getSimpleValueAccess().getGroup(), "rule__SimpleValue__Group__0");
					put(grammarAccess.getSimpleValueAccess().getGroup_3(), "rule__SimpleValue__Group_3__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getEntityAccess().getGroup_4(), "rule__Entity__Group_4__0");
					put(grammarAccess.getEntityAccess().getGroup_4_3(), "rule__Entity__Group_4_3__0");
					put(grammarAccess.getEntityAccess().getGroup_5(), "rule__Entity__Group_5__0");
					put(grammarAccess.getEntityAccess().getGroup_5_3(), "rule__Entity__Group_5_3__0");
					put(grammarAccess.getEntityAccess().getGroup_6(), "rule__Entity__Group_6__0");
					put(grammarAccess.getEntityAccess().getGroup_6_3(), "rule__Entity__Group_6_3__0");
					put(grammarAccess.getAssociationAccess().getGroup(), "rule__Association__Group__0");
					put(grammarAccess.getAssociationAccess().getGroup_4(), "rule__Association__Group_4__0");
					put(grammarAccess.getAssociationAccess().getGroup_5(), "rule__Association__Group_5__0");
					put(grammarAccess.getAssociationAccess().getGroup_10(), "rule__Association__Group_10__0");
					put(grammarAccess.getAssociationAccess().getGroup_10_3(), "rule__Association__Group_10_3__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup_4(), "rule__Attribute__Group_4__0");
					put(grammarAccess.getAttributeAccess().getGroup_5(), "rule__Attribute__Group_5__0");
					put(grammarAccess.getAttributeAccess().getGroup_5_3(), "rule__Attribute__Group_5_3__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getUILayoutAccess().getGroup(), "rule__UILayout__Group__0");
					put(grammarAccess.getUILayoutAccess().getGroup_4(), "rule__UILayout__Group_4__0");
					put(grammarAccess.getUILayoutAccess().getGroup_5(), "rule__UILayout__Group_5__0");
					put(grammarAccess.getUILayoutAccess().getGroup_6(), "rule__UILayout__Group_6__0");
					put(grammarAccess.getUILayoutAccess().getGroup_7(), "rule__UILayout__Group_7__0");
					put(grammarAccess.getUILayoutAccess().getGroup_7_3(), "rule__UILayout__Group_7_3__0");
					put(grammarAccess.getUILayoutAccess().getGroup_8(), "rule__UILayout__Group_8__0");
					put(grammarAccess.getUILayoutAccess().getGroup_8_3(), "rule__UILayout__Group_8_3__0");
					put(grammarAccess.getUILayoutAccess().getGroup_9(), "rule__UILayout__Group_9__0");
					put(grammarAccess.getUILayoutAccess().getGroup_9_3(), "rule__UILayout__Group_9_3__0");
					put(grammarAccess.getUIInputAccess().getGroup(), "rule__UIInput__Group__0");
					put(grammarAccess.getUIInputAccess().getGroup_4(), "rule__UIInput__Group_4__0");
					put(grammarAccess.getUIInputAccess().getGroup_5(), "rule__UIInput__Group_5__0");
					put(grammarAccess.getUIInputAccess().getGroup_6(), "rule__UIInput__Group_6__0");
					put(grammarAccess.getUIInputAccess().getGroup_6_3(), "rule__UIInput__Group_6_3__0");
					put(grammarAccess.getUIActionsAccess().getGroup(), "rule__UIActions__Group__0");
					put(grammarAccess.getUIActionsAccess().getGroup_4(), "rule__UIActions__Group_4__0");
					put(grammarAccess.getUIActionsAccess().getGroup_5(), "rule__UIActions__Group_5__0");
					put(grammarAccess.getUIActionsAccess().getGroup_6(), "rule__UIActions__Group_6__0");
					put(grammarAccess.getUIActionsAccess().getGroup_6_3(), "rule__UIActions__Group_6_3__0");
					put(grammarAccess.getUILabelAccess().getGroup(), "rule__UILabel__Group__0");
					put(grammarAccess.getUILabelAccess().getGroup_4(), "rule__UILabel__Group_4__0");
					put(grammarAccess.getUILabelAccess().getGroup_5(), "rule__UILabel__Group_5__0");
					put(grammarAccess.getUILabelAccess().getGroup_6(), "rule__UILabel__Group_6__0");
					put(grammarAccess.getUILabelAccess().getGroup_7(), "rule__UILabel__Group_7__0");
					put(grammarAccess.getUILabelAccess().getGroup_7_3(), "rule__UILabel__Group_7_3__0");
					put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
					put(grammarAccess.getActionAccess().getGroup_4(), "rule__Action__Group_4__0");
					put(grammarAccess.getActionAccess().getGroup_5(), "rule__Action__Group_5__0");
					put(grammarAccess.getActionAccess().getGroup_6(), "rule__Action__Group_6__0");
					put(grammarAccess.getActionAccess().getGroup_6_3(), "rule__Action__Group_6_3__0");
					put(grammarAccess.getActionAccess().getGroup_7(), "rule__Action__Group_7__0");
					put(grammarAccess.getActionAccess().getGroup_7_3(), "rule__Action__Group_7_3__0");
					put(grammarAccess.getControllerViewAccess().getGroup(), "rule__ControllerView__Group__0");
					put(grammarAccess.getControllerViewAccess().getGroup_4(), "rule__ControllerView__Group_4__0");
					put(grammarAccess.getControllerViewAccess().getGroup_4_3(), "rule__ControllerView__Group_4_3__0");
					put(grammarAccess.getControllerViewAccess().getGroup_5(), "rule__ControllerView__Group_5__0");
					put(grammarAccess.getControllerViewAccess().getGroup_5_3(), "rule__ControllerView__Group_5_3__0");
					put(grammarAccess.getEventActionAccess().getGroup(), "rule__EventAction__Group__0");
					put(grammarAccess.getEventActionAccess().getGroup_4(), "rule__EventAction__Group_4__0");
					put(grammarAccess.getEventActionAccess().getGroup_4_3(), "rule__EventAction__Group_4_3__0");
					put(grammarAccess.getEventActionAccess().getGroup_5(), "rule__EventAction__Group_5__0");
					put(grammarAccess.getEventActionAccess().getGroup_5_3(), "rule__EventAction__Group_5_3__0");
					put(grammarAccess.getMVCModelAccess().getImportURIAssignment_0_1(), "rule__MVCModel__ImportURIAssignment_0_1");
					put(grammarAccess.getMVCModelAccess().getNameAssignment_2(), "rule__MVCModel__NameAssignment_2");
					put(grammarAccess.getMVCModelAccess().getVersionAssignment_4_1(), "rule__MVCModel__VersionAssignment_4_1");
					put(grammarAccess.getMVCModelAccess().getAnnotationsAssignment_5_2(), "rule__MVCModel__AnnotationsAssignment_5_2");
					put(grammarAccess.getMVCModelAccess().getAnnotationsAssignment_5_3_1(), "rule__MVCModel__AnnotationsAssignment_5_3_1");
					put(grammarAccess.getMVCModelAccess().getModelsAssignment_6_2(), "rule__MVCModel__ModelsAssignment_6_2");
					put(grammarAccess.getMVCModelAccess().getModelsAssignment_6_3_1(), "rule__MVCModel__ModelsAssignment_6_3_1");
					put(grammarAccess.getMVCModelAccess().getViewsAssignment_7_2(), "rule__MVCModel__ViewsAssignment_7_2");
					put(grammarAccess.getMVCModelAccess().getViewsAssignment_7_3_1(), "rule__MVCModel__ViewsAssignment_7_3_1");
					put(grammarAccess.getMVCModelAccess().getEventsAssignment_8_2(), "rule__MVCModel__EventsAssignment_8_2");
					put(grammarAccess.getMVCModelAccess().getEventsAssignment_8_3_1(), "rule__MVCModel__EventsAssignment_8_3_1");
					put(grammarAccess.getMVCModelAccess().getControllersAssignment_9_2(), "rule__MVCModel__ControllersAssignment_9_2");
					put(grammarAccess.getMVCModelAccess().getControllersAssignment_9_3_1(), "rule__MVCModel__ControllersAssignment_9_3_1");
					put(grammarAccess.getMVCModelAccess().getComponentsAssignment_12(), "rule__MVCModel__ComponentsAssignment_12");
					put(grammarAccess.getMVCModelAccess().getComponentsAssignment_13_1(), "rule__MVCModel__ComponentsAssignment_13_1");
					put(grammarAccess.getAnnotationAccess().getAnnotationTypeAssignment_3(), "rule__Annotation__AnnotationTypeAssignment_3");
					put(grammarAccess.getAnnotationAccess().getAttributesAssignment_4_2(), "rule__Annotation__AttributesAssignment_4_2");
					put(grammarAccess.getAnnotationAccess().getAttributesAssignment_4_3_1(), "rule__Annotation__AttributesAssignment_4_3_1");
					put(grammarAccess.getModelAccess().getNameAssignment_2(), "rule__Model__NameAssignment_2");
					put(grammarAccess.getModelAccess().getAnnotationsAssignment_4_2(), "rule__Model__AnnotationsAssignment_4_2");
					put(grammarAccess.getModelAccess().getAnnotationsAssignment_4_3_1(), "rule__Model__AnnotationsAssignment_4_3_1");
					put(grammarAccess.getModelAccess().getRootEntityAssignment_5_1(), "rule__Model__RootEntityAssignment_5_1");
					put(grammarAccess.getModelAccess().getAssociationsAssignment_6_2(), "rule__Model__AssociationsAssignment_6_2");
					put(grammarAccess.getModelAccess().getAssociationsAssignment_6_3_1(), "rule__Model__AssociationsAssignment_6_3_1");
					put(grammarAccess.getViewAccess().getNameAssignment_2(), "rule__View__NameAssignment_2");
					put(grammarAccess.getViewAccess().getAnnotationsAssignment_4_2(), "rule__View__AnnotationsAssignment_4_2");
					put(grammarAccess.getViewAccess().getAnnotationsAssignment_4_3_1(), "rule__View__AnnotationsAssignment_4_3_1");
					put(grammarAccess.getViewAccess().getRootComponentAssignment_5_1(), "rule__View__RootComponentAssignment_5_1");
					put(grammarAccess.getEventAccess().getNameAssignment_2(), "rule__Event__NameAssignment_2");
					put(grammarAccess.getEventAccess().getAnnotationsAssignment_4_2(), "rule__Event__AnnotationsAssignment_4_2");
					put(grammarAccess.getEventAccess().getAnnotationsAssignment_4_3_1(), "rule__Event__AnnotationsAssignment_4_3_1");
					put(grammarAccess.getControllerAccess().getNameAssignment_2(), "rule__Controller__NameAssignment_2");
					put(grammarAccess.getControllerAccess().getAnnotationsAssignment_4_2(), "rule__Controller__AnnotationsAssignment_4_2");
					put(grammarAccess.getControllerAccess().getAnnotationsAssignment_4_3_1(), "rule__Controller__AnnotationsAssignment_4_3_1");
					put(grammarAccess.getControllerAccess().getViewsAssignment_5_2(), "rule__Controller__ViewsAssignment_5_2");
					put(grammarAccess.getControllerAccess().getViewsAssignment_5_3_1(), "rule__Controller__ViewsAssignment_5_3_1");
					put(grammarAccess.getControllerAccess().getActionsAssignment_6_2(), "rule__Controller__ActionsAssignment_6_2");
					put(grammarAccess.getControllerAccess().getActionsAssignment_6_3_1(), "rule__Controller__ActionsAssignment_6_3_1");
					put(grammarAccess.getControllerAccess().getEventActionsAssignment_7_2(), "rule__Controller__EventActionsAssignment_7_2");
					put(grammarAccess.getControllerAccess().getEventActionsAssignment_7_3_1(), "rule__Controller__EventActionsAssignment_7_3_1");
					put(grammarAccess.getComponentAccess().getNameAssignment_1(), "rule__Component__NameAssignment_1");
					put(grammarAccess.getComponentAccess().getControllersAssignment_5(), "rule__Component__ControllersAssignment_5");
					put(grammarAccess.getComponentAccess().getControllersAssignment_6_1(), "rule__Component__ControllersAssignment_6_1");
					put(grammarAccess.getComponentAccess().getAnnotationsAssignment_8_2(), "rule__Component__AnnotationsAssignment_8_2");
					put(grammarAccess.getComponentAccess().getAnnotationsAssignment_8_3_1(), "rule__Component__AnnotationsAssignment_8_3_1");
					put(grammarAccess.getAnnotationTypeAccess().getNameAssignment_2(), "rule__AnnotationType__NameAssignment_2");
					put(grammarAccess.getAnnotationTypeAccess().getContextAssignment_4_1(), "rule__AnnotationType__ContextAssignment_4_1");
					put(grammarAccess.getAnnotationTypeAccess().getAttributesAssignment_5_2(), "rule__AnnotationType__AttributesAssignment_5_2");
					put(grammarAccess.getAnnotationTypeAccess().getAttributesAssignment_5_3_1(), "rule__AnnotationType__AttributesAssignment_5_3_1");
					put(grammarAccess.getAnnotationAttributeAccess().getAttributeAssignment_3(), "rule__AnnotationAttribute__AttributeAssignment_3");
					put(grammarAccess.getAnnotationAttributeAccess().getValueAssignment_4_1(), "rule__AnnotationAttribute__ValueAssignment_4_1");
					put(grammarAccess.getAnnotationTypeAttributeAccess().getNameAssignment_2(), "rule__AnnotationTypeAttribute__NameAssignment_2");
					put(grammarAccess.getAnnotationTypeAttributeAccess().getTypeAssignment_4_1(), "rule__AnnotationTypeAttribute__TypeAssignment_4_1");
					put(grammarAccess.getTypeAccess().getNameAssignment_2(), "rule__Type__NameAssignment_2");
					put(grammarAccess.getTypeAccess().getAnnotationsAssignment_4_2(), "rule__Type__AnnotationsAssignment_4_2");
					put(grammarAccess.getTypeAccess().getAnnotationsAssignment_4_3_1(), "rule__Type__AnnotationsAssignment_4_3_1");
					put(grammarAccess.getTypeAccess().getAttributesAssignment_5_2(), "rule__Type__AttributesAssignment_5_2");
					put(grammarAccess.getTypeAccess().getAttributesAssignment_5_3_1(), "rule__Type__AttributesAssignment_5_3_1");
					put(grammarAccess.getSimpleValueAccess().getValueAssignment_3_1(), "rule__SimpleValue__ValueAssignment_3_1");
					put(grammarAccess.getEntityAccess().getNameAssignment_2(), "rule__Entity__NameAssignment_2");
					put(grammarAccess.getEntityAccess().getExtendsAssignment_4_2(), "rule__Entity__ExtendsAssignment_4_2");
					put(grammarAccess.getEntityAccess().getExtendsAssignment_4_3_1(), "rule__Entity__ExtendsAssignment_4_3_1");
					put(grammarAccess.getEntityAccess().getAnnotationsAssignment_5_2(), "rule__Entity__AnnotationsAssignment_5_2");
					put(grammarAccess.getEntityAccess().getAnnotationsAssignment_5_3_1(), "rule__Entity__AnnotationsAssignment_5_3_1");
					put(grammarAccess.getEntityAccess().getAttributesAssignment_6_2(), "rule__Entity__AttributesAssignment_6_2");
					put(grammarAccess.getEntityAccess().getAttributesAssignment_6_3_1(), "rule__Entity__AttributesAssignment_6_3_1");
					put(grammarAccess.getAssociationAccess().getContainmentAssignment_0(), "rule__Association__ContainmentAssignment_0");
					put(grammarAccess.getAssociationAccess().getNameAssignment_2(), "rule__Association__NameAssignment_2");
					put(grammarAccess.getAssociationAccess().getLowerBoundAssignment_4_1(), "rule__Association__LowerBoundAssignment_4_1");
					put(grammarAccess.getAssociationAccess().getUpperBoundAssignment_5_1(), "rule__Association__UpperBoundAssignment_5_1");
					put(grammarAccess.getAssociationAccess().getSourceAssignment_7(), "rule__Association__SourceAssignment_7");
					put(grammarAccess.getAssociationAccess().getTargetAssignment_9(), "rule__Association__TargetAssignment_9");
					put(grammarAccess.getAssociationAccess().getAnnotationsAssignment_10_2(), "rule__Association__AnnotationsAssignment_10_2");
					put(grammarAccess.getAssociationAccess().getAnnotationsAssignment_10_3_1(), "rule__Association__AnnotationsAssignment_10_3_1");
					put(grammarAccess.getAttributeAccess().getNameAssignment_2(), "rule__Attribute__NameAssignment_2");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_4_1(), "rule__Attribute__TypeAssignment_4_1");
					put(grammarAccess.getAttributeAccess().getAnnotationsAssignment_5_2(), "rule__Attribute__AnnotationsAssignment_5_2");
					put(grammarAccess.getAttributeAccess().getAnnotationsAssignment_5_3_1(), "rule__Attribute__AnnotationsAssignment_5_3_1");
					put(grammarAccess.getUILayoutAccess().getNameAssignment_2(), "rule__UILayout__NameAssignment_2");
					put(grammarAccess.getUILayoutAccess().getTypeAssignment_4_1(), "rule__UILayout__TypeAssignment_4_1");
					put(grammarAccess.getUILayoutAccess().getOrientationAssignment_5_1(), "rule__UILayout__OrientationAssignment_5_1");
					put(grammarAccess.getUILayoutAccess().getColumnsAssignment_6_1(), "rule__UILayout__ColumnsAssignment_6_1");
					put(grammarAccess.getUILayoutAccess().getImportViewAssignment_7_2(), "rule__UILayout__ImportViewAssignment_7_2");
					put(grammarAccess.getUILayoutAccess().getImportViewAssignment_7_3_1(), "rule__UILayout__ImportViewAssignment_7_3_1");
					put(grammarAccess.getUILayoutAccess().getAnnotationsAssignment_8_2(), "rule__UILayout__AnnotationsAssignment_8_2");
					put(grammarAccess.getUILayoutAccess().getAnnotationsAssignment_8_3_1(), "rule__UILayout__AnnotationsAssignment_8_3_1");
					put(grammarAccess.getUILayoutAccess().getComponentsAssignment_9_2(), "rule__UILayout__ComponentsAssignment_9_2");
					put(grammarAccess.getUILayoutAccess().getComponentsAssignment_9_3_1(), "rule__UILayout__ComponentsAssignment_9_3_1");
					put(grammarAccess.getUIInputAccess().getNameAssignment_2(), "rule__UIInput__NameAssignment_2");
					put(grammarAccess.getUIInputAccess().getTypeAssignment_4_1(), "rule__UIInput__TypeAssignment_4_1");
					put(grammarAccess.getUIInputAccess().getValueAssignment_5_1(), "rule__UIInput__ValueAssignment_5_1");
					put(grammarAccess.getUIInputAccess().getAnnotationsAssignment_6_2(), "rule__UIInput__AnnotationsAssignment_6_2");
					put(grammarAccess.getUIInputAccess().getAnnotationsAssignment_6_3_1(), "rule__UIInput__AnnotationsAssignment_6_3_1");
					put(grammarAccess.getUIActionsAccess().getNameAssignment_2(), "rule__UIActions__NameAssignment_2");
					put(grammarAccess.getUIActionsAccess().getTypeAssignment_4_1(), "rule__UIActions__TypeAssignment_4_1");
					put(grammarAccess.getUIActionsAccess().getTriggerEventAssignment_5_1(), "rule__UIActions__TriggerEventAssignment_5_1");
					put(grammarAccess.getUIActionsAccess().getAnnotationsAssignment_6_2(), "rule__UIActions__AnnotationsAssignment_6_2");
					put(grammarAccess.getUIActionsAccess().getAnnotationsAssignment_6_3_1(), "rule__UIActions__AnnotationsAssignment_6_3_1");
					put(grammarAccess.getUILabelAccess().getNameAssignment_2(), "rule__UILabel__NameAssignment_2");
					put(grammarAccess.getUILabelAccess().getTypeAssignment_4_1(), "rule__UILabel__TypeAssignment_4_1");
					put(grammarAccess.getUILabelAccess().getTextAssignment_5_1(), "rule__UILabel__TextAssignment_5_1");
					put(grammarAccess.getUILabelAccess().getValueAssignment_6_1(), "rule__UILabel__ValueAssignment_6_1");
					put(grammarAccess.getUILabelAccess().getAnnotationsAssignment_7_2(), "rule__UILabel__AnnotationsAssignment_7_2");
					put(grammarAccess.getUILabelAccess().getAnnotationsAssignment_7_3_1(), "rule__UILabel__AnnotationsAssignment_7_3_1");
					put(grammarAccess.getActionAccess().getNameAssignment_2(), "rule__Action__NameAssignment_2");
					put(grammarAccess.getActionAccess().getPreExecutionEventAssignment_4_1(), "rule__Action__PreExecutionEventAssignment_4_1");
					put(grammarAccess.getActionAccess().getPostExecutionEventAssignment_5_1(), "rule__Action__PostExecutionEventAssignment_5_1");
					put(grammarAccess.getActionAccess().getTriggerEventsAssignment_6_2(), "rule__Action__TriggerEventsAssignment_6_2");
					put(grammarAccess.getActionAccess().getTriggerEventsAssignment_6_3_1(), "rule__Action__TriggerEventsAssignment_6_3_1");
					put(grammarAccess.getActionAccess().getAnnotationsAssignment_7_2(), "rule__Action__AnnotationsAssignment_7_2");
					put(grammarAccess.getActionAccess().getAnnotationsAssignment_7_3_1(), "rule__Action__AnnotationsAssignment_7_3_1");
					put(grammarAccess.getControllerViewAccess().getViewAssignment_3(), "rule__ControllerView__ViewAssignment_3");
					put(grammarAccess.getControllerViewAccess().getModelsAssignment_4_2(), "rule__ControllerView__ModelsAssignment_4_2");
					put(grammarAccess.getControllerViewAccess().getModelsAssignment_4_3_1(), "rule__ControllerView__ModelsAssignment_4_3_1");
					put(grammarAccess.getControllerViewAccess().getAnnotationsAssignment_5_2(), "rule__ControllerView__AnnotationsAssignment_5_2");
					put(grammarAccess.getControllerViewAccess().getAnnotationsAssignment_5_3_1(), "rule__ControllerView__AnnotationsAssignment_5_3_1");
					put(grammarAccess.getEventActionAccess().getActionAssignment_3(), "rule__EventAction__ActionAssignment_3");
					put(grammarAccess.getEventActionAccess().getEventsAssignment_4_2(), "rule__EventAction__EventsAssignment_4_2");
					put(grammarAccess.getEventActionAccess().getEventsAssignment_4_3_1(), "rule__EventAction__EventsAssignment_4_3_1");
					put(grammarAccess.getEventActionAccess().getAnnotationsAssignment_5_2(), "rule__EventAction__AnnotationsAssignment_5_2");
					put(grammarAccess.getEventActionAccess().getAnnotationsAssignment_5_3_1(), "rule__EventAction__AnnotationsAssignment_5_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			co.edu.uniandes.csw.spl.dsl.ui.contentassist.antlr.internal.InternalMVCDslParser typedParser = (co.edu.uniandes.csw.spl.dsl.ui.contentassist.antlr.internal.InternalMVCDslParser) parser;
			typedParser.entryRuleMVCModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MVCDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MVCDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
