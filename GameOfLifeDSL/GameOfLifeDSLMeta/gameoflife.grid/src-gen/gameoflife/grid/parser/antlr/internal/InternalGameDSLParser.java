package gameoflife.grid.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import gameoflife.grid.services.GameDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Grid:'", "'row:'", "'col:'", "'neighbours:'", "'dead'", "'alive'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalGameDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGameDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGameDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGameDSL.g"; }



     	private GameDSLGrammarAccess grammarAccess;

        public InternalGameDSLParser(TokenStream input, GameDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Grid";
       	}

       	@Override
       	protected GameDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGrid"
    // InternalGameDSL.g:65:1: entryRuleGrid returns [EObject current=null] : iv_ruleGrid= ruleGrid EOF ;
    public final EObject entryRuleGrid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrid = null;


        try {
            // InternalGameDSL.g:65:45: (iv_ruleGrid= ruleGrid EOF )
            // InternalGameDSL.g:66:2: iv_ruleGrid= ruleGrid EOF
            {
             newCompositeNode(grammarAccess.getGridRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrid=ruleGrid();

            state._fsp--;

             current =iv_ruleGrid; 
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
    // $ANTLR end "entryRuleGrid"


    // $ANTLR start "ruleGrid"
    // InternalGameDSL.g:72:1: ruleGrid returns [EObject current=null] : (otherlv_0= 'Grid:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cells_2_0= ruleCell ) )* ) ;
    public final EObject ruleGrid() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_cells_2_0 = null;



        	enterRule();

        try {
            // InternalGameDSL.g:78:2: ( (otherlv_0= 'Grid:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cells_2_0= ruleCell ) )* ) )
            // InternalGameDSL.g:79:2: (otherlv_0= 'Grid:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cells_2_0= ruleCell ) )* )
            {
            // InternalGameDSL.g:79:2: (otherlv_0= 'Grid:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cells_2_0= ruleCell ) )* )
            // InternalGameDSL.g:80:3: otherlv_0= 'Grid:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cells_2_0= ruleCell ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGridAccess().getGridKeyword_0());
            		
            // InternalGameDSL.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGameDSL.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGameDSL.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalGameDSL.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGridAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGridRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGameDSL.g:102:3: ( (lv_cells_2_0= ruleCell ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGameDSL.g:103:4: (lv_cells_2_0= ruleCell )
            	    {
            	    // InternalGameDSL.g:103:4: (lv_cells_2_0= ruleCell )
            	    // InternalGameDSL.g:104:5: lv_cells_2_0= ruleCell
            	    {

            	    					newCompositeNode(grammarAccess.getGridAccess().getCellsCellParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_cells_2_0=ruleCell();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGridRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cells",
            	    						lv_cells_2_0,
            	    						"gameoflife.grid.GameDSL.Cell");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleGrid"


    // $ANTLR start "entryRuleCell"
    // InternalGameDSL.g:125:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // InternalGameDSL.g:125:45: (iv_ruleCell= ruleCell EOF )
            // InternalGameDSL.g:126:2: iv_ruleCell= ruleCell EOF
            {
             newCompositeNode(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCell=ruleCell();

            state._fsp--;

             current =iv_ruleCell; 
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
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalGameDSL.g:132:1: ruleCell returns [EObject current=null] : (otherlv_0= 'row:' ( (lv_row_1_0= RULE_INT ) ) otherlv_2= 'col:' ( (lv_col_3_0= RULE_INT ) ) otherlv_4= 'neighbours:' ( (lv_neighbours_5_0= RULE_INT ) ) ( (lv_state_6_0= ruleState ) ) ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_row_1_0=null;
        Token otherlv_2=null;
        Token lv_col_3_0=null;
        Token otherlv_4=null;
        Token lv_neighbours_5_0=null;
        Enumerator lv_state_6_0 = null;



        	enterRule();

        try {
            // InternalGameDSL.g:138:2: ( (otherlv_0= 'row:' ( (lv_row_1_0= RULE_INT ) ) otherlv_2= 'col:' ( (lv_col_3_0= RULE_INT ) ) otherlv_4= 'neighbours:' ( (lv_neighbours_5_0= RULE_INT ) ) ( (lv_state_6_0= ruleState ) ) ) )
            // InternalGameDSL.g:139:2: (otherlv_0= 'row:' ( (lv_row_1_0= RULE_INT ) ) otherlv_2= 'col:' ( (lv_col_3_0= RULE_INT ) ) otherlv_4= 'neighbours:' ( (lv_neighbours_5_0= RULE_INT ) ) ( (lv_state_6_0= ruleState ) ) )
            {
            // InternalGameDSL.g:139:2: (otherlv_0= 'row:' ( (lv_row_1_0= RULE_INT ) ) otherlv_2= 'col:' ( (lv_col_3_0= RULE_INT ) ) otherlv_4= 'neighbours:' ( (lv_neighbours_5_0= RULE_INT ) ) ( (lv_state_6_0= ruleState ) ) )
            // InternalGameDSL.g:140:3: otherlv_0= 'row:' ( (lv_row_1_0= RULE_INT ) ) otherlv_2= 'col:' ( (lv_col_3_0= RULE_INT ) ) otherlv_4= 'neighbours:' ( (lv_neighbours_5_0= RULE_INT ) ) ( (lv_state_6_0= ruleState ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCellAccess().getRowKeyword_0());
            		
            // InternalGameDSL.g:144:3: ( (lv_row_1_0= RULE_INT ) )
            // InternalGameDSL.g:145:4: (lv_row_1_0= RULE_INT )
            {
            // InternalGameDSL.g:145:4: (lv_row_1_0= RULE_INT )
            // InternalGameDSL.g:146:5: lv_row_1_0= RULE_INT
            {
            lv_row_1_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_row_1_0, grammarAccess.getCellAccess().getRowINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"row",
            						lv_row_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCellAccess().getColKeyword_2());
            		
            // InternalGameDSL.g:166:3: ( (lv_col_3_0= RULE_INT ) )
            // InternalGameDSL.g:167:4: (lv_col_3_0= RULE_INT )
            {
            // InternalGameDSL.g:167:4: (lv_col_3_0= RULE_INT )
            // InternalGameDSL.g:168:5: lv_col_3_0= RULE_INT
            {
            lv_col_3_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_col_3_0, grammarAccess.getCellAccess().getColINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"col",
            						lv_col_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getCellAccess().getNeighboursKeyword_4());
            		
            // InternalGameDSL.g:188:3: ( (lv_neighbours_5_0= RULE_INT ) )
            // InternalGameDSL.g:189:4: (lv_neighbours_5_0= RULE_INT )
            {
            // InternalGameDSL.g:189:4: (lv_neighbours_5_0= RULE_INT )
            // InternalGameDSL.g:190:5: lv_neighbours_5_0= RULE_INT
            {
            lv_neighbours_5_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_neighbours_5_0, grammarAccess.getCellAccess().getNeighboursINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"neighbours",
            						lv_neighbours_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGameDSL.g:206:3: ( (lv_state_6_0= ruleState ) )
            // InternalGameDSL.g:207:4: (lv_state_6_0= ruleState )
            {
            // InternalGameDSL.g:207:4: (lv_state_6_0= ruleState )
            // InternalGameDSL.g:208:5: lv_state_6_0= ruleState
            {

            					newCompositeNode(grammarAccess.getCellAccess().getStateStateEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_state_6_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCellRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_6_0,
            						"gameoflife.grid.GameDSL.State");
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
    // $ANTLR end "ruleCell"


    // $ANTLR start "ruleState"
    // InternalGameDSL.g:229:1: ruleState returns [Enumerator current=null] : ( (enumLiteral_0= 'dead' ) | (enumLiteral_1= 'alive' ) ) ;
    public final Enumerator ruleState() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGameDSL.g:235:2: ( ( (enumLiteral_0= 'dead' ) | (enumLiteral_1= 'alive' ) ) )
            // InternalGameDSL.g:236:2: ( (enumLiteral_0= 'dead' ) | (enumLiteral_1= 'alive' ) )
            {
            // InternalGameDSL.g:236:2: ( (enumLiteral_0= 'dead' ) | (enumLiteral_1= 'alive' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGameDSL.g:237:3: (enumLiteral_0= 'dead' )
                    {
                    // InternalGameDSL.g:237:3: (enumLiteral_0= 'dead' )
                    // InternalGameDSL.g:238:4: enumLiteral_0= 'dead'
                    {
                    enumLiteral_0=(Token)match(input,15,FOLLOW_2); 

                    				current = grammarAccess.getStateAccess().getDeadEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStateAccess().getDeadEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGameDSL.g:245:3: (enumLiteral_1= 'alive' )
                    {
                    // InternalGameDSL.g:245:3: (enumLiteral_1= 'alive' )
                    // InternalGameDSL.g:246:4: enumLiteral_1= 'alive'
                    {
                    enumLiteral_1=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getStateAccess().getAliveEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStateAccess().getAliveEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleState"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});

}