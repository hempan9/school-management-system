package school.edu.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor@ToString
@NoArgsConstructor
public class BaseResponse <T> implements Serializable {
     private T data;
     private long totalRecords;
     private String status;
     private String error;
}
