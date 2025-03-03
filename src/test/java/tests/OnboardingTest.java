package tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

import io.qameta.allure.Step;

public class OnboardingTest extends TestBase{

    @Step("Проверить заголовок первой приветственной страницы")
    public void checkFirstPageTitle() {
        $(byId("org.wikipedia.alpha:id/primaryTextView"))
                .shouldHave(text("The Free Encyclopedia\n…in over 300 languages"));
    }

    @Step("Нажать Continue на первой приветственной странице")
    public void clickFirstPageContinue() {
        $(byId("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
    }

    @Step("Проверить заголовок второй приветственной страницы")
    public void checkSecondPageTitle() {
        $(byId("org.wikipedia.alpha:id/primaryTextView"))
                .shouldHave(text("New ways to explore"));
    }

    @Step("Нажать Continue на второй приветственной странице")
    public void clickSecondPageContinue() {
        $(byId("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
    }

    @Step("Проверить заголовок третьей приветственной страницы")
    public void checkThirdPageTitle() {
        $(byId("org.wikipedia.alpha:id/primaryTextView"))
                .shouldHave(text("Reading lists with sync"));
    }

    @Step("Нажать Continue на третьей приветственной странице")
    public void clickThirdPageContinue() {
        $(byId("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
    }

    @Step("Проверить заголовок четвертой приветственной страницы")
    public void checkFourthPageTitle() {
        $(byId("org.wikipedia.alpha:id/primaryTextView"))
                .shouldHave(text("Data & Privacy"));
    }

    @Step("Нажать Get started на четвертой приветственной странице")
    public void clickFourthPageGetStarted() {
        $(byId("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
    }

    @Step("Пройти через все страницы онбординга")
    public void runOnboardingTest() {
        checkFirstPageTitle();
        clickFirstPageContinue();
        checkSecondPageTitle();
        clickSecondPageContinue();
        checkThirdPageTitle();
        clickThirdPageContinue();
        checkFourthPageTitle();
        clickFourthPageGetStarted();
    }
}
