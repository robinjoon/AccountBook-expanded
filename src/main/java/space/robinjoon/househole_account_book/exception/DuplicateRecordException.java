package space.robinjoon.househole_account_book.exception;

public class DuplicateRecordException extends IllegalArgumentException{
    public DuplicateRecordException(String msg){
        super(msg);
    }
}
