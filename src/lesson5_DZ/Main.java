package lesson5_DZ;

public class Main {



	public static void main(String[] args) {
//Employee emp = new Employee("Ivan Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
//	emp.age = "20 years";
//	emp.salary = "3000 euro";
//	emp.number = " 89123323456 ";
//	emp.email = " fgasae@gmail.com ";
//	emp.position = " Developer ";
//	emp.name = " Sasha ";
//	emp.information();

//		employee[] empArray = new employee[5];
//		empArray[0] = new employee("Iago Ivan","Engineer", "ivivan@mailbox.com", "89325325444","2000 euro" , "30");
//		empArray[1] = new employee("Andree Andrew","Developer", "Andree@gmail.com","89324432343","1000 euro", "30");
//		for(employee employee : empArray ){
//			emp.information();
//		}
		Employee[] emp = new Employee[5];
		emp[0] = new Employee("Ivan Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30 );
		emp[1] = new Employee("faff", "Middle", "vader's@gmail.com","89989889",40000,50);
		emp[2] = new Employee("fads", "Developer", "fvfhz@gmail.com", "894234322", 20000,60);
		emp[3] = new Employee("gamer","High", "gamer@gmail.com", "899992222", 60000, 55);
		emp[4] = new Employee("feds", "Low", "feds@gmail.com", "892323333", 20000, 40);
		for(int i = 0; i < emp.length; i++){
		if(emp[i].age > 40) {
				emp[i].information();
			}
		}
		}

		}
		

			
		







