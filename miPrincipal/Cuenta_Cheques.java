package miPrincipal;

public class Cuenta_Cheques {

   private String nombreCuenta;
   private String nombreCliente;
   private String sucursal;
   private float saldo;
   
   

   public Cuenta_Cheques() {
      nombreCuenta = "";
      nombreCliente = "";
      sucursal = "";
      saldo = 0;
   }
   
   public Cuenta_Cheques(String nombreCuenta, String nombreCliente, String sucursal) {
      this.nombreCuenta = nombreCuenta;
      this.nombreCliente = nombreCliente;
      this.sucursal = sucursal;
      this.saldo = saldo;
   }
   
   public float deposito(float cadena) {
      return 0.0f;
   }



   public float retiro(float cadena) {
      return 0.0f;
   }



   public float muestra_saldo(){
      return 0.0f;
   }
   
   
   
   
   public String getNombreCuenta() {
      return nombreCuenta;
   }
   public void setNombreCuenta(String nombreCuenta) {
      this.nombreCuenta = nombreCuenta;
   }
   public String getNombreCliente() {
      return nombreCliente;
   }
   public void setNombreCliente(String nombreCliente) {
      this.nombreCliente = nombreCliente;
   }
   public String getSucursal() {
      return sucursal;
   }
   public void setSucursal(String sucursal) {
      this.sucursal = sucursal;
   }
   public float getSaldo() {
      return saldo;
   }
   public void setSaldo(float saldo) {
      this.saldo = saldo;
   }



   
   //coloca el codigo faltante
    
    
}
