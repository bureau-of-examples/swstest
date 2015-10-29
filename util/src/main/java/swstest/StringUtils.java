package swstest;

/**
 * Created with IntelliJ IDEA.
 * User: JOHNZ
 * Date: 20/06/14
 * Time: 4:10 PM
 */
public final class StringUtils {

    private StringUtils(){}

    public static boolean isNullOrEmpty(String str){
        return str == null || str.length() == 0;
    }

    public static String wrapSearchKeyword(String keyword){

        if(isNullOrEmpty(keyword))
            return "%";

        if(keyword.charAt(0) != '%')
            keyword = "%" + keyword;

        if(keyword.charAt(keyword.length() - 1) != '%')
            keyword += keyword + "%";

        return keyword;
    }
}
