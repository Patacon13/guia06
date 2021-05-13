package died.guia06;

import java.util.List;


public class Alumno implements Comparable<Alumno>{

	private String nombre;
	private Integer nroLibreta;
	private List<Curso> cursando;
	private List<Curso> aprobados;
	
	public Alumno() {
		nroLibreta = 1;
	}
	
	public void setnroLibreta(Integer nroLibreta) {
		this.nroLibreta = nroLibreta;
	}
	
	public int creditosObtenidos() {
		return 1;
	}

	public void aprobar(Curso c) {
		//
	}

	public void inscripcionAceptada(Curso c) {
		//
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Alumno)) return false;
		Alumno otroAlumno = (Alumno) obj;
		return nroLibreta.equals(otroAlumno.nroLibreta);
	}
	
	@Override
	public int compareTo(Alumno otroAlumno) {
		if(this.nombre.compareTo(otroAlumno.nombre) > 0) return 1;
		if(this.nombre.compareTo(otroAlumno.nombre) < 0) return -1;
		return 0;
	}

}
