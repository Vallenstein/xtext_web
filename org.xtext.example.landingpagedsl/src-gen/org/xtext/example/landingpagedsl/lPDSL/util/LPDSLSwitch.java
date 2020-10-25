/**
 * generated by Xtext 2.23.0.M3
 */
package org.xtext.example.landingpagedsl.lPDSL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.landingpagedsl.lPDSL.AboutMe;
import org.xtext.example.landingpagedsl.lPDSL.ContactInformation;
import org.xtext.example.landingpagedsl.lPDSL.Description;
import org.xtext.example.landingpagedsl.lPDSL.ImagePath;
import org.xtext.example.landingpagedsl.lPDSL.Items;
import org.xtext.example.landingpagedsl.lPDSL.LPDSLPackage;
import org.xtext.example.landingpagedsl.lPDSL.LandingPage;
import org.xtext.example.landingpagedsl.lPDSL.LinkItem;
import org.xtext.example.landingpagedsl.lPDSL.Links;
import org.xtext.example.landingpagedsl.lPDSL.PageBody;
import org.xtext.example.landingpagedsl.lPDSL.PageComponent;
import org.xtext.example.landingpagedsl.lPDSL.PageFooter;
import org.xtext.example.landingpagedsl.lPDSL.PageHeader;
import org.xtext.example.landingpagedsl.lPDSL.Picture;
import org.xtext.example.landingpagedsl.lPDSL.PictureCarousel;
import org.xtext.example.landingpagedsl.lPDSL.QualifiedPath;
import org.xtext.example.landingpagedsl.lPDSL.Resume;
import org.xtext.example.landingpagedsl.lPDSL.Sections;
import org.xtext.example.landingpagedsl.lPDSL.TabItems;
import org.xtext.example.landingpagedsl.lPDSL.TimeSpecifier;
import org.xtext.example.landingpagedsl.lPDSL.URL;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.landingpagedsl.lPDSL.LPDSLPackage
 * @generated
 */
public class LPDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LPDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LPDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LPDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LPDSLPackage.LANDING_PAGE:
      {
        LandingPage landingPage = (LandingPage)theEObject;
        T result = caseLandingPage(landingPage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPDSLPackage.PAGE_COMPONENT:
      {
        PageComponent pageComponent = (PageComponent)theEObject;
        T result = casePageComponent(pageComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPDSLPackage.PICTURE_CAROUSEL:
      {
        PictureCarousel pictureCarousel = (PictureCarousel)theEObject;
        T result = casePictureCarousel(pictureCarousel);
        if (result == null) result = caseSections(pictureCarousel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPDSLPackage.PAGE_FOOTER:
      {
        PageFooter pageFooter = (PageFooter)theEObject;
        T result = casePageFooter(pageFooter);
        if (result == null) result = casePageComponent(pageFooter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPDSLPackage.LINK_ITEM:
      {
        LinkItem linkItem = (LinkItem)theEObject;
        T result = caseLinkItem(linkItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPDSLPackage.URL:
      {
        URL url = (URL)theEObject;
        T result = caseURL(url);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPDSLPackage.QUALIFIED_PATH:
      {
        QualifiedPath qualifiedPath = (QualifiedPath)theEObject;
        T result = caseQualifiedPath(qualifiedPath);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPDSLPackage.PAGE_HEADER:
      {
        PageHeader pageHeader = (PageHeader)theEObject;
        T result = casePageHeader(pageHeader);
        if (result == null) result = casePageComponent(pageHeader);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPDSLPackage.TAB_ITEMS:
      {
        TabItems tabItems = (TabItems)theEObject;
        T result = caseTabItems(tabItems);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPDSLPackage.PAGE_BODY:
      {
        PageBody pageBody = (PageBody)theEObject;
        T result = casePageBody(pageBody);
        if (result == null) result = casePageComponent(pageBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPDSLPackage.SECTIONS:
      {
        Sections sections = (Sections)theEObject;
        T result = caseSections(sections);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPDSLPackage.LINKS:
      {
        Links links = (Links)theEObject;
        T result = caseLinks(links);
        if (result == null) result = caseSections(links);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPDSLPackage.CONTACT_INFORMATION:
      {
        ContactInformation contactInformation = (ContactInformation)theEObject;
        T result = caseContactInformation(contactInformation);
        if (result == null) result = caseSections(contactInformation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPDSLPackage.RESUME:
      {
        Resume resume = (Resume)theEObject;
        T result = caseResume(resume);
        if (result == null) result = caseSections(resume);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPDSLPackage.ITEMS:
      {
        Items items = (Items)theEObject;
        T result = caseItems(items);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPDSLPackage.DESCRIPTION:
      {
        Description description = (Description)theEObject;
        T result = caseDescription(description);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPDSLPackage.TIME_SPECIFIER:
      {
        TimeSpecifier timeSpecifier = (TimeSpecifier)theEObject;
        T result = caseTimeSpecifier(timeSpecifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPDSLPackage.INTEGER:
      {
        org.xtext.example.landingpagedsl.lPDSL.Integer integer = (org.xtext.example.landingpagedsl.lPDSL.Integer)theEObject;
        T result = caseInteger(integer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPDSLPackage.ABOUT_ME:
      {
        AboutMe aboutMe = (AboutMe)theEObject;
        T result = caseAboutMe(aboutMe);
        if (result == null) result = caseSections(aboutMe);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPDSLPackage.PICTURE:
      {
        Picture picture = (Picture)theEObject;
        T result = casePicture(picture);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPDSLPackage.IMAGE_PATH:
      {
        ImagePath imagePath = (ImagePath)theEObject;
        T result = caseImagePath(imagePath);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Landing Page</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Landing Page</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLandingPage(LandingPage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePageComponent(PageComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Picture Carousel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Picture Carousel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePictureCarousel(PictureCarousel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page Footer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page Footer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePageFooter(PageFooter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkItem(LinkItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>URL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>URL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseURL(URL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualified Path</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualified Path</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualifiedPath(QualifiedPath object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page Header</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page Header</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePageHeader(PageHeader object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tab Items</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tab Items</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTabItems(TabItems object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePageBody(PageBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sections</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sections</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSections(Sections object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Links</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Links</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinks(Links object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contact Information</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contact Information</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContactInformation(ContactInformation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resume</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resume</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResume(Resume object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Items</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Items</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItems(Items object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescription(Description object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeSpecifier(TimeSpecifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteger(org.xtext.example.landingpagedsl.lPDSL.Integer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>About Me</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>About Me</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAboutMe(AboutMe object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Picture</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Picture</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePicture(Picture object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image Path</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image Path</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImagePath(ImagePath object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LPDSLSwitch
