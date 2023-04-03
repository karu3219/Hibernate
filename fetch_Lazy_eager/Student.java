package fetch_Lazy_eager;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.*;
import javax.persistence.OneToMany;

@Entity
public class Student 
{	
	@OneToMany(mappedBy="st",fetch=FetchType.EAGER)
	Collection<Laptop> lap = new ArrayList<>();
	public Collection<Laptop> getLap() {
		return lap;
	}
	public void setLap(Collection<Laptop> lap) {
		this.lap = lap;
	}
	@Id
	private int s_id;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	@Override
	public String toString() {
		return "Student [lap=" + lap + ", s_id=" + s_id + ", name=" + name + "]";
	}
	
}
