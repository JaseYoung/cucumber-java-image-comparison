$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Register.feature");
formatter.feature({
  "line": 1,
  "name": "Load up shop.lego.com and verify logo",
  "description": "as a content manager\nI want to show the lego shop logo\nso that people know the site they are on",
  "id": "load-up-shop.lego.com-and-verify-logo",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "verify lego logo on page",
  "description": "",
  "id": "load-up-shop.lego.com-and-verify-logo;verify-lego-logo-on-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I am on the lego website \"\u003clocale\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I capture element \"shop_logo\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "load-up-shop.lego.com-and-verify-logo;verify-lego-logo-on-page;",
  "rows": [
    {
      "cells": [
        "locale"
      ],
      "line": 12,
      "id": "load-up-shop.lego.com-and-verify-logo;verify-lego-logo-on-page;;1"
    },
    {
      "cells": [
        "en-GB"
      ],
      "line": 13,
      "id": "load-up-shop.lego.com-and-verify-logo;verify-lego-logo-on-page;;2"
    },
    {
      "cells": [
        "ko-KR"
      ],
      "line": 14,
      "id": "load-up-shop.lego.com-and-verify-logo;verify-lego-logo-on-page;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2379946856,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "verify lego logo on page",
  "description": "",
  "id": "load-up-shop.lego.com-and-verify-logo;verify-lego-logo-on-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I am on the lego website \"en-GB\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I capture element \"shop_logo\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "en-GB",
      "offset": 26
    }
  ],
  "location": "HomepageStepDefinition.iAmOnTheLegoWebsiteLocale(String)"
});
formatter.result({
  "duration": 2250228640,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shop_logo",
      "offset": 19
    }
  ],
  "location": "SearchStepDefinition.iCaptureElement(String)"
});
formatter.result({
  "duration": 778901368,
  "error_message": "java.lang.Exception: Images are not the same, after Comparison match level \u003d 0.0% -- please look at the page: ******** For details.\n\tat Helpers.ImageComparisonHelper.compareElementOnPage(ImageComparisonHelper.java:28)\n\tat StepDefinitions.SearchStepDefinition.iCaptureElement(SearchStepDefinition.java:17)\n\tat ✽.Then I capture element \"shop_logo\"(features/Register.feature:9)\n",
  "status": "failed"
});
formatter.write("Current Page URL is http://shop.lego.com/en-GB/");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 372633097,
  "status": "passed"
});
formatter.after({
  "duration": 570595265,
  "status": "passed"
});
formatter.before({
  "duration": 1656917145,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "verify lego logo on page",
  "description": "",
  "id": "load-up-shop.lego.com-and-verify-logo;verify-lego-logo-on-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I am on the lego website \"ko-KR\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I capture element \"shop_logo\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ko-KR",
      "offset": 26
    }
  ],
  "location": "HomepageStepDefinition.iAmOnTheLegoWebsiteLocale(String)"
});
formatter.result({
  "duration": 2044260901,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shop_logo",
      "offset": 19
    }
  ],
  "location": "SearchStepDefinition.iCaptureElement(String)"
});
formatter.result({
  "duration": 591191710,
  "error_message": "java.lang.Exception: Images are not the same, after Comparison match level \u003d 0.0% -- please look at the page: ******** For details.\n\tat Helpers.ImageComparisonHelper.compareElementOnPage(ImageComparisonHelper.java:28)\n\tat StepDefinitions.SearchStepDefinition.iCaptureElement(SearchStepDefinition.java:17)\n\tat ✽.Then I capture element \"shop_logo\"(features/Register.feature:9)\n",
  "status": "failed"
});
formatter.write("Current Page URL is http://shop.lego.com/ko-KR/");
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 263579573,
  "status": "passed"
});
formatter.after({
  "duration": 567408240,
  "status": "passed"
});
});