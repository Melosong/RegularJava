import java.util.regex.Pattern;
//регулярное выражение, проверяющее надежный ли пароль
public class SafePassw {
    private static final String passw ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";
    private final Pattern pattern;
    public SafePassw(){
        pattern=Pattern.compile(passw);
    }
    public boolean validate(String pass){return pattern.matcher(pass).matches();}
}