package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webpages.ElementUtil;
import framework.webpages.HomePage;
import org.testng.Assert;

public class HomePageSD extends ElementUtil {

    HomePage hotelsHomePage = new HomePage();

    @Given("^I am on Hotels Home Page$")
    public void verified(){
       Assert.assertEquals(SharedSD.getDriver().getCurrentUrl(), "https://www.hotels.com/");
    }

    @When("^I am on default locations search result screen$")
    public void hotelsMainPage() throws InterruptedException {
        hotelsHomePage.handleAlert();
        hotelsHomePage.selectADestination();
        // Assert.assertEquals(SharedSD.getDriver().getCurrentUrl(), "https://www.hotels.com/");
        hotelsHomePage.clickOnSearch();
    }
    @And("^I select (5 stars|4 stars|3 stars) on the hotels page$")
    public void chooseStars(String stars) throws InterruptedException {
        switch (stars){
            case "5 stars":
                hotelsHomePage.clickOnFiveStars();
                break;
            case "4 stars":
                hotelsHomePage.clickOnFourStars();
                break;
            case "3 stars":
                hotelsHomePage.clickOnThreeStars();
        }
    }
    @Then("^I verify system displays only (5 stars|4 stars|3 stars) hotels on search result$")
    public void verifyStarsIsSelected(String stars) throws InterruptedException {
        switch (stars){
            case "5 stars":
                hotelsHomePage.isFiveStarSelected();
                break;
            case "4 stars":
                hotelsHomePage.isFourStarSelected();
                break;
            case "3 stars":
                hotelsHomePage.isThreeStarSelected();
        }
    }

    }


