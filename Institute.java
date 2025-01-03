package logical_sections.day6;

import java.util.Arrays;

public class Institute {

	private Student [] students;
	
	private int capacity;
	
	private int size =0;
	
	
	
	public Institute(int capacity) {
		
		this.capacity = capacity;
		students = new Student[capacity];
	}
	
	public void addStudent(Student obj) {
		
		if(size == capacity) {
			throw new IndexOutOfBoundsException(size+" of "+capacity+" the size of array is full");
		}else {
			students[size++] = obj;
			
		}
		
		
	}
	
	//1 2 3  4  5
    //0 1 2  3  4  5
	public void addStudentInSpecificIndex(int index,Student obj) {
		if(index<0 || index>capacity) {
			System.out.println("out of size");
		}
		else if(size == capacity) {
			System.out.println("no size in array");
		}else { 
			for(int i=size;i>index;i--) {
				students[i] = students[i-1];
			}
			students[index] = obj;
			size++;
		}
	}
	
	
	public Student getStudent(int index) {
		return students[index];
	}
	
	public void displayStudentDetails() {
		System.out.println(Arrays.toString(students));
	}
	
	//1 2 3 4 5 6
	
	public boolean removeStudent(int index) {
		if(index<0 || index>size) {
			throw new IndexOutOfBoundsException(index+" index is out of capacity "+capacity);
		}
		else {
			for(int i = index;i<size-1;i++) {
				Student temp = null;
				temp = students[i];
				students[i]  = students[i+1];
				students[i+1] = temp;
				
			}
			students[size-1] = null;
			size--;
			return true;
		}
		
		
		
	}
	 // 5. Remove all student by comparing given gender[remove(String gender)]
	//1 2  
	//0 1 2 
	public void remove(char gender) {
		
		if(gender != 'M' && gender != 'F') {
			System.out.println("Enter the current gender");
			return;
		}
		for(int i =0;i<size;i++) {
			Student obj = students[i];
			if(obj.getGender() == gender) {
				removeStudent(i);
				i--;
				
			}
		}
		
		
	}
	
	  // 6. Replace student[set(int index, Student newObj)]
	
	public void replaceSudent(int index,Student obj) {
		if(index <0 || index >size) {
			System.out.println("enter the currect index the size is : "+size);
			return;
		}
		students[index] = obj;
		
	}
	
	  // 7. find and return all the male students or female student based on gender[groupingBy(String gender)]
	
	public void returnStudentsGroup(char gender) {
		if(gender != 'M' && gender != 'F') {
			System.out.println("Enter the current gender");
			return;
		}
		for(int i =0;i<size;i++) {
			Student obj = students[i];
			if(obj.getGender() == gender) {
				System.out.println(getStudent(i));
				
			}
		}
	}
	
	 // 8. check the give student is present or not[contains(Student obj)]
	
	public boolean checkStudent(Student obj) {
		for(int i =0;i<size;i++) {
			Student obj1 = students[i];
			if(obj.equals(obj1)) {
				return true;
				
			}
		}
		return false;
	}
	// 9. clear all the student list [clear()]
	
	public void removeAll() {
		
		for(int i =0;i<size;i++) {
			removeStudent(i);
			i--;
		}
	}
	
}
