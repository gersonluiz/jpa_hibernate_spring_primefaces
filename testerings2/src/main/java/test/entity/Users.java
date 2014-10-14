package test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	
	@Id
	@Column(name = "codigo", nullable = false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer codigo;

	@Column(name = "username", nullable = false)
	private String username;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Users [codigo=" + codigo + ", username=" + username + "]";
	}
	
	
}
