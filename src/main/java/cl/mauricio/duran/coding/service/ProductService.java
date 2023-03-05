package cl.mauricio.duran.coding.service;


import cl.mauricio.duran.coding.models.Product;
import cl.mauricio.duran.coding.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;



    public ArrayList<Product> listAllProduct(){
        return (ArrayList<Product>) productRepository.findAll();
    }

    public Product saveProduct( Product product){
        if (product.getName() == null){
            throw new IllegalArgumentException("El nombre no puede estar vacío o nulo");
        } else if (product.getBrand() == null) {
            throw new IllegalArgumentException("La marca no puede estar vacío o nulo");
        }
        return productRepository.save(product);
    }

    public Product obtenerProductoPorSku(String sku){
        return productRepository.obtenerProductoPorSku(sku);
    }

    public boolean eliminarProductoPorId(Long id){
        try {
            productRepository.deleteById(id);
            return true;
        } catch (Exception err){
            return false;
        }
    }

}
