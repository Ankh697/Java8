package com.zawadzki.demo.model;

import com.zawadzki.demo.model.model.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class Java8Application {

    public static void main(String[] args) {
        SpringApplication.run(Java8Application.class, args);

        for (Car c : cars()) {
            System.out.println(c);
        }

        System.out.println("Color filter");
        System.out.println(cars().stream().filter(c -> c.getColor().equals("Black")).collect(Collectors.toList()));

        System.out.println("Price filter");
        System.out.println(cars().stream().filter(c -> c.getPrice() != null).collect(Collectors.toList()));

        System.out.println("Price filter");
        System.out.println(cars().stream().filter(c -> c.getPrice().compareTo(BigDecimal.valueOf(150000)) > 0).collect(Collectors.toList()));

        System.out.println("Price filter");
        System.out.println(cars().stream().filter(c -> BigDecimal.valueOf(150000).compareTo(c.getPrice()) < 0).collect(Collectors.toList()));

        System.out.println("Sorted cars by price");
        System.out.println(cars().stream().sorted(((o1, o2) -> o1.getPrice().compareTo(o2.getPrice()))).collect(Collectors.toList()));

        System.out.println("Sorted cars by price");
        System.out.println(cars().stream().sorted((Comparator.comparing(Car::getPrice))).collect(Collectors.toList()));

        System.out.println("Car with the highest price");
        System.out.println(cars().stream().max(Comparator.comparing(Car::getPrice)).orElseThrow(NoSuchElementException::new));

        System.out.println("Car with the lowest price");
        System.out.println(cars().stream().min(Comparator.comparing(Car::getPrice)).orElseThrow(NoSuchElementException::new));

        isPalindrom();

        Set<Car> carSet = cars().stream().collect(Collectors.toSet());

        for (Car c : carSet) {
            System.out.println(c);
        }

        //System.out.println(cars().sort(Comparator.comparing(Car::getColor)));


    }

    public static List<String> populateList() {
        List<String> list = new ArrayList<>();
        list.add("listval1");
        list.add("listval2");
        list.add("listval3");
        list.add("listval1");
        list.add("listval2");
        list.add("listval4");
        return list;
    }

    public static List<Car> cars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Audi", "A5", "Black", new BigDecimal(150000), 120000L, LocalDateTime.now(), LocalDateTime.now().plusDays(30)));
        carList.add(new Car("Audi", "A3", "Red", new BigDecimal(120000), 12222L, LocalDateTime.now(), LocalDateTime.now().plusDays(30)));
        carList.add(new Car("Audi", "A5", "Green", new BigDecimal(240000), 120000L, LocalDateTime.now(), LocalDateTime.now().plusDays(30)));
        carList.add(new Car("Audi", "A7", "Grey", new BigDecimal(250000), 44455L, LocalDateTime.now(), LocalDateTime.now().plusDays(30)));
        carList.add(new Car("Audi", "A6", "Brown", new BigDecimal(350000), 21222L, LocalDateTime.now(), LocalDateTime.now().plusDays(30)));
        carList.add(new Car("Audi", "A4", "Blue", new BigDecimal(420000), 12222L, LocalDateTime.now(), LocalDateTime.now().plusDays(30)));
        carList.add(new Car("Audi", "A4", "Blue", new BigDecimal(420000), 12222L, LocalDateTime.now(), LocalDateTime.now().plusDays(30)));
        carList.add(new Car("Audi", "A4", "Blue", new BigDecimal(420000), 12222L, LocalDateTime.now(), LocalDateTime.now().plusDays(30)));
        return carList;
    }

    public static void isPalindrom()
    {

        String string = "ZBYSZEK";

        if(string.equals(new StringBuilder(string).reverse().toString()))
        {
            System.out.println("Is Palindrom");
        }
        else
        {
            System.out.println("This is not palindrom");
        }

    }


}
