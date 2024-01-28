package edu.upvictoria.fpoo;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ExamenTest {
    @Test
    public void Calificacion_1() throws IOException {
        float e1 =45;
        float e2=69;
        float e3=70;
        float e4 =89;
        Examen e= new Examen();
        assertEquals(44.3625, e.e(e1, e2,e3,e4));
    }
    @Test
    public void Calificacion_2() throws IOException {
        float e1 =50;
        float e2=90;
        float e3=100;
        float e4 =78;
        Examen e= new Examen();
        assertEquals(51.675, e.e(e1, e2,e3,e4));
    }   @Test
    public void Calificacion_3() throws IOException {
        float e1 =90;
        float e2=100;
        float e3=70;
        float e4 =90;
        Examen e= new Examen();
        assertEquals(61.75, e.e(e1, e2,e3,e4));
    }

}
