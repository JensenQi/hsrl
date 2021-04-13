package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MindControlTech_69840 : Card() {
    override val id = 69840
    override val name = "精神控制技师"
    override val description = "<b>战吼：</b>如果你的对手拥有4个或者更多随从，随机获得其中一个的控制权。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "精神控制技术正在日益改善，但这并不能说明什么。"
    override val artist = "Leo Che"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/062f37ce659c18741cd9a757b3d8a174a42e09b10285e7c2b652acbc135031e8.png"
}
