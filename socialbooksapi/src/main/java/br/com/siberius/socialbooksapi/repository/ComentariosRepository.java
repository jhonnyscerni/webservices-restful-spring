package br.com.siberius.socialbooksapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.siberius.socialbooksapi.domain.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Long> {

	
}
