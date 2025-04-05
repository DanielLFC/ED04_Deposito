/**
 * Clase que representa una cuenta bancaria con operaciones básicas.
 * Permite realizar ingresos, retiros y consultar el saldo.
 * @author Dani
 */
package cuentas;

public class CCuenta {
    /**
     * Nombre del titular de la cuenta
     */
    private String nombre;
    
    /**
     * Número de identificación de la cuenta
     */
    private String cuenta;
    
    /**
     * Saldo actual de la cuenta
     */
    private double saldo;
    
    /**
     * Tipo de interés aplicado a la cuenta
     */
    private double tipoInterés;

    /**
     * Constructor por defecto que crea una cuenta vacía
     */
    public CCuenta() {
    }
    
    /**
     * Constructor que inicializa todos los atributos de la cuenta
     * @param nom Nombre del titular de la cuenta
     * @param cue Número de identificación de la cuenta
     * @param sal Saldo inicial de la cuenta
     * @param tipo Tipo de interés aplicable a la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    // Métodos getter y setter con su documentación
    
    /**
     * Obtiene el nombre del titular de la cuenta
     * @return Nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta
     * @param nombre Nombre del titular a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de identificación de la cuenta
     * @return Número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de identificación de la cuenta
     * @param cuenta Número de cuenta a establecer
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta
     * @return Saldo disponible
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta
     * @param saldo Saldo a establecer
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés aplicado a la cuenta
     * @return Tipo de interés actual
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés para la cuenta
     * @param tipoInterés Tipo de interés a aplicar
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Consulta el saldo actual de la cuenta
     * @return Saldo disponible en la cuenta
     */
    public double estado() {
        return saldo;
    }
    
    /**
     * Ingresa una cantidad de dinero en la cuenta
     * @param cantidad Cantidad a ingresar (debe ser positiva)
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de dinero de la cuenta
     * @param cantidad Cantidad a retirar (debe ser positiva y menor que el saldo)
     * @throws Exception Si la cantidad es negativa o no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
//Vamos a ver si sale