package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IronbarkProtector_68413 : Card() {
    override val id = 68413
    override val name = "埃隆巴克保护者"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "我打赌你一定不敢进攻达纳苏斯。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/39ebff57c759400277cd87b3af0348905ae32158309df3a148bb98edd1214265.png"
}
