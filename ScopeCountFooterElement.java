package ScopeCountFooterElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScopeCountFooterElement {

	public static void main(String[] args) {
	

		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		//1st get the total number of tag names available on the entire page
		System.out.println(driver.findElements(By.tagName("a")).size());
		//Focus on the footer
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		

	}

}
