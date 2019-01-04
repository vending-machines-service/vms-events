package vms.vmsevents.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vms.vmsevents.jpa.MaintenanceRecordArchiveJPA;

@Repository
public interface MaintenanceArchiveRepository extends JpaRepository<MaintenanceRecordArchiveJPA, Integer> {
}
