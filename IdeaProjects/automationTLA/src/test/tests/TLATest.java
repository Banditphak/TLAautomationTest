package tests;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import pages.TLAPage;

public class TLATest extends BaseTest {
    TLAPage tlaPage;

    @BeforeMethod
    public void localSetUp() {
        tlaPage = new TLAPage(getDriver());
    }

    @DataProvider(name = "firstList")
    public Object[] data() {

        Object[] data = {"Home", "Curriculum", "Notes", "Selectors", "Select-class", "Alert", "Pop-Up", "Multiple-window", "Tables"};
        return data;
    }

    @DataProvider(name = "secondList")
    public Object[] data2() {
        Object[] data2 = {"Calendar", "iFrames", "Action-class", "JS-Executor", "Synchronization", "Files", "User-Mgt", "Others"};
        return data2;
    }

    @DataProvider(name = "bottomList")
    public Object[] data3() {
        Object[] data3 = {"PHP Travels", "Mercury tours", "Internet", "E-commerce", "Passion Tea Company", "Saucedemo", "Shopping Cart"};
        return data3;
    }
}
