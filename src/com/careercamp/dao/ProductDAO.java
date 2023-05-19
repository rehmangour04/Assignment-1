package com.careercamp.dao;

import com.careercamp.dto.ProductDTO;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ProductDAO {

    ProductDTO[] productDTO = new ProductDTO[10];
    public Random rand = new Random();

    public ProductDTO[] addProduct() {
        for (int i = 0; i < 10; i++) {
            productDTO[i] = new ProductDTO(
                    i, "items: " + i,
                    rand.nextInt(),
                    rand.nextInt(100),
                    rand.nextInt(20));
        }
        return productDTO;
    }

    public ProductDTO[] displayProduct() {
//    for(int i = 0 ; i < 10; i++)
//    {
//        productDTO[i] = new ProductDTO(
//                i, "items: " +i ,
//                rand.nextInt(),
//                rand.nextInt(100),
//                rand.nextInt(20));
//    }
        return productDTO;
    }

    public int deleteProduct(int id) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (productDTO[i].getProdId() == id) {
                productDTO[i] = new ProductDTO(100, "items" + 100, rand.nextInt(), rand.nextInt(), rand.nextInt());
                count = 1;
            }
        }
        return count;
    }

    public int updateProduct(int id) // 4
    {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (productDTO[i].getProdId() == id) {
                productDTO[i] = productDTO[0];
                count = 1;
            }
        }
        return count;
    }

    public ProductDTO searchProductByIdDAO(int id) {
        ProductDTO search = null;
        for (int i = 0; i < 10; i++) {
            if (productDTO[i].getProdId() == id) {
                return productDTO[i];
            }
        }
        return search;
    }

    public ProductDTO searchProductByNameDAO(String name) {
        ProductDTO search = null;
        for (int i = 0; i < 10; i++) {
            if (productDTO[i].getProdName() == name) {
                return productDTO[i];
            }
        }
        return search;
    }

    public ProductDTO[] displayProductServiceAscending() {
         Arrays.asList(productDTO).sort(Comparator.comparing(ProductDTO::getPrice));
         return productDTO;
    }
}

