package dao;

import models.Product;
import java.util.List;

public interface ProductsInterface {

    List<Product> all();

    void insert(Product product);

}
