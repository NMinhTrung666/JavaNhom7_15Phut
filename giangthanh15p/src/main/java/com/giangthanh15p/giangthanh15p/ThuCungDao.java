package com.giangthanh15p.giangthanh15p;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface ThuCungDao extends JpaRepository<ThuCung, Integer> {

}
