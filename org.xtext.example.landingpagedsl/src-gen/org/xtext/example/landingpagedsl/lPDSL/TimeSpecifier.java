/**
 * generated by Xtext 2.23.0.M3
 */
package org.xtext.example.landingpagedsl.lPDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.landingpagedsl.lPDSL.TimeSpecifier#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.landingpagedsl.lPDSL.TimeSpecifier#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.landingpagedsl.lPDSL.LPDSLPackage#getTimeSpecifier()
 * @model
 * @generated
 */
public interface TimeSpecifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.landingpagedsl.lPDSL.LPDSLPackage#getTimeSpecifier_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.landingpagedsl.lPDSL.TimeSpecifier#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.landingpagedsl.lPDSL.Integer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' containment reference list.
   * @see org.xtext.example.landingpagedsl.lPDSL.LPDSLPackage#getTimeSpecifier_Time()
   * @model containment="true"
   * @generated
   */
  EList<org.xtext.example.landingpagedsl.lPDSL.Integer> getTime();

} // TimeSpecifier
