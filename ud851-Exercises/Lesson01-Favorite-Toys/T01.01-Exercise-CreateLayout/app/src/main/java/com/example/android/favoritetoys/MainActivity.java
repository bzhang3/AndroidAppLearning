/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.example.android.favoritetoys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView mWeatherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWeatherTextView = (TextView) findViewById(R.id.tv_weather_data);

        String[] dummyWeatherData = {
                "Today, May 17 - Clear - 17 / 15",
                "Today, May 18 - Clear - 17 / 15",
                "Today, May 19 - Clear - 17 / 15",
                "Today, May 17 - Clear - 17 / 15",
                "Today, May 14 - Clear - 17 / 15",
                "Today, May 13 - Clear - 17 / 15",
                "Today, May 175 - Clear - 17 / 15",
                "Today, May 177 - Clear - 17 / 15",
                "Today, May 176 - Clear - 17 / 15",
                "Today, May 15 - Clear - 17 / 15",
                "Today, May 19 - Clear - 17 / 15",
                "Today, May 166 - Clear - 17 / 15",
                "Today, May 156 - Clear - 17 / 15",
                "Today, May 14 - Clear - 17 / 15",
                "Today, May 16 - Clear - 17 / 15",
                "Today, May 19 - Clear - 17 / 15",
        };

        for(String dummyWeatherDay : dummyWeatherData){
            mWeatherTextView.append(dummyWeatherDay + "\n\n\n");
        }
    }
}