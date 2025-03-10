package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@DisplayName("Тесты для Википедии")
@Tag("mob")
public class OnbordingTests extends TestBase{
        @DisplayName("Тест на onboarding screen в приложении Википедии")
        @Test
        void gettingStartedTest() {

            FirstPage firstPage = new FirstPage();
            SecondPage secondPage = new SecondPage();
            ThirdPage thirdPage = new ThirdPage();
            FouthPage fourthPage = new FouthPage();

            firstPage.visibilityCheckOfForwardButtonOnFirstPage()
                    .clickOnForwardButtonOnFirstPage();
            secondPage.visibilityCheckOfForwardButtonOnSecondPage()
                    .clickOnForwardButtonOnSecondPage();
            thirdPage.visibilityCheckOfForwardButtonOnThirdPage()
                    .clickOnForwardButtonOnThirdPage();
            fourthPage.visibilityCheckOfDoneButtonOnFourthPage()
                    .clickOnDoneButtonOnFourthPage();

        }
}
