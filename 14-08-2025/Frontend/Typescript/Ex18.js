var HttpStatusCode;
(function (HttpStatusCode) {
    HttpStatusCode[HttpStatusCode["OK"] = 200] = "OK";
    HttpStatusCode[HttpStatusCode["NOTFOUND"] = 404] = "NOTFOUND";
    HttpStatusCode[HttpStatusCode["ACCESSDENIED"] = 403] = "ACCESSDENIED";
    HttpStatusCode[HttpStatusCode["INTERNALERROR"] = 500] = "INTERNALERROR";
})(HttpStatusCode || (HttpStatusCode = {}));
console.log("OK:", HttpStatusCode.OK); // 200
console.log("Not Found:", HttpStatusCode.NOTFOUND); // 404
console.log("Access Denied:", HttpStatusCode.ACCESSDENIED); // 403
console.log("Internal Error:", HttpStatusCode.INTERNALERROR); // 500
