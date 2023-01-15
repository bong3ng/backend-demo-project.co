package co.demoproject.Entity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "order_per_product")
public class OrderPerProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "quantity_order")
	private Integer quantityOrder;
	@ManyToOne
	@JoinColumn(name = "list_oder_id")
	private ListOrderEntity listOrder;
	@ManyToOne
	@JoinColumn(name = "product_name_id")
	private ProductEntity product;
}
