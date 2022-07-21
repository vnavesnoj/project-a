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

import java.util.Random;

/**
 * @author vnavesnoj
 * @link vnavesnoj@gmail.com
 */
public class Deck {

    private final int[] deckMassive;

    private int deckCount;

    public Deck() {
        int[] cards = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        this.deckMassive = shuffle(cards);
        this.deckCount = cards.length;
    }

    private int[] shuffle(final int[] cards) {
        Random random = new Random();
        for (int i = 0; i < cards.length; i++) {
            int randomNumber = random.nextInt(cards.length);
            if (i != randomNumber) {
                swap(cards, i, randomNumber);
            }
        }
        return cards;
    }

    private void swap(final int[] cards, final int i, final int randomNumber) {
        int temp = cards[i];
        cards[i] = cards[randomNumber];
        cards[randomNumber] = temp;
    }

    public boolean isEmpty() {
        return deckCount <= 0;
    }

    public int[] getDeckMassive() {
        return deckMassive;
    }

    public int getDeckCount() {
        return deckCount;
    }

    public void decreaseDeckCountBy(final int number) {
        deckCount -= number;
    }
}
