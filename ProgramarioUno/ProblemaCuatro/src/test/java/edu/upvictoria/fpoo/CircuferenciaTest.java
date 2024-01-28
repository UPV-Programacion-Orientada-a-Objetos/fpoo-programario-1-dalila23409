package edu.upvictoria.fpoo;
import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.assertEquals;

public class CircuferenciaTest {
    @Test
    public void area_1(){
        double r= 8;
        Area a= new Area();
        assertEquals(40, a.area(r));
    }
}
