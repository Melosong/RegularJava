import java.util.regex.Pattern;
//регулярное выражение, проверяющее правильный ли MAC-адрес
public class MACpattern {
    private static final String MAC = "([0-9a-fA-F]{2}[:-]){5}[0-9a-fA-F]{2}";

    private final Pattern pattern;

    public MACpattern() {
        pattern = Pattern.compile(MAC);
    }

    public boolean validate(String mac) {
        return pattern.matcher(mac).matches();
    }
}
