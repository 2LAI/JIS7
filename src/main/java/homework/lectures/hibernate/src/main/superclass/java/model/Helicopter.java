package homework.lectures.hibernate.src.main.superclass.java.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Entity
public class Helicopter extends Aircraft {

    private Boolean verticalTakeOff;

    public Helicopter(String modelName, Double maxAltitude, Boolean verticalTakeOff) {
        super(modelName, maxAltitude);
        this.verticalTakeOff = verticalTakeOff;
    }
}
