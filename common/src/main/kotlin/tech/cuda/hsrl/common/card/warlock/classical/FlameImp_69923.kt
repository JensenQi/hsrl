package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlameImp_69923 : Card() {
    override val id = 69923
    override val name = "烈焰小鬼"
    override val description = "<b>战吼：</b>对你的英雄造成3点伤害。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "小鬼们喜欢引火上身。它们就是喜欢。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/354d0ed8aa246f05c194055191ae223ac19c35ac7be4ec0c67b1bf4011557c5e.png"
}
