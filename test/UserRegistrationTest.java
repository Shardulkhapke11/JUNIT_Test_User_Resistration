import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRegistrationTest {
    private static UserRegistration userRegistration;
    @Before
    public void createObj(){
        userRegistration = new UserRegistration();
    }

    @Test
    public void firstName() {
        boolean actual = userRegistration.firstName("Sasoo");
        Assert.assertTrue(actual);
    }

    @Test
    public void lastName() {
        boolean actual = userRegistration.lastName("Sasoo");
        Assert.assertTrue(actual);
    }

    @Test
    public void email() {
        boolean actual = userRegistration.Email("abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
                "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com.com");
        Assert.assertTrue(actual);
    }

    @Test
    public void MobileNo() {
        boolean actual = userRegistration.MobileNo("+918888888888");
        Assert.assertTrue(actual);
    }

    @Test
    public void Password() {
        boolean actual = userRegistration.Password("1S@hardul");
        Assert.assertTrue(actual);
    }


}