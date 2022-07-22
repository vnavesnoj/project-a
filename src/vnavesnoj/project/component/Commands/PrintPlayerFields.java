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

import vnavesnoj.project.component.Field;
import vnavesnoj.project.component.Player;

/**
 * @author vnavesnoj
 * @link vnavesnoj@gmail.com
 */
public final class PrintPlayerFields implements CommandExecutor, InfoCommand {

    @Override
    public boolean tryToExecuteCommand(final Player player1, final Player player2) {
        Field[] fields = new Field[]{player1.getField(), player2.getField()};
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
        return true;
    }

    @Override
    public String getExecuteCommand() {
        return "fields";
    }
}
