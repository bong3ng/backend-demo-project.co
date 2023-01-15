package co.demoproject.Repository;

import co.demoproject.Entity.model.AdminEntity;
import co.demoproject.Entity.model.ListOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListOrderRepository extends JpaRepository<ListOrderEntity,Long> {

}
