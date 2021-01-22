package entities;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculInterface extends Remote
{
    public int add(int x, int y) throws RemoteException;
    public int aver(int x, int y)throws RemoteException;
}