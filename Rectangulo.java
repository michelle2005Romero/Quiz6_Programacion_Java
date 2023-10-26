/**Esta es la clase que representa un rectángulo. Los rectángulos son figuras con cuatro ángulos rectos.
     Aquí guardamos dos números importantes: uno para la base y otro para la altura del rectángulo.
 */

public class Rectangulo extends FiguraGeometrica {
    protected double valor2; // Este número es la altura del rectángulo.

    /**
     * Constructor de la clase Rectangulo.
     *
     * @param valor1 El primer número que necesitamos para el rectángulo (la base).
     * @param valor2 El segundo número importante para el rectángulo (la altura).
     */
    public Rectangulo(double valor1, double valor2) {
        super(valor1); // El número 1 es la base del rectángulo.
        this.valor2 = valor2; // El número 2 es la altura del rectángulo.
    }

    /**
     * Obtiene la altura del rectángulo.
     *
     * @return La altura del rectángulo, que es un número importante para el tamaño del rectángulo.
     */
    public double getValor2() {
        return valor2;
    }

    /**
     * Establece una nueva altura para el rectángulo.
     *
     * @param valor2 El nuevo número que queremos usar como altura del rectángulo.
     */
    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    /**
     * Método especial para calcular el tamaño (área) del rectángulo.
     *
     * @return El tamaño del rectángulo, que es el resultado de multiplicar la base por la altura.
     */
    @Override
    public double getArea() {
        return this.valor1 * this.valor2;
    }

    /**
     * Método especial para calcular el borde (perímetro) del rectángulo.
     *
     * @return El borde o perímetro del rectángulo, que es el resultado de sumar todos sus lados.
     */
    @Override
    public double getPerimetro() {
        return 2 * (this.valor1 + this.valor2);
    }
}