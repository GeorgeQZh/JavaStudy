package gui;
 
import javax.swing.JComboBox;
import javax.swing.JFrame;
 
public class ComboBox {
    public static void main(String[] args) {
 
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(580, 240);
        f.setLayout(null);
 
        //��������ֵ���Ŀ
        String[] heros = new String[] { "��������", "����" };
        JComboBox cb = new JComboBox(heros);
 
        cb.setBounds(50, 50, 80, 30);
 
        f.add(cb);
 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        f.setVisible(true);
    }
}