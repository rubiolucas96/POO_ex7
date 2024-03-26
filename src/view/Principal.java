package view;


import java.util.Random;

import model.Musica;
import model.Playlist;

public class Principal {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("Eu mesmo");


        playlist.adicionarMusica(new Musica("Longe de você", "CBJR", "Sony"));
        playlist.adicionarMusica(new Musica("Muito estranho", "Nando Reis", "Sony"));
        playlist.adicionarMusica(new Musica("Pra ser sincero", "Engenheiros do Hawai", "Warner"));
        playlist.adicionarMusica(new Musica("Teatro dos vampiros", "Legião Urbana", "Warner"));

        playlist.tocarMusicaAleatoria();
    }
}



