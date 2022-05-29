package Main.Class;

import android.util.Log;

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

    private static final int level_in_stack_trace = 4;

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
        String lineToParse = ste[level_in_stack_trace].toString();

        String lineNoBrackets = getStringWithRegrex(regexCaptureUntilFirstOpenBracket, lineToParse);
        String lineOnlyFunctionAndClassName = getStringWithRegrex(regexClassAndFunctionName, lineNoBrackets);
        String onlyFunctionName = getStringWithRegrex(regrexFunctionName, lineOnlyFunctionAndClassName);
        String onlyClassName = getStringWithRegrex(regrexClassName, lineOnlyFunctionAndClassName);

        return "[" + onlyClassName + ":" + onlyFunctionName + "]";
    }

    public static void printClassNameAndFuncNameD(String TAG) {
        String s = TAG + ":" + printClassAndFunctionName();

        Log.d(TAG,printClassAndFunctionName());
    }


    public static void printClassNameAndFuncNameI(String TAG) {
        String s = TAG + " : " + printClassAndFunctionName();

        Log.i(TAG,printClassAndFunctionName());
    }

    public static void printClassNameAndFuncNameV(String TAG) {
        String s = TAG + " : " + printClassAndFunctionName();

        Log.v(TAG,printClassAndFunctionName());
    }

    public static void printClassNameAndFuncNameE(String TAG) {
        String s = TAG + " : " + printClassAndFunctionName();

        Log.e(TAG,printClassAndFunctionName());
    }

    public static void printClassNameAndFuncNameW(String TAG) {
        String s = TAG + " : " + printClassAndFunctionName();

        Log.e(TAG,printClassAndFunctionName());
    }

    public static void printClassNameAndFuncNameWTF(String TAG) {
        String s = TAG + " : " + printClassAndFunctionName();

        Log.wtf(TAG,printClassAndFunctionName());
    }



}
