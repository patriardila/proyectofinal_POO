/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaveterinaria;

/**
 *
 * @author patri
 */
public class PruebaMascota {
     public static void main(String[] args) {
        System.out.println("--- Datos correctos ---");
        Mascota uno = new Mascota("M001", "Luna", "Perro", 4);
        Mascota dos = new Mascota("M002", "Michi", "Gato", 2);
        System.out.println(uno.verDetalle());
        System.out.println(dos.verDetalle());
        System.out.println("--- Datos malos ---");
        Mascota malo = new Mascota("", "Prueba", "", -5);
        System.out.println(malo.verDetalle());
    }
    
}
