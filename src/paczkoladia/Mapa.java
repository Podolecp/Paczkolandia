/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paczkoladia;

import java.io.*;
import java.util.*;
/**
 *
 * @author Piotr
 */
public class Mapa {
    
    private String[] miasta = new String[1000]; //?jakaś optymalizacja
    private int[][] polaczenia = new int[1000][1000];
    private int nr = 0;
    
    Mapa() throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("mapa.txt");
        BufferedReader br = new BufferedReader(fr);
        String linia = br.readLine();
        if(linia.equals("# miasta")){
            while((linia = br.readLine()) != null && !linia.equals("# polaczenia") && !linia.equals("")){
                String[] sp = linia.split(" ");
                dodajMiasto(sp[1]);
            }
            System.out.println(linia);
                        linia = br.readLine();
                                    System.out.println(linia);
        } else if(linia.equals("# polaczenia")){
                            System.out.println("ZArAS SIĘ WYJEBIĘ1!!!");
            while((linia = br.readLine()) != null){
                String[] sp = linia.split(" ");
                System.out.println("ZArAS SIĘ WYJEBIĘ1!!!");
                dodajPolaczenie(Integer.parseInt(sp[0]), Integer.parseInt(sp[1]), Integer.parseInt(sp[2]));
            }
        }
                
            
        
    }


    private void dodajMiasto(String nazwa){
        System.out.println(nazwa);
        miasta[nr++] = nazwa;
    }
    
    private void dodajPolaczenie(int a, int b, int dlugosc){    //?warunek przestawiający a<b
        System.out.println(a + b + dlugosc);
        polaczenia[a][b] = dlugosc;
    }
}
