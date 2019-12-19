package framework.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinition.SharedSD;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends ElementUtil {

    By search = By.xpath("//button[@class='cta cta-strong']");
    By destinationField=By.xpath("//input[@id='qf-0q-destination']");
    By destination = By.cssSelector("[value='New York, New York, United States of America']");
    By threeStar = By.id("f-star-rating-3");
    By fourStar = By.id("f-star-rating-4");
    By fiveStar = By.id("f-star-rating-5");
    By alertclick = By.xpath("//a[@class='footer-continue-link di-ib fw-bold']");
    By starRating = By.xpath("//h3[contains(text(),'Star rating')]");


    public void handleAlert() throws InterruptedException {
        Thread.sleep(3000);
        clickOn(alertclick);
    }
    public void selectADestination() throws InterruptedException {
        Thread.sleep(3000);
        clickOn(destinationField);
        Thread.sleep(3000);
        setValue(destinationField,"New York, New York, United States of America");
        pressEnter();
    }
    public void clickOnSearch() throws InterruptedException {
        Thread.sleep(3000);
        clickOn(search);
    }



    public void clickOnFiveStars() throws InterruptedException {
        scrollByPixel("0","400");
        Thread.sleep(2000);
        clickOn(fiveStar);
    }
    public void clickOnFourStars() throws InterruptedException {
        scrollByPixel("0","400");
        Thread.sleep(2000);
        clickOn(fourStar);
    }
    public void clickOnThreeStars() throws InterruptedException {
        scrollByPixel("0","400");
        Thread.sleep(2000);
        clickOn(threeStar);
    }
    public void isFiveStarSelected(){
        isElementSelected(fiveStar);
    }
    public void isFourStarSelected(){
        isElementSelected(fourStar);
    }
    public void isThreeStarSelected(){
        isElementSelected(threeStar);
    }



}