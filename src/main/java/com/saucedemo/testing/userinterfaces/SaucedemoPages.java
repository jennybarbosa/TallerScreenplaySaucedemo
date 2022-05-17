package com.saucedemo.testing.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SaucedemoPages {

 //Mapeo de Localizadores

    public static final Target INP_USERNAME = Target.the("ENTER TO USERNAME").located(By.id("user-name"));
    public static final Target INP_PASSWORD = Target.the("ENTER TO PASSWORD").located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("BUTTON FOR LOGIN").located(By.id("login-button"));
    public static final Target SPN_PRINCIPAL_PAGE = Target.the("TEXT PRODUCTS").located(By.xpath("//span[text()='Products']"));
    public static final Target LINK_ITEM_PRODUCT = Target.the("LINK FOR GO TO PRODUCT").located(By.xpath("//div[@class='inventory_item_name' and text()='Sauce Labs Backpack']"));
    public static final Target BTN_ADD_CART = Target.the("BUTTON FOR ADD TO CART").located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target BTN_CHART = Target.the("BUTTON FOR GO SHOPPING CART").located(By.xpath("// a[@class='shopping_cart_link']"));
    public static final Target SPN_YOUR_CART = Target.the(" TITLE TEXT YOUR CART").located(By.xpath("//span[text()='Your Cart']"));
    public static final Target BTN_CHECKOUT = Target.the("BUTTON FOR GO CHECKOUT").located(By.id("checkout"));
    public static final Target INP_FIRST_NAME = Target.the("ENTER TO FIRST NAME").located(By.id("first-name"));
    public static final Target INP_LAST_NAME  = Target.the("ENTER TO LAST NAME").located(By.id("last-name"));
    public static final Target INP_POSTAL_CODE = Target.the("ENTER TO POSTAL CODE").located(By.id("postal-code"));
    public static final Target BTN_CONTINUE = Target.the("BUTTON FOR CONTINUE").located(By.id("continue"));
    public static final Target BTN_FINISH = Target.the("BUTTON FINISH").located(By.id("finish"));
    public static final Target LBL_ORDER_COMPLETE = Target.the("TEXT THANK YOY FOR YOUR ORDER").located(By.xpath("//h2[@class='complete-header']"));


}
