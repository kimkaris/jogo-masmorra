package com.nilton.util;

public class GeradorNumero {
    public static Integer gerarNumeroAleatorio(Integer min, Integer max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
}
