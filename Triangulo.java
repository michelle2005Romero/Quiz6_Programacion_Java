/**
 * Esta es la clase que representa un triángulo, una figura geométrica con tres lados y tres ángulos.
 * Aquí guardamos dos números importantes: la base y la altura del triángulo.
 */
public class Triangulo extends FiguraGeometrica {
    private double base; // La base es un lado del triángulo.
    private double altura; // La altura es la medida vertical desde la base hasta la parte superior del triángulo.

    /**
     * Constructor de la clase Triangulo.
     *
     * @param base   El primer número que necesitamos para definir el triángulo (la base).
     * @param altura El segundo número importante para el triángulo (la altura).
     */
    public Triangulo(double base, double altura) {
        super(base); // Usamos la base como valor1 en la clase base.
        this.base = base; // La base del triángulo.
        this.altura = altura; // La altura del triángulo.
    }

    /**
     * Obtiene la base del triángulo.
     *
     * @return La base del triángulo, que es un lado importante para su forma.
     */
    public double getBase() {
        return base;
    }

    /**
     * Establece una nueva base para el triángulo.
     *
     * @param base El nuevo número que queremos usar como base del triángulo.
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Obtiene la altura del triángulo.
     *
     * @return La altura del triángulo, que es la medida vertical desde la base hasta la parte superior.
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Establece una nueva altura para el triángulo.
     *
     * @param altura El nuevo número que queremos usar como altura del triángulo.
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Método especial para calcular el tamaño (área) del triángulo.
     *
     * @return El tamaño del triángulo, que depende de la base y la altura y es la mitad de su base multiplicada por la altura.
     */
    @Override
    public double getArea() {
        return (this.base * this.altura) / 2;
    }

    /**
     * Método especial para calcular el borde (perímetro) del triángulo.
     *
     * @return El borde o perímetro del triángulo, que depende de su base, altura y la longitud de la hipotenusa (en el caso de triángulos rectángulos).
     */
    @Override
    public double getPerimetro() {
        double hipotenusa = Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.altura, 2));
        return this.base + 2 * hipotenusa;
    }
}