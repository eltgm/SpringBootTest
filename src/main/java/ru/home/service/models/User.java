package ru.home.service.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.home.service.forms.UserForm;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "fix_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_name;
    private String last_name;

    @OneToMany
    @JoinColumn(name = "owner_id")
    private List<Car> cars;

    public static User fromForm(UserForm form) {
        return User.builder()
                .first_name(form.getFirstName())
                .last_name(form.getLastName())
                .build();
    }
}
