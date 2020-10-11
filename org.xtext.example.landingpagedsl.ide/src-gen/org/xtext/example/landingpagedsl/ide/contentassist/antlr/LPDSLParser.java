/*
 * generated by Xtext 2.23.0.M3
 */
package org.xtext.example.landingpagedsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.landingpagedsl.ide.contentassist.antlr.internal.InternalLPDSLParser;
import org.xtext.example.landingpagedsl.services.LPDSLGrammarAccess;

public class LPDSLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(LPDSLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, LPDSLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getPageComponentAccess().getAlternatives(), "rule__PageComponent__Alternatives");
			builder.put(grammarAccess.getSectionsAccess().getAlternatives(), "rule__Sections__Alternatives");
			builder.put(grammarAccess.getPageFooterAccess().getGroup(), "rule__PageFooter__Group__0");
			builder.put(grammarAccess.getLinkItemAccess().getGroup(), "rule__LinkItem__Group__0");
			builder.put(grammarAccess.getURLAccess().getGroup(), "rule__URL__Group__0");
			builder.put(grammarAccess.getQualifiedPathAccess().getGroup(), "rule__QualifiedPath__Group__0");
			builder.put(grammarAccess.getQualifiedPathAccess().getGroup_1(), "rule__QualifiedPath__Group_1__0");
			builder.put(grammarAccess.getPageHeaderAccess().getGroup(), "rule__PageHeader__Group__0");
			builder.put(grammarAccess.getTabItemsAccess().getGroup(), "rule__TabItems__Group__0");
			builder.put(grammarAccess.getPageBodyAccess().getGroup(), "rule__PageBody__Group__0");
			builder.put(grammarAccess.getResumeAccess().getGroup(), "rule__Resume__Group__0");
			builder.put(grammarAccess.getItemsAccess().getGroup(), "rule__Items__Group__0");
			builder.put(grammarAccess.getAboutMeAccess().getGroup(), "rule__AboutMe__Group__0");
			builder.put(grammarAccess.getPictureAccess().getGroup(), "rule__Picture__Group__0");
			builder.put(grammarAccess.getLandingPageAccess().getPagecomponentAssignment(), "rule__LandingPage__PagecomponentAssignment");
			builder.put(grammarAccess.getPageFooterAccess().getNameAssignment_1(), "rule__PageFooter__NameAssignment_1");
			builder.put(grammarAccess.getPageFooterAccess().getLinksAssignment_3(), "rule__PageFooter__LinksAssignment_3");
			builder.put(grammarAccess.getLinkItemAccess().getNameAssignment_1(), "rule__LinkItem__NameAssignment_1");
			builder.put(grammarAccess.getLinkItemAccess().getTextAssignment_3(), "rule__LinkItem__TextAssignment_3");
			builder.put(grammarAccess.getLinkItemAccess().getLinkAssignment_4(), "rule__LinkItem__LinkAssignment_4");
			builder.put(grammarAccess.getURLAccess().getNameAssignment_0(), "rule__URL__NameAssignment_0");
			builder.put(grammarAccess.getURLAccess().getPathAssignment_2(), "rule__URL__PathAssignment_2");
			builder.put(grammarAccess.getQualifiedPathAccess().getValueAssignment_0(), "rule__QualifiedPath__ValueAssignment_0");
			builder.put(grammarAccess.getPageHeaderAccess().getNameAssignment_1(), "rule__PageHeader__NameAssignment_1");
			builder.put(grammarAccess.getPageHeaderAccess().getTitleAssignment_3(), "rule__PageHeader__TitleAssignment_3");
			builder.put(grammarAccess.getPageHeaderAccess().getTabsAssignment_4(), "rule__PageHeader__TabsAssignment_4");
			builder.put(grammarAccess.getTabItemsAccess().getNameAssignment_0(), "rule__TabItems__NameAssignment_0");
			builder.put(grammarAccess.getTabItemsAccess().getDescriptionAssignment_2(), "rule__TabItems__DescriptionAssignment_2");
			builder.put(grammarAccess.getPageBodyAccess().getNameAssignment_1(), "rule__PageBody__NameAssignment_1");
			builder.put(grammarAccess.getPageBodyAccess().getSectionsAssignment_3(), "rule__PageBody__SectionsAssignment_3");
			builder.put(grammarAccess.getResumeAccess().getNameAssignment_1(), "rule__Resume__NameAssignment_1");
			builder.put(grammarAccess.getResumeAccess().getResumeitemsAssignment_3(), "rule__Resume__ResumeitemsAssignment_3");
			builder.put(grammarAccess.getItemsAccess().getNameAssignment_0(), "rule__Items__NameAssignment_0");
			builder.put(grammarAccess.getItemsAccess().getDescriptionAssignment_2(), "rule__Items__DescriptionAssignment_2");
			builder.put(grammarAccess.getDescriptionAccess().getValueAssignment(), "rule__Description__ValueAssignment");
			builder.put(grammarAccess.getAboutMeAccess().getNameAssignment_1(), "rule__AboutMe__NameAssignment_1");
			builder.put(grammarAccess.getAboutMeAccess().getPictureAssignment_3(), "rule__AboutMe__PictureAssignment_3");
			builder.put(grammarAccess.getAboutMeAccess().getDescriptionAssignment_4(), "rule__AboutMe__DescriptionAssignment_4");
			builder.put(grammarAccess.getPictureAccess().getNameAssignment_0(), "rule__Picture__NameAssignment_0");
			builder.put(grammarAccess.getPictureAccess().getImagepathAssignment_2(), "rule__Picture__ImagepathAssignment_2");
			builder.put(grammarAccess.getImagePathAccess().getValueAssignment(), "rule__ImagePath__ValueAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private LPDSLGrammarAccess grammarAccess;

	@Override
	protected InternalLPDSLParser createParser() {
		InternalLPDSLParser result = new InternalLPDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public LPDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LPDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
