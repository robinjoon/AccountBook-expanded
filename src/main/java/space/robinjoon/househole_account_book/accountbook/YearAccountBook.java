package space.robinjoon.househole_account_book.accountbook;

import space.robinjoon.househole_account_book.model.Record;
import space.robinjoon.househole_account_book.model.Statistics;

import java.util.Date;
import java.util.List;

public interface YearAccountBook {
    public List<Record> getRecords(Date date);

    public List<Long> getTotalYearIncome(Date date);

    public List<Long> getTotalYearOutGo(Date date);

    public List<Long> getTotalYearNetIncome(Date date);

    public Statistics getYearStatistics(Date date);

    public List<Statistics> getYearStatistics(Date startDate, Date endDate);
}
