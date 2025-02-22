/**
 * generated by Xtext 2.23.0.M3
 */
package org.xtext.example.landingpagedsl.lPDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.landingpagedsl.lPDSL.URL#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.landingpagedsl.lPDSL.URL#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.landingpagedsl.lPDSL.LPDSLPackage#getURL()
 * @model
 * @generated
 */
public interface URL extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.landingpagedsl.lPDSL.LPDSLPackage#getURL_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.landingpagedsl.lPDSL.URL#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.landingpagedsl.lPDSL.Path}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference list.
   * @see org.xtext.example.landingpagedsl.lPDSL.LPDSLPackage#getURL_Path()
   * @model containment="true"
   * @generated
   */
  EList<Path> getPath();

} // URL
