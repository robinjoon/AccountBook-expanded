package space.robinjoon.househole_account_book.accountbook;

import space.robinjoon.househole_account_book.dto.Statistics;

import java.util.Collections;
import java.util.List;

public class MonthAccountBook {

    public Record getRecord(long recordId){
        return new Record();
    }

    public List<Record> getRecordList(){
        return Collections.emptyList();
    }

    public void addRecord(Record record){

    }

    public void editRecord(long recordId, Record record){

    }

    public void deleteRecord(long recordId){

    }

    public Statistics getMonthStatistics(){
        return new Statistics();
    }
}
