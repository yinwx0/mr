package p203;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
@SuppressWarnings("all")
public class StrManipulation {
    void _matcher(String regex,String T){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(T);
        System.out.println("匹配的字符如下:");
        while (matcher.find()) System.out.println(matcher.group());
    }
    String _replace(String T,String oldStr,String newStr){
        return T.replace(oldStr,newStr);
    }
    char _charAt(String T,int num){
        return (char) T.codePointAt(num);
    }
    String _replaceAll(String regex,String str,String T){
        return T.replace(regex,str);
    }
    String _date(String T){
        return T.substring(6,14);
    }
}
