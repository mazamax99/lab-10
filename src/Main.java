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
    public static void expCatches(int a) throws Exception {
        if(a>=0&&a<5) {
            String first=" "+a;
            throw new Exception(first);
        }
        if(a>=5&&a<10) {
            float f=(float)a;
            String second=" "+f;
            throw new Exception(second);
        }
        if(a>=10&&a<15) {
            String s[]={"Десять","Одиннадцать","Двенадцать","Тринадцать","Четырнадцать","Пятнадцать",};
            throw new Exception(s[a-10]);
        }
        if(a>=15) {
            throw new Exception("Unknown ERROR");
        }
    }
   public static void main(String args[])throws Exception{
       //expZero();
        //expIndex();
       //expDesc();
       expCatches(20);
       }
    }
// 1)Пример необрабатываемых исключений 2)Вывод описания исключения(любые исключения,кроме тех,которые из первых)
// 3)Несколько catch(int0-5,float5-10,string10-15,все исключения(по нитервалам))