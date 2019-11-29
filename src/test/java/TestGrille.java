import org.junit.Assert;
import org.junit.Test;

/**
 * Tests unitaire pour la classe Grille.
 **/
public class TestGrille {

    /**
     * Instantiation.
     */
    private GrilleImpl grilleInstance = new GrilleImpl(9);

    /**
     * Test pour la fonction getValue.
     **/
    @Test
    public void testgetValue() {
        int x = 2;
        int y = 2;
        char valeur = '1';
        grilleInstance.setValue(x, y, valeur);
        Assert.assertEquals(valeur, grilleInstance.getValue(x, y));
    }

    /**
     * Test pour la fonction complete.
     **/
    @Test
    public void testcomplete() {
        int x = 3;
        int y = 3;
        char valeur = '1';
        grilleInstance.setValue(x, y, valeur);
        Assert.assertFalse(grilleInstance.complete());
    }

    /**
     * Test pour la fonction complete.
     **/
    @Test
    public void testcomplete2() {
        String set1 = "123456789";
        String set2 = "456789123";
        String set3 = "789123456";
        String set4 = "234567891";
        String set5 = "567891234";
        String set6 = "891234567";
        String set7 = "345678912";
        String set8 = "678912345";
        String set9 = "912345678";
        for (int x = 0; x < 9; x++) {
            grilleInstance.setValue(x, 0, set1.charAt(x));
            grilleInstance.setValue(x, 1, set2.charAt(x));
            grilleInstance.setValue(x, 2, set3.charAt(x));
            grilleInstance.setValue(x, 3, set4.charAt(x));
            grilleInstance.setValue(x, 4, set5.charAt(x));
            grilleInstance.setValue(x, 5, set6.charAt(x));
            grilleInstance.setValue(x, 6, set7.charAt(x));
            grilleInstance.setValue(x, 7, set8.charAt(x));
            grilleInstance.setValue(x, 8, set9.charAt(x));
        }
        Assert.assertTrue(grilleInstance.complete());
    }

    /**
     * Test pour la fonction getDimension.
     **/
    @Test
    public void testgetDimension() {
        Assert.assertEquals(9, grilleInstance.getDimension());
    }

    /**
     * Test pour la fonction possible.
     **/
    @Test
    public void testpossible() {
        int x = 2;
        int y = 2;
        char valeur = '1';
        grilleInstance.setValue(x, y, valeur);
        Assert.assertFalse(grilleInstance.possible(2, 3, '1'));
    }

    /**
     * Test pour la fonction possible.
     **/
    @Test
    public void testpossible2() {
        int x = 2;
        int y = 2;
        char valeur = '1';
        grilleInstance.setValue(x, y, valeur);
        Assert.assertTrue(grilleInstance.possible(2, 3, '2'));
    }
}

