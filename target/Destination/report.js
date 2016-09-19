$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/home/dhandapani/Dhandapani/mymobile_ws/MobileScript/src/test/java/features/Login.feature");
formatter.feature({
  "id": "",
  "description": "As a user\nI want to verify the native app screens",
  "name": "",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": ";uninstallation-of-old-app-and-installation-of-new-app",
  "tags": [
    {
      "name": "@devDone",
      "line": 5
    }
  ],
  "description": "",
  "name": "Uninstallation of old app and Installation of new App",
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
  "name": "I uninstall old app",
  "keyword": "Given ",
  "line": 8
});
formatter.step({
  "name": "I install new app",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "I Quit Driver",
  "keyword": "Then ",
  "line": 10
});
formatter.match({
  "location": "Inti.i_initialize_Appium_driver()"
});
formatter.result({
  "duration": 12591940443,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_uninstall_old_app()"
});
formatter.result({
  "duration": 3656388018,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.I_install_new_app()"
});
formatter.result({
  "duration": 19565541541,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.I_Quit_Driver()"
});
formatter.result({
  "duration": 3248280611,
  "status": "passed"
});
formatter.scenario({
  "id": ";validate-the-onboarding-screens",
  "tags": [
    {
      "name": "@devDone",
      "line": 12
    }
  ],
  "description": "",
  "name": "Validate the Onboarding Screens",
  "keyword": "Scenario",
  "line": 13,
  "type": "scenario"
});
formatter.step({
  "name": "I initialize Appium driver",
  "keyword": "Given ",
  "line": 14
});
formatter.step({
  "name": "I login to the app with \"011111012@gmail.com\"",
  "keyword": "And ",
  "line": 15
});
formatter.step({
  "name": "I enter the password as \"password\"",
  "keyword": "And ",
  "line": 16
});
formatter.step({
  "name": "I click login button",
  "keyword": "And ",
  "line": 17
});
formatter.step({
  "name": "I should enter the pin",
  "keyword": "Then ",
  "line": 18
});
formatter.step({
  "name": "I should click not now button",
  "keyword": "Then ",
  "line": 19
});
formatter.step({
  "name": "I should click ok button",
  "keyword": "Then ",
  "line": 20
});
formatter.step({
  "name": "I should see heading and sub_heading on Onboarding screens",
  "keyword": "And ",
  "line": 21,
  "rows": [
    {
      "cells": [
        "Welcome to My O2",
        "Get a summary of your data usage, latest bill and more.",
        "Skip"
      ],
      "line": 22
    },
    {
      "cells": [
        "Allowances",
        "Check your allowances and usage. Plus add Bolt Ons.",
        "Skip"
      ],
      "line": 23
    },
    {
      "cells": [
        "Your bill",
        "View your latest bill and Device Plan info. And make payments.",
        "Skip"
      ],
      "line": 24
    },
    {
      "cells": [
        "Your bill in detail",
        "Take a closer look at who you’ve been calling and texting.",
        "Skip"
      ],
      "line": 25
    },
    {
      "cells": [
        "Multiple accounts",
        "See all of your accounts in one place.",
        "Skip"
      ],
      "line": 26
    },
    {
      "cells": [
        "Offers and perks",
        "Find exclusive offers and perks, just for you.",
        "GET STARTED"
      ],
      "line": 27
    }
  ]
});
formatter.step({
  "name": "I click on Get Started Button",
  "keyword": "And ",
  "line": 28
});
formatter.step({
  "name": "I should click ok button on Broadcast Message",
  "keyword": "Then ",
  "line": 29
});
formatter.step({
  "name": "I should signout",
  "keyword": "Then ",
  "line": 30
});
formatter.match({
  "location": "Inti.i_initialize_Appium_driver()"
});
formatter.result({
  "duration": 11803826578,
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
  "duration": 5037930669,
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
  "duration": 5450016694,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_login_button()"
});
formatter.result({
  "duration": 834528871,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_enter_the_pin()"
});
formatter.result({
  "duration": 17670695597,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_click_not_now_button()"
});
formatter.result({
  "duration": 152076461,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_click_ok_button()"
});
formatter.result({
  "duration": 3176624738,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldSeeHeadingAndSub_headingOnOnboardingScreens(DataTable)"
});
formatter.result({
  "duration": 40524820354,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_Click_On_Get_Started_Button()"
});
formatter.result({
  "duration": 5176131723,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_Should_Click_Ok_Button_On_Broadcast_Message()"
});
formatter.result({
  "duration": 3150288003,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.I_should_signout()"
});
formatter.result({
  "duration": 11836072873,
  "status": "passed"
});
formatter.scenario({
  "id": ";verify-the-login-journey",
  "tags": [
    {
      "name": "@devDone",
      "line": 34
    }
  ],
  "description": "",
  "name": "Verify the login journey",
  "keyword": "Scenario",
  "line": 35,
  "type": "scenario"
});
formatter.step({
  "name": "I login to the app with \"011111012@gmail.com\"",
  "keyword": "Given ",
  "line": 37,
  "comments": [
    {
      "value": "#Given I initialize Appium driver",
      "line": 36
    }
  ]
});
formatter.step({
  "name": "I enter the password as \"password\"",
  "keyword": "And ",
  "line": 38
});
formatter.step({
  "name": "I should see \"Sign in to review your account\" on the login page",
  "keyword": "And ",
  "line": 39
});
formatter.step({
  "name": "I should see \"Forgotten log in details\" link",
  "keyword": "And ",
  "line": 40
});
formatter.step({
  "name": "I should see \"O2 Community\" link at bottom",
  "keyword": "And ",
  "line": 41
});
formatter.step({
  "name": "I should see \"O2 Gurus\" link at bottom",
  "keyword": "And ",
  "line": 42
});
formatter.step({
  "name": "I should see \"More from O2\" link at bottom",
  "keyword": "And ",
  "line": 43
});
formatter.step({
  "name": "I click login button",
  "keyword": "And ",
  "line": 44
});
formatter.step({
  "name": "I should enter the pin",
  "keyword": "Then ",
  "line": 45
});
formatter.step({
  "name": "I should see fingerprint ID Page as following",
  "keyword": "And ",
  "line": 46,
  "rows": [
    {
      "cells": [
        "Sign in faster with fingerprint ID"
      ],
      "line": 47
    },
    {
      "cells": [
        "Use fingerprint ID"
      ],
      "line": 48
    },
    {
      "cells": [
        "Not now"
      ],
      "line": 49
    }
  ]
});
formatter.step({
  "name": "I should click not now button",
  "keyword": "Then ",
  "line": 50
});
formatter.step({
  "name": "I should see fingerprint ID Messages",
  "keyword": "And ",
  "line": 51,
  "rows": [
    {
      "cells": [
        "Fingerprint ID for \"My O2\""
      ],
      "line": 52
    },
    {
      "cells": [
        "You can turn on fingerprint ID at any time by going to the main menu, choosing Settings, and selecting fingerprint ID."
      ],
      "line": 53
    }
  ]
});
formatter.step({
  "name": "I should click ok button",
  "keyword": "Then ",
  "line": 54
});
formatter.step({
  "name": "I should see the What\u0027s new information",
  "keyword": "And ",
  "line": 55,
  "rows": [
    {
      "cells": [
        "What\u0027s new",
        "Check for network issues",
        "Live Status Checker helps you keep tabs on any faults or maintenance in your area."
      ],
      "line": 56
    },
    {
      "cells": [
        "What\u0027s new",
        "Clearer bill",
        "Sync your phone contacts to see who you\u0027ve been calling and texting"
      ],
      "line": 57
    },
    {
      "cells": [
        "What\u0027s new",
        "Data Bolt Ons roll over to the next month",
        "Any unused data will be carried over to the following month."
      ],
      "line": 58
    },
    {
      "cells": [
        "What\u0027s new",
        "Low on data each month?",
        "Upgrade your tariff to a bigger bundle"
      ],
      "line": 59
    },
    {
      "cells": [
        "What\u0027s new",
        "My O2 Card Wallet",
        "Save your card details for quicker payment next time."
      ],
      "line": 60
    },
    {
      "cells": [
        "What\u0027s new",
        "O2 Wifi hotspot finder",
        "Find your nearest free O2 Wifi hotspot, and save data when you\u0027re out and about."
      ],
      "line": 61
    }
  ]
});
formatter.step({
  "name": "I close the close icon on the what\u0027s new screen",
  "keyword": "And ",
  "line": 62
});
formatter.step({
  "name": "I should see Broadcast Message",
  "keyword": "And ",
  "line": 63,
  "rows": [
    {
      "cells": [
        "Title"
      ],
      "line": 64
    },
    {
      "cells": [
        "This is a message for android 7.9.0-debug"
      ],
      "line": 65
    }
  ]
});
formatter.step({
  "name": "I should click ok button on Broadcast Message",
  "keyword": "Then ",
  "line": 66
});
formatter.step({
  "name": "I should see home screen",
  "keyword": "And ",
  "line": 67
});
formatter.step({
  "name": "I should signout",
  "keyword": "Then ",
  "line": 68
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
  "duration": 4996503304,
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
  "duration": 5357778017,
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
  "duration": 559251859,
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
  "duration": 53823329,
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
  "duration": 65443943,
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
  "duration": 51535704,
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
  "duration": 84075262,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_login_button()"
});
formatter.result({
  "duration": 372504714,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_enter_the_pin()"
});
formatter.result({
  "duration": 17322222189,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_see(DataTable)"
});
formatter.result({
  "duration": 428023203,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_click_not_now_button()"
});
formatter.result({
  "duration": 154658375,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_click_not_now_button(DataTable)"
});
formatter.result({
  "duration": 823210556,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_click_ok_button()"
});
formatter.result({
  "duration": 3163994638,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldSeeTheWhatSNewInformation(DataTable)"
});
formatter.result({
  "duration": 16993769556,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iCloseTheCloseIconOnTheWhatSNewScreen()"
});
formatter.result({
  "duration": 3147338405,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_see_Broadcast_Message(DataTable)"
});
formatter.result({
  "duration": 319059751,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_Should_Click_Ok_Button_On_Broadcast_Message()"
});
formatter.result({
  "duration": 3151668604,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_see_home_screen()"
});
formatter.result({
  "duration": 175322587,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.I_should_signout()"
});
formatter.result({
  "duration": 12941644632,
  "status": "passed"
});
});