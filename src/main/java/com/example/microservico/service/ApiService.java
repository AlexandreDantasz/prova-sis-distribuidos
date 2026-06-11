package com.example.microservico.service;

import org.springframework.stereotype.Service;

@Service
public class ApiService {

    public String getStatus() {
        return "online";
    }

    public String gerarSaudacao(String nome) {
        return "Olá, " + nome + ". Bem-vindo ao microserviço!"
    }

    public int somar(int a, int b) {
        return a + b;
    }
}
