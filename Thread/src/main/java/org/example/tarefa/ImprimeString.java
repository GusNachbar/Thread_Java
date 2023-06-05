package org.example.tarefa;

public class ImprimeString implements Runnable {

    private String textoParaImprimir;

    public ImprimeString(String textoParaImprimir) {
        this.textoParaImprimir = textoParaImprimir;
    }

    @Override
    public void run() {
        System.out.println(textoParaImprimir);
    }
}
