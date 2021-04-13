package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneDevourer_54837 : Card() {
    override val id = 54837
    override val name = "奥术吞噬者"
    override val description = "每当你施放一个法术，便获得+2/+2。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "她喜欢在吞之前以优美的姿态撒上一撮盐。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f8cc9c5479dc86c5b87f56678c0396b789fd5ab097c4cbd3773c607f4e5a8ef6.png"
}
