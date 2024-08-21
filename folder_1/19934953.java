public class BigbenchClone{    
    public void write(Memory mem, int address) {
        mem.write32(address, next);
        mem.write16(address + 4, attribute);
        mem.write8(address + 6, version[0]);
        mem.write8(address + 7, version[1]);
        Utilities.writeStringNZ(mem, address + 8, 28, modname);
        mem.write32(address + 36, status);
        mem.write32(address + 40, unk1);
        mem.write32(address + 44, modid);
        mem.write32(address + 48, usermod_thid);
        mem.write32(address + 52, memid);
        mem.write32(address + 56, mpidtext);
        mem.write32(address + 60, mpiddata);
        mem.write32(address + 64, ent_top);
        mem.write32(address + 68, ent_size);
        mem.write32(address + 72, stub_top);
        mem.write32(address + 76, stub_size);
        mem.write32(address + 80, module_start_func);
        mem.write32(address + 84, module_stop_func);
        mem.write32(address + 88, module_bootstart_func);
        mem.write32(address + 92, module_reboot_before_func);
        mem.write32(address + 96, module_reboot_phase_func);
        mem.write32(address + 100, entry_addr);
        mem.write32(address + 104, gp_value);
        mem.write32(address + 108, text_addr);
        mem.write32(address + 112, text_size);
        mem.write32(address + 116, data_size);
        mem.write32(address + 120, bss_size);
        mem.write32(address + 124, nsegment);
        mem.write32(address + 128, segmentaddr[0]);
        mem.write32(address + 132, segmentaddr[1]);
        mem.write32(address + 136, segmentaddr[2]);
        mem.write32(address + 140, segmentaddr[3]);
        mem.write32(address + 144, segmentsize[0]);
        mem.write32(address + 148, segmentsize[1]);
        mem.write32(address + 152, segmentsize[2]);
        mem.write32(address + 156, segmentsize[3]);
        mem.write32(address + 160, module_start_thread_priority);
        mem.write32(address + 164, module_start_thread_stacksize);
        mem.write32(address + 168, module_start_thread_attr);
        mem.write32(address + 172, module_stop_thread_priority);
        mem.write32(address + 176, module_stop_thread_stacksize);
        mem.write32(address + 180, module_stop_thread_attr);
        mem.write32(address + 184, module_reboot_before_thread_priority);
        mem.write32(address + 188, module_reboot_before_thread_stacksize);
        mem.write32(address + 192, module_reboot_before_thread_attr);
    }
}