package Banco;


/**
 * Interficie ContratoFinanciero
 * Implementa los métodos tasas y Comisión
 * @author Laura Bujalance Aaron Salvador David Ramirez
 */
public interface ContratoFinanciero {
    /**
    *Método que le cobra a la cuenta una tasa de 2 euros por cada operación que se haga
    */ 
    public abstract double tasas();
    /**
    * Método abstracto que aplica una comisión al crear una cuenta
    */ 
    public abstract void Comision();
}
