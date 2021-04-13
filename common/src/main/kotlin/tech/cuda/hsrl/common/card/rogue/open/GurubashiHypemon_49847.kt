package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GurubashiHypemon_49847 : Card() {
    override val id = 49847
    override val name = "古拉巴什宣传员"
    override val description = "<b>战吼：</b> <b>发现</b>一张具有<b>战吼</b>的随从牌的1/1复制，其法力值消耗为（1）点。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.RastakhansRumble
    override val background = "请再次举起你们的双手！什么？只有1费？"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ef3439e7f9166bbba6fa12ec4a47832c29768db62480833837137ab4a4c3c2ed.png"
}
