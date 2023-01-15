package co.demoproject.Repository;

import co.demoproject.Entity.model.AdminEntity;
import co.demoproject.Entity.model.OrderPerProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderPerProductRepository extends JpaRepository<OrderPerProductEntity,Long> {

}
