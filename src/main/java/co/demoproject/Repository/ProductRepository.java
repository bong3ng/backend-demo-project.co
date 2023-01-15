package co.demoproject.Repository;

import co.demoproject.Entity.model.AdminEntity;
import co.demoproject.Entity.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {

}
