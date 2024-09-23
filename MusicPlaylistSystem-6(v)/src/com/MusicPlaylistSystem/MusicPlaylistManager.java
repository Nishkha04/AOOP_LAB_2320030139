package com.MusicPlaylistSystem;

import java.util.LinkedList;
import java.util.Scanner;

public class MusicPlaylistManager {
    private LinkedList<String> playlist;

    // Constructor
    public MusicPlaylistManager() {
        playlist = new LinkedList<>();
    }

    // Add a song to the playlist
    public void addSong(String songName) {
        playlist.add(songName);
        System.out.println("Song added: " + songName);
    }

    // Remove a song by its name
    public void removeSong(String songName) {
        if (playlist.remove(songName)) {
            System.out.println("Song removed: " + songName);
        } else {
            System.out.println("Song not found: " + songName);
        }
    }

    // Move a song to a different position
    public void moveSong(int oldPosition, int newPosition) {
        if (oldPosition < 1 || oldPosition > playlist.size() || newPosition < 1 || newPosition > playlist.size()) {
            System.out.println("Invalid position(s).");
            return;
        }
        
        String song = playlist.remove(oldPosition - 1);
        playlist.add(newPosition - 1, song);
        System.out.println("Moved song: " + song + " to position " + newPosition);
    }

    // Display the playlist
    public void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty.");
        } else {
            System.out.println("Playlist:");
            int i = 1;
            for (String song : playlist) {
                System.out.println(i + ". " + song);
                i++;
            }
        }
    }

    // Main method to interact with the user
    public static void main(String[] args) {
        MusicPlaylistManager playlistManager = new MusicPlaylistManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMusic Playlist Manager");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Move Song");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter song name: ");
                    String songName = scanner.nextLine();
                    playlistManager.addSong(songName);
                    break;
                case 2:
                    System.out.print("Enter song name to remove: ");
                    String removeSong = scanner.nextLine();
                    playlistManager.removeSong(removeSong);
                    break;
                case 3:
                    System.out.print("Enter current position of the song: ");
                    int oldPosition = scanner.nextInt();
                    System.out.print("Enter new position for the song: ");
                    int newPosition = scanner.nextInt();
                    playlistManager.moveSong(oldPosition, newPosition);
                    break;
                case 4:
                    playlistManager.displayPlaylist();
                    break;
                case 5:
                    System.out.println("Exiting Music Playlist Manager.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}
