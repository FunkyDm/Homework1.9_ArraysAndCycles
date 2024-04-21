import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");

        int[] monthPayment = {70_000, 73_535, 71_200, 70_500, 70_255};  //массив со всеми месячными выплатами
        int sumMonthExpenses = 0;                                       //переменная для суммы месячных выплат
        for(int payment : monthPayment){
            sumMonthExpenses += payment;
        }
        System.out.println("Сумма трат за месяц составила " + sumMonthExpenses + " рублей.");

        //Задача 2
        System.out.println("Задача 2");

        monthPayment = new int[]{70_500, 73_535, 71_200, 70_000, 70_255};   //массив со всеми месячными выплатами
        int minPayment = 0;                                                 //переменная для значения минимальной месячной выплаты
        int maxPayment = 0;                                                 //переменная для значения максимальной месячной выплаты
        Arrays.sort(monthPayment);                                          //сортируем массив по возрастанию
        minPayment = monthPayment[0];
        maxPayment = monthPayment[monthPayment.length - 1];
        System.out.println("Минимальная сумма трат за неделю составила " + minPayment + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxPayment + " рублей.");

        //Задача 3
        System.out.println("Задача 3");

        monthPayment = new int[]{70_553, 73_537, 71_289, 70_000, 70_255};   //массив со всеми месячными выплатами
        double averageValue = 0;                                            //переменная для среднего значения трат за месяц
        for (int payment : monthPayment){
            averageValue += payment;
        }
        averageValue /= monthPayment.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей.");

        //Задача 4
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n' , 'a' , 'v' , 'I' , ' ', 'v', 'o', 'n', 'a', 'v', 'I'};  //массив с именем сотрудника
        //выводим массив в обратном порядке
        for(int i = reverseFullName.length - 1; i >= 0 ; i--){
            System.out.print(reverseFullName[i]);
        }

        System.out.println();

    }
}