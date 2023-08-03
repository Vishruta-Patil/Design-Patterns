package solid.live.srp;

public class Employee {
    private int empId;
    private static int TOTAL_LEAVES_ALLOWED = 30;

    private double monthlySalary;
    private String name;
    private String addressStreet;
    private String addressCity;
    private String addressCountry;
    private int leavesTaken;
    private int totalLeaveAllowed;
    private int leaveTaken;
    private String manager;
    private int yearsInOrg;
    private int thisYeard;
    private int[] leavesLeftPreviously;


    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.yearsInOrg = leavesLeftPreviously.length;
    }

    public Employee() {
    }

    
    public string getName() {
        return employee.name
    }
    public int getEmpId() {
        return employee.empId
    }
    public int getTotalLeave() {
        return employee.totalLeaveAllowed
    }
    public int getLeaveTaken() {
        return employee.leaveTaken
    }
    public String getManagerName() {
        return employee.manager
    }
    public double getMonthlySalary() {
        return employee.monthlySalary
    }

    public int getTotalLeaveLeft() {
        int years = 3;
        if (yearsInOrg < 3) {
            years = this.yearsInOrg;
        }
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += this.leavesLeftPreviously[this.yearsInOrg-i-1];
        }
        return totalLeaveLeftPreviously;
    }
}

public class EmployeeFormatter {
    private Employee employee;

    EmployeeFormatter(Employee employee) {
        this.employee = employee;
    }

     public String toHtml() {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employee.getEmpId() + "'>" +
                "<span>" + employee.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (employee.getTotalLeave - employee.getLeaveTaken) + "</span>";
        str += "<span>" + Math.round(monthlySalary * 12) + "</span>";
        if (employee.getManagerName() != null) str += "<span>" + employee.getManagerName() + "</span>";
        else str += "<span>None</span>";
        str += "<span>" + employee.getTotalLeaveLeft() + "</span>";
        return str + "</div> </div>";
    }
}



