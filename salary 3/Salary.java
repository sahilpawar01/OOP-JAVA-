import java.util.Scanner;

class Employee {
    int empId;
    String name;
    long mobile;
    String address;
    String email;

    public Employee() {
        this.empId = 0;
        this.name = null;
        this.mobile = 0;
        this.address = null;
        this.email = null;
    }

    public Employee(int empId, String name, long mobile, String address, String email) {
        this.empId = empId;
        this.name = name;
        this.mobile = mobile;
        this.address = address;
        this.email = email;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID:");
        this.empId = sc.nextInt();
        System.out.println("Enter Employee Name:");
        this.name = sc.next();
        System.out.println("Enter Mobile Number:");
        this.mobile = sc.nextLong();
        System.out.println("Enter Email ID:");
        this.email = sc.next();
        System.out.println("Enter Address:");
        this.address = sc.next();
    }

    public void display() {
        System.out.println("Employee ID:" + empId);
        System.out.println("Employee Name:" + name);
        System.out.println("Mobile Number:" + mobile);
        System.out.println("Email ID:" + email);
        System.out.println("Address:" + address);
    }
}

class Programmer extends Employee {
    double bp, da, hra, pf, club, net, gross, deduct;

    public Programmer() {
        super();
        this.bp = 0;
        this.da = 0;
        this.hra = 0;
        this.pf = 0;
        this.club = 0;
        this.net = 0;
        this.gross = 0;
        this.deduct = 0;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic Pay for Programmer:");
        this.bp = sc.nextDouble();
    }

    public void calculateSal() {
        this.da = 0.97 * bp;
        this.hra = 0.10 * bp;
        this.pf = 0.12 * bp;
        this.club = 0.001 * bp;
        this.gross = bp + da + hra;
        this.deduct = pf + club;
        this.net = gross - deduct;
    }

    public void displaySalSlip() {
        System.out.println("\n\n ****PROGRAMMER SALARY SLIP ****\n\n");
        this.display();
        System.out.println(" Basic Pay : " + this.bp);
        System.out.println(" DA : " + this.da);
        System.out.println(" HRA : " + this.hra);
        System.out.println(" PF : " + this.pf);
        System.out.println(" Staff Club : " + this.club);
        System.out.println("\n Gross Salary : " + this.gross);
        System.out.println("\n Deduction in Salary : " + this.deduct);
        System.out.println("\n Net Salary : " + this.net);
    }
}

class TeamLead extends Employee {
    double bp, da, hra, pf, club, net, gross, deduct;

    public TeamLead() {
        super();
        this.bp = 0;
        this.da = 0;
        this.hra = 0;
        this.pf = 0;
        this.club = 0;
        this.net = 0;
        this.gross = 0;
        this.deduct = 0;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic Pay for Team Lead:");
        this.bp = sc.nextDouble();
    }

    public void calculateSal() {
        this.da = 0.97 * bp;
        this.hra = 0.10 * bp;
        this.pf = 0.12 * bp;
        this.club = 0.001 * bp;
        this.gross = bp + da + hra;
        this.deduct = pf + club;
        this.net = gross - deduct;
    }

    public void displaySalSlip() {
        System.out.println("\n\n ****TeamLead SALARY SLIP ****\n\n");
        this.display();
        System.out.println(" Basic Pay : " + this.bp);
        System.out.println(" DA : " + this.da);
        System.out.println(" HRA : " + this.hra);
        System.out.println(" PF : " + this.pf);
        System.out.println(" Staff Club : " + this.club);
        System.out.println("\n Gross Salary : " + this.gross);
        System.out.println("\n Deduction in Salary : " + this.deduct);
        System.out.println("\n Net Salary : " + this.net);
    }
}

class AsstProjectManager extends Employee {
    double bp, da, hra, pf, club, net, gross, deduct;

    public AsstProjectManager() {
        super();
        this.bp = 0;
        this.da = 0;
        this.hra = 0;
        this.pf = 0;
        this.club = 0;
        this.net = 0;
        this.gross = 0;
        this.deduct = 0;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic Pay for Asst. Project Manager:");
        this.bp = sc.nextDouble();
    }

    public void calculateSal() {
        this.da = 0.97 * bp;
        this.hra = 0.10 * bp;
        this.pf = 0.12 * bp;
        this.club = 0.001 * bp;
        this.gross = bp + da + hra;
        this.deduct = pf + club;
        this.net = gross - deduct;
    }

    public void displaySalSlip() {
        System.out.println("\n\n ****AsstProjectManager SALARY SLIP ****\n\n");
        this.display();
        System.out.println(" Basic Pay : " + this.bp);
        System.out.println(" DA : " + this.da);
        System.out.println(" HRA : " + this.hra);
        System.out.println(" PF : " + this.pf);
        System.out.println(" Staff Club : " + this.club);
        System.out.println("\n Gross Salary : " + this.gross);
        System.out.println("\n Deduction in Salary : " + this.deduct);
        System.out.println("\n Net Salary : " + this.net);
    }
}

class ProjectManager extends Employee {
    double bp, da, hra, pf, club, net, gross, deduct;

    public ProjectManager() {
        super();
        this.bp = 0;
        this.da = 0;
        this.hra = 0;
        this.pf = 0;
        this.club = 0;
        this.net = 0;
        this.gross = 0;
        this.deduct = 0;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic Pay for Project Manager:");
        this.bp = sc.nextDouble();
    }

    public void calculateSal() {
        this.da = 0.97 * bp;
        this.hra = 0.10 * bp;
        this.pf = 0.12 * bp;
        this.club = 0.001 * bp;
        this.gross = bp + da + hra;
        this.deduct = pf + club;
        this.net = gross - deduct;
    }

    public void displaySalSlip() {
        System.out.println("\n\n ****ProjectManager SALARY SLIP ****\n\n");
        this.display();
        System.out.println(" Basic Pay : " + this.bp);
        System.out.println(" DA : " + this.da);
        System.out.println(" HRA : " + this.hra);
        System.out.println(" PF : " + this.pf);
        System.out.println(" Staff Club : " + this.club);
        System.out.println("\n Gross Salary : " + this.gross);
        System.out.println("\n Deduction in Salary : " + this.deduct);
        System.out.println("\n Net Salary : " + this.net);
    }
}

public class Salary {
    public static void main(String[] args) {
        int m;
        char n;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("\n1.Programmer \n2.Team Lead \n3.Asst. Project Manager \n4.Project Manager \nEnter Your Choice : ");
            m = input.nextInt();

            switch (m) {
                case 1:
                    Programmer prog = new Programmer();
                    prog.input();
                    prog.calculateSal();
                    prog.displaySalSlip();
                    break;

                case 2:
                    TeamLead team = new TeamLead();
                    team.input();
                    team.calculateSal();
                    team.displaySalSlip();
                    break;

                case 3:
                    AsstProjectManager apm = new AsstProjectManager();
                    apm.input();
                    apm.calculateSal();
                    apm.displaySalSlip();
                    break;

                case 4:
                    ProjectManager pm = new ProjectManager();
                    pm.input();
                    pm.calculateSal();
                    pm.displaySalSlip();
                    break;

                default:
                    System.out.println("Wrong Choice");
            }

            System.out.print("\nDo you want to continue-y/n : ");
            n = input.next().charAt(0);

        } while (n == 'y');

        System.out.println("Program Executed Successfully...");
    }
}
