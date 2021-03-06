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

import co.edu.uniandes.csw.spl.dsl.services.AnnotateitGrammarAccess;

public class AnnotateitParser extends AbstractContentAssistParser {
	
	@Inject
	private AnnotateitGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected co.edu.uniandes.csw.spl.dsl.ui.contentassist.antlr.internal.InternalAnnotateitParser createParser() {
		co.edu.uniandes.csw.spl.dsl.ui.contentassist.antlr.internal.InternalAnnotateitParser result = new co.edu.uniandes.csw.spl.dsl.ui.contentassist.antlr.internal.InternalAnnotateitParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getPackageAccess().getGroup_4(), "rule__Package__Group_4__0");
					put(grammarAccess.getPackageAccess().getGroup_4_3(), "rule__Package__Group_4_3__0");
					put(grammarAccess.getPackageAccess().getGroup_5(), "rule__Package__Group_5__0");
					put(grammarAccess.getPackageAccess().getGroup_5_1(), "rule__Package__Group_5_1__0");
					put(grammarAccess.getAnnotationAccess().getGroup(), "rule__Annotation__Group__0");
					put(grammarAccess.getAnnotationAccess().getGroup_4(), "rule__Annotation__Group_4__0");
					put(grammarAccess.getAnnotationAccess().getGroup_4_3(), "rule__Annotation__Group_4_3__0");
					put(grammarAccess.getTypeAccess().getGroup(), "rule__Type__Group__0");
					put(grammarAccess.getAnnotationTypeAccess().getGroup(), "rule__AnnotationType__Group__0");
					put(grammarAccess.getAnnotationTypeAccess().getGroup_3(), "rule__AnnotationType__Group_3__0");
					put(grammarAccess.getAnnotationTypeAccess().getGroup_5(), "rule__AnnotationType__Group_5__0");
					put(grammarAccess.getAnnotationTypeAccess().getGroup_5_1(), "rule__AnnotationType__Group_5_1__0");
					put(grammarAccess.getAnnotationAttributeAccess().getGroup(), "rule__AnnotationAttribute__Group__0");
					put(grammarAccess.getAnnotationAttributeAccess().getGroup_4(), "rule__AnnotationAttribute__Group_4__0");
					put(grammarAccess.getAnnotationTypeAttributeAccess().getGroup(), "rule__AnnotationTypeAttribute__Group__0");
					put(grammarAccess.getSimpleValueAccess().getGroup(), "rule__SimpleValue__Group__0");
					put(grammarAccess.getSimpleValueAccess().getGroup_3(), "rule__SimpleValue__Group_3__0");
					put(grammarAccess.getPackageAccess().getNameAssignment_2(), "rule__Package__NameAssignment_2");
					put(grammarAccess.getPackageAccess().getTypesAssignment_4_2(), "rule__Package__TypesAssignment_4_2");
					put(grammarAccess.getPackageAccess().getTypesAssignment_4_3_1(), "rule__Package__TypesAssignment_4_3_1");
					put(grammarAccess.getPackageAccess().getAnnotationTypesAssignment_5_0(), "rule__Package__AnnotationTypesAssignment_5_0");
					put(grammarAccess.getPackageAccess().getAnnotationTypesAssignment_5_1_1(), "rule__Package__AnnotationTypesAssignment_5_1_1");
					put(grammarAccess.getAnnotationAccess().getAnnotationTypeAssignment_3(), "rule__Annotation__AnnotationTypeAssignment_3");
					put(grammarAccess.getAnnotationAccess().getAttributesAssignment_4_2(), "rule__Annotation__AttributesAssignment_4_2");
					put(grammarAccess.getAnnotationAccess().getAttributesAssignment_4_3_1(), "rule__Annotation__AttributesAssignment_4_3_1");
					put(grammarAccess.getTypeAccess().getNameAssignment_2(), "rule__Type__NameAssignment_2");
					put(grammarAccess.getAnnotationTypeAccess().getNameAssignment_2(), "rule__AnnotationType__NameAssignment_2");
					put(grammarAccess.getAnnotationTypeAccess().getContextAssignment_3_1(), "rule__AnnotationType__ContextAssignment_3_1");
					put(grammarAccess.getAnnotationTypeAccess().getAttributesAssignment_5_0(), "rule__AnnotationType__AttributesAssignment_5_0");
					put(grammarAccess.getAnnotationTypeAccess().getAttributesAssignment_5_1_1(), "rule__AnnotationType__AttributesAssignment_5_1_1");
					put(grammarAccess.getAnnotationAttributeAccess().getAttributeAssignment_3(), "rule__AnnotationAttribute__AttributeAssignment_3");
					put(grammarAccess.getAnnotationAttributeAccess().getValueAssignment_4_1(), "rule__AnnotationAttribute__ValueAssignment_4_1");
					put(grammarAccess.getAnnotationTypeAttributeAccess().getNameAssignment_1(), "rule__AnnotationTypeAttribute__NameAssignment_1");
					put(grammarAccess.getAnnotationTypeAttributeAccess().getTypeAssignment_3(), "rule__AnnotationTypeAttribute__TypeAssignment_3");
					put(grammarAccess.getSimpleValueAccess().getValueAssignment_3_1(), "rule__SimpleValue__ValueAssignment_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			co.edu.uniandes.csw.spl.dsl.ui.contentassist.antlr.internal.InternalAnnotateitParser typedParser = (co.edu.uniandes.csw.spl.dsl.ui.contentassist.antlr.internal.InternalAnnotateitParser) parser;
			typedParser.entryRulePackage();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AnnotateitGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AnnotateitGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
