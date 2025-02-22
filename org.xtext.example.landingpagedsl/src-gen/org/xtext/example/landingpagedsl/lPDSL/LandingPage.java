/**
 * generated by Xtext 2.23.0.M3
 */
package org.xtext.example.landingpagedsl.lPDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landing Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.landingpagedsl.lPDSL.LandingPage#getPagecomponent <em>Pagecomponent</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.landingpagedsl.lPDSL.LPDSLPackage#getLandingPage()
 * @model
 * @generated
 */
public interface LandingPage extends EObject
{
  /**
   * Returns the value of the '<em><b>Pagecomponent</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.landingpagedsl.lPDSL.PageComponent}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pagecomponent</em>' containment reference list.
   * @see org.xtext.example.landingpagedsl.lPDSL.LPDSLPackage#getLandingPage_Pagecomponent()
   * @model containment="true"
   * @generated
   */
  EList<PageComponent> getPagecomponent();

} // LandingPage
