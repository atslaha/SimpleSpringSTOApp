package DemoTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Demo.Demo;

public class DemoTest {
    
    @Test
    public void shouldReturneTrue(){
        Demo demo = new Demo();
        assertTrue(demo.getBool());
    }
    
    @Test
    public void shouldReturnTrue1(){
        Demo demo = new Demo();
        assertTrue(demo.getBool2());
    }

}
