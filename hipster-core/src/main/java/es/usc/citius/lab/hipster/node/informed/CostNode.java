/*
 * Copyright 2013 Centro de Investigación en Tecnoloxías da Información (CITIUS), University of Santiago de Compostela (USC).
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
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
package es.usc.citius.lab.hipster.node.informed;

import es.usc.citius.lab.hipster.node.Node;

/**
 * Interface CostNode is a special type of node that defines a function
 * to retrieve the cost associated with it.
 *
 * @param <S> State type
 */
public interface CostNode<S, T extends Comparable<T>> extends Node<S> {
    T getCost();
}