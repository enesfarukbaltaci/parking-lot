# Parking Lot Management System

A simple Java-based console application to manage a parking lot. This project demonstrates key programming concepts like classes, arrays, matrices, user input, and control flow in Java.
 
---

## **Features**
- **Park a Car**: Add a car to the parking lot by entering its registration number and owner’s name.
- **Retrieve a Car**: Remove a car from the parking lot using its registration number.
- **View Parking Lot Status**: Display the current state of the parking lot, including parked cars and available slots.
- **Interactive Menu**: A user-friendly menu allows you to perform operations continuously until you decide to exit.

---

## **Technical Highlights**
1. **Classes and Interaction**:
    - `Car`: Represents a car with its registration number and owner’s name.
    - `ParkingLot`: Manages the parking lot using a 2D array and handles operations like parking and retrieving cars.

2. **Two-Dimensional Array**:
    - The parking lot is represented as a 2D array, with rows as levels and columns as slots on each level.

3. **Control Flow**:
    - A `do-while` loop ensures the menu is shown repeatedly until the user decides to exit.
    - The `askToContinue` method validates user input for continuation.

4. **Validation**:
    - Ensures user inputs are correct, including handling invalid menu choices and requiring valid responses for continuation prompts.

5. **Constants**:
    - Constants like the number of levels and slots per level (`final int LEVELS` and `final int SLOTS_PER_LEVEL`) make the program easily configurable.

---

### Steps to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/enesfarukbaltaci/parking-lot.git