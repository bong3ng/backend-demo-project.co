package co.demoproject.Entity.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private LocalDate date;
	private Integer quantity;
	private Integer price;
	private String size;
	private String Status;
	private String category;
	private String material;
	private String describe;
	@Column(name = "url_image")
	private String urlImage;
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private List<OrderPerProductEntity> orderPerProduct;
}
