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
public class Field {

    private final int[] currentFieldMassive;

    private final int maxPossibleSizeOfFieldMassive;

    private int fieldCount;

    public Field(int size) {
        this.currentFieldMassive = new int[size];
        this.maxPossibleSizeOfFieldMassive = size;
        this.fieldCount = 0;
    }

    public int[] getCurrentFieldMassive() {
        return currentFieldMassive;
    }

    public int getFieldCount() {
        return fieldCount;
    }

    public void increaseFieldCountBy(final int number) {
        fieldCount += number;
    }

    public void setFieldCount(final int fieldCount) {
        this.fieldCount = fieldCount;
    }

    public int getMaxPossibleSizeOfFieldMassive() {
        return maxPossibleSizeOfFieldMassive;
    }

    public int getFieldValue() {
        int sum = 0;
        for (final int value : currentFieldMassive) {
            sum += value;
        }
        return sum;
    }
}
