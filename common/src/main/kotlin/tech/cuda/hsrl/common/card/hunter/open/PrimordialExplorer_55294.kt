package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PrimordialExplorer_55294 : Card() {
    override val id = 55294
    override val name = "始生龙探险者"
    override val description = "<b>剧毒</b> <b>战吼：</b><b>发现</b>一张 龙牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.DescentOfDragons
    override val background = "“我们真的要让这个浑身剧毒的家伙驮行李吗？”"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b75a4c3abf7cc2c6b49f085e2171059c91d3065a353302d5bba5c11a95fd4984.png"
}
