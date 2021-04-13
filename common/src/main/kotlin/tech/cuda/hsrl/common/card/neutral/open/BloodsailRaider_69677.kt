package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodsailRaider_69677 : Card() {
    override val id = 69677
    override val name = "血帆袭击者"
    override val description = "<b>战吼：</b> 获得等同于你的武器攻击力的攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "“我一个星期只出去打劫七天。”"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6fee910fa78ae6becfc6b2a8bbc683b6dd7ad70b7cac6285aacabb3bf1bf7407.png"
}
