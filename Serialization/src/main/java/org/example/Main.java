package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        String productJson = "{\"id\":1,\"name\":\"Samsung 256 GB Mobile Phone\",\"price\":1000}";
        Product product = mapper.readValue(productJson, Product.class);
        System.out.println(product.name);

        Product iphone = new Product(2L, "Iphone 256 GB", 2000L);
        System.out.println(mapper.writeValueAsString(iphone));
    }
}