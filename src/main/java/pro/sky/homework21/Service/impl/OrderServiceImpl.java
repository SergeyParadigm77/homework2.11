package pro.sky.homework21.Service.impl;

import org.springframework.stereotype.Service;
import pro.sky.homework21.Service.Basket;
import pro.sky.homework21.Service.OrderService;

import java.util.List;
import java.util.Set;
@Service
public class OrderServiceImpl implements OrderService {
    private final Basket basket;

    public OrderServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public Set<Integer> add(List<Integer> ids) {
        return basket.add(ids);
    }

    @Override
    public Set<Integer> get() {
        return basket.get();
    }
}
