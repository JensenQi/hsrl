package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FelfinNavigator_56393 : Card() {
    override val id = 56393
    override val name = "邪鳍导航员"
    override val description = "<b>战吼：</b>使你的其他鱼人获得+1/+1。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "把我的鱼儿们带回来，我便会亲自带你前往英鳞殿的大门！"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/386f8aec40b5e06b7b216de77e1753d7c39af39310772c706d4f594b1381a779.png"
}
