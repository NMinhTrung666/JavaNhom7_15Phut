package com.minhthanh.minhthanh;

import javax.persistence.*;

@Entity
@Table(name="sinhvien")
public class VeMayBay {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	public Integer id;
	public Integer maVe;
	public String noiDi;
	public String noiDen;
	public String ngayDi;
	public Integer gioDi;
	public Integer gioDen;
	public Integer giaTien;
	
	public VeMayBay() {
		super();
	}

	public VeMayBay(Integer id, Integer maVe, String noiDi, String noiDen, String ngayDi, Integer gioDi, Integer gioDen,
			Integer giaTien) {
		super();
		this.id = id;
		this.maVe = maVe;
		this.noiDi = noiDi;
		this.noiDen = noiDen;
		this.ngayDi = ngayDi;
		this.gioDi = gioDi;
		this.gioDen = gioDen;
		this.giaTien = giaTien;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMaVe() {
		return maVe;
	}

	public void setMaVe(Integer maVe) {
		this.maVe = maVe;
	}

	public String getNoiDi() {
		return noiDi;
	}

	public void setNoiDi(String noiDi) {
		this.noiDi = noiDi;
	}

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public String getNgayDi() {
		return ngayDi;
	}

	public void setNgayDi(String ngayDi) {
		this.ngayDi = ngayDi;
	}

	public Integer getGioDi() {
		return gioDi;
	}

	public void setGioDi(Integer gioDi) {
		this.gioDi = gioDi;
	}

	public Integer getGioDen() {
		return gioDen;
	}

	public void setGioDen(Integer gioDen) {
		this.gioDen = gioDen;
	}

	public Integer getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(Integer giaTien) {
		this.giaTien = giaTien;
	}

}
