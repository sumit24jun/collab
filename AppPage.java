package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class AppPage extends PageObject {
	
	@StepNeha
	public void navigateToHome(){
		openAt("https://www.sungardas.com/en-in/services/");
	}
	
	public void addnewMethodbyNeha() {
		sysout("I am working on this line in master")
	}

}
