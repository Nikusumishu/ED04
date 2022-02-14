package cuentas;

/**
 * 
 * @author David Lopez de la Muñoza
 */

public class CCuenta {

    /**
     * Estan los metodos necesarios para trabajar con esta clase
     * @return Nombre del titular
     * 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre del titular de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return el numero de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param añade una cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return el saldo disponible en la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param añade saldo a la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return obtiene el tipo de interes
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés añade el tipo de interes a la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    
    /**
     * Nombre del titular de la Cuenta
     */
    private String nombre;
    /**
     * La identificacion de la Cuenta
     */
    private String cuenta;
    /**
     * El saldo disponible en la Cuenta
     */
    private double saldo;
    /**
     * El interes que tiene en la Cuenta
     */
    private double tipoInterés;

    /**
     * Constructor sin parametros
     */
    
    public CCuenta()
    {
    }

    /**
     * 
     * @param nom Nombre del titular de la cuenta
     * @param cue Datos de la cuenta
     * @param sal Saldo de la cuenta
     * @param tipo Interes de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * 
     * @return Estado de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * 
     * @param cantidad ingresa una cantidad a la cuenta
     * @throws Exception Si la cantidad es negativa sale la excepcion
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * 
     * @param cantidad retira una cantidad de la cuenta
     * @throws Exception Si no hay suficiente saldo o la cantidad a retirar es negativa, salta la excepcion
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
