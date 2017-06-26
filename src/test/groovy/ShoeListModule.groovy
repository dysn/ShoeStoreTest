import geb.Module

class ShoeListModule extends Module{
    static base = {$('ul', id:'shoe_list')}
    static content = {
        shoes  {$('li').moduleList(ShoeResultModule)}
    }
}