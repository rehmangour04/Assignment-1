package com.careercamp.service;

import com.careercamp.dao.ProductDAO; // all the functionalities will be there
import com.careercamp.dto.ProductDTO;
import com.careercamp.exception.ProductNotFoundException;

import java.awt.print.Pageable;

public class ProductService {
    
    ProductDAO productDAO = new ProductDAO();
//    ProductDTO productDTO = new ProductDTO();

    public void addProduct()
    {
        ProductDTO[] productDTO = productDAO.addProduct();
        for (ProductDTO productDis: productDTO)
        {
            System.out.println("------");
            System.out.println(productDis.getProdId());
        }
        System.out.println();
    }

    public void displayProductServie()
    {
        ProductDTO[] productdto = productDAO.displayProduct();
        for(ProductDTO displayProduct : productdto)
        {
            System.out.println("-------");

            System.out.println(displayProduct);
        }
        System.out.println();
    }
    public void deleteProductService(int id) throws ProductNotFoundException
    {
        int status = productDAO.deleteProduct(id);
        if(status == 1)
        {
            System.out.println("Product main: "+ id + " deleted successfully");
        }
        else
        {
            throw  new ProductNotFoundException("Not Found");
        }
    }

    public void updateProductService(int id) throws ProductNotFoundException
    {
        int status = productDAO.updateProduct(id);
        if(status == 1)
        {
            System.out.println("Product main: "+ id + " updated successfully");
        }
        else
        {
            throw  new ProductNotFoundException("Not Found");
        }
    }

    public void searchProductByIdService(int id) throws ProductNotFoundException
    {
        ProductDTO mainProduct = productDAO.searchProductByIdDAO(id);
        if(mainProduct!=null)
        {
            System.out.println("Searched product by id is : "+ mainProduct);

        }
        else
        {
            throw  new ProductNotFoundException("Not Found");

        }
    }

    public void searchProductByProdNameByService(String name) throws ProductNotFoundException
    {
        ProductDTO mainProduct = productDAO.searchProductByNameDAO(name);
        if(mainProduct!=null)
        {
            System.out.println("Searched product by name is : "+ mainProduct);

        }
        else
        {
            throw  new ProductNotFoundException("Not Found");
        }
    }

        public void displayProductServiceAscendingByService()
        {
           ProductDTO[] prod = productDAO.displayProductServiceAscending();
           for(ProductDTO finalRes: prod)
           {
               System.out.println(finalRes);
           }
        }
    }
