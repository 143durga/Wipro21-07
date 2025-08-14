enum HttpStatusCode {
    OK = 200,
    NOTFOUND = 404,
    ACCESSDENIED = 403,
    INTERNALERROR = 500
}

console.log("OK:", HttpStatusCode.OK);                 // 200
console.log("Not Found:", HttpStatusCode.NOTFOUND);    // 404
console.log("Access Denied:", HttpStatusCode.ACCESSDENIED); // 403
console.log("Internal Error:", HttpStatusCode.INTERNALERROR); // 500
