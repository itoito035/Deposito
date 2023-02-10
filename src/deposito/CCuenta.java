
package deposito;

/**
 * Clase con que realiza las operaciones del menú
 * @author milagrosangulo
 */
public class CCuenta {

   /**
   * Método que devuelve el titular de la cuenta
   * @return  nombre  del titular
   */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   /**
   * Método que devuelve el numero de la cuenta
   * @return  cuenta  
   */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

   /**
   * Método get que devuelve el saldo de la cuenta
   * @return saldo Saldo pendiente en la cuenta
   */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método get que devuelve el tipo de interés de la cuenta
     * @return tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    /**
     * Constructor que inicializa los parametros de clase de las cuentas 
     */
   
    private String nombre;//Nombre del titular
    private String cuenta;//Cuenta numero identificador de la cuenta
    private double saldo;//Saldo de la cuenta
    private double tipoInterés;//Tipo de interes de la cuenta

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Inicia la consulta del estado de la cuenta
     * @return Saldo Saldo actual de la cuenta
     */

    public double estado()
    {
        return getSaldo();
    }
    /**
     * Inicia la operacion de ingreso en la cuenta
     * @param cantidad Cantidad a ingresar en la cuenta
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Inicia la operacion de retirada en la cuenta
     * @param cantidad Cantidad a retirar en la cuenta
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

}
