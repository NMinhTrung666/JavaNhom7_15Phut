package oto.example.oto;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Oto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer maoto; //mã ô tô
	String hangoto;//hãng ô tô
	String ngaysanxuat;// ngày sản xuất
	String mauoto;// màu ô tô
	Integer kichthuoc;// kích thước
	String dongco;// động cơ
	Integer gia;// giá
	
	
	public Oto() {
		super();
	}
	public Oto(Integer maoto, String hangoto, String ngaysanxuat, String mauoto, Integer kichthuoc, String dongco,
			Integer gia) {
		super();
		this.maoto = maoto;
		this.hangoto = hangoto;
		this.ngaysanxuat = ngaysanxuat;
		this.mauoto = mauoto;
		this.kichthuoc = kichthuoc;
		this.dongco = dongco;
		this.gia = gia;
	}
	public Integer getMaoto() {
		return maoto;
	}
	public void setMaoto(Integer maoto) {
		this.maoto = maoto;
	}
	public String getHangoto() {
		return hangoto;
	}
	public void setHangoto(String hangoto) {
		this.hangoto = hangoto;
	}
	public String getNgaysanxuat() {
		return ngaysanxuat;
	}
	public void setNgaysanxuat(String ngaysanxuat) {
		this.ngaysanxuat = ngaysanxuat;
	}
	public String getMauoto() {
		return mauoto;
	}
	public void setMauoto(String mauoto) {
		this.mauoto = mauoto;
	}
	public Integer getKichthuoc() {
		return kichthuoc;
	}
	public void setKichthuoc(Integer kichthuoc) {
		this.kichthuoc = kichthuoc;
	}
	public String getDongco() {
		return dongco;
	}
	public void setDongco(String dongco) {
		this.dongco = dongco;
	}
	public Integer getGia() {
		return gia;
	}
	public void setGia(Integer gia) {
		this.gia = gia;
	}
	
}
