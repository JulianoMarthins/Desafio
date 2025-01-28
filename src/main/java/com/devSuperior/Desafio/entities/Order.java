package com.devSuperior.Desafio.entities;

import org.springframework.stereotype.Service;

// Anotação para definir que esta classe será usada como serviço.
@Service
public class Order {

    // Atributos de Classe
    private Integer code;
    private Double basic;
    private Double discount;


    // Construtores da classe
    public Order(){

    }

    public Order(Integer code, Double basic, Double discount){
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    // region Getters & Setters


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    // endregion
}
