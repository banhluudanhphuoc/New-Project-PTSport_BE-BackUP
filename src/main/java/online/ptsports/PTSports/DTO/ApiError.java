package online.ptsports.PTSports.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class ApiError {
    private HttpStatus status;

    private String error;
    private String message;

    // constructors, getters, and setters...
}
