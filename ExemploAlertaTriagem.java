
public class ExemploAlertaTriagem {
    public static void main(String[] args) {
        
    

     // Dados coletados no atendimento
     double temperatura = 38.5;
     int frequenciaCardiaca = 110;

     // O alerta é verdadeiro se a febre for alta E os batimentos estiverem acima do normal
     boolean alertaEmergencia = (temperatura > 38.0) && (frequenciaCardiaca > 100);

     System.out.println("Disparar alerta: " + alertaEmergencia); 
     // Saída: true

}
}