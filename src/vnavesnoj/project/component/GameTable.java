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
public class GameTable {

    private final Field[] fields;

    private final PlayerStats[] playerStats;

    private final Deck[] decks;

    public GameTable(final Player[] players) {
        final int numberOfPlayers = players.length;
        fields = new Field[numberOfPlayers];
        playerStats = new PlayerStats[numberOfPlayers];
        decks = new Deck[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            fields[i] = players[i].getField();
            playerStats[i] = players[i].getPlayerStats();
            decks[i] = players[i].getDeck();
        }
    }
}
