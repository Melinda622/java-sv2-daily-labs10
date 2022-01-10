package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    AdminUser adminUser=new AdminUser("johndoe@gmail.com", "123456");

    @Test
    void testGetEmail(){
        assertEquals("johndoe@gmail.com",adminUser.getUserEmail());
    }

    @Test
    void testGetPassword(){
        assertEquals("******",adminUser.getPassword());
    }

}