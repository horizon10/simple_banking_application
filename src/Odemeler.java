import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Odemeler extends sayfaOlusturma{

    private static int suBorc;
    private static int elektrikBorc;
    private static int dogalgazBorc;
    private static int krediBorc;

    public static int getSuBorc() {
        return suBorc;
    }

    public static void setSuBorc(int VsuBorc) {
        suBorc = VsuBorc;
    }

    public static int getElektrikBorc() {
        return elektrikBorc;
    }

    public static void setElektrikBorc(int VelektrikBorc) {
        elektrikBorc = VelektrikBorc;
    }

    public static int getDogalgazBorc() {
        return dogalgazBorc;
    }

    public static void setDogalgazBorc(int VdogalgazBorc) {
        dogalgazBorc = VdogalgazBorc;
    }
    public static int getKrediBorc() {
        return krediBorc;
    }

    public static void setKrediBorc(int VkrediBorc) {
        krediBorc = VkrediBorc;
    }



    public void ozellik(JFrame anaSayfa,int bakiye){
        setDogalgazBorc(200);
        setKrediBorc(1000);
        setElektrikBorc(500);
        setSuBorc(100);
        System.out.println(getSuBorc());
        JLabel label=new JLabel("Fatura seçin:");
        String fatura[]={" ","Su","Elektrik","Doğalgaz","Kredi"};
        JComboBox comboBox=new JComboBox(fatura);
        comboBox.setBounds(200,200,100,30);
        label.setBounds(100,200,100,30);
        label.setFont(f3);
        getJFrame().getContentPane().add(comboBox);
        getJFrame().getContentPane().add(label);

        JButton button = new JButton("Geri Dön");
        button.setBounds(10, 50, 100, 30);
        getJFrame().getContentPane().add(button);

        JButton button1 =new JButton("Onayla");
        button1.setBounds(500,200,100,30);
        getJFrame().getContentPane().add(button1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(1==comboBox.getSelectedIndex() && getSuBorc()!=0 && getSuBorc()<getBakiye()){
                    int hesaptakiPara=getBakiye();
                    hesaptakiPara-=getSuBorc();
                    setSuBorc(0);
                    setBakiye(hesaptakiPara);
                }
                else if(2==comboBox.getSelectedIndex() && getElektrikBorc()!=0 && getElektrikBorc()<getBakiye()){
                    int hesaptakiPara=getBakiye();
                    hesaptakiPara-=getElektrikBorc();
                    setElektrikBorc(0);
                    setBakiye(hesaptakiPara);
                }
                else if(3==comboBox.getSelectedIndex() && getDogalgazBorc()!=0 && getDogalgazBorc()<getBakiye()){
                    int hesaptakiPara=getBakiye();
                    hesaptakiPara-=getDogalgazBorc();
                    setDogalgazBorc(0);
                    setBakiye(hesaptakiPara);
                }
                else if(4==comboBox.getSelectedIndex() && getKrediBorc()!=0 && getKrediBorc()<getBakiye()){
                    int hesaptakiPara=getBakiye();
                    hesaptakiPara-=getKrediBorc();
                    setKrediBorc(0);
                    setBakiye(hesaptakiPara);
                }
                else{
                    JOptionPane.showMessageDialog(null, "işlem geçersiz");
                    return;
                }
                JOptionPane.showMessageDialog(null, "Faturanız Ödenmiştir");
            }
        });

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
