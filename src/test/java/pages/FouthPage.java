package pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

import com.codeborne.selenide.SelenideElement;

import io.qameta.allure.Step;

public class FouthPage {

    SelenideElement doneButton =
            $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button"));

    @Step("Проверка видимости кнопки Начать на четвертой странице")
    public FouthPage visibilityCheckOfDoneButtonOnFourthPage(){
        doneButton.shouldBe(visible);
        return this;
    }

    @Step("Нажатие на кнопку Начать на четвертой странице")
    public FouthPage clickOnDoneButtonOnFourthPage(){
        doneButton.click();
        return this;
    }

}
