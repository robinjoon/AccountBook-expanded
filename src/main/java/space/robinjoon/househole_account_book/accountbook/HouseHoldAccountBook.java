package space.robinjoon.househole_account_book.accountbook;

import space.robinjoon.househole_account_book.dto.Asset;
import space.robinjoon.househole_account_book.dto.Statistics;

import java.util.Collections;
import java.util.List;

public class HouseHoldAccountBook {
    public void addAsset(String assetName, long initValue){

    }

    public List<Asset> getAssetList(){
        return Collections.emptyList();
    }

    public void deleteAsset(String assetName){

    }

    public YearAccountBook getYearAccountBook(int year){
        return new YearAccountBook();
    }

    public List<YearAccountBook> getYearAccountBookList(){
        return Collections.emptyList();
    }

    public void addYearAccountBook(int year){

    }

    public Statistics getTotalStatistics(){
        return new Statistics();
    }
}
