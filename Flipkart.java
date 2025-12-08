package basicjava;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

import com.sun.tools.javac.util.List;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		EdgeDriver driver=new EdgeDriver();
		//Load the url-get
		driver.get("https://www.flipkart.com/");
		//maximize the browser
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("shoes",Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='atjtcj']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> window=new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='dSMSUb ugg2xr Iumgrz']")).click();

	}
}