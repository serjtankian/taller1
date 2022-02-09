package App;
/**Representa una figuta geometrica basica
 * @author Sebastian Arias
 */
public class Figura {
    /**
     * ejes coordenados de la figura
     */
    private int x;
    private int y;
    /**
     * 
     * @param x eje cartesiano x
     * @param y eje cartesiano y
     */
    public Figura(int x,int y){
        this.x=x;
        this.y=y;
    }
    /**
     * Actualiza el valor de la coordenada x.
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }
    /**
     * Retorna el valor actual de x.
     * @return
     */
    public int getX() {
        return x;
    }
    /**
     * Actualiza el valor de la coordenada y
     * @param y
     */
    public void setY(int y) {
        this.y = y;

    }
    /**
     * Retorna el valor actual de y
     * @return
     */
    public int getY() {
        return y;
    }
}
