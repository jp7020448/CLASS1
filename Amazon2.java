package basicjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon2 {

	public static void main(String[] args) {
		      // TODO Auto-generated method stub
    EdgeDriver driver=new EdgeDriver();
                    //Load the url-get
    driver.get("https://www.amazon.com/");
                   //maximize the browser
    driver.manage().window().maximize();
               //search mobile in search field
               //driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles",keys.ENTER);
    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile",Keys.ENTER);
	             //click add to cart
	driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	}
}
