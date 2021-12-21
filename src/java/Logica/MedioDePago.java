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

@Entity
public class MedioDePago implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.AUTO) 
private int id;
@Basic
private String tipo;
private int comision;

public MedioDePago(String tip){
this.tipo=tip;
}
public MedioDePago(String tip,int com){
this.tipo=tip;
this.comision=com;
}
public MedioDePago(){
    
}
    public int getId(){
    return this.id;    
    }
    
    public void setId(int id){
    this.id=id;    
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }
    
}
