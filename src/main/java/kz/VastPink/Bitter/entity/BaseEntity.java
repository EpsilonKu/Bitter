package kz.VastPink.Bitter.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@Data
public class BaseEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "create_date")
    private Date createDate;

    @Column (name = "update_date")
    private Date updateDate;

    @Column (name = "remove_date")
    private Date removeDate;

    @PrePersist
    public void prePersist (){
        this.createDate = new Date();
    }

    @PreUpdate
    public void preUpdate (){
        this.updateDate = new Date();
    }

    @PreRemove
    public void preRemove (){
        this.removeDate = new Date();
    }
}
