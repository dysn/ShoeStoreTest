import geb.Module
import geb.navigator.Navigator

class ShoeStoreHeaderModule extends Module{
    static base ={ $("header")}
    static content = {
        nav  {module HeaderNavModule}
        allShoesLink {$("a", href:'/shoes')}
        remindForm {$("form",action:'/remind')}
        promoForm {$("form",action:'/promo')}

    }
    
    
}