package ed.quiz.calificaciones;

import javax.swing.JOptionPane;

public class CalificacionExamen {

	private char[][] respuestas = {
			{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
			{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
			{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
			{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
		};
	
	private char[] opcionesCorrectas = {'A','A','A','A','A','A','A','A','A','A'};
	private double[] calificaciones;
	
	public void ingresarOpcionesCorrectas() {
		opcionesCorrectas = new char[10];
		for(int t=0;t<opcionesCorrectas.length;t++) {
			String opcion = JOptionPane.showInputDialog("Ingrese letra correcta: ");
			char letra = opcion.charAt(0);
			opcionesCorrectas[t] = letra;
		}
	}
	
	public void calificarEstudiantes() {
		calificaciones = new double[8];
		
		for(int i=0;i<respuestas.length;i++) {
			double totalRespuestasCorrectas = 0;
			for(int j=0;j<respuestas[i].length;j++) {
				if(respuestas[i][j]==opcionesCorrectas[j]) {
					totalRespuestasCorrectas++;
				}
			}
			calificaciones[i] = totalRespuestasCorrectas/2;
		}
	}
	
	public void imprimirCalificaciones() {
		System.out.println("Las calificaciones son las siguientes:");
		for(int t=0;t<calificaciones.length;t++) {
			System.out.println("Estudiante "+t+": "+calificaciones[t]);
		}
	}
	
	/**
	 * Método bono
	 */
	public void imprimirLetrasRepetidas() {
		// Para elaborar por el estudiante
	}
	
}
