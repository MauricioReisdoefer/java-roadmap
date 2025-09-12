class DownloadTask extends Thread {
    private String fileName;

    public DownloadTask(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("Starting download: " + fileName + " in thread " + Thread.currentThread().getName());
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(fileName + " - " + (i * 20) + "%");
                Thread.sleep(1000); // Simulate a donwloading time 
            }
        } catch (InterruptedException e) {
            System.out.println("Download interrupted: " + fileName);
        }
        System.out.println("Download finished: " + fileName);
    }
}

public class MultipleThread {
    public static void main(String[] args) {
        System.out.println("Main thread: " + Thread.currentThread().getName());

        DownloadTask t1 = new DownloadTask("music.mp3");
        DownloadTask t2 = new DownloadTask("video.mp4");
        DownloadTask t3 = new DownloadTask("image.png");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("All downloads closed");
    }
}
