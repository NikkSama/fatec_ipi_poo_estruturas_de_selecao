package estruturas;

import javax.swing.JOptionPane;

public class SwitchCase {

    static public void main(String[] outroNome){
        String conceito;
        conceito = JOptionPane.showInputDialog("Qual foi seu coneito? ");
        switch(conceito.toUpperCase()){
            case "A":
                JOptionPane.showMessageDialog(null, "Excelente");
                break;
            case "B":
                JOptionPane.showMessageDialog(null, "Muito bom");
                break;
            case "C":
                JOptionPane.showMessageDialog(null, "Bom");
                break;
            case "R":
                JOptionPane.showMessageDialog(null, "Vamos tentar novamente");
                break;
        }
    }
}
