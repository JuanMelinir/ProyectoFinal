/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class PaqueteTuristico implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)   
private int codigo_paquete;
@Basic
private Double costo_paquete;  
private Servicio[]lista_servicios_incluidos;
@ManyToMany
public List<Servicio>listServicios; 
@OneToMany
public List<Venta>listaVentas;

public PaqueteTuristico(){
this.listServicios= new ArrayList<Servicio>();
}
    public int getCodigo_paquete() {
        return codigo_paquete;
    }

    public void setCodigo_paquete(int codigo_paquete) {
        this.codigo_paquete = codigo_paquete;
    }

    public Servicio[] getLista_servicios() {
        return lista_servicios_incluidos;
    }

    public void setLista_servicios(Servicio[] lista_servicios) {
        this.lista_servicios_incluidos = lista_servicios;
    }
    
    public List<Servicio> getlistaServicios(){
    return this.listServicios; 
    }
    public Servicio[]getListaServicios(){
    return this.lista_servicios_incluidos;    
    }
    
    public void setListaVentas(List<Venta> lista_ventas) {
        this.listaVentas = lista_ventas;
    }
    
    public List getListaVentas(){
    return this.listaVentas; 
    }
    
    public void setlistaServicios(List servicios){
    this.listServicios=servicios; 
    }
    
    public void setAgregarServicio(Servicio serv){
    if(serv!=null){    
    this.listServicios.add(serv); 
    }
    }
    public void eliminarServicio(Servicio servi){
    int i=0;    
    if(this.listServicios!=null){
    for(Servicio s:this.listServicios){
    if(s.getCodigo_servicio().compareTo(servi.getCodigo_servicio())==0){
    this.listServicios.remove(i);
    } 
    i++;
    }    
    }    
    }
    public double calcularCostoPaquete(){
    double costoTotal=0;
    for(Servicio s:this.listServicios){
    costoTotal=costoTotal+s.getCosto_servicio();
    }
    return costoTotal;    
    }
    public Double getCosto_paquete() {
        return this.calcularCostoPaquete();
    }

    public void setCosto_paquete(Double costo_paquete) {
        this.costo_paquete = costo_paquete;
    }
    
    public void modificarServicio(Servicio serv){
        
    }
  
}
