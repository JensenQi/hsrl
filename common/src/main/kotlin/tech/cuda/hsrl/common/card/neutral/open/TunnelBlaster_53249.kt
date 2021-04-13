package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TunnelBlaster_53249 : Card() {
    override val id = 53249
    override val name = "坑道爆破师"
    override val description = "<b>嘲讽，亡语：</b>对所有随从造成3点伤害。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "你以为他们顶着蜡烛只是为了好玩。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/47f8a1ba52739db7dd1bbdab11d032bb8ffbd10043af76176ea917370547859b.png"
}
