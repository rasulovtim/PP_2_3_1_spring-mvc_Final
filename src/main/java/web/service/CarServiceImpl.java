package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> list;

    {
        list = new ArrayList<>();
        list.add(new Car("Toyota", 2021, "1000000$"));
        list.add(new Car("Lexus", 2022, "2000000$"));
        list.add(new Car("Mercedes", 2023, "3000000$"));
        list.add(new Car("BMW", 2024, "4000000$"));
        list.add(new Car("Ferrari", 2025, "5000000$"));
    }

    public List<Car> getCarsByCount(int number) {
        return list.stream().limit(number).collect(Collectors.toList());
    }
}
