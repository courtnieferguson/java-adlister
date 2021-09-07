package dao;

public class DaoFactory {
    private static ProductsInterface productsDao;
    //ProductsDao is a list

    public static ProductsInterface getProductsDao(){

        // Check to see if a products Data access object already exists
        if (productsDao == null){
            //if the productDao is null its because it hasnt been initialized so we need to initialize it
            productsDao = new ListProductsDao();
        }

        return productsDao;
    }

}
