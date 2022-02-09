package App;

import java.util.Date;
/** La clase representa a una persona y sus datos principales.
 * @author Sebastian Arias
 */
public class Person {
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
 /**
  * 
  * @param name nombre
  * @param lastName1 apellido1
  * @param lastName2 apellido2
  * @param dateBirth fecha de nacimiento
  * @param height altura
  */
 public Person(String name,String lastName1,String lastName2,Date dateBirth, float height ){
     /**
      * atributos inicializados.
      */
   this.name=name;
   this.lastName1=lastName1;
   this.lastName2=lastName2;
   this.dateBirth=dateBirth;
   this.height=height;
 }
 /**
  * Retorna el valor actual de nombre.
  * @return
  */
 public String getName() {
     return name;
 }
 /**
  * Actualiza el valor de nombre.
  * @param name nombre
  */
 public void setName(String name) {
     this.name = name;
 }
 /**
  * Actualiza el valor de la fecha de nacimiento.
  * @param dateBirth fecha de naciemiento
  */
 public void setDateBirth(Date dateBirth) {
     this.dateBirth = dateBirth;
 }
 /**
  * Retorna la fecha actual de nacimiento.
  * @return
  */
 public Date getDateBirth() {
     return dateBirth;
 }
}

