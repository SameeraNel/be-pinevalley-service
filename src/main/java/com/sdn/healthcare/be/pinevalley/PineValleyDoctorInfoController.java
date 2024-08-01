package com.sdn.healthcare.be.pinevalley;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/pinevalley")
public class PineValleyDoctorInfoController {

    @GetMapping("/doctors")
    public List<Doctor> getDoctors() {
        return Arrays.asList(
                new Doctor("John Mathew", "07:30 AM", "Pine Valley"),
                new Doctor("Roma Katherine", "04:30 PM", "Pine Valley")
        );
    }

    static class Doctor {
        private String name;
        private String time;
        private String hospital;

        public Doctor(String name, String time, String hospital) {
            this.name = name;
            this.time = time;
            this.hospital = hospital;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getHospital() {
            return hospital;
        }

        public void setHospital(String hospital) {
            this.hospital = hospital;
        }
    }
}