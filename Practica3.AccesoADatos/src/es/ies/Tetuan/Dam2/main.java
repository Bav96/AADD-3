package es.ies.Tetuan.Dam2;

import java.util.List;

import es.iesTetuan.Dam.dao.implementacion.Alumnoimpl;
import es.iesTetuan.Dam2.Dao.IAlumnoDao;
import es.iesTetuan.Dam2.vo.Alumno;


public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Alumno ejemplo = new Alumnoimpl().getAlumno("171");
		
		//System.out.println("es el alumno : " +ejemplo.getNombre()  );
		//System.out.println("este es su primer apellido : " +ejemplo.getApellido1()  );
		//System.out.println("este es su segundo apellido : " +ejemplo.getApellido2()  );
		
		IAlumnoDao operacionesAlumno = new Alumnoimpl();
		
		List<Alumno> listaAlumno =  operacionesAlumno.consultarAlumno();
		
		
		for (Alumno Alumn :listaAlumno) {
			System.out.println(Alumn.getNombre() + " - " + Alumn.getApellido1() + " - " + Alumn.getApellido2());
			
		
		
		
		
	}
}
}


