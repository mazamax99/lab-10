public class Main {
    public static void expZero(){
        int x=100;
        int a=x/0;
    }
    public static void expIndex(){
        int c[]={1,2,3};
        int a=c[4];
    }
    public static void expDesc(){
        try{
            int c[]=new int[-1];

        }
        catch(NegativeArraySizeException e){
            System.out.println("Описание "+e+" (массив отрицательного размера)");

        }
    }
   public static void main(String args[]){
       //expZero();
        //expIndex();
       expDesc();
       }
    }
// 1)Пример необрабатываемых исключений 2)Вывод описания исключения(любые исключения,кроме тех,которые из первых) 3)