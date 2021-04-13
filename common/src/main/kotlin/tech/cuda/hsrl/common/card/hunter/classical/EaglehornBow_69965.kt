package tech.cuda.hsrl.common.card.hunter.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EaglehornBow_69965 : Card() {
    override val id = 69965
    override val name = "鹰角弓"
    override val description = "每当一个<b>奥秘</b>被揭示时，便获得+1耐久度。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ClassicCards
    override val background = "第一课：把尖的那头对准别人。"
    override val artist = "Cyril Van Der Haegen"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d7a8b98524ae72005ec202432b208e1bb6117539c25ff6bd33c7556896b0aa28.png"
}
