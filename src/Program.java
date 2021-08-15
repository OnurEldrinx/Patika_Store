import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Store store = new Store();

        boolean flag = true;

        Scanner scanner = new Scanner(System.in);

        while (flag){

            System.out.println("\n-*-*-*-*- Patika Store Product Management Panel -*-*-*-*-");
            System.out.println("1.List the brands");
            System.out.println("2.List products");
            System.out.println("3.Add a new product");
            System.out.println("4.Delete a product");
            System.out.println("5.Search a product");
            System.out.println("0.Exit");

            System.out.print("\n-> Your Choice: ");
            int choice = scanner.nextInt(); scanner.nextLine();

            switch (choice){

                case 1:
                    store.listBrandsAtoZ(Store.Brands.brands);
                    break;

                case 2:
                    System.out.println("1.List Notebooks\n2.List Phones");
                    System.out.print("\n-> Your Choice: ");
                    int c = scanner.nextInt();

                        if (c == 1){

                            store.listNotebooks(Store.Products.notebooks);

                        }else if (c == 2){

                            store.listPhones(Store.Products.phones);

                        }else{

                            System.out.println("Invalid Input!");
                            continue;

                        }

                    break;

                case 3:
                    store.addNewProduct();
                    break;

                case 4:
                    store.deleteAProduct();
                    break;

                case 5:
                    store.search();
                    break;

                case 0:
                    System.out.println("Panel is terminated.");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid Input!");
                    break;


            }


        }


    }
}
