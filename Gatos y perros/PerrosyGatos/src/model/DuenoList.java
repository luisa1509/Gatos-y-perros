package model;
import java.util.LinkedList;

public class DuenoList {

	private LinkedList<Dueno> list;
	
		public DuenoList() {
			list = new LinkedList<Dueno>();
		}
		
		public void addElement(int id,String nombre,String apellido,int identificacion,
				int telefono,String direccion,String enfermedades) {
			list.add(new Dueno(id,nombre,apellido,identificacion,telefono,direccion,
					enfermedades));
		}
		
		public void addDuenoList(Dueno dueno) {
			list.add(dueno);
		}
		
		public void printList() {
			for (Dueno dueno : list) {
				System.out.println(dueno.getId()+" "+dueno.getNombre()+" "
			+dueno.getApellido()+" "+dueno.getIdentificacion()+" "+dueno.getTelefono()
			+" "+dueno.getDireccion()+" "+dueno.getEnfermedades());
			}
		}

		public LinkedList<Dueno> getList() {
			return list;
		}

		public void setList(LinkedList<Dueno> list) {
			this.list = list;
		}
	}

