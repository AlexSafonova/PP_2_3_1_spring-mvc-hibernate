package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "Black", 2015));
        cars.add(new Car("Mercedes", "White", 2010));
        cars.add(new Car("Audi", "Blue", 2005));
        cars.add(new Car("Skoda", "Red", 2019));
        cars.add(new Car("Toyota", "Green", 2020));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
