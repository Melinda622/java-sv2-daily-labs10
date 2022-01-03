package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    AdminUser adminUser=new AdminUser("blabla", "karoly");

    @Test
    void testGetEmail(){
        assertEquals("blabla",adminUser.getUserEmail());
    }

    @Test
    void testGetPassword(){
        assertEquals("******",adminUser.getPassword());
    }

}