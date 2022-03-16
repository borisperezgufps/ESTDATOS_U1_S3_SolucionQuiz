package ed.quiz.empleados;

import javax.swing.JOptionPane;

public class JornadaLaboral {

	private int[][] horasLaboradas = {
			{1,2,4,3,4,5,8,8},
			{1,7,3,4,3,3,4,4},
			{3,3,3,4,3,3,2,2},
			{1,9,3,4,7,3,4,1},
			{2,3,5,4,3,6,3,8},
			{2,3,7,4,8,3,8,4},
			{3,6,3,5,9,2,7,9},
	};
	
	private int[][] horasLaboradasPorTipoEmpleado;
	
	public void ingresarInformacion(int tamanoMuestra) {
		// Las filas corresponden a la cantidad de empleados, 
		// y eso corresponde al tama�o de la muestra.
		// Las columnas no pueden cambiar porque son fijas.
		horasLaboradas = new int[tamanoMuestra][8];
		
		for(int i=0;i<horasLaboradas.length;i++) {
			
			String tipoEmpleado = JOptionPane.showInputDialog("Ingrese el "
					+ "tipo de empleado (1-Directivo, 2-Jefe �rea, 3-Analista): ");
			horasLaboradas[i][0] = Integer.parseInt(tipoEmpleado);
						
			for(int j=1;j<horasLaboradas[i].length;j++) {
				String horas = JOptionPane.showInputDialog("Ingrese la "
						+ "cantidad de horas trabajadas: ");
				horasLaboradas[i][j] = Integer.parseInt(horas);
			}
		}
		
		for(int i=0;i<horasLaboradas.length;i++) {
			for(int j=0;j<horasLaboradas[i].length;j++) {
				System.out.print(horasLaboradas[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public double calcularPromedioHorasTrabajadas(String diaSemana, int tipoEmpleado) {
		
//		for(int i=0;i<horasLaboradas.length;i++) {
//			for(int j=0;j<horasLaboradas[i].length;j++) {
//				System.out.print(horasLaboradas[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		int columnaDiaSemana = 0;
		switch (diaSemana) {
		case "Domingo":
			columnaDiaSemana = 1;
			break;
		case "Lunes":
			columnaDiaSemana = 2;
			break;
		case "Martes":
			columnaDiaSemana = 3;
			break;
		case "Miercoles":
			columnaDiaSemana = 4;
			break;
		case "Jueves":
			columnaDiaSemana = 5;
			break;
		case "Viernes":
			columnaDiaSemana = 6;
			break;
		case "Sabado":
			columnaDiaSemana = 7;
			break;
		}
		
		double promedio = 0.0;
		int sumaHoras = 0;
		int cont = 0;
		
		for(int i=0;i<horasLaboradas.length;i++) {
			if(horasLaboradas[i][0]==tipoEmpleado) {
				for(int j=1;j<horasLaboradas[i].length;j++) {
					if(j==columnaDiaSemana) {
						sumaHoras += horasLaboradas[i][j];
						cont++;
					}
				}				
			}
		}
		
		promedio = (double)sumaHoras/cont;
		
		return promedio;
	}
	
	/**
	 * M�todo bono
	 * @param diaSemana
	 * @param tipoEmpleado
	 * @return
	 */
	public void calcularHorasTrabajadas() {
		// Para realizar por los estudiantes	
	}
	
	/**
	 * M�todo bono
	 * @param diaSemana
	 * @param tipoEmpleado
	 * @return
	 */
	public void imprimirCalculoHorasTrabajadas() {
		// Para realizar por los estudiantes
	}
	
	
	
	
	
}
