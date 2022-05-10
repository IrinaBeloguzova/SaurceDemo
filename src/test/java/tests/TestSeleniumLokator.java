package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSeleniumLokator {
    WebDriver driver = new ChromeDriver();
    //id
    WebElement element1 = driver.findElement(By.id("root"));
    //name
    WebElement element2 = driver.findElement(By.name("user-name"));
    //classname
    WebElement element3 = driver.findElement(By.className("input_error form_input"));
    //tagname
    WebElement element4 = driver.findElement(By.tagName("div"));
    //linktext
    WebElement element5 = driver.findElement(By.linkText("Facebook"));
    //partiallinktext
    WebElement element6 = driver.findElement(By.partialLinkText("Linked"));
    //xpath
    WebElement element7 = driver.findElement(By.xpath("//input[@type='text']"));
    WebElement element8 = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
    WebElement element9 = driver.findElement(By.xpath("//input[contains(@type,'sub')]"));
    WebElement element10 = driver.findElement(By.xpath("//div[contains(text(),'Backpack')]"));
    WebElement element11 = driver.findElement(By.xpath("//div[@class='header_label']//ancestor::div"));
    WebElement element12 = driver.findElement(By.xpath("//div[@class='header_label']/descendant::div"));
    WebElement element13 = driver.findElement(By.xpath("//div[@class='header_label']/following::a"));
    WebElement element14 = driver.findElement(By.xpath("//div[@class='header_label']/parent::div"));
    WebElement element15 = driver.findElement(By.xpath("//div[@class='header_label']/preceding::div"));
    WebElement element16 = driver.findElement(By.xpath("//input[@type='submit' and @value='Login']"));
    //css
    WebElement element17 = driver.findElement(By.cssSelector(".submit-button."));
    WebElement element18 = driver.findElement(By.cssSelector(".submit-button.btn_action"));
    WebElement element19 = driver.findElement(By.cssSelector(".inventory_details .inventory_details_container."));
    WebElement element20 = driver.findElement(By.cssSelector("#login-button"));
    WebElement element21 = driver.findElement(By.cssSelector("form"));
    WebElement element22 = driver.findElement(By.cssSelector("div.form_group"));
    WebElement element23 = driver.findElement(By.cssSelector("[id=user-name]"));
    WebElement element24 = driver.findElement(By.cssSelector("[class=inventory_item]"));
    WebElement element25 = driver.findElement(By.cssSelector("[class|=inventory_item]"));
    WebElement element26 = driver.findElement(By.cssSelector("[class|=inventory]"));
    WebElement element27 = driver.findElement(By.cssSelector("[class^=in]"));
    WebElement element28 = driver.findElement(By.cssSelector("[class$=item]"));
    WebElement element29 = driver.findElement(By.cssSelector("[class*=em]"));














}
