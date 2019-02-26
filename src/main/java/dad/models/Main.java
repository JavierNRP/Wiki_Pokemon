package test;

import org.hibernate.Session;

import components.TypesData;
import dad.models.conf.HibernateUtil;
import dad.models.estructura.Eficacia;
import dad.models.estructura.Evolucion;
import dad.models.estructura.MetodoEvolucion;
import dad.models.estructura.Pokemon;
import dad.models.estructura.Tipo;

@SuppressWarnings("Duplicates")
public class Main {

	public static void main(String[] args) throws Exception {
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
		squirtlePokemon.setAltura("1,0 m");
		squirtlePokemon.setPeso("22,5 Kg");
		squirtlePokemon.setDescripcion("Es reconocido como símbolo de longevidad. Los Wartortle ancianos tienen algas sobre el caparazón.");

		Pokemon blastoisePokemon = new Pokemon();
		blastoisePokemon.setNombre("Blastoise");
		blastoisePokemon.getTipos().add(aguaTipo);
		squirtlePokemon.setAltura("16, m");
		squirtlePokemon.setPeso("85,5 Kg");
		squirtlePokemon.setDescripcion("Deliberadamente se hace más pesado para contrarrestar la fuerza de los chorros de agua que dispara.");

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

		Pokemon kakunaPokemon = new Pokemon();
		kakunaPokemon.setNombre("Kakuna");
		kakunaPokemon.getTipos().add(bichoTipo);
		kakunaPokemon.getTipos().add(venenoTipo);

		Pokemon beedrillPokemon = new Pokemon();
		beedrillPokemon.setNombre("Beedrill");
		beedrillPokemon.getTipos().add(bichoTipo);
		beedrillPokemon.getTipos().add(venenoTipo);

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

		Pokemon pidgeottoPokemon = new Pokemon();
		pidgeottoPokemon.setNombre("Pidgeotto");
		pidgeottoPokemon.getTipos().add(normalTipo);
		pidgeottoPokemon.getTipos().add(voladorTipo);

		Pokemon pidgeotPokemon = new Pokemon();
		pidgeotPokemon.setNombre("Pidgeot");
		pidgeotPokemon.getTipos().add(normalTipo);
		pidgeotPokemon.getTipos().add(voladorTipo);

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

		Pokemon raticatePokemon = new Pokemon();
		raticatePokemon.setNombre("Raticate");
		raticatePokemon.getTipos().add(normalTipo);

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

		Pokemon fearowPokemon = new Pokemon();
		fearowPokemon.setNombre("Fearow");
		fearowPokemon.getTipos().add(normalTipo);
		fearowPokemon.getTipos().add(voladorTipo);

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

		Pokemon arbokPokemon = new Pokemon();
		arbokPokemon.setNombre("Arbok");
		arbokPokemon.getTipos().add(venenoTipo);

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

		Pokemon raichuPokemon = new Pokemon();
		raichuPokemon.setNombre("Raichu");
		raichuPokemon.getTipos().add(electricoTipo);

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

		Pokemon sandshlashPokemon = new Pokemon();
		sandshlashPokemon.setNombre("Sandshlash");
		sandshlashPokemon.getTipos().add(tierraTipo);

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

		Pokemon nidorinaPokemon = new Pokemon();
		nidorinaPokemon.setNombre("Nidorina");
		nidorinaPokemon.getTipos().add(venenoTipo);

		Pokemon nidoqueenPokemon = new Pokemon();
		nidoqueenPokemon.setNombre("Nidoqueen");
		nidoqueenPokemon.getTipos().add(venenoTipo);
		nidoqueenPokemon.getTipos().add(tierraTipo);

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

		Pokemon nidorinoPokemon = new Pokemon();
		nidorinoPokemon.setNombre("Nidorino");
		nidorinoPokemon.getTipos().add(venenoTipo);

		Pokemon nidokingPokemon = new Pokemon();
		nidokingPokemon.setNombre("Nidoking");
		nidokingPokemon.getTipos().add(venenoTipo);
		nidokingPokemon.getTipos().add(tierraTipo);

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

		Pokemon clefablePokemon = new Pokemon();
		clefablePokemon.setNombre("Clefable");
		clefablePokemon.getTipos().add(hadaTipo);

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

		Pokemon ninetalesPokemon = new Pokemon();
		ninetalesPokemon.setNombre("Ninetales");
		ninetalesPokemon.getTipos().add(fuegoTipo);

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

		Pokemon wigglytuffPokemon = new Pokemon();
		wigglytuffPokemon.setNombre("Wigglytuff");
		wigglytuffPokemon.getTipos().add(normalTipo);
		wigglytuffPokemon.getTipos().add(hadaTipo);

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

		Pokemon golbatPokemon = new Pokemon();
		golbatPokemon.setNombre("Golbat");
		golbatPokemon.getTipos().add(venenoTipo);
		golbatPokemon.getTipos().add(voladorTipo);

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

		Pokemon gloomPokemon = new Pokemon();
		gloomPokemon.setNombre("Gloom");
		gloomPokemon.getTipos().add(plantaTipo);
		gloomPokemon.getTipos().add(venenoTipo);

		Pokemon vileplumePokemon = new Pokemon();
		vileplumePokemon.setNombre("Vileplume");
		vileplumePokemon.getTipos().add(plantaTipo);
		vileplumePokemon.getTipos().add(venenoTipo);

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

		Pokemon parasectPokemon = new Pokemon();
		parasectPokemon.setNombre("Parasect");
		parasectPokemon.getTipos().add(bichoTipo);
		parasectPokemon.getTipos().add(plantaTipo);

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

		Pokemon venomothPokemon = new Pokemon();
		venomothPokemon.setNombre("Venomoth");
		venomothPokemon.getTipos().add(bichoTipo);
		venomothPokemon.getTipos().add(venenoTipo);

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

		Pokemon dugtrioPokemon = new Pokemon();
		dugtrioPokemon.setNombre("Dugtrio");
		dugtrioPokemon.getTipos().add(tierraTipo);

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

		Pokemon persianPokemon = new Pokemon();
		persianPokemon.setNombre("Persian");
		persianPokemon.getTipos().add(normalTipo);

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

		Pokemon goldduckPokemon = new Pokemon();
		goldduckPokemon.setNombre("Goldduck");
		goldduckPokemon.getTipos().add(aguaTipo);

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

		Pokemon primeapePokemon = new Pokemon();
		primeapePokemon.setNombre("Primeape");
		primeapePokemon.getTipos().add(luchaTipo);

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

		Pokemon arcaninePokemon = new Pokemon();
		arcaninePokemon.setNombre("Arcanine");
		arcaninePokemon.getTipos().add(fuegoTipo);

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
		poliwagPokemon.getTipos().add(plantaTipo);
		poliwagPokemon.getTipos().add(venenoTipo);

		Pokemon poliwhirlPokemon = new Pokemon();
		poliwhirlPokemon.setNombre("Poliwhirl");
		poliwhirlPokemon.getTipos().add(plantaTipo);
		poliwhirlPokemon.getTipos().add(venenoTipo);

		Pokemon poliwrathPokemon = new Pokemon();
		poliwrathPokemon.setNombre("Poliwrath");
		poliwrathPokemon.getTipos().add(plantaTipo);
		poliwrathPokemon.getTipos().add(venenoTipo);

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

		Pokemon kadabraPokemon = new Pokemon();
		kadabraPokemon.setNombre("Kadabra");
		kadabraPokemon.getTipos().add(psiquicoTipo);

		Pokemon alakazamPokemon = new Pokemon();
		alakazamPokemon.setNombre("Alakazam");
		alakazamPokemon.getTipos().add(psiquicoTipo);

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

		Pokemon machokePokemon = new Pokemon();
		machokePokemon.setNombre("Machoke");
		machokePokemon.getTipos().add(luchaTipo);

		Pokemon machampPokemon = new Pokemon();
		machampPokemon.setNombre("Machamp");
		machampPokemon.getTipos().add(luchaTipo);

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

		Pokemon weepinbellPokemon = new Pokemon();
		weepinbellPokemon.setNombre("Weepinbell");
		weepinbellPokemon.getTipos().add(plantaTipo);
		weepinbellPokemon.getTipos().add(venenoTipo);

		Pokemon victreebelPokemon = new Pokemon();
		victreebelPokemon.setNombre("Victreebel");
		victreebelPokemon.getTipos().add(plantaTipo);
		victreebelPokemon.getTipos().add(venenoTipo);

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

		Pokemon tentacruelPokemon = new Pokemon();
		tentacruelPokemon.setNombre("Tentacruel");
		tentacruelPokemon.getTipos().add(aguaTipo);
		tentacruelPokemon.getTipos().add(venenoTipo);

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

		Pokemon gravelerPokemon = new Pokemon();
		gravelerPokemon.setNombre("Graveler");
		gravelerPokemon.getTipos().add(rocaTipo);
		gravelerPokemon.getTipos().add(tierraTipo);

		Pokemon golemPokemon = new Pokemon();
		golemPokemon.setNombre("Golem");
		golemPokemon.getTipos().add(rocaTipo);
		golemPokemon.getTipos().add(tierraTipo);

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

		Pokemon rapidashPokemon = new Pokemon();
		rapidashPokemon.setNombre("Rapidash");
		rapidashPokemon.getTipos().add(fuegoTipo);

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

		Pokemon slowbroPokemon = new Pokemon();
		slowbroPokemon.setNombre("Slowbro");
		slowbroPokemon.getTipos().add(aguaTipo);
		slowbroPokemon.getTipos().add(psiquicoTipo);

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

		Pokemon magnetonPokemon = new Pokemon();
		magnetonPokemon.setNombre("Magneton");
		magnetonPokemon.getTipos().add(electricoTipo);
		magnetonPokemon.getTipos().add(aceroTipo);

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

		session.save(farfetchdPokemon);

//		Doduo Dodrio

		Pokemon doduoPokemon = new Pokemon();
		doduoPokemon.setNombre("Doduo");
		doduoPokemon.getTipos().add(normalTipo);
		doduoPokemon.getTipos().add(voladorTipo);

		Pokemon dodrioPokemon = new Pokemon();
		dodrioPokemon.setNombre("Dodrio");
		dodrioPokemon.getTipos().add(normalTipo);
		dodrioPokemon.getTipos().add(voladorTipo);

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

		Pokemon dewgongPokemon = new Pokemon();
		dewgongPokemon.setNombre("Dewgong");
		dewgongPokemon.getTipos().add(aguaTipo);
		dewgongPokemon.getTipos().add(hieloTipo);

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

		Pokemon mukPokemon = new Pokemon();
		mukPokemon.setNombre("Muk");
		mukPokemon.getTipos().add(venenoTipo);

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

		Pokemon cloysterPokemon = new Pokemon();
		cloysterPokemon.setNombre("Cloyster");
		cloysterPokemon.getTipos().add(aguaTipo);
		cloysterPokemon.getTipos().add(hieloTipo);

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

//		Onix

		Pokemon onixPokemon = new Pokemon();
		onixPokemon.setNombre("Onix");
		onixPokemon.getTipos().add(rocaTipo);
		onixPokemon.getTipos().add(tierraTipo);

		session.save(onixPokemon);

//		Drowzee Hypno

		Pokemon drowzeePokemon = new Pokemon();
		drowzeePokemon.setNombre("Drowzee");
		drowzeePokemon.getTipos().add(psiquicoTipo);

		Pokemon hypnoPokemon = new Pokemon();
		hypnoPokemon.setNombre("Hypno");
		hypnoPokemon.getTipos().add(psiquicoTipo);

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

		Pokemon kinglerPokemon = new Pokemon();
		kinglerPokemon.setNombre("Kingler");
		kinglerPokemon.getTipos().add(aguaTipo);

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

		Pokemon electrodePokemon = new Pokemon();
		electrodePokemon.setNombre("Electrode");
		electrodePokemon.getTipos().add(electricoTipo);

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

		Pokemon exeggutorPokemon = new Pokemon();
		exeggutorPokemon.setNombre("Exeggutor");
		exeggutorPokemon.getTipos().add(plantaTipo);
		exeggutorPokemon.getTipos().add(psiquicoTipo);

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

		Pokemon marowakPokemon = new Pokemon();
		marowakPokemon.setNombre("Marowak");
		marowakPokemon.getTipos().add(tierraTipo);

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

		session.save(hitmonleePokemon);

//		Hitmonchan

		Pokemon hitmonchanPokemon = new Pokemon();
		hitmonchanPokemon.setNombre("Hitmonchan");
		hitmonchanPokemon.getTipos().add(luchaTipo);

		session.save(hitmonchanPokemon);

//		Lickitung

		Pokemon lickitungPokemon = new Pokemon();
		lickitungPokemon.setNombre("Lickitung");
		lickitungPokemon.getTipos().add(normalTipo);

		session.save(lickitungPokemon);

//		Koffing Weezing

		Pokemon koffingPokemon = new Pokemon();
		koffingPokemon.setNombre("Koffing");
		koffingPokemon.getTipos().add(venenoTipo);

		Pokemon weezingPokemon = new Pokemon();
		weezingPokemon.setNombre("Weezing");
		weezingPokemon.getTipos().add(venenoTipo);

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

//		Chansey

		Pokemon chanseyPokemon = new Pokemon();
		chanseyPokemon.setNombre("Chansey");
		chanseyPokemon.getTipos().add(normalTipo);

		session.save(chanseyPokemon);

//		Tangela

		Pokemon tangelaPokemon = new Pokemon();
		tangelaPokemon.setNombre("Tangela");
		tangelaPokemon.getTipos().add(plantaTipo);

		session.save(tangelaPokemon);

//		Kangaskhan

		Pokemon kangaskhanPokemon = new Pokemon();
		kangaskhanPokemon.setNombre("Kangaskhan");
		kangaskhanPokemon.getTipos().add(normalTipo);

		session.save(kangaskhanPokemon);

//		Horsea Seadra

		Pokemon horseaPokemon = new Pokemon();
		horseaPokemon.setNombre("Horsea");
		horseaPokemon.getTipos().add(aguaTipo);

		Pokemon seadraPokemon = new Pokemon();
		seadraPokemon.setNombre("Seadra");
		seadraPokemon.getTipos().add(aguaTipo);

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

		Pokemon seakingPokemon = new Pokemon();
		seakingPokemon.setNombre("Seaking");
		seakingPokemon.getTipos().add(aguaTipo);

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

		Pokemon starmiePokemon = new Pokemon();
		starmiePokemon.setNombre("Starmie");
		starmiePokemon.getTipos().add(aguaTipo);
		starmiePokemon.getTipos().add(psiquicoTipo);

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

		session.save(mrmimePokemon);

//		Scyther

		Pokemon scytherPokemon = new Pokemon();
		scytherPokemon.setNombre("Scyther");
		scytherPokemon.getTipos().add(bichoTipo);

		session.save(scytherPokemon);

//		Jynx

		Pokemon jynxPokemon = new Pokemon();
		jynxPokemon.setNombre("Jynx");
		jynxPokemon.getTipos().add(hieloTipo);
		jynxPokemon.getTipos().add(psiquicoTipo);

		session.save(jynxPokemon);

//		Electabuzz

		Pokemon electabuzzPokemon = new Pokemon();
		electabuzzPokemon.setNombre("Electabuzz");
		electabuzzPokemon.getTipos().add(electricoTipo);

		session.save(electabuzzPokemon);

//		Magmar

		Pokemon magmarPokemon = new Pokemon();
		magmarPokemon.setNombre("Magmar");
		magmarPokemon.getTipos().add(fuegoTipo);

		session.save(magmarPokemon);

//		Pinsir

		Pokemon pinsirPokemon = new Pokemon();
		pinsirPokemon.setNombre("Pinsir");
		pinsirPokemon.getTipos().add(bichoTipo);

		session.save(pinsirPokemon);

//		Tauros

		Pokemon taurosPokemon = new Pokemon();
		taurosPokemon.setNombre("Tauros");
		taurosPokemon.getTipos().add(normalTipo);

		session.save(taurosPokemon);

//		Magikarp Gyarados

		Pokemon magikarpPokemon = new Pokemon();
		magikarpPokemon.setNombre("Magikarp");
		magikarpPokemon.getTipos().add(aguaTipo);

		Pokemon gyaradosPokemon = new Pokemon();
		gyaradosPokemon.setNombre("Gyarados");
		gyaradosPokemon.getTipos().add(aguaTipo);
		gyaradosPokemon.getTipos().add(voladorTipo);

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

		session.save(laprasPokemon);

//		Ditto

		Pokemon dittoPokemon = new Pokemon();
		dittoPokemon.setNombre("Ditto");
		dittoPokemon.getTipos().add(normalTipo);

		session.save(dittoPokemon);

//		Eevee Vaporeon Jolteon Flareon

		Pokemon eeveePokemon = new Pokemon();
		eeveePokemon.setNombre("Eevee");
		eeveePokemon.getTipos().add(normalTipo);

		Pokemon vaporeonPokemon = new Pokemon();
		vaporeonPokemon.setNombre("Vaporeon");
		vaporeonPokemon.getTipos().add(aguaTipo);

		Pokemon jolteonPokemon = new Pokemon();
		jolteonPokemon.setNombre("Jolteon");
		jolteonPokemon.getTipos().add(electricoTipo);

		Pokemon flareonPokemon = new Pokemon();
		flareonPokemon.setNombre("Flareon");
		flareonPokemon.getTipos().add(fuegoTipo);

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

		session.save(porygonPokemon);

//		Omanyte Omastar

		Pokemon omanytePokemon = new Pokemon();
		omanytePokemon.setNombre("Omanyte");
		omanytePokemon.getTipos().add(rocaTipo);
		omanytePokemon.getTipos().add(aguaTipo);

		Pokemon omastarPokemon = new Pokemon();
		omastarPokemon.setNombre("Omastar");
		omastarPokemon.getTipos().add(rocaTipo);
		omastarPokemon.getTipos().add(aguaTipo);

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

//		Aerodactyl

		Pokemon aerodactylPokemon = new Pokemon();
		aerodactylPokemon.setNombre("Aerodactyl");
		aerodactylPokemon.getTipos().add(rocaTipo);
		aerodactylPokemon.getTipos().add(voladorTipo);

		session.save(aerodactylPokemon);

//		Snorlax

		Pokemon snorlaxPokemon = new Pokemon();
		snorlaxPokemon.setNombre("Snorlax");
		snorlaxPokemon.getTipos().add(normalTipo);

		session.save(snorlaxPokemon);

//		Articuno

		Pokemon articunoPokemon = new Pokemon();
		articunoPokemon.setNombre("Articuno");
		articunoPokemon.getTipos().add(hieloTipo);
		articunoPokemon.getTipos().add(voladorTipo);

		session.save(articunoPokemon);

//		Zapdos

		Pokemon zapdosPokemon = new Pokemon();
		zapdosPokemon.setNombre("Zapdos");
		zapdosPokemon.getTipos().add(electricoTipo);
		zapdosPokemon.getTipos().add(voladorTipo);

		session.save(zapdosPokemon);

//		Moltres

		Pokemon moltresPokemon = new Pokemon();
		moltresPokemon.setNombre("Moltres");
		moltresPokemon.getTipos().add(fuegoTipo);
		moltresPokemon.getTipos().add(voladorTipo);

		session.save(moltresPokemon);

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

//		Mewtwo

		Pokemon mewtwoPokemon = new Pokemon();
		mewtwoPokemon.setNombre("Mewtwo");
		mewtwoPokemon.getTipos().add(psiquicoTipo);

		session.save(mewtwoPokemon);

//		Mew

		Pokemon mewPokemon = new Pokemon();
		mewPokemon.setNombre("Mew");
		mewPokemon.getTipos().add(psiquicoTipo);

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

