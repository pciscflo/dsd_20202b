package com.upc.jmscola.rest;

import com.upc.jmscola.jms.JmsProductor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ServicioEnvioRest {
    @Autowired
    private JmsProductor jmsProductor;

    @PostMapping("/enviar/{mensaje}")
    public String enviar(@PathVariable(value = "mensaje") String mensaje){
        jmsProductor.send(mensaje);//Asíncrono
        return "Ok";
    }
}
