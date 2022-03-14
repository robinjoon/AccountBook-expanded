package space.robinjoon.househole_account_book.accountbook;

import space.robinjoon.househole_account_book.model.Record;
import space.robinjoon.househole_account_book.model.Statistics;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface DayAccountBook {
    public List<Record> getRecords(Date date);

    public List<Long> getTotalDayIncome(Date date);

    public List<Long> getTotalDayOutGo(Date date);

    public List<Long> getTotalDayNetIncome(Date date);

    public Optional<Statistics> getDayStatistics(Date date);

    public List<Statistics> getDayStatistics(Date startDate, Date endDate);
}
