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
@Table(name="tipovehiculo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TipoVehiculo {
    @Id
    @Column(name="idTipoVehiculo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoVehiculo;

    @Column(name="descripcion")
    private String descripcion;
    
    @Column(name="precioXhora")
    private Double precioXhora;

}
