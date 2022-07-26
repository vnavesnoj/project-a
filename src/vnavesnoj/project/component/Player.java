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
public class Player {

    private final Deck deck;

    private final PlayerStats playerStats;

    private final Field field;

    public Player(final PlayerClass playerClass, final Deck deck, int fieldSize) {
        this.playerStats = new PlayerStats(playerClass);
        this.deck = deck;
        this.field = new Field(fieldSize);
    }

    public Field getField() {
        return field;
    }

    public Deck getDeck() {
        return deck;
    }

    public PlayerStats getPlayerStats() {
        return playerStats;
    }
}
