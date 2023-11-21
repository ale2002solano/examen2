package hn.unah.lenguajes.examen2.modelos;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Clientes {
    @Id
    @Column(name="codigoCliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoCliente;
    
    private String nombre;

    private String apellido;

    private Date fechaIngreso;

    @ManyToOne()
    private TipoCliente tipoCliente;
    
}
