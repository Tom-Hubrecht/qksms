/*
 * Copyright (C) 2017 Moez Bhatti <moez.bhatti@gmail.com>
 *
 * This file is part of QKSMS.
 *
 * QKSMS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * QKSMS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with QKSMS.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.moez.QKSMS.feature.backup

import com.moez.QKSMS.repository.BackupRepository

data class BackupState(
    val backupProgress: BackupRepository.Progress = BackupRepository.Progress.Idle(),
    val restoreProgress: BackupRepository.Progress = BackupRepository.Progress.Idle(),

    val showLocationRationale: Boolean = false,
    val showSelectedBackupError: Boolean = false,
    val selectedBackupDetails: String? = null,
    val showStopRestoreDialog: Boolean = false,

    val upgraded: Boolean = false
)
