package org.example;
import br.com.steps.insereMedias;
public class Main {
    public static void main(String[] args) {
    insereMedias medias = new insereMedias();
        medias.menu();
        medias.recebeNotas();
        medias.calculaMedia();
        medias.status();
    }
}