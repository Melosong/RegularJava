import java.util.regex.Pattern;

public class E_mail {
    private static final String e_mail = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";

    private final Pattern pattern;

    public E_mail() {
        pattern = Pattern.compile(e_mail);
    }

    public boolean validate(String time) {
        return pattern.matcher(time).matches();
    }
}
