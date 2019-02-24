package test;

import org.hibernate.Session;

import components.TypesData;
import dad.models.conf.HibernateUtil;
import dad.models.estructura.Eficacia;
import dad.models.estructura.Evolucion;
import dad.models.estructura.MetodoEvolucion;
import dad.models.estructura.Pokemon;
import dad.models.estructura.Tipo;

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

		Pokemon bulbasaurPokemon = new Pokemon();
		bulbasaurPokemon.setNombre("Bulbasaur");
		bulbasaurPokemon.getTipos().add(plantaTipo);
		bulbasaurPokemon.getTipos().add(venenoTipo);

		Pokemon ivysaurPokemon = new Pokemon();
		ivysaurPokemon.setNombre("Ivysaur");
		ivysaurPokemon.getTipos().add(plantaTipo);
		ivysaurPokemon.getTipos().add(venenoTipo);

		Pokemon venesaurPokemon = new Pokemon();
		venesaurPokemon.setNombre("Venesaur");
		venesaurPokemon.getTipos().add(plantaTipo);
		venesaurPokemon.getTipos().add(venenoTipo);

	
		Evolucion evolucionBulbasaurIvysaur = new Evolucion();
		evolucionBulbasaurIvysaur.getPokemons().add(bulbasaurPokemon);
		evolucionBulbasaurIvysaur.getPokemons().add(ivysaurPokemon);
		evolucionBulbasaurIvysaur.setMetodo(MetodoEvolucion.NIVEL);

		
		Evolucion evolucionIvysaurVenesaur = new Evolucion();
		evolucionIvysaurVenesaur.getPokemons().add(ivysaurPokemon);
		evolucionIvysaurVenesaur.getPokemons().add(venesaurPokemon);
		evolucionIvysaurVenesaur.setMetodo(MetodoEvolucion.NIVEL);

		bulbasaurPokemon.getEvoluciones().add(evolucionBulbasaurIvysaur);
		ivysaurPokemon.getEvoluciones().add(evolucionIvysaurVenesaur);
		session.save(evolucionBulbasaurIvysaur);
		session.save(evolucionIvysaurVenesaur);

		session.save(bulbasaurPokemon);
		session.save(ivysaurPokemon);
		session.save(venesaurPokemon);

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

