/*
 * Copyright (C) 2017 The LineageOS Project
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
package org.lineageos.updater.controller;

import org.lineageos.updater.UpdateDownload;

import java.util.List;
import java.util.Set;

public interface UpdaterControllerInt {

    boolean addUpdate(UpdateDownload update);

    List<UpdateDownload> getUpdates();

    Set<String> getIds();

    UpdateDownload getUpdate(String downloadId);

    boolean startDownload(String downloadId);

    boolean pauseDownload(String downloadId);

    boolean cancelDownload(String downloadId);

    boolean resumeDownload(String downloadId);

    boolean isDownloading(String downloadId);

    boolean hasActiveDownloads();

    boolean isVerifyingUpdate();
}