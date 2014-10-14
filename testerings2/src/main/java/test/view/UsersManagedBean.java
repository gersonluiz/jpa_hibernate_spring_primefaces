package test.view;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import test.entity.Users;

@ManagedBean(name = "usersMB")
public class UsersManagedBean {

	private Users users;

	@PostConstruct
	public void reloadForm() {
		users = new Users();
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public void confirmar() {

		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Successful", "Incluído  " + users + "! "));
		context.addMessage(null, new FacesMessage("Second Message", "Additional Message Detail"));

		reloadForm();
	}

}
