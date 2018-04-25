/**
 * 
 */
package kmeans;

/**
 * <p>Title: Data </p>
 * <p>Copyright: Copyright (c) 2018 </p>
 * <p>Class description: classe concreta Data</p>
 * Data modella l'insieme di transazioni
 * @author Serena De Ruvo
 * @version 1.0
 * 
 */
class Data {
	//attributi
	private Object data [][];
	private int numberOfExamples;
	private Attribute explanatorySet[];

	/**
	 * Questo e' il costruttore che inizializza la matrice data con transazioni di esempio,
	 * inizializza explanatorySet creando 5 oggetti di tipo DiscreteAttribute, infine 
	 * inizializza numberOfExamples.
	 */
	Data() { //costruttore
		data = new Object [14][5];

		data[0][0]="Sunny";
		data[0][1]="Hot";
		data[0][2]="High";
		data[0][3]="Weak";
		data[0][4]="No";

		data[1][0]="Sunny";
		data[1][1]="Hot";
		data[1][2]="High";
		data[1][3]="Strong";
		data[1][4]="No";

		data[2][0]="Overcast";
		data[2][1]="Hot";
		data[2][2]="High";
		data[2][3]="Weak";
		data[2][4]="Yes";

		data[3][0]="Rain";
		data[3][1]="Mild";
		data[3][2]="High";
		data[3][3]="Weak";
		data[3][4]="Yes";

		data[4][0]="Rain";
		data[4][1]="Cool";
		data[4][2]="Normal";
		data[4][3]="Weak";
		data[4][4]="Yes";

		data[5][0]="Rain";
		data[5][1]="Cool";
		data[5][2]="Normal";
		data[5][3]="Strong";
		data[5][4]="No";

		data[6][0]="Overcast";
		data[6][1]="Cool";
		data[6][2]="Normal";
		data[6][3]="Strong";
		data[6][4]="Yes";

		data[7][0]="Sunny";
		data[7][1]="Mild";
		data[7][2]="High";
		data[7][3]="Weak";
		data[7][4]="No";

		data[8][0]="Sunny";
		data[8][1]="Cool";
		data[8][2]="Normal";
		data[8][3]="Weak";
		data[8][4]="Yes";

		data[9][0]="Rain";
		data[9][1]="Mild";
		data[9][2]="Normal";
		data[9][3]="Weak";
		data[9][4]="Yes";

		data[10][0]="Sunny";
		data[10][1]="Mild";
		data[10][2]="Normal";
		data[10][3]="Strong";
		data[10][4]="Yes";

		data[11][0]="Overcast";
		data[11][1]="Mild";
		data[11][2]="High";
		data[11][3]="Strong";
		data[11][4]="Yes";

		data[12][0]="Overcast";
		data[12][1]="Hot";
		data[12][2]="Normal";
		data[12][3]="Weak";
		data[12][4]="Yes";

		data[13][0]="Rain";
		data[13][1]="Mild";
		data[13][2]="High";
		data[13][3]="Strong";
		data[13][4]="No";


		numberOfExamples = 14;		 


		explanatorySet = new Attribute[5];

		String outLookValues[] = new String[3];
		outLookValues[0]="Overcast";
		outLookValues[1]="Rain";
		outLookValues[2]="Sunny";
		explanatorySet[0] = new DiscreteAttribute("Outlook", 0, outLookValues);

		String temperatureValues[] = new String[3];
		temperatureValues[0]="Hot";
		temperatureValues[1]="Cool";
		temperatureValues[2]="Mild";
		explanatorySet[1] = new DiscreteAttribute("Temperature", 1, temperatureValues);

		String humidityValues[] = new String[2];
		humidityValues[0]="High";
		humidityValues[1]="Normal";
		explanatorySet[2] = new DiscreteAttribute("Humidity", 2, humidityValues);

		String windValues[] = new String[2];
		windValues[0]="Weak";
		windValues[1]="Strong";
		explanatorySet[3] = new DiscreteAttribute("Wind", 3, windValues);

		String playTennisValues[] = new String[2];
		playTennisValues[0]="Yes";
		playTennisValues[1]="No";
		explanatorySet[4] = new DiscreteAttribute("PlayTennis", 4, playTennisValues);
	}

	
	//metodi
	
	/**
	 * Questo metodo restituisce la cardinalita' dell'insieme di transazioni.
	 * @return numberOfExamples
	 */
	int getNumberOfExamples() {
		return numberOfExamples;
	}

	/**
	 * Questo metodo restituisce la cardinalita' dell'insieme di attributi.
	 * @return dimensione di explanatorySet
	 */
	int getNumberOfExplanatoryAttributes() {
		return explanatorySet.length;
	}

	/**
	 * Questo metodo restituisce il valore assunto in data dall'attributo 
	 * in posizione attributeIndex, nella riga in posizione exampleIndex.
	 * @param exampleIndex indice riga
	 * @param attributeIndex indice colonna
	 * @return data[exampleIndex][attributeIndex]
	 */
	Object getAttributeValue(int exampleIndex, int attributeIndex) {
		return data[exampleIndex][attributeIndex];
	}

	/**
	 * Questo metodo restituisce l'attributo presente in explanatorySet in posizione index.
	 * @param index indice 
	 * @return explanatorySet[index]
	 */
	Attribute getAttributeSchema(int index) {
		return explanatorySet[index];
	}

	/**
	 * Questo metodo crea una stringa in cui memorizza lo schema della tabella e 
	 * le transazioni memorizzate in data, opportunamente enumerate. Restituisce tale stringa.
	 */
	public String toString() {
		String s = "   ";

		for (int j=0; j<getNumberOfExplanatoryAttributes(); j++) {
			s = s + getAttributeSchema(j) + "\t    ";
		}
		s = s + "\n ";

		for (int i=0; i<getNumberOfExamples(); i++) {
			s = s + (i+1) + ": ";
			for (int j=0; j<getNumberOfExplanatoryAttributes(); j++) {
				s = s + getAttributeValue(i, j) + "\t\t";
			}
			s = s + "\n ";
		}
		return s;
	}


	/**
	 * Questo e' il main.
	 * @param args input
	 */
	public static void main(String[] args) {	//main
		Data trainingSet = new Data();
		System.out.println(trainingSet);
	}

}
