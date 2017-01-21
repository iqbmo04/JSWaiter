package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by ONUR on 21.01.2017.
 */
public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "myAccount")
    public WebElement myAccount;

    public void gotoMyAccount (){
        //hoverByAction(By.id("myAccount"));
        hoverByAction(myAccount);
    }

    public void openHomePage (){
        driver.navigate().to("http://www.hepsiburada.com/");
    }

    public void printTitle() {
        System.out.println("HB Test's Pages title is: " + driver.getTitle());
    }
}
