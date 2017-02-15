/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnociclo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Your Name <Juan A. García Muelas (juangmuelas@hotmail.com)>
 */
public class AlumnoCiclo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //Alumno al1, al2,al3,al4,al5;
        Alumno al1= new Alumno();
        Alumno al2= new Alumno();
        Alumno al3= new Alumno();
        Alumno al4= new Alumno();
        Alumno al5= new Alumno();
        
        System.out.println("Pedir datos alumnos");
        System.out.println("*******************");
        
        al1.pedirDatos();
        al2.pedirDatos();
        al3.pedirDatos();
        al4.pedirDatos();
        al5.pedirDatos();
        
        System.out.println("Visualizar datos alumnos");
        System.out.println("*******************");
        
        al1.visualDatos();
        al2.visualDatos();
        al3.visualDatos();
        al4.visualDatos();
        al5.visualDatos();
        
     
        
    InputStreamReader flujo= new InputStreamReader(System.in);
    BufferedReader teclado= new BufferedReader(flujo);
    int hor;
    String cic,horaCad;
        System.out.println("CAMBIO CICLO");
        System.out.println("Indique nuevo ciclo");
        cic=teclado.readLine();
        System.out.println("Indique nuevas horas");
        horaCad=teclado.readLine();
        hor=Integer.parseInt(horaCad);
       al3.cambioCiclo(cic, hor);
       al4.cambioCiclo(cic, hor);
       al5.cambioCiclo(cic, hor);
    
    visualTodos(al1,al2,al3,al4,al5);  
    }   
    static void visualTodos(Alumno alu1, Alumno alu2, Alumno alu3, Alumno alu4, Alumno alu5){   
       
        alu1.visualDatos();
        alu2.visualDatos();
        alu3.visualDatos();
        alu4.visualDatos();
        alu5.visualDatos();
    }
    
}
