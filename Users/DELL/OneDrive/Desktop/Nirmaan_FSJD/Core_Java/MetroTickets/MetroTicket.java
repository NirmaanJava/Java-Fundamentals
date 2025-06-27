package MetroTickets;

import java.time.Duration;
import java.time.LocalDateTime;

import java.util.UUID;

public class MetroTicket {
	String ticketId;
	LocalDateTime entryTime;
	boolean isScannedForEntry = false;
	boolean isScannedForExit = false;

	public MetroTicket() {
		this.ticketId = UUID.randomUUID().toString();
		System.out.println("🎫 Ticket generated. Ticket ID: " + ticketId);
	}

	public void scanEntry() {
		if (isScannedForEntry) {
			System.out.println("❌ Entry already scanned.");
		} else {
			entryTime = LocalDateTime.now();
			isScannedForEntry = true;
			System.out.println("✅ Entry successful at: " + entryTime);
		}
	}

	public void scanExit() {
		if (!isScannedForEntry) {
			System.out.println("❌ No entry found. Please scan your ticket at the entry gate first.");
		} else if (isScannedForExit) {
			System.out.println("❌ Ticket already used for exit.");
		} else {
			LocalDateTime exitTime = LocalDateTime.now();
			Duration travelTime = Duration.between(entryTime, exitTime);

			if (travelTime.toMinutes() > 120) {
				System.out.println("⏱️ Ticket expired (more than 2 hours). Penalty applicable.");
			} else {
				System.out.println("✅ Exit successful. Travel duration: " + travelTime.toMinutes() + " minutes.");
			}

			isScannedForExit = true;
		}
	}
}
