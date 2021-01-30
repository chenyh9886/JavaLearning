package cn.chenyh.bulider;

/**
 * @version 1.0.0
 * @Description: 建造者模式
 * @author: chenYH
 * @date: 2021/1/30 12:29
 */
public class ProductBuilder {

    private String name;

    private Float price;

    public ProductBuilder() {}
    public ProductBuilder(Builder builder) {
        this.name= builder.name;
        this.price = builder.price;
    }

    private static class Builder {
        private String name;

        private Float price;

        public Builder(){}

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(Float price) {
            this.price = price;
            return this;
        }

        public ProductBuilder build() {
            return new ProductBuilder(this);
        }
    }

    public static void main(String[] args) {
        ProductBuilder build = new Builder().price(2.0f).name("2222").build();
    }
}
