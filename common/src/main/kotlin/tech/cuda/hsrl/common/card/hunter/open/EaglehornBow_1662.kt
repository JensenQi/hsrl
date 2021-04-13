package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EaglehornBow_1662 : Card() {
    override val id = 1662
    override val name = "鹰角弓"
    override val description = "每当一个友方<b>奥秘</b>被揭示时，便获得+1耐久度。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy3
    override val background = "第一课：把尖的那头对准别人。"
    override val artist = "Cyril Van Der Haegen"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/857fb984b9c35997c836ab4b57bd1ab03036f2a33b68cb027fdeb36c6f3ac265.png"
}
