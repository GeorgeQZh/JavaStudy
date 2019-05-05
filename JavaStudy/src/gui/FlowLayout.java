package gui;
 
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
 
public class FlowLayout {
    public static void main(String[] args) {
 
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        // ���ò�����ΪFlowLayerout
        // �����ϵ����ˮƽ�ڷ�
        f.setLayout(new java.awt.FlowLayout());
 
        JButton b1 = new JButton("Ӣ��1");
        JButton b2 = new JButton("Ӣ��2");
        JButton b3 = new JButton("Ӣ��3");
        
     // ���� ʹ�� ������ ��Ҳ���� ͨ��setPreferredSize���򲼾�������������ʾ�Ĵ�С
        b3.setPreferredSize(new Dimension(180, 40));
 
        // ���뵽�������ɣ����赥��ָ����С��λ��
        f.add(b1);
        f.add(b2);
        f.add(b3);
 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        f.setVisible(true);
    }
}