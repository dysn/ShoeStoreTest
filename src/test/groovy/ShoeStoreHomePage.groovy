import geb.Page

class ShoeStoreHomePage extends Page {

    static at = { title == "Shoe Store: Welcome to the Shoe Store"
                header  }

    static content = {
        header {module ShoeStoreHeaderModule}
        notThere {$("h1")}
    }
}