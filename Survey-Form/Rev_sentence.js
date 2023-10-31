function reverseWords(sentence) {
    if (!sentence || typeof sentence !== 'string') {
        return "Please provide a valid sentence.";
    }

    const reversedWords = sentence
        .split(' ')
        .map(word => word.split('').reverse().join(''))
        .join(' ');

    return reversedWords;
}

// Example usage:
const originalSentence = "Hello, how are you?";
const reversedWordsSentence = reverseWords(originalSentence);
console.log(reversedWordsSentence); // Output: "olleH, woh era ?uoy"
