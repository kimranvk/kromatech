package org.kromatech.app.repository;

import org.kromatech.app.beans.BookClassification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookClassificationRepository extends JpaRepository<BookClassification, String>{

}
