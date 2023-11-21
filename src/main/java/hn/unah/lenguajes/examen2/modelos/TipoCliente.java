package hn.unah.lenguajes.examen2.modelos;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tipocliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TipoCliente {
    @Id
    @Column(name="idTipoCliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoCliente;

    @Column(name="descripcion")
    private String descripcion;


}
