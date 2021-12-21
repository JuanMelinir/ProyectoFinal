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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Venta implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)   
private int num_venta;
@Basic
private String fecha_venta;
private MedioDePago medio_pago;
private Cliente cliente;
private Servicio servicio;
private PaqueteTuristico paquete;
private Empleado empleado;
@OneToOne
public Cliente unCliente;
@ManyToOne
public Empleado unEmpleado;
@ManyToOne
public PaqueteTuristico unPaquete;

public Venta(String fecha,MedioDePago pago,Cliente cliente,Servicio servicio,Empleado empleado){

this.fecha_venta=fecha;
this.medio_pago=pago;
this.cliente=cliente;
this.servicio=servicio;
this.paquete=paquete;
this.empleado=empleado;
}
public Venta(String fecha,MedioDePago pago,Cliente cliente,PaqueteTuristico paquete,Empleado empleado){

this.fecha_venta=fecha;
this.medio_pago=pago;
this.cliente=cliente;
this.servicio=servicio;
this.paquete=paquete;
this.empleado=empleado;
}
public Venta(String fecha,MedioDePago pago,Cliente cliente,Servicio servicio){

this.fecha_venta=fecha;
this.medio_pago=pago;
this.cliente=cliente;
this.servicio=servicio;
}
public Venta(String fecha,MedioDePago pago,Cliente cliente,PaqueteTuristico paqueteo){

this.fecha_venta=fecha;
this.medio_pago=pago;
this.cliente=cliente;
this.paquete=paquete;

}
public Venta(){
    
}
    public int getNum_venta() {
        return num_venta;
    }

    public void setNum_venta(int num_venta) {
        this.num_venta = num_venta;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public MedioDePago getMedio_pago() {
        return medio_pago;
    }

    public void setMedio_pago(MedioDePago medio_pago) {
        this.medio_pago = medio_pago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public PaqueteTuristico getPaquete() {
        return paquete;
    }

    public void setPaquete(PaqueteTuristico paquete) {
        this.paquete = paquete;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }    
}
