package space.robinjoon.househole_account_book.accountbook;

import space.robinjoon.househole_account_book.model.Record;
import space.robinjoon.househole_account_book.model.Statistics;

import java.util.Date;
import java.util.List;

public interface MonthAccountBook {
    public List<Record> getRecords(Date date);

    public List<Long> getTotalMonthIncome(Date date);

    public List<Long> getTotalMonthOutGo(Date date);

    public List<Long> getTotalMonthNetIncome(Date date);

    public Statistics getMonthStatistics(Date date);

    public List<Statistics> getMonthStatistics(Date startDate, Date endDate);
}
