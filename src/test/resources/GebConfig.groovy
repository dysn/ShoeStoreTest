
import org.openqa.selenium.phantomjs.PhantomJSDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver

waiting {
	timeout = 2
}

environments {
	phantomJs {
        driver = { new PhantomJSDriver() }
    }
	htmlUnit{
		driver = {new HtmlUnitDriver()}
	}
}

baseUrl = "http://shoestore-manheim.rhcloud.com/"
