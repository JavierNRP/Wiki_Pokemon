package dad.models.conf;

import java.sql.Connection;
import java.sql.DriverManager;

import dad.PokeDexAPP;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	Session session;
	Connection conn;

	public HibernateUtil() throws Exception {
		SessionFactory sessionFactory = new Configuration().configure(PokeDexAPP.class.getResource("/hibernate.cfg.xml"))
				.buildSessionFactory();
		session = sessionFactory.openSession();

		Class.forName("org.hsqldb.jdbcDriver");
		System.out.println("Driver cargado.");

		String url = "jdbc:hsqldb:file:data/pokewikidb;shutdown=true;hsqldb.write_delay=false";
		conn = DriverManager.getConnection(url, "sa", "");
		System.out.println("Conexión establecida.");
	}

	public Session getSession() {
		return session;
	}
	
	public Connection getConn() {
		return conn;
	}

}
