package basicjava;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookLogin {
	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();
		
		EdgeDriver driver=new EdgeDriver();
		
		//Load url
		driver.get("https://www.facebook.com/");
		//Enter the username
		driver.findElement(By.id("email")).sendKeys("jp7020448@Facebook.com");
		//Enter the password
		driver.findElement(By.id("pass")).sendKeys("sample password");
		//Click Login button
		driver.findElement(By.name("login")).click();
		//close the browser
	}
}