package com.vipul.moviecatalogservice.models;

import java.util.List;

public class CatalogItems {
    private List<CatalogItem> catalogItemList;

    public List<CatalogItem> getCatalogItemList() {
        return catalogItemList;
    }

    public void setCatalogItemList(List<CatalogItem> catalogItemList) {
        this.catalogItemList = catalogItemList;
    }
}
