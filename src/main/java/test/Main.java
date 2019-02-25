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

