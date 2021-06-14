package paytm.common.repository

import paytm.common.entity.AppConfigEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AppConfigRepository extends JpaRepository<AppConfigEntity, Long> {
}
