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
import Fachadas.FachadaClientes;
import Fachadas.FachadaInventarioVideojuegos;
import Fachadas.FachadaRentasVideojuegos;
import Fachadas.FachadaVideojuegos;
import javax.ejb.Stateless;

/**
 *
 * @author Zannie
 */
@Stateless
public class CRUDFacade implements CRUDFacadeRemote {


    @Override
    public boolean eliminarCliente(Integer id) {
        FachadaClientes fClientes = new FachadaClientes();
        return fClientes.eliminarCliente(id);
    }

    @Override
    public boolean actualizarCliente(Clientes cliente) {
        FachadaClientes fClientes = new FachadaClientes();
        return fClientes.editarCliente(cliente);
    }

    @Override
    public boolean registrarVideojuego(Videojuegos videojuego) {
        FachadaVideojuegos fVideojuegos = new FachadaVideojuegos();
        return fVideojuegos.registrarVideojuego(videojuego);
    }

    @Override
    public boolean eliminarVideojuego(Integer id) {
        FachadaVideojuegos fVideojuegos = new FachadaVideojuegos();
        return fVideojuegos.eliminarVideojuego(id);
    }

    @Override
    public boolean registrarInventario(Inventariovideojuegos inventario) {
        FachadaInventarioVideojuegos fInventario = new FachadaInventarioVideojuegos();
        return fInventario.registrarInventario(inventario);
    }

    @Override
    public boolean eliminarInventario(Integer id) {
        FachadaInventarioVideojuegos fInventario = new FachadaInventarioVideojuegos();
        return fInventario.eliminarInventario(id);
    }

    @Override
    public boolean actualizarInventario(Inventariovideojuegos inventario) {
        FachadaInventarioVideojuegos fInventario = new FachadaInventarioVideojuegos();
        return fInventario.editarInventario(inventario);
    }

    @Override
    public boolean registrarRenta(Rentasvideojuegos renta) {
        FachadaRentasVideojuegos fRentas = new FachadaRentasVideojuegos();
        return fRentas.registrarRenta(renta);
    }

    @Override
    public boolean eliminarRenta(Rentasvideojuegos renta) {
        FachadaRentasVideojuegos fRentas = new FachadaRentasVideojuegos();
        return fRentas.eliminarRenta(renta);
    }

    @Override
    public boolean actualizarRenta(Rentasvideojuegos renta) {
        FachadaRentasVideojuegos fRentas = new FachadaRentasVideojuegos();
        return fRentas.editarRenta(renta);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
