package pages;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Timestamp;
import java.util.*;

import com.cognizant.framework.*;
import cucumber.api.DataTable;
import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import businesscomponents.GeneralComponentsMobileNative;
import io.appium.java_client.AppiumDriver;

//import com.cognizant.framework.Report;
//import com.cognizant.framework.Status;
//import com.cognizant.framework.selenium.AppiumDriverFactory;

//import com.experitest.selenium.MobileWebElement;

import junit.framework.Assert;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


//import supportlibraries.ReusableLibrary;
//import supportlibraries.ScriptHelper;
import pages.LoginPage;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import com.cognizant.framework.FrameworkException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginPage {

    //AppiumDriverFactory driver;
    CraftDriver driver;

    public LoginPage(CraftDriver driver) {
        this.driver = driver;
    }

    AppiumDriverFactory appFact = new AppiumDriverFactory();
    String packageUrl = appFact.getAppProperties();
    String deviceName = appFact.getDeviceProperties();

    public By myo2Logo = By.id("");
    public By signInTxt = By.id("" + packageUrl + ":id/text1");
    public By uNameFieldDev = By.id("" + packageUrl + ":id/EditUsername");
    public By pwdField = By.id("" + packageUrl + ":id/EditPassword");
    public By signInButton = By.id("" + packageUrl + ":id/buttonOKSignIn");
    public By signInHelp = By.id("" + packageUrl + ":id/ForgottenSignInDetail");
    public By o2Community = By.id("" + packageUrl + ":id/tv_trio_0");
    public By o2Guru = By.id("" + packageUrl + ":id/tv_trio_1");
    public By moreFromO2 = By.id("" + packageUrl + ":id/tv_trio_2");
    public By loadingImage = By.id("" + packageUrl + ":id/progress_front");


    public By versionNumber = By.id("" + packageUrl + ":id/ver");


    public By haburgerMenuButton = By.className("android.widget.ImageButton");

    public By signOutConfirmation = By.id("" + packageUrl + ":id/dialogbox_message");
    public By signOutCancel = By.id("" + packageUrl + ":id/dialogbox_left");
    public By signOutOk = By.id("" + packageUrl + ":id/dialogbox_right");

    public By changePinConfirmation = By.id("" + packageUrl + ":id/dialogbox_message");
    public By changePinCancel = By.id("" + packageUrl + ":id/dialogbox_left");
    public By changePinOutOk = By.id("" + packageUrl + ":id/dialogbox_right");

    public By webViewFindYourAccount = By.xpath("//h3[text()='Finding your account']");

    //webView pages ID
    public By liveStatusCheckerPage = By.xpath("//*[@id='status-checker-header-xxl']//div/h1");
    public By contactPreferencePage = By.xpath("//*[@id='pageTitle']/span");
    public By o2WifiHotSpotPage = By.xpath("//*[@id='map-div']");
    public By unlockPage = By.xpath("//*[@id='unlockDevice']");
    public By helpAndSupportPage = By.xpath("//*[@id='o2-page-wrapper']//div/h1");
    public By o2CommunityPage = By.xpath("//*[@id='o2-page-wrapper']//div/h1/a");
    public By o2GurusPage = By.xpath("//*[@id='guru-header-xxl-1']//div/h1");
    public By moreFromO2Page = By.xpath("//*[@id='o2-page-wrapper']");


    public By navigateBack = By.xpath("//*[@content-desc='Navigate up']");


    //
    public By uNameFieldRef = By.id("uk.co.o2.android.myo2.ref.debug:id/EditUsername");
    public By uNameFieldLive = By.id("uk.co.o2.android.myo2.debug:id/EditUsername");

    //O2 code

    public By topNativation = By.id("uk.co.o2.android.myo2.dev.debug:id/tabs");

    public By ukDataSection = By.xpath("//android.widget.FrameLayout[@index='2']");
    public By doughnut = By.id("" + packageUrl + ":id/donut");
    public By ukDataText = By.id("" + packageUrl + ":id/title");
    public By amtValue = By.id("" + packageUrl + ":id/amount_number");
    public By amtText = By.id("" + packageUrl + ":id/amount_text");
    public By AmtSubText = By.id("" + packageUrl + ":id/amount_subtext");
    public By allowanceText = By.id("" + packageUrl + ":id/below1");
    public By carryoverText = By.id("" + packageUrl + ":id/below3");


    public By recentCharges = By.xpath("android.widget.FrameLayout[@index='3']");
    public By latestAirtimeBill = By.xpath("android.widget.FrameLayout[@index='5']");
    public By devicePlan = By.xpath("android.widget.FrameLayout[@index='6']");
    public By nextBill = By.xpath("android.widget.FrameLayout[@index='7']");
    public By upgradeSection = By.xpath("android.widget.FrameLayout[@index='8']");


    //select device
    public By selectDevicePageTitle = By.id("" + packageUrl + ":id/title_top");
    public By selectMsisdn = By.xpath("//*" + packageUrl + ":id/above1[@index='1']]");

    //upgrade widget
    public By upgradeHeader = By.xpath("//text[@value='Upgrade']");
    public By headerList = By.xpath("" + packageUrl + ":id/title");

    //upgrade Page
    public By upgradePageToolBar = By.id("" + packageUrl + ":id/toolbar");
    public By upgradePageHeader = By.id("" + packageUrl + ":id/title_top");

    //title tabs

    public By content = By.id("" + packageUrl + ":id/content");
    public By titleTabSection = By.id("" + packageUrl + ":id/tabs");


    public By homePageTitle = By.name("Home");
    public By allowancePageTitle = By.name("Allowances");
    public By boltonsPageTitle = By.name("Bolt Ons");
    public By billsPageTitle = By.name("Bills");

    public By infoIcon = By.xpath("//android.widget.ImageButton[@content-desc='Late payment fees']");

    //LPF

    public By lpfPageHeading = By.xpath("/html/body/h4");
    public By firstPara = By.xpath("/html/body/p[1]/text()");
    public By secondPara = By.xpath("/html/body/p[2]/text()");
    public By thirdPara = By.xpath("/html/body/p[3]/text()");


    //FingerPrint pages

    public By fingerPrintPageHeading = By.id("" + packageUrl + ":id/text1");
    public By fingerPrintPageUser = By.id("" + packageUrl + ":id/btn_1");
    public By fingerPrintPageNotNow = By.id("" + packageUrl + ":id/btn_2");
    public By fingerPrintPageMessageTitle = By.id("" + packageUrl + ":id/dialogbox_title");
    public By fingerPrintPageMessage = By.id("" + packageUrl + ":id/dialogbox_message");
    public By fingerPrintPageMessageOkButton = By.id("" + packageUrl + ":id/dialogbox_middle");
    //public By fingerPrintSubHeading = ByName("No need to enter your pin each time. Sign in with your fingerprint.");


    //Broadcast Message
    public By braodcastHeading = By.id("" + packageUrl + ":id/dialogbox_title");
    public By broadcastMessage = By.id("" + packageUrl + ":id/dialogbox_message");
    public By braodcastStoreLink = By.id("" + packageUrl + ":id/dialogbox_left");
    public By broadcastOkButton = By.id("" + packageUrl + ":id/dialogbox_middle");


    //Hamburger Menu links

    public By helpTipsMenu = By.id("" + packageUrl + ":id/drawer_container_help_tips_and_more");
    public By helpTipsMenus = By.xpath("" + packageUrl + ":id/drawer_container_help_tips_and_more']//*[@class='android.widget.TextView']");
    public By settingsMenu = By.xpath("//*[@id='drawer_container_settings']");
    public By planHeadings = By.xpath("//*[contains(@id,'drawer_heading_pay')]");
    public By planValues = By.xpath("//*[contains(@id,'drawer_heading_pay')]/..//*[contains(@id,'drawer_item_text')]");
    public By haburgerMenuButton1 = By.xpath("//*[@content-desc='Open navigation drawer']");
    public By signOut = By.id("" + packageUrl + ":id/drawer_action_sign_out");
    public By changePin = By.id("" + packageUrl + ":id/drawer_action_change_pin");
    public By liveStatusChecker = By.id("" + packageUrl + ":id/drawer_action_live_status_checker");
    public By contactPreferences = By.id("" + packageUrl + ":id/drawer_action_contact_preferences");
    public By hotSpotFinder = By.id("" + packageUrl + ":id/drawer_action_o2_wifi_hotspot_finder");
    public By unlockDevice = By.id("" + packageUrl + ":id/drawer_action_unlock_your_device");
    public By helpAndSupport = By.id("" + packageUrl + ":id/drawer_action_help_and_support");
    public By o2Community1 = By.id("" + packageUrl + ":id/drawer_action_o2_community");
    public By o2Guru1 = By.id("" + packageUrl + ":id/drawer_action_o2_gurus");
    public By moreFromO21 = By.id("" + packageUrl + ":id/drawer_action_more_from_o2");
    public By forgettenSignIn = By.id("" + packageUrl + ":id/drawer_action_forgotten_sign_in");


    public void enterTheUsername(String username) {
        driver.findElement(uNameFieldDev).sendKeys(username);
    }

    public void enterThePassword(String password) {
        driver.findElement(pwdField).sendKeys(password);
    }

    public void verifyClickSubmit() {
        driver.findElement(signInButton).click();
    }


    public void verifyPinPage() throws InterruptedException {
        String DeviceName = deviceName;
        for (int i = 1; i < 6; i++) {
            press_key1(DeviceName);
            Thread.sleep(1500);
        }

    }

    public void press_key1(String dname) {
        try {
            ProcessBuilder pb = new ProcessBuilder("adb", "-s", dname, "shell", "input", "text", "2");
            Process pc = pb.start();
            pc.waitFor();
            System.out.println("Done");
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void verifyInformationOnTheLoginPage(String information) {
        if (information.equals("Sign in to review your account")) {
            assertEquals(driver.findElement(signInTxt).getText(), information);
        }
    }

    public void verifyLink(String link) {
        assertEquals(driver.findElement(signInHelp).getText(), link);
    }

    public void verifyO2Gurus(String link) {
        if (link.equals("O2 Community")) {
            assertEquals(driver.findElement(o2Community).getText(), link);
        }
        if (link.equals("O2 Gurus")) {
            assertEquals(driver.findElement(o2Guru).getText(), link);
        }
        if (link.equals("More from O2")) {
            assertEquals(driver.findElement(moreFromO2).getText(), link);
        }
    }

    public void verifyFingerPrintPage(DataTable fingerPrintInfo) {

        for (int i = 0; i < fingerPrintInfo.getGherkinRows().size(); i++) {

            assertEquals(getDataTableCell(fingerPrintInfo, 0, 0), driver.findElement(fingerPrintPageHeading).getText());
            //assertEquals(getDataTableCell(fingerPrintInfo,1,0),driver.findElement(By.name("No need to enter your pin each time. Sign in with your fingerprint.")));
            assertEquals(getDataTableCell(fingerPrintInfo, 1, 0), driver.findElement(fingerPrintPageUser).getText());
            assertEquals(getDataTableCell(fingerPrintInfo, 2, 0), driver.findElement(fingerPrintPageNotNow).getText());

        }

    }


    public void verifyClickNotNowSubmit() {
        driver.findElement(fingerPrintPageNotNow).click();


    }

    public void verifyFingerPrintMessages(DataTable fingerPrintInfoMessage) {
        for (int i = 0; i < fingerPrintInfoMessage.getGherkinRows().size(); i++) {

            assertEquals(getDataTableCell(fingerPrintInfoMessage, 0, 0), driver.findElement(fingerPrintPageMessageTitle).getText());
            assertEquals(getDataTableCell(fingerPrintInfoMessage, 1, 0), driver.findElement(fingerPrintPageMessage).getText());


        }
    }

    public void verifyClickOkButton() throws InterruptedException {
        driver.findElement(fingerPrintPageMessageOkButton).click();
        Thread.sleep(5000);
    }


    public void verifyBroadcastMessage(DataTable broadcastMessages){
        for (int i = 0; i < broadcastMessages.getGherkinRows().size(); i++) {

            assertEquals(getDataTableCell(broadcastMessages, 0, 0), driver.waitForElementToAppear(braodcastHeading).getText());
            assertEquals(getDataTableCell(broadcastMessages, 1, 0), driver.waitForElementToAppear(broadcastMessage).getText());
            driver.findElement(broadcastOkButton).click();

        }
    }

    public void verifyHomePage() {
        assertTrue(driver.findElement(haburgerMenuButton).isDisplayed());
    }


    public static String getDataTableCell(DataTable gTable, int row, int col) {
        return gTable.getGherkinRows().get(row).getCells().get(col);
    }


    public void logouts() throws InterruptedException {

        for (int i = 1; i <= 3; i++) {

            if (driver.findElement(haburgerMenuButton).isDisplayed()) {
                //	objLogin.clickGlobalNavigation();
                driver.findElement(haburgerMenuButton).click();
                break;
            }
        }
        assertTrue(driver.findElement(helpTipsMenu).isDisplayed());

        for (int i = 1; i <= 3; i++) {

            driver.scrollTo("Sign out");


            if (driver.findElement(signOut).isDisplayed()) {
                clickLogout();
                break;
            }
            assertTrue(driver.findElement(signOutConfirmation).isDisplayed());
            clickButtonSignOutOk();
            Thread.sleep(3000);
            assertTrue(driver.findElement(signInButton).isDisplayed());


        }
    }


    public void clickLogout() {
        driver.findElement(signOut).click();

    }

    public void clickChangePin() {
        driver.findElement(changePin).click();

    }

    public void clickForgetSignIn() {
        driver.findElement(forgettenSignIn).click();

    }

    public void clickLiveStatusChecker() {
        driver.findElement(liveStatusChecker).click();

    }

    public void clickContactPreferences() {
        driver.findElement(contactPreferences).click();

    }



	/*
    uk.co.o2.android.myo2.dev.debug:id/title_top
	uk.co.o2.android.myo2.dev.debug:id/title_bottom
	uk.co.o2.android.myo2.dev.debug:id/tabs
	
	
	android.widget.FrameLayout
	
	uk.co.o2.android.myo2.dev.debug:id/section_heading
	*/


    // Bills
//	public  By billPanne = By.id(""+packageUrl+":id/top_panel");
//
//	public void clickUpgrade() throws InterruptedException {
//   	 driver.findElement(upgradeHeader).click();
//   	 Thread.sleep(1000);
//    }
//
//	public void clickButtonSignOutCancel() throws InterruptedException {
//    	 driver.findElement(signOutCancel).click();
//    	 Thread.sleep(1000);
//     }
//
    public void clickButtonSignOutOk() throws InterruptedException {
        driver.findElement(signOutOk).click();
        Thread.sleep(1000);
    }
//
//     public void clickButtonCancel() throws InterruptedException {
//    	 driver.findElement(signOutCancel).click();
//    	 Thread.sleep(1000);
//     }
//
//     public void clickButtonOk() throws InterruptedException {
//    	 driver.findElement(signOutOk).click();
//    	 Thread.sleep(1000);
//     }
//
//     public void clickNativegateBack() throws InterruptedException {
//    	 driver.findElement(navigateBack).click();
//    	 Thread.sleep(1000);
//     }
//
//     public void navigateHome() throws InterruptedException {
//    	 for(int i=0;i<4;i++){
//				if(driver.findElement(navigateBack).isDisplayed()){
//					driver.findElement(navigateBack).click();
//					}else{
//				}
//		}
//     }


//    public void timeStampCal() throws IOException {
//		 java.util.Date date= new java.util.Date();
//		 FileOutputStream fop = null;
//			File file;
//
//		  file = new File("c:\\timestamp.txt");
//			fop = new FileOutputStream(file);
//
//			if (!file.exists()) {
//				file.createNewFile();
//			}
//
//			int contentInBytes = new Timestamp(date.getTime()).getMinutes();
//
//			fop.write(contentInBytes);
//			fop.flush();
//			fop.close();
//
//		 System.out.println(new Timestamp(date.getTime()));
//	}



}
