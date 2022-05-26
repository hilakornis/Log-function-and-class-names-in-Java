package Main.Class;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoggerClassNameAndFunctionName {
//    public static final String regrexLegalNames = "[a-z0-9A-Z]";
public static final String regrexLegalVariableAndFunctionNames = "[a-zA-Z][a-zA-Z0-9_]";
    private static final String regexCaptureUntilFirstOpenBracket = "[\\s\\S]*?(?=\\([\\w\\W])";
    private static final String regexClassAndFunctionName = regrexLegalVariableAndFunctionNames +"*."+ regrexLegalVariableAndFunctionNames +"*$";
    private static final String regrexFunctionName = "(?<=((\\.))).*";
    private static final String regrexClassName = regrexLegalVariableAndFunctionNames +"*?(?=\\.)";

    private static String getStringWithRegrex(String regrexPattern, String input) {
        String res = "";
        Pattern pattern = Pattern.compile(regrexPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            String foundString = matcher.group(0);
            res = foundString;
        }

        assert (!Objects.equals(res, ""));

        return res;
    }

    private static String printClassAndFunctionName() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        String lineToParse = ste[3].toString();

        String lineNoBrackets = getStringWithRegrex(regexCaptureUntilFirstOpenBracket, lineToParse);
        String lineOnlyFunctionAndClassName = getStringWithRegrex(regexClassAndFunctionName, lineNoBrackets);
        String onlyFunctionName = getStringWithRegrex(regrexFunctionName, lineOnlyFunctionAndClassName);
        String onlyClassName = getStringWithRegrex(regrexClassName, lineOnlyFunctionAndClassName);

        return "[" + onlyClassName + ":" + onlyFunctionName + "]";
    }

    public static void printClassNameAndFuncName(String TAG) {
        String s = TAG + " : " + printClassAndFunctionName();
        //todo: remove
        System.out.println(s);
//        todo: return log:

//        Log.d(TAG,printClassAndFunctionName());

    }

}
