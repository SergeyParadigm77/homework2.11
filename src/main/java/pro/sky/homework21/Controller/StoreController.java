package pro.sky.homework21.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework21.Service.OrderService;


import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class StoreController {

    private final OrderService orderService;

    public StoreController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public Set<Integer> add(@RequestParam List<Integer> ids) {
        return orderService.add(ids);
    }
    @GetMapping("/get")
    public Set<Integer> get() {
        return orderService.get();
    }

}
