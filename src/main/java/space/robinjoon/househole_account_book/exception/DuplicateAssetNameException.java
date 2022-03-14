package space.robinjoon.househole_account_book.exception;

import space.robinjoon.househole_account_book.model.Asset;

public class DuplicateAssetNameException extends IllegalArgumentException{
    public DuplicateAssetNameException(String msg){
        super(msg);
    }
}
