package Ticket.Ticket.controle;

import org.springframework.data.jpa.repository.JpaRepository;

import Ticket.Ticket.Entidades.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    // Outros métodos de consulta podem ser adicionados aqui
}
