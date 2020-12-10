package org.generation.blogPessoal.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;

//----------------------------------------------------------Role: Restringe o grau de privilégios---------------------------------------------------------------------- 
//-------------------------------------GrantedAuthority: Garante privilégios de acordo com o usuário, definidos pelo Adm--------------------------------- 
@Entity
public class Role implements GrantedAuthority {
	
	@Id
	private String nomeRole;
	
	//----------------------------------------ManyToMany: Muitos para muitos/ muitos usuários podem ter muitas permissões---------------------------------------

	@ManyToMany(mappedBy = "roles")
	private List<Usuario> usuarios;

	//----------------------------------//Override: Ele é uma forma de garantir que você está sobrescrevendo um método e não criando um novo--------------------

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//----------------------------------------------------Getters and Setters-----------------------------------------------------------------------------------

	public String getNomeRole() {
		return nomeRole;
	}

	public void setNomeRole(String nomeRole) {
		this.nomeRole = nomeRole;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}


