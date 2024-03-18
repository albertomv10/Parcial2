/**
 * Clase que gestiona a los empleados.
 */
class Empleados {
    private Empleado[] lista;

    /**
     * Constructor de la clase Empleados.
     */
    public Empleados() {
        lista = new Empleado[0];
    }

    /**
     * Añade un nuevo empleado a la lista de empleados.
     * @param nombre Nombre del empleado.
     * @param cargo Cargo del empleado.
     * @param salario Salario del empleado.
     */
    public void darDeAltaEmpleado(String nombre, String cargo, double salario) {
        Empleado[] nuevaLista = new Empleado[lista.length + 1];
        System.arraycopy(lista, 0, nuevaLista, 0, lista.length);
        nuevaLista[lista.length] = new Empleado(nombre, cargo, salario);
        lista = nuevaLista;
    }

    /**
     * Aumenta el salario de todos los empleados en un porcentaje dado.
     * @param porcentaje Porcentaje de aumento del salario.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    /**
     * Muestra la información de todos los empleados.
     */
    public void mostrarEmpleados() {
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
}