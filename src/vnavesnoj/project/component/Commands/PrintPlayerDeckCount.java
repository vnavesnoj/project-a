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

package vnavesnoj.project.component.Commands;

import vnavesnoj.project.component.Deck;
import vnavesnoj.project.component.Player;

/**
 * @author vnavesnoj
 * @link vnavesnoj@gmail.com
 */
public final class PrintPlayerDeckCount implements CommandExecutor, InfoCommand {

    @Override
    public boolean tryToExecuteCommand(final Player player1, final Player player2) {
        Deck[] decks = new Deck[]{player1.getDeck(), player2.getDeck()};
        for (int i = 0; i < decks.length; i++) {
            System.out.println("-----------------------------------");
            System.out.println("Player " + i + " deck count:");
            System.out.println(decks[i].getDeckCount());
            System.out.println("------------------------------------");
        }
        return true;
    }

    @Override
    public String getExecuteCommand() {
        return "deck";
    }
}
