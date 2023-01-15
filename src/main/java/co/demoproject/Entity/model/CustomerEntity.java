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
@Table(name = "customer")
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@Column(name = "number_contact")
	private String numberContact;
	private String email;
	private String address;
	@Column(name = "first_order")
	private LocalDate firstOrder;
	@Column(name = "last_order")
	private LocalDate lastOrder;
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<ListOrderEntity> listOrder;
}
