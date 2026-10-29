package uz.shokhro.orderservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private static final Logger log = LoggerFactory.getLogger(OrderController.class);

    public void saveOrder(Order order) {
        //saving to database
        //send to kafka
        log.info("Order successfully saved: id={}", order.orderId());
    }
}
