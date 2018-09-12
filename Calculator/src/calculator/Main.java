package calculator;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                UI myUI = new UI();
                myUI.setVisible(true);
            }
        });

        int x;
        int y;


        /*public int add ( int x, int y){
            return x + y;
        }

        public int sub ( int x, int y){
            return x - y;
        }

        public int mult ( int x, int y){
            return x * y;
        }

        public int div ( int x, int y){
            return x % y;
        }*/
    }

}
