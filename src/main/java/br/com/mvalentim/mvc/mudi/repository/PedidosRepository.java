package br.com.mvalentim.mvc.mudi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mvalentim.mvc.mudi.model.Pedidos;

@Repository
public interface PedidosRepository extends JpaRepository<Pedidos, Long> {

}
