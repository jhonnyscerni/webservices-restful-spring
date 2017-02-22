package br.com.siberius.socialbooksapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.siberius.socialbooksapi.domain.Autor;

public interface AutoresRepository extends JpaRepository<Autor, Long> {

}
