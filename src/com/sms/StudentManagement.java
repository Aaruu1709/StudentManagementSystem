package com.sms;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();
		while (true) {
			System.out.println("************************** STUDENT MANAGEMENT SYSTEM *************************");
			System.out.println("1.Add Student");
			System.out.println("2.view Student");
			System.out.println("3.Search Student");
			System.out.println("4.Delete Student");
			System.out.println("5.Exit");

			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			// Add student
			case 1:
				System.out.println("Enter ID : ");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter Name: ");
				String name = sc.nextLine();

				System.out.println("Enter MArks: ");
				double marks = sc.nextDouble();

				Student s = new Student(id, name, marks);

				students.add(s);

				System.out.println("Student Added Successfully!");

				break;

			// for view student:
			case 2:
				if (students.isEmpty()) {
					System.out.println("no student found");
				} else {
					for (Student stu : students) {
						stu.display();
					}
				}
				break;

			// for search student
			case 3:
				System.out.println("Enter Student ID: ");
				int searchId = sc.nextInt();

				boolean found = false;
				for (Student stu : students) {
					if (stu.id == searchId) {
						stu.display();
						found = true;
						break;
					}

				}

				if (!found) {
					System.out.println("Student not found");
				}
				break;

			// for delete student
			case 4:
				System.out.print("Enter Student ID to Delete: ");
				int deleteId = sc.nextInt();

				boolean deleted = false;

				for (Student stu : students) {

					if (stu.id == deleteId) {

						students.remove(stu);

						deleted = true;

						System.out.println("Student Deleted!");

						break;
					}
				}

				if (!deleted) {
					System.out.println("Student Not Found!");
				}

				break;

			// EXIT
			case 5:

				System.out.println("Thank You!");

				System.exit(0);

			default:

				System.out.println("Invalid Choice!");

			}

		}
	}

}
