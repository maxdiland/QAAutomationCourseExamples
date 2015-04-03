package lesson9;

import entities.Box;
import lesson4.Run;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * author Maksim Diland
 */
public class Example1 {
    public static void main(String[] args) {
        try {
            doThrow();
        } catch (RuntimeException re) {
            System.out.println("RE was thrown");
            System.exit(0);
//        } catch (Throwable t) {
//            System.out.println("Throwable was thrown");
        } finally {
            System.out.println("Finally block");
        }
    }

    public static void doThrow() {
        throw new RuntimeException();
    }
}

class Example2 {
    public static void main(String[] args) {
        int num = getNumber();
        System.out.println( num );
    }

    public static int getNumber() {
        try {
            throw new RuntimeException();
//            return 0;
        } finally {
            return 1;
        }
    }
}

class Example3 {
    public static void main(String[] args) throws Exception {
        doSomething();
    }

    public static void doSomething() throws Exception {
//        throw new Exception();
    }

    public static void processBox(Box box) {
        double result = box.calculateVolume();
    }
}

class Example4 {
    public static void main(String[] args)  {
        InputStream fis = null;
        try {
            fis = new FileInputStream("c:/IFRToolLog.txt");
            int readByte;
            while ((readByte = fis.read()) != -1) {
                System.out.println(((byte) readByte));
            }
        } catch (FileNotFoundException fne) {
            // handle

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {

                }
            }
        }

    }
}

class Example5 {
    public static void main(String[] args) {
        try (InputStream fis = new FileInputStream("c:/IFRToolLog.txt")) {
            int readByte;
            while ((readByte = fis.read()) != -1) {
                System.out.println(((byte) readByte));
            }
        } catch (FileNotFoundException fne) {

        } catch (IOException ioe) {

        }
    }
}

class Example6 {
    public static void main(String[] args)  {
        InputStream fis = null;
        OutputStream fos = null;
        try {
            fis = new FileInputStream("c:/IFRToolLog.txt");
            fos = new FileOutputStream("d:/fileCopy.txt");

            int readByte;
            while ((readByte = fis.read()) != -1) {
                fos.write(readByte);
            }
        } catch (FileNotFoundException fne) {
            // handle
            fne.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {

                }
            }

            if (fos != null) {
                try {
                    fos.flush();
                    fos.close();
                } catch (IOException ioe) {

                }
            }
        }

    }
}

class Example7 {
    public static void main(String[] args) {
        File file = new File("c:/IFRToolLog.txt");
//        file.listFiles()

    }
}

class FileUtil {

    public static boolean copyFile(File src, File dst) {
        InputStream fis = null;
        OutputStream fos = null;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dst);

            int readByte;
            while ((readByte = fis.read()) != -1) {
                fos.write(readByte);
            }
        } catch (FileNotFoundException fne) {
            return false;
        } catch (IOException e) {
            return false;
        } finally {
            closeQuietly( fis );
            closeQuietly(fos);
        }
        return true;
    }

    public static void copyFolder(File srcFolder, File dstFolder) {
        checkFileForNull(srcFolder, "srcFolder");
        isDirExist(srcFolder, "srcFolder");

        checkFileForNull(dstFolder, "dstFolder");
        isDirExist(dstFolder, "dstFolder");

        File createdDirectory = new File(dstFolder, srcFolder.getName());
        createdDirectory.mkdirs();

        File[] files = srcFolder.listFiles();

        if (files.length == 0) {
            return;
        }

        for (File file : files) {
            if (file.isFile()) {
                copyFile(file, new File(createdDirectory, file.getName()));
            } else {
                copyFolder(file, createdDirectory);
            }
        }

    }

    private static void checkFileForNull(File file, String paramName) {
        if (file == null) {
            throw new IllegalArgumentException(paramName + " is null");
        }
    }

    private static void isDirExist(File file, String paramName) {
        if (!file.exists()) {
            throw new IllegalArgumentException(paramName + " doesn't exist");

        }

        if (file.isFile()) {
            throw new IllegalArgumentException(paramName + " is not a directory");
        }



    }

    private static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                if (closeable instanceof OutputStream) {
                    ((OutputStream) closeable).flush();
                }
                closeable.close();
            } catch (IOException e) {

            }
        }

    }

}


class Example10 {
    public static void main(String[] args) throws IOException {
        FileUtil.copyFolder(new File("d:/TestFolder"), new File("d:/copyTestDest"));
    }
}


