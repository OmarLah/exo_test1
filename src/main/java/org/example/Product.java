package org.example;

public class Product {

    private int sellIn;

    private int quality;

    private String type;
    private String name;


    public Product(int sellIn, int quality, String type, String name) {
        this.sellIn = sellIn;
        this.quality = quality;
        this.type = type;
        this.name = name;
    }

    public Product Update(Product product){
        int degradation = 1;
        this.sellIn -= 1;

        if(this.type.equals("Normal")) {
            this.quality -= degradation;
        } else if (this.type.equals("Laitier")) {
            degradation *= 2;
            this.quality -= degradation;
        }
        if(product.quality > 50) {
            this.quality = 50;
        }

        if(product.type.equals("Laitier") && product.name.equals("brie vieilli")) {
            this.quality += 1;
        }
        if(product.sellIn <= 0) {
            degradation *= 2;
            this.quality -= degradation;

            if(product.quality <= 0) {
                this.quality = 0;
            }
        }


        return product;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
