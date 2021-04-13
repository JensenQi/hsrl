package tech.cuda.hsrl.common.card.warrior.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Gorehowl_69956 : Card() {
    override val id = 69956
    override val name = "血吼"
    override val description = "攻击随从不会消耗耐久度，改为降低1点攻击力。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = 7
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ClassicCards
    override val background = "格罗玛什·地狱咆哮的著名战斧。然而它却在玛克扎尔王子的手中。这是怎么回事！"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f7b30d6b33969aa1d99a69b8c400cbbe044345f3d39476f43e71d70eb4da7105.png"
}
