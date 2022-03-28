/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTO.facade;

import PROYECTO.dao.celularDAO;
import PROYECTO.dao.clienteDAO;
import PROYECTO.dao.empleadoDAO;
import PROYECTO.dao.notaDAO;
import PROYECTO.dao.tiendaDAO;
import PROYECTO.dt.celularDT;
import PROYECTO.dt.clienteDT;
import PROYECTO.dt.empleadoDT;
import PROYECTO.dt.notaDT;
import PROYECTO.dt.tiendaDT;
import java.util.List;

/**
 *
 * @author jamon
 */
public class SistemaFacade {
    public void crearCLIENTE(clienteDT dto) throws Exception{
        clienteDAO dao = new clienteDAO();
        dao.create(dto); 
    }
    public void actualizarCLIENTE(clienteDT dto) throws Exception{
        clienteDAO dao = new clienteDAO();
        dao.actualiza(dto); 
    }
    public void eliminarCLIENTE(clienteDT dto) throws Exception{
        clienteDAO dao = new clienteDAO();
        dao.borra(dto); 
    }
    public clienteDT seleccionarCLIENTE(clienteDT dto) throws Exception{
        clienteDAO dao = new clienteDAO();
        dao.select(dto);
        return dao.select(dto);
    }
    public List seleccionartodoCLIENTE() throws Exception{
        clienteDAO dao = new clienteDAO();
        return dao.selectall();
    }
    
    /**              Aqui empiezan los facades de la nota                    **/
    
   public void crearNOTA(notaDT dto) throws Exception{
        notaDAO dao = new notaDAO();
        dao.create(dto); //
    }
   public void actualizarNOTA(notaDT dto) throws Exception{
        notaDAO dao = new notaDAO();
        dao.actualiza(dto); 
    }
    public void eliminarNOTA(notaDT dto) throws Exception{
        notaDAO dao = new notaDAO();
        dao.borra(dto); 
    }
    public notaDT seleccionarNOTA(notaDT dto) throws Exception{
        notaDAO dao = new notaDAO();
        dao.select(dto); 
        return dao.select(dto);
    }
    public List seleccionartodoNOTA() throws Exception{
        notaDAO dao = new notaDAO();
        return dao.selectall();
        
    }
    
    /**              Aqui empiezan los facades de la tienda                  **/
    
    public void crearTienda(tiendaDT dto)throws Exception{
        tiendaDAO dao= new tiendaDAO();
        dao.create(dto);
    } 
    public void modificaTienda(tiendaDT dto)throws Exception{
        tiendaDAO dao =new tiendaDAO();
        dao.actualiza(dto);
    }
    public void eliminaTienda(tiendaDT dto)throws Exception{
        tiendaDAO dao =new tiendaDAO();
        dao.borra(dto);
    }
    public tiendaDT busquedaTienda(tiendaDT dto)throws Exception{
        tiendaDAO dao =new tiendaDAO();
        return dao.seleccionar(dto);
    }
    public List listaTienda()throws Exception{
        tiendaDAO dao =new tiendaDAO();
        return dao.selectall();
    }
    
    /**              Aqui empiezan los facades del empleado                  **/
    
    public void crearEmpleado(empleadoDT dto)throws Exception{
        empleadoDAO dao= new empleadoDAO();
        dao.create(dto);
    } 
    public void modificaEmpleado(empleadoDT dto)throws Exception{
        empleadoDAO dao =new empleadoDAO();
        dao.actualiza(dto);
    }
    public void eliminaEmpleado(empleadoDT dto)throws Exception{
        empleadoDAO dao =new empleadoDAO();
        dao.borra(dto);
    }
    public empleadoDT busquedaEmpleado(empleadoDT dto)throws Exception{
        empleadoDAO dao =new empleadoDAO();
        return dao.seleccionar(dto);
    }
    public List listaEmpleado()throws Exception{
        empleadoDAO dao =new empleadoDAO();
        return dao.selectall();
    }
    
    /**              Aqui empiezan los facades del celular                   **/
    
     public void crearCELULAR(celularDT dto)throws Exception{
        celularDAO dao= new celularDAO();
        dao.create(dto);
    } 
    public void actualizarCELULAR(celularDT dto)throws Exception{
        celularDAO dao =new celularDAO();
        dao.actualiza(dto);
    }
    public void eliminarCELULAR(celularDT dto)throws Exception{
        celularDAO dao =new celularDAO();
        dao.borra(dto);
    }
    public celularDT seleccionarCELULAR(celularDT dto)throws Exception{
        celularDAO dao =new celularDAO();
        return dao.seleccionar(dto);
    }
    public List seleccionartodoCELULAR()throws Exception{
        celularDAO dao =new celularDAO();
        return dao.selectall();
    }
    
}
