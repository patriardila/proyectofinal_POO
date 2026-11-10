/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaveterinaria;

/**
 *
 * @author patri
 */
public class Mascota {
    // ===== ATRIBUTOS (todos private) =====
    private String codigo;
    private String nombre;
    private String especie;
    private int edad;
    private boolean hospitalizada;
    
        // ===== CONSTRUCTOR =====
    public Mascota(String codigo, String nombre, String especie, int edad) {
        setCodigo(codigo);
        setNombre(nombre);
        setEspecie(especie);
        setEdad(edad);
        this.hospitalizada = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isHospitalizada() {
        return hospitalizada;
    }

    public void setHospitalizada(boolean hospitalizada) {
        this.hospitalizada = hospitalizada;
    }
        // ===== VER DETALLE =====
    public String verDetalle() {
        StringBuilder sb = new StringBuilder();
        sb.append("Código: ").append(codigo);
        sb.append(" | Nombre: ").append(nombre);
        sb.append(" | Especie: ").append(especie);
        sb.append(" | Edad: ").append(edad);
        
        // HAZLO TÚ: agrega las dos líneas que faltan, con este texto exacto:
        //   " | Especie: "  y luego especie
        //   " | Edad: "  y luego edad
        if (hospitalizada) {
            sb.append(" | Estado: Hospitalizada");
        } else {
            sb.append(" | Estado: En casa");
        }
        return sb.toString();
    }

    
    
}
