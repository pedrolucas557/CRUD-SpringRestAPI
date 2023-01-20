package com.projetoalgaworks.algalog.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoalgaworks.algalog.domain.model.ClienteEntity;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long>{

	List<ClienteEntity> findByNome(String nome);
	List<ClienteEntity> findByNomeContaining(String nome); 
	Optional<ClienteEntity> findByEmail(String email);
}
