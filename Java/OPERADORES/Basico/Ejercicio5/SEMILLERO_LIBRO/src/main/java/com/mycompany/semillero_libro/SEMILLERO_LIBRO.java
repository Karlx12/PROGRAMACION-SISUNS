/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semillero_libro;
import java.lang.Math;
/**
 *
 * @author maxx1212
 */
public class SEMILLERO_LIBRO {

    public static void main(String[] args) {
        //Crea un algoritmo y un programa para hallar el área y volumen de un Tetraedro 
        int lado=5;
        double area=Math.pow(lado,2.0)*Math.sqrt(3);
        System.out.println("El área de un tetraedro que su lado mide: "+Integer.toString(lado)+", es:"+Double.toString(Math.round(area)) );
        double volumen=(Math.sqrt(2)/12)*Math.pow(lado, 3.0);
        System.out.println("El Volumen de un tetraedro que su lado mide: "+Integer.toString(lado)+", es:"+Double.toString(Math.round(volumen)) );
    }
}
