/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Moshikaa Saravanan
 */
package NumberGuessingGameTask1 ;

import javax.swing.JOptionPane;


public class NumberGuessingGameFrame extends javax.swing.JFrame {

     private int randomNumber;
    private int attempts;
    private final int maxRounds = 3; // Maximum number of rounds
    private int currentRound = 0;
    private int score = 0; // Total score across rounds
private int pointsPerCorrectGuess = 10; // Points for a correct guess
// Tracks the current round

    /**
     * Creates new form NumberGuessingGameFrame
     */
    public NumberGuessingGameFrame() {
        initComponents();
        startNewRound(); // Start the game on initialization
    }
private void startNewRound() {
    if (currentRound == maxRounds) { // Game over after maxRounds
        JOptionPane.showMessageDialog(this, 
            "Game Over! You've completed all rounds.\nYour Final Score: " + score, 
            "Game Over", 
            JOptionPane.INFORMATION_MESSAGE);
        guessButton.setEnabled(false); // Disable the guess button
        resetButton.setEnabled(false); // Disable the reset button
        return;
    }

    randomNumber = (int) (Math.random() * 100) + 1; // Generate a new random number
    attempts = 10; // Reset attempts for the new round
    currentRound++; // Increment the round
    guesses.setLength(0); // Clear guesses from previous rounds

    // Update UI labels
    attemptLabel.setText("Attempts Left: " + attempts);
    roundLabel.setText("Rounds Left: " + (maxRounds - currentRound));
    userGuess.setText(""); // Clear the text field
}


    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        feedbackLabel = new javax.swing.JLabel();
        enterNumberLabel = new javax.swing.JLabel();
        userGuess = new javax.swing.JTextField();
        guessButton = new javax.swing.JButton();
        attemptLabel = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        roundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Number Guessing Game");

        feedbackLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        feedbackLabel.setText("Guess a number between 1 and 100!");

        enterNumberLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        enterNumberLabel.setText("Enter the number:");

        userGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userGuessActionPerformed(evt);
            }
        });

        guessButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        guessButton.setText("Submit Guess");
        guessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButtonActionPerformed(evt);
            }
        });

        attemptLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        attemptLabel.setText("Attempts Left: 10");

        scoreLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        scoreLabel.setText("Score: 0");

        resetButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        resetButton.setText("New Round");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        roundLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        roundLabel.setText("Rounds Left: 3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(resetButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(enterNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(attemptLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(roundLabel)
                                .addGap(39, 39, 39)
                                .addComponent(scoreLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(userGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(guessButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(feedbackLabel)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(feedbackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterNumberLabel)
                    .addComponent(userGuess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guessButton))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attemptLabel)
                    .addComponent(roundLabel)
                    .addComponent(scoreLabel))
                .addGap(23, 23, 23)
                .addComponent(resetButton)
                .addGap(42, 42, 42))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private final StringBuilder guesses = new StringBuilder();
    private void guessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButtonActionPerformed
 try {
    int guess = Integer.parseInt(userGuess.getText()); // Parse the user's guess
    attempts--; // Decrement attempts

    // Add the current guess to the guesses StringBuilder
    if (guesses.length() > 0) {
        guesses.append(", ");
    }
    guesses.append(guess);

    if (guess == randomNumber) { // Correct guess
        score += pointsPerCorrectGuess; // Add points for the correct guess
        JOptionPane.showMessageDialog(this, 
            "Correct! You guessed the number: " + randomNumber + 
            "!\nYour Score: " + score + 
            "\nAttempts Left: " + attempts + 
            "\nYour Guesses: " + guesses.toString(),
            "Round Complete", JOptionPane.INFORMATION_MESSAGE);

        guessButton.setEnabled(false); // Disable the guess button for this round
    } else if (attempts == 0) { // No attempts left
        JOptionPane.showMessageDialog(this, 
            "No attempts left! The number was " + randomNumber + 
            ".\nYour Guesses: " + guesses.toString() + 
            "\nAttempts Left: " + attempts, 
            "Round Over", JOptionPane.WARNING_MESSAGE);
        guessButton.setEnabled(false); // Disable the guess button for this round
    } else if (guess < randomNumber) { // Guess too low
        JOptionPane.showMessageDialog(this, 
            "Too Low! Try again.\nAttempts Left: " + attempts + 
            "\nYour Guesses: " + guesses.toString(), 
            "Hint", JOptionPane.INFORMATION_MESSAGE);
    } else { // Guess too high
        JOptionPane.showMessageDialog(this, 
            "Too High! Try again.\nAttempts Left: " + attempts + 
            "\nYour Guesses: " + guesses.toString(), 
            "Hint", JOptionPane.INFORMATION_MESSAGE);
    }

    // Update labels after each guess
    attemptLabel.setText("Attempts Left: " + attempts);
    scoreLabel.setText("Score: " + score);
} catch (NumberFormatException e) { // Handle invalid input
    JOptionPane.showMessageDialog(this, 
        "Please enter a valid number!", 
        "Invalid Input", 
        JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_guessButtonActionPerformed

    private void userGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userGuessActionPerformed

    guessButtonActionPerformed(evt);      

    }//GEN-LAST:event_userGuessActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
 startNewRound();
        guessButton.setEnabled(true);
  

    }//GEN-LAST:event_resetButtonActionPerformed

public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(NumberGuessingGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
        new NumberGuessingGameFrame().setVisible(true);
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attemptLabel;
    private javax.swing.JLabel enterNumberLabel;
    private javax.swing.JLabel feedbackLabel;
    private javax.swing.JButton guessButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel roundLabel;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JTextField userGuess;
    // End of variables declaration//GEN-END:variables

}
