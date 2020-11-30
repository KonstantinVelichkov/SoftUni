import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = Integer.parseInt(scan.nextLine());
        String years = ("" + year);
        if (year < 10) {
            years = ("000" + year);
        } else if (year < 100) {
            years = ("00" + year);
        } else if (year < 1000) {
            years = ("0" + year);
        }

        String[] yearsString = years.split("");
        int[] yearsArr = new int[4];
        for (int i = 0; i < 4; i++) {
            yearsArr[i] = Integer.parseInt(yearsString[i]);
        }

        String ending = "th";
        String answer = "No result";
        if (yearsArr[0] == 0 && yearsArr[1] == 0 && yearsArr[2] == 0 && yearsArr[3] == 0) {  //0000=0st
            answer = "That's the beginning";
        } else if (yearsArr[0] == 0 && yearsArr[1] == 0) {                                          //0099 - st
            ending = "st";
            answer = ("" + 1 + ending);
        } else {
            for (int i = 0; i < 2; i++) {
                if (yearsArr[1] >= 1 && yearsArr[1] <= 9 && yearsArr[2] == 0 && yearsArr[3] == 0 && answer.equals("No result")) {       //11th and 12th
                    ending = "th";
                    if ((yearsArr[2] == 0 && yearsArr[3] == 0)) {
                        answer = ("" + yearsArr[i] + yearsArr[1] + ending);
                    } else if ((yearsArr[2] != 0 || yearsArr[3] != 0)) {
                        answer = ("" + yearsArr[i] + (yearsArr[1] + 1) + ending);
                    }
                    break;
                } else {
                    for (int j = 1; j <= 9; j++) {
                        if (yearsArr[i] == 0 && answer.equals("No result")) {
                            if (yearsArr[j] == 1 ) {
                                ending = "st";
                            } else if (yearsArr[j] == 2) {
                                ending = "nd";
                            } else if (yearsArr[j] == 3) {
                                ending = "rd";
                            }
                            if (yearsArr[1] > 3 && yearsArr[1] <= 9) {
                                ending = "th";
                                if (yearsArr[2] == 0 && yearsArr[3] == 0) {
                                    answer = ("" + yearsArr[j] + ending);
                                    break;
                                }
                                answer = ("" + (yearsArr[j] + 1) + ending);
                                break;
                            }
                        } else if (yearsArr[i] > 0 && answer.equals("No result")) {
                            if (yearsArr[1] == 0) {
                                ending = "th";
                                if (yearsArr[2] == 0 && yearsArr[3] == 0) {
                                    answer = ("" + yearsArr[0] + (yearsArr[1]) + ending);
                                    break;
                                } else if (yearsArr[2] != 0 || yearsArr[3] != 0) {
                                    ending = "st";
                                    answer = ("" + yearsArr[0] + (yearsArr[1] + 1) + ending);
                                    break;
                                }
                            } else {
                                if (yearsArr[1] == 1 && yearsArr[2] == 0 && yearsArr[3] == 0) {      //1nd                                 // 1st
                                    ending = "st";
                                    answer = ("" + (yearsArr[i] + "1") + ending);
                                    break;
                                } else if (yearsArr[1] == 2 && yearsArr[2] == 0 && yearsArr[3] == 0) {      //2nd                                 // 1st
                                    ending = "nd";
                                    answer = ("" + yearsArr[j] + "2" + ending);
                                    break;
                                } else if (yearsArr[1] == 3 && yearsArr[2] == 0 && yearsArr[3] == 0) {      //3rd                                 // 1st
                                    ending = "rd";
                                    answer = ("" + yearsArr[j] + "3" + ending);
                                    break;
                                }
                            }
                        }
                    }
                }

            }
        }
        System.out.println(answer);
    }
}

