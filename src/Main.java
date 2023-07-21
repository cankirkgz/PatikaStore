import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> brandNames = new ArrayList<>(Arrays.asList("samsung", "lenovo", "apple", "huawei", "casper", "asus", "hp", "xiaomi", "monster"));
        List<Telephone> telephones = addTelephones();
        List<Notebook> notebooks = addNotebooks();

        int selection;
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("\n1 - Brand List");
            System.out.println("2 - Telephone");
            System.out.println("3 - Notebook");
            System.out.println("4 - Add Product");
            System.out.println("5 - Delete Product");
            System.out.println("6 - Exit");
            System.out.print("Select an option: ");

            selection = scanner.nextInt();

            switch (selection) {
                case 1 -> listBrands(brandNames);
                case 2 -> listTelephones(telephones);
                case 3 -> listNotebooks(notebooks);
                case 4 -> addProduct(brandNames, telephones, notebooks);
                case 5 -> deleteProduct(telephones, notebooks);
                case 6 -> continueLoop = false;
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static List<Telephone> addTelephones() {
        List<Telephone> telephones = new ArrayList<>();

        telephones.add(new Telephone(5000, 10, 45, "S20", new Brand("Samsung"), 8, 64, 15.6, 4500, "Black"));
        telephones.add(new Telephone(5000, 10, 45, "14", new Brand("Apple"), 8, 64, 15.6, 4500, "Pink"));
        telephones.add(new Telephone(5000, 10, 45, "Red Mi Note 11", new Brand("Xiaomi"), 8, 64, 15.6, 4500, "Red"));

        return telephones;
    }

    private static List<Notebook> addNotebooks() {
        List<Notebook> notebooks = new ArrayList<>();

        notebooks.add(new Notebook(15000, 10, 45, "Thinkpad 3", new Brand("Lenovo"), 24, 512, 13.2));
        notebooks.add(new Notebook(35000, 10, 45, "M2", new Brand("Apple"), 8, 128, 16.6));
        notebooks.add(new Notebook(25000, 10, 45, "D16", new Brand("Huawei"), 16, 1024, 15.6));

        return notebooks;
    }

    private static void listBrands(List<String> brandNames) {
        List<Brand> brands = new ArrayList<>();
        for (String brandName : brandNames) {
            brands.add(new Brand(brandName));
        }
        Collections.sort(brands);
        for (Brand brand : brands) {
            System.out.println("-" + brand.getBrandName().toUpperCase());
        }
    }

    private static void listTelephones(List<Telephone> telephones) {
        System.out.format("%-5s %-8s %-25s %-14s %-10s %-10s %-10s %-10s\n", "|ID|", "|Brand|", "|Model|", "|Price|", "|Memory|", "|RAM|", "|Size|", "|Color|");
        System.out.println("___________________________________________________________________________________________");
        for (Telephone telephone : telephones) {
            System.out.format(" %-4s %-10s %-23s %-15s %-10s %-10s %-10s %-10s\n", telephone.getId(), telephone.getBrand(), telephone.getProductName(), telephone.getUnitPrice() + " TL", telephone.getMemory() + " GB", telephone.getRam() + " GB", telephone.getScreenSize() + "`", telephone.getColor());
        }
    }

    private static void listNotebooks(List<Notebook> notebooks) {
        System.out.format("%-5s %-8s %-22s %-11s %-10s %-10s %-10s\n", "|ID|", "|Brand|", "|Model|", "|Price|", "|Memory|", "|RAM|", "|Size|");
        System.out.println("______________________________________________________________________________________________");
        for (Notebook notebook : notebooks) {
            System.out.format(" %-4s %-8s %-21s %-13s %-10s %-10s %-10s\n", notebook.getId(), notebook.getBrand(), notebook.getProductName(), notebook.getUnitPrice() + " TL", notebook.getMemory() + " GB", notebook.getRam() + " GB", notebook.getScreenSize() + "`");
        }
    }

    private static void addProduct(List<String> brandNames, List<Telephone> telephones, List<Notebook> notebooks) {
        System.out.print("Select the type of product to add,\n1 - Telephone\n2 - Notebook\nChoice: ");
        List<String> values = new ArrayList<>();
        int selection = scanner.nextInt();
        switch (selection) {
            case 1 -> {
                String[] attributes = new String[]{"Brand", "Model", "Price", "Discount", "Stock", "Memory", "Size", "Battery", "RAM", "Color"};
                for (String attribute : attributes) {
                    System.out.print(attribute + ": ");
                    String value = scanner.next();
                    while (attribute.equals("Brand") && !brandNames.contains(value.toLowerCase())) {
                        System.out.print(attribute + " not in the brand list. Enter again: ");
                        value = scanner.next();
                    }
                    values.add(value);
                }
                telephones.add(new Telephone(
                        Double.parseDouble(values.get(2)), // unitPrice
                        Double.parseDouble(values.get(3)), // discountRate
                        Integer.parseInt(values.get(4)), // stockAmount
                        values.get(1), // productName
                        new Brand(values.get(0)), // brand
                        Integer.parseInt(values.get(8)), // ram
                        Integer.parseInt(values.get(5)), // memory
                        Double.parseDouble(values.get(6)), // screenSize
                        Integer.parseInt(values.get(7)), // batteryPower
                        values.get(9) // color
                ));
            }
            case 2 -> {
                String[] attributes = new String[]{"Brand", "Model", "Price", "Discount", "Stock", "Memory", "Size", "RAM"};
                for (String attribute : attributes) {
                    System.out.print(attribute + ": ");
                    String value = scanner.next();
                    while (attribute.equals("Brand") && !brandNames.contains(value.toLowerCase())) {
                        System.out.print(attribute + " not in the brand list. Enter again: ");
                        value = scanner.next();
                    }
                    values.add(value);
                }
                notebooks.add(new Notebook(
                        Double.parseDouble(values.get(2)), // unitPrice
                        Double.parseDouble(values.get(3)), // discountRate
                        Integer.parseInt(values.get(4)), // stockAmount
                        values.get(1), // productName
                        new Brand(values.get(0)), // brand
                        Integer.parseInt(values.get(7)), // ram
                        Integer.parseInt(values.get(5)), // memory
                        Double.parseDouble(values.get(6)) // screenSize
                ));
            }
        }
    }

    private static void deleteProduct(List<Telephone> telephones, List<Notebook> notebooks) {
        System.out.print("Select the type of product to delete,\n1 - Telephone\n2 - Notebook\nChoice: ");
        int selection = scanner.nextInt();
        switch (selection) {
            case 1 -> {
                listTelephones(telephones);
                System.out.print("Enter the ID of the telephone to delete: ");
                int id = scanner.nextInt();
                telephones.removeIf(telephone -> telephone.getId() == id);
            }
            case 2 -> {
                listNotebooks(notebooks);
                System.out.print("Enter the ID of the notebook to delete: ");
                int id = scanner.nextInt();
                notebooks.removeIf(notebook -> notebook.getId() == id);
            }
        }
    }
}
