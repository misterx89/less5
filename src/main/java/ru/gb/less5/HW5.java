package ru.gb.less5;

public class HW5 {
    public static void main(String[] args) {
        Employees[] empCorp = new Employees[5];
        empCorp[0] = new Employees("Ivanov Ivan", "Engineer", "ivivan@mail.ru", "87071908976",50000,57);
        empCorp[1] = new Employees("Petrov Sergey", "Driver", "petrov@mail.ru", "87771435768",35000,41);
        empCorp[2] = new Employees("Sidorov Maxim", "Director", "sidorov@mail.ru", "87754235768",80000,60);
        empCorp[3] = new Employees("Romashkina Tatyana", "Buhgalter", "romashkina@mail.ru", "87087564839",40000,45);
        empCorp[4] = new Employees("Kolobkov Evgeniy", "Stajer", "Kolobkov@mail.ru", "87070897564",14000,18);
        for (Employees employee : empCorp)
            if (employee.getAge()>40)
                System.out.println(employee);
    }
}
