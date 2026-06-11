package com.example.microservico.controller;

import com.example.microservico.service.ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final ApiService apiService;

    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/status")
    public Map<String, String> status() {
        return Map.of(
                "status", apiService.getStatus(),
                "disciplina", "Sistemas Distribuídos"
        );
    }

    @GetMapping("/saudacao/{nome}")
    public Map<String, String> saudacao(@PathVariable String nome) {
        return Map.of("mensagem", apiService.gerarSaudacao(nome));
    }

    @GetMapping("/soma")
    public Map<String, Integer> soma(@RequestParam int a, @RequestParam int b) {
        return Map.of("resultado", apiService.somar(a, b));
    }
}
