/**
 * generated by Xtext 2.28.0
 */
package gameoflife.grid.gameDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gameoflife.grid.gameDSL.GameDSLFactory
 * @model kind="package"
 * @generated
 */
public interface GameDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "gameDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.grid.gameoflife/GameDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "gameDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GameDSLPackage eINSTANCE = gameoflife.grid.gameDSL.impl.GameDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link gameoflife.grid.gameDSL.impl.GridImpl <em>Grid</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gameoflife.grid.gameDSL.impl.GridImpl
   * @see gameoflife.grid.gameDSL.impl.GameDSLPackageImpl#getGrid()
   * @generated
   */
  int GRID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID__NAME = 0;

  /**
   * The feature id for the '<em><b>Cells</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID__CELLS = 1;

  /**
   * The number of structural features of the '<em>Grid</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link gameoflife.grid.gameDSL.impl.CellImpl <em>Cell</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gameoflife.grid.gameDSL.impl.CellImpl
   * @see gameoflife.grid.gameDSL.impl.GameDSLPackageImpl#getCell()
   * @generated
   */
  int CELL = 1;

  /**
   * The feature id for the '<em><b>Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL__ROW = 0;

  /**
   * The feature id for the '<em><b>Col</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL__COL = 1;

  /**
   * The feature id for the '<em><b>Neighbours</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL__NEIGHBOURS = 2;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL__STATE = 3;

  /**
   * The number of structural features of the '<em>Cell</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link gameoflife.grid.gameDSL.State <em>State</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gameoflife.grid.gameDSL.State
   * @see gameoflife.grid.gameDSL.impl.GameDSLPackageImpl#getState()
   * @generated
   */
  int STATE = 2;


  /**
   * Returns the meta object for class '{@link gameoflife.grid.gameDSL.Grid <em>Grid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grid</em>'.
   * @see gameoflife.grid.gameDSL.Grid
   * @generated
   */
  EClass getGrid();

  /**
   * Returns the meta object for the attribute '{@link gameoflife.grid.gameDSL.Grid#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see gameoflife.grid.gameDSL.Grid#getName()
   * @see #getGrid()
   * @generated
   */
  EAttribute getGrid_Name();

  /**
   * Returns the meta object for the containment reference list '{@link gameoflife.grid.gameDSL.Grid#getCells <em>Cells</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cells</em>'.
   * @see gameoflife.grid.gameDSL.Grid#getCells()
   * @see #getGrid()
   * @generated
   */
  EReference getGrid_Cells();

  /**
   * Returns the meta object for class '{@link gameoflife.grid.gameDSL.Cell <em>Cell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cell</em>'.
   * @see gameoflife.grid.gameDSL.Cell
   * @generated
   */
  EClass getCell();

  /**
   * Returns the meta object for the attribute '{@link gameoflife.grid.gameDSL.Cell#getRow <em>Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Row</em>'.
   * @see gameoflife.grid.gameDSL.Cell#getRow()
   * @see #getCell()
   * @generated
   */
  EAttribute getCell_Row();

  /**
   * Returns the meta object for the attribute '{@link gameoflife.grid.gameDSL.Cell#getCol <em>Col</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Col</em>'.
   * @see gameoflife.grid.gameDSL.Cell#getCol()
   * @see #getCell()
   * @generated
   */
  EAttribute getCell_Col();

  /**
   * Returns the meta object for the attribute '{@link gameoflife.grid.gameDSL.Cell#getNeighbours <em>Neighbours</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Neighbours</em>'.
   * @see gameoflife.grid.gameDSL.Cell#getNeighbours()
   * @see #getCell()
   * @generated
   */
  EAttribute getCell_Neighbours();

  /**
   * Returns the meta object for the attribute '{@link gameoflife.grid.gameDSL.Cell#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State</em>'.
   * @see gameoflife.grid.gameDSL.Cell#getState()
   * @see #getCell()
   * @generated
   */
  EAttribute getCell_State();

  /**
   * Returns the meta object for enum '{@link gameoflife.grid.gameDSL.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>State</em>'.
   * @see gameoflife.grid.gameDSL.State
   * @generated
   */
  EEnum getState();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GameDSLFactory getGameDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link gameoflife.grid.gameDSL.impl.GridImpl <em>Grid</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gameoflife.grid.gameDSL.impl.GridImpl
     * @see gameoflife.grid.gameDSL.impl.GameDSLPackageImpl#getGrid()
     * @generated
     */
    EClass GRID = eINSTANCE.getGrid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRID__NAME = eINSTANCE.getGrid_Name();

    /**
     * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRID__CELLS = eINSTANCE.getGrid_Cells();

    /**
     * The meta object literal for the '{@link gameoflife.grid.gameDSL.impl.CellImpl <em>Cell</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gameoflife.grid.gameDSL.impl.CellImpl
     * @see gameoflife.grid.gameDSL.impl.GameDSLPackageImpl#getCell()
     * @generated
     */
    EClass CELL = eINSTANCE.getCell();

    /**
     * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL__ROW = eINSTANCE.getCell_Row();

    /**
     * The meta object literal for the '<em><b>Col</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL__COL = eINSTANCE.getCell_Col();

    /**
     * The meta object literal for the '<em><b>Neighbours</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL__NEIGHBOURS = eINSTANCE.getCell_Neighbours();

    /**
     * The meta object literal for the '<em><b>State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL__STATE = eINSTANCE.getCell_State();

    /**
     * The meta object literal for the '{@link gameoflife.grid.gameDSL.State <em>State</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gameoflife.grid.gameDSL.State
     * @see gameoflife.grid.gameDSL.impl.GameDSLPackageImpl#getState()
     * @generated
     */
    EEnum STATE = eINSTANCE.getState();

  }

} //GameDSLPackage
