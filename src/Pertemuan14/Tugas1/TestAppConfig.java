package Pertemuan14.Tugas1;

public class TestAppConfig {
    public static void main(String[] args) {
        System.out.println("=== Konfigurasi Aplikasi ===");
        System.out.println("Base URL: " + AppConfig.BASE_URL);
        System.out.println("Versi Aplikasi: " + AppConfig.APP_VERSION);
        System.out.println("Timeout Default: " + AppConfig.DEFAULT_TIMEOUT + " ms");
    }
}
