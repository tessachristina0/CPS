/**
 * generated by Xtext 2.28.0
 */
package gameoflife.grid.gameDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gameoflife.grid.gameDSL.Grid#getName <em>Name</em>}</li>
 *   <li>{@link gameoflife.grid.gameDSL.Grid#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @see gameoflife.grid.gameDSL.GameDSLPackage#getGrid()
 * @model
 * @generated
 */
public interface Grid extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see gameoflife.grid.gameDSL.GameDSLPackage#getGrid_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link gameoflife.grid.gameDSL.Grid#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
   * The list contents are of type {@link gameoflife.grid.gameDSL.Cell}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cells</em>' containment reference list.
   * @see gameoflife.grid.gameDSL.GameDSLPackage#getGrid_Cells()
   * @model containment="true"
   * @generated
   */
  EList<Cell> getCells();

} // Grid
