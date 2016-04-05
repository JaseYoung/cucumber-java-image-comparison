Feature: Load up shop.lego.com and verify logo
  as a content manager
  I want to show the lego shop logo
  so that people know the site they are on


  Scenario Outline: verify lego logo on page
    Given I am on the lego website "<locale>"
    Then I capture element "shop_logo"

    Examples:
      | locale |
      | en-GB  |
      | ko-KR  |