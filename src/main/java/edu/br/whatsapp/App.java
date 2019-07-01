package edu.br.whatsapp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Usuario user1 = new Usuario("Zé", "8299583012");
        Usuario user2 = new Usuario("Maria", "7999583012");
        Mensagem hello = new Mensagem("Oi", user1, user2);
    }
}
