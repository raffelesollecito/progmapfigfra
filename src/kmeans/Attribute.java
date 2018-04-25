package kmeans;

abstract class Attribute {

	private String name;
	private int index;
	
	Attribute(String nameInput, int indexInput){
		//Inizializza i valori dei membri name, index
		name = nameInput;
		index = indexInput;
	}
	
	String getName() {
		//Metodo
		//Restituisce name
		return name;
	}
	
	int getIndex() {
		return index;
	}
	
	public String toString() {
		return name;
	}
}
