package mis.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "customerRank")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class CustomerRank implements Serializable {
	private static final long serialVersionUID = 48L;
	// 消息类的标识属性
	//ID
	@Id@Column(name="customerRank_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerRankId;
	@OneToOne(targetEntity=Customer.class)
	@JoinColumn(name="customer_id", nullable=false )
	private Customer customer;
	@ManyToOne(targetEntity=Rank.class)
	@JoinColumn(name="rank_id", nullable=false )
	private Rank rank;
	public CustomerRank() {
		super();
	}
	public CustomerRank(Integer customerRankId, Customer customer, Rank rank) {
		super();
		this.customerRankId = customerRankId;
		this.customer = customer;
		this.rank = rank;
	}
	public Integer getCustomerRankId() {
		return customerRankId;
	}
	public void setCustomerRankId(Integer customerRankId) {
		this.customerRankId = customerRankId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerRank other = (CustomerRank) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (rank == null) {
			if (other.rank != null)
				return false;
		} else if (!rank.equals(other.rank))
			return false;
		return true;
	}
	
	
	
}
