/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misprimerasclases;

/**
 *
 * @author SergioIván
 */
public class Persona {

    String nombre;
    String apellido;
    String id;
    byte edad;
    int fechanacimiento[] = new int[3];
    final int ACTUALA = 2016;
    final int ACTUALM = 11;

    public void calcularEdad() {
        edad = (byte) (ACTUALA - fechanacimiento[2]);

    }
    
    public byte calcularEdad(int dia)
    {
       return (byte)(ACTUALA-fechanacimiento[2]);
    }
    
}
