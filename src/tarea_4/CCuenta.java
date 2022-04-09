package tarea_4;
/**
 * Clase Cuenta.
 * <p>
 * Está clase contiene 4 métodos:
 * 
 * 1- Método Estado.
 * 2- Métdoo Ingresar.
 * 3- Método Retirar.
 * 4- Método Operativa_Cuena.
 * </p>
 * @author S@Mu 1º DAW Noche.
 * @version 1.0 Prueba de refactorización.
 */
public class CCuenta {   
    
    // Parametros de la clase.
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Constructor vacio para la clase cuenta.
    */
    
    public CCuenta()
    {
    }

    /**
     * Constructor con parametros de la clase cuenta.
     * @param nom nombre del titular.
     * @param cue número de cuneta.
     * @param sal saldo de la cuenta.
     * @param tipo tipo de interes.
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    } 

    /**
     *
     * @return String el nombre.
     */
    
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre nombre de la cuenta.
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     *
     * @return String el número de cuenta.
     */
    
    public String getCuenta() {
        return cuenta;
    }

    /**
     *
     * @param cuenta el número de cuenta.
     */
    
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     *
     * @return el saldo de la cuenta
     */
    
    public double getSaldo() {
        return saldo;
    }
    
    /**
     *
     * @param saldo el saldo de la cuenta.
    */
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     *  
     * @return el tipo de interes de la cuenta. 
    */
    
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     *
     * @param tipoInterés el tipo de interes de la cuenta.
    */
    
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    /**
     * Método Estado:
     * <p>
     * El método es sencillo no tiene parámetro nos comprueba el saldo
     * de la cuenta.
     * </p>   
     * @return el estado del saldo de la cuenta mediante getSaldo().
    */
    
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método Ingresar:
     * <p>
     * Ingresar cantidad en la cuenta, dada una cantidad el método por medio de un bucle if nos analiza 
     * si la cantidad a ingresar en la cuenta es mayor a 0, 
     * sino lanzará una excepción.
     * </p>
     * @param cantidad la cantidad a ingresar.
     * @throws java.lang.Exception si la cantidad es negativa.
     * 
    */
    
    public void ingresar(float cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método Retirar:
     * <p>
     * Retira cantidad de la cuenta, dada una cantidad el método por medio de un bucle if nos analiza
     * si la cantidad a retirar en la cuenta es mayor o igual a 0 o el saldo es
     * insuficiente, sino lanzará una excepción.
     * </p>
     * @param cantidad la cantidad a retirar.
     * @throws java.lang.Exception si la cantidad es negativa o igual a 0
     * el saldo es insuficiente.
     * 
    */
    
    public void retirar(float cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    /**
     * Método Operativa Cuenta
     * <p>
     * En este método hacemos una operativa general de la cuenta y sus métodos         
     * </p>
     * @param cuenta la cuenta del usuario con sus parámetros.
     * @throws java.lang.Exception si hay saldo inferior a la cantidad, se intenta retirar una
     * cantidad menor o igual a 0, si se ingresa una cantidad negativa.
     * @see #estado()
     * @see #retirar(float)
     * @see #ingresar(float)
     * 
    */
    
    public void operativa_cuenta(CCuenta cuenta) throws Exception
    {   
        double saldoActual;
        float cantidad;  
        
        saldoActual = cuenta.estado();
        System.out.println("El saldo actual es "+ saldoActual );
        
        try {
            System.out.println("Efectivo retirado");
            cuenta.retirar(2300f);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(695f);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
                
        System.out.println("El saldo actual es "+ cuenta.getSaldo());
    }   
}
    
    
    

