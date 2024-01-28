package edu.upvictoria.fpoo;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class AreaTest {
    @Test
    public void area_rectangulo_1(){
        int b = 8;
        int h=5;
        Area r= new Area();
        assertEquals(40, r.area(b, h));
    }
    @Test
    public void area_rectangulo_2(){
        int b = 4;
        int h=90;
        Area r= new Area();
        assertEquals(360, r.area(b, h));

    }

    @Test
    public void area_rectangulo_3(){
        int b = 7;
        int h=9;
        Area r= new Area();
        assertEquals(63, r.area(b, h));
    }

}


