import javax.swing.JOptionPane;

  public class Calculadora
  {
    public static void main( String [] args)
    {
        String firstNumber = JOptionPane.showInputDialog( "Digite um número");
        String secondNumber = JOptionPane.showInputDialog( "Digite um segundo número");
        String opc = 
            JOptionPane.showInputDialog( "Escolha um número de 1 a 4");   
               
        int number1 = Integer.parseInt( firstNumber );
        int number2 = Integer.parseInt( secondNumber );
        int opcao = Integer.parseInt( opc);  
        
        if(opcao==1){
        int divisao = number1 / number2;
        JOptionPane.showMessageDialog( null, "A divisão dos números é: " + divisao, "Resultado final é:", JOptionPane.PLAIN_MESSAGE );
        } 
        
        if(opcao==2){
        int multiplicacao = number1 * number2;  
        JOptionPane.showMessageDialog( null, "a multiplicação é:" + multiplicacao, "Resultado final é :", JOptionPane.PLAIN_MESSAGE );
        }
        if(opcao == 3){
            int soma = number1 + number2; 
            JOptionPane.showMessageDialog( null, "a soma é: " + soma, "Resultado final é:", JOptionPane.PLAIN_MESSAGE );
        }
    }
}