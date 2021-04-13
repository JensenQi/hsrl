package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AcidicSwampOoze_906 : Card() {
    override val id = 906
    override val name = "酸性沼泽软泥怪"
    override val description = "<b>战吼：</b> 摧毁对手的武器。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "软泥怪喜欢弗拉门戈舞。别问为什么。"
    override val artist = "Chris Rahn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/617082a9b1c32cd13fd9a31ba0fc7384aa3c0c24ec46db6ced8acc44c7ef8931.png"
}
