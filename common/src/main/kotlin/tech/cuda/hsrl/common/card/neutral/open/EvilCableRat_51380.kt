package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EvilCableRat_51380 : Card() {
    override val id = 51380
    override val name = "怪盗布缆鼠"
    override val description = "<b>战吼：</b>将一张<b>跟班</b>牌置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "被触不可及的空头奶酪一步步引入黑暗的深渊。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c69897270364d50a5e5e4c518e071013935eb9d6c4da80a2a87cd763d5867344.png"
}
