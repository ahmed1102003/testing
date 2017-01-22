$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/HomeWork/sign_in_page.feature");
formatter.feature({
  "line": 1,
  "name": "Sign in page",
  "description": "",
  "id": "sign-in-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Sign in page",
  "description": "",
  "id": "sign-in-page;sign-in-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User at home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter qatest@qatester.com in email_address filed",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter AY in password filed",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click next-button id",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "\u0027Your Password must contain between 6 and 12 characters. Please re-enter it before continuing.\u0027 will see it \u0027//*[@id\u003d\"passwd-field\"]/div\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "testingloginsteps.user_at_home_page()"
});
formatter.result({
  "duration": 7114686571,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qatest@qatester.com",
      "offset": 8
    },
    {
      "val": "email_address",
      "offset": 31
    }
  ],
  "location": "testingloginsteps.I_enter_text_for_singin_page(String,String)"
});
formatter.result({
  "duration": 1222663289,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AY",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 14
    }
  ],
  "location": "testingloginsteps.I_enter_text_for_singin_page(String,String)"
});
formatter.result({
  "duration": 1596987744,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "next-button",
      "offset": 6
    }
  ],
  "location": "testingloginsteps.I_click_on_button(String)"
});
formatter.result({
  "duration": 1084751260,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your Password must contain between 6 and 12 characters. Please re-enter it before continuing.",
      "offset": 1
    },
    {
      "val": "//*[@id\u003d\"passwd-field\"]/div",
      "offset": 109
    }
  ],
  "location": "testingloginsteps.check_message(String,String)"
});
formatter.result({
  "duration": 60590789,
  "status": "passed"
});
});