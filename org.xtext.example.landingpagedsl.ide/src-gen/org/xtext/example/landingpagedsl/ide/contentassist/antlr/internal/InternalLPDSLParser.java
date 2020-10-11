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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'footer'", "'{'", "'}'", "'link'", "':'", "'.'", "'header'", "'body'", "'resume'", "'aboutme'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
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

                if ( (LA1_0==11||(LA1_0>=17 && LA1_0<=18)) ) {
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


    // $ANTLR start "entryRulePageFooter"
    // InternalLPDSL.g:103:1: entryRulePageFooter : rulePageFooter EOF ;
    public final void entryRulePageFooter() throws RecognitionException {
        try {
            // InternalLPDSL.g:104:1: ( rulePageFooter EOF )
            // InternalLPDSL.g:105:1: rulePageFooter EOF
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
    // InternalLPDSL.g:112:1: rulePageFooter : ( ( rule__PageFooter__Group__0 ) ) ;
    public final void rulePageFooter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:116:2: ( ( ( rule__PageFooter__Group__0 ) ) )
            // InternalLPDSL.g:117:2: ( ( rule__PageFooter__Group__0 ) )
            {
            // InternalLPDSL.g:117:2: ( ( rule__PageFooter__Group__0 ) )
            // InternalLPDSL.g:118:3: ( rule__PageFooter__Group__0 )
            {
             before(grammarAccess.getPageFooterAccess().getGroup()); 
            // InternalLPDSL.g:119:3: ( rule__PageFooter__Group__0 )
            // InternalLPDSL.g:119:4: rule__PageFooter__Group__0
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
    // InternalLPDSL.g:128:1: entryRuleLinkItem : ruleLinkItem EOF ;
    public final void entryRuleLinkItem() throws RecognitionException {
        try {
            // InternalLPDSL.g:129:1: ( ruleLinkItem EOF )
            // InternalLPDSL.g:130:1: ruleLinkItem EOF
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
    // InternalLPDSL.g:137:1: ruleLinkItem : ( ( rule__LinkItem__Group__0 ) ) ;
    public final void ruleLinkItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:141:2: ( ( ( rule__LinkItem__Group__0 ) ) )
            // InternalLPDSL.g:142:2: ( ( rule__LinkItem__Group__0 ) )
            {
            // InternalLPDSL.g:142:2: ( ( rule__LinkItem__Group__0 ) )
            // InternalLPDSL.g:143:3: ( rule__LinkItem__Group__0 )
            {
             before(grammarAccess.getLinkItemAccess().getGroup()); 
            // InternalLPDSL.g:144:3: ( rule__LinkItem__Group__0 )
            // InternalLPDSL.g:144:4: rule__LinkItem__Group__0
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
    // InternalLPDSL.g:153:1: entryRuleURL : ruleURL EOF ;
    public final void entryRuleURL() throws RecognitionException {
        try {
            // InternalLPDSL.g:154:1: ( ruleURL EOF )
            // InternalLPDSL.g:155:1: ruleURL EOF
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
    // InternalLPDSL.g:162:1: ruleURL : ( ( rule__URL__Group__0 ) ) ;
    public final void ruleURL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:166:2: ( ( ( rule__URL__Group__0 ) ) )
            // InternalLPDSL.g:167:2: ( ( rule__URL__Group__0 ) )
            {
            // InternalLPDSL.g:167:2: ( ( rule__URL__Group__0 ) )
            // InternalLPDSL.g:168:3: ( rule__URL__Group__0 )
            {
             before(grammarAccess.getURLAccess().getGroup()); 
            // InternalLPDSL.g:169:3: ( rule__URL__Group__0 )
            // InternalLPDSL.g:169:4: rule__URL__Group__0
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


    // $ANTLR start "entryRuleQualifiedPath"
    // InternalLPDSL.g:178:1: entryRuleQualifiedPath : ruleQualifiedPath EOF ;
    public final void entryRuleQualifiedPath() throws RecognitionException {
        try {
            // InternalLPDSL.g:179:1: ( ruleQualifiedPath EOF )
            // InternalLPDSL.g:180:1: ruleQualifiedPath EOF
            {
             before(grammarAccess.getQualifiedPathRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedPath();

            state._fsp--;

             after(grammarAccess.getQualifiedPathRule()); 
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
    // $ANTLR end "entryRuleQualifiedPath"


    // $ANTLR start "ruleQualifiedPath"
    // InternalLPDSL.g:187:1: ruleQualifiedPath : ( ( rule__QualifiedPath__Group__0 ) ) ;
    public final void ruleQualifiedPath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:191:2: ( ( ( rule__QualifiedPath__Group__0 ) ) )
            // InternalLPDSL.g:192:2: ( ( rule__QualifiedPath__Group__0 ) )
            {
            // InternalLPDSL.g:192:2: ( ( rule__QualifiedPath__Group__0 ) )
            // InternalLPDSL.g:193:3: ( rule__QualifiedPath__Group__0 )
            {
             before(grammarAccess.getQualifiedPathAccess().getGroup()); 
            // InternalLPDSL.g:194:3: ( rule__QualifiedPath__Group__0 )
            // InternalLPDSL.g:194:4: rule__QualifiedPath__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedPathAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedPath"


    // $ANTLR start "entryRulePageHeader"
    // InternalLPDSL.g:203:1: entryRulePageHeader : rulePageHeader EOF ;
    public final void entryRulePageHeader() throws RecognitionException {
        try {
            // InternalLPDSL.g:204:1: ( rulePageHeader EOF )
            // InternalLPDSL.g:205:1: rulePageHeader EOF
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
    // InternalLPDSL.g:212:1: rulePageHeader : ( ( rule__PageHeader__Group__0 ) ) ;
    public final void rulePageHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:216:2: ( ( ( rule__PageHeader__Group__0 ) ) )
            // InternalLPDSL.g:217:2: ( ( rule__PageHeader__Group__0 ) )
            {
            // InternalLPDSL.g:217:2: ( ( rule__PageHeader__Group__0 ) )
            // InternalLPDSL.g:218:3: ( rule__PageHeader__Group__0 )
            {
             before(grammarAccess.getPageHeaderAccess().getGroup()); 
            // InternalLPDSL.g:219:3: ( rule__PageHeader__Group__0 )
            // InternalLPDSL.g:219:4: rule__PageHeader__Group__0
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
    // InternalLPDSL.g:228:1: entryRuleTabItems : ruleTabItems EOF ;
    public final void entryRuleTabItems() throws RecognitionException {
        try {
            // InternalLPDSL.g:229:1: ( ruleTabItems EOF )
            // InternalLPDSL.g:230:1: ruleTabItems EOF
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
    // InternalLPDSL.g:237:1: ruleTabItems : ( ( rule__TabItems__Group__0 ) ) ;
    public final void ruleTabItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:241:2: ( ( ( rule__TabItems__Group__0 ) ) )
            // InternalLPDSL.g:242:2: ( ( rule__TabItems__Group__0 ) )
            {
            // InternalLPDSL.g:242:2: ( ( rule__TabItems__Group__0 ) )
            // InternalLPDSL.g:243:3: ( rule__TabItems__Group__0 )
            {
             before(grammarAccess.getTabItemsAccess().getGroup()); 
            // InternalLPDSL.g:244:3: ( rule__TabItems__Group__0 )
            // InternalLPDSL.g:244:4: rule__TabItems__Group__0
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
    // InternalLPDSL.g:253:1: entryRulePageBody : rulePageBody EOF ;
    public final void entryRulePageBody() throws RecognitionException {
        try {
            // InternalLPDSL.g:254:1: ( rulePageBody EOF )
            // InternalLPDSL.g:255:1: rulePageBody EOF
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
    // InternalLPDSL.g:262:1: rulePageBody : ( ( rule__PageBody__Group__0 ) ) ;
    public final void rulePageBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:266:2: ( ( ( rule__PageBody__Group__0 ) ) )
            // InternalLPDSL.g:267:2: ( ( rule__PageBody__Group__0 ) )
            {
            // InternalLPDSL.g:267:2: ( ( rule__PageBody__Group__0 ) )
            // InternalLPDSL.g:268:3: ( rule__PageBody__Group__0 )
            {
             before(grammarAccess.getPageBodyAccess().getGroup()); 
            // InternalLPDSL.g:269:3: ( rule__PageBody__Group__0 )
            // InternalLPDSL.g:269:4: rule__PageBody__Group__0
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
    // InternalLPDSL.g:278:1: entryRuleSections : ruleSections EOF ;
    public final void entryRuleSections() throws RecognitionException {
        try {
            // InternalLPDSL.g:279:1: ( ruleSections EOF )
            // InternalLPDSL.g:280:1: ruleSections EOF
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
    // InternalLPDSL.g:287:1: ruleSections : ( ( rule__Sections__Alternatives ) ) ;
    public final void ruleSections() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:291:2: ( ( ( rule__Sections__Alternatives ) ) )
            // InternalLPDSL.g:292:2: ( ( rule__Sections__Alternatives ) )
            {
            // InternalLPDSL.g:292:2: ( ( rule__Sections__Alternatives ) )
            // InternalLPDSL.g:293:3: ( rule__Sections__Alternatives )
            {
             before(grammarAccess.getSectionsAccess().getAlternatives()); 
            // InternalLPDSL.g:294:3: ( rule__Sections__Alternatives )
            // InternalLPDSL.g:294:4: rule__Sections__Alternatives
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


    // $ANTLR start "entryRuleResume"
    // InternalLPDSL.g:303:1: entryRuleResume : ruleResume EOF ;
    public final void entryRuleResume() throws RecognitionException {
        try {
            // InternalLPDSL.g:304:1: ( ruleResume EOF )
            // InternalLPDSL.g:305:1: ruleResume EOF
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
    // InternalLPDSL.g:312:1: ruleResume : ( ( rule__Resume__Group__0 ) ) ;
    public final void ruleResume() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:316:2: ( ( ( rule__Resume__Group__0 ) ) )
            // InternalLPDSL.g:317:2: ( ( rule__Resume__Group__0 ) )
            {
            // InternalLPDSL.g:317:2: ( ( rule__Resume__Group__0 ) )
            // InternalLPDSL.g:318:3: ( rule__Resume__Group__0 )
            {
             before(grammarAccess.getResumeAccess().getGroup()); 
            // InternalLPDSL.g:319:3: ( rule__Resume__Group__0 )
            // InternalLPDSL.g:319:4: rule__Resume__Group__0
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
    // InternalLPDSL.g:328:1: entryRuleItems : ruleItems EOF ;
    public final void entryRuleItems() throws RecognitionException {
        try {
            // InternalLPDSL.g:329:1: ( ruleItems EOF )
            // InternalLPDSL.g:330:1: ruleItems EOF
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
    // InternalLPDSL.g:337:1: ruleItems : ( ( rule__Items__Group__0 ) ) ;
    public final void ruleItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:341:2: ( ( ( rule__Items__Group__0 ) ) )
            // InternalLPDSL.g:342:2: ( ( rule__Items__Group__0 ) )
            {
            // InternalLPDSL.g:342:2: ( ( rule__Items__Group__0 ) )
            // InternalLPDSL.g:343:3: ( rule__Items__Group__0 )
            {
             before(grammarAccess.getItemsAccess().getGroup()); 
            // InternalLPDSL.g:344:3: ( rule__Items__Group__0 )
            // InternalLPDSL.g:344:4: rule__Items__Group__0
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
    // InternalLPDSL.g:353:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalLPDSL.g:354:1: ( ruleDescription EOF )
            // InternalLPDSL.g:355:1: ruleDescription EOF
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
    // InternalLPDSL.g:362:1: ruleDescription : ( ( rule__Description__ValueAssignment ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:366:2: ( ( ( rule__Description__ValueAssignment ) ) )
            // InternalLPDSL.g:367:2: ( ( rule__Description__ValueAssignment ) )
            {
            // InternalLPDSL.g:367:2: ( ( rule__Description__ValueAssignment ) )
            // InternalLPDSL.g:368:3: ( rule__Description__ValueAssignment )
            {
             before(grammarAccess.getDescriptionAccess().getValueAssignment()); 
            // InternalLPDSL.g:369:3: ( rule__Description__ValueAssignment )
            // InternalLPDSL.g:369:4: rule__Description__ValueAssignment
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


    // $ANTLR start "entryRuleAboutMe"
    // InternalLPDSL.g:378:1: entryRuleAboutMe : ruleAboutMe EOF ;
    public final void entryRuleAboutMe() throws RecognitionException {
        try {
            // InternalLPDSL.g:379:1: ( ruleAboutMe EOF )
            // InternalLPDSL.g:380:1: ruleAboutMe EOF
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
    // InternalLPDSL.g:387:1: ruleAboutMe : ( ( rule__AboutMe__Group__0 ) ) ;
    public final void ruleAboutMe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:391:2: ( ( ( rule__AboutMe__Group__0 ) ) )
            // InternalLPDSL.g:392:2: ( ( rule__AboutMe__Group__0 ) )
            {
            // InternalLPDSL.g:392:2: ( ( rule__AboutMe__Group__0 ) )
            // InternalLPDSL.g:393:3: ( rule__AboutMe__Group__0 )
            {
             before(grammarAccess.getAboutMeAccess().getGroup()); 
            // InternalLPDSL.g:394:3: ( rule__AboutMe__Group__0 )
            // InternalLPDSL.g:394:4: rule__AboutMe__Group__0
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
    // InternalLPDSL.g:403:1: entryRulePicture : rulePicture EOF ;
    public final void entryRulePicture() throws RecognitionException {
        try {
            // InternalLPDSL.g:404:1: ( rulePicture EOF )
            // InternalLPDSL.g:405:1: rulePicture EOF
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
    // InternalLPDSL.g:412:1: rulePicture : ( ( rule__Picture__Group__0 ) ) ;
    public final void rulePicture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:416:2: ( ( ( rule__Picture__Group__0 ) ) )
            // InternalLPDSL.g:417:2: ( ( rule__Picture__Group__0 ) )
            {
            // InternalLPDSL.g:417:2: ( ( rule__Picture__Group__0 ) )
            // InternalLPDSL.g:418:3: ( rule__Picture__Group__0 )
            {
             before(grammarAccess.getPictureAccess().getGroup()); 
            // InternalLPDSL.g:419:3: ( rule__Picture__Group__0 )
            // InternalLPDSL.g:419:4: rule__Picture__Group__0
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
    // InternalLPDSL.g:428:1: entryRuleImagePath : ruleImagePath EOF ;
    public final void entryRuleImagePath() throws RecognitionException {
        try {
            // InternalLPDSL.g:429:1: ( ruleImagePath EOF )
            // InternalLPDSL.g:430:1: ruleImagePath EOF
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
    // InternalLPDSL.g:437:1: ruleImagePath : ( ( rule__ImagePath__ValueAssignment ) ) ;
    public final void ruleImagePath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:441:2: ( ( ( rule__ImagePath__ValueAssignment ) ) )
            // InternalLPDSL.g:442:2: ( ( rule__ImagePath__ValueAssignment ) )
            {
            // InternalLPDSL.g:442:2: ( ( rule__ImagePath__ValueAssignment ) )
            // InternalLPDSL.g:443:3: ( rule__ImagePath__ValueAssignment )
            {
             before(grammarAccess.getImagePathAccess().getValueAssignment()); 
            // InternalLPDSL.g:444:3: ( rule__ImagePath__ValueAssignment )
            // InternalLPDSL.g:444:4: rule__ImagePath__ValueAssignment
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
    // InternalLPDSL.g:452:1: rule__PageComponent__Alternatives : ( ( rulePageHeader ) | ( rulePageBody ) | ( rulePageFooter ) );
    public final void rule__PageComponent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:456:1: ( ( rulePageHeader ) | ( rulePageBody ) | ( rulePageFooter ) )
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
                    // InternalLPDSL.g:457:2: ( rulePageHeader )
                    {
                    // InternalLPDSL.g:457:2: ( rulePageHeader )
                    // InternalLPDSL.g:458:3: rulePageHeader
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
                    // InternalLPDSL.g:463:2: ( rulePageBody )
                    {
                    // InternalLPDSL.g:463:2: ( rulePageBody )
                    // InternalLPDSL.g:464:3: rulePageBody
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
                    // InternalLPDSL.g:469:2: ( rulePageFooter )
                    {
                    // InternalLPDSL.g:469:2: ( rulePageFooter )
                    // InternalLPDSL.g:470:3: rulePageFooter
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
    // InternalLPDSL.g:479:1: rule__Sections__Alternatives : ( ( ruleResume ) | ( ruleAboutMe ) );
    public final void rule__Sections__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:483:1: ( ( ruleResume ) | ( ruleAboutMe ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalLPDSL.g:484:2: ( ruleResume )
                    {
                    // InternalLPDSL.g:484:2: ( ruleResume )
                    // InternalLPDSL.g:485:3: ruleResume
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
                    // InternalLPDSL.g:490:2: ( ruleAboutMe )
                    {
                    // InternalLPDSL.g:490:2: ( ruleAboutMe )
                    // InternalLPDSL.g:491:3: ruleAboutMe
                    {
                     before(grammarAccess.getSectionsAccess().getAboutMeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAboutMe();

                    state._fsp--;

                     after(grammarAccess.getSectionsAccess().getAboutMeParserRuleCall_1()); 

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


    // $ANTLR start "rule__PageFooter__Group__0"
    // InternalLPDSL.g:500:1: rule__PageFooter__Group__0 : rule__PageFooter__Group__0__Impl rule__PageFooter__Group__1 ;
    public final void rule__PageFooter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:504:1: ( rule__PageFooter__Group__0__Impl rule__PageFooter__Group__1 )
            // InternalLPDSL.g:505:2: rule__PageFooter__Group__0__Impl rule__PageFooter__Group__1
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
    // InternalLPDSL.g:512:1: rule__PageFooter__Group__0__Impl : ( 'footer' ) ;
    public final void rule__PageFooter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:516:1: ( ( 'footer' ) )
            // InternalLPDSL.g:517:1: ( 'footer' )
            {
            // InternalLPDSL.g:517:1: ( 'footer' )
            // InternalLPDSL.g:518:2: 'footer'
            {
             before(grammarAccess.getPageFooterAccess().getFooterKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalLPDSL.g:527:1: rule__PageFooter__Group__1 : rule__PageFooter__Group__1__Impl rule__PageFooter__Group__2 ;
    public final void rule__PageFooter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:531:1: ( rule__PageFooter__Group__1__Impl rule__PageFooter__Group__2 )
            // InternalLPDSL.g:532:2: rule__PageFooter__Group__1__Impl rule__PageFooter__Group__2
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
    // InternalLPDSL.g:539:1: rule__PageFooter__Group__1__Impl : ( ( rule__PageFooter__NameAssignment_1 ) ) ;
    public final void rule__PageFooter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:543:1: ( ( ( rule__PageFooter__NameAssignment_1 ) ) )
            // InternalLPDSL.g:544:1: ( ( rule__PageFooter__NameAssignment_1 ) )
            {
            // InternalLPDSL.g:544:1: ( ( rule__PageFooter__NameAssignment_1 ) )
            // InternalLPDSL.g:545:2: ( rule__PageFooter__NameAssignment_1 )
            {
             before(grammarAccess.getPageFooterAccess().getNameAssignment_1()); 
            // InternalLPDSL.g:546:2: ( rule__PageFooter__NameAssignment_1 )
            // InternalLPDSL.g:546:3: rule__PageFooter__NameAssignment_1
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
    // InternalLPDSL.g:554:1: rule__PageFooter__Group__2 : rule__PageFooter__Group__2__Impl rule__PageFooter__Group__3 ;
    public final void rule__PageFooter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:558:1: ( rule__PageFooter__Group__2__Impl rule__PageFooter__Group__3 )
            // InternalLPDSL.g:559:2: rule__PageFooter__Group__2__Impl rule__PageFooter__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalLPDSL.g:566:1: rule__PageFooter__Group__2__Impl : ( '{' ) ;
    public final void rule__PageFooter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:570:1: ( ( '{' ) )
            // InternalLPDSL.g:571:1: ( '{' )
            {
            // InternalLPDSL.g:571:1: ( '{' )
            // InternalLPDSL.g:572:2: '{'
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
    // InternalLPDSL.g:581:1: rule__PageFooter__Group__3 : rule__PageFooter__Group__3__Impl rule__PageFooter__Group__4 ;
    public final void rule__PageFooter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:585:1: ( rule__PageFooter__Group__3__Impl rule__PageFooter__Group__4 )
            // InternalLPDSL.g:586:2: rule__PageFooter__Group__3__Impl rule__PageFooter__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalLPDSL.g:593:1: rule__PageFooter__Group__3__Impl : ( ( rule__PageFooter__LinksAssignment_3 )* ) ;
    public final void rule__PageFooter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:597:1: ( ( ( rule__PageFooter__LinksAssignment_3 )* ) )
            // InternalLPDSL.g:598:1: ( ( rule__PageFooter__LinksAssignment_3 )* )
            {
            // InternalLPDSL.g:598:1: ( ( rule__PageFooter__LinksAssignment_3 )* )
            // InternalLPDSL.g:599:2: ( rule__PageFooter__LinksAssignment_3 )*
            {
             before(grammarAccess.getPageFooterAccess().getLinksAssignment_3()); 
            // InternalLPDSL.g:600:2: ( rule__PageFooter__LinksAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLPDSL.g:600:3: rule__PageFooter__LinksAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__PageFooter__LinksAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalLPDSL.g:608:1: rule__PageFooter__Group__4 : rule__PageFooter__Group__4__Impl ;
    public final void rule__PageFooter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:612:1: ( rule__PageFooter__Group__4__Impl )
            // InternalLPDSL.g:613:2: rule__PageFooter__Group__4__Impl
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
    // InternalLPDSL.g:619:1: rule__PageFooter__Group__4__Impl : ( '}' ) ;
    public final void rule__PageFooter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:623:1: ( ( '}' ) )
            // InternalLPDSL.g:624:1: ( '}' )
            {
            // InternalLPDSL.g:624:1: ( '}' )
            // InternalLPDSL.g:625:2: '}'
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
    // InternalLPDSL.g:635:1: rule__LinkItem__Group__0 : rule__LinkItem__Group__0__Impl rule__LinkItem__Group__1 ;
    public final void rule__LinkItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:639:1: ( rule__LinkItem__Group__0__Impl rule__LinkItem__Group__1 )
            // InternalLPDSL.g:640:2: rule__LinkItem__Group__0__Impl rule__LinkItem__Group__1
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
    // InternalLPDSL.g:647:1: rule__LinkItem__Group__0__Impl : ( 'link' ) ;
    public final void rule__LinkItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:651:1: ( ( 'link' ) )
            // InternalLPDSL.g:652:1: ( 'link' )
            {
            // InternalLPDSL.g:652:1: ( 'link' )
            // InternalLPDSL.g:653:2: 'link'
            {
             before(grammarAccess.getLinkItemAccess().getLinkKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalLPDSL.g:662:1: rule__LinkItem__Group__1 : rule__LinkItem__Group__1__Impl rule__LinkItem__Group__2 ;
    public final void rule__LinkItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:666:1: ( rule__LinkItem__Group__1__Impl rule__LinkItem__Group__2 )
            // InternalLPDSL.g:667:2: rule__LinkItem__Group__1__Impl rule__LinkItem__Group__2
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
    // InternalLPDSL.g:674:1: rule__LinkItem__Group__1__Impl : ( ( rule__LinkItem__NameAssignment_1 ) ) ;
    public final void rule__LinkItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:678:1: ( ( ( rule__LinkItem__NameAssignment_1 ) ) )
            // InternalLPDSL.g:679:1: ( ( rule__LinkItem__NameAssignment_1 ) )
            {
            // InternalLPDSL.g:679:1: ( ( rule__LinkItem__NameAssignment_1 ) )
            // InternalLPDSL.g:680:2: ( rule__LinkItem__NameAssignment_1 )
            {
             before(grammarAccess.getLinkItemAccess().getNameAssignment_1()); 
            // InternalLPDSL.g:681:2: ( rule__LinkItem__NameAssignment_1 )
            // InternalLPDSL.g:681:3: rule__LinkItem__NameAssignment_1
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
    // InternalLPDSL.g:689:1: rule__LinkItem__Group__2 : rule__LinkItem__Group__2__Impl rule__LinkItem__Group__3 ;
    public final void rule__LinkItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:693:1: ( rule__LinkItem__Group__2__Impl rule__LinkItem__Group__3 )
            // InternalLPDSL.g:694:2: rule__LinkItem__Group__2__Impl rule__LinkItem__Group__3
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
    // InternalLPDSL.g:701:1: rule__LinkItem__Group__2__Impl : ( '{' ) ;
    public final void rule__LinkItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:705:1: ( ( '{' ) )
            // InternalLPDSL.g:706:1: ( '{' )
            {
            // InternalLPDSL.g:706:1: ( '{' )
            // InternalLPDSL.g:707:2: '{'
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
    // InternalLPDSL.g:716:1: rule__LinkItem__Group__3 : rule__LinkItem__Group__3__Impl rule__LinkItem__Group__4 ;
    public final void rule__LinkItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:720:1: ( rule__LinkItem__Group__3__Impl rule__LinkItem__Group__4 )
            // InternalLPDSL.g:721:2: rule__LinkItem__Group__3__Impl rule__LinkItem__Group__4
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
    // InternalLPDSL.g:728:1: rule__LinkItem__Group__3__Impl : ( ( rule__LinkItem__TextAssignment_3 ) ) ;
    public final void rule__LinkItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:732:1: ( ( ( rule__LinkItem__TextAssignment_3 ) ) )
            // InternalLPDSL.g:733:1: ( ( rule__LinkItem__TextAssignment_3 ) )
            {
            // InternalLPDSL.g:733:1: ( ( rule__LinkItem__TextAssignment_3 ) )
            // InternalLPDSL.g:734:2: ( rule__LinkItem__TextAssignment_3 )
            {
             before(grammarAccess.getLinkItemAccess().getTextAssignment_3()); 
            // InternalLPDSL.g:735:2: ( rule__LinkItem__TextAssignment_3 )
            // InternalLPDSL.g:735:3: rule__LinkItem__TextAssignment_3
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
    // InternalLPDSL.g:743:1: rule__LinkItem__Group__4 : rule__LinkItem__Group__4__Impl rule__LinkItem__Group__5 ;
    public final void rule__LinkItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:747:1: ( rule__LinkItem__Group__4__Impl rule__LinkItem__Group__5 )
            // InternalLPDSL.g:748:2: rule__LinkItem__Group__4__Impl rule__LinkItem__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalLPDSL.g:755:1: rule__LinkItem__Group__4__Impl : ( ( rule__LinkItem__LinkAssignment_4 ) ) ;
    public final void rule__LinkItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:759:1: ( ( ( rule__LinkItem__LinkAssignment_4 ) ) )
            // InternalLPDSL.g:760:1: ( ( rule__LinkItem__LinkAssignment_4 ) )
            {
            // InternalLPDSL.g:760:1: ( ( rule__LinkItem__LinkAssignment_4 ) )
            // InternalLPDSL.g:761:2: ( rule__LinkItem__LinkAssignment_4 )
            {
             before(grammarAccess.getLinkItemAccess().getLinkAssignment_4()); 
            // InternalLPDSL.g:762:2: ( rule__LinkItem__LinkAssignment_4 )
            // InternalLPDSL.g:762:3: rule__LinkItem__LinkAssignment_4
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
    // InternalLPDSL.g:770:1: rule__LinkItem__Group__5 : rule__LinkItem__Group__5__Impl ;
    public final void rule__LinkItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:774:1: ( rule__LinkItem__Group__5__Impl )
            // InternalLPDSL.g:775:2: rule__LinkItem__Group__5__Impl
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
    // InternalLPDSL.g:781:1: rule__LinkItem__Group__5__Impl : ( '}' ) ;
    public final void rule__LinkItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:785:1: ( ( '}' ) )
            // InternalLPDSL.g:786:1: ( '}' )
            {
            // InternalLPDSL.g:786:1: ( '}' )
            // InternalLPDSL.g:787:2: '}'
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
    // InternalLPDSL.g:797:1: rule__URL__Group__0 : rule__URL__Group__0__Impl rule__URL__Group__1 ;
    public final void rule__URL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:801:1: ( rule__URL__Group__0__Impl rule__URL__Group__1 )
            // InternalLPDSL.g:802:2: rule__URL__Group__0__Impl rule__URL__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalLPDSL.g:809:1: rule__URL__Group__0__Impl : ( ( rule__URL__NameAssignment_0 ) ) ;
    public final void rule__URL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:813:1: ( ( ( rule__URL__NameAssignment_0 ) ) )
            // InternalLPDSL.g:814:1: ( ( rule__URL__NameAssignment_0 ) )
            {
            // InternalLPDSL.g:814:1: ( ( rule__URL__NameAssignment_0 ) )
            // InternalLPDSL.g:815:2: ( rule__URL__NameAssignment_0 )
            {
             before(grammarAccess.getURLAccess().getNameAssignment_0()); 
            // InternalLPDSL.g:816:2: ( rule__URL__NameAssignment_0 )
            // InternalLPDSL.g:816:3: rule__URL__NameAssignment_0
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
    // InternalLPDSL.g:824:1: rule__URL__Group__1 : rule__URL__Group__1__Impl rule__URL__Group__2 ;
    public final void rule__URL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:828:1: ( rule__URL__Group__1__Impl rule__URL__Group__2 )
            // InternalLPDSL.g:829:2: rule__URL__Group__1__Impl rule__URL__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalLPDSL.g:836:1: rule__URL__Group__1__Impl : ( ':' ) ;
    public final void rule__URL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:840:1: ( ( ':' ) )
            // InternalLPDSL.g:841:1: ( ':' )
            {
            // InternalLPDSL.g:841:1: ( ':' )
            // InternalLPDSL.g:842:2: ':'
            {
             before(grammarAccess.getURLAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalLPDSL.g:851:1: rule__URL__Group__2 : rule__URL__Group__2__Impl ;
    public final void rule__URL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:855:1: ( rule__URL__Group__2__Impl )
            // InternalLPDSL.g:856:2: rule__URL__Group__2__Impl
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
    // InternalLPDSL.g:862:1: rule__URL__Group__2__Impl : ( ( rule__URL__PathAssignment_2 ) ) ;
    public final void rule__URL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:866:1: ( ( ( rule__URL__PathAssignment_2 ) ) )
            // InternalLPDSL.g:867:1: ( ( rule__URL__PathAssignment_2 ) )
            {
            // InternalLPDSL.g:867:1: ( ( rule__URL__PathAssignment_2 ) )
            // InternalLPDSL.g:868:2: ( rule__URL__PathAssignment_2 )
            {
             before(grammarAccess.getURLAccess().getPathAssignment_2()); 
            // InternalLPDSL.g:869:2: ( rule__URL__PathAssignment_2 )
            // InternalLPDSL.g:869:3: rule__URL__PathAssignment_2
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


    // $ANTLR start "rule__QualifiedPath__Group__0"
    // InternalLPDSL.g:878:1: rule__QualifiedPath__Group__0 : rule__QualifiedPath__Group__0__Impl rule__QualifiedPath__Group__1 ;
    public final void rule__QualifiedPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:882:1: ( rule__QualifiedPath__Group__0__Impl rule__QualifiedPath__Group__1 )
            // InternalLPDSL.g:883:2: rule__QualifiedPath__Group__0__Impl rule__QualifiedPath__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__QualifiedPath__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group__1();

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
    // $ANTLR end "rule__QualifiedPath__Group__0"


    // $ANTLR start "rule__QualifiedPath__Group__0__Impl"
    // InternalLPDSL.g:890:1: rule__QualifiedPath__Group__0__Impl : ( ( rule__QualifiedPath__ValueAssignment_0 ) ) ;
    public final void rule__QualifiedPath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:894:1: ( ( ( rule__QualifiedPath__ValueAssignment_0 ) ) )
            // InternalLPDSL.g:895:1: ( ( rule__QualifiedPath__ValueAssignment_0 ) )
            {
            // InternalLPDSL.g:895:1: ( ( rule__QualifiedPath__ValueAssignment_0 ) )
            // InternalLPDSL.g:896:2: ( rule__QualifiedPath__ValueAssignment_0 )
            {
             before(grammarAccess.getQualifiedPathAccess().getValueAssignment_0()); 
            // InternalLPDSL.g:897:2: ( rule__QualifiedPath__ValueAssignment_0 )
            // InternalLPDSL.g:897:3: rule__QualifiedPath__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedPath__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedPathAccess().getValueAssignment_0()); 

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
    // $ANTLR end "rule__QualifiedPath__Group__0__Impl"


    // $ANTLR start "rule__QualifiedPath__Group__1"
    // InternalLPDSL.g:905:1: rule__QualifiedPath__Group__1 : rule__QualifiedPath__Group__1__Impl ;
    public final void rule__QualifiedPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:909:1: ( rule__QualifiedPath__Group__1__Impl )
            // InternalLPDSL.g:910:2: rule__QualifiedPath__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedPath__Group__1"


    // $ANTLR start "rule__QualifiedPath__Group__1__Impl"
    // InternalLPDSL.g:916:1: rule__QualifiedPath__Group__1__Impl : ( ( rule__QualifiedPath__Group_1__0 )* ) ;
    public final void rule__QualifiedPath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:920:1: ( ( ( rule__QualifiedPath__Group_1__0 )* ) )
            // InternalLPDSL.g:921:1: ( ( rule__QualifiedPath__Group_1__0 )* )
            {
            // InternalLPDSL.g:921:1: ( ( rule__QualifiedPath__Group_1__0 )* )
            // InternalLPDSL.g:922:2: ( rule__QualifiedPath__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedPathAccess().getGroup_1()); 
            // InternalLPDSL.g:923:2: ( rule__QualifiedPath__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLPDSL.g:923:3: rule__QualifiedPath__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__QualifiedPath__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getQualifiedPathAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedPath__Group__1__Impl"


    // $ANTLR start "rule__QualifiedPath__Group_1__0"
    // InternalLPDSL.g:932:1: rule__QualifiedPath__Group_1__0 : rule__QualifiedPath__Group_1__0__Impl rule__QualifiedPath__Group_1__1 ;
    public final void rule__QualifiedPath__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:936:1: ( rule__QualifiedPath__Group_1__0__Impl rule__QualifiedPath__Group_1__1 )
            // InternalLPDSL.g:937:2: rule__QualifiedPath__Group_1__0__Impl rule__QualifiedPath__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__QualifiedPath__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group_1__1();

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
    // $ANTLR end "rule__QualifiedPath__Group_1__0"


    // $ANTLR start "rule__QualifiedPath__Group_1__0__Impl"
    // InternalLPDSL.g:944:1: rule__QualifiedPath__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedPath__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:948:1: ( ( '.' ) )
            // InternalLPDSL.g:949:1: ( '.' )
            {
            // InternalLPDSL.g:949:1: ( '.' )
            // InternalLPDSL.g:950:2: '.'
            {
             before(grammarAccess.getQualifiedPathAccess().getFullStopKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQualifiedPathAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedPath__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedPath__Group_1__1"
    // InternalLPDSL.g:959:1: rule__QualifiedPath__Group_1__1 : rule__QualifiedPath__Group_1__1__Impl ;
    public final void rule__QualifiedPath__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:963:1: ( rule__QualifiedPath__Group_1__1__Impl )
            // InternalLPDSL.g:964:2: rule__QualifiedPath__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedPath__Group_1__1"


    // $ANTLR start "rule__QualifiedPath__Group_1__1__Impl"
    // InternalLPDSL.g:970:1: rule__QualifiedPath__Group_1__1__Impl : ( RULE_STRING ) ;
    public final void rule__QualifiedPath__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:974:1: ( ( RULE_STRING ) )
            // InternalLPDSL.g:975:1: ( RULE_STRING )
            {
            // InternalLPDSL.g:975:1: ( RULE_STRING )
            // InternalLPDSL.g:976:2: RULE_STRING
            {
             before(grammarAccess.getQualifiedPathAccess().getSTRINGTerminalRuleCall_1_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQualifiedPathAccess().getSTRINGTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedPath__Group_1__1__Impl"


    // $ANTLR start "rule__PageHeader__Group__0"
    // InternalLPDSL.g:986:1: rule__PageHeader__Group__0 : rule__PageHeader__Group__0__Impl rule__PageHeader__Group__1 ;
    public final void rule__PageHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:990:1: ( rule__PageHeader__Group__0__Impl rule__PageHeader__Group__1 )
            // InternalLPDSL.g:991:2: rule__PageHeader__Group__0__Impl rule__PageHeader__Group__1
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
    // InternalLPDSL.g:998:1: rule__PageHeader__Group__0__Impl : ( 'header' ) ;
    public final void rule__PageHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1002:1: ( ( 'header' ) )
            // InternalLPDSL.g:1003:1: ( 'header' )
            {
            // InternalLPDSL.g:1003:1: ( 'header' )
            // InternalLPDSL.g:1004:2: 'header'
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
    // InternalLPDSL.g:1013:1: rule__PageHeader__Group__1 : rule__PageHeader__Group__1__Impl rule__PageHeader__Group__2 ;
    public final void rule__PageHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1017:1: ( rule__PageHeader__Group__1__Impl rule__PageHeader__Group__2 )
            // InternalLPDSL.g:1018:2: rule__PageHeader__Group__1__Impl rule__PageHeader__Group__2
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
    // InternalLPDSL.g:1025:1: rule__PageHeader__Group__1__Impl : ( ( rule__PageHeader__NameAssignment_1 ) ) ;
    public final void rule__PageHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1029:1: ( ( ( rule__PageHeader__NameAssignment_1 ) ) )
            // InternalLPDSL.g:1030:1: ( ( rule__PageHeader__NameAssignment_1 ) )
            {
            // InternalLPDSL.g:1030:1: ( ( rule__PageHeader__NameAssignment_1 ) )
            // InternalLPDSL.g:1031:2: ( rule__PageHeader__NameAssignment_1 )
            {
             before(grammarAccess.getPageHeaderAccess().getNameAssignment_1()); 
            // InternalLPDSL.g:1032:2: ( rule__PageHeader__NameAssignment_1 )
            // InternalLPDSL.g:1032:3: rule__PageHeader__NameAssignment_1
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
    // InternalLPDSL.g:1040:1: rule__PageHeader__Group__2 : rule__PageHeader__Group__2__Impl rule__PageHeader__Group__3 ;
    public final void rule__PageHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1044:1: ( rule__PageHeader__Group__2__Impl rule__PageHeader__Group__3 )
            // InternalLPDSL.g:1045:2: rule__PageHeader__Group__2__Impl rule__PageHeader__Group__3
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
    // InternalLPDSL.g:1052:1: rule__PageHeader__Group__2__Impl : ( '{' ) ;
    public final void rule__PageHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1056:1: ( ( '{' ) )
            // InternalLPDSL.g:1057:1: ( '{' )
            {
            // InternalLPDSL.g:1057:1: ( '{' )
            // InternalLPDSL.g:1058:2: '{'
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
    // InternalLPDSL.g:1067:1: rule__PageHeader__Group__3 : rule__PageHeader__Group__3__Impl rule__PageHeader__Group__4 ;
    public final void rule__PageHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1071:1: ( rule__PageHeader__Group__3__Impl rule__PageHeader__Group__4 )
            // InternalLPDSL.g:1072:2: rule__PageHeader__Group__3__Impl rule__PageHeader__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalLPDSL.g:1079:1: rule__PageHeader__Group__3__Impl : ( ( rule__PageHeader__TitleAssignment_3 ) ) ;
    public final void rule__PageHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1083:1: ( ( ( rule__PageHeader__TitleAssignment_3 ) ) )
            // InternalLPDSL.g:1084:1: ( ( rule__PageHeader__TitleAssignment_3 ) )
            {
            // InternalLPDSL.g:1084:1: ( ( rule__PageHeader__TitleAssignment_3 ) )
            // InternalLPDSL.g:1085:2: ( rule__PageHeader__TitleAssignment_3 )
            {
             before(grammarAccess.getPageHeaderAccess().getTitleAssignment_3()); 
            // InternalLPDSL.g:1086:2: ( rule__PageHeader__TitleAssignment_3 )
            // InternalLPDSL.g:1086:3: rule__PageHeader__TitleAssignment_3
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
    // InternalLPDSL.g:1094:1: rule__PageHeader__Group__4 : rule__PageHeader__Group__4__Impl rule__PageHeader__Group__5 ;
    public final void rule__PageHeader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1098:1: ( rule__PageHeader__Group__4__Impl rule__PageHeader__Group__5 )
            // InternalLPDSL.g:1099:2: rule__PageHeader__Group__4__Impl rule__PageHeader__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalLPDSL.g:1106:1: rule__PageHeader__Group__4__Impl : ( ( rule__PageHeader__TabsAssignment_4 )* ) ;
    public final void rule__PageHeader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1110:1: ( ( ( rule__PageHeader__TabsAssignment_4 )* ) )
            // InternalLPDSL.g:1111:1: ( ( rule__PageHeader__TabsAssignment_4 )* )
            {
            // InternalLPDSL.g:1111:1: ( ( rule__PageHeader__TabsAssignment_4 )* )
            // InternalLPDSL.g:1112:2: ( rule__PageHeader__TabsAssignment_4 )*
            {
             before(grammarAccess.getPageHeaderAccess().getTabsAssignment_4()); 
            // InternalLPDSL.g:1113:2: ( rule__PageHeader__TabsAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLPDSL.g:1113:3: rule__PageHeader__TabsAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalLPDSL.g:1121:1: rule__PageHeader__Group__5 : rule__PageHeader__Group__5__Impl ;
    public final void rule__PageHeader__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1125:1: ( rule__PageHeader__Group__5__Impl )
            // InternalLPDSL.g:1126:2: rule__PageHeader__Group__5__Impl
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
    // InternalLPDSL.g:1132:1: rule__PageHeader__Group__5__Impl : ( '}' ) ;
    public final void rule__PageHeader__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1136:1: ( ( '}' ) )
            // InternalLPDSL.g:1137:1: ( '}' )
            {
            // InternalLPDSL.g:1137:1: ( '}' )
            // InternalLPDSL.g:1138:2: '}'
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
    // InternalLPDSL.g:1148:1: rule__TabItems__Group__0 : rule__TabItems__Group__0__Impl rule__TabItems__Group__1 ;
    public final void rule__TabItems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1152:1: ( rule__TabItems__Group__0__Impl rule__TabItems__Group__1 )
            // InternalLPDSL.g:1153:2: rule__TabItems__Group__0__Impl rule__TabItems__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalLPDSL.g:1160:1: rule__TabItems__Group__0__Impl : ( ( rule__TabItems__NameAssignment_0 ) ) ;
    public final void rule__TabItems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1164:1: ( ( ( rule__TabItems__NameAssignment_0 ) ) )
            // InternalLPDSL.g:1165:1: ( ( rule__TabItems__NameAssignment_0 ) )
            {
            // InternalLPDSL.g:1165:1: ( ( rule__TabItems__NameAssignment_0 ) )
            // InternalLPDSL.g:1166:2: ( rule__TabItems__NameAssignment_0 )
            {
             before(grammarAccess.getTabItemsAccess().getNameAssignment_0()); 
            // InternalLPDSL.g:1167:2: ( rule__TabItems__NameAssignment_0 )
            // InternalLPDSL.g:1167:3: rule__TabItems__NameAssignment_0
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
    // InternalLPDSL.g:1175:1: rule__TabItems__Group__1 : rule__TabItems__Group__1__Impl rule__TabItems__Group__2 ;
    public final void rule__TabItems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1179:1: ( rule__TabItems__Group__1__Impl rule__TabItems__Group__2 )
            // InternalLPDSL.g:1180:2: rule__TabItems__Group__1__Impl rule__TabItems__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalLPDSL.g:1187:1: rule__TabItems__Group__1__Impl : ( ':' ) ;
    public final void rule__TabItems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1191:1: ( ( ':' ) )
            // InternalLPDSL.g:1192:1: ( ':' )
            {
            // InternalLPDSL.g:1192:1: ( ':' )
            // InternalLPDSL.g:1193:2: ':'
            {
             before(grammarAccess.getTabItemsAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalLPDSL.g:1202:1: rule__TabItems__Group__2 : rule__TabItems__Group__2__Impl ;
    public final void rule__TabItems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1206:1: ( rule__TabItems__Group__2__Impl )
            // InternalLPDSL.g:1207:2: rule__TabItems__Group__2__Impl
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
    // InternalLPDSL.g:1213:1: rule__TabItems__Group__2__Impl : ( ( rule__TabItems__DescriptionAssignment_2 ) ) ;
    public final void rule__TabItems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1217:1: ( ( ( rule__TabItems__DescriptionAssignment_2 ) ) )
            // InternalLPDSL.g:1218:1: ( ( rule__TabItems__DescriptionAssignment_2 ) )
            {
            // InternalLPDSL.g:1218:1: ( ( rule__TabItems__DescriptionAssignment_2 ) )
            // InternalLPDSL.g:1219:2: ( rule__TabItems__DescriptionAssignment_2 )
            {
             before(grammarAccess.getTabItemsAccess().getDescriptionAssignment_2()); 
            // InternalLPDSL.g:1220:2: ( rule__TabItems__DescriptionAssignment_2 )
            // InternalLPDSL.g:1220:3: rule__TabItems__DescriptionAssignment_2
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
    // InternalLPDSL.g:1229:1: rule__PageBody__Group__0 : rule__PageBody__Group__0__Impl rule__PageBody__Group__1 ;
    public final void rule__PageBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1233:1: ( rule__PageBody__Group__0__Impl rule__PageBody__Group__1 )
            // InternalLPDSL.g:1234:2: rule__PageBody__Group__0__Impl rule__PageBody__Group__1
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
    // InternalLPDSL.g:1241:1: rule__PageBody__Group__0__Impl : ( 'body' ) ;
    public final void rule__PageBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1245:1: ( ( 'body' ) )
            // InternalLPDSL.g:1246:1: ( 'body' )
            {
            // InternalLPDSL.g:1246:1: ( 'body' )
            // InternalLPDSL.g:1247:2: 'body'
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
    // InternalLPDSL.g:1256:1: rule__PageBody__Group__1 : rule__PageBody__Group__1__Impl rule__PageBody__Group__2 ;
    public final void rule__PageBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1260:1: ( rule__PageBody__Group__1__Impl rule__PageBody__Group__2 )
            // InternalLPDSL.g:1261:2: rule__PageBody__Group__1__Impl rule__PageBody__Group__2
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
    // InternalLPDSL.g:1268:1: rule__PageBody__Group__1__Impl : ( ( rule__PageBody__NameAssignment_1 ) ) ;
    public final void rule__PageBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1272:1: ( ( ( rule__PageBody__NameAssignment_1 ) ) )
            // InternalLPDSL.g:1273:1: ( ( rule__PageBody__NameAssignment_1 ) )
            {
            // InternalLPDSL.g:1273:1: ( ( rule__PageBody__NameAssignment_1 ) )
            // InternalLPDSL.g:1274:2: ( rule__PageBody__NameAssignment_1 )
            {
             before(grammarAccess.getPageBodyAccess().getNameAssignment_1()); 
            // InternalLPDSL.g:1275:2: ( rule__PageBody__NameAssignment_1 )
            // InternalLPDSL.g:1275:3: rule__PageBody__NameAssignment_1
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
    // InternalLPDSL.g:1283:1: rule__PageBody__Group__2 : rule__PageBody__Group__2__Impl rule__PageBody__Group__3 ;
    public final void rule__PageBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1287:1: ( rule__PageBody__Group__2__Impl rule__PageBody__Group__3 )
            // InternalLPDSL.g:1288:2: rule__PageBody__Group__2__Impl rule__PageBody__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalLPDSL.g:1295:1: rule__PageBody__Group__2__Impl : ( '{' ) ;
    public final void rule__PageBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1299:1: ( ( '{' ) )
            // InternalLPDSL.g:1300:1: ( '{' )
            {
            // InternalLPDSL.g:1300:1: ( '{' )
            // InternalLPDSL.g:1301:2: '{'
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
    // InternalLPDSL.g:1310:1: rule__PageBody__Group__3 : rule__PageBody__Group__3__Impl rule__PageBody__Group__4 ;
    public final void rule__PageBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1314:1: ( rule__PageBody__Group__3__Impl rule__PageBody__Group__4 )
            // InternalLPDSL.g:1315:2: rule__PageBody__Group__3__Impl rule__PageBody__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalLPDSL.g:1322:1: rule__PageBody__Group__3__Impl : ( ( rule__PageBody__SectionsAssignment_3 )* ) ;
    public final void rule__PageBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1326:1: ( ( ( rule__PageBody__SectionsAssignment_3 )* ) )
            // InternalLPDSL.g:1327:1: ( ( rule__PageBody__SectionsAssignment_3 )* )
            {
            // InternalLPDSL.g:1327:1: ( ( rule__PageBody__SectionsAssignment_3 )* )
            // InternalLPDSL.g:1328:2: ( rule__PageBody__SectionsAssignment_3 )*
            {
             before(grammarAccess.getPageBodyAccess().getSectionsAssignment_3()); 
            // InternalLPDSL.g:1329:2: ( rule__PageBody__SectionsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=19 && LA7_0<=20)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLPDSL.g:1329:3: rule__PageBody__SectionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
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
    // InternalLPDSL.g:1337:1: rule__PageBody__Group__4 : rule__PageBody__Group__4__Impl ;
    public final void rule__PageBody__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1341:1: ( rule__PageBody__Group__4__Impl )
            // InternalLPDSL.g:1342:2: rule__PageBody__Group__4__Impl
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
    // InternalLPDSL.g:1348:1: rule__PageBody__Group__4__Impl : ( '}' ) ;
    public final void rule__PageBody__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1352:1: ( ( '}' ) )
            // InternalLPDSL.g:1353:1: ( '}' )
            {
            // InternalLPDSL.g:1353:1: ( '}' )
            // InternalLPDSL.g:1354:2: '}'
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


    // $ANTLR start "rule__Resume__Group__0"
    // InternalLPDSL.g:1364:1: rule__Resume__Group__0 : rule__Resume__Group__0__Impl rule__Resume__Group__1 ;
    public final void rule__Resume__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1368:1: ( rule__Resume__Group__0__Impl rule__Resume__Group__1 )
            // InternalLPDSL.g:1369:2: rule__Resume__Group__0__Impl rule__Resume__Group__1
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
    // InternalLPDSL.g:1376:1: rule__Resume__Group__0__Impl : ( 'resume' ) ;
    public final void rule__Resume__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1380:1: ( ( 'resume' ) )
            // InternalLPDSL.g:1381:1: ( 'resume' )
            {
            // InternalLPDSL.g:1381:1: ( 'resume' )
            // InternalLPDSL.g:1382:2: 'resume'
            {
             before(grammarAccess.getResumeAccess().getResumeKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalLPDSL.g:1391:1: rule__Resume__Group__1 : rule__Resume__Group__1__Impl rule__Resume__Group__2 ;
    public final void rule__Resume__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1395:1: ( rule__Resume__Group__1__Impl rule__Resume__Group__2 )
            // InternalLPDSL.g:1396:2: rule__Resume__Group__1__Impl rule__Resume__Group__2
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
    // InternalLPDSL.g:1403:1: rule__Resume__Group__1__Impl : ( ( rule__Resume__NameAssignment_1 ) ) ;
    public final void rule__Resume__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1407:1: ( ( ( rule__Resume__NameAssignment_1 ) ) )
            // InternalLPDSL.g:1408:1: ( ( rule__Resume__NameAssignment_1 ) )
            {
            // InternalLPDSL.g:1408:1: ( ( rule__Resume__NameAssignment_1 ) )
            // InternalLPDSL.g:1409:2: ( rule__Resume__NameAssignment_1 )
            {
             before(grammarAccess.getResumeAccess().getNameAssignment_1()); 
            // InternalLPDSL.g:1410:2: ( rule__Resume__NameAssignment_1 )
            // InternalLPDSL.g:1410:3: rule__Resume__NameAssignment_1
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
    // InternalLPDSL.g:1418:1: rule__Resume__Group__2 : rule__Resume__Group__2__Impl rule__Resume__Group__3 ;
    public final void rule__Resume__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1422:1: ( rule__Resume__Group__2__Impl rule__Resume__Group__3 )
            // InternalLPDSL.g:1423:2: rule__Resume__Group__2__Impl rule__Resume__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalLPDSL.g:1430:1: rule__Resume__Group__2__Impl : ( '{' ) ;
    public final void rule__Resume__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1434:1: ( ( '{' ) )
            // InternalLPDSL.g:1435:1: ( '{' )
            {
            // InternalLPDSL.g:1435:1: ( '{' )
            // InternalLPDSL.g:1436:2: '{'
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
    // InternalLPDSL.g:1445:1: rule__Resume__Group__3 : rule__Resume__Group__3__Impl rule__Resume__Group__4 ;
    public final void rule__Resume__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1449:1: ( rule__Resume__Group__3__Impl rule__Resume__Group__4 )
            // InternalLPDSL.g:1450:2: rule__Resume__Group__3__Impl rule__Resume__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalLPDSL.g:1457:1: rule__Resume__Group__3__Impl : ( ( rule__Resume__ResumeitemsAssignment_3 )* ) ;
    public final void rule__Resume__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1461:1: ( ( ( rule__Resume__ResumeitemsAssignment_3 )* ) )
            // InternalLPDSL.g:1462:1: ( ( rule__Resume__ResumeitemsAssignment_3 )* )
            {
            // InternalLPDSL.g:1462:1: ( ( rule__Resume__ResumeitemsAssignment_3 )* )
            // InternalLPDSL.g:1463:2: ( rule__Resume__ResumeitemsAssignment_3 )*
            {
             before(grammarAccess.getResumeAccess().getResumeitemsAssignment_3()); 
            // InternalLPDSL.g:1464:2: ( rule__Resume__ResumeitemsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLPDSL.g:1464:3: rule__Resume__ResumeitemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Resume__ResumeitemsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalLPDSL.g:1472:1: rule__Resume__Group__4 : rule__Resume__Group__4__Impl ;
    public final void rule__Resume__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1476:1: ( rule__Resume__Group__4__Impl )
            // InternalLPDSL.g:1477:2: rule__Resume__Group__4__Impl
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
    // InternalLPDSL.g:1483:1: rule__Resume__Group__4__Impl : ( '}' ) ;
    public final void rule__Resume__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1487:1: ( ( '}' ) )
            // InternalLPDSL.g:1488:1: ( '}' )
            {
            // InternalLPDSL.g:1488:1: ( '}' )
            // InternalLPDSL.g:1489:2: '}'
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
    // InternalLPDSL.g:1499:1: rule__Items__Group__0 : rule__Items__Group__0__Impl rule__Items__Group__1 ;
    public final void rule__Items__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1503:1: ( rule__Items__Group__0__Impl rule__Items__Group__1 )
            // InternalLPDSL.g:1504:2: rule__Items__Group__0__Impl rule__Items__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalLPDSL.g:1511:1: rule__Items__Group__0__Impl : ( ( rule__Items__NameAssignment_0 ) ) ;
    public final void rule__Items__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1515:1: ( ( ( rule__Items__NameAssignment_0 ) ) )
            // InternalLPDSL.g:1516:1: ( ( rule__Items__NameAssignment_0 ) )
            {
            // InternalLPDSL.g:1516:1: ( ( rule__Items__NameAssignment_0 ) )
            // InternalLPDSL.g:1517:2: ( rule__Items__NameAssignment_0 )
            {
             before(grammarAccess.getItemsAccess().getNameAssignment_0()); 
            // InternalLPDSL.g:1518:2: ( rule__Items__NameAssignment_0 )
            // InternalLPDSL.g:1518:3: rule__Items__NameAssignment_0
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
    // InternalLPDSL.g:1526:1: rule__Items__Group__1 : rule__Items__Group__1__Impl rule__Items__Group__2 ;
    public final void rule__Items__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1530:1: ( rule__Items__Group__1__Impl rule__Items__Group__2 )
            // InternalLPDSL.g:1531:2: rule__Items__Group__1__Impl rule__Items__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalLPDSL.g:1538:1: rule__Items__Group__1__Impl : ( ':' ) ;
    public final void rule__Items__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1542:1: ( ( ':' ) )
            // InternalLPDSL.g:1543:1: ( ':' )
            {
            // InternalLPDSL.g:1543:1: ( ':' )
            // InternalLPDSL.g:1544:2: ':'
            {
             before(grammarAccess.getItemsAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalLPDSL.g:1553:1: rule__Items__Group__2 : rule__Items__Group__2__Impl ;
    public final void rule__Items__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1557:1: ( rule__Items__Group__2__Impl )
            // InternalLPDSL.g:1558:2: rule__Items__Group__2__Impl
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
    // InternalLPDSL.g:1564:1: rule__Items__Group__2__Impl : ( ( rule__Items__DescriptionAssignment_2 ) ) ;
    public final void rule__Items__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1568:1: ( ( ( rule__Items__DescriptionAssignment_2 ) ) )
            // InternalLPDSL.g:1569:1: ( ( rule__Items__DescriptionAssignment_2 ) )
            {
            // InternalLPDSL.g:1569:1: ( ( rule__Items__DescriptionAssignment_2 ) )
            // InternalLPDSL.g:1570:2: ( rule__Items__DescriptionAssignment_2 )
            {
             before(grammarAccess.getItemsAccess().getDescriptionAssignment_2()); 
            // InternalLPDSL.g:1571:2: ( rule__Items__DescriptionAssignment_2 )
            // InternalLPDSL.g:1571:3: rule__Items__DescriptionAssignment_2
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


    // $ANTLR start "rule__AboutMe__Group__0"
    // InternalLPDSL.g:1580:1: rule__AboutMe__Group__0 : rule__AboutMe__Group__0__Impl rule__AboutMe__Group__1 ;
    public final void rule__AboutMe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1584:1: ( rule__AboutMe__Group__0__Impl rule__AboutMe__Group__1 )
            // InternalLPDSL.g:1585:2: rule__AboutMe__Group__0__Impl rule__AboutMe__Group__1
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
    // InternalLPDSL.g:1592:1: rule__AboutMe__Group__0__Impl : ( 'aboutme' ) ;
    public final void rule__AboutMe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1596:1: ( ( 'aboutme' ) )
            // InternalLPDSL.g:1597:1: ( 'aboutme' )
            {
            // InternalLPDSL.g:1597:1: ( 'aboutme' )
            // InternalLPDSL.g:1598:2: 'aboutme'
            {
             before(grammarAccess.getAboutMeAccess().getAboutmeKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalLPDSL.g:1607:1: rule__AboutMe__Group__1 : rule__AboutMe__Group__1__Impl rule__AboutMe__Group__2 ;
    public final void rule__AboutMe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1611:1: ( rule__AboutMe__Group__1__Impl rule__AboutMe__Group__2 )
            // InternalLPDSL.g:1612:2: rule__AboutMe__Group__1__Impl rule__AboutMe__Group__2
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
    // InternalLPDSL.g:1619:1: rule__AboutMe__Group__1__Impl : ( ( rule__AboutMe__NameAssignment_1 ) ) ;
    public final void rule__AboutMe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1623:1: ( ( ( rule__AboutMe__NameAssignment_1 ) ) )
            // InternalLPDSL.g:1624:1: ( ( rule__AboutMe__NameAssignment_1 ) )
            {
            // InternalLPDSL.g:1624:1: ( ( rule__AboutMe__NameAssignment_1 ) )
            // InternalLPDSL.g:1625:2: ( rule__AboutMe__NameAssignment_1 )
            {
             before(grammarAccess.getAboutMeAccess().getNameAssignment_1()); 
            // InternalLPDSL.g:1626:2: ( rule__AboutMe__NameAssignment_1 )
            // InternalLPDSL.g:1626:3: rule__AboutMe__NameAssignment_1
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
    // InternalLPDSL.g:1634:1: rule__AboutMe__Group__2 : rule__AboutMe__Group__2__Impl rule__AboutMe__Group__3 ;
    public final void rule__AboutMe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1638:1: ( rule__AboutMe__Group__2__Impl rule__AboutMe__Group__3 )
            // InternalLPDSL.g:1639:2: rule__AboutMe__Group__2__Impl rule__AboutMe__Group__3
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
    // InternalLPDSL.g:1646:1: rule__AboutMe__Group__2__Impl : ( '{' ) ;
    public final void rule__AboutMe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1650:1: ( ( '{' ) )
            // InternalLPDSL.g:1651:1: ( '{' )
            {
            // InternalLPDSL.g:1651:1: ( '{' )
            // InternalLPDSL.g:1652:2: '{'
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
    // InternalLPDSL.g:1661:1: rule__AboutMe__Group__3 : rule__AboutMe__Group__3__Impl rule__AboutMe__Group__4 ;
    public final void rule__AboutMe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1665:1: ( rule__AboutMe__Group__3__Impl rule__AboutMe__Group__4 )
            // InternalLPDSL.g:1666:2: rule__AboutMe__Group__3__Impl rule__AboutMe__Group__4
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
    // InternalLPDSL.g:1673:1: rule__AboutMe__Group__3__Impl : ( ( rule__AboutMe__PictureAssignment_3 ) ) ;
    public final void rule__AboutMe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1677:1: ( ( ( rule__AboutMe__PictureAssignment_3 ) ) )
            // InternalLPDSL.g:1678:1: ( ( rule__AboutMe__PictureAssignment_3 ) )
            {
            // InternalLPDSL.g:1678:1: ( ( rule__AboutMe__PictureAssignment_3 ) )
            // InternalLPDSL.g:1679:2: ( rule__AboutMe__PictureAssignment_3 )
            {
             before(grammarAccess.getAboutMeAccess().getPictureAssignment_3()); 
            // InternalLPDSL.g:1680:2: ( rule__AboutMe__PictureAssignment_3 )
            // InternalLPDSL.g:1680:3: rule__AboutMe__PictureAssignment_3
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
    // InternalLPDSL.g:1688:1: rule__AboutMe__Group__4 : rule__AboutMe__Group__4__Impl rule__AboutMe__Group__5 ;
    public final void rule__AboutMe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1692:1: ( rule__AboutMe__Group__4__Impl rule__AboutMe__Group__5 )
            // InternalLPDSL.g:1693:2: rule__AboutMe__Group__4__Impl rule__AboutMe__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalLPDSL.g:1700:1: rule__AboutMe__Group__4__Impl : ( ( rule__AboutMe__DescriptionAssignment_4 ) ) ;
    public final void rule__AboutMe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1704:1: ( ( ( rule__AboutMe__DescriptionAssignment_4 ) ) )
            // InternalLPDSL.g:1705:1: ( ( rule__AboutMe__DescriptionAssignment_4 ) )
            {
            // InternalLPDSL.g:1705:1: ( ( rule__AboutMe__DescriptionAssignment_4 ) )
            // InternalLPDSL.g:1706:2: ( rule__AboutMe__DescriptionAssignment_4 )
            {
             before(grammarAccess.getAboutMeAccess().getDescriptionAssignment_4()); 
            // InternalLPDSL.g:1707:2: ( rule__AboutMe__DescriptionAssignment_4 )
            // InternalLPDSL.g:1707:3: rule__AboutMe__DescriptionAssignment_4
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
    // InternalLPDSL.g:1715:1: rule__AboutMe__Group__5 : rule__AboutMe__Group__5__Impl ;
    public final void rule__AboutMe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1719:1: ( rule__AboutMe__Group__5__Impl )
            // InternalLPDSL.g:1720:2: rule__AboutMe__Group__5__Impl
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
    // InternalLPDSL.g:1726:1: rule__AboutMe__Group__5__Impl : ( '}' ) ;
    public final void rule__AboutMe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1730:1: ( ( '}' ) )
            // InternalLPDSL.g:1731:1: ( '}' )
            {
            // InternalLPDSL.g:1731:1: ( '}' )
            // InternalLPDSL.g:1732:2: '}'
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
    // InternalLPDSL.g:1742:1: rule__Picture__Group__0 : rule__Picture__Group__0__Impl rule__Picture__Group__1 ;
    public final void rule__Picture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1746:1: ( rule__Picture__Group__0__Impl rule__Picture__Group__1 )
            // InternalLPDSL.g:1747:2: rule__Picture__Group__0__Impl rule__Picture__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalLPDSL.g:1754:1: rule__Picture__Group__0__Impl : ( ( rule__Picture__NameAssignment_0 ) ) ;
    public final void rule__Picture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1758:1: ( ( ( rule__Picture__NameAssignment_0 ) ) )
            // InternalLPDSL.g:1759:1: ( ( rule__Picture__NameAssignment_0 ) )
            {
            // InternalLPDSL.g:1759:1: ( ( rule__Picture__NameAssignment_0 ) )
            // InternalLPDSL.g:1760:2: ( rule__Picture__NameAssignment_0 )
            {
             before(grammarAccess.getPictureAccess().getNameAssignment_0()); 
            // InternalLPDSL.g:1761:2: ( rule__Picture__NameAssignment_0 )
            // InternalLPDSL.g:1761:3: rule__Picture__NameAssignment_0
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
    // InternalLPDSL.g:1769:1: rule__Picture__Group__1 : rule__Picture__Group__1__Impl rule__Picture__Group__2 ;
    public final void rule__Picture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1773:1: ( rule__Picture__Group__1__Impl rule__Picture__Group__2 )
            // InternalLPDSL.g:1774:2: rule__Picture__Group__1__Impl rule__Picture__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalLPDSL.g:1781:1: rule__Picture__Group__1__Impl : ( ':' ) ;
    public final void rule__Picture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1785:1: ( ( ':' ) )
            // InternalLPDSL.g:1786:1: ( ':' )
            {
            // InternalLPDSL.g:1786:1: ( ':' )
            // InternalLPDSL.g:1787:2: ':'
            {
             before(grammarAccess.getPictureAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalLPDSL.g:1796:1: rule__Picture__Group__2 : rule__Picture__Group__2__Impl ;
    public final void rule__Picture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1800:1: ( rule__Picture__Group__2__Impl )
            // InternalLPDSL.g:1801:2: rule__Picture__Group__2__Impl
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
    // InternalLPDSL.g:1807:1: rule__Picture__Group__2__Impl : ( ( rule__Picture__ImagepathAssignment_2 ) ) ;
    public final void rule__Picture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1811:1: ( ( ( rule__Picture__ImagepathAssignment_2 ) ) )
            // InternalLPDSL.g:1812:1: ( ( rule__Picture__ImagepathAssignment_2 ) )
            {
            // InternalLPDSL.g:1812:1: ( ( rule__Picture__ImagepathAssignment_2 ) )
            // InternalLPDSL.g:1813:2: ( rule__Picture__ImagepathAssignment_2 )
            {
             before(grammarAccess.getPictureAccess().getImagepathAssignment_2()); 
            // InternalLPDSL.g:1814:2: ( rule__Picture__ImagepathAssignment_2 )
            // InternalLPDSL.g:1814:3: rule__Picture__ImagepathAssignment_2
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
    // InternalLPDSL.g:1823:1: rule__LandingPage__PagecomponentAssignment : ( rulePageComponent ) ;
    public final void rule__LandingPage__PagecomponentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1827:1: ( ( rulePageComponent ) )
            // InternalLPDSL.g:1828:2: ( rulePageComponent )
            {
            // InternalLPDSL.g:1828:2: ( rulePageComponent )
            // InternalLPDSL.g:1829:3: rulePageComponent
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


    // $ANTLR start "rule__PageFooter__NameAssignment_1"
    // InternalLPDSL.g:1838:1: rule__PageFooter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PageFooter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1842:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:1843:2: ( RULE_ID )
            {
            // InternalLPDSL.g:1843:2: ( RULE_ID )
            // InternalLPDSL.g:1844:3: RULE_ID
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
    // InternalLPDSL.g:1853:1: rule__PageFooter__LinksAssignment_3 : ( ruleLinkItem ) ;
    public final void rule__PageFooter__LinksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1857:1: ( ( ruleLinkItem ) )
            // InternalLPDSL.g:1858:2: ( ruleLinkItem )
            {
            // InternalLPDSL.g:1858:2: ( ruleLinkItem )
            // InternalLPDSL.g:1859:3: ruleLinkItem
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
    // InternalLPDSL.g:1868:1: rule__LinkItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LinkItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1872:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:1873:2: ( RULE_ID )
            {
            // InternalLPDSL.g:1873:2: ( RULE_ID )
            // InternalLPDSL.g:1874:3: RULE_ID
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
    // InternalLPDSL.g:1883:1: rule__LinkItem__TextAssignment_3 : ( ruleItems ) ;
    public final void rule__LinkItem__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1887:1: ( ( ruleItems ) )
            // InternalLPDSL.g:1888:2: ( ruleItems )
            {
            // InternalLPDSL.g:1888:2: ( ruleItems )
            // InternalLPDSL.g:1889:3: ruleItems
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
    // InternalLPDSL.g:1898:1: rule__LinkItem__LinkAssignment_4 : ( ruleURL ) ;
    public final void rule__LinkItem__LinkAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1902:1: ( ( ruleURL ) )
            // InternalLPDSL.g:1903:2: ( ruleURL )
            {
            // InternalLPDSL.g:1903:2: ( ruleURL )
            // InternalLPDSL.g:1904:3: ruleURL
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
    // InternalLPDSL.g:1913:1: rule__URL__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__URL__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1917:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:1918:2: ( RULE_ID )
            {
            // InternalLPDSL.g:1918:2: ( RULE_ID )
            // InternalLPDSL.g:1919:3: RULE_ID
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
    // InternalLPDSL.g:1928:1: rule__URL__PathAssignment_2 : ( ruleQualifiedPath ) ;
    public final void rule__URL__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1932:1: ( ( ruleQualifiedPath ) )
            // InternalLPDSL.g:1933:2: ( ruleQualifiedPath )
            {
            // InternalLPDSL.g:1933:2: ( ruleQualifiedPath )
            // InternalLPDSL.g:1934:3: ruleQualifiedPath
            {
             before(grammarAccess.getURLAccess().getPathQualifiedPathParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedPath();

            state._fsp--;

             after(grammarAccess.getURLAccess().getPathQualifiedPathParserRuleCall_2_0()); 

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


    // $ANTLR start "rule__QualifiedPath__ValueAssignment_0"
    // InternalLPDSL.g:1943:1: rule__QualifiedPath__ValueAssignment_0 : ( RULE_STRING ) ;
    public final void rule__QualifiedPath__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1947:1: ( ( RULE_STRING ) )
            // InternalLPDSL.g:1948:2: ( RULE_STRING )
            {
            // InternalLPDSL.g:1948:2: ( RULE_STRING )
            // InternalLPDSL.g:1949:3: RULE_STRING
            {
             before(grammarAccess.getQualifiedPathAccess().getValueSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQualifiedPathAccess().getValueSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__QualifiedPath__ValueAssignment_0"


    // $ANTLR start "rule__PageHeader__NameAssignment_1"
    // InternalLPDSL.g:1958:1: rule__PageHeader__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PageHeader__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1962:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:1963:2: ( RULE_ID )
            {
            // InternalLPDSL.g:1963:2: ( RULE_ID )
            // InternalLPDSL.g:1964:3: RULE_ID
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
    // InternalLPDSL.g:1973:1: rule__PageHeader__TitleAssignment_3 : ( ruleItems ) ;
    public final void rule__PageHeader__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1977:1: ( ( ruleItems ) )
            // InternalLPDSL.g:1978:2: ( ruleItems )
            {
            // InternalLPDSL.g:1978:2: ( ruleItems )
            // InternalLPDSL.g:1979:3: ruleItems
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
    // InternalLPDSL.g:1988:1: rule__PageHeader__TabsAssignment_4 : ( ruleTabItems ) ;
    public final void rule__PageHeader__TabsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1992:1: ( ( ruleTabItems ) )
            // InternalLPDSL.g:1993:2: ( ruleTabItems )
            {
            // InternalLPDSL.g:1993:2: ( ruleTabItems )
            // InternalLPDSL.g:1994:3: ruleTabItems
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
    // InternalLPDSL.g:2003:1: rule__TabItems__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TabItems__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2007:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2008:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2008:2: ( RULE_ID )
            // InternalLPDSL.g:2009:3: RULE_ID
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
    // InternalLPDSL.g:2018:1: rule__TabItems__DescriptionAssignment_2 : ( ruleDescription ) ;
    public final void rule__TabItems__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2022:1: ( ( ruleDescription ) )
            // InternalLPDSL.g:2023:2: ( ruleDescription )
            {
            // InternalLPDSL.g:2023:2: ( ruleDescription )
            // InternalLPDSL.g:2024:3: ruleDescription
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
    // InternalLPDSL.g:2033:1: rule__PageBody__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PageBody__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2037:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2038:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2038:2: ( RULE_ID )
            // InternalLPDSL.g:2039:3: RULE_ID
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
    // InternalLPDSL.g:2048:1: rule__PageBody__SectionsAssignment_3 : ( ruleSections ) ;
    public final void rule__PageBody__SectionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2052:1: ( ( ruleSections ) )
            // InternalLPDSL.g:2053:2: ( ruleSections )
            {
            // InternalLPDSL.g:2053:2: ( ruleSections )
            // InternalLPDSL.g:2054:3: ruleSections
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


    // $ANTLR start "rule__Resume__NameAssignment_1"
    // InternalLPDSL.g:2063:1: rule__Resume__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Resume__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2067:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2068:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2068:2: ( RULE_ID )
            // InternalLPDSL.g:2069:3: RULE_ID
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
    // InternalLPDSL.g:2078:1: rule__Resume__ResumeitemsAssignment_3 : ( ruleItems ) ;
    public final void rule__Resume__ResumeitemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2082:1: ( ( ruleItems ) )
            // InternalLPDSL.g:2083:2: ( ruleItems )
            {
            // InternalLPDSL.g:2083:2: ( ruleItems )
            // InternalLPDSL.g:2084:3: ruleItems
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
    // InternalLPDSL.g:2093:1: rule__Items__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Items__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2097:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2098:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2098:2: ( RULE_ID )
            // InternalLPDSL.g:2099:3: RULE_ID
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
    // InternalLPDSL.g:2108:1: rule__Items__DescriptionAssignment_2 : ( ruleDescription ) ;
    public final void rule__Items__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2112:1: ( ( ruleDescription ) )
            // InternalLPDSL.g:2113:2: ( ruleDescription )
            {
            // InternalLPDSL.g:2113:2: ( ruleDescription )
            // InternalLPDSL.g:2114:3: ruleDescription
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
    // InternalLPDSL.g:2123:1: rule__Description__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Description__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2127:1: ( ( RULE_STRING ) )
            // InternalLPDSL.g:2128:2: ( RULE_STRING )
            {
            // InternalLPDSL.g:2128:2: ( RULE_STRING )
            // InternalLPDSL.g:2129:3: RULE_STRING
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


    // $ANTLR start "rule__AboutMe__NameAssignment_1"
    // InternalLPDSL.g:2138:1: rule__AboutMe__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AboutMe__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2142:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2143:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2143:2: ( RULE_ID )
            // InternalLPDSL.g:2144:3: RULE_ID
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
    // InternalLPDSL.g:2153:1: rule__AboutMe__PictureAssignment_3 : ( rulePicture ) ;
    public final void rule__AboutMe__PictureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2157:1: ( ( rulePicture ) )
            // InternalLPDSL.g:2158:2: ( rulePicture )
            {
            // InternalLPDSL.g:2158:2: ( rulePicture )
            // InternalLPDSL.g:2159:3: rulePicture
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
    // InternalLPDSL.g:2168:1: rule__AboutMe__DescriptionAssignment_4 : ( ruleItems ) ;
    public final void rule__AboutMe__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2172:1: ( ( ruleItems ) )
            // InternalLPDSL.g:2173:2: ( ruleItems )
            {
            // InternalLPDSL.g:2173:2: ( ruleItems )
            // InternalLPDSL.g:2174:3: ruleItems
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
    // InternalLPDSL.g:2183:1: rule__Picture__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Picture__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2187:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2188:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2188:2: ( RULE_ID )
            // InternalLPDSL.g:2189:3: RULE_ID
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
    // InternalLPDSL.g:2198:1: rule__Picture__ImagepathAssignment_2 : ( ruleImagePath ) ;
    public final void rule__Picture__ImagepathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2202:1: ( ( ruleImagePath ) )
            // InternalLPDSL.g:2203:2: ( ruleImagePath )
            {
            // InternalLPDSL.g:2203:2: ( ruleImagePath )
            // InternalLPDSL.g:2204:3: ruleImagePath
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
    // InternalLPDSL.g:2213:1: rule__ImagePath__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__ImagePath__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2217:1: ( ( RULE_STRING ) )
            // InternalLPDSL.g:2218:2: ( RULE_STRING )
            {
            // InternalLPDSL.g:2218:2: ( RULE_STRING )
            // InternalLPDSL.g:2219:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000060802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000182000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000180002L});

}