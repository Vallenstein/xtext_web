/**
 * generated by Xtext 2.23.0.M3
 */
package org.xtext.example.landingpagedsl.lPDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.landingpagedsl.lPDSL.Items;
import org.xtext.example.landingpagedsl.lPDSL.LPDSLPackage;
import org.xtext.example.landingpagedsl.lPDSL.LinkItem;
import org.xtext.example.landingpagedsl.lPDSL.URL;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.landingpagedsl.lPDSL.impl.LinkItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.landingpagedsl.lPDSL.impl.LinkItemImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.xtext.example.landingpagedsl.lPDSL.impl.LinkItemImpl#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkItemImpl extends MinimalEObjectImpl.Container implements LinkItem
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected EList<Items> text;

  /**
   * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLink()
   * @generated
   * @ordered
   */
  protected EList<URL> link;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinkItemImpl()
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
    return LPDSLPackage.Literals.LINK_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LPDSLPackage.LINK_ITEM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Items> getText()
  {
    if (text == null)
    {
      text = new EObjectContainmentEList<Items>(Items.class, this, LPDSLPackage.LINK_ITEM__TEXT);
    }
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<URL> getLink()
  {
    if (link == null)
    {
      link = new EObjectContainmentEList<URL>(URL.class, this, LPDSLPackage.LINK_ITEM__LINK);
    }
    return link;
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
      case LPDSLPackage.LINK_ITEM__TEXT:
        return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
      case LPDSLPackage.LINK_ITEM__LINK:
        return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
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
      case LPDSLPackage.LINK_ITEM__NAME:
        return getName();
      case LPDSLPackage.LINK_ITEM__TEXT:
        return getText();
      case LPDSLPackage.LINK_ITEM__LINK:
        return getLink();
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
      case LPDSLPackage.LINK_ITEM__NAME:
        setName((String)newValue);
        return;
      case LPDSLPackage.LINK_ITEM__TEXT:
        getText().clear();
        getText().addAll((Collection<? extends Items>)newValue);
        return;
      case LPDSLPackage.LINK_ITEM__LINK:
        getLink().clear();
        getLink().addAll((Collection<? extends URL>)newValue);
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
      case LPDSLPackage.LINK_ITEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LPDSLPackage.LINK_ITEM__TEXT:
        getText().clear();
        return;
      case LPDSLPackage.LINK_ITEM__LINK:
        getLink().clear();
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
      case LPDSLPackage.LINK_ITEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LPDSLPackage.LINK_ITEM__TEXT:
        return text != null && !text.isEmpty();
      case LPDSLPackage.LINK_ITEM__LINK:
        return link != null && !link.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //LinkItemImpl
