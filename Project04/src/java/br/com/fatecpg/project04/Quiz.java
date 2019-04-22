/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.project04;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Casa
 */
public class Quiz {
    
    public static ArrayList<Question> getMathTest(){
        ArrayList<Question> teste = new ArrayList<>();
        teste.add(new Question("Qual é a resposta de todas as coisas","42", new String[]{"Não sei mano.","42","Nada tem sentido, a vida é horrível","4:20"}));
        teste.add(new Question("O homem que dita a sentença deve...","brandir a espada.", new String[]{"brandir a espada.","ditar a sentença ué.","falar.","ter poder."}));
        teste.add(new Question("O que dizemos ao Deus da Morte","Hoje não", new String[]{"Eu saio correndo e é isso ai","Vou morrer?","Hoje não","Hoje simmmm"}));
        teste.add(new Question("Naruto é ruim","Anime é ruim", new String[]{"?","Anime é ruim","Não","Sim"}));
        teste.add(new Question("Quando você joga o jogo dos tronos, ...","você ganha ou morre.", new String[]{"você joga ele ué.","você ganha ou morre.","você perde ou ganha.","você morre."}));
        teste.add(new Question("O Teferi...","TEM QUE SER DELETADO DO JOGO.", new String[]{"é uma boa carta.","é um planeswalker Golgari.","TEM QUE SER DELETADO DO JOGO.","é o Teferi."}));
        teste.add(new Question("Hodor","Hodor!", new String[]{"Hodor.","Hodor!","Holdthedoor","Bran"}));
        teste.add(new Question("Valar Morghulis.","Valar Dohaeris.", new String[]{"Valar Dohaeris.","Vallar Dohaeris","Homem sem rosto","Valar Morghulis"}));
        teste.add(new Question("Capitão America vai morrer no Ultimato","Claro né, #TeamIronMan", new String[]{"Thanos vai morrer","Não","Claro né, #TeamIronMan","Sim"}));
        teste.add(new Question("Press F to pay respescts, RIP Gideon","F 'I'll keep watch'", new String[]{":c","MonoBlack>WhiteWinnie","#TeamNicol","F 'I'll keep watch'"}));
        Collections.shuffle(teste);
        
        return teste;
    }
    
}
