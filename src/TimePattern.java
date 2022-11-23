import java.util.regex.Pattern;
//регулярное выражение, проверяющее правильный ли формат времени
public class TimePattern {

    private static final String TIME = "([01]?[0-9]|2[0-3]):[0-5][0-9]";

    private final Pattern pattern;

    public TimePattern() {
        pattern = Pattern.compile(TIME);
    }

    public boolean validate(String time) {
        return pattern.matcher(time).matches();
    }
}