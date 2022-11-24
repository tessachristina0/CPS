package grid.gameoflife.generator

import grid.gameoflife.gameOfLifeDSL.Grid
import grid.gameoflife.gameOfLifeDSL.State

class CodeGenerator {
	def static toCode(Grid root)'''
	package GameOfLife;
	import java.awt.Point;
	import java.util.ArrayList;
	import GameOfLife.GameOfLife.GameBoard;


	public class RulesOfLife {
		
		public static int gridWidth = «root.width»;
		public static int gridLength = «root.length»;
		
		// Initialize the gameBoard
		public static void initGameBoard (boolean[][] gameBoard) {
			«FOR c : root.cells»
				«IF c.state === State::ALIVE»
				gameBoard.addPoint(«c.row», «c.col»);
			«ENDIF»
		«ENDFOR»
			}
			
		// Initialze all neighbors
		public static class
		
	
		public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {
        	// Iterate through the array, follow game of life rules
       	 for (int i=1; i<gameBoard.length-1; i++) {
            for (int j=1; j<gameBoard[0].length-1; j++) {
                int surrounding = 0;
                if (gameBoard[i-1][j-1]) { surrounding++; }
                if (gameBoard[i-1][j])   { surrounding++; }
                if (gameBoard[i-1][j+1]) { surrounding++; }
                if (gameBoard[i][j-1])   { surrounding++; }
                if (gameBoard[i][j+1])   { surrounding++; }
                if (gameBoard[i+1][j-1]) { surrounding++; }
                if (gameBoard[i+1][j])   { surrounding++; }
                if (gameBoard[i+1][j+1]) { surrounding++; }
                /* only code for surving cells, so no rule if result is dead cell */
                 /* rule B3 */
                if ((!gameBoard[i][j]) && (surrounding == 3)){
                	survivingCells.add(new Point(i-1,j-1));
                	} 
                  /* rule B6 */
                if ((!gameBoard[i][j]) && (surrounding == 6)){
                	survivingCells.add(new Point(i-1,j-1));
                	} 
                  /* rule S2 */
                if ((gameBoard[i][j]) && (surrounding == 2)){
                	survivingCells.add(new Point(i-1,j-1));
                	} 
            }
        }
	}
}

 '''
 
}