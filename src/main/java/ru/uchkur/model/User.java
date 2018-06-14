package ru.uchkur.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import ru.uchkur.model.base.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
@Entity
@Table (name = "USER")
@Getter
@Setter
public class User extends BaseEntity {
    private static final long serialVersionUID = 1L;
    @NotNull
    @Column (name = "PHONE")
    private String phone;
    @NotNull
    @Column (name="NAME")
    private String name;
}
