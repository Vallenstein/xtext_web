/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.landingpagedsl.lPDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.landingpagedsl.lPDSL.LinkItem#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.landingpagedsl.lPDSL.LinkItem#getText <em>Text</em>}</li>
 *   <li>{@link org.xtext.example.landingpagedsl.lPDSL.LinkItem#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.landingpagedsl.lPDSL.LPDSLPackage#getLinkItem()
 * @model
 * @generated
 */
public interface LinkItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.landingpagedsl.lPDSL.LPDSLPackage#getLinkItem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.landingpagedsl.lPDSL.LinkItem#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.landingpagedsl.lPDSL.Items}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' containment reference list.
   * @see org.xtext.example.landingpagedsl.lPDSL.LPDSLPackage#getLinkItem_Text()
   * @model containment="true"
   * @generated
   */
  EList<Items> getText();

  /**
   * Returns the value of the '<em><b>Link</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.landingpagedsl.lPDSL.URL}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link</em>' containment reference list.
   * @see org.xtext.example.landingpagedsl.lPDSL.LPDSLPackage#getLinkItem_Link()
   * @model containment="true"
   * @generated
   */
  EList<URL> getLink();

} // LinkItem
