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

const originalSentence = "This is a sunny day!";
const reversedWordsSentence = reverseWords(originalSentence);
console.log(reversedWordsSentence); 
