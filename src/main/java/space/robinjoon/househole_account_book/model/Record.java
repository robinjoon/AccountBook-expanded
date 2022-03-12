package space.robinjoon.househole_account_book.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Record {
    private long recordId;
    private String userName;
    private String when;
    private String where;
    private String what;
    private String why;
    private String category;
}
