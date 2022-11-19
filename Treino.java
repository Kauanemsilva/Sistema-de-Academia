
import javax.swing.JOptionPane;

public class Treino {

 public static void main(String[] args) {
  
  
  String resp;
  resp = JOptionPane.showInputDialog("Selecione um treino de A à D");
  String treino = "";

  switch (resp) {
  case "A": {
   treino = " Mobilidade - 15MIN \n Panturrilha Vertical | 3 séries 10 À 12 repetições "
     + "\n Agachamento no Smith | 3 séries 12 À 15 repetições \n"
  + " Afundo com halter | 3 séries 10 À 12 repetições"
  + " \n Leg Press 45º | 3 séries 10 À 12 repetições \n"
     + " Cadeira Extensora | 3 séries 10 À 12 repetições"
     + "\n Cadeira Adutora | 3 séries 12 À 15 repetições \n "; 
   break;
  }
  case "B": {
   treino = "Alogamento - 10MIN \n" + " \n Supino reto | 3 séries 10 À 12 repetições "
  + " \n Supino inclinado | 3 séries 10 À 12 repetições " 
     + "\n Flexão de braço | 3 séries 10 À 12 repetições" 
  + "\n Tríceps pulley | 3 séries 10 À 12 repetições" 
     + "\n Tríceps testa | 3 séries 10 À 12 repetições" ; 
   break;
  }
  
  case "C": {
   treino = "Mobilidade - 15MIN" + "\n Leg horizontal | 3 séries 10 À 12 repetições"
  + "\n Cadeira flexora | 3 séries 10 À 12 repetições"
     + "\n Stiff | 3 séries 10 À 12 repetições"
     + "\n Agachamento sumô | 3 séries 10 À 12 repetições"
     + "\n Glúteo no cross | 3 séries 10 À 12 repetições"
     + "\n Cadeira abdutora | 3 séries 10 À 12 repetições";
   break;
  }
  case "D": {
   treino = "Alogamento - 10MIN" + "\n Pulley anterior | 3 séries 10 À 12 repetições"
  + "\n Pulley anterior neutra | 3 séries 10 À 12 repetições"
     + "\n Remada sentada pronada | 3 séries 10 À 12 repetições"
  + "\n Remada cavalinho | 3 séries 10 À 12 repetições "
     + "\n Fly inverso | 3 séries 10 À 12 repetições"
  + "\n Rosca direta | 3 séries 10 À 12 repetições"
     + "\n Rosca martelo | 3 séries 10 À 12 repetições";
   break;
  }
  default: {
   treino = "Treino não localizado,";
  }
  }
  JOptionPane.showMessageDialog(null, treino);
   

 }

}