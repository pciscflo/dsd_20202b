package com.upc.jpacurso;

import com.upc.jpacurso.entidades.Socio;
import com.upc.jpacurso.dao.ServiceSocioDAO;
import com.upc.jpacurso.services.ServiceSocioCore;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest
public class JpacursoApplicationTests {

    @Autowired
    private ServiceSocioDAO negocioSocio;
    @Autowired
    private ServiceSocioCore serviceSocioCore;

    @Test
    public void contextLoads() {
    }

    @Test
    public void probarRegistro() {
        Socio socio = new Socio();
        socio.setCorreo("carlos@gmail.com");
        socio.setDependientes(3);
        socio.setDireccion("Lima 412");
        socio.setDni("9999999");
        socio.setNombre("Carlos");
        socio = negocioSocio.registrar(socio);
        Assert.assertNotNull(socio);
    }

    //@Test
    public void probarCuotaCodigo() {
        double cuota = 0;
        cuota = serviceSocioCore.calcularCuotaId(2L);
        Assert.assertEquals(4000, cuota, 0.0);
        System.out.println(cuota);
    }

    //@Test
    public void probarCuotaDni() {
        double cuota = 0;
        Socio socio = new Socio();
        socio.setDni("88888888");
        cuota = serviceSocioCore.calcularCuota(socio);
        Assert.assertEquals(4000, cuota, 0.0);
        System.out.println(cuota);
    }

    //@Test
   public void listadoConDependientes() {
        List<Socio> listado;
        listado = serviceSocioCore.obtenerListadoSociosConDependientes();
        for (Socio p : listado) {
            System.out.println(p.getCodigo() + "  " + p.getNombre() + "  " + p.getDireccion());
        }
        Assert.assertNotNull(listado);
    }

    //@Test
    public void actualiza() {
        Socio socio = new Socio();
        socio.setCodigo(1L);
        socio.setCorreo("miguel@gmail.com");
        Socio s;
        s = negocioSocio.actualizar(socio);
        Assert.assertNotNull(s);
    }

    //@Test
    public void listadoTotal() {
        List<Socio> listado = negocioSocio.obtenerSocios();//sin cuotas
        for (Socio p : listado) {
            System.out.println(p.getCodigo() + "   " + p.getNombre());
        }
        Assert.assertNotNull(listado);
    }

    //@Test
    public void listadoTotalCuotas() {
        List<Socio> listado = serviceSocioCore.obtenerReporteSocioCuotas();
        for (Socio p : listado) {
            System.out.println(p.getCodigo() + "   " + p.getNombre() + "   " + p.getCuota());
        }
        Assert.assertNotNull(listado);
    }

}
