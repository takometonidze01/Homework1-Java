public class Fraction {

    int numerator;
    int denominator;

    @Override
    public boolean equals(Object obj){

        if(obj instanceof Fraction) {
            if (numerator * ((Fraction) obj).denominator == denominator * ((Fraction) obj).numerator){
                return true;
            }
        }

        return false;
    }

    public String multiply(Object obj) {
        if(obj instanceof Fraction) {
            long a = numerator *= ((Fraction) obj).numerator;
            long b = denominator *= ((Fraction) obj).denominator;

            int i = numerator/=denominator;
            return (a + "/" + b);
        }
        return null;
    }

    public String add(Object obj) {
        if (obj instanceof Fraction) {
            long num, den, x;
            if(denominator == ((Fraction) obj).denominator)
            {
                num = numerator + ((Fraction) obj).numerator ;
                den = denominator;
            }
            else{
                num = numerator * ((Fraction) obj).denominator + ((Fraction) obj).numerator + denominator;
                den = denominator * ((Fraction) obj).denominator;

            }

            if(num > den)
                x = num;
            else
                x = den;
            for(int i = 1 ; i <= x ; i++)
            {
                if(num%i == 0 && den%i == 0)
                {
                    num = num/i;
                    den = den/i;
                }
            }
            return (num + "/" + den);
        }
        return null;
    }

    public static String simplify(Object obj) {
        if (obj instanceof Fraction) {
            int newDen = 0;
            int factor = ((Fraction) obj).numerator;
            while (factor > 1) {
                if (((Fraction) obj).denominator % factor == 0) {
                    newDen = (((Fraction) obj).denominator) / ((Fraction) obj).numerator;
                }
                factor --;
            }

            return (factor + "/" + newDen);
        }
        return null;
    }
}