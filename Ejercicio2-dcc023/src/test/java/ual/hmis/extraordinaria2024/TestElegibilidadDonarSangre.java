package ual.hmis.extraordinaria2024;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;



public class TestElegibilidadDonarSangre {

    @ParameterizedTest
    @CsvFileSource(resources = "/datos_elegibilidad.csv", numLinesToSkip = 1)
    void testPuedeDonarSangreDesdeCSV(String pais, int edad, double peso, boolean esperado) {
        ElegibilidadDonarSangre eds = new ElegibilidadDonarSangre();
        boolean resultado = eds.puedeDonarSangre(edad, peso, pais);
        assertEquals(esperado, resultado);
    }
}

