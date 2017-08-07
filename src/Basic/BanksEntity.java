package Basic;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Banks
 *
 */
@Entity
@Table(name="BANKS")
public class BanksEntity implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	Long Id;
	@Column(name="Name")
	String Name;
	@Column(name="SwiftCode")
	String SwiftCode;
	
	
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

	public String getSwiftCode() {
		return SwiftCode;
	}

	public void setSwiftCode(String swiftCode) {
		SwiftCode = swiftCode;
	}

	private static final long serialVersionUID = 1L;

	public BanksEntity() {
		super();
	}
   
}
