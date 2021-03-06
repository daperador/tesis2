/*
* generated by Xtext
*/
package co.edu.uniandes.csw.spl.dsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import co.edu.uniandes.csw.spl.dsl.services.MVCDslGrammarAccess;

public class MVCDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private MVCDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected co.edu.uniandes.csw.spl.dsl.parser.antlr.internal.InternalMVCDslParser createParser(XtextTokenStream stream) {
		return new co.edu.uniandes.csw.spl.dsl.parser.antlr.internal.InternalMVCDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "MVCModel";
	}
	
	public MVCDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MVCDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
