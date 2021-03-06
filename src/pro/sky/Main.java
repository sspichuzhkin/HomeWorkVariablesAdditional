package pro.sky;

public class Main {
    public static void main(String[] args) {
        Task6();
        Task7();
        Task8v1();
        Task8v2();
    }

    public static void Task6() {

        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        int reverseResult = ~result + 1;
        System.out.println(result);
        System.out.println(reverseResult);

    }

    public static void Task7() {
//        Объявите целочисленные переменные a = 5 и b = 7.
//        С помощью математических манипуляций добейтесь того, чтобы a = 7 и b = 5.
//        Использовать дополнительные переменные или числа запрещено.

        int a = 5;
        int b = 7;
        a = a - b;
        b = a + b;
        a = -a + b;
        System.out.println(a);
        System.out.println(b);

    }

    public static void Task8v1() {
// Объявите переменную a и инициализируйте ее любым трехзначным числом.
// Объявите переменную b и, путем математических операций над a получите и присвойте переменной b цифру,
// которая находится в центре значения из переменной a.
// Например, если a = 256, то необходимо с помощью математических действий достать цифру 5 из центра и присвоить переменной b.
// Если a = 789, то b должна быть инициализирована числом 8, так как эта цифра является вторым из трех (центральным) символом в значении a.
// Следует учесть, что алгоритм должен быть универсальным и корректно срабатывать на любых трехзначных числах из a без изменений.
// Это значит, что рассчитать в голове сумму, которую необходимо вычесть или прибавить к a для корректного значения в b нельзя,
// так как при каждом изменении значения в a её нужно пересчитывать.

        int a = 789;
        String str = Integer.toString(a);
        char c = str.charAt(1);
        String strNew = String.valueOf(c);
        int b = Integer.parseInt(strNew);
        System.out.println(b);

    }

    public static void Task8v2(){
        int a = 789;
        int b = a / 10 % 10;
        System.out.println(b);
    }
}