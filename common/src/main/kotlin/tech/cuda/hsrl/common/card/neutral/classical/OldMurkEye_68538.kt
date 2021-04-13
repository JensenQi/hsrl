package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OldMurkEye_68538 : Card() {
    override val id = 68538
    override val name = "老瞎眼"
    override val description = "<b>冲锋</b>，在战场上每有一个其他鱼人便获得+1攻击力。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "他是鱼人中的传奇。“姆咯啦咯咯啦呵嘎哈咯！”他们都这么说他。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2bb999cbf1c05495c11f59f71ee008b5a09ec29441880a834e45e8792e9d0783.png"
}
