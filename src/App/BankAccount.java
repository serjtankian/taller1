package App;
/**
 * Representa a una cuenta bancaria
 * @author Sebastian Arias
 */

public class BankAccount {
    /**
     * atributos propios de la clase.
     */
    private int accountNumber;
    protected boolean activated;
/**
 * Se crea la cuenta bancaria con estos valores pasados por paramtro.
 * @param accountNumber
 * @param activated
 */
    public BankAccount(int accountNumber,Boolean activated){
        this.accountNumber=accountNumber;
        this.activated=activated;

    }
   /**
    * Actualiza el valor de id actual de la cuenta bancaria.
    * @param accountNumber
    */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    /**
     * Retorna el valor actual del id de la cuenta bancaria.
     * @return
     */
    public int getAccountNumber() {
        return accountNumber;
    }
   /**
    * Booleano que representa si la cuenta esta activa o no.
    * @param activated booleano
    */
    public void setActivated(Boolean activated) {
        this.activated = activated;
    }
    
}
