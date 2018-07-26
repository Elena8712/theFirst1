package CalculateNew;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {
    Sum sm;
    @Before
    public void init() {
        sm = new Sum();
    }

    @Test
    public void sum() {
    assertTrue(sm.sum(2,2) == 4);
    }
}