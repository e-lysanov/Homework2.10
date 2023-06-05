package ru.lysanov.homework20;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class Controller {

    private final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping (path = "/plus")
    public String summ(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "<b>Отсутствуют входные значения!</b>";
        }
        return calculatorService.summ(num1, num2);
    }

    @GetMapping (path = "/minus")
    public String subtraction(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "<b>Отсутствуют входные значения!</b>";
        }
        return calculatorService.subtraction(num1, num2);
    }

    @GetMapping (path = "/multiply")
    public String multiplication(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "<b>Отсутствуют входные значения!</b>";
        }
        return calculatorService.multiplication(num1, num2);
    }

    @GetMapping (path = "/divide")
    public String divide(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "<b>Отсутствуют входные значения!</b>";
        } else if (num2 == 0) {
            return "<b>На ноль делить запрещено!</b>";
        }
        return calculatorService.divide(num1, num2);
    }
}
