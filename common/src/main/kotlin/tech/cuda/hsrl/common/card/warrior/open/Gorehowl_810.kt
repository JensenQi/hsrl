package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Gorehowl_810 : Card() {
    override val id = 810
    override val name = "血吼"
    override val description = "攻击随从不会消耗耐久度，改为降低1点攻击力。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Legacy3
    override val background = "格罗玛什·地狱咆哮的著名战斧。然而它却在玛克扎尔王子的手中。这是怎么回事！"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5b9b8e34313a2e840595d6b8cce876d2a05107f42cb81411f3d2ae561db353e4.png"
}
