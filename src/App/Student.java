package App;


import java.util.Date;
/**
 * La clase representa a estudiante
 * @author Sebastian Arias
 */

public class Student extends Person {
    /**
     * atributos propios de la clase.
     */
    private int studentId;
    private float examNote;
/**
 * 
 * @param name nombre
 * @param lastName1 apellido 1
 * @param lastName2 apellido 2
 * @param dateBirth fecha de nacimiento
 * @param height    altura
 * @param studentId id de estudiante
 * @param examNote nota de examen
 */
    public Student(String name,String lastName1,String lastName2,Date dateBirth, float height,int studentId,float examNote){
      super(name, lastName1, lastName2, dateBirth, height);
      this.studentId=studentId;
      this.examNote=examNote;
    }
    /**
     * Actualiza el valor de la nota de examen.
     * @param examNote valor de la nota de examen
     */
    public void setExamNote(float examNote) {
        this.examNote = examNote;
    }
    /**
     * Retorna el valor actual de la nota de examen
     * @return
     */
    public float getExamNote() {
        return examNote;
    }
    /**
     * Actualiza el id de estudiante.
     * @param studentId valor del id de estudiante
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    /**
     * Retorna el valor actual del id de estudiante.
     * @return
     */
    public int getStudentId() {
        return studentId;
    }
    /**
     * Muetras los atributos name, lastName1, lastName2 y dateBirth en recuadro y concatenados.
     */
protected void showData(){
        System.out.println("Name: "+name+
        "\nLastName1: "+lastName1+
        "\nLastName2: "+lastName2+
        "\nBirthDate: "+dateBirth
        );
    }
}
