package edu.ricardo.metodos.models;

public class SmartTv {
    private boolean ligada = false;
    private int canal = 1;
    private int volume = 1;


    public SmartTv(boolean ligada, int canal, int volume) {
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }

    

    public boolean isLigada() {
        return ligada;
    }



    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }




    public void mudarCanal(int novoCana){
        canal = novoCana;

    }
    public void aumentarCanal(){
        canal++;

    }

    public void diminuirCanal(){
        canal--;

    }



    public void aumentarVolume(){
        volume++;
    }
    public void reduzirVolume(){
        volume++;
    }

    @Override
    public String toString() {
      
        return (
            "TV Ligada: " + ligada + "\n" +
            "Canal Atual: "  + canal + "\n" +
            "Volume Atual: "  + volume
        );
    }

 

    
}
