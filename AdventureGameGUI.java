import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class AdventureLocation {
    private String description;
    private List<Integer> nextLocations;

    public AdventureLocation(String description) {
        this.description = description;
        this.nextLocations = new ArrayList<>();
    }

    public String getDescription() {
        return description;
    }

    public List<Integer> getNextLocations() {
        return nextLocations;
    }

    public void addNextLocation(int nextLocation) {
        nextLocations.add(nextLocation);
    }
}

public class AdventureGameGUI {
    private JFrame frame;
    private JTextArea outputTextArea;
    private JTextField inputTextField;
    private JButton submitButton;

    private List<AdventureLocation> locations;
    private int currentLocationIndex;

    public AdventureGameGUI() {
        initialize();
        createLocations();
        showLocation(currentLocationIndex);
    }

    private void initialize() {
        frame = new JFrame("Text-Based Adventure Game");
        frame.setBounds(100, 100, 500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        outputTextArea = new JTextArea();
        outputTextArea.setEditable(false);
        outputTextArea.setBounds(10, 10, 464, 180);
        frame.getContentPane().add(outputTextArea);

        inputTextField = new JTextField();
        inputTextField.setBounds(10, 200, 360, 25);
        frame.getContentPane().add(inputTextField);

        submitButton = new JButton("Submit");
        submitButton.setBounds(380, 200, 94, 25);
        frame.getContentPane().add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                processInput();
            }
        });
    }

    private void createLocations() {
        locations = new ArrayList<>();

        // Create locations and define connections
        AdventureLocation location1 = new AdventureLocation("You find yourself in a mysterious place...");
        AdventureLocation location2 = new AdventureLocation("You follow the left path and discover a hidden cave.");
        AdventureLocation location3 = new AdventureLocation("Inside the cave, you find a treasure chest.");
        AdventureLocation location4 = new AdventureLocation("You take the right path and encounter a friendly creature.");
        AdventureLocation location5 = new AdventureLocation("The creature offers to guide you to the next location.");

        location1.addNextLocation(2);  // Left path
        location1.addNextLocation(4);  // Right path

        location2.addNextLocation(3);  // Inside the cave
        location4.addNextLocation(5);  // Creature guides you

        locations.add(location1);
        locations.add(location2);
        locations.add(location3);
        locations.add(location4);
        locations.add(location5);

        currentLocationIndex = 0;
    }

    private void showLocation(int locationIndex) {
        outputTextArea.setText(locations.get(locationIndex).getDescription());
        inputTextField.setText("");
    }

    private void processInput() {
        String userInput = inputTextField.getText().trim().toLowerCase();

        if (userInput.equals("1") && locations.get(currentLocationIndex).getNextLocations().contains(2)) {
            currentLocationIndex = 1;
            showLocation(currentLocationIndex);
        } else if (userInput.equals("2") && locations.get(currentLocationIndex).getNextLocations().contains(4)) {
            currentLocationIndex = 3;
            showLocation(currentLocationIndex);
        } else {
            outputTextArea.append("\nInvalid choice. Please try again.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdventureGameGUI window = new AdventureGameGUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

