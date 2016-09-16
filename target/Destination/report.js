$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/home/dhandapani/Dhandapani/mymobile_ws/MobileScript/src/test/java/features/Login.feature");
formatter.feature({
  "id": "",
  "description": "As a user\nI want to login to the application",
  "name": "",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": ";login-to-application",
  "tags": [
    {
      "name": "@devDone",
      "line": 5
    }
  ],
  "description": "",
  "name": "login to application",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario"
});
formatter.step({
  "name": "I initialize Appium driver",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "I should see \"Sign in to review your account\" on the login page",
  "keyword": "And ",
  "line": 8
});
formatter.step({
  "name": "I should see \"Forgotten log in details\" link",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "I should see \"O2 Community\" link at bottom",
  "keyword": "And ",
  "line": 10
});
formatter.step({
  "name": "I should see \"O2 Gurus\" link at bottom",
  "keyword": "And ",
  "line": 11
});
formatter.step({
  "name": "I should see \"More from O2\" link at bottom",
  "keyword": "And ",
  "line": 12
});
formatter.step({
  "name": "I login to the app with \"011111012@gmail.com\"",
  "keyword": "And ",
  "line": 13
});
formatter.step({
  "name": "I enter the password as \"password\"",
  "keyword": "And ",
  "line": 14
});
formatter.step({
  "name": "I click login button",
  "keyword": "And ",
  "line": 15
});
formatter.step({
  "name": "I should enter the pin",
  "keyword": "Then ",
  "line": 16
});
formatter.step({
  "name": "I should see fingerprint ID Page as following",
  "keyword": "And ",
  "line": 17,
  "rows": [
    {
      "cells": [
        "Sign in faster with fingerprint ID"
      ],
      "line": 18
    },
    {
      "cells": [
        "Use fingerprint ID"
      ],
      "line": 19
    },
    {
      "cells": [
        "Not now"
      ],
      "line": 20
    }
  ]
});
formatter.step({
  "name": "I should click not now button",
  "keyword": "Then ",
  "line": 21
});
formatter.step({
  "name": "I should see fingerprint ID Messages",
  "keyword": "And ",
  "line": 22,
  "rows": [
    {
      "cells": [
        "Fingerprint ID for \"My O2\""
      ],
      "line": 23
    },
    {
      "cells": [
        "You can turn on fingerprint ID at any time by going to the main menu, choosing Settings, and selecting fingerprint ID."
      ],
      "line": 24
    }
  ]
});
formatter.step({
  "name": "I should click ok button",
  "keyword": "Then ",
  "line": 25
});
formatter.step({
  "name": "I should see Broadcast Message",
  "keyword": "And ",
  "line": 26,
  "rows": [
    {
      "cells": [
        "Title"
      ],
      "line": 27
    },
    {
      "cells": [
        "This is a message for android 7.9.0-debug"
      ],
      "line": 28
    }
  ]
});
formatter.step({
  "name": "I should see home screen",
  "keyword": "And ",
  "line": 29
});
formatter.step({
  "name": "I Signout",
  "keyword": "Then ",
  "line": 30
});
formatter.match({
  "location": "Inti.i_initialize_Appium_driver()"
});
formatter.result({
  "duration": 12954251689,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign in to review your account",
      "offset": 14
    }
  ],
  "location": "LoginSteps.i_should_see_on_the_login_page(String)"
});
formatter.result({
  "duration": 95997267,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Forgotten log in details",
      "offset": 14
    }
  ],
  "location": "LoginSteps.i_should_see_link(String)"
});
formatter.result({
  "duration": 85573890,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "O2 Community",
      "offset": 14
    }
  ],
  "location": "LoginSteps.i_should_see_link_at_bottom(String)"
});
formatter.result({
  "duration": 58223431,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "O2 Gurus",
      "offset": 14
    }
  ],
  "location": "LoginSteps.i_should_see_link_at_bottom(String)"
});
formatter.result({
  "duration": 83160247,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "More from O2",
      "offset": 14
    }
  ],
  "location": "LoginSteps.i_should_see_link_at_bottom(String)"
});
formatter.result({
  "duration": 76968731,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "011111012@gmail.com",
      "offset": 25
    }
  ],
  "location": "LoginSteps.i_login_to_the_app_with(String)"
});
formatter.result({
  "duration": 5055325976,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 25
    }
  ],
  "location": "LoginSteps.i_enter_the_password_as(String)"
});
formatter.result({
  "duration": 5361740030,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_login_button()"
});
formatter.result({
  "duration": 827022827,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_enter_the_pin()"
});
formatter.result({
  "duration": 17281340317,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_see(DataTable)"
});
formatter.result({
  "duration": 424013200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_click_not_now_button()"
});
formatter.result({
  "duration": 166424564,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_click_not_now_button(DataTable)"
});
formatter.result({
  "duration": 890506400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_click_ok_button()"
});
formatter.result({
  "duration": 8157245886,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_see_Broadcast_Message_OK_button(DataTable)"
});
formatter.result({
  "duration": 33821224316,
  "status": "failed",
  "error_message": "org.openqa.selenium.TimeoutException: Timed out after 30 seconds waiting for visibility of element located by By.id: uk.co.o2.android.myo2.dev.debug:id/dialogbox_title\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027dhandapani-ThinkPad-X240\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00274.2.0-30-generic\u0027, java.version: \u00271.7.0_80\u0027\nDriver info: driver.version: CraftDriver\n\tat org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:292)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:261)\n\tat com.cognizant.framework.CraftDriver.waitForElementToAppear(CraftDriver.java:850)\n\tat pages.LoginPage.verifyBroadcastMessage(LoginPage.java:296)\n\tat steps.LoginSteps.i_should_see_Broadcast_Message_OK_button(LoginSteps.java:102)\n\tat ✽.And I should see Broadcast Message(/home/dhandapani/Dhandapani/mymobile_ws/MobileScript/src/test/java/features/Login.feature:26)\nCaused by: org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters. (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 478 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027dhandapani-ThinkPad-X240\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00274.2.0-30-generic\u0027, java.version: \u00271.7.0_80\u0027\n*** Element info: {Using\u003did, value\u003duk.co.o2.android.myo2.dev.debug:id/dialogbox_title}\nSession ID: 40c5ccbb-b41a-490f-ab38-1e2da51db59e\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities [{platform\u003dLINUX, javascriptEnabled\u003dtrue, appActivity\u003duk.co.o2.android.myo2.activities.SplashScreenActivity, networkConnectionEnabled\u003dtrue, udid\u003dHT59TBE00192, desired\u003d{platformVersion\u003d6.0.1, deviceName\u003dHT59TBE00192, platformName\u003dAndroid, appActivity\u003duk.co.o2.android.myo2.activities.SplashScreenActivity, udid\u003dHT59TBE00192, appPackage\u003duk.co.o2.android.myo2.dev.debug}, locationContextEnabled\u003dfalse, deviceUDID\u003dHT59TBE00192, appPackage\u003duk.co.o2.android.myo2.dev.debug, platformVersion\u003d6.0.1, databaseEnabled\u003dfalse, deviceName\u003dHT59TBE00192, platformName\u003dAndroid, webStorageEnabled\u003dfalse, warnings\u003d{}, takesScreenshot\u003dtrue}]\n\tat sun.reflect.GeneratedConstructorAccessor7.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:526)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:180)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:413)\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:899)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:41)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:205)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:201)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:238)\n\tat com.cognizant.framework.CraftDriver.waitForElementToAppear(CraftDriver.java:850)\n\tat pages.LoginPage.verifyBroadcastMessage(LoginPage.java:296)\n\tat steps.LoginSteps.i_should_see_Broadcast_Message_OK_button(LoginSteps.java:102)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:606)\n\tat cucumber.runtime.Utils$1.call(Utils.java:34)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\n\tat cucumber.runtime.Utils.invoke(Utils.java:30)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:35)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:89)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:40)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:94)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:160)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:119)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:42)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:234)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:74)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:606)\n\tat com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)\n"
});
formatter.match({
  "location": "LoginSteps.i_should_see_home_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.I_Signout()"
});
formatter.result({
  "status": "skipped"
});
});