package pro.sky.demoonlinestore;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ShoppingController {
    private final ShoppingService shoppingService;

    public ShoppingController(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    @RequestMapping(path = "/store/order/add")
    public String addProducts(@RequestParam("idProduct") Integer idProduct) {
        shoppingService.addProducts(idProduct);
        return "Товор успешно добавлен";
    }

    @RequestMapping(path = "/store/order/get")
    public ArrayList<Integer> getProducts() {
        return shoppingService.getProducts();
    }

}
