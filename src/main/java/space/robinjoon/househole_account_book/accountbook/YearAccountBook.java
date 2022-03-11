package space.robinjoon.househole_account_book.accountbook;

import space.robinjoon.househole_account_book.dto.Statistics;

import java.util.Collections;
import java.util.List;

public class YearAccountBook {

    public MonthAccountBook getMonthAccountBook(int month){
        return new MonthAccountBook();
    }

    public List<YearAccountBook> getMonthAccountBookList(){
        return Collections.emptyList();
    }

    public void addMonthAccountBook(int month){

    }

    public Statistics getYearStatistics(){
        return new Statistics();
    }

}
