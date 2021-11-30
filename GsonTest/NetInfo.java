import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class NetInfo {
    private String IPv4;
    private String IPv6;
    private String MAC;

}
