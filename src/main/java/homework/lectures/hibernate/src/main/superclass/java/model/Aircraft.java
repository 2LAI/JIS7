package homework.lectures.hibernate.src.main.superclass.java.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Aircraft {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String modelName;

    private Double maxAltitude;

    public Aircraft(String modelName, Double maxAltitude) {
        this.modelName = modelName;
        this.maxAltitude = maxAltitude;
    }
}
