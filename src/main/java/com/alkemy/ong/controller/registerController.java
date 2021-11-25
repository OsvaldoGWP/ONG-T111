package com.alkemy.ong.controller;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping
public class registerController {

    /*Metodo que recibe parametros de registro: nombre, apellido, mail, clave y repetir clave.
    Se marcan los atributos con RequestParam indicando que van a ser parametros de solicitud
    y este controlador los va a recibir*/

    @PostMapping("/register")
    public String register (@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email,
                            @RequestParam String passwordA, @RequestParam String passwordB){
        return "register.html";
    }

}
