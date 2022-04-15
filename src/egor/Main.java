package egor;

public class Main {

    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        emp[0] = new Employee
            ("Ivanov Evgeny", "Manager", "ivivan@gmail.com.", "89819832199",50000,41);
        emp[1] = new Employee
            ("Petrov Petr", "Creator", "petrov@mailbox.com", "89839812195", 50000,24);
        emp[2] = new Employee
            ("Sidorov Sasha", "Manager", "sashs@mailbox.com", "89819832199", 100000,45);
        emp[3] = new Employee
            ("Olga Kin", "QA", "kin@gmail.com", "89819832199",50000,18);
        emp[4] = new Employee
            ("Egor Petrov", "Java Developer", "egor@mail.ru", "89819832199",70000,29);

        for (Employee employee : emp)
            if (employee.getAge()>40)
                System.out.println(employee);
    }

}

