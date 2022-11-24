package grid.gameoflife.ide.contentassist.antlr.internal;

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
import grid.gameoflife.services.GameOfLifeDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameOfLifeDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'dead'", "'alive'", "'Grid:'", "'length:'", "'width:'", "'row:'", "'col:'", "'state:'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalGameOfLifeDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGameOfLifeDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGameOfLifeDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGameOfLifeDSL.g"; }


    	private GameOfLifeDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(GameOfLifeDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGrid"
    // InternalGameOfLifeDSL.g:53:1: entryRuleGrid : ruleGrid EOF ;
    public final void entryRuleGrid() throws RecognitionException {
        try {
            // InternalGameOfLifeDSL.g:54:1: ( ruleGrid EOF )
            // InternalGameOfLifeDSL.g:55:1: ruleGrid EOF
            {
             before(grammarAccess.getGridRule()); 
            pushFollow(FOLLOW_1);
            ruleGrid();

            state._fsp--;

             after(grammarAccess.getGridRule()); 
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
    // $ANTLR end "entryRuleGrid"


    // $ANTLR start "ruleGrid"
    // InternalGameOfLifeDSL.g:62:1: ruleGrid : ( ( rule__Grid__Group__0 ) ) ;
    public final void ruleGrid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:66:2: ( ( ( rule__Grid__Group__0 ) ) )
            // InternalGameOfLifeDSL.g:67:2: ( ( rule__Grid__Group__0 ) )
            {
            // InternalGameOfLifeDSL.g:67:2: ( ( rule__Grid__Group__0 ) )
            // InternalGameOfLifeDSL.g:68:3: ( rule__Grid__Group__0 )
            {
             before(grammarAccess.getGridAccess().getGroup()); 
            // InternalGameOfLifeDSL.g:69:3: ( rule__Grid__Group__0 )
            // InternalGameOfLifeDSL.g:69:4: rule__Grid__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Grid__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrid"


    // $ANTLR start "entryRuleCell"
    // InternalGameOfLifeDSL.g:78:1: entryRuleCell : ruleCell EOF ;
    public final void entryRuleCell() throws RecognitionException {
        try {
            // InternalGameOfLifeDSL.g:79:1: ( ruleCell EOF )
            // InternalGameOfLifeDSL.g:80:1: ruleCell EOF
            {
             before(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getCellRule()); 
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
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalGameOfLifeDSL.g:87:1: ruleCell : ( ( rule__Cell__Group__0 ) ) ;
    public final void ruleCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:91:2: ( ( ( rule__Cell__Group__0 ) ) )
            // InternalGameOfLifeDSL.g:92:2: ( ( rule__Cell__Group__0 ) )
            {
            // InternalGameOfLifeDSL.g:92:2: ( ( rule__Cell__Group__0 ) )
            // InternalGameOfLifeDSL.g:93:3: ( rule__Cell__Group__0 )
            {
             before(grammarAccess.getCellAccess().getGroup()); 
            // InternalGameOfLifeDSL.g:94:3: ( rule__Cell__Group__0 )
            // InternalGameOfLifeDSL.g:94:4: rule__Cell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCell"


    // $ANTLR start "ruleState"
    // InternalGameOfLifeDSL.g:103:1: ruleState : ( ( rule__State__Alternatives ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:107:1: ( ( ( rule__State__Alternatives ) ) )
            // InternalGameOfLifeDSL.g:108:2: ( ( rule__State__Alternatives ) )
            {
            // InternalGameOfLifeDSL.g:108:2: ( ( rule__State__Alternatives ) )
            // InternalGameOfLifeDSL.g:109:3: ( rule__State__Alternatives )
            {
             before(grammarAccess.getStateAccess().getAlternatives()); 
            // InternalGameOfLifeDSL.g:110:3: ( rule__State__Alternatives )
            // InternalGameOfLifeDSL.g:110:4: rule__State__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__State__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "rule__State__Alternatives"
    // InternalGameOfLifeDSL.g:118:1: rule__State__Alternatives : ( ( ( 'dead' ) ) | ( ( 'alive' ) ) );
    public final void rule__State__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:122:1: ( ( ( 'dead' ) ) | ( ( 'alive' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGameOfLifeDSL.g:123:2: ( ( 'dead' ) )
                    {
                    // InternalGameOfLifeDSL.g:123:2: ( ( 'dead' ) )
                    // InternalGameOfLifeDSL.g:124:3: ( 'dead' )
                    {
                     before(grammarAccess.getStateAccess().getDEADEnumLiteralDeclaration_0()); 
                    // InternalGameOfLifeDSL.g:125:3: ( 'dead' )
                    // InternalGameOfLifeDSL.g:125:4: 'dead'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getStateAccess().getDEADEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGameOfLifeDSL.g:129:2: ( ( 'alive' ) )
                    {
                    // InternalGameOfLifeDSL.g:129:2: ( ( 'alive' ) )
                    // InternalGameOfLifeDSL.g:130:3: ( 'alive' )
                    {
                     before(grammarAccess.getStateAccess().getALIVEEnumLiteralDeclaration_1()); 
                    // InternalGameOfLifeDSL.g:131:3: ( 'alive' )
                    // InternalGameOfLifeDSL.g:131:4: 'alive'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getStateAccess().getALIVEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__State__Alternatives"


    // $ANTLR start "rule__Grid__Group__0"
    // InternalGameOfLifeDSL.g:139:1: rule__Grid__Group__0 : rule__Grid__Group__0__Impl rule__Grid__Group__1 ;
    public final void rule__Grid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:143:1: ( rule__Grid__Group__0__Impl rule__Grid__Group__1 )
            // InternalGameOfLifeDSL.g:144:2: rule__Grid__Group__0__Impl rule__Grid__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Grid__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__1();

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
    // $ANTLR end "rule__Grid__Group__0"


    // $ANTLR start "rule__Grid__Group__0__Impl"
    // InternalGameOfLifeDSL.g:151:1: rule__Grid__Group__0__Impl : ( 'Grid:' ) ;
    public final void rule__Grid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:155:1: ( ( 'Grid:' ) )
            // InternalGameOfLifeDSL.g:156:1: ( 'Grid:' )
            {
            // InternalGameOfLifeDSL.g:156:1: ( 'Grid:' )
            // InternalGameOfLifeDSL.g:157:2: 'Grid:'
            {
             before(grammarAccess.getGridAccess().getGridKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getGridKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__0__Impl"


    // $ANTLR start "rule__Grid__Group__1"
    // InternalGameOfLifeDSL.g:166:1: rule__Grid__Group__1 : rule__Grid__Group__1__Impl rule__Grid__Group__2 ;
    public final void rule__Grid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:170:1: ( rule__Grid__Group__1__Impl rule__Grid__Group__2 )
            // InternalGameOfLifeDSL.g:171:2: rule__Grid__Group__1__Impl rule__Grid__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Grid__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__2();

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
    // $ANTLR end "rule__Grid__Group__1"


    // $ANTLR start "rule__Grid__Group__1__Impl"
    // InternalGameOfLifeDSL.g:178:1: rule__Grid__Group__1__Impl : ( ( rule__Grid__NameAssignment_1 ) ) ;
    public final void rule__Grid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:182:1: ( ( ( rule__Grid__NameAssignment_1 ) ) )
            // InternalGameOfLifeDSL.g:183:1: ( ( rule__Grid__NameAssignment_1 ) )
            {
            // InternalGameOfLifeDSL.g:183:1: ( ( rule__Grid__NameAssignment_1 ) )
            // InternalGameOfLifeDSL.g:184:2: ( rule__Grid__NameAssignment_1 )
            {
             before(grammarAccess.getGridAccess().getNameAssignment_1()); 
            // InternalGameOfLifeDSL.g:185:2: ( rule__Grid__NameAssignment_1 )
            // InternalGameOfLifeDSL.g:185:3: rule__Grid__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Grid__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__1__Impl"


    // $ANTLR start "rule__Grid__Group__2"
    // InternalGameOfLifeDSL.g:193:1: rule__Grid__Group__2 : rule__Grid__Group__2__Impl rule__Grid__Group__3 ;
    public final void rule__Grid__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:197:1: ( rule__Grid__Group__2__Impl rule__Grid__Group__3 )
            // InternalGameOfLifeDSL.g:198:2: rule__Grid__Group__2__Impl rule__Grid__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Grid__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__3();

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
    // $ANTLR end "rule__Grid__Group__2"


    // $ANTLR start "rule__Grid__Group__2__Impl"
    // InternalGameOfLifeDSL.g:205:1: rule__Grid__Group__2__Impl : ( 'length:' ) ;
    public final void rule__Grid__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:209:1: ( ( 'length:' ) )
            // InternalGameOfLifeDSL.g:210:1: ( 'length:' )
            {
            // InternalGameOfLifeDSL.g:210:1: ( 'length:' )
            // InternalGameOfLifeDSL.g:211:2: 'length:'
            {
             before(grammarAccess.getGridAccess().getLengthKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getLengthKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__2__Impl"


    // $ANTLR start "rule__Grid__Group__3"
    // InternalGameOfLifeDSL.g:220:1: rule__Grid__Group__3 : rule__Grid__Group__3__Impl rule__Grid__Group__4 ;
    public final void rule__Grid__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:224:1: ( rule__Grid__Group__3__Impl rule__Grid__Group__4 )
            // InternalGameOfLifeDSL.g:225:2: rule__Grid__Group__3__Impl rule__Grid__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Grid__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__4();

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
    // $ANTLR end "rule__Grid__Group__3"


    // $ANTLR start "rule__Grid__Group__3__Impl"
    // InternalGameOfLifeDSL.g:232:1: rule__Grid__Group__3__Impl : ( ( rule__Grid__LengthAssignment_3 ) ) ;
    public final void rule__Grid__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:236:1: ( ( ( rule__Grid__LengthAssignment_3 ) ) )
            // InternalGameOfLifeDSL.g:237:1: ( ( rule__Grid__LengthAssignment_3 ) )
            {
            // InternalGameOfLifeDSL.g:237:1: ( ( rule__Grid__LengthAssignment_3 ) )
            // InternalGameOfLifeDSL.g:238:2: ( rule__Grid__LengthAssignment_3 )
            {
             before(grammarAccess.getGridAccess().getLengthAssignment_3()); 
            // InternalGameOfLifeDSL.g:239:2: ( rule__Grid__LengthAssignment_3 )
            // InternalGameOfLifeDSL.g:239:3: rule__Grid__LengthAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Grid__LengthAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getLengthAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__3__Impl"


    // $ANTLR start "rule__Grid__Group__4"
    // InternalGameOfLifeDSL.g:247:1: rule__Grid__Group__4 : rule__Grid__Group__4__Impl rule__Grid__Group__5 ;
    public final void rule__Grid__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:251:1: ( rule__Grid__Group__4__Impl rule__Grid__Group__5 )
            // InternalGameOfLifeDSL.g:252:2: rule__Grid__Group__4__Impl rule__Grid__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Grid__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__5();

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
    // $ANTLR end "rule__Grid__Group__4"


    // $ANTLR start "rule__Grid__Group__4__Impl"
    // InternalGameOfLifeDSL.g:259:1: rule__Grid__Group__4__Impl : ( 'width:' ) ;
    public final void rule__Grid__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:263:1: ( ( 'width:' ) )
            // InternalGameOfLifeDSL.g:264:1: ( 'width:' )
            {
            // InternalGameOfLifeDSL.g:264:1: ( 'width:' )
            // InternalGameOfLifeDSL.g:265:2: 'width:'
            {
             before(grammarAccess.getGridAccess().getWidthKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getWidthKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__4__Impl"


    // $ANTLR start "rule__Grid__Group__5"
    // InternalGameOfLifeDSL.g:274:1: rule__Grid__Group__5 : rule__Grid__Group__5__Impl rule__Grid__Group__6 ;
    public final void rule__Grid__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:278:1: ( rule__Grid__Group__5__Impl rule__Grid__Group__6 )
            // InternalGameOfLifeDSL.g:279:2: rule__Grid__Group__5__Impl rule__Grid__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Grid__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__6();

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
    // $ANTLR end "rule__Grid__Group__5"


    // $ANTLR start "rule__Grid__Group__5__Impl"
    // InternalGameOfLifeDSL.g:286:1: rule__Grid__Group__5__Impl : ( ( rule__Grid__WidthAssignment_5 ) ) ;
    public final void rule__Grid__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:290:1: ( ( ( rule__Grid__WidthAssignment_5 ) ) )
            // InternalGameOfLifeDSL.g:291:1: ( ( rule__Grid__WidthAssignment_5 ) )
            {
            // InternalGameOfLifeDSL.g:291:1: ( ( rule__Grid__WidthAssignment_5 ) )
            // InternalGameOfLifeDSL.g:292:2: ( rule__Grid__WidthAssignment_5 )
            {
             before(grammarAccess.getGridAccess().getWidthAssignment_5()); 
            // InternalGameOfLifeDSL.g:293:2: ( rule__Grid__WidthAssignment_5 )
            // InternalGameOfLifeDSL.g:293:3: rule__Grid__WidthAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Grid__WidthAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getWidthAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__5__Impl"


    // $ANTLR start "rule__Grid__Group__6"
    // InternalGameOfLifeDSL.g:301:1: rule__Grid__Group__6 : rule__Grid__Group__6__Impl ;
    public final void rule__Grid__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:305:1: ( rule__Grid__Group__6__Impl )
            // InternalGameOfLifeDSL.g:306:2: rule__Grid__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Grid__Group__6__Impl();

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
    // $ANTLR end "rule__Grid__Group__6"


    // $ANTLR start "rule__Grid__Group__6__Impl"
    // InternalGameOfLifeDSL.g:312:1: rule__Grid__Group__6__Impl : ( ( rule__Grid__CellsAssignment_6 )* ) ;
    public final void rule__Grid__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:316:1: ( ( ( rule__Grid__CellsAssignment_6 )* ) )
            // InternalGameOfLifeDSL.g:317:1: ( ( rule__Grid__CellsAssignment_6 )* )
            {
            // InternalGameOfLifeDSL.g:317:1: ( ( rule__Grid__CellsAssignment_6 )* )
            // InternalGameOfLifeDSL.g:318:2: ( rule__Grid__CellsAssignment_6 )*
            {
             before(grammarAccess.getGridAccess().getCellsAssignment_6()); 
            // InternalGameOfLifeDSL.g:319:2: ( rule__Grid__CellsAssignment_6 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGameOfLifeDSL.g:319:3: rule__Grid__CellsAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Grid__CellsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getGridAccess().getCellsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__6__Impl"


    // $ANTLR start "rule__Cell__Group__0"
    // InternalGameOfLifeDSL.g:328:1: rule__Cell__Group__0 : rule__Cell__Group__0__Impl rule__Cell__Group__1 ;
    public final void rule__Cell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:332:1: ( rule__Cell__Group__0__Impl rule__Cell__Group__1 )
            // InternalGameOfLifeDSL.g:333:2: rule__Cell__Group__0__Impl rule__Cell__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Cell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__1();

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
    // $ANTLR end "rule__Cell__Group__0"


    // $ANTLR start "rule__Cell__Group__0__Impl"
    // InternalGameOfLifeDSL.g:340:1: rule__Cell__Group__0__Impl : ( 'row:' ) ;
    public final void rule__Cell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:344:1: ( ( 'row:' ) )
            // InternalGameOfLifeDSL.g:345:1: ( 'row:' )
            {
            // InternalGameOfLifeDSL.g:345:1: ( 'row:' )
            // InternalGameOfLifeDSL.g:346:2: 'row:'
            {
             before(grammarAccess.getCellAccess().getRowKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getRowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__0__Impl"


    // $ANTLR start "rule__Cell__Group__1"
    // InternalGameOfLifeDSL.g:355:1: rule__Cell__Group__1 : rule__Cell__Group__1__Impl rule__Cell__Group__2 ;
    public final void rule__Cell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:359:1: ( rule__Cell__Group__1__Impl rule__Cell__Group__2 )
            // InternalGameOfLifeDSL.g:360:2: rule__Cell__Group__1__Impl rule__Cell__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Cell__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__2();

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
    // $ANTLR end "rule__Cell__Group__1"


    // $ANTLR start "rule__Cell__Group__1__Impl"
    // InternalGameOfLifeDSL.g:367:1: rule__Cell__Group__1__Impl : ( ( rule__Cell__RowAssignment_1 ) ) ;
    public final void rule__Cell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:371:1: ( ( ( rule__Cell__RowAssignment_1 ) ) )
            // InternalGameOfLifeDSL.g:372:1: ( ( rule__Cell__RowAssignment_1 ) )
            {
            // InternalGameOfLifeDSL.g:372:1: ( ( rule__Cell__RowAssignment_1 ) )
            // InternalGameOfLifeDSL.g:373:2: ( rule__Cell__RowAssignment_1 )
            {
             before(grammarAccess.getCellAccess().getRowAssignment_1()); 
            // InternalGameOfLifeDSL.g:374:2: ( rule__Cell__RowAssignment_1 )
            // InternalGameOfLifeDSL.g:374:3: rule__Cell__RowAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cell__RowAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getRowAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__1__Impl"


    // $ANTLR start "rule__Cell__Group__2"
    // InternalGameOfLifeDSL.g:382:1: rule__Cell__Group__2 : rule__Cell__Group__2__Impl rule__Cell__Group__3 ;
    public final void rule__Cell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:386:1: ( rule__Cell__Group__2__Impl rule__Cell__Group__3 )
            // InternalGameOfLifeDSL.g:387:2: rule__Cell__Group__2__Impl rule__Cell__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Cell__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__3();

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
    // $ANTLR end "rule__Cell__Group__2"


    // $ANTLR start "rule__Cell__Group__2__Impl"
    // InternalGameOfLifeDSL.g:394:1: rule__Cell__Group__2__Impl : ( 'col:' ) ;
    public final void rule__Cell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:398:1: ( ( 'col:' ) )
            // InternalGameOfLifeDSL.g:399:1: ( 'col:' )
            {
            // InternalGameOfLifeDSL.g:399:1: ( 'col:' )
            // InternalGameOfLifeDSL.g:400:2: 'col:'
            {
             before(grammarAccess.getCellAccess().getColKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getColKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__2__Impl"


    // $ANTLR start "rule__Cell__Group__3"
    // InternalGameOfLifeDSL.g:409:1: rule__Cell__Group__3 : rule__Cell__Group__3__Impl rule__Cell__Group__4 ;
    public final void rule__Cell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:413:1: ( rule__Cell__Group__3__Impl rule__Cell__Group__4 )
            // InternalGameOfLifeDSL.g:414:2: rule__Cell__Group__3__Impl rule__Cell__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Cell__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__4();

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
    // $ANTLR end "rule__Cell__Group__3"


    // $ANTLR start "rule__Cell__Group__3__Impl"
    // InternalGameOfLifeDSL.g:421:1: rule__Cell__Group__3__Impl : ( ( rule__Cell__ColAssignment_3 ) ) ;
    public final void rule__Cell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:425:1: ( ( ( rule__Cell__ColAssignment_3 ) ) )
            // InternalGameOfLifeDSL.g:426:1: ( ( rule__Cell__ColAssignment_3 ) )
            {
            // InternalGameOfLifeDSL.g:426:1: ( ( rule__Cell__ColAssignment_3 ) )
            // InternalGameOfLifeDSL.g:427:2: ( rule__Cell__ColAssignment_3 )
            {
             before(grammarAccess.getCellAccess().getColAssignment_3()); 
            // InternalGameOfLifeDSL.g:428:2: ( rule__Cell__ColAssignment_3 )
            // InternalGameOfLifeDSL.g:428:3: rule__Cell__ColAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Cell__ColAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getColAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__3__Impl"


    // $ANTLR start "rule__Cell__Group__4"
    // InternalGameOfLifeDSL.g:436:1: rule__Cell__Group__4 : rule__Cell__Group__4__Impl rule__Cell__Group__5 ;
    public final void rule__Cell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:440:1: ( rule__Cell__Group__4__Impl rule__Cell__Group__5 )
            // InternalGameOfLifeDSL.g:441:2: rule__Cell__Group__4__Impl rule__Cell__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Cell__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__5();

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
    // $ANTLR end "rule__Cell__Group__4"


    // $ANTLR start "rule__Cell__Group__4__Impl"
    // InternalGameOfLifeDSL.g:448:1: rule__Cell__Group__4__Impl : ( 'state:' ) ;
    public final void rule__Cell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:452:1: ( ( 'state:' ) )
            // InternalGameOfLifeDSL.g:453:1: ( 'state:' )
            {
            // InternalGameOfLifeDSL.g:453:1: ( 'state:' )
            // InternalGameOfLifeDSL.g:454:2: 'state:'
            {
             before(grammarAccess.getCellAccess().getStateKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getStateKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__4__Impl"


    // $ANTLR start "rule__Cell__Group__5"
    // InternalGameOfLifeDSL.g:463:1: rule__Cell__Group__5 : rule__Cell__Group__5__Impl ;
    public final void rule__Cell__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:467:1: ( rule__Cell__Group__5__Impl )
            // InternalGameOfLifeDSL.g:468:2: rule__Cell__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Group__5__Impl();

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
    // $ANTLR end "rule__Cell__Group__5"


    // $ANTLR start "rule__Cell__Group__5__Impl"
    // InternalGameOfLifeDSL.g:474:1: rule__Cell__Group__5__Impl : ( ( rule__Cell__StateAssignment_5 ) ) ;
    public final void rule__Cell__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:478:1: ( ( ( rule__Cell__StateAssignment_5 ) ) )
            // InternalGameOfLifeDSL.g:479:1: ( ( rule__Cell__StateAssignment_5 ) )
            {
            // InternalGameOfLifeDSL.g:479:1: ( ( rule__Cell__StateAssignment_5 ) )
            // InternalGameOfLifeDSL.g:480:2: ( rule__Cell__StateAssignment_5 )
            {
             before(grammarAccess.getCellAccess().getStateAssignment_5()); 
            // InternalGameOfLifeDSL.g:481:2: ( rule__Cell__StateAssignment_5 )
            // InternalGameOfLifeDSL.g:481:3: rule__Cell__StateAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Cell__StateAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getStateAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__5__Impl"


    // $ANTLR start "rule__Grid__NameAssignment_1"
    // InternalGameOfLifeDSL.g:490:1: rule__Grid__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Grid__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:494:1: ( ( RULE_ID ) )
            // InternalGameOfLifeDSL.g:495:2: ( RULE_ID )
            {
            // InternalGameOfLifeDSL.g:495:2: ( RULE_ID )
            // InternalGameOfLifeDSL.g:496:3: RULE_ID
            {
             before(grammarAccess.getGridAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__NameAssignment_1"


    // $ANTLR start "rule__Grid__LengthAssignment_3"
    // InternalGameOfLifeDSL.g:505:1: rule__Grid__LengthAssignment_3 : ( RULE_INT ) ;
    public final void rule__Grid__LengthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:509:1: ( ( RULE_INT ) )
            // InternalGameOfLifeDSL.g:510:2: ( RULE_INT )
            {
            // InternalGameOfLifeDSL.g:510:2: ( RULE_INT )
            // InternalGameOfLifeDSL.g:511:3: RULE_INT
            {
             before(grammarAccess.getGridAccess().getLengthINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getLengthINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__LengthAssignment_3"


    // $ANTLR start "rule__Grid__WidthAssignment_5"
    // InternalGameOfLifeDSL.g:520:1: rule__Grid__WidthAssignment_5 : ( RULE_INT ) ;
    public final void rule__Grid__WidthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:524:1: ( ( RULE_INT ) )
            // InternalGameOfLifeDSL.g:525:2: ( RULE_INT )
            {
            // InternalGameOfLifeDSL.g:525:2: ( RULE_INT )
            // InternalGameOfLifeDSL.g:526:3: RULE_INT
            {
             before(grammarAccess.getGridAccess().getWidthINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getWidthINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__WidthAssignment_5"


    // $ANTLR start "rule__Grid__CellsAssignment_6"
    // InternalGameOfLifeDSL.g:535:1: rule__Grid__CellsAssignment_6 : ( ruleCell ) ;
    public final void rule__Grid__CellsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:539:1: ( ( ruleCell ) )
            // InternalGameOfLifeDSL.g:540:2: ( ruleCell )
            {
            // InternalGameOfLifeDSL.g:540:2: ( ruleCell )
            // InternalGameOfLifeDSL.g:541:3: ruleCell
            {
             before(grammarAccess.getGridAccess().getCellsCellParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getGridAccess().getCellsCellParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__CellsAssignment_6"


    // $ANTLR start "rule__Cell__RowAssignment_1"
    // InternalGameOfLifeDSL.g:550:1: rule__Cell__RowAssignment_1 : ( RULE_INT ) ;
    public final void rule__Cell__RowAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:554:1: ( ( RULE_INT ) )
            // InternalGameOfLifeDSL.g:555:2: ( RULE_INT )
            {
            // InternalGameOfLifeDSL.g:555:2: ( RULE_INT )
            // InternalGameOfLifeDSL.g:556:3: RULE_INT
            {
             before(grammarAccess.getCellAccess().getRowINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getRowINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__RowAssignment_1"


    // $ANTLR start "rule__Cell__ColAssignment_3"
    // InternalGameOfLifeDSL.g:565:1: rule__Cell__ColAssignment_3 : ( RULE_INT ) ;
    public final void rule__Cell__ColAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:569:1: ( ( RULE_INT ) )
            // InternalGameOfLifeDSL.g:570:2: ( RULE_INT )
            {
            // InternalGameOfLifeDSL.g:570:2: ( RULE_INT )
            // InternalGameOfLifeDSL.g:571:3: RULE_INT
            {
             before(grammarAccess.getCellAccess().getColINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getColINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__ColAssignment_3"


    // $ANTLR start "rule__Cell__StateAssignment_5"
    // InternalGameOfLifeDSL.g:580:1: rule__Cell__StateAssignment_5 : ( ruleState ) ;
    public final void rule__Cell__StateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:584:1: ( ( ruleState ) )
            // InternalGameOfLifeDSL.g:585:2: ( ruleState )
            {
            // InternalGameOfLifeDSL.g:585:2: ( ruleState )
            // InternalGameOfLifeDSL.g:586:3: ruleState
            {
             before(grammarAccess.getCellAccess().getStateStateEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getCellAccess().getStateStateEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__StateAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001800L});

}