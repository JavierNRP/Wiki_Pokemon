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
		electricoTipo.setNombre("Eléctrico");
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
		psiquicoTipo.setNombre("Psíquico");
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
		dragonTipo.setNombre("Dragón");
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
//		plantaTipo.getPokemons().add(bulbasaurPokemon);
//		venenoTipo.getPokemons().add(bulbasaurPokemon);

		Pokemon ivysaurPokemon = new Pokemon();
		ivysaurPokemon.setNombre("Ivysaur");
		ivysaurPokemon.getTipos().add(plantaTipo);
		ivysaurPokemon.getTipos().add(venenoTipo);
//		plantaTipo.getPokemons().add(ivysaurPokemon);
//		venenoTipo.getPokemons().add(ivysaurPokemon);

		Pokemon venusaurPokemon = new Pokemon();
		venusaurPokemon.setNombre("Venusaur");
		venusaurPokemon.getTipos().add(plantaTipo);
		venusaurPokemon.getTipos().add(venenoTipo);
//		plantaTipo.getPokemons().add(venusaurPokemon);
//		venenoTipo.getPokemons().add(venusaurPokemon);

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
		fuegoTipo.getPokemons().add(charmanderPokemon);

		Pokemon charmeleonPokemon = new Pokemon();
		charmeleonPokemon.setNombre("Charmeleon");
		charmeleonPokemon.getTipos().add(fuegoTipo);
		fuegoTipo.getPokemons().add(charmeleonPokemon);

		Pokemon charizardPokemon = new Pokemon();
		charizardPokemon.setNombre("Charizard");
		charizardPokemon.getTipos().add(fuegoTipo);
		charizardPokemon.getTipos().add(voladorTipo);
		fuegoTipo.getPokemons().add(charizardPokemon);
		voladorTipo.getPokemons().add(charizardPokemon);

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

		Pokemon wartortlePokemon = new Pokemon();
		wartortlePokemon.setNombre("Wartortle");
		wartortlePokemon.getTipos().add(aguaTipo);

		Pokemon blastoisePokemon = new Pokemon();
		blastoisePokemon.setNombre("Blastoise");
		blastoisePokemon.getTipos().add(aguaTipo);

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

		Pokemon metapodPokemon = new Pokemon();
		metapodPokemon.setNombre("Metapod");
		metapodPokemon.getTipos().add(bichoTipo);

		Pokemon butterfreePokemon = new Pokemon();
		butterfreePokemon.setNombre("Butterfree");
		butterfreePokemon.getTipos().add(bichoTipo);
		butterfreePokemon.getTipos().add(voladorTipo);
		bichoTipo.getPokemons().add(butterfreePokemon);
		voladorTipo.getPokemons().add(butterfreePokemon);

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
		evolucionPikachuRaichu.setMetodo(MetodoEvolucion.NIVEL);

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
		evolucionNidorinaNidoqueen.setMetodo(MetodoEvolucion.NIVEL);

		nidoranFPokemon.getEvoluciones().add(evolucionNidoranFNidorina);
		nidorinaPokemon.getEvoluciones().add(evolucionNidorinaNidoqueen);
		session.save(evolucionNidoranFNidorina);
		session.save(evolucionNidorinaNidoqueen);

		session.save(nidoranFPokemon);
		session.save(nidorinaPokemon);
		session.save(nidoqueenPokemon);

//		NidoranM Nidorino Nidoking

		Pokemon nidoranMPokemon = new Pokemon();
		nidoranMPokemon.setNombre("Nidoran♀");
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
		evolucionNidorinoNidoking.setMetodo(MetodoEvolucion.NIVEL);

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
		evolucionClefairyClefable.setMetodo(MetodoEvolucion.NIVEL);

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
		evolucionVulpixNinetales.setMetodo(MetodoEvolucion.NIVEL);

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
		evolucionJigglypuffWigglytuff.setMetodo(MetodoEvolucion.NIVEL);

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
		evolucionGloomVileplume.setMetodo(MetodoEvolucion.NIVEL);

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
		evolucionGrowlitheArcanine.setMetodo(MetodoEvolucion.NIVEL);

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
		evolucionPoliwhirlPoliwrath.setMetodo(MetodoEvolucion.NIVEL);

		poliwagPokemon.getEvoluciones().add(evolucionPoliwagPoliwhirl);
		poliwhirlPokemon.getEvoluciones().add(evolucionPoliwhirlPoliwrath);
		session.save(evolucionPoliwagPoliwhirl);
		session.save(evolucionPoliwhirlPoliwrath);

		session.save(poliwagPokemon);
		session.save(poliwhirlPokemon);
		session.save(poliwrathPokemon);

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

