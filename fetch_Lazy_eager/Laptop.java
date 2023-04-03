package fetch_Lazy_eager;
import javax.persistence.*;
@Entity
public class Laptop {
	@Id
	private int l_id;
	public int getL_id() {
		return l_id;	
	}
	public void setL_id(int l_id) {
		this.l_id = l_id;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public Student getSt() {
		return st;
	}
	public void setSt(Student st) {
		this.st = st;
	}
	private String l_name;
	
	@ManyToOne
	private Student st; 

}
