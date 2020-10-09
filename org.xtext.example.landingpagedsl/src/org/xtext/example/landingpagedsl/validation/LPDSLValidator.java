/*
 * generated by Xtext 2.23.0.M3
 */
package org.xtext.example.landingpagedsl.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.example.landingpagedsl.lPDSL.LPDSLPackage;
import org.xtext.example.landingpagedsl.lPDSL.LandingPage;
import org.xtext.example.landingpagedsl.lPDSL.PageComponent;
import org.xtext.example.landingpagedsl.lPDSL.TabItems;
import com.google.common.base.Objects;
/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class LPDSLValidator extends AbstractLPDSLValidator {
	
//TODO: one body body, one body header, one body footer
//TODO: all tab names corresponds to a section name
	
	
	public static final String INVALID_NAME = "invalidName";
	
	@Check
	public void tabCapitalLetter(TabItems tab) {
		if (!Character.isUpperCase(tab.getName().charAt(0))) {
			warning("Name should start with a capital",
					LPDSLPackage.Literals.TAB_ITEMS__NAME,
					INVALID_NAME);
		}
	}
	
	@Check
	public void checkOnePageBody(LandingPage page) {
		int check = 0;
		for(PageComponent component : page.getPagecomponent()) {
			System.out.println(component.getClass().getSimpleName().toString());
			System.out.println(component.getClass().getSimpleName().toString() == "PageBodyImpl");
			if (component.getClass().getSimpleName().toString() == "PageBodyImpl") {
				check += 1;
			}
			System.out.println(check);
		}
		System.out.println(check);
		if(check > 1) {
			error("There can only be one body section in your landing page", LPDSLPackage.Literals.PAGE_COMPONENT__NAME);
		}
	}
}
