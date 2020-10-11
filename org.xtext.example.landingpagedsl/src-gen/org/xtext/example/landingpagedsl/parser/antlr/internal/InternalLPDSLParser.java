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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLPDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'footer'", "'{'", "'}'", "'link'", "':'", "'.'", "'header'", "'body'", "'resume'", "'aboutme'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalLPDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLPDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLPDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLPDSL.g"; }



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




    // $ANTLR start "entryRuleLandingPage"
    // InternalLPDSL.g:64:1: entryRuleLandingPage returns [EObject current=null] : iv_ruleLandingPage= ruleLandingPage EOF ;
    public final EObject entryRuleLandingPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLandingPage = null;


        try {
            // InternalLPDSL.g:64:52: (iv_ruleLandingPage= ruleLandingPage EOF )
            // InternalLPDSL.g:65:2: iv_ruleLandingPage= ruleLandingPage EOF
            {
             newCompositeNode(grammarAccess.getLandingPageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLandingPage=ruleLandingPage();

            state._fsp--;

             current =iv_ruleLandingPage; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLandingPage"


    // $ANTLR start "ruleLandingPage"
    // InternalLPDSL.g:71:1: ruleLandingPage returns [EObject current=null] : ( (lv_pagecomponent_0_0= rulePageComponent ) )* ;
    public final EObject ruleLandingPage() throws RecognitionException {
        EObject current = null;

        EObject lv_pagecomponent_0_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:77:2: ( ( (lv_pagecomponent_0_0= rulePageComponent ) )* )
            // InternalLPDSL.g:78:2: ( (lv_pagecomponent_0_0= rulePageComponent ) )*
            {
            // InternalLPDSL.g:78:2: ( (lv_pagecomponent_0_0= rulePageComponent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLPDSL.g:79:3: (lv_pagecomponent_0_0= rulePageComponent )
            	    {
            	    // InternalLPDSL.g:79:3: (lv_pagecomponent_0_0= rulePageComponent )
            	    // InternalLPDSL.g:80:4: lv_pagecomponent_0_0= rulePageComponent
            	    {

            	    				newCompositeNode(grammarAccess.getLandingPageAccess().getPagecomponentPageComponentParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_pagecomponent_0_0=rulePageComponent();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getLandingPageRule());
            	    				}
            	    				add(
            	    					current,
            	    					"pagecomponent",
            	    					lv_pagecomponent_0_0,
            	    					"org.xtext.example.landingpagedsl.LPDSL.PageComponent");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleLandingPage"


    // $ANTLR start "entryRulePageComponent"
    // InternalLPDSL.g:100:1: entryRulePageComponent returns [EObject current=null] : iv_rulePageComponent= rulePageComponent EOF ;
    public final EObject entryRulePageComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageComponent = null;


        try {
            // InternalLPDSL.g:100:54: (iv_rulePageComponent= rulePageComponent EOF )
            // InternalLPDSL.g:101:2: iv_rulePageComponent= rulePageComponent EOF
            {
             newCompositeNode(grammarAccess.getPageComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePageComponent=rulePageComponent();

            state._fsp--;

             current =iv_rulePageComponent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePageComponent"


    // $ANTLR start "rulePageComponent"
    // InternalLPDSL.g:107:1: rulePageComponent returns [EObject current=null] : (this_PageHeader_0= rulePageHeader | this_PageBody_1= rulePageBody | this_PageFooter_2= rulePageFooter ) ;
    public final EObject rulePageComponent() throws RecognitionException {
        EObject current = null;

        EObject this_PageHeader_0 = null;

        EObject this_PageBody_1 = null;

        EObject this_PageFooter_2 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:113:2: ( (this_PageHeader_0= rulePageHeader | this_PageBody_1= rulePageBody | this_PageFooter_2= rulePageFooter ) )
            // InternalLPDSL.g:114:2: (this_PageHeader_0= rulePageHeader | this_PageBody_1= rulePageBody | this_PageFooter_2= rulePageFooter )
            {
            // InternalLPDSL.g:114:2: (this_PageHeader_0= rulePageHeader | this_PageBody_1= rulePageBody | this_PageFooter_2= rulePageFooter )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 11:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLPDSL.g:115:3: this_PageHeader_0= rulePageHeader
                    {

                    			newCompositeNode(grammarAccess.getPageComponentAccess().getPageHeaderParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PageHeader_0=rulePageHeader();

                    state._fsp--;


                    			current = this_PageHeader_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLPDSL.g:124:3: this_PageBody_1= rulePageBody
                    {

                    			newCompositeNode(grammarAccess.getPageComponentAccess().getPageBodyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PageBody_1=rulePageBody();

                    state._fsp--;


                    			current = this_PageBody_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLPDSL.g:133:3: this_PageFooter_2= rulePageFooter
                    {

                    			newCompositeNode(grammarAccess.getPageComponentAccess().getPageFooterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PageFooter_2=rulePageFooter();

                    state._fsp--;


                    			current = this_PageFooter_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulePageComponent"


    // $ANTLR start "entryRulePageFooter"
    // InternalLPDSL.g:145:1: entryRulePageFooter returns [EObject current=null] : iv_rulePageFooter= rulePageFooter EOF ;
    public final EObject entryRulePageFooter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageFooter = null;


        try {
            // InternalLPDSL.g:145:51: (iv_rulePageFooter= rulePageFooter EOF )
            // InternalLPDSL.g:146:2: iv_rulePageFooter= rulePageFooter EOF
            {
             newCompositeNode(grammarAccess.getPageFooterRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePageFooter=rulePageFooter();

            state._fsp--;

             current =iv_rulePageFooter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePageFooter"


    // $ANTLR start "rulePageFooter"
    // InternalLPDSL.g:152:1: rulePageFooter returns [EObject current=null] : (otherlv_0= 'footer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleLinkItem ) )* otherlv_4= '}' ) ;
    public final EObject rulePageFooter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_links_3_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:158:2: ( (otherlv_0= 'footer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleLinkItem ) )* otherlv_4= '}' ) )
            // InternalLPDSL.g:159:2: (otherlv_0= 'footer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleLinkItem ) )* otherlv_4= '}' )
            {
            // InternalLPDSL.g:159:2: (otherlv_0= 'footer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleLinkItem ) )* otherlv_4= '}' )
            // InternalLPDSL.g:160:3: otherlv_0= 'footer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleLinkItem ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPageFooterAccess().getFooterKeyword_0());
            		
            // InternalLPDSL.g:164:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLPDSL.g:165:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLPDSL.g:165:4: (lv_name_1_0= RULE_ID )
            // InternalLPDSL.g:166:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPageFooterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPageFooterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPageFooterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLPDSL.g:186:3: ( (lv_links_3_0= ruleLinkItem ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLPDSL.g:187:4: (lv_links_3_0= ruleLinkItem )
            	    {
            	    // InternalLPDSL.g:187:4: (lv_links_3_0= ruleLinkItem )
            	    // InternalLPDSL.g:188:5: lv_links_3_0= ruleLinkItem
            	    {

            	    					newCompositeNode(grammarAccess.getPageFooterAccess().getLinksLinkItemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_links_3_0=ruleLinkItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPageFooterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"links",
            	    						lv_links_3_0,
            	    						"org.xtext.example.landingpagedsl.LPDSL.LinkItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPageFooterAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePageFooter"


    // $ANTLR start "entryRuleLinkItem"
    // InternalLPDSL.g:213:1: entryRuleLinkItem returns [EObject current=null] : iv_ruleLinkItem= ruleLinkItem EOF ;
    public final EObject entryRuleLinkItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkItem = null;


        try {
            // InternalLPDSL.g:213:49: (iv_ruleLinkItem= ruleLinkItem EOF )
            // InternalLPDSL.g:214:2: iv_ruleLinkItem= ruleLinkItem EOF
            {
             newCompositeNode(grammarAccess.getLinkItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinkItem=ruleLinkItem();

            state._fsp--;

             current =iv_ruleLinkItem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLinkItem"


    // $ANTLR start "ruleLinkItem"
    // InternalLPDSL.g:220:1: ruleLinkItem returns [EObject current=null] : (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= ruleItems ) ) ( (lv_link_4_0= ruleURL ) ) otherlv_5= '}' ) ;
    public final EObject ruleLinkItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_text_3_0 = null;

        EObject lv_link_4_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:226:2: ( (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= ruleItems ) ) ( (lv_link_4_0= ruleURL ) ) otherlv_5= '}' ) )
            // InternalLPDSL.g:227:2: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= ruleItems ) ) ( (lv_link_4_0= ruleURL ) ) otherlv_5= '}' )
            {
            // InternalLPDSL.g:227:2: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= ruleItems ) ) ( (lv_link_4_0= ruleURL ) ) otherlv_5= '}' )
            // InternalLPDSL.g:228:3: otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= ruleItems ) ) ( (lv_link_4_0= ruleURL ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkItemAccess().getLinkKeyword_0());
            		
            // InternalLPDSL.g:232:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLPDSL.g:233:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLPDSL.g:233:4: (lv_name_1_0= RULE_ID )
            // InternalLPDSL.g:234:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLinkItemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkItemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLPDSL.g:254:3: ( (lv_text_3_0= ruleItems ) )
            // InternalLPDSL.g:255:4: (lv_text_3_0= ruleItems )
            {
            // InternalLPDSL.g:255:4: (lv_text_3_0= ruleItems )
            // InternalLPDSL.g:256:5: lv_text_3_0= ruleItems
            {

            					newCompositeNode(grammarAccess.getLinkItemAccess().getTextItemsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_text_3_0=ruleItems();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkItemRule());
            					}
            					add(
            						current,
            						"text",
            						lv_text_3_0,
            						"org.xtext.example.landingpagedsl.LPDSL.Items");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLPDSL.g:273:3: ( (lv_link_4_0= ruleURL ) )
            // InternalLPDSL.g:274:4: (lv_link_4_0= ruleURL )
            {
            // InternalLPDSL.g:274:4: (lv_link_4_0= ruleURL )
            // InternalLPDSL.g:275:5: lv_link_4_0= ruleURL
            {

            					newCompositeNode(grammarAccess.getLinkItemAccess().getLinkURLParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_link_4_0=ruleURL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkItemRule());
            					}
            					add(
            						current,
            						"link",
            						lv_link_4_0,
            						"org.xtext.example.landingpagedsl.LPDSL.URL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLinkItemAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleLinkItem"


    // $ANTLR start "entryRuleURL"
    // InternalLPDSL.g:300:1: entryRuleURL returns [EObject current=null] : iv_ruleURL= ruleURL EOF ;
    public final EObject entryRuleURL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURL = null;


        try {
            // InternalLPDSL.g:300:44: (iv_ruleURL= ruleURL EOF )
            // InternalLPDSL.g:301:2: iv_ruleURL= ruleURL EOF
            {
             newCompositeNode(grammarAccess.getURLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURL=ruleURL();

            state._fsp--;

             current =iv_ruleURL; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleURL"


    // $ANTLR start "ruleURL"
    // InternalLPDSL.g:307:1: ruleURL returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_path_2_0= ruleQualifiedPath ) ) ) ;
    public final EObject ruleURL() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:313:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_path_2_0= ruleQualifiedPath ) ) ) )
            // InternalLPDSL.g:314:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_path_2_0= ruleQualifiedPath ) ) )
            {
            // InternalLPDSL.g:314:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_path_2_0= ruleQualifiedPath ) ) )
            // InternalLPDSL.g:315:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_path_2_0= ruleQualifiedPath ) )
            {
            // InternalLPDSL.g:315:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLPDSL.g:316:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLPDSL.g:316:4: (lv_name_0_0= RULE_ID )
            // InternalLPDSL.g:317:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getURLAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getURLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getURLAccess().getColonKeyword_1());
            		
            // InternalLPDSL.g:337:3: ( (lv_path_2_0= ruleQualifiedPath ) )
            // InternalLPDSL.g:338:4: (lv_path_2_0= ruleQualifiedPath )
            {
            // InternalLPDSL.g:338:4: (lv_path_2_0= ruleQualifiedPath )
            // InternalLPDSL.g:339:5: lv_path_2_0= ruleQualifiedPath
            {

            					newCompositeNode(grammarAccess.getURLAccess().getPathQualifiedPathParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_path_2_0=ruleQualifiedPath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getURLRule());
            					}
            					add(
            						current,
            						"path",
            						lv_path_2_0,
            						"org.xtext.example.landingpagedsl.LPDSL.QualifiedPath");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleURL"


    // $ANTLR start "entryRuleQualifiedPath"
    // InternalLPDSL.g:360:1: entryRuleQualifiedPath returns [EObject current=null] : iv_ruleQualifiedPath= ruleQualifiedPath EOF ;
    public final EObject entryRuleQualifiedPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedPath = null;


        try {
            // InternalLPDSL.g:360:54: (iv_ruleQualifiedPath= ruleQualifiedPath EOF )
            // InternalLPDSL.g:361:2: iv_ruleQualifiedPath= ruleQualifiedPath EOF
            {
             newCompositeNode(grammarAccess.getQualifiedPathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedPath=ruleQualifiedPath();

            state._fsp--;

             current =iv_ruleQualifiedPath; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedPath"


    // $ANTLR start "ruleQualifiedPath"
    // InternalLPDSL.g:367:1: ruleQualifiedPath returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) (otherlv_1= '.' this_STRING_2= RULE_STRING )* ) ;
    public final EObject ruleQualifiedPath() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalLPDSL.g:373:2: ( ( ( (lv_value_0_0= RULE_STRING ) ) (otherlv_1= '.' this_STRING_2= RULE_STRING )* ) )
            // InternalLPDSL.g:374:2: ( ( (lv_value_0_0= RULE_STRING ) ) (otherlv_1= '.' this_STRING_2= RULE_STRING )* )
            {
            // InternalLPDSL.g:374:2: ( ( (lv_value_0_0= RULE_STRING ) ) (otherlv_1= '.' this_STRING_2= RULE_STRING )* )
            // InternalLPDSL.g:375:3: ( (lv_value_0_0= RULE_STRING ) ) (otherlv_1= '.' this_STRING_2= RULE_STRING )*
            {
            // InternalLPDSL.g:375:3: ( (lv_value_0_0= RULE_STRING ) )
            // InternalLPDSL.g:376:4: (lv_value_0_0= RULE_STRING )
            {
            // InternalLPDSL.g:376:4: (lv_value_0_0= RULE_STRING )
            // InternalLPDSL.g:377:5: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_value_0_0, grammarAccess.getQualifiedPathAccess().getValueSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedPathRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalLPDSL.g:393:3: (otherlv_1= '.' this_STRING_2= RULE_STRING )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLPDSL.g:394:4: otherlv_1= '.' this_STRING_2= RULE_STRING
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getQualifiedPathAccess().getFullStopKeyword_1_0());
            	    			
            	    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    				newLeafNode(this_STRING_2, grammarAccess.getQualifiedPathAccess().getSTRINGTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedPath"


    // $ANTLR start "entryRulePageHeader"
    // InternalLPDSL.g:407:1: entryRulePageHeader returns [EObject current=null] : iv_rulePageHeader= rulePageHeader EOF ;
    public final EObject entryRulePageHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageHeader = null;


        try {
            // InternalLPDSL.g:407:51: (iv_rulePageHeader= rulePageHeader EOF )
            // InternalLPDSL.g:408:2: iv_rulePageHeader= rulePageHeader EOF
            {
             newCompositeNode(grammarAccess.getPageHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePageHeader=rulePageHeader();

            state._fsp--;

             current =iv_rulePageHeader; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePageHeader"


    // $ANTLR start "rulePageHeader"
    // InternalLPDSL.g:414:1: rulePageHeader returns [EObject current=null] : (otherlv_0= 'header' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleItems ) ) ( (lv_tabs_4_0= ruleTabItems ) )* otherlv_5= '}' ) ;
    public final EObject rulePageHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_title_3_0 = null;

        EObject lv_tabs_4_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:420:2: ( (otherlv_0= 'header' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleItems ) ) ( (lv_tabs_4_0= ruleTabItems ) )* otherlv_5= '}' ) )
            // InternalLPDSL.g:421:2: (otherlv_0= 'header' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleItems ) ) ( (lv_tabs_4_0= ruleTabItems ) )* otherlv_5= '}' )
            {
            // InternalLPDSL.g:421:2: (otherlv_0= 'header' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleItems ) ) ( (lv_tabs_4_0= ruleTabItems ) )* otherlv_5= '}' )
            // InternalLPDSL.g:422:3: otherlv_0= 'header' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleItems ) ) ( (lv_tabs_4_0= ruleTabItems ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPageHeaderAccess().getHeaderKeyword_0());
            		
            // InternalLPDSL.g:426:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLPDSL.g:427:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLPDSL.g:427:4: (lv_name_1_0= RULE_ID )
            // InternalLPDSL.g:428:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPageHeaderAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPageHeaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPageHeaderAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLPDSL.g:448:3: ( (lv_title_3_0= ruleItems ) )
            // InternalLPDSL.g:449:4: (lv_title_3_0= ruleItems )
            {
            // InternalLPDSL.g:449:4: (lv_title_3_0= ruleItems )
            // InternalLPDSL.g:450:5: lv_title_3_0= ruleItems
            {

            					newCompositeNode(grammarAccess.getPageHeaderAccess().getTitleItemsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_title_3_0=ruleItems();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageHeaderRule());
            					}
            					add(
            						current,
            						"title",
            						lv_title_3_0,
            						"org.xtext.example.landingpagedsl.LPDSL.Items");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLPDSL.g:467:3: ( (lv_tabs_4_0= ruleTabItems ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLPDSL.g:468:4: (lv_tabs_4_0= ruleTabItems )
            	    {
            	    // InternalLPDSL.g:468:4: (lv_tabs_4_0= ruleTabItems )
            	    // InternalLPDSL.g:469:5: lv_tabs_4_0= ruleTabItems
            	    {

            	    					newCompositeNode(grammarAccess.getPageHeaderAccess().getTabsTabItemsParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_tabs_4_0=ruleTabItems();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPageHeaderRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tabs",
            	    						lv_tabs_4_0,
            	    						"org.xtext.example.landingpagedsl.LPDSL.TabItems");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPageHeaderAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePageHeader"


    // $ANTLR start "entryRuleTabItems"
    // InternalLPDSL.g:494:1: entryRuleTabItems returns [EObject current=null] : iv_ruleTabItems= ruleTabItems EOF ;
    public final EObject entryRuleTabItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabItems = null;


        try {
            // InternalLPDSL.g:494:49: (iv_ruleTabItems= ruleTabItems EOF )
            // InternalLPDSL.g:495:2: iv_ruleTabItems= ruleTabItems EOF
            {
             newCompositeNode(grammarAccess.getTabItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTabItems=ruleTabItems();

            state._fsp--;

             current =iv_ruleTabItems; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTabItems"


    // $ANTLR start "ruleTabItems"
    // InternalLPDSL.g:501:1: ruleTabItems returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) ) ;
    public final EObject ruleTabItems() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_description_2_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:507:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) ) )
            // InternalLPDSL.g:508:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) )
            {
            // InternalLPDSL.g:508:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) )
            // InternalLPDSL.g:509:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) )
            {
            // InternalLPDSL.g:509:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLPDSL.g:510:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLPDSL.g:510:4: (lv_name_0_0= RULE_ID )
            // InternalLPDSL.g:511:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTabItemsAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTabItemsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getTabItemsAccess().getColonKeyword_1());
            		
            // InternalLPDSL.g:531:3: ( (lv_description_2_0= ruleDescription ) )
            // InternalLPDSL.g:532:4: (lv_description_2_0= ruleDescription )
            {
            // InternalLPDSL.g:532:4: (lv_description_2_0= ruleDescription )
            // InternalLPDSL.g:533:5: lv_description_2_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getTabItemsAccess().getDescriptionDescriptionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_description_2_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTabItemsRule());
            					}
            					add(
            						current,
            						"description",
            						lv_description_2_0,
            						"org.xtext.example.landingpagedsl.LPDSL.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleTabItems"


    // $ANTLR start "entryRulePageBody"
    // InternalLPDSL.g:554:1: entryRulePageBody returns [EObject current=null] : iv_rulePageBody= rulePageBody EOF ;
    public final EObject entryRulePageBody() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageBody = null;


        try {
            // InternalLPDSL.g:554:49: (iv_rulePageBody= rulePageBody EOF )
            // InternalLPDSL.g:555:2: iv_rulePageBody= rulePageBody EOF
            {
             newCompositeNode(grammarAccess.getPageBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePageBody=rulePageBody();

            state._fsp--;

             current =iv_rulePageBody; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePageBody"


    // $ANTLR start "rulePageBody"
    // InternalLPDSL.g:561:1: rulePageBody returns [EObject current=null] : (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSections ) )* otherlv_4= '}' ) ;
    public final EObject rulePageBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sections_3_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:567:2: ( (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSections ) )* otherlv_4= '}' ) )
            // InternalLPDSL.g:568:2: (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSections ) )* otherlv_4= '}' )
            {
            // InternalLPDSL.g:568:2: (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSections ) )* otherlv_4= '}' )
            // InternalLPDSL.g:569:3: otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSections ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPageBodyAccess().getBodyKeyword_0());
            		
            // InternalLPDSL.g:573:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLPDSL.g:574:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLPDSL.g:574:4: (lv_name_1_0= RULE_ID )
            // InternalLPDSL.g:575:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPageBodyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPageBodyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getPageBodyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLPDSL.g:595:3: ( (lv_sections_3_0= ruleSections ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=19 && LA6_0<=20)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLPDSL.g:596:4: (lv_sections_3_0= ruleSections )
            	    {
            	    // InternalLPDSL.g:596:4: (lv_sections_3_0= ruleSections )
            	    // InternalLPDSL.g:597:5: lv_sections_3_0= ruleSections
            	    {

            	    					newCompositeNode(grammarAccess.getPageBodyAccess().getSectionsSectionsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_sections_3_0=ruleSections();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPageBodyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sections",
            	    						lv_sections_3_0,
            	    						"org.xtext.example.landingpagedsl.LPDSL.Sections");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPageBodyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePageBody"


    // $ANTLR start "entryRuleSections"
    // InternalLPDSL.g:622:1: entryRuleSections returns [EObject current=null] : iv_ruleSections= ruleSections EOF ;
    public final EObject entryRuleSections() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSections = null;


        try {
            // InternalLPDSL.g:622:49: (iv_ruleSections= ruleSections EOF )
            // InternalLPDSL.g:623:2: iv_ruleSections= ruleSections EOF
            {
             newCompositeNode(grammarAccess.getSectionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSections=ruleSections();

            state._fsp--;

             current =iv_ruleSections; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSections"


    // $ANTLR start "ruleSections"
    // InternalLPDSL.g:629:1: ruleSections returns [EObject current=null] : (this_Resume_0= ruleResume | this_AboutMe_1= ruleAboutMe ) ;
    public final EObject ruleSections() throws RecognitionException {
        EObject current = null;

        EObject this_Resume_0 = null;

        EObject this_AboutMe_1 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:635:2: ( (this_Resume_0= ruleResume | this_AboutMe_1= ruleAboutMe ) )
            // InternalLPDSL.g:636:2: (this_Resume_0= ruleResume | this_AboutMe_1= ruleAboutMe )
            {
            // InternalLPDSL.g:636:2: (this_Resume_0= ruleResume | this_AboutMe_1= ruleAboutMe )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLPDSL.g:637:3: this_Resume_0= ruleResume
                    {

                    			newCompositeNode(grammarAccess.getSectionsAccess().getResumeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Resume_0=ruleResume();

                    state._fsp--;


                    			current = this_Resume_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLPDSL.g:646:3: this_AboutMe_1= ruleAboutMe
                    {

                    			newCompositeNode(grammarAccess.getSectionsAccess().getAboutMeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AboutMe_1=ruleAboutMe();

                    state._fsp--;


                    			current = this_AboutMe_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleSections"


    // $ANTLR start "entryRuleResume"
    // InternalLPDSL.g:658:1: entryRuleResume returns [EObject current=null] : iv_ruleResume= ruleResume EOF ;
    public final EObject entryRuleResume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResume = null;


        try {
            // InternalLPDSL.g:658:47: (iv_ruleResume= ruleResume EOF )
            // InternalLPDSL.g:659:2: iv_ruleResume= ruleResume EOF
            {
             newCompositeNode(grammarAccess.getResumeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResume=ruleResume();

            state._fsp--;

             current =iv_ruleResume; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleResume"


    // $ANTLR start "ruleResume"
    // InternalLPDSL.g:665:1: ruleResume returns [EObject current=null] : (otherlv_0= 'resume' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resumeitems_3_0= ruleItems ) )* otherlv_4= '}' ) ;
    public final EObject ruleResume() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_resumeitems_3_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:671:2: ( (otherlv_0= 'resume' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resumeitems_3_0= ruleItems ) )* otherlv_4= '}' ) )
            // InternalLPDSL.g:672:2: (otherlv_0= 'resume' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resumeitems_3_0= ruleItems ) )* otherlv_4= '}' )
            {
            // InternalLPDSL.g:672:2: (otherlv_0= 'resume' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resumeitems_3_0= ruleItems ) )* otherlv_4= '}' )
            // InternalLPDSL.g:673:3: otherlv_0= 'resume' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resumeitems_3_0= ruleItems ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getResumeAccess().getResumeKeyword_0());
            		
            // InternalLPDSL.g:677:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLPDSL.g:678:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLPDSL.g:678:4: (lv_name_1_0= RULE_ID )
            // InternalLPDSL.g:679:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getResumeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResumeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getResumeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLPDSL.g:699:3: ( (lv_resumeitems_3_0= ruleItems ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLPDSL.g:700:4: (lv_resumeitems_3_0= ruleItems )
            	    {
            	    // InternalLPDSL.g:700:4: (lv_resumeitems_3_0= ruleItems )
            	    // InternalLPDSL.g:701:5: lv_resumeitems_3_0= ruleItems
            	    {

            	    					newCompositeNode(grammarAccess.getResumeAccess().getResumeitemsItemsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_resumeitems_3_0=ruleItems();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getResumeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"resumeitems",
            	    						lv_resumeitems_3_0,
            	    						"org.xtext.example.landingpagedsl.LPDSL.Items");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getResumeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleResume"


    // $ANTLR start "entryRuleItems"
    // InternalLPDSL.g:726:1: entryRuleItems returns [EObject current=null] : iv_ruleItems= ruleItems EOF ;
    public final EObject entryRuleItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItems = null;


        try {
            // InternalLPDSL.g:726:46: (iv_ruleItems= ruleItems EOF )
            // InternalLPDSL.g:727:2: iv_ruleItems= ruleItems EOF
            {
             newCompositeNode(grammarAccess.getItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItems=ruleItems();

            state._fsp--;

             current =iv_ruleItems; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleItems"


    // $ANTLR start "ruleItems"
    // InternalLPDSL.g:733:1: ruleItems returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) ) ;
    public final EObject ruleItems() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_description_2_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:739:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) ) )
            // InternalLPDSL.g:740:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) )
            {
            // InternalLPDSL.g:740:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) )
            // InternalLPDSL.g:741:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) )
            {
            // InternalLPDSL.g:741:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLPDSL.g:742:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLPDSL.g:742:4: (lv_name_0_0= RULE_ID )
            // InternalLPDSL.g:743:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getItemsAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getItemsAccess().getColonKeyword_1());
            		
            // InternalLPDSL.g:763:3: ( (lv_description_2_0= ruleDescription ) )
            // InternalLPDSL.g:764:4: (lv_description_2_0= ruleDescription )
            {
            // InternalLPDSL.g:764:4: (lv_description_2_0= ruleDescription )
            // InternalLPDSL.g:765:5: lv_description_2_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getItemsAccess().getDescriptionDescriptionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_description_2_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItemsRule());
            					}
            					add(
            						current,
            						"description",
            						lv_description_2_0,
            						"org.xtext.example.landingpagedsl.LPDSL.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleItems"


    // $ANTLR start "entryRuleDescription"
    // InternalLPDSL.g:786:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalLPDSL.g:786:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalLPDSL.g:787:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalLPDSL.g:793:1: ruleDescription returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalLPDSL.g:799:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalLPDSL.g:800:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalLPDSL.g:800:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalLPDSL.g:801:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalLPDSL.g:801:3: (lv_value_0_0= RULE_STRING )
            // InternalLPDSL.g:802:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getDescriptionAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDescriptionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleAboutMe"
    // InternalLPDSL.g:821:1: entryRuleAboutMe returns [EObject current=null] : iv_ruleAboutMe= ruleAboutMe EOF ;
    public final EObject entryRuleAboutMe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAboutMe = null;


        try {
            // InternalLPDSL.g:821:48: (iv_ruleAboutMe= ruleAboutMe EOF )
            // InternalLPDSL.g:822:2: iv_ruleAboutMe= ruleAboutMe EOF
            {
             newCompositeNode(grammarAccess.getAboutMeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAboutMe=ruleAboutMe();

            state._fsp--;

             current =iv_ruleAboutMe; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAboutMe"


    // $ANTLR start "ruleAboutMe"
    // InternalLPDSL.g:828:1: ruleAboutMe returns [EObject current=null] : (otherlv_0= 'aboutme' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_picture_3_0= rulePicture ) ) ( (lv_description_4_0= ruleItems ) ) otherlv_5= '}' ) ;
    public final EObject ruleAboutMe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_picture_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:834:2: ( (otherlv_0= 'aboutme' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_picture_3_0= rulePicture ) ) ( (lv_description_4_0= ruleItems ) ) otherlv_5= '}' ) )
            // InternalLPDSL.g:835:2: (otherlv_0= 'aboutme' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_picture_3_0= rulePicture ) ) ( (lv_description_4_0= ruleItems ) ) otherlv_5= '}' )
            {
            // InternalLPDSL.g:835:2: (otherlv_0= 'aboutme' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_picture_3_0= rulePicture ) ) ( (lv_description_4_0= ruleItems ) ) otherlv_5= '}' )
            // InternalLPDSL.g:836:3: otherlv_0= 'aboutme' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_picture_3_0= rulePicture ) ) ( (lv_description_4_0= ruleItems ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAboutMeAccess().getAboutmeKeyword_0());
            		
            // InternalLPDSL.g:840:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLPDSL.g:841:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLPDSL.g:841:4: (lv_name_1_0= RULE_ID )
            // InternalLPDSL.g:842:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAboutMeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAboutMeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAboutMeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLPDSL.g:862:3: ( (lv_picture_3_0= rulePicture ) )
            // InternalLPDSL.g:863:4: (lv_picture_3_0= rulePicture )
            {
            // InternalLPDSL.g:863:4: (lv_picture_3_0= rulePicture )
            // InternalLPDSL.g:864:5: lv_picture_3_0= rulePicture
            {

            					newCompositeNode(grammarAccess.getAboutMeAccess().getPicturePictureParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_picture_3_0=rulePicture();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAboutMeRule());
            					}
            					add(
            						current,
            						"picture",
            						lv_picture_3_0,
            						"org.xtext.example.landingpagedsl.LPDSL.Picture");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLPDSL.g:881:3: ( (lv_description_4_0= ruleItems ) )
            // InternalLPDSL.g:882:4: (lv_description_4_0= ruleItems )
            {
            // InternalLPDSL.g:882:4: (lv_description_4_0= ruleItems )
            // InternalLPDSL.g:883:5: lv_description_4_0= ruleItems
            {

            					newCompositeNode(grammarAccess.getAboutMeAccess().getDescriptionItemsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_description_4_0=ruleItems();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAboutMeRule());
            					}
            					add(
            						current,
            						"description",
            						lv_description_4_0,
            						"org.xtext.example.landingpagedsl.LPDSL.Items");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAboutMeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAboutMe"


    // $ANTLR start "entryRulePicture"
    // InternalLPDSL.g:908:1: entryRulePicture returns [EObject current=null] : iv_rulePicture= rulePicture EOF ;
    public final EObject entryRulePicture() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePicture = null;


        try {
            // InternalLPDSL.g:908:48: (iv_rulePicture= rulePicture EOF )
            // InternalLPDSL.g:909:2: iv_rulePicture= rulePicture EOF
            {
             newCompositeNode(grammarAccess.getPictureRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePicture=rulePicture();

            state._fsp--;

             current =iv_rulePicture; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePicture"


    // $ANTLR start "rulePicture"
    // InternalLPDSL.g:915:1: rulePicture returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_imagepath_2_0= ruleImagePath ) ) ) ;
    public final EObject rulePicture() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_imagepath_2_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:921:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_imagepath_2_0= ruleImagePath ) ) ) )
            // InternalLPDSL.g:922:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_imagepath_2_0= ruleImagePath ) ) )
            {
            // InternalLPDSL.g:922:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_imagepath_2_0= ruleImagePath ) ) )
            // InternalLPDSL.g:923:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_imagepath_2_0= ruleImagePath ) )
            {
            // InternalLPDSL.g:923:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLPDSL.g:924:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLPDSL.g:924:4: (lv_name_0_0= RULE_ID )
            // InternalLPDSL.g:925:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPictureAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPictureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getPictureAccess().getColonKeyword_1());
            		
            // InternalLPDSL.g:945:3: ( (lv_imagepath_2_0= ruleImagePath ) )
            // InternalLPDSL.g:946:4: (lv_imagepath_2_0= ruleImagePath )
            {
            // InternalLPDSL.g:946:4: (lv_imagepath_2_0= ruleImagePath )
            // InternalLPDSL.g:947:5: lv_imagepath_2_0= ruleImagePath
            {

            					newCompositeNode(grammarAccess.getPictureAccess().getImagepathImagePathParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_imagepath_2_0=ruleImagePath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPictureRule());
            					}
            					add(
            						current,
            						"imagepath",
            						lv_imagepath_2_0,
            						"org.xtext.example.landingpagedsl.LPDSL.ImagePath");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "rulePicture"


    // $ANTLR start "entryRuleImagePath"
    // InternalLPDSL.g:968:1: entryRuleImagePath returns [EObject current=null] : iv_ruleImagePath= ruleImagePath EOF ;
    public final EObject entryRuleImagePath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImagePath = null;


        try {
            // InternalLPDSL.g:968:50: (iv_ruleImagePath= ruleImagePath EOF )
            // InternalLPDSL.g:969:2: iv_ruleImagePath= ruleImagePath EOF
            {
             newCompositeNode(grammarAccess.getImagePathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImagePath=ruleImagePath();

            state._fsp--;

             current =iv_ruleImagePath; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImagePath"


    // $ANTLR start "ruleImagePath"
    // InternalLPDSL.g:975:1: ruleImagePath returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleImagePath() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalLPDSL.g:981:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalLPDSL.g:982:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalLPDSL.g:982:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalLPDSL.g:983:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalLPDSL.g:983:3: (lv_value_0_0= RULE_STRING )
            // InternalLPDSL.g:984:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getImagePathAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getImagePathRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


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
    // $ANTLR end "ruleImagePath"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000060802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000182000L});

}