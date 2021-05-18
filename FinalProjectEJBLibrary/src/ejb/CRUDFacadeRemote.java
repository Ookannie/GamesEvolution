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
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Zannie
 */
@Remote
public interface CRUDFacadeRemote {

    public boolean registrarCliente(Clientes cliente);

    public boolean eliminarCliente(Integer id);

    public boolean actualizarCliente(Clientes cliente);

    public List<Clientes> consultarClientes();

    public Clientes consultarClienteID(Integer id);

    public boolean registrarVideojuego(Videojuegos videojuego);

    public boolean eliminarVideojuego(Integer id);

    public boolean actualizarVideojuego(Videojuegos videojuego);

    public List<Videojuegos> consultarVideojuegos();

    public Videojuegos consultarVideojuegosID(Integer id);

    public boolean registrarInventario(Inventariovideojuegos inventario);

    public boolean eliminarInventario(Integer id);

    public boolean actualizarInventario(Inventariovideojuegos inventario);

    public List<Inventariovideojuegos> consultarInventario();

    public Inventariovideojuegos consultarInventarioID(Integer id);

    public boolean registrarRenta(Rentasvideojuegos renta);

    public boolean eliminarRenta(Rentasvideojuegos renta);

    public boolean actualizarRenta(Rentasvideojuegos renta);

    public List<Rentasvideojuegos> consultarRentas();

    public Rentasvideojuegos consultarInventarioID(Rentasvideojuegos renta);

}
