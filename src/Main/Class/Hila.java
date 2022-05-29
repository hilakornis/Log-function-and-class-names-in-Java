package Main.Class;


public class Hila {




//    public static void printEnd(){
////        List<StackFrame> stack = StackWalker.getInstance().walk(s ->
////                s.limit(10).collect(Collectors.toList()));
//
//        for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
////            System.out.println(ste);
//        }
//
//        System.out.println("---");
//        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
////        String s = String.valueOf(Arrays.stream(Thread.currentThread().getStackTrace()));
//        String lineToParse = ste[2].toString();
//        System.out.println(lineToParse);
//
//
//        String regexCaptureUntilFirstOpenBracket = "[\\s\\S]*?(?=\\([\\w\\W])";
//        String regexClassAndFunctionName = "[a-z0-9A-Z]*.[a-z0-9A-Z]*$";
//        String regrexFunctionName= "(?<=((\\.))).*";
//        String regrexClassName = "[\\s\\S]*?(?=\\.)";
//
//        String lineNoBrackets = getStringWithRegrex(regexCaptureUntilFirstOpenBracket,lineToParse);
//        String lineOnlyFunctionAndClassName = getStringWithRegrex(regexClassAndFunctionName,lineNoBrackets);
//        String onlyFunctionName = getStringWithRegrex(regrexFunctionName, lineOnlyFunctionAndClassName);
//        String onlyClassName = getStringWithRegrex(regrexClassName, lineOnlyFunctionAndClassName);
////        System.out.println(onlyFunctionName);
////        System.out.println(onlyClassName);
//
//
//
////        Pattern pattern = Pattern.compile(regexCaptureUntilFirstOpenBracket, Pattern.CASE_INSENSITIVE);
////        Matcher matcher =  pattern.matcher(lineToParse);
//////        matcher.find();
////        if(matcher.find()){
////            String foundString = matcher.group(0);
//////            System.out.println(foundString);
////
////
////            Pattern pattern2 = Pattern.compile(regexClassAndFunctionName, Pattern.CASE_INSENSITIVE);
////            Matcher matcher2 =  pattern2.matcher(foundString);
////            if (matcher2.find()){
////                String foundClassNameAndFunc = matcher2.group(0);
//////                System.out.println(foundClassNameAndFunc);
////
////
////
////            }
//
//
//        }
//
//
////        if (matcher.find()){
////            foundString = matcher.group(0);
////            System.out.println(foundString);
////        }
//
//
//        //        boolean matchFound = matcher.find();
////        if(matchFound) {
////            System.out.println("Match found");
////        } else {
////            System.out.println("Match not found");
////        }
////    }
//
//
//    }



    public static void main(String[] args) {
        LoggerClassNameAndFunctionName_todo_change_to_android.printClassNameAndFuncName("TAG");
    }
}
