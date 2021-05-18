package com.nilton.partida;

import com.nilton.monstro.Dragao;
import com.nilton.monstro.Monstro;
import com.nilton.monstro.MortoVivo;
import com.nilton.monstro.Orc;
import com.nilton.util.GeradorNumero;

import java.util.ArrayList;
import java.util.Arrays;

public class Masmorra {
    private ArrayList<Monstro> filaMonstros;
    private Integer nivel;

    public Masmorra() {
        filaMonstros = new ArrayList<>();
        nivel = 1;
        criarMonstros();
    }

    public void subirDeNivel(){
        esvaziar();
        nivel++;
        criarMonstros();
    }

    private void esvaziar(){
        filaMonstros.clear();
    }

    public void mostrarFilaMonstros(){
        System.out.println(Arrays.toString(filaMonstros.toArray()));
    }

    private void criarMonstros(){
        Integer quantidadeDeMonstros = this.nivel + 3;
        for (int i = 0; i < quantidadeDeMonstros; i++){
            Integer numero = GeradorNumero.gerarNumeroAleatorio(1, 3);
            Dragao dragao = new Dragao();
            Orc orc = new Orc();
            MortoVivo mortoVivo = new MortoVivo();

            if(numero.equals(dragao.getId())){
                filaMonstros.add(dragao);
            }
            if(numero.equals(orc.getId())){
                filaMonstros.add(orc);
            }
            if(numero.equals(mortoVivo.getId())){
                filaMonstros.add(mortoVivo);
            }
        }
    }
}
