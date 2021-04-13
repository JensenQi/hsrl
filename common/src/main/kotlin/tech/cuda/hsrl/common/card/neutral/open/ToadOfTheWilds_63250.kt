package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ToadOfTheWilds_63250 : Card() {
    override val id = 63250
    override val name = "狂野蟾蜍"
    override val description = "<b>嘲讽</b>，<b>战吼：</b>如果你的手牌中有自然法术牌，便获得+2 生命值。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“我们终会找到，那绿洲的连结。有苦工，有车队，和我。”"
    override val artist = "Grace Liu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/31e8148aedac35535c43da392951a63f330e2b9e62dafbd59441b02b3e984a84.png"
}
