/*
* generated by Xtext
*/
package co.edu.uniandes.csw.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import co.edu.uniandes.csw.dsl.services.ComponentGrammarAccess;

public class ComponentParser extends AbstractContentAssistParser {
	
	@Inject
	private ComponentGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected co.edu.uniandes.csw.dsl.ui.contentassist.antlr.internal.InternalComponentParser createParser() {
		co.edu.uniandes.csw.dsl.ui.contentassist.antlr.internal.InternalComponentParser result = new co.edu.uniandes.csw.dsl.ui.contentassist.antlr.internal.InternalComponentParser(null);
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
					put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
					put(grammarAccess.getComponentAccess().getGroup_6(), "rule__Component__Group_6__0");
					put(grammarAccess.getComponentAccess().getGroup_6_3(), "rule__Component__Group_6_3__0");
					put(grammarAccess.getComponentAccess().getGroup_7(), "rule__Component__Group_7__0");
					put(grammarAccess.getComponentAccess().getGroup_7_3(), "rule__Component__Group_7_3__0");
					put(grammarAccess.getComponentAccess().getGroup_8(), "rule__Component__Group_8__0");
					put(grammarAccess.getComponentAccess().getGroup_8_3(), "rule__Component__Group_8_3__0");
					put(grammarAccess.getComponentAccess().getGroup_9(), "rule__Component__Group_9__0");
					put(grammarAccess.getComponentAccess().getGroup_9_3(), "rule__Component__Group_9_3__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getUILayoutAccess().getGroup(), "rule__UILayout__Group__0");
					put(grammarAccess.getAnnotationAccess().getGroup(), "rule__Annotation__Group__0");
					put(grammarAccess.getAnnotationAccess().getGroup_3(), "rule__Annotation__Group_3__0");
					put(grammarAccess.getAnnotationAccess().getGroup_3_1(), "rule__Annotation__Group_3_1__0");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getViewAccess().getGroup(), "rule__View__Group__0");
					put(grammarAccess.getEventAccess().getGroup(), "rule__Event__Group__0");
					put(grammarAccess.getControllerAccess().getGroup(), "rule__Controller__Group__0");
					put(grammarAccess.getControllerAccess().getGroup_4(), "rule__Controller__Group_4__0");
					put(grammarAccess.getControllerAccess().getGroup_4_3(), "rule__Controller__Group_4_3__0");
					put(grammarAccess.getControllerAccess().getGroup_5(), "rule__Controller__Group_5__0");
					put(grammarAccess.getControllerAccess().getGroup_5_3(), "rule__Controller__Group_5_3__0");
					put(grammarAccess.getControllerAccess().getGroup_6(), "rule__Controller__Group_6__0");
					put(grammarAccess.getControllerAccess().getGroup_6_3(), "rule__Controller__Group_6_3__0");
					put(grammarAccess.getAnnotationAttributeAccess().getGroup(), "rule__AnnotationAttribute__Group__0");
					put(grammarAccess.getSimpleValueAccess().getGroup(), "rule__SimpleValue__Group__0");
					put(grammarAccess.getUIInputAccess().getGroup(), "rule__UIInput__Group__0");
					put(grammarAccess.getUIInputAccess().getGroup_5(), "rule__UIInput__Group_5__0");
					put(grammarAccess.getUIInputAccess().getGroup_6(), "rule__UIInput__Group_6__0");
					put(grammarAccess.getUIActionsAccess().getGroup(), "rule__UIActions__Group__0");
					put(grammarAccess.getUIActionsAccess().getGroup_5(), "rule__UIActions__Group_5__0");
					put(grammarAccess.getUIActionsAccess().getGroup_6(), "rule__UIActions__Group_6__0");
					put(grammarAccess.getUILabelAccess().getGroup(), "rule__UILabel__Group__0");
					put(grammarAccess.getUILabelAccess().getGroup_5(), "rule__UILabel__Group_5__0");
					put(grammarAccess.getUILabelAccess().getGroup_6(), "rule__UILabel__Group_6__0");
					put(grammarAccess.getUILabelAccess().getGroup_7(), "rule__UILabel__Group_7__0");
					put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
					put(grammarAccess.getActionAccess().getGroup_4(), "rule__Action__Group_4__0");
					put(grammarAccess.getActionAccess().getGroup_5(), "rule__Action__Group_5__0");
					put(grammarAccess.getActionAccess().getGroup_6(), "rule__Action__Group_6__0");
					put(grammarAccess.getActionAccess().getGroup_6_3(), "rule__Action__Group_6_3__0");
					put(grammarAccess.getControllerViewAccess().getGroup(), "rule__ControllerView__Group__0");
					put(grammarAccess.getControllerViewAccess().getGroup_3(), "rule__ControllerView__Group_3__0");
					put(grammarAccess.getControllerViewAccess().getGroup_3_3(), "rule__ControllerView__Group_3_3__0");
					put(grammarAccess.getEventActionAccess().getGroup(), "rule__EventAction__Group__0");
					put(grammarAccess.getEventActionAccess().getGroup_5(), "rule__EventAction__Group_5__0");
					put(grammarAccess.getEventActionAccess().getGroup_5_3(), "rule__EventAction__Group_5_3__0");
					put(grammarAccess.getComponentAccess().getImportsAssignment_1(), "rule__Component__ImportsAssignment_1");
					put(grammarAccess.getComponentAccess().getAnnotationsAssignment_2(), "rule__Component__AnnotationsAssignment_2");
					put(grammarAccess.getComponentAccess().getNameAssignment_4(), "rule__Component__NameAssignment_4");
					put(grammarAccess.getComponentAccess().getModelsAssignment_6_2(), "rule__Component__ModelsAssignment_6_2");
					put(grammarAccess.getComponentAccess().getModelsAssignment_6_3_1(), "rule__Component__ModelsAssignment_6_3_1");
					put(grammarAccess.getComponentAccess().getViewsAssignment_7_2(), "rule__Component__ViewsAssignment_7_2");
					put(grammarAccess.getComponentAccess().getViewsAssignment_7_3_1(), "rule__Component__ViewsAssignment_7_3_1");
					put(grammarAccess.getComponentAccess().getEventsAssignment_8_2(), "rule__Component__EventsAssignment_8_2");
					put(grammarAccess.getComponentAccess().getEventsAssignment_8_3_1(), "rule__Component__EventsAssignment_8_3_1");
					put(grammarAccess.getComponentAccess().getControllersAssignment_9_2(), "rule__Component__ControllersAssignment_9_2");
					put(grammarAccess.getComponentAccess().getControllersAssignment_9_3_1(), "rule__Component__ControllersAssignment_9_3_1");
					put(grammarAccess.getImportAccess().getImportURIAssignment_1(), "rule__Import__ImportURIAssignment_1");
					put(grammarAccess.getUILayoutAccess().getNameAssignment_1(), "rule__UILayout__NameAssignment_1");
					put(grammarAccess.getUILayoutAccess().getComponentsAssignment_3(), "rule__UILayout__ComponentsAssignment_3");
					put(grammarAccess.getAnnotationAccess().getAnnotationTypeAssignment_1(), "rule__Annotation__AnnotationTypeAssignment_1");
					put(grammarAccess.getAnnotationAccess().getAttributesAssignment_3_0(), "rule__Annotation__AttributesAssignment_3_0");
					put(grammarAccess.getAnnotationAccess().getAttributesAssignment_3_1_1(), "rule__Annotation__AttributesAssignment_3_1_1");
					put(grammarAccess.getModelAccess().getAnnotationsAssignment_1(), "rule__Model__AnnotationsAssignment_1");
					put(grammarAccess.getModelAccess().getNameAssignment_2(), "rule__Model__NameAssignment_2");
					put(grammarAccess.getModelAccess().getRootEntityAssignment_4(), "rule__Model__RootEntityAssignment_4");
					put(grammarAccess.getViewAccess().getAnnotationsAssignment_1(), "rule__View__AnnotationsAssignment_1");
					put(grammarAccess.getViewAccess().getNameAssignment_2(), "rule__View__NameAssignment_2");
					put(grammarAccess.getViewAccess().getRootComponentAssignment_4(), "rule__View__RootComponentAssignment_4");
					put(grammarAccess.getEventAccess().getAnnotationsAssignment_1(), "rule__Event__AnnotationsAssignment_1");
					put(grammarAccess.getEventAccess().getNameAssignment_3(), "rule__Event__NameAssignment_3");
					put(grammarAccess.getControllerAccess().getAnnotationsAssignment_1(), "rule__Controller__AnnotationsAssignment_1");
					put(grammarAccess.getControllerAccess().getNameAssignment_2(), "rule__Controller__NameAssignment_2");
					put(grammarAccess.getControllerAccess().getActionsAssignment_4_2(), "rule__Controller__ActionsAssignment_4_2");
					put(grammarAccess.getControllerAccess().getActionsAssignment_4_3_1(), "rule__Controller__ActionsAssignment_4_3_1");
					put(grammarAccess.getControllerAccess().getViewsAssignment_5_2(), "rule__Controller__ViewsAssignment_5_2");
					put(grammarAccess.getControllerAccess().getViewsAssignment_5_3_1(), "rule__Controller__ViewsAssignment_5_3_1");
					put(grammarAccess.getControllerAccess().getEventActionsAssignment_6_2(), "rule__Controller__EventActionsAssignment_6_2");
					put(grammarAccess.getControllerAccess().getEventActionsAssignment_6_3_1(), "rule__Controller__EventActionsAssignment_6_3_1");
					put(grammarAccess.getAnnotationAttributeAccess().getAttributeAssignment_0(), "rule__AnnotationAttribute__AttributeAssignment_0");
					put(grammarAccess.getAnnotationAttributeAccess().getValueAssignment_2(), "rule__AnnotationAttribute__ValueAssignment_2");
					put(grammarAccess.getSimpleValueAccess().getValueAssignment_1(), "rule__SimpleValue__ValueAssignment_1");
					put(grammarAccess.getUIInputAccess().getAnnotationsAssignment_1(), "rule__UIInput__AnnotationsAssignment_1");
					put(grammarAccess.getUIInputAccess().getNameAssignment_3(), "rule__UIInput__NameAssignment_3");
					put(grammarAccess.getUIInputAccess().getTypeAssignment_5_1(), "rule__UIInput__TypeAssignment_5_1");
					put(grammarAccess.getUIInputAccess().getValueAssignment_6_1(), "rule__UIInput__ValueAssignment_6_1");
					put(grammarAccess.getUIActionsAccess().getAnnotationsAssignment_1(), "rule__UIActions__AnnotationsAssignment_1");
					put(grammarAccess.getUIActionsAccess().getNameAssignment_3(), "rule__UIActions__NameAssignment_3");
					put(grammarAccess.getUIActionsAccess().getTypeAssignment_5_1(), "rule__UIActions__TypeAssignment_5_1");
					put(grammarAccess.getUIActionsAccess().getTriggerEventAssignment_6_1(), "rule__UIActions__TriggerEventAssignment_6_1");
					put(grammarAccess.getUILabelAccess().getAnnotationsAssignment_1(), "rule__UILabel__AnnotationsAssignment_1");
					put(grammarAccess.getUILabelAccess().getNameAssignment_3(), "rule__UILabel__NameAssignment_3");
					put(grammarAccess.getUILabelAccess().getTypeAssignment_5_1(), "rule__UILabel__TypeAssignment_5_1");
					put(grammarAccess.getUILabelAccess().getTextAssignment_6_1(), "rule__UILabel__TextAssignment_6_1");
					put(grammarAccess.getUILabelAccess().getValueAssignment_7_1(), "rule__UILabel__ValueAssignment_7_1");
					put(grammarAccess.getActionAccess().getAnnotationsAssignment_1(), "rule__Action__AnnotationsAssignment_1");
					put(grammarAccess.getActionAccess().getNameAssignment_2(), "rule__Action__NameAssignment_2");
					put(grammarAccess.getActionAccess().getPreExecutionEventAssignment_4_1(), "rule__Action__PreExecutionEventAssignment_4_1");
					put(grammarAccess.getActionAccess().getPostExecutionEventAssignment_5_1(), "rule__Action__PostExecutionEventAssignment_5_1");
					put(grammarAccess.getActionAccess().getTriggerEventsAssignment_6_2(), "rule__Action__TriggerEventsAssignment_6_2");
					put(grammarAccess.getActionAccess().getTriggerEventsAssignment_6_3_1(), "rule__Action__TriggerEventsAssignment_6_3_1");
					put(grammarAccess.getControllerViewAccess().getAnnotationsAssignment_0(), "rule__ControllerView__AnnotationsAssignment_0");
					put(grammarAccess.getControllerViewAccess().getViewAssignment_2(), "rule__ControllerView__ViewAssignment_2");
					put(grammarAccess.getControllerViewAccess().getModelsAssignment_3_2(), "rule__ControllerView__ModelsAssignment_3_2");
					put(grammarAccess.getControllerViewAccess().getModelsAssignment_3_3_1(), "rule__ControllerView__ModelsAssignment_3_3_1");
					put(grammarAccess.getEventActionAccess().getAnnotationsAssignment_0(), "rule__EventAction__AnnotationsAssignment_0");
					put(grammarAccess.getEventActionAccess().getActionAssignment_4(), "rule__EventAction__ActionAssignment_4");
					put(grammarAccess.getEventActionAccess().getEventsAssignment_5_2(), "rule__EventAction__EventsAssignment_5_2");
					put(grammarAccess.getEventActionAccess().getEventsAssignment_5_3_1(), "rule__EventAction__EventsAssignment_5_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			co.edu.uniandes.csw.dsl.ui.contentassist.antlr.internal.InternalComponentParser typedParser = (co.edu.uniandes.csw.dsl.ui.contentassist.antlr.internal.InternalComponentParser) parser;
			typedParser.entryRuleComponent();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ComponentGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ComponentGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
