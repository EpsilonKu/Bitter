package kz.VastPink.Bitter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserEntity extends BaseEntity {

    @Column (name = "name")
    private String username;

    @Column (name = "surname")
    private String surname;

    @Column (name = "password")
    private String password;

}
