import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class Brand implements Comparable<Brand>{
    private int id;
    private String brandName;

    public Brand(String brandName) {
        this.id = UniqueIDGenerator.getUniqueID();
        this.brandName = brandName;
    }

    public static void listBrand(List<Brand> brands) {
        for (Brand item : brands)
            System.out.println("- " + item.brandName);
    }

    @Override
    public int compareTo(Brand o) {
        return (this.getBrandName().compareTo(o.getBrandName()));
    }

    public class UniqueIDGenerator {
        private static final AtomicInteger counter = new AtomicInteger(0);

        public static int getUniqueID() {
            return counter.incrementAndGet();
        }
    }

    public int getId() {
        return id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
