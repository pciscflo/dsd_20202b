package com.upc.relaciones.demo.serviciorest;

import com.upc.relaciones.demo.entidades.Cliente;
import com.upc.relaciones.demo.entidades.Pedido;
import com.upc.relaciones.demo.dao.VentasDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ServicioRestVentas {
    @Autowired
    private VentasDAO ventasDAO;

    @PostMapping("/cliente")
    public Cliente registrar(@RequestBody Cliente cliente){
        return ventasDAO.registrarCliente(cliente);
    }
    @GetMapping("/cliente/{dni}")
    public Cliente obtenerCliente(@PathVariable(value = "dni") String dni){
        return ventasDAO.obtenerCliente(dni);
    }

    @PostMapping("/pedido")
    public Pedido crearPedido(@RequestBody Pedido pedido){
        return ventasDAO.realizarPedido(pedido);
    }

    @GetMapping("/pedidos/{dni}")
    public List<Pedido> obtenerPedidos(@PathVariable(name = "dni") String dni){
        return ventasDAO.obtenerPedidosCliente(dni);
    }

    @GetMapping("/clientes")
    public List<Cliente> obtenerClientes(){
        return ventasDAO.obtenerClientes();
    }

    @GetMapping("/pedidos")
    public List<Pedido> obtenerPedidos(){
        return ventasDAO.obtenerPedidos();
    }

}
