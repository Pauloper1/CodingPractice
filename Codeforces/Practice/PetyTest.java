package Codeforces.Practice;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test;
// import org.junit.Assert.assertEquals;
public class PetyTest {
    Solver solver;


    @Test
    public void test1(){
        assertEquals(0, new Solver().solve("aaa", "aaA"));
    }
    @Test
    public void test2(){
        assertEquals(-1,new Solver().solve("aaa", "aab"));
    }
    @Test
    public void test3(){
        assertEquals(1,new Solver().solve("aac", "aab"));
    }

}
