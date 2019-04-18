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
        teste.add(new Question("Quanto é: 10+10","20", new String[]{"19","21","Nenhuma","20"}));
        teste.add(new Question("Quanto é: 10+9","19", new String[]{"Nenhuma","18","20","19"}));
        teste.add(new Question("Quanto é: 10+8","18", new String[]{"19","Nenhuma","17","18"}));
        teste.add(new Question("Quanto é: 10+7","17", new String[]{"18","3","Nenhuma","17"}));
        teste.add(new Question("Quanto é: 10+6","16", new String[]{"4","Nenhuma","15","16"}));
        teste.add(new Question("Quanto é: 10+5","15", new String[]{"Nenhuma","16","14","15"}));
        teste.add(new Question("Quanto é: 10+4","14", new String[]{"14","15","Nenhuma","6"}));
        teste.add(new Question("Quanto é: 10+3","13", new String[]{"14","Nenhuma","7","13"}));
        teste.add(new Question("Quanto é: 10+2","12", new String[]{"10","Nenhuma","8","12"}));
        teste.add(new Question("Quanto é: 10+1","11", new String[]{"Nenhuma","12","9","11"}));
        Collections.shuffle(teste);
        return teste;
    }
    
}
