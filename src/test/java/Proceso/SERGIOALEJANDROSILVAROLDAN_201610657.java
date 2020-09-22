/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

/**
 *
 * @author asus
 */

import Objetos.Carrera;
import Objetos.RegistroAcademico;
import javafx.beans.binding.Bindings;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;


public class SERGIOALEJANDROSILVAROLDAN_201610657 {
    
    AsignarHorario asig = new AsignarHorario();
    Estudiante estudiante = Mockito.mock(Estudiante.class);
    Carrera carrera = Mockito.mock(Carrera.class);
    RegistroAcademico registro = Mockito.mock(RegistroAcademico.class);
    public static AsignarHorario asignacion;

    @BeforeAll
    public static void setUp() {
        asignacion = new AsignarHorario();
    }


    @Test
    public void PruebaJornadaMixta() throws Exception {
        when(registro.getAnio()).thenReturn(2010);
        when(registro.cheequearCarnet()).thenReturn(true);
        when(carrera.getCodigo()).thenReturn(10);
        when(carrera.procesarCarrera()).thenReturn(3);
        assertEquals("Mixto", asignacion.generarHorario(carrera, registro).getDescripcion());
    }

   
 
    @Test
    public void AsignacionNoNull() {
        assertNotNull(asig, "No puede ser Null");
    }
}
