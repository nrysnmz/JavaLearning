package method;

class Calc {
    public int add(int m1, int m2) {
        return m1 + m2;
    }
}

    class AdvCalc extends Calc {
        public int add(int m1, int m2) {
            return m1 + m2 + 4;
        }
    }

    public class Overriding1 {
        public static void main(String[] args) {
            AdvCalc calculator = new AdvCalc();
            int sum = calculator.add(9, 8);
            System.out.println(sum);

        }
    }




