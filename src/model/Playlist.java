package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Playlist {
    private List<Musica> musicas;
    private String dono;

    public Playlist(String dono) {
        this.musicas = new ArrayList<>();
        this.dono = dono;
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void tocarMusicaAleatoria() {
        if (musicas.isEmpty()) {
            System.out.println("A playlist está vazia.");
            return;
        }

        Random random = new Random();
        int index = random.nextInt(musicas.size());
        Musica musica = musicas.get(index);
        System.out.println("Tocando música: " + musica.getNome());
    }
}



