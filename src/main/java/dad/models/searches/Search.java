package dad.models.searches;

import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.search.Query;
import org.hibernate.Session;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.query.dsl.QueryBuilder;

import dad.models.conf.HibernateUtil;
import dad.models.estructura.Pokemon;

public class Search {

	HibernateUtil hibernateUtil;
	Session sesion;
	FullTextSession fullTextSesion;

	public Search() throws Exception{
		hibernateUtil = new HibernateUtil();
		sesion = hibernateUtil.getSession();
		fullTextSesion = org.hibernate.search.Search.getFullTextSession(sesion);
	}

	public List<Pokemon> getResultadosBusquedaPokemon(String busqueda) {
		List<Pokemon> resultadosList = new ArrayList<>();
		sesion.getTransaction().begin();
		QueryBuilder qb = fullTextSesion.getSearchFactory().buildQueryBuilder().forEntity(Pokemon.class).get();
		Query luceneQuery = qb.keyword().onField("nombre").matching(busqueda).createQuery();
		javax.persistence.Query query = fullTextSesion.createFullTextQuery(luceneQuery, Pokemon.class).setMaxResults(5);
		for (Object ob : query.getResultList()) {
			resultadosList.add((Pokemon) ob);
		}
		sesion.getTransaction().commit();
		sesion.close();
		return resultadosList;
	}

}