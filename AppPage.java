package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class AppPage extends PageObject {
	
	@StepNehaaddremotely
	public void navigateToHome(){
		openAt("https://www.sungardas.com/en-in/services/");
	}
	
	public void addnewMethodbyNeha() {
		sysout("neha is workign on this line")
		sysout("this line is added on masteR")
	}

}
