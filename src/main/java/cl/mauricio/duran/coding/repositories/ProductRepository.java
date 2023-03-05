package cl.mauricio.duran.coding.repositories;

import cl.mauricio.duran.coding.models.Product;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends CrudRepository<Product, Long> , JpaSpecificationExecutor{

    @Query(value="SELECT * from products where sku = :sku ", nativeQuery = true)
    Product obtenerProductoPorSku(String sku);


}
