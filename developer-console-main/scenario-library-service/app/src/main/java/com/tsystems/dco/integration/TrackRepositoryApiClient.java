/*
 *   ========================================================================
 *  SDV Developer Console
 *
 *   Copyright (C) 2022 - 2023 T-Systems International GmbH
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *   SPDX-License-Identifier: Apache-2.0
 *
 *   ========================================================================
 */

package com.tsystems.dco.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

@FeignClient(name = "TrackRepositoryApiClient",
  url = "${track-service.url}",
  configuration = FeignClientConfiguration.class)
public interface TrackRepositoryApiClient {

  @GetMapping(value = "/api/track/list", produces = {"application/json"})
  ResponseEntity<List<Track>> findTrackByIds(@RequestParam(value = "trackIds") List<UUID> trackIds);

  @GetMapping(value = "/api/track/validate", produces = {"application/json"})
  ResponseEntity<Boolean> isTracksExists(@RequestParam(value = "trackIds") List<UUID> trackIds);
}
