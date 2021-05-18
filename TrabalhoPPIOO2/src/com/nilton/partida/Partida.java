package com.nilton.partida;

import com.nilton.aventureiro.Aventureiro;
import com.nilton.aventureiro.Druida;
import com.nilton.aventureiro.Guerreiro;
import com.nilton.aventureiro.Mago;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Partida {
    private Integer qtdeAventureiros = 10;
    private ArrayList<Aventureiro> listaAventureiro;

    public Partida() {
        listaAventureiro = new ArrayList<>();
        montarEquipe();
    }

    public void mostrarListaAventureiros(){
        System.out.println(Arrays.toString(listaAventureiro.toArray()));
    }

    public void montarEquipe(){
        Scanner ler= new Scanner(System.in);
        for(int i=0; i<qtdeAventureiros; i++){
            Integer opcao;
            System.out.println("Qual aventureiro você gostaria de adicionar na sua equipe?:");
            System.out.println("1) Mago");
            System.out.println("2) Guerreiro");
            System.out.println("3) Druida");
            System.out.println("Numero máximo de aventureiros: " + qtdeAventureiros);
            System.out.println("Numero de aventureiros já escolhido: "+i);
            System.out.print("R: ");
            opcao=ler.nextInt();
            switch(opcao){
                case 1:
                    Mago membroMago = new Mago();// como q faço p sempre criar mais pessoa?
                    listaAventureiro.add(membroMago);
                    break;
                case 2:
                    Guerreiro membroGuerreiro = new Guerreiro();
                    listaAventureiro.add(membroGuerreiro);
                    break;
                case 3:
                    Druida membroDruida = new Druida();
                    listaAventureiro.add(membroDruida);
                    break;
            }

        }
    }
}
