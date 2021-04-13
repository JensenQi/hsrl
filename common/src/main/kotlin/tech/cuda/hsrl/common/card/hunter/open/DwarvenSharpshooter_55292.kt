package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DwarvenSharpshooter_55292 : Card() {
    override val id = 55292
    override val name = "矮人神射手"
    override val description = "你的英雄技能能够以随从为目标。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.DescentOfDragons
    override val background = "剪子，飞刀，钢针，你说什么他打什么。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fb5231c61c971bbd5a5f3b0e1934521b2787995070b69da8ba4e0b08e0ad3e7d.png"
}
