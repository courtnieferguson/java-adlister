package dao;

import models.Product;

import.java.util.ArrayList;
import java.util.List;

public class ListProductsDao implements ProductsInterface {

    private List<Product> productsList = new ArrayList();

    public ListProductsDao() {
        insert(new Product(1, "hammer", "to hammer nails"))
        insert(new Product(2, "drill", "to drive screws in and out"))
    }

    public List<Product> all() {
        return productsList;
    }

    public void insert(Product product) {
        productsList.add(product);
    }

}
