package com.upc.relaciones.demo.dao;

import com.upc.relaciones.demo.entidades.Cliente;
import com.upc.relaciones.demo.entidades.Pedido;
import com.upc.relaciones.demo.repositorios.ClienteRepositorio;
import com.upc.relaciones.demo.repositorios.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VentasDAOImpl implements VentasDAO {
    @Autowired
    private ClienteRepositorio clienteRepositorio;
    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    @Override
    public Cliente obtenerCliente(String dni) {
        return clienteRepositorio.findByDni(dni);
    }

    @Override
    public Cliente registrarCliente(Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }

    @Override
    public List<Pedido> obtenerPedidos() {
        return (List<Pedido>) pedidoRepositorio.findAll();
    }

    @Override
    public Cliente obtenerCliente(Long codigoPedido) {
        Pedido pedido = pedidoRepositorio.findById(codigoPedido).get();
        return pedido.getCliente();
    }

    @Override
    public List<Pedido> obtenerPedidosCliente(String dni) {
        Cliente cliente = clienteRepositorio.buscarCliente(dni);
        return cliente.getPedidos();
    }

    @Override
    public Pedido realizarPedido(Pedido pedido) {
        Cliente cliente = clienteRepositorio.findById(pedido.getCliente().getCodigo()).get();
        if(cliente!=null){
            pedido.setCodigoRespuesta("00");
            return pedidoRepositorio.save(pedido);
        }else {
            return null;
        }
    }

    @Override
    public List<Cliente> obtenerClientes() {
        return (List<Cliente>) clienteRepositorio.findAll();
    }
}
