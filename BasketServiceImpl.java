package skypro.spring.demo.service;

import org.springframework.stereotype.Service;
import skypro.spring.demo.repository.Basket;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {
    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void add(List<Long> items) {
        items.forEach(item -> basket.add(item));
    }

    @Override
    public List<Long> get() {
        return null;
    }
}
