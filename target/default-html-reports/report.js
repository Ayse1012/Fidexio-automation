$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/menu.feature");
formatter.feature({
  "name": "Menu",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sales Checkbox",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sales"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.fidex.stepDefinitions.LoginStepDefn.the_user_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enter \"posmanager10@info.com\" and \"posmanager\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.fidex.stepDefinitions.LoginStepDefn.the_user_enter_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user verify \"Odoo\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.fidex.stepDefinitions.LoginStepDefn.theUserVerify(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click to sales",
  "keyword": "When "
});
formatter.match({
  "location": "com.fidex.stepDefinitions.MenuStepDefn.the_user_click_to_sales()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click to checkbox",
  "keyword": "Then "
});
formatter.match({
  "location": "com.fidex.stepDefinitions.MenuStepDefn.the_user_click_to_checkbox()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//table//thead//tr//div/input\"}\n  (Session info: chrome\u003d93.0.4577.63)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-A37C2DF\u0027, ip: \u0027192.168.1.14\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.8\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 93.0.4577.63, chrome: {chromedriverVersion: 93.0.4577.15 (660fc11082ba5..., userDataDir: C:\\Users\\ayse1\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:65302}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 4a325c7974d21cfdf81497a68fe85474\n*** Element info: {Using\u003dxpath, value\u003d//table//thead//tr//div/input}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat com.fidex.stepDefinitions.MenuStepDefn.the_user_click_to_checkbox(MenuStepDefn.java:40)\r\n\tat ???.The user click to checkbox(file:///C:/Users/ayse1/IdeaProjects/Fidexio-automation/src/test/resources/features/menu.feature:36)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});