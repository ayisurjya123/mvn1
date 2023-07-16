package Testcases;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import pages.Actitime;

@Listeners
public class TC_1 extends BaseTest
{

	@Test
	public void login1() throws IOException, InterruptedException
	{
		Actitime a1=new Actitime(driver);
		a1.loginMethod();
	}
}
