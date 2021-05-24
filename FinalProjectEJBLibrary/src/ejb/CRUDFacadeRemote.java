/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import Entidades.Clientes;
import Entidades.Inventariovideojuegos;
import Entidades.Rentasvideojuegos;
import Entidades.Videojuegos;
import javax.ejb.Remote;

/**
 *
 * @author Zannie
 */
@Remote
public interface CRUDFacadeRemote {

    public boolean eliminarCliente(Integer id);

    public boolean actualizarCliente(Clientes cliente);

    public boolean registrarVideojuego(Videojuegos videojuego);

    public boolean eliminarVideojuego(Integer id);

    public boolean registrarInventario(Inventariovideojuegos inventario);

    public boolean eliminarInventario(Integer id);

    public boolean actualizarInventario(Inventariovideojuegos inventario);

    public boolean registrarRenta(Rentasvideojuegos renta);

    public boolean eliminarRenta(Rentasvideojuegos renta);

    public boolean actualizarRenta(Rentasvideojuegos renta);


}
