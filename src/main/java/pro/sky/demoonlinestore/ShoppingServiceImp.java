package pro.sky.demoonlinestore;

import java.util.ArrayList;
import java.util.List;

public interface ShoppingServiceImp {
    void addProducts(List<Integer> idProduct);

    List<Integer> getProducts();
}
