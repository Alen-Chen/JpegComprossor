JpegComprossor
=========

This plugin is a simple tool to make you to convert jpeg file to lower (or higher) quality easily.

Few steps to add this plugin into your phonegap project.

1.	Add the jpegCompressor.js to 'assets/www' folder
2.	Make a directory under 'src', named 'com/angrystone' then add the JpegCompressor.java to it.
3.	Import the js file to your index.html. eg. <script src="jpegCompressor.js"></script>
4.	Add the plugin in 'res/xml/config.xml'. eg. <plugin name="JpegCompressor" value="com.compalcomm.JpegCompressor"/>
5.	It needs permisson 'android.permission.WRITE_EXTERNAL_STORAGE'. Please check your 'AndroidManifest.xml'

### Example ###
	`window.plugins.jpegCompressor.compress(
		function (return_filename) {
			alert('Filename is ' + return_filename);
		}, function () {
			alert("Jpeg compress fail");
		},
		fileEntry.name,
		quality
	);`

### License ###

The MIT License

Copyright (c) 2012 Alen Chen

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
