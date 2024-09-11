import java.util.*;

// Define a Node class for the Huffman tree
class Node {
    char ch;
    int freq;
    Node left, right;
    
    // Constructor for internal nodes
    Node(int freq, Node left, Node right) {
        this.ch = '\0'; // Internal nodes don't have a character
        this.freq = freq;
        this.left = left;
        this.right = right;
    }
    
    // Constructor for leaf nodes
    Node(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
        this.left = this.right = null;
    }
}

// Comparator for nodes to build the priority queue
class NodeComparator implements Comparator<Node> {
    @Override
    public int compare(Node n1, Node n2) {
        return Integer.compare(n1.freq, n2.freq);
    }
}

public class HuffmanCoding {
    
    // Build the Huffman Tree
    private static Node buildHuffmanTree(Map<Character, Integer> frequencyMap) {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(new NodeComparator());
        
        // Create a leaf node for each character and add it to the priority queue
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            priorityQueue.add(new Node(entry.getKey(), entry.getValue()));
        }
        
        // Build the Huffman Tree
        while (priorityQueue.size() > 1) {
            Node left = priorityQueue.poll();
            Node right = priorityQueue.poll();
            
            Node internalNode = new Node(left.freq + right.freq, left, right);
            priorityQueue.add(internalNode);
        }
        
        return priorityQueue.poll(); // The root node
    }
    
    // Generate Huffman Codes
    private static void generateHuffmanCodes(Node root, String code, Map<Character, String> huffmanCodes) {
        if (root == null) {
            return;
        }
        
        // If it's a leaf node, add the code to the map
        if (root.left == null && root.right == null) {
            huffmanCodes.put(root.ch, code);
        }
        
        generateHuffmanCodes(root.left, code + '0', huffmanCodes);
        generateHuffmanCodes(root.right, code + '1', huffmanCodes);
    }
    
    // Encode the input text
    private static String encode(String text, Map<Character, String> huffmanCodes) {
        StringBuilder encodedString = new StringBuilder();
        for (char ch : text.toCharArray()) {
            encodedString.append(huffmanCodes.get(ch));
        }
        return encodedString.toString();
    }
    
    // Decode the encoded text
    private static String decode(String encodedText, Node root) {
        StringBuilder decodedString = new StringBuilder();
        Node currentNode = root;
        
        for (char bit : encodedText.toCharArray()) {
            if (bit == '0') {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
            
            // If it's a leaf node, append the character to the decoded string
            if (currentNode.left == null && currentNode.right == null) {
                decodedString.append(currentNode.ch);
                currentNode = root;
            }
        }
        return decodedString.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text to be encoded: ");
        String text = scanner.nextLine();
        
        // Count frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : text.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        
        // Build the Huffman Tree
        Node root = buildHuffmanTree(frequencyMap);
        
        // Generate Huffman Codes
        Map<Character, String> huffmanCodes = new HashMap<>();
        generateHuffmanCodes(root, "", huffmanCodes);
        
        // Print Huffman Codes
        System.out.println("Huffman Codes:");
        for (Map.Entry<Character, String> entry : huffmanCodes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Encode the text
        String encodedText = encode(text, huffmanCodes);
        System.out.println("Encoded text: " + encodedText);
        
        // Decode the encoded text
        String decodedText = decode(encodedText, root);
        System.out.println("Decoded text: " + decodedText);
        
        scanner.close();
    }
}

Output:

Enter the text to be encoded: This is a HuffmanCoding
Huffman Codes:
 : 100
a: 1111
C: 0000
d: 11011
f: 1100
g: 01110
H: 0100
h: 0110
i: 101
m: 0101
n: 1110
o: 01111
s: 001
T: 11010
u: 0001
Encoded text: 1101001101010011001010011001111100010000011100110001011111111000000111111011101111001110
Decoded text: This is a HuffmanCoding
