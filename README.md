# SmartHomeApp

SmartHomeApp is a **terminal-based Java application** built using **Object-Oriented Programming (OOP)** principles. It simulates a basic smart home system where users can interact with and control virtual smart devices like Fans, Lights, TVs, and Air Conditioners.

---

## 📌 Features

- Add smart devices (Fan, Light, TV, AC) with names and room locations
- Turn devices ON or OFF via terminal
- Set AC temperature (16°C to 30°C)
- Display status of all connected devices
- Fully modular code using interfaces, abstraction, and inheritance

---

## 🧠 Technologies Used

- Java 8+
- OOP Concepts: Interface, Abstract Class, Polymorphism
- Terminal (Console) input/output

---

## 🚀 How to Run

1. **Compile** the Java files:
   ```bash
   javac smarthome/*.java SmartHomeApp.java

2.Run the application:
        java SmartHomeApp

##  Folder Structure

SmartHomeApp/
├── smarthome/
│   ├── Device.java
│   ├── AbstractDevice.java
│   ├── SmartFan.java
│   ├── SmartLight.java
│   ├── SmartTV.java
│   ├── SmartAC.java
│   └── SmartController.java
└── SmartHomeApp.java

