/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.landingpagedsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class LPDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/example/landingpagedsl/parser/antlr/internal/InternalLPDSL.tokens");
	}
}
