package hibernateExample;

import java.util.List;

public class PurchaseOrder {
    private String supplierName;
    private String dateOfOrder;
    List<Item> purchasedItem;

    public PurchaseOrder(String supplierName, String dateOfOrder, List<Item> purchasedItem) {
        this.supplierName = supplierName;
        this.dateOfOrder = dateOfOrder;
        this.purchasedItem = purchasedItem;
    }

    public List<Item> getPurchasedItem() {
        return purchasedItem;
    }

    public void setPurchasedItem(List<Item> purchasedItem) {
        this.purchasedItem = purchasedItem;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(String dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }
}
