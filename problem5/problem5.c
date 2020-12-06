#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stdbool.h>
#include <ctype.h>
// The same function is used to encrypt and
// decrypt
void encryptDecrypt(char *inpString, long len)
{
    // Define XOR key
    // Any character value will work
    for (int i = 0; i < 128; i++)
    {
        char *tmpString = calloc(1, len + 1);
        int isBadStr = 0;
        tmpString = strcpy(tmpString, inpString);
        printf("%d=====================================\n", i);
        // perform XOR operation of key
        // with every caracter in string
        for (int j = 0; j < len; j++)
        {
            tmpString[j] = tmpString[j] ^ (char)i;
            if (!isalpha(tmpString[i]))
                isBadStr = 1;
            // printf("%c", tmpString[i]);
        }
        if (!isBadStr)
            printf("%s'n", tmpString);
        free(tmpString);
    }
}

// Driver program to test above function
int main()
{
    FILE *fp;
    long lSize;
    char *buffer;

    fp = fopen("out.txt", "rb");

    fseek(fp, 0L, SEEK_END);
    lSize = ftell(fp);
    rewind(fp);

    /* allocate memory for entire content */
    buffer = calloc(1, lSize + 1);

    /* copy the file into the buffer */
    fread(buffer, lSize, 1, fp);
    fclose(fp);

    // Encrypt the string
    encryptDecrypt(buffer, lSize);
    printf("\n");

    // Decrypt the string
    // printf("Decrypted String: ");
    // encryptDecrypt(sampleString);

    return 0;
}