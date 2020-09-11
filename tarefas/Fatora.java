package tarefas;

public class Fatora extends Thread{
    int fatorial;
    public Fatora(int n){
        this.fatorial = n;

    }
    public void run(){
        
        for(int i = fatorial; i>1; i++){
            fatorial = fatorial*i;
            System.out.println(fatorial);
        }
    

    }

    //  public static int Fatora(int num){
      
    //   if(num == 0){
    //       return 1;
    //   }

    //   int total = 1;
    //   for (int i = num; i>1; i--){
    //     total *= num;
    //   }
    //     return 0;
    // }
}