public class Perro {
    //Atributos
    private String nombre, raza, color;
    private byte edad;
    private double peso;

    //Getters y setters de cada atributo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //---------Métodos---------
    //Comer
    public void comer(String tipoComida, double cantidad)
    {
        System.out.println(nombre + " está comiendo " + cantidad + " gramos de " + tipoComida);
    }

    //Ladrar
    public String ladrar()
    {
        return "guau guau";
    }



}
