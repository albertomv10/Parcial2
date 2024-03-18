import java.util.Scanner;

public class SistemaGestionEmpleados {

    public static void main(String[] args) {
        Empleados empleados = new Empleados();

        empleados.darDeAltaEmpleado("Juan", "Desarrollador", 50000);
        empleados.darDeAltaEmpleado("María", "Diseñadora", 45000);
        empleados.darDeAltaEmpleado("Pedro", "Gerente", 60000);

        Scanner scanner = new Scanner(System.in);
        System.out.print(Constantes.PEDIR_PORCENTAJE_AUMENTO_SALARIO);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);

        System.out.println(Constantes.LISTA_EMPLEADOS);
        empleados.mostrarEmpleados();

        scanner.close();
    }
}