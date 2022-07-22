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

import vnavesnoj.project.component.Player;

/**
 * @author vnavesnoj
 * @link vnavesnoj@gmail.com
 */
public final class DealDamage implements CommandExecutor, MoveCommand {

    @Override
    public boolean tryToExecuteCommand(final Player hero, final Player opponent) {
        final int heroFieldValue = hero.getField().getFieldValue();
        final int heroMinDamage = hero.getPlayerStats().getMinDamage();
        int heroMaxDamage = hero.getPlayerStats().getMaxDamage();
        if (heroFieldValue < heroMinDamage) {
            System.err.println("Not enough field value. Try to take card, pass or reset your field");
        } else if (heroFieldValue > heroMaxDamage) {
            System.err.println(
                    "Field value is greater than the maximum allowed. Try to take card, pass or reset your field"
            );
        } else {
            opponent.getPlayerStats().decreaseHealthBy(heroFieldValue);
            new ResetCommand().tryToExecuteCommand(hero, opponent);
            return true;
        }
        return false;
    }

    @Override
    public String getExecuteCommand() {
        return "damage";
    }
}
