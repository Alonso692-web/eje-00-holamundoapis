package com.upiiz.holamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Anotaciones - Decoraciones
@RestController
public class HolaMundoController {

    @GetMapping("/holamundo")
    public String holaMundo(){
        return "Hola Mundo de las APIs con el método Get";
    }

    @GetMapping("/holamundodos")
    public String holMundodos(){
        return "Hola Mundo Dos con el método Get";
    }

}
