
// import java.util.Iterator;
// import java.util.Scanner;
// import java.util.ArrayList;
// public class ArrayList {
//         Scanner input = new Scanner(System.in);
//         ArrayList<Student> students = new ArrayList<>();
         
//          System.out.println("welcom \n 1. add new student 2. exit");
//          int slect = input.nextInt();
        
//          while (slect ==1) {
//             System.out.print("Enter your name: ");
//            String name = input.next();
//            System.out.println("Enter your programe: ");
//            String programe = input.next();
//            System.out.print("Enter your year: ");
//            int year = input.nextInt();
          
//            int id = 100 + (int)(Math.random()*899); //generating new id
//            String studeintId = "UG"+id; // 
//            students.add(new Student(name , programe, year, studeintId)); //adding new student to object
           
//            System.out.println("add another student \n 1. add new student 2. exit");
//            slect = input.nextInt();
//          }
        
       
//           if(students.isEmpty()){ // checking if there is student in our obeject
//             System.out.println("No student available ...\n add another student \n---------------------------------- \n 1. add new student 2. exit");
//           }else{
//             Iterator<Student> iterator = students.iterator();
//             int number = 1;
//             while (iterator.hasNext()) { // looping student one by one
//               Student student = iterator.next();
             
//               System.out.println("----------------------------------\n student number ("+ number+")\nStudent Name is: "+ student.getName() + "\nProgramme :"+ student.getProgram() +"\nCurrent Year: "+ student.getCurrentYear() +"\nYour ID is : "+ student.getId()+"---------------------------------------------------------");
//               number++;
//             }
//            // System.out.println(students);
//            //  System.out.println(students.get(1));
            
//           }
        
//       }
         
// }
