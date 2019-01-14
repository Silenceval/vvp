//Cтудент БВТ1861 Бабкин Валерий Алексеевич
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world! ");

        System.out.println(pol("квартира"));

        System.out.println(pol("кок"));

            for (int i = 0; i < 100; i++) {

                if (simpl(i))
                    System.out.println(i);
            }
    }


    public static boolean pol(String string) {

        return new StringBuilder(string).reverse().toString().equals(string);
    }

         public static boolean simpl(final int num) {

        return num > 1 && IntStream.range(2, num).noneMatch(index -> num % index == 0);
        }
}