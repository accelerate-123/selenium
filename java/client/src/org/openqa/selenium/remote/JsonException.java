/*
 Copyright 2010 Selenium committers

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package org.openqa.selenium.remote;

import com.google.gson.JsonSyntaxException;

import org.openqa.selenium.WebDriverException;

public class JsonException extends WebDriverException {
  public JsonException(JsonSyntaxException e) {
    super(e);
  }
  public JsonException(JsonSyntaxException e, Object text) {
    super("JSON command: " + text, e);
  }
}