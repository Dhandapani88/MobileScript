$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Onboarding.feature");
formatter.feature({
  "id": "",
  "description": "As a user\nI want to uninstall and install new app",
  "name": "",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": ";uninstallation-of-old-app-and-installation-of-new-app",
  "tags": [
    {
      "name": "@dp",
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
  "name": "I uninstall old app",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "I install new app",
  "keyword": "Then ",
  "line": 8
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});