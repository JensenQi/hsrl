package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OldMurkEye_736 : Card() {
    override val id = 736
    override val name = "老瞎眼"
    override val description = "<b>冲锋</b>，在战场上每有一个其他鱼人便获得+1攻击力。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy4
    override val background = "他是鱼人中的传奇。“姆咯啦咯咯啦呵嘎哈咯！”他们都这么说他。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/96f82e710a7c468563f3494edaff0672531446e4f73719574e068eab3a447550.png"
}
