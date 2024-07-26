import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

class Num {
    int num = 0;
    boolean editable = true;

    int matrixToNum(int row, int col) {
        int temp = 0;
        for (int i = 0; i < row; i++) {
            temp += 9;
        }
        temp += col;
        return temp;
    }
}

class Initiate {
    int matrix[][] = new int[9][9];
    int count = 27;
    Num n1[] = new Num[81];
    Num n = new Num();
    int fcount = 0;
    boolean row = false, box = false, col = false;

    Initiate() {
        for (int i = 0; i < 81; i++) {
            n1[i] = new Num();
            n1[i].num = 0;
        }
    }

    boolean canInsert(int row, int col, int value) {
        int index = n.matrixToNum(row, col);
        boolean insRow = checkRow(index, value);
        boolean insCol = checkCol(index, value);
        boolean insBox = checkBox(index, value);
        if (insBox && insCol && insRow) {
            System.out.println("Can insert");
            return true;
        }
        else {
            System.out.println("Can't insert");
            return false;
        }
    }

    int checkinsertNum(int index, int value) {
        if (row && box && col) {
            return value;
        } else {
            row = checkRow(index, value);
            col = checkBox(index, value);
            box = checkBox(index, value);
            if (!(row && col && box)) {
                value = checkinsertNum(index, numgen(1, 9));
                return value;
            } else {
                return value;
            }
        }
    }

    void GenSudoku() {
        int rowN = 0;
        for (int i = 0; i < 9;) {
            if (rowN > 2) {
                rowN = 0;
                i++;
                continue;
            }
            int randomColumn = numgen(0, 8);
            int temp = n.matrixToNum(i, randomColumn);
            while (!n1[temp].editable) {
                randomColumn = numgen(0, 8);
                temp = n.matrixToNum(i, randomColumn);
            }

            int val = checkinsertNum(temp, numgen(1, 9));
            matrix[i][randomColumn] = val;
            n1[temp].num = val;
            rowN++;
        }
    }

