/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Usuario implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.AUTO) 
private int id;
@Basic
private String nombre;
private String contraseña;
@OneToOne
public Empleado unEmpleado;

public Usuario(String nom,String cont){
this.nombre=nom;
this.contraseña=cont;
}

   public Usuario() {
        
    }
    public int getId(){
    return id;    
    }
    public void setId(int id){
    this.id=id;    
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }    
    
    public Empleado getEmpleado(){
    return this.unEmpleado;   
    }
    public void setEmpleado(Empleado emp){
    this.unEmpleado=emp;     
    }
}
