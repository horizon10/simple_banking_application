import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParaCekimi extends sayfaOlusturma{
    public void ozellikler(JFrame anaSayfa){
        JLabel label=new JLabel("Çekmek istediğiniz tutarı yazınız:");
        label.setBounds(100,200,250,20);
        label.setBackground(new Color(11, 80, 80,255));
        label.setFont(f3);
        getJFrame().getContentPane().add(label);

        TextField textField=new TextField();
        textField.setBounds(350,200,100,30);
        getJFrame().getContentPane().add(textField);

        JButton button1 =new JButton("Onayla");
        button1.setBounds(500,200,100,30);
        getJFrame().getContentPane().add(button1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cikarilanPara=Integer.parseInt(textField.getText());
                int hesaptakiPara=getBakiye();
                if(hesaptakiPara>=cikarilanPara){
                    hesaptakiPara-=cikarilanPara;
                    setBakiye(hesaptakiPara);
                    JOptionPane.showMessageDialog(null, cikarilanPara+" TL Çekilmiştir");
                }
                else
                    JOptionPane.showMessageDialog(null, "işlem geçersiz");
                textField.setText("");
            }
        });


        getJFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Geri Dön");
        button.setBounds(10, 50, 100, 30);
        getJFrame().getContentPane().add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getJFrame().setVisible(false); // Yeni sayfayı gizle
                anaSayfa.setVisible(true); // Ana sayfayı görünür yap
            }
        });
    }
}
