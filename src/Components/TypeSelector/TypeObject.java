package Components.TypeSelector;

public class TypeObject {

	private String Name;
	private String Color;
	
	public TypeObject(String Name, String Color) {
		this.Name = Name;
		this.Color = Color;
	}
	
	public String toString() { return Name; }

	protected String getName() {
		return Name;
	}

	protected void setName(String name) {
		Name = name;
	}

	protected String getColor() {
		return Color;
	}

	protected void setColor(String color) {
		Color = color;
	}
	
}
