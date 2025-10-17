![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![TestNG](https://img.shields.io/badge/testng-%23F2A400.svg?style=for-the-badge&logo=testng&logoColor=white)

---

**Given sequence:**  
`[((())()(())]]`

| **Question** | **Answer** |
|---------------|------------|
| Can this sequence be considered correct? | **No** |
| If the answer to the previous question is “no”, then what needs to be changed in it to make it correct?  | Replace the 12. index `]` with `)` to form: `[((())()(()))]` |

---

**How to run**

```bash
# Navigate to the source/main/java folder, from project root
cd src/main/java

# Compile
javac Task.java

# Run
java Task
```

---

**Description**

	1.	Prints “Hello” if the entered number is greater than 7.
	2.	Prints “Hello, John” if the entered name is John (case-insensitive).
	3.	Displays all elements of an input array that are multiples of 3.

--- 

**Test Cases**

Implemented basic TestNG tests under src/test covering all logic methods with mock input data instead of Scanner.

**How to run tests**

```bash
# From project root
mvn test
```
