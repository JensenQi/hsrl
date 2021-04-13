package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BeckonerOfEvil_38859 : Card() {
    override val id = 38859
    override val name = "邪灵召唤师"
    override val description = "<b>战吼：</b>使你的克苏恩获得+2/+2<i>（无论它在哪里）。</i>"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "总有些人唯恐天下不乱……"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/06dbd0b360698180e489bbd25ec84dbf89853353527ca5fb703e6619a6178e28.png"
}
