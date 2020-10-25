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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'carousel'", "'{'", "'}'", "'footer'", "'link'", "':'", "'.'", "'header'", "'body'", "'links'", "'contactinfo'", "'resume'", "'aboutme'"
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
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
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

                if ( (LA1_0==14||(LA1_0>=18 && LA1_0<=19)) ) {
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
            case 18:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 14:
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


    // $ANTLR start "entryRulePictureCarousel"
    // InternalLPDSL.g:145:1: entryRulePictureCarousel returns [EObject current=null] : iv_rulePictureCarousel= rulePictureCarousel EOF ;
    public final EObject entryRulePictureCarousel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePictureCarousel = null;


        try {
            // InternalLPDSL.g:145:56: (iv_rulePictureCarousel= rulePictureCarousel EOF )
            // InternalLPDSL.g:146:2: iv_rulePictureCarousel= rulePictureCarousel EOF
            {
             newCompositeNode(grammarAccess.getPictureCarouselRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePictureCarousel=rulePictureCarousel();

            state._fsp--;

             current =iv_rulePictureCarousel; 
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
    // $ANTLR end "entryRulePictureCarousel"


    // $ANTLR start "rulePictureCarousel"
    // InternalLPDSL.g:152:1: rulePictureCarousel returns [EObject current=null] : (otherlv_0= 'carousel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_timer_3_0= ruleTimeSpecifier ) ) ( (lv_picture_4_0= rulePicture ) )* otherlv_5= '}' ) ;
    public final EObject rulePictureCarousel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_timer_3_0 = null;

        EObject lv_picture_4_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:158:2: ( (otherlv_0= 'carousel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_timer_3_0= ruleTimeSpecifier ) ) ( (lv_picture_4_0= rulePicture ) )* otherlv_5= '}' ) )
            // InternalLPDSL.g:159:2: (otherlv_0= 'carousel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_timer_3_0= ruleTimeSpecifier ) ) ( (lv_picture_4_0= rulePicture ) )* otherlv_5= '}' )
            {
            // InternalLPDSL.g:159:2: (otherlv_0= 'carousel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_timer_3_0= ruleTimeSpecifier ) ) ( (lv_picture_4_0= rulePicture ) )* otherlv_5= '}' )
            // InternalLPDSL.g:160:3: otherlv_0= 'carousel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_timer_3_0= ruleTimeSpecifier ) ) ( (lv_picture_4_0= rulePicture ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPictureCarouselAccess().getCarouselKeyword_0());
            		
            // InternalLPDSL.g:164:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLPDSL.g:165:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLPDSL.g:165:4: (lv_name_1_0= RULE_ID )
            // InternalLPDSL.g:166:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPictureCarouselAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPictureCarouselRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPictureCarouselAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLPDSL.g:186:3: ( (lv_timer_3_0= ruleTimeSpecifier ) )
            // InternalLPDSL.g:187:4: (lv_timer_3_0= ruleTimeSpecifier )
            {
            // InternalLPDSL.g:187:4: (lv_timer_3_0= ruleTimeSpecifier )
            // InternalLPDSL.g:188:5: lv_timer_3_0= ruleTimeSpecifier
            {

            					newCompositeNode(grammarAccess.getPictureCarouselAccess().getTimerTimeSpecifierParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_timer_3_0=ruleTimeSpecifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPictureCarouselRule());
            					}
            					add(
            						current,
            						"timer",
            						lv_timer_3_0,
            						"org.xtext.example.landingpagedsl.LPDSL.TimeSpecifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLPDSL.g:205:3: ( (lv_picture_4_0= rulePicture ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLPDSL.g:206:4: (lv_picture_4_0= rulePicture )
            	    {
            	    // InternalLPDSL.g:206:4: (lv_picture_4_0= rulePicture )
            	    // InternalLPDSL.g:207:5: lv_picture_4_0= rulePicture
            	    {

            	    					newCompositeNode(grammarAccess.getPictureCarouselAccess().getPicturePictureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_picture_4_0=rulePicture();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPictureCarouselRule());
            	    					}
            	    					add(
            	    						current,
            	    						"picture",
            	    						lv_picture_4_0,
            	    						"org.xtext.example.landingpagedsl.LPDSL.Picture");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPictureCarouselAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePictureCarousel"


    // $ANTLR start "entryRulePageFooter"
    // InternalLPDSL.g:232:1: entryRulePageFooter returns [EObject current=null] : iv_rulePageFooter= rulePageFooter EOF ;
    public final EObject entryRulePageFooter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageFooter = null;


        try {
            // InternalLPDSL.g:232:51: (iv_rulePageFooter= rulePageFooter EOF )
            // InternalLPDSL.g:233:2: iv_rulePageFooter= rulePageFooter EOF
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
    // InternalLPDSL.g:239:1: rulePageFooter returns [EObject current=null] : (otherlv_0= 'footer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleLinkItem ) )* otherlv_4= '}' ) ;
    public final EObject rulePageFooter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_links_3_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:245:2: ( (otherlv_0= 'footer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleLinkItem ) )* otherlv_4= '}' ) )
            // InternalLPDSL.g:246:2: (otherlv_0= 'footer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleLinkItem ) )* otherlv_4= '}' )
            {
            // InternalLPDSL.g:246:2: (otherlv_0= 'footer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleLinkItem ) )* otherlv_4= '}' )
            // InternalLPDSL.g:247:3: otherlv_0= 'footer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleLinkItem ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPageFooterAccess().getFooterKeyword_0());
            		
            // InternalLPDSL.g:251:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLPDSL.g:252:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLPDSL.g:252:4: (lv_name_1_0= RULE_ID )
            // InternalLPDSL.g:253:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPageFooterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLPDSL.g:273:3: ( (lv_links_3_0= ruleLinkItem ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLPDSL.g:274:4: (lv_links_3_0= ruleLinkItem )
            	    {
            	    // InternalLPDSL.g:274:4: (lv_links_3_0= ruleLinkItem )
            	    // InternalLPDSL.g:275:5: lv_links_3_0= ruleLinkItem
            	    {

            	    					newCompositeNode(grammarAccess.getPageFooterAccess().getLinksLinkItemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
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
            	    break loop4;
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
    // InternalLPDSL.g:300:1: entryRuleLinkItem returns [EObject current=null] : iv_ruleLinkItem= ruleLinkItem EOF ;
    public final EObject entryRuleLinkItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkItem = null;


        try {
            // InternalLPDSL.g:300:49: (iv_ruleLinkItem= ruleLinkItem EOF )
            // InternalLPDSL.g:301:2: iv_ruleLinkItem= ruleLinkItem EOF
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
    // InternalLPDSL.g:307:1: ruleLinkItem returns [EObject current=null] : (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= ruleItems ) ) ( (lv_link_4_0= ruleURL ) ) otherlv_5= '}' ) ;
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
            // InternalLPDSL.g:313:2: ( (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= ruleItems ) ) ( (lv_link_4_0= ruleURL ) ) otherlv_5= '}' ) )
            // InternalLPDSL.g:314:2: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= ruleItems ) ) ( (lv_link_4_0= ruleURL ) ) otherlv_5= '}' )
            {
            // InternalLPDSL.g:314:2: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= ruleItems ) ) ( (lv_link_4_0= ruleURL ) ) otherlv_5= '}' )
            // InternalLPDSL.g:315:3: otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= ruleItems ) ) ( (lv_link_4_0= ruleURL ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkItemAccess().getLinkKeyword_0());
            		
            // InternalLPDSL.g:319:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLPDSL.g:320:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLPDSL.g:320:4: (lv_name_1_0= RULE_ID )
            // InternalLPDSL.g:321:5: lv_name_1_0= RULE_ID
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
            		
            // InternalLPDSL.g:341:3: ( (lv_text_3_0= ruleItems ) )
            // InternalLPDSL.g:342:4: (lv_text_3_0= ruleItems )
            {
            // InternalLPDSL.g:342:4: (lv_text_3_0= ruleItems )
            // InternalLPDSL.g:343:5: lv_text_3_0= ruleItems
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

            // InternalLPDSL.g:360:3: ( (lv_link_4_0= ruleURL ) )
            // InternalLPDSL.g:361:4: (lv_link_4_0= ruleURL )
            {
            // InternalLPDSL.g:361:4: (lv_link_4_0= ruleURL )
            // InternalLPDSL.g:362:5: lv_link_4_0= ruleURL
            {

            					newCompositeNode(grammarAccess.getLinkItemAccess().getLinkURLParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
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
    // InternalLPDSL.g:387:1: entryRuleURL returns [EObject current=null] : iv_ruleURL= ruleURL EOF ;
    public final EObject entryRuleURL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURL = null;


        try {
            // InternalLPDSL.g:387:44: (iv_ruleURL= ruleURL EOF )
            // InternalLPDSL.g:388:2: iv_ruleURL= ruleURL EOF
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
    // InternalLPDSL.g:394:1: ruleURL returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_path_2_0= ruleQualifiedPath ) ) ) ;
    public final EObject ruleURL() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:400:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_path_2_0= ruleQualifiedPath ) ) ) )
            // InternalLPDSL.g:401:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_path_2_0= ruleQualifiedPath ) ) )
            {
            // InternalLPDSL.g:401:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_path_2_0= ruleQualifiedPath ) ) )
            // InternalLPDSL.g:402:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_path_2_0= ruleQualifiedPath ) )
            {
            // InternalLPDSL.g:402:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLPDSL.g:403:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLPDSL.g:403:4: (lv_name_0_0= RULE_ID )
            // InternalLPDSL.g:404:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getURLAccess().getColonKeyword_1());
            		
            // InternalLPDSL.g:424:3: ( (lv_path_2_0= ruleQualifiedPath ) )
            // InternalLPDSL.g:425:4: (lv_path_2_0= ruleQualifiedPath )
            {
            // InternalLPDSL.g:425:4: (lv_path_2_0= ruleQualifiedPath )
            // InternalLPDSL.g:426:5: lv_path_2_0= ruleQualifiedPath
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
    // InternalLPDSL.g:447:1: entryRuleQualifiedPath returns [EObject current=null] : iv_ruleQualifiedPath= ruleQualifiedPath EOF ;
    public final EObject entryRuleQualifiedPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedPath = null;


        try {
            // InternalLPDSL.g:447:54: (iv_ruleQualifiedPath= ruleQualifiedPath EOF )
            // InternalLPDSL.g:448:2: iv_ruleQualifiedPath= ruleQualifiedPath EOF
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
    // InternalLPDSL.g:454:1: ruleQualifiedPath returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) (otherlv_1= '.' this_STRING_2= RULE_STRING )* ) ;
    public final EObject ruleQualifiedPath() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalLPDSL.g:460:2: ( ( ( (lv_value_0_0= RULE_STRING ) ) (otherlv_1= '.' this_STRING_2= RULE_STRING )* ) )
            // InternalLPDSL.g:461:2: ( ( (lv_value_0_0= RULE_STRING ) ) (otherlv_1= '.' this_STRING_2= RULE_STRING )* )
            {
            // InternalLPDSL.g:461:2: ( ( (lv_value_0_0= RULE_STRING ) ) (otherlv_1= '.' this_STRING_2= RULE_STRING )* )
            // InternalLPDSL.g:462:3: ( (lv_value_0_0= RULE_STRING ) ) (otherlv_1= '.' this_STRING_2= RULE_STRING )*
            {
            // InternalLPDSL.g:462:3: ( (lv_value_0_0= RULE_STRING ) )
            // InternalLPDSL.g:463:4: (lv_value_0_0= RULE_STRING )
            {
            // InternalLPDSL.g:463:4: (lv_value_0_0= RULE_STRING )
            // InternalLPDSL.g:464:5: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            // InternalLPDSL.g:480:3: (otherlv_1= '.' this_STRING_2= RULE_STRING )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLPDSL.g:481:4: otherlv_1= '.' this_STRING_2= RULE_STRING
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_10); 

            	    				newLeafNode(otherlv_1, grammarAccess.getQualifiedPathAccess().getFullStopKeyword_1_0());
            	    			
            	    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    				newLeafNode(this_STRING_2, grammarAccess.getQualifiedPathAccess().getSTRINGTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalLPDSL.g:494:1: entryRulePageHeader returns [EObject current=null] : iv_rulePageHeader= rulePageHeader EOF ;
    public final EObject entryRulePageHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageHeader = null;


        try {
            // InternalLPDSL.g:494:51: (iv_rulePageHeader= rulePageHeader EOF )
            // InternalLPDSL.g:495:2: iv_rulePageHeader= rulePageHeader EOF
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
    // InternalLPDSL.g:501:1: rulePageHeader returns [EObject current=null] : (otherlv_0= 'header' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleItems ) ) ( (lv_tabs_4_0= ruleTabItems ) )* otherlv_5= '}' ) ;
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
            // InternalLPDSL.g:507:2: ( (otherlv_0= 'header' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleItems ) ) ( (lv_tabs_4_0= ruleTabItems ) )* otherlv_5= '}' ) )
            // InternalLPDSL.g:508:2: (otherlv_0= 'header' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleItems ) ) ( (lv_tabs_4_0= ruleTabItems ) )* otherlv_5= '}' )
            {
            // InternalLPDSL.g:508:2: (otherlv_0= 'header' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleItems ) ) ( (lv_tabs_4_0= ruleTabItems ) )* otherlv_5= '}' )
            // InternalLPDSL.g:509:3: otherlv_0= 'header' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_title_3_0= ruleItems ) ) ( (lv_tabs_4_0= ruleTabItems ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPageHeaderAccess().getHeaderKeyword_0());
            		
            // InternalLPDSL.g:513:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLPDSL.g:514:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLPDSL.g:514:4: (lv_name_1_0= RULE_ID )
            // InternalLPDSL.g:515:5: lv_name_1_0= RULE_ID
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
            		
            // InternalLPDSL.g:535:3: ( (lv_title_3_0= ruleItems ) )
            // InternalLPDSL.g:536:4: (lv_title_3_0= ruleItems )
            {
            // InternalLPDSL.g:536:4: (lv_title_3_0= ruleItems )
            // InternalLPDSL.g:537:5: lv_title_3_0= ruleItems
            {

            					newCompositeNode(grammarAccess.getPageHeaderAccess().getTitleItemsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalLPDSL.g:554:3: ( (lv_tabs_4_0= ruleTabItems ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLPDSL.g:555:4: (lv_tabs_4_0= ruleTabItems )
            	    {
            	    // InternalLPDSL.g:555:4: (lv_tabs_4_0= ruleTabItems )
            	    // InternalLPDSL.g:556:5: lv_tabs_4_0= ruleTabItems
            	    {

            	    					newCompositeNode(grammarAccess.getPageHeaderAccess().getTabsTabItemsParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
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
            	    break loop6;
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
    // InternalLPDSL.g:581:1: entryRuleTabItems returns [EObject current=null] : iv_ruleTabItems= ruleTabItems EOF ;
    public final EObject entryRuleTabItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabItems = null;


        try {
            // InternalLPDSL.g:581:49: (iv_ruleTabItems= ruleTabItems EOF )
            // InternalLPDSL.g:582:2: iv_ruleTabItems= ruleTabItems EOF
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
    // InternalLPDSL.g:588:1: ruleTabItems returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) ) ;
    public final EObject ruleTabItems() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_description_2_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:594:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) ) )
            // InternalLPDSL.g:595:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) )
            {
            // InternalLPDSL.g:595:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) )
            // InternalLPDSL.g:596:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) )
            {
            // InternalLPDSL.g:596:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLPDSL.g:597:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLPDSL.g:597:4: (lv_name_0_0= RULE_ID )
            // InternalLPDSL.g:598:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getTabItemsAccess().getColonKeyword_1());
            		
            // InternalLPDSL.g:618:3: ( (lv_description_2_0= ruleDescription ) )
            // InternalLPDSL.g:619:4: (lv_description_2_0= ruleDescription )
            {
            // InternalLPDSL.g:619:4: (lv_description_2_0= ruleDescription )
            // InternalLPDSL.g:620:5: lv_description_2_0= ruleDescription
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
    // InternalLPDSL.g:641:1: entryRulePageBody returns [EObject current=null] : iv_rulePageBody= rulePageBody EOF ;
    public final EObject entryRulePageBody() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageBody = null;


        try {
            // InternalLPDSL.g:641:49: (iv_rulePageBody= rulePageBody EOF )
            // InternalLPDSL.g:642:2: iv_rulePageBody= rulePageBody EOF
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
    // InternalLPDSL.g:648:1: rulePageBody returns [EObject current=null] : (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSections ) )* otherlv_4= '}' ) ;
    public final EObject rulePageBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sections_3_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:654:2: ( (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSections ) )* otherlv_4= '}' ) )
            // InternalLPDSL.g:655:2: (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSections ) )* otherlv_4= '}' )
            {
            // InternalLPDSL.g:655:2: (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSections ) )* otherlv_4= '}' )
            // InternalLPDSL.g:656:3: otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSections ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPageBodyAccess().getBodyKeyword_0());
            		
            // InternalLPDSL.g:660:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLPDSL.g:661:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLPDSL.g:661:4: (lv_name_1_0= RULE_ID )
            // InternalLPDSL.g:662:5: lv_name_1_0= RULE_ID
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
            		
            // InternalLPDSL.g:682:3: ( (lv_sections_3_0= ruleSections ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==11||(LA7_0>=20 && LA7_0<=23)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLPDSL.g:683:4: (lv_sections_3_0= ruleSections )
            	    {
            	    // InternalLPDSL.g:683:4: (lv_sections_3_0= ruleSections )
            	    // InternalLPDSL.g:684:5: lv_sections_3_0= ruleSections
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
            	    break loop7;
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
    // InternalLPDSL.g:709:1: entryRuleSections returns [EObject current=null] : iv_ruleSections= ruleSections EOF ;
    public final EObject entryRuleSections() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSections = null;


        try {
            // InternalLPDSL.g:709:49: (iv_ruleSections= ruleSections EOF )
            // InternalLPDSL.g:710:2: iv_ruleSections= ruleSections EOF
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
    // InternalLPDSL.g:716:1: ruleSections returns [EObject current=null] : (this_Resume_0= ruleResume | this_AboutMe_1= ruleAboutMe | this_PictureCarousel_2= rulePictureCarousel | this_ContactInformation_3= ruleContactInformation | this_Links_4= ruleLinks ) ;
    public final EObject ruleSections() throws RecognitionException {
        EObject current = null;

        EObject this_Resume_0 = null;

        EObject this_AboutMe_1 = null;

        EObject this_PictureCarousel_2 = null;

        EObject this_ContactInformation_3 = null;

        EObject this_Links_4 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:722:2: ( (this_Resume_0= ruleResume | this_AboutMe_1= ruleAboutMe | this_PictureCarousel_2= rulePictureCarousel | this_ContactInformation_3= ruleContactInformation | this_Links_4= ruleLinks ) )
            // InternalLPDSL.g:723:2: (this_Resume_0= ruleResume | this_AboutMe_1= ruleAboutMe | this_PictureCarousel_2= rulePictureCarousel | this_ContactInformation_3= ruleContactInformation | this_Links_4= ruleLinks )
            {
            // InternalLPDSL.g:723:2: (this_Resume_0= ruleResume | this_AboutMe_1= ruleAboutMe | this_PictureCarousel_2= rulePictureCarousel | this_ContactInformation_3= ruleContactInformation | this_Links_4= ruleLinks )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 11:
                {
                alt8=3;
                }
                break;
            case 21:
                {
                alt8=4;
                }
                break;
            case 20:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalLPDSL.g:724:3: this_Resume_0= ruleResume
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
                    // InternalLPDSL.g:733:3: this_AboutMe_1= ruleAboutMe
                    {

                    			newCompositeNode(grammarAccess.getSectionsAccess().getAboutMeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AboutMe_1=ruleAboutMe();

                    state._fsp--;


                    			current = this_AboutMe_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLPDSL.g:742:3: this_PictureCarousel_2= rulePictureCarousel
                    {

                    			newCompositeNode(grammarAccess.getSectionsAccess().getPictureCarouselParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PictureCarousel_2=rulePictureCarousel();

                    state._fsp--;


                    			current = this_PictureCarousel_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLPDSL.g:751:3: this_ContactInformation_3= ruleContactInformation
                    {

                    			newCompositeNode(grammarAccess.getSectionsAccess().getContactInformationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContactInformation_3=ruleContactInformation();

                    state._fsp--;


                    			current = this_ContactInformation_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalLPDSL.g:760:3: this_Links_4= ruleLinks
                    {

                    			newCompositeNode(grammarAccess.getSectionsAccess().getLinksParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Links_4=ruleLinks();

                    state._fsp--;


                    			current = this_Links_4;
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


    // $ANTLR start "entryRuleLinks"
    // InternalLPDSL.g:772:1: entryRuleLinks returns [EObject current=null] : iv_ruleLinks= ruleLinks EOF ;
    public final EObject entryRuleLinks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinks = null;


        try {
            // InternalLPDSL.g:772:46: (iv_ruleLinks= ruleLinks EOF )
            // InternalLPDSL.g:773:2: iv_ruleLinks= ruleLinks EOF
            {
             newCompositeNode(grammarAccess.getLinksRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinks=ruleLinks();

            state._fsp--;

             current =iv_ruleLinks; 
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
    // $ANTLR end "entryRuleLinks"


    // $ANTLR start "ruleLinks"
    // InternalLPDSL.g:779:1: ruleLinks returns [EObject current=null] : (otherlv_0= 'links' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleLinkItem ) )* otherlv_4= '}' ) ;
    public final EObject ruleLinks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_links_3_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:785:2: ( (otherlv_0= 'links' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleLinkItem ) )* otherlv_4= '}' ) )
            // InternalLPDSL.g:786:2: (otherlv_0= 'links' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleLinkItem ) )* otherlv_4= '}' )
            {
            // InternalLPDSL.g:786:2: (otherlv_0= 'links' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleLinkItem ) )* otherlv_4= '}' )
            // InternalLPDSL.g:787:3: otherlv_0= 'links' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleLinkItem ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLinksAccess().getLinksKeyword_0());
            		
            // InternalLPDSL.g:791:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLPDSL.g:792:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLPDSL.g:792:4: (lv_name_1_0= RULE_ID )
            // InternalLPDSL.g:793:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLinksAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinksRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getLinksAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLPDSL.g:813:3: ( (lv_links_3_0= ruleLinkItem ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLPDSL.g:814:4: (lv_links_3_0= ruleLinkItem )
            	    {
            	    // InternalLPDSL.g:814:4: (lv_links_3_0= ruleLinkItem )
            	    // InternalLPDSL.g:815:5: lv_links_3_0= ruleLinkItem
            	    {

            	    					newCompositeNode(grammarAccess.getLinksAccess().getLinksLinkItemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_links_3_0=ruleLinkItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLinksRule());
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
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLinksAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleLinks"


    // $ANTLR start "entryRuleContactInformation"
    // InternalLPDSL.g:840:1: entryRuleContactInformation returns [EObject current=null] : iv_ruleContactInformation= ruleContactInformation EOF ;
    public final EObject entryRuleContactInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContactInformation = null;


        try {
            // InternalLPDSL.g:840:59: (iv_ruleContactInformation= ruleContactInformation EOF )
            // InternalLPDSL.g:841:2: iv_ruleContactInformation= ruleContactInformation EOF
            {
             newCompositeNode(grammarAccess.getContactInformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContactInformation=ruleContactInformation();

            state._fsp--;

             current =iv_ruleContactInformation; 
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
    // $ANTLR end "entryRuleContactInformation"


    // $ANTLR start "ruleContactInformation"
    // InternalLPDSL.g:847:1: ruleContactInformation returns [EObject current=null] : (otherlv_0= 'contactinfo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleContactInformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalLPDSL.g:853:2: ( (otherlv_0= 'contactinfo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalLPDSL.g:854:2: (otherlv_0= 'contactinfo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalLPDSL.g:854:2: (otherlv_0= 'contactinfo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalLPDSL.g:855:3: otherlv_0= 'contactinfo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getContactInformationAccess().getContactinfoKeyword_0());
            		
            // InternalLPDSL.g:859:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLPDSL.g:860:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLPDSL.g:860:4: (lv_name_1_0= RULE_ID )
            // InternalLPDSL.g:861:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContactInformationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContactInformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getContactInformationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getContactInformationAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleContactInformation"


    // $ANTLR start "entryRuleResume"
    // InternalLPDSL.g:889:1: entryRuleResume returns [EObject current=null] : iv_ruleResume= ruleResume EOF ;
    public final EObject entryRuleResume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResume = null;


        try {
            // InternalLPDSL.g:889:47: (iv_ruleResume= ruleResume EOF )
            // InternalLPDSL.g:890:2: iv_ruleResume= ruleResume EOF
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
    // InternalLPDSL.g:896:1: ruleResume returns [EObject current=null] : (otherlv_0= 'resume' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resumeitems_3_0= ruleItems ) )* otherlv_4= '}' ) ;
    public final EObject ruleResume() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_resumeitems_3_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:902:2: ( (otherlv_0= 'resume' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resumeitems_3_0= ruleItems ) )* otherlv_4= '}' ) )
            // InternalLPDSL.g:903:2: (otherlv_0= 'resume' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resumeitems_3_0= ruleItems ) )* otherlv_4= '}' )
            {
            // InternalLPDSL.g:903:2: (otherlv_0= 'resume' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resumeitems_3_0= ruleItems ) )* otherlv_4= '}' )
            // InternalLPDSL.g:904:3: otherlv_0= 'resume' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resumeitems_3_0= ruleItems ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getResumeAccess().getResumeKeyword_0());
            		
            // InternalLPDSL.g:908:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLPDSL.g:909:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLPDSL.g:909:4: (lv_name_1_0= RULE_ID )
            // InternalLPDSL.g:910:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getResumeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLPDSL.g:930:3: ( (lv_resumeitems_3_0= ruleItems ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLPDSL.g:931:4: (lv_resumeitems_3_0= ruleItems )
            	    {
            	    // InternalLPDSL.g:931:4: (lv_resumeitems_3_0= ruleItems )
            	    // InternalLPDSL.g:932:5: lv_resumeitems_3_0= ruleItems
            	    {

            	    					newCompositeNode(grammarAccess.getResumeAccess().getResumeitemsItemsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
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
    // InternalLPDSL.g:957:1: entryRuleItems returns [EObject current=null] : iv_ruleItems= ruleItems EOF ;
    public final EObject entryRuleItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItems = null;


        try {
            // InternalLPDSL.g:957:46: (iv_ruleItems= ruleItems EOF )
            // InternalLPDSL.g:958:2: iv_ruleItems= ruleItems EOF
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
    // InternalLPDSL.g:964:1: ruleItems returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) ) ;
    public final EObject ruleItems() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_description_2_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:970:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) ) )
            // InternalLPDSL.g:971:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) )
            {
            // InternalLPDSL.g:971:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) ) )
            // InternalLPDSL.g:972:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleDescription ) )
            {
            // InternalLPDSL.g:972:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLPDSL.g:973:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLPDSL.g:973:4: (lv_name_0_0= RULE_ID )
            // InternalLPDSL.g:974:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getItemsAccess().getColonKeyword_1());
            		
            // InternalLPDSL.g:994:3: ( (lv_description_2_0= ruleDescription ) )
            // InternalLPDSL.g:995:4: (lv_description_2_0= ruleDescription )
            {
            // InternalLPDSL.g:995:4: (lv_description_2_0= ruleDescription )
            // InternalLPDSL.g:996:5: lv_description_2_0= ruleDescription
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
    // InternalLPDSL.g:1017:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalLPDSL.g:1017:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalLPDSL.g:1018:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalLPDSL.g:1024:1: ruleDescription returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalLPDSL.g:1030:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalLPDSL.g:1031:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalLPDSL.g:1031:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalLPDSL.g:1032:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalLPDSL.g:1032:3: (lv_value_0_0= RULE_STRING )
            // InternalLPDSL.g:1033:4: lv_value_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleTimeSpecifier"
    // InternalLPDSL.g:1052:1: entryRuleTimeSpecifier returns [EObject current=null] : iv_ruleTimeSpecifier= ruleTimeSpecifier EOF ;
    public final EObject entryRuleTimeSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeSpecifier = null;


        try {
            // InternalLPDSL.g:1052:54: (iv_ruleTimeSpecifier= ruleTimeSpecifier EOF )
            // InternalLPDSL.g:1053:2: iv_ruleTimeSpecifier= ruleTimeSpecifier EOF
            {
             newCompositeNode(grammarAccess.getTimeSpecifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeSpecifier=ruleTimeSpecifier();

            state._fsp--;

             current =iv_ruleTimeSpecifier; 
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
    // $ANTLR end "entryRuleTimeSpecifier"


    // $ANTLR start "ruleTimeSpecifier"
    // InternalLPDSL.g:1059:1: ruleTimeSpecifier returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_time_2_0= ruleInteger ) ) ) ;
    public final EObject ruleTimeSpecifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:1065:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_time_2_0= ruleInteger ) ) ) )
            // InternalLPDSL.g:1066:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_time_2_0= ruleInteger ) ) )
            {
            // InternalLPDSL.g:1066:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_time_2_0= ruleInteger ) ) )
            // InternalLPDSL.g:1067:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_time_2_0= ruleInteger ) )
            {
            // InternalLPDSL.g:1067:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLPDSL.g:1068:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLPDSL.g:1068:4: (lv_name_0_0= RULE_ID )
            // InternalLPDSL.g:1069:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTimeSpecifierAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeSpecifierRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeSpecifierAccess().getColonKeyword_1());
            		
            // InternalLPDSL.g:1089:3: ( (lv_time_2_0= ruleInteger ) )
            // InternalLPDSL.g:1090:4: (lv_time_2_0= ruleInteger )
            {
            // InternalLPDSL.g:1090:4: (lv_time_2_0= ruleInteger )
            // InternalLPDSL.g:1091:5: lv_time_2_0= ruleInteger
            {

            					newCompositeNode(grammarAccess.getTimeSpecifierAccess().getTimeIntegerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_time_2_0=ruleInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeSpecifierRule());
            					}
            					add(
            						current,
            						"time",
            						lv_time_2_0,
            						"org.xtext.example.landingpagedsl.LPDSL.Integer");
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
    // $ANTLR end "ruleTimeSpecifier"


    // $ANTLR start "entryRuleInteger"
    // InternalLPDSL.g:1112:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // InternalLPDSL.g:1112:48: (iv_ruleInteger= ruleInteger EOF )
            // InternalLPDSL.g:1113:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger; 
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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalLPDSL.g:1119:1: ruleInteger returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalLPDSL.g:1125:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalLPDSL.g:1126:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalLPDSL.g:1126:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalLPDSL.g:1127:3: (lv_value_0_0= RULE_INT )
            {
            // InternalLPDSL.g:1127:3: (lv_value_0_0= RULE_INT )
            // InternalLPDSL.g:1128:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntegerAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntegerRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleAboutMe"
    // InternalLPDSL.g:1147:1: entryRuleAboutMe returns [EObject current=null] : iv_ruleAboutMe= ruleAboutMe EOF ;
    public final EObject entryRuleAboutMe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAboutMe = null;


        try {
            // InternalLPDSL.g:1147:48: (iv_ruleAboutMe= ruleAboutMe EOF )
            // InternalLPDSL.g:1148:2: iv_ruleAboutMe= ruleAboutMe EOF
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
    // InternalLPDSL.g:1154:1: ruleAboutMe returns [EObject current=null] : (otherlv_0= 'aboutme' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_picture_3_0= rulePicture ) ) ( (lv_description_4_0= ruleItems ) ) otherlv_5= '}' ) ;
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
            // InternalLPDSL.g:1160:2: ( (otherlv_0= 'aboutme' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_picture_3_0= rulePicture ) ) ( (lv_description_4_0= ruleItems ) ) otherlv_5= '}' ) )
            // InternalLPDSL.g:1161:2: (otherlv_0= 'aboutme' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_picture_3_0= rulePicture ) ) ( (lv_description_4_0= ruleItems ) ) otherlv_5= '}' )
            {
            // InternalLPDSL.g:1161:2: (otherlv_0= 'aboutme' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_picture_3_0= rulePicture ) ) ( (lv_description_4_0= ruleItems ) ) otherlv_5= '}' )
            // InternalLPDSL.g:1162:3: otherlv_0= 'aboutme' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_picture_3_0= rulePicture ) ) ( (lv_description_4_0= ruleItems ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAboutMeAccess().getAboutmeKeyword_0());
            		
            // InternalLPDSL.g:1166:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLPDSL.g:1167:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLPDSL.g:1167:4: (lv_name_1_0= RULE_ID )
            // InternalLPDSL.g:1168:5: lv_name_1_0= RULE_ID
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
            		
            // InternalLPDSL.g:1188:3: ( (lv_picture_3_0= rulePicture ) )
            // InternalLPDSL.g:1189:4: (lv_picture_3_0= rulePicture )
            {
            // InternalLPDSL.g:1189:4: (lv_picture_3_0= rulePicture )
            // InternalLPDSL.g:1190:5: lv_picture_3_0= rulePicture
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

            // InternalLPDSL.g:1207:3: ( (lv_description_4_0= ruleItems ) )
            // InternalLPDSL.g:1208:4: (lv_description_4_0= ruleItems )
            {
            // InternalLPDSL.g:1208:4: (lv_description_4_0= ruleItems )
            // InternalLPDSL.g:1209:5: lv_description_4_0= ruleItems
            {

            					newCompositeNode(grammarAccess.getAboutMeAccess().getDescriptionItemsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
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
    // InternalLPDSL.g:1234:1: entryRulePicture returns [EObject current=null] : iv_rulePicture= rulePicture EOF ;
    public final EObject entryRulePicture() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePicture = null;


        try {
            // InternalLPDSL.g:1234:48: (iv_rulePicture= rulePicture EOF )
            // InternalLPDSL.g:1235:2: iv_rulePicture= rulePicture EOF
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
    // InternalLPDSL.g:1241:1: rulePicture returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_imagepath_2_0= ruleImagePath ) ) ) ;
    public final EObject rulePicture() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_imagepath_2_0 = null;



        	enterRule();

        try {
            // InternalLPDSL.g:1247:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_imagepath_2_0= ruleImagePath ) ) ) )
            // InternalLPDSL.g:1248:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_imagepath_2_0= ruleImagePath ) ) )
            {
            // InternalLPDSL.g:1248:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_imagepath_2_0= ruleImagePath ) ) )
            // InternalLPDSL.g:1249:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_imagepath_2_0= ruleImagePath ) )
            {
            // InternalLPDSL.g:1249:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLPDSL.g:1250:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLPDSL.g:1250:4: (lv_name_0_0= RULE_ID )
            // InternalLPDSL.g:1251:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPictureAccess().getColonKeyword_1());
            		
            // InternalLPDSL.g:1271:3: ( (lv_imagepath_2_0= ruleImagePath ) )
            // InternalLPDSL.g:1272:4: (lv_imagepath_2_0= ruleImagePath )
            {
            // InternalLPDSL.g:1272:4: (lv_imagepath_2_0= ruleImagePath )
            // InternalLPDSL.g:1273:5: lv_imagepath_2_0= ruleImagePath
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
    // InternalLPDSL.g:1294:1: entryRuleImagePath returns [EObject current=null] : iv_ruleImagePath= ruleImagePath EOF ;
    public final EObject entryRuleImagePath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImagePath = null;


        try {
            // InternalLPDSL.g:1294:50: (iv_ruleImagePath= ruleImagePath EOF )
            // InternalLPDSL.g:1295:2: iv_ruleImagePath= ruleImagePath EOF
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
    // InternalLPDSL.g:1301:1: ruleImagePath returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleImagePath() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalLPDSL.g:1307:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalLPDSL.g:1308:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalLPDSL.g:1308:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalLPDSL.g:1309:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalLPDSL.g:1309:3: (lv_value_0_0= RULE_STRING )
            // InternalLPDSL.g:1310:4: lv_value_0_0= RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000C4002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000F02800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});

}