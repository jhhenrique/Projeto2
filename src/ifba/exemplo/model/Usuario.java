package ifba.exemplo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	@Column(name="id_usuario")
	private int id_usuario;
	
	@Column(name="nm_usuario")
	private String nm_usuario;
	
	@Column(name="dt_cadastro")
	private Date dt_cadastro;
	
	@Column(name="sexo")
	private String sexo;
	
	@Column(name="email")
	private String email;
	
	@Column(name="senha")
	private String senha;
	
	public Usuario(int id_usuario, String nm_usuario, Date dt_cadastro, String sexo, String email, String senha) {
		super();
		this.id_usuario = id_usuario;
		this.nm_usuario = nm_usuario;
		this.dt_cadastro = dt_cadastro;
		this.sexo = sexo;
		this.email = email;
		this.senha = senha;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNm_usuario() {
		return nm_usuario;
	}

	public void setNm_usuario(String nm_usuario) {
		this.nm_usuario = nm_usuario;
	}

	public Date getDt_cadastro() {
		return dt_cadastro;
	}

	public void setDt_cadastro(Date dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
