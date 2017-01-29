package Banco;


/**
 * Clase CuentaAhorro
 * Contiene la información de Cuentas Ahorro 
 * @author Laura Bujalance Aaron Salvador David Ramirez
 */

public class CuentaAhorro extends Cuenta{
    /**
     * Intereses Intereses de bonificación de saldo
     */
    private int Intereses = 4;
    /**
     * Creación del constructor
     * @param Numerocuenta Número de cuenta
     * @param EstadoCuenta Estado de la cuenta activada/desactivada
     * @param CodigoEntidad Código de la entidad financiera
     * @param CodigoOficina Código de la oficina
     * @param NIF NIF del cliente propietario
     */
    public CuentaAhorro(int Numerocuenta, boolean EstadoCuenta, int CodigoEntidad, int CodigoOficina, String NIF) {
        super(Numerocuenta, EstadoCuenta, CodigoEntidad, CodigoOficina, NIF);
    }
    /**
     * Método que devuelve los Intereses de bonificación de saldo
     * @return  Intereses de bonificación de saldo
     */
    public int getIntereses() {
        return Intereses;
    }
    /**
     * Método que modifica el valor del atributo Intereses de bonificación de saldo
     * @param Intereses Intereses de bonificación de saldo
     */
    public void setIntereses(int Intereses) {
        this.Intereses = Intereses;
    }
    /**
     * Método que asigna el valor del Saldo mas los intereses 
     * @param Saldo Saldo de la cuenta
     * @return Saldo Saldo mas los intereses de bonificación 
     */
    public double Interes(double Saldo){
        System.out.println("Interés del 4% aplicado a su saldo");
        return Saldo*1.04;       
    }
    /**
     * {@inheritDoc}
     * La comisión de apertura de Cuenta Ahorro es de 15 euros
     */
    @Override
    public void Comision() {
        System.out.println("Comision por apertura aplicada importe 15 euros");
        Saldo-=15;
    }   
    /**
     * {@inheritDoc}
     * Las cuentas de ahorro no pueden retirar dinero
     */
    @Override
    public void Retirar(double cantidad) {
        System.out.println("Las cuentas Ahorro no pueden retirar dinero");
    }
    /**
     * Método que muestra la información completa de un objeto
     * @return Información sobre cuenta y Intereses de bonificación de la cuenta
     */
    @Override
    public String toString() {
        return super.toString()+"CuentaAhorro{" + "Intereses=" + Intereses + '}';
    }
    
    
    
}
