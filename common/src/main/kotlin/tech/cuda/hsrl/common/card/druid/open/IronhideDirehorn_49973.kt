package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IronhideDirehorn_49973 : Card() {
    override val id = 49973
    override val name = "铁皮恐角龙"
    override val description = "<b>超杀：</b>召唤一个5/5的铁皮小恐龙。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.RastakhansRumble
    override val background = "超杀亲兄弟，上阵父子兵。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/28d747c7d154481e1ab1ac5d16c380e699d3190cfffcb7ff8c11e16beccaaf46.png"
}
