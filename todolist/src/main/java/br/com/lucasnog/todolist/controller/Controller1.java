package br.com.lucasnog.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
public class Controller1 {

    @GetMapping("")
    public String primeiraMensagem() {
        return "Deu certo.";
    }

}
