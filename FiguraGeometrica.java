 /**
 * Esta es una clase especial para representar figuras geométricas como círculos, rectángulos y triángulos.
 * Aquí tenemos algunos números (como el radio o la base) que son importantes para calcular el área y el perímetro.
 */
public abstract class FiguraGeometrica {
    protected double valor1; // Este número es fundamental para nuestros cálculos.

    /**
     * Constructor de la clase FiguraGeometrica.
     *
     * @param valor1 Un número que necesitamos para hacer nuestros cálculos.
     */
    public FiguraGeometrica(double valor1) {
        this.valor1 = valor1;
    }

    /**
     * Obtiene el número especial que usamos en nuestros cálculos.
     *
     * @return El número que es importante para nuestras matemáticas.
     */
    public double getValor1() {
        return valor1;
    }

    /**
     * Establece un nuevo valor para nuestro número especial.
     *
     * @param valor1 El nuevo número que queremos usar en nuestros cálculos.
     */
    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    /**
     * Método especial para calcular el tamaño de nuestra figura.
     *
     * @return El tamaño de la figura, pero depende de qué figura sea. Cada figura lo calcula a su manera.
     */
    public abstract double getArea();

    /**
     * Método especial para calcular el borde de nuestra figura.
     *
     * @return El borde o perímetro de la figura, pero nuevamente, depende de la figura específica.
     */
    public abstract double getPerimetro();
}