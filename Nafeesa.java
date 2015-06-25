import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Nafeesa {
	
	public static void main(String[] args) {
		  WebDriver na = new FirefoxDriver();
		  na.get("http://www.amazon.com");
		  WebElement j = na.findElement(By.xpath("//"));
		  System.out.println(j);
		  na.close();
		 }

}
