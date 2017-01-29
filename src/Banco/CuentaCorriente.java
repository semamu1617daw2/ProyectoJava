package Banco;


/**
 * Clase CuentaCorriente
 * Contiene la información de Cuentas Corriente
 * @author Laura Bujalance Aaron Salvador David Ramirez
 */

public class CuentaCorriente extends Cuenta{
    
    /**
     * Creación del constructor
     * @param Numerocuenta Número de cuenta
     * @param EstadoCuenta Estado de la cuenta activada/desactivada
     * @param CodigoEntidad Código de la entidad financiera
     * @param CodigoOficina Código de la oficina
     * @param NIF NIF del cliente propietario
     */
    public CuentaCorriente(int Numerocuenta, boolean EstadoCuenta, int CodigoEntidad, int CodigoOficina, String NIF) {
        super(Numerocuenta, EstadoCuenta, CodigoEntidad, CodigoOficina, NIF);
    }
    /**
     * Creación del constructor vacio
    */
    public CuentaCorriente() {
    }
    /**
     * {@inheritDoc}
     * La comisión de apertura de Cuenta Corriente es de 10 euros
     */
    @Override
    public void Comision() {
        System.out.println("Comision por apertura aplicada importe 10 euros");
        Saldo-=10;
    }
    /**
    *{@inheritDoc}
    * Retira dinero del saldo
    */
    @Override
    public void Retirar(double cantidad) {
        setSaldo(Saldo-=cantidad);
    }
    /**
    *{@inheritDoc}
    */  
    @Override
    public String toString() {
        return super.toString()+"CuentaCorriente";
    }
    
    
    
}