/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paczkoladia;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Piotr
 */
public class Paczkoladia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Mapa m;
        try{
            m = new Mapa();    //wczytanie pliku z mapą
        } catch(Exception e){   //!do poprawienia
            System.out.println("Nie odnaleziono pliku " + e);
        }
    }
    
}
