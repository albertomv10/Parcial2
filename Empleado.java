/**
 * Clase que representa a un empleado.
 */
class Empleado {
    private String nombre;
    private String cargo;
    private double salario;

    /**
     * Constructor de la clase Empleado.
     * @param nombre Nombre del empleado.
     * @param cargo Cargo del empleado.
     * @param salario Salario del empleado.
     */

    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Método que devuelve una representación en forma de cadena del objeto Empleado.
     * @return Representación en forma de cadena del objeto Empleado.
     */

    @Override
    public String toString() {
        return Constantes.EMPLEADO + "{" +
                Constantes.NOMBRE + "='" + nombre + '\'' +
                ", " + Constantes.CARGO + "='" + cargo + '\'' +
                ", " + Constantes.SALARIO + "=" + salario +
                '}';
    }
}