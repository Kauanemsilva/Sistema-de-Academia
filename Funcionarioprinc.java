import javax.swing.JOptionPane;
public class Funcionarioprinc {
 
 public static void main (String [] args) {
 Funcionario Funcionario1 = new Funcionario();
 
 Funcionario1.nome =  JOptionPane.showInputDialog(null, "Digite o seu nome");
 Funcionario1.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade"));
 Funcionario1.cpf = JOptionPane.showInputDialog(null, "Digite seu cpf:");
 Funcionario1.cargo = JOptionPane.showInputDialog(null, "Digite o cargo desejado:");
 Funcionario1.salario =Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o salário:"));
 
JOptionPane.showMessageDialog(null, "Nome:" + Funcionario1.nome + "\n" + "Idade: " + Funcionario1.idade
  + "\n" + "CPF: " + Funcionario1.cpf + "\n" + "Cargo:" + Funcionario1.cargo + "\n" + "Salario: "+Funcionario1.salario); 


 
 }
}