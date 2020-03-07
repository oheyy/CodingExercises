package com.daniel.codingexercises.challenges.RobotChallenge;

public class RobotChallenge {
    public RobotChallenge(){

    }
    public boolean judgeCircle(String moves) {
        int y = 0;
        int x = 0;
        for(int i=0; i<moves.length(); i++){
            switch (moves.charAt(i)){
                case 'U':
                    y += 1;
                    break;
                case 'D':
                    y -= 1;
                    break;
                case 'L':
                    x -= 1;
                    break;
                case 'R':
                    x += 1;
                    break;
                default:
                    break;
            }
        }
        if(x == 0 && y == 0){
            return true;
        }
        return false;
    }

}
