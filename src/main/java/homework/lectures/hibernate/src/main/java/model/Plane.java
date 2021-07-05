package homework.lectures.hibernate.src.main.java.model;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Entity
public class Plane extends Aircraft {

    private Boolean horizontalTakeOff;

    public Plane(String modelName, Double maxAltitude, Boolean horizontalTakeOff) {
        super(modelName, maxAltitude);
        this.horizontalTakeOff = horizontalTakeOff;
    }
}
