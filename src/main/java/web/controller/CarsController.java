package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

@Controller
public class CarsController {
    CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("count", carService.getCars(count));
        return "cars";
    }

}
