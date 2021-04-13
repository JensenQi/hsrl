package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KabalTalonpriest_40432 : Card() {
    override val id = 40432
    override val name = "暗金教鸦人祭司"
    override val description = "<b>战吼：</b>使一个友方随从获得+3生命值。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Msog
    override val background = "如何为鸦人做纹身，这难倒了索莉娅。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1dd0275b7ed991c673e01908b87a6b6ab41a93f2a3b2ac745ea9b92eef641057.png"
}
