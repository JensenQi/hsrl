package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheBeast_962 : Card() {
    override val id = 962
    override val name = "比斯巨兽"
    override val description = "<b>亡语：</b> 为你的对手召唤1个3/3的芬克·恩霍尔。"
    override var cost: Int? = 6
    override var health: Int? = 7
    override var attack: Int? = 9
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "他住在黑石山。他吃侏儒。基本上就是这样。"
    override val artist = "Glenn Rane"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9162bd360300605d5bccc486e73252f507d1a6265db7fa1d07d9b4b9c1e46f46.png"
}
