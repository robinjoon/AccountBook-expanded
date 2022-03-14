package space.robinjoon.househole_account_book.accountbook;

import space.robinjoon.househole_account_book.model.Record;

import java.util.Optional;

public interface RecordManager {

    public void addRecord(Record record);

    public Optional<Record> getRecord(int recordId);

    public void editRecord(int recordId, Record record);

    public void deleteRecord(int recordId);
}
