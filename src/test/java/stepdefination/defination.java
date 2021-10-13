package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.Hookclass;

public class defination {
	WebDriver driver=Hookclass.driver;
	
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		
		
		driver.get("http://elearningm1.upskills.in/index.php");
		driver.manage().window().maximize();
		try{
			driver.findElement(By.xpath("//input[@id='login']")).sendKeys("srishti");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sonal@123");
			System.out.println("1.User enters username and password to login!!!");
		
		}
		catch(Exception ex){
			System.out.println("Cannot enter Username and Password"+ex);
			Assert.fail();
			
		}
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		try {
			driver.findElement(By.id("form-login_submitAuth")).click();
			System.out.println("2.User clicks on the Login button!!!");
			
			}
			catch(Exception ex)
			{
				System.out.println("Cannot complete Login"+ex);
				Assert.fail();
			}
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("User gets redirected to dashboard of website")
	public void user_gets_redirected_to_dashboard_of_website() {
		try{
			Thread.sleep(3000);
			String expectedtitle="My Organization - My education - My courses";
			String actualtitle=driver.getTitle();
			Assert.assertEquals(expectedtitle,actualtitle);
		    System.out.println("3.User gets redirected to dashboard of website");
		}
		catch(Exception ex)
		{
			System.out.println(" User not able to see dashboard"+ex);
			Assert.fail();
		}
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("user clicks on Progress section on menu bar")
	public void user_clicks_on_Progress_section_on_menu_bar() {
		try
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@title='Progress']")).click();
			System.out.println("4.User clicks on the Progress link");
			
		}
		catch(Exception ex)
		{
			System.out.println("User cannot click on Progress link"+ex);
			Assert.fail();
		}
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("User gets redirected to Progress section")
	public void user_gets_redirected_to_Progress_section() {
		try{
			Thread.sleep(3000);
			String expectedtitle="My Organization - My education - Progress";
			String actualtitle=driver.getTitle();
			Assert.assertEquals(expectedtitle,actualtitle);
		    System.out.println("5.User is navigated to Progress page");
		}
		catch(Exception ex)
		{
			System.out.println("Not able to navigate to Progress page"+ex);
			Assert.fail();
		}
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
	@Given("User is on Progress section")
	public void user_is_on_Progress_section() {
		try{
			Thread.sleep(3000);
			String expectedtitle="My Organization - My education - Progress";
			String actualtitle=driver.getTitle();
			Assert.assertEquals(expectedtitle,actualtitle);
		    System.out.println("6.User is on Progress page");
		}
		catch(Exception ex)
		{
			System.out.println("Not on Progress page"+ex);
			Assert.fail();
		}
		
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("User should be able to see course title")
	public void user_should_be_able_to_see_course_title() {
		try{

			boolean dis1=driver.findElement(By.xpath("//th[text()='Course']")).isDisplayed();
			System.out.println("7.My course heading is present\n" + dis1);
			}
			catch(Exception ex)
			{
				System.out.println("not able to see course"+ex);
				Assert.fail();
				
			}
		
	    // Write code here that turns the phrase above into concrete actions

	}
	
	
	@Then("user should be able to see Course, Time spent in the course,	Progress,	Best score in learning path,	Best score not in learning path	,Latest login,	Details")
	public void user_should_be_able_to_see_Course_Time_spent_in_the_course_Progress_Best_score_in_learning_path_Best_score_not_in_learning_path_Latest_login_Details() {
		try{
			boolean dis=driver.findElement(By.xpath("//th[text()='Course']")).isDisplayed();
			System.out.println("8.Course heading is present\n" + dis);

			boolean learn=driver.findElement(By.xpath("//th[text()='Time spent in the course']")).isDisplayed();
			System.out.println("9.Time spent heading is present\n" +learn);
			
			boolean learn1=driver.findElement(By.xpath("//th[text()='Progress']")).isDisplayed();
			System.out.println("10.Progress heading is present\n" +learn1);
			
			boolean learn2=driver.findElement(By.xpath("//th[text()='Best score in learning path']")).isDisplayed();
			System.out.println("11.Best score in learning path heading is present\n" +learn2);
			
			boolean learn3=driver.findElement(By.xpath("//th[text()='Best score not in learning path']")).isDisplayed();
			System.out.println("12.Best score not in learning path heading is present\n" +learn3);
			
			boolean learn4=driver.findElement(By.xpath("//th[text()='Latest login']")).isDisplayed();
			System.out.println("13.Latest login heading is present\n" +learn4);
			
			boolean learn5=driver.findElement(By.xpath("//th[text()='Details']")).isDisplayed();
			System.out.println("14.Details heading is present\n" +learn5);
			}
			catch(Exception ex)
			{
				System.out.println("not able to see all the headings"+ex);
				Assert.fail();
				
			}
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
	
	@Then("user is able to see all the details under each title of My Courses")
	public void user_is_able_to_see_all_the_details_under_each_title_of_My_Courses() {
		try{

			boolean detail1=driver.findElement(By.xpath("//a[text()='123testing']")).isDisplayed();
			System.out.println("7.Name of the course is displayed\n" +detail1);
			
			boolean detail2=driver.findElement(By.xpath("//td[text()='00:23:53']")).isDisplayed();
			System.out.println("8.Actual time spent is displayed\n" +detail2);
			
			boolean detail3=driver.findElement(By.xpath("//td[text()='0%']")).isDisplayed();
			System.out.println("9.Progress percentage is displayed\n" +detail3);
			
			boolean detail4=driver.findElement(By.xpath("//td[text()='-']")).isDisplayed();
			System.out.println("10.User is able to see best score\n" +detail4);
			
			boolean detail5=driver.findElement(By.xpath("//td[text()='-']")).isDisplayed();
			System.out.println("11.User is able to see best score not in learning path\n" +detail5);
			
			boolean detail6=driver.findElement(By.xpath("//span[text()='Sep 06, 2021']")).isDisplayed();
			System.out.println("12.User is able to see date of latest login\n" +detail6);
			
			boolean detail7=driver.findElement(By.xpath("//img[@title='Details']")).isDisplayed();
			System.out.println("13.User is able to see arrow image under details\n" +detail7);
			}
			catch(Exception ex)
			{
				System.out.println("User is not able to see all the details of subscribed course"+ex);
				Assert.fail();
				
			}
		
	   
	}

	@When("user clicks on the arrow button")
	public void user_clicks_on_the_arrow_button() {
		try
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@title='Details']")).click();
			System.out.println("7.User clicks on the arrow button");
			
		}
		catch(Exception ex)
		{
			System.out.println("User not able to click on arrow button"+ex);
			Assert.fail();
		}
		
		
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("user is able to see details of the courses below")
	public void user_is_able_to_see_details_of_the_courses_below() {
		try{

			boolean arrow=driver.findElement(By.xpath("//h3[text()='123testing']")).isDisplayed();
			System.out.println("8.User is able to see details of subscribed course after clicking arrow button\n" +arrow);
		}
		catch(Exception ex){
			System.out.println("user is not able to see details of course after clicking arrow button"+ex);
			Assert.fail();
		}
	    
	}
	
	@Then("User should be able to see Tests, Attempts,	Best attempt,Ranking,	Best result in course, Statistics")
	public void user_should_be_able_to_see_Tests_Attempts_Best_attempt_Ranking_Best_result_in_course_Statistics() {
		try{
			driver.findElement(By.xpath("//img[@title='Details']")).click();
			Thread.sleep(3000);
			boolean test1=driver.findElement(By.xpath("//th[text()='Tests']")).isDisplayed();
			System.out.println("7.User is able to see Tests title\n" +test1);
			
			boolean test2=driver.findElement(By.xpath("//th[text()='Attempts']")).isDisplayed();
			System.out.println("8.User is able to see Attempts title\n" +test2);
			
			boolean test3=driver.findElement(By.xpath("//th[text()='Best attempt']")).isDisplayed();
			System.out.println("9.User is able to see Best attempt title\n" +test3);
			
			boolean test4=driver.findElement(By.xpath("//th[text()='Ranking']")).isDisplayed();
			System.out.println("10.User is able to see Ranking title\n" +test4);
			
			boolean test5=driver.findElement(By.xpath("//th[text()='Best result in course']")).isDisplayed();
			System.out.println("11.User is able to see Best result in course title\n" +test5);
			
			boolean test6=driver.findElement(By.xpath("//th[text()='Statistics ']")).isDisplayed();
			System.out.println("12.User is able to see Statistics title\n" +test6);
			
			boolean test7=driver.findElement(By.xpath("//th[text()='Learning paths']")).isDisplayed();
			System.out.println("13.User is able to see Learning path title\n" +test7);
			
			boolean test8=driver.findElement(By.xpath("//th[text()='Time spent']")).isDisplayed();
			System.out.println("14.User is able to see Time spent title\n" +test8);
			
			boolean test9=driver.findElement(By.xpath("//th[text()='Progress']")).isDisplayed();
			System.out.println("15.User is able to see Progress title\n" +test9);
			
			boolean test10=driver.findElement(By.xpath("//th[text()='Score']")).isDisplayed();
			System.out.println("16.User is able to see Score title\n" +test10);
			
			boolean test11=driver.findElement(By.xpath("//th[text()='Best score']")).isDisplayed();
			System.out.println("17.User is able to see Best score title\n" +test11);
			
			boolean test12=driver.findElement(By.xpath("//th[text()='Latest login']")).isDisplayed();
			System.out.println("18.User is able to see Latest login title\n" +test12);
			
			
		}
		catch(Exception ex){
			System.out.println("user is not able to see the title after clicking arrow"+ex);
			Assert.fail();
		}
	    
	}

	@Then("user is able to see test name of subscribed course")
	public void user_is_able_to_see_test_name_of_subscribed_course() {
		try{
			driver.findElement(By.xpath("//img[@title='Details']")).click();
			Thread.sleep(3000);
			boolean name1=driver.findElement(By.xpath("//a[text()='mtest']")).isDisplayed();
			System.out.println("7.User is able to see name of the test under tests title\n" +name1);
			
			 boolean name2=driver.findElement(By.xpath("//td[text()='0']")).isDisplayed();
			    System.out.println("8.User is able to see number of attempts under Attempts title\n" +name2);
			
		}
		catch(Exception ex){
			System.out.println("user is not able to see name of the test under tests title"+ex);
			Assert.fail();
		}
		
		
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("user is also able to click on test name")
	public void user_is_also_able_to_see_Attempts() {
		try{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[text()='mtest']")).click();
			System.out.println("9.User clicks on testname link");
			
			Thread.sleep(3000);
			String expectedtitle="My Organization - My education - 123testing";
			String actualtitle=driver.getTitle();
			Assert.assertEquals(expectedtitle,actualtitle);
		    System.out.println("10.User is on subscribed course test page");
			
		}
		catch(Exception ex){
			System.out.println("user is not able to click on testname link"+ex);
			Assert.fail();
			
		}
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("user is able to see Timeline heading")
	public void user_is_able_to_see_Timeline_heading() {
		try{
			Thread.sleep(3000);
		boolean time1=driver.findElement(By.xpath("//h3[text()='Timeline']")).isDisplayed();
		System.out.println("7.User is able to see Timeline heading\n" +time1);
		
		
	}
	catch(Exception ex){
		System.out.println("user is not able to see the Timeline title"+ex);
		Assert.fail();
	}
	    
	}

	
	
	@Then("user is able to see login-time of subscribed courses")
	public void user_is_able_to_see_login_time_of_subscribed_courses() {
		try{
			Thread.sleep(3000);
			boolean time1=driver.findElement(By.xpath("//a[text()='Sep 02, 2021']")).isDisplayed();
			System.out.println("8.User is able to see login-time of subscribed courses\n" +time1);
		}
		catch(Exception ex){
			System.out.println("user is not able to see login-time of subscribed courses"+ex);
			Assert.fail();
		}
	
	}

	
	
	@When("user clicks on time, user is able to see message under it")
	public void user_links_on_time_user_is_able_to_see_message_under_it() {
        try{
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//a[text()='Sep 02, 2021']")).click();
			System.out.println("9.User clicks on timeline date");
			
			boolean time2=driver.findElement(By.xpath("//div[@class='text-course']/p/b")).isDisplayed();
			System.out.println("10.User is able to see login-time message under timeline section\n" +time2);
		}
		catch(Exception ex){
			System.out.println("user is not able to see login-time of message under timeline"+ex);
			Assert.fail();
		}
	}

	
	@Then("User should be able to see only one login time")
	public void user_should_be_able_to_see_only_one_login_time() {
		try{
			Thread.sleep(3000);
			boolean time3=driver.findElement(By.xpath("//*[@id='1630563433']/div[2]/p/b[2]")).isDisplayed();
			System.out.println("11.User is able to see only one actual login-time\n" +time3);
		}
		catch(Exception ex){
			System.out.println("User is able to see multiple login-time"+ex);
			Assert.fail();
		}
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	
	@Given("user is able to see logo of blue color")
	public void user_is_able_to_see_logo_of_blue_color() {
		
		try{
			Thread.sleep(3000);
			boolean logo=driver.findElement(By.xpath("//div[@class='img-course']")).isDisplayed();
			System.out.println("7.User is able to see E-learning blue colour logo\n" +logo);
		}
		catch(Exception ex){
			System.out.println("user is not able to see E-learning blue colour logo"+ex);
			Assert.fail();
		}
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("user is able to see arrow button beside the logo")
	public void user_is_able_to_see_arrow_button_beside_the_logo() {
		try{
			Thread.sleep(5000);
			boolean arro=driver.findElement(By.xpath("//a[@id='next']")).isDisplayed();
			System.out.println("7.User is able to see arrow button beside logo\n" +arro);
			
			driver.findElement(By.xpath("//a[@id='next']")).click();
			System.out.println("8.User clicks on next arrow button");
			
			driver.findElement(By.xpath("//a[@id='next']")).click();
			System.out.println("9.User clicks on previous arrow button");
			
		}
		catch(Exception ex){
			System.out.println("user is not able to see arrow button beside logo"+ex);
			Assert.fail();
		}
		
		
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@Given("User clicks on drop-down")
	public void user_clicks_on_drop_down() {
		try{
			Thread.sleep(3000);
        	driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/a/span[2]")).click();
			System.out.println("7.User clicks on drop-down icon");
		}
		catch(Exception ex){
			System.out.println("user is not able to click on drop-down icon"+ex);
			Assert.fail();
		}
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("user is able to see his name and email-id")
	public void user_is_able_to_see_his_name_and_email_id() {
		try{
			Thread.sleep(3000);
			boolean name8=driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/ul/li[1]/div/a/p")).isDisplayed();
			System.out.println("8.User is able to see username in the drop-down\n" +name8);
			
			boolean name9=driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/ul/li[1]/div/p")).isDisplayed();
			System.out.println("9.User is able to see user E-mail id in the drop-down\n" +name9);
			
			
		}
		catch(Exception ex){
			System.out.println("user is not able to see his E-mail id in the drop-down"+ex);
			Assert.fail();
		}
		
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("User clicks on his name")
	public void user_clicks_on_his_name() {
		try{
			Thread.sleep(3000);
		
        	driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/ul/li[1]/div/a/p")).click();
			System.out.println("10.User clicks his name");
		}
		catch(Exception ex){
			System.out.println("user is not able to click on his name"+ex);
			Assert.fail();
		}
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("gets redirected to social network page")
	public void gets_redirected_to_social_network_page() {
		try{
			Thread.sleep(3000);
			String expectedtitle="My Organization - My education - Social network";
			String actualtitle=driver.getTitle();
			Assert.assertEquals(expectedtitle,actualtitle);
		    System.out.println("11.User is redirected to Social network page");
		}
		catch(Exception ex)
		{
			System.out.println("Not on Social network page"+ex);
			Assert.fail();
		}
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("user again clicks on the profile drop-down button")
	public void user_again_clicks_on_the_profile_drop_down_button() {
		try{
        	driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/a/span[2]")).click();
			System.out.println("12.User clicks on drop-down icon again");
		}
		catch(Exception ex){
			System.out.println("user is not able to click on drop-down icon"+ex);
			Assert.fail();
		}
		
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@Then("gets clicks on Inbox link")
	public void gets_clicks_on_Inbox_link() {
		try{
        	driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/ul/li[3]/a")).click();
			System.out.println("13.User clicks on Inbox link");
			
			Thread.sleep(3000);
			String expectedtitle="My Organization - My education";
			String actualtitle=driver.getTitle();
			Assert.assertEquals(expectedtitle,actualtitle);
		    System.out.println("13.User gets redirected to Social network page");
			
			
		}
		catch(Exception ex){
			System.out.println("user is not able to click on inbox link"+ex);
			Assert.fail();
		}
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("user clicks on My Certificates link")
	public void user_clicks_on_My_Certificates_link() {
		try{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		
        	driver.findElement(By.xpath("//a[@title='My certificates']")).click();
			System.out.println("14.User clicks on My certificates link");
			

		}
		catch(Exception ex){
			System.out.println("user is not able to click on My certificate link"+ex);
			Assert.fail();
		}
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@When("user is redirected to certificate page")
	public void user_is_redirected_to_certificate_page() {
		try{
			Thread.sleep(3000);
			String expectedtitle="My Organization - My education - My certificates";
			String actualtitle=driver.getTitle();
			Assert.assertEquals(expectedtitle,actualtitle);
		    System.out.println("15.User gets redirected to my certificates page");

		}
		catch(Exception ex){
			System.out.println("user is not able to redirect to My certificate page"+ex);
			Assert.fail();
		}
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("user clicks on Logout link")
	public void user_clicks_on_Logout_link() {
		try{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
			
        	driver.findElement(By.xpath("//a[@title='Logout']")).click();
			System.out.println("16.User clicks on Logout link");
		
		}
		catch(Exception ex){
			System.out.println("user is not able to click on logout link"+ex);
			Assert.fail();
		}
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("user gets on the homepage")
	public void user_gets_on_the_homepage() {
		try{
			Thread.sleep(3000);
			String expectedtitle="My Organization - My education";
			String actualtitle=driver.getTitle();
			Assert.assertEquals(expectedtitle,actualtitle);
		    System.out.println("17.User gets redirected to Home page");

		}
		catch(Exception ex){
			System.out.println("user is not able to redirect to Home page"+ex);
			Assert.fail();
		}
	    // Write code here that turns the phrase above into concrete actions
	    
	}





}
