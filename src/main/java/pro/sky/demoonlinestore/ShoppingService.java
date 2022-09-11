package pro.sky.demoonlinestore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ShoppingService implements ShoppingServiceImp{
    private final ArrayList<Integer> idProducts;

    @Autowired
    public ShoppingService(ArrayList<Integer> idProducts) {
        this.idProducts = idProducts;
    }

    @Override
    public void addProducts(Integer idProduct) {
        idProducts.add(idProduct);
    }

    @Override
    public ArrayList<Integer> getProducts() {
        return idProducts;
    }

}
