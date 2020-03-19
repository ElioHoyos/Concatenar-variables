/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elio.com.ejerciciovariable2;

/**
 *
 * @author FRANKOYCI
 */
public class TipoVariable {
    public static void main(String[] args) {
        //concatenar variables var
        var usuario = "Elio";
        var saludar = "Hola";
        //para separar y tener espacio
        System.out.println(saludar + "  " + usuario);
        //concatenar variable numero
        var i = 5;
        var j = 3;
        System.out.println(i + j);
        //agregar tipo text y numero en las variables
        System.out.println(i + j + ": La Suma es");
        
    }
}
