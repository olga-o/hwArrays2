public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");

        int[] paymentsWeekly = {300, 100500, 1000, 500, 600};
        int paymentMonthly = 0;

        for (int element : paymentsWeekly) {
            paymentMonthly += element;
        }

        System.out.println("Сумма трат за месяц составила " + paymentMonthly + " рублей");

        //Task 2
        System.out.println("\nTask 2");

        int[] paymentsWeekly2 = {300, 100500, 1000, 500, 600};
        int minPaymentWeekly = paymentsWeekly2[0];
        int maxPaymentWeekly = paymentsWeekly2[0];

        for (int element : paymentsWeekly2) {
            if (element < minPaymentWeekly) {
                minPaymentWeekly = element;
            }
            if (element > maxPaymentWeekly) {
                maxPaymentWeekly = element;
            }
        }

        System.out.println("Минимальная сумма трат за неделю составила " + minPaymentWeekly + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxPaymentWeekly + " рублей");

        //Task 3
        System.out.println("\nTask 3");

        int[] paymentsWeekly3 = {300, 100500, 1000, 500, 600};
        int paymentMonthly3 = 0;
        double paymentWeeklyAverage;

        for (int element : paymentsWeekly3) {
            paymentMonthly3 += element;
        }

        paymentWeeklyAverage = (double) paymentMonthly3 / paymentsWeekly3.length;

        System.out.println("Средняя сумма трат за месяц составила " + paymentWeeklyAverage + " рублей");

        //Task 4
        System.out.println("\nTask 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

        System.out.println();
    }
}