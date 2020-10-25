/*
 * generated by Xtext 2.23.0
 */
grammar InternalLPDSL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.landingpagedsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.landingpagedsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.landingpagedsl.services.LPDSLGrammarAccess;

}

@parser::members {

 	private LPDSLGrammarAccess grammarAccess;

    public InternalLPDSLParser(TokenStream input, LPDSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "LandingPage";
   	}

   	@Override
   	protected LPDSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleLandingPage
entryRuleLandingPage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLandingPageRule()); }
	iv_ruleLandingPage=ruleLandingPage
	{ $current=$iv_ruleLandingPage.current; }
	EOF;

// Rule LandingPage
ruleLandingPage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getLandingPageAccess().getPagecomponentPageComponentParserRuleCall_0());
			}
			lv_pagecomponent_0_0=rulePageComponent
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getLandingPageRule());
				}
				add(
					$current,
					"pagecomponent",
					lv_pagecomponent_0_0,
					"org.xtext.example.landingpagedsl.LPDSL.PageComponent");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRulePageComponent
entryRulePageComponent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPageComponentRule()); }
	iv_rulePageComponent=rulePageComponent
	{ $current=$iv_rulePageComponent.current; }
	EOF;

// Rule PageComponent
rulePageComponent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPageComponentAccess().getPageHeaderParserRuleCall_0());
		}
		this_PageHeader_0=rulePageHeader
		{
			$current = $this_PageHeader_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPageComponentAccess().getPageBodyParserRuleCall_1());
		}
		this_PageBody_1=rulePageBody
		{
			$current = $this_PageBody_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPageComponentAccess().getPageFooterParserRuleCall_2());
		}
		this_PageFooter_2=rulePageFooter
		{
			$current = $this_PageFooter_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePictureCarousel
entryRulePictureCarousel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPictureCarouselRule()); }
	iv_rulePictureCarousel=rulePictureCarousel
	{ $current=$iv_rulePictureCarousel.current; }
	EOF;

// Rule PictureCarousel
rulePictureCarousel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='carousel'
		{
			newLeafNode(otherlv_0, grammarAccess.getPictureCarouselAccess().getCarouselKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPictureCarouselAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPictureCarouselRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPictureCarouselAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPictureCarouselAccess().getTimerTimeSpecifierParserRuleCall_3_0());
				}
				lv_timer_3_0=ruleTimeSpecifier
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPictureCarouselRule());
					}
					add(
						$current,
						"timer",
						lv_timer_3_0,
						"org.xtext.example.landingpagedsl.LPDSL.TimeSpecifier");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPictureCarouselAccess().getPicturePictureParserRuleCall_4_0());
				}
				lv_picture_4_0=rulePicture
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPictureCarouselRule());
					}
					add(
						$current,
						"picture",
						lv_picture_4_0,
						"org.xtext.example.landingpagedsl.LPDSL.Picture");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getPictureCarouselAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRulePageFooter
entryRulePageFooter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPageFooterRule()); }
	iv_rulePageFooter=rulePageFooter
	{ $current=$iv_rulePageFooter.current; }
	EOF;

// Rule PageFooter
rulePageFooter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='footer'
		{
			newLeafNode(otherlv_0, grammarAccess.getPageFooterAccess().getFooterKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPageFooterAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPageFooterRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPageFooterAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPageFooterAccess().getLinksLinkItemParserRuleCall_3_0());
				}
				lv_links_3_0=ruleLinkItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPageFooterRule());
					}
					add(
						$current,
						"links",
						lv_links_3_0,
						"org.xtext.example.landingpagedsl.LPDSL.LinkItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getPageFooterAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleLinkItem
entryRuleLinkItem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLinkItemRule()); }
	iv_ruleLinkItem=ruleLinkItem
	{ $current=$iv_ruleLinkItem.current; }
	EOF;

// Rule LinkItem
ruleLinkItem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='link'
		{
			newLeafNode(otherlv_0, grammarAccess.getLinkItemAccess().getLinkKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getLinkItemAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLinkItemRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getLinkItemAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLinkItemAccess().getTextItemsParserRuleCall_3_0());
				}
				lv_text_3_0=ruleItems
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLinkItemRule());
					}
					add(
						$current,
						"text",
						lv_text_3_0,
						"org.xtext.example.landingpagedsl.LPDSL.Items");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getLinkItemAccess().getLinkURLParserRuleCall_4_0());
				}
				lv_link_4_0=ruleURL
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLinkItemRule());
					}
					add(
						$current,
						"link",
						lv_link_4_0,
						"org.xtext.example.landingpagedsl.LPDSL.URL");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getLinkItemAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleURL
entryRuleURL returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getURLRule()); }
	iv_ruleURL=ruleURL
	{ $current=$iv_ruleURL.current; }
	EOF;

// Rule URL
ruleURL returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getURLAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getURLRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getURLAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getURLAccess().getPathQualifiedPathParserRuleCall_2_0());
				}
				lv_path_2_0=ruleQualifiedPath
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getURLRule());
					}
					add(
						$current,
						"path",
						lv_path_2_0,
						"org.xtext.example.landingpagedsl.LPDSL.QualifiedPath");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleQualifiedPath
