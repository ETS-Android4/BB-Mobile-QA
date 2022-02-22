package app.com.mobileassignment.views

import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(
    MainActivityTestLandingUIElements::class,
    MainActivityTestSearch::class,
    MainActivityTestScrollCities::class,
    MainActivityTestCityWithSpaces::class,
    MainActivityTestwithSpecialSymbols::class,
    MainActivityTestEmojis::class,
    TestCitieswithSpecialChars::class,
    MainActivityTestSpacesBeforeAfterCity::class
)
class ActivityTestSuite