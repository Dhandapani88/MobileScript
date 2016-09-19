package pages;

import com.cognizant.framework.AppiumDriverFactory;
import com.cognizant.framework.CraftDriver;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by dhandapani on 18/09/16.
 */
public class OnboadingPage {


    CraftDriver driver;
    @Autowired
    public OnboadingPage(CraftDriver driver) {
        this.driver = driver;
    }

    AppiumDriverFactory appFact = new AppiumDriverFactory();
    String packageUrl = appFact.getAppProperties();
    String deviceName = appFact.getDeviceProperties();
    String applicationName = appFact.getAPKProperties();

    //ONBOARDING SCREEN
    public By onboardingHeader = By.id("" + packageUrl + ":id/header");
    public By onboardingMessage = By.id("" + packageUrl + ":id/text_message");
    public By onboardingSkipButton = By.id("" + packageUrl + ":id/button_close_labelled");
    public By onboardingPageIndicator = By.id("" + packageUrl + ":id/page_indicator");
    public By onboardingGetStarted = By.id("" + packageUrl + ":id/button_next");
    public By onboardingImages = By.id("" + packageUrl + ":id/button_next");


    public void uninstallPackage() throws InterruptedException {
        String DeviceName = deviceName;
        String packageNames= packageUrl;
        for (int i = 1; i < 6; i++) {
            uninstallApp(DeviceName,packageNames);
            Thread.sleep(1500);
        }

    }
    public void uninstallApp(String dname,String packageName) {
        try {
            ProcessBuilder pb = new ProcessBuilder("adb", "-s", dname, "shell","pm", "uninstall", "myO2-dev-debug.apk");
            Process pc = pb.start();
            pc.waitFor();
            System.out.println("Done");
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void installPackage() throws InterruptedException {
        String DeviceName = deviceName;
        String packageNames= applicationName;

        installApp(packageNames);
        Thread.sleep(1500);
    }

    public void installApp(String packageName) {
        try {
            ProcessBuilder pb = new ProcessBuilder("adb", "install", packageName);
            Process pc = pb.start();
            pc.waitFor();
            System.out.println("Done");
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}