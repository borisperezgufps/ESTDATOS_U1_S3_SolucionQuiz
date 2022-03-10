package ed.quiz.empleados;

public class ClienteJornada {

	public static void main(String[] args) {
		
		JornadaLaboral jl = new JornadaLaboral();
		
//		jl.ingresarInformacion(3);
		System.out.println("El promedio es = "+jl.calcularPromedioHorasTrabajadas("Domingo", 1));
		
	}
	
}
