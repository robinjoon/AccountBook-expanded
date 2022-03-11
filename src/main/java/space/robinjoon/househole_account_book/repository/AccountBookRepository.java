package space.robinjoon.househole_account_book.repository;

import space.robinjoon.househole_account_book.accountbook.HouseHoldAccountBook;
import space.robinjoon.househole_account_book.dto.User;

public class AccountBookRepository {

    public HouseHoldAccountBook getHouseHoldAccountBook(User user){
        return new HouseHoldAccountBook();
    }

    public void addHouseHoldAccountBook(User user){

    }

    public void deleteHouseHoldAccountBook(User user){

    }
}
