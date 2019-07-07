package org.csystem.springboot.autogalleryserviceapp.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Table(name = "autos")
@Getter
@Setter
@Accessors(prefix = "m_")
@NoArgsConstructor
public class AutoInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auto_id")
    private Long id;

    @Column(name = "make", nullable = false)
    private String m_make;

    @Column(name = "model", nullable = false)
    private String m_model;

    @Column(name = "model_year", nullable = false)
    private int m_modelYear;

    @Column(name = "km", nullable = false)
    private int m_km;

    @Column(name = "rent", nullable = false)
    private boolean m_rent;

    public AutoInfo(String m_make, String m_model, int m_modelYear, int m_km, boolean m_rent) {
        this.m_make = m_make;
        this.m_model = m_model;
        this.m_modelYear = m_modelYear;
        this.m_km = m_km;
        this.m_rent = m_rent;
    }
}
