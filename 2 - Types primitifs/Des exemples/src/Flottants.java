public class Flottants {
    public static void main(String[] args) {
        //Les types flottants
        //Les entiers flottants (float et double)
        float varFloatMin = Float.MIN_VALUE;//1.4E-45
        float varFloat = 10.5f;//10.5
        float varFloatMax = Float.MAX_VALUE;//3.4028235E38

        System.out.println(varFloatMin);
        System.out.println(varFloat);
        System.out.println(varFloatMax);

        double varDoubleMin = Double.MIN_VALUE;//4.9E-324
        double varDouble = 10.5d;//10.5
        double varDoubleMax = Double.MAX_VALUE;//1.7976931348623157E308

        System.out.println(varDoubleMin);
        System.out.println(varDouble);
        System.out.println(varDoubleMax);
        /*
            Résultat:
                1.4E-45
                10.5
                3.4028235E38
                4.9E-324
                10.5
                1.7976931348623157E308
         */

    }

}

