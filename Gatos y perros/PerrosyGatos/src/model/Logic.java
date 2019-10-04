package model;

//import java.text.ParseException;

import processing.core.PApplet;

public class Logic {
	
	private PApplet app;
	private String[] textOne,textTwo,textThree;
	private DogList dogList;
	private DuenoList duenoList;
	
	public Logic(PApplet app) {
		this.app = app; 
		textOne = app.loadStrings("../data/imports/datosUno.txt");
		duenoList = new DuenoList();
		textTwo = app.loadStrings("../data/imports/datosDos.txt");
		dogList = new DogList();
		textThree = app.loadStrings("../data/imports/Gatos.txt");
		
		
		loadStrings();
	}
	
	
	private void loadStrings() {
		// Se carga primer TXT
		for (String texto : textOne) {
			//Se parte cada linea por comas
			String [] info = texto.split(",");
			//----------------
			int id = Integer.parseInt(info[0]);
			String name = info[1];
			int age = Integer.parseInt(info[2]);
			String race = info[3];
			//--------------------
			
			dogList.addElement(id, name, age, race);
		}
		
		//-----------------------
		// Se carga segundo TXT
		for (int i = 0; i < dogList.getList().size(); i++) {
			for (int j = 0; j < textTwo.length; j++) {
				String [] infoD = textTwo[j].split(",");
				//----------------
				int id = Integer.parseInt(infoD[0]);
				String nombre = infoD[1];
				String apellido = infoD[2];
				int identificacion = Integer.parseInt(infoD[3]);
				int telefono = Integer.parseInt(infoD[4]);
				String direccion = infoD[5];
				String enfermedades = infoD[6];
				//-----------
				duenoList.addElement(id, nombre, apellido, identificacion, telefono, direccion, enfermedades);
				
			
			}
		}
		duenoList.printList();
		dogList.printList();
		
		
	}
}
