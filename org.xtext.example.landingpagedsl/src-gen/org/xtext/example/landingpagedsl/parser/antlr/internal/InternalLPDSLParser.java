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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'footer'", "'{'", "'}'", "'link'", "':'", "'http://www.'", "'https://www.'", "'www.'", "'.'", "'/'", "'header'", "'body'", "'resume'", "'aboutme'", "'jpg'", "'JPG'", "'jpeg'", "'JPEG'", "'png'", "'PNG'"
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
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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

                if ( (LA1_0==11||(LA1_0>=21 && LA1_0<=22)) ) {
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
            case 21:
                {
                alt2=1;
                }
                break;
            case 22:
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
        AntlrDatatypeRuleToken lv_path_2_0 = null;



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
    // InternalLPDSL.g:360:1: entryRuleQualifiedPath returns [String current=null] : iv_ruleQualifiedPath= ruleQualifiedPath EOF ;
    public final String entryRuleQualifiedPath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedPath = null;


        try {
            // InternalLPDSL.g:360:53: (iv_ruleQualifiedPath= ruleQualifiedPath EOF )
            // InternalLPDSL.g:361:2: iv_ruleQualifiedPath= ruleQualifiedPath EOF
            {
             newCompositeNode(grammarAccess.getQualifiedPathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedPath=ruleQualifiedPath();

            state._fsp--;

             current =iv_ruleQualifiedPath.getText(); 
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
    // InternalLPDSL.g:367:1: ruleQualifiedPath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'http://www.' | kw= 'https://www.' | kw= 'www.' )? this_ID_3= RULE_ID (kw= '.' this_ID_5= RULE_ID )* (kw= '/' this_ID_7= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedPath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        Token this_ID_5=null;
        Token this_ID_7=null;


        	enterRule();

        try {
            // InternalLPDSL.g:373:2: ( ( (kw= 'http://www.' | kw= 'https://www.' | kw= 'www.' )? this_ID_3= RULE_ID (kw= '.' this_ID_5= RULE_ID )* (kw= '/' this_ID_7= RULE_ID )* ) )
            // InternalLPDSL.g:374:2: ( (kw= 'http://www.' | kw= 'https://www.' | kw= 'www.' )? this_ID_3= RULE_ID (kw= '.' this_ID_5= RULE_ID )* (kw= '/' this_ID_7= RULE_ID )* )
            {
            // InternalLPDSL.g:374:2: ( (kw= 'http://www.' | kw= 'https://www.' | kw= 'www.' )? this_ID_3= RULE_ID (kw= '.' this_ID_5= RULE_ID )* (kw= '/' this_ID_7= RULE_ID )* )
            // InternalLPDSL.g:375:3: (kw= 'http://www.' | kw= 'https://www.' | kw= 'www.' )? this_ID_3= RULE_ID (kw= '.' this_ID_5= RULE_ID )* (kw= '/' this_ID_7= RULE_ID )*
            {
            // InternalLPDSL.g:375:3: (kw= 'http://www.' | kw= 'https://www.' | kw= 'www.' )?
            int alt4=4;
            switch ( input.LA(1) ) {
                case 16:
                    {
                    alt4=1;
                    }
                    break;
                case 17:
                    {
                    alt4=2;
                    }
                    break;
                case 18:
                    {
                    alt4=3;
                    }
                    break;
            }

            switch (alt4) {
                case 1 :
                    // InternalLPDSL.g:376:4: kw= 'http://www.'
                    {
                    kw=(Token)match(input,16,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedPathAccess().getHttpWwwKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLPDSL.g:382:4: kw= 'https://www.'
                    {
                    kw=(Token)match(input,17,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedPathAccess().getHttpsWwwKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalLPDSL.g:388:4: kw= 'www.'
                    {
                    kw=(Token)match(input,18,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedPathAccess().getWwwKeyword_0_2());
                    			

                    }
                    break;

            }

            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_10); 

            			current.merge(this_ID_3);
            		

            			newLeafNode(this_ID_3, grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_1());
            		
            // InternalLPDSL.g:401:3: (kw= '.' this_ID_5= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLPDSL.g:402:4: kw= '.' this_ID_5= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedPathAccess().getFullStopKeyword_2_0());
            	    			
            	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    				current.merge(this_ID_5);
            	    			

            	    				newLeafNode(this_ID_5, grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalLPDSL.g:415:3: (kw= '/' this_ID_7= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLPDSL.g:416:4: kw= '/' this_ID_7= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedPathAccess().getSolidusKeyword_3_0());
            	    			
            	    this_ID_7=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    				current.merge(this_ID_7);
            	    			

            	    				newLeafNode(this_ID_7, grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalLPDSL.g:433:1: entryRulePageHeader returns [EObject current=null] : iv_rulePageHeader= rulePageHeader EOF ;
    public final EObject entryRulePageHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageHeader = null;


        try {
            // InternalLPDSL.g:433:51: (iv_rulePageHeader= rulePageHeader EOF )
            // InternalLPDSL.g:434:2: iv_rulePageHeader= rulePageHeader EOF
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
    // InternalLPDSL.g:440:1: rulePageHeader returns [EObject current=null] : (otherlv_0= 'header' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleItems ) ) ( (lv_tabs_4_0= ruleTabItems ) )* otherlv_5= '}' ) ;
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
            // InternalLPDSL.g:446:2: ( (otherlv_0= 'header' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleItems ) ) ( (lv_tabs_4_0= ruleTabItems ) )* otherlv_5= '}' ) )
            // InternalLPDSL.g:447:2: (otherlv_0= 'header' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleItems ) ) ( (lv_tabs_4_0= ruleTabItems ) )* otherlv_5= '}' )
            {
            // InternalLPDSL.g:447:2: (otherlv_0= 'header' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleItems ) ) ( (lv_tabs_4_0= ruleTabItems ) )* otherlv_5= '}' )
            // InternalLPDSL.g:448:3: otherlv_0= 'header' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleItems ) ) ( (lv_tabs_4_0= ruleTabItems ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPageHeaderAccess().getHeaderKeyword_0());
            		
            // InternalLPDSL.g:452:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLPDSL.g:453:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLPDSL.g:453:4: (lv_name_1_0= RULE_ID )
            // InternalLPDSL.g:454:5: lv_name_1_0= RULE_ID
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
            		
            // InternalLPDSL.g:474:3: ( (lv_title_3_0= ruleItems ) )
            // InternalLPDSL.g:475:4: (lv_title_3_0= ruleItems )
            {
            // InternalLPDSL.g:475:4: (lv_title_3_0= ruleItems )
            // InternalLPDSL.g:476:5: lv_title_3_0= ruleItems
            {

            					newCompositeNode(grammarAccess.getPageHeaderAccess().getTitleItemsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalLPDSL.g:493:3: ( (lv_tabs_4_0= ruleTabItems ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLPDSL.g:494:4: (lv_tabs_4_0= ruleTabItems )
            	    {
            	    // InternalLPDSL.g:494:4: (lv_tabs_4_0= ruleTabItems )
            	    // InternalLPDSL.g:495:5: lv_tabs_4_0= ruleTabItems
            	    {

            	    					newCompositeNode(grammarAccess.getPageHeaderAccess().getTabsTabItemsParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    break loop7;
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
    // InternalLPDSL.g:520:1: entryRuleTabItems returns [EObject current=null] : iv_ruleTabItems= ruleTabItems EOF ;
    public final EObject entryRuleTabItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabItems = null;


        try {
            // InternalLPDSL.g:520:49: (iv_ruleTabItems= ruleTabItems EOF )
            // InternalLPDSL.g:521:2: iv_ruleTabItems= ruleTabItems EOF
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
    // InternalLPDSL.g:527:1: ruleTabItems returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) ) ;
    public final EObject ruleTabItems() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_description_2_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:533:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) ) )
            // InternalLPDSL.g:534:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) )
            {
            // InternalLPDSL.g:534:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) )
            // InternalLPDSL.g:535:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) )
            {
            // InternalLPDSL.g:535:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLPDSL.g:536:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLPDSL.g:536:4: (lv_name_0_0= RULE_ID )
            // InternalLPDSL.g:537:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getTabItemsAccess().getColonKeyword_1());
            		
            // InternalLPDSL.g:557:3: ( (lv_description_2_0= ruleDescription ) )
            // InternalLPDSL.g:558:4: (lv_description_2_0= ruleDescription )
            {
            // InternalLPDSL.g:558:4: (lv_description_2_0= ruleDescription )
            // InternalLPDSL.g:559:5: lv_description_2_0= ruleDescription
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
    // InternalLPDSL.g:580:1: entryRulePageBody returns [EObject current=null] : iv_rulePageBody= rulePageBody EOF ;
    public final EObject entryRulePageBody() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageBody = null;


        try {
            // InternalLPDSL.g:580:49: (iv_rulePageBody= rulePageBody EOF )
            // InternalLPDSL.g:581:2: iv_rulePageBody= rulePageBody EOF
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
    // InternalLPDSL.g:587:1: rulePageBody returns [EObject current=null] : (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSections ) )* otherlv_4= '}' ) ;
    public final EObject rulePageBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sections_3_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:593:2: ( (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSections ) )* otherlv_4= '}' ) )
            // InternalLPDSL.g:594:2: (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSections ) )* otherlv_4= '}' )
            {
            // InternalLPDSL.g:594:2: (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSections ) )* otherlv_4= '}' )
            // InternalLPDSL.g:595:3: otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSections ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPageBodyAccess().getBodyKeyword_0());
            		
            // InternalLPDSL.g:599:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLPDSL.g:600:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLPDSL.g:600:4: (lv_name_1_0= RULE_ID )
            // InternalLPDSL.g:601:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getPageBodyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLPDSL.g:621:3: ( (lv_sections_3_0= ruleSections ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=23 && LA8_0<=24)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLPDSL.g:622:4: (lv_sections_3_0= ruleSections )
            	    {
            	    // InternalLPDSL.g:622:4: (lv_sections_3_0= ruleSections )
            	    // InternalLPDSL.g:623:5: lv_sections_3_0= ruleSections
            	    {

            	    					newCompositeNode(grammarAccess.getPageBodyAccess().getSectionsSectionsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
            	    break loop8;
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
    // InternalLPDSL.g:648:1: entryRuleSections returns [EObject current=null] : iv_ruleSections= ruleSections EOF ;
    public final EObject entryRuleSections() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSections = null;


        try {
            // InternalLPDSL.g:648:49: (iv_ruleSections= ruleSections EOF )
            // InternalLPDSL.g:649:2: iv_ruleSections= ruleSections EOF
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
    // InternalLPDSL.g:655:1: ruleSections returns [EObject current=null] : (this_Resume_0= ruleResume | this_AboutMe_1= ruleAboutMe ) ;
    public final EObject ruleSections() throws RecognitionException {
        EObject current = null;

        EObject this_Resume_0 = null;

        EObject this_AboutMe_1 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:661:2: ( (this_Resume_0= ruleResume | this_AboutMe_1= ruleAboutMe ) )
            // InternalLPDSL.g:662:2: (this_Resume_0= ruleResume | this_AboutMe_1= ruleAboutMe )
            {
            // InternalLPDSL.g:662:2: (this_Resume_0= ruleResume | this_AboutMe_1= ruleAboutMe )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalLPDSL.g:663:3: this_Resume_0= ruleResume
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
                    // InternalLPDSL.g:672:3: this_AboutMe_1= ruleAboutMe
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
    // InternalLPDSL.g:684:1: entryRuleResume returns [EObject current=null] : iv_ruleResume= ruleResume EOF ;
    public final EObject entryRuleResume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResume = null;


        try {
            // InternalLPDSL.g:684:47: (iv_ruleResume= ruleResume EOF )
            // InternalLPDSL.g:685:2: iv_ruleResume= ruleResume EOF
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
    // InternalLPDSL.g:691:1: ruleResume returns [EObject current=null] : (otherlv_0= 'resume' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resumeitems_3_0= ruleItems ) )* otherlv_4= '}' ) ;
    public final EObject ruleResume() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_resumeitems_3_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:697:2: ( (otherlv_0= 'resume' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resumeitems_3_0= ruleItems ) )* otherlv_4= '}' ) )
            // InternalLPDSL.g:698:2: (otherlv_0= 'resume' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resumeitems_3_0= ruleItems ) )* otherlv_4= '}' )
            {
            // InternalLPDSL.g:698:2: (otherlv_0= 'resume' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resumeitems_3_0= ruleItems ) )* otherlv_4= '}' )
            // InternalLPDSL.g:699:3: otherlv_0= 'resume' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resumeitems_3_0= ruleItems ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getResumeAccess().getResumeKeyword_0());
            		
            // InternalLPDSL.g:703:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLPDSL.g:704:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLPDSL.g:704:4: (lv_name_1_0= RULE_ID )
            // InternalLPDSL.g:705:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getResumeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLPDSL.g:725:3: ( (lv_resumeitems_3_0= ruleItems ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLPDSL.g:726:4: (lv_resumeitems_3_0= ruleItems )
            	    {
            	    // InternalLPDSL.g:726:4: (lv_resumeitems_3_0= ruleItems )
            	    // InternalLPDSL.g:727:5: lv_resumeitems_3_0= ruleItems
            	    {

            	    					newCompositeNode(grammarAccess.getResumeAccess().getResumeitemsItemsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    break loop10;
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
    // InternalLPDSL.g:752:1: entryRuleItems returns [EObject current=null] : iv_ruleItems= ruleItems EOF ;
    public final EObject entryRuleItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItems = null;


        try {
            // InternalLPDSL.g:752:46: (iv_ruleItems= ruleItems EOF )
            // InternalLPDSL.g:753:2: iv_ruleItems= ruleItems EOF
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
    // InternalLPDSL.g:759:1: ruleItems returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) ) ;
    public final EObject ruleItems() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_description_2_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:765:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) ) )
            // InternalLPDSL.g:766:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) )
            {
            // InternalLPDSL.g:766:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) )
            // InternalLPDSL.g:767:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) )
            {
            // InternalLPDSL.g:767:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLPDSL.g:768:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLPDSL.g:768:4: (lv_name_0_0= RULE_ID )
            // InternalLPDSL.g:769:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getItemsAccess().getColonKeyword_1());
            		
            // InternalLPDSL.g:789:3: ( (lv_description_2_0= ruleDescription ) )
            // InternalLPDSL.g:790:4: (lv_description_2_0= ruleDescription )
            {
            // InternalLPDSL.g:790:4: (lv_description_2_0= ruleDescription )
            // InternalLPDSL.g:791:5: lv_description_2_0= ruleDescription
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
    // InternalLPDSL.g:812:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalLPDSL.g:812:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalLPDSL.g:813:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalLPDSL.g:819:1: ruleDescription returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalLPDSL.g:825:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalLPDSL.g:826:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalLPDSL.g:826:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalLPDSL.g:827:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalLPDSL.g:827:3: (lv_value_0_0= RULE_STRING )
            // InternalLPDSL.g:828:4: lv_value_0_0= RULE_STRING
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
    // InternalLPDSL.g:847:1: entryRuleAboutMe returns [EObject current=null] : iv_ruleAboutMe= ruleAboutMe EOF ;
    public final EObject entryRuleAboutMe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAboutMe = null;


        try {
            // InternalLPDSL.g:847:48: (iv_ruleAboutMe= ruleAboutMe EOF )
            // InternalLPDSL.g:848:2: iv_ruleAboutMe= ruleAboutMe EOF
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
    // InternalLPDSL.g:854:1: ruleAboutMe returns [EObject current=null] : (otherlv_0= 'aboutme' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_picture_3_0= rulePicture ) ) ( (lv_description_4_0= ruleItems ) ) otherlv_5= '}' ) ;
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
            // InternalLPDSL.g:860:2: ( (otherlv_0= 'aboutme' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_picture_3_0= rulePicture ) ) ( (lv_description_4_0= ruleItems ) ) otherlv_5= '}' ) )
            // InternalLPDSL.g:861:2: (otherlv_0= 'aboutme' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_picture_3_0= rulePicture ) ) ( (lv_description_4_0= ruleItems ) ) otherlv_5= '}' )
            {
            // InternalLPDSL.g:861:2: (otherlv_0= 'aboutme' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_picture_3_0= rulePicture ) ) ( (lv_description_4_0= ruleItems ) ) otherlv_5= '}' )
            // InternalLPDSL.g:862:3: otherlv_0= 'aboutme' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_picture_3_0= rulePicture ) ) ( (lv_description_4_0= ruleItems ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAboutMeAccess().getAboutmeKeyword_0());
            		
            // InternalLPDSL.g:866:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLPDSL.g:867:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLPDSL.g:867:4: (lv_name_1_0= RULE_ID )
            // InternalLPDSL.g:868:5: lv_name_1_0= RULE_ID
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
            		
            // InternalLPDSL.g:888:3: ( (lv_picture_3_0= rulePicture ) )
            // InternalLPDSL.g:889:4: (lv_picture_3_0= rulePicture )
            {
            // InternalLPDSL.g:889:4: (lv_picture_3_0= rulePicture )
            // InternalLPDSL.g:890:5: lv_picture_3_0= rulePicture
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

            // InternalLPDSL.g:907:3: ( (lv_description_4_0= ruleItems ) )
            // InternalLPDSL.g:908:4: (lv_description_4_0= ruleItems )
            {
            // InternalLPDSL.g:908:4: (lv_description_4_0= ruleItems )
            // InternalLPDSL.g:909:5: lv_description_4_0= ruleItems
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
    // InternalLPDSL.g:934:1: entryRulePicture returns [EObject current=null] : iv_rulePicture= rulePicture EOF ;
    public final EObject entryRulePicture() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePicture = null;


        try {
            // InternalLPDSL.g:934:48: (iv_rulePicture= rulePicture EOF )
            // InternalLPDSL.g:935:2: iv_rulePicture= rulePicture EOF
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
    // InternalLPDSL.g:941:1: rulePicture returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_imagepath_2_0= ruleImagePath ) ) ) ;
    public final EObject rulePicture() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_imagepath_2_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:947:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_imagepath_2_0= ruleImagePath ) ) ) )
            // InternalLPDSL.g:948:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_imagepath_2_0= ruleImagePath ) ) )
            {
            // InternalLPDSL.g:948:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_imagepath_2_0= ruleImagePath ) ) )
            // InternalLPDSL.g:949:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_imagepath_2_0= ruleImagePath ) )
            {
            // InternalLPDSL.g:949:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLPDSL.g:950:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLPDSL.g:950:4: (lv_name_0_0= RULE_ID )
            // InternalLPDSL.g:951:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPictureAccess().getColonKeyword_1());
            		
            // InternalLPDSL.g:971:3: ( (lv_imagepath_2_0= ruleImagePath ) )
            // InternalLPDSL.g:972:4: (lv_imagepath_2_0= ruleImagePath )
            {
            // InternalLPDSL.g:972:4: (lv_imagepath_2_0= ruleImagePath )
            // InternalLPDSL.g:973:5: lv_imagepath_2_0= ruleImagePath
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
    // InternalLPDSL.g:994:1: entryRuleImagePath returns [String current=null] : iv_ruleImagePath= ruleImagePath EOF ;
    public final String entryRuleImagePath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImagePath = null;


        try {
            // InternalLPDSL.g:994:49: (iv_ruleImagePath= ruleImagePath EOF )
            // InternalLPDSL.g:995:2: iv_ruleImagePath= ruleImagePath EOF
            {
             newCompositeNode(grammarAccess.getImagePathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImagePath=ruleImagePath();

            state._fsp--;

             current =iv_ruleImagePath.getText(); 
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
    // InternalLPDSL.g:1001:1: ruleImagePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* kw= '.' (kw= 'jpg' | kw= 'JPG' | kw= 'jpeg' | kw= 'JPEG' | kw= 'png' | kw= 'PNG' ) ) ;
    public final AntlrDatatypeRuleToken ruleImagePath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalLPDSL.g:1007:2: ( (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* kw= '.' (kw= 'jpg' | kw= 'JPG' | kw= 'jpeg' | kw= 'JPEG' | kw= 'png' | kw= 'PNG' ) ) )
            // InternalLPDSL.g:1008:2: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* kw= '.' (kw= 'jpg' | kw= 'JPG' | kw= 'jpeg' | kw= 'JPEG' | kw= 'png' | kw= 'PNG' ) )
            {
            // InternalLPDSL.g:1008:2: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* kw= '.' (kw= 'jpg' | kw= 'JPG' | kw= 'jpeg' | kw= 'JPEG' | kw= 'png' | kw= 'PNG' ) )
            // InternalLPDSL.g:1009:3: this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* kw= '.' (kw= 'jpg' | kw= 'JPG' | kw= 'jpeg' | kw= 'JPEG' | kw= 'png' | kw= 'PNG' )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getImagePathAccess().getIDTerminalRuleCall_0());
            		
            // InternalLPDSL.g:1016:3: (kw= '/' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLPDSL.g:1017:4: kw= '/' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getImagePathAccess().getSolidusKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getImagePathAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            kw=(Token)match(input,19,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getImagePathAccess().getFullStopKeyword_2());
            		
            // InternalLPDSL.g:1035:3: (kw= 'jpg' | kw= 'JPG' | kw= 'jpeg' | kw= 'JPEG' | kw= 'png' | kw= 'PNG' )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 27:
                {
                alt12=3;
                }
                break;
            case 28:
                {
                alt12=4;
                }
                break;
            case 29:
                {
                alt12=5;
                }
                break;
            case 30:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalLPDSL.g:1036:4: kw= 'jpg'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getImagePathAccess().getJpgKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLPDSL.g:1042:4: kw= 'JPG'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getImagePathAccess().getJPGKeyword_3_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalLPDSL.g:1048:4: kw= 'jpeg'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getImagePathAccess().getJpegKeyword_3_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalLPDSL.g:1054:4: kw= 'JPEG'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getImagePathAccess().getJPEGKeyword_3_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalLPDSL.g:1060:4: kw= 'png'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getImagePathAccess().getPngKeyword_3_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalLPDSL.g:1066:4: kw= 'PNG'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getImagePathAccess().getPNGKeyword_3_5());
                    			

                    }
                    break;

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000600802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000070010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001802000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000007E000000L});

}