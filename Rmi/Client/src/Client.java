import entities.CalculInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        try
        {
            CalculInterface calculInterface = (CalculInterface) Naming.lookup("//localhost/server");
            System.out.println("1)Сумма стоимостей игр"+"\n2)Средняя стоимость игр");
            int action = scanner.nextInt();
            int x,y;
            switch (action)
            {
                case 1: {
                    System.out.println("Введи X");
                    x = scanner.nextInt();
                    System.out.println("Введи Y");
                    y = scanner.nextInt();
                    System.out.println("Сумма =  "+ calculInterface.add(x,y));
                    break;
                }
                case 2: {
                    System.out.println("Введи X");
                    x = scanner.nextInt();
                    System.out.println("Введи Y");
                    y = scanner.nextInt();
                    System.out.println("Средняя стоимость =  " + calculInterface.aver(x,y));
                    break;
                }
            }
        } catch (RemoteException | NotBoundException | MalformedURLException e)
        {
            e.printStackTrace();
        }
    }
}