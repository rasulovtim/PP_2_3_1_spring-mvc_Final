package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String getCarPage(@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Toyota", 2021, "1000000$"));
        list.add(new Car("Lexus", 2022, "2000000$"));
        list.add(new Car("Mercedes", 2023, "3000000$"));
        list.add(new Car("BMW", 2024, "4000000$"));
        list.add(new Car("Ferrari", 2025, "5000000$"));
        list = CarServiceImpl.carsCount(list, count);
        System.out.println(list);
        model.addAttribute("cars", list);
        return "cars";
    }

}
