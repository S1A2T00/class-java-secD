//package OOPSinJava;
//import java.util.Scanner;
//abstract class Booking {
//    String customer;
//    int id;
//    double amount
//
//    Booking(String customer, int id) {
//        this.customer = customer;
//        this.id = id;
//        this.amount=amount;
//    }
//    void showDetails() {
//        System.out.println("Customer Name: " + customer + ", ID No: " + id);
//    }
//    abstract void booking();
//}
//interface cab {
//    void ticket();
//}
//
//interface bus {
//    void ride();
//}
//
//interface train {
//    void confirmed_ticket();
//}
//class cab_driver extends Booking implements cab{
//    cab_driver(String customer,int id,double amount);
//    super(customer,id,amount);
//}
//void ticket(){
//    Scanner sc=new Scanner(System.in);
//    String customer=sc.nextLine();
//    int id=sc.nextInt();
//    double amount=sc.nextDouble();
//
//}
//class bus_driver extends Booking implements bus{
//    Scanner sc=new Scanner(System.in);
//    String customer=sc.nextLine();
//    int id=sc.nextInt();
//    double amount=sc.nextDouble();
//}
//class train_driver extends Booking implements train{
//    Scanner sc=new Scanner(System.in);
//    String customer=sc.nextLine();
//    int id=sc.nextInt();
//    double amount=sc.nextDouble();
//}