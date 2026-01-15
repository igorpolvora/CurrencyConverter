# Currency Converter

## 📌 Description

This project is a simple Java application that converts an amount in US dollars (USD) to Brazilian reais (BRL), applying a 6% IOF tax. The solution follows good software design practices by separating concerns between the application entry point and a utility class responsible for the conversion logic.

## 🎯 Objectives

* Practice Java fundamentals
* Apply methods and static utility classes
* Separate business logic from input/output handling
* Work with numeric calculations and formatted output

## 🧠 Concepts Applied

* Java methods and static members
* Utility class design (`util` package)
* Input handling with `Scanner`
* Locale configuration for numeric formatting
* Clean separation of responsibilities

## 🏗️ Project Structure

```
project-root
├── application
│   └── Program.java
└── util
    └── CurrencyConverter.java
```

## ⚙️ How It Works

1. The program asks for the current dollar price.
2. It asks how many dollars will be bought.
3. The application converts the amount to reais.
4. A 6% IOF tax is applied.
5. The final amount is displayed with two decimal places.

## 🧮 Conversion Formula

```
baseValue = dollarPrice * amountBought
iof = baseValue * 0.06
total = baseValue + iof
```

## ▶️ Example

**Input:**

```
What is the dollar price? 5.20
How many dollars will be bought? 100.00
```

**Output:**

```
Amount to be paid in reais = 551.20
```

## 🚀 Technologies Used

* Java (JDK 8+)
* Standard Java Libraries

## 📚 Notes

* The `CurrencyConverter` class is a utility class and does not require object instantiation.
* All conversion logic is encapsulated in a static method to ensure reusability and clarity.

## 🧑‍💻 Author

Developed as a learning exercise to reinforce Java programming and object-oriented design principles.
