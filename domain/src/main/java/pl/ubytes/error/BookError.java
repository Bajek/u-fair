package pl.ubytes.error;

/**
 * Created by Bartłomiej on 14.12.2015.
 */
public class BookError extends RuntimeException {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public BookError(String message) {
        this.message = message;
    }
}
