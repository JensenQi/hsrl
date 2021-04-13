package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragonsFury_45271 : Card() {
    override val id = 45271
    override val name = "巨龙怒火"
    override val description = "揭示你牌库中的一张法术牌。对所有随从造成等同于其法力值消耗的伤害。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "“来吧，赫尔穆克。只拿一枚硬币而已，她不会注意到的。”"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/647f27eec57a87312daf981ea8e8a0ca856acff4135b57b5e2d535ac827b03a8.png"
}
