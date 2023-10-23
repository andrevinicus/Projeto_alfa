package Ticket.Ticket.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Ticket.Ticket.Entidades.Ticket;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketControle {
    @Autowired
    private TicketRepository ticketRepository;

    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    // Outras rotas para obter dados agrupados por cliente e módulo podem ser adicionadas aqui
}