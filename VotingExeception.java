// User-defined exception class
class UnderageForVotingException extends Exception {
    public UnderageForVotingException(String message) {
        super(message);
    }
}

// Voter class that may throw the custom exception
class Voter {
    private int age;

    public Voter(int age) {
        this.age = age;
    }

    public void vote() throws UnderageForVotingException {
        if (age < 18) {
            throw new UnderageForVotingException("Voter is underage. Minimum age for voting is 18.");
        } else {
            System.out.println("Voter is eligible to vote.");
            // Logic for voting can be added here
        }
    }
}

public class VotingExeception {
    public static void main(String[] args) {
        try {
            // Creating a voter with age below 18 (will throw an exception)
            Voter underageVoter = new Voter(16);
            underageVoter.vote(); // This line will throw UnderageForVotingException

            // Creating a voter with age 18 (eligible to vote)
            Voter eligibleVoter = new Voter(18);
            eligibleVoter.vote(); // This will execute successfully

        } catch (UnderageForVotingException e) {
            System.out.println("Exception: " + e.getMessage());
            // Handle the exception or take appropriate action
        }
    }
}
