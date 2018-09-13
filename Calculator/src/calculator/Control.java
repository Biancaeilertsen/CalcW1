package calculator;

public class Control {
    int x;
    int y;
    String memory;


        public int add ( int x, int y){
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
        }

        public String Memory(){
            return memory;

        }
}
