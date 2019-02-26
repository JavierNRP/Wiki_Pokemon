package dad.models;

import org.hibernate.Session;

import dad.models.conf.HibernateUtil;
import dad.models.estructura.Eficacia;
import dad.models.estructura.Evolucion;
import dad.models.estructura.MetodoEvolucion;
import dad.models.estructura.Pokemon;
import dad.models.estructura.Tipo;

/**
 * Clase con un metodo estático que inserta los datos en la base de datos
 */
public class InsertData {

	/**
	 * Crea todos los 151 pokemons y los inserta en la base de datos hibernate
	 * @throws Exception
	 */
	public static void insertarDatos() throws Exception {
		HibernateUtil hibernateUtil = new HibernateUtil();
		// hibernateUtil.executeSQLCommand("create table survey (id int,name
		// varchar);");
		Session session = hibernateUtil.getSession();
		
		session.beginTransaction();
		
		Tipo normalTipo = new Tipo();
		normalTipo.setNombre("Normal");
		for (int i = 0; i < TypesData.typeDamage[0].length; i++) {
			if (TypesData.typeDamage[0][i] == 1) {
				normalTipo.getEficacias().add(Eficacia.NORMAL);
			} else if (TypesData.typeDamage[0][i] == 2) {
				normalTipo.getEficacias().add(Eficacia.MUYEFICAZ);
			} else if (TypesData.typeDamage[0][i] == 0.5) {
				normalTipo.getEficacias().add(Eficacia.POCOEFICAZ);
			} else if (TypesData.typeDamage[0][i] == 0) {
				normalTipo.getEficacias().add(Eficacia.INEFICAZ);
			}
		}
		session.save(normalTipo);

		Tipo luchaTipo = new Tipo();
		luchaTipo.setNombre("Lucha");
		for (int i = 0; i < TypesData.typeDamage[0].length; i++) {
			if (TypesData.typeDamage[1][i] == 1) {
				luchaTipo.getEficacias().add(Eficacia.NORMAL);
			} else if (TypesData.typeDamage[1][i] == 2) {
				luchaTipo.getEficacias().add(Eficacia.MUYEFICAZ);
			} else if (TypesData.typeDamage[1][i] == 0.5) {
				luchaTipo.getEficacias().add(Eficacia.POCOEFICAZ);
			} else if (TypesData.typeDamage[1][i] == 0) {
				luchaTipo.getEficacias().add(Eficacia.INEFICAZ);
			}
		}
		session.save(luchaTipo);

		Tipo voladorTipo = new Tipo();
		voladorTipo.setNombre("Volador");
		for (int i = 0; i < TypesData.typeDamage[0].length; i++) {
			if (TypesData.typeDamage[2][i] == 1) {
				voladorTipo.getEficacias().add(Eficacia.NORMAL);
			} else if (TypesData.typeDamage[2][i] == 2) {
				voladorTipo.getEficacias().add(Eficacia.MUYEFICAZ);
			} else if (TypesData.typeDamage[2][i] == 0.5) {
				voladorTipo.getEficacias().add(Eficacia.POCOEFICAZ);
			} else if (TypesData.typeDamage[2][i] == 0) {
				voladorTipo.getEficacias().add(Eficacia.INEFICAZ);
			}
		}
		session.save(voladorTipo);

		Tipo venenoTipo = new Tipo();
		venenoTipo.setNombre("Veneno");
		for (int i = 0; i < TypesData.typeDamage[0].length; i++) {
			if (TypesData.typeDamage[3][i] == 1) {
				venenoTipo.getEficacias().add(Eficacia.NORMAL);
			} else if (TypesData.typeDamage[3][i] == 2) {
				venenoTipo.getEficacias().add(Eficacia.MUYEFICAZ);
			} else if (TypesData.typeDamage[3][i] == 0.5) {
				venenoTipo.getEficacias().add(Eficacia.POCOEFICAZ);
			} else if (TypesData.typeDamage[3][i] == 0) {
				venenoTipo.getEficacias().add(Eficacia.INEFICAZ);
			}
		}
		session.save(venenoTipo);

		Tipo tierraTipo = new Tipo();
		tierraTipo.setNombre("Tierra");
		for (int i = 0; i < TypesData.typeDamage[0].length; i++) {
			if (TypesData.typeDamage[4][i] == 1) {
				tierraTipo.getEficacias().add(Eficacia.NORMAL);
			} else if (TypesData.typeDamage[4][i] == 2) {
				tierraTipo.getEficacias().add(Eficacia.MUYEFICAZ);
			} else if (TypesData.typeDamage[4][i] == 0.5) {
				tierraTipo.getEficacias().add(Eficacia.POCOEFICAZ);
			} else if (TypesData.typeDamage[4][i] == 0) {
				tierraTipo.getEficacias().add(Eficacia.INEFICAZ);
			}
		}
		session.save(tierraTipo);

		Tipo rocaTipo = new Tipo();
		rocaTipo.setNombre("Roca");
		for (int i = 0; i < TypesData.typeDamage[0].length; i++) {
			if (TypesData.typeDamage[5][i] == 1) {
				rocaTipo.getEficacias().add(Eficacia.NORMAL);
			} else if (TypesData.typeDamage[5][i] == 2) {
				rocaTipo.getEficacias().add(Eficacia.MUYEFICAZ);
			} else if (TypesData.typeDamage[5][i] == 0.5) {
				rocaTipo.getEficacias().add(Eficacia.POCOEFICAZ);
			} else if (TypesData.typeDamage[5][i] == 0) {
				rocaTipo.getEficacias().add(Eficacia.INEFICAZ);
			}
		}
		session.save(rocaTipo);

		Tipo bichoTipo = new Tipo();
		bichoTipo.setNombre("Bicho");
		for (int i = 0; i < TypesData.typeDamage[0].length; i++) {
			if (TypesData.typeDamage[6][i] == 1) {
				bichoTipo.getEficacias().add(Eficacia.NORMAL);
			} else if (TypesData.typeDamage[6][i] == 2) {
				bichoTipo.getEficacias().add(Eficacia.MUYEFICAZ);
			} else if (TypesData.typeDamage[6][i] == 0.5) {
				bichoTipo.getEficacias().add(Eficacia.POCOEFICAZ);
			} else if (TypesData.typeDamage[6][i] == 0) {
				bichoTipo.getEficacias().add(Eficacia.INEFICAZ);
			}
		}
		session.save(bichoTipo);

		Tipo fantasmaTipo = new Tipo();
		fantasmaTipo.setNombre("Fantasma");
		for (int i = 0; i < TypesData.typeDamage[0].length; i++) {
			if (TypesData.typeDamage[7][i] == 1) {
				fantasmaTipo.getEficacias().add(Eficacia.NORMAL);
			} else if (TypesData.typeDamage[7][i] == 2) {
				fantasmaTipo.getEficacias().add(Eficacia.MUYEFICAZ);
			} else if (TypesData.typeDamage[7][i] == 0.5) {
				fantasmaTipo.getEficacias().add(Eficacia.POCOEFICAZ);
			} else if (TypesData.typeDamage[7][i] == 0) {
				fantasmaTipo.getEficacias().add(Eficacia.INEFICAZ);
			}
		}
		session.save(fantasmaTipo);

		Tipo aceroTipo = new Tipo();
		aceroTipo.setNombre("Acero");
		for (int i = 0; i < TypesData.typeDamage[0].length; i++) {
			if (TypesData.typeDamage[8][i] == 1) {
				aceroTipo.getEficacias().add(Eficacia.NORMAL);
			} else if (TypesData.typeDamage[8][i] == 2) {
				aceroTipo.getEficacias().add(Eficacia.MUYEFICAZ);
			} else if (TypesData.typeDamage[8][i] == 0.5) {
				aceroTipo.getEficacias().add(Eficacia.POCOEFICAZ);
			} else if (TypesData.typeDamage[8][i] == 0) {
				aceroTipo.getEficacias().add(Eficacia.INEFICAZ);
			}
		}
		session.save(aceroTipo);

		Tipo fuegoTipo = new Tipo();
		fuegoTipo.setNombre("Fuego");
		for (int i = 0; i < TypesData.typeDamage[0].length; i++) {
			if (TypesData.typeDamage[9][i] == 1) {
				fuegoTipo.getEficacias().add(Eficacia.NORMAL);
			} else if (TypesData.typeDamage[9][i] == 2) {
				fuegoTipo.getEficacias().add(Eficacia.MUYEFICAZ);
			} else if (TypesData.typeDamage[9][i] == 0.5) {
				fuegoTipo.getEficacias().add(Eficacia.POCOEFICAZ);
			} else if (TypesData.typeDamage[9][i] == 0) {
				fuegoTipo.getEficacias().add(Eficacia.INEFICAZ);
			}
		}
		session.save(fuegoTipo);

		Tipo aguaTipo = new Tipo();
		aguaTipo.setNombre("Agua");
		for (int i = 0; i < TypesData.typeDamage[0].length; i++) {
			if (TypesData.typeDamage[10][i] == 1) {
				aguaTipo.getEficacias().add(Eficacia.NORMAL);
			} else if (TypesData.typeDamage[10][i] == 2) {
				aguaTipo.getEficacias().add(Eficacia.MUYEFICAZ);
			} else if (TypesData.typeDamage[10][i] == 0.5) {
				aguaTipo.getEficacias().add(Eficacia.POCOEFICAZ);
			} else if (TypesData.typeDamage[10][i] == 0) {
				aguaTipo.getEficacias().add(Eficacia.INEFICAZ);
			}
		}
		session.save(aguaTipo);

		Tipo plantaTipo = new Tipo();
		plantaTipo.setNombre("Planta");
		for (int i = 0; i < TypesData.typeDamage[0].length; i++) {
			if (TypesData.typeDamage[11][i] == 1) {
				plantaTipo.getEficacias().add(Eficacia.NORMAL);
			} else if (TypesData.typeDamage[11][i] == 2) {
				plantaTipo.getEficacias().add(Eficacia.MUYEFICAZ);
			} else if (TypesData.typeDamage[11][i] == 0.5) {
				plantaTipo.getEficacias().add(Eficacia.POCOEFICAZ);
			} else if (TypesData.typeDamage[11][i] == 0) {
				plantaTipo.getEficacias().add(Eficacia.INEFICAZ);
			}
		}
		session.save(plantaTipo);

		Tipo electricoTipo = new Tipo();
		electricoTipo.setNombre("Electrico");
		for (int i = 0; i < TypesData.typeDamage[0].length; i++) {
			if (TypesData.typeDamage[12][i] == 1) {
				electricoTipo.getEficacias().add(Eficacia.NORMAL);
			} else if (TypesData.typeDamage[12][i] == 2) {
				electricoTipo.getEficacias().add(Eficacia.MUYEFICAZ);
			} else if (TypesData.typeDamage[12][i] == 0.5) {
				electricoTipo.getEficacias().add(Eficacia.POCOEFICAZ);
			} else if (TypesData.typeDamage[12][i] == 0) {
				electricoTipo.getEficacias().add(Eficacia.INEFICAZ);
			}
		}
		session.save(electricoTipo);

		Tipo psiquicoTipo = new Tipo();
		psiquicoTipo.setNombre("Psiquico");
		for (int i = 0; i < TypesData.typeDamage[0].length; i++) {
			if (TypesData.typeDamage[13][i] == 1) {
				psiquicoTipo.getEficacias().add(Eficacia.NORMAL);
			} else if (TypesData.typeDamage[13][i] == 2) {
				psiquicoTipo.getEficacias().add(Eficacia.MUYEFICAZ);
			} else if (TypesData.typeDamage[13][i] == 0.5) {
				psiquicoTipo.getEficacias().add(Eficacia.POCOEFICAZ);
			} else if (TypesData.typeDamage[13][i] == 0) {
				psiquicoTipo.getEficacias().add(Eficacia.INEFICAZ);
			}
		}
		session.save(psiquicoTipo);

		Tipo hieloTipo = new Tipo();
		hieloTipo.setNombre("Hielo");
		for (int i = 0; i < TypesData.typeDamage[0].length; i++) {
			if (TypesData.typeDamage[14][i] == 1) {
				hieloTipo.getEficacias().add(Eficacia.NORMAL);
			} else if (TypesData.typeDamage[14][i] == 2) {
				hieloTipo.getEficacias().add(Eficacia.MUYEFICAZ);
			} else if (TypesData.typeDamage[14][i] == 0.5) {
				hieloTipo.getEficacias().add(Eficacia.POCOEFICAZ);
			} else if (TypesData.typeDamage[14][i] == 0) {
				hieloTipo.getEficacias().add(Eficacia.INEFICAZ);
			}
		}
		session.save(hieloTipo);

		Tipo dragonTipo = new Tipo();
		dragonTipo.setNombre("Dragon");
		for (int i = 0; i < TypesData.typeDamage[0].length; i++) {
			if (TypesData.typeDamage[15][i] == 1) {
				dragonTipo.getEficacias().add(Eficacia.NORMAL);
			} else if (TypesData.typeDamage[15][i] == 2) {
				dragonTipo.getEficacias().add(Eficacia.MUYEFICAZ);
			} else if (TypesData.typeDamage[15][i] == 0.5) {
				dragonTipo.getEficacias().add(Eficacia.POCOEFICAZ);
			} else if (TypesData.typeDamage[15][i] == 0) {
				dragonTipo.getEficacias().add(Eficacia.INEFICAZ);
			}
		}
		session.save(dragonTipo);

		Tipo siniestroTipo = new Tipo();
		siniestroTipo.setNombre("Siniestro");
		for (int i = 0; i < TypesData.typeDamage[0].length; i++) {
			if (TypesData.typeDamage[16][i] == 1) {
				electricoTipo.getEficacias().add(Eficacia.NORMAL);
			} else if (TypesData.typeDamage[16][i] == 2) {
				electricoTipo.getEficacias().add(Eficacia.MUYEFICAZ);
			} else if (TypesData.typeDamage[16][i] == 0.5) {
				electricoTipo.getEficacias().add(Eficacia.POCOEFICAZ);
			} else if (TypesData.typeDamage[16][i] == 0) {
				electricoTipo.getEficacias().add(Eficacia.INEFICAZ);
			}
		}
		session.save(siniestroTipo);

		Tipo hadaTipo = new Tipo();
		hadaTipo.setNombre("Hada");
		for (int i = 0; i < TypesData.typeDamage[0].length; i++) {
			if (TypesData.typeDamage[17][i] == 1) {
				electricoTipo.getEficacias().add(Eficacia.NORMAL);
			} else if (TypesData.typeDamage[17][i] == 2) {
				electricoTipo.getEficacias().add(Eficacia.MUYEFICAZ);
			} else if (TypesData.typeDamage[17][i] == 0.5) {
				electricoTipo.getEficacias().add(Eficacia.POCOEFICAZ);
			} else if (TypesData.typeDamage[17][i] == 0) {
				electricoTipo.getEficacias().add(Eficacia.INEFICAZ);
			}
		}
		session.save(hadaTipo);
		
//		Bulbasaur Ivysaur Venusaur

		Pokemon bulbasaurPokemon = new Pokemon();
		bulbasaurPokemon.setNombre("Bulbasaur");
		bulbasaurPokemon.getTipos().add(plantaTipo);
		bulbasaurPokemon.getTipos().add(venenoTipo);
		bulbasaurPokemon.setAltura("0,7 m");
		bulbasaurPokemon.setPeso("6,9 Kg");
		bulbasaurPokemon.setDescripcion("La semilla de su lomo está llena de nutrientes. La semilla brota a medida que el Pokémon crece.");
		

		Pokemon ivysaurPokemon = new Pokemon();
		ivysaurPokemon.setNombre("Ivysaur");
		ivysaurPokemon.getTipos().add(plantaTipo);
		ivysaurPokemon.getTipos().add(venenoTipo);
		ivysaurPokemon.setAltura("1,0 m");
		ivysaurPokemon.setPeso("13,0 Kg");
		ivysaurPokemon.setDescripcion("Puede aumentar su fuerza con energía solar. Esta también hace que crezca el capullo de su lomo.");

		Pokemon venusaurPokemon = new Pokemon();
		venusaurPokemon.setNombre("Venusaur");
		venusaurPokemon.getTipos().add(plantaTipo);
		venusaurPokemon.getTipos().add(venenoTipo);
		venusaurPokemon.setAltura("2,0 m");
		venusaurPokemon.setPeso("100,0 Kg");
		venusaurPokemon.setDescripcion("Llena su cuerpo de energía con los rayos solares que captan los anchos pétalos de su flor.");

		Evolucion evolucionBulbasaurIvysaur = new Evolucion();
		evolucionBulbasaurIvysaur.getPokemons().add(bulbasaurPokemon);
		evolucionBulbasaurIvysaur.getPokemons().add(ivysaurPokemon);
		evolucionBulbasaurIvysaur.setMetodo(MetodoEvolucion.NIVEL);

		Evolucion evolucionIvysaurVenusaur = new Evolucion();
		evolucionIvysaurVenusaur.getPokemons().add(ivysaurPokemon);
		evolucionIvysaurVenusaur.getPokemons().add(venusaurPokemon);
		evolucionIvysaurVenusaur.setMetodo(MetodoEvolucion.NIVEL);

		bulbasaurPokemon.getEvoluciones().add(evolucionBulbasaurIvysaur);
		ivysaurPokemon.getEvoluciones().add(evolucionIvysaurVenusaur);
		session.save(evolucionBulbasaurIvysaur);
		session.save(evolucionIvysaurVenusaur);

		session.save(bulbasaurPokemon);
		session.save(ivysaurPokemon);
		session.save(venusaurPokemon);

		System.out.println(bulbasaurPokemon.getEvoluciones());
		System.out.println(ivysaurPokemon.getEvoluciones());

//		Charmander Charmeleon Charizard

		Pokemon charmanderPokemon = new Pokemon();
		charmanderPokemon.setNombre("Charmander");
		charmanderPokemon.getTipos().add(fuegoTipo);
		charmanderPokemon.setAltura("0,6 m");
		charmanderPokemon.setPeso("8,5 Kg");
		charmanderPokemon.setDescripcion("La llama de su cola indica su fuerza vital. Si está débil, la llama arderá más tenue.");

		Pokemon charmeleonPokemon = new Pokemon();
		charmeleonPokemon.setNombre("Charmeleon");
		charmeleonPokemon.getTipos().add(fuegoTipo);
		charmeleonPokemon.setAltura("1,1 m");
		charmeleonPokemon.setPeso("19,0 Kg");
		charmeleonPokemon.setDescripcion("Por naturaleza, se acalora con facilidad; siempre está buscando enemigos. Solo se calma cuando gana.");

		Pokemon charizardPokemon = new Pokemon();
		charizardPokemon.setNombre("Charizard");
		charizardPokemon.getTipos().add(fuegoTipo);
		charizardPokemon.getTipos().add(voladorTipo);
		charizardPokemon.setAltura("1,7 m");
		charizardPokemon.setPeso("90,5 Kg");
		charizardPokemon.setDescripcion("Si Charizard se enfurece, la llama de la punta de su cola producirá destellos de color azul claro.");

		Evolucion evolucionCharmanderCharmeleon = new Evolucion();
		evolucionCharmanderCharmeleon.getPokemons().add(charmanderPokemon);
		evolucionCharmanderCharmeleon.getPokemons().add(charmeleonPokemon);
		evolucionCharmanderCharmeleon.setMetodo(MetodoEvolucion.NIVEL);

		Evolucion evolucionCharmeleonCharizard = new Evolucion();
		evolucionCharmeleonCharizard.getPokemons().add(charmeleonPokemon);
		evolucionCharmeleonCharizard.getPokemons().add(charizardPokemon);
		evolucionCharmeleonCharizard.setMetodo(MetodoEvolucion.NIVEL);

		charmanderPokemon.getEvoluciones().add(evolucionCharmanderCharmeleon);
		charmeleonPokemon.getEvoluciones().add(evolucionCharmeleonCharizard);
		session.save(evolucionCharmanderCharmeleon);
		session.save(evolucionCharmeleonCharizard);

		session.save(charmanderPokemon);
		session.save(charmeleonPokemon);
		session.save(charizardPokemon);

//		Squirtle Wartortle Blastoise

		Pokemon squirtlePokemon = new Pokemon();
		squirtlePokemon.setNombre("Squirtle");
		squirtlePokemon.getTipos().add(aguaTipo);
		squirtlePokemon.setAltura("0,5 m");
		squirtlePokemon.setPeso("9,0 Kg");
		squirtlePokemon.setDescripcion("Su caparazón es blando al nacer. Pero pronto se endurecerá y será capaz de resistir cualquier amenaza.");

		Pokemon wartortlePokemon = new Pokemon();
		wartortlePokemon.setNombre("Wartortle");
		wartortlePokemon.getTipos().add(aguaTipo);
		wartortlePokemon.setAltura("1,0 m");
		wartortlePokemon.setPeso("22,5 Kg");
		wartortlePokemon.setDescripcion("Es reconocido como símbolo de longevidad. Los Wartortle ancianos tienen algas sobre el caparazón.");

		Pokemon blastoisePokemon = new Pokemon();
		blastoisePokemon.setNombre("Blastoise");
		blastoisePokemon.getTipos().add(aguaTipo);
		blastoisePokemon.setAltura("16 m");
		blastoisePokemon.setPeso("85,5 Kg");
		blastoisePokemon.setDescripcion("Deliberadamente se hace más pesado para contrarrestar la fuerza de los chorros de agua que dispara.");

		Evolucion evolucionSquirtleWartortle = new Evolucion();
		evolucionSquirtleWartortle.getPokemons().add(squirtlePokemon);
		evolucionSquirtleWartortle.getPokemons().add(wartortlePokemon);
		evolucionSquirtleWartortle.setMetodo(MetodoEvolucion.NIVEL);

		Evolucion evolucionWartortleBlastoise = new Evolucion();
		evolucionWartortleBlastoise.getPokemons().add(wartortlePokemon);
		evolucionWartortleBlastoise.getPokemons().add(blastoisePokemon);
		evolucionWartortleBlastoise.setMetodo(MetodoEvolucion.NIVEL);

		squirtlePokemon.getEvoluciones().add(evolucionSquirtleWartortle);
		wartortlePokemon.getEvoluciones().add(evolucionWartortleBlastoise);
		session.save(evolucionSquirtleWartortle);
		session.save(evolucionWartortleBlastoise);

		session.save(squirtlePokemon);
		session.save(wartortlePokemon);
		session.save(blastoisePokemon);

//		Caterpie Metapod Butterfree

		Pokemon caterpiePokemon = new Pokemon();
		caterpiePokemon.setNombre("Caterpie");
		caterpiePokemon.getTipos().add(bichoTipo);
		caterpiePokemon.setAltura("0,3 m");
		caterpiePokemon.setPeso("2,9 Kg");
		caterpiePokemon.setDescripcion("Para protegerse despide un hedor horrible de sus antenas, con el que repele a sus enemigos.");

		Pokemon metapodPokemon = new Pokemon();
		metapodPokemon.setNombre("Metapod");
		metapodPokemon.getTipos().add(bichoTipo);
		metapodPokemon.setAltura("0,7 m");
		metapodPokemon.setPeso("9,9 Kg");
		metapodPokemon.setDescripcion("En el caparazón, mientras se prepara para evolucionar, está blando y débil, en estado catatónico.");

		Pokemon butterfreePokemon = new Pokemon();
		butterfreePokemon.setNombre("Butterfree");
		butterfreePokemon.getTipos().add(bichoTipo);
		butterfreePokemon.getTipos().add(voladorTipo);
		butterfreePokemon.setAltura("1,1 m");
		butterfreePokemon.setPeso("32,0 Kg");
		butterfreePokemon.setDescripcion("Recoge miel a diario y la adhiere al pelo de sus patas para llevarla a su colmena.");

		Evolucion evolucionCaterpieMetapod = new Evolucion();
		evolucionCaterpieMetapod.getPokemons().add(caterpiePokemon);
		evolucionCaterpieMetapod.getPokemons().add(metapodPokemon);
		evolucionCaterpieMetapod.setMetodo(MetodoEvolucion.NIVEL);

		Evolucion evolucionMetapodButterfree = new Evolucion();
		evolucionMetapodButterfree.getPokemons().add(metapodPokemon);
		evolucionMetapodButterfree.getPokemons().add(butterfreePokemon);
		evolucionMetapodButterfree.setMetodo(MetodoEvolucion.NIVEL);

		caterpiePokemon.getEvoluciones().add(evolucionCaterpieMetapod);
		metapodPokemon.getEvoluciones().add(evolucionMetapodButterfree);
		session.save(evolucionCaterpieMetapod);
		session.save(evolucionMetapodButterfree);

		session.save(caterpiePokemon);
		session.save(metapodPokemon);
		session.save(butterfreePokemon);

//		Weedle Kakuna Beedrill

		Pokemon weedlePokemon = new Pokemon();
		weedlePokemon.setNombre("Weedle");
		weedlePokemon.getTipos().add(bichoTipo);
		weedlePokemon.getTipos().add(venenoTipo);
		weedlePokemon.setAltura("0,3 m");
		weedlePokemon.setPeso("3,2 Kg");
		weedlePokemon.setDescripcion("Su venenoso aguij�n es muy potente y su colorido cuerpo hace que los enemigos huyan.");

		Pokemon kakunaPokemon = new Pokemon();
		kakunaPokemon.setNombre("Kakuna");
		kakunaPokemon.getTipos().add(bichoTipo);
		kakunaPokemon.getTipos().add(venenoTipo);
		kakunaPokemon.setAltura("0,6 m");
		kakunaPokemon.setPeso("10,0 Kg");
		kakunaPokemon.setDescripcion("Aunque sea un capullo, es capaz de moverse. Extender� su p�a venenosa si es atacado.");

		Pokemon beedrillPokemon = new Pokemon();
		beedrillPokemon.setNombre("Beedrill");
		beedrillPokemon.getTipos().add(bichoTipo);
		beedrillPokemon.getTipos().add(venenoTipo);
		beedrillPokemon.setAltura("1,0 m");
		beedrillPokemon.setPeso("29,5 Kg");
		beedrillPokemon.setDescripcion("Puede vencer a cualquier rival con sus potentes aguijones venenosos. Puede atacar en grupo.");

		Evolucion evolucionWeedleKakuna = new Evolucion();
		evolucionWeedleKakuna.getPokemons().add(weedlePokemon);
		evolucionWeedleKakuna.getPokemons().add(kakunaPokemon);
		evolucionWeedleKakuna.setMetodo(MetodoEvolucion.NIVEL);

		Evolucion evolucionKakunaBeedrill = new Evolucion();
		evolucionKakunaBeedrill.getPokemons().add(kakunaPokemon);
		evolucionKakunaBeedrill.getPokemons().add(beedrillPokemon);
		evolucionKakunaBeedrill.setMetodo(MetodoEvolucion.NIVEL);

		weedlePokemon.getEvoluciones().add(evolucionWeedleKakuna);
		kakunaPokemon.getEvoluciones().add(evolucionKakunaBeedrill);
		session.save(evolucionWeedleKakuna);
		session.save(evolucionKakunaBeedrill);

		session.save(weedlePokemon);
		session.save(kakunaPokemon);
		session.save(beedrillPokemon);

//		Pidgey Pidgeotto Pidgeot

		Pokemon pidgeyPokemon = new Pokemon();
		pidgeyPokemon.setNombre("Pidgey");
		pidgeyPokemon.getTipos().add(normalTipo);
		pidgeyPokemon.getTipos().add(voladorTipo);
		pidgeyPokemon.setAltura("0,3 m");
		pidgeyPokemon.setPeso("1,8 Kg");
		pidgeyPokemon.setDescripcion("Suele ocultarse entre altas hierbas. Como no le gusta luchar, se defiende pateando arena.");

		Pokemon pidgeottoPokemon = new Pokemon();
		pidgeottoPokemon.setNombre("Pidgeotto");
		pidgeottoPokemon.getTipos().add(normalTipo);
		pidgeottoPokemon.getTipos().add(voladorTipo);
		pidgeottoPokemon.setAltura("1,1 m");
		pidgeottoPokemon.setPeso("30,0 Kg");
		pidgeottoPokemon.setDescripcion("Su visi�n es extraordinaria. Aunque vuele muy alto, detectar� todo movimiento de su presa.");

		Pokemon pidgeotPokemon = new Pokemon();
		pidgeotPokemon.setNombre("Pidgeot");
		pidgeotPokemon.getTipos().add(normalTipo);
		pidgeotPokemon.getTipos().add(voladorTipo);
		pidgeotPokemon.setAltura("1,5 m");
		pidgeotPokemon.setPeso("39,5 Kg");
		pidgeotPokemon.setDescripcion("Sus m�sculos pectorales son tan fuertes que podr�a parar una ventisca con unos cuantos aleteos.");

		Evolucion evolucionPidgeyPidgeotto = new Evolucion();
		evolucionPidgeyPidgeotto.getPokemons().add(pidgeyPokemon);
		evolucionPidgeyPidgeotto.getPokemons().add(pidgeottoPokemon);
		evolucionPidgeyPidgeotto.setMetodo(MetodoEvolucion.NIVEL);

		Evolucion evolucionPidgeottoPidgeot = new Evolucion();
		evolucionPidgeottoPidgeot.getPokemons().add(pidgeottoPokemon);
		evolucionPidgeottoPidgeot.getPokemons().add(pidgeotPokemon);
		evolucionPidgeottoPidgeot.setMetodo(MetodoEvolucion.NIVEL);

		pidgeyPokemon.getEvoluciones().add(evolucionPidgeyPidgeotto);
		pidgeottoPokemon.getEvoluciones().add(evolucionPidgeottoPidgeot);
		session.save(evolucionPidgeyPidgeotto);
		session.save(evolucionPidgeottoPidgeot);

		session.save(pidgeyPokemon);
		session.save(pidgeottoPokemon);
		session.save(pidgeotPokemon);

//		Rattata Raticate

		Pokemon rattataPokemon = new Pokemon();
		rattataPokemon.setNombre("Rattata");
		rattataPokemon.getTipos().add(normalTipo);
		rattataPokemon.setAltura("0,3 m");
		rattataPokemon.setPeso("3,5 Kg");
		rattataPokemon.setDescripcion("Come de todo. Se establece donde quiera que haya comida, y se reproduce continuamente.");

		Pokemon raticatePokemon = new Pokemon();
		raticatePokemon.setNombre("Raticate");
		raticatePokemon.getTipos().add(normalTipo);
		raticatePokemon.setAltura(", m");
		raticatePokemon.setPeso(", Kg");
		raticatePokemon.setDescripcion("");

		Evolucion evolucionRattataRaticate = new Evolucion();
		evolucionRattataRaticate.getPokemons().add(rattataPokemon);
		evolucionRattataRaticate.getPokemons().add(raticatePokemon);
		evolucionRattataRaticate.setMetodo(MetodoEvolucion.NIVEL);

		rattataPokemon.getEvoluciones().add(evolucionRattataRaticate);
		session.save(evolucionRattataRaticate);

		session.save(rattataPokemon);
		session.save(raticatePokemon);

//		Spearow Fearow

		Pokemon spearowPokemon = new Pokemon();
		spearowPokemon.setNombre("Spearow");
		spearowPokemon.getTipos().add(normalTipo);
		spearowPokemon.getTipos().add(voladorTipo);
		spearowPokemon.setAltura(", m");
		spearowPokemon.setPeso(", Kg");
		spearowPokemon.setDescripcion("");

		Pokemon fearowPokemon = new Pokemon();
		fearowPokemon.setNombre("Fearow");
		fearowPokemon.getTipos().add(normalTipo);
		fearowPokemon.getTipos().add(voladorTipo);
		fearowPokemon.setAltura(", m");
		fearowPokemon.setPeso(", Kg");
		fearowPokemon.setDescripcion("");

		Evolucion evolucionSpearowFearow = new Evolucion();
		evolucionSpearowFearow.getPokemons().add(spearowPokemon);
		evolucionSpearowFearow.getPokemons().add(fearowPokemon);
		evolucionSpearowFearow.setMetodo(MetodoEvolucion.NIVEL);

		spearowPokemon.getEvoluciones().add(evolucionSpearowFearow);
		session.save(evolucionSpearowFearow);

		session.save(spearowPokemon);
		session.save(fearowPokemon);

//		Ekans Arbok

		Pokemon ekansPokemon = new Pokemon();
		ekansPokemon.setNombre("Ekans");
		ekansPokemon.getTipos().add(venenoTipo);
		ekansPokemon.setAltura(", m");
		ekansPokemon.setPeso(", Kg");
		ekansPokemon.setDescripcion("");

		Pokemon arbokPokemon = new Pokemon();
		arbokPokemon.setNombre("Arbok");
		arbokPokemon.getTipos().add(venenoTipo);
		arbokPokemon.setAltura(", m");
		arbokPokemon.setPeso(", Kg");
		arbokPokemon.setDescripcion("");

		Evolucion evolucionEkansArbok = new Evolucion();
		evolucionEkansArbok.getPokemons().add(ekansPokemon);
		evolucionEkansArbok.getPokemons().add(arbokPokemon);
		evolucionEkansArbok.setMetodo(MetodoEvolucion.NIVEL);

		ekansPokemon.getEvoluciones().add(evolucionEkansArbok);
		session.save(evolucionEkansArbok);

		session.save(ekansPokemon);
		session.save(arbokPokemon);

//		Pikachu Raichu

		Pokemon pikachuPokemon = new Pokemon();
		pikachuPokemon.setNombre("Pikachu");
		pikachuPokemon.getTipos().add(electricoTipo);
		pikachuPokemon.setAltura(", m");
		pikachuPokemon.setPeso(", Kg");
		pikachuPokemon.setDescripcion("");

		Pokemon raichuPokemon = new Pokemon();
		raichuPokemon.setNombre("Raichu");
		raichuPokemon.getTipos().add(electricoTipo);
		raichuPokemon.setAltura(", m");
		raichuPokemon.setPeso(", Kg");
		raichuPokemon.setDescripcion("");

		Evolucion evolucionPikachuRaichu = new Evolucion();
		evolucionPikachuRaichu.getPokemons().add(pikachuPokemon);
		evolucionPikachuRaichu.getPokemons().add(raichuPokemon);
		evolucionPikachuRaichu.setMetodo(MetodoEvolucion.PIEDRA);

		pikachuPokemon.getEvoluciones().add(evolucionPikachuRaichu);
		session.save(evolucionPikachuRaichu);

		session.save(pikachuPokemon);
		session.save(raichuPokemon);

//		Sandshrew Sandshlash

		Pokemon sandshrewPokemon = new Pokemon();
		sandshrewPokemon.setNombre("Sandshrew");
		sandshrewPokemon.getTipos().add(tierraTipo);
		sandshrewPokemon.setAltura(", m");
		sandshrewPokemon.setPeso(", Kg");
		sandshrewPokemon.setDescripcion("");

		Pokemon sandshlashPokemon = new Pokemon();
		sandshlashPokemon.setNombre("Sandshlash");
		sandshlashPokemon.getTipos().add(tierraTipo);
		sandshlashPokemon.setAltura(", m");
		sandshlashPokemon.setPeso(", Kg");
		sandshlashPokemon.setDescripcion("");

		Evolucion evolucionSandshrewSandshlash = new Evolucion();
		evolucionSandshrewSandshlash.getPokemons().add(sandshrewPokemon);
		evolucionSandshrewSandshlash.getPokemons().add(sandshlashPokemon);
		evolucionSandshrewSandshlash.setMetodo(MetodoEvolucion.NIVEL);

		sandshrewPokemon.getEvoluciones().add(evolucionSandshrewSandshlash);
		session.save(evolucionSandshrewSandshlash);

		session.save(sandshrewPokemon);
		session.save(sandshlashPokemon);

//		NidoranF Nidorina Nidoqueen

		Pokemon nidoranFPokemon = new Pokemon();
		nidoranFPokemon.setNombre("NidoranH");
		nidoranFPokemon.getTipos().add(venenoTipo);
		nidoranFPokemon.setAltura(", m");
		nidoranFPokemon.setPeso(", Kg");
		nidoranFPokemon.setDescripcion("");

		Pokemon nidorinaPokemon = new Pokemon();
		nidorinaPokemon.setNombre("Nidorina");
		nidorinaPokemon.getTipos().add(venenoTipo);
		nidorinaPokemon.setAltura(", m");
		nidorinaPokemon.setPeso(", Kg");
		nidorinaPokemon.setDescripcion("");

		Pokemon nidoqueenPokemon = new Pokemon();
		nidoqueenPokemon.setNombre("Nidoqueen");
		nidoqueenPokemon.getTipos().add(venenoTipo);
		nidoqueenPokemon.getTipos().add(tierraTipo);
		nidoqueenPokemon.setAltura(", m");
		nidoqueenPokemon.setPeso(", Kg");
		nidoqueenPokemon.setDescripcion("");

		Evolucion evolucionNidoranFNidorina = new Evolucion();
		evolucionNidoranFNidorina.getPokemons().add(nidoranFPokemon);
		evolucionNidoranFNidorina.getPokemons().add(nidorinaPokemon);
		evolucionNidoranFNidorina.setMetodo(MetodoEvolucion.NIVEL);

		Evolucion evolucionNidorinaNidoqueen = new Evolucion();
		evolucionNidorinaNidoqueen.getPokemons().add(nidorinaPokemon);
		evolucionNidorinaNidoqueen.getPokemons().add(nidoqueenPokemon);
		evolucionNidorinaNidoqueen.setMetodo(MetodoEvolucion.PIEDRA);

		nidoranFPokemon.getEvoluciones().add(evolucionNidoranFNidorina);
		nidorinaPokemon.getEvoluciones().add(evolucionNidorinaNidoqueen);
		session.save(evolucionNidoranFNidorina);
		session.save(evolucionNidorinaNidoqueen);

		session.save(nidoranFPokemon);
		session.save(nidorinaPokemon);
		session.save(nidoqueenPokemon);

//		NidoranM Nidorino Nidoking

		Pokemon nidoranMPokemon = new Pokemon();
		nidoranMPokemon.setNombre("Nidoran♂");
		nidoranMPokemon.getTipos().add(venenoTipo);
		nidoranMPokemon.setAltura(", m");
		nidoranMPokemon.setPeso(", Kg");
		nidoranMPokemon.setDescripcion("");

		Pokemon nidorinoPokemon = new Pokemon();
		nidorinoPokemon.setNombre("Nidorino");
		nidorinoPokemon.getTipos().add(venenoTipo);
		nidorinoPokemon.setAltura(", m");
		nidorinoPokemon.setPeso(", Kg");
		nidorinoPokemon.setDescripcion("");

		Pokemon nidokingPokemon = new Pokemon();
		nidokingPokemon.setNombre("Nidoking");
		nidokingPokemon.getTipos().add(venenoTipo);
		nidokingPokemon.getTipos().add(tierraTipo);
		nidokingPokemon.setAltura(", m");
		nidokingPokemon.setPeso(", Kg");
		nidokingPokemon.setDescripcion("");

		Evolucion evolucionNidoranMNidorino = new Evolucion();
		evolucionNidoranMNidorino.getPokemons().add(nidoranMPokemon);
		evolucionNidoranMNidorino.getPokemons().add(nidorinoPokemon);
		evolucionNidoranMNidorino.setMetodo(MetodoEvolucion.NIVEL);

		Evolucion evolucionNidorinoNidoking = new Evolucion();
		evolucionNidorinoNidoking.getPokemons().add(nidorinoPokemon);
		evolucionNidorinoNidoking.getPokemons().add(nidokingPokemon);
		evolucionNidorinoNidoking.setMetodo(MetodoEvolucion.PIEDRA);

		nidoranMPokemon.getEvoluciones().add(evolucionNidoranMNidorino);
		nidorinoPokemon.getEvoluciones().add(evolucionNidorinoNidoking);
		session.save(evolucionNidoranMNidorino);
		session.save(evolucionNidorinoNidoking);

		session.save(nidoranMPokemon);
		session.save(nidorinoPokemon);
		session.save(nidokingPokemon);

//		Clefairy Clefable

		Pokemon clefairyPokemon = new Pokemon();
		clefairyPokemon.setNombre("Clefairy");
		clefairyPokemon.getTipos().add(hadaTipo);
		clefairyPokemon.setAltura(", m");
		clefairyPokemon.setPeso(", Kg");
		clefairyPokemon.setDescripcion("");

		Pokemon clefablePokemon = new Pokemon();
		clefablePokemon.setNombre("Clefable");
		clefablePokemon.getTipos().add(hadaTipo);
		clefablePokemon.setAltura(", m");
		clefablePokemon.setPeso(", Kg");
		clefablePokemon.setDescripcion("");

		Evolucion evolucionClefairyClefable = new Evolucion();
		evolucionClefairyClefable.getPokemons().add(clefairyPokemon);
		evolucionClefairyClefable.getPokemons().add(clefablePokemon);
		evolucionClefairyClefable.setMetodo(MetodoEvolucion.PIEDRA);

		clefairyPokemon.getEvoluciones().add(evolucionClefairyClefable);
		session.save(evolucionClefairyClefable);

		session.save(clefairyPokemon);
		session.save(clefablePokemon);

//		Vulpix Ninetales

		Pokemon vulpixPokemon = new Pokemon();
		vulpixPokemon.setNombre("Vulpix");
		vulpixPokemon.getTipos().add(fuegoTipo);
		vulpixPokemon.setAltura(", m");
		vulpixPokemon.setPeso(", Kg");
		vulpixPokemon.setDescripcion("");

		Pokemon ninetalesPokemon = new Pokemon();
		ninetalesPokemon.setNombre("Ninetales");
		ninetalesPokemon.getTipos().add(fuegoTipo);
		ninetalesPokemon.setAltura(", m");
		ninetalesPokemon.setPeso(", Kg");
		ninetalesPokemon.setDescripcion("");

		Evolucion evolucionVulpixNinetales = new Evolucion();
		evolucionVulpixNinetales.getPokemons().add(vulpixPokemon);
		evolucionVulpixNinetales.getPokemons().add(ninetalesPokemon);
		evolucionVulpixNinetales.setMetodo(MetodoEvolucion.PIEDRA);

		vulpixPokemon.getEvoluciones().add(evolucionVulpixNinetales);
		session.save(evolucionVulpixNinetales);

		session.save(vulpixPokemon);
		session.save(ninetalesPokemon);

//		Jigglypuff Wigglytuff

		Pokemon jigglypuffPokemon = new Pokemon();
		jigglypuffPokemon.setNombre("Jigglypuff");
		jigglypuffPokemon.getTipos().add(normalTipo);
		jigglypuffPokemon.getTipos().add(hadaTipo);
		jigglypuffPokemon.setAltura(", m");
		jigglypuffPokemon.setPeso(", Kg");
		jigglypuffPokemon.setDescripcion("");

		Pokemon wigglytuffPokemon = new Pokemon();
		wigglytuffPokemon.setNombre("Wigglytuff");
		wigglytuffPokemon.getTipos().add(normalTipo);
		wigglytuffPokemon.getTipos().add(hadaTipo);
		wigglytuffPokemon.setAltura(", m");
		wigglytuffPokemon.setPeso(", Kg");
		wigglytuffPokemon.setDescripcion("");

		Evolucion evolucionJigglypuffWigglytuff = new Evolucion();
		evolucionJigglypuffWigglytuff.getPokemons().add(jigglypuffPokemon);
		evolucionJigglypuffWigglytuff.getPokemons().add(wigglytuffPokemon);
		evolucionJigglypuffWigglytuff.setMetodo(MetodoEvolucion.PIEDRA);

		jigglypuffPokemon.getEvoluciones().add(evolucionJigglypuffWigglytuff);
		session.save(evolucionJigglypuffWigglytuff);

		session.save(jigglypuffPokemon);
		session.save(wigglytuffPokemon);

//		Zubat Golbat

		Pokemon zubatPokemon = new Pokemon();
		zubatPokemon.setNombre("Zubat");
		zubatPokemon.getTipos().add(venenoTipo);
		zubatPokemon.getTipos().add(voladorTipo);
		zubatPokemon.setAltura(", m");
		zubatPokemon.setPeso(", Kg");
		zubatPokemon.setDescripcion("");

		Pokemon golbatPokemon = new Pokemon();
		golbatPokemon.setNombre("Golbat");
		golbatPokemon.getTipos().add(venenoTipo);
		golbatPokemon.getTipos().add(voladorTipo);
		golbatPokemon.setAltura(", m");
		golbatPokemon.setPeso(", Kg");
		golbatPokemon.setDescripcion("");

		Evolucion evolucionZubatGolbat = new Evolucion();
		evolucionZubatGolbat.getPokemons().add(zubatPokemon);
		evolucionZubatGolbat.getPokemons().add(golbatPokemon);
		evolucionZubatGolbat.setMetodo(MetodoEvolucion.NIVEL);

		zubatPokemon.getEvoluciones().add(evolucionZubatGolbat);
		session.save(evolucionZubatGolbat);

		session.save(zubatPokemon);
		session.save(golbatPokemon);

//		Oddish Gloom Vileplume

		Pokemon oddishPokemon = new Pokemon();
		oddishPokemon.setNombre("Oddish");
		oddishPokemon.getTipos().add(plantaTipo);
		oddishPokemon.getTipos().add(venenoTipo);
		oddishPokemon.setAltura(", m");
		oddishPokemon.setPeso(", Kg");
		oddishPokemon.setDescripcion("");

		Pokemon gloomPokemon = new Pokemon();
		gloomPokemon.setNombre("Gloom");
		gloomPokemon.getTipos().add(plantaTipo);
		gloomPokemon.getTipos().add(venenoTipo);
		gloomPokemon.setAltura(", m");
		gloomPokemon.setPeso(", Kg");
		gloomPokemon.setDescripcion("");

		Pokemon vileplumePokemon = new Pokemon();
		vileplumePokemon.setNombre("Vileplume");
		vileplumePokemon.getTipos().add(plantaTipo);
		vileplumePokemon.getTipos().add(venenoTipo);
		vileplumePokemon.setAltura(", m");
		vileplumePokemon.setPeso(", Kg");
		vileplumePokemon.setDescripcion("");

		Evolucion evolucionOddishGloom = new Evolucion();
		evolucionOddishGloom.getPokemons().add(oddishPokemon);
		evolucionOddishGloom.getPokemons().add(gloomPokemon);
		evolucionOddishGloom.setMetodo(MetodoEvolucion.NIVEL);

		Evolucion evolucionGloomVileplume = new Evolucion();
		evolucionGloomVileplume.getPokemons().add(gloomPokemon);
		evolucionGloomVileplume.getPokemons().add(vileplumePokemon);
		evolucionGloomVileplume.setMetodo(MetodoEvolucion.PIEDRA);

		oddishPokemon.getEvoluciones().add(evolucionOddishGloom);
		gloomPokemon.getEvoluciones().add(evolucionGloomVileplume);
		session.save(evolucionOddishGloom);
		session.save(evolucionGloomVileplume);

		session.save(oddishPokemon);
		session.save(gloomPokemon);
		session.save(vileplumePokemon);

//		Paras Parasect

		Pokemon parasPokemon = new Pokemon();
		parasPokemon.setNombre("Paras");
		parasPokemon.getTipos().add(bichoTipo);
		parasPokemon.getTipos().add(plantaTipo);
		parasPokemon.setAltura(", m");
		parasPokemon.setPeso(", Kg");
		parasPokemon.setDescripcion("");

		Pokemon parasectPokemon = new Pokemon();
		parasectPokemon.setNombre("Parasect");
		parasectPokemon.getTipos().add(bichoTipo);
		parasectPokemon.getTipos().add(plantaTipo);
		parasectPokemon.setAltura(", m");
		parasectPokemon.setPeso(", Kg");
		parasectPokemon.setDescripcion("");

		Evolucion evolucionParasParasect = new Evolucion();
		evolucionParasParasect.getPokemons().add(parasPokemon);
		evolucionParasParasect.getPokemons().add(parasectPokemon);
		evolucionParasParasect.setMetodo(MetodoEvolucion.NIVEL);

		parasPokemon.getEvoluciones().add(evolucionParasParasect);
		session.save(evolucionParasParasect);

		session.save(parasPokemon);
		session.save(parasectPokemon);

//		Venonat Venomoth

		Pokemon venonatPokemon = new Pokemon();
		venonatPokemon.setNombre("Venonat");
		venonatPokemon.getTipos().add(bichoTipo);
		venonatPokemon.getTipos().add(venenoTipo);
		venonatPokemon.setAltura(", m");
		venonatPokemon.setPeso(", Kg");
		venonatPokemon.setDescripcion("");

		Pokemon venomothPokemon = new Pokemon();
		venomothPokemon.setNombre("Venomoth");
		venomothPokemon.getTipos().add(bichoTipo);
		venomothPokemon.getTipos().add(venenoTipo);
		venomothPokemon.setAltura(", m");
		venomothPokemon.setPeso(", Kg");
		venomothPokemon.setDescripcion("");

		Evolucion evolucionVenonatVenomoth = new Evolucion();
		evolucionVenonatVenomoth.getPokemons().add(venonatPokemon);
		evolucionVenonatVenomoth.getPokemons().add(venomothPokemon);
		evolucionVenonatVenomoth.setMetodo(MetodoEvolucion.NIVEL);

		venonatPokemon.getEvoluciones().add(evolucionVenonatVenomoth);
		session.save(evolucionVenonatVenomoth);

		session.save(venonatPokemon);
		session.save(venomothPokemon);

//		Diglett Dugtrio

		Pokemon diglettPokemon = new Pokemon();
		diglettPokemon.setNombre("Diglett");
		diglettPokemon.getTipos().add(tierraTipo);
		diglettPokemon.setAltura(", m");
		diglettPokemon.setPeso(", Kg");
		diglettPokemon.setDescripcion("");

		Pokemon dugtrioPokemon = new Pokemon();
		dugtrioPokemon.setNombre("Dugtrio");
		dugtrioPokemon.getTipos().add(tierraTipo);
		dugtrioPokemon.setAltura(", m");
		dugtrioPokemon.setPeso(", Kg");
		dugtrioPokemon.setDescripcion("");

		Evolucion evolucionDiglettDugtrio = new Evolucion();
		evolucionDiglettDugtrio.getPokemons().add(diglettPokemon);
		evolucionDiglettDugtrio.getPokemons().add(dugtrioPokemon);
		evolucionDiglettDugtrio.setMetodo(MetodoEvolucion.NIVEL);

		diglettPokemon.getEvoluciones().add(evolucionDiglettDugtrio);
		session.save(evolucionDiglettDugtrio);

		session.save(diglettPokemon);
		session.save(dugtrioPokemon);

//		Meowth Persian

		Pokemon meowthPokemon = new Pokemon();
		meowthPokemon.setNombre("Meowth");
		meowthPokemon.getTipos().add(normalTipo);
		meowthPokemon.setAltura(", m");
		meowthPokemon.setPeso(", Kg");
		meowthPokemon.setDescripcion("");

		Pokemon persianPokemon = new Pokemon();
		persianPokemon.setNombre("Persian");
		persianPokemon.getTipos().add(normalTipo);
		persianPokemon.setAltura(", m");
		persianPokemon.setPeso(", Kg");
		persianPokemon.setDescripcion("");

		Evolucion evolucionMeowthPersian = new Evolucion();
		evolucionMeowthPersian.getPokemons().add(meowthPokemon);
		evolucionMeowthPersian.getPokemons().add(persianPokemon);
		evolucionMeowthPersian.setMetodo(MetodoEvolucion.NIVEL);

		meowthPokemon.getEvoluciones().add(evolucionMeowthPersian);
		session.save(evolucionMeowthPersian);

		session.save(meowthPokemon);
		session.save(persianPokemon);

//		Psyduck Goldduck

		Pokemon psyduckPokemon = new Pokemon();
		psyduckPokemon.setNombre("Psyduck");
		psyduckPokemon.getTipos().add(aguaTipo);
		psyduckPokemon.setAltura(", m");
		psyduckPokemon.setPeso(", Kg");
		psyduckPokemon.setDescripcion("");

		Pokemon goldduckPokemon = new Pokemon();
		goldduckPokemon.setNombre("Goldduck");
		goldduckPokemon.getTipos().add(aguaTipo);
		goldduckPokemon.setAltura(", m");
		goldduckPokemon.setPeso(", Kg");
		goldduckPokemon.setDescripcion("");

		Evolucion evolucionPsyduckGoldduck = new Evolucion();
		evolucionPsyduckGoldduck.getPokemons().add(psyduckPokemon);
		evolucionPsyduckGoldduck.getPokemons().add(goldduckPokemon);
		evolucionPsyduckGoldduck.setMetodo(MetodoEvolucion.NIVEL);

		psyduckPokemon.getEvoluciones().add(evolucionPsyduckGoldduck);
		session.save(evolucionPsyduckGoldduck);

		session.save(psyduckPokemon);
		session.save(goldduckPokemon);

//		Mankey Primeape

		Pokemon mankeyPokemon = new Pokemon();
		mankeyPokemon.setNombre("Mankey");
		mankeyPokemon.getTipos().add(luchaTipo);
		mankeyPokemon.setAltura(", m");
		mankeyPokemon.setPeso(", Kg");
		mankeyPokemon.setDescripcion("");

		Pokemon primeapePokemon = new Pokemon();
		primeapePokemon.setNombre("Primeape");
		primeapePokemon.getTipos().add(luchaTipo);
		primeapePokemon.setAltura(", m");
		primeapePokemon.setPeso(", Kg");
		primeapePokemon.setDescripcion("");

		Evolucion evolucionMankeyPrimeape = new Evolucion();
		evolucionMankeyPrimeape.getPokemons().add(mankeyPokemon);
		evolucionMankeyPrimeape.getPokemons().add(primeapePokemon);
		evolucionMankeyPrimeape.setMetodo(MetodoEvolucion.NIVEL);

		mankeyPokemon.getEvoluciones().add(evolucionMankeyPrimeape);
		session.save(evolucionMankeyPrimeape);

		session.save(mankeyPokemon);
		session.save(primeapePokemon);

//		Growlithe Arcanine

		Pokemon growlithePokemon = new Pokemon();
		growlithePokemon.setNombre("Growlithe");
		growlithePokemon.getTipos().add(fuegoTipo);
		growlithePokemon.setAltura(", m");
		growlithePokemon.setPeso(", Kg");
		growlithePokemon.setDescripcion("");

		Pokemon arcaninePokemon = new Pokemon();
		arcaninePokemon.setNombre("Arcanine");
		arcaninePokemon.getTipos().add(fuegoTipo);
		arcaninePokemon.setAltura(", m");
		arcaninePokemon.setPeso(", Kg");
		arcaninePokemon.setDescripcion("");

		Evolucion evolucionGrowlitheArcanine = new Evolucion();
		evolucionGrowlitheArcanine.getPokemons().add(growlithePokemon);
		evolucionGrowlitheArcanine.getPokemons().add(arcaninePokemon);
		evolucionGrowlitheArcanine.setMetodo(MetodoEvolucion.PIEDRA);

		growlithePokemon.getEvoluciones().add(evolucionGrowlitheArcanine);
		session.save(evolucionGrowlitheArcanine);

		session.save(growlithePokemon);
		session.save(arcaninePokemon);

//		Poliwag Poliwhirl Poliwrath

		Pokemon poliwagPokemon = new Pokemon();
		poliwagPokemon.setNombre("Poliwag");
		poliwagPokemon.getTipos().add(aguaTipo);
		poliwagPokemon.setAltura(", m");
		poliwagPokemon.setPeso(", Kg");
		poliwagPokemon.setDescripcion("");

		Pokemon poliwhirlPokemon = new Pokemon();
		poliwhirlPokemon.setNombre("Poliwhirl");
		poliwhirlPokemon.getTipos().add(aguaTipo);
		poliwhirlPokemon.setAltura(", m");
		poliwhirlPokemon.setPeso(", Kg");
		poliwhirlPokemon.setDescripcion("");

		Pokemon poliwrathPokemon = new Pokemon();
		poliwrathPokemon.setNombre("Poliwrath");
		poliwrathPokemon.getTipos().add(aguaTipo);
		poliwrathPokemon.getTipos().add(luchaTipo);
		poliwrathPokemon.setAltura(", m");
		poliwrathPokemon.setPeso(", Kg");
		poliwrathPokemon.setDescripcion("");

		Evolucion evolucionPoliwagPoliwhirl = new Evolucion();
		evolucionPoliwagPoliwhirl.getPokemons().add(poliwagPokemon);
		evolucionPoliwagPoliwhirl.getPokemons().add(poliwhirlPokemon);
		evolucionPoliwagPoliwhirl.setMetodo(MetodoEvolucion.NIVEL);

		Evolucion evolucionPoliwhirlPoliwrath = new Evolucion();
		evolucionPoliwhirlPoliwrath.getPokemons().add(poliwhirlPokemon);
		evolucionPoliwhirlPoliwrath.getPokemons().add(poliwrathPokemon);
		evolucionPoliwhirlPoliwrath.setMetodo(MetodoEvolucion.PIEDRA);

		poliwagPokemon.getEvoluciones().add(evolucionPoliwagPoliwhirl);
		poliwhirlPokemon.getEvoluciones().add(evolucionPoliwhirlPoliwrath);
		session.save(evolucionPoliwagPoliwhirl);
		session.save(evolucionPoliwhirlPoliwrath);

		session.save(poliwagPokemon);
		session.save(poliwhirlPokemon);
		session.save(poliwrathPokemon);

//		Abra Kadabra Alakazam

		Pokemon abraPokemon = new Pokemon();
		abraPokemon.setNombre("Abra");
		abraPokemon.getTipos().add(psiquicoTipo);
		abraPokemon.setAltura(", m");
		abraPokemon.setPeso(", Kg");
		abraPokemon.setDescripcion("");

		Pokemon kadabraPokemon = new Pokemon();
		kadabraPokemon.setNombre("Kadabra");
		kadabraPokemon.getTipos().add(psiquicoTipo);
		kadabraPokemon.setAltura(", m");
		kadabraPokemon.setPeso(", Kg");
		kadabraPokemon.setDescripcion("");

		Pokemon alakazamPokemon = new Pokemon();
		alakazamPokemon.setNombre("Alakazam");
		alakazamPokemon.getTipos().add(psiquicoTipo);
		alakazamPokemon.setAltura(", m");
		alakazamPokemon.setPeso(", Kg");
		alakazamPokemon.setDescripcion("");

		Evolucion evolucionAbraKadabra = new Evolucion();
		evolucionAbraKadabra.getPokemons().add(abraPokemon);
		evolucionAbraKadabra.getPokemons().add(kadabraPokemon);
		evolucionAbraKadabra.setMetodo(MetodoEvolucion.NIVEL);

		Evolucion evolucionKadabraAlakazam = new Evolucion();
		evolucionKadabraAlakazam.getPokemons().add(kadabraPokemon);
		evolucionKadabraAlakazam.getPokemons().add(alakazamPokemon);
		evolucionKadabraAlakazam.setMetodo(MetodoEvolucion.INTERCAMBIO);

		abraPokemon.getEvoluciones().add(evolucionAbraKadabra);
		kadabraPokemon.getEvoluciones().add(evolucionKadabraAlakazam);
		session.save(evolucionAbraKadabra);
		session.save(evolucionKadabraAlakazam);

		session.save(abraPokemon);
		session.save(kadabraPokemon);
		session.save(alakazamPokemon);

//		Machop Machoke Machamp

		Pokemon machopPokemon = new Pokemon();
		machopPokemon.setNombre("Machop");
		machopPokemon.getTipos().add(luchaTipo);
		machopPokemon.setAltura(", m");
		machopPokemon.setPeso(", Kg");
		machopPokemon.setDescripcion("");

		Pokemon machokePokemon = new Pokemon();
		machokePokemon.setNombre("Machoke");
		machokePokemon.getTipos().add(luchaTipo);
		machokePokemon.setAltura(", m");
		machokePokemon.setPeso(", Kg");
		machokePokemon.setDescripcion("");

		Pokemon machampPokemon = new Pokemon();
		machampPokemon.setNombre("Machamp");
		machampPokemon.getTipos().add(luchaTipo);
		machampPokemon.setAltura(", m");
		machampPokemon.setPeso(", Kg");
		machampPokemon.setDescripcion("");

		Evolucion evolucionMachopMachoke = new Evolucion();
		evolucionMachopMachoke.getPokemons().add(machopPokemon);
		evolucionMachopMachoke.getPokemons().add(machokePokemon);
		evolucionMachopMachoke.setMetodo(MetodoEvolucion.NIVEL);

		Evolucion evolucionMachokeMachamp = new Evolucion();
		evolucionMachokeMachamp.getPokemons().add(machokePokemon);
		evolucionMachokeMachamp.getPokemons().add(machampPokemon);
		evolucionMachokeMachamp.setMetodo(MetodoEvolucion.INTERCAMBIO);

		machopPokemon.getEvoluciones().add(evolucionMachopMachoke);
		machokePokemon.getEvoluciones().add(evolucionMachokeMachamp);
		session.save(evolucionMachopMachoke);
		session.save(evolucionMachokeMachamp);

		session.save(machopPokemon);
		session.save(machokePokemon);
		session.save(machampPokemon);

//		Bellsprout Weepinbell Victreebel

		Pokemon bellsproutPokemon = new Pokemon();
		bellsproutPokemon.setNombre("Bellsprout");
		bellsproutPokemon.getTipos().add(plantaTipo);
		bellsproutPokemon.getTipos().add(venenoTipo);
		bellsproutPokemon.setAltura(", m");
		bellsproutPokemon.setPeso(", Kg");
		bellsproutPokemon.setDescripcion("");

		Pokemon weepinbellPokemon = new Pokemon();
		weepinbellPokemon.setNombre("Weepinbell");
		weepinbellPokemon.getTipos().add(plantaTipo);
		weepinbellPokemon.getTipos().add(venenoTipo);
		weepinbellPokemon.setAltura(", m");
		weepinbellPokemon.setPeso(", Kg");
		weepinbellPokemon.setDescripcion("");

		Pokemon victreebelPokemon = new Pokemon();
		victreebelPokemon.setNombre("Victreebel");
		victreebelPokemon.getTipos().add(plantaTipo);
		victreebelPokemon.getTipos().add(venenoTipo);
		victreebelPokemon.setAltura(", m");
		victreebelPokemon.setPeso(", Kg");
		victreebelPokemon.setDescripcion("");

		Evolucion evolucionBellsproutWeepinbell = new Evolucion();
		evolucionBellsproutWeepinbell.getPokemons().add(bellsproutPokemon);
		evolucionBellsproutWeepinbell.getPokemons().add(weepinbellPokemon);
		evolucionBellsproutWeepinbell.setMetodo(MetodoEvolucion.NIVEL);

		Evolucion evolucionWeepinbellVictreebel = new Evolucion();
		evolucionWeepinbellVictreebel.getPokemons().add(weepinbellPokemon);
		evolucionWeepinbellVictreebel.getPokemons().add(victreebelPokemon);
		evolucionWeepinbellVictreebel.setMetodo(MetodoEvolucion.PIEDRA);

		bellsproutPokemon.getEvoluciones().add(evolucionBellsproutWeepinbell);
		weepinbellPokemon.getEvoluciones().add(evolucionWeepinbellVictreebel);
		session.save(evolucionBellsproutWeepinbell);
		session.save(evolucionWeepinbellVictreebel);

		session.save(bellsproutPokemon);
		session.save(weepinbellPokemon);
		session.save(victreebelPokemon);

//		Tentacool Tentacruel

		Pokemon tentacoolPokemon = new Pokemon();
		tentacoolPokemon.setNombre("Tentacool");
		tentacoolPokemon.getTipos().add(aguaTipo);
		tentacoolPokemon.getTipos().add(venenoTipo);
		tentacoolPokemon.setAltura(", m");
		tentacoolPokemon.setPeso(", Kg");
		tentacoolPokemon.setDescripcion("");

		Pokemon tentacruelPokemon = new Pokemon();
		tentacruelPokemon.setNombre("Tentacruel");
		tentacruelPokemon.getTipos().add(aguaTipo);
		tentacruelPokemon.getTipos().add(venenoTipo);
		tentacruelPokemon.setAltura(", m");
		tentacruelPokemon.setPeso(", Kg");
		tentacruelPokemon.setDescripcion("");

		Evolucion evolucionTentacoolTentacruel = new Evolucion();
		evolucionTentacoolTentacruel.getPokemons().add(tentacoolPokemon);
		evolucionTentacoolTentacruel.getPokemons().add(tentacruelPokemon);
		evolucionTentacoolTentacruel.setMetodo(MetodoEvolucion.NIVEL);

		tentacoolPokemon.getEvoluciones().add(evolucionTentacoolTentacruel);
		session.save(evolucionTentacoolTentacruel);

		session.save(tentacoolPokemon);
		session.save(tentacruelPokemon);

//		Geodude Graveler Golem

		Pokemon geodudePokemon = new Pokemon();
		geodudePokemon.setNombre("Geodude");
		geodudePokemon.getTipos().add(rocaTipo);
		geodudePokemon.getTipos().add(tierraTipo);
		geodudePokemon.setAltura(", m");
		geodudePokemon.setPeso(", Kg");
		geodudePokemon.setDescripcion("");

		Pokemon gravelerPokemon = new Pokemon();
		gravelerPokemon.setNombre("Graveler");
		gravelerPokemon.getTipos().add(rocaTipo);
		gravelerPokemon.getTipos().add(tierraTipo);
		gravelerPokemon.setAltura(", m");
		gravelerPokemon.setPeso(", Kg");
		gravelerPokemon.setDescripcion("");

		Pokemon golemPokemon = new Pokemon();
		golemPokemon.setNombre("Golem");
		golemPokemon.getTipos().add(rocaTipo);
		golemPokemon.getTipos().add(tierraTipo);
		golemPokemon.setAltura(", m");
		golemPokemon.setPeso(", Kg");
		golemPokemon.setDescripcion("");

		Evolucion evolucionGeodudeGraveler = new Evolucion();
		evolucionGeodudeGraveler.getPokemons().add(geodudePokemon);
		evolucionGeodudeGraveler.getPokemons().add(gravelerPokemon);
		evolucionGeodudeGraveler.setMetodo(MetodoEvolucion.NIVEL);

		Evolucion evolucionGravelerGolem = new Evolucion();
		evolucionGravelerGolem.getPokemons().add(gravelerPokemon);
		evolucionGravelerGolem.getPokemons().add(golemPokemon);
		evolucionGravelerGolem.setMetodo(MetodoEvolucion.INTERCAMBIO);

		geodudePokemon.getEvoluciones().add(evolucionGeodudeGraveler);
		gravelerPokemon.getEvoluciones().add(evolucionGravelerGolem);
		session.save(evolucionGeodudeGraveler);
		session.save(evolucionGravelerGolem);

		session.save(geodudePokemon);
		session.save(gravelerPokemon);
		session.save(golemPokemon);

//		Ponyta Rapidash

		Pokemon ponytaPokemon = new Pokemon();
		ponytaPokemon.setNombre("Ponyta");
		ponytaPokemon.getTipos().add(fuegoTipo);
		ponytaPokemon.setAltura(", m");
		ponytaPokemon.setPeso(", Kg");
		ponytaPokemon.setDescripcion("");

		Pokemon rapidashPokemon = new Pokemon();
		rapidashPokemon.setNombre("Rapidash");
		rapidashPokemon.getTipos().add(fuegoTipo);
		rapidashPokemon.setAltura(", m");
		rapidashPokemon.setPeso(", Kg");
		rapidashPokemon.setDescripcion("");

		Evolucion evolucionPonytaRapidash = new Evolucion();
		evolucionPonytaRapidash.getPokemons().add(ponytaPokemon);
		evolucionPonytaRapidash.getPokemons().add(rapidashPokemon);
		evolucionPonytaRapidash.setMetodo(MetodoEvolucion.NIVEL);

		ponytaPokemon.getEvoluciones().add(evolucionPonytaRapidash);
		session.save(evolucionPonytaRapidash);

		session.save(ponytaPokemon);
		session.save(rapidashPokemon);

//		Slowpoke Slowbro

		Pokemon slowpokePokemon = new Pokemon();
		slowpokePokemon.setNombre("Slowpoke");
		slowpokePokemon.getTipos().add(aguaTipo);
		slowpokePokemon.getTipos().add(psiquicoTipo);
		slowpokePokemon.setAltura(", m");
		slowpokePokemon.setPeso(", Kg");
		slowpokePokemon.setDescripcion("");

		Pokemon slowbroPokemon = new Pokemon();
		slowbroPokemon.setNombre("Slowbro");
		slowbroPokemon.getTipos().add(aguaTipo);
		slowbroPokemon.getTipos().add(psiquicoTipo);
		slowbroPokemon.setAltura(", m");
		slowbroPokemon.setPeso(", Kg");
		slowbroPokemon.setDescripcion("");

		Evolucion evolucionSlowpokeSlowbro = new Evolucion();
		evolucionSlowpokeSlowbro.getPokemons().add(slowpokePokemon);
		evolucionSlowpokeSlowbro.getPokemons().add(slowbroPokemon);
		evolucionSlowpokeSlowbro.setMetodo(MetodoEvolucion.NIVEL);

		slowpokePokemon.getEvoluciones().add(evolucionSlowpokeSlowbro);
		session.save(evolucionSlowpokeSlowbro);

		session.save(slowpokePokemon);
		session.save(slowbroPokemon);

//		Magnemite Magneton

		Pokemon magnemitePokemon = new Pokemon();
		magnemitePokemon.setNombre("Magnemite");
		magnemitePokemon.getTipos().add(electricoTipo);
		magnemitePokemon.getTipos().add(aceroTipo);
		magnemitePokemon.setAltura(", m");
		magnemitePokemon.setPeso(", Kg");
		magnemitePokemon.setDescripcion("");

		Pokemon magnetonPokemon = new Pokemon();
		magnetonPokemon.setNombre("Magneton");
		magnetonPokemon.getTipos().add(electricoTipo);
		magnetonPokemon.getTipos().add(aceroTipo);
		magnetonPokemon.setAltura(", m");
		magnetonPokemon.setPeso(", Kg");
		magnetonPokemon.setDescripcion("");

		Evolucion evolucionMagnemiteMagneton = new Evolucion();
		evolucionMagnemiteMagneton.getPokemons().add(magnemitePokemon);
		evolucionMagnemiteMagneton.getPokemons().add(magnetonPokemon);
		evolucionMagnemiteMagneton.setMetodo(MetodoEvolucion.NIVEL);

		magnemitePokemon.getEvoluciones().add(evolucionMagnemiteMagneton);
		session.save(evolucionMagnemiteMagneton);

		session.save(magnemitePokemon);
		session.save(magnetonPokemon);

//		Farfetchd

		Pokemon farfetchdPokemon = new Pokemon();
		farfetchdPokemon.setNombre("Farfetch'd");
		farfetchdPokemon.getTipos().add(normalTipo);
		farfetchdPokemon.getTipos().add(voladorTipo);
		farfetchdPokemon.setAltura(", m");
		farfetchdPokemon.setPeso(", Kg");
		farfetchdPokemon.setDescripcion("");

		session.save(farfetchdPokemon);

//		Doduo Dodrio

		Pokemon doduoPokemon = new Pokemon();
		doduoPokemon.setNombre("Doduo");
		doduoPokemon.getTipos().add(normalTipo);
		doduoPokemon.getTipos().add(voladorTipo);
		doduoPokemon.setAltura(", m");
		doduoPokemon.setPeso(", Kg");
		doduoPokemon.setDescripcion("");

		Pokemon dodrioPokemon = new Pokemon();
		dodrioPokemon.setNombre("Dodrio");
		dodrioPokemon.getTipos().add(normalTipo);
		dodrioPokemon.getTipos().add(voladorTipo);
		dodrioPokemon.setAltura(", m");
		dodrioPokemon.setPeso(", Kg");
		dodrioPokemon.setDescripcion("");

		Evolucion evolucionDoduoDodrio = new Evolucion();
		evolucionDoduoDodrio.getPokemons().add(doduoPokemon);
		evolucionDoduoDodrio.getPokemons().add(dodrioPokemon);
		evolucionDoduoDodrio.setMetodo(MetodoEvolucion.NIVEL);

		doduoPokemon.getEvoluciones().add(evolucionDoduoDodrio);
		session.save(evolucionDoduoDodrio);

		session.save(doduoPokemon);
		session.save(dodrioPokemon);

//		Seel Dewgong

		Pokemon seelPokemon = new Pokemon();
		seelPokemon.setNombre("Seel");
		seelPokemon.getTipos().add(aguaTipo);
		seelPokemon.setAltura(", m");
		seelPokemon.setPeso(", Kg");
		seelPokemon.setDescripcion("");

		Pokemon dewgongPokemon = new Pokemon();
		dewgongPokemon.setNombre("Dewgong");
		dewgongPokemon.getTipos().add(aguaTipo);
		dewgongPokemon.getTipos().add(hieloTipo);
		dewgongPokemon.setAltura(", m");
		dewgongPokemon.setPeso(", Kg");
		dewgongPokemon.setDescripcion("");

		Evolucion evolucionSeelDewgong = new Evolucion();
		evolucionSeelDewgong.getPokemons().add(seelPokemon);
		evolucionSeelDewgong.getPokemons().add(dewgongPokemon);
		evolucionSeelDewgong.setMetodo(MetodoEvolucion.NIVEL);

		seelPokemon.getEvoluciones().add(evolucionSeelDewgong);
		session.save(evolucionSeelDewgong);

		session.save(seelPokemon);
		session.save(dewgongPokemon);

//		Grimer Muk

		Pokemon grimerPokemon = new Pokemon();
		grimerPokemon.setNombre("Grimer");
		grimerPokemon.getTipos().add(venenoTipo);
		grimerPokemon.setAltura(", m");
		grimerPokemon.setPeso(", Kg");
		grimerPokemon.setDescripcion("");

		Pokemon mukPokemon = new Pokemon();
		mukPokemon.setNombre("Muk");
		mukPokemon.getTipos().add(venenoTipo);
		mukPokemon.setAltura(", m");
		mukPokemon.setPeso(", Kg");
		mukPokemon.setDescripcion("");

		Evolucion evolucionGrimerMuk = new Evolucion();
		evolucionGrimerMuk.getPokemons().add(grimerPokemon);
		evolucionGrimerMuk.getPokemons().add(mukPokemon);
		evolucionGrimerMuk.setMetodo(MetodoEvolucion.NIVEL);

		grimerPokemon.getEvoluciones().add(evolucionGrimerMuk);
		session.save(evolucionGrimerMuk);

		session.save(grimerPokemon);
		session.save(mukPokemon);

//		Shellder Cloyster

		Pokemon shellderPokemon = new Pokemon();
		shellderPokemon.setNombre("Shellder");
		shellderPokemon.getTipos().add(aguaTipo);
		shellderPokemon.setAltura(", m");
		shellderPokemon.setPeso(", Kg");
		shellderPokemon.setDescripcion("");

		Pokemon cloysterPokemon = new Pokemon();
		cloysterPokemon.setNombre("Cloyster");
		cloysterPokemon.getTipos().add(aguaTipo);
		cloysterPokemon.getTipos().add(hieloTipo);
		cloysterPokemon.setAltura(", m");
		cloysterPokemon.setPeso(", Kg");
		cloysterPokemon.setDescripcion("");

		Evolucion evolucionShellderCloyster = new Evolucion();
		evolucionShellderCloyster.getPokemons().add(shellderPokemon);
		evolucionShellderCloyster.getPokemons().add(cloysterPokemon);
		evolucionShellderCloyster.setMetodo(MetodoEvolucion.PIEDRA);

		shellderPokemon.getEvoluciones().add(evolucionShellderCloyster);
		session.save(evolucionShellderCloyster);

		session.save(shellderPokemon);
		session.save(cloysterPokemon);

//		Gastly Haunter Gengar

		Pokemon gastlyPokemon = new Pokemon();
		gastlyPokemon.setNombre("Gastly");
		gastlyPokemon.getTipos().add(fantasmaTipo);
		gastlyPokemon.getTipos().add(venenoTipo);
		gastlyPokemon.setAltura(", m");
		gastlyPokemon.setPeso(", Kg");
		gastlyPokemon.setDescripcion("");

		Pokemon haunterPokemon = new Pokemon();
		haunterPokemon.setNombre("Haunter");
		haunterPokemon.getTipos().add(fantasmaTipo);
		haunterPokemon.getTipos().add(venenoTipo);
		haunterPokemon.setAltura(", m");
		haunterPokemon.setPeso(", Kg");
		haunterPokemon.setDescripcion("");

		Pokemon gengarPokemon = new Pokemon();
		gengarPokemon.setNombre("Gengar");
		gengarPokemon.getTipos().add(fantasmaTipo);
		gengarPokemon.getTipos().add(venenoTipo);
		gengarPokemon.setAltura(", m");
		gengarPokemon.setPeso(", Kg");
		gengarPokemon.setDescripcion("");

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

//		Onix

		Pokemon onixPokemon = new Pokemon();
		onixPokemon.setNombre("Onix");
		onixPokemon.getTipos().add(rocaTipo);
		onixPokemon.getTipos().add(tierraTipo);
		onixPokemon.setAltura(", m");
		onixPokemon.setPeso(", Kg");
		onixPokemon.setDescripcion("");

		session.save(onixPokemon);

//		Drowzee Hypno

		Pokemon drowzeePokemon = new Pokemon();
		drowzeePokemon.setNombre("Drowzee");
		drowzeePokemon.getTipos().add(psiquicoTipo);
		drowzeePokemon.setAltura(", m");
		drowzeePokemon.setPeso(", Kg");
		drowzeePokemon.setDescripcion("");
		
		Pokemon hypnoPokemon = new Pokemon();
		hypnoPokemon.setNombre("Hypno");
		hypnoPokemon.getTipos().add(psiquicoTipo);
		hypnoPokemon.setAltura(", m");
		hypnoPokemon.setPeso(", Kg");
		hypnoPokemon.setDescripcion("");

		Evolucion evolucionDrowzeeHypno = new Evolucion();
		evolucionDrowzeeHypno.getPokemons().add(drowzeePokemon);
		evolucionDrowzeeHypno.getPokemons().add(hypnoPokemon);
		evolucionDrowzeeHypno.setMetodo(MetodoEvolucion.NIVEL);

		drowzeePokemon.getEvoluciones().add(evolucionDrowzeeHypno);
		session.save(evolucionDrowzeeHypno);

		session.save(drowzeePokemon);
		session.save(hypnoPokemon);

//		Krabby Kingler

		Pokemon krabbyPokemon = new Pokemon();
		krabbyPokemon.setNombre("Krabby");
		krabbyPokemon.getTipos().add(aguaTipo);
		krabbyPokemon.setAltura(", m");
		krabbyPokemon.setPeso(", Kg");
		krabbyPokemon.setDescripcion("");

		Pokemon kinglerPokemon = new Pokemon();
		kinglerPokemon.setNombre("Kingler");
		kinglerPokemon.getTipos().add(aguaTipo);
		kinglerPokemon.setAltura(", m");
		kinglerPokemon.setPeso(", Kg");
		kinglerPokemon.setDescripcion("");

		Evolucion evolucionKrabbyKingler = new Evolucion();
		evolucionKrabbyKingler.getPokemons().add(krabbyPokemon);
		evolucionKrabbyKingler.getPokemons().add(kinglerPokemon);
		evolucionKrabbyKingler.setMetodo(MetodoEvolucion.NIVEL);

		krabbyPokemon.getEvoluciones().add(evolucionKrabbyKingler);
		session.save(evolucionKrabbyKingler);

		session.save(krabbyPokemon);
		session.save(kinglerPokemon);

//		Voltorb Electrode

		Pokemon voltorbPokemon = new Pokemon();
		voltorbPokemon.setNombre("Voltorb");
		voltorbPokemon.getTipos().add(electricoTipo);
		voltorbPokemon.setAltura(", m");
		voltorbPokemon.setPeso(", Kg");
		voltorbPokemon.setDescripcion("");

		Pokemon electrodePokemon = new Pokemon();
		electrodePokemon.setNombre("Electrode");
		electrodePokemon.getTipos().add(electricoTipo);
		electrodePokemon.setAltura(", m");
		electrodePokemon.setPeso(", Kg");
		electrodePokemon.setDescripcion("");

		Evolucion evolucionVoltorbElectrode = new Evolucion();
		evolucionVoltorbElectrode.getPokemons().add(voltorbPokemon);
		evolucionVoltorbElectrode.getPokemons().add(electrodePokemon);
		evolucionVoltorbElectrode.setMetodo(MetodoEvolucion.NIVEL);

		voltorbPokemon.getEvoluciones().add(evolucionVoltorbElectrode);
		session.save(evolucionVoltorbElectrode);

		session.save(voltorbPokemon);
		session.save(electrodePokemon);

//		Exeggcute Exeggutor

		Pokemon exeggcutePokemon = new Pokemon();
		exeggcutePokemon.setNombre("Exeggcute");
		exeggcutePokemon.getTipos().add(plantaTipo);
		exeggcutePokemon.getTipos().add(psiquicoTipo);
		exeggcutePokemon.setAltura(", m");
		exeggcutePokemon.setPeso(", Kg");
		exeggcutePokemon.setDescripcion("");

		Pokemon exeggutorPokemon = new Pokemon();
		exeggutorPokemon.setNombre("Exeggutor");
		exeggutorPokemon.getTipos().add(plantaTipo);
		exeggutorPokemon.getTipos().add(psiquicoTipo);
		exeggutorPokemon.setAltura(", m");
		exeggutorPokemon.setPeso(", Kg");
		exeggutorPokemon.setDescripcion("");

		Evolucion evolucionExeggcuteExeggutor = new Evolucion();
		evolucionExeggcuteExeggutor.getPokemons().add(exeggcutePokemon);
		evolucionExeggcuteExeggutor.getPokemons().add(exeggutorPokemon);
		evolucionExeggcuteExeggutor.setMetodo(MetodoEvolucion.PIEDRA);

		exeggcutePokemon.getEvoluciones().add(evolucionExeggcuteExeggutor);
		session.save(evolucionExeggcuteExeggutor);

		session.save(exeggcutePokemon);
		session.save(exeggutorPokemon);

//		Cubone Marowak

		Pokemon cubonePokemon = new Pokemon();
		cubonePokemon.setNombre("Cubone");
		cubonePokemon.getTipos().add(tierraTipo);
		cubonePokemon.setAltura(", m");
		cubonePokemon.setPeso(", Kg");
		cubonePokemon.setDescripcion("");

		Pokemon marowakPokemon = new Pokemon();
		marowakPokemon.setNombre("Marowak");
		marowakPokemon.getTipos().add(tierraTipo);
		marowakPokemon.setAltura(", m");
		marowakPokemon.setPeso(", Kg");
		marowakPokemon.setDescripcion("");

		Evolucion evolucionCuboneMarowak = new Evolucion();
		evolucionCuboneMarowak.getPokemons().add(cubonePokemon);
		evolucionCuboneMarowak.getPokemons().add(marowakPokemon);
		evolucionCuboneMarowak.setMetodo(MetodoEvolucion.NIVEL);

		cubonePokemon.getEvoluciones().add(evolucionCuboneMarowak);
		session.save(evolucionCuboneMarowak);

		session.save(cubonePokemon);
		session.save(marowakPokemon);

//		Hitmonlee

		Pokemon hitmonleePokemon = new Pokemon();
		hitmonleePokemon.setNombre("Hitmonlee");
		hitmonleePokemon.getTipos().add(luchaTipo);
		hitmonleePokemon.setAltura(", m");
		hitmonleePokemon.setPeso(", Kg");
		hitmonleePokemon.setDescripcion("");

		session.save(hitmonleePokemon);

//		Hitmonchan

		Pokemon hitmonchanPokemon = new Pokemon();
		hitmonchanPokemon.setNombre("Hitmonchan");
		hitmonchanPokemon.getTipos().add(luchaTipo);
		hitmonchanPokemon.setAltura(", m");
		hitmonchanPokemon.setPeso(", Kg");
		hitmonchanPokemon.setDescripcion("");

		session.save(hitmonchanPokemon);

//		Lickitung

		Pokemon lickitungPokemon = new Pokemon();
		lickitungPokemon.setNombre("Lickitung");
		lickitungPokemon.getTipos().add(normalTipo);
		lickitungPokemon.setAltura(", m");
		lickitungPokemon.setPeso(", Kg");
		lickitungPokemon.setDescripcion("");

		session.save(lickitungPokemon);

//		Koffing Weezing

		Pokemon koffingPokemon = new Pokemon();
		koffingPokemon.setNombre("Koffing");
		koffingPokemon.getTipos().add(venenoTipo);
		koffingPokemon.setAltura(", m");
		koffingPokemon.setPeso(", Kg");
		koffingPokemon.setDescripcion("");

		Pokemon weezingPokemon = new Pokemon();
		weezingPokemon.setNombre("Weezing");
		weezingPokemon.getTipos().add(venenoTipo);
		weezingPokemon.setAltura(", m");
		weezingPokemon.setPeso(", Kg");
		weezingPokemon.setDescripcion("");

		Evolucion evolucionKoffingWeezing = new Evolucion();
		evolucionKoffingWeezing.getPokemons().add(koffingPokemon);
		evolucionKoffingWeezing.getPokemons().add(weezingPokemon);
		evolucionKoffingWeezing.setMetodo(MetodoEvolucion.NIVEL);

		koffingPokemon.getEvoluciones().add(evolucionKoffingWeezing);
		session.save(evolucionKoffingWeezing);

		session.save(koffingPokemon);
		session.save(weezingPokemon);

//		Rhyhorn Rhydon

		Pokemon rhyhornPokemon = new Pokemon();
		rhyhornPokemon.setNombre("Rhyhorn");
		rhyhornPokemon.getTipos().add(tierraTipo);
		rhyhornPokemon.getTipos().add(rocaTipo);
		rhyhornPokemon.setAltura(", m");
		rhyhornPokemon.setPeso(", Kg");
		rhyhornPokemon.setDescripcion("");

		Pokemon rhydonPokemon = new Pokemon();
		rhydonPokemon.setNombre("Rhydon");
		rhydonPokemon.getTipos().add(tierraTipo);
		rhydonPokemon.getTipos().add(rocaTipo);
		rhydonPokemon.setAltura(", m");
		rhydonPokemon.setPeso(", Kg");
		rhydonPokemon.setDescripcion("");

		Evolucion evolucionRhyhornRhydon = new Evolucion();
		evolucionRhyhornRhydon.getPokemons().add(rhyhornPokemon);
		evolucionRhyhornRhydon.getPokemons().add(rhydonPokemon);
		evolucionRhyhornRhydon.setMetodo(MetodoEvolucion.NIVEL);

		rhyhornPokemon.getEvoluciones().add(evolucionRhyhornRhydon);
		session.save(evolucionRhyhornRhydon);

		session.save(rhyhornPokemon);
		session.save(rhydonPokemon);

//		Chansey

		Pokemon chanseyPokemon = new Pokemon();
		chanseyPokemon.setNombre("Chansey");
		chanseyPokemon.getTipos().add(normalTipo);
		chanseyPokemon.setAltura(", m");
		chanseyPokemon.setPeso(", Kg");
		chanseyPokemon.setDescripcion("");

		session.save(chanseyPokemon);

//		Tangela

		Pokemon tangelaPokemon = new Pokemon();
		tangelaPokemon.setNombre("Tangela");
		tangelaPokemon.getTipos().add(plantaTipo);
		tangelaPokemon.setAltura(", m");
		tangelaPokemon.setPeso(", Kg");
		tangelaPokemon.setDescripcion("");

		session.save(tangelaPokemon);

//		Kangaskhan

		Pokemon kangaskhanPokemon = new Pokemon();
		kangaskhanPokemon.setNombre("Kangaskhan");
		kangaskhanPokemon.getTipos().add(normalTipo);
		kangaskhanPokemon.setAltura(", m");
		kangaskhanPokemon.setPeso(", Kg");
		kangaskhanPokemon.setDescripcion("");

		session.save(kangaskhanPokemon);

//		Horsea Seadra

		Pokemon horseaPokemon = new Pokemon();
		horseaPokemon.setNombre("Horsea");
		horseaPokemon.getTipos().add(aguaTipo);
		horseaPokemon.setAltura(", m");
		horseaPokemon.setPeso(", Kg");
		horseaPokemon.setDescripcion("");

		Pokemon seadraPokemon = new Pokemon();
		seadraPokemon.setNombre("Seadra");
		seadraPokemon.getTipos().add(aguaTipo);
		seadraPokemon.setAltura(", m");
		seadraPokemon.setPeso(", Kg");
		seadraPokemon.setDescripcion("");

		Evolucion evolucionHorseaSeadra = new Evolucion();
		evolucionHorseaSeadra.getPokemons().add(horseaPokemon);
		evolucionHorseaSeadra.getPokemons().add(seadraPokemon);
		evolucionHorseaSeadra.setMetodo(MetodoEvolucion.NIVEL);

		horseaPokemon.getEvoluciones().add(evolucionHorseaSeadra);
		session.save(evolucionHorseaSeadra);

		session.save(horseaPokemon);
		session.save(seadraPokemon);

//		Goldeen Seaking

		Pokemon goldeenPokemon = new Pokemon();
		goldeenPokemon.setNombre("Goldeen");
		goldeenPokemon.getTipos().add(aguaTipo);
		goldeenPokemon.setAltura(", m");
		goldeenPokemon.setPeso(", Kg");
		goldeenPokemon.setDescripcion("");

		Pokemon seakingPokemon = new Pokemon();
		seakingPokemon.setNombre("Seaking");
		seakingPokemon.getTipos().add(aguaTipo);
		seakingPokemon.setAltura(", m");
		seakingPokemon.setPeso(", Kg");
		seakingPokemon.setDescripcion("");

		Evolucion evolucionGoldeenSeaking = new Evolucion();
		evolucionGoldeenSeaking.getPokemons().add(goldeenPokemon);
		evolucionGoldeenSeaking.getPokemons().add(seakingPokemon);
		evolucionGoldeenSeaking.setMetodo(MetodoEvolucion.NIVEL);

		goldeenPokemon.getEvoluciones().add(evolucionGoldeenSeaking);
		session.save(evolucionGoldeenSeaking);

		session.save(goldeenPokemon);
		session.save(seakingPokemon);

//		Staryu Starmie

		Pokemon staryuPokemon = new Pokemon();
		staryuPokemon.setNombre("Staryu");
		staryuPokemon.getTipos().add(aguaTipo);
		staryuPokemon.setAltura(", m");
		staryuPokemon.setPeso(", Kg");
		staryuPokemon.setDescripcion("");

		Pokemon starmiePokemon = new Pokemon();
		starmiePokemon.setNombre("Starmie");
		starmiePokemon.getTipos().add(aguaTipo);
		starmiePokemon.getTipos().add(psiquicoTipo);
		starmiePokemon.setAltura(", m");
		starmiePokemon.setPeso(", Kg");
		starmiePokemon.setDescripcion("");

		Evolucion evolucionStaryuStarmie = new Evolucion();
		evolucionStaryuStarmie.getPokemons().add(staryuPokemon);
		evolucionStaryuStarmie.getPokemons().add(starmiePokemon);
		evolucionStaryuStarmie.setMetodo(MetodoEvolucion.PIEDRA);

		staryuPokemon.getEvoluciones().add(evolucionStaryuStarmie);
		session.save(evolucionStaryuStarmie);

		session.save(staryuPokemon);
		session.save(starmiePokemon);

//		Mrmime

		Pokemon mrmimePokemon = new Pokemon();
		mrmimePokemon.setNombre("Mr. Mime");
		mrmimePokemon.getTipos().add(psiquicoTipo);
		mrmimePokemon.setAltura(", m");
		mrmimePokemon.setPeso(", Kg");
		mrmimePokemon.setDescripcion("");

		session.save(mrmimePokemon);

//		Scyther

		Pokemon scytherPokemon = new Pokemon();
		scytherPokemon.setNombre("Scyther");
		scytherPokemon.getTipos().add(bichoTipo);
		scytherPokemon.setAltura(", m");
		scytherPokemon.setPeso(", Kg");
		scytherPokemon.setDescripcion("");

		session.save(scytherPokemon);

//		Jynx

		Pokemon jynxPokemon = new Pokemon();
		jynxPokemon.setNombre("Jynx");
		jynxPokemon.getTipos().add(hieloTipo);
		jynxPokemon.getTipos().add(psiquicoTipo);
		jynxPokemon.setAltura(", m");
		jynxPokemon.setPeso(", Kg");
		jynxPokemon.setDescripcion("");

		session.save(jynxPokemon);

//		Electabuzz

		Pokemon electabuzzPokemon = new Pokemon();
		electabuzzPokemon.setNombre("Electabuzz");
		electabuzzPokemon.getTipos().add(electricoTipo);
		electabuzzPokemon.setAltura(", m");
		electabuzzPokemon.setPeso(", Kg");
		electabuzzPokemon.setDescripcion("");

		session.save(electabuzzPokemon);

//		Magmar

		Pokemon magmarPokemon = new Pokemon();
		magmarPokemon.setNombre("Magmar");
		magmarPokemon.getTipos().add(fuegoTipo);
		magmarPokemon.setAltura(", m");
		magmarPokemon.setPeso(", Kg");
		magmarPokemon.setDescripcion("");

		session.save(magmarPokemon);

//		Pinsir

		Pokemon pinsirPokemon = new Pokemon();
		pinsirPokemon.setNombre("Pinsir");
		pinsirPokemon.getTipos().add(bichoTipo);
		pinsirPokemon.setAltura(", m");
		pinsirPokemon.setPeso(", Kg");
		pinsirPokemon.setDescripcion("");

		session.save(pinsirPokemon);

//		Tauros

		Pokemon taurosPokemon = new Pokemon();
		taurosPokemon.setNombre("Tauros");
		taurosPokemon.getTipos().add(normalTipo);
		taurosPokemon.setAltura(", m");
		taurosPokemon.setPeso(", Kg");
		taurosPokemon.setDescripcion("");

		session.save(taurosPokemon);

//		Magikarp Gyarados

		Pokemon magikarpPokemon = new Pokemon();
		magikarpPokemon.setNombre("Magikarp");
		magikarpPokemon.getTipos().add(aguaTipo);
		magikarpPokemon.setAltura(", m");
		magikarpPokemon.setPeso(", Kg");
		magikarpPokemon.setDescripcion("");

		Pokemon gyaradosPokemon = new Pokemon();
		gyaradosPokemon.setNombre("Gyarados");
		gyaradosPokemon.getTipos().add(aguaTipo);
		gyaradosPokemon.getTipos().add(voladorTipo);
		gyaradosPokemon.setAltura(", m");
		gyaradosPokemon.setPeso(", Kg");
		gyaradosPokemon.setDescripcion("");

		Evolucion evolucionMagikarpGyarados = new Evolucion();
		evolucionMagikarpGyarados.getPokemons().add(magikarpPokemon);
		evolucionMagikarpGyarados.getPokemons().add(gyaradosPokemon);
		evolucionMagikarpGyarados.setMetodo(MetodoEvolucion.NIVEL);

		magikarpPokemon.getEvoluciones().add(evolucionMagikarpGyarados);
		session.save(evolucionMagikarpGyarados);

		session.save(magikarpPokemon);
		session.save(gyaradosPokemon);

//		Lapras

		Pokemon laprasPokemon = new Pokemon();
		laprasPokemon.setNombre("Lapras");
		laprasPokemon.getTipos().add(aguaTipo);
		laprasPokemon.getTipos().add(hieloTipo);
		laprasPokemon.setAltura(", m");
		laprasPokemon.setPeso(", Kg");
		laprasPokemon.setDescripcion("");

		session.save(laprasPokemon);

//		Ditto

		Pokemon dittoPokemon = new Pokemon();
		dittoPokemon.setNombre("Ditto");
		dittoPokemon.getTipos().add(normalTipo);
		dittoPokemon.setAltura(", m");
		dittoPokemon.setPeso(", Kg");
		dittoPokemon.setDescripcion("");

		session.save(dittoPokemon);

//		Eevee Vaporeon Jolteon Flareon

		Pokemon eeveePokemon = new Pokemon();
		eeveePokemon.setNombre("Eevee");
		eeveePokemon.getTipos().add(normalTipo);
		eeveePokemon.setAltura(", m");
		eeveePokemon.setPeso(", Kg");
		eeveePokemon.setDescripcion("");

		Pokemon vaporeonPokemon = new Pokemon();
		vaporeonPokemon.setNombre("Vaporeon");
		vaporeonPokemon.getTipos().add(aguaTipo);
		vaporeonPokemon.setAltura(", m");
		vaporeonPokemon.setPeso(", Kg");
		vaporeonPokemon.setDescripcion("");

		Pokemon jolteonPokemon = new Pokemon();
		jolteonPokemon.setNombre("Jolteon");
		jolteonPokemon.getTipos().add(electricoTipo);
		jolteonPokemon.setAltura(", m");
		jolteonPokemon.setPeso(", Kg");
		jolteonPokemon.setDescripcion("");

		Pokemon flareonPokemon = new Pokemon();
		flareonPokemon.setNombre("Flareon");
		flareonPokemon.getTipos().add(fuegoTipo);
		flareonPokemon.setAltura(", m");
		flareonPokemon.setPeso(", Kg");
		flareonPokemon.setDescripcion("");

		Evolucion evolucionEeveeVaporeon = new Evolucion();
		evolucionEeveeVaporeon.getPokemons().add(eeveePokemon);
		evolucionEeveeVaporeon.getPokemons().add(vaporeonPokemon);
		evolucionEeveeVaporeon.setMetodo(MetodoEvolucion.PIEDRA);

		Evolucion evolucionEeveeJolteon = new Evolucion();
		evolucionEeveeJolteon.getPokemons().add(eeveePokemon);
		evolucionEeveeJolteon.getPokemons().add(jolteonPokemon);
		evolucionEeveeJolteon.setMetodo(MetodoEvolucion.PIEDRA);

		Evolucion evolucionEeveeFlareon = new Evolucion();
		evolucionEeveeFlareon.getPokemons().add(eeveePokemon);
		evolucionEeveeFlareon.getPokemons().add(flareonPokemon);
		evolucionEeveeFlareon.setMetodo(MetodoEvolucion.PIEDRA);

		eeveePokemon.getEvoluciones().add(evolucionEeveeVaporeon);
		session.save(evolucionEeveeVaporeon);
		eeveePokemon.getEvoluciones().add(evolucionEeveeJolteon);
		session.save(evolucionEeveeJolteon);
		eeveePokemon.getEvoluciones().add(evolucionEeveeFlareon);
		session.save(evolucionEeveeFlareon);
		
		session.save(eeveePokemon);
		session.save(vaporeonPokemon);
		session.save(jolteonPokemon);
		session.save(flareonPokemon);

//		Porygon

		Pokemon porygonPokemon = new Pokemon();
		porygonPokemon.setNombre("Porygon");
		porygonPokemon.getTipos().add(normalTipo);
		porygonPokemon.setAltura(", m");
		porygonPokemon.setPeso(", Kg");
		porygonPokemon.setDescripcion("");

		session.save(porygonPokemon);

//		Omanyte Omastar

		Pokemon omanytePokemon = new Pokemon();
		omanytePokemon.setNombre("Omanyte");
		omanytePokemon.getTipos().add(rocaTipo);
		omanytePokemon.getTipos().add(aguaTipo);
		omanytePokemon.setAltura(", m");
		omanytePokemon.setPeso(", Kg");
		omanytePokemon.setDescripcion("");

		Pokemon omastarPokemon = new Pokemon();
		omastarPokemon.setNombre("Omastar");
		omastarPokemon.getTipos().add(rocaTipo);
		omastarPokemon.getTipos().add(aguaTipo);
		omastarPokemon.setAltura(", m");
		omastarPokemon.setPeso(", Kg");
		omastarPokemon.setDescripcion("");

		Evolucion evolucionOmanyteOmastar = new Evolucion();
		evolucionOmanyteOmastar.getPokemons().add(omanytePokemon);
		evolucionOmanyteOmastar.getPokemons().add(omastarPokemon);
		evolucionOmanyteOmastar.setMetodo(MetodoEvolucion.NIVEL);

		omanytePokemon.getEvoluciones().add(evolucionOmanyteOmastar);
		session.save(evolucionOmanyteOmastar);

		session.save(omanytePokemon);
		session.save(omastarPokemon);

//		Kabuto Kabutops

		Pokemon kabutoPokemon = new Pokemon();
		kabutoPokemon.setNombre("Kabuto");
		kabutoPokemon.getTipos().add(rocaTipo);
		kabutoPokemon.getTipos().add(aguaTipo);
		kabutoPokemon.setAltura(", m");
		kabutoPokemon.setPeso(", Kg");
		kabutoPokemon.setDescripcion("");

		Pokemon kabutopsPokemon = new Pokemon();
		kabutopsPokemon.setNombre("Kabutops");
		kabutopsPokemon.getTipos().add(rocaTipo);
		kabutopsPokemon.getTipos().add(aguaTipo);
		kabutopsPokemon.setAltura(", m");
		kabutopsPokemon.setPeso(", Kg");
		kabutopsPokemon.setDescripcion("");

		Evolucion evolucionKabutoKabutops = new Evolucion();
		evolucionKabutoKabutops.getPokemons().add(kabutoPokemon);
		evolucionKabutoKabutops.getPokemons().add(kabutopsPokemon);
		evolucionKabutoKabutops.setMetodo(MetodoEvolucion.NIVEL);

		kabutoPokemon.getEvoluciones().add(evolucionKabutoKabutops);
		session.save(evolucionKabutoKabutops);

		session.save(kabutoPokemon);
		session.save(kabutopsPokemon);

//		Aerodactyl

		Pokemon aerodactylPokemon = new Pokemon();
		aerodactylPokemon.setNombre("Aerodactyl");
		aerodactylPokemon.getTipos().add(rocaTipo);
		aerodactylPokemon.getTipos().add(voladorTipo);
		aerodactylPokemon.setAltura(", m");
		aerodactylPokemon.setPeso(", Kg");
		aerodactylPokemon.setDescripcion("");

		session.save(aerodactylPokemon);

//		Snorlax

		Pokemon snorlaxPokemon = new Pokemon();
		snorlaxPokemon.setNombre("Snorlax");
		snorlaxPokemon.getTipos().add(normalTipo);
		snorlaxPokemon.setAltura(", m");
		snorlaxPokemon.setPeso(", Kg");
		snorlaxPokemon.setDescripcion("");

		session.save(snorlaxPokemon);

//		Articuno

		Pokemon articunoPokemon = new Pokemon();
		articunoPokemon.setNombre("Articuno");
		articunoPokemon.getTipos().add(hieloTipo);
		articunoPokemon.getTipos().add(voladorTipo);
		articunoPokemon.setAltura(", m");
		articunoPokemon.setPeso(", Kg");
		articunoPokemon.setDescripcion("");

		session.save(articunoPokemon);

//		Zapdos

		Pokemon zapdosPokemon = new Pokemon();
		zapdosPokemon.setNombre("Zapdos");
		zapdosPokemon.getTipos().add(electricoTipo);
		zapdosPokemon.getTipos().add(voladorTipo);
		zapdosPokemon.setAltura(", m");
		zapdosPokemon.setPeso(", Kg");
		zapdosPokemon.setDescripcion("");

		session.save(zapdosPokemon);

//		Moltres

		Pokemon moltresPokemon = new Pokemon();
		moltresPokemon.setNombre("Moltres");
		moltresPokemon.getTipos().add(fuegoTipo);
		moltresPokemon.getTipos().add(voladorTipo);
		moltresPokemon.setAltura(", m");
		moltresPokemon.setPeso(", Kg");
		moltresPokemon.setDescripcion("");

		session.save(moltresPokemon);

//		Dratini Dragonair Dragonite

		Pokemon dratiniPokemon = new Pokemon();
		dratiniPokemon.setNombre("Dratini");
		dratiniPokemon.getTipos().add(dragonTipo);
		dratiniPokemon.setAltura(", m");
		dratiniPokemon.setPeso(", Kg");
		dratiniPokemon.setDescripcion("");

		Pokemon dragonairPokemon = new Pokemon();
		dragonairPokemon.setNombre("Dragonair");
		dragonairPokemon.getTipos().add(dragonTipo);
		dragonairPokemon.setAltura(", m");
		dragonairPokemon.setPeso(", Kg");
		dragonairPokemon.setDescripcion("");

		Pokemon dragonitePokemon = new Pokemon();
		dragonitePokemon.setNombre("Dragonite");
		dragonitePokemon.getTipos().add(dragonTipo);
		dragonitePokemon.getTipos().add(voladorTipo);
		dragonitePokemon.setAltura(", m");
		dragonitePokemon.setPeso(", Kg");
		dragonitePokemon.setDescripcion("");

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

//		Mewtwo

		Pokemon mewtwoPokemon = new Pokemon();
		mewtwoPokemon.setNombre("Mewtwo");
		mewtwoPokemon.getTipos().add(psiquicoTipo);
		mewtwoPokemon.setAltura(", m");
		mewtwoPokemon.setPeso(", Kg");
		mewtwoPokemon.setDescripcion("");

		session.save(mewtwoPokemon);

//		Mew

		Pokemon mewPokemon = new Pokemon();
		mewPokemon.setNombre("Mew");
		mewPokemon.getTipos().add(psiquicoTipo);
		mewPokemon.setAltura(", m");
		mewPokemon.setPeso(", Kg");
		mewPokemon.setDescripcion("");

		session.save(mewPokemon);

		session.flush();
		session.getTransaction().commit();
		session.close();
		hibernateUtil.getSession().close();
		org.hsqldb.DatabaseManager.closeDatabases(0);
		// System.out.println(survey.getId());

//		session.save(survey);
//		session.flush();
//
//		System.out.println(survey.getId());
//		Survey surveyInSession = (Survey) session.get(Survey.class, survey.getId());
//		System.out.println(surveyInSession.getName());

		// hibernateUtil.checkData("select * from survey");
	}
	}

