package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RiskySkipper_56100 : Card() {
    override val id = 56100
    override val name = "冒进的艇长"
    override val description = "在你使用一张随从牌后，对所有随从造成1点伤害。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "稳健的船员的死对头。"
    override val artist = "Anzka Nguyen"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0d63765be628abe7a2555d5e39564142efb1079f0a0296db60b1cdf7603a185d.png"
}
