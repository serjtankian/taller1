package App;

import java.util.ArrayList;
/** Representa a una fruta y algunos de sus atributos.
 * @author Sebastian Arias
 */
public class Fruit {
  public String name;
  private float averageWeight;
  public ArrayList<String> colors;
/**
 * Se declara a colors como instancia de ArrayList
 */
  public Fruit(){
     colors=new ArrayList<String>();
  }
 /**
  * Se crea la fruta a partir del constructor y los siguientes pareamtros.
  * @param name nombre
  * @param averageWeight peso promedio
  * @param colors array de colores
  */
 public Fruit(String name, float averageWeight,ArrayList<String> colors ){
     /**
      * se inicializan los atributos de la clase
      */
 this.name=name;
 this.averageWeight=averageWeight;
  this.colors= colors;
 }
/**
 * Agrega al array de colores mas valores.
 * @param nameColor valor pasado por parametro
 */
 public void setColors(String nameColor) {
     this.colors.add(nameColor);
 }
 /**
  * Retorna coleccion actual del array.
  * @return
  */
 public ArrayList<String> getColors() {
     return colors;
 }
 /**
  * Actualiza el valor del peso promedio.
  * @param averageWeight  peso promedio
  */
 public void setAverageWeight(float averageWeight) {
     this.averageWeight = averageWeight;
 }
 /**
  * Retorna el valor actual del peso promedio.
  * @return
  */
 public float getAverageWeight() {
     return averageWeight;
 }
    
}
