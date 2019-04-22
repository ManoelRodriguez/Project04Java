package br.com.fatecpg.project04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BD {

    private static ArrayList<Usuario> usuariosList;

    public static ArrayList<Usuario> getUsuariosList() {
        if (usuariosList == null) {
            usuariosList = new ArrayList<>();
            Usuario u = new Usuario();
            u.setNome("Matheus");
            u.setSobrenome("Morais");
            u.setEmail("teste@teste.com");
            u.setNota(0);
            usuariosList.add(u);

            Usuario u1 = new Usuario();
            u1.setNome("Mateus");
            u1.setSobrenome("Moraes");
            u1.setEmail("teste@teste.teste");
            u1.setNota(0);
            usuariosList.add(u1);

            Usuario u2 = new Usuario();
            u2.setNome("Jorg");
            u2.setSobrenome("Ancrath");
            u2.setEmail("emperor@teste.teste");
            u2.setNota(2);
            usuariosList.add(u2);

            Usuario u3 = new Usuario();
            u3.setNome("Katherine");
            u3.setSobrenome("Ancrath");
            u3.setEmail("kat@teste.teste");
            u3.setNota(3);
            usuariosList.add(u3);

            Usuario u4 = new Usuario();
            u4.setNome("Ned");
            u4.setSobrenome("Stark");
            u4.setEmail("ned@teste.teste");
            u4.setNota(4);
            usuariosList.add(u4);

        }
        return usuariosList;
    }

    public static ArrayList<Usuario> ordenaUsuariosList() {
        List<Usuario> lista = new ArrayList<Usuario>(usuariosList);

        Collections.sort(lista, new Comparator<Usuario>() {
            @Override
            public int compare(Usuario object1, Usuario object2) {
                return object1.getNota() > object2.getNota() ? 1 : -1;

            }
        });
        Collections.reverse(lista);
        return (ArrayList<Usuario>) lista;
    }

    private static ArrayList<Usuario> usuarioslogadosList;

    public static ArrayList<Usuario> getUsuariosLogadosList() {
        if (usuarioslogadosList == null) {
            usuarioslogadosList = new ArrayList<>();

        }

        return usuarioslogadosList;
    }

    public static ArrayList<Usuario> removeUsuarioList() {
        BD.getUsuariosLogadosList().removeAll(usuarioslogadosList);
        return usuarioslogadosList;
    }

    private static ArrayList<Usuario> notasList;

    public static ArrayList<Usuario> getNotasList() {
        if (notasList == null) {
            notasList = new ArrayList<>();
            Usuario n = new Usuario();
            n.setNome("Matheus");
            n.setSobrenome("Morais");
            n.setEmail("teste@yahoo.com");
            n.setNota(1);
            notasList.add(n);

        }
        return notasList;
    }
    
    private static ArrayList<Usuario> mediaList;
    
    public static ArrayList<Usuario> getMediaList(){
        if(mediaList == null){
            mediaList = new ArrayList();
            Usuario n = new Usuario();
            n.setMedia(0);
            mediaList.add(n);
        }
        return mediaList;
    }
        
    
}
