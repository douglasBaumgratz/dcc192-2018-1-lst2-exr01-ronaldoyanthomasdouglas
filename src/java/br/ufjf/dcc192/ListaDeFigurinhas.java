package br.ufjf.dcc192;


import java.util.ArrayList;
import java.util.List;


public class ListaDeFigurinhas {
    private static List<Figurinhas> figurinhas;
    
    public static List<Figurinhas> getInstance(){
        if(figurinhas == null){
            figurinhas = new ArrayList<>(); 
            figurinhas.add(new Figurinhas("01", "BRASIL"));
            figurinhas.add(new Figurinhas("02", "ARGENTINA"));
            figurinhas.add(new Figurinhas("03", "PARAGUAI"));                    
            figurinhas.add(new Figurinhas("04", "CHILE"));                    
            figurinhas.add(new Figurinhas("05", "NOVA ZELANDIA"));                    
            figurinhas.add(new Figurinhas("06", "ESTADOS UNIDOS"));                    
            figurinhas.add(new Figurinhas("07", "ALEMANHA"));                    
        }
        return figurinhas;
    }
}
