import geb.junit4.GebReportingTest
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4)
class EmailFormTest extends GebReportingTest{
    @Test
    void testEmailForm(){
        to ShoeStoreHomePage
        header.remindText << 'test@email.com'
        header.remindButton.click()
        assert $('div',class:'flash notice').text() == 'Thanks! We will notify you of our new shoes at this email: test@email.com'
    }
}
