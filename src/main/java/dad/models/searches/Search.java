package dad.models.searches;

import dad.Controller;
import dad.models.estructura.Pokemon;
import org.apache.lucene.search.Query;
import org.hibernate.Session;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.query.dsl.QueryBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que realiza busquedas Lucene en la base de datos
 */
public class Search {

    Session sesion;
    FullTextSession fullTextSesion;

    /**
     * Instancia una nueva busqueda fulltext
     * @throws Exception
     */
    public Search() throws Exception {
        sesion = Controller.getSession();
        fullTextSesion = org.hibernate.search.Search.getFullTextSession(sesion);
    }

    /**
     * @param busqueda Cadena de texto que se buscara en la base de datos por el metodo wildcard
     * @return Lista de los 5 priemros resutlkados que devuelva la busqueda wildcard
     */
    public List<Pokemon> getResultadosBusquedaPokemon(String busqueda) {
        List<Pokemon> resultadosList = new ArrayList<>();
        sesion.beginTransaction();
        QueryBuilder qb = fullTextSesion.getSearchFactory().buildQueryBuilder().forEntity(Pokemon.class).get();
		Query luceneQuery = qb.keyword().wildcard().onField("nombre").matching(busqueda.toLowerCase() + "*").createQuery();
        javax.persistence.Query query = fullTextSesion.createFullTextQuery(luceneQuery, Pokemon.class).setMaxResults(5);
        for (Object ob : query.getResultList()) {
            resultadosList.add((Pokemon) ob);
        }
        sesion.getTransaction().commit();
        
        return resultadosList;
    }

}
