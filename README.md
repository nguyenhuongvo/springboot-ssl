# springboot-ssl
springboot-ssl
P12 file Create
keytool -genkeypair -alias vonh -keyalg RSA -keysize 4096 -storetype PKCS12 -keystore springboot.p12 -validity 3650 -storepass vo1995
Convert p12 to pem
openssl pkcs12 -in path.p12 -out newfile.pem