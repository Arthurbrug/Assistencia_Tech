package br.fiap.assistencia_tech1.repository;

import br.fiap.assistencia_tech1.dominio.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
