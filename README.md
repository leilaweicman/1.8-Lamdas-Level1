# 1.8.Lambas-Level1

## 📄 Description – Exercise Statement

This project contains the solution to the following Java exercises:

### Exercise 1
From a list of Strings, create a method that returns a list of all strings that contain the letter `'o'`. Print the result.

✅ Implemented with:
- `stream()`
- `filter()`
- `toList()`

---

### Exercise 2
Extend Exercise 1: the method must now return only the strings that **contain `'o'`** and have **more than 5 characters**. Print the result.

✅ Implemented with:
- Multiple `filter()` calls in the stream pipeline.

---

### Exercise 3
Create a list with the names of the months of the year. Print all the elements of the list with a lambda.

✅ Implemented with:
- `forEach(month -> System.out.println(month))`

---

### Exercise 4
Repeat Exercise 3, but using a **method reference**.

✅ Implemented with:
- `forEach(System.out::println)`

---

### Exercise 5
Create a **Functional Interface** with a method `getPiValue()` that returns a `double`.  
In the `main()`, instantiate the interface with a lambda returning `3.1415`. Invoke `getPiValue()` and print the result.

✅ Demonstrates:
- Defining a functional interface with `@FunctionalInterface`.
- Assigning a lambda to an interface.

---

### Exercise 6
Create a list containing numbers and strings. Sort the list by the **length of the string representation** (shortest to longest).

✅ Implemented with:
- `stream().sorted(Comparator.comparingInt(o -> o.toString().length()))`

---

### Exercise 7
Using the same list as in Exercise 6, sort it in reverse order (**longest to shortest**).

✅ Implemented with:
- `reversed()` on the comparator.

---

### Exercise 8
Create a Functional Interface with a method `reverse()` that receives and returns a `String`.  
In the `main()`, inject a lambda that reverses the input string. Invoke the method and print the result.

✅ Implemented with:
- `@FunctionalInterface`
- Lambda using `StringBuilder.reverse()`.

---

## 💻 Technologies Used
- Java 17  
- IntelliJ IDEA  
- Git & GitHub

---

## 📋 Requirements
- JDK 17 or higher installed  
- IntelliJ IDEA (or any Java-compatible IDE)  
- Git

---

## 🛠️ Installation
Clone the repository and access the project folder:

```sh
git clone https://github.com/leilaweicman/1.8.Lambas-Level1.git
cd 1.8.Lambas-Level1
```

---

## ▶️ Execution

Each exercise has its own `main()` method.
To run an exercise, for example **Exercise 1**, execute:

```sh
javac src/exercise1/Main.java
java -cp src exercise1.Main
```

Replace `exerciseX` with the corresponding folder and class.

---

## 🌐 Deployment
Not applicable (local practice project).


---

## 🤝 Contributions

1. Fork this repository.
2. Create a new branch:
```sh
git checkout -b feature/NewFeature
```
3. Commit your changes:
```sh
git commit -m "Add NewFeature"
```
4. Commit your changes:
```sh
git push origin feature/NewFeature
```
5. Open a Pull Request.
