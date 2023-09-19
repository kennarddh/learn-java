package kennarddh.data.vehicle;

public interface HasBrand {
    default String getBrand() {
        return "No brand";
    }
}
