/**
 * generated by Xtext 2.23.0.M3
 */
package org.xtext.example.landingpagedsl.lPDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.landingpagedsl.lPDSL.LPDSLPackage;
import org.xtext.example.landingpagedsl.lPDSL.Resume;
import org.xtext.example.landingpagedsl.lPDSL.ResumeSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.landingpagedsl.lPDSL.impl.ResumeImpl#getResumesections <em>Resumesections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResumeImpl extends SectionsImpl implements Resume
{
  /**
   * The cached value of the '{@link #getResumesections() <em>Resumesections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResumesections()
   * @generated
   * @ordered
   */
  protected EList<ResumeSection> resumesections;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResumeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LPDSLPackage.Literals.RESUME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ResumeSection> getResumesections()
  {
    if (resumesections == null)
    {
      resumesections = new EObjectContainmentEList<ResumeSection>(ResumeSection.class, this, LPDSLPackage.RESUME__RESUMESECTIONS);
    }
    return resumesections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LPDSLPackage.RESUME__RESUMESECTIONS:
        return ((InternalEList<?>)getResumesections()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LPDSLPackage.RESUME__RESUMESECTIONS:
        return getResumesections();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LPDSLPackage.RESUME__RESUMESECTIONS:
        getResumesections().clear();
        getResumesections().addAll((Collection<? extends ResumeSection>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LPDSLPackage.RESUME__RESUMESECTIONS:
        getResumesections().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LPDSLPackage.RESUME__RESUMESECTIONS:
        return resumesections != null && !resumesections.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ResumeImpl
