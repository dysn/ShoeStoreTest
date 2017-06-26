import geb.Module
import geb.navigator.Navigator
class MonthLinkModule extends Module{
        static content = {
            link {$("a")}
            month {link.text()}

        }
        @Override 
        Navigator click(){
            link.click(new MonthPage(month:month))
        }
    }