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
import vnavesnoj.project.component.Field;
import vnavesnoj.project.component.Player;

/**
 * @author vnavesnoj
 * @link vnavesnoj@gmail.com
 */
public final class TakeCardCommandExecutor implements CommandExecutor, MoveCommand {

    @Override
    public boolean tryToExecuteCommand(final Player hero, final Player opponent) {
        final Deck currentDeck = hero.getDeck();
        if (!currentDeck.isEmpty()) {
            final Field currentField = hero.getField();
            if (currentField.getFieldCount() < currentField.getMaxPossibleSizeOfFieldMassive()) {
                final int[] currentFieldMassive = currentField.getCurrentFieldMassive();
                final int[] currentDeckMassive = currentDeck.getDeckMassive();

                final int indexTopDeck = currentDeck.getDeckCount();
                final int topDeck = currentDeckMassive[indexTopDeck];

                currentFieldMassive[currentField.getFieldCount()] = topDeck;

                hero.getField().increaseFieldCountBy(1);
                hero.getDeck().decreaseDeckCountBy(1);
                return true;
            } else {
                System.err.println("Your field if full. Try to deal damage, pass or reset your field");
            }
        } else {
            System.err.println("Your deck is empty");
        }
        return false;
    }

    @Override
    public String getExecuteCommand() {
        return "take";
    }
}
