package hibernate_caching.caching_level_1;
import javax.persistence.*;

@Entity
public class Customer_Details 
{
	@Id
	private int customer_id;
	private String customer_name;
	private String purchased_item;
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getPurchased_item() {
		return purchased_item;
	}
	public void setPurchased_item(String purchased_item) {
		this.purchased_item = purchased_item;
	}
}

