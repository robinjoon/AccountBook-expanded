package space.robinjoon.househole_account_book.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Asset {
    private String userName;
    private String assetName;
    private long value;
}
