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
import vnavesnoj.project.component.PlayerStats;

/**
 * @author vnavesnoj
 * @link vnavesnoj@gmail.com
 */
public final class PrintPlayerStatsCommand implements CommandExecutor, InfoCommand {

    @Override
    public boolean tryToExecuteCommand(final Player player1, final Player player2) {
        PlayerStats[] playerStats = new PlayerStats[]{player1.getPlayerStats(), player2.getPlayerStats()};
        for (int i = 0; i < playerStats.length; i++) {
            System.out.println("-----------------------------------");
            System.out.println("Player " + i + " stats:");
            System.out.println(playerStats[i].getPlayerClass());
            System.out.println("Health: " + playerStats[i].getHealth());
            System.out.println("Min damage: " + playerStats[i].getMinDamage());
            System.out.println("Max damage: " + playerStats[i].getMaxDamage());
            System.out.println("-----------------------------------");
        }
        return true;
    }

    @Override
    public String getExecuteCommand() {
        return "stats";
    }
}
