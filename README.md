# 🖱️ Mouse Event Listener Application  

**A fun and interactive Java Swing application that responds to mouse events with expressive icons!**

## 🌟 Features  

- **Interactive Icon Changes**: Watch the icon change based on mouse actions:
  - 👆 **Click**: Sets a "sad" mood.  
  - 🤲 **Press**: Displays a "heart/love" icon.  
  - 🖐️ **Release**: Returns to "surprise" mode.  
  - 🚪 **Enter**: Switches to a "scared" icon.  
  - 🚶 **Exit**: Shows an "annoyed" reaction.  

- **User-Friendly GUI**: Built using Java Swing for a clean and responsive interface.

- **Dynamic Event Logging**: Each action is logged in the console for debugging and learning purposes.

## 🚀 Getting Started  

### Prerequisites  

1. **Java JDK 8+** installed on your system.
2. A Java IDE (like IntelliJ IDEA, Eclipse, or NetBeans) or a text editor with a terminal (e.g., VS Code).

---

**Complile and Run**
javac MouseEvent/MouseEventListerner.java
java MouseEvent.MouseEventListerner

🖼️ Icon Behavior
Here’s a breakdown of what each mouse event does:

- Mouse Clicked	---> Displays a sad icon--->😢 "sad".
- Mouse Pressed --->	Shows a love icon	--->❤️ "heart".
- Mouse Released --->Reverts to surprise	--->😮 "surprise".
- Mouse Entered	--->Switches to scared --->😱 "scared".
- Mouse Exited --->Displays annoyed icon --->😒 "annoyed".

## ✨ Customization
- Change Icons:
    - Replace the .png files in the assets/ folder with your custom icons to give the app a unique flair.

- Modify Event Actions:
     - Update the mouseClicked, mousePressed, etc., methods to add new behaviors or logging.

## 🛠️ Built With
- Java Swing: For the graphical user interface.
- AWT Events: To handle mouse interactions.

## Application view

https://github.com/user-attachments/assets/d0643cc7-a266-42ee-9634-0057d229af6a


