package com.domain;

public class Usuario {
	
	private int Id;
	private String Nombre;
	private String Cargo;
	private String Contrase�a;
	private int DocumentoIdentificacion;
	
	public Usuario(Integer Id, String Nombre, String Cargo,String Contrase�a,Integer DocumentoIdentificacion) {
		super();
		this.Id = Id;
		this.Nombre = Nombre;
		this.Cargo = Cargo;
		this.Contrase�a = Contrase�a;
		this.DocumentoIdentificacion = DocumentoIdentificacion;
		
		
		
	}
	
	public int getId() {
		return Id;
	}
	public void setId(Integer Id) {
		this.Id = Id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String Cargo) {
		this.Cargo = Cargo;
	}
	public String getContrase�a() {
		return Contrase�a;
	}
	public void setContrase�a(String Contrase�a) {
		this.Contrase�a = Contrase�a;
	}
	
	public int getDocumentoIdentificacion() {
		return DocumentoIdentificacion;
	}
	public void setDocumentoIdentificacion(Integer DocumentoIdentificacion) {
		this.DocumentoIdentificacion = DocumentoIdentificacion;
	}


}
