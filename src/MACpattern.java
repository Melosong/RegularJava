import java.util.regex.Pattern;

public class MACpattern {
    private static final String MAC = "([0-9a-fA-F]{2}:){5}[0-9a-fA-F]{2}";

    private final Pattern pattern;

    public MACpattern() {
        pattern = Pattern.compile(MAC);
    }

    public boolean validate(String time) {
        return pattern.matcher(time).matches();
    }
}
