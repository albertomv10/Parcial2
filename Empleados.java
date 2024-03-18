class Empleados {
    private Empleado[] lista;

    public Empleados() {
        lista = new Empleado[0];
    }

    public void darDeAltaEmpleado(String nombre, String cargo, double salario) {
        Empleado[] nuevaLista = new Empleado[lista.length + 1];
        System.arraycopy(lista, 0, nuevaLista, 0, lista.length);
        nuevaLista[lista.length] = new Empleado(nombre, cargo, salario);
        lista = nuevaLista;
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
}