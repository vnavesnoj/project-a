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
public class PlayerStats {

    private int health;

    private final int minDamage;

    private final int maxDamage;

    public PlayerStats(final PlayerClass playerClass) {
        if (playerClass == PlayerClass.WARRIOR) {
            health = 42;
            minDamage = 10;
            maxDamage = 20;
        } else if (playerClass == PlayerClass.ARCHER) {
            health = 40;
            minDamage = 10;
            maxDamage = 18;
        } else if (playerClass == PlayerClass.MAGE) {
            health = 38;
            minDamage = 10;
            maxDamage = 22;
        } else {
            throw new IllegalArgumentException("Player class not found");
        }
    }

    public int getHealth() {
        return health;
    }

    public void decreaseHealthBy(final int number) {
        this.health -= number;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }
}
