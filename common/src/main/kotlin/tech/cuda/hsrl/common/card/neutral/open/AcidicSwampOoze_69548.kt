package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AcidicSwampOoze_69548 : Card() {
    override val id = 69548
    override val name = "酸性沼泽软泥怪"
    override val description = "<b>战吼：</b> 摧毁对手的武器。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "软泥怪喜欢弗拉门戈舞。别问为什么。"
    override val artist = "Chris Rahn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/53ba344add46dba956372a141bd1463a2332b9bee7a2216898843b636b262088.png"
}
