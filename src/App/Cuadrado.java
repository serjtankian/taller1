package App;
/**La clase representa a un cuadrado que extiende de figura.
 * @author Sebastian Arias
 */
public class Cuadrado extends Figura{
    /**
     * atributo propio de la clase.
     */
private int lateral;
/**
 * Se crea el cuadrado con estos valores pasados por parametro.
 * @param x
 * @param y
 */
    public Cuadrado(int x, int y) {
        super(x, y);
     
    }
    /**
     * Actualiza el valor actual de la longitud del lado del cuadrado
     * @param lateral
     */
    public void setLateral(int lateral) {
        this.lateral = lateral;
    }
    /**
     * Retorna la longitud actual de lateral del cuadrado.
     * @return
     */
    public int getLateral() {
        return lateral;
    }
    /**
     * Metodo que retorna la superficie del cuadrado.
     * lado*lado
     * @return
     */
    public int sup(){
        return lateral*lateral;
    }

}
