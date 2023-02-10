
package deposito;

/**
 *
 * @author milagrosangulo
 */
public class CCuenta {

    /**
     * @return the nombre
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
     * @return the cuenta
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
     * @return the saldo
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
     * @return the tipoInterés
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
	 * @param sNombre Nombre del titular
	 * @param sCuenta Cuenta numero identificador de la cuenta 
	 * @param dSaldo Saldo de la cuenta
         * @param dTipoInteres Tipo de interes de la cuenta
	 */
   
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

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
	 * @param dCantidad Cantidad a ingresar en la cuenta
	 */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
	 * Inicia la operacion de retirada en la cuenta
	 * @param dCantidad Cantidad a retirar en la cuenta
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
