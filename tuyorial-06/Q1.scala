// Tutorial 6 - Question 1

object Q1 {
  val alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
  val key = 5

  def main(args: Array[String]): Unit = {
    val cipherText = cipher(encrypt, "Hello World", key, alphabet)
    val plainText = cipher(decrypt, cipherText, key, alphabet)

    printf("Cipher Text : %s\n", cipherText)
    printf("Plain Text : %s\n", plainText)
  }

  // Function that encrypts a character using Caesar Cipher
  val encrypt = (c: Char, key: Int, alphabet: String) => alphabet((alphabet.indexOf(c.toUpper) + key) % alphabet.size)

  // Function that decrypts a character using Caesar Cipher
  val decrypt = (c: Char, key: Int, str: String) => encrypt(c, -key, str)

  val cipher =(func: (Char, Int, String) => Char, text: String, key: Int, alphabet: String) => text.map(func(_, key, alphabet))
}