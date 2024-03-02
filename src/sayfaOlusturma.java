import javax.swing.*;
import java.awt.*;

public class sayfaOlusturma {
    private JFrame jFrame;
    private static int bakiye;
    public static int getBakiye() {
        return bakiye;
    }
    public static void setBakiye(int bakiyeValue) {
        bakiye = bakiyeValue;
    }
    Font f3=new Font("Arial",Font.BOLD,15);
    Font f4=new Font("Arial",Font.BOLD,20);
    public sayfaOlusturma() {
        this.bakiye = getBakiye();
        jFrame = new JFrame("Ana Sayfa");
        jFrame.setBounds(500, 100, 650, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().setBackground(new Color(133, 19, 19));
        JLabel label=new JLabel("BANK");
        label.setBounds(250,50,300,30);
        Font f2=new Font("Arial",Font.BOLD,40);
        label.setFont(f2);
        jFrame.getContentPane().add(label);
        jFrame.setResizable(false);
        jFrame.setLayout(null); // Varsayılan düzeni null olarak ayarladım
        jFrame.setVisible(true);
    }

    public void dispose() {
        jFrame.setVisible(false);
    }

    // Ana yöntemlerin yanı sıra, JFrame nesnesine erişim sağlamak için bir get yöntemi de eklenebilir.
    public JFrame getJFrame() {
        return jFrame;
    }

}
