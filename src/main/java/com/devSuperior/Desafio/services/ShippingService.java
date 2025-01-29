package com.devSuperior.Desafio.services;

import com.devSuperior.Desafio.entities.Order;
import org.springframework.stereotype.Service;

// Anotação "@Service" defini esta classe como serviço na aplicação
@Service
public class ShippingService {

    public double shipment(Order order) throws Exception {

        if (order.getBasic() <= 0){
            throw new Exception("Product value cannot be zero or negative");
        }
        if(order.getBasic() < 100){
            return 20.00;
        }
        if(order.getBasic() >= 100 && order.getBasic() < 200){
            return 12.00;
        }
        return 0.0;
    }
}
