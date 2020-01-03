package com.baitap15p.baitap15p;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface ConNguoiDao extends JpaRepository<ConNguoi, Integer> {

}
