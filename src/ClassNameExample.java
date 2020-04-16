import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    Pattern p;
    Matcher m;

    public final String CLASS_NAME_FORM = "[CAP]\\w{4}[GHIKLM]";

    public boolean validate(String regex){
        p = Pattern.compile(CLASS_NAME_FORM);
        m = p.matcher(regex);
        return m.matches();
    }
}
