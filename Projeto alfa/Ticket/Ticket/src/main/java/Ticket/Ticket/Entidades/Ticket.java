package Ticket.Ticket.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import javax.persistence.*;
import java.util.Date;
import java.util.Calendar;


@Entity
@Table(name = "tb_user")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String cliente;
    private String module;

    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date openDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date closingDate;

 
    @PrePersist
    protected void onCreate() {
        openDate = new Date();
    }

    public Ticket() {
    }

    public Ticket(String cliente, String module) {
        this.cliente = cliente;
        this.module = module;
    }
    public void calculateClosingDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(openDate);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        closingDate = calendar.getTime();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }
    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }
}
