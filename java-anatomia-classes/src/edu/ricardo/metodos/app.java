package edu.ricardo.metodos;

import edu.ricardo.metodos.models.SmartTv;

public class app {
    public static void main(String[] args) {
        System.out.println();
        
        SmartTv smartTv = new SmartTv(false, 1,1);

        System.out.println(smartTv);

        System.out.println();

        smartTv.setLigada(true);
        smartTv.mudarCanal(12);
        smartTv.aumentarCanal();
        smartTv.aumentarVolume();

        System.out.println(smartTv);
    }
}
