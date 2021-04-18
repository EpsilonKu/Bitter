package kz.VastPink.Bitter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class BookEntity extends BaseEntity{
    @Column (name = "name")
    private String name;

    @Column (name = "cover")
    private byte[] cover;

    @Column (name = "file")
    private byte[] file;
}
