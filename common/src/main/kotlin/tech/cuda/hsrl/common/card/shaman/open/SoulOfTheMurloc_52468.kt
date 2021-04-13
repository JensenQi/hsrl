package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SoulOfTheMurloc_52468 : Card() {
    override val id = 52468
    override val name = "鱼人之魂"
    override val description = "使你的所有随从获得“<b>亡语：</b>召唤一个1/1的鱼人。”"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.RiseOfShadows
    override val background = "本以为是不存在的东西。"
    override val artist = "Jason Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/da86e5bc7468c37e527908c487b8af666224af0a98fd1f7748d98c595351363c.png"
}
