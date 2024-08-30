public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + salary;
            i++;
            System.out.println(" Месяц " +  i + " сумма накоплений ровна " + total + " рублей ");
        }
        System.out.println(" Задание 2");
        int c = 0;
        while (c < 10) {
            c++;
            System.out.print(" " + c);
        }
        System.out.println();
        for (int w = 10; w > 0; w--) {
            System.out.print(" " + w); }
        System.out.println();
        System.out.println(" Задание 3");
        int people = 12_000_000;
        int diffPeople = people/1000;
        int rait = 17;
        int dead = 8;
        for (int year = 1; year <= 10; year++) {
            people = people + (diffPeople * (rait - dead));
            System.out.println(" год " + year + " численность начисления составляет " + people);
        }
        System.out.println(" Задание 4");
        int saLary = 15000;
        int toTal = 0;
        int m = 0;
        while (toTal <= 12_000_000) {
            toTal = toTal + saLary + (saLary * 7 / 100);
            m++;
            System.out.println(" Месяц " + m + " сумма накопления " + toTal);
        }
        System.out.println(" Задание 5");
        int saLaRy = 15000;
        int toTaL = 0;
        int M = 0;
        while (toTaL <= 12_000_000) {
            toTaL = toTaL + saLaRy + (saLaRy * 7 / 100);
            M++;
            if (M % 6 == 0) {
            System.out.println(" Месяц " + M + " сумма накопления " + toTaL);
        } }
        System.out.println(" Задание 6");
        int a = 15000;
        int t = 0;
        int z = 0;
        while (z <= 108) {
            t = t + a + (a * 7 / 100);
            z++;
            if (z % 6 == 0) {
                System.out.println(" Месяц "+ z + " сумма накопления " + t);
            }
        }
        System.out.println(" Задание 7");
        int friday = 2;
        while (friday <= 31) {
            System.out.println(" Сегодня пятница, " + friday + " -е число.Необходимо подготовить отчет");
            friday += 7;
        }
        System.out.println(" Задание 8");
        int period = 79;
        int startSeeing = 0;
        int currentYear = 2024;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = startSeeing; year < end; year += period) {
            if (year > start)
            System.out.println(year);
        }










    }
    }
        








