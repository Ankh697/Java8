package com.zawadzki.demo.model.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String name;
    private String model;
    private String color;
    private BigDecimal price;
    private Long milage;
    private LocalDateTime prodactionDate = LocalDateTime.now();
    private LocalDateTime saleDate = LocalDateTime.now().plusDays(30);

 /*   public Car(String name, String model, String color, BigDecimal price, Long milage) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.price = price;
        this.milage = milage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getMilage() {
        return milage;
    }

    public void setMilage(Long milage) {
        this.milage = milage;
    }

    public Car()
    {}
*/

}


