package Tries;

public class Contact_client {
    public static void main(String[] args) {
        Contacts trie =new Contacts();
        trie.add_word("abhi");
        trie.add_word("abyss");
        trie.add_word("boy");
        trie.add_word("bounce");
        trie.add_word("see");
        trie.add_word("amit");
        trie.add_word("sea");
        trie.add_word("seen");
        trie.add_word("bug");
        trie.add_word("boy");



        trie.display();
        System.out.println();
        System.out.println(trie.search("abhi"));
    }
}
