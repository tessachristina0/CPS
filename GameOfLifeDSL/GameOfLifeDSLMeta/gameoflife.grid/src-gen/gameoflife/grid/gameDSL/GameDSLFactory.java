/**
 * generated by Xtext 2.28.0
 */
package gameoflife.grid.gameDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gameoflife.grid.gameDSL.GameDSLPackage
 * @generated
 */
public interface GameDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GameDSLFactory eINSTANCE = gameoflife.grid.gameDSL.impl.GameDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Grid</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Grid</em>'.
   * @generated
   */
  Grid createGrid();

  /**
   * Returns a new object of class '<em>Cell</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cell</em>'.
   * @generated
   */
  Cell createCell();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GameDSLPackage getGameDSLPackage();

} //GameDSLFactory
