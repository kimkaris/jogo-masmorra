package com.nilton.aventureiro;

public abstract class Aventureiro {
    protected Integer id;
    protected String nomeAventureiro;
    protected Integer alcance;
    protected Integer dano;
    protected String tipoDano;

    @Override
    public String toString() {
        return "Aventureiro{" +
                "nomeAventureiro='" + nomeAventureiro + '\'' +
                ", alcance=" + alcance +
                ", dano=" + dano +
                ", tipoDano='" + tipoDano + '\'' +
                '}';
    }
}
