package domain;

/**
 * Created by aubrey on 25/03/2017.
 */

import junit.framework.TestCase;
import junit.framework.Assert;

public class CollectionClassTest extends TestCase{

    CollectionClass list = new CollectionClass();

    public void testCarBrandlist(){
        Assert.assertEquals(list.cars().get(0),"BMW");
    }

    public void testLaptopBrands(){
        Assert.assertEquals(list.laptop().size(),6);
    }

    public void testDogBreeds(){
        Assert.assertEquals("Boxer", list.dogs().get(7));
    }
}
