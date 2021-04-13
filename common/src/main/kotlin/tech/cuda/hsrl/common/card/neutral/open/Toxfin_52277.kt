package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Toxfin_52277 : Card() {
    override val id = 52277
    override val name = "毒鳍鱼人"
    override val description = "<b>战吼：</b>使一个友方鱼人获得<b>剧毒</b>。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "你好毒，你好毒，你好毒毒毒毒毒！"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cba2307c085a24b76cfda8323276ce35da441b78e20b3ad83be3ffad04559899.png"
}
