/**
 *  JpegCompressor.java
 *  JpegCompressor PhoneGap plugin (Android)
 *
 *  Created by Alen Chen on 08/08/2012.
 *  Copyright 2012 Alen Chen. All rights reserved.
 *  MIT Licensed
 *
 */
package com.angrystone;


import org.json.JSONArray;
import org.json.JSONException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class JpegCompressor extends Plugin {

    @Override
    public PluginResult execute(String action, JSONArray args, String callbackId) {
        PluginResult.Status status = PluginResult.Status.OK;
        String filename = "/mnt/sdcard/DCIM/Camera/Convert_";
        String orifilename = "/mnt/sdcard/DCIM/Camera/";

        if (action.equals("compress")) {
            Integer quality = 100;

            try {
                orifilename = orifilename.concat(args.getString(0));
                filename = filename.concat(args.getString(0));
                quality = args.getInt(1);
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            OutputStream outputStream = null;
            File file = new File(filename);
            Bitmap bitmap = BitmapFactory.decodeFile(orifilename);
            
            try {
                outputStream = new FileOutputStream(file);
                bitmap.compress(Bitmap.CompressFormat.JPEG, quality, outputStream);
                try {
                    outputStream.flush();
                    outputStream.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            status = PluginResult.Status.INVALID_ACTION;
        }
        return new PluginResult(status, filename);
    }
}
