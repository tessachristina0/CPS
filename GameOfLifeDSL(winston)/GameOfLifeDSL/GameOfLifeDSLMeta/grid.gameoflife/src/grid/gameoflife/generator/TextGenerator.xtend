package grid.gameoflife.generator

import grid.gameoflife.gameOfLifeDSL.Grid

class TextGenerator {
	def static toText(Grid root)'''
 Info of the Grid «root.name»
 All Cells:«"\n"»
 «FOR c : root.cells  BEFORE "====== \n" SEPARATOR " &" AFTER "====="»
 	row: «c.row» col: «c.col» state: «c.state»
 «ENDFOR»
 «"\n"»
 
 '''
 
 }

