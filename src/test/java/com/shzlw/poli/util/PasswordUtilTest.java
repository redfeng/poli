package com.shzlw.poli.util;

import org.junit.Assert;
import org.junit.Test;

public class PasswordUtilTest {

    @Test
    public void test() {
        String value = "1234567890";
        String b = PasswordUtil.decrypt(PasswordUtil.encrypt(value));
        Assert.assertEquals(value, b);
    }

    @Test
    public void testEncryptedPassword() {
        String password = "1234567890";
        Assert.assertEquals(password, PasswordUtil.getDecryptedPassword(PasswordUtil.getEncryptedPassword(password)));

        password = "";
        Assert.assertEquals(password, PasswordUtil.getDecryptedPassword(PasswordUtil.getEncryptedPassword(password)));

        password = null;
        Assert.assertEquals("", PasswordUtil.getDecryptedPassword(PasswordUtil.getEncryptedPassword(password)));
    }

    @Test
    public void testGetUniqueId() {
        Assert.assertEquals(22, PasswordUtil.getUniqueId().length());
    }

    @Test
    public void testGenerateAdminPassword() {
        String password = "adminadmin";
        System.out.println(PasswordUtil.getMd5Hash(password));
    }
}
