package ifba.exemplo.model;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import java.util.List;

public class UsuarioDAO {
	public List<Usuario> getListarTodos() {
		Session s = Hibernate.getSessionFactory().openSession();
		SQLQuery query = s.createSQLQuery("select * from usuario");
		query.addEntity(Usuario.class);
		List<Usuario> lista = query.list();
		s.close();
		return lista;
	}
	
	/*public static void main (String [] args) {
		UsuarioDAO u = new UsuarioDAO();
		List<Usuario> ul = u.getListarTodos();
		for(Usuario usuario : ul) {
			System.out.println(usuario.getNm_usuario());
		
		}
		
	}*/
}
