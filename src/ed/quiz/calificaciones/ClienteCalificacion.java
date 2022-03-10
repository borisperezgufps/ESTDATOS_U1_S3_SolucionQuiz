package ed.quiz.calificaciones;

public class ClienteCalificacion {

	public static void main(String[] args) {
		
		CalificacionExamen ce = new CalificacionExamen();
		
		ce.ingresarOpcionesCorrectas();
		ce.calificarEstudiantes();
		ce.imprimirCalificaciones();
		
	}
	
}
