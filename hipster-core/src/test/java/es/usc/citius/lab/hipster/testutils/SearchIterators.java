/*
 * Copyright 2013 Centro de Investigación en Tecnoloxías da Información (CITIUS).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package es.usc.citius.lab.hipster.testutils;

import es.usc.citius.lab.hipster.function.ScalarFunction;
import es.usc.citius.lab.hipster.node.informed.CostNode;

import java.util.Iterator;

public final class SearchIterators {

    private SearchIterators() {
    }

    public static <S, T extends Comparable<T>> Iterator<? extends CostNode<S, T>> createAStar(HeuristicSearchProblem<S, T> componentFactory) {
        return new AStarIteratorFactory<S, T>(componentFactory).create();
    }

    public static <S, T extends Comparable<T>> Iterator<? extends CostNode<S, T>> createBellmanFord(HeuristicSearchProblem<S, T> componentFactory) {
        return new BellmanFordIteratorFactory<S, T>(componentFactory).create();
    }

    public static <S, T extends Comparable<T>> Iterator<? extends CostNode<S, T>> createADStar(HeuristicSearchProblem<S, T> componentFactory, ScalarFunction<T> scale, double epsilon, T min, T max) {
        return new ADStarIteratorFactory<S, T>(componentFactory, scale, epsilon, min, max).create();
    }

}