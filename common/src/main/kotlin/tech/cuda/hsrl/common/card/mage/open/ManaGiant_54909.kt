package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ManaGiant_54909 : Card() {
    override val id = 54909
    override val name = "法力巨人"
    override val description = "在本局对战中，你每使用一张你的套牌之外的卡牌，该牌的法力值消耗便 减少（1）点。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.DescentOfDragons
    override val background = "刷卡越多，折扣越多，巨型惊喜等着你！"
    override val artist = "SARIYA"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/22281737d87e43f3d2ebff0aa8228fa4eb3176fb82adcf0b29dfe935d77871f8.png"
}
