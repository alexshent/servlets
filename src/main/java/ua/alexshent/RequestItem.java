package ua.alexshent;

import java.time.LocalDateTime;

public record RequestItem(String ipAddress, String userAgent, LocalDateTime datetime) {
}
