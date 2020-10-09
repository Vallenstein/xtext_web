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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'http://www.'", "'https://www.'", "'www.'", "'jpg'", "'JPG'", "'jpeg'", "'JPEG'", "'png'", "'PNG'", "'footer'", "'{'", "'}'", "'link'", "':'", "'.'", "'/'", "'header'", "'body'", "'resume'", "'aboutme'"
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

                if ( (LA1_0==20||(LA1_0>=27 && LA1_0<=28)) ) {
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
    // InternalLPDSL.g:437:1: ruleImagePath : ( ( rule__ImagePath__Group__0 ) ) ;
    public final void ruleImagePath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:441:2: ( ( ( rule__ImagePath__Group__0 ) ) )
            // InternalLPDSL.g:442:2: ( ( rule__ImagePath__Group__0 ) )
            {
            // InternalLPDSL.g:442:2: ( ( rule__ImagePath__Group__0 ) )
            // InternalLPDSL.g:443:3: ( rule__ImagePath__Group__0 )
            {
             before(grammarAccess.getImagePathAccess().getGroup()); 
            // InternalLPDSL.g:444:3: ( rule__ImagePath__Group__0 )
            // InternalLPDSL.g:444:4: rule__ImagePath__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImagePath__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImagePathAccess().getGroup()); 

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
            case 27:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                alt2=2;
                }
                break;
            case 20:
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


    // $ANTLR start "rule__QualifiedPath__Alternatives_0"
    // InternalLPDSL.g:479:1: rule__QualifiedPath__Alternatives_0 : ( ( 'http://www.' ) | ( 'https://www.' ) | ( 'www.' ) );
    public final void rule__QualifiedPath__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:483:1: ( ( 'http://www.' ) | ( 'https://www.' ) | ( 'www.' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalLPDSL.g:484:2: ( 'http://www.' )
                    {
                    // InternalLPDSL.g:484:2: ( 'http://www.' )
                    // InternalLPDSL.g:485:3: 'http://www.'
                    {
                     before(grammarAccess.getQualifiedPathAccess().getHttpWwwKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getQualifiedPathAccess().getHttpWwwKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLPDSL.g:490:2: ( 'https://www.' )
                    {
                    // InternalLPDSL.g:490:2: ( 'https://www.' )
                    // InternalLPDSL.g:491:3: 'https://www.'
                    {
                     before(grammarAccess.getQualifiedPathAccess().getHttpsWwwKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getQualifiedPathAccess().getHttpsWwwKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLPDSL.g:496:2: ( 'www.' )
                    {
                    // InternalLPDSL.g:496:2: ( 'www.' )
                    // InternalLPDSL.g:497:3: 'www.'
                    {
                     before(grammarAccess.getQualifiedPathAccess().getWwwKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getQualifiedPathAccess().getWwwKeyword_0_2()); 

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
    // $ANTLR end "rule__QualifiedPath__Alternatives_0"


    // $ANTLR start "rule__Sections__Alternatives"
    // InternalLPDSL.g:506:1: rule__Sections__Alternatives : ( ( ruleResume ) | ( ruleAboutMe ) );
    public final void rule__Sections__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:510:1: ( ( ruleResume ) | ( ruleAboutMe ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==30) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLPDSL.g:511:2: ( ruleResume )
                    {
                    // InternalLPDSL.g:511:2: ( ruleResume )
                    // InternalLPDSL.g:512:3: ruleResume
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
                    // InternalLPDSL.g:517:2: ( ruleAboutMe )
                    {
                    // InternalLPDSL.g:517:2: ( ruleAboutMe )
                    // InternalLPDSL.g:518:3: ruleAboutMe
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


    // $ANTLR start "rule__ImagePath__Alternatives_3"
    // InternalLPDSL.g:527:1: rule__ImagePath__Alternatives_3 : ( ( 'jpg' ) | ( 'JPG' ) | ( 'jpeg' ) | ( 'JPEG' ) | ( 'png' ) | ( 'PNG' ) );
    public final void rule__ImagePath__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:531:1: ( ( 'jpg' ) | ( 'JPG' ) | ( 'jpeg' ) | ( 'JPEG' ) | ( 'png' ) | ( 'PNG' ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 17:
                {
                alt5=4;
                }
                break;
            case 18:
                {
                alt5=5;
                }
                break;
            case 19:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalLPDSL.g:532:2: ( 'jpg' )
                    {
                    // InternalLPDSL.g:532:2: ( 'jpg' )
                    // InternalLPDSL.g:533:3: 'jpg'
                    {
                     before(grammarAccess.getImagePathAccess().getJpgKeyword_3_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getImagePathAccess().getJpgKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLPDSL.g:538:2: ( 'JPG' )
                    {
                    // InternalLPDSL.g:538:2: ( 'JPG' )
                    // InternalLPDSL.g:539:3: 'JPG'
                    {
                     before(grammarAccess.getImagePathAccess().getJPGKeyword_3_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getImagePathAccess().getJPGKeyword_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLPDSL.g:544:2: ( 'jpeg' )
                    {
                    // InternalLPDSL.g:544:2: ( 'jpeg' )
                    // InternalLPDSL.g:545:3: 'jpeg'
                    {
                     before(grammarAccess.getImagePathAccess().getJpegKeyword_3_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getImagePathAccess().getJpegKeyword_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLPDSL.g:550:2: ( 'JPEG' )
                    {
                    // InternalLPDSL.g:550:2: ( 'JPEG' )
                    // InternalLPDSL.g:551:3: 'JPEG'
                    {
                     before(grammarAccess.getImagePathAccess().getJPEGKeyword_3_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getImagePathAccess().getJPEGKeyword_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLPDSL.g:556:2: ( 'png' )
                    {
                    // InternalLPDSL.g:556:2: ( 'png' )
                    // InternalLPDSL.g:557:3: 'png'
                    {
                     before(grammarAccess.getImagePathAccess().getPngKeyword_3_4()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getImagePathAccess().getPngKeyword_3_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLPDSL.g:562:2: ( 'PNG' )
                    {
                    // InternalLPDSL.g:562:2: ( 'PNG' )
                    // InternalLPDSL.g:563:3: 'PNG'
                    {
                     before(grammarAccess.getImagePathAccess().getPNGKeyword_3_5()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getImagePathAccess().getPNGKeyword_3_5()); 

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
    // $ANTLR end "rule__ImagePath__Alternatives_3"


    // $ANTLR start "rule__PageFooter__Group__0"
    // InternalLPDSL.g:572:1: rule__PageFooter__Group__0 : rule__PageFooter__Group__0__Impl rule__PageFooter__Group__1 ;
    public final void rule__PageFooter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:576:1: ( rule__PageFooter__Group__0__Impl rule__PageFooter__Group__1 )
            // InternalLPDSL.g:577:2: rule__PageFooter__Group__0__Impl rule__PageFooter__Group__1
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
    // InternalLPDSL.g:584:1: rule__PageFooter__Group__0__Impl : ( 'footer' ) ;
    public final void rule__PageFooter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:588:1: ( ( 'footer' ) )
            // InternalLPDSL.g:589:1: ( 'footer' )
            {
            // InternalLPDSL.g:589:1: ( 'footer' )
            // InternalLPDSL.g:590:2: 'footer'
            {
             before(grammarAccess.getPageFooterAccess().getFooterKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalLPDSL.g:599:1: rule__PageFooter__Group__1 : rule__PageFooter__Group__1__Impl rule__PageFooter__Group__2 ;
    public final void rule__PageFooter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:603:1: ( rule__PageFooter__Group__1__Impl rule__PageFooter__Group__2 )
            // InternalLPDSL.g:604:2: rule__PageFooter__Group__1__Impl rule__PageFooter__Group__2
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
    // InternalLPDSL.g:611:1: rule__PageFooter__Group__1__Impl : ( ( rule__PageFooter__NameAssignment_1 ) ) ;
    public final void rule__PageFooter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:615:1: ( ( ( rule__PageFooter__NameAssignment_1 ) ) )
            // InternalLPDSL.g:616:1: ( ( rule__PageFooter__NameAssignment_1 ) )
            {
            // InternalLPDSL.g:616:1: ( ( rule__PageFooter__NameAssignment_1 ) )
            // InternalLPDSL.g:617:2: ( rule__PageFooter__NameAssignment_1 )
            {
             before(grammarAccess.getPageFooterAccess().getNameAssignment_1()); 
            // InternalLPDSL.g:618:2: ( rule__PageFooter__NameAssignment_1 )
            // InternalLPDSL.g:618:3: rule__PageFooter__NameAssignment_1
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
    // InternalLPDSL.g:626:1: rule__PageFooter__Group__2 : rule__PageFooter__Group__2__Impl rule__PageFooter__Group__3 ;
    public final void rule__PageFooter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:630:1: ( rule__PageFooter__Group__2__Impl rule__PageFooter__Group__3 )
            // InternalLPDSL.g:631:2: rule__PageFooter__Group__2__Impl rule__PageFooter__Group__3
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
    // InternalLPDSL.g:638:1: rule__PageFooter__Group__2__Impl : ( '{' ) ;
    public final void rule__PageFooter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:642:1: ( ( '{' ) )
            // InternalLPDSL.g:643:1: ( '{' )
            {
            // InternalLPDSL.g:643:1: ( '{' )
            // InternalLPDSL.g:644:2: '{'
            {
             before(grammarAccess.getPageFooterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalLPDSL.g:653:1: rule__PageFooter__Group__3 : rule__PageFooter__Group__3__Impl rule__PageFooter__Group__4 ;
    public final void rule__PageFooter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:657:1: ( rule__PageFooter__Group__3__Impl rule__PageFooter__Group__4 )
            // InternalLPDSL.g:658:2: rule__PageFooter__Group__3__Impl rule__PageFooter__Group__4
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
    // InternalLPDSL.g:665:1: rule__PageFooter__Group__3__Impl : ( ( rule__PageFooter__LinksAssignment_3 )* ) ;
    public final void rule__PageFooter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:669:1: ( ( ( rule__PageFooter__LinksAssignment_3 )* ) )
            // InternalLPDSL.g:670:1: ( ( rule__PageFooter__LinksAssignment_3 )* )
            {
            // InternalLPDSL.g:670:1: ( ( rule__PageFooter__LinksAssignment_3 )* )
            // InternalLPDSL.g:671:2: ( rule__PageFooter__LinksAssignment_3 )*
            {
             before(grammarAccess.getPageFooterAccess().getLinksAssignment_3()); 
            // InternalLPDSL.g:672:2: ( rule__PageFooter__LinksAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLPDSL.g:672:3: rule__PageFooter__LinksAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__PageFooter__LinksAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalLPDSL.g:680:1: rule__PageFooter__Group__4 : rule__PageFooter__Group__4__Impl ;
    public final void rule__PageFooter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:684:1: ( rule__PageFooter__Group__4__Impl )
            // InternalLPDSL.g:685:2: rule__PageFooter__Group__4__Impl
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
    // InternalLPDSL.g:691:1: rule__PageFooter__Group__4__Impl : ( '}' ) ;
    public final void rule__PageFooter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:695:1: ( ( '}' ) )
            // InternalLPDSL.g:696:1: ( '}' )
            {
            // InternalLPDSL.g:696:1: ( '}' )
            // InternalLPDSL.g:697:2: '}'
            {
             before(grammarAccess.getPageFooterAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalLPDSL.g:707:1: rule__LinkItem__Group__0 : rule__LinkItem__Group__0__Impl rule__LinkItem__Group__1 ;
    public final void rule__LinkItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:711:1: ( rule__LinkItem__Group__0__Impl rule__LinkItem__Group__1 )
            // InternalLPDSL.g:712:2: rule__LinkItem__Group__0__Impl rule__LinkItem__Group__1
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
    // InternalLPDSL.g:719:1: rule__LinkItem__Group__0__Impl : ( 'link' ) ;
    public final void rule__LinkItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:723:1: ( ( 'link' ) )
            // InternalLPDSL.g:724:1: ( 'link' )
            {
            // InternalLPDSL.g:724:1: ( 'link' )
            // InternalLPDSL.g:725:2: 'link'
            {
             before(grammarAccess.getLinkItemAccess().getLinkKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalLPDSL.g:734:1: rule__LinkItem__Group__1 : rule__LinkItem__Group__1__Impl rule__LinkItem__Group__2 ;
    public final void rule__LinkItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:738:1: ( rule__LinkItem__Group__1__Impl rule__LinkItem__Group__2 )
            // InternalLPDSL.g:739:2: rule__LinkItem__Group__1__Impl rule__LinkItem__Group__2
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
    // InternalLPDSL.g:746:1: rule__LinkItem__Group__1__Impl : ( ( rule__LinkItem__NameAssignment_1 ) ) ;
    public final void rule__LinkItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:750:1: ( ( ( rule__LinkItem__NameAssignment_1 ) ) )
            // InternalLPDSL.g:751:1: ( ( rule__LinkItem__NameAssignment_1 ) )
            {
            // InternalLPDSL.g:751:1: ( ( rule__LinkItem__NameAssignment_1 ) )
            // InternalLPDSL.g:752:2: ( rule__LinkItem__NameAssignment_1 )
            {
             before(grammarAccess.getLinkItemAccess().getNameAssignment_1()); 
            // InternalLPDSL.g:753:2: ( rule__LinkItem__NameAssignment_1 )
            // InternalLPDSL.g:753:3: rule__LinkItem__NameAssignment_1
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
    // InternalLPDSL.g:761:1: rule__LinkItem__Group__2 : rule__LinkItem__Group__2__Impl rule__LinkItem__Group__3 ;
    public final void rule__LinkItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:765:1: ( rule__LinkItem__Group__2__Impl rule__LinkItem__Group__3 )
            // InternalLPDSL.g:766:2: rule__LinkItem__Group__2__Impl rule__LinkItem__Group__3
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
    // InternalLPDSL.g:773:1: rule__LinkItem__Group__2__Impl : ( '{' ) ;
    public final void rule__LinkItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:777:1: ( ( '{' ) )
            // InternalLPDSL.g:778:1: ( '{' )
            {
            // InternalLPDSL.g:778:1: ( '{' )
            // InternalLPDSL.g:779:2: '{'
            {
             before(grammarAccess.getLinkItemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalLPDSL.g:788:1: rule__LinkItem__Group__3 : rule__LinkItem__Group__3__Impl rule__LinkItem__Group__4 ;
    public final void rule__LinkItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:792:1: ( rule__LinkItem__Group__3__Impl rule__LinkItem__Group__4 )
            // InternalLPDSL.g:793:2: rule__LinkItem__Group__3__Impl rule__LinkItem__Group__4
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
    // InternalLPDSL.g:800:1: rule__LinkItem__Group__3__Impl : ( ( rule__LinkItem__TextAssignment_3 ) ) ;
    public final void rule__LinkItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:804:1: ( ( ( rule__LinkItem__TextAssignment_3 ) ) )
            // InternalLPDSL.g:805:1: ( ( rule__LinkItem__TextAssignment_3 ) )
            {
            // InternalLPDSL.g:805:1: ( ( rule__LinkItem__TextAssignment_3 ) )
            // InternalLPDSL.g:806:2: ( rule__LinkItem__TextAssignment_3 )
            {
             before(grammarAccess.getLinkItemAccess().getTextAssignment_3()); 
            // InternalLPDSL.g:807:2: ( rule__LinkItem__TextAssignment_3 )
            // InternalLPDSL.g:807:3: rule__LinkItem__TextAssignment_3
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
    // InternalLPDSL.g:815:1: rule__LinkItem__Group__4 : rule__LinkItem__Group__4__Impl rule__LinkItem__Group__5 ;
    public final void rule__LinkItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:819:1: ( rule__LinkItem__Group__4__Impl rule__LinkItem__Group__5 )
            // InternalLPDSL.g:820:2: rule__LinkItem__Group__4__Impl rule__LinkItem__Group__5
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
    // InternalLPDSL.g:827:1: rule__LinkItem__Group__4__Impl : ( ( rule__LinkItem__LinkAssignment_4 ) ) ;
    public final void rule__LinkItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:831:1: ( ( ( rule__LinkItem__LinkAssignment_4 ) ) )
            // InternalLPDSL.g:832:1: ( ( rule__LinkItem__LinkAssignment_4 ) )
            {
            // InternalLPDSL.g:832:1: ( ( rule__LinkItem__LinkAssignment_4 ) )
            // InternalLPDSL.g:833:2: ( rule__LinkItem__LinkAssignment_4 )
            {
             before(grammarAccess.getLinkItemAccess().getLinkAssignment_4()); 
            // InternalLPDSL.g:834:2: ( rule__LinkItem__LinkAssignment_4 )
            // InternalLPDSL.g:834:3: rule__LinkItem__LinkAssignment_4
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
    // InternalLPDSL.g:842:1: rule__LinkItem__Group__5 : rule__LinkItem__Group__5__Impl ;
    public final void rule__LinkItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:846:1: ( rule__LinkItem__Group__5__Impl )
            // InternalLPDSL.g:847:2: rule__LinkItem__Group__5__Impl
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
    // InternalLPDSL.g:853:1: rule__LinkItem__Group__5__Impl : ( '}' ) ;
    public final void rule__LinkItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:857:1: ( ( '}' ) )
            // InternalLPDSL.g:858:1: ( '}' )
            {
            // InternalLPDSL.g:858:1: ( '}' )
            // InternalLPDSL.g:859:2: '}'
            {
             before(grammarAccess.getLinkItemAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalLPDSL.g:869:1: rule__URL__Group__0 : rule__URL__Group__0__Impl rule__URL__Group__1 ;
    public final void rule__URL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:873:1: ( rule__URL__Group__0__Impl rule__URL__Group__1 )
            // InternalLPDSL.g:874:2: rule__URL__Group__0__Impl rule__URL__Group__1
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
    // InternalLPDSL.g:881:1: rule__URL__Group__0__Impl : ( ( rule__URL__NameAssignment_0 ) ) ;
    public final void rule__URL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:885:1: ( ( ( rule__URL__NameAssignment_0 ) ) )
            // InternalLPDSL.g:886:1: ( ( rule__URL__NameAssignment_0 ) )
            {
            // InternalLPDSL.g:886:1: ( ( rule__URL__NameAssignment_0 ) )
            // InternalLPDSL.g:887:2: ( rule__URL__NameAssignment_0 )
            {
             before(grammarAccess.getURLAccess().getNameAssignment_0()); 
            // InternalLPDSL.g:888:2: ( rule__URL__NameAssignment_0 )
            // InternalLPDSL.g:888:3: rule__URL__NameAssignment_0
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
    // InternalLPDSL.g:896:1: rule__URL__Group__1 : rule__URL__Group__1__Impl rule__URL__Group__2 ;
    public final void rule__URL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:900:1: ( rule__URL__Group__1__Impl rule__URL__Group__2 )
            // InternalLPDSL.g:901:2: rule__URL__Group__1__Impl rule__URL__Group__2
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
    // InternalLPDSL.g:908:1: rule__URL__Group__1__Impl : ( ':' ) ;
    public final void rule__URL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:912:1: ( ( ':' ) )
            // InternalLPDSL.g:913:1: ( ':' )
            {
            // InternalLPDSL.g:913:1: ( ':' )
            // InternalLPDSL.g:914:2: ':'
            {
             before(grammarAccess.getURLAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalLPDSL.g:923:1: rule__URL__Group__2 : rule__URL__Group__2__Impl ;
    public final void rule__URL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:927:1: ( rule__URL__Group__2__Impl )
            // InternalLPDSL.g:928:2: rule__URL__Group__2__Impl
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
    // InternalLPDSL.g:934:1: rule__URL__Group__2__Impl : ( ( rule__URL__PathAssignment_2 ) ) ;
    public final void rule__URL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:938:1: ( ( ( rule__URL__PathAssignment_2 ) ) )
            // InternalLPDSL.g:939:1: ( ( rule__URL__PathAssignment_2 ) )
            {
            // InternalLPDSL.g:939:1: ( ( rule__URL__PathAssignment_2 ) )
            // InternalLPDSL.g:940:2: ( rule__URL__PathAssignment_2 )
            {
             before(grammarAccess.getURLAccess().getPathAssignment_2()); 
            // InternalLPDSL.g:941:2: ( rule__URL__PathAssignment_2 )
            // InternalLPDSL.g:941:3: rule__URL__PathAssignment_2
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
    // InternalLPDSL.g:950:1: rule__QualifiedPath__Group__0 : rule__QualifiedPath__Group__0__Impl rule__QualifiedPath__Group__1 ;
    public final void rule__QualifiedPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:954:1: ( rule__QualifiedPath__Group__0__Impl rule__QualifiedPath__Group__1 )
            // InternalLPDSL.g:955:2: rule__QualifiedPath__Group__0__Impl rule__QualifiedPath__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalLPDSL.g:962:1: rule__QualifiedPath__Group__0__Impl : ( ( rule__QualifiedPath__Alternatives_0 )? ) ;
    public final void rule__QualifiedPath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:966:1: ( ( ( rule__QualifiedPath__Alternatives_0 )? ) )
            // InternalLPDSL.g:967:1: ( ( rule__QualifiedPath__Alternatives_0 )? )
            {
            // InternalLPDSL.g:967:1: ( ( rule__QualifiedPath__Alternatives_0 )? )
            // InternalLPDSL.g:968:2: ( rule__QualifiedPath__Alternatives_0 )?
            {
             before(grammarAccess.getQualifiedPathAccess().getAlternatives_0()); 
            // InternalLPDSL.g:969:2: ( rule__QualifiedPath__Alternatives_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=11 && LA7_0<=13)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLPDSL.g:969:3: rule__QualifiedPath__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QualifiedPath__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQualifiedPathAccess().getAlternatives_0()); 

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
    // InternalLPDSL.g:977:1: rule__QualifiedPath__Group__1 : rule__QualifiedPath__Group__1__Impl rule__QualifiedPath__Group__2 ;
    public final void rule__QualifiedPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:981:1: ( rule__QualifiedPath__Group__1__Impl rule__QualifiedPath__Group__2 )
            // InternalLPDSL.g:982:2: rule__QualifiedPath__Group__1__Impl rule__QualifiedPath__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__QualifiedPath__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group__2();

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
    // InternalLPDSL.g:989:1: rule__QualifiedPath__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedPath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:993:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:994:1: ( RULE_ID )
            {
            // InternalLPDSL.g:994:1: ( RULE_ID )
            // InternalLPDSL.g:995:2: RULE_ID
            {
             before(grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_1()); 

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


    // $ANTLR start "rule__QualifiedPath__Group__2"
    // InternalLPDSL.g:1004:1: rule__QualifiedPath__Group__2 : rule__QualifiedPath__Group__2__Impl rule__QualifiedPath__Group__3 ;
    public final void rule__QualifiedPath__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1008:1: ( rule__QualifiedPath__Group__2__Impl rule__QualifiedPath__Group__3 )
            // InternalLPDSL.g:1009:2: rule__QualifiedPath__Group__2__Impl rule__QualifiedPath__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__QualifiedPath__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group__3();

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
    // $ANTLR end "rule__QualifiedPath__Group__2"


    // $ANTLR start "rule__QualifiedPath__Group__2__Impl"
    // InternalLPDSL.g:1016:1: rule__QualifiedPath__Group__2__Impl : ( ( rule__QualifiedPath__Group_2__0 )* ) ;
    public final void rule__QualifiedPath__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1020:1: ( ( ( rule__QualifiedPath__Group_2__0 )* ) )
            // InternalLPDSL.g:1021:1: ( ( rule__QualifiedPath__Group_2__0 )* )
            {
            // InternalLPDSL.g:1021:1: ( ( rule__QualifiedPath__Group_2__0 )* )
            // InternalLPDSL.g:1022:2: ( rule__QualifiedPath__Group_2__0 )*
            {
             before(grammarAccess.getQualifiedPathAccess().getGroup_2()); 
            // InternalLPDSL.g:1023:2: ( rule__QualifiedPath__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLPDSL.g:1023:3: rule__QualifiedPath__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__QualifiedPath__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getQualifiedPathAccess().getGroup_2()); 

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
    // $ANTLR end "rule__QualifiedPath__Group__2__Impl"


    // $ANTLR start "rule__QualifiedPath__Group__3"
    // InternalLPDSL.g:1031:1: rule__QualifiedPath__Group__3 : rule__QualifiedPath__Group__3__Impl ;
    public final void rule__QualifiedPath__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1035:1: ( rule__QualifiedPath__Group__3__Impl )
            // InternalLPDSL.g:1036:2: rule__QualifiedPath__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group__3__Impl();

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
    // $ANTLR end "rule__QualifiedPath__Group__3"


    // $ANTLR start "rule__QualifiedPath__Group__3__Impl"
    // InternalLPDSL.g:1042:1: rule__QualifiedPath__Group__3__Impl : ( ( rule__QualifiedPath__Group_3__0 )* ) ;
    public final void rule__QualifiedPath__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1046:1: ( ( ( rule__QualifiedPath__Group_3__0 )* ) )
            // InternalLPDSL.g:1047:1: ( ( rule__QualifiedPath__Group_3__0 )* )
            {
            // InternalLPDSL.g:1047:1: ( ( rule__QualifiedPath__Group_3__0 )* )
            // InternalLPDSL.g:1048:2: ( rule__QualifiedPath__Group_3__0 )*
            {
             before(grammarAccess.getQualifiedPathAccess().getGroup_3()); 
            // InternalLPDSL.g:1049:2: ( rule__QualifiedPath__Group_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLPDSL.g:1049:3: rule__QualifiedPath__Group_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__QualifiedPath__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getQualifiedPathAccess().getGroup_3()); 

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
    // $ANTLR end "rule__QualifiedPath__Group__3__Impl"


    // $ANTLR start "rule__QualifiedPath__Group_2__0"
    // InternalLPDSL.g:1058:1: rule__QualifiedPath__Group_2__0 : rule__QualifiedPath__Group_2__0__Impl rule__QualifiedPath__Group_2__1 ;
    public final void rule__QualifiedPath__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1062:1: ( rule__QualifiedPath__Group_2__0__Impl rule__QualifiedPath__Group_2__1 )
            // InternalLPDSL.g:1063:2: rule__QualifiedPath__Group_2__0__Impl rule__QualifiedPath__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedPath__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group_2__1();

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
    // $ANTLR end "rule__QualifiedPath__Group_2__0"


    // $ANTLR start "rule__QualifiedPath__Group_2__0__Impl"
    // InternalLPDSL.g:1070:1: rule__QualifiedPath__Group_2__0__Impl : ( '.' ) ;
    public final void rule__QualifiedPath__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1074:1: ( ( '.' ) )
            // InternalLPDSL.g:1075:1: ( '.' )
            {
            // InternalLPDSL.g:1075:1: ( '.' )
            // InternalLPDSL.g:1076:2: '.'
            {
             before(grammarAccess.getQualifiedPathAccess().getFullStopKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getQualifiedPathAccess().getFullStopKeyword_2_0()); 

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
    // $ANTLR end "rule__QualifiedPath__Group_2__0__Impl"


    // $ANTLR start "rule__QualifiedPath__Group_2__1"
    // InternalLPDSL.g:1085:1: rule__QualifiedPath__Group_2__1 : rule__QualifiedPath__Group_2__1__Impl ;
    public final void rule__QualifiedPath__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1089:1: ( rule__QualifiedPath__Group_2__1__Impl )
            // InternalLPDSL.g:1090:2: rule__QualifiedPath__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group_2__1__Impl();

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
    // $ANTLR end "rule__QualifiedPath__Group_2__1"


    // $ANTLR start "rule__QualifiedPath__Group_2__1__Impl"
    // InternalLPDSL.g:1096:1: rule__QualifiedPath__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedPath__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1100:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:1101:1: ( RULE_ID )
            {
            // InternalLPDSL.g:1101:1: ( RULE_ID )
            // InternalLPDSL.g:1102:2: RULE_ID
            {
             before(grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_2_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__QualifiedPath__Group_2__1__Impl"


    // $ANTLR start "rule__QualifiedPath__Group_3__0"
    // InternalLPDSL.g:1112:1: rule__QualifiedPath__Group_3__0 : rule__QualifiedPath__Group_3__0__Impl rule__QualifiedPath__Group_3__1 ;
    public final void rule__QualifiedPath__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1116:1: ( rule__QualifiedPath__Group_3__0__Impl rule__QualifiedPath__Group_3__1 )
            // InternalLPDSL.g:1117:2: rule__QualifiedPath__Group_3__0__Impl rule__QualifiedPath__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedPath__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group_3__1();

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
    // $ANTLR end "rule__QualifiedPath__Group_3__0"


    // $ANTLR start "rule__QualifiedPath__Group_3__0__Impl"
    // InternalLPDSL.g:1124:1: rule__QualifiedPath__Group_3__0__Impl : ( '/' ) ;
    public final void rule__QualifiedPath__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1128:1: ( ( '/' ) )
            // InternalLPDSL.g:1129:1: ( '/' )
            {
            // InternalLPDSL.g:1129:1: ( '/' )
            // InternalLPDSL.g:1130:2: '/'
            {
             before(grammarAccess.getQualifiedPathAccess().getSolidusKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getQualifiedPathAccess().getSolidusKeyword_3_0()); 

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
    // $ANTLR end "rule__QualifiedPath__Group_3__0__Impl"


    // $ANTLR start "rule__QualifiedPath__Group_3__1"
    // InternalLPDSL.g:1139:1: rule__QualifiedPath__Group_3__1 : rule__QualifiedPath__Group_3__1__Impl ;
    public final void rule__QualifiedPath__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1143:1: ( rule__QualifiedPath__Group_3__1__Impl )
            // InternalLPDSL.g:1144:2: rule__QualifiedPath__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group_3__1__Impl();

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
    // $ANTLR end "rule__QualifiedPath__Group_3__1"


    // $ANTLR start "rule__QualifiedPath__Group_3__1__Impl"
    // InternalLPDSL.g:1150:1: rule__QualifiedPath__Group_3__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedPath__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1154:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:1155:1: ( RULE_ID )
            {
            // InternalLPDSL.g:1155:1: ( RULE_ID )
            // InternalLPDSL.g:1156:2: RULE_ID
            {
             before(grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_3_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_3_1()); 

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
    // $ANTLR end "rule__QualifiedPath__Group_3__1__Impl"


    // $ANTLR start "rule__PageHeader__Group__0"
    // InternalLPDSL.g:1166:1: rule__PageHeader__Group__0 : rule__PageHeader__Group__0__Impl rule__PageHeader__Group__1 ;
    public final void rule__PageHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1170:1: ( rule__PageHeader__Group__0__Impl rule__PageHeader__Group__1 )
            // InternalLPDSL.g:1171:2: rule__PageHeader__Group__0__Impl rule__PageHeader__Group__1
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
    // InternalLPDSL.g:1178:1: rule__PageHeader__Group__0__Impl : ( 'header' ) ;
    public final void rule__PageHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1182:1: ( ( 'header' ) )
            // InternalLPDSL.g:1183:1: ( 'header' )
            {
            // InternalLPDSL.g:1183:1: ( 'header' )
            // InternalLPDSL.g:1184:2: 'header'
            {
             before(grammarAccess.getPageHeaderAccess().getHeaderKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalLPDSL.g:1193:1: rule__PageHeader__Group__1 : rule__PageHeader__Group__1__Impl rule__PageHeader__Group__2 ;
    public final void rule__PageHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1197:1: ( rule__PageHeader__Group__1__Impl rule__PageHeader__Group__2 )
            // InternalLPDSL.g:1198:2: rule__PageHeader__Group__1__Impl rule__PageHeader__Group__2
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
    // InternalLPDSL.g:1205:1: rule__PageHeader__Group__1__Impl : ( ( rule__PageHeader__NameAssignment_1 ) ) ;
    public final void rule__PageHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1209:1: ( ( ( rule__PageHeader__NameAssignment_1 ) ) )
            // InternalLPDSL.g:1210:1: ( ( rule__PageHeader__NameAssignment_1 ) )
            {
            // InternalLPDSL.g:1210:1: ( ( rule__PageHeader__NameAssignment_1 ) )
            // InternalLPDSL.g:1211:2: ( rule__PageHeader__NameAssignment_1 )
            {
             before(grammarAccess.getPageHeaderAccess().getNameAssignment_1()); 
            // InternalLPDSL.g:1212:2: ( rule__PageHeader__NameAssignment_1 )
            // InternalLPDSL.g:1212:3: rule__PageHeader__NameAssignment_1
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
    // InternalLPDSL.g:1220:1: rule__PageHeader__Group__2 : rule__PageHeader__Group__2__Impl rule__PageHeader__Group__3 ;
    public final void rule__PageHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1224:1: ( rule__PageHeader__Group__2__Impl rule__PageHeader__Group__3 )
            // InternalLPDSL.g:1225:2: rule__PageHeader__Group__2__Impl rule__PageHeader__Group__3
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
    // InternalLPDSL.g:1232:1: rule__PageHeader__Group__2__Impl : ( '{' ) ;
    public final void rule__PageHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1236:1: ( ( '{' ) )
            // InternalLPDSL.g:1237:1: ( '{' )
            {
            // InternalLPDSL.g:1237:1: ( '{' )
            // InternalLPDSL.g:1238:2: '{'
            {
             before(grammarAccess.getPageHeaderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalLPDSL.g:1247:1: rule__PageHeader__Group__3 : rule__PageHeader__Group__3__Impl rule__PageHeader__Group__4 ;
    public final void rule__PageHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1251:1: ( rule__PageHeader__Group__3__Impl rule__PageHeader__Group__4 )
            // InternalLPDSL.g:1252:2: rule__PageHeader__Group__3__Impl rule__PageHeader__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalLPDSL.g:1259:1: rule__PageHeader__Group__3__Impl : ( ( rule__PageHeader__TitleAssignment_3 ) ) ;
    public final void rule__PageHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1263:1: ( ( ( rule__PageHeader__TitleAssignment_3 ) ) )
            // InternalLPDSL.g:1264:1: ( ( rule__PageHeader__TitleAssignment_3 ) )
            {
            // InternalLPDSL.g:1264:1: ( ( rule__PageHeader__TitleAssignment_3 ) )
            // InternalLPDSL.g:1265:2: ( rule__PageHeader__TitleAssignment_3 )
            {
             before(grammarAccess.getPageHeaderAccess().getTitleAssignment_3()); 
            // InternalLPDSL.g:1266:2: ( rule__PageHeader__TitleAssignment_3 )
            // InternalLPDSL.g:1266:3: rule__PageHeader__TitleAssignment_3
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
    // InternalLPDSL.g:1274:1: rule__PageHeader__Group__4 : rule__PageHeader__Group__4__Impl rule__PageHeader__Group__5 ;
    public final void rule__PageHeader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1278:1: ( rule__PageHeader__Group__4__Impl rule__PageHeader__Group__5 )
            // InternalLPDSL.g:1279:2: rule__PageHeader__Group__4__Impl rule__PageHeader__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalLPDSL.g:1286:1: rule__PageHeader__Group__4__Impl : ( ( rule__PageHeader__TabsAssignment_4 )* ) ;
    public final void rule__PageHeader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1290:1: ( ( ( rule__PageHeader__TabsAssignment_4 )* ) )
            // InternalLPDSL.g:1291:1: ( ( rule__PageHeader__TabsAssignment_4 )* )
            {
            // InternalLPDSL.g:1291:1: ( ( rule__PageHeader__TabsAssignment_4 )* )
            // InternalLPDSL.g:1292:2: ( rule__PageHeader__TabsAssignment_4 )*
            {
             before(grammarAccess.getPageHeaderAccess().getTabsAssignment_4()); 
            // InternalLPDSL.g:1293:2: ( rule__PageHeader__TabsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLPDSL.g:1293:3: rule__PageHeader__TabsAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__PageHeader__TabsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalLPDSL.g:1301:1: rule__PageHeader__Group__5 : rule__PageHeader__Group__5__Impl ;
    public final void rule__PageHeader__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1305:1: ( rule__PageHeader__Group__5__Impl )
            // InternalLPDSL.g:1306:2: rule__PageHeader__Group__5__Impl
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
    // InternalLPDSL.g:1312:1: rule__PageHeader__Group__5__Impl : ( '}' ) ;
    public final void rule__PageHeader__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1316:1: ( ( '}' ) )
            // InternalLPDSL.g:1317:1: ( '}' )
            {
            // InternalLPDSL.g:1317:1: ( '}' )
            // InternalLPDSL.g:1318:2: '}'
            {
             before(grammarAccess.getPageHeaderAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalLPDSL.g:1328:1: rule__TabItems__Group__0 : rule__TabItems__Group__0__Impl rule__TabItems__Group__1 ;
    public final void rule__TabItems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1332:1: ( rule__TabItems__Group__0__Impl rule__TabItems__Group__1 )
            // InternalLPDSL.g:1333:2: rule__TabItems__Group__0__Impl rule__TabItems__Group__1
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
    // InternalLPDSL.g:1340:1: rule__TabItems__Group__0__Impl : ( ( rule__TabItems__NameAssignment_0 ) ) ;
    public final void rule__TabItems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1344:1: ( ( ( rule__TabItems__NameAssignment_0 ) ) )
            // InternalLPDSL.g:1345:1: ( ( rule__TabItems__NameAssignment_0 ) )
            {
            // InternalLPDSL.g:1345:1: ( ( rule__TabItems__NameAssignment_0 ) )
            // InternalLPDSL.g:1346:2: ( rule__TabItems__NameAssignment_0 )
            {
             before(grammarAccess.getTabItemsAccess().getNameAssignment_0()); 
            // InternalLPDSL.g:1347:2: ( rule__TabItems__NameAssignment_0 )
            // InternalLPDSL.g:1347:3: rule__TabItems__NameAssignment_0
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
    // InternalLPDSL.g:1355:1: rule__TabItems__Group__1 : rule__TabItems__Group__1__Impl rule__TabItems__Group__2 ;
    public final void rule__TabItems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1359:1: ( rule__TabItems__Group__1__Impl rule__TabItems__Group__2 )
            // InternalLPDSL.g:1360:2: rule__TabItems__Group__1__Impl rule__TabItems__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalLPDSL.g:1367:1: rule__TabItems__Group__1__Impl : ( ':' ) ;
    public final void rule__TabItems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1371:1: ( ( ':' ) )
            // InternalLPDSL.g:1372:1: ( ':' )
            {
            // InternalLPDSL.g:1372:1: ( ':' )
            // InternalLPDSL.g:1373:2: ':'
            {
             before(grammarAccess.getTabItemsAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalLPDSL.g:1382:1: rule__TabItems__Group__2 : rule__TabItems__Group__2__Impl ;
    public final void rule__TabItems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1386:1: ( rule__TabItems__Group__2__Impl )
            // InternalLPDSL.g:1387:2: rule__TabItems__Group__2__Impl
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
    // InternalLPDSL.g:1393:1: rule__TabItems__Group__2__Impl : ( ( rule__TabItems__DescriptionAssignment_2 ) ) ;
    public final void rule__TabItems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1397:1: ( ( ( rule__TabItems__DescriptionAssignment_2 ) ) )
            // InternalLPDSL.g:1398:1: ( ( rule__TabItems__DescriptionAssignment_2 ) )
            {
            // InternalLPDSL.g:1398:1: ( ( rule__TabItems__DescriptionAssignment_2 ) )
            // InternalLPDSL.g:1399:2: ( rule__TabItems__DescriptionAssignment_2 )
            {
             before(grammarAccess.getTabItemsAccess().getDescriptionAssignment_2()); 
            // InternalLPDSL.g:1400:2: ( rule__TabItems__DescriptionAssignment_2 )
            // InternalLPDSL.g:1400:3: rule__TabItems__DescriptionAssignment_2
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
    // InternalLPDSL.g:1409:1: rule__PageBody__Group__0 : rule__PageBody__Group__0__Impl rule__PageBody__Group__1 ;
    public final void rule__PageBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1413:1: ( rule__PageBody__Group__0__Impl rule__PageBody__Group__1 )
            // InternalLPDSL.g:1414:2: rule__PageBody__Group__0__Impl rule__PageBody__Group__1
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
    // InternalLPDSL.g:1421:1: rule__PageBody__Group__0__Impl : ( 'body' ) ;
    public final void rule__PageBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1425:1: ( ( 'body' ) )
            // InternalLPDSL.g:1426:1: ( 'body' )
            {
            // InternalLPDSL.g:1426:1: ( 'body' )
            // InternalLPDSL.g:1427:2: 'body'
            {
             before(grammarAccess.getPageBodyAccess().getBodyKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalLPDSL.g:1436:1: rule__PageBody__Group__1 : rule__PageBody__Group__1__Impl rule__PageBody__Group__2 ;
    public final void rule__PageBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1440:1: ( rule__PageBody__Group__1__Impl rule__PageBody__Group__2 )
            // InternalLPDSL.g:1441:2: rule__PageBody__Group__1__Impl rule__PageBody__Group__2
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
    // InternalLPDSL.g:1448:1: rule__PageBody__Group__1__Impl : ( ( rule__PageBody__NameAssignment_1 ) ) ;
    public final void rule__PageBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1452:1: ( ( ( rule__PageBody__NameAssignment_1 ) ) )
            // InternalLPDSL.g:1453:1: ( ( rule__PageBody__NameAssignment_1 ) )
            {
            // InternalLPDSL.g:1453:1: ( ( rule__PageBody__NameAssignment_1 ) )
            // InternalLPDSL.g:1454:2: ( rule__PageBody__NameAssignment_1 )
            {
             before(grammarAccess.getPageBodyAccess().getNameAssignment_1()); 
            // InternalLPDSL.g:1455:2: ( rule__PageBody__NameAssignment_1 )
            // InternalLPDSL.g:1455:3: rule__PageBody__NameAssignment_1
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
    // InternalLPDSL.g:1463:1: rule__PageBody__Group__2 : rule__PageBody__Group__2__Impl rule__PageBody__Group__3 ;
    public final void rule__PageBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1467:1: ( rule__PageBody__Group__2__Impl rule__PageBody__Group__3 )
            // InternalLPDSL.g:1468:2: rule__PageBody__Group__2__Impl rule__PageBody__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalLPDSL.g:1475:1: rule__PageBody__Group__2__Impl : ( '{' ) ;
    public final void rule__PageBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1479:1: ( ( '{' ) )
            // InternalLPDSL.g:1480:1: ( '{' )
            {
            // InternalLPDSL.g:1480:1: ( '{' )
            // InternalLPDSL.g:1481:2: '{'
            {
             before(grammarAccess.getPageBodyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalLPDSL.g:1490:1: rule__PageBody__Group__3 : rule__PageBody__Group__3__Impl rule__PageBody__Group__4 ;
    public final void rule__PageBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1494:1: ( rule__PageBody__Group__3__Impl rule__PageBody__Group__4 )
            // InternalLPDSL.g:1495:2: rule__PageBody__Group__3__Impl rule__PageBody__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalLPDSL.g:1502:1: rule__PageBody__Group__3__Impl : ( ( rule__PageBody__SectionsAssignment_3 )* ) ;
    public final void rule__PageBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1506:1: ( ( ( rule__PageBody__SectionsAssignment_3 )* ) )
            // InternalLPDSL.g:1507:1: ( ( rule__PageBody__SectionsAssignment_3 )* )
            {
            // InternalLPDSL.g:1507:1: ( ( rule__PageBody__SectionsAssignment_3 )* )
            // InternalLPDSL.g:1508:2: ( rule__PageBody__SectionsAssignment_3 )*
            {
             before(grammarAccess.getPageBodyAccess().getSectionsAssignment_3()); 
            // InternalLPDSL.g:1509:2: ( rule__PageBody__SectionsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=29 && LA11_0<=30)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLPDSL.g:1509:3: rule__PageBody__SectionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__PageBody__SectionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalLPDSL.g:1517:1: rule__PageBody__Group__4 : rule__PageBody__Group__4__Impl ;
    public final void rule__PageBody__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1521:1: ( rule__PageBody__Group__4__Impl )
            // InternalLPDSL.g:1522:2: rule__PageBody__Group__4__Impl
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
    // InternalLPDSL.g:1528:1: rule__PageBody__Group__4__Impl : ( '}' ) ;
    public final void rule__PageBody__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1532:1: ( ( '}' ) )
            // InternalLPDSL.g:1533:1: ( '}' )
            {
            // InternalLPDSL.g:1533:1: ( '}' )
            // InternalLPDSL.g:1534:2: '}'
            {
             before(grammarAccess.getPageBodyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalLPDSL.g:1544:1: rule__Resume__Group__0 : rule__Resume__Group__0__Impl rule__Resume__Group__1 ;
    public final void rule__Resume__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1548:1: ( rule__Resume__Group__0__Impl rule__Resume__Group__1 )
            // InternalLPDSL.g:1549:2: rule__Resume__Group__0__Impl rule__Resume__Group__1
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
    // InternalLPDSL.g:1556:1: rule__Resume__Group__0__Impl : ( 'resume' ) ;
    public final void rule__Resume__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1560:1: ( ( 'resume' ) )
            // InternalLPDSL.g:1561:1: ( 'resume' )
            {
            // InternalLPDSL.g:1561:1: ( 'resume' )
            // InternalLPDSL.g:1562:2: 'resume'
            {
             before(grammarAccess.getResumeAccess().getResumeKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalLPDSL.g:1571:1: rule__Resume__Group__1 : rule__Resume__Group__1__Impl rule__Resume__Group__2 ;
    public final void rule__Resume__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1575:1: ( rule__Resume__Group__1__Impl rule__Resume__Group__2 )
            // InternalLPDSL.g:1576:2: rule__Resume__Group__1__Impl rule__Resume__Group__2
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
    // InternalLPDSL.g:1583:1: rule__Resume__Group__1__Impl : ( ( rule__Resume__NameAssignment_1 ) ) ;
    public final void rule__Resume__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1587:1: ( ( ( rule__Resume__NameAssignment_1 ) ) )
            // InternalLPDSL.g:1588:1: ( ( rule__Resume__NameAssignment_1 ) )
            {
            // InternalLPDSL.g:1588:1: ( ( rule__Resume__NameAssignment_1 ) )
            // InternalLPDSL.g:1589:2: ( rule__Resume__NameAssignment_1 )
            {
             before(grammarAccess.getResumeAccess().getNameAssignment_1()); 
            // InternalLPDSL.g:1590:2: ( rule__Resume__NameAssignment_1 )
            // InternalLPDSL.g:1590:3: rule__Resume__NameAssignment_1
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
    // InternalLPDSL.g:1598:1: rule__Resume__Group__2 : rule__Resume__Group__2__Impl rule__Resume__Group__3 ;
    public final void rule__Resume__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1602:1: ( rule__Resume__Group__2__Impl rule__Resume__Group__3 )
            // InternalLPDSL.g:1603:2: rule__Resume__Group__2__Impl rule__Resume__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalLPDSL.g:1610:1: rule__Resume__Group__2__Impl : ( '{' ) ;
    public final void rule__Resume__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1614:1: ( ( '{' ) )
            // InternalLPDSL.g:1615:1: ( '{' )
            {
            // InternalLPDSL.g:1615:1: ( '{' )
            // InternalLPDSL.g:1616:2: '{'
            {
             before(grammarAccess.getResumeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalLPDSL.g:1625:1: rule__Resume__Group__3 : rule__Resume__Group__3__Impl rule__Resume__Group__4 ;
    public final void rule__Resume__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1629:1: ( rule__Resume__Group__3__Impl rule__Resume__Group__4 )
            // InternalLPDSL.g:1630:2: rule__Resume__Group__3__Impl rule__Resume__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalLPDSL.g:1637:1: rule__Resume__Group__3__Impl : ( ( rule__Resume__ResumeitemsAssignment_3 )* ) ;
    public final void rule__Resume__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1641:1: ( ( ( rule__Resume__ResumeitemsAssignment_3 )* ) )
            // InternalLPDSL.g:1642:1: ( ( rule__Resume__ResumeitemsAssignment_3 )* )
            {
            // InternalLPDSL.g:1642:1: ( ( rule__Resume__ResumeitemsAssignment_3 )* )
            // InternalLPDSL.g:1643:2: ( rule__Resume__ResumeitemsAssignment_3 )*
            {
             before(grammarAccess.getResumeAccess().getResumeitemsAssignment_3()); 
            // InternalLPDSL.g:1644:2: ( rule__Resume__ResumeitemsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLPDSL.g:1644:3: rule__Resume__ResumeitemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Resume__ResumeitemsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalLPDSL.g:1652:1: rule__Resume__Group__4 : rule__Resume__Group__4__Impl ;
    public final void rule__Resume__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1656:1: ( rule__Resume__Group__4__Impl )
            // InternalLPDSL.g:1657:2: rule__Resume__Group__4__Impl
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
    // InternalLPDSL.g:1663:1: rule__Resume__Group__4__Impl : ( '}' ) ;
    public final void rule__Resume__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1667:1: ( ( '}' ) )
            // InternalLPDSL.g:1668:1: ( '}' )
            {
            // InternalLPDSL.g:1668:1: ( '}' )
            // InternalLPDSL.g:1669:2: '}'
            {
             before(grammarAccess.getResumeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalLPDSL.g:1679:1: rule__Items__Group__0 : rule__Items__Group__0__Impl rule__Items__Group__1 ;
    public final void rule__Items__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1683:1: ( rule__Items__Group__0__Impl rule__Items__Group__1 )
            // InternalLPDSL.g:1684:2: rule__Items__Group__0__Impl rule__Items__Group__1
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
    // InternalLPDSL.g:1691:1: rule__Items__Group__0__Impl : ( ( rule__Items__NameAssignment_0 ) ) ;
    public final void rule__Items__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1695:1: ( ( ( rule__Items__NameAssignment_0 ) ) )
            // InternalLPDSL.g:1696:1: ( ( rule__Items__NameAssignment_0 ) )
            {
            // InternalLPDSL.g:1696:1: ( ( rule__Items__NameAssignment_0 ) )
            // InternalLPDSL.g:1697:2: ( rule__Items__NameAssignment_0 )
            {
             before(grammarAccess.getItemsAccess().getNameAssignment_0()); 
            // InternalLPDSL.g:1698:2: ( rule__Items__NameAssignment_0 )
            // InternalLPDSL.g:1698:3: rule__Items__NameAssignment_0
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
    // InternalLPDSL.g:1706:1: rule__Items__Group__1 : rule__Items__Group__1__Impl rule__Items__Group__2 ;
    public final void rule__Items__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1710:1: ( rule__Items__Group__1__Impl rule__Items__Group__2 )
            // InternalLPDSL.g:1711:2: rule__Items__Group__1__Impl rule__Items__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalLPDSL.g:1718:1: rule__Items__Group__1__Impl : ( ':' ) ;
    public final void rule__Items__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1722:1: ( ( ':' ) )
            // InternalLPDSL.g:1723:1: ( ':' )
            {
            // InternalLPDSL.g:1723:1: ( ':' )
            // InternalLPDSL.g:1724:2: ':'
            {
             before(grammarAccess.getItemsAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalLPDSL.g:1733:1: rule__Items__Group__2 : rule__Items__Group__2__Impl ;
    public final void rule__Items__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1737:1: ( rule__Items__Group__2__Impl )
            // InternalLPDSL.g:1738:2: rule__Items__Group__2__Impl
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
    // InternalLPDSL.g:1744:1: rule__Items__Group__2__Impl : ( ( rule__Items__DescriptionAssignment_2 ) ) ;
    public final void rule__Items__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1748:1: ( ( ( rule__Items__DescriptionAssignment_2 ) ) )
            // InternalLPDSL.g:1749:1: ( ( rule__Items__DescriptionAssignment_2 ) )
            {
            // InternalLPDSL.g:1749:1: ( ( rule__Items__DescriptionAssignment_2 ) )
            // InternalLPDSL.g:1750:2: ( rule__Items__DescriptionAssignment_2 )
            {
             before(grammarAccess.getItemsAccess().getDescriptionAssignment_2()); 
            // InternalLPDSL.g:1751:2: ( rule__Items__DescriptionAssignment_2 )
            // InternalLPDSL.g:1751:3: rule__Items__DescriptionAssignment_2
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
    // InternalLPDSL.g:1760:1: rule__AboutMe__Group__0 : rule__AboutMe__Group__0__Impl rule__AboutMe__Group__1 ;
    public final void rule__AboutMe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1764:1: ( rule__AboutMe__Group__0__Impl rule__AboutMe__Group__1 )
            // InternalLPDSL.g:1765:2: rule__AboutMe__Group__0__Impl rule__AboutMe__Group__1
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
    // InternalLPDSL.g:1772:1: rule__AboutMe__Group__0__Impl : ( 'aboutme' ) ;
    public final void rule__AboutMe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1776:1: ( ( 'aboutme' ) )
            // InternalLPDSL.g:1777:1: ( 'aboutme' )
            {
            // InternalLPDSL.g:1777:1: ( 'aboutme' )
            // InternalLPDSL.g:1778:2: 'aboutme'
            {
             before(grammarAccess.getAboutMeAccess().getAboutmeKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalLPDSL.g:1787:1: rule__AboutMe__Group__1 : rule__AboutMe__Group__1__Impl rule__AboutMe__Group__2 ;
    public final void rule__AboutMe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1791:1: ( rule__AboutMe__Group__1__Impl rule__AboutMe__Group__2 )
            // InternalLPDSL.g:1792:2: rule__AboutMe__Group__1__Impl rule__AboutMe__Group__2
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
    // InternalLPDSL.g:1799:1: rule__AboutMe__Group__1__Impl : ( ( rule__AboutMe__NameAssignment_1 ) ) ;
    public final void rule__AboutMe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1803:1: ( ( ( rule__AboutMe__NameAssignment_1 ) ) )
            // InternalLPDSL.g:1804:1: ( ( rule__AboutMe__NameAssignment_1 ) )
            {
            // InternalLPDSL.g:1804:1: ( ( rule__AboutMe__NameAssignment_1 ) )
            // InternalLPDSL.g:1805:2: ( rule__AboutMe__NameAssignment_1 )
            {
             before(grammarAccess.getAboutMeAccess().getNameAssignment_1()); 
            // InternalLPDSL.g:1806:2: ( rule__AboutMe__NameAssignment_1 )
            // InternalLPDSL.g:1806:3: rule__AboutMe__NameAssignment_1
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
    // InternalLPDSL.g:1814:1: rule__AboutMe__Group__2 : rule__AboutMe__Group__2__Impl rule__AboutMe__Group__3 ;
    public final void rule__AboutMe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1818:1: ( rule__AboutMe__Group__2__Impl rule__AboutMe__Group__3 )
            // InternalLPDSL.g:1819:2: rule__AboutMe__Group__2__Impl rule__AboutMe__Group__3
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
    // InternalLPDSL.g:1826:1: rule__AboutMe__Group__2__Impl : ( '{' ) ;
    public final void rule__AboutMe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1830:1: ( ( '{' ) )
            // InternalLPDSL.g:1831:1: ( '{' )
            {
            // InternalLPDSL.g:1831:1: ( '{' )
            // InternalLPDSL.g:1832:2: '{'
            {
             before(grammarAccess.getAboutMeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalLPDSL.g:1841:1: rule__AboutMe__Group__3 : rule__AboutMe__Group__3__Impl rule__AboutMe__Group__4 ;
    public final void rule__AboutMe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1845:1: ( rule__AboutMe__Group__3__Impl rule__AboutMe__Group__4 )
            // InternalLPDSL.g:1846:2: rule__AboutMe__Group__3__Impl rule__AboutMe__Group__4
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
    // InternalLPDSL.g:1853:1: rule__AboutMe__Group__3__Impl : ( ( rule__AboutMe__PictureAssignment_3 ) ) ;
    public final void rule__AboutMe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1857:1: ( ( ( rule__AboutMe__PictureAssignment_3 ) ) )
            // InternalLPDSL.g:1858:1: ( ( rule__AboutMe__PictureAssignment_3 ) )
            {
            // InternalLPDSL.g:1858:1: ( ( rule__AboutMe__PictureAssignment_3 ) )
            // InternalLPDSL.g:1859:2: ( rule__AboutMe__PictureAssignment_3 )
            {
             before(grammarAccess.getAboutMeAccess().getPictureAssignment_3()); 
            // InternalLPDSL.g:1860:2: ( rule__AboutMe__PictureAssignment_3 )
            // InternalLPDSL.g:1860:3: rule__AboutMe__PictureAssignment_3
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
    // InternalLPDSL.g:1868:1: rule__AboutMe__Group__4 : rule__AboutMe__Group__4__Impl rule__AboutMe__Group__5 ;
    public final void rule__AboutMe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1872:1: ( rule__AboutMe__Group__4__Impl rule__AboutMe__Group__5 )
            // InternalLPDSL.g:1873:2: rule__AboutMe__Group__4__Impl rule__AboutMe__Group__5
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
    // InternalLPDSL.g:1880:1: rule__AboutMe__Group__4__Impl : ( ( rule__AboutMe__DescriptionAssignment_4 ) ) ;
    public final void rule__AboutMe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1884:1: ( ( ( rule__AboutMe__DescriptionAssignment_4 ) ) )
            // InternalLPDSL.g:1885:1: ( ( rule__AboutMe__DescriptionAssignment_4 ) )
            {
            // InternalLPDSL.g:1885:1: ( ( rule__AboutMe__DescriptionAssignment_4 ) )
            // InternalLPDSL.g:1886:2: ( rule__AboutMe__DescriptionAssignment_4 )
            {
             before(grammarAccess.getAboutMeAccess().getDescriptionAssignment_4()); 
            // InternalLPDSL.g:1887:2: ( rule__AboutMe__DescriptionAssignment_4 )
            // InternalLPDSL.g:1887:3: rule__AboutMe__DescriptionAssignment_4
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
    // InternalLPDSL.g:1895:1: rule__AboutMe__Group__5 : rule__AboutMe__Group__5__Impl ;
    public final void rule__AboutMe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1899:1: ( rule__AboutMe__Group__5__Impl )
            // InternalLPDSL.g:1900:2: rule__AboutMe__Group__5__Impl
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
    // InternalLPDSL.g:1906:1: rule__AboutMe__Group__5__Impl : ( '}' ) ;
    public final void rule__AboutMe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1910:1: ( ( '}' ) )
            // InternalLPDSL.g:1911:1: ( '}' )
            {
            // InternalLPDSL.g:1911:1: ( '}' )
            // InternalLPDSL.g:1912:2: '}'
            {
             before(grammarAccess.getAboutMeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalLPDSL.g:1922:1: rule__Picture__Group__0 : rule__Picture__Group__0__Impl rule__Picture__Group__1 ;
    public final void rule__Picture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1926:1: ( rule__Picture__Group__0__Impl rule__Picture__Group__1 )
            // InternalLPDSL.g:1927:2: rule__Picture__Group__0__Impl rule__Picture__Group__1
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
    // InternalLPDSL.g:1934:1: rule__Picture__Group__0__Impl : ( ( rule__Picture__NameAssignment_0 ) ) ;
    public final void rule__Picture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1938:1: ( ( ( rule__Picture__NameAssignment_0 ) ) )
            // InternalLPDSL.g:1939:1: ( ( rule__Picture__NameAssignment_0 ) )
            {
            // InternalLPDSL.g:1939:1: ( ( rule__Picture__NameAssignment_0 ) )
            // InternalLPDSL.g:1940:2: ( rule__Picture__NameAssignment_0 )
            {
             before(grammarAccess.getPictureAccess().getNameAssignment_0()); 
            // InternalLPDSL.g:1941:2: ( rule__Picture__NameAssignment_0 )
            // InternalLPDSL.g:1941:3: rule__Picture__NameAssignment_0
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
    // InternalLPDSL.g:1949:1: rule__Picture__Group__1 : rule__Picture__Group__1__Impl rule__Picture__Group__2 ;
    public final void rule__Picture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1953:1: ( rule__Picture__Group__1__Impl rule__Picture__Group__2 )
            // InternalLPDSL.g:1954:2: rule__Picture__Group__1__Impl rule__Picture__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalLPDSL.g:1961:1: rule__Picture__Group__1__Impl : ( ':' ) ;
    public final void rule__Picture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1965:1: ( ( ':' ) )
            // InternalLPDSL.g:1966:1: ( ':' )
            {
            // InternalLPDSL.g:1966:1: ( ':' )
            // InternalLPDSL.g:1967:2: ':'
            {
             before(grammarAccess.getPictureAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalLPDSL.g:1976:1: rule__Picture__Group__2 : rule__Picture__Group__2__Impl ;
    public final void rule__Picture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1980:1: ( rule__Picture__Group__2__Impl )
            // InternalLPDSL.g:1981:2: rule__Picture__Group__2__Impl
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
    // InternalLPDSL.g:1987:1: rule__Picture__Group__2__Impl : ( ( rule__Picture__ImagepathAssignment_2 ) ) ;
    public final void rule__Picture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:1991:1: ( ( ( rule__Picture__ImagepathAssignment_2 ) ) )
            // InternalLPDSL.g:1992:1: ( ( rule__Picture__ImagepathAssignment_2 ) )
            {
            // InternalLPDSL.g:1992:1: ( ( rule__Picture__ImagepathAssignment_2 ) )
            // InternalLPDSL.g:1993:2: ( rule__Picture__ImagepathAssignment_2 )
            {
             before(grammarAccess.getPictureAccess().getImagepathAssignment_2()); 
            // InternalLPDSL.g:1994:2: ( rule__Picture__ImagepathAssignment_2 )
            // InternalLPDSL.g:1994:3: rule__Picture__ImagepathAssignment_2
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


    // $ANTLR start "rule__ImagePath__Group__0"
    // InternalLPDSL.g:2003:1: rule__ImagePath__Group__0 : rule__ImagePath__Group__0__Impl rule__ImagePath__Group__1 ;
    public final void rule__ImagePath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2007:1: ( rule__ImagePath__Group__0__Impl rule__ImagePath__Group__1 )
            // InternalLPDSL.g:2008:2: rule__ImagePath__Group__0__Impl rule__ImagePath__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ImagePath__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImagePath__Group__1();

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
    // $ANTLR end "rule__ImagePath__Group__0"


    // $ANTLR start "rule__ImagePath__Group__0__Impl"
    // InternalLPDSL.g:2015:1: rule__ImagePath__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ImagePath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2019:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2020:1: ( RULE_ID )
            {
            // InternalLPDSL.g:2020:1: ( RULE_ID )
            // InternalLPDSL.g:2021:2: RULE_ID
            {
             before(grammarAccess.getImagePathAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getImagePathAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ImagePath__Group__0__Impl"


    // $ANTLR start "rule__ImagePath__Group__1"
    // InternalLPDSL.g:2030:1: rule__ImagePath__Group__1 : rule__ImagePath__Group__1__Impl rule__ImagePath__Group__2 ;
    public final void rule__ImagePath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2034:1: ( rule__ImagePath__Group__1__Impl rule__ImagePath__Group__2 )
            // InternalLPDSL.g:2035:2: rule__ImagePath__Group__1__Impl rule__ImagePath__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ImagePath__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImagePath__Group__2();

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
    // $ANTLR end "rule__ImagePath__Group__1"


    // $ANTLR start "rule__ImagePath__Group__1__Impl"
    // InternalLPDSL.g:2042:1: rule__ImagePath__Group__1__Impl : ( ( rule__ImagePath__Group_1__0 )* ) ;
    public final void rule__ImagePath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2046:1: ( ( ( rule__ImagePath__Group_1__0 )* ) )
            // InternalLPDSL.g:2047:1: ( ( rule__ImagePath__Group_1__0 )* )
            {
            // InternalLPDSL.g:2047:1: ( ( rule__ImagePath__Group_1__0 )* )
            // InternalLPDSL.g:2048:2: ( rule__ImagePath__Group_1__0 )*
            {
             before(grammarAccess.getImagePathAccess().getGroup_1()); 
            // InternalLPDSL.g:2049:2: ( rule__ImagePath__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLPDSL.g:2049:3: rule__ImagePath__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ImagePath__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getImagePathAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ImagePath__Group__1__Impl"


    // $ANTLR start "rule__ImagePath__Group__2"
    // InternalLPDSL.g:2057:1: rule__ImagePath__Group__2 : rule__ImagePath__Group__2__Impl rule__ImagePath__Group__3 ;
    public final void rule__ImagePath__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2061:1: ( rule__ImagePath__Group__2__Impl rule__ImagePath__Group__3 )
            // InternalLPDSL.g:2062:2: rule__ImagePath__Group__2__Impl rule__ImagePath__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ImagePath__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImagePath__Group__3();

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
    // $ANTLR end "rule__ImagePath__Group__2"


    // $ANTLR start "rule__ImagePath__Group__2__Impl"
    // InternalLPDSL.g:2069:1: rule__ImagePath__Group__2__Impl : ( '.' ) ;
    public final void rule__ImagePath__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2073:1: ( ( '.' ) )
            // InternalLPDSL.g:2074:1: ( '.' )
            {
            // InternalLPDSL.g:2074:1: ( '.' )
            // InternalLPDSL.g:2075:2: '.'
            {
             before(grammarAccess.getImagePathAccess().getFullStopKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getImagePathAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__ImagePath__Group__2__Impl"


    // $ANTLR start "rule__ImagePath__Group__3"
    // InternalLPDSL.g:2084:1: rule__ImagePath__Group__3 : rule__ImagePath__Group__3__Impl ;
    public final void rule__ImagePath__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2088:1: ( rule__ImagePath__Group__3__Impl )
            // InternalLPDSL.g:2089:2: rule__ImagePath__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImagePath__Group__3__Impl();

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
    // $ANTLR end "rule__ImagePath__Group__3"


    // $ANTLR start "rule__ImagePath__Group__3__Impl"
    // InternalLPDSL.g:2095:1: rule__ImagePath__Group__3__Impl : ( ( rule__ImagePath__Alternatives_3 ) ) ;
    public final void rule__ImagePath__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2099:1: ( ( ( rule__ImagePath__Alternatives_3 ) ) )
            // InternalLPDSL.g:2100:1: ( ( rule__ImagePath__Alternatives_3 ) )
            {
            // InternalLPDSL.g:2100:1: ( ( rule__ImagePath__Alternatives_3 ) )
            // InternalLPDSL.g:2101:2: ( rule__ImagePath__Alternatives_3 )
            {
             before(grammarAccess.getImagePathAccess().getAlternatives_3()); 
            // InternalLPDSL.g:2102:2: ( rule__ImagePath__Alternatives_3 )
            // InternalLPDSL.g:2102:3: rule__ImagePath__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__ImagePath__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getImagePathAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__ImagePath__Group__3__Impl"


    // $ANTLR start "rule__ImagePath__Group_1__0"
    // InternalLPDSL.g:2111:1: rule__ImagePath__Group_1__0 : rule__ImagePath__Group_1__0__Impl rule__ImagePath__Group_1__1 ;
    public final void rule__ImagePath__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2115:1: ( rule__ImagePath__Group_1__0__Impl rule__ImagePath__Group_1__1 )
            // InternalLPDSL.g:2116:2: rule__ImagePath__Group_1__0__Impl rule__ImagePath__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__ImagePath__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImagePath__Group_1__1();

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
    // $ANTLR end "rule__ImagePath__Group_1__0"


    // $ANTLR start "rule__ImagePath__Group_1__0__Impl"
    // InternalLPDSL.g:2123:1: rule__ImagePath__Group_1__0__Impl : ( '/' ) ;
    public final void rule__ImagePath__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2127:1: ( ( '/' ) )
            // InternalLPDSL.g:2128:1: ( '/' )
            {
            // InternalLPDSL.g:2128:1: ( '/' )
            // InternalLPDSL.g:2129:2: '/'
            {
             before(grammarAccess.getImagePathAccess().getSolidusKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getImagePathAccess().getSolidusKeyword_1_0()); 

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
    // $ANTLR end "rule__ImagePath__Group_1__0__Impl"


    // $ANTLR start "rule__ImagePath__Group_1__1"
    // InternalLPDSL.g:2138:1: rule__ImagePath__Group_1__1 : rule__ImagePath__Group_1__1__Impl ;
    public final void rule__ImagePath__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2142:1: ( rule__ImagePath__Group_1__1__Impl )
            // InternalLPDSL.g:2143:2: rule__ImagePath__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImagePath__Group_1__1__Impl();

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
    // $ANTLR end "rule__ImagePath__Group_1__1"


    // $ANTLR start "rule__ImagePath__Group_1__1__Impl"
    // InternalLPDSL.g:2149:1: rule__ImagePath__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ImagePath__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2153:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2154:1: ( RULE_ID )
            {
            // InternalLPDSL.g:2154:1: ( RULE_ID )
            // InternalLPDSL.g:2155:2: RULE_ID
            {
             before(grammarAccess.getImagePathAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getImagePathAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__ImagePath__Group_1__1__Impl"


    // $ANTLR start "rule__LandingPage__PagecomponentAssignment"
    // InternalLPDSL.g:2165:1: rule__LandingPage__PagecomponentAssignment : ( rulePageComponent ) ;
    public final void rule__LandingPage__PagecomponentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2169:1: ( ( rulePageComponent ) )
            // InternalLPDSL.g:2170:2: ( rulePageComponent )
            {
            // InternalLPDSL.g:2170:2: ( rulePageComponent )
            // InternalLPDSL.g:2171:3: rulePageComponent
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
    // InternalLPDSL.g:2180:1: rule__PageFooter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PageFooter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2184:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2185:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2185:2: ( RULE_ID )
            // InternalLPDSL.g:2186:3: RULE_ID
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
    // InternalLPDSL.g:2195:1: rule__PageFooter__LinksAssignment_3 : ( ruleLinkItem ) ;
    public final void rule__PageFooter__LinksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2199:1: ( ( ruleLinkItem ) )
            // InternalLPDSL.g:2200:2: ( ruleLinkItem )
            {
            // InternalLPDSL.g:2200:2: ( ruleLinkItem )
            // InternalLPDSL.g:2201:3: ruleLinkItem
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
    // InternalLPDSL.g:2210:1: rule__LinkItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LinkItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2214:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2215:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2215:2: ( RULE_ID )
            // InternalLPDSL.g:2216:3: RULE_ID
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
    // InternalLPDSL.g:2225:1: rule__LinkItem__TextAssignment_3 : ( ruleItems ) ;
    public final void rule__LinkItem__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2229:1: ( ( ruleItems ) )
            // InternalLPDSL.g:2230:2: ( ruleItems )
            {
            // InternalLPDSL.g:2230:2: ( ruleItems )
            // InternalLPDSL.g:2231:3: ruleItems
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
    // InternalLPDSL.g:2240:1: rule__LinkItem__LinkAssignment_4 : ( ruleURL ) ;
    public final void rule__LinkItem__LinkAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2244:1: ( ( ruleURL ) )
            // InternalLPDSL.g:2245:2: ( ruleURL )
            {
            // InternalLPDSL.g:2245:2: ( ruleURL )
            // InternalLPDSL.g:2246:3: ruleURL
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
    // InternalLPDSL.g:2255:1: rule__URL__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__URL__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2259:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2260:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2260:2: ( RULE_ID )
            // InternalLPDSL.g:2261:3: RULE_ID
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
    // InternalLPDSL.g:2270:1: rule__URL__PathAssignment_2 : ( ruleQualifiedPath ) ;
    public final void rule__URL__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2274:1: ( ( ruleQualifiedPath ) )
            // InternalLPDSL.g:2275:2: ( ruleQualifiedPath )
            {
            // InternalLPDSL.g:2275:2: ( ruleQualifiedPath )
            // InternalLPDSL.g:2276:3: ruleQualifiedPath
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


    // $ANTLR start "rule__PageHeader__NameAssignment_1"
    // InternalLPDSL.g:2285:1: rule__PageHeader__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PageHeader__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2289:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2290:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2290:2: ( RULE_ID )
            // InternalLPDSL.g:2291:3: RULE_ID
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
    // InternalLPDSL.g:2300:1: rule__PageHeader__TitleAssignment_3 : ( ruleItems ) ;
    public final void rule__PageHeader__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2304:1: ( ( ruleItems ) )
            // InternalLPDSL.g:2305:2: ( ruleItems )
            {
            // InternalLPDSL.g:2305:2: ( ruleItems )
            // InternalLPDSL.g:2306:3: ruleItems
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
    // InternalLPDSL.g:2315:1: rule__PageHeader__TabsAssignment_4 : ( ruleTabItems ) ;
    public final void rule__PageHeader__TabsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2319:1: ( ( ruleTabItems ) )
            // InternalLPDSL.g:2320:2: ( ruleTabItems )
            {
            // InternalLPDSL.g:2320:2: ( ruleTabItems )
            // InternalLPDSL.g:2321:3: ruleTabItems
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
    // InternalLPDSL.g:2330:1: rule__TabItems__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TabItems__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2334:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2335:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2335:2: ( RULE_ID )
            // InternalLPDSL.g:2336:3: RULE_ID
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
    // InternalLPDSL.g:2345:1: rule__TabItems__DescriptionAssignment_2 : ( ruleDescription ) ;
    public final void rule__TabItems__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2349:1: ( ( ruleDescription ) )
            // InternalLPDSL.g:2350:2: ( ruleDescription )
            {
            // InternalLPDSL.g:2350:2: ( ruleDescription )
            // InternalLPDSL.g:2351:3: ruleDescription
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
    // InternalLPDSL.g:2360:1: rule__PageBody__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PageBody__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2364:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2365:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2365:2: ( RULE_ID )
            // InternalLPDSL.g:2366:3: RULE_ID
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
    // InternalLPDSL.g:2375:1: rule__PageBody__SectionsAssignment_3 : ( ruleSections ) ;
    public final void rule__PageBody__SectionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2379:1: ( ( ruleSections ) )
            // InternalLPDSL.g:2380:2: ( ruleSections )
            {
            // InternalLPDSL.g:2380:2: ( ruleSections )
            // InternalLPDSL.g:2381:3: ruleSections
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
    // InternalLPDSL.g:2390:1: rule__Resume__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Resume__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2394:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2395:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2395:2: ( RULE_ID )
            // InternalLPDSL.g:2396:3: RULE_ID
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
    // InternalLPDSL.g:2405:1: rule__Resume__ResumeitemsAssignment_3 : ( ruleItems ) ;
    public final void rule__Resume__ResumeitemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2409:1: ( ( ruleItems ) )
            // InternalLPDSL.g:2410:2: ( ruleItems )
            {
            // InternalLPDSL.g:2410:2: ( ruleItems )
            // InternalLPDSL.g:2411:3: ruleItems
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
    // InternalLPDSL.g:2420:1: rule__Items__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Items__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2424:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2425:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2425:2: ( RULE_ID )
            // InternalLPDSL.g:2426:3: RULE_ID
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
    // InternalLPDSL.g:2435:1: rule__Items__DescriptionAssignment_2 : ( ruleDescription ) ;
    public final void rule__Items__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2439:1: ( ( ruleDescription ) )
            // InternalLPDSL.g:2440:2: ( ruleDescription )
            {
            // InternalLPDSL.g:2440:2: ( ruleDescription )
            // InternalLPDSL.g:2441:3: ruleDescription
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
    // InternalLPDSL.g:2450:1: rule__Description__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Description__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2454:1: ( ( RULE_STRING ) )
            // InternalLPDSL.g:2455:2: ( RULE_STRING )
            {
            // InternalLPDSL.g:2455:2: ( RULE_STRING )
            // InternalLPDSL.g:2456:3: RULE_STRING
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
    // InternalLPDSL.g:2465:1: rule__AboutMe__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AboutMe__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2469:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2470:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2470:2: ( RULE_ID )
            // InternalLPDSL.g:2471:3: RULE_ID
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
    // InternalLPDSL.g:2480:1: rule__AboutMe__PictureAssignment_3 : ( rulePicture ) ;
    public final void rule__AboutMe__PictureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2484:1: ( ( rulePicture ) )
            // InternalLPDSL.g:2485:2: ( rulePicture )
            {
            // InternalLPDSL.g:2485:2: ( rulePicture )
            // InternalLPDSL.g:2486:3: rulePicture
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
    // InternalLPDSL.g:2495:1: rule__AboutMe__DescriptionAssignment_4 : ( ruleItems ) ;
    public final void rule__AboutMe__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2499:1: ( ( ruleItems ) )
            // InternalLPDSL.g:2500:2: ( ruleItems )
            {
            // InternalLPDSL.g:2500:2: ( ruleItems )
            // InternalLPDSL.g:2501:3: ruleItems
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
    // InternalLPDSL.g:2510:1: rule__Picture__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Picture__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2514:1: ( ( RULE_ID ) )
            // InternalLPDSL.g:2515:2: ( RULE_ID )
            {
            // InternalLPDSL.g:2515:2: ( RULE_ID )
            // InternalLPDSL.g:2516:3: RULE_ID
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
    // InternalLPDSL.g:2525:1: rule__Picture__ImagepathAssignment_2 : ( ruleImagePath ) ;
    public final void rule__Picture__ImagepathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLPDSL.g:2529:1: ( ( ruleImagePath ) )
            // InternalLPDSL.g:2530:2: ( ruleImagePath )
            {
            // InternalLPDSL.g:2530:2: ( ruleImagePath )
            // InternalLPDSL.g:2531:3: ruleImagePath
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000018100002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000060400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000FC000L});

}