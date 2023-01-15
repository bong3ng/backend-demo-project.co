package co.demoproject.Entity.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "list_order")
public class ListOrderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate date;
	@OneToMany(mappedBy = "listOrder")
	private List<OrderPerProductEntity> orderPerProduct;
	private String status;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private CustomerEntity customer;
}
