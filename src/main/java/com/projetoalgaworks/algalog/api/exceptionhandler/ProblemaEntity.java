package com.projetoalgaworks.algalog.api.exceptionhandler;

import java.time.LocalDateTime;
import java.util.List;


public class ProblemaEntity {

	private Integer status;
	private LocalDateTime dataHora;
	private String titulo;
	private List<CampoEntity> campos;
	
	public static class CampoEntity {
		
		private String nome;
		private String mensagem;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getMensagem() {
			return mensagem;
		}
		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}
	}
	
	public List<CampoEntity> getCampos() {
		return campos;
	}
	public void setCampos(List<CampoEntity> campos) {
		this.campos = campos;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
