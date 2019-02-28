import java.util.Date;

public class Main {
    //1
    public static void expZero() throws Exception {
        try {
            int x = 100;
            int a = x / 0;
        }
        catch (ArithmeticException e){
            System.out.println(e.toString());
        }
    }
    public static void expIndex() throws Exception {
       try{ int c[]={1,2,3};
        int a=c[4];}
       catch (IndexOutOfBoundsException e){
           System.out.println(e.toString());
       }
    }
    //2
    public static void expDesc() throws Exception {
        try{
            int c[]=new int[-1];

        }
        catch(NegativeArraySizeException e){
            System.out.println("Описание "+e.toString()+" (массив отрицательного размера)");
        }

    }
    //3
    public static void expCatches(int a) throws Exception {
        try {
        }
        catch(Exception e) {
            if (a >= 0 && a < 5) {
                String first = " " + a;
                throw new Exception(first);
            }
            if (a >= 5 && a < 10) {
                float f = (float) a;
                String second = " " + f;
                throw new Exception(second);
            }
            if (a >= 10 && a < 15) {
                String s[] = {"Десять", "Одиннадцать", "Двенадцать", "Тринадцать", "Четырнадцать", "Пятнадцать",};
                throw new Exception(s[a - 10]);
            }
            if (a >= 15) {
                throw new Exception("Unknown ERROR");
            }
        }
    }
    //4
    static class  MyException  extends  Exception  {
        private  int  id ;
        Date time=new Date();
        MyException ( int  а ) {
            id = а;}
            public String toString(){
                return id +"- OverSize "+time;
            }
        }
        public static  void  compute ( int a)   throws  MyException {
            System.out.println("Bызвaн  метод  compute { " + a + " ) ");
            if (a > 10)
                throw new MyException(a);
            System.out.println("Hopмaльнoe  завершение ");
        }

   public static void main(String args[])throws Exception{
       expZero();
        expIndex();
       expDesc();
       expCatches(20);
       compute(12);
       }
    }
// 1)Пример необрабатываемых исключений 2)Вывод описания исключения(любые исключения,кроме тех,которые из первых) 264 стр.
// 3)Несколько catch(int0-5,float5-10,string10-15,все исключения(по нитервалам))
// 4)Собственный подкласс исключений и передавать сообщение какой то int дентификатор, сообщение ошибки и дата время123