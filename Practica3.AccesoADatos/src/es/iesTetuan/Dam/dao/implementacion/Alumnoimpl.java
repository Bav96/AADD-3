package es.iesTetuan.Dam.dao.implementacion;
import es.iesTetuan.Dam2.Dao.*;
import es.iesTetuan.Dam2.utilidades.GestorConfiguracion;
import es.iesTetuan.Dam2.vo.Alumno;

import es.iesTetuan.Dam2.Dao.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class Alumnoimpl implements IAlumnoDao {

	
	public static void main(String[] args) {
		
	}

	
	@Override
	public  List<Alumno> getListaAlumno() {
		List<Alumno> listaAlumno= new ArrayList<Alumno>();
		Alumno Alumno=null;
		File fichero = new File ("C:\\xampp\\htdocs\\aadd\\recursos\\alumnos-dam2-nuevos.xml");
		Document documento = null;
		
		
		try {
			
			  
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			  DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			  documento = dBuilder.parse(fichero);
			  documento.getDocumentElement().normalize();
			
			
				  
				
			
		}catch(Exception e) {
			  e.printStackTrace();
			}
		
		NodeList nListIni = documento.getElementsByTagName("Alumno");
		System.out.println("Nº de bloques de Alumno: " + nListIni.getLength());
		for(int temp = 0; temp < nListIni.getLength(); temp++) {
			Node nNode = nListIni.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
			    Element elemento = (Element) nNode;
			    String sId = elemento.getAttribute("id");
			    int id= Integer.parseInt(sId);
		    	String nombre= elemento.getElementsByTagName("nombre").item(0).getTextContent();
		    	String apellido1= elemento.getElementsByTagName("apellido1").item(0).getTextContent();
		    	String apellido2= elemento.getElementsByTagName("apellido2").item(0).getTextContent();
		    	Alumno=new Alumno();
		    	Alumno.getNie();
		    	Alumno.setNombre(nombre);
		    	Alumno.setApellido1(apellido1);
		    	Alumno.setApellido2(apellido2);
		    	listaAlumno.add(Alumno);
			}
		}
		
		return listaAlumno;
	
	}

	@Override
	public Alumno getAlumno(String nie)  {
		
		String esteeseliddelalumno="";
		String esteeselnombredelalumno="";
		String esteeselprimerapellidodelalumno="";
		String esteeselsegundoapellidodelalumno="";
		
		
		try {
			File ArchivoXml = new File("C:\\xampp\\htdocs\\aadd\\recursos\\alumnos-dam2-nuevos.xml");  
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(ArchivoXml);
			
			doc.getDocumentElement().normalize();
			
			NodeList ListaNodo = doc.getElementsByTagName("alumno");
		//	System.out.println("Es el alumno " + ListaNodo.getLength());
			
			for(int temp = 0; temp < ListaNodo.getLength(); temp++) {
				  Node nNode = ListaNodo.item(temp);

				  if(nNode.getNodeType() == Node.ELEMENT_NODE) {
				    Element eElement = (Element) nNode;
				    
				  	if (eElement.getAttribute("id").equals(nie)) {
				    esteeseliddelalumno=eElement.getAttribute("id");	
				  	esteeselnombredelalumno=eElement.getElementsByTagName("nombre").item(0).getTextContent();
				  	esteeselprimerapellidodelalumno=eElement.getElementsByTagName("apellido1").item(0).getTextContent();
				  	esteeselsegundoapellidodelalumno=eElement.getElementsByTagName("apellido2").item(0).getTextContent();
				  	
				  	}	
				  	
				  }
			}
			
			
			} catch(Exception e) {
			  e.printStackTrace();
			}
		Alumno esteeselalumnoquevamosadevolver = new Alumno();
		esteeselalumnoquevamosadevolver.setNie(esteeseliddelalumno);
		esteeselalumnoquevamosadevolver.setNombre(esteeselnombredelalumno);
		esteeselalumnoquevamosadevolver.setApellido1(esteeselprimerapellidodelalumno);
		esteeselalumnoquevamosadevolver.setApellido2(esteeselsegundoapellidodelalumno);
		
		
		
		return esteeselalumnoquevamosadevolver;
	}


	@Override
	public List<Alumno> consultarAlumno() {
		// TODO Auto-generated method stub
		List<Alumno> listaAlumno= new ArrayList<Alumno>();
		Alumno Alumno=null;
		File fichero = new File ("C:\\xampp\\htdocs\\aadd\\recursos\\alumnos-dam2-nuevos.xml");
		Document documento = null;
		
		
		try {
			
			  
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			  DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			  documento = dBuilder.parse(fichero);
			  documento.getDocumentElement().normalize();
			
			
				  
				
			
		}catch(Exception e) {
			  e.printStackTrace();
			}
		
		NodeList nListIni = documento.getElementsByTagName("alumno");
		System.out.println("Nº de bloques de Alumno: " + nListIni.getLength());
		for(int temp = 0; temp < nListIni.getLength(); temp++) {
			Node nNode = nListIni.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
			    Element elemento = (Element) nNode;
			    String sId = elemento.getAttribute("id");
			    int id= Integer.parseInt(sId);
		    	String nombre= elemento.getElementsByTagName("nombre").item(0).getTextContent();
		    	String apellido1= elemento.getElementsByTagName("apellido1").item(0).getTextContent();
		    	String apellido2= elemento.getElementsByTagName("apellido2").item(0).getTextContent();
		    	Alumno=new Alumno();
		    	Alumno.getNie();
		    	Alumno.setNombre(nombre);
		    	Alumno.setApellido1(apellido1);
		    	Alumno.setApellido2(apellido2);
		    	listaAlumno.add(Alumno);
			}
		}
		
		return listaAlumno;
	
	}


	@Override
	public void crearAlumno(Alumno Alumno) {
		// TODO Auto-generated method stub
		
		List <Alumno> listadeAlumnos= consultarAlumno();
			boolean existe= false;
			for (Alumno alumno: listadeAlumnos) {
				if(alumno.getNie()==Alumno.getNie()) {
					existe= true;
					break;
				}			
			}
			// Se crea el fichero si no existía el departamento, si no, se deja como estaba.
			if(!existe) {
				listadeAlumnos.add(Alumno);
				guardarAlumnos(listadeAlumnos);
			}
		}



	@Override
	public void borrarAlumno(String nie) {
		// TODO Auto-generated method stub
		
		List <Alumno> listadeAlumnos= consultarAlumno();
		boolean existe= false;
		for (Alumno alumno: listadeAlumnos) {
			if(alumno.getNombre()==nie) {
				listadeAlumnos.remove(alumno);
				existe= true;
				System.out.print("Borrado");
				break;
			}			
		}
		// Solo se borra la información si existía un departamento. Si no, se deja como estaba.
		if(existe)
			guardarAlumnos(listadeAlumnos);
	}
	



	@Override
	public void modificarAlumno(String nie) {
		// TODO Auto-generated method stub
		
	}
	private void guardarAlumnos(List<Alumno> listadeAlumnos) {
		Document documento = null;
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			//DOMImplementation domImpl = dBuilder.getDOMImplementation();
			//documento = domImpl.createDocument(null, "xml", null);
			documento = dBuilder.newDocument();
				
			// Se crear el nodo raíz
			Element raiz = documento.createElement("alumno");
			documento.appendChild(raiz);

			// Información para nodos internos
			Element nodoAlumno = null , nodoDatos = null ;
			Text texto = null;
			for (Alumno alumno: listadeAlumnos) {
				// Se asigna el nodo/elemento usuario a elemento raíz 
				nodoAlumno = documento.createElement("id");
				raiz.appendChild(nodoAlumno);
				
				// Se carga información número de departamento
				nodoDatos = documento.createElement("numero");
				nodoAlumno.appendChild(nodoDatos);
				String numid= String.valueOf(alumno.getNie());
				texto = documento.createTextNode(numid);
				nodoDatos.appendChild(texto);
	
				// Se carga información nombre
				nodoDatos = documento.createElement("nombre");
				nodoAlumno.appendChild(nodoDatos);
				texto = documento.createTextNode(alumno.getNombre());
				nodoDatos.appendChild(texto);

				// Se carga información apellido1
				nodoDatos = documento.createElement("Apellido1");
				nodoAlumno.appendChild(nodoDatos);
				texto = documento.createTextNode(alumno.getApellido1());
				nodoDatos.appendChild(texto);
				
				// Se carga información apellido1
				nodoDatos = documento.createElement("Apellido2");
				nodoAlumno.appendChild(nodoDatos);
				texto = documento.createTextNode(alumno.getApellido2());
				nodoDatos.appendChild(texto);
			}
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			String rutaOrigen = GestorConfiguracion.getInfoConfiguracion("origenDepartamentos");
			Result output = new StreamResult(new File(rutaOrigen));
			Source input = new DOMSource(documento);
			transformer.transform(input, output);
		} catch(Exception e) {
			  e.printStackTrace();
		}		
	}
}
