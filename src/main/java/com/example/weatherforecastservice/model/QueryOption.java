package com.example.weatherforecastservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "QueryOptions")
public class QueryOption {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "QueryDescription", nullable = false)
    private String QueryDescription;

    public enum QueryTypes {
        Measure(0),
        Day(1),
        ThreeDay(2),
        Weekly(3),
        Monthly(4),
        CityQuery(5);

        private int QueryTypes;

        QueryTypes(int queryTypes) {
            this.QueryTypes = queryTypes;
        }
    }
}
