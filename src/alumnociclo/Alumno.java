/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnociclo;

import java.io.*;

/**
 *
 * @author Your Name <Juan A. García Muelas (juangmuelas@hotmail.com)>
 */
public class Alumno {
    private String nombre;
    private  static String ciclo= "DAW";
    private static int horas=500;
   
public void pedirDatos()throws IOException{
    InputStreamReader flujo= new InputStreamReader(System.in);
    BufferedReader teclado= new BufferedReader(flujo);
    
    System.out.println("INDIQUE NOMBRE ALUMNO:");
    nombre= teclado.readLine();
}    
public void visualDatos(){
    System.out.println("NOMBRE ALUMNO: \t"+nombre);
    System.out.println("CICLO: \t"+ciclo);
    System.out.println("HORAS: \t"+horas);
}
public void cambioCiclo(String cic, int hor){
    ciclo=cic;
    horas=hor;
}
}