entryRuleQualifiedPath returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedPathRule()); }
	iv_ruleQualifiedPath=ruleQualifiedPath
	{ $current=$iv_ruleQualifiedPath.current; }
	EOF;

// Rule QualifiedPath
ruleQualifiedPath returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_value_0_0=RULE_STRING
				{
					newLeafNode(lv_value_0_0, grammarAccess.getQualifiedPathAccess().getValueSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getQualifiedPathRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_0_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_1='.'
			{
				newLeafNode(otherlv_1, grammarAccess.getQualifiedPathAccess().getFullStopKeyword_1_0());
			}
			this_STRING_2=RULE_STRING
			{
				newLeafNode(this_STRING_2, grammarAccess.getQualifiedPathAccess().getSTRINGTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRulePageHeader
entryRulePageHeader returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPageHeaderRule()); }
	iv_rulePageHeader=rulePageHeader
	{ $current=$iv_rulePageHeader.current; }
	EOF;

// Rule PageHeader
rulePageHeader returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='header'
		{
			newLeafNode(otherlv_0, grammarAccess.getPageHeaderAccess().getHeaderKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPageHeaderAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPageHeaderRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPageHeaderAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPageHeaderAccess().getTitleItemsParserRuleCall_3_0());
				}
				lv_title_3_0=ruleItems
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPageHeaderRule());
					}
					add(
						$current,
						"title",
						lv_title_3_0,
						"org.xtext.example.landingpagedsl.LPDSL.Items");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPageHeaderAccess().getTabsTabItemsParserRuleCall_4_0());
				}
				lv_tabs_4_0=ruleTabItems
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPageHeaderRule());
					}
					add(
						$current,
						"tabs",
						lv_tabs_4_0,
						"org.xtext.example.landingpagedsl.LPDSL.TabItems");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getPageHeaderAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleTabItems
entryRuleTabItems returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTabItemsRule()); }
	iv_ruleTabItems=ruleTabItems
	{ $current=$iv_ruleTabItems.current; }
	EOF;

// Rule TabItems
ruleTabItems returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getTabItemsAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTabItemsRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getTabItemsAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTabItemsAccess().getDescriptionDescriptionParserRuleCall_2_0());
				}
				lv_description_2_0=ruleDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTabItemsRule());
					}
					add(
						$current,
						"description",
						lv_description_2_0,
						"org.xtext.example.landingpagedsl.LPDSL.Description");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePageBody
entryRulePageBody returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPageBodyRule()); }
	iv_rulePageBody=rulePageBody
	{ $current=$iv_rulePageBody.current; }
	EOF;

// Rule PageBody
rulePageBody returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='body'
		{
			newLeafNode(otherlv_0, grammarAccess.getPageBodyAccess().getBodyKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPageBodyAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPageBodyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPageBodyAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPageBodyAccess().getSectionsSectionsParserRuleCall_3_0());
				}
				lv_sections_3_0=ruleSections
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPageBodyRule());
					}
					add(
						$current,
						"sections",
						lv_sections_3_0,
						"org.xtext.example.landingpagedsl.LPDSL.Sections");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getPageBodyAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleSections
entryRuleSections returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSectionsRule()); }
	iv_ruleSections=ruleSections
	{ $current=$iv_ruleSections.current; }
	EOF;

// Rule Sections
ruleSections returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSectionsAccess().getResumeParserRuleCall_0());
		}
		this_Resume_0=ruleResume
		{
			$current = $this_Resume_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSectionsAccess().getAboutMeParserRuleCall_1());
		}
		this_AboutMe_1=ruleAboutMe
		{
			$current = $this_AboutMe_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSectionsAccess().getPictureCarouselParserRuleCall_2());
		}
		this_PictureCarousel_2=rulePictureCarousel
		{
			$current = $this_PictureCarousel_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSectionsAccess().getContactInformationParserRuleCall_3());
		}
		this_ContactInformation_3=ruleContactInformation
		{
			$current = $this_ContactInformation_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSectionsAccess().getLinksParserRuleCall_4());
		}
		this_Links_4=ruleLinks
		{
			$current = $this_Links_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleLinks
entryRuleLinks returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLinksRule()); }
	iv_ruleLinks=ruleLinks
	{ $current=$iv_ruleLinks.current; }
	EOF;

// Rule Links
ruleLinks returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='links'
		{
			newLeafNode(otherlv_0, grammarAccess.getLinksAccess().getLinksKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getLinksAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLinksRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getLinksAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLinksAccess().getLinksLinkItemParserRuleCall_3_0());
				}
				lv_links_3_0=ruleLinkItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLinksRule());
					}
					add(
						$current,
						"links",
						lv_links_3_0,
						"org.xtext.example.landingpagedsl.LPDSL.LinkItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getLinksAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleContactInformation
entryRuleContactInformation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContactInformationRule()); }
	iv_ruleContactInformation=ruleContactInformation
	{ $current=$iv_ruleContactInformation.current; }
	EOF;

