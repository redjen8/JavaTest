import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class MessageA {

    private List<NetInfo> NetInfo;
    private String code;
    private String hostname;
    private String msg;
}
