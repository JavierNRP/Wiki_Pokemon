package dad.models.conf;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	Session session;
	Connection conn;

	public HibernateUtil() throws Exception {
		SessionFactory sessionFactory = new Configuration().configure(new File("src/dad/Models/conf/hibernate.cfg.xml"))
				.buildSessionFactory();
		session = sessionFactory.openSession();

		Class.forName("org.hsqldb.jdbcDriver");
		System.out.println("Driver cargado.");

		String url = "jdbc:hsqldb:data/pokewikidb";
		conn = DriverManager.getConnection(url, "sa", "");
		System.out.println("Conexi�n establecida.");
	}

	public Session getSession() {
		return session;
	}

}