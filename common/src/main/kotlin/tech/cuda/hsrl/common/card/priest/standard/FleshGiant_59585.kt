package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FleshGiant_59585 : Card() {
    override val id = 59585
    override val name = "血肉巨人"
    override val description = "你的英雄的生命值每在你的回合中变化一次，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "这是个“巨大”的错误。"
    override val artist = "Ian Ameling"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4cc1c52108d144223d44688656baf3c8bf192c59d69a1cfe12a14e353af35dd5.png"
}
