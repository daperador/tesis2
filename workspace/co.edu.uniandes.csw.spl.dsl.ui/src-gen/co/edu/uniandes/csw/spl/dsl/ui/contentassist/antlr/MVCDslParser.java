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
					put(grammarAccess.getMVCModelAccess().getGroup(), "rule__MVCModel__Group__0");
					put(grammarAccess.getMVCModelAccess().getGroup_6(), "rule__MVCModel__Group_6__0");
					put(grammarAccess.getMVCModelAccess().getGroup_11(), "rule__MVCModel__Group_11__0");
					put(grammarAccess.getAnnotationAccess().getGroup(), "rule__Annotation__Group__0");
					put(grammarAccess.getAnnotationAccess().getGroup_3(), "rule__Annotation__Group_3__0");
					put(grammarAccess.getAnnotationAccess().getGroup_3_1(), "rule__Annotation__Group_3_1__0");
					put(grammarAccess.getAnnotationAttributeAccess().getGroup(), "rule__AnnotationAttribute__Group__0");
					put(grammarAccess.getSimpleValueAccess().getGroup(), "rule__SimpleValue__Group__0");
					put(grammarAccess.getMVCModelAccess().getImportURIAssignment_1(), "rule__MVCModel__ImportURIAssignment_1");
					put(grammarAccess.getMVCModelAccess().getAnnotationsAssignment_3(), "rule__MVCModel__AnnotationsAssignment_3");
					put(grammarAccess.getMVCModelAccess().getNameAssignment_5(), "rule__MVCModel__NameAssignment_5");
					put(grammarAccess.getMVCModelAccess().getVersionAssignment_6_1(), "rule__MVCModel__VersionAssignment_6_1");
					put(grammarAccess.getMVCModelAccess().getComponentsAssignment_10(), "rule__MVCModel__ComponentsAssignment_10");
					put(grammarAccess.getMVCModelAccess().getComponentsAssignment_11_1(), "rule__MVCModel__ComponentsAssignment_11_1");
					put(grammarAccess.getAnnotationAccess().getAnnotationTypeAssignment_1(), "rule__Annotation__AnnotationTypeAssignment_1");
					put(grammarAccess.getAnnotationAccess().getAttributesAssignment_3_0(), "rule__Annotation__AttributesAssignment_3_0");
					put(grammarAccess.getAnnotationAccess().getAttributesAssignment_3_1_1(), "rule__Annotation__AttributesAssignment_3_1_1");
					put(grammarAccess.getAnnotationAttributeAccess().getAttributeAssignment_0(), "rule__AnnotationAttribute__AttributeAssignment_0");
					put(grammarAccess.getAnnotationAttributeAccess().getValueAssignment_2(), "rule__AnnotationAttribute__ValueAssignment_2");
					put(grammarAccess.getSimpleValueAccess().getValueAssignment_1(), "rule__SimpleValue__ValueAssignment_1");
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
