import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

public class TestsClass {

        MACpattern maCpattern = new MACpattern();
        E_mail e_mail = new E_mail();
        TimePattern timePattern = new TimePattern();

    @Test
    public void testEqualsMAC() {
        Assert.assertTrue(maCpattern.validate("aE:dC:cA:56:76:54"));//переписать остальные в таком же виде
    }

    @Test
    public void testNotEqualsMAC() {
        Assert.assertEquals(maCpattern.validate("01:23:45:67:89:Az"),false);
    }
    @Test
    public void testEqualsE_mail(){
        Assert.assertEquals(e_mail.validate("user@example.com"),true);
        Assert.assertEquals(e_mail.validate("root@localhost"),true);
    }
    @Test
    public void testNotEqualsE_mail(){
        Assert.assertEquals(e_mail.validate("bug@@@com.ru"),false);
        Assert.assertEquals(e_mail.validate("@val.ru"),false);
    }
}
