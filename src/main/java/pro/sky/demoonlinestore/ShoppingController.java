package pro.sky.demoonlinestore;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Scope(scopeName = "session")

public class ShoppingController {
    private final ShoppingService shoppingService;

    public ShoppingController(ShoppingService shoppingService) {

        this.shoppingService = shoppingService;
    }

    @RequestMapping(path = "/store/order/add")
    public String addProducts(@RequestParam("idProduct") List<Integer> idProduct) {
        shoppingService.addProducts(idProduct);
        return "Товор успешно добавлен";
    }

    @RequestMapping(path = "/store/order/get")
    public List<Integer> getProducts() {
        return shoppingService.getProducts();
    }

}
