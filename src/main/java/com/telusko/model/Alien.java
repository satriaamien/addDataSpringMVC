package com.telusko.model;

public class Alien {

	private int id;
	private String nama;
	private String kelas;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getKelas() {
		return kelas;
	}
	public void setKelas(String kelas) {
		this.kelas = kelas;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", nama=" + nama + ", kelas=" + kelas + "]";
	}
	
	
}
