import java.util.*;

public class Store {

      static class Brands{

          private static final Brand samsung = new Brand(1,"Samsung");
          private static final Brand lenovo  = new Brand(2,"Lenovo");
          private static final Brand apple   = new Brand(3,"Apple");
          private static final Brand huawei  = new Brand(4,"Huawei");
          private static final Brand casper  = new Brand(5,"Casper");
          private static final Brand asus    = new Brand(6,"Asus");
          private static final Brand hp      = new Brand(7,"HP");
          private static final Brand xiaomi  = new Brand(8,"Xiaomi");
          private static final Brand monster = new Brand(9,"Monster");

          static ArrayList<Brand> brands = new ArrayList<>(
                  Arrays.asList(samsung,lenovo,apple,huawei,casper,asus,hp,xiaomi,monster)
          );



          public static Brand getSamsung() {
              return samsung;
          }

          public static Brand getLenovo() {
              return lenovo;
          }

          public static Brand getApple() {
              return apple;
          }

          public static Brand getHuawei() {
              return huawei;
          }

          public static Brand getCasper() {
              return casper;
          }

          public static Brand getAsus() {
              return asus;
          }

          public static Brand getHp() {
              return hp;
          }

          public static Brand getXiaomi() {
              return xiaomi;
          }

          public static Brand getMonster() {
              return monster;
          }
      }

      static class Products{

          static Notebook notebook1 = new Notebook(1,7000,0, 100, "Matebook 14", Store.Brands.getHuawei(),16,512,14);
          static Notebook notebook2 = new Notebook(2,3699,0, 100, "V14 IGL", Store.Brands.getLenovo(),8,1024,14);
          static Notebook notebook3 = new Notebook(3,8199,0, 100, "Tuf Gaming", Store.Brands.getAsus(),32,2048,15.6);

          static MobilePhone phone1 = new MobilePhone(1,3199,0,100,"Galaxy A51",Store.Brands.getSamsung(),128,6.5,32,4000,6,"Black");
          static MobilePhone phone2 = new MobilePhone(2,7379,0,100,"iPhone 11",Store.Brands.getApple(),64,6.1,5,3046,6,"Blue");
          static MobilePhone phone3 = new MobilePhone(3,4012,0,100,"Redmi Note 10 Pro",Store.Brands.getXiaomi(),128,6.5,35,4000,12,"White");


          static ArrayList<Notebook> notebooks = new ArrayList<>(Arrays.asList(notebook1,notebook2,notebook3));
          static ArrayList<MobilePhone> phones = new ArrayList<>(Arrays.asList(phone1,phone2,phone3));

      }


