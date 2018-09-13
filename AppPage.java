package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class AppPage extends PageObject {
	
	@StepSumit
	public void navigateToHome(){
		openAt("https://www.sungardas.com/en-in/services/");
	}

}
