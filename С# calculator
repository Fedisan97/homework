using System;

class Program
{
    static void Main()
    {
        double fsdd, secon;
        char operation;

        Console.Write("введите первое число: ");
        fsdd = Convert.ToDouble(Console.ReadLine());

        Console.Write("введите операцию (+, -, *, /): ");
        operation = Convert.ToChar(Console.ReadLine());

        Console.Write("введите второе число: ");
        secon = Convert.ToDouble(Console.ReadLine());

        switch (operation)
        {
            case '+':
                Console.WriteLine($"{fsdd} + {secon} = {fsdd + secon}");
                break;
            case '-':
                Console.WriteLine($"{fsdd} - {secon} = {fsdd - secon}");
                break;
            case '*':
                Console.WriteLine($"{fsdd} * {secon} = {fsdd * secon}");
                break;
            case '/':
                if (secon != 0)
                {
                    Console.WriteLine($"{fsdd} / {secon} = {fsdd / secon}");
                }
                else
                {
                    Console.WriteLine("шибка! Деление на ноль невозможно");
                }
                break;
            default:
                Console.WriteLine("неверная операция");
                break;
        }
    }
}
