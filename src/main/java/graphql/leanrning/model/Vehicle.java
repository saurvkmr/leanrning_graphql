package graphql.leanrning.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class Vehicle implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "type", nullable = false)
    private String vehicleType;

    @Column(name = "mode_code", nullable = false)
    private String modelCode;

    @Column(name = "brand_name", nullable = false)
    private String brandName;

    @Column(name = "launch_date")
    private Date launchDate;

    private transient String formattedDate;

    public String getFormattedDate() {
        return launchDate.toString();
    }

    private void setFormattedDate(String s) { }

}
