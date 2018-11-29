package com.codeborne.selenide;

import org.openqa.selenium.WebElement;

public abstract class ConditionWithDescription extends Condition {
  public ConditionWithDescription(String name) {
    super(name);
  }

  public abstract String matchDescription(WebElement element);
}
