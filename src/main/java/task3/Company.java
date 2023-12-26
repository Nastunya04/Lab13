package task3;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.StringJoiner;

@Getter @Setter
@Builder
public class Company {
    private String domain;
    private String description;
    private String logo;

    @Override
    public String toString() {
        return new StringJoiner(", ", "Company{", "}")
                .add("name='" + domain + "'")
                .add("description='" + description + "'")
                .add("logo='" + logo + "'")
                .toString();
    }

}
