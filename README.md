# PALINDROME-CHECKER-app

---

# 📌 PalindroneCheckerApp

## 🎯 Objective

The objective of this project is to create a Java application that checks whether a given string is a palindrome or not using Git and GitHub version control workflow in IntelliJ IDEA.

---

# 🛠 Project Procedure

## Step 1: Open Documents

* Open **Documents** folder in your system.

## Step 2: Create New Folder

* Create a new folder.
* Folder name should be **YourFullRollNo**.

---

## Step 3: Create GitHub Repository

* Go to GitHub.
* Create a new repository.
* Repository Name: **PalindroneCheckerApp**
* Enable **README.md** file (Mandatory).
* Copy the repository link.

---

## Step 4: Clone Repository

* Go to your created folder location.
* Click on Address Bar → Press **Ctrl + A**
* Type: `cmd` → Press Enter.
* In Command Prompt type:

```
git clone repository_link
```

---

## Step 5: Open Project in IntelliJ

* Open IntelliJ IDEA.
* Click on **File → Close Project**.

---

## Step 6: Open Cloned Project

* Click **Open**.
* Select your cloned project folder (**PalindroneCheckerApp**).
* Click **Select Folder**.

---

## Step 7: Create New Module

* Right-click on Project Folder.
* Select **New → Module**.
* Module Name: **App**

If `Main.java` exists:

* Rename it to **PalindromeCheckerApp**

OR

* Inside `src` folder → Create New Java Class.
* Class Name: **PalindromeCheckerApp**

Click **Cancel** if any SDK popup appears (if already configured).

---

## Step 8: Check Git Status

Open terminal inside IntelliJ and type:

```
git status
```

This shows:

* Current branch
* Untracked files

---

## Step 9: Create New Branch

Create branch using:

```
git checkout -b your_branch_name
```

To verify branch:

```
git branch
```

---

## Step 10: Write Use Case Logic

### Sample Java Code:

```java
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        if(input.equalsIgnoreCase(reversed)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is Not a Palindrome");
        }

        sc.close();
    }
}
```

---

## Step 11: Add Files to Staging

```
git add .
git status
```

---

## Step 12: Unstage and Add Specific File

```
git restore --staged .
git status
```

Now add only required file:

```
git add App/src/PalindromeCheckerApp.java
```

---

## Step 13: Update README.md

* Open `README.md`
* Click **Editor** and **Preview**
* Add:

    * Project Objective
    * Procedure
    * Flow
    * Use Case
    * Git Commands Used

---

# 🔄 Project Flow

1. Created GitHub Repository.
2. Cloned repository locally.
3. Opened project in IntelliJ.
4. Created module and Java class.
5. Implemented palindrome logic.
6. Created new branch.
7. Added and staged specific file.
8. Updated README documentation.

---

# 📚 Use Case

User enters a string →
Program reverses string →
Compares original and reversed →
Displays whether it is a Palindrome or Not.

---


