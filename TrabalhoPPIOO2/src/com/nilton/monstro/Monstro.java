package com.nilton.monstro;

public abstract class Monstro {
    protected Integer id;
    protected String nomeMonstro;
    protected Integer pontosDeVida;
    protected String tipoResistencia;



    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Monstro{" +
                "nomeMonstro='" + nomeMonstro + '\'' +
                ", pontosDeVida=" + pontosDeVida +
                ", tipoResistencia='" + tipoResistencia + '\'' +
                '}';
    }
}
