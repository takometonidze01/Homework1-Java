public class Main {
    private int aValue;
    private int bValue;
    private int cValue;

    //constructor
    public Main(int a, int b, int c) {
        aValue = a;
        bValue = b;
        cValue = c;
    }

    public int calculateDiscriminant() {
        int answer = ((bValue*bValue)+(-4*aValue*cValue));
        return answer;
    }


    public static String smallest(String words[]) {
        if (words == null || words.length < 1) {
            return "";
        }
        String smallest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Main firstQuad = new Main(7, 5, 3);
        System.out.println(firstQuad.calculateDiscriminant());
        String[] wordArray = { "test", "okay", "bye", "morning", "fun", "no", "friday" };
        System.out.println("The shortest word is " + smallest(wordArray));
        Fraction fraction1 = new Fraction();
        fraction1.numerator = 500;
        fraction1.denominator = 1000;

        Fraction fraction2 = new Fraction();
        fraction2.numerator = 4;
        fraction2.denominator = 5;

        System.out.println(fraction1.multiply(fraction2));
        System.out.println(fraction1.add(fraction2));
        System.out.println(Fraction.simplify(fraction1));
    }
}