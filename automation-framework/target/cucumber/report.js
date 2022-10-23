$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/cucumber/features/Shop.feature");
formatter.feature({
  "line": 1,
  "name": "Search for Products",
  "description": "As a user, I want to search the catalog so that I can find specific products",
  "id": "search-for-products",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Click search result",
  "description": "",
  "id": "search-for-products;click-search-result",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "there is a product with  named PINK in the shop",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search for the product in the shop",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click in the first product in the shop",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should be price to the product of 15.00",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "PINK",
      "offset": 31
    }
  ],
  "location": "ShopStepDefs.thereIsAProductWithNamedPINKDROPSHOULDEROVERSIZEDTSHIRT(String)"
});
formatter.result({
  "duration": 185762700,
  "status": "passed"
});
formatter.match({
  "location": "ShopStepDefs.iSearchForTheProductInTheShop()"
});
formatter.result({
  "duration": 896548900,
  "status": "passed"
});
formatter.match({
  "location": "ShopStepDefs.iClickTheProductInTheShop()"
});
formatter.result({
  "duration": 1457939000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "15.00",
      "offset": 36
    }
  ],
  "location": "ShopStepDefs.iShouldBeTakenToTheProductPageInTheShop(String)"
});
formatter.result({
  "duration": 66504800,
  "status": "passed"
});
});