package edu.br.whatsapp.modelo;

import java.io.File;
import java.time.Instant;

public class Mensagem {

		private String texto;
		private Usuario remetente;
		private Usuario destinatario;
		private Instant horario;
		private File anexo;
		
		
		public Mensagem(Usuario remetente, Usuario destinatario, File anexo) {
			super();
			this.remetente = remetente;
			this.destinatario = destinatario;
			this.anexo = anexo;
		}

		public Mensagem() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public Mensagem(String texto, Usuario remetente, Usuario destinatario) {
			super();
			this.texto = texto;
			this.remetente = remetente;
			this.destinatario = destinatario;
		}

		public String getTexto() {
			return texto;
		}
		public void setTexto(String texto) {
			this.texto = texto;
		}
		public Usuario getRemetente() {
			return remetente;
		}
		public void setRemetente(Usuario remetente) {
			this.remetente = remetente;
		}
		/**
		 * @return the anexo
		 */
		public Usuario getDestinatario() {
			return destinatario;
		}
		public void setDestinatario(Usuario destinatario) {
			this.destinatario = destinatario;
		}
		public Instant getHorario() {
			return horario;
		}
		public void setHorario(Instant horario) {
			this.horario = horario;
		}

		public File getAnexo() {
			return anexo;
		}

		public void setAnexo(File anexo) {
			this.anexo = anexo;
		}
		
		
		
}
