package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StormChaser_48490 : Card() {
    override val id = 48490
    override val name = "风暴追逐者"
    override val description = "<b>战吼：</b>从你的牌库中抽一张法力值消耗大于或等于（5）点的法术牌。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.BoomsdayProject
    override val background = "追风追多了需要补充水分。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/703055b5c75dd976d4569a9c3fa2b7159d2e2204338845987446f571fa0f0944.png"
}
