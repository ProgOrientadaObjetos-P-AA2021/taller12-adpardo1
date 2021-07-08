/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.lang.reflect.Field;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author reroes
 */
public class EstudianteDistanciaTest {

    private EstudianteDistancia instance;

    public EstudianteDistanciaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new EstudianteDistancia("Andrea","Vela","98981234",20);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testEstablecerNotas() throws
            IllegalArgumentException,
            NoSuchFieldException,
            IllegalAccessException {
        System.out.println("establecerNotas");
        ArrayList<Nota> ns = new ArrayList<>();

        ArrayList<Nota> ns2 = new ArrayList<>();

        instance.establecerNotas(ns);

        Field field = instance.getClass().getDeclaredField("notas");
        field.setAccessible(true);

        assertArrayEquals(((ArrayList<Nota>) field.get(instance)).toArray(),
                ns2.toArray());

    }

    /**
     * Test of obtenerNotas method, of class EstudianteDistancia.
     */
    @Test
    public void testObtenerNotas() {
        System.out.println("obtenerNotas");
        ArrayList<Nota> ns = null;
        instance.obtenerNotas();
       
    }

    
    @Test
    public void testEstablecerMejorNota() throws
            IllegalArgumentException,
            NoSuchFieldException,
            IllegalAccessException {
        System.out.println("establecerMejorNota");
        ArrayList<Nota> ns = new ArrayList<>();
        ns.add(new Nota(10.0));
        ns.add(new Nota(5.0));
        ns.add(new Nota(6.0));
        instance.establecerNotas(ns);
        instance.setMejorNota();
        Field field = instance.getClass().getDeclaredField("mejorNota");
        field.setAccessible(true);
        assertEquals(10.0, field.get(instance));
        
    }

    /**
     * Test of obtenerMejorNota method, of class EstudianteDistancia.
     */
    @Test
    public void testObtenerMejorNota() {
        System.out.println("obtenerMejorNota");
        ArrayList<Nota> ns = new ArrayList<>();
        ns.add(new Nota(10.0));
        ns.add(new Nota(5.0));
        ns.add(new Nota(6.0));
        double expResult = 10.0;
        instance.establecerNotas(ns);
        instance.setMejorNota();
        double result = instance.getMejorNota();
        
        assertEquals(expResult, result, 0.0);
    }

    
    @Test
    public void testEstablecerPeorNota() throws
            IllegalArgumentException,
            NoSuchFieldException,
            IllegalAccessException  {
        System.out.println("establecerPeorNota");
        ArrayList<Nota> ns = new ArrayList<>();
        ns.add(new Nota(10.0));
        ns.add(new Nota(5.0));
        ns.add(new Nota(6.0));
        instance.establecerNotas(ns);
        instance.setPeorNota();
        Field field = instance.getClass().getDeclaredField("peorNota");
        field.setAccessible(true);
        assertEquals(5.0, field.get(instance));
    }

    /**
     * Test of obtenerPeorNota method, of class EstudianteDistancia.
     */
    @Test
    public void testObtenerPeorNota() {
        System.out.println("obtenerPeorNota");
        ArrayList<Nota> ns = new ArrayList<>();
        ns.add(new Nota(10.0));
        ns.add(new Nota(5.0));
        ns.add(new Nota(6.0));
        double expResult = 5.0;
        instance.establecerNotas(ns);
        instance.setPeorNota();
        double result = instance.getPeorNota();
        
        assertEquals(expResult, result, 0.0);
    }

    
    @Test
    public void testEstablecerPromedio() throws
            IllegalArgumentException,
            NoSuchFieldException,
            IllegalAccessException  {
        System.out.println("establecerPromedio");
        ArrayList<Nota> ns = new ArrayList<>();
        ns.add(new Nota(10.0));
        ns.add(new Nota(5.0));
        ns.add(new Nota(6.0));
        instance.establecerNotas(ns);
        instance.setPromedio();
        Field field = instance.getClass().getDeclaredField("promedio");
        field.setAccessible(true);
        assertEquals( 7.0, field.get(instance));
    }

    /**
     * Test of obtenerMejorPromedio method, of class EstudianteDistancia.
     */
    @Test
    public void testObtenerPromedio() {
        System.out.println("obtenerMejorPromedio");
        ArrayList<Nota> ns = new ArrayList<>();
        ns.add(new Nota(10.0));
        ns.add(new Nota(5.0));
        ns.add(new Nota(6.0));
        double expResult = 7.0;
        instance.establecerNotas(ns);
        instance.setPromedio();
        double result = instance.getPromedio();
        
        assertEquals(expResult, result,7.0);
    }

    /**
     * Test of toString method, of class EstudianteDistancia.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        
        ArrayList<Nota> ns = new ArrayList<>();
        ns.add(new Nota(10.0));
        ns.add(new Nota(5.0));
        ns.add(new Nota(6.0));
        
        instance.establecerNotas(ns);
        instance.setMejorNota();
        instance.setPeorNota();
        instance.setPromedio();
        instance.setNombresEstudiante("Andrea");
        instance.setApellidosEstudiante("Vela");
        instance.setIdentificacionEstudiante("98981234");
        
        String expResult = "Nombre Estudiante: Andrea Vela\n"
                + "Cédula: 98981234\n"
                + "Notas: \n"
                + " 10.0\n"
                + " 5.0\n"
                + " 6.0\n"
                + "Promedio: 7.0\n"
                + "Mejor nota: 10.0\n"
                + "Peor nota: 5.0";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }

}
