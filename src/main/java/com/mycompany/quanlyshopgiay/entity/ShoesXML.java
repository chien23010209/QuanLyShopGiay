package com.mycompany.quanlyshopgiay.entity;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Lớp bao gói danh sách các đối tượng Giay,
 * dùng để ánh xạ toàn bộ dữ liệu từ/ra file dataShoes.xml
 */

@XmlRootElement(name = "DanhSachGiay")  // Phần tử gốc trong XML
@XmlAccessorType(XmlAccessType.FIELD)   // Tự động ánh xạ theo field
public class ShoesXML {

    @XmlElement(name = "Giay")           // Mỗi phần tử con trong danh sách
    private List<Shoes> danhSachGiay;

    public List<Shoes> getDanhSachGiay() {
        return danhSachGiay;
    }

    public void setDanhSachGiay(List<Shoes> danhSachGiay) {
        this.danhSachGiay = danhSachGiay;
    }

   
}
