package cl.mauricio.duran.coding.service;

import cl.mauricio.duran.coding.models.Product;
import cl.mauricio.duran.coding.repositories.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    private Product product;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        product = new Product();
        product.setId(new Long(1));
        product.setName("Camisa Blanca Hombre Carolina Herrera");
        product.setBrand("Carolina Herrera");
        product.setSize("17");
        product.setPrice(300000.00);
        product.setPrincipal_image("https://image.vom");
        product.setOther_image("https://falabella.com");

    }

    @Test
    void listAllProduct() {
        productService.listAllProduct();
        verify(productRepository).findAll();
    }

    @Test
    void saveProduct() {
        productService.saveProduct(product);
        verify(productRepository).save(product);
       assertFalse(product.getName() == "");
    }

    @Test
    void obtenerProductoPorSku() {
        productService.obtenerProductoPorSku(product.getSku());
       assertNotNull(productRepository);
    }

    @Test
    void eliminarProductoPorId() {
       productService.eliminarProductoPorId(product.getId());

    }
}