// Rule ContactInformation
ruleContactInformation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='contactinfo'
		{
			newLeafNode(otherlv_0, grammarAccess.getContactInformationAccess().getContactinfoKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getContactInformationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContactInformationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getContactInformationAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getContactInformationAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleResume
entryRuleResume returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getResumeRule()); }
	iv_ruleResume=ruleResume
	{ $current=$iv_ruleResume.current; }
	EOF;

// Rule Resume
ruleResume returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='resume'
		{
			newLeafNode(otherlv_0, grammarAccess.getResumeAccess().getResumeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getResumeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getResumeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getResumeAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getResumeAccess().getResumeitemsItemsParserRuleCall_3_0());
				}
				lv_resumeitems_3_0=ruleItems
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getResumeRule());
					}
					add(
						$current,
						"resumeitems",
						lv_resumeitems_3_0,
						"org.xtext.example.landingpagedsl.LPDSL.Items");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getResumeAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleItems
entryRuleItems returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getItemsRule()); }
	iv_ruleItems=ruleItems
	{ $current=$iv_ruleItems.current; }
	EOF;

// Rule Items
ruleItems returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getItemsAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getItemsRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getItemsAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getItemsAccess().getDescriptionDescriptionParserRuleCall_2_0());
				}
				lv_description_2_0=ruleDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getItemsRule());
					}
					add(
						$current,
						"description",
						lv_description_2_0,
						"org.xtext.example.landingpagedsl.LPDSL.Description");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDescription
entryRuleDescription returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDescriptionRule()); }
	iv_ruleDescription=ruleDescription
	{ $current=$iv_ruleDescription.current; }
	EOF;

// Rule Description
ruleDescription returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_STRING
			{
				newLeafNode(lv_value_0_0, grammarAccess.getDescriptionAccess().getValueSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getDescriptionRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

// Entry rule entryRuleTimeSpecifier
entryRuleTimeSpecifier returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTimeSpecifierRule()); }
	iv_ruleTimeSpecifier=ruleTimeSpecifier
	{ $current=$iv_ruleTimeSpecifier.current; }
	EOF;

// Rule TimeSpecifier
ruleTimeSpecifier returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getTimeSpecifierAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTimeSpecifierRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getTimeSpecifierAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTimeSpecifierAccess().getTimeIntegerParserRuleCall_2_0());
				}
				lv_time_2_0=ruleInteger
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTimeSpecifierRule());
					}
					add(
						$current,
						"time",
						lv_time_2_0,
						"org.xtext.example.landingpagedsl.LPDSL.Integer");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleInteger
entryRuleInteger returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntegerRule()); }
	iv_ruleInteger=ruleInteger
	{ $current=$iv_ruleInteger.current; }
	EOF;

// Rule Integer
ruleInteger returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_INT
			{
				newLeafNode(lv_value_0_0, grammarAccess.getIntegerAccess().getValueINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getIntegerRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleAboutMe
entryRuleAboutMe returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAboutMeRule()); }
	iv_ruleAboutMe=ruleAboutMe
	{ $current=$iv_ruleAboutMe.current; }
	EOF;

// Rule AboutMe
ruleAboutMe returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='aboutme'
		{
			newLeafNode(otherlv_0, grammarAccess.getAboutMeAccess().getAboutmeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAboutMeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAboutMeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getAboutMeAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAboutMeAccess().getPicturePictureParserRuleCall_3_0());
				}
				lv_picture_3_0=rulePicture
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAboutMeRule());
					}
					add(
						$current,
						"picture",
						lv_picture_3_0,
						"org.xtext.example.landingpagedsl.LPDSL.Picture");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAboutMeAccess().getDescriptionItemsParserRuleCall_4_0());
				}
				lv_description_4_0=ruleItems
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAboutMeRule());
					}
					add(
						$current,
						"description",
						lv_description_4_0,
						"org.xtext.example.landingpagedsl.LPDSL.Items");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getAboutMeAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRulePicture
entryRulePicture returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPictureRule()); }
	iv_rulePicture=rulePicture
	{ $current=$iv_rulePicture.current; }
	EOF;

// Rule Picture
rulePicture returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getPictureAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPictureRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getPictureAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPictureAccess().getImagepathImagePathParserRuleCall_2_0());
				}
				lv_imagepath_2_0=ruleImagePath
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPictureRule());
					}
					add(
						$current,
						"imagepath",
						lv_imagepath_2_0,
						"org.xtext.example.landingpagedsl.LPDSL.ImagePath");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleImagePath
entryRuleImagePath returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImagePathRule()); }
	iv_ruleImagePath=ruleImagePath
	{ $current=$iv_ruleImagePath.current; }
	EOF;

// Rule ImagePath
ruleImagePath returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_STRING
			{
				newLeafNode(lv_value_0_0, grammarAccess.getImagePathAccess().getValueSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getImagePathRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
