import geb.junit4.GebReportingTest
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters


@RunWith(Parameterized.class)
class MonthPagesTest extends GebReportingTest {
   @Parameters
    public static Iterable<? extends Object> data() {
        return ['January','February','March','April','May','June'
        ,'July','August','September','October','November','December'];
    }
    public MonthPagesTest(String month){
        this.month = month
    }
    String month
    
    @Test
    void testMonth() {
        to ShoeStoreHomePage
        header.nav.monthLinks.$('li a',text:month).parent().module(MonthLinkModule).click()
        //verify !(shoeList.isEmpty())
        at (new MonthPage(month: month))
        assert !(shoeList.shoes.isEmpty())
        for (sh in shoeList.shoes){
            //System.out.println("image: ${sh.img}")
            assert !(sh.description.isEmpty())
            assert !(sh.price.isEmpty())

            assert (sh.image.endsWith(".jpg"))

        }
    }
    
    

    

}