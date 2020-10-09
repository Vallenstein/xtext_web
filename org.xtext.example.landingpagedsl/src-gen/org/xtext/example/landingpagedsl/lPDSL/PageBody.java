/**
 * generated by Xtext 2.23.0.M3
 */
package org.xtext.example.landingpagedsl.lPDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.landingpagedsl.lPDSL.PageBody#getSections <em>Sections</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.landingpagedsl.lPDSL.LPDSLPackage#getPageBody()
 * @model
 * @generated
 */
public interface PageBody extends PageComponent
{
  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.landingpagedsl.lPDSL.Sections}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see org.xtext.example.landingpagedsl.lPDSL.LPDSLPackage#getPageBody_Sections()
   * @model containment="true"
   * @generated
   */
  EList<Sections> getSections();

} // PageBody
