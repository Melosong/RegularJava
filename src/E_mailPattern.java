import java.util.regex.Pattern;
//регулярное выражение, проверяющее правильный ли e-mail
public class E_mailPattern {
    private static final String e_mail = "^([a-zA-Z0-9_\\-]+)([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]*)([a-zA-Z0-9]+)([a-zA-Z0-9_\\-]+)\\.?([a-zA-Z]{2,5})$";

    private final Pattern pattern;

    public E_mailPattern() {
        pattern = Pattern.compile(e_mail);
    }

    public boolean validate(String mail) {
        return pattern.matcher(mail).matches();
    }
}
