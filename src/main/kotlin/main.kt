fun main(args: Array<String>) {

    val cleanText = "clean"
    val encryptedText = Crypto().encrypt(cleanText)


    println("Clean text: $cleanText, encrypted text: $encryptedText, decrypted text: ${Crypto().decrypt(encryptedText)}")

}
