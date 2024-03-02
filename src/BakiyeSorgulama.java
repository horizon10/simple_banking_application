import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BakiyeSorgulama extends sayfaOlusturma{

    public void ozellikler(JFrame anaSayfa,int bakiye){
        JLabel label=new JLabel("Bakiyeniz:");
        label.setBounds(200,200,100,50);
        label.setBackground(new Color(11, 80, 80,255));
        label.setFont(f3);
        getJFrame().getContentPane().add(label);

        getJFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1=new JLabel(String.valueOf(bakiye));
        label1.setBounds(300,200,100,50);
        label1.setFont(f4);
        label1.setBackground(new Color(161, 161, 8));
        getJFrame().getContentPane().add(label1);


        JButton button = new JButton("Geri Dön");
        button.setBounds(10, 50, 100, 30);
        getJFrame().getContentPane().add(button);

        getJFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getJFrame().setVisible(false); // Yeni sayfayı gizle
                anaSayfa.setVisible(true); // Ana sayfayı görünür yap
            }
        });
    }
}
