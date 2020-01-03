package oto.example.oto;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface OtoDAO extends JpaRepository<Oto, Integer> {

}
