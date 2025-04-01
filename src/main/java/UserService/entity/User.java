package UserService.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class User {
    @Id
    private String userId;
    private String name;
    private String email;
    private String about;
    @Transient  // don't want to save in database
    private List<Rating> ratings;
}
