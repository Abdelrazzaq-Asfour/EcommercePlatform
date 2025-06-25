
# Ecommerce Platform (Java Design Patterns)

This project demonstrates the use of two core **Design Patterns** in Java:

1. **Singleton Design Pattern** – implemented in `AnalyticsModule.java`
2. **Observer Design Pattern** – implemented through `Observer.java`, `EcommercePlatform.java`, and `Client.java`

It also follows **SOLID principles** and **clean code** practices for better scalability and maintainability.

---

## ✅ Design Patterns

### 1. Singleton Pattern – `AnalyticsModule.java`

- **Purpose**: Ensure there is only one instance of the `AnalyticsModule` across the application.
- **Usage**:
  ```java
  AnalyticsModule analytics = AnalyticsModule.getInstance();
  analytics.analyze();
  ```
- **Benefit**: Centralized access to analytics logic without multiple instantiations.

---

### 2. Observer Pattern – `Observer.java`, `Client.java`, `EcommercePlatform.java`

- **Observer Interface (`Observer.java`)**: Allows implementing a standardized `update()` method.
- **Client Class (`Client.java`)**: Implements the Observer interface and responds to updates.
- **Subject (`EcommercePlatform.java`)**: Maintains a list of observers (clients) and notifies them of changes.

**Example Behavior**:
```java
platform.addObserver(new Client("Alice"));
platform.notifyObservers("New product launched!");
```

---

## 🔍 SOLID Principles Applied

| Principle | Application |
|----------|-------------|
| **S (Single Responsibility)** | Each class handles one concern (e.g., `Product` manages only product info). |
| **O (Open/Closed)** | The observer mechanism allows adding more clients without changing the core logic. |
| **L (Liskov Substitution)** | Clients follow a base interface (`Observer`) and can be substituted freely. |
| **I (Interface Segregation)** | Observer interface is lightweight and specific. |
| **D (Dependency Inversion)** | High-level module (`EcommercePlatform`) depends on the abstraction (`Observer`) not concrete clients. |

---

## 🛠 How to Run

1. Open your terminal in the folder.
2. Compile all Java files:
   ```bash
   javac *.java
   ```
3. Run the program:
   ```bash
   java Main
   ```

---

## 💡 Output Example

```
Analyzing data...
Client Alice received update: New product launched!
Client Bob received update: New product launched!
```

---

## 📁 File Descriptions

| File | Description |
|------|-------------|
| `AnalyticsModule.java` | Singleton class for analytics functionality |
| `Observer.java` | Interface for observers (clients) |
| `Client.java` | Concrete observer that listens to updates |
| `EcommercePlatform.java` | Subject class that holds and notifies observers |
| `Product.java` | Simple product class with name and price |
| `Main.java` | Entry point to demonstrate design pattern usage |

---

## 🎯 Goals

- Practice and apply software engineering principles.
- Implement reusable and testable OOP components.
- Build a base for more complex systems like ecommerce, notification services, etc.
