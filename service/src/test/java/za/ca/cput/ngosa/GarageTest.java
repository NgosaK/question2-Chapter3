package za.ca.cput.ngosa;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import za.ca.cput.ngosa.Impl.AeroImpl;
import za.ca.cput.ngosa.Impl.PaganiImpl;
import za.ca.cput.ngosa.Impl.TeslaImpl;

/**
 * Created by User on 2015/02/20.
 */
public class GarageTest extends TestCase {

    AeroImpl atom;
    PaganiImpl huayra;
    TeslaImpl x;

    @Before
        public void setUp()throws Exception
        {
            atom= new AeroImpl();
            huayra= new PaganiImpl();
            x= new TeslaImpl();
        }
    @After
    public void tearDown() throws Exception
    {
        atom=null;
        huayra=null;
        x=null;
    }

    @org.junit.Test
    public  void testName()
    {
        assertEquals("zonda",huayra.name("huayra"));
    }

    @org.junit.Test
    public  void testCate()
    {
        assertEquals("exotic",x.category("hybrid"));
    }

    @org.junit.Test
    public  void testValue()
    {
        assertEquals(5000,x.value(654));
    }

    @org.junit.Test
    public  void testBHP()
    {
        assertEquals(500, atom.bhp(544));
    }

    @org.junit.Test
    public  void testColor()
    {
        assertEquals("yellow",atom.colour("blue"));
    }







}

