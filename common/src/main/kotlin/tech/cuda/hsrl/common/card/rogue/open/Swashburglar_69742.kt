package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Swashburglar_69742 : Card() {
    override val id = 69742
    override val name = "吹嘘海盗"
    override val description = "<b>战吼：</b>随机将一张另一职业的卡牌置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Core
    override val background = "只要两杯朗姆酒，他就能吹上一整天！"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f3b25a8f3a186a5aeed86c0b637123d647bb534b03649c1e4f1614f6ee2c880b.png"
}
