/**
 * generated by Xtext 2.23.0.M3
 */
package org.xtext.example.landingpagedsl.lPDSL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.landingpagedsl.lPDSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.landingpagedsl.lPDSL.LPDSLPackage
 * @generated
 */
public class LPDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LPDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LPDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LPDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LPDSLSwitch<Adapter> modelSwitch =
    new LPDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseLandingPage(LandingPage object)
      {
        return createLandingPageAdapter();
      }
      @Override
      public Adapter casePageComponent(PageComponent object)
      {
        return createPageComponentAdapter();
      }
      @Override
      public Adapter casePageFooter(PageFooter object)
      {
        return createPageFooterAdapter();
      }
      @Override
      public Adapter caseLinkItem(LinkItem object)
      {
        return createLinkItemAdapter();
      }
      @Override
      public Adapter caseURL(URL object)
      {
        return createURLAdapter();
      }
      @Override
      public Adapter casePageHeader(PageHeader object)
      {
        return createPageHeaderAdapter();
      }
      @Override
      public Adapter caseTabItems(TabItems object)
      {
        return createTabItemsAdapter();
      }
      @Override
      public Adapter casePageBody(PageBody object)
      {
        return createPageBodyAdapter();
      }
      @Override
      public Adapter caseSections(Sections object)
      {
        return createSectionsAdapter();
      }
      @Override
      public Adapter caseResume(Resume object)
      {
        return createResumeAdapter();
      }
      @Override
      public Adapter caseItems(Items object)
      {
        return createItemsAdapter();
      }
      @Override
      public Adapter caseDescription(Description object)
      {
        return createDescriptionAdapter();
      }
      @Override
      public Adapter caseAboutMe(AboutMe object)
      {
        return createAboutMeAdapter();
      }
      @Override
      public Adapter casePicture(Picture object)
      {
        return createPictureAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.landingpagedsl.lPDSL.LandingPage <em>Landing Page</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.landingpagedsl.lPDSL.LandingPage
   * @generated
   */
  public Adapter createLandingPageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.landingpagedsl.lPDSL.PageComponent <em>Page Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.landingpagedsl.lPDSL.PageComponent
   * @generated
   */
  public Adapter createPageComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.landingpagedsl.lPDSL.PageFooter <em>Page Footer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.landingpagedsl.lPDSL.PageFooter
   * @generated
   */
  public Adapter createPageFooterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.landingpagedsl.lPDSL.LinkItem <em>Link Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.landingpagedsl.lPDSL.LinkItem
   * @generated
   */
  public Adapter createLinkItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.landingpagedsl.lPDSL.URL <em>URL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.landingpagedsl.lPDSL.URL
   * @generated
   */
  public Adapter createURLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.landingpagedsl.lPDSL.PageHeader <em>Page Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.landingpagedsl.lPDSL.PageHeader
   * @generated
   */
  public Adapter createPageHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.landingpagedsl.lPDSL.TabItems <em>Tab Items</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.landingpagedsl.lPDSL.TabItems
   * @generated
   */
  public Adapter createTabItemsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.landingpagedsl.lPDSL.PageBody <em>Page Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.landingpagedsl.lPDSL.PageBody
   * @generated
   */
  public Adapter createPageBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.landingpagedsl.lPDSL.Sections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.landingpagedsl.lPDSL.Sections
   * @generated
   */
  public Adapter createSectionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.landingpagedsl.lPDSL.Resume <em>Resume</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.landingpagedsl.lPDSL.Resume
   * @generated
   */
  public Adapter createResumeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.landingpagedsl.lPDSL.Items <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.landingpagedsl.lPDSL.Items
   * @generated
   */
  public Adapter createItemsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.landingpagedsl.lPDSL.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.landingpagedsl.lPDSL.Description
   * @generated
   */
  public Adapter createDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.landingpagedsl.lPDSL.AboutMe <em>About Me</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.landingpagedsl.lPDSL.AboutMe
   * @generated
   */
  public Adapter createAboutMeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.landingpagedsl.lPDSL.Picture <em>Picture</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.landingpagedsl.lPDSL.Picture
   * @generated
   */
  public Adapter createPictureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LPDSLAdapterFactory
