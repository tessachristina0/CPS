package grid.gameoflife.generator

import grid.gameoflife.gameOfLifeDSL.Cell
import grid.gameoflife.gameOfLifeDSL.Grid
import java.util.List
import java.util.ArrayList

class Auxiliary {
	def static List<Cell> getActions(Grid root) {
 		var List<Cell> celllist = new ArrayList<Cell>()
 		for (Cell c : root.cells){
 			celllist.add(c)
 		}
 return celllist;
 } 
}