package Façade;

class Computer {
	  private static final long BOOT_ADDRESS = 0;
	private static final long BOOT_SECTOR = 0;
	private static final int SECTOR_SIZE = 0;
	private CPU cpu;
	  private Memory memory;
	  private HardDrive hardDrive;

	  public Computer() {
	    this.cpu = new CPU();
	    this.memory = new Memory();
	    this.hardDrive = new HardDrive();
	  }

	  public void startComputer() {
	    cpu.freeze();
	    memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
	    cpu.jump(BOOT_ADDRESS);
	    cpu.execute();
	  }
	}