
package ohtu.intjoukkosovellus;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class IntJoukkuYksiparametrisellaKonstruktorillaTest extends IntJoukkoTest {
    
    @Before
    @Override
    public void setUp() {
        joukko = new IntJoukko(3);
        joukko.lisaaLukujonoon(10);
        joukko.lisaaLukujonoon(3);
    }
    
    // perii kaikki testit luokasta IntJoukkoTest
}
