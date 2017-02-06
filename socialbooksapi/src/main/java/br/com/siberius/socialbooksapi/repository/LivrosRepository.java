package br.com.siberius.socialbooksapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.siberius.socialbooksapi.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long> {

}
