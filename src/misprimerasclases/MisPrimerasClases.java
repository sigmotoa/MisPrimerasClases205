/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misprimerasclases;

import java.util.Scanner;

/**
 *
 * @author SergioIván
 */
public class MisPrimerasClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner read =new Scanner (System.in);
        Persona p1 = new Persona();
        
        p1.nombre="Sergio";
       //p1.apellido=read.nextLine();
        p1.apellido="Motoa";
        p1.id="561729718";
        
        System.out.println(p1.nombre+" "
                + ""+p1.apellido+"\n"+p1.id);
      //  System.out.println(p1.fechanacimiento.length);
        
        int arre[]={23,7,1969};//Arreglo con la fecha    
        
        p1.fechanacimiento=arre;
       
//        p1.fechanacimiento[0]=23;
//        p1.fechanacimiento[1]=7;
//        p1.fechanacimiento[2]=1969;
//        
       // System.out.println(arre);
       // System.out.println(p1.fechanacimiento[4]);
        //System.out.println(p1.fechanacimiento.length);
        
            // p1.calcularEdad();
        System.out.println("La edad de: "+p1.nombre+""
                + " es: "+p1.calcularEdad(189));//el 189 no 
        //se usa para nada
        
        System.out.println(p1.edad);//esta me da un 0
        p1.calcularEdad();//calcular edad y guardar en edad
        System.out.println("La edad calculada es: "+p1.edad);//mostrar edad
                
    Persona gaes1[]=new Persona[3];
    
        for (int i = 0; i < gaes1.length; i++) {
            
            gaes1[i]= new Persona();
            
        }
           
    
    
    
    
    
    
    
    
    
    
    
                
                
        
    
    }
    
}
