/*
 * Copyright 2019 franciscoaleixo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aragoj.mainscreen

import com.aragoj.base.Event
import com.aragoj.session.model.Session

interface MainScreenEvent : Event
data class ShowCloseDialog(val session: Session) : MainScreenEvent
data class ShowNewSessionDialog(val session: Session) : MainScreenEvent

class MainScreenState {
}