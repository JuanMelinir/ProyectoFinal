/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Cliente;
import Logica.Empleado;
import Logica.MedioDePago;
import Logica.PaqueteTuristico;
import Logica.Servicio;
import Logica.Usuario;
import Logica.Venta;
import java.util.logging.Level;
import java.util.logging.Logger;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;


public class ControladoraPersistencia {

    ServicioJpaController serviJPA = new ServicioJpaController();
    PaqueteTuristicoJpaController paqueteJPA = new PaqueteTuristicoJpaController();
    ClienteJpaController clienteJPA = new ClienteJpaController();
    VentaJpaController ventaJPA = new VentaJpaController();
    MedioDePagoJpaController pagoJPA = new MedioDePagoJpaController();
    UsuarioJpaController usuarioJPA = new UsuarioJpaController();
    EmpleadoJpaController empleadoJPA = new EmpleadoJpaController();

    public void crearServicio(Servicio servi) {
        try {
            serviJPA.create(servi);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se pudo crear el servicio.");
        }
    }

    public Servicio buscarServicio(Servicio servi) {
        return serviJPA.findServicio(servi.getCodigo_servicio());
    }

    //buscamos a un servicio pasando como parametro su codigo de servicio
    public Servicio buscarServicio(String id) {
        return serviJPA.findServicio(id);
    }
    
     public void modificarServicio(Servicio servicio){
        try {
            serviJPA.edit(servicio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public void eliminarServicio(String id){
        try {
            serviJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Servicio> traerServicios(){
    return serviJPA.findServicioEntities();
    }
    
    public List<PaqueteTuristico> traerPaquetes(){
    return paqueteJPA.findPaqueteTuristicoEntities();
    }
    
    public List<Usuario> traerUsuarios(){
        return usuarioJPA.findUsuarioEntities();
    }
    public void crearPaquete(PaqueteTuristico paquete) {
        try {
            paqueteJPA.create(paquete);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se pudo crear el paquete.");
        }
    }

    public PaqueteTuristico buscarPaquete(PaqueteTuristico paquete) {
        return paqueteJPA.findPaqueteTuristico(paquete.getCodigo_paquete());
    }

    //buscamos a un servicio pasando como parametro su codigo de servicio
    public PaqueteTuristico buscarPaquete(int codigo) {
        return paqueteJPA.findPaqueteTuristico(codigo);
    }
    
     public void modificarPaquete(PaqueteTuristico paquete){
        try {
            paqueteJPA.edit(paquete);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public void eliminarPaquete(int id){
        try {
            paqueteJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crearCliente(Cliente cliente) {
        try {
            clienteJPA.create(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se pudo crear el cliente .");
        }
    }

    public Cliente buscarCliente(Cliente cliente) {
        return clienteJPA.findCliente(cliente.getIdCliente());
    }

    //buscamos a un cliente pasando como parametro su id
    public Cliente buscarCliente(int id) {
        return clienteJPA.findCliente(id);
    }
    
    public void modificarCliente(Cliente cliente){
        try {
            clienteJPA.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarCliente(int id){
        try {
            clienteJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Cliente> traerClientes(){
    return clienteJPA.findClienteEntities();
    }
    
     public void crearVenta(Venta venta) {
        try {
            ventaJPA.create(venta);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se pudo crear la venta.");
        }
    }

    public Venta buscarVenta(Venta venta) {
        return ventaJPA.findVenta(venta.getNum_venta());
    }
    
    //buscamos a un venta pasando como parametro su codigo de servicio
    public Venta buscarVenta(int id) {
        return ventaJPA.findVenta(id);
    }
    
     public void modificarVenta(Venta venta){
        try {
            ventaJPA.edit(venta);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public void eliminarVenta(int id){
        try {
            ventaJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crearEmpleado(Empleado empleado,Usuario usuario) {
        try {
            usuarioJPA.create(usuario);
            empleadoJPA.create(empleado);
                
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se pudo crear el empleado.");
        }
    }

    public Empleado buscarEmpleado(Empleado empleado) {
        return empleadoJPA.findEmpleado(empleado.getIdEmpleado());
    }

    //buscamos a un servicio pasando como parametro su codigo de servicio
    public Empleado buscarEmpleado(String id) {
        return empleadoJPA.findEmpleado(id);
    }
    
     public void modificarEmpleado(Empleado empleado){
        try {
            empleadoJPA.edit(empleado);
        
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarEmpleado(String id){
        try {
            empleadoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Empleado> traerEmpleados(){
        return empleadoJPA.findEmpleadoEntities();
    }
    public void crearUsuario(Usuario usuario) {
        try {
            usuarioJPA.create(usuario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se pudo crear el usuario.");
        }
    }

    public Usuario buscarUsuario(Usuario usuario) {
        return usuarioJPA.findUsuario(usuario.getId());
    }

    //buscamos a un servicio pasando como parametro su codigo de servicio
    public Usuario buscarUsuario(int codigo) {
        return usuarioJPA.findUsuario(codigo);
    }
    
     public void modificarUsuario(Usuario usuario){
        try {
            usuarioJPA.edit(usuario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public void eliminarUsuario(int id){
        try {
            usuarioJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crearMedioDePago(MedioDePago pago) {
        try {
            pagoJPA.create(pago);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se pudo crear el medio de pago.");
        }
    }

    public MedioDePago buscarMedioDePago(MedioDePago pago) {
        return pagoJPA.findMedioDePago(pago.getId());
    }

    //buscamos a un servicio pasando como parametro su codigo de servicio
    public MedioDePago buscarMedioDePago(int pago) {
        return pagoJPA.findMedioDePago(pago);
    }
    
     public void modificarMedioDePago(MedioDePago pago){
        try {
            pagoJPA.edit(pago);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public void eliminarMedioDePago(int id){
        try {
            pagoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

