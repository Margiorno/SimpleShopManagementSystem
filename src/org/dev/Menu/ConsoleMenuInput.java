package org.dev.Menu;

import java.util.Scanner;

interface MenuInput {
    int getUserInput();
}

public class ConsoleMenuInput implements MenuInput {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public int getUserInput() {
        System.out.print("Pick your option: ");
        return scanner.nextInt();
    }
}
