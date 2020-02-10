public class Question8 {

    public int monopolyRoll()(
        int dice1 = diceRoll();
        int dice2 = diceRoll();
        int totalSum = dice1 + dice2;

        if (dice1 == dice2){
            int dice3 = diceRoll();
            int dice4 = diceRoll():
            totalSum = totalSum + dice3 + dice4;
        }
        return totalSum;
    )

    public int diceRoll(){
        double doubleNumber = Math.random()*6;
        doubleNumber = doubleNumber + 1;
        return (int)doubleNumber;
    }  
}