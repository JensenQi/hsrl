package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Hydrologist_41139 : Card() {
    override val id = 41139
    override val name = "水文学家"
    override val description = "<b>战吼：</b> <b>发现</b>一张<b>奥秘</b>牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Ungoro
    override val background = "绝大多数鱼人冲着就业前景报考了计算机专业，而报考水文学的则寥寥无几。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b724e7776eb4ce800308bd9cd7a7fd8ace4fc35635be9e5e3fe3645792a3be4e.png"
}
