package entities;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Task extends UnicastRemoteObject implements CalculInterface
{
    public Task() throws RemoteException
    {
        int x,y;
    }
    @Override
    public int add(int x, int y) throws RemoteException
    {
        return x+y;
    }
    @Override
    public int aver(int x, int y) throws RemoteException
    {
        return (x+y)/2;
    }
}