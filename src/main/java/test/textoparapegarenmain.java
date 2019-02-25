package test;

import org.hibernate.Session;

import components.TypesData;
import dad.models.conf.HibernateUtil;
import dad.models.estructura.Eficacia;
import dad.models.estructura.Evolucion;
import dad.models.estructura.MetodoEvolucion;
import dad.models.estructura.Pokemon;
import dad.models.estructura.Tipo;

public class textoparapegarenmain {

	public static void main(String[] args) throws Exception {
		HibernateUtil hibernateUtil = new HibernateUtil();
		// hibernateUtil.executeSQLCommand("create table survey (id int,name
		// varchar);");
		Session session = hibernateUtil.getSession();

		session.beginTransaction();

		Tipo normalTipo = new Tipo();
		Tipo luchaTipo = new Tipo();
		Tipo voladorTipo = new Tipo();
		Tipo venenoTipo = new Tipo();
		Tipo tierraTipo = new Tipo();
		Tipo rocaTipo = new Tipo();
		Tipo bichoTipo = new Tipo();
		Tipo fantasmaTipo = new Tipo();
		Tipo aceroTipo = new Tipo();
		Tipo fuegoTipo = new Tipo();
		Tipo aguaTipo = new Tipo();
		Tipo plantaTipo = new Tipo();
		Tipo electricoTipo = new Tipo();
		Tipo psiquicoTipo = new Tipo();
		Tipo hieloTipo = new Tipo();
		Tipo dragonTipo = new Tipo();
		Tipo siniestroTipo = new Tipo();
		Tipo hadaTipo = new Tipo();

//		para pegar  |||  3 Pokemon
//					VVV

//		Gastly Haunter Gengar

		Pokemon gastlyPokemon = new Pokemon();
		gastlyPokemon.setNombre("Gastly");
		gastlyPokemon.getTipos().add(fantasmaTipo);
		gastlyPokemon.getTipos().add(venenoTipo);

		Pokemon haunterPokemon = new Pokemon();
		haunterPokemon.setNombre("Haunter");
		haunterPokemon.getTipos().add(fantasmaTipo);
		haunterPokemon.getTipos().add(venenoTipo);

		Pokemon gengarPokemon = new Pokemon();
		gengarPokemon.setNombre("Gengar");
		gengarPokemon.getTipos().add(fantasmaTipo);
		gengarPokemon.getTipos().add(venenoTipo);

		Evolucion evolucionGastlyHaunter = new Evolucion();
		evolucionGastlyHaunter.getPokemons().add(gastlyPokemon);
		evolucionGastlyHaunter.getPokemons().add(haunterPokemon);
		evolucionGastlyHaunter.setMetodo(MetodoEvolucion.NIVEL);

		Evolucion evolucionHaunterGengar = new Evolucion();
		evolucionHaunterGengar.getPokemons().add(haunterPokemon);
		evolucionHaunterGengar.getPokemons().add(gengarPokemon);
		evolucionHaunterGengar.setMetodo(MetodoEvolucion.INTERCAMBIO);

		gastlyPokemon.getEvoluciones().add(evolucionGastlyHaunter);
		haunterPokemon.getEvoluciones().add(evolucionHaunterGengar);
		session.save(evolucionGastlyHaunter);
		session.save(evolucionHaunterGengar);

		session.save(gastlyPokemon);
		session.save(haunterPokemon);
		session.save(gengarPokemon);

//		para pegar  |||  2 Pokemon
//					VVV

//		Rhyhorn Rhydon

		Pokemon rhyhornPokemon = new Pokemon();
		rhyhornPokemon.setNombre("Rhyhorn");
		rhyhornPokemon.getTipos().add(tierraTipo);
		rhyhornPokemon.getTipos().add(rocaTipo);

		Pokemon rhydonPokemon = new Pokemon();
		rhydonPokemon.setNombre("Rhydon");
		rhydonPokemon.getTipos().add(tierraTipo);
		rhydonPokemon.getTipos().add(rocaTipo);

		Evolucion evolucionRhyhornRhydon = new Evolucion();
		evolucionRhyhornRhydon.getPokemons().add(rhyhornPokemon);
		evolucionRhyhornRhydon.getPokemons().add(rhydonPokemon);
		evolucionRhyhornRhydon.setMetodo(MetodoEvolucion.NIVEL);

		rhyhornPokemon.getEvoluciones().add(evolucionRhyhornRhydon);
		session.save(evolucionRhyhornRhydon);

		session.save(rhyhornPokemon);
		session.save(rhydonPokemon);

//		para pegar  |||  1 Pokemon
//					VVV

//		Porygon

		Pokemon porygonPokemon = new Pokemon();
		porygonPokemon.setNombre("Porygon");
		porygonPokemon.getTipos().add(normalTipo);

		session.save(porygonPokemon);
	}
}
