package com.ibk.pagos.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.support.JmsMessageHeaderAccessor;
import org.springframework.stereotype.Component;

@Component
public class JmsOyente {

    @JmsListener(destination = "${jms.cola.envio}")
    public void lectorMensaje(String mensaje, JmsMessageHeaderAccessor header){
        System.out.println("Recibido IBK:" + mensaje);
        //registrarlo a una base de  datos....etc...


        //enviar la respuesta a otra cola de respuesta


    }
}
