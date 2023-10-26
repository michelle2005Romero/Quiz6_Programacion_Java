/**
 * Esta es la clase que representa un círculo, una figura geométrica redonda.
 * En esta clase, guardamos un número especial que es el radio del círculo.
 */
public class Circulo extends FiguraGeometrica {
    private double radio; // El radio es el número clave para un círculo.

    /**
     * Constructor de la clase Circulo.
     *
     * @param radio El número que necesitamos para definir el círculo (su radio).
     */
    public Circulo(double radio) {
        super(radio); // Usamos el radio como valor1 en la clase base.
        this.radio = radio; // El radio del círculo.
    }

    /**
     * Obtiene el radio del círculo.
     *
     * @return El radio del círculo, que es el número especial para calcular su tamaño.
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece un nuevo radio para el círculo.
     *
     * @param radio El nuevo número que queremos usar como radio del círculo.
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Método especial para calcular el tamaño (área) del círculo.
     *
     * @return El tamaño del círculo, que depende del valor del radio y es igual a Pi multiplicado por el radio al cuadrado.
     */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    /**
     * Método especial para calcular el borde (perímetro) del círculo.
     *
     * @return El borde o perímetro del círculo, que depende del valor del radio y es igual a 2 veces Pi multiplicado por el radio.
     */
    @Override
    public double getPerimetro() {
        return 2 * Math.PI * this.radio;
    }
}
