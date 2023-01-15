package co.demoproject.Repository;

import co.demoproject.Entity.model.AdminEntity;
import co.demoproject.Entity.model.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {

}
