package io.jenkins.tools;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
class MainTest {

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp() throws InterruptedException {
        Integer it = Integer.getInteger("iterations");
        if (it == null) {
            assertTrue(false);
        }
        if (it != null) {
            for (int i = 0; i < it; i++) {
                Thread.sleep(1000);
                System.out.println("Iteration " + i);
            }
            return;
        }
    }

    /**
     * Rigourous Test :-)
     */
    @Test
    public void anotherTest() throws InterruptedException {
        Integer it = Integer.getInteger("iterations");
        if (it == null) {
            assertTrue(false);
        }
        if (it != null) {
            for (int i = 0; i < it; i++) {
                Thread.sleep(1000);
                System.out.println("Iteration " + i);
            }
            return;
        }
    }

}
