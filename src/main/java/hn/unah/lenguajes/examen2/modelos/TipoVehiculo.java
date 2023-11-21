package hn.unah.lenguajes.examen2.modelos;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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

    @JsonIgnore
    @JoinColumn(name = "idTipoVehiculo", referencedColumnName = "idTipoVehiculo")
    @OneToMany
    private Vehiculo vehiculo;
}