    public void listBrandsAtoZ(ArrayList<Brand> brands){

        TreeSet<Brand> brandList = new TreeSet<>(new Comparator<Brand>() {
            @Override
            public int compare(Brand o1, Brand o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        brandList.addAll(brands);

        System.out.println("Our Brands\n--------------");
        for (Brand brand:brandList) {

            System.out.println("-> " + brand.getName());

        }

    }

    public void listNotebooks(ArrayList<Notebook> notebooks){

        TreeSet<Notebook> newNotebooks = new TreeSet<>(new Comparator<Notebook>() {
            @Override
            public int compare(Notebook o1, Notebook o2) {
                return o1.getId() - o2.getId();
            }
        });

        newNotebooks.addAll(notebooks);

        System.out.println("\n-----------------\nList of Notebooks");
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.format("| %-4s | %-20s | %-10s | %-10s | %-10s | %-12s | %-10s |","ID","Product Name","Price","Brand","Storage","Screen Size","RAM");
        System.out.println("\n--------------------------------------------------------------------------------------------------");
        for (Notebook notebook:newNotebooks) {

            System.out.format("| %-4s | %-20s | %-10s | %-10s | %-10s | %-12s | %-10s |",notebook.getId(),notebook.getProductName(),notebook.getPrice(),notebook.getBrand().getName(),notebook.getStorageCapacity(),notebook.getScreenSize(),notebook.getRam());
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------------------------------");


    }

    public void listPhones(ArrayList<MobilePhone> phones){

        TreeSet<MobilePhone> newPhones = new TreeSet<>(new Comparator<MobilePhone>() {
            @Override
            public int compare(MobilePhone o1, MobilePhone o2) {
                return o1.getId() - o2.getId();
            }
        });

        newPhones.addAll(phones);

        System.out.println("\n---------------------\nList of Mobile Phones");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("| %-4s | %-20s | %-10s | %-10s | %-10s | %-12s | %-10s | %-10s | %-10s | %-10s |","ID","Product Name","Price","Brand","Storage","Screen Size","RAM","Camera","Battery","Color");
        System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------");
        for (MobilePhone phone:newPhones) {

            System.out.format("| %-4s | %-20s | %-10s | %-10s | %-10s | %-12s | %-10s | %-10s | %-10s | %-10s |",phone.getId(),phone.getProductName(),phone.getPrice(),phone.getBrand().getName(),phone.getStorageCapacity(),phone.getScreenSize(),phone.getRam(),phone.getCameraResolution(),phone.getBatteryPower(),phone.getColor());
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");


    }

    public void addNewProduct(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Add a new notebook");
        System.out.println("2.Add a new mobile phone");

        System.out.print("\nYour Choice : ");
        int choice = scanner.nextInt();

        switch (choice){

            case 1:
                System.out.print("ID : ");
                int id = scanner.nextInt(); scanner.nextLine();
                System.out.print("Name : ");
                String name = scanner.nextLine().toUpperCase();
                System.out.print("Price : ");
                double price = scanner.nextDouble(); scanner.nextLine();
                System.out.print("Brand : ");
                String brand = scanner.nextLine().trim().toUpperCase();
                System.out.print("Storage Capacity : ");
                int capacity = scanner.nextInt();
                System.out.print("Screen Size : ");
                double monitorSize = scanner.nextDouble();
                System.out.print("RAM : ");
                int ram = scanner.nextInt();


                Brand b = new Brand(0,"Unknown");

                if (brand.equals(Brands.getXiaomi().getName().toUpperCase())){

                    b = Brands.xiaomi;

                }else if (brand.equals(Brands.getApple().getName().toUpperCase())){

                    b = Brands.apple;

                }else if (brand.equals(Brands.getAsus().getName().toUpperCase())){

                    b = Brands.asus;

                }else if (brand.equals(Brands.getCasper().getName().toUpperCase())){

                    b = Brands.casper;

                }else if (brand.equals(Brands.getHp().getName().toUpperCase())){

                    b = Brands.hp;

                }else if (brand.equals(Brands.getHuawei().getName().toUpperCase())){

                    b = Brands.huawei;

                }else if (brand.equals(Brands.getLenovo().getName().toUpperCase())){

                    b = Brands.lenovo;

                }else if (brand.equals(Brands.getMonster().getName().toUpperCase())){

                    b = Brands.monster;

                }else if (brand.equals(Brands.getSamsung().getName().toUpperCase())){

                    b = Brands.samsung;

                }

                Notebook notebook = new Notebook(id,price,0,100,name,b,ram,capacity,monitorSize);

                //products.add(notebook);
                Products.notebooks.add(notebook);



            break;

            case 2:

                System.out.print("ID : ");
                int id1 = scanner.nextInt(); scanner.nextLine();
                System.out.print("Name : ");
                String name1 = scanner.nextLine().toUpperCase();
                System.out.print("Price : ");
                double price1 = scanner.nextDouble(); scanner.nextLine();
                System.out.print("Brand : ");
                String brand1 = scanner.nextLine().trim().toUpperCase();
                System.out.print("Storage Capacity : ");
                int capacity1 = scanner.nextInt();
                System.out.print("Screen Size : ");
                double monitorSize1 = scanner.nextDouble();
                System.out.print("RAM : ");
                int ram1 = scanner.nextInt();
                System.out.print("Camera Resolution : ");
                double cam = scanner.nextDouble();
                System.out.print("Battery : ");
                int battery = scanner.nextInt();scanner.nextLine();
                System.out.print("Color : ");
                String color = scanner.nextLine();


                Brand b1 = new Brand(0,"Unknown");

                if (brand1.equals(Brands.getXiaomi().getName().toUpperCase())){

                    b1 = Brands.xiaomi;

                }else if (brand1.equals(Brands.getApple().getName().toUpperCase())){

                    b1 = Brands.apple;

                }else if (brand1.equals(Brands.getAsus().getName().toUpperCase())){

                    b1 = Brands.asus;

                }else if (brand1.equals(Brands.getCasper().getName().toUpperCase())){

                    b1 = Brands.casper;

                }else if (brand1.equals(Brands.getHp().getName().toUpperCase())){

                    b1 = Brands.hp;

                }else if (brand1.equals(Brands.getHuawei().getName().toUpperCase())){

                    b1 = Brands.huawei;

                }else if (brand1.equals(Brands.getLenovo().getName().toUpperCase())){

                    b1 = Brands.lenovo;

                }else if (brand1.equals(Brands.getMonster().getName().toUpperCase())){

                    b1 = Brands.monster;

                }else if (brand1.equals(Brands.getSamsung().getName().toUpperCase())){

                    b1 = Brands.samsung;

                }

                MobilePhone phone = new MobilePhone(id1,price1,0,100,name1,b1,capacity1,monitorSize1,cam,battery,ram1,color);

                //products.add(phone);
                Products.phones.add(phone);

            break;


        }

    }

    public void deleteAProduct(){

        Scanner scanner = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Product> removed = new ArrayList<>();

        System.out.println("\n1.Delete a notebook\n2.Delete a phone");
        System.out.print("Your Choice : ");
        int np = scanner.nextInt();

        if (np == 1){

            products.addAll(Products.notebooks);

        }else if (np == 2){

            products.addAll(Products.phones);

        }

        System.out.println();
        System.out.format("| %-4s | %-20s |","ID","Product");
        System.out.println("\n-------------------------------");
        for (Product product:products) {

            System.out.format("| %-4s | %-20s |\n",product.getId(),product.getProductName());

        }

        System.out.print("\nEnter the ID of the product you want to delete : ");
        int id = scanner.nextInt();

        Product p;

        for (int i=0;i<products.size();i++){

            if (products.get(i).getId() == id){

                p = products.get(i);
                products.remove(p);
                removed.add(p);
                System.out.println(p.getProductName() + " is removed.");

            }

        }

        if (np == 1){

            Products.notebooks.removeAll(removed);

        }else if (np == 2){

            Products.phones.removeAll(removed);

        }



    }

    public void search(){

        Scanner scanner = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();

        System.out.println("\n1.Search a notebook\n2.Search a phone");
        System.out.print("Your Choice : ");
        int np = scanner.nextInt();

        if (np == 1){

            products.addAll(Products.notebooks);

        }else if (np == 2){

            products.addAll(Products.phones);

        }

        System.out.println("\n1.Search by ID numbers");
        System.out.println("2.Search by brands");

        System.out.print("Your Choice : ");
        int choice = scanner.nextInt(); scanner.nextLine();

        switch (choice){

            case 1:
                System.out.print("\nEnter the ID number that will be searched : ");
                int id = scanner.nextInt();

                System.out.println("\n************************ RESULTS ************************");
                System.out.format("| %-4s | %-20s | %-10s | %-10s |\n","ID","Product Name","Price","Brand");
                for (Product product:products) {

                    if (product.getId() == id){

                        System.out.format("| %-4s | %-20s | %-10s | %-10s |\n",product.getId(),product.getProductName(),product.getPrice(),product.getBrand().getName());

                    }

                }
                break;

            case 2:
                System.out.print("\nEnter the brand that will be searched : ");
                String brand = scanner.nextLine().toUpperCase().trim();

                System.out.println("\n************************ RESULTS ************************");
                System.out.format("| %-4s | %-20s | %-10s | %-10s |\n","ID","Product Name","Price","Brand");
                for (Product product:products) {

                    if (product.getBrand().getName().toUpperCase().equals(brand)){

                        System.out.format("| %-4s | %-20s | %-10s | %-10s |\n",product.getId(),product.getProductName(),product.getPrice(),product.getBrand().getName());

                    }

                }
                break;

        }

    }


}
