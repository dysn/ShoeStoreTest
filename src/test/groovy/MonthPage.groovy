import geb.Page

class MonthPage extends Page{

    String month;
    static at = {title == 'Shoe Store: '+month+'\'s Shoes'
                header
                //!(shoeList.shoes.isEmpty())
               // shoeList.shoes*.validate().inject(true){a,b -> a&&b}
                }
    static content ={
        header  {module ShoeStoreHeaderModule}
        shoeList {module ShoeListModule}
        
    }
    /*
    def verifyShoeList(){
        shoeList.shoes.every{
        it.brand
        verify(it.brandLink
        verify(it.name)
        verify(it.price)
        verify(it.description)
        verify(it.month)
        verify(it.monthLink)
        verify(it.image)}
    }
    */

}