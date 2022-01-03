package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalUserTest {

    NormalUser normalUser=new NormalUser("blabla","karoly");

    @Test
    void testGetEmail(){
        assertEquals("blabla",normalUser.getUserEmail());
    }

    @Test
    void testGetPassword(){
        assertEquals("karoly",normalUser.getPassword());
    }

}