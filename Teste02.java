package estudos.testes;

import estudos.ModificadoresEstaticos.Anime;

public class Teste02 {
    public static void main(String[] args) throws Exception {
        Anime anime = new Anime();
        anime.setName("naruto");
        System.out.println(anime.getName());
        System.out.print(anime.getEp());
    }
}
