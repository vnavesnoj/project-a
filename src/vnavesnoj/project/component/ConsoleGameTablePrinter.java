/*
 * Copyright (c) 2022. vnavesnoj <vnavesnoj@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package vnavesnoj.project.component;

/**
 * @author vnavesnoj
 * @link vnavesnoj@gmail.com
 */
public class ConsoleGameTablePrinter {

    private final GameTable gameTable;

    public ConsoleGameTablePrinter(final GameTable gameTable) {
        this.gameTable = gameTable;
    }

    public void printPlayerStats() {
        PlayerStats[] playerStats = gameTable.getPlayerStats();
        for (int i = 0; i < playerStats.length; i++) {
            System.out.println("-----------------------------------");
            System.out.println("Player " + i + " stats:");
            System.out.println(playerStats[i].getPlayerClass());
            System.out.println("Health: " + playerStats[i].getHealth());
            System.out.println("Min damage: " + playerStats[i].getMinDamage());
            System.out.println("Max damage: " + playerStats[i].getMaxDamage());
            System.out.println("-----------------------------------");
        }
    }

    public void printPlayerFields() {
        Field[] fields = gameTable.getFields();
        for (int i = 0; i < fields.length; i++) {
            int[] playerField = fields[i].getCurrentFieldMassive();
            System.out.println("-----------------------------------");
            System.out.println("Player " + i + " field:");
            for (int k = 0; k < playerField.length; k++) {
                System.out.print(playerField[i] + "\t");
            }
            System.out.println();
            System.out.println("-----------------------------------");
        }
    }

    public void printPlayerDeckCount() {
        Deck[] decks = gameTable.getDecks();
        for (int i = 0; i < decks.length; i++) {
            System.out.println("-----------------------------------");
            System.out.println("Player " + i + " deck count:");
            System.out.println(decks[i].getDeckCount());
            System.out.println("------------------------------------");
        }
    }

    public void printActionCommands() {
        System.out.println("Possible action commands: take, damage, reset, pass");
    }

    public void printInfoCommands() {
        System.out.println("Possible action commands: stats, fields, decks");
    }
}
