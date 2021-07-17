package week1.day3;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class createLead{

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();
		WebElement webUserName = driver.findElement(By.id("username"));
		webUserName.sendKeys("demosalesmanager");

		// WebElement webPassword = driver.findElement(By.id("password"));
		// webPassword.sendKeys("crmsfa");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String orgTile = "Leaftaps - TestLeaf Automation Platform";
		String title = driver.getTitle();

		if (orgTile.equals(title))
			System.out.println("page landed up correctly");
		else

			System.out.println("page not landed correctly");

		driver.findElement(By.linkText("CRM/SFA")).click();

		String orgTitle = "My Home | opentaps CRM";
		String title2 = driver.getTitle();
		if (orgTitle.equals(title2))
			System.out.println("page landed up correctly");
		else
			System.out.println("page landed not correctly");

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement webCompany = driver.findElement(By.id("createLeadForm_companyName"));
		webCompany.sendKeys("skoruz foods");

		WebElement webFirstname = driver.findElement(By.id("createLeadForm_firstName"));
		webFirstname.sendKeys("loganayaki");

		WebElement webLastname = driver.findElement(By.id("createLeadForm_lastName"));
		webLastname.sendKeys("sundaram");
		driver.findElement(By.className("smallSubmit")).click();
		
	}

}
