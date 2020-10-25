/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.landingpagedsl.lPDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.landingpagedsl.lPDSL.Items;
import org.xtext.example.landingpagedsl.lPDSL.LPDSLPackage;
import org.xtext.example.landingpagedsl.lPDSL.PageHeader;
import org.xtext.example.landingpagedsl.lPDSL.TabItems;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.landingpagedsl.lPDSL.impl.PageHeaderImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.xtext.example.landingpagedsl.lPDSL.impl.PageHeaderImpl#getTabs <em>Tabs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageHeaderImpl extends PageComponentImpl implements PageHeader
{
  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected EList<Items> title;

  /**
   * The cached value of the '{@link #getTabs() <em>Tabs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTabs()
   * @generated
   * @ordered
   */
  protected EList<TabItems> tabs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PageHeaderImpl()
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
    return LPDSLPackage.Literals.PAGE_HEADER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Items> getTitle()
  {
    if (title == null)
    {
      title = new EObjectContainmentEList<Items>(Items.class, this, LPDSLPackage.PAGE_HEADER__TITLE);
    }
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<TabItems> getTabs()
  {
    if (tabs == null)
    {
      tabs = new EObjectContainmentEList<TabItems>(TabItems.class, this, LPDSLPackage.PAGE_HEADER__TABS);
    }
    return tabs;
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
      case LPDSLPackage.PAGE_HEADER__TITLE:
        return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
      case LPDSLPackage.PAGE_HEADER__TABS:
        return ((InternalEList<?>)getTabs()).basicRemove(otherEnd, msgs);
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
      case LPDSLPackage.PAGE_HEADER__TITLE:
        return getTitle();
      case LPDSLPackage.PAGE_HEADER__TABS:
        return getTabs();
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
      case LPDSLPackage.PAGE_HEADER__TITLE:
        getTitle().clear();
        getTitle().addAll((Collection<? extends Items>)newValue);
        return;
      case LPDSLPackage.PAGE_HEADER__TABS:
        getTabs().clear();
        getTabs().addAll((Collection<? extends TabItems>)newValue);
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
      case LPDSLPackage.PAGE_HEADER__TITLE:
        getTitle().clear();
        return;
      case LPDSLPackage.PAGE_HEADER__TABS:
        getTabs().clear();
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
      case LPDSLPackage.PAGE_HEADER__TITLE:
        return title != null && !title.isEmpty();
      case LPDSLPackage.PAGE_HEADER__TABS:
        return tabs != null && !tabs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PageHeaderImpl
