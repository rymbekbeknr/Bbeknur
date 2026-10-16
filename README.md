# Assignment 4: Facade Pattern (Home Theater)
**Author:** Rymbek Beknur, SE-2505
**Course:** ShP-2216 – Software Design Patterns

## Description
This project demonstrates the implementation of the **Facade** structural design pattern in Java. It models a Home Theater system (Option B), where a complex subsystem of various devices (Amplifier, DvdPlayer, Projector, Lights) is hidden behind a single `HomeTheaterFacade` class.

## Structure
- `subsystem/`: Contains the complex subsystem classes, which are completely unaware of the facade[cite: 3].
- `facade/`: Contains the `HomeTheaterFacade`, exposing a simple API (`watchMovie()` and `endMovie()`)[cite: 3].
- `Main.java`: The Client that interacts exclusively with the Facade[cite: 3].

## Clean Code Principles Applied
1. **Meaningful Names:** Methods like `watchMovie()` clearly describe the action without exposing underlying complexities[cite: 3].
2. **Single Responsibility:** The Facade handles coordination; subsystem classes handle their specific hardware logic[cite: 3].
3. **Encapsulation (No Leaking):** The Client never sees or instantiates subsystem objects[cite: 3].
4. **Small, Focused Classes:** Each subsystem class (e.g., `Lights`) has exactly one reason to change[cite: 3].
5. **Proper Error Handling:** State validation is implemented (e.g., `DvdPlayer` throws an exception if played while OFF)[cite: 3].