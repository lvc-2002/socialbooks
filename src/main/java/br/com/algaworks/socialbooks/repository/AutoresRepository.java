package br.com.algaworks.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.algaworks.socialbooks.domain.Autor;

public interface AutoresRepository extends JpaRepository<Autor, Long> {

}
