import java.util.Scanner;

public class LogCalculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("\n\t\t\tКАЛЬКУЛЯТОР");
        System.out.println("-" .repeat(34));
        System.out.println("Допустимые выражения: \n сложения + \n вычитания - \n умножение * \n деление / \n остаток от деления % ");
        System.out.println("Логические выражения: \n меньше <\n больше >\n равно =");
        System.out.println("-" .repeat(34));

        boolean repeat = true;

        while(repeat)
        {
            System.out.print("Введите первое число: ");
            double number1 = in.nextInt();

            System.out.print("Введите второе число: ");
            double number2 = in.nextInt();

            in.nextLine();
            System.out.print("Введите оператор: ");
            String input = in.nextLine().trim();
            char oper = 0;
            double result;
            boolean resultLog;

            if (input.length() > 0) {
                oper = input.charAt(0);
            } else {
                System.out.println("Вы не ввели не одного символа");
                continue;
            }


            switch (oper) {
                case '+':
                    result = number1 + number2;
                    System.out.printf("%.1f + %.1f = %.1f", number1, number2, result);
                    break;
                case '-':
                    result = number1 - number2;
                    System.out.printf("%.1f - %.1f = %.1f", number1, number2, result);
                    break;
                case '*':
                    result = number1 * number2;
                    System.out.printf("%.1f * %.1f = %.1f", number1, number2, result);
                    break;
                case '/':
                    if(number2 == 0)
                    {
                        System.out.println("Нельзя делить на ноль!!!");
                    }
                    else {
                        result = number1 / number2;
                        System.out.printf("%.1f / %.1f = %.1f", number1, number2, result);
                    }

                    break;
                case '%':
                    result = number1 % number2;
                    System.out.printf("%.1f %% %.1f = %.1f", number1, number2, result);
                    break;
                case '=':
                    resultLog = number1 == number2;
                    System.out.printf("%.1f = %.1f = %b%n", number1, number2, resultLog);
                    break;
                case '<':
                    resultLog = number1 < number2;
                    System.out.printf("%.1f < %.1f = %b%n", number1, number2, resultLog);
                    break;
                case '>':
                    resultLog = number1 > number2;
                    System.out.printf("%.1f > %.1f = %b%n", number1, number2, resultLog);
                    break;


            }


            System.out.println("\nПовтор вычислений [n/y] :жопа ");
            String choice = in.next().toLowerCase();

            if(choice.equals("n") || choice.equals("no"))
            {
                repeat = false;
            }
            System.out.println("-" .repeat(34));


        }

        System.out.println("Программа завершена");
        in.close();
    }
}