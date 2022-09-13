package pro.sky.demoonlinestore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope(scopeName = "session")
public class ShoppingService implements ShoppingServiceImp{
    private final List<Integer> idProducts = new ArrayList<>();

    @Override
    public void addProducts(List<Integer> idProduct) {
        idProducts.addAll(idProduct);
    }

    @Override
    public List<Integer> getProducts() {
        return idProducts;
    }

}
