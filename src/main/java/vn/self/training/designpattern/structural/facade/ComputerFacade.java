package vn.self.training.designpattern.structural.facade;

public class ComputerFacade {
    private static final long BOOT_ADDRESS = 0x00000001;
    private static final long BOOT_SECTOR = 0x00000002;
    private static final int SECTOR_SIZE = 1000;

    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    public ComputerFacade(CPU processor, Memory ram, HardDrive hd) {
        this.processor = processor;
        this.ram = ram;
        this.hd = hd;
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.excute();
    }
}
