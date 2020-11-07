package objetos;

import org.junit.Test;

import static org.junit.Assert.*;

public class UsersTest {

    Usuarios user = new Usuarios();

    @Test
    public void userGetNameNull() {
        assertNull(user.getNome());
    }

    @Test
    public void userSetNameEmpty() {
        user.setNome("");
        assertEquals("", user.getNome());
    }

    @Test
    public void userSetNameString(){
        user.setNome("Rafael");
        assertEquals("Rafael", user.getNome());
    }

    @Test
    public void userGetEmailNull() {
        assertNull(user.getNome());
    }

    @Test
    public void userSetEmailEmpty() {
        user.setNome("");
        assertEquals("", user.getNome());
    }

    @Test
    public void userGetEmailString(){
        user.setEmail("Rafaelferreira.dev3@gmail.com");
        assertEquals("Rafaelferreira.dev3@gmail.com", user.getEmail());
    }

    @Test
    public void userReceiveNull(){
        assertNotNull(user);
    }
}
