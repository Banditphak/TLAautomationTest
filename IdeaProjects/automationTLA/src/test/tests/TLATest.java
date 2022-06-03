package tests;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import pages.TLAPage;

public class TLATest extends BaseTest {
    TLAPage tlaPage;

    @BeforeMethod
    public void localSetUp(){
        tlaPage = new TLAPage(getDriver());
    }

}
