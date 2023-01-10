package experiments;

    public class pokus {

        static double calcresult (double hodnota,double vysledok, String operacia) {
            //kroky podla operacie +-*/
        int tojejednoalemusibyt = 5;


            switch (operacia) {
                case "+":
                    return vysledok + hodnota;
                case "-":
                    return vysledok - hodnota;
                case "*":
                    return  vysledok * hodnota;
                case "/":
                    return  vysledok / hodnota;
                case "=":
                    return  vysledok;
            }
            return tojejednoalemusibyt;
        }

        public static void main(String[] args) {
            double z = calcresult(13,5,"+");
            System.out.println(z);
        }
    }

