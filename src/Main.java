import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        sayfaOlusturma frame1=new sayfaOlusturma();
        frame1.setBakiye(10000);
        int x=0;
        int y=0;
        ArrayList<JButton> buttons = new ArrayList<>();
        ArrayList<String>mainPage=new ArrayList<>();
        mainPage.add("Bakiye sorgulama");
        mainPage.add("Para Çekimi");
        mainPage.add("Para Yatırma");
        mainPage.add("Ödemeler");
        int sayac=0;
        for(int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                Butonlar buttonlar=new Butonlar();
                buttonlar.setText(mainPage.get(sayac));
                buttonlar.setBounds(70+x,200+y,200,50);
                frame1.getJFrame().getContentPane().add(buttonlar.getButton());
                buttons.add(buttonlar.getButton());
                x+=280;
                sayac++;
            }
            x=0;
            y+=200;
        }
        for(int i=0;i<buttons.size();i++){
            int finalI = i;
            buttons.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(finalI ==0){
                        frame1.dispose();
                        BakiyeSorgulama bakiyeSorgulama=new BakiyeSorgulama();
                        bakiyeSorgulama.ozellikler(frame1.getJFrame(),frame1.getBakiye());
                    } else if (finalI==1) {
                        frame1.dispose();
                        ParaCekimi paraCekimi=new ParaCekimi();
                        paraCekimi.ozellikler(frame1.getJFrame());
                    } else if (finalI==2) {
                        frame1.dispose();
                        ParaYatirma paraYatırma=new ParaYatirma();
                        paraYatırma.ozellikler(frame1.getJFrame(), frame1.getBakiye());
                    }else {
                        frame1.dispose();
                        Odemeler odemeler=new Odemeler();
                        odemeler.ozellik(frame1.getJFrame(),frame1.getBakiye());

                    }
                }
            });
        }


    }
}
