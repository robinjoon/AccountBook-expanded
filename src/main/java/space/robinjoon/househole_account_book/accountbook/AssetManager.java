package space.robinjoon.househole_account_book.accountbook;

import space.robinjoon.househole_account_book.model.Asset;
import space.robinjoon.househole_account_book.model.Statistics;

import java.util.Date;
import java.util.List;

public interface AssetManager {
    public long getTotalAssetValue();

    public List<Statistics> getAssetStatistics(Date startDate, Date endDate);

    public void addAsset(Asset asset);

    public Asset getAsset(String assetName);

    public List<Asset> getAssets();

    public void deleteAsset(String assetName);
}
