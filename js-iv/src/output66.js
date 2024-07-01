/*
write a function with one input variable. when called , it should check if input value matches with orgId from the data, if matched, print the value of shareWithExternal in console. delete the parameters from idp objects and return modified data
*/

const data = {
    "total_page_count": 0,
    "pageLimit": 5000,
    "total_record_count": 0,
    "page_number": 1,
    "orgId": 13,
    "idp": [
        {
            "id": 0,
            "name": "Local",
            "Idpype": {
                "id": 0,
                "name": " Auth"
            }
        },
        {
            "id": 14,
            "name": "saml",
            "parameters": {
                "orgMapping": "",
                "redirect": "https://vpn.com",
                "spPrivateKey": "-----BEGIN PRIVATE -----END PRIVATE KEY-----\n",
                "metadataURL": "https://abc.com",

                "encrypted": true,
                "shareWithExternal": false
            },
            "Idptype": {
                "id": 3,
                "name": "SAML",
                "idpFlag": true
            }
        }
    ],
    "pages": []
}

function modify(val, data) {
    if (data['orgId'] !== val) {
        return {}
    }
    else {
        const idpArray = data['idp']
        if (idpArray.length > 0) {
            for (let i = 0; i < idpArray.length; i++) {
                let obj = idpArray[i]
                for (let key in obj) {
                    if (key === 'parameters') {
                        // print
                        console.log(obj.parameters.shareWithExternal)
                        // delete
                        delete obj['parameters']
                    }
                }
            }
        }
        return JSON.stringify(data)             // to see nested objects
    }
}

console.log(modify(13, data))