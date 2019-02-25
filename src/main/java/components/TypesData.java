package components;
public class TypesData {
	static public String[] typeNames = {
			"Normal", "Lucha", "Volador", "Veneno",
			"Tierra", "Roca", "Bicho", "Fantasma",
			"Acero", "Fuego", "agua", "Planta",
			"Eléctrico", "Psíquico", "Hielo","Dragón",
			"Siniestro","Hada"
	};
	static public String[] typeColors = {
			"-fx-background-color: #A8A878; ",
			"-fx-background-color: #C03028; ",
			"-fx-background-color: #A890F0; ",
			"-fx-background-color: #A040A0; ",
			"-fx-background-color: #E0C068; ",
			"-fx-background-color: #B8A038; ",
			"-fx-background-color: #A8B820; ",
			"-fx-background-color: #705898; ",
			"-fx-background-color: #B8B8D0; ",
			"-fx-background-color: #F08030; ",
			"-fx-background-color: #6890F0; ",
			"-fx-background-color: #78C850; ",
			"-fx-background-color: #F8D030; ",
			"-fx-background-color: #F85888; ",
			"-fx-background-color: #98D8D8; ",
			"-fx-background-color: #7038F8; ",
			"-fx-background-color: #705848; ",
			"-fx-background-color: #EE99AC; ",
	};
	static public float[][] typeDamage = { 
		{ 1, 1, 1, 1, 1, (float) 0.5, 1, 0, (float) 0.5, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
		{ 2, 1, (float) 0.5, (float) 0.5, 1, 2, (float) 0.5, 0, 2, 1, 1, 1, 1, (float) 0.5, 2, 1, 2, (float) 0.5 },
		{ 1, 2, 1, 1, 1, (float) 0.5, 2, 1, (float) 0.5, 1, 1, 2, (float) 0.5, 1, 1, 1, 1, 1 },
		{ 1, 1, 1, (float) 0.5, (float) 0.5, (float) 0.5, 1, (float) 0.5, 0, 1, 1, 2, 1, 1, 1, 1, 1, 2 },
		{ 1, 1, 0, 2, 1, 2, (float) 0.5, 1, 2, 2, 1, (float) 0.5, 2, 1, 1, 1, 1, 1 },
		{ 1, (float) 0.5, 2, 1, (float) 0.5, 1, 2, 1, (float) 0.5, 2, 1, 1, 1, 1, 2, 1, 1, 1 },
		{ 1, (float) 0.5, (float) 0.5, (float) 0.5, 1, 1, 1, (float) 0.5, (float) 0.5, (float) 0.5, 1, 2, 1, 2, 1, 1, 2, (float) 0.5 },
		{ 0, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, (float) 0.5, 1 },
		{ 1, 1, 1, 1, 1, 2, 1, 1, (float) 0.5, (float) 0.5, (float) 0.5, 1, (float) 0.5, 1, 2, 1, 1, 2 },
		{ 1, 1, 1, 1, 1, (float) 0.5, 2, 1, 2, (float) 0.5, (float) 0.5, 2, 1, 1, 2, (float) 0.5, 1, 1 },
		{ 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, (float) 0.5, (float) 0.5, 1, 1, 1, (float) 0.5, 1, 1 },
		{ 1, 1, (float) 0.5, (float) 0.5, 2, 2, (float) 0.5, 1, (float) 0.5, (float) 0.5, 2, (float) 0.5, 1, 1, 1, (float) 0.5, 1, 1 },
		{ 1, 1, 2, 1, 0, 1, 1, 1, 1, 1, 2, (float) 0.5, (float) 0.5, 1, 1, (float) 0.5, 1, 1 },
		{ 1, 2, 1, 2, 1, 1, 1, 1, (float) 0.5, 1, 1, 1, 1, (float) 0.5, 1, 1, 0, 1 },
		{ 1, 1, 2, 1, 2, 1, 1, 1, (float) 0.5, (float) 0.5, (float) 0.5, 2, 1, 1, (float) 0.5, 2, 1, 1 },
		{ 1, 1, 1, 1, 1, 1, 1, 1, (float) 0.5, 1, 1, 1, 1, 1, 1, 2, 1, 0 },
		{ 1, (float) 0.5, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, (float) 0.5, (float) 0.5 },
		{ 1, 2, 1, (float) 0.5, 1, 1, 1, 1, (float) 0.5, (float) 0.5, 1, 1, 1, 1, 1, 2, 2, 1 } 
	};
}