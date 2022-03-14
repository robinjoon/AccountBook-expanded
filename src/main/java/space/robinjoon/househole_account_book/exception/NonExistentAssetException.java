package space.robinjoon.househole_account_book.exception;

public class NonExistentAssetException extends IllegalArgumentException{
    public NonExistentAssetException(String msg){
        super(msg);
    }
}
