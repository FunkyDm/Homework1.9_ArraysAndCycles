import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");

        int weekPaymentCount = 5;                       //кол-во недель, за которые начислялись выплаты
        int[] monthPayment = new int[weekPaymentCount]; //массив со всеми месячными выплатами
        monthPayment[0] = 70_000;
        monthPayment[1] = 73_535;
        monthPayment[2] = 71_200;
        monthPayment[3] = 70_500;
        monthPayment[4] = 70_255;
        int sumMonthExpenses = 0;                       //переменная для суммы месячных выплат
        for(int payment : monthPayment){
            sumMonthExpenses += payment;
        }
        System.out.println("Сумма трат за месяц составила " + sumMonthExpenses + " рублей.");

        //Задача 2
        System.out.println("Задача 2");

        monthPayment = new int[weekPaymentCount];                           //кол-во недель не изменилось, берем из предыдущей задачи
        monthPayment[0] = 70_700;
        monthPayment[1] = 73_535;
        monthPayment[2] = 71_200;
        monthPayment[3] = 70_500;
        monthPayment[4] = 70_255;
        int minPayment = 0;                                                 //переменная для значения минимальной месячной выплаты
        int maxPayment = 0;                                                 //переменная для значения максимальной месячной выплаты
        //Arrays.sort(monthPayment);                                        //сортируем массив по возрастанию
        for (int i = 0; i < monthPayment.length - 1; i++){                  //сортируем массив по возрастанию методом сортировки пузырьком
            for (int j = 0; j < monthPayment.length - i - 1; j++){
                if (monthPayment[j + 1] < monthPayment[j]){
                    int tempVariable = monthPayment[j];
                    monthPayment[j] = monthPayment[j + 1];
                    monthPayment[j + 1] = tempVariable;
                }
            }
        }
        minPayment = monthPayment[0];
        maxPayment = monthPayment[monthPayment.length - 1];
        System.out.println("Минимальная сумма трат за неделю составила " + minPayment + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxPayment + " рублей.");

        //Задача 3
        System.out.println("Задача 3");

        monthPayment = new int[weekPaymentCount];                           //кол-во недель не изменилось, берем из предыдущих задачи
        monthPayment[0] = 70_000;
        monthPayment[1] = 73_535;
        monthPayment[2] = 71_200;
        monthPayment[3] = 70_500;
        monthPayment[4] = 70_255;
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