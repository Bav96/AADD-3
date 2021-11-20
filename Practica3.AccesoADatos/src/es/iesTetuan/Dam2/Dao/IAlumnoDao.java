package es.iesTetuan.Dam2.Dao;


import java.util.List;

import es.iesTetuan.Dam2.vo.Alumno;







	public interface IAlumnoDao {
	Alumno getAlumno(String nie);

	List<Alumno> getListaAlumno();
	public List<Alumno> consultarAlumno();
	public void crearAlumno(Alumno alumno);
	public void borrarAlumno(String id);
	public void modificarAlumno(String id);
	
	
	
	 
}
