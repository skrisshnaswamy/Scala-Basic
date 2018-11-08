trait User { val name: String}

class FreeUser(val name: String) extends User
class PremiumUser(val name: String) extends User
case class SubscriptionUser(name: String) extends User // no companion object required for deconstruction via unapply
case class LoyaltyTierUser(name: String, loyaltyPoints: Int) extends User

//Construction/Deconstruction using Companion Objects
object FreeUser {
  def unapply(freeUser: FreeUser): Option[String] = Some(freeUser.name)
}

object PremiumUser {
  def unapply(premiumUser: PremiumUser): Option[String] = Some(premiumUser.name)
}

object upgradeProbability {
  def unapply(user: LoyaltyTierUser): Boolean = user.loyaltyPoints > 10
}

//val user: User = new FreeUser("Alice")
//val user: User = new PremiumUser("Bob")
//val user: User = SubscriptionUser("Charlie")
//val user: User = LoyaltyTierUser("Dean", 70)
val user: User = LoyaltyTierUser("Erik", 20)


user match {
  case user: FreeUser => s"Hello there! ${user.name}"
  case PremiumUser(name) => s"Welcome $name"
  case SubscriptionUser(name) => s"Welcome back, $name!"
  case user @ upgradeProbability() => s"Welcome, ${user.name}. You've an opportunity to upgrade your membership"
  case LoyaltyTierUser(name, loyaltyPoints) =>
    if (loyaltyPoints > 50) s"Welcome back, $name!!! You're in the path of becoming a premium user. Way to go!!!"
  case LoyaltyTierUser(name, _) => s"Welcome, $name"
  case _ => "User Category unknown"
}