    void display() {
        System.out.print(" n     ");
        for (int k = 0; k < 9; k++) {
            System.out.print(" " + k + " |");
        }
        System.out.println();
        System.out.println();
        System.out.println("-------------------------------------------");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (j == 0) {
                    System.out.print(i + "     | ");
                }
                System.out.print((matrix[i][j] == 0) ? "  | " : matrix[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------------------------------------");
        }
    }

    int numgen(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    boolean checkBox(int index, int value) {
        boolean result = true;
        switch (index) {
            case 0, 1, 2, 9, 10, 11, 18, 19, 20: {
                // box 1
                int rown = 0;
                for (int i = 0; i <= 20; i++) {
                    if (n1[i].num == value) {
                        result = false;
                        break;
                    }
                    if (rown == 2) {
                        i += 6;
                        rown = 0;
                        continue;
                    }
                    rown++;
                }
            }
            case 3, 4, 5, 12, 13, 14, 21, 22, 23: {
                // box 2
                int rown = 0;
                for (int i = 3; i <= 23; i++) {
                    if (n1[i].num == value) {
                        result = false;
                        break;
                    }
                    if (rown == 2) {
                        i += 6;
                        rown = 0;
                        continue;
                    }
                    rown++;
                }
            }
            case 6, 7, 8, 15, 16, 17, 24, 25, 26: {
                // box 3
                int rown = 0;
                for (int i = 6; i <= 26; i++) {
                    if (n1[i].num == value) {
                        result = false;
                        break;
                    }
                    if (rown == 2) {
                        i += 6;
                        rown = 0;
                        continue;
                    }
                    rown++;
                }
            }
            case 27, 28, 29, 36, 37, 38, 45, 46, 47: {
                // box 4
                int rown = 0;
                for (int i = 27; i <= 47; i++) {
                    if (n1[i].num == value) {
                        result = false;
                        break;
                    }
                    if (rown == 2) {
                        i += 6;
                        rown = 0;
                        continue;
                    }
                    rown++;
                }
            }
            case 30, 31, 32, 39, 40, 41, 48, 49, 50: {
                int rown = 0;
                for (int i = 30; i <= 50; i++) {
                    if (n1[i].num == value) {
                        result = false;
                        break;
                    }
                    if (rown == 2) {
                        i += 6;
                        rown = 0;
                        continue;
                    }
                    rown++;
                }
            }
            case 33, 34, 35, 42, 43, 44, 51, 52, 53: {
                int rown = 0;
                for (int i = 33; i <= 53; i++) {
                    if (n1[i].num == value) {
                        result = false;
                        break;
                    }
                    if (rown == 2) {
                        i += 6;
                        rown = 0;
                        continue;
                    }
                    rown++;
                }
            }
            case 54, 55, 56, 63, 64, 65, 72, 73, 74: {
                int rown = 0;
                for (int i = 54; i <= 74; i++) {
                    if (n1[i].num == value) {
                        result = false;
                        break;
                    }
                    if (rown == 2) {
                        i += 6;
                        rown = 0;
                        continue;
                    }
                    rown++;
                }
            }
            case 57, 58, 59, 66, 67, 68, 75, 76, 77: {
                int rown = 0;
                for (int i = 57; i <= 77; i++) {
                    if (n1[i].num == value) {
                        result = false;
                        break;
                    }
                    if (rown == 2) {
                        i += 6;
                        rown = 0;
                        continue;
                    }
                    rown++;
                }
            }
            case 60, 61, 62, 69, 70, 71, 78, 79, 80: {
                int rown = 0;
                for (int i = 60; i <= 80; i++) {
                    if (n1[i].num == value) {
                        result = false;
                        break;
                    }
                    if (rown == 2) {
                        i += 6;
                        rown = 0;
                        continue;
                    }
                    rown++;
                }
            }
        }
        return result;
    }

    boolean checkRow(int index, int value) {
        boolean result = true;
        if (index >= 0 && index <= 8) {
            for (int i = 0; i <= 8; i++) {
                if (n1[i].num == value) {
                    result = false;
                    return false;
                }
            }
        } else if (index >= 9 && index <= 17) {
            for (int i = 9; i <= 17; i++) {
                if (n1[i].num == value) {
                    result = false;
                    return false;
                }
            }
        } else if (index >= 18 && index <= 26) {
            for (int i = 18; i <= 26; i++) {
                if (n1[i].num == value) {
                    result = false;
                    return false;
                }
            }
        } else if (index >= 27 && index <= 35) {
            for (int i = 27; i <= 35; i++) {
                if (n1[i].num == value) {
                    result = false;
                    return false;
                }
            }
        } else if (index >= 36 && index <= 44) {
            for (int i = 36; i <= 44; i++) {
                if (n1[i].num == value) {
                    result = false;
                    return false;
                }
            }
        } else if (index >= 45 && index <= 53) {
            for (int i = 45; i <= 53; i++) {
                if (n1[i].num == value) {
                    result = false;
                    return false;
                }
            }
        } else if (index >= 54 && index <= 62) {
            for (int i = 54; i <= 62; i++) {
                if (n1[i].num == value) {
                    result = false;
                    return false;
                }
            }
        } else if (index >= 63 && index <= 71) {
            for (int i = 63; i <= 71; i++) {
                if (n1[i].num == value) {
                    result = false;
                    return false;
                }
            }
        } else if (index >= 72 && index <= 80) {
            for (int i = 72; i <= 80; i++) {
                if (n1[i].num == value) {
                    result = false;
                    return false;
                }
            }
        }
        return result;
    }

    boolean checkCol(int index, int value) {
        boolean result = true;
        switch (index) {
            case 0, 9, 18, 27, 36, 45, 54, 63, 72: {
                for (int i = 0; i <= 72;) {
                    if (n1[i].num == value) {
                        result = false;
                        return false;
                    }
                    i += 9;
                }
            }
                break;
            case 1, 10, 19, 28, 37, 46, 55, 64, 73: {
                for (int i = 1; i <= 73;) {
                    if (n1[i].num == value) {
                        result = false;
                        return false;
                    }
                    i += 9;
                }
            }
                break;
            case 2, 11, 20, 29, 38, 47, 56, 65, 74: {
                for (int i = 2; i <= 74;) {
                    if (n1[i].num == value) {
                        result = false;
                        return false;
                    }
                    i += 9;
                }
            }
                break;
            case 3, 12, 21, 30, 39, 48, 57, 66, 75: {
                for (int i = 3; i <= 75;) {
                    if (n1[i].num == value) {
                        result = false;
                        return false;
                    }
                    i += 9;
                }
            }
                break;
            case 4, 13, 22, 31, 40, 49, 58, 67, 76: {
                for (int i = 4; i <= 76;) {
                    if (n1[i].num == value) {
                        result = false;
                        return false;
                    }
                    i += 9;
                }
            }
                break;
            case 5, 14, 23, 32, 41, 50, 59, 68, 77: {
                for (int i = 5; i <= 77;) {
                    if (n1[i].num == value) {
                        result = false;
                        return false;
                    }
                    i += 9;
                }
            }
                break;
            case 6, 15, 24, 33, 42, 51, 60, 69, 78: {
                for (int i = 6; i <= 78;) {
                    if (n1[i].num == value) {
                        result = false;
                        return false;
                    }
                    i += 9;
                }
            }
                break;
            case 7, 16, 25, 34, 43, 52, 61, 70, 79: {
                for (int i = 7; i <= 79;) {
                    if (n1[i].num == value) {
                        result = false;
                        return false;
                    }
                    i += 9;
                }
            }
                break;
            case 8, 17, 26, 35, 44, 53, 62, 71, 80: {
                for (int i = 8; i <= 80;) {
                    if (n1[i].num == value) {
                        result = false;
                        return false;
                    }
                    i += 9;
                }
            }
                break;
        }
        return result;
    }
}

public class Sudoku {
    public static void main(String[] args) {
        Initiate i1 = new Initiate();
        i1.GenSudoku();
        i1.display();
    }
}
