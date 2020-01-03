package com.giangthanh15p.giangthanh15p;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "thucung")
public class ThuCung {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int mathucung;
	String chungloai;
	int tuoi;
	String chieucao;
	String cangnang;
	String mausac;
	String gioitinh;
	
	public ThuCung() {
		super();
	}
	public ThuCung(int mathucung, String chungloai, int tuoi, String chieucao, String cangnang, String mausac,
			String gioitinh) {
		super();
		this.mathucung = mathucung;
		this.chungloai = chungloai;
		this.tuoi = tuoi;
		this.chieucao = chieucao;
		this.cangnang = cangnang;
		this.mausac = mausac;
		this.gioitinh = gioitinh;
	}
	public int getMathucung() {
		return mathucung;
	}
	public void setMathucung(int mathucung) {
		this.mathucung = mathucung;
	}
	public String getChungloai() {
		return chungloai;
	}
	public void setChungloai(String chungloai) {
		this.chungloai = chungloai;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getChieucao() {
		return chieucao;
	}
	public void setChieucao(String chieucao) {
		this.chieucao = chieucao;
	}
	public String getCangnang() {
		return cangnang;
	}
	public void setCangnang(String cangnang) {
		this.cangnang = cangnang;
	}
	public String getMausac() {
		return mausac;
	}
	public void setMausac(String mausac) {
		this.mausac = mausac;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	
	
}
