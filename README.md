# Java Two-Way Chat Application

A simple two-way chat application using **Java Sockets** that allows a client and server to communicate in real time.

## Features
✅ **Bi-directional communication** (both client and server can send messages)  
✅ **Multi-threaded** implementation for simultaneous sending and receiving  
✅ **Simple and lightweight** console-based chat system  
✅ **Easy to run** in IntelliJ IDEA or any Java environment  
✅ **Handles multiple messages and responses properly**  

## Prerequisites
- **Java 8+** installed
- **IntelliJ IDEA** (or any Java IDE)
- **Basic knowledge of Java networking**

## Installation & Setup

### 1️⃣ Clone the Repository
```sh
git clone https://github.com/your-username/Java-Chat-App.git
cd Java-Chat-App
```

### 2️⃣ Open in IntelliJ IDEA
- Open the project in IntelliJ IDEA.
- Ensure Java is installed and configured.

### 3️⃣ Run the Application
#### **Run Server**
1. Open `Server.java`.
2. Click **Run ▶**.

#### **Run Client**
1. Open `Client.java`.
2. Click **Run ▶**.

You can now chat between the client and server! 🎉

## How It Works
- The **Server** starts and waits for a client to connect.
- The **Client** connects to the server.
- Both can send and receive messages simultaneously using **multi-threading**.
- Messages from both sides are displayed properly without confusion.

## Example Usage
```
Server is running on port 5000
Client connected!

Client: Hello
Server: Server received: Hello
Client: Wht
Server: Server received: Wht
```

## Future Improvements
🔹 Add **GUI (Graphical User Interface)** for better user experience  
🔹 Support **multiple clients** using threading  
🔹 Encrypt messages for **secure communication**  
🔹 Improve message formatting for better readability  

## License
This project is open-source and available under the **MIT License**.

---

💡 *Feel free to contribute and enhance this project!* 🚀

