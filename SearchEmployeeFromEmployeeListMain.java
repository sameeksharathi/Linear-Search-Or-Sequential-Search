import java.util.Scanner;

class SearchEmployeeFromEmployeeListMain{
    public static void main(String[] args) {
        SearchEmployeeFromEmployeeList obj=new SearchEmployeeFromEmployeeList();
        Scanner sc=new Scanner(System.in);
        obj.insert(1,"Tom");
        obj.insert(2,"Jerry");
        obj.insert(3,"Bob");
        obj.insert(4,"John");
        obj.insert(5,"Lara");
        obj.display();
        System.out.print("Enter employeeid to search employee's detail: ");
        obj.search(sc.nextInt());
    }
}
