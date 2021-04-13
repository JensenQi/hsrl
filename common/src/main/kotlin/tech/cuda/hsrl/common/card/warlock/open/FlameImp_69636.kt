package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlameImp_69636 : Card() {
    override val id = 69636
    override val name = "烈焰小鬼"
    override val description = "<b>战吼：</b>对你的英雄造成3点伤害。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Core
    override val background = "小鬼们喜欢引火上身。它们就是喜欢。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a85f65086b8a40208c556649e4a06d7f9e6e25f35fac176483ff575db2b8ddda.png"
}
