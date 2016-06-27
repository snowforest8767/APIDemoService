package com.cheyipai;

import com.cheyipai.model.UsedCar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

/**
 * Created by lizonglin on 2015/7/6.
 */
@RestController
 @EnableAutoConfiguration
 public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping(value = "/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping(value = "/usedCar/searchByCode/{code}")
    UsedCar searchByCode(@PathVariable(value = "code") String code) {
        return searchUsedCarByCode(code);
    }

    @RequestMapping(value = "/usedCar/add")
    UsedCar addUsedCar(
            @RequestParam(value = "code") String code,
            @RequestParam(value = "brand") String brand,
            @RequestParam(value = "level") String level,
            @RequestParam(value = "age") Integer age) {

        return new UsedCar(code, brand, age, level);
    }

    @RequestMapping(value = "/usedCar/check")
    UsedCar checkCar(@RequestParam(value = "car") UsedCar usedCar) {
        return usedCar;
    }


    public UsedCar searchUsedCarByCode(String code) {
        UsedCar usedCar = new UsedCar();
        usedCar.setCarCode(code);
        usedCar.setBrand("Toyota");
        usedCar.setLevel("80B");
        usedCar.setAge(3);

        return usedCar;
    }

}