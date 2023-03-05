package cl.mauricio.duran.coding.controller;

import cl.mauricio.duran.coding.models.Product;
import cl.mauricio.duran.coding.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping()
    public ArrayList<Product> listarProducts(){
        return  productService.listAllProduct();
    }

    @GetMapping("/{sku}")
    public Product obtenerProductoPorSku(@PathVariable("sku") String sku){
        return this.productService.obtenerProductoPorSku(sku);
    }

    @PostMapping()
    public Product saveProduct(@RequestBody Product product){
        return this.productService.saveProduct(product);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarProductoPorId(@PathVariable("id") Long id){
        boolean ok = this.productService.eliminarProductoPorId(id);
        if(ok){
            return "Se eliminó producto con ID  " + id;
        }else {
            return  "No se pudo eliminar producto por ID" +id;
        }
    }

}
