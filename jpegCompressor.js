var JpegCompressor = function () {};

JpegCompressor.prototype.compress = function (onSuccess, onFail, params) {
    return cordova.exec(onSuccess, onFail, 'JpegCompressor', 'compress', [params]);
};

if (!window.plugins) {
    window.plugins = {};
}

if (!window.plugins.jpegCompressor) {
    window.plugins.jpegCompressor = new JpegCompressor();
}