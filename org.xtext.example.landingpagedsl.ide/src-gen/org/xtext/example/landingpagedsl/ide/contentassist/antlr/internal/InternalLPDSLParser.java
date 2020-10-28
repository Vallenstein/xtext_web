package org.xtext.example.landingpagedsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.landingpagedsl.services.LPDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLPDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'carousel'", "'{'", "'}'", "'footer'", "'link'", "':'", "'header'", "'body'", "'links'", "'contactinfo'", "'resume'", "'aboutme'"
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

    	public void setGrammarAccess(LPDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleLandingPage"
    // InternalLPDSL.g:53:1: entryRuleLandingPage : ruleLandingPage EOF ;
    public final void entryRuleLandingPage() throws RecognitionException {
        try {
            // InternalLPDSL.g:54:1: ( ruleLandingPage EOF )
            // InternalLPDSL.g:55:1: ruleLandingPage EOF
            {
             before(grammarAccess.getLandingPageRule()); 
            pushFollow(FOLLOW_1);
            ruleLandingPage();

            state._fsp--;

             after(grammarAccess.getLandingPageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLandingPage"


    // $ANTLR start "ruleLandingPage"
    // InternalLPDSL.g:62:1: ruleLandingPage : ( ( rule__LandingPage__PagecomponentAssignment )* ) ;
    public final void ruleLandingPage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:66:2: ( ( ( rule__LandingPage__PagecomponentAssignment )* ) )
            // InternalLPDSL.g:67:2: ( ( rule__LandingPage__PagecomponentAssignment )* )
            {
            // InternalLPDSL.g:67:2: ( ( rule__LandingPage__PagecomponentAssignment )* )
            // InternalLPDSL.g:68:3: ( rule__LandingPage__PagecomponentAssignment )*
            {
             before(grammarAccess.getLandingPageAccess().getPagecomponentAssignment()); 
            // InternalLPDSL.g:69:3: ( rule__LandingPage__PagecomponentAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||(LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLPDSL.g:69:4: rule__LandingPage__PagecomponentAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__LandingPage__PagecomponentAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getLandingPageAccess().getPagecomponentAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLandingPage"


    // $ANTLR start "entryRulePageComponent"
    // InternalLPDSL.g:78:1: entryRulePageComponent : rulePageComponent EOF ;
    public final void entryRulePageComponent() throws RecognitionException {
        try {
            // InternalLPDSL.g:79:1: ( rulePageComponent EOF )
            // InternalLPDSL.g:80:1: rulePageComponent EOF
            {
             before(grammarAccess.getPageComponentRule()); 
            pushFollow(FOLLOW_1);
            rulePageComponent();

            state._fsp--;

             after(grammarAccess.getPageComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePageComponent"


    // $ANTLR start "rulePageComponent"
    // InternalLPDSL.g:87:1: rulePageComponent : ( ( rule__PageComponent__Alternatives ) ) ;
    public final void rulePageComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:91:2: ( ( ( rule__PageComponent__Alternatives ) ) )
            // InternalLPDSL.g:92:2: ( ( rule__PageComponent__Alternatives ) )
            {
            // InternalLPDSL.g:92:2: ( ( rule__PageComponent__Alternatives ) )
            // InternalLPDSL.g:93:3: ( rule__PageComponent__Alternatives )
            {
             before(grammarAccess.getPageComponentAccess().getAlternatives()); 
            // InternalLPDSL.g:94:3: ( rule__PageComponent__Alternatives )
            // InternalLPDSL.g:94:4: rule__PageComponent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PageComponent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPageComponentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePageComponent"


    // $ANTLR start "entryRulePictureCarousel"
    // InternalLPDSL.g:103:1: entryRulePictureCarousel : rulePictureCarousel EOF ;
    public final void entryRulePictureCarousel() throws RecognitionException {
        try {
            // InternalLPDSL.g:104:1: ( rulePictureCarousel EOF )
            // InternalLPDSL.g:105:1: rulePictureCarousel EOF
            {
             before(grammarAccess.getPictureCarouselRule()); 
            pushFollow(FOLLOW_1);
            rulePictureCarousel();

            state._fsp--;

             after(grammarAccess.getPictureCarouselRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePictureCarousel"


    // $ANTLR start "rulePictureCarousel"
    // InternalLPDSL.g:112:1: rulePictureCarousel : ( ( rule__PictureCarousel__Group__0 ) ) ;
    public final void rulePictureCarousel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:116:2: ( ( ( rule__PictureCarousel__Group__0 ) ) )
            // InternalLPDSL.g:117:2: ( ( rule__PictureCarousel__Group__0 ) )
            {
            // InternalLPDSL.g:117:2: ( ( rule__PictureCarousel__Group__0 ) )
            // InternalLPDSL.g:118:3: ( rule__PictureCarousel__Group__0 )
            {
             before(grammarAccess.getPictureCarouselAccess().getGroup()); 
            // InternalLPDSL.g:119:3: ( rule__PictureCarousel__Group__0 )
            // InternalLPDSL.g:119:4: rule__PictureCarousel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PictureCarousel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPictureCarouselAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePictureCarousel"


    // $ANTLR start "entryRulePageFooter"
    // InternalLPDSL.g:128:1: entryRulePageFooter : rulePageFooter EOF ;
    public final void entryRulePageFooter() throws RecognitionException {
        try {
            // InternalLPDSL.g:129:1: ( rulePageFooter EOF )
            // InternalLPDSL.g:130:1: rulePageFooter EOF
            {
             before(grammarAccess.getPageFooterRule()); 
            pushFollow(FOLLOW_1);
            rulePageFooter();

            state._fsp--;

             after(grammarAccess.getPageFooterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePageFooter"


    // $ANTLR start "rulePageFooter"
    // InternalLPDSL.g:137:1: rulePageFooter : ( ( rule__PageFooter__Group__0 ) ) ;
    public final void rulePageFooter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:141:2: ( ( ( rule__PageFooter__Group__0 ) ) )
            // InternalLPDSL.g:142:2: ( ( rule__PageFooter__Group__0 ) )
            {
            // InternalLPDSL.g:142:2: ( ( rule__PageFooter__Group__0 ) )
            // InternalLPDSL.g:143:3: ( rule__PageFooter__Group__0 )
            {
             before(grammarAccess.getPageFooterAccess().getGroup()); 
            // InternalLPDSL.g:144:3: ( rule__PageFooter__Group__0 )
            // InternalLPDSL.g:144:4: rule__PageFooter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PageFooter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageFooterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePageFooter"


    // $ANTLR start "entryRuleLinkItem"
    // InternalLPDSL.g:153:1: entryRuleLinkItem : ruleLinkItem EOF ;
    public final void entryRuleLinkItem() throws RecognitionException {
        try {
            // InternalLPDSL.g:154:1: ( ruleLinkItem EOF )
            // InternalLPDSL.g:155:1: ruleLinkItem EOF
            {
             before(grammarAccess.getLinkItemRule()); 
            pushFollow(FOLLOW_1);
            ruleLinkItem();

            state._fsp--;

             after(grammarAccess.getLinkItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLinkItem"


    // $ANTLR start "ruleLinkItem"
    // InternalLPDSL.g:162:1: ruleLinkItem : ( ( rule__LinkItem__Group__0 ) ) ;
    public final void ruleLinkItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:166:2: ( ( ( rule__LinkItem__Group__0 ) ) )
            // InternalLPDSL.g:167:2: ( ( rule__LinkItem__Group__0 ) )
            {
            // InternalLPDSL.g:167:2: ( ( rule__LinkItem__Group__0 ) )
            // InternalLPDSL.g:168:3: ( rule__LinkItem__Group__0 )
            {
             before(grammarAccess.getLinkItemAccess().getGroup()); 
            // InternalLPDSL.g:169:3: ( rule__LinkItem__Group__0 )
            // InternalLPDSL.g:169:4: rule__LinkItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LinkItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinkItem"


    // $ANTLR start "entryRuleURL"
    // InternalLPDSL.g:178:1: entryRuleURL : ruleURL EOF ;
    public final void entryRuleURL() throws RecognitionException {
        try {
            // InternalLPDSL.g:179:1: ( ruleURL EOF )
            // InternalLPDSL.g:180:1: ruleURL EOF
            {
             before(grammarAccess.getURLRule()); 
            pushFollow(FOLLOW_1);
            ruleURL();

            state._fsp--;

             after(grammarAccess.getURLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleURL"


    // $ANTLR start "ruleURL"
    // InternalLPDSL.g:187:1: ruleURL : ( ( rule__URL__Group__0 ) ) ;
    public final void ruleURL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:191:2: ( ( ( rule__URL__Group__0 ) ) )
            // InternalLPDSL.g:192:2: ( ( rule__URL__Group__0 ) )
            {
            // InternalLPDSL.g:192:2: ( ( rule__URL__Group__0 ) )
            // InternalLPDSL.g:193:3: ( rule__URL__Group__0 )
            {
             before(grammarAccess.getURLAccess().getGroup()); 
            // InternalLPDSL.g:194:3: ( rule__URL__Group__0 )
            // InternalLPDSL.g:194:4: rule__URL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__URL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getURLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleURL"


    // $ANTLR start "entryRulePath"
    // InternalLPDSL.g:203:1: entryRulePath : rulePath EOF ;
    public final void entryRulePath() throws RecognitionException {
        try {
            // InternalLPDSL.g:204:1: ( rulePath EOF )
            // InternalLPDSL.g:205:1: rulePath EOF
            {
             before(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_1);
            rulePath();

            state._fsp--;

             after(grammarAccess.getPathRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // InternalLPDSL.g:212:1: rulePath : ( ( rule__Path__ValueAssignment ) ) ;
    public final void rulePath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:216:2: ( ( ( rule__Path__ValueAssignment ) ) )
            // InternalLPDSL.g:217:2: ( ( rule__Path__ValueAssignment ) )
            {
            // InternalLPDSL.g:217:2: ( ( rule__Path__ValueAssignment ) )
            // InternalLPDSL.g:218:3: ( rule__Path__ValueAssignment )
            {
             before(grammarAccess.getPathAccess().getValueAssignment()); 
            // InternalLPDSL.g:219:3: ( rule__Path__ValueAssignment )
            // InternalLPDSL.g:219:4: rule__Path__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Path__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRulePageHeader"
    // InternalLPDSL.g:228:1: entryRulePageHeader : rulePageHeader EOF ;
    public final void entryRulePageHeader() throws RecognitionException {
        try {
            // InternalLPDSL.g:229:1: ( rulePageHeader EOF )
            // InternalLPDSL.g:230:1: rulePageHeader EOF
            {
             before(grammarAccess.getPageHeaderRule()); 
            pushFollow(FOLLOW_1);
            rulePageHeader();

            state._fsp--;

             after(grammarAccess.getPageHeaderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePageHeader"


    // $ANTLR start "rulePageHeader"
    // InternalLPDSL.g:237:1: rulePageHeader : ( ( rule__PageHeader__Group__0 ) ) ;
    public final void rulePageHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:241:2: ( ( ( rule__PageHeader__Group__0 ) ) )
            // InternalLPDSL.g:242:2: ( ( rule__PageHeader__Group__0 ) )
            {
            // InternalLPDSL.g:242:2: ( ( rule__PageHeader__Group__0 ) )
            // InternalLPDSL.g:243:3: ( rule__PageHeader__Group__0 )
            {
             before(grammarAccess.getPageHeaderAccess().getGroup()); 
            // InternalLPDSL.g:244:3: ( rule__PageHeader__Group__0 )
            // InternalLPDSL.g:244:4: rule__PageHeader__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PageHeader__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePageHeader"


    // $ANTLR start "entryRuleTabItems"
    // InternalLPDSL.g:253:1: entryRuleTabItems : ruleTabItems EOF ;
    public final void entryRuleTabItems() throws RecognitionException {
        try {
            // InternalLPDSL.g:254:1: ( ruleTabItems EOF )
            // InternalLPDSL.g:255:1: ruleTabItems EOF
            {
             before(grammarAccess.getTabItemsRule()); 
            pushFollow(FOLLOW_1);
            ruleTabItems();

            state._fsp--;

             after(grammarAccess.getTabItemsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTabItems"


    // $ANTLR start "ruleTabItems"
    // InternalLPDSL.g:262:1: ruleTabItems : ( ( rule__TabItems__Group__0 ) ) ;
    public final void ruleTabItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:266:2: ( ( ( rule__TabItems__Group__0 ) ) )
            // InternalLPDSL.g:267:2: ( ( rule__TabItems__Group__0 ) )
            {
            // InternalLPDSL.g:267:2: ( ( rule__TabItems__Group__0 ) )
            // InternalLPDSL.g:268:3: ( rule__TabItems__Group__0 )
            {
             before(grammarAccess.getTabItemsAccess().getGroup()); 
            // InternalLPDSL.g:269:3: ( rule__TabItems__Group__0 )
            // InternalLPDSL.g:269:4: rule__TabItems__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TabItems__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTabItemsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTabItems"


    // $ANTLR start "entryRulePageBody"
    // InternalLPDSL.g:278:1: entryRulePageBody : rulePageBody EOF ;
    public final void entryRulePageBody() throws RecognitionException {
        try {
            // InternalLPDSL.g:279:1: ( rulePageBody EOF )
            // InternalLPDSL.g:280:1: rulePageBody EOF
            {
             before(grammarAccess.getPageBodyRule()); 
            pushFollow(FOLLOW_1);
            rulePageBody();

            state._fsp--;

             after(grammarAccess.getPageBodyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePageBody"


    // $ANTLR start "rulePageBody"
    // InternalLPDSL.g:287:1: rulePageBody : ( ( rule__PageBody__Group__0 ) ) ;
    public final void rulePageBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:291:2: ( ( ( rule__PageBody__Group__0 ) ) )
            // InternalLPDSL.g:292:2: ( ( rule__PageBody__Group__0 ) )
            {
            // InternalLPDSL.g:292:2: ( ( rule__PageBody__Group__0 ) )
            // InternalLPDSL.g:293:3: ( rule__PageBody__Group__0 )
            {
             before(grammarAccess.getPageBodyAccess().getGroup()); 
            // InternalLPDSL.g:294:3: ( rule__PageBody__Group__0 )
            // InternalLPDSL.g:294:4: rule__PageBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PageBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePageBody"


    // $ANTLR start "entryRuleSections"
    // InternalLPDSL.g:303:1: entryRuleSections : ruleSections EOF ;
    public final void entryRuleSections() throws RecognitionException {
        try {
            // InternalLPDSL.g:304:1: ( ruleSections EOF )
            // InternalLPDSL.g:305:1: ruleSections EOF
            {
             before(grammarAccess.getSectionsRule()); 
            pushFollow(FOLLOW_1);
            ruleSections();

            state._fsp--;

             after(grammarAccess.getSectionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSections"


    // $ANTLR start "ruleSections"
    // InternalLPDSL.g:312:1: ruleSections : ( ( rule__Sections__Alternatives ) ) ;
    public final void ruleSections() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:316:2: ( ( ( rule__Sections__Alternatives ) ) )
            // InternalLPDSL.g:317:2: ( ( rule__Sections__Alternatives ) )
            {
            // InternalLPDSL.g:317:2: ( ( rule__Sections__Alternatives ) )
            // InternalLPDSL.g:318:3: ( rule__Sections__Alternatives )
            {
             before(grammarAccess.getSectionsAccess().getAlternatives()); 
            // InternalLPDSL.g:319:3: ( rule__Sections__Alternatives )
            // InternalLPDSL.g:319:4: rule__Sections__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sections__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSectionsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSections"


    // $ANTLR start "entryRuleLinks"
    // InternalLPDSL.g:328:1: entryRuleLinks : ruleLinks EOF ;
    public final void entryRuleLinks() throws RecognitionException {
        try {
            // InternalLPDSL.g:329:1: ( ruleLinks EOF )
            // InternalLPDSL.g:330:1: ruleLinks EOF
            {
             before(grammarAccess.getLinksRule()); 
            pushFollow(FOLLOW_1);
            ruleLinks();

            state._fsp--;

             after(grammarAccess.getLinksRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLinks"


    // $ANTLR start "ruleLinks"
    // InternalLPDSL.g:337:1: ruleLinks : ( ( rule__Links__Group__0 ) ) ;
    public final void ruleLinks() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:341:2: ( ( ( rule__Links__Group__0 ) ) )
            // InternalLPDSL.g:342:2: ( ( rule__Links__Group__0 ) )
            {
            // InternalLPDSL.g:342:2: ( ( rule__Links__Group__0 ) )
            // InternalLPDSL.g:343:3: ( rule__Links__Group__0 )
            {
             before(grammarAccess.getLinksAccess().getGroup()); 
            // InternalLPDSL.g:344:3: ( rule__Links__Group__0 )
            // InternalLPDSL.g:344:4: rule__Links__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Links__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinksAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinks"


    // $ANTLR start "entryRuleContactInformation"
    // InternalLPDSL.g:353:1: entryRuleContactInformation : ruleContactInformation EOF ;
    public final void entryRuleContactInformation() throws RecognitionException {
        try {
            // InternalLPDSL.g:354:1: ( ruleContactInformation EOF )
            // InternalLPDSL.g:355:1: ruleContactInformation EOF
            {
             before(grammarAccess.getContactInformationRule()); 
            pushFollow(FOLLOW_1);
            ruleContactInformation();

            state._fsp--;

             after(grammarAccess.getContactInformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContactInformation"


    // $ANTLR start "ruleContactInformation"
    // InternalLPDSL.g:362:1: ruleContactInformation : ( ( rule__ContactInformation__Group__0 ) ) ;
    public final void ruleContactInformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:366:2: ( ( ( rule__ContactInformation__Group__0 ) ) )
            // InternalLPDSL.g:367:2: ( ( rule__ContactInformation__Group__0 ) )
            {
            // InternalLPDSL.g:367:2: ( ( rule__ContactInformation__Group__0 ) )
            // InternalLPDSL.g:368:3: ( rule__ContactInformation__Group__0 )
            {
             before(grammarAccess.getContactInformationAccess().getGroup()); 
            // InternalLPDSL.g:369:3: ( rule__ContactInformation__Group__0 )
            // InternalLPDSL.g:369:4: rule__ContactInformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContactInformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContactInformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContactInformation"


    // $ANTLR start "entryRuleResume"
    // InternalLPDSL.g:378:1: entryRuleResume : ruleResume EOF ;
    public final void entryRuleResume() throws RecognitionException {
        try {
            // InternalLPDSL.g:379:1: ( ruleResume EOF )
            // InternalLPDSL.g:380:1: ruleResume EOF
            {
             before(grammarAccess.getResumeRule()); 
            pushFollow(FOLLOW_1);
            ruleResume();

            state._fsp--;

             after(grammarAccess.getResumeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResume"


    // $ANTLR start "ruleResume"
    // InternalLPDSL.g:387:1: ruleResume : ( ( rule__Resume__Group__0 ) ) ;
    public final void ruleResume() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:391:2: ( ( ( rule__Resume__Group__0 ) ) )
            // InternalLPDSL.g:392:2: ( ( rule__Resume__Group__0 ) )
            {
            // InternalLPDSL.g:392:2: ( ( rule__Resume__Group__0 ) )
            // InternalLPDSL.g:393:3: ( rule__Resume__Group__0 )
            {
             before(grammarAccess.getResumeAccess().getGroup()); 
            // InternalLPDSL.g:394:3: ( rule__Resume__Group__0 )
            // InternalLPDSL.g:394:4: rule__Resume__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resume__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResumeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResume"


    // $ANTLR start "entryRuleItems"
    // InternalLPDSL.g:403:1: entryRuleItems : ruleItems EOF ;
    public final void entryRuleItems() throws RecognitionException {
        try {
            // InternalLPDSL.g:404:1: ( ruleItems EOF )
            // InternalLPDSL.g:405:1: ruleItems EOF
            {
             before(grammarAccess.getItemsRule()); 
            pushFollow(FOLLOW_1);
            ruleItems();

            state._fsp--;

             after(grammarAccess.getItemsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItems"


    // $ANTLR start "ruleItems"
    // InternalLPDSL.g:412:1: ruleItems : ( ( rule__Items__Group__0 ) ) ;
    public final void ruleItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:416:2: ( ( ( rule__Items__Group__0 ) ) )
            // InternalLPDSL.g:417:2: ( ( rule__Items__Group__0 ) )
            {
            // InternalLPDSL.g:417:2: ( ( rule__Items__Group__0 ) )
            // InternalLPDSL.g:418:3: ( rule__Items__Group__0 )
            {
             before(grammarAccess.getItemsAccess().getGroup()); 
            // InternalLPDSL.g:419:3: ( rule__Items__Group__0 )
            // InternalLPDSL.g:419:4: rule__Items__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Items__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItems"


    // $ANTLR start "entryRuleDescription"
    // InternalLPDSL.g:428:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalLPDSL.g:429:1: ( ruleDescription EOF )
            // InternalLPDSL.g:430:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalLPDSL.g:437:1: ruleDescription : ( ( rule__Description__ValueAssignment ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:441:2: ( ( ( rule__Description__ValueAssignment ) ) )
            // InternalLPDSL.g:442:2: ( ( rule__Description__ValueAssignment ) )
            {
            // InternalLPDSL.g:442:2: ( ( rule__Description__ValueAssignment ) )
            // InternalLPDSL.g:443:3: ( rule__Description__ValueAssignment )
            {
             before(grammarAccess.getDescriptionAccess().getValueAssignment()); 
            // InternalLPDSL.g:444:3: ( rule__Description__ValueAssignment )
            // InternalLPDSL.g:444:4: rule__Description__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Description__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleTimeSpecifier"
    // InternalLPDSL.g:453:1: entryRuleTimeSpecifier : ruleTimeSpecifier EOF ;
    public final void entryRuleTimeSpecifier() throws RecognitionException {
        try {
            // InternalLPDSL.g:454:1: ( ruleTimeSpecifier EOF )
            // InternalLPDSL.g:455:1: ruleTimeSpecifier EOF
            {
             before(grammarAccess.getTimeSpecifierRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeSpecifier();

            state._fsp--;

             after(grammarAccess.getTimeSpecifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeSpecifier"


    // $ANTLR start "ruleTimeSpecifier"
    // InternalLPDSL.g:462:1: ruleTimeSpecifier : ( ( rule__TimeSpecifier__Group__0 ) ) ;
    public final void ruleTimeSpecifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:466:2: ( ( ( rule__TimeSpecifier__Group__0 ) ) )
            // InternalLPDSL.g:467:2: ( ( rule__TimeSpecifier__Group__0 ) )
            {
            // InternalLPDSL.g:467:2: ( ( rule__TimeSpecifier__Group__0 ) )
            // InternalLPDSL.g:468:3: ( rule__TimeSpecifier__Group__0 )
            {
             before(grammarAccess.getTimeSpecifierAccess().getGroup()); 
            // InternalLPDSL.g:469:3: ( rule__TimeSpecifier__Group__0 )
            // InternalLPDSL.g:469:4: rule__TimeSpecifier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeSpecifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeSpecifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeSpecifier"


    // $ANTLR start "entryRuleInteger"
    // InternalLPDSL.g:478:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalLPDSL.g:479:1: ( ruleInteger EOF )
            // InternalLPDSL.g:480:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalLPDSL.g:487:1: ruleInteger : ( ( rule__Integer__ValueAssignment ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:491:2: ( ( ( rule__Integer__ValueAssignment ) ) )
            // InternalLPDSL.g:492:2: ( ( rule__Integer__ValueAssignment ) )
            {
            // InternalLPDSL.g:492:2: ( ( rule__Integer__ValueAssignment ) )
            // InternalLPDSL.g:493:3: ( rule__Integer__ValueAssignment )
            {
             before(grammarAccess.getIntegerAccess().getValueAssignment()); 
            // InternalLPDSL.g:494:3: ( rule__Integer__ValueAssignment )
            // InternalLPDSL.g:494:4: rule__Integer__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Integer__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleAboutMe"
    // InternalLPDSL.g:503:1: entryRuleAboutMe : ruleAboutMe EOF ;
    public final void entryRuleAboutMe() throws RecognitionException {
        try {
            // InternalLPDSL.g:504:1: ( ruleAboutMe EOF )
            // InternalLPDSL.g:505:1: ruleAboutMe EOF
            {
             before(grammarAccess.getAboutMeRule()); 
            pushFollow(FOLLOW_1);
            ruleAboutMe();

            state._fsp--;

             after(grammarAccess.getAboutMeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAboutMe"


    // $ANTLR start "ruleAboutMe"
    // InternalLPDSL.g:512:1: ruleAboutMe : ( ( rule__AboutMe__Group__0 ) ) ;
    public final void ruleAboutMe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:516:2: ( ( ( rule__AboutMe__Group__0 ) ) )
            // InternalLPDSL.g:517:2: ( ( rule__AboutMe__Group__0 ) )
            {
            // InternalLPDSL.g:517:2: ( ( rule__AboutMe__Group__0 ) )
            // InternalLPDSL.g:518:3: ( rule__AboutMe__Group__0 )
            {
             before(grammarAccess.getAboutMeAccess().getGroup()); 
            // InternalLPDSL.g:519:3: ( rule__AboutMe__Group__0 )
            // InternalLPDSL.g:519:4: rule__AboutMe__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AboutMe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAboutMeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAboutMe"


    // $ANTLR start "entryRulePicture"
    // InternalLPDSL.g:528:1: entryRulePicture : rulePicture EOF ;
    public final void entryRulePicture() throws RecognitionException {
        try {
            // InternalLPDSL.g:529:1: ( rulePicture EOF )
            // InternalLPDSL.g:530:1: rulePicture EOF
            {
             before(grammarAccess.getPictureRule()); 
            pushFollow(FOLLOW_1);
            rulePicture();

            state._fsp--;

             after(grammarAccess.getPictureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePicture"


    // $ANTLR start "rulePicture"
    // InternalLPDSL.g:537:1: rulePicture : ( ( rule__Picture__Group__0 ) ) ;
    public final void rulePicture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:541:2: ( ( ( rule__Picture__Group__0 ) ) )
            // InternalLPDSL.g:542:2: ( ( rule__Picture__Group__0 ) )
            {
            // InternalLPDSL.g:542:2: ( ( rule__Picture__Group__0 ) )
            // InternalLPDSL.g:543:3: ( rule__Picture__Group__0 )
            {
             before(grammarAccess.getPictureAccess().getGroup()); 
            // InternalLPDSL.g:544:3: ( rule__Picture__Group__0 )
            // InternalLPDSL.g:544:4: rule__Picture__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Picture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePicture"


    // $ANTLR start "entryRuleImagePath"
    // InternalLPDSL.g:553:1: entryRuleImagePath : ruleImagePath EOF ;
    public final void entryRuleImagePath() throws RecognitionException {
        try {
            // InternalLPDSL.g:554:1: ( ruleImagePath EOF )
            // InternalLPDSL.g:555:1: ruleImagePath EOF
            {
             before(grammarAccess.getImagePathRule()); 
            pushFollow(FOLLOW_1);
            ruleImagePath();

            state._fsp--;

             after(grammarAccess.getImagePathRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImagePath"


    // $ANTLR start "ruleImagePath"
    // InternalLPDSL.g:562:1: ruleImagePath : ( ( rule__ImagePath__ValueAssignment ) ) ;
    public final void ruleImagePath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:566:2: ( ( ( rule__ImagePath__ValueAssignment ) ) )
            // InternalLPDSL.g:567:2: ( ( rule__ImagePath__ValueAssignment ) )
            {
            // InternalLPDSL.g:567:2: ( ( rule__ImagePath__ValueAssignment ) )
            // InternalLPDSL.g:568:3: ( rule__ImagePath__ValueAssignment )
            {
             before(grammarAccess.getImagePathAccess().getValueAssignment()); 
            // InternalLPDSL.g:569:3: ( rule__ImagePath__ValueAssignment )
            // InternalLPDSL.g:569:4: rule__ImagePath__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ImagePath__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getImagePathAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImagePath"


    // $ANTLR start "rule__PageComponent__Alternatives"
    // InternalLPDSL.g:577:1: rule__PageComponent__Alternatives : ( ( rulePageHeader ) | ( rulePageBody ) | ( rulePageFooter ) );
    public final void rule__PageComponent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:581:1: ( ( rulePageHeader ) | ( rulePageBody ) | ( rulePageFooter ) )
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
                    // InternalLPDSL.g:582:2: ( rulePageHeader )
                    {
                    // InternalLPDSL.g:582:2: ( rulePageHeader )
                    // InternalLPDSL.g:583:3: rulePageHeader
                    {
                     before(grammarAccess.getPageComponentAccess().getPageHeaderParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePageHeader();

                    state._fsp--;

                     after(grammarAccess.getPageComponentAccess().getPageHeaderParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLPDSL.g:588:2: ( rulePageBody )
                    {
                    // InternalLPDSL.g:588:2: ( rulePageBody )
                    // InternalLPDSL.g:589:3: rulePageBody
                    {
                     before(grammarAccess.getPageComponentAccess().getPageBodyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePageBody();

                    state._fsp--;

                     after(grammarAccess.getPageComponentAccess().getPageBodyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLPDSL.g:594:2: ( rulePageFooter )
                    {
                    // InternalLPDSL.g:594:2: ( rulePageFooter )
                    // InternalLPDSL.g:595:3: rulePageFooter
                    {
                     before(grammarAccess.getPageComponentAccess().getPageFooterParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePageFooter();

                    state._fsp--;

                     after(grammarAccess.getPageComponentAccess().getPageFooterParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageComponent__Alternatives"


    // $ANTLR start "rule__Sections__Alternatives"
    // InternalLPDSL.g:604:1: rule__Sections__Alternatives : ( ( ruleResume ) | ( ruleAboutMe ) | ( rulePictureCarousel ) | ( ruleContactInformation ) | ( ruleLinks ) );
    public final void rule__Sections__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:608:1: ( ( ruleResume ) | ( ruleAboutMe ) | ( rulePictureCarousel ) | ( ruleContactInformation ) | ( ruleLinks ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 11:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
                }
                break;
            case 19:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalLPDSL.g:609:2: ( ruleResume )
                    {
                    // InternalLPDSL.g:609:2: ( ruleResume )
                    // InternalLPDSL.g:610:3: ruleResume
                    {
                     before(grammarAccess.getSectionsAccess().getResumeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleResume();

                    state._fsp--;

                     after(grammarAccess.getSectionsAccess().getResumeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLPDSL.g:615:2: ( ruleAboutMe )
                    {
                    // InternalLPDSL.g:615:2: ( ruleAboutMe )
                    // InternalLPDSL.g:616:3: ruleAboutMe
                    {
                     before(grammarAccess.getSectionsAccess().getAboutMeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAboutMe();

                    state._fsp--;

                     after(grammarAccess.getSectionsAccess().getAboutMeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLPDSL.g:621:2: ( rulePictureCarousel )
                    {
                    // InternalLPDSL.g:621:2: ( rulePictureCarousel )
                    // InternalLPDSL.g:622:3: rulePictureCarousel
                    {
                     before(grammarAccess.getSectionsAccess().getPictureCarouselParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePictureCarousel();

                    state._fsp--;

                     after(grammarAccess.getSectionsAccess().getPictureCarouselParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLPDSL.g:627:2: ( ruleContactInformation )
                    {
                    // InternalLPDSL.g:627:2: ( ruleContactInformation )
                    // InternalLPDSL.g:628:3: ruleContactInformation
                    {
                     before(grammarAccess.getSectionsAccess().getContactInformationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleContactInformation();

                    state._fsp--;

                     after(grammarAccess.getSectionsAccess().getContactInformationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLPDSL.g:633:2: ( ruleLinks )
                    {
                    // InternalLPDSL.g:633:2: ( ruleLinks )
                    // InternalLPDSL.g:634:3: ruleLinks
                    {
                     before(grammarAccess.getSectionsAccess().getLinksParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleLinks();

                    state._fsp--;

                     after(grammarAccess.getSectionsAccess().getLinksParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__Alternatives"


    // $ANTLR start "rule__PictureCarousel__Group__0"
    // InternalLPDSL.g:643:1: rule__PictureCarousel__Group__0 : rule__PictureCarousel__Group__0__Impl rule__PictureCarousel__Group__1 ;
    public final void rule__PictureCarousel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:647:1: ( rule__PictureCarousel__Group__0__Impl rule__PictureCarousel__Group__1 )
            // InternalLPDSL.g:648:2: rule__PictureCarousel__Group__0__Impl rule__PictureCarousel__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PictureCarousel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PictureCarousel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PictureCarousel__Group__0"


    // $ANTLR start "rule__PictureCarousel__Group__0__Impl"
    // InternalLPDSL.g:655:1: rule__PictureCarousel__Group__0__Impl : ( 'carousel' ) ;
    public final void rule__PictureCarousel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:659:1: ( ( 'carousel' ) )
            // InternalLPDSL.g:660:1: ( 'carousel' )
            {
            // InternalLPDSL.g:660:1: ( 'carousel' )
            // InternalLPDSL.g:661:2: 'carousel'
            {
             before(grammarAccess.getPictureCarouselAccess().getCarouselKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPictureCarouselAccess().getCarouselKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PictureCarousel__Group__0__Impl"


    // $ANTLR start "rule__PictureCarousel__Group__1"
    // InternalLPDSL.g:670:1: rule__PictureCarousel__Group__1 : rule__PictureCarousel__Group__1__Impl rule__PictureCarousel__Group__2 ;
    public final void rule__PictureCarousel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:674:1: ( rule__PictureCarousel__Group__1__Impl rule__PictureCarousel__Group__2 )
            // InternalLPDSL.g:675:2: rule__PictureCarousel__Group__1__Impl rule__PictureCarousel__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PictureCarousel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PictureCarousel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PictureCarousel__Group__1"


    // $ANTLR start "rule__PictureCarousel__Group__1__Impl"
    // InternalLPDSL.g:682:1: rule__PictureCarousel__Group__1__Impl : ( ( rule__PictureCarousel__NameAssignment_1 ) ) ;
    public final void rule__PictureCarousel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:686:1: ( ( ( rule__PictureCarousel__NameAssignment_1 ) ) )
            // InternalLPDSL.g:687:1: ( ( rule__PictureCarousel__NameAssignment_1 ) )
            {
            // InternalLPDSL.g:687:1: ( ( rule__PictureCarousel__NameAssignment_1 ) )
            // InternalLPDSL.g:688:2: ( rule__PictureCarousel__NameAssignment_1 )
            {
             before(grammarAccess.getPictureCarouselAccess().getNameAssignment_1()); 
            // InternalLPDSL.g:689:2: ( rule__PictureCarousel__NameAssignment_1 )
            // InternalLPDSL.g:689:3: rule__PictureCarousel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PictureCarousel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPictureCarouselAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PictureCarousel__Group__1__Impl"


    // $ANTLR start "rule__PictureCarousel__Group__2"
    // InternalLPDSL.g:697:1: rule__PictureCarousel__Group__2 : rule__PictureCarousel__Group__2__Impl rule__PictureCarousel__Group__3 ;
    public final void rule__PictureCarousel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:701:1: ( rule__PictureCarousel__Group__2__Impl rule__PictureCarousel__Group__3 )
            // InternalLPDSL.g:702:2: rule__PictureCarousel__Group__2__Impl rule__PictureCarousel__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__PictureCarousel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PictureCarousel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PictureCarousel__Group__2"


    // $ANTLR start "rule__PictureCarousel__Group__2__Impl"
    // InternalLPDSL.g:709:1: rule__PictureCarousel__Group__2__Impl : ( '{' ) ;
    public final void rule__PictureCarousel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:713:1: ( ( '{' ) )
            // InternalLPDSL.g:714:1: ( '{' )
            {
            // InternalLPDSL.g:714:1: ( '{' )
            // InternalLPDSL.g:715:2: '{'
            {
             before(grammarAccess.getPictureCarouselAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPictureCarouselAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PictureCarousel__Group__2__Impl"


    // $ANTLR start "rule__PictureCarousel__Group__3"
    // InternalLPDSL.g:724:1: rule__PictureCarousel__Group__3 : rule__PictureCarousel__Group__3__Impl rule__PictureCarousel__Group__4 ;
    public final void rule__PictureCarousel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:728:1: ( rule__PictureCarousel__Group__3__Impl rule__PictureCarousel__Group__4 )
            // InternalLPDSL.g:729:2: rule__PictureCarousel__Group__3__Impl rule__PictureCarousel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__PictureCarousel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PictureCarousel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PictureCarousel__Group__3"


    // $ANTLR start "rule__PictureCarousel__Group__3__Impl"
    // InternalLPDSL.g:736:1: rule__PictureCarousel__Group__3__Impl : ( ( rule__PictureCarousel__TimerAssignment_3 ) ) ;
    public final void rule__PictureCarousel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:740:1: ( ( ( rule__PictureCarousel__TimerAssignment_3 ) ) )
            // InternalLPDSL.g:741:1: ( ( rule__PictureCarousel__TimerAssignment_3 ) )
            {
            // InternalLPDSL.g:741:1: ( ( rule__PictureCarousel__TimerAssignment_3 ) )
            // InternalLPDSL.g:742:2: ( rule__PictureCarousel__TimerAssignment_3 )
            {
             before(grammarAccess.getPictureCarouselAccess().getTimerAssignment_3()); 
            // InternalLPDSL.g:743:2: ( rule__PictureCarousel__TimerAssignment_3 )
            // InternalLPDSL.g:743:3: rule__PictureCarousel__TimerAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PictureCarousel__TimerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPictureCarouselAccess().getTimerAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PictureCarousel__Group__3__Impl"


    // $ANTLR start "rule__PictureCarousel__Group__4"
    // InternalLPDSL.g:751:1: rule__PictureCarousel__Group__4 : rule__PictureCarousel__Group__4__Impl rule__PictureCarousel__Group__5 ;
    public final void rule__PictureCarousel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:755:1: ( rule__PictureCarousel__Group__4__Impl rule__PictureCarousel__Group__5 )
            // InternalLPDSL.g:756:2: rule__PictureCarousel__Group__4__Impl rule__PictureCarousel__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__PictureCarousel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PictureCarousel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PictureCarousel__Group__4"


    // $ANTLR start "rule__PictureCarousel__Group__4__Impl"
    // InternalLPDSL.g:763:1: rule__PictureCarousel__Group__4__Impl : ( ( rule__PictureCarousel__PictureAssignment_4 )* ) ;
    public final void rule__PictureCarousel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:767:1: ( ( ( rule__PictureCarousel__PictureAssignment_4 )* ) )
            // InternalLPDSL.g:768:1: ( ( rule__PictureCarousel__PictureAssignment_4 )* )
            {
            // InternalLPDSL.g:768:1: ( ( rule__PictureCarousel__PictureAssignment_4 )* )
            // InternalLPDSL.g:769:2: ( rule__PictureCarousel__PictureAssignment_4 )*
            {
             before(grammarAccess.getPictureCarouselAccess().getPictureAssignment_4()); 
            // InternalLPDSL.g:770:2: ( rule__PictureCarousel__PictureAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLPDSL.g:770:3: rule__PictureCarousel__PictureAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__PictureCarousel__PictureAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPictureCarouselAccess().getPictureAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PictureCarousel__Group__4__Impl"


    // $ANTLR start "rule__PictureCarousel__Group__5"
    // InternalLPDSL.g:778:1: rule__PictureCarousel__Group__5 : rule__PictureCarousel__Group__5__Impl ;
    public final void rule__PictureCarousel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:782:1: ( rule__PictureCarousel__Group__5__Impl )
            // InternalLPDSL.g:783:2: rule__PictureCarousel__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PictureCarousel__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PictureCarousel__Group__5"


    // $ANTLR start "rule__PictureCarousel__Group__5__Impl"
    // InternalLPDSL.g:789:1: rule__PictureCarousel__Group__5__Impl : ( '}' ) ;
    public final void rule__PictureCarousel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:793:1: ( ( '}' ) )
            // InternalLPDSL.g:794:1: ( '}' )
            {
            // InternalLPDSL.g:794:1: ( '}' )
            // InternalLPDSL.g:795:2: '}'
            {
             before(grammarAccess.getPictureCarouselAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPictureCarouselAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PictureCarousel__Group__5__Impl"


    // $ANTLR start "rule__PageFooter__Group__0"
    // InternalLPDSL.g:805:1: rule__PageFooter__Group__0 : rule__PageFooter__Group__0__Impl rule__PageFooter__Group__1 ;
    public final void rule__PageFooter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:809:1: ( rule__PageFooter__Group__0__Impl rule__PageFooter__Group__1 )
            // InternalLPDSL.g:810:2: rule__PageFooter__Group__0__Impl rule__PageFooter__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PageFooter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageFooter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageFooter__Group__0"


    // $ANTLR start "rule__PageFooter__Group__0__Impl"
    // InternalLPDSL.g:817:1: rule__PageFooter__Group__0__Impl : ( 'footer' ) ;
    public final void rule__PageFooter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:821:1: ( ( 'footer' ) )
            // InternalLPDSL.g:822:1: ( 'footer' )
            {
            // InternalLPDSL.g:822:1: ( 'footer' )
            // InternalLPDSL.g:823:2: 'footer'
            {
             before(grammarAccess.getPageFooterAccess().getFooterKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPageFooterAccess().getFooterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageFooter__Group__0__Impl"


    // $ANTLR start "rule__PageFooter__Group__1"
    // InternalLPDSL.g:832:1: rule__PageFooter__Group__1 : rule__PageFooter__Group__1__Impl rule__PageFooter__Group__2 ;
    public final void rule__PageFooter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:836:1: ( rule__PageFooter__Group__1__Impl rule__PageFooter__Group__2 )
            // InternalLPDSL.g:837:2: rule__PageFooter__Group__1__Impl rule__PageFooter__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PageFooter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageFooter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageFooter__Group__1"


    // $ANTLR start "rule__PageFooter__Group__1__Impl"
    // InternalLPDSL.g:844:1: rule__PageFooter__Group__1__Impl : ( ( rule__PageFooter__NameAssignment_1 ) ) ;
    public final void rule__PageFooter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:848:1: ( ( ( rule__PageFooter__NameAssignment_1 ) ) )
            // InternalLPDSL.g:849:1: ( ( rule__PageFooter__NameAssignment_1 ) )
            {
            // InternalLPDSL.g:849:1: ( ( rule__PageFooter__NameAssignment_1 ) )
            // InternalLPDSL.g:850:2: ( rule__PageFooter__NameAssignment_1 )
            {
             before(grammarAccess.getPageFooterAccess().getNameAssignment_1()); 
            // InternalLPDSL.g:851:2: ( rule__PageFooter__NameAssignment_1 )
            // InternalLPDSL.g:851:3: rule__PageFooter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PageFooter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPageFooterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageFooter__Group__1__Impl"


    // $ANTLR start "rule__PageFooter__Group__2"
    // InternalLPDSL.g:859:1: rule__PageFooter__Group__2 : rule__PageFooter__Group__2__Impl rule__PageFooter__Group__3 ;
    public final void rule__PageFooter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:863:1: ( rule__PageFooter__Group__2__Impl rule__PageFooter__Group__3 )
            // InternalLPDSL.g:864:2: rule__PageFooter__Group__2__Impl rule__PageFooter__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__PageFooter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageFooter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageFooter__Group__2"


    // $ANTLR start "rule__PageFooter__Group__2__Impl"
    // InternalLPDSL.g:871:1: rule__PageFooter__Group__2__Impl : ( '{' ) ;
    public final void rule__PageFooter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:875:1: ( ( '{' ) )
            // InternalLPDSL.g:876:1: ( '{' )
            {
            // InternalLPDSL.g:876:1: ( '{' )
            // InternalLPDSL.g:877:2: '{'
            {
             before(grammarAccess.getPageFooterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPageFooterAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageFooter__Group__2__Impl"


    // $ANTLR start "rule__PageFooter__Group__3"
    // InternalLPDSL.g:886:1: rule__PageFooter__Group__3 : rule__PageFooter__Group__3__Impl rule__PageFooter__Group__4 ;
    public final void rule__PageFooter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:890:1: ( rule__PageFooter__Group__3__Impl rule__PageFooter__Group__4 )
            // InternalLPDSL.g:891:2: rule__PageFooter__Group__3__Impl rule__PageFooter__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__PageFooter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageFooter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageFooter__Group__3"


    // $ANTLR start "rule__PageFooter__Group__3__Impl"
    // InternalLPDSL.g:898:1: rule__PageFooter__Group__3__Impl : ( ( rule__PageFooter__LinksAssignment_3 )* ) ;
    public final void rule__PageFooter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:902:1: ( ( ( rule__PageFooter__LinksAssignment_3 )* ) )
            // InternalLPDSL.g:903:1: ( ( rule__PageFooter__LinksAssignment_3 )* )
            {
            // InternalLPDSL.g:903:1: ( ( rule__PageFooter__LinksAssignment_3 )* )
            // InternalLPDSL.g:904:2: ( rule__PageFooter__LinksAssignment_3 )*
            {
             before(grammarAccess.getPageFooterAccess().getLinksAssignment_3()); 
            // InternalLPDSL.g:905:2: ( rule__PageFooter__LinksAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLPDSL.g:905:3: rule__PageFooter__LinksAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__PageFooter__LinksAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPageFooterAccess().getLinksAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageFooter__Group__3__Impl"


    // $ANTLR start "rule__PageFooter__Group__4"
    // InternalLPDSL.g:913:1: rule__PageFooter__Group__4 : rule__PageFooter__Group__4__Impl ;
    public final void rule__PageFooter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:917:1: ( rule__PageFooter__Group__4__Impl )
            // InternalLPDSL.g:918:2: rule__PageFooter__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PageFooter__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageFooter__Group__4"


    // $ANTLR start "rule__PageFooter__Group__4__Impl"
    // InternalLPDSL.g:924:1: rule__PageFooter__Group__4__Impl : ( '}' ) ;
    public final void rule__PageFooter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:928:1: ( ( '}' ) )
            // InternalLPDSL.g:929:1: ( '}' )
            {
            // InternalLPDSL.g:929:1: ( '}' )
            // InternalLPDSL.g:930:2: '}'
            {
             before(grammarAccess.getPageFooterAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPageFooterAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageFooter__Group__4__Impl"


    // $ANTLR start "rule__LinkItem__Group__0"
    // InternalLPDSL.g:940:1: rule__LinkItem__Group__0 : rule__LinkItem__Group__0__Impl rule__LinkItem__Group__1 ;
    public final void rule__LinkItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:944:1: ( rule__LinkItem__Group__0__Impl rule__LinkItem__Group__1 )
            // InternalLPDSL.g:945:2: rule__LinkItem__Group__0__Impl rule__LinkItem__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LinkItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkItem__Group__0"


    // $ANTLR start "rule__LinkItem__Group__0__Impl"
    // InternalLPDSL.g:952:1: rule__LinkItem__Group__0__Impl : ( 'link' ) ;
    public final void rule__LinkItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:956:1: ( ( 'link' ) )
            // InternalLPDSL.g:957:1: ( 'link' )
            {
            // InternalLPDSL.g:957:1: ( 'link' )
            // InternalLPDSL.g:958:2: 'link'
            {
             before(grammarAccess.getLinkItemAccess().getLinkKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLinkItemAccess().getLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkItem__Group__0__Impl"


    // $ANTLR start "rule__LinkItem__Group__1"
    // InternalLPDSL.g:967:1: rule__LinkItem__Group__1 : rule__LinkItem__Group__1__Impl rule__LinkItem__Group__2 ;
    public final void rule__LinkItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:971:1: ( rule__LinkItem__Group__1__Impl rule__LinkItem__Group__2 )
            // InternalLPDSL.g:972:2: rule__LinkItem__Group__1__Impl rule__LinkItem__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__LinkItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkItem__Group__1"


    // $ANTLR start "rule__LinkItem__Group__1__Impl"
    // InternalLPDSL.g:979:1: rule__LinkItem__Group__1__Impl : ( ( rule__LinkItem__NameAssignment_1 ) ) ;
    public final void rule__LinkItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:983:1: ( ( ( rule__LinkItem__NameAssignment_1 ) ) )
            // InternalLPDSL.g:984:1: ( ( rule__LinkItem__NameAssignment_1 ) )
            {
            // InternalLPDSL.g:984:1: ( ( rule__LinkItem__NameAssignment_1 ) )
            // InternalLPDSL.g:985:2: ( rule__LinkItem__NameAssignment_1 )
            {
             before(grammarAccess.getLinkItemAccess().getNameAssignment_1()); 
            // InternalLPDSL.g:986:2: ( rule__LinkItem__NameAssignment_1 )
            // InternalLPDSL.g:986:3: rule__LinkItem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LinkItem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkItemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkItem__Group__1__Impl"


    // $ANTLR start "rule__LinkItem__Group__2"
    // InternalLPDSL.g:994:1: rule__LinkItem__Group__2 : rule__LinkItem__Group__2__Impl rule__LinkItem__Group__3 ;
    public final void rule__LinkItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:998:1: ( rule__LinkItem__Group__2__Impl rule__LinkItem__Group__3 )
            // InternalLPDSL.g:999:2: rule__LinkItem__Group__2__Impl rule__LinkItem__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__LinkItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkItem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkItem__Group__2"


    // $ANTLR start "rule__LinkItem__Group__2__Impl"
    // InternalLPDSL.g:1006:1: rule__LinkItem__Group__2__Impl : ( '{' ) ;
    public final void rule__LinkItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1010:1: ( ( '{' ) )
            // InternalLPDSL.g:1011:1: ( '{' )
            {
            // InternalLPDSL.g:1011:1: ( '{' )
            // InternalLPDSL.g:1012:2: '{'
            {
             before(grammarAccess.getLinkItemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLinkItemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkItem__Group__2__Impl"


    // $ANTLR start "rule__LinkItem__Group__3"
    // InternalLPDSL.g:1021:1: rule__LinkItem__Group__3 : rule__LinkItem__Group__3__Impl rule__LinkItem__Group__4 ;
    public final void rule__LinkItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1025:1: ( rule__LinkItem__Group__3__Impl rule__LinkItem__Group__4 )
            // InternalLPDSL.g:1026:2: rule__LinkItem__Group__3__Impl rule__LinkItem__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__LinkItem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkItem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkItem__Group__3"


    // $ANTLR start "rule__LinkItem__Group__3__Impl"
    // InternalLPDSL.g:1033:1: rule__LinkItem__Group__3__Impl : ( ( rule__LinkItem__TextAssignment_3 ) ) ;
    public final void rule__LinkItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1037:1: ( ( ( rule__LinkItem__TextAssignment_3 ) ) )
            // InternalLPDSL.g:1038:1: ( ( rule__LinkItem__TextAssignment_3 ) )
            {
            // InternalLPDSL.g:1038:1: ( ( rule__LinkItem__TextAssignment_3 ) )
            // InternalLPDSL.g:1039:2: ( rule__LinkItem__TextAssignment_3 )
            {
             before(grammarAccess.getLinkItemAccess().getTextAssignment_3()); 
            // InternalLPDSL.g:1040:2: ( rule__LinkItem__TextAssignment_3 )
            // InternalLPDSL.g:1040:3: rule__LinkItem__TextAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LinkItem__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLinkItemAccess().getTextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkItem__Group__3__Impl"


    // $ANTLR start "rule__LinkItem__Group__4"
    // InternalLPDSL.g:1048:1: rule__LinkItem__Group__4 : rule__LinkItem__Group__4__Impl rule__LinkItem__Group__5 ;
    public final void rule__LinkItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1052:1: ( rule__LinkItem__Group__4__Impl rule__LinkItem__Group__5 )
            // InternalLPDSL.g:1053:2: rule__LinkItem__Group__4__Impl rule__LinkItem__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__LinkItem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkItem__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkItem__Group__4"


    // $ANTLR start "rule__LinkItem__Group__4__Impl"
    // InternalLPDSL.g:1060:1: rule__LinkItem__Group__4__Impl : ( ( rule__LinkItem__LinkAssignment_4 ) ) ;
    public final void rule__LinkItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1064:1: ( ( ( rule__LinkItem__LinkAssignment_4 ) ) )
            // InternalLPDSL.g:1065:1: ( ( rule__LinkItem__LinkAssignment_4 ) )
            {
            // InternalLPDSL.g:1065:1: ( ( rule__LinkItem__LinkAssignment_4 ) )
            // InternalLPDSL.g:1066:2: ( rule__LinkItem__LinkAssignment_4 )
            {
             before(grammarAccess.getLinkItemAccess().getLinkAssignment_4()); 
            // InternalLPDSL.g:1067:2: ( rule__LinkItem__LinkAssignment_4 )
            // InternalLPDSL.g:1067:3: rule__LinkItem__LinkAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LinkItem__LinkAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLinkItemAccess().getLinkAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkItem__Group__4__Impl"


    // $ANTLR start "rule__LinkItem__Group__5"
    // InternalLPDSL.g:1075:1: rule__LinkItem__Group__5 : rule__LinkItem__Group__5__Impl ;
    public final void rule__LinkItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1079:1: ( rule__LinkItem__Group__5__Impl )
            // InternalLPDSL.g:1080:2: rule__LinkItem__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinkItem__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkItem__Group__5"


    // $ANTLR start "rule__LinkItem__Group__5__Impl"
    // InternalLPDSL.g:1086:1: rule__LinkItem__Group__5__Impl : ( '}' ) ;
    public final void rule__LinkItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1090:1: ( ( '}' ) )
            // InternalLPDSL.g:1091:1: ( '}' )
            {
            // InternalLPDSL.g:1091:1: ( '}' )
            // InternalLPDSL.g:1092:2: '}'
            {
             before(grammarAccess.getLinkItemAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLinkItemAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkItem__Group__5__Impl"


    // $ANTLR start "rule__URL__Group__0"
    // InternalLPDSL.g:1102:1: rule__URL__Group__0 : rule__URL__Group__0__Impl rule__URL__Group__1 ;
    public final void rule__URL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1106:1: ( rule__URL__Group__0__Impl rule__URL__Group__1 )
            // InternalLPDSL.g:1107:2: rule__URL__Group__0__Impl rule__URL__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__URL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__URL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__Group__0"


    // $ANTLR start "rule__URL__Group__0__Impl"
    // InternalLPDSL.g:1114:1: rule__URL__Group__0__Impl : ( ( rule__URL__NameAssignment_0 ) ) ;
    public final void rule__URL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1118:1: ( ( ( rule__URL__NameAssignment_0 ) ) )
            // InternalLPDSL.g:1119:1: ( ( rule__URL__NameAssignment_0 ) )
            {
            // InternalLPDSL.g:1119:1: ( ( rule__URL__NameAssignment_0 ) )
            // InternalLPDSL.g:1120:2: ( rule__URL__NameAssignment_0 )
            {
             before(grammarAccess.getURLAccess().getNameAssignment_0()); 
            // InternalLPDSL.g:1121:2: ( rule__URL__NameAssignment_0 )
            // InternalLPDSL.g:1121:3: rule__URL__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__URL__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getURLAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__Group__0__Impl"


    // $ANTLR start "rule__URL__Group__1"
    // InternalLPDSL.g:1129:1: rule__URL__Group__1 : rule__URL__Group__1__Impl rule__URL__Group__2 ;
    public final void rule__URL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1133:1: ( rule__URL__Group__1__Impl rule__URL__Group__2 )
            // InternalLPDSL.g:1134:2: rule__URL__Group__1__Impl rule__URL__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__URL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__URL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__Group__1"


    // $ANTLR start "rule__URL__Group__1__Impl"
    // InternalLPDSL.g:1141:1: rule__URL__Group__1__Impl : ( ':' ) ;
    public final void rule__URL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1145:1: ( ( ':' ) )
            // InternalLPDSL.g:1146:1: ( ':' )
            {
            // InternalLPDSL.g:1146:1: ( ':' )
            // InternalLPDSL.g:1147:2: ':'
            {
             before(grammarAccess.getURLAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getURLAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__Group__1__Impl"


    // $ANTLR start "rule__URL__Group__2"
    // InternalLPDSL.g:1156:1: rule__URL__Group__2 : rule__URL__Group__2__Impl ;
    public final void rule__URL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1160:1: ( rule__URL__Group__2__Impl )
            // InternalLPDSL.g:1161:2: rule__URL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__URL__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__Group__2"


    // $ANTLR start "rule__URL__Group__2__Impl"
    // InternalLPDSL.g:1167:1: rule__URL__Group__2__Impl : ( ( rule__URL__PathAssignment_2 ) ) ;
    public final void rule__URL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1171:1: ( ( ( rule__URL__PathAssignment_2 ) ) )
            // InternalLPDSL.g:1172:1: ( ( rule__URL__PathAssignment_2 ) )
            {
            // InternalLPDSL.g:1172:1: ( ( rule__URL__PathAssignment_2 ) )
            // InternalLPDSL.g:1173:2: ( rule__URL__PathAssignment_2 )
            {
             before(grammarAccess.getURLAccess().getPathAssignment_2()); 
            // InternalLPDSL.g:1174:2: ( rule__URL__PathAssignment_2 )
            // InternalLPDSL.g:1174:3: rule__URL__PathAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__URL__PathAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getURLAccess().getPathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__Group__2__Impl"


    // $ANTLR start "rule__PageHeader__Group__0"
    // InternalLPDSL.g:1183:1: rule__PageHeader__Group__0 : rule__PageHeader__Group__0__Impl rule__PageHeader__Group__1 ;
    public final void rule__PageHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1187:1: ( rule__PageHeader__Group__0__Impl rule__PageHeader__Group__1 )
            // InternalLPDSL.g:1188:2: rule__PageHeader__Group__0__Impl rule__PageHeader__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PageHeader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageHeader__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageHeader__Group__0"


    // $ANTLR start "rule__PageHeader__Group__0__Impl"
    // InternalLPDSL.g:1195:1: rule__PageHeader__Group__0__Impl : ( 'header' ) ;
    public final void rule__PageHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1199:1: ( ( 'header' ) )
            // InternalLPDSL.g:1200:1: ( 'header' )
            {
            // InternalLPDSL.g:1200:1: ( 'header' )
            // InternalLPDSL.g:1201:2: 'header'
            {
             before(grammarAccess.getPageHeaderAccess().getHeaderKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPageHeaderAccess().getHeaderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageHeader__Group__0__Impl"


    // $ANTLR start "rule__PageHeader__Group__1"
    // InternalLPDSL.g:1210:1: rule__PageHeader__Group__1 : rule__PageHeader__Group__1__Impl rule__PageHeader__Group__2 ;
    public final void rule__PageHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1214:1: ( rule__PageHeader__Group__1__Impl rule__PageHeader__Group__2 )
            // InternalLPDSL.g:1215:2: rule__PageHeader__Group__1__Impl rule__PageHeader__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PageHeader__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageHeader__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageHeader__Group__1"


    // $ANTLR start "rule__PageHeader__Group__1__Impl"
    // InternalLPDSL.g:1222:1: rule__PageHeader__Group__1__Impl : ( ( rule__PageHeader__NameAssignment_1 ) ) ;
    public final void rule__PageHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1226:1: ( ( ( rule__PageHeader__NameAssignment_1 ) ) )
            // InternalLPDSL.g:1227:1: ( ( rule__PageHeader__NameAssignment_1 ) )
            {
            // InternalLPDSL.g:1227:1: ( ( rule__PageHeader__NameAssignment_1 ) )
            // InternalLPDSL.g:1228:2: ( rule__PageHeader__NameAssignment_1 )
            {
             before(grammarAccess.getPageHeaderAccess().getNameAssignment_1()); 
            // InternalLPDSL.g:1229:2: ( rule__PageHeader__NameAssignment_1 )
            // InternalLPDSL.g:1229:3: rule__PageHeader__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PageHeader__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPageHeaderAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageHeader__Group__1__Impl"


    // $ANTLR start "rule__PageHeader__Group__2"
    // InternalLPDSL.g:1237:1: rule__PageHeader__Group__2 : rule__PageHeader__Group__2__Impl rule__PageHeader__Group__3 ;
    public final void rule__PageHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1241:1: ( rule__PageHeader__Group__2__Impl rule__PageHeader__Group__3 )
            // InternalLPDSL.g:1242:2: rule__PageHeader__Group__2__Impl rule__PageHeader__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__PageHeader__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageHeader__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageHeader__Group__2"


    // $ANTLR start "rule__PageHeader__Group__2__Impl"
    // InternalLPDSL.g:1249:1: rule__PageHeader__Group__2__Impl : ( '{' ) ;
    public final void rule__PageHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1253:1: ( ( '{' ) )
            // InternalLPDSL.g:1254:1: ( '{' )
            {
            // InternalLPDSL.g:1254:1: ( '{' )
            // InternalLPDSL.g:1255:2: '{'
            {
             before(grammarAccess.getPageHeaderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPageHeaderAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageHeader__Group__2__Impl"


    // $ANTLR start "rule__PageHeader__Group__3"
    // InternalLPDSL.g:1264:1: rule__PageHeader__Group__3 : rule__PageHeader__Group__3__Impl rule__PageHeader__Group__4 ;
    public final void rule__PageHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1268:1: ( rule__PageHeader__Group__3__Impl rule__PageHeader__Group__4 )
            // InternalLPDSL.g:1269:2: rule__PageHeader__Group__3__Impl rule__PageHeader__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__PageHeader__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageHeader__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageHeader__Group__3"


    // $ANTLR start "rule__PageHeader__Group__3__Impl"
    // InternalLPDSL.g:1276:1: rule__PageHeader__Group__3__Impl : ( ( rule__PageHeader__TitleAssignment_3 ) ) ;
    public final void rule__PageHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1280:1: ( ( ( rule__PageHeader__TitleAssignment_3 ) ) )
            // InternalLPDSL.g:1281:1: ( ( rule__PageHeader__TitleAssignment_3 ) )
            {
            // InternalLPDSL.g:1281:1: ( ( rule__PageHeader__TitleAssignment_3 ) )
            // InternalLPDSL.g:1282:2: ( rule__PageHeader__TitleAssignment_3 )
            {
             before(grammarAccess.getPageHeaderAccess().getTitleAssignment_3()); 
            // InternalLPDSL.g:1283:2: ( rule__PageHeader__TitleAssignment_3 )
            // InternalLPDSL.g:1283:3: rule__PageHeader__TitleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PageHeader__TitleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPageHeaderAccess().getTitleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageHeader__Group__3__Impl"


    // $ANTLR start "rule__PageHeader__Group__4"
    // InternalLPDSL.g:1291:1: rule__PageHeader__Group__4 : rule__PageHeader__Group__4__Impl rule__PageHeader__Group__5 ;
    public final void rule__PageHeader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1295:1: ( rule__PageHeader__Group__4__Impl rule__PageHeader__Group__5 )
            // InternalLPDSL.g:1296:2: rule__PageHeader__Group__4__Impl rule__PageHeader__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__PageHeader__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageHeader__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageHeader__Group__4"


    // $ANTLR start "rule__PageHeader__Group__4__Impl"
    // InternalLPDSL.g:1303:1: rule__PageHeader__Group__4__Impl : ( ( rule__PageHeader__TabsAssignment_4 )* ) ;
    public final void rule__PageHeader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1307:1: ( ( ( rule__PageHeader__TabsAssignment_4 )* ) )
            // InternalLPDSL.g:1308:1: ( ( rule__PageHeader__TabsAssignment_4 )* )
            {
            // InternalLPDSL.g:1308:1: ( ( rule__PageHeader__TabsAssignment_4 )* )
            // InternalLPDSL.g:1309:2: ( rule__PageHeader__TabsAssignment_4 )*
            {
             before(grammarAccess.getPageHeaderAccess().getTabsAssignment_4()); 
            // InternalLPDSL.g:1310:2: ( rule__PageHeader__TabsAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLPDSL.g:1310:3: rule__PageHeader__TabsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__PageHeader__TabsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPageHeaderAccess().getTabsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageHeader__Group__4__Impl"


    // $ANTLR start "rule__PageHeader__Group__5"
    // InternalLPDSL.g:1318:1: rule__PageHeader__Group__5 : rule__PageHeader__Group__5__Impl ;
    public final void rule__PageHeader__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1322:1: ( rule__PageHeader__Group__5__Impl )
            // InternalLPDSL.g:1323:2: rule__PageHeader__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PageHeader__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageHeader__Group__5"


    // $ANTLR start "rule__PageHeader__Group__5__Impl"
    // InternalLPDSL.g:1329:1: rule__PageHeader__Group__5__Impl : ( '}' ) ;
    public final void rule__PageHeader__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1333:1: ( ( '}' ) )
            // InternalLPDSL.g:1334:1: ( '}' )
            {
            // InternalLPDSL.g:1334:1: ( '}' )
            // InternalLPDSL.g:1335:2: '}'
            {
             before(grammarAccess.getPageHeaderAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPageHeaderAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageHeader__Group__5__Impl"


    // $ANTLR start "rule__TabItems__Group__0"
    // InternalLPDSL.g:1345:1: rule__TabItems__Group__0 : rule__TabItems__Group__0__Impl rule__TabItems__Group__1 ;
    public final void rule__TabItems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1349:1: ( rule__TabItems__Group__0__Impl rule__TabItems__Group__1 )
            // InternalLPDSL.g:1350:2: rule__TabItems__Group__0__Impl rule__TabItems__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__TabItems__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TabItems__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabItems__Group__0"


    // $ANTLR start "rule__TabItems__Group__0__Impl"
    // InternalLPDSL.g:1357:1: rule__TabItems__Group__0__Impl : ( ( rule__TabItems__NameAssignment_0 ) ) ;
    public final void rule__TabItems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1361:1: ( ( ( rule__TabItems__NameAssignment_0 ) ) )
            // InternalLPDSL.g:1362:1: ( ( rule__TabItems__NameAssignment_0 ) )
            {
            // InternalLPDSL.g:1362:1: ( ( rule__TabItems__NameAssignment_0 ) )
            // InternalLPDSL.g:1363:2: ( rule__TabItems__NameAssignment_0 )
            {
             before(grammarAccess.getTabItemsAccess().getNameAssignment_0()); 
            // InternalLPDSL.g:1364:2: ( rule__TabItems__NameAssignment_0 )
            // InternalLPDSL.g:1364:3: rule__TabItems__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TabItems__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTabItemsAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabItems__Group__0__Impl"


    // $ANTLR start "rule__TabItems__Group__1"
    // InternalLPDSL.g:1372:1: rule__TabItems__Group__1 : rule__TabItems__Group__1__Impl rule__TabItems__Group__2 ;
    public final void rule__TabItems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1376:1: ( rule__TabItems__Group__1__Impl rule__TabItems__Group__2 )
            // InternalLPDSL.g:1377:2: rule__TabItems__Group__1__Impl rule__TabItems__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__TabItems__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TabItems__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabItems__Group__1"


    // $ANTLR start "rule__TabItems__Group__1__Impl"
    // InternalLPDSL.g:1384:1: rule__TabItems__Group__1__Impl : ( ':' ) ;
    public final void rule__TabItems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1388:1: ( ( ':' ) )
            // InternalLPDSL.g:1389:1: ( ':' )
            {
            // InternalLPDSL.g:1389:1: ( ':' )
            // InternalLPDSL.g:1390:2: ':'
            {
             before(grammarAccess.getTabItemsAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTabItemsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabItems__Group__1__Impl"


    // $ANTLR start "rule__TabItems__Group__2"
    // InternalLPDSL.g:1399:1: rule__TabItems__Group__2 : rule__TabItems__Group__2__Impl ;
    public final void rule__TabItems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1403:1: ( rule__TabItems__Group__2__Impl )
            // InternalLPDSL.g:1404:2: rule__TabItems__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TabItems__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabItems__Group__2"


    // $ANTLR start "rule__TabItems__Group__2__Impl"
    // InternalLPDSL.g:1410:1: rule__TabItems__Group__2__Impl : ( ( rule__TabItems__DescriptionAssignment_2 ) ) ;
    public final void rule__TabItems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1414:1: ( ( ( rule__TabItems__DescriptionAssignment_2 ) ) )
            // InternalLPDSL.g:1415:1: ( ( rule__TabItems__DescriptionAssignment_2 ) )
            {
            // InternalLPDSL.g:1415:1: ( ( rule__TabItems__DescriptionAssignment_2 ) )
            // InternalLPDSL.g:1416:2: ( rule__TabItems__DescriptionAssignment_2 )
            {
             before(grammarAccess.getTabItemsAccess().getDescriptionAssignment_2()); 
            // InternalLPDSL.g:1417:2: ( rule__TabItems__DescriptionAssignment_2 )
            // InternalLPDSL.g:1417:3: rule__TabItems__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TabItems__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTabItemsAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabItems__Group__2__Impl"


    // $ANTLR start "rule__PageBody__Group__0"
    // InternalLPDSL.g:1426:1: rule__PageBody__Group__0 : rule__PageBody__Group__0__Impl rule__PageBody__Group__1 ;
    public final void rule__PageBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1430:1: ( rule__PageBody__Group__0__Impl rule__PageBody__Group__1 )
            // InternalLPDSL.g:1431:2: rule__PageBody__Group__0__Impl rule__PageBody__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PageBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageBody__Group__0"


    // $ANTLR start "rule__PageBody__Group__0__Impl"
    // InternalLPDSL.g:1438:1: rule__PageBody__Group__0__Impl : ( 'body' ) ;
    public final void rule__PageBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1442:1: ( ( 'body' ) )
            // InternalLPDSL.g:1443:1: ( 'body' )
            {
            // InternalLPDSL.g:1443:1: ( 'body' )
            // InternalLPDSL.g:1444:2: 'body'
            {
             before(grammarAccess.getPageBodyAccess().getBodyKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPageBodyAccess().getBodyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageBody__Group__0__Impl"


    // $ANTLR start "rule__PageBody__Group__1"
    // InternalLPDSL.g:1453:1: rule__PageBody__Group__1 : rule__PageBody__Group__1__Impl rule__PageBody__Group__2 ;
    public final void rule__PageBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1457:1: ( rule__PageBody__Group__1__Impl rule__PageBody__Group__2 )
            // InternalLPDSL.g:1458:2: rule__PageBody__Group__1__Impl rule__PageBody__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PageBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageBody__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageBody__Group__1"


    // $ANTLR start "rule__PageBody__Group__1__Impl"
    // InternalLPDSL.g:1465:1: rule__PageBody__Group__1__Impl : ( ( rule__PageBody__NameAssignment_1 ) ) ;
    public final void rule__PageBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1469:1: ( ( ( rule__PageBody__NameAssignment_1 ) ) )
            // InternalLPDSL.g:1470:1: ( ( rule__PageBody__NameAssignment_1 ) )
            {
            // InternalLPDSL.g:1470:1: ( ( rule__PageBody__NameAssignment_1 ) )
            // InternalLPDSL.g:1471:2: ( rule__PageBody__NameAssignment_1 )
            {
             before(grammarAccess.getPageBodyAccess().getNameAssignment_1()); 
            // InternalLPDSL.g:1472:2: ( rule__PageBody__NameAssignment_1 )
            // InternalLPDSL.g:1472:3: rule__PageBody__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PageBody__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPageBodyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageBody__Group__1__Impl"


    // $ANTLR start "rule__PageBody__Group__2"
    // InternalLPDSL.g:1480:1: rule__PageBody__Group__2 : rule__PageBody__Group__2__Impl rule__PageBody__Group__3 ;
    public final void rule__PageBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1484:1: ( rule__PageBody__Group__2__Impl rule__PageBody__Group__3 )
            // InternalLPDSL.g:1485:2: rule__PageBody__Group__2__Impl rule__PageBody__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__PageBody__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageBody__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageBody__Group__2"


    // $ANTLR start "rule__PageBody__Group__2__Impl"
    // InternalLPDSL.g:1492:1: rule__PageBody__Group__2__Impl : ( '{' ) ;
    public final void rule__PageBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1496:1: ( ( '{' ) )
            // InternalLPDSL.g:1497:1: ( '{' )
            {
            // InternalLPDSL.g:1497:1: ( '{' )
            // InternalLPDSL.g:1498:2: '{'
            {
             before(grammarAccess.getPageBodyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPageBodyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageBody__Group__2__Impl"


    // $ANTLR start "rule__PageBody__Group__3"
    // InternalLPDSL.g:1507:1: rule__PageBody__Group__3 : rule__PageBody__Group__3__Impl rule__PageBody__Group__4 ;
    public final void rule__PageBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1511:1: ( rule__PageBody__Group__3__Impl rule__PageBody__Group__4 )
            // InternalLPDSL.g:1512:2: rule__PageBody__Group__3__Impl rule__PageBody__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__PageBody__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageBody__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageBody__Group__3"


    // $ANTLR start "rule__PageBody__Group__3__Impl"
    // InternalLPDSL.g:1519:1: rule__PageBody__Group__3__Impl : ( ( rule__PageBody__SectionsAssignment_3 )* ) ;
    public final void rule__PageBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1523:1: ( ( ( rule__PageBody__SectionsAssignment_3 )* ) )
            // InternalLPDSL.g:1524:1: ( ( rule__PageBody__SectionsAssignment_3 )* )
            {
            // InternalLPDSL.g:1524:1: ( ( rule__PageBody__SectionsAssignment_3 )* )
            // InternalLPDSL.g:1525:2: ( rule__PageBody__SectionsAssignment_3 )*
            {
             before(grammarAccess.getPageBodyAccess().getSectionsAssignment_3()); 
            // InternalLPDSL.g:1526:2: ( rule__PageBody__SectionsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==11||(LA7_0>=19 && LA7_0<=22)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLPDSL.g:1526:3: rule__PageBody__SectionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__PageBody__SectionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPageBodyAccess().getSectionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageBody__Group__3__Impl"


    // $ANTLR start "rule__PageBody__Group__4"
    // InternalLPDSL.g:1534:1: rule__PageBody__Group__4 : rule__PageBody__Group__4__Impl ;
    public final void rule__PageBody__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1538:1: ( rule__PageBody__Group__4__Impl )
            // InternalLPDSL.g:1539:2: rule__PageBody__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PageBody__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageBody__Group__4"


    // $ANTLR start "rule__PageBody__Group__4__Impl"
    // InternalLPDSL.g:1545:1: rule__PageBody__Group__4__Impl : ( '}' ) ;
    public final void rule__PageBody__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1549:1: ( ( '}' ) )
            // InternalLPDSL.g:1550:1: ( '}' )
            {
            // InternalLPDSL.g:1550:1: ( '}' )
            // InternalLPDSL.g:1551:2: '}'
            {
             before(grammarAccess.getPageBodyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPageBodyAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageBody__Group__4__Impl"


    // $ANTLR start "rule__Links__Group__0"
    // InternalLPDSL.g:1561:1: rule__Links__Group__0 : rule__Links__Group__0__Impl rule__Links__Group__1 ;
    public final void rule__Links__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1565:1: ( rule__Links__Group__0__Impl rule__Links__Group__1 )
            // InternalLPDSL.g:1566:2: rule__Links__Group__0__Impl rule__Links__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Links__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Links__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Links__Group__0"


    // $ANTLR start "rule__Links__Group__0__Impl"
    // InternalLPDSL.g:1573:1: rule__Links__Group__0__Impl : ( 'links' ) ;
    public final void rule__Links__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1577:1: ( ( 'links' ) )
            // InternalLPDSL.g:1578:1: ( 'links' )
            {
            // InternalLPDSL.g:1578:1: ( 'links' )
            // InternalLPDSL.g:1579:2: 'links'
            {
             before(grammarAccess.getLinksAccess().getLinksKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLinksAccess().getLinksKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Links__Group__0__Impl"


    // $ANTLR start "rule__Links__Group__1"
    // InternalLPDSL.g:1588:1: rule__Links__Group__1 : rule__Links__Group__1__Impl rule__Links__Group__2 ;
    public final void rule__Links__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1592:1: ( rule__Links__Group__1__Impl rule__Links__Group__2 )
            // InternalLPDSL.g:1593:2: rule__Links__Group__1__Impl rule__Links__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Links__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Links__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Links__Group__1"


    // $ANTLR start "rule__Links__Group__1__Impl"
    // InternalLPDSL.g:1600:1: rule__Links__Group__1__Impl : ( ( rule__Links__NameAssignment_1 ) ) ;
    public final void rule__Links__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1604:1: ( ( ( rule__Links__NameAssignment_1 ) ) )
            // InternalLPDSL.g:1605:1: ( ( rule__Links__NameAssignment_1 ) )
            {
            // InternalLPDSL.g:1605:1: ( ( rule__Links__NameAssignment_1 ) )
            // InternalLPDSL.g:1606:2: ( rule__Links__NameAssignment_1 )
            {
             before(grammarAccess.getLinksAccess().getNameAssignment_1()); 
            // InternalLPDSL.g:1607:2: ( rule__Links__NameAssignment_1 )
            // InternalLPDSL.g:1607:3: rule__Links__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Links__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinksAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Links__Group__1__Impl"


    // $ANTLR start "rule__Links__Group__2"
    // InternalLPDSL.g:1615:1: rule__Links__Group__2 : rule__Links__Group__2__Impl rule__Links__Group__3 ;
    public final void rule__Links__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1619:1: ( rule__Links__Group__2__Impl rule__Links__Group__3 )
            // InternalLPDSL.g:1620:2: rule__Links__Group__2__Impl rule__Links__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Links__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Links__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Links__Group__2"


    // $ANTLR start "rule__Links__Group__2__Impl"
    // InternalLPDSL.g:1627:1: rule__Links__Group__2__Impl : ( '{' ) ;
    public final void rule__Links__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1631:1: ( ( '{' ) )
            // InternalLPDSL.g:1632:1: ( '{' )
            {
            // InternalLPDSL.g:1632:1: ( '{' )
            // InternalLPDSL.g:1633:2: '{'
            {
             before(grammarAccess.getLinksAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLinksAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Links__Group__2__Impl"


    // $ANTLR start "rule__Links__Group__3"
    // InternalLPDSL.g:1642:1: rule__Links__Group__3 : rule__Links__Group__3__Impl rule__Links__Group__4 ;
    public final void rule__Links__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1646:1: ( rule__Links__Group__3__Impl rule__Links__Group__4 )
            // InternalLPDSL.g:1647:2: rule__Links__Group__3__Impl rule__Links__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Links__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Links__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Links__Group__3"


    // $ANTLR start "rule__Links__Group__3__Impl"
    // InternalLPDSL.g:1654:1: rule__Links__Group__3__Impl : ( ( rule__Links__LinksAssignment_3 )* ) ;
    public final void rule__Links__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1658:1: ( ( ( rule__Links__LinksAssignment_3 )* ) )
            // InternalLPDSL.g:1659:1: ( ( rule__Links__LinksAssignment_3 )* )
            {
            // InternalLPDSL.g:1659:1: ( ( rule__Links__LinksAssignment_3 )* )
            // InternalLPDSL.g:1660:2: ( rule__Links__LinksAssignment_3 )*
            {
             before(grammarAccess.getLinksAccess().getLinksAssignment_3()); 
            // InternalLPDSL.g:1661:2: ( rule__Links__LinksAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLPDSL.g:1661:3: rule__Links__LinksAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Links__LinksAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getLinksAccess().getLinksAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Links__Group__3__Impl"


    // $ANTLR start "rule__Links__Group__4"
    // InternalLPDSL.g:1669:1: rule__Links__Group__4 : rule__Links__Group__4__Impl ;
    public final void rule__Links__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1673:1: ( rule__Links__Group__4__Impl )
            // InternalLPDSL.g:1674:2: rule__Links__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Links__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Links__Group__4"


    // $ANTLR start "rule__Links__Group__4__Impl"
    // InternalLPDSL.g:1680:1: rule__Links__Group__4__Impl : ( '}' ) ;
    public final void rule__Links__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1684:1: ( ( '}' ) )
            // InternalLPDSL.g:1685:1: ( '}' )
            {
            // InternalLPDSL.g:1685:1: ( '}' )
            // InternalLPDSL.g:1686:2: '}'
            {
             before(grammarAccess.getLinksAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLinksAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Links__Group__4__Impl"


    // $ANTLR start "rule__ContactInformation__Group__0"
    // InternalLPDSL.g:1696:1: rule__ContactInformation__Group__0 : rule__ContactInformation__Group__0__Impl rule__ContactInformation__Group__1 ;
    public final void rule__ContactInformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1700:1: ( rule__ContactInformation__Group__0__Impl rule__ContactInformation__Group__1 )
            // InternalLPDSL.g:1701:2: rule__ContactInformation__Group__0__Impl rule__ContactInformation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ContactInformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContactInformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactInformation__Group__0"


    // $ANTLR start "rule__ContactInformation__Group__0__Impl"
    // InternalLPDSL.g:1708:1: rule__ContactInformation__Group__0__Impl : ( 'contactinfo' ) ;
    public final void rule__ContactInformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1712:1: ( ( 'contactinfo' ) )
            // InternalLPDSL.g:1713:1: ( 'contactinfo' )
            {
            // InternalLPDSL.g:1713:1: ( 'contactinfo' )
            // InternalLPDSL.g:1714:2: 'contactinfo'
            {
             before(grammarAccess.getContactInformationAccess().getContactinfoKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getContactInformationAccess().getContactinfoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactInformation__Group__0__Impl"


    // $ANTLR start "rule__ContactInformation__Group__1"
    // InternalLPDSL.g:1723:1: rule__ContactInformation__Group__1 : rule__ContactInformation__Group__1__Impl rule__ContactInformation__Group__2 ;
    public final void rule__ContactInformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1727:1: ( rule__ContactInformation__Group__1__Impl rule__ContactInformation__Group__2 )
            // InternalLPDSL.g:1728:2: rule__ContactInformation__Group__1__Impl rule__ContactInformation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ContactInformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContactInformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactInformation__Group__1"


    // $ANTLR start "rule__ContactInformation__Group__1__Impl"
    // InternalLPDSL.g:1735:1: rule__ContactInformation__Group__1__Impl : ( ( rule__ContactInformation__NameAssignment_1 ) ) ;
    public final void rule__ContactInformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1739:1: ( ( ( rule__ContactInformation__NameAssignment_1 ) ) )
            // InternalLPDSL.g:1740:1: ( ( rule__ContactInformation__NameAssignment_1 ) )
            {
            // InternalLPDSL.g:1740:1: ( ( rule__ContactInformation__NameAssignment_1 ) )
            // InternalLPDSL.g:1741:2: ( rule__ContactInformation__NameAssignment_1 )
            {
             before(grammarAccess.getContactInformationAccess().getNameAssignment_1()); 
            // InternalLPDSL.g:1742:2: ( rule__ContactInformation__NameAssignment_1 )
            // InternalLPDSL.g:1742:3: rule__ContactInformation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ContactInformation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContactInformationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactInformation__Group__1__Impl"


    // $ANTLR start "rule__ContactInformation__Group__2"
    // InternalLPDSL.g:1750:1: rule__ContactInformation__Group__2 : rule__ContactInformation__Group__2__Impl rule__ContactInformation__Group__3 ;
    public final void rule__ContactInformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1754:1: ( rule__ContactInformation__Group__2__Impl rule__ContactInformation__Group__3 )
            // InternalLPDSL.g:1755:2: rule__ContactInformation__Group__2__Impl rule__ContactInformation__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ContactInformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContactInformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactInformation__Group__2"


    // $ANTLR start "rule__ContactInformation__Group__2__Impl"
    // InternalLPDSL.g:1762:1: rule__ContactInformation__Group__2__Impl : ( '{' ) ;
    public final void rule__ContactInformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1766:1: ( ( '{' ) )
            // InternalLPDSL.g:1767:1: ( '{' )
            {
            // InternalLPDSL.g:1767:1: ( '{' )
            // InternalLPDSL.g:1768:2: '{'
            {
             before(grammarAccess.getContactInformationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getContactInformationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactInformation__Group__2__Impl"


    // $ANTLR start "rule__ContactInformation__Group__3"
    // InternalLPDSL.g:1777:1: rule__ContactInformation__Group__3 : rule__ContactInformation__Group__3__Impl ;
    public final void rule__ContactInformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1781:1: ( rule__ContactInformation__Group__3__Impl )
            // InternalLPDSL.g:1782:2: rule__ContactInformation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContactInformation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactInformation__Group__3"


    // $ANTLR start "rule__ContactInformation__Group__3__Impl"
    // InternalLPDSL.g:1788:1: rule__ContactInformation__Group__3__Impl : ( '}' ) ;
    public final void rule__ContactInformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1792:1: ( ( '}' ) )
            // InternalLPDSL.g:1793:1: ( '}' )
            {
            // InternalLPDSL.g:1793:1: ( '}' )
            // InternalLPDSL.g:1794:2: '}'
            {
             before(grammarAccess.getContactInformationAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getContactInformationAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactInformation__Group__3__Impl"


    // $ANTLR start "rule__Resume__Group__0"
    // InternalLPDSL.g:1804:1: rule__Resume__Group__0 : rule__Resume__Group__0__Impl rule__Resume__Group__1 ;
    public final void rule__Resume__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1808:1: ( rule__Resume__Group__0__Impl rule__Resume__Group__1 )
            // InternalLPDSL.g:1809:2: rule__Resume__Group__0__Impl rule__Resume__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Resume__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resume__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resume__Group__0"


    // $ANTLR start "rule__Resume__Group__0__Impl"
    // InternalLPDSL.g:1816:1: rule__Resume__Group__0__Impl : ( 'resume' ) ;
    public final void rule__Resume__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1820:1: ( ( 'resume' ) )
            // InternalLPDSL.g:1821:1: ( 'resume' )
            {
            // InternalLPDSL.g:1821:1: ( 'resume' )
            // InternalLPDSL.g:1822:2: 'resume'
            {
             before(grammarAccess.getResumeAccess().getResumeKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getResumeAccess().getResumeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resume__Group__0__Impl"


    // $ANTLR start "rule__Resume__Group__1"
    // InternalLPDSL.g:1831:1: rule__Resume__Group__1 : rule__Resume__Group__1__Impl rule__Resume__Group__2 ;
    public final void rule__Resume__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1835:1: ( rule__Resume__Group__1__Impl rule__Resume__Group__2 )
            // InternalLPDSL.g:1836:2: rule__Resume__Group__1__Impl rule__Resume__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Resume__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resume__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resume__Group__1"


    // $ANTLR start "rule__Resume__Group__1__Impl"
    // InternalLPDSL.g:1843:1: rule__Resume__Group__1__Impl : ( ( rule__Resume__NameAssignment_1 ) ) ;
    public final void rule__Resume__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1847:1: ( ( ( rule__Resume__NameAssignment_1 ) ) )
            // InternalLPDSL.g:1848:1: ( ( rule__Resume__NameAssignment_1 ) )
            {
            // InternalLPDSL.g:1848:1: ( ( rule__Resume__NameAssignment_1 ) )
            // InternalLPDSL.g:1849:2: ( rule__Resume__NameAssignment_1 )
            {
             before(grammarAccess.getResumeAccess().getNameAssignment_1()); 
            // InternalLPDSL.g:1850:2: ( rule__Resume__NameAssignment_1 )
            // InternalLPDSL.g:1850:3: rule__Resume__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Resume__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResumeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resume__Group__1__Impl"


    // $ANTLR start "rule__Resume__Group__2"
    // InternalLPDSL.g:1858:1: rule__Resume__Group__2 : rule__Resume__Group__2__Impl rule__Resume__Group__3 ;
    public final void rule__Resume__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1862:1: ( rule__Resume__Group__2__Impl rule__Resume__Group__3 )
            // InternalLPDSL.g:1863:2: rule__Resume__Group__2__Impl rule__Resume__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Resume__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resume__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resume__Group__2"


    // $ANTLR start "rule__Resume__Group__2__Impl"
    // InternalLPDSL.g:1870:1: rule__Resume__Group__2__Impl : ( '{' ) ;
    public final void rule__Resume__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1874:1: ( ( '{' ) )
            // InternalLPDSL.g:1875:1: ( '{' )
            {
            // InternalLPDSL.g:1875:1: ( '{' )
            // InternalLPDSL.g:1876:2: '{'
            {
             before(grammarAccess.getResumeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getResumeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resume__Group__2__Impl"


    // $ANTLR start "rule__Resume__Group__3"
    // InternalLPDSL.g:1885:1: rule__Resume__Group__3 : rule__Resume__Group__3__Impl rule__Resume__Group__4 ;
    public final void rule__Resume__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1889:1: ( rule__Resume__Group__3__Impl rule__Resume__Group__4 )
            // InternalLPDSL.g:1890:2: rule__Resume__Group__3__Impl rule__Resume__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Resume__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resume__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resume__Group__3"


    // $ANTLR start "rule__Resume__Group__3__Impl"
    // InternalLPDSL.g:1897:1: rule__Resume__Group__3__Impl : ( ( rule__Resume__ResumeitemsAssignment_3 )* ) ;
    public final void rule__Resume__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1901:1: ( ( ( rule__Resume__ResumeitemsAssignment_3 )* ) )
            // InternalLPDSL.g:1902:1: ( ( rule__Resume__ResumeitemsAssignment_3 )* )
            {
            // InternalLPDSL.g:1902:1: ( ( rule__Resume__ResumeitemsAssignment_3 )* )
            // InternalLPDSL.g:1903:2: ( rule__Resume__ResumeitemsAssignment_3 )*
            {
             before(grammarAccess.getResumeAccess().getResumeitemsAssignment_3()); 
            // InternalLPDSL.g:1904:2: ( rule__Resume__ResumeitemsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLPDSL.g:1904:3: rule__Resume__ResumeitemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Resume__ResumeitemsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getResumeAccess().getResumeitemsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resume__Group__3__Impl"


    // $ANTLR start "rule__Resume__Group__4"
    // InternalLPDSL.g:1912:1: rule__Resume__Group__4 : rule__Resume__Group__4__Impl ;
    public final void rule__Resume__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1916:1: ( rule__Resume__Group__4__Impl )
            // InternalLPDSL.g:1917:2: rule__Resume__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resume__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resume__Group__4"


    // $ANTLR start "rule__Resume__Group__4__Impl"
    // InternalLPDSL.g:1923:1: rule__Resume__Group__4__Impl : ( '}' ) ;
    public final void rule__Resume__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1927:1: ( ( '}' ) )
            // InternalLPDSL.g:1928:1: ( '}' )
            {
            // InternalLPDSL.g:1928:1: ( '}' )
            // InternalLPDSL.g:1929:2: '}'
            {
             before(grammarAccess.getResumeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getResumeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resume__Group__4__Impl"


    // $ANTLR start "rule__Items__Group__0"
    // InternalLPDSL.g:1939:1: rule__Items__Group__0 : rule__Items__Group__0__Impl rule__Items__Group__1 ;
    public final void rule__Items__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1943:1: ( rule__Items__Group__0__Impl rule__Items__Group__1 )
            // InternalLPDSL.g:1944:2: rule__Items__Group__0__Impl rule__Items__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Items__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Items__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Items__Group__0"


    // $ANTLR start "rule__Items__Group__0__Impl"
    // InternalLPDSL.g:1951:1: rule__Items__Group__0__Impl : ( ( rule__Items__NameAssignment_0 ) ) ;
    public final void rule__Items__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1955:1: ( ( ( rule__Items__NameAssignment_0 ) ) )
            // InternalLPDSL.g:1956:1: ( ( rule__Items__NameAssignment_0 ) )
            {
            // InternalLPDSL.g:1956:1: ( ( rule__Items__NameAssignment_0 ) )
            // InternalLPDSL.g:1957:2: ( rule__Items__NameAssignment_0 )
            {
             before(grammarAccess.getItemsAccess().getNameAssignment_0()); 
            // InternalLPDSL.g:1958:2: ( rule__Items__NameAssignment_0 )
            // InternalLPDSL.g:1958:3: rule__Items__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Items__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getItemsAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Items__Group__0__Impl"


    // $ANTLR start "rule__Items__Group__1"
    // InternalLPDSL.g:1966:1: rule__Items__Group__1 : rule__Items__Group__1__Impl rule__Items__Group__2 ;
    public final void rule__Items__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1970:1: ( rule__Items__Group__1__Impl rule__Items__Group__2 )
            // InternalLPDSL.g:1971:2: rule__Items__Group__1__Impl rule__Items__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Items__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Items__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Items__Group__1"


    // $ANTLR start "rule__Items__Group__1__Impl"
    // InternalLPDSL.g:1978:1: rule__Items__Group__1__Impl : ( ':' ) ;
    public final void rule__Items__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1982:1: ( ( ':' ) )
            // InternalLPDSL.g:1983:1: ( ':' )
            {
            // InternalLPDSL.g:1983:1: ( ':' )
            // InternalLPDSL.g:1984:2: ':'
            {
             before(grammarAccess.getItemsAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getItemsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Items__Group__1__Impl"


    // $ANTLR start "rule__Items__Group__2"
    // InternalLPDSL.g:1993:1: rule__Items__Group__2 : rule__Items__Group__2__Impl ;
    public final void rule__Items__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1997:1: ( rule__Items__Group__2__Impl )
            // InternalLPDSL.g:1998:2: rule__Items__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Items__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Items__Group__2"


    // $ANTLR start "rule__Items__Group__2__Impl"
    // InternalLPDSL.g:2004:1: rule__Items__Group__2__Impl : ( ( rule__Items__DescriptionAssignment_2 ) ) ;
    public final void rule__Items__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2008:1: ( ( ( rule__Items__DescriptionAssignment_2 ) ) )
            // InternalLPDSL.g:2009:1: ( ( rule__Items__DescriptionAssignment_2 ) )
            {
            // InternalLPDSL.g:2009:1: ( ( rule__Items__DescriptionAssignment_2 ) )
            // InternalLPDSL.g:2010:2: ( rule__Items__DescriptionAssignment_2 )
            {
             before(grammarAccess.getItemsAccess().getDescriptionAssignment_2()); 
            // InternalLPDSL.g:2011:2: ( rule__Items__DescriptionAssignment_2 )
            // InternalLPDSL.g:2011:3: rule__Items__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Items__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getItemsAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Items__Group__2__Impl"


    // $ANTLR start "rule__TimeSpecifier__Group__0"
    // InternalLPDSL.g:2020:1: rule__TimeSpecifier__Group__0 : rule__TimeSpecifier__Group__0__Impl rule__TimeSpecifier__Group__1 ;
    public final void rule__TimeSpecifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2024:1: ( rule__TimeSpecifier__Group__0__Impl rule__TimeSpecifier__Group__1 )
            // InternalLPDSL.g:2025:2: rule__TimeSpecifier__Group__0__Impl rule__TimeSpecifier__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__TimeSpecifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSpecifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSpecifier__Group__0"


    // $ANTLR start "rule__TimeSpecifier__Group__0__Impl"
    // InternalLPDSL.g:2032:1: rule__TimeSpecifier__Group__0__Impl : ( ( rule__TimeSpecifier__NameAssignment_0 ) ) ;
    public final void rule__TimeSpecifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2036:1: ( ( ( rule__TimeSpecifier__NameAssignment_0 ) ) )
            // InternalLPDSL.g:2037:1: ( ( rule__TimeSpecifier__NameAssignment_0 ) )
            {
            // InternalLPDSL.g:2037:1: ( ( rule__TimeSpecifier__NameAssignment_0 ) )
            // InternalLPDSL.g:2038:2: ( rule__TimeSpecifier__NameAssignment_0 )
            {
             before(grammarAccess.getTimeSpecifierAccess().getNameAssignment_0()); 
            // InternalLPDSL.g:2039:2: ( rule__TimeSpecifier__NameAssignment_0 )
            // InternalLPDSL.g:2039:3: rule__TimeSpecifier__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TimeSpecifier__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTimeSpecifierAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSpecifier__Group__0__Impl"


    // $ANTLR start "rule__TimeSpecifier__Group__1"
    // InternalLPDSL.g:2047:1: rule__TimeSpecifier__Group__1 : rule__TimeSpecifier__Group__1__Impl rule__TimeSpecifier__Group__2 ;
    public final void rule__TimeSpecifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2051:1: ( rule__TimeSpecifier__Group__1__Impl rule__TimeSpecifier__Group__2 )
            // InternalLPDSL.g:2052:2: rule__TimeSpecifier__Group__1__Impl rule__TimeSpecifier__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__TimeSpecifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSpecifier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSpecifier__Group__1"


    // $ANTLR start "rule__TimeSpecifier__Group__1__Impl"
    // InternalLPDSL.g:2059:1: rule__TimeSpecifier__Group__1__Impl : ( ':' ) ;
    public final void rule__TimeSpecifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2063:1: ( ( ':' ) )
            // InternalLPDSL.g:2064:1: ( ':' )
            {
            // InternalLPDSL.g:2064:1: ( ':' )
            // InternalLPDSL.g:2065:2: ':'
            {
             before(grammarAccess.getTimeSpecifierAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTimeSpecifierAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSpecifier__Group__1__Impl"


    // $ANTLR start "rule__TimeSpecifier__Group__2"
    // InternalLPDSL.g:2074:1: rule__TimeSpecifier__Group__2 : rule__TimeSpecifier__Group__2__Impl ;
    public final void rule__TimeSpecifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2078:1: ( rule__TimeSpecifier__Group__2__Impl )
            // InternalLPDSL.g:2079:2: rule__TimeSpecifier__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeSpecifier__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSpecifier__Group__2"


    // $ANTLR start "rule__TimeSpecifier__Group__2__Impl"
    // InternalLPDSL.g:2085:1: rule__TimeSpecifier__Group__2__Impl : ( ( rule__TimeSpecifier__TimeAssignment_2 ) ) ;
    public final void rule__TimeSpecifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2089:1: ( ( ( rule__TimeSpecifier__TimeAssignment_2 ) ) )
            // InternalLPDSL.g:2090:1: ( ( rule__TimeSpecifier__TimeAssignment_2 ) )
            {
            // InternalLPDSL.g:2090:1: ( ( rule__TimeSpecifier__TimeAssignment_2 ) )
            // InternalLPDSL.g:2091:2: ( rule__TimeSpecifier__TimeAssignment_2 )
            {
             before(grammarAccess.getTimeSpecifierAccess().getTimeAssignment_2()); 
            // InternalLPDSL.g:2092:2: ( rule__TimeSpecifier__TimeAssignment_2 )
            // InternalLPDSL.g:2092:3: rule__TimeSpecifier__TimeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TimeSpecifier__TimeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTimeSpecifierAccess().getTimeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSpecifier__Group__2__Impl"


    // $ANTLR start "rule__AboutMe__Group__0"
    // InternalLPDSL.g:2101:1: rule__AboutMe__Group__0 : rule__AboutMe__Group__0__Impl rule__AboutMe__Group__1 ;
    public final void rule__AboutMe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2105:1: ( rule__AboutMe__Group__0__Impl rule__AboutMe__Group__1 )
            // InternalLPDSL.g:2106:2: rule__AboutMe__Group__0__Impl rule__AboutMe__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AboutMe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AboutMe__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutMe__Group__0"


    // $ANTLR start "rule__AboutMe__Group__0__Impl"
    // InternalLPDSL.g:2113:1: rule__AboutMe__Group__0__Impl : ( 'aboutme' ) ;
    public final void rule__AboutMe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2117:1: ( ( 'aboutme' ) )
            // InternalLPDSL.g:2118:1: ( 'aboutme' )
            {
            // InternalLPDSL.g:2118:1: ( 'aboutme' )
            // InternalLPDSL.g:2119:2: 'aboutme'
            {
             before(grammarAccess.getAboutMeAccess().getAboutmeKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAboutMeAccess().getAboutmeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutMe__Group__0__Impl"


    // $ANTLR start "rule__AboutMe__Group__1"
    // InternalLPDSL.g:2128:1: rule__AboutMe__Group__1 : rule__AboutMe__Group__1__Impl rule__AboutMe__Group__2 ;
    public final void rule__AboutMe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2132:1: ( rule__AboutMe__Group__1__Impl rule__AboutMe__Group__2 )
            // InternalLPDSL.g:2133:2: rule__AboutMe__Group__1__Impl rule__AboutMe__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AboutMe__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AboutMe__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutMe__Group__1"


    // $ANTLR start "rule__AboutMe__Group__1__Impl"
    // InternalLPDSL.g:2140:1: rule__AboutMe__Group__1__Impl : ( ( rule__AboutMe__NameAssignment_1 ) ) ;
    public final void rule__AboutMe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2144:1: ( ( ( rule__AboutMe__NameAssignment_1 ) ) )
            // InternalLPDSL.g:2145:1: ( ( rule__AboutMe__NameAssignment_1 ) )
            {
            // InternalLPDSL.g:2145:1: ( ( rule__AboutMe__NameAssignment_1 ) )
            // InternalLPDSL.g:2146:2: ( rule__AboutMe__NameAssignment_1 )
            {
             before(grammarAccess.getAboutMeAccess().getNameAssignment_1()); 
            // InternalLPDSL.g:2147:2: ( rule__AboutMe__NameAssignment_1 )
            // InternalLPDSL.g:2147:3: rule__AboutMe__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AboutMe__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAboutMeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutMe__Group__1__Impl"


    // $ANTLR start "rule__AboutMe__Group__2"
    // InternalLPDSL.g:2155:1: rule__AboutMe__Group__2 : rule__AboutMe__Group__2__Impl rule__AboutMe__Group__3 ;
    public final void rule__AboutMe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2159:1: ( rule__AboutMe__Group__2__Impl rule__AboutMe__Group__3 )
            // InternalLPDSL.g:2160:2: rule__AboutMe__Group__2__Impl rule__AboutMe__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__AboutMe__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AboutMe__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutMe__Group__2"


    // $ANTLR start "rule__AboutMe__Group__2__Impl"
    // InternalLPDSL.g:2167:1: rule__AboutMe__Group__2__Impl : ( '{' ) ;
    public final void rule__AboutMe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2171:1: ( ( '{' ) )
            // InternalLPDSL.g:2172:1: ( '{' )
            {
            // InternalLPDSL.g:2172:1: ( '{' )
            // InternalLPDSL.g:2173:2: '{'
            {
             before(grammarAccess.getAboutMeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAboutMeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutMe__Group__2__Impl"


    // $ANTLR start "rule__AboutMe__Group__3"
    // InternalLPDSL.g:2182:1: rule__AboutMe__Group__3 : rule__AboutMe__Group__3__Impl rule__AboutMe__Group__4 ;
    public final void rule__AboutMe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2186:1: ( rule__AboutMe__Group__3__Impl rule__AboutMe__Group__4 )
            // InternalLPDSL.g:2187:2: rule__AboutMe__Group__3__Impl rule__AboutMe__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__AboutMe__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AboutMe__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutMe__Group__3"


    // $ANTLR start "rule__AboutMe__Group__3__Impl"
    // InternalLPDSL.g:2194:1: rule__AboutMe__Group__3__Impl : ( ( rule__AboutMe__PictureAssignment_3 ) ) ;
    public final void rule__AboutMe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2198:1: ( ( ( rule__AboutMe__PictureAssignment_3 ) ) )
            // InternalLPDSL.g:2199:1: ( ( rule__AboutMe__PictureAssignment_3 ) )
            {
            // InternalLPDSL.g:2199:1: ( ( rule__AboutMe__PictureAssignment_3 ) )
            // InternalLPDSL.g:2200:2: ( rule__AboutMe__PictureAssignment_3 )
            {
             before(grammarAccess.getAboutMeAccess().getPictureAssignment_3()); 
            // InternalLPDSL.g:2201:2: ( rule__AboutMe__PictureAssignment_3 )
            // InternalLPDSL.g:2201:3: rule__AboutMe__PictureAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AboutMe__PictureAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAboutMeAccess().getPictureAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutMe__Group__3__Impl"


    // $ANTLR start "rule__AboutMe__Group__4"
    // InternalLPDSL.g:2209:1: rule__AboutMe__Group__4 : rule__AboutMe__Group__4__Impl rule__AboutMe__Group__5 ;
    public final void rule__AboutMe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2213:1: ( rule__AboutMe__Group__4__Impl rule__AboutMe__Group__5 )
            // InternalLPDSL.g:2214:2: rule__AboutMe__Group__4__Impl rule__AboutMe__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__AboutMe__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AboutMe__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutMe__Group__4"


    // $ANTLR start "rule__AboutMe__Group__4__Impl"
    // InternalLPDSL.g:2221:1: rule__AboutMe__Group__4__Impl : ( ( rule__AboutMe__DescriptionAssignment_4 ) ) ;
    public final void rule__AboutMe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2225:1: ( ( ( rule__AboutMe__DescriptionAssignment_4 ) ) )
            // InternalLPDSL.g:2226:1: ( ( rule__AboutMe__DescriptionAssignment_4 ) )
            {
            // InternalLPDSL.g:2226:1: ( ( rule__AboutMe__DescriptionAssignment_4 ) )
            // InternalLPDSL.g:2227:2: ( rule__AboutMe__DescriptionAssignment_4 )
            {
             before(grammarAccess.getAboutMeAccess().getDescriptionAssignment_4()); 
            // InternalLPDSL.g:2228:2: ( rule__AboutMe__DescriptionAssignment_4 )
            // InternalLPDSL.g:2228:3: rule__AboutMe__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AboutMe__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAboutMeAccess().getDescriptionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutMe__Group__4__Impl"


    // $ANTLR start "rule__AboutMe__Group__5"
    // InternalLPDSL.g:2236:1: rule__AboutMe__Group__5 : rule__AboutMe__Group__5__Impl ;
    public final void rule__AboutMe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2240:1: ( rule__AboutMe__Group__5__Impl )
            // InternalLPDSL.g:2241:2: rule__AboutMe__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AboutMe__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutMe__Group__5"


    // $ANTLR start "rule__AboutMe__Group__5__Impl"
    // InternalLPDSL.g:2247:1: rule__AboutMe__Group__5__Impl : ( '}' ) ;
    public final void rule__AboutMe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2251:1: ( ( '}' ) )
            // InternalLPDSL.g:2252:1: ( '}' )
            {
            // InternalLPDSL.g:2252:1: ( '}' )
            // InternalLPDSL.g:2253:2: '}'
            {
             before(grammarAccess.getAboutMeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAboutMeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutMe__Group__5__Impl"


    // $ANTLR start "rule__Picture__Group__0"
    // InternalLPDSL.g:2263:1: rule__Picture__Group__0 : rule__Picture__Group__0__Impl rule__Picture__Group__1 ;
    public final void rule__Picture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2267:1: ( rule__Picture__Group__0__Impl rule__Picture__Group__1 )
            // InternalLPDSL.g:2268:2: rule__Picture__Group__0__Impl rule__Picture__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Picture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__0"


    // $ANTLR start "rule__Picture__Group__0__Impl"
    // InternalLPDSL.g:2275:1: rule__Picture__Group__0__Impl : ( ( rule__Picture__NameAssignment_0 ) ) ;
    public final void rule__Picture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2279:1: ( ( ( rule__Picture__NameAssignment_0 ) ) )
            // InternalLPDSL.g:2280:1: ( ( rule__Picture__NameAssignment_0 ) )
            {
            // InternalLPDSL.g:2280:1: ( ( rule__Picture__NameAssignment_0 ) )
            // InternalLPDSL.g:2281:2: ( rule__Picture__NameAssignment_0 )
            {
             before(grammarAccess.getPictureAccess().getNameAssignment_0()); 
            // InternalLPDSL.g:2282:2: ( rule__Picture__NameAssignment_0 )
            // InternalLPDSL.g:2282:3: rule__Picture__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Picture__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__0__Impl"


    // $ANTLR start "rule__Picture__Group__1"
    // InternalLPDSL.g:2290:1: rule__Picture__Group__1 : rule__Picture__Group__1__Impl rule__Picture__Group__2 ;
    public final void rule__Picture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2294:1: ( rule__Picture__Group__1__Impl rule__Picture__Group__2 )
            // InternalLPDSL.g:2295:2: rule__Picture__Group__1__Impl rule__Picture__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Picture__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__1"


    // $ANTLR start "rule__Picture__Group__1__Impl"
    // InternalLPDSL.g:2302:1: rule__Picture__Group__1__Impl : ( ':' ) ;
    public final void rule__Picture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2306:1: ( ( ':' ) )
            // InternalLPDSL.g:2307:1: ( ':' )
            {
            // InternalLPDSL.g:2307:1: ( ':' )
            // InternalLPDSL.g:2308:2: ':'
            {
             before(grammarAccess.getPictureAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__1__Impl"


    // $ANTLR start "rule__Picture__Group__2"
    // InternalLPDSL.g:2317:1: rule__Picture__Group__2 : rule__Picture__Group__2__Impl ;
    public final void rule__Picture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2321:1: ( rule__Picture__Group__2__Impl )
            // InternalLPDSL.g:2322:2: rule__Picture__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Picture__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__2"


    // $ANTLR start "rule__Picture__Group__2__Impl"
    // InternalLPDSL.g:2328:1: rule__Picture__Group__2__Impl : ( ( rule__Picture__ImagepathAssignment_2 ) ) ;
    public final void rule__Picture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2332:1: ( ( ( rule__Picture__ImagepathAssignment_2 ) ) )
            // InternalLPDSL.g:2333:1: ( ( rule__Picture__ImagepathAssignment_2 ) )
            {
            // InternalLPDSL.g:2333:1: ( ( rule__Picture__ImagepathAssignment_2 ) )
            // InternalLPDSL.g:2334:2: ( rule__Picture__ImagepathAssignment_2 )
            {
             before(grammarAccess.getPictureAccess().getImagepathAssignment_2()); 
            // InternalLPDSL.g:2335:2: ( rule__Picture__ImagepathAssignment_2 )
            // InternalLPDSL.g:2335:3: rule__Picture__ImagepathAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Picture__ImagepathAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getImagepathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__2__Impl"


    // $ANTLR start "rule__LandingPage__PagecomponentAssignment"
    // InternalLPDSL.g:2344:1: rule__LandingPage__PagecomponentAssignment : ( rulePageComponent ) ;
    public final void rule__LandingPage__PagecomponentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2348:1: ( ( rulePageComponent ) )
            // InternalLPDSL.g:2349:2: ( rulePageComponent )
            {
            // InternalLPDSL.g:2349:2: ( rulePageComponent )
            // InternalLPDSL.g:2350:3: rulePageComponent
            {
             before(grammarAccess.getLandingPageAccess().getPagecomponentPageComponentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePageComponent();

            state._fsp--;

             after(grammarAccess.getLandingPageAccess().getPagecomponentPageComponentParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LandingPage__PagecomponentAssignment"


    // $ANTLR start "rule__PictureCarousel__NameAssignment_1"
    // InternalLPDSL.g:2359:1: rule__PictureCarousel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PictureCarousel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2363:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2364:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2364:2: ( RULE_ID )
            // InternalLPDSL.g:2365:3: RULE_ID
            {
             before(grammarAccess.getPictureCarouselAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPictureCarouselAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PictureCarousel__NameAssignment_1"


    // $ANTLR start "rule__PictureCarousel__TimerAssignment_3"
    // InternalLPDSL.g:2374:1: rule__PictureCarousel__TimerAssignment_3 : ( ruleTimeSpecifier ) ;
    public final void rule__PictureCarousel__TimerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2378:1: ( ( ruleTimeSpecifier ) )
            // InternalLPDSL.g:2379:2: ( ruleTimeSpecifier )
            {
            // InternalLPDSL.g:2379:2: ( ruleTimeSpecifier )
            // InternalLPDSL.g:2380:3: ruleTimeSpecifier
            {
             before(grammarAccess.getPictureCarouselAccess().getTimerTimeSpecifierParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeSpecifier();

            state._fsp--;

             after(grammarAccess.getPictureCarouselAccess().getTimerTimeSpecifierParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PictureCarousel__TimerAssignment_3"


    // $ANTLR start "rule__PictureCarousel__PictureAssignment_4"
    // InternalLPDSL.g:2389:1: rule__PictureCarousel__PictureAssignment_4 : ( rulePicture ) ;
    public final void rule__PictureCarousel__PictureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2393:1: ( ( rulePicture ) )
            // InternalLPDSL.g:2394:2: ( rulePicture )
            {
            // InternalLPDSL.g:2394:2: ( rulePicture )
            // InternalLPDSL.g:2395:3: rulePicture
            {
             before(grammarAccess.getPictureCarouselAccess().getPicturePictureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePicture();

            state._fsp--;

             after(grammarAccess.getPictureCarouselAccess().getPicturePictureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PictureCarousel__PictureAssignment_4"


    // $ANTLR start "rule__PageFooter__NameAssignment_1"
    // InternalLPDSL.g:2404:1: rule__PageFooter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PageFooter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2408:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2409:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2409:2: ( RULE_ID )
            // InternalLPDSL.g:2410:3: RULE_ID
            {
             before(grammarAccess.getPageFooterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPageFooterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageFooter__NameAssignment_1"


    // $ANTLR start "rule__PageFooter__LinksAssignment_3"
    // InternalLPDSL.g:2419:1: rule__PageFooter__LinksAssignment_3 : ( ruleLinkItem ) ;
    public final void rule__PageFooter__LinksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2423:1: ( ( ruleLinkItem ) )
            // InternalLPDSL.g:2424:2: ( ruleLinkItem )
            {
            // InternalLPDSL.g:2424:2: ( ruleLinkItem )
            // InternalLPDSL.g:2425:3: ruleLinkItem
            {
             before(grammarAccess.getPageFooterAccess().getLinksLinkItemParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLinkItem();

            state._fsp--;

             after(grammarAccess.getPageFooterAccess().getLinksLinkItemParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageFooter__LinksAssignment_3"


    // $ANTLR start "rule__LinkItem__NameAssignment_1"
    // InternalLPDSL.g:2434:1: rule__LinkItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LinkItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2438:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2439:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2439:2: ( RULE_ID )
            // InternalLPDSL.g:2440:3: RULE_ID
            {
             before(grammarAccess.getLinkItemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkItemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkItem__NameAssignment_1"


    // $ANTLR start "rule__LinkItem__TextAssignment_3"
    // InternalLPDSL.g:2449:1: rule__LinkItem__TextAssignment_3 : ( ruleItems ) ;
    public final void rule__LinkItem__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2453:1: ( ( ruleItems ) )
            // InternalLPDSL.g:2454:2: ( ruleItems )
            {
            // InternalLPDSL.g:2454:2: ( ruleItems )
            // InternalLPDSL.g:2455:3: ruleItems
            {
             before(grammarAccess.getLinkItemAccess().getTextItemsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleItems();

            state._fsp--;

             after(grammarAccess.getLinkItemAccess().getTextItemsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkItem__TextAssignment_3"


    // $ANTLR start "rule__LinkItem__LinkAssignment_4"
    // InternalLPDSL.g:2464:1: rule__LinkItem__LinkAssignment_4 : ( ruleURL ) ;
    public final void rule__LinkItem__LinkAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2468:1: ( ( ruleURL ) )
            // InternalLPDSL.g:2469:2: ( ruleURL )
            {
            // InternalLPDSL.g:2469:2: ( ruleURL )
            // InternalLPDSL.g:2470:3: ruleURL
            {
             before(grammarAccess.getLinkItemAccess().getLinkURLParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleURL();

            state._fsp--;

             after(grammarAccess.getLinkItemAccess().getLinkURLParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkItem__LinkAssignment_4"


    // $ANTLR start "rule__URL__NameAssignment_0"
    // InternalLPDSL.g:2479:1: rule__URL__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__URL__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2483:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2484:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2484:2: ( RULE_ID )
            // InternalLPDSL.g:2485:3: RULE_ID
            {
             before(grammarAccess.getURLAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getURLAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__NameAssignment_0"


    // $ANTLR start "rule__URL__PathAssignment_2"
    // InternalLPDSL.g:2494:1: rule__URL__PathAssignment_2 : ( rulePath ) ;
    public final void rule__URL__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2498:1: ( ( rulePath ) )
            // InternalLPDSL.g:2499:2: ( rulePath )
            {
            // InternalLPDSL.g:2499:2: ( rulePath )
            // InternalLPDSL.g:2500:3: rulePath
            {
             before(grammarAccess.getURLAccess().getPathPathParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;

             after(grammarAccess.getURLAccess().getPathPathParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__PathAssignment_2"


    // $ANTLR start "rule__Path__ValueAssignment"
    // InternalLPDSL.g:2509:1: rule__Path__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Path__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2513:1: ( ( RULE_STRING ) )
            // InternalLPDSL.g:2514:2: ( RULE_STRING )
            {
            // InternalLPDSL.g:2514:2: ( RULE_STRING )
            // InternalLPDSL.g:2515:3: RULE_STRING
            {
             before(grammarAccess.getPathAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPathAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__ValueAssignment"


    // $ANTLR start "rule__PageHeader__NameAssignment_1"
    // InternalLPDSL.g:2524:1: rule__PageHeader__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PageHeader__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2528:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2529:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2529:2: ( RULE_ID )
            // InternalLPDSL.g:2530:3: RULE_ID
            {
             before(grammarAccess.getPageHeaderAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPageHeaderAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageHeader__NameAssignment_1"


    // $ANTLR start "rule__PageHeader__TitleAssignment_3"
    // InternalLPDSL.g:2539:1: rule__PageHeader__TitleAssignment_3 : ( ruleItems ) ;
    public final void rule__PageHeader__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2543:1: ( ( ruleItems ) )
            // InternalLPDSL.g:2544:2: ( ruleItems )
            {
            // InternalLPDSL.g:2544:2: ( ruleItems )
            // InternalLPDSL.g:2545:3: ruleItems
            {
             before(grammarAccess.getPageHeaderAccess().getTitleItemsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleItems();

            state._fsp--;

             after(grammarAccess.getPageHeaderAccess().getTitleItemsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageHeader__TitleAssignment_3"


    // $ANTLR start "rule__PageHeader__TabsAssignment_4"
    // InternalLPDSL.g:2554:1: rule__PageHeader__TabsAssignment_4 : ( ruleTabItems ) ;
    public final void rule__PageHeader__TabsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2558:1: ( ( ruleTabItems ) )
            // InternalLPDSL.g:2559:2: ( ruleTabItems )
            {
            // InternalLPDSL.g:2559:2: ( ruleTabItems )
            // InternalLPDSL.g:2560:3: ruleTabItems
            {
             before(grammarAccess.getPageHeaderAccess().getTabsTabItemsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTabItems();

            state._fsp--;

             after(grammarAccess.getPageHeaderAccess().getTabsTabItemsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageHeader__TabsAssignment_4"


    // $ANTLR start "rule__TabItems__NameAssignment_0"
    // InternalLPDSL.g:2569:1: rule__TabItems__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TabItems__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2573:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2574:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2574:2: ( RULE_ID )
            // InternalLPDSL.g:2575:3: RULE_ID
            {
             before(grammarAccess.getTabItemsAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTabItemsAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabItems__NameAssignment_0"


    // $ANTLR start "rule__TabItems__DescriptionAssignment_2"
    // InternalLPDSL.g:2584:1: rule__TabItems__DescriptionAssignment_2 : ( ruleDescription ) ;
    public final void rule__TabItems__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2588:1: ( ( ruleDescription ) )
            // InternalLPDSL.g:2589:2: ( ruleDescription )
            {
            // InternalLPDSL.g:2589:2: ( ruleDescription )
            // InternalLPDSL.g:2590:3: ruleDescription
            {
             before(grammarAccess.getTabItemsAccess().getDescriptionDescriptionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getTabItemsAccess().getDescriptionDescriptionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabItems__DescriptionAssignment_2"


    // $ANTLR start "rule__PageBody__NameAssignment_1"
    // InternalLPDSL.g:2599:1: rule__PageBody__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PageBody__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2603:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2604:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2604:2: ( RULE_ID )
            // InternalLPDSL.g:2605:3: RULE_ID
            {
             before(grammarAccess.getPageBodyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPageBodyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageBody__NameAssignment_1"


    // $ANTLR start "rule__PageBody__SectionsAssignment_3"
    // InternalLPDSL.g:2614:1: rule__PageBody__SectionsAssignment_3 : ( ruleSections ) ;
    public final void rule__PageBody__SectionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2618:1: ( ( ruleSections ) )
            // InternalLPDSL.g:2619:2: ( ruleSections )
            {
            // InternalLPDSL.g:2619:2: ( ruleSections )
            // InternalLPDSL.g:2620:3: ruleSections
            {
             before(grammarAccess.getPageBodyAccess().getSectionsSectionsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSections();

            state._fsp--;

             after(grammarAccess.getPageBodyAccess().getSectionsSectionsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageBody__SectionsAssignment_3"


    // $ANTLR start "rule__Links__NameAssignment_1"
    // InternalLPDSL.g:2629:1: rule__Links__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Links__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2633:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2634:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2634:2: ( RULE_ID )
            // InternalLPDSL.g:2635:3: RULE_ID
            {
             before(grammarAccess.getLinksAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinksAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Links__NameAssignment_1"


    // $ANTLR start "rule__Links__LinksAssignment_3"
    // InternalLPDSL.g:2644:1: rule__Links__LinksAssignment_3 : ( ruleLinkItem ) ;
    public final void rule__Links__LinksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2648:1: ( ( ruleLinkItem ) )
            // InternalLPDSL.g:2649:2: ( ruleLinkItem )
            {
            // InternalLPDSL.g:2649:2: ( ruleLinkItem )
            // InternalLPDSL.g:2650:3: ruleLinkItem
            {
             before(grammarAccess.getLinksAccess().getLinksLinkItemParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLinkItem();

            state._fsp--;

             after(grammarAccess.getLinksAccess().getLinksLinkItemParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Links__LinksAssignment_3"


    // $ANTLR start "rule__ContactInformation__NameAssignment_1"
    // InternalLPDSL.g:2659:1: rule__ContactInformation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ContactInformation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2663:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2664:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2664:2: ( RULE_ID )
            // InternalLPDSL.g:2665:3: RULE_ID
            {
             before(grammarAccess.getContactInformationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContactInformationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactInformation__NameAssignment_1"


    // $ANTLR start "rule__Resume__NameAssignment_1"
    // InternalLPDSL.g:2674:1: rule__Resume__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Resume__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2678:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2679:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2679:2: ( RULE_ID )
            // InternalLPDSL.g:2680:3: RULE_ID
            {
             before(grammarAccess.getResumeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResumeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resume__NameAssignment_1"


    // $ANTLR start "rule__Resume__ResumeitemsAssignment_3"
    // InternalLPDSL.g:2689:1: rule__Resume__ResumeitemsAssignment_3 : ( ruleItems ) ;
    public final void rule__Resume__ResumeitemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2693:1: ( ( ruleItems ) )
            // InternalLPDSL.g:2694:2: ( ruleItems )
            {
            // InternalLPDSL.g:2694:2: ( ruleItems )
            // InternalLPDSL.g:2695:3: ruleItems
            {
             before(grammarAccess.getResumeAccess().getResumeitemsItemsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleItems();

            state._fsp--;

             after(grammarAccess.getResumeAccess().getResumeitemsItemsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resume__ResumeitemsAssignment_3"


    // $ANTLR start "rule__Items__NameAssignment_0"
    // InternalLPDSL.g:2704:1: rule__Items__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Items__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2708:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2709:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2709:2: ( RULE_ID )
            // InternalLPDSL.g:2710:3: RULE_ID
            {
             before(grammarAccess.getItemsAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getItemsAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Items__NameAssignment_0"


    // $ANTLR start "rule__Items__DescriptionAssignment_2"
    // InternalLPDSL.g:2719:1: rule__Items__DescriptionAssignment_2 : ( ruleDescription ) ;
    public final void rule__Items__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2723:1: ( ( ruleDescription ) )
            // InternalLPDSL.g:2724:2: ( ruleDescription )
            {
            // InternalLPDSL.g:2724:2: ( ruleDescription )
            // InternalLPDSL.g:2725:3: ruleDescription
            {
             before(grammarAccess.getItemsAccess().getDescriptionDescriptionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getItemsAccess().getDescriptionDescriptionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Items__DescriptionAssignment_2"


    // $ANTLR start "rule__Description__ValueAssignment"
    // InternalLPDSL.g:2734:1: rule__Description__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Description__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2738:1: ( ( RULE_STRING ) )
            // InternalLPDSL.g:2739:2: ( RULE_STRING )
            {
            // InternalLPDSL.g:2739:2: ( RULE_STRING )
            // InternalLPDSL.g:2740:3: RULE_STRING
            {
             before(grammarAccess.getDescriptionAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__ValueAssignment"


    // $ANTLR start "rule__TimeSpecifier__NameAssignment_0"
    // InternalLPDSL.g:2749:1: rule__TimeSpecifier__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TimeSpecifier__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2753:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2754:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2754:2: ( RULE_ID )
            // InternalLPDSL.g:2755:3: RULE_ID
            {
             before(grammarAccess.getTimeSpecifierAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTimeSpecifierAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSpecifier__NameAssignment_0"


    // $ANTLR start "rule__TimeSpecifier__TimeAssignment_2"
    // InternalLPDSL.g:2764:1: rule__TimeSpecifier__TimeAssignment_2 : ( ruleInteger ) ;
    public final void rule__TimeSpecifier__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2768:1: ( ( ruleInteger ) )
            // InternalLPDSL.g:2769:2: ( ruleInteger )
            {
            // InternalLPDSL.g:2769:2: ( ruleInteger )
            // InternalLPDSL.g:2770:3: ruleInteger
            {
             before(grammarAccess.getTimeSpecifierAccess().getTimeIntegerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getTimeSpecifierAccess().getTimeIntegerParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSpecifier__TimeAssignment_2"


    // $ANTLR start "rule__Integer__ValueAssignment"
    // InternalLPDSL.g:2779:1: rule__Integer__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Integer__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2783:1: ( ( RULE_INT ) )
            // InternalLPDSL.g:2784:2: ( RULE_INT )
            {
            // InternalLPDSL.g:2784:2: ( RULE_INT )
            // InternalLPDSL.g:2785:3: RULE_INT
            {
             before(grammarAccess.getIntegerAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntegerAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__ValueAssignment"


    // $ANTLR start "rule__AboutMe__NameAssignment_1"
    // InternalLPDSL.g:2794:1: rule__AboutMe__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AboutMe__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2798:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2799:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2799:2: ( RULE_ID )
            // InternalLPDSL.g:2800:3: RULE_ID
            {
             before(grammarAccess.getAboutMeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAboutMeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutMe__NameAssignment_1"


    // $ANTLR start "rule__AboutMe__PictureAssignment_3"
    // InternalLPDSL.g:2809:1: rule__AboutMe__PictureAssignment_3 : ( rulePicture ) ;
    public final void rule__AboutMe__PictureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2813:1: ( ( rulePicture ) )
            // InternalLPDSL.g:2814:2: ( rulePicture )
            {
            // InternalLPDSL.g:2814:2: ( rulePicture )
            // InternalLPDSL.g:2815:3: rulePicture
            {
             before(grammarAccess.getAboutMeAccess().getPicturePictureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePicture();

            state._fsp--;

             after(grammarAccess.getAboutMeAccess().getPicturePictureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutMe__PictureAssignment_3"


    // $ANTLR start "rule__AboutMe__DescriptionAssignment_4"
    // InternalLPDSL.g:2824:1: rule__AboutMe__DescriptionAssignment_4 : ( ruleItems ) ;
    public final void rule__AboutMe__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2828:1: ( ( ruleItems ) )
            // InternalLPDSL.g:2829:2: ( ruleItems )
            {
            // InternalLPDSL.g:2829:2: ( ruleItems )
            // InternalLPDSL.g:2830:3: ruleItems
            {
             before(grammarAccess.getAboutMeAccess().getDescriptionItemsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleItems();

            state._fsp--;

             after(grammarAccess.getAboutMeAccess().getDescriptionItemsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutMe__DescriptionAssignment_4"


    // $ANTLR start "rule__Picture__NameAssignment_0"
    // InternalLPDSL.g:2839:1: rule__Picture__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Picture__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2843:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2844:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2844:2: ( RULE_ID )
            // InternalLPDSL.g:2845:3: RULE_ID
            {
             before(grammarAccess.getPictureAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__NameAssignment_0"


    // $ANTLR start "rule__Picture__ImagepathAssignment_2"
    // InternalLPDSL.g:2854:1: rule__Picture__ImagepathAssignment_2 : ( ruleImagePath ) ;
    public final void rule__Picture__ImagepathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2858:1: ( ( ruleImagePath ) )
            // InternalLPDSL.g:2859:2: ( ruleImagePath )
            {
            // InternalLPDSL.g:2859:2: ( ruleImagePath )
            // InternalLPDSL.g:2860:3: ruleImagePath
            {
             before(grammarAccess.getPictureAccess().getImagepathImagePathParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImagePath();

            state._fsp--;

             after(grammarAccess.getPictureAccess().getImagepathImagePathParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__ImagepathAssignment_2"


    // $ANTLR start "rule__ImagePath__ValueAssignment"
    // InternalLPDSL.g:2869:1: rule__ImagePath__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__ImagePath__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2873:1: ( ( RULE_STRING ) )
            // InternalLPDSL.g:2874:2: ( RULE_STRING )
            {
            // InternalLPDSL.g:2874:2: ( RULE_STRING )
            // InternalLPDSL.g:2875:3: RULE_STRING
            {
             before(grammarAccess.getImagePathAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImagePathAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImagePath__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000064002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000782800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000780802L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});

}