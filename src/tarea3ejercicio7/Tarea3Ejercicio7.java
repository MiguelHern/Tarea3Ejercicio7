/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3ejercicio7;

/**
 *
 * @author marti
 */
public class Tarea3Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [][] StarWars = new String [2][2];
        StarWars [0][0]= "Darth Vader";
        StarWars [0][1]= "Leia";
        StarWars [1][0]="Obi-Wan";
        StarWars [1][1]="Han Solo";
        for (int i=0;i<2;i++)
        {
            for (int j=0;i<2;j++){
                System.out.println("Los personajes son " +StarWars[i][j]);}
                }
    }
    
}
