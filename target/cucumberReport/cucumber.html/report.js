$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginPage.feature");
formatter.feature({
  "line": 2,
  "name": "Validate Login page",
  "description": "",
  "id": "validate-login-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 44,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "validate-login-page;successful-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 43,
      "name": "@Login-5"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "the user visits the login page \"https://www.saucedemo.com/\" of the application website",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "User enters mandatory details of \"\u003cTestCase\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "the user press Login button",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "the user can accessing to the products page",
  "keyword": "Then "
});
formatter.examples({
  "line": 49,
  "name": "",
  "description": "",
  "id": "validate-login-page;successful-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "TestCase"
      ],
      "line": 50,
      "id": "validate-login-page;successful-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "Case1"
      ],
      "line": 51,
      "id": "validate-login-page;successful-login-with-valid-credentials;;2"
    },
    {
      "cells": [
        "Case2"
      ],
      "line": 52,
      "id": "validate-login-page;successful-login-with-valid-credentials;;3"
    },
    {
      "cells": [
        "Case3"
      ],
      "line": 53,
      "id": "validate-login-page;successful-login-with-valid-credentials;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3261416049,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "validate-login-page;successful-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 43,
      "name": "@Login-5"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "the user visits the login page \"https://www.saucedemo.com/\" of the application website",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "User enters mandatory details of \"Case1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "the user press Login button",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "the user can accessing to the products page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/",
      "offset": 32
    }
  ],
  "location": "ValidateLoginSteps.theUserVisitsTheLoginPageOfTheApplicationWebsite(String)"
});
formatter.result({
  "duration": 744761316,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Case1",
      "offset": 34
    }
  ],
  "location": "ValidateLoginSteps.userEntersMandatoryDetailsOf(String)"
});
formatter.result({
  "duration": 583354727,
  "status": "passed"
});
formatter.match({
  "location": "ValidateLoginSteps.theUserPressLoginButton()"
});
formatter.result({
  "duration": 1263117343,
  "status": "passed"
});
formatter.match({
  "location": "ValidateLoginSteps.theUserCanAccessingToTheProductsPage()"
});
formatter.result({
  "duration": 5035735166,
  "status": "passed"
});
formatter.after({
  "duration": 134781993,
  "status": "passed"
});
formatter.before({
  "duration": 1547297812,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "validate-login-page;successful-login-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 43,
      "name": "@Login-5"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "the user visits the login page \"https://www.saucedemo.com/\" of the application website",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "User enters mandatory details of \"Case2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "the user press Login button",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "the user can accessing to the products page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/",
      "offset": 32
    }
  ],
  "location": "ValidateLoginSteps.theUserVisitsTheLoginPageOfTheApplicationWebsite(String)"
});
formatter.result({
  "duration": 575620228,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Case2",
      "offset": 34
    }
  ],
  "location": "ValidateLoginSteps.userEntersMandatoryDetailsOf(String)"
});
formatter.result({
  "duration": 220779096,
  "status": "passed"
});
formatter.match({
  "location": "ValidateLoginSteps.theUserPressLoginButton()"
});
formatter.result({
  "duration": 66875826,
  "status": "passed"
});
formatter.match({
  "location": "ValidateLoginSteps.theUserCanAccessingToTheProductsPage()"
});
formatter.result({
  "duration": 35055964475,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\".product_label\"}\n  (Session info: MicrosoftEdge\u003d83.0.478.37)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027EN2010172.local\u0027, ip: \u0027fe80:0:0:0:808:9dd9:5d5e:7309%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.edge.EdgeDriver\nCapabilities {acceptInsecureCerts: false, browserName: msedge, browserVersion: 83.0.478.37, javascriptEnabled: true, ms:edgeOptions: {debuggerAddress: localhost:64391}, msedge: {msedgedriverVersion: 83.0.478.37 (7feb1dfc5bdafe..., userDataDir: /var/folders/w3/qgyy62_s3xs...}, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 25661b2f6f243fd996f666fafd9aee96\n*** Element info: {Using\u003dclass name, value\u003dproduct_label}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByClassName(RemoteWebDriver.java:457)\n\tat org.openqa.selenium.By$ByClassName.findElement(By.java:391)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy24.getText(Unknown Source)\n\tat actions.ProductsPageActions.getProductsPageTitle(ProductsPageActions.java:33)\n\tat steps.ValidateLoginSteps.theUserCanAccessingToTheProductsPage(ValidateLoginSteps.java:48)\n\tat ✽.Then the user can accessing to the products page(LoginPage.feature:48)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 709913752,
  "status": "passed"
});
formatter.before({
  "duration": 1593340623,
  "status": "passed"
});
formatter.scenario({
  "line": 53,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "validate-login-page;successful-login-with-valid-credentials;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 43,
      "name": "@Login-5"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "the user visits the login page \"https://www.saucedemo.com/\" of the application website",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "User enters mandatory details of \"Case3\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "the user press Login button",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "the user can accessing to the products page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/",
      "offset": 32
    }
  ],
  "location": "ValidateLoginSteps.theUserVisitsTheLoginPageOfTheApplicationWebsite(String)"
});
formatter.result({
  "duration": 539174420,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Case3",
      "offset": 34
    }
  ],
  "location": "ValidateLoginSteps.userEntersMandatoryDetailsOf(String)"
});
formatter.result({
  "duration": 236158309,
  "status": "passed"
});
formatter.match({
  "location": "ValidateLoginSteps.theUserPressLoginButton()"
});
formatter.result({
  "duration": 1321580074,
  "status": "passed"
});
formatter.match({
  "location": "ValidateLoginSteps.theUserCanAccessingToTheProductsPage()"
});
formatter.result({
  "duration": 5033575216,
  "status": "passed"
});
formatter.after({
  "duration": 124259565,
  "status": "passed"
});
});