package died.guia06;

public class App {

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno();
		Alumno alumno2 = new Alumno();
		alumno2.setnroLibreta(Integer.valueOf(5));
		System.out.print(alumno1.equals(alumno2));
	}
}
