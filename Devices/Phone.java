class Phone extends Device {
    public void makeCall() {
        battery -= 5;
        System.out.println("You make a call.");
        status();
        checkBattery();
    }

    public void playGame() {
        if (battery < 25) {
            System.out.println("Battery is too low to play a game.");
        } else {
            battery -= 20;
            System.out.println("You play a game.");
            status();
            checkBattery();
        }
    }

    public void charge() {
        battery += 50;
        if (battery > 100) {
            battery = 100;
        }
        System.out.println("You charge the phone.");
        status();
    }

    private void checkBattery() {
        if (battery < 10) {
            System.out.println("Battery critical!");
        }
    }
}

