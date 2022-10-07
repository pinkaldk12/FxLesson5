
//Copy & Paste


// import java.util.ArrayList;

// class Lesson5 {
// 	public static void main(String[] args) {
		
// 		ArrayList<String> cars = new ArrayList<String>();

// 		cars.add("Volvo");
// 		cars.add("DMW");
// 		cars.add("Ford");
// 		cars.add("Mazda");
// 		System.out.println(cars);
// 	}
// }


// import java.util.ArrayList;

// class Lesson5 {
// 	public static void main(String[] args) {
		
// 		ArrayList<String> cars = new ArrayList<String>();

// 		cars.add("Volvo");
// 		cars.add("DMW");
// 		cars.add("Ford");
// 		cars.add("Mazda");
// 		for (int i = 0; i < cars.size(); i++ ) {
// 			System.out.println(cars.get(i));
// 		}
// 	}
// }



// Problem 1


// import java.util.ArrayList;

// class Lesson5 {
// 	public static void main(String[] args) {
		
// 		ArrayList<String> colors = new ArrayList<String>();

// 		colors.add("Blue");
// 		colors.add("Red");
// 		colors.add("Purple");
// 		colors.add("White");
// 		for (int i = 0; i < colors.size(); i++ ) {
// 			System.out.println(colors.get(i));
// 		}
// 	}
// }


//Problem 2

// import java.util.ArrayList;

// class Lesson5 {
// 	public static void main(String[] args) {
// 		 ArrayList<String> names = new ArrayList<String>();
         
//         names.add("Java");
//         names.add("Kotlin");
//         names.add("Android");
         
//         names.add(2,"Python");
         
//         names.forEach(name -> {
//             System.out.println(name);
//         });
// 	}
// }


// Problem 3

// import java.util.ArrayList;

// class Lesson5 {
// 	public static void main(String[] args) {
// 		ArrayList<String> names = new ArrayList<String>();
         
//         names.add("Java");
//         names.add("Kotlin");
//         names.add("Android");

        
//         System.out.println("the car is gotten:"+names.get(0) );
         
//         names.forEach(name -> {
//             System.out.println(name);
//         });
// 	}
// }

// Problem 4

// import java.util.ArrayList;

// class Lesson5 {
// 	public static void main(String[] args) {
// 		ArrayList<String> names = new ArrayList<String>();
         
//         names.add("Java");
//         names.add("Kotlin");
//         names.add("Android");

//         names.set(1, "Ruby");
         
//         names.forEach(name -> {
//             System.out.println(name);
//         });
// 	}
// }

// Problem 5

// import java.util.ArrayList;

// class Lesson5 {
// 	public static void main(String[] args) {
// 		ArrayList<String> names = new ArrayList<String>();
         
//         names.add("Java");
//         names.add("Kotlin");
//         names.add("Android");

//         names.remove(2);
         
//         names.forEach(name -> {
//             System.out.println(name);
//         });
// 	}
// }

// Problem 6

// import java.util.ArrayList;

// class Lesson5 {
// 	public static void main(String[] args) {
// 		ArrayList<String> names = new ArrayList<String>();
         
//         names.add("Java");
//         names.add("Kotlin");
//         names.add("Android");
//         names.add("Ruby");
//         names.add("Django");
//         names.add("Spring Boot");

//         if (names.contains("Django")) {
//     		System.out.println("found the element");
//     	} 
//     	else {
//     		System.out.println("no such element");
//     	}
// 	}
// }

// Problem 7

// import java.util.ArrayList;
// import java.util.Collections;

// class Lesson5 {
// 	public static void main(String[] args) {

// 		ArrayList<String> names = new ArrayList<String>();
         
//         names.add("Java");
//         names.add("Kotlin");
//         names.add("Android");

        
//         ArrayList<String> cars = new ArrayList<String>();
         
//         cars.add("Ford");
//         cars.add("Mazda");
//         cars.add("Ferrari");
       
//        	Collections.copy(names, cars);

//        	System.out.println(names);
//        	System.out.println(cars);
// 	}
// }

//


//Problem 8


// import java.util.ArrayList;
// import java.util.Collections;

// class Lesson5 {
// 	public static void main(String[] args) {

// 		ArrayList<String> names = new ArrayList<String>();
         
//         names.add("Java");
//         names.add("Kotlin");
//         names.add("Android");
//         names.add("Django");
//         names.add("Ruby");
//         names.add("C++");

//         System.out.println("Before shuffle - "+names);
       
//       	Collections.shuffle(names);

//        	System.out.println("After shuffle - "+names);
// 	}
// }

// Problem 9

// import java.util.ArrayList;
// import java.util.Collections;

// class Lesson5 {
// 	public static void main(String[] args) {

// 		ArrayList<String> names = new ArrayList<String>();
         
//         names.add("Java");
//         names.add("Kotlin");
//         names.add("Android");
//         names.add("Django");
//         names.add("Ruby");
//         names.add("C++");

//         System.out.println("Before reverse - "+names);
       
//       	Collections.reverse(names);

//        	System.out.println("After reverse - "+names);
// 	}
// }



// Bonus Problems

//Problem 1

// import java.util.*;

// class Lesson5{
// 	public static void main(String[] args) {
// 		List<String> names = new ArrayList<String>();

// 		names.add("Java");
//       	names.add("Kotlin");
//         names.add("Android");
//         names.add("Django");
//         names.add("Python");
//         names.add("Ruby");

//         System.out.println("Original list: " + names);
//   		List<String> sub_List = names.subList(0, 3);
//   		System.out.println("List of first three elements: " + sub_List);
// 	}
// }


// Problem 2

// import java.util.*;

// class Lesson5{
// 	public static void main(String[] args) {
		// ArrayList<String> names = new ArrayList<String>();

		// names.add("Java");
  //     	names.add("Kotlin");
  //       names.add("Android");
  //       names.add("Django");
  //       names.add("Python");
  //       names.add("Ruby");

//         ArrayList<String> cars = new ArrayList<String>();

// 		cars.add("Mazda");
//       	cars.add("Ferrari");
//         cars.add("Ford");
//         cars.add("Audi");
//         cars.add("Toyota");


//         if (names.equals(cars) == true) {
//             System.out.println(" Array List are equal");
//         }
//         else{
//             System.out.println(" Array List are not equal");
//         }
        
// 	}
// }


// problem 3

// import java.util.*;

// class Lesson5{
// 	public static void main(String[] args) {

// 		ArrayList<String> names = new ArrayList<String>();

// 		names.add("Java");
//       	names.add("Kotlin");
//         names.add("Android");
//         names.add("Django");
//         names.add("Python");
//         names.add("Ruby");


//         System.out.println("Array list before Swap:" + names);

          
         
//         Collections.swap(names, 0, 2);
//         System.out.println("Array list after swap:" + names);
        
// 	}
// }


// Problem 4

import java.util.*;

class Lesson5{
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Java");
      	names.add("Kotlin");
        names.add("Android");
        names.add("Django");
        names.add("Python");
        names.add("Ruby");

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("Pink");

        ArrayList<String> a = new ArrayList<String>();
        a.addAll(names);
        a.addAll(colors);
        System.out.println("New array: " + a);
        
	}
}