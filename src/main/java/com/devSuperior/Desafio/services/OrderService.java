package com.devSuperior.Desafio.services;

import com.devSuperior.Desafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Anotação "@Service" defini esta classe como serviço na aplicação
@Service
public class OrderService {

    // Anotação "@Autowired" é utilizada para a instanciação do objeto da classe ShippingService
    @Autowired
    private ShippingService shippingService;

    public double orderService(Order order) throws Exception {
        double discount = order.getBasic() * order.getDiscount() / 100;
        return order.getBasic() - discount + shippingService.shipment(order);

    }
}
