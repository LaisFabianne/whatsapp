package edu.br.whatsapp;

import edu.br.whatsapp.modelo.Mensagem;
import edu.br.whatsapp.modelo.Usuario;

public class App 
{
    public static void main( String[] args )
    {
		Usuario usuario1 = new Usuario("Zé", "8299583012");
		Usuario usuario2 = new Usuario("Maria", "7999583012");
        
       
        Mensagem msg = new Mensagem ("Oi", usuario1, usuario2);
        System.out.println(msg.getTexto());
        System.out.println(msg.getHorario());

    }
}
