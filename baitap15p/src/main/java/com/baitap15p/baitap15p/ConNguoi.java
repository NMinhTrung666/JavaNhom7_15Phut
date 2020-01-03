package com.baitap15p.baitap15p;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "connguoi")
public class ConNguoi {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int cmnd;
	String ten;
	int ngaysinh;
	String diachi;
	String gioitinh;
	int sdt;
	String congviec;
	
	public ConNguoi() {
		super();
	}
	public ConNguoi(String ten, int ngaysinh, String diachi, int cmnd, String gioitinh, int sdt, String congviec) {
		super();
		this.ten = ten;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
		this.cmnd = cmnd;
		this.gioitinh = gioitinh;
		this.sdt = sdt;
		this.congviec = congviec;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(int ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public int getCmnd() {
		return cmnd;
	}
	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public int getSdt() {
		return sdt;
	}
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	public String getCongviec() {
		return congviec;
	}
	public void setCongviec(String congviec) {
		this.congviec = congviec;
	}
	
	
}
