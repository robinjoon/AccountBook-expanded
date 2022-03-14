package space.robinjoon.househole_account_book.exception;

public class NonExistentRecordException extends IllegalArgumentException{
    public NonExistentRecordException(String msg){
        super(msg);
    }
}
