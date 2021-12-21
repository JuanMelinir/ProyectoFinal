/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
ControladoraPersistencia controlPersis= new ControladoraPersistencia();
    
public void crearEmpleado(String nom,String ape,String dir,String dni,String fechaN,String nac,String cel,String email,String cargo,Double sueldo,String nomUsu,String contraUsu){
Empleado empleado=new Empleado();
Usuario usuario=new Usuario();

empleado.setNombre(nom);
empleado.setApellido(ape);
empleado.setDireccion(dir);
empleado.setDni(dni);
empleado.setFecha_nac(fechaN);
empleado.setNacionalidad(nac);
empleado.setCelular(cel);
empleado.setEmail(email);
empleado.setCargo(cargo);
empleado.setSueldo(sueldo);

usuario.setNombre(nomUsu);
usuario.setContraseña(contraUsu);
usuario.setEmpleado(empleado);
empleado.setUsuario(usuario);
controlPersis.crearEmpleado(empleado,usuario);
}

public void crearServicio(String nom,String desc,String dest,String fec,Double cost){
Servicio servicio=new Servicio();

servicio.setNombre(nom);
servicio.setDescripcion_breve(desc);
servicio.setDestino_servicio(dest);
servicio.setFecha_servicio(fec);
servicio.setCosto_servicio(cost);
controlPersis.crearServicio(servicio);
}   

public Servicio buscarServicio(String id){
return controlPersis.buscarServicio(id);
}

public void borrarServicio(int id){
controlPersis.eliminarServicio(Integer.toString(id));
}

public List traerServicios(){
return controlPersis.traerServicios();    
}
public List traerPaquetes(){
return controlPersis.traerPaquetes();    
}
public List traerUsuarios(){
return controlPersis.traerUsuarios();
}

public void crearPaquete(List servicios,Double costo){
PaqueteTuristico paquete=new PaqueteTuristico();
paquete.setlistaServicios(servicios);
controlPersis.crearPaquete(paquete);
}  
public PaqueteTuristico buscarPaquete(int id){
return controlPersis.buscarPaquete(id);
}
public void borrarPaquete(int id){
controlPersis.eliminarPaquete(id);    
}    

public void crearCliente(String nombre,String apellido,String direccion,String dni,String fecha_nac,String nacionalidad,String celular,String email){
Cliente cliente=new Cliente();
cliente.setNombre(nombre);
cliente.setApellido(apellido);
cliente.setDireccion(direccion);
cliente.setDni(dni);
cliente.setFecha_nac(fecha_nac);
cliente.setNacionalidad(nacionalidad);
cliente.setCelular(celular);
cliente.setEmail(email);
controlPersis.crearCliente(cliente);
}

public void crearVenta(String fecha_venta,MedioDePago pago,Cliente cliente,Servicio servicio,Empleado empleado){
Venta venta=new Venta(fecha_venta,pago,cliente,servicio,empleado);
controlPersis.crearVenta(venta);
}

public void crearVenta(String fecha_venta,MedioDePago pago,Cliente cliente,PaqueteTuristico paquete,Empleado empleado){
Venta venta=new Venta(fecha_venta,pago,cliente,paquete,empleado);
controlPersis.crearVenta(venta);
}

public void crearVenta(String fecha_venta,MedioDePago pago,Cliente cliente,Servicio servicio){
Venta venta=new Venta(fecha_venta,pago,cliente,servicio);
controlPersis.crearVenta(venta);
}

public void crearVenta(String fecha_venta,MedioDePago pago,Cliente cliente,PaqueteTuristico paquete){
Venta venta=new Venta(fecha_venta,pago,cliente,paquete);
controlPersis.crearVenta(venta);
}

public List<Empleado> listarEmpleados(){
    return controlPersis.traerEmpleados();
}
public void eliminarEmpleado(String id){
 controlPersis.eliminarEmpleado(id);
}

public Empleado buscarEmpleado(String id){
return controlPersis.buscarEmpleado(id);
}

public List traerClientes(){
return controlPersis.traerClientes();
}

public void borrarCliente(int id){
controlPersis.eliminarCliente(id);
}

public Cliente buscarCliente(int id){
return controlPersis.buscarCliente(id);
}

public void modificarCliente(Cliente cliente){
controlPersis.modificarCliente(cliente);    
}
public boolean usuarioRepetido(String usuario){
List<Usuario>listaUsuarios=controlPersis.traerUsuarios();
    
    if(listaUsuarios!=null){
       for(Usuario usu:listaUsuarios){
           
           if(usu!=null&&usu.getNombre().equals(usuario)){
           } else {
               return true;
           }
       }     
}
    return false;
}
public boolean verificarUsuario(String usuario,String contra){
    List<Usuario>listaUsuarios=controlPersis.traerUsuarios();
    System.out.println(listaUsuarios);
    if(listaUsuarios!=null){
       for(Usuario usu:listaUsuarios){
           if(usu.getNombre().equals(usuario)&&usu.getContraseña().equals(contra)){
               System.out.println("Entra es distinta de null");
               return true;
           }
       }        
    }
 return false; 
}

public Usuario buscarUsuario(String usuario,String contra){
    Usuario usua=new Usuario();
    List<Usuario>listaUsuarios=controlPersis.traerUsuarios();
    System.out.println(listaUsuarios);
    if(listaUsuarios!=null){
       for(Usuario usu:listaUsuarios){
           if(usu.getNombre().equals(usuario)&&usu.getContraseña().equals(contra)){
                usua=usu;
                return usua;
           }
       }        
    }
 return usua; 
}
}
