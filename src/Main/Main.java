package Main;

import Main.Class.LoggerClassNameAndFunctionName;

import java.io.*;


public class Main {


    static  class A {
        static  public void funcA (){
            LoggerClassNameAndFunctionName.printClassNameAndFuncName("TAG");

            class B {

                 public void funcB(){
//                    foo();

                     StackTraceElement[] ste = Thread.currentThread().getStackTrace();
                     String lineToParse = ste[1].toString();
//                     System.out.println(lineToParse);

                     LoggerClassNameAndFunctionName.printClassNameAndFuncName("TAG");


                }
            }

            B b = new B();
            b.funcB();

        };

    }

    public class MyException extends IOException {
        @Override
        public void printStackTrace() {
            super.printStackTrace();
        }
    }

    public static void foo() {
        try {
            int num1 = 5/0;
        }
        catch (Exception e) {
//            e.printStackTrace();
//            System.out.println(e);

//            StringWriter sw = new StringWriter();
//            PrintWriter pw = new PrintWriter(sw);
//            e.printStackTrace(pw);
//            System.out.println(sw.toString());

//            ExceptionUtils.getStackTrace(e);

//            Throwable t = new Throwable();
//            t.printStackTrace();
            Thread.dumpStack();
        }

    }

    public static void foo2(){
//        List<StackFrame> stack = StackWalker.getInstance().walk(s ->
//                s.limit(10).collect(Collectors.toList()));

        for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
            System.out.println(ste);
        }

        System.out.println("---");
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
//        String s = String.valueOf(Arrays.stream(Thread.currentThread().getStackTrace()));
        String s = ste[1].toString();
        System.out.println(s);
    }

    class AA {
        public void function2(){


        }
    }



    public static void main(String[] args) {
//        String to_parse = "[\"\",\"Assi\",\"Yakir\"]";
//        foo();
        A.funcA();
//        foo2();


        System.out.println("test 1 ");


    }
}
