import junit.framework.TestCase;
import org.mcd.Main;
import org.mcd.mcd;

import java.util.ArrayList;

public class casesTest extends TestCase {

    private final mcd objMCD = new mcd(new ArrayList<>());

    public void testMaximoComunDivisor() {
        assertEquals(3, objMCD.maximoComunDivisor(6,9));
    }

    public void testMaximoComunDivisor2() {
        assertEquals(9, objMCD.maximoComunDivisor(0,9));
    }

    public void testMaximoComunDivisor3() {
        assertEquals(0, objMCD.maximoComunDivisor(0,0));
    }

    public void testMCD_N(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(36);
        list.add(12);
        objMCD.setLista(list);
        assertEquals(2, objMCD.MCD_N());
    }

    public void testLimiteCoorecto(){
        assertTrue(Main.limiteCoorecto(0,0,Integer.MAX_VALUE));
        assertFalse(Main.limiteCoorecto(-9,0,Integer.MAX_VALUE));
    }

    public void testLimitesNum(){
        //assertEquals(null,Main.limitesNum(0,100));
    }
}
