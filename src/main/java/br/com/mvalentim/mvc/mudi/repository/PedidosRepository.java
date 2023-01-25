package br.com.mvalentim.mvc.mudi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mvalentim.mvc.mudi.model.Pedido;
import br.com.mvalentim.mvc.mudi.model.StatusPedido;

@Repository
public interface PedidosRepository extends JpaRepository<Pedido, Long> {

	List<Pedido> findByStatus(StatusPedido valueOf);

}
