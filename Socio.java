import java.time.LocalDate;

class Socio implements Comparable<Socio> {
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private LocalDate fechaAlta;
    private double cuota;
    private int numFamiliares;

    public Socio(String dni, String nombre, LocalDate fechaNacimiento, LocalDate fechaAlta, double cuota, int numFamiliares) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaAlta = fechaAlta;
        this.cuota = cuota;
        this.numFamiliares = numFamiliares;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public double getCuota() {
        return cuota;
    }

    public int getNumFamiliares() {
        return numFamiliares;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Socio socio = (Socio) obj;
        return dni.equals(socio.dni);
    }

    @Override
    public int compareTo(Socio socio) {
        return dni.compareTo(socio.dni);
    }

    @Override
    public String toString() {
        return "Socio{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", fechaAlta=" + fechaAlta +
                ", cuota=" + cuota +
                ", numFamiliares=" + numFamiliares +
                '}';
    }
}
