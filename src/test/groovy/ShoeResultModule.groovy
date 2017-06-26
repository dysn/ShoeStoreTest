import geb.Module

class ShoeResultModule extends Module{
    static at = {}
    static base = {$('table')}
    static content = {
        rows {$('tr')}
        brand{$('td',class:'shoe_result_value shoe_brand').$('a').text()}
        brandLink{$('td',class:'shoe_result_value shoe_brand').$('a').@href}

        name{$('td',class:'shoe_result_value shoe_name').text()}
        price{$('td',class:'shoe_result_value shoe_price').text()}
        description{$('td',class:'shoe_result_value shoe_description').text()}
        month{$('td',class:'shoe_result_value shoe_release_month').$('a').text()}
        monthLink{$('td',class:'shoe_result_value shoe_release_month').$('a').@href}
        image{$('td',class:'shoe_image').$('img').@src}


    }
    boolean validate(){
        brand!=null  && brandLink!=null && !(image.isEmpty())  && name!=null && price !=null && description!=null && month!=null   
        /*
        verify(brandLink)
        verify(name)
        verify(price)
        verify(description)
        verify(month)
        verify(monthLink)
        verify(image)
        */
    }
}