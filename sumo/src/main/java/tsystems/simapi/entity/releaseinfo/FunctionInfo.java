package tsystems.simapi.entity.releaseinfo;

import lombok.*;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FunctionInfo {
    private String name;
    private List<EcuDatas> ecuDatas;
}
