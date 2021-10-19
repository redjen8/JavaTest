import java.time.Instant;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

class Main {
    public static void main(String[] args) {
        Instant epoch = Instant.EPOCH; 
        System.out.println("epoch = " + epoch);

        Instant epochInFuture = Instant.ofEpochSecond(1_000_000_000);
        System.out.println("epochInFuture = " + epochInFuture);

        Instant epochInPast = Instant.ofEpochSecond(-1_000_000_000);
        System.out.println("epochInPast = " + epochInPast);

        ZonedDateTime zdtSeoul = Year.of(2021).atMonth(10).atDay(19).atTime(22, 00).atZone(ZoneId.of("Asia/Seoul"));

        System.out.println(zdtSeoul); 
        System.out.println("Instant : " + zdtSeoul.toInstant() + ", TimeStamp : " + zdtSeoul.toInstant().getEpochSecond());
        System.out.println(zdtSeoul.toInstant().atZone(ZoneId.of("America/Vancouver")));
    }
}