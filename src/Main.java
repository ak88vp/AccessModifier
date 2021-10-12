import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] lis = new Book[2];
        input(lis);
        output(lis);
        System.out.println( total(lis));
        check(lis);


    }

    public static void input(Book[] lis) {
        for (int i = 0; i < 2; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập vào thông tin : ");
            String name = scanner.nextLine();
            System.out.println("nhập thể loại : ");
            String theLoai = scanner.nextLine();
            System.out.println("GIÁ : ");
            int gia = scanner.nextInt();
            Book book = new Book(name, theLoai, gia);
            lis[i] = book;
        }
    }

    public static void output(Book[] lis) {
        for (int i = 0; i < 2; i++) {
            System.out.println(lis[i]);
        }
    }
    public static double total(Book[] lis){
        double total=0;
        for (int i=0;i<2;i++){
            total+=lis[i].gia;
        }
        return total;
    }
    public static void check(Book[] lis){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập sách check : ");
        String name=scanner.nextLine();
        for(int i=0;i<2;i++){
            if (lis[i].name.equals(name)){
                System.out.println(lis[i]);
            }
        }
    }

}
