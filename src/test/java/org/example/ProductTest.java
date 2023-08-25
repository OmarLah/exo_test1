package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class ProductTest {


    @Test
    public void testUpdateWhenSellInIs0(){

        Product product  = new Product(7, 2, "Normal", "Carotte");

        product.setSellIn(0);

        Product result = product.Update(product);

        Assertions.assertTrue(result.getQuality() == 0);
    }

    @Test
    public void testUpdateWhenQualityNotNegatif(){

        Product product  = new Product(0, -3, "Normal", "Carotte");

        Product result = product.Update(product);

        Assertions.assertTrue(result.getQuality() >= 0);
    }

    @Test
    public void testUpdateQualityProductNotSup50(){

        Product product  = new Product(7, 60, "Normal", "Carotte");

        Product result = product.Update(product);

        Assertions.assertTrue(result.getQuality() <= 50);
    }

    @Test
    public void testUpdateQualityWhenProducctIsBrieVieilli(){

        Product product  = new Product(7, 50, "Laitier", "brie vieilli");

        Product result = product.Update(product);

        Assertions.assertTrue(result.getQuality() <= 50);
    }

    @Test
    public void testUpdateQualityWhenProductIsTypeLaitier(){

        Product product  = new Product(7, 4, "Laitier", "fromage");

        Product result = product.Update(product);

        Assertions.assertTrue(result.getQuality() == 2);
    }

    @Test
    public void testUpdateQualityWhenProductIsTypeNormal(){

        Product product  = new Product(7, 4, "Normal", "fromage");

        Product result = product.Update(product);

        Assertions.assertTrue(result.getQuality() == 3);
    }

}
