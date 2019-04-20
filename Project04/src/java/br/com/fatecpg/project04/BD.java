package br.com.fatecpg.project04;

import java.util.ArrayList;

/**
 *
 * @author Manoel Rodriguez
 */
public class BD {
    private static ArrayList<Usuario> usuariosList;
    
     public static ArrayList<Usuario> getUsuariosList(){
         if(usuariosList == null){
             usuariosList = new ArrayList<>();
            Usuario u = new Usuario();
            u.setNome("Matheus");
            u.setSobrenome("Morais");
            u.setEmail("teste@teste.com");

            usuariosList.add(u);
             
             
         }
         return usuariosList;
     }
     private static ArrayList<Usuario> notasList;

    public static ArrayList<Usuario> getNotasList() {
        if (notasList == null) {
            notasList = new ArrayList<>();
            Usuario n = new Usuario();
            n.setNome("Matheus");
            n.setSobrenome("Morais");
            n.setEmail("teste@yahoo.com");
            notasList.add(n);

        }
        return notasList;
    }
}
