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

import java.util.Arrays;

/**
 * @author vnavesnoj
 * @link vnavesnoj@gmail.com
 */
public class Move {

    public static boolean tryTakeCard(Player hero) {
        Deck currentDeck = hero.getDeck();
        if (!currentDeck.isEmpty()) {
            Field currentField = hero.getField();
            if (currentField.getFieldCount() < currentField.getMaxPossibleSizeOfFieldMassive()) {
                int[] currentFieldMassive = currentField.getCurrentFieldMassive();
                int[] currentDeckMassive = currentDeck.getDeckMassive();

                int indexTopDeck = currentDeck.getDeckCount();
                int topDeck = currentDeckMassive[indexTopDeck];

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

    public static boolean tryToDealDamage(Player hero, Player opponent) {
        int heroFieldValue = hero.getField().getFieldValue();
        int heroMinDamage = hero.getPlayerStats().getMinDamage();
        int heroMaxDamage = hero.getPlayerStats().getMaxDamage();
        if (heroFieldValue < heroMinDamage) {
            System.err.println("Not enough field value. Try to take card, pass or reset your field");
        } else if (heroFieldValue > heroMaxDamage) {
            System.err.println(
                    "Field value is greater than the maximum allowed. Try to take card, pass or reset your field"
            );
        } else {
            opponent.getPlayerStats().decreaseHealthBy(heroFieldValue);
            reset(hero);
            return true;
        }
        return false;
    }

    public static void pass(Player hero) {

    }

    public static void reset(Player hero) {
        Arrays.fill(hero.getField().getCurrentFieldMassive(), 0);
        hero.getField().setFieldCount(0);
    }
}
