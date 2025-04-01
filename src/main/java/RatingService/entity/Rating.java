package RatingService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Rating {
    @Id
    private String ratingId;
    private String userId;
    private String hotelId;
    private String rating;
    private String feedback;
}
