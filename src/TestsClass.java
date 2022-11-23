import org.junit.Assert;
import org.testng.annotations.Test;
//тесты для проверки регулярных выражений
public class TestsClass {

        MACpattern maCpattern = new MACpattern();
        E_mailPattern e_mail = new E_mailPattern();
        TimePattern timePattern = new TimePattern();
        SafePassw safePassw = new SafePassw();

    @Test
    public void testEqualsMAC() {//правильные адреса
        Assert.assertTrue(maCpattern.validate("aE:dC:cA:56:76:54"));
        Assert.assertTrue(maCpattern.validate("50:46:5D:6E:8C:20"));
        Assert.assertTrue(maCpattern.validate("da-a1-19-00-00-00"));
        Assert.assertTrue(maCpattern.validate("00:20:B9:00:00:00"));
        Assert.assertTrue(maCpattern.validate("00:80:10:00:00:00"));
        Assert.assertTrue(maCpattern.validate("EC-10-00-00-00-00"));
    }

    @Test
    public void testNotEqualsMAC() {//неправильные адреса
        Assert.assertFalse(maCpattern.validate("01:23:45:67:89:ra"));
        Assert.assertFalse(maCpattern.validate("00:20:j0:10:54:31"));
        Assert.assertFalse(maCpattern.validate("01-23-45-67-89-0"));
        Assert.assertFalse(maCpattern.validate("01:23:45:67:89"));
        Assert.assertFalse(maCpattern.validate("0-11-a2-13-24-b6-00"));
        Assert.assertFalse(maCpattern.validate("01:23:ff5:67:89:78"));
    }
    @Test
    public void testEqualsE_mail(){//правильная почта
        Assert.assertTrue(e_mail.validate("user@example.com"));
        Assert.assertTrue(e_mail.validate("root@localhost"));
        Assert.assertTrue(e_mail.validate("makarov56.petya@mail.ru"));
        Assert.assertTrue(e_mail.validate("u.s.e.r@exampl.com"));
        Assert.assertTrue(e_mail.validate("example@ya.ru"));
        Assert.assertTrue(e_mail.validate("79271234567@yandex.ru"));
    }
    @Test
    public void testNotEqualsE_mail(){//неправильная почта
        Assert.assertFalse(e_mail.validate("bug@@@com.ru"));
        Assert.assertFalse(e_mail.validate("@val.ru"));
        Assert.assertFalse(e_mail.validate("user@example..com"));
        Assert.assertFalse(e_mail.validate(".user@example.com"));
        Assert.assertFalse(e_mail.validate("qwerty@.ru"));
        Assert.assertFalse(e_mail.validate("yandex.ru"));
    }
    @Test
    public void testEqualsTime(){//правильное время
        Assert.assertTrue(timePattern.validate("09:00"));
        Assert.assertTrue(timePattern.validate("00:00"));
        Assert.assertTrue(timePattern.validate("23:59"));
        Assert.assertTrue(timePattern.validate("19:01"));
        Assert.assertTrue(timePattern.validate("23:23"));
        Assert.assertTrue(timePattern.validate("12:59"));
    }
    @Test
    public void testNotEqualsTime(){//неправильное время
        Assert.assertFalse(timePattern.validate("37:98"));
        Assert.assertFalse(timePattern.validate("24:00"));
        Assert.assertFalse(timePattern.validate("0:0"));
        Assert.assertFalse(timePattern.validate("23:60"));
        Assert.assertFalse(timePattern.validate("12:12:12"));
        Assert.assertFalse(timePattern.validate("-0:00"));
    }
    @Test
    public void testSafePassw(){//надежный пароль
        Assert.assertTrue(safePassw.validate("Aa1qweqw"));
        Assert.assertTrue(safePassw.validate("aDDWQ2RW"));
        Assert.assertTrue(safePassw.validate("C00l_Pass"));
        Assert.assertTrue(safePassw.validate("SupperPas1"));
        Assert.assertTrue(safePassw.validate("_Qwerta1s"));
        Assert.assertTrue(safePassw.validate("012345Qq"));
    }
    @Test
    public void testNotSafePassw(){//ненадежный пароль
        Assert.assertFalse(safePassw.validate("Cool_pass"));
        Assert.assertFalse(safePassw.validate("C00l"));
        Assert.assertFalse(safePassw.validate("qwertyui"));
        Assert.assertFalse(safePassw.validate("QWERTYUI"));
        Assert.assertFalse(safePassw.validate("aA_1234"));
        Assert.assertFalse(safePassw.validate(""));
    }
}
