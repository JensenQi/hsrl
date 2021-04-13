package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AcidicSwampOoze_68441 : Card() {
    override val id = 68441
    override val name = "酸性沼泽软泥怪"
    override val description = "<b>战吼：</b> 摧毁对手的武器。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "软泥怪喜欢弗拉门戈舞。别问为什么。"
    override val artist = "Chris Rahn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dd1872ef686920569d5b4d60e9752573d31b54f40eaed1a66c9be559441a8a19.png"
}
