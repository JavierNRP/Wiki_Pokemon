package test;

import org.hibernate.Session;

import dad.models.conf.HibernateUtil;
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

//		Dratini Dragonair Dragonite

		Pokemon dratiniPokemon = new Pokemon();
		dratiniPokemon.setNombre("Dratini");
		dratiniPokemon.getTipos().add(dragonTipo);

		Pokemon dragonairPokemon = new Pokemon();
		dragonairPokemon.setNombre("Dragonair");
		dragonairPokemon.getTipos().add(dragonTipo);

		Pokemon dragonitePokemon = new Pokemon();
		dragonitePokemon.setNombre("Dragonite");
		dragonitePokemon.getTipos().add(dragonTipo);
		dragonitePokemon.getTipos().add(voladorTipo);

		Evolucion evolucionDratiniDragonair = new Evolucion();
		evolucionDratiniDragonair.getPokemons().add(dratiniPokemon);
		evolucionDratiniDragonair.getPokemons().add(dragonairPokemon);
		evolucionDratiniDragonair.setMetodo(MetodoEvolucion.NIVEL);

		Evolucion evolucionDragonairDragonite = new Evolucion();
		evolucionDragonairDragonite.getPokemons().add(dragonairPokemon);
		evolucionDragonairDragonite.getPokemons().add(dragonitePokemon);
		evolucionDragonairDragonite.setMetodo(MetodoEvolucion.NIVEL);

		dratiniPokemon.getEvoluciones().add(evolucionDratiniDragonair);
		dragonairPokemon.getEvoluciones().add(evolucionDragonairDragonite);
		session.save(evolucionDratiniDragonair);
		session.save(evolucionDragonairDragonite);

		session.save(dratiniPokemon);
		session.save(dragonairPokemon);
		session.save(dragonitePokemon);

//		para pegar  |||  2 Pokemon
//					VVV

//		Kabuto Kabutops

		Pokemon kabutoPokemon = new Pokemon();
		kabutoPokemon.setNombre("Kabuto");
		kabutoPokemon.getTipos().add(rocaTipo);
		kabutoPokemon.getTipos().add(aguaTipo);

		Pokemon kabutopsPokemon = new Pokemon();
		kabutopsPokemon.setNombre("Kabutops");
		kabutopsPokemon.getTipos().add(rocaTipo);
		kabutopsPokemon.getTipos().add(aguaTipo);

		Evolucion evolucionKabutoKabutops = new Evolucion();
		evolucionKabutoKabutops.getPokemons().add(kabutoPokemon);
		evolucionKabutoKabutops.getPokemons().add(kabutopsPokemon);
		evolucionKabutoKabutops.setMetodo(MetodoEvolucion.NIVEL);

		kabutoPokemon.getEvoluciones().add(evolucionKabutoKabutops);
		session.save(evolucionKabutoKabutops);

		session.save(kabutoPokemon);
		session.save(kabutopsPokemon);

//		para pegar  |||  1 Pokemon
//					VVV

//		Mew

		Pokemon mewPokemon = new Pokemon();
		mewPokemon.setNombre("Mew");
		mewPokemon.getTipos().add(psiquicoTipo);

		session.save(mewPokemon);

//		para pegar  |||  datos adicionales
//					VVV
//		.setAltura(", m");
//		.setPeso(", Kg");
//		.setDescripcion("");
		
	}
}
