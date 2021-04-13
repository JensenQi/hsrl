package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Gorehowl_69642 : Card() {
    override val id = 69642
    override val name = "血吼"
    override val description = "攻击随从不会消耗耐久度，改为降低1点攻击力。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Core
    override val background = "格罗玛什·地狱咆哮的著名战斧。然而它却在玛克扎尔王子的手中。这是怎么回事！"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d074684645db538666dd3cc533914d9c925d76c33e7539e1bacee37738bb2503.png"
}
