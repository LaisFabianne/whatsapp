package edu.br.whatsapp;

import edu.br.whatsapp.modelo.Mensagem;
import edu.br.whatsapp.modelo.Usuario;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Usuario usuario1 = new Usuario();
        usuario1.setNome("José");
        usuario1.setNumero("8288435678");
        
        Usuario usuario2 = new Usuario("Ana", "345645677");
        
        Mensagem msg = new Mensagem ("Oi", usuario1, usuario2);
        System.out.println(msg.getTexto());
        System.out.println(msg.getHorario());
    }
}
