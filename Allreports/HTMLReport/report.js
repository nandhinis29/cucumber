$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Featurefiles/Forgettenpass.feature");
formatter.feature({
  "name": "",
  "description": "To validate forgotten password functionality of facebook Application",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate forgotten password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have to click the forgotten password",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefenition1.user_have_to_click_the_forgotten_password()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[text()\u003d\u0027Forgotten password\u0027]\"}\n  (Session info: chrome\u003d100.0.4896.75)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-EID0POV\u0027, ip: \u0027192.168.29.91\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_311\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 100.0.4896.75, chrome: {chromedriverVersion: 100.0.4896.60 (6a5d10861ce8..., userDataDir: C:\\Users\\LOGESH\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:61302}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: e2e1df2ecc5f6f00db4f4fc56de71be8\n*** Element info: {Using\u003dxpath, value\u003d//a[text()\u003d\u0027Forgotten password\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat org.baseclass.BaseClass.btnClick(BaseClass.java:70)\r\n\tat org.stepdefenition1.Stepdefenition1.user_have_to_click_the_forgotten_password(Stepdefenition1.java:21)\r\n\tat ✽.User have to click the forgotten password(file:src/test/resources/Featurefiles/Forgettenpass.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User have to enter email or mobileno",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefenition1.user_have_to_enter_email_or_mobileno()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to click the search button",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefenition1.user_have_to_click_the_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Featurefiles/Login.feature");
formatter.feature({
  "name": "To validate Login functionality of facebook Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate Login using Invalid username and invalid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user have to enter Invalid username and invalid password",
  "rows": [
    {
      "cells": [
        "username",
        "nandhini"
      ]
    },
    {
      "cells": [
        "email",
        "selenium123@gmail.com"
      ]
    },
    {
      "cells": [
        "password",
        "978887525"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefenition1.user_have_to_enter_Invalid_username_and_invalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefenition1.user_Click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be in invalid Credentials page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefenition1.user_should_be_in_invalid_Credentials_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate Login using invalid username and valid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user have to enter Invalid username and valid password",
  "rows": [
    {
      "cells": [
        "username",
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "selenium",
        "selenium123@gmail.com",
        "9788875325"
      ]
    },
    {
      "cells": [
        "java",
        "java213@gmail.cpm",
        "9876867657"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefenition1.user_have_to_enter_Invalid_username_and_valid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefenition1.user_Click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be in invalid Credentials page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefenition1.user_should_be_in_invalid_Credentials_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});