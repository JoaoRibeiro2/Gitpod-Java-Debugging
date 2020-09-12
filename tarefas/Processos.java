package tarefas;

public class Processos extends Thread{
    int valor;


    public Processos(int valor){
        this.valor = valor;
    }

    public void run(){

        for(int i = 1; i<=10; i++){
            System.out.println("Hello, world!");
        }
        
    }
}