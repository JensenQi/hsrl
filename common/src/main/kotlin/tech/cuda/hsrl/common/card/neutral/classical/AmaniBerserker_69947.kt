package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AmaniBerserker_69947 : Card() {
    override val id = 69947
    override val name = "阿曼尼狂战士"
    override val description = "<b>激怒：</b>+3攻击力"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "如果阿曼尼狂战士问你：“你刚才看着我？！”正确的答案应该是：“没有，伙计。”"
    override val artist = "Chippy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d51f8c7fb21eb09d0eb8b2a3a2f8f0646b7700042ec63dc979890a1cb23ad892.png"
}
