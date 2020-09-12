package tarefas;

public class Processos extends Thread{
    int valor;
    int tempo;

    public Processos(int valor){
        this.valor = valor;
    }

    public void run(){

        for(int i = 1; i<=10; i++){
            System.out.println("Inicio do processo!");
        
        
            try{
                this.sleep(tempo);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
             System.out.println("Final do processo!");

             
        }
    }

    public void setTempo(int time){
        this.tempo = time;
    }
    public int getTempo(){
        return tempo;
    }

    

}