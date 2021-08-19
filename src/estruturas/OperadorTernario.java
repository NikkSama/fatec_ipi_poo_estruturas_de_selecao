package estruturas;

import javax.swing.*;

public class OperadorTernario {
    public static void main(String[] args) {
        byte idade = Byte.parseByte(JOptionPane.showInputDialog("Qual a sua idade"));
//      boolean podeDirigir = idade >= 18;

        String resultado;
        resultado = idade >= 18 ? "Sim, você pode dirigir" : "Não, você não pode dirigir por enquanto";

        JOptionPane.showMessageDialog(null, resultado);

//        if (idade >= 18)
//            podeDirigir = true;
//        else
//            podeDirigir = false;
    }
}
