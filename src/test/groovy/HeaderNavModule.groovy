import geb.Module
class HeaderNavModule extends Module{
        static base = {$('nav')}
        static content = {
            monthLinks {$("li")}
            

        }
        
    }