# J_HashFunction

This project was created in java, and aims at the realization/implementation with examples, 
concerning the plaintext password hash algorithms.
Nowadays, having unencrypted passwords, for example inside a database, could be a serious problem. 
For this, certain algorithms have been invented to encrypt passwords, each algorithm is different and 
has its strengths or weaknesses.
In this project, we find two folders, which can be safely imported. Each directory has its own specific 
implementation of the algorithm and an example (in the java main file):

- folder contains the java files i.e. the implementation of the SHA1 and MD5 algorithm
- folder contains the java files i.e. the implementation of the PBKDF2 algorithm.

## MD5
MD5 is a cryptographic hash function created by [Ronald Rivest](https://en.wikipedia.org/wiki/Ron_Rivest) in 1991 and standardized with RFC 1321
It is a one-way function different from encryption and encryption because it is irreversible.
This function takes an arbitrary length string as input and outputs another 128-bit string.

![md5](https://user-images.githubusercontent.com/96992944/208894060-d46b863f-5169-48e2-bd7b-779cc930b868.png)


## SHA-1
The term SHA indicates a family of five different cryptographic hash functions developed since 1993 by the [National Security Agency](https://it.wikipedia.org/wiki/National_Security_Agency).
Like any hashing algorithm, SHA produces a fixed-length message digest, or "message fingerprint," from a variable-length message.
The security of a hash algorithm lies in the fact that the function is not invertible and that it should never be possible to 
intentionally create two different messages with the same digest.
SHA-1 differs from SHA-0 by only one bit rotation in the message preparation process of its one-way compression function.
SHA-1 (as well as SHA-0) produces a 160-bit digest from a message with a maximum length of 264-1 bits.

![300px-SHA-1 svg](https://user-images.githubusercontent.com/96992944/208894647-6c90da9e-270c-47b8-b47e-4411694a69a6.png)


## PBKDF2
This standard is now used for hashing passwords (associated with functions such as [SHA-256](https://it.wikipedia.org/wiki/Secure_Hash_Algorithm)) or generating data encryption keys. 
The PBKDF2 applies a user-chosen function (hash function, encryption, or a HMAC) to a password or passphrase with a salt and 
repeats this operation multiple times to generate a key, which can then be used to encrypt any content.

                  Password = MD5 (Password + Secret + Salt)


![Pbkdf2_nist](https://user-images.githubusercontent.com/96992944/208895159-d0052bb8-82bb-4350-ad16-20c038f3d076.png)



