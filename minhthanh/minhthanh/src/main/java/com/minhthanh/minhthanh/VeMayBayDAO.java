package com.minhthanh.minhthanh;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface VeMayBayDAO extends JpaRepository<VeMayBay, Integer> {

}