package Basic;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Table(name="Users")
public class UserEntity implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	Long Id;
	@Column(name="Name")
	String Name;
	@Column(name="Access")
	String Access;
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAccess() {
		return Access;
	}

	public void setAccess(String access) {
		Access = access;
	}
	
	private static final long serialVersionUID = 1L;

	public UserEntity() {
		super();
	}
}